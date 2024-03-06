import random


random_list = [random.randint(1, 100) for _ in range(10)]


min_number = min(random_list)
print("Minimum number:", min_number)
