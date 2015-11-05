/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peace_3_guessinggame;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author speace0151
 */
public class Peace_3_GuessingGame {
static int magicnumber;
static String username;
static int userguess;
static Random ro = new Random();
static boolean playagain;
static int triesleft;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        playagain = true;
        magicnumber =ro.nextInt(100);
        triesleft=5;
        // TODO code application logic here
        
         Scanner number = new Scanner(System.in);
         System.out.println("What is your username");
         Scanner userinputname = new Scanner(System.in);
        

        
        
        Scanner sc = new Scanner(System.in);
       
        username =userinputname.nextLine();
        System.out.println("Hello " + username + " Lets play a game");
        
        while(playagain){
            playthegame();
       
        }}
            static void playthegame(){
                Scanner userinputnumbers =new Scanner(System.in);
                System.out.println("Please pick a number.");
                userguess = userinputnumbers.nextInt();
                if(magicnumber == userguess){
                    System.out.println("you win!!");
                    playagain =false;
                
                }else{
                    if(magicnumber < userguess){
                        System.out.println("too high");
                    }
                    if(magicnumber > userguess){
                        System.out.println("too low");
                    }
                    else if(magicnumber < userguess){
                        triesleft=triesleft-1;
                        System.out.println("too high. You now have" + triesleft+ "triesleft.");
                        playagain=true;
                    }
                    else if(magicnumber > userguess){
                        triesleft=triesleft-1;
                        System.out.println("too low.You now have" + triesleft+"triesleft");;
                        playagain=true;
                        
                    }
                }
            }
        }
       
