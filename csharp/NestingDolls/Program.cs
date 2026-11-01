using NestingDolls;

// Tries your methods on a set of five dolls. Run it with: dotnet run --project NestingDolls
Doll largest = new Doll("Red", new Doll("Orange", new Doll("Yellow", new Doll("Green", new Doll("Blue", null)))));
List<int> heights = new List<int> { 14, 11, 8, 5, 2 };

Console.WriteLine("Dolls in the set: " + Dolls.CountDolls(largest));
Console.WriteLine("The smallest doll: " + Dolls.SmallestDoll(largest));
Console.WriteLine("Heights in cm: " + string.Join(", ", heights));
Console.WriteLine("Total height in cm: " + Dolls.SumList(heights));
