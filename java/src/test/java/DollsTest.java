import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

// The tests for your three methods. You don't need to change this file.
// Each message says what was expected, so a failing test tells you what to look at.
class DollsTest {
    private static Doll fiveDolls() {
        return new Doll("Red", new Doll("Orange", new Doll("Yellow", new Doll("Green", new Doll("Blue", null)))));
    }

    // A set of count dolls: "Doll 1" is the solid one in the middle, and the outside doll is returned.
    private static Doll setOf(int count) {
        Doll doll = new Doll("Doll 1", null);
        for (int number = 2; number <= count; number++) {
            doll = new Doll("Doll " + number, doll);
        }
        return doll;
    }

    @Test
    void countDollsInASetOfFive() {
        assertEquals(5, Dolls.countDolls(fiveDolls()), "Not yet: Red, Orange, Yellow, Green and Blue make 5 dolls.");
    }

    @Test
    void countDollsOfASolidDoll() {
        assertEquals(1, Dolls.countDolls(new Doll("Blue", null)), "Not yet: a solid doll on its own is 1 doll.");
    }

    @Test
    void countDollsInABigSet() {
        assertEquals(50, Dolls.countDolls(setOf(50)), "Not yet: a set of 50 dolls has 50 dolls.");
    }

    @Test
    void smallestDollOfFive() {
        assertEquals("Blue", Dolls.smallestDoll(fiveDolls()), "Not yet: Blue is the solid doll in the middle of the set.");
    }

    @Test
    void smallestDollOfASolidDollAndABigSet() {
        assertEquals("Blue", Dolls.smallestDoll(new Doll("Blue", null)), "Not yet: a solid doll on its own is the smallest.");
        assertEquals("Doll 1", Dolls.smallestDoll(setOf(50)), "Not yet: in a set of 50, Doll 1 is the solid one in the middle.");
    }

    @Test
    void sumListOfTheHeights() {
        assertEquals(40, Dolls.sumList(List.of(14, 11, 8, 5, 2)), "Not yet: 14 + 11 + 8 + 5 + 2 is 40.");
    }

    @Test
    void sumListOfShortLists() {
        assertEquals(7, Dolls.sumList(List.of(7)), "Not yet: a list holding only 7 adds up to 7.");
        assertEquals(0, Dolls.sumList(List.of()), "Not yet: an empty list adds up to 0.");
    }

    @Test
    void sumListLeavesTheListAsItWas() {
        List<Integer> numbers = new ArrayList<>();
        for (int number = 1; number <= 100; number++) {
            numbers.add(number);
        }
        assertEquals(5050, Dolls.sumList(numbers), "Not yet: the numbers 1 to 100 add up to 5,050.");
        assertEquals(100, numbers.size(), "Not yet: leave the list as it was; make a shorter list for the rest instead.");
        assertEquals(1, numbers.get(0), "Not yet: leave the list as it was; make a shorter list for the rest instead.");
    }
}
