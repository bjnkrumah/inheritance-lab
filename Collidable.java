public interface Collidable {
    float x;
    float y;
    float width;
    float height;

    public boolean hits(Collidable o);
}
