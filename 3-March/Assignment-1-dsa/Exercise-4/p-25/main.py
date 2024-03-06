import random
import string

lst=[random.choice(string.ascii_letters) for _ in range(10)]

result=''.join(lst)

print(result)