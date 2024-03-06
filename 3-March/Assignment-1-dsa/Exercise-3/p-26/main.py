from datetime import date,timedelta


today = date.today()
toyear = today.year
tomonth = today.month

startDate = date(toyear, tomonth, 1)

while startDate.weekday() != 0:
    startDate += timedelta(days=1)

for i in range(0,7):
    print(startDate)
    startDate += timedelta(days=1)

    