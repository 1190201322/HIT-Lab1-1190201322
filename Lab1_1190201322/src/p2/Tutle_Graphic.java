package p2;

public class Tutle_Graphic {
	
    public static void drawSquare(Turtle turtle, int sideLength) {
        turtle.color(PenColor.BLACK);
        for (int i = 0; i < 4; i++) {
            turtle.forward(sideLength);
            turtle.turn(90);
        }
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
        MAGENTA;
    }
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
