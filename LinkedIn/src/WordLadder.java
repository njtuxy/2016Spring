import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by yanxia on 3/8/16.
 */
public class WordLadder {
    public static int lengthOfShortestTransformation(String start, String end, HashSet<String> dict){
        int result = Integer.MAX_VALUE;

        LinkedList<String> wordQueue = new LinkedList<String>();
        LinkedList<Integer> distanceQueue = new LinkedList<Integer>();

        wordQueue.add(start);
        distanceQueue.add(1);

        while(!wordQueue.isEmpty()){
            System.out.print("queue: " + wordQueue.toString() + "   ");
            System.out.print("queue: " + distanceQueue.toString() + "   ");
            System.out.println();
//            System.out.println("dict: " + dict.toString());
//
            String currentWord = wordQueue.poll();
            int currentDistance = distanceQueue.poll();

            if(currentWord.equals(end))
//                System.out.println("result: " + result);
                result = Math.min(result, currentDistance);

            for(int i=0; i<currentWord.length(); i++){
                char[] startCharArray = currentWord.toCharArray();
                for(char t='a'; t< 'z'; t++){
                    startCharArray[i] = t;
                    String word = new String(startCharArray);
                    if(dict.contains(word)){
                        dict.remove(word);
                        wordQueue.addLast(word);
                        distanceQueue.add(currentDistance+1);
                    }
                }
            }



        }

        if(result < Integer.MAX_VALUE)
            return result;
        else
            return 0;

    }
}
