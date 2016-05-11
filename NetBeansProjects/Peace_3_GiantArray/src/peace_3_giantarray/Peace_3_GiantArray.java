/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peace_3_giantarray;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 * /**
 *
 * @author speace0151
 */
public class Peace_3_GiantArray {

    static int userinput;
    static boolean theplayerisalive=true;
    static int point1=15, point2=15;
    static int epoint1=5, epoint2=5;
    static int tpoint1=7, tpoint2=7;
    static int xpoint1=12, xpoint2=12;
    static int npoint1=14, npoint2=14;
    static int zpoint1=1, zpoint2=1;
    static int fpoint1=13, fpoint2=13;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("You didnt believe the rumors so you climbed the hedge. You saw him. The King. Now he is coming"
                + " for you. Can you escape before his men find you and find the hidden treasure in the maze?");
        while (theplayerisalive) {
            drawthemap();
            getuserchoice();
            checkTrapCollide();
            checkEnemycollide();
           checkTreasurecollide();
        }
    }
 
    static void drawthemap() {
        char[][] map = new char[30][30];
        map[fpoint1][fpoint2]= '#';
        map[xpoint1][xpoint2]= '#';
        map[point1][point2] = '@';
        map[epoint1][epoint2] = 'e';
        map[tpoint1][tpoint2] = 't';
        map[npoint1][npoint2] = 'e';
        map[zpoint1][zpoint2] = 't';
        //map[point1][point2] = 'x'; 
//        
        for (char[] row : map) {
            System.out.println(Arrays.toString(row));

        }
    }

    static void getuserchoice() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please pick a direction.s,w,n,e,sw,se,nw,ne");
        
        //point1 = scan.nextInt();
        //point2 = scan.nextInt();
        String userchoice=scan.next().toLowerCase().trim();
        setmydirection(userchoice);
    }
    

    static void setmydirection(String direction){
        if(direction.contains("n")){
            point1--;
            epoint1++;
            npoint1++;
        }else{
          if(direction.contains("s")){
              point1++;
              epoint1--;
              npoint1--;
         }else{
              if(direction.contains("e")){
                  point2++;
                  epoint2--;
                  npoint2--;
              }else{
                  if(direction.contains("w")){
                      point2--;
                      epoint2++;
                      npoint2++;
                  }else{
                      if(direction.contains("ne")){
                         point1--;
                         point2++;
                         epoint1++;
                         epoint2--;
                         npoint1++;
                         npoint2--;
                  }else{
                          if(direction.contains("nw")){
                              point1--;
                              point2--;
                              epoint1++;
                              epoint2++;
                              npoint1++;
                              npoint2--;
                          }else{
                              if(direction.contains("se")){
                                  point1++;
                                  point2++;
                                  epoint1--;
                                  epoint2--;
                              }else{
                                  if(direction.contains("sw")){
                                      point1++;
                                      point2--;
                                      epoint1--;
                                      epoint2++;
                                  }
                                  if(point1==tpoint1&&point2==tpoint2){
                                      System.out.println("YAY WE FOUND THE KING's TREASURE  ۜ\\(סּںסּَ` )/ۜ");
                                  }
                              }
                              if(point1==epoint1&&point2==epoint2){
                                  theplayerisalive=false;
                                  System.out.println("GAME OVER THE GUARDS CAUGHT YOU! ಠ_ಠ﻿");
                               
                              }else{
                                  if(point1==npoint1&&point2==npoint2){
                                      theplayerisalive=false;
                                      System.out.println("GAME OVER THE GUARDS CAUGHT YOU! ಠ_ಠ");
                                  }else{
//                                      if(point1==xpoint1&&point2==xpoint2){
//                                          theplayerisalive=false;
//                                           System.out.println("GAME OVER YOU FEEL IN A TRAP!ಠ_ಠ﻿");
                                      
//                                  }else{
                                          
                                      theplayerisalive=true;
                                  }
                              }
                          }
                      }
                  }
                  
                          
                          
                  
                         
                 
                          
                   
                  
              }
          }
          }
        
        }
    public static void checkTreasurecollide(){
      if(point1==tpoint1&&point2==tpoint2){
                                      System.out.println("YAY WE FOUND THE KING's TREASURE  ۜ\\(סּںסּَ` )/ۜ");
                                        System.exit(0);
    }else{
          if(point1==zpoint1&&point2==zpoint2){
                                      System.out.println("YAY WE FOUND THE KING's TREASURE  ۜ\\(סּںסּَ` )/ۜ");
                                        System.exit(0);
          
      }
    }
    }
    
    
    
    
    
    
public static void checkEnemycollide(){
    if(point1==epoint1&&point2==epoint2){
                                  theplayerisalive=false;
                                  System.out.println("GAME OVER THE GUARDS CAUGHT YOU!ಠ_ಠ﻿");
                                 System.exit(0);
                              }else{
                                  if(point1==npoint1&&point2==npoint2){
                                      theplayerisalive=false;
                                      System.out.println("GAME OVER THE GUARDS CAUGHT YOU!ಠ_ಠ");
                                        System.exit(0);
                                                                   
}else{  
   
         theplayerisalive=true;   
            }
}
}



    public static void checkTrapCollide() {
        if(point1==xpoint1&&point2==xpoint2) {
            System.out.print("GAME OVER YOU FELL IN A TRAP ಠ_ಠ");
            System.exit(0);
        }
    }
}
        
    
    
    
    

                    
  
          
    
 

   
    
    
    

    // int [] [] z = new int[10] [10];
//z[0] = new int[10];
//z[1] = new int[10];
//z[2] = new int[10];
// z[3] = new int[10];
// z[4] = new int[10];
// z[5] = new int[10];
// z[6] = new int[10];
// z[7] = new int[10];
//z[8] = new int[10];
// z[9] = new int[10];
//for (int i = 0; i <= map[0].length - 1; i++) {
//            for (int j = 0; j <= map[1].length - 1; j++) {
//                if (j < map[1].length - 1) {
//                    if (map[i][j] != 'x') {
//                        System.out.print(".");
//                    } else {
//                        System.out.print(map[i][j]);
//                    }
//                } else {
//                    if (map[i][j] != 'x') {
//                        System.out.println(".");
//                    } else {
//                        System.out.println(map[i][j]);
//                    }
//                }
//            }
//        }

    
    

    
    


