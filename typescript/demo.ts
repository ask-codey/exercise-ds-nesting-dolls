// Tries your functions on a set of five dolls. Run it with: node demo.ts
import { Doll } from "./doll.ts";
import { countDolls, smallestDoll, sumList } from "./nesting-dolls.ts";

const largest = new Doll("Red", new Doll("Orange", new Doll("Yellow", new Doll("Green", new Doll("Blue", null)))));
const heights: number[] = [14, 11, 8, 5, 2];

console.log(`Dolls in the set: ${countDolls(largest)}`);
console.log(`The smallest doll: ${smallestDoll(largest)}`);
console.log(`Heights in cm: ${heights.join(", ")}`);
console.log(`Total height in cm: ${sumList(heights)}`);
