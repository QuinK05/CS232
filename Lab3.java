/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author TrayTray
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand=new Random();
        int bguess=rand.nextInt(100);
        int tries=0;
        Scanner input =new Scanner(System.in);
        int guess;
        boolean win=false;
        while(win==false){
            System.out.println("Please guess a number:");
            guess=input.nextInt();
            tries=tries+1;
            if(guess==bguess){
                win=true;
            }
            else if (guess < bguess){
                System.out.println(+guess+ "guess was too low");
            }
            else if (guess > bguess){
                System.out.println(+guess+ "guess was too high");
            }     
        }
                
        System.out.println("Congratulations!!! You guessed the number in "+tries+" guess(es) ");        
        
    }
    
}

