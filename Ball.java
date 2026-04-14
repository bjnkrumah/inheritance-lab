import processing.core.PApplet;

public class Ball extends Falling {
    public Ball() {
        super();
    }

    void display(PApplet p) {
        // TODO: show a ball on screen

        // make the ball fall
        this.fall();
    }
}
