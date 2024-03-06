import random

random_list = [random.randint(1, 100) for _ in range(10)]

max_number = max(random_list)
print("Maximum number:", max_number)
