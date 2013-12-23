/* 
 * This Main class is the entry of this class. It deals with the whole process which mars rovers explore the plateau.
 * 
 * @author Xiao Jin
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main (String [] args) throws IOException{

		Scanner sc = new Scanner(System.in);
		//input the upper-right coordinates of the plateau
		//the movement range for rovers is from (0,0) to (a,b)
		System.out.println("Please enter the abscissa of the upper-right coordinates of the plateau:");
		int a = sc.nextInt();
		while (a<=0){
			System.out.println("a cannot be zero or negative, please enter it again.");
		    a = sc.nextInt();
		}
		System.out.println("Please enter the ordinate of the upper-right coordinates of the plateau:");
		int b = sc.nextInt();
		while (b<=0){
			System.out.println("b cannot be zero or negative, please enter it again.");
		    b = sc.nextInt();
		}
		
		//input the information of the rover
		System.out.println("Please enter the abscissa of the rover:");
		int x = sc.nextInt();
		while (x>a || x<=0){
			System.out.println("The abscissa exceeds the limitation, please enter an abscissa again.");
		    x = sc.nextInt();
		}
		
		System.out.println("Please enter the ordinate of the rover:");
		int y = sc.nextInt();
		while (y>b || y<=0){
			System.out.println("The ordinate exceeds the limitation, please enter an ordinate again.");
		    y = sc.nextInt();
		}
		
		System.out.println("Please enter direction the rover is facing:");
		char z = (char)System.in.read();
		while (z!='N' && z!='S' && z!='E' && z!='W'){
			System.out.println("What you entered is wrong, please enter the direction using N or S or W or E.");
			z = sc.next().charAt(0);
//			z = (char)System.in.read();
		}

		Rover r = new Rover(x,y,z);      //construct a new Rover
		
		//input series of instructions telling the rover how to explore the plateau
		System.out.println("Please enter the instructions:");
		String str = sc.next();
		
		char[] ch = str.toCharArray();

		for (int j=0; j<ch.length; j++){
			if (ch[j]=='L')
				z = r.turnL();				
			else if (ch[j]=='R')
				z = r.turnR();
			else if (ch[j]=='M'){
				if(z == 'W' || z == 'E')
					x = r.moveH();
				else                   //z =='N' or z=='S'
					y = r.moveV();
			}
			else 
				System.out.println("You entered wrong instruction !");		
		}
		
		//error checking
		if (x>a ||x<=0)
			System.out.println("Wrong instruction! The final abscissa exceeds the boundary of the plateau. Rover can only move on the plateau.");
		else if (y>b ||y<=0)
			System.out.println("Wrong instruction! The final ordinate exceeds the boundary of the plateau. Rover can only move on the plateau.");
		else
			System.out.println("The rover's final position and heading are: "+ x +" "+ y +" "+ z); //the final coordinates and heading
	}
}
	
	