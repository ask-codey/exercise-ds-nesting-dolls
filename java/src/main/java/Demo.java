import java.util.List;

// Tries your methods on a set of five dolls. Run it with: java src/main/java/Demo.java
public class Demo {
    public static void main(String[] args) {
        Doll largest = new Doll("Red", new Doll("Orange", new Doll("Yellow", new Doll("Green", new Doll("Blue", null)))));
        List<Integer> heights = List.of(14, 11, 8, 5, 2);

        System.out.println("Dolls in the set: " + Dolls.countDolls(largest));
        System.out.println("The smallest doll: " + Dolls.smallestDoll(largest));
        System.out.println("Heights in cm: " + String.join(", ", heights.stream().map(String::valueOf).toList()));
        System.out.println("Total height in cm: " + Dolls.sumList(heights));
    }
}
