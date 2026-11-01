# The tests for your three functions. You don't need to change this file.
# Each message says what was expected, so a failing test tells you what to look at.
from doll import Doll
from nesting_dolls import count_dolls, smallest_doll, sum_list


def five_dolls():
    return Doll("Red", Doll("Orange", Doll("Yellow", Doll("Green", Doll("Blue", None)))))


def set_of(count):
    """A set of count dolls: "Doll 1" is the solid one in the middle, and the outside doll is returned."""
    doll = Doll("Doll 1", None)
    for number in range(2, count + 1):
        doll = Doll(f"Doll {number}", doll)
    return doll


def test_count_dolls_in_a_set_of_five():
    assert count_dolls(five_dolls()) == 5, "Not yet: Red, Orange, Yellow, Green and Blue make 5 dolls."


def test_count_dolls_of_a_solid_doll():
    assert count_dolls(Doll("Blue", None)) == 1, "Not yet: a solid doll on its own is 1 doll."


def test_count_dolls_in_a_big_set():
    assert count_dolls(set_of(50)) == 50, "Not yet: a set of 50 dolls has 50 dolls."


def test_smallest_doll_of_five():
    assert smallest_doll(five_dolls()) == "Blue", "Not yet: Blue is the solid doll in the middle of the set."


def test_smallest_doll_of_a_solid_doll_and_a_big_set():
    assert smallest_doll(Doll("Blue", None)) == "Blue", "Not yet: a solid doll on its own is the smallest."
    assert smallest_doll(set_of(50)) == "Doll 1", "Not yet: in a set of 50, Doll 1 is the solid one in the middle."


def test_sum_list_of_the_heights():
    assert sum_list([14, 11, 8, 5, 2]) == 40, "Not yet: 14 + 11 + 8 + 5 + 2 is 40."


def test_sum_list_of_short_lists():
    assert sum_list([7]) == 7, "Not yet: a list holding only 7 adds up to 7."
    assert sum_list([]) == 0, "Not yet: an empty list adds up to 0."


def test_sum_list_leaves_the_list_as_it_was():
    numbers = list(range(1, 101))
    assert sum_list(numbers) == 5050, "Not yet: the numbers 1 to 100 add up to 5,050."
    assert numbers == list(range(1, 101)), "Not yet: leave the list as it was; make a shorter list for the rest instead."
