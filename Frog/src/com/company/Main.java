package com.company;

public class Main {

    public static void main(String[] args) {
	     // write your code here
//        debug(numberOfWays(1));
//        debug(numberOfWays(2));
        numberOfWays(3);
//        debug(numberOfWays(4));

    }

    public static int numberOfWays(int n) {
        int counter = 0;
        for(int j=0; j<=n ; j++){
            for(int s=0; s<=n; s++){
                if((s+2*j) == n) {
                    if(j==0){
                        debug("-- run in j==0");
                        counter ++;
                    }
                    if(s==0){
                        debug("-- run in s==0");
                        counter++;
                    }
                    if(s!=0 && j!=0){
                        debug("-- run in s j");
                        debug(counter);
                        debug(s);
                        debug(j);
                        counter += s*j;
                        debug(counter);
                    }
                }
            }
            System.out.println("---run once---");
//            debug(counter);
        }
        return counter;
    }

    public static void debug(int input){
        System.out.println(input);
    }

    public static void debug(String input){
        System.out.println(input);
    }

}
