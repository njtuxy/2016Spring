import com.sun.deploy.util.StringUtils;

import java.util.Stack;
import java.text.*;

/**
 * Created by yanxia on 2/19/16.
 */
public class ReversePolishNotation {

/** Compute the value of an expression in Reverse Polish Notation. Supported operators are "+", "-", "*" and "/".
 * Reverse Polish is a postfix mathematical notation in which each operator immediately follows its operands.
 * Each operand may be a number or another expression.
 * For example, 3 + 4 in Reverse Polish is 3 4 + and 2 * (4 + 1) would be written as 4 1 + 2 * or 2 4 1 + *
 **
 * @param ops a sequence of numbers and operators, in Reverse Polish Notation
 * @return the result of the computation
 * @throws IllegalArgumentException ops don't represent a well-formed RPN expression
 * @throws ArithmeticException the computation generates an arithmetic error, such as dividing by zero
 *
 */

    public static double reverserPolishNotationValue(String[] input) throws IllegalArgumentException{
        Stack<String> stack = new Stack<String>();
        double result = 0;
        for(String e:input){
            if (isNumeric(e))
                stack.push(e);
            else if (stack.size() > 1) {
                result = calculate(e, stack.pop(), stack.pop());
            }
        }

        if(!stack.isEmpty()){
            throw new IllegalArgumentException("it is not a well-formed RPN expression ");
        }

        return null;
    }

    static double calculate(String e, String a, String b) throws IllegalArgumentException, ArithmeticException{
        Double input1 = Double.parseDouble(b);
        Double input2 = Double.parseDouble(a);

        switch(e){
            case "*":
                return input1*input2;
            case "+":
                return input1+input2;
            case "-":
                return input1-input2;
            case "/":{
                if(input2 == 0)
                    throw new ArithmeticException();
                else
                    return input1/input2;
            }
            default: throw  new IllegalArgumentException();
        }

    }





    public static boolean isNumeric(String str)
    {
        NumberFormat formatter = NumberFormat.getInstance();
        ParsePosition pos = new ParsePosition(0);
        formatter.parse(str, pos);
        return str.length() == pos.getIndex();
    }

}


