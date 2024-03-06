from random import sample

mylist = sample(range(1,10000),10)

for i in range(0,len(mylist)):
    for j in range(0,(len(mylist)-i-1)):
        if mylist[j] < mylist[j+1]:
            temp = mylist[j+1]
            mylist[j+1] = mylist[j]
            mylist[j] = temp


print(mylist)