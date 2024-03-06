def add_numbers(num1, num2):

    if not (isinstance(num1, (int, float)) and isinstance(num2, (int, float))):
        raise TypeError("Both numbers must be either float or integer")

    result = num1 + num2
    return result

try:
    result1 = add_numbers(5, 10)
    print("Result:", result1)

    result2 = add_numbers(3.5, 7)
    print("Result:", result2)

    result3 = add_numbers(2.5, 4.8)
    print("Result:", result3)

    result4 = add_numbers(3.5, "hello")
    print("Result:", result4)

except TypeError as e:
    print("Error:", e)