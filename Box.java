import processing.core.PApplet;

public class Box extends Falling {
    public Box() {
        super();
    }

    void display(PApplet p) {
        // TODO: show a box on screen

        // make the box fall
        this.fall();
    }
}
