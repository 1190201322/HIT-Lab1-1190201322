package p2;

import p2.drawRegularPolygon.PenColor;

public class drawMyArt {
	
    public static void drawPersonalArt(Turtle turtle) {
    	//throw new RuntimeException("implement me!");
     
    	int Size = 23, Num = 5;
    	PenColor k = null;
    	for (int i = 1; i <= Size; i++) {
    	    switch (i % Num) {
	    	case 0:
		    	turtle.color(k.BLUE);
		    	break;
	    	case 1:
		    	turtle.color(k.MAGENTA);
		    	break;
	   	    case 2:
	    		turtle.color(k.GREEN);
	    		break;
	   	    case 3:
	    		turtle.color(k.YELLOW);
	    		break;
    	    case 4:
	    		turtle.color(k.RED);
	    		break;	   
    	    }
    	    turtle.forward(i*5);
  	        turtle.turn(144);
  	        turtle.forward(i*5);
  	        turtle.turn(-72);
    	}
    	turtle.turn(130);
    	turtle.color(k.GREEN);
    	turtle.forward(75);
    	turtle.turn(186);    	
    	turtle.forward(245);
    	turtle.turn(270);
    	turtle.forward(23);
    	turtle.turn(265);
    	turtle.forward(172);
    		
    	turtle.turn(270);
    	turtle.forward(5);
    	turtle.turn(270);
    	turtle.forward(40);
    	
    	turtle.color(k.PINK);
    	for (int i = 0; i <5; i++) {
    		turtle.turn(72);
    		drawRegularPolygon(turtle,10,5);
    	}
    	
    	turtle.color(k.MAGENTA);
    	for (int i = 0; i <5; i++) {  	
    		turtle.turn(72);
    		drawRegularPolygon(turtle,20,5);
    	}
    } 

    private static void drawRegularPolygon(Turtle turtle, int sides, int sideLength) {
    	 turtle.color(PenColor.BLACK);
         for (int i = 0; i < sides; i++) {
             turtle.forward(sideLength);
             turtle.turn((double) 180.0 - calculateRegularPolygonAngle(sides));}
		
	}
    public static double calculateRegularPolygonAngle(int sides) {
        return (double) 180.0 - (double) 360.0 / sides;
    
    }
	public enum PenColor {
        BLACK,
        GRAY,
        RED,
        PINK,
        ORANGE,
        YELLOW,
        GREEN,
        CYAN,
        BLUE,
        MAGENTA;}
    
    public interface Turtle {

        /**
         * Move the turtle forward a number of steps.
         * 
         * @param units number of steps to move in the current direction; must be positive
         */
        public void forward(int units);

        /**
         * Change the turtle's heading by a number of degrees clockwise.
         * 
         * @param degrees amount of change in angle, in degrees, with positive being clockwise
         */
        public void turn(double degrees);

        /**
         * Change the turtle's current pen color.
         * 
         * @param color new pen color
         */
        public void color(PenColor color);

        /**
         * Draw the image created by this turtle.
         */
        public void draw();

    }

    
    
    
    
 
}
