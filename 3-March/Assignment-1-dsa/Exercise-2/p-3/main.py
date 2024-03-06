list1 = list(range(1,9))
list2 = list(range(4,11))

ans = []

for i in list1:
    for j in list2:
        if i==j:
            ans.append(i)

print(ans)