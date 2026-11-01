# Exercise: The Nesting Dolls

Exercise code for the lesson **Exercise: The Nesting Dolls** in the course *Data Structures and Big-O, Demystified* on [ask-codey.com](https://www.ask-codey.com).

A set of nesting dolls: a doll that opens, with a smaller doll inside, and a smaller one inside that, down to a solid doll that doesn't open. You'll write three functions, and each one solves its problem by calling itself on a smaller piece, with no loops:

- `countDolls` (`CountDolls` in C#, `count_dolls` in Python): how many dolls are in a set, starting from the outside doll
- `smallestDoll` (`SmallestDoll`, `smallest_doll`): the color of the solid doll at the very middle
- `sumList` (`SumList`, `sum_list`): the total of a list of numbers, such as the dolls' heights

Each doll is a `Doll` with a color and the doll inside it, or nothing inside (`null`, or `None` in Python) when it's the solid one. You don't need to change the `Doll` class.

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

## Tips

- **Write the base case first.** Ask: what's the smallest version of this problem, the one I can answer without calling the function again?
- **Then trust the call.** In the recursive case, assume the function already works on the smaller piece (the doll inside, or the rest of the list), and use what it gives back.
- **The rest of a list** is a new, shorter list: `numbers.GetRange(1, numbers.Count - 1)` in C#, `numbers.subList(1, numbers.size())` in Java, `numbers[1:]` in Python, `numbers.slice(1)` in JavaScript and TypeScript. None of them changes the list itself.
- **A stack overflow** (`RecursionError` in Python, `RangeError` in JavaScript) means a base case is missing or never reached.

## Hand it in

When it works, push your solution to a public repo of your own on GitHub, then paste that repo's address into **Submit your exercise** on the lesson page at [ask-codey.com](https://www.ask-codey.com). That's what completes the lesson. The lesson page shows the Git commands, step by step.
