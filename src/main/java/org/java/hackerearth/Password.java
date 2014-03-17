package org.java.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Password {
    public static void main(String[] args) {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Password pass = new Password();

        try {
            String input = br.readLine();
            String palindrome;
            int cases = Integer.parseInt(input);
            List<String> passList = new ArrayList<String>(cases);

            for(int i = 0; i < cases; i++) {
                input = br.readLine();
                passList.add(input);
                palindrome = pass.getPalindrome(input);
                if(passList.contains(palindrome)) {
                    System.out.println(input.length() + " " + pass.getMiddleChar(input));
                }
            }
        } catch(Exception e) {
            //System.out.println(0);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
            }
        }
    }
    
    private String getPalindrome(String word) {
        if(word == null) {
            return word;
        }

        int length = word.length();
        String reverse = "";
        for ( int i = length - 1 ; i >= 0 ; i-- )
            reverse = reverse + word.charAt(i);
        return reverse;
    }
    
    private String getMiddleChar(String word) {
        char middleOne;
        char[] arr = word.toCharArray();
        middleOne = arr[word.length() / 2];
        return String.valueOf(middleOne);
    }
}
