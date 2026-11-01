# Tries your functions on a set of five dolls. Run it with: python demo.py
from doll import Doll
from nesting_dolls import count_dolls, smallest_doll, sum_list

largest = Doll("Red", Doll("Orange", Doll("Yellow", Doll("Green", Doll("Blue", None)))))
heights = [14, 11, 8, 5, 2]

print(f"Dolls in the set: {count_dolls(largest)}")
print(f"The smallest doll: {smallest_doll(largest)}")
print("Heights in cm: " + ", ".join(str(height) for height in heights))
print(f"Total height in cm: {sum_list(heights)}")
