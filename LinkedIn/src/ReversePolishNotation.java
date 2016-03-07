import com.sun.deploy.util.StringUtils;

import java.util.Stack;
import java.text.*;
import java.util.*;

/**
 * Created by yanxia on 2/19/16.
 */

public class ReversePolishNotation {

//    public static void main(String args[]){
//        String[] input1 = new String[]{"4", "1", "+", "2", "*"};
//        String[] input2 = new String[]{"5", "80", "40", "/", "+"};
//        String[] input3 = new String[]{"5", "0", "/"};
//        System.out.println(reverserPolishNotationValue(input1));
//        System.out.println(reverserPolishNotationValue(input2));
//        System.out.println(reverserPolishNotationValue(input3));
//    }
/** Compute the value of an expression in Reverse Polish Notation. Supported operators are "+", "-", "*" and "/".
 * Reverse Polish is a postfix mathematical notation in which each operator immediately follows its operands.
 * Each operand may be a number or another expression.
 * For example, 3 + 4 in Reverse Polish is 3 4 + and 2 * (4 + 1) would be written as 4 1 + 2 * or 2 4 1 +
 *
// *  @param  ops a sequence of numbers and operators, in Reverse Polish Notation
 * @return the result of the computation
 * @throws IllegalArgumentException ops don't represent a well-formed RPN expression
 * @throws ArithmeticException the computation generates an arithmetic error, such as dividing by zero
 *
 */

    public static double reverserPolishNotationValue(String[] input) throws IllegalArgumentException{
        Stack<String> stack = new Stack<String>();
        String operaters = "+-*/";
        double result = 0;
        for(String e:input){
            if (operaters.contains(e))          //isNotOperator.
            {
//                System.out.println("current stack is: " + stack.toString());
                if(stack.size()<2)
                    throw new IllegalArgumentException("it is not a well-formed RPN expression ");   //there are less than 2 elements in the current stack.
                else {
//                    System.out.println("current operator: " + e);
                    double temp = calculate(e, stack.pop(), stack.pop());
//                    System.out.print(temp + "   ");
                    stack.push(String.valueOf(temp));              //pop top 2 values and push the calculated result into stack
                }
            }
            else{
                stack.push(e);              //push the value into stack if it is not an operator.
            }

        }

        if(stack.size() > 1){     //there should be only one element left in the stack, which is the final result, otherwise throws error.
            throw new IllegalArgumentException("it is not a well-formed RPN expression ");
        }

        return Double.valueOf(stack.pop());
    }



    static double calculate(String operator, String right, String left) throws IllegalArgumentException, ArithmeticException{
        if (!isNumeric(left) || !isNumeric(right))
            throw new IllegalArgumentException("it is not a well-formed RPN expression ");

        double result = 0;
        Double leftValue = Double.valueOf(left);
        Double rightValue = Double.valueOf(right);

        switch(operator){
            case "*":
                result = leftValue*rightValue;
                break;
            case "+":
            {
//                System.out.println("DEBUG IN + : ");
                result = leftValue+rightValue;
//                System.out.println(result);
                break;
            }

            case "-":
                result =  leftValue-rightValue;
                break;
            case "/":{
                if(rightValue == 0)
                    throw new ArithmeticException("divider cannot be zero!");
                else
                    result = leftValue/rightValue;
            }
            break;
        }

        return result;
    }

    public static boolean isNumeric(String str)
    {
        NumberFormat formatter = NumberFormat.getInstance();
        ParsePosition pos = new ParsePosition(0);
        formatter.parse(str, pos);
        return str.length() == pos.getIndex();
    }

}


