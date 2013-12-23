/* 
 * This Rover class contains the properties and activities of rovers.
 * 
 * @author Xiao Jin
 */

public class Rover {
	private int x,y;  //Rover's original position:x and y coordinates
	private char z;   //Rover's orientation
	
	public Rover (int x, int y, char z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
//Method:move horizontally
	public int moveH () {		
		switch(z){
		case 'W':
			x = x-1;
			break;
		case 'E':
			x = x+1;
			break;
		}		
		return x;
	}

//Method:move vertically
	public int moveV () {		
	 	switch(z){
		case 'N':
			y = y+1;
			break;
		case 'S':
			y = y-1;
			break;
		}	
		return y;
	}

//Method:left turn 
	public char turnL() {
		switch(z){
		case 'N':
			z='W';
			break;
		case 'S':
			z='E';
			break;
		case 'W':
			z='S';
			break;
		case 'E':
			z='N';
			break;
		}
        return z;
	}
	
//Method��right turn
	public char turnR () {		
		switch(z){
		case 'N':
			z='E';
			break;
		case 'S':
			z='W';
			break;
		case 'W':
			z='N';
			break;
		case 'E':
			z='S';
			break;
		}
        return z;
	}

}
