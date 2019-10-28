/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candymachine;

/**
 *
 * @author mlarrubia
 */

import java.util.Scanner;
public class CandyMachine {

    /**
     * @param args the command line arguments
     */
    
    static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Welcome to CHS's Comptuer Candy Machine!");
        System.out.println("All candy provided is virtual.");
        
        System.out.println("Here's what we got!");
        System.out.println("1      $0.65       Hershey Bar");
        System.out.println("2      $0.70      Bag of Chips");
        System.out.println("3      $1.00          Poptarts");
        System.out.println("4      $1.50       Gob Stopper");
        System.out.println("5      $3.00       Gummy Bears");
        
        double cash = walletSize();
        double costOfCandy = candyChoice();
        System.out.println("Your total will be $" + costOfCandy);
            if (costOfCandy > cash){
                System.out.println("Get a job you bum! You can't pay your bill!");
                
            }
            else {
                System.out.println("Enjoy your candy. Your change will be $" + (cash - costOfCandy));
            }
        
       
        
    }
    public static double walletSize(){
         System.out.println("How much money do you have?");
        
        double walletSize = kb.nextDouble();
        
        System.out.println("Wow thats a lot of money!");
        
        return walletSize;
        
    }
    
    public static double candyChoice(){
        System.out.println("Please choose a candy.");
        
        int candyChoice = kb.nextInt();
        
        if(candyChoice == 1){
            System.out.println("You have chosen a Hereshy Bar"); 
            return 0.65;
        }
        else if (candyChoice == 2){
            System.out.println("You have chosen the Bag of Chips");
            return 0.70;
        }
        else if (candyChoice == 3){
            System.out.println("You have chosen the Poptarts");
            return 1.00;
        }
        else if (candyChoice == 4){
            System.out.println("You have chosen the Gob Stopper");
            return 1.50;
        }
        else if (candyChoice == 5){
            System.out.println("You have chosen the Gummy Bears");
            return 3.00;
        }
        return 0;
        
    }
    
    
    
    
}
