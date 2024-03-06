x = (1,2,3,4,5)
y = (4,5,6,7)

setx = set(x)
sety = set(y)

ans = tuple(setx.union(sety))
print(ans)