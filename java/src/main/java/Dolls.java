import java.util.List;

// Your three methods. The comment above each one says what it should
// return, with examples. Replace each return line with your own code,
// and name the method's base case in its comment. Each method calls
// itself on a smaller piece: no loops.
public class Dolls {
    /*
     * Count the dolls in a set, starting from the outside doll. A solid
     * doll (its inside is null) is 1 doll; any other doll is 1 doll, plus
     * the dolls inside it.
     *
     * Red > Orange > Yellow > Green > Blue -> 5
     * a solid Blue doll on its own -> 1
     *
     * Base case: (write it here)
     */
    public static int countDolls(Doll doll) {
        return 0;
    }

    /*
     * Find the smallest doll in the set, the solid one at the very
     * middle, and return its color.
     *
     * Red > Orange > Yellow > Green > Blue -> "Blue"
     * a solid Blue doll on its own -> "Blue"
     *
     * Base case: (write it here)
     */
    public static String smallestDoll(Doll doll) {
        return "";
    }

    /*
     * Add up a list of numbers, such as the dolls' heights: the first
     * number, plus the sum of the rest of the list. An empty list adds up
     * to 0. Leave the list itself as it was.
     *
     * [14, 11, 8, 5, 2] -> 40
     * [7] -> 7
     * [] -> 0
     *
     * Base case: (write it here)
     */
    public static int sumList(List<Integer> numbers) {
        return 0;
    }
}
