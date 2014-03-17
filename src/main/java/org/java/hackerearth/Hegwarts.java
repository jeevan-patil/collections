package org.java.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author jeevan
 * @date 15-Mar-2014
 * @purpose 
 *
 */
public class Hegwarts {

    public static void main(String[] args) {        
        final int WINNING_NUM = 1;
        Hegwarts rule = new Hegwarts();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String input = br.readLine();

            int cases = Integer.parseInt(input);
            for(int i = 0; i < cases; i++) {
                int enemyStrength = Integer.parseInt(br.readLine());

                if(enemyStrength == 0) {
                    System.out.println(0);
                    continue;
                }

                int attempts = 0;
                while(enemyStrength != WINNING_NUM) {

                    if(enemyStrength % 3 == 0) {
                        enemyStrength = rule.applyThirdWitchPower(enemyStrength);
                        ++attempts;
                    } else if(enemyStrength % 2 == 0) {
                        enemyStrength = rule.applySecondWitchPower(enemyStrength);
                        ++attempts;
                    } else {                        
                        enemyStrength = rule.applyFirstWitchPower(enemyStrength);
                        ++attempts;
                    }
                }
                System.out.println(attempts);
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

    /**
     * take away one unit of strength away from enemies
     * 
     * @param num
     */
    private int applyFirstWitchPower(int num) {
        return (num - 1);
    }
    
    /**
     * halfen the strength of enemies
     * 
     * @param num
     */
    private int applySecondWitchPower(int num) {
        return (num / 2);
    }
    
    /**
     * reduce the strength of enemies to one third
     * 
     * @param num
     */
    private int applyThirdWitchPower(int num) {
        return (num / 3);
    }
}
