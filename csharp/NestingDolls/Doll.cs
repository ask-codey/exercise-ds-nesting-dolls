namespace NestingDolls;

// One doll in a set. Inside is the doll inside this one, or null when this
// doll is solid. You don't need to change this class.
public class Doll
{
    public string Color { get; }
    public Doll? Inside { get; }

    public Doll(string color, Doll? inside)
    {
        Color = color;
        Inside = inside;
    }
}
