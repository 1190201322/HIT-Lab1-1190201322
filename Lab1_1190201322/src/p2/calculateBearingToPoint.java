package p2;

import java.awt.List;
import java.util.ArrayList;


public class calculateBearingToPoint {
	
    public static double calculateBearingToPoint(double currentBearing, int currentX, int currentY, int targetX,
            int targetY) {
        double angle = Math.atan2(targetY - currentY, targetX - currentX) * 180.0 / Math.PI;
        if (angle < 0)
            angle += 360.0;
        double bearing = (360 - angle + 90 >= 360 ? 90 - angle : 360 - angle + 90) - currentBearing;
        return bearing < 0 ? 360.0 + bearing : bearing;
    }


    
   

    
}
