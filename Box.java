import processing.core.PApplet;

public class Box extends Falling {
    public Box() {
        super();
        x = 10;
        y = 10;
        width = 20;
        height = 30;
    }

    void display(PApplet p) {
        // TODO: show a box on screen
        p.rect(x, y, width, height);

        // make the box fall
        this.fall();
    }
}
