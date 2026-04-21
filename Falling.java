public class Falling implements Collidable {
    private static float GRAVITY_COEFFICIENT = (float) 9.8;
    float x = 0;
    float y = 0;
    float width = 0;
    float height = 0;
    // add variables here
    
    public Falling() {}

    void fall() {
        // TODO: code to make something fall; add code below here
        y = y + GRAVITY_COEFFICIENT;
    }

    // leave this as is unless you want to work ahead
    public boolean hits(Collidable o) { 
        return false; 
    }
}
