package org.java.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class TakeshiCastle {
    public static void main(String[] args) {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String input = br.readLine();            
            String[] firstLineArr = input.split(" ");
            int noOfStones = Integer.valueOf(firstLineArr[0]);
            int sayansJump = Integer.valueOf(firstLineArr[1]);
            int puddleLength = Integer.valueOf(firstLineArr[2]);

            input = br.readLine();            
            String[] spaces = input.split(" ");
            List<Float> spacesList = new LinkedList<Float>();
            for(String space : spaces) {
                spacesList.add(Float.valueOf(space));
            }

            input = br.readLine();
            System.out.println(input);
            String[] stoneDistance = input.split(" ");
            List<Integer> stoneDisList = new LinkedList<Integer>();
            for(String sd : stoneDistance) {
                stoneDisList.add(Integer.valueOf(sd));
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
}
