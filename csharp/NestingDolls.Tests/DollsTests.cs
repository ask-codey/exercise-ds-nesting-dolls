using NestingDolls;

namespace NestingDolls.Tests;

// The tests for your three methods. You don't need to change this file.
// Each message says what was expected, so a failing test tells you what to look at.

[TestClass]
public class DollsTests
{
    private static Doll FiveDolls() => new Doll("Red", new Doll("Orange", new Doll("Yellow", new Doll("Green", new Doll("Blue", null)))));

    // A set of count dolls: "Doll 1" is the solid one in the middle, and the outside doll is returned.
    private static Doll SetOf(int count)
    {
        Doll doll = new Doll("Doll 1", null);
        for (int number = 2; number <= count; number++)
        {
            doll = new Doll("Doll " + number, doll);
        }
        return doll;
    }

    [TestMethod]
    public void CountDollsInASetOfFive()
    {
        Assert.AreEqual(5, Dolls.CountDolls(FiveDolls()), "Not yet: Red, Orange, Yellow, Green and Blue make 5 dolls.");
    }

    [TestMethod]
    public void CountDollsOfASolidDoll()
    {
        Assert.AreEqual(1, Dolls.CountDolls(new Doll("Blue", null)), "Not yet: a solid doll on its own is 1 doll.");
    }

    [TestMethod]
    public void CountDollsInABigSet()
    {
        Assert.AreEqual(50, Dolls.CountDolls(SetOf(50)), "Not yet: a set of 50 dolls has 50 dolls.");
    }

    [TestMethod]
    public void SmallestDollOfFive()
    {
        Assert.AreEqual("Blue", Dolls.SmallestDoll(FiveDolls()), "Not yet: Blue is the solid doll in the middle of the set.");
    }

    [TestMethod]
    public void SmallestDollOfASolidDollAndABigSet()
    {
        Assert.AreEqual("Blue", Dolls.SmallestDoll(new Doll("Blue", null)), "Not yet: a solid doll on its own is the smallest.");
        Assert.AreEqual("Doll 1", Dolls.SmallestDoll(SetOf(50)), "Not yet: in a set of 50, Doll 1 is the solid one in the middle.");
    }

    [TestMethod]
    public void SumListOfTheHeights()
    {
        Assert.AreEqual(40, Dolls.SumList(new List<int> { 14, 11, 8, 5, 2 }), "Not yet: 14 + 11 + 8 + 5 + 2 is 40.");
    }

    [TestMethod]
    public void SumListOfShortLists()
    {
        Assert.AreEqual(7, Dolls.SumList(new List<int> { 7 }), "Not yet: a list holding only 7 adds up to 7.");
        Assert.AreEqual(0, Dolls.SumList(new List<int>()), "Not yet: an empty list adds up to 0.");
    }

    [TestMethod]
    public void SumListLeavesTheListAsItWas()
    {
        List<int> numbers = new List<int>();
        for (int number = 1; number <= 100; number++)
        {
            numbers.Add(number);
        }
        Assert.AreEqual(5050, Dolls.SumList(numbers), "Not yet: the numbers 1 to 100 add up to 5,050.");
        Assert.AreEqual(100, numbers.Count, "Not yet: leave the list as it was; make a shorter list for the rest instead.");
        Assert.AreEqual(1, numbers[0], "Not yet: leave the list as it was; make a shorter list for the rest instead.");
    }
}
