import random


random_list = [random.choice([0, 1]) for _ in range(10)]
print("Generated list:", random_list)


if all(num == 1 for num in random_list):
    print("ALL")
elif any(num == 1 for num in random_list):
    print("ANY")
else:
    print("NONE")
