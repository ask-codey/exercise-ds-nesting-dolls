# Exercise: The Nesting Dolls

Exercise code for the lesson **Exercise: The Nesting Dolls** in the course *Data Structures and Big-O, Demystified* on [ask-codey.com](https://www.ask-codey.com).

## The ticket

> **From:** the online shop, Little Wooden Things
>
> Each doll set in our catalog is stored the way it's packed: the outside doll, holding the next doll, and so on down to a solid one that doesn't open. Our product page needs three things worked out from it:
>
> 1. **How many dolls are in the set.** Sets come in 3, 5, 7 and 10 pieces, and the workshop makes a 50-piece set for the holidays.
> 2. **The color of the smallest doll,** the solid one at the very middle, for the "find the tiny one" label.
> 3. **The total height** of the dolls standing side by side, from a list of their heights in cm, so customers know how much shelf they need. Don't change the list: the page shows it afterward.
>
> One rule from our lead developer: **no loops in these three.** This is practice for our folder tool, where loops run out, so each function works on the outside doll, or the first height, and hands the rest back to itself.

It's a warm-up, on purpose: three small jobs on a straight line of dolls. Three functions are yours to finish:

- `countDolls` (`CountDolls` in C#, `count_dolls` in Python): how many dolls are in a set, starting from the outside doll
- `smallestDoll` (`SmallestDoll`, `smallest_doll`): the color of the solid doll at the very middle
- `sumList` (`SumList`, `sum_list`): the total of a list of numbers, such as the dolls' heights

Each doll is a `Doll` with a color and the doll inside it, or nothing inside (`null`, or `None` in Python) when it's the solid one. You don't need to change the `Doll` class. Eight tests check your answers, a 50-doll set and the numbers 1 to 100 included.

## Pick your language

The same exercise is here in five languages. Work in the folder for the language you set up; you only need one.

| Folder | Your code | The tests |
|---|---|---|
| `csharp/` | `NestingDolls/Dolls.cs` | `NestingDolls.Tests/DollsTests.cs` |
| `java/` | `src/main/java/Dolls.java` | `src/test/java/DollsTest.java` |
| `python/` | `nesting_dolls.py` | `test_nesting_dolls.py` |
| `javascript/` | `nesting-dolls.js` | `nesting-dolls.test.js` |
| `typescript/` | `nesting-dolls.ts` | `nesting-dolls.test.ts` |

Each function returns `0` or an empty string for now. The comment above it says what it should return, with examples. Replace the `return` line with your own code, and name the function's base case on its **Base case:** line.

Every folder also has a small demo program that tries your functions on a set of five dolls. You don't need to change the tests or the demo.

## Run it and check your work

Open your language's folder in VS Code (**File > Open Folder**), then open its terminal (**Terminal > New Terminal**) and run these commands there.

**C#**

```bash
dotnet run --project NestingDolls
dotnet test
```

**Java** (the Maven Wrapper downloads Maven the first time, so the first run takes a minute)

```bash
java src/main/java/Demo.java
./mvnw test
```

On Windows in PowerShell, write `.\mvnw test` instead of `./mvnw test`.

**Python** (once: make a virtual environment and install pytest into it)

```bash
python -m venv .venv
```

Then turn it on: `.venv\Scripts\Activate.ps1` in PowerShell on Windows, or `source .venv/bin/activate` on macOS (where the command is `python3`, not `python`). Then:

```bash
pip install -r requirements.txt
python demo.py
python -m pytest
```

**JavaScript**

```bash
node demo.js
npm test
```

**TypeScript** (once: `npm install`, which installs TypeScript)

```bash
node demo.ts
npm test
```

At first every test fails: that is expected. Each function you finish turns its tests green. A failing test's message starts with **Not yet:** and says what it expected.

<details>
<summary>Stuck?</summary>

- **Where to look:** the ticket asks for what the lesson *How Big Is This Folder? Recursion* calls **recursion**: each function handles the outside doll (or the first number) and calls itself on the rest. Its `CountDolls` is your first function.
- **Write the base case first.** Ask: what's the smallest version of this problem, the one I can answer without calling the function again? For the dolls it's the solid doll; for the list it's an empty list.
- **Then trust the call.** In the recursive case, assume the function already works on the smaller piece (the doll inside, or the rest of the list), and use what it gives back.
- **`smallestDoll` doesn't add anything on the way back.** It passes the answer from the solid doll straight back out.
- **The rest of a list** is a new, shorter list: `numbers.GetRange(1, numbers.Count - 1)` in C#, `numbers.subList(1, numbers.size())` in Java, `numbers[1:]` in Python, `numbers.slice(1)` in JavaScript and TypeScript. None of them changes the list itself.
- **A stack overflow** (`RecursionError` in Python, `RangeError` in JavaScript) means a base case is missing or never reached.

</details>

<details>
<summary>Why Should I Choose This?</summary>

Open this once your tests are green.

- **For these three jobs, a loop would do just as well.** The dolls are a straight line: each one holds at most one doll, and a list is a line too. A `while` loop walks a line in the same O(n) time and keeps no calls waiting, so for a straight line in real code it's usually the better choice. Try it: write `countDolls` again with a loop, and see which reads better to you.
- **So why practice on dolls?** Because they make the two parts easy to see: one base case, one recursive case, one call at a time. On the 50-doll set your function keeps 50 calls waiting, which the call stack handles easily.
- **Where recursion is the right choice:** the folder tool. A folder can hold several folders, each holding more, to any depth, and no fixed set of loops reaches every level. The same two questions you just answered (what's the smallest version, and how do I hand back a smaller piece?) are all it takes.

</details>

## Hand it in

When it works, push your solution to a public repo of your own on GitHub, then paste that repo's address into **Submit your exercise** on the lesson page at [ask-codey.com](https://www.ask-codey.com). That's what completes the lesson. The lesson page shows the Git commands, step by step.
