package com.codedifferently;

import java.util.HashMap;

public class CountDupLetters {
    /**
     *
     * @param input the string to be searched
     * @param letter the letter that you will search for
     * @return
     */
    public Integer countDuplicateLetters(String input, String letter){
        HashMap<String,Integer>dupeLetter= new HashMap<>();
        String [] letterA = input.split(" ");

        for(String dupe: letterA){
            int count = 1;

            if(dupeLetter.containsKey(dupe)){
                count = dupeLetter.get(dupe);
                count += 1;
                dupeLetter.put(dupe,count);

            }
            else{
                dupeLetter.put(dupe,count);
            }

        }

        return null;
    }
}
