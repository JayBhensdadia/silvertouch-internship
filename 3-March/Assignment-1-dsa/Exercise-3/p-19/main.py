from datetime import date


d1 = date(2023,1,1)
d2 = date(2024,1,1)

diff = d2 - d1

print(diff.days)