lst1=[1,2,3,4,5,6,7,8,9,10]
lst2=[11,12,13,14,15,16,17,18,19,20]
res=[]
for i in range(len(lst1)):
    res.append(lst1[i]+lst2[i])

for i in res:
    print(i)