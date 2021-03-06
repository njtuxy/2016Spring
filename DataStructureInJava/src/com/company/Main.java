package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    //A program that counts words in a document, printing the most frequent;
    public static void main(String[] args) {
	// write your code here
        Map<String, Integer> freq = new HashMap<String, Integer>();

        File file = new File("/Users/yanxia/Desktop/sampleText");

        try{
            Scanner doc = new Scanner(file);
            while (doc.hasNext()){
                String word = doc.next().toLowerCase();
                Integer count  = freq.get(word);
                if(count == null)
                    count = 0;
                freq.put(word, count+1);
            }
            doc.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
//        Scanner doc = new Scanner(System.in).useDelimiter("[^a-zA-Z]+");


        int maxCount = 0;
        String maxWorld = "no word";

        for(Entry<String, Integer> e: freq.entrySet()){
            if(e.getValue() > maxCount){
                maxCount = e.getValue();
                maxWorld = e.getKey();
            }
        }

        System.out.print("The most frequency word is " + "\"" + maxWorld + "\"" );
        System.out.println(" with " + maxCount + " occurrences.");

    }


}
