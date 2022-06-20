import processing.core.PApplet;

public class FourBallsProcessing extends PApplet {

    public static final int Width = 640;
    public static final int Height = 480;
    public static final int Diameter = 10;
    int x1 = 0;
    int x2 = 0;
    int x3 = 0;
    int x4 = 0;
    
    public static void main(String[] args) {
        PApplet.main("FourBallsProcessing", args);
    }

    public void settings(){
        super.settings();
        size(Width, Height);
    }

    public void draw(){
        drawBalls1(Height / 5, 1);
        drawBalls2(2 * Height / 5, 2);
        drawBalls3(3 * Height / 5, 3);
        drawBalls4(4 * Height / 5, 4);
    }

    public void drawBalls1(int heightFromTop, int speed){
        ellipse(x1, heightFromTop, Diameter, Diameter);
        x1 = x1 + speed;
    }

    public void drawBalls2(int heightFromTop, int speed){
        ellipse(x2, heightFromTop, Diameter, Diameter);
        x2 = x2 + speed;
    }

    public void drawBalls3(int heightFromTop, int speed){
        ellipse(x3, heightFromTop, Diameter, Diameter);
        x3 = x3 + speed;
    }

    public void drawBalls4(int heightFromTop, int speed){
        ellipse(x4, heightFromTop, Diameter, Diameter);
        x4 = x4 + speed;
    }
} 
