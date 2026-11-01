// One doll in a set. inside is the doll inside this one, or null when this
// doll is solid. You don't need to change this class.
public class Doll {
    public final String color;
    public final Doll inside;

    public Doll(String color, Doll inside) {
        this.color = color;
        this.inside = inside;
    }
}
