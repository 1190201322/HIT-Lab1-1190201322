package p2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import p2.Tutle_Graphic.PenColor;
//import p2.Tutle_Graphic.Turtle;

public class drawSquare extends JFrame {

	private JPanel contentPane;

		
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



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					drawSquare frame = new drawSquare();
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
	public drawSquare() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
