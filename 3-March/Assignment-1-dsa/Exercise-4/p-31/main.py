import random
from functools import wraps


def add_random_values(func):
    
    def wrapper():

        random_value1 = random.randint(1, 10)
        random_value2 = random.randint(1, 10)

        return func(random_value1, random_value2)

    return wrapper


@add_random_values
def add(a, b):
    return a + b


@add_random_values
def sub(a, b):
    return a - b


@add_random_values
def mul(a, b):
    return a * b


@add_random_values
def div(a, b):
    return a / b


result_add = add()
result_sub = sub()
result_mul = mul()
result_div = div()

print("Result of addition:", result_add)
print("Result of subtraction:", result_sub)
print("Result of multiplication:", result_mul)
print("Result of division:", result_div)
