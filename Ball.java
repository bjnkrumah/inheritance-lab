import processing.core.PApplet;

public class Ball extends Falling {
    public Ball() {
        super();
        x =0 ;
        y=0;
        width= 30;
    } 
        

    void display(PApplet p) {
        // TODO: show a ball on screen
        p.circle( x, y,width);
       
        // make the ball fall
        this.fall();
    }
}
