// The tests for your three functions. You don't need to change this file.
// Each message says what was expected, so a failing test tells you what to look at.
import assert from "node:assert/strict";
import { test } from "node:test";
import { Doll } from "./doll.js";
import { countDolls, smallestDoll, sumList } from "./nesting-dolls.js";

function fiveDolls() {
  return new Doll("Red", new Doll("Orange", new Doll("Yellow", new Doll("Green", new Doll("Blue", null)))));
}

// A set of count dolls: "Doll 1" is the solid one in the middle, and the outside doll is returned.
function setOf(count) {
  let doll = new Doll("Doll 1", null);
  for (let number = 2; number <= count; number++) {
    doll = new Doll(`Doll ${number}`, doll);
  }
  return doll;
}

test("count dolls in a set of five", () => {
  assert.equal(countDolls(fiveDolls()), 5, "Not yet: Red, Orange, Yellow, Green and Blue make 5 dolls.");
});

test("count dolls of a solid doll", () => {
  assert.equal(countDolls(new Doll("Blue", null)), 1, "Not yet: a solid doll on its own is 1 doll.");
});

test("count dolls in a big set", () => {
  assert.equal(countDolls(setOf(50)), 50, "Not yet: a set of 50 dolls has 50 dolls.");
});

test("smallest doll of five", () => {
  assert.equal(smallestDoll(fiveDolls()), "Blue", "Not yet: Blue is the solid doll in the middle of the set.");
});

test("smallest doll of a solid doll and a big set", () => {
  assert.equal(smallestDoll(new Doll("Blue", null)), "Blue", "Not yet: a solid doll on its own is the smallest.");
  assert.equal(smallestDoll(setOf(50)), "Doll 1", "Not yet: in a set of 50, Doll 1 is the solid one in the middle.");
});

test("sum list of the heights", () => {
  assert.equal(sumList([14, 11, 8, 5, 2]), 40, "Not yet: 14 + 11 + 8 + 5 + 2 is 40.");
});

test("sum list of short lists", () => {
  assert.equal(sumList([7]), 7, "Not yet: a list holding only 7 adds up to 7.");
  assert.equal(sumList([]), 0, "Not yet: an empty list adds up to 0.");
});

test("sum list leaves the list as it was", () => {
  const numbers = [];
  for (let number = 1; number <= 100; number++) {
    numbers.push(number);
  }
  assert.equal(sumList(numbers), 5050, "Not yet: the numbers 1 to 100 add up to 5,050.");
  assert.equal(numbers.length, 100, "Not yet: leave the list as it was; make a shorter list for the rest instead.");
  assert.equal(numbers[0], 1, "Not yet: leave the list as it was; make a shorter list for the rest instead.");
});
