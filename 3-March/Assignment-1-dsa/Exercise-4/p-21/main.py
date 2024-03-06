import random


random_list = [random.randint(1, 100) for _ in range(10)]


odd_numbers = list(filter(lambda x: x % 2 != 0, random_list))
even_numbers = list(filter(lambda x: x % 2 == 0, random_list))

print("Odd numbers:", odd_numbers)
print("Even numbers:", even_numbers)
