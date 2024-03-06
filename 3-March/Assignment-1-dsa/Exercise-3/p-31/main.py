from random import sample,choice

sortedList = list(range(1,11,1))

unsortedList = sample(sortedList,len(sortedList))

print(unsortedList)