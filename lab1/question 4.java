/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int die1;  
        int die2;
        int  die3;
        int  die4;
        int  die5;
        int  die6;
        int  die7;
        int  die8;
        int  die9;
        int  die10;
        int roll;  
        
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
        die3 = (int)(Math.random()*6) + 1;
        die4 = (int)(Math.random()*6) + 1;
        die5 = (int)(Math.random()*6) + 1;
        die6 = (int)(Math.random()*6) + 1;
        die7 = (int)(Math.random()*6) + 1;
        die8 = (int)(Math.random()*6) + 1;
        die9 = (int)(Math.random()*6) + 1;
        die10 = (int)(Math.random()*6) + 1;
        roll = die1 + die2 + die3 + die4 + die5 + die6 + die7 + die8 + die9 + die10;
        
        System.out.println("The first die comes up " + die1);
        System.out.println("The second die comes up " + die2);
        System.out.println("The third  die comes up " + die3);
        System.out.println("The fourth die comes up " + die4);
        System.out.println("The fifth die comes up " + die5);
        System.out.println("The sixth die comes up " + die6);
        System.out.println("The seventh die comes up " + die7);
        System.out.println("The Eighth die comes up " + die8);
        System.out.println("The Ninth die comes up " + die9);
        System.out.println("The Tenth die comes up " + die10);
        
        System.out.println("Your total roll is " + roll);


  
	}
}
