package p2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import p2.Tutle_Graphic.PenColor;

public class drawRegularPolygon extends JFrame {

	private JPanel contentPane;
    public static void drawRegularPolygon(Turtle turtle, int sides, int sideLength) {
        turtle.color(PenColor.BLACK);
        for (int i = 0; i < sides; i++) {
            turtle.forward(sideLength);
            turtle.turn((double) 180.0 - calculateRegularPolygonAngle(sides));}
        }
        public static double calculateRegularPolygonAngle(int sides) {
            return (double) 180.0 - (double) 360.0 / sides;
        
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
            

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					drawRegularPolygon frame = new drawRegularPolygon();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public drawRegularPolygon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
