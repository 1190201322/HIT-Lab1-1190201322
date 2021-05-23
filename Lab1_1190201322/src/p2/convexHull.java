package p2;


import java.util.*;



public class convexHull {
    private int x;
    private int y;
    
    convexHull(){
        x = 0;
        y = 0;
    }
    
    convexHull(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public int getX(){
        return x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public int getY(){
        return y;
    }
}


