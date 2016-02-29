package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Main {

    public static void main(String[] args) {
        readFromFileAndCountTheWords();
    }

    public static void readFromFileAndCountTheWords(){
        //Create hashtable to save the occurrences of words in a file
        Map<String, Integer> freq = new HashMap<String, Integer>();

        //Read the file word by word
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

        int countforWordPress = 0;
        String maxWoldPress = "no worldpress found!";

        for(Entry<String, Integer> e: freq.entrySet()){
            if(e.getValue() > maxCount){
                maxCount = e.getValue();
                maxWorld = e.getKey();
            }
            if(e.getKey().equals ( "wordpress")){
                countforWordPress = e.getValue();
            }
        }

        System.out.print("The most frequency word is " + "\"" + maxWorld + "\"" );
        System.out.println(" with " + maxCount + " occurrences.");
        System.out.println("The occurrences of word wordpress is " + countforWordPress );

    }
}
