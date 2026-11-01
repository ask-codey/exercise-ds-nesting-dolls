// Tries your functions on a set of five dolls. Run it with: node demo.js
import { Doll } from "./doll.js";
import { countDolls, smallestDoll, sumList } from "./nesting-dolls.js";

const largest = new Doll("Red", new Doll("Orange", new Doll("Yellow", new Doll("Green", new Doll("Blue", null)))));
const heights = [14, 11, 8, 5, 2];

console.log(`Dolls in the set: ${countDolls(largest)}`);
console.log(`The smallest doll: ${smallestDoll(largest)}`);
console.log(`Heights in cm: ${heights.join(", ")}`);
console.log(`Total height in cm: ${sumList(heights)}`);
