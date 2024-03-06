import random
def random_generator():
    taken=set()
    while len(taken)!=10 :
        x=random.randint(1,100)
        if x not in taken:
            taken.add(x)
            yield x
            

randomNumber:list = []
for x in random_generator():
     randomNumber.append(x)

print(randomNumber)          
                