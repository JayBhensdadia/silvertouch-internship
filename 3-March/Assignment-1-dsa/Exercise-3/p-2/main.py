#ValueError
try:
    x = int("a")
except ValueError:
    print("That was a ValueError")


#ZeroDivisionError
try:
    result = 10 / 0
except ZeroDivisionError:
    print("You tried to divide by zero")


#IndexError
try:
    my_list = [1, 2, 3]
    print(my_list[4])
except IndexError:
    print("That index is out of range")


#FileNotFoundError (Python 3+)
try:
    with open("nonexistent_file.txt", "r") as file:
        content = file.read()
except FileNotFoundError:
    print("That file does not exist")


#KeyError
try:
    my_dict = {"key": "value"}
    print(my_dict["nonexistent_key"])
except KeyError:
    print("That key does not exist in the dictionary")
