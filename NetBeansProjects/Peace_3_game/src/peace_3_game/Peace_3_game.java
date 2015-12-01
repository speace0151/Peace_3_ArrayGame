/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peace_3_game;

import java.util.Scanner;

/**
 *
 * @author speace0151
 */
public class Peace_3_game {
static int useractions;
static boolean isrunning;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         System.out.println("It was a dark and stormy night and Karen could not sleep.");
         System.out.println("Her father was supposed to be back from town 3 hours ago.");
         System.out.println("She decided to give him 30 more minutes before she went looking for him");
         System.out.println("She got up and went into the living room and picked up a book.");
         System.out.println("10 minutes later she heard a noise coming from the back of the house.");
         System.out.println("What should she do:1 call out hello Dad is that you  or 2 stay quiet  ");
         Scanner userinput = new Scanner(System.in);
         useractions=userinput.nextInt();
         
         if(useractions ==1){
             System.out.println("She calls out Hello? Dad is that you?");
             System.out.println("she hears a growl in anwser followed by heavey footsteps.");
             System.out.println("a zombie bursts through the door and corners her");
             System.out.println("Run? 3:run 4:stay and try to fight him off");
             useractions=userinput.nextInt();
                if(useractions==3){                    //Karen is home alone and hears a noise. Fight or flight.
                   
                 Run();
             }else{
                    if(useractions==4)
                 Fight();
                }
                 
             
             
             
             
             
         }else{
             //The second choice you can make staying quiet
             if(useractions ==2){
                stayquiet();
                 useractions=userinput.nextInt();
                 if(useractions==1){
                     dontgrabbat();
                
                     
             }else{
                     grabbat();
                 }
         }
         
         
      
       
        
        
    }
         
    
}
    private static void Run(){//run to get help
        System.out.println("She runs and escapes through the  door");
        System.out.println("Karen decides to go to one of her neighbor's houses.");
        System.out.println("Lights are on at the Morses' and screaming is coming from the Green's.");
        System.out.println("Which House?");
        System.out.println("1:Green 2:Morse 3:none");
         Scanner userinput = new Scanner(System.in);
         useractions=userinput.nextInt();
         if(useractions==1){
             greenhouse();
         }else if(useractions==2){
             morsehouse();
         
                 
                 }else{
             none();
         }
         //Running away from zombie
    }
    private static void grabbat(){
        System.out.println("She grabs the bat and beats up the zombie and runs out the house");
        System.out.println("She sees neighbor houses 1Green or 2:Morse");
          Scanner userinput = new Scanner(System.in);
         useractions=userinput.nextInt();
         if(useractions==1){
             greenhouse();
         }else{
             morsehouse();
         }
    }
    private static void Fight(){
        System.out.println("she reaches out to grab a weapon but the zombie grabs her arm");
        System.out.println("the zombie is bringing her arm close to its mouth.");
        System.out.println("the zombie eats Karen");
        System.out.println("GAMEOVER!!!");
        Scanner userinput = new Scanner(System.in);
         useractions=userinput.nextInt();
         System.out.println("change option to run or quit 1 or 2.");
         if(useractions==1){
             Run();
         }else{
           thanksforplaying();//YOU DIED
         }
            
             
    }
    private static void stayquiet(){ System.out.println("She hear a groan from the back of the house.");
                 System.out.println("She see a baseball bat on the ground.");
                 System.out.println("Grab the bat? 1: don't grab bat 2: grab bat");
    if(useractions==1){
        dontgrabbat();//GRAB WEAPON to defend yourself
    }    
                 
}
    private static void dontgrabbat(){//grab baseball bat to defend yourself
         System.out.println("She doesn't grab the bat and quietly hides behind the bookcase");
         System.out.println("A zombie walks into the room and yanks her out from the bookcase");
         System.out.println("The zombie is trying to bite her neck");
         System.out.println("1:Punch the zombie or 2:kick him in the shin"); 
         Scanner userinput = new Scanner(System.in);
         useractions=userinput.nextInt();
         if(useractions==1){
             punchzombie();
         }else{
             kickzombie();
             
         }
         
   
            }
    private static void punchzombie(){//punch zombie to attempt to get him off you
        System.out.println("She punches the zombie but he grabs her arm.");
        System.out.println("The zombie starts to eat her arm");
        System.out.println("GAME OVER!!!");
        System.out.println("Try again?");
        System.out.println("1:try again 2:QUIT");
        Scanner userinput = new Scanner(System.in);
         useractions=userinput.nextInt();
         if(useractions==1){
             dontgrabbat();
         }else{
             thanksforplaying();
         }
    }
    private static void kickzombie(){//kick the zombie to get him off you
        System.out.println("Karen kicks the zombie in the shin and manages to push him away.");
        System.out.println("The zombie is on his feet again and is limping towards her.");
        System.out.println("She runs out the backdoor.");
        System.out.println("she sees her neighbors morse and green houses.");
        System.out.println("1:Green 2:Morse");
        Scanner userinput = new Scanner(System.in);
         useractions=userinput.nextInt();
         if(useractions==1){
             greenhouse();
         
             
         }else{
             morsehouse();
         }
    }
    private static void greenhouse(){
        System.out.println("she decides to head over to the Green's.");
        System.out.println("the place looks sounds abondoned except for a few groans.");
        System.out.println("She notices a crowbar.");
        System.out.println("She grabs the crowbar and notices a car.");
        System.out.println("Take car? 1:take car 2: leave car");
        Scanner userinput = new Scanner(System.in);
         useractions=userinput.nextInt();
         if(useractions==1){
             takecar();
         }else{
             leavecar();
             //drive to town or walk
         }
    }
    private static void morsehouse(){
    System.out.println("Karen decides to go the Morses' house and there are 10 zombies scratching on the front door.");
    System.out.println("She notices that the back is locked by seems easy to climb.");
    System.out.println("If she is quiet enough she can sneak past them but the problem is that one peep would make them see her.");
    System.out.println("she notices a brick and sees a big truck.");
    System.out.println("Smash the window?");
    System.out.println("1:smash window 2: dont smash window");
    Scanner userinput = new Scanner(System.in);
         useractions=userinput.nextInt();
         if(useractions==1){
             smashwindow();//smash the window to distract them or not.
         }
    
}
    private static void none(){
        System.out.println("she chooses neither house and starts to walk to town.");
        //Skip llot and go straight to town
    }
    private static void smashwindow(){
        System.out.println("She picks up the brick and smashes the trucks window and takes off running.");
        System.out.println("The trucks alarm goes off and all the zombies walk toward it.");
        System.out.println("She climbs over the fence quietly and sees two zombies clawing at the back door. She notices a board with a nail sticking out.");
        System.out.println("Take them out:?");
        System.out.println("1:take them out 2:leave them");
        Scanner userinput = new Scanner(System.in);
         useractions=userinput.nextInt();
         if(useractions==1){
             takethemout();
         }else{
             leavethem();
         }
    }
    private static void takethemout(){
        System.out.println("Karen sneaks up from behind on zombie and takes him out.");
        System.out.println("The second zombie sees her and limps over to her.");
        System.out.println("Karen tries to fight the zombie and falls backward.");
        System.out.println("She grabs the zombie by the head to keep it from biting her.");
        System.out.println("The zombie stops moving and she throws it to the ground.");
        System.out.println("She takes a look at her rescuer.");
        System.out.println("She sees a nervous scared girl shorter not much older than her.");
        System.out.println("Thanks for the save.Karen says");
        System.out.println("No problem. you looked like you needed help. The girl replies");
        System.out.println("I'm Alice.Whats your name?");
        System.out.println("Karen");
        System.out.println("Well I've never seen you before Karen.Crazy night huh?");
        System.out.println("Yeah I had a crazy person try to kill me in my own house.");
        System.out.println("Where you headed You clearly looked like you were going somewhere.");
        System.out.println("Watersone. Karen replies");
        System.out.println("Well if youre going there youre gonna need backup.");
        System.out.println("If the neighborhood looks like this,I would hate to see the town.");
        System.out.println("Let her come? 1:Let Alice tag along 2:leave her here");
        Scanner userinput = new Scanner(System.in);
         useractions=userinput.nextInt();
         if(useractions==1){
             tagalong();
         }else{
             donttagalong();
         }
         //Accept alice as a traveling companion or not.
    }
    private static void leavethem(){
        System.out.println("She leaves the two zombies and tries to sneak around them.");
        System.out.println("They see her and limp towards her. She is outnumbered and overwhelmed");
        System.out.println("GAME OVER");
        System.out.println("try again? 1:try again 2:quit");
         Scanner userinput = new Scanner(System.in);
         useractions=userinput.nextInt();
         if(useractions==1){
             smashwindow();//start choice over again
         }else{
             thanksforplaying();//you quit
         }
    }
    static private void thanksforplaying(){
    System.out.println("thank you for playing");
}
    static private void tagalong(){
        System.out.println("Karen decides to let her come with her to Waterstone.");
        System.out.println("How far is this place? Alice asks");
        System.out.println("150 miles from here. Karen anwsers.");
        System.out.println("Well if we clear all the zombies away from my truck then we could use it to get there.");
        System.out.println("I dont think that is a good idea.Karen said sighing. I used your truck to get their attention so I could sneak in.");
        System.out.println("But I have an idea Karen says. Lets go check the Green's house for a car.");
        System.out.println("1green house 2:dont go.");
         Scanner userinput = new Scanner(System.in);
         useractions=userinput.nextInt();
         if(useractions==1){
             ghwitalice();
         }else{
             walktotownwitalice();
         }
           //Walking with your new friend to Town  
             
        
    }
    static private void takecar(){
        System.out.println("She sees the car is unlocked get in and drives to Waterstone");
    }
    static private void leavecar(){
        System.out.println("Karen decides that the car will draw too much attention and starts to jog to the nearest town.");
    }
    static private void donttagalong(){//what happens if you dont allow alice to come with you
        System.out.println("Karen decides that Alice is too much trouble and leaves without her.");
        System.out.println("Walk to the nearest town or drive?");
        System.out.println("1:find car 2:walk");
        Scanner userinput = new Scanner(System.in);
         useractions=userinput.nextInt();
         if(useractions==1){
             greenhouse();
         }
         
    walktotown();
}
    static private void walktotown(){
      System.out.println("Karen decides that cars will draw too much attention and starts to walk to town.");  
    }

      private static void ghwitalice(){//gotogreenhouse with alice to get a car
          
      }
       static private void walktotownwitalice(){//you and alice walk to town
      System.out.println("Karen and alice decide cars are too loud and start to walk to town.");  
    }
        }
    