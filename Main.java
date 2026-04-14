import processing.core.PApplet;

// YOU WILL NOT NEED TO CHANGE THIS FILE IN ORDER
// TO COMPLETE THE ASSIGNMENT
public class Main extends PApplet {
    Box box;
    Ball ball;
    Box ground;

    public void settings() {
        size(400, 400);
    }
    public void setup() {
        box = new Box();
        ball = new Ball();
        ground = new Box();
        ground.width = this.width; // Don't change this line
        // change Falling.java to fix this error (#1)
    }
    public void draw() {
        background(200);
        box.display(this);
        ball.display(this);
    }
    public static void main(String[] args) {
        String[] processingArgs = {"MySketch"};
		Main mySketch = new Main();
		PApplet.runSketch(processingArgs, mySketch);
    }
}
