from datetime import date

today = date.today()

year = today.year
month = today.month


firstDate = date(year,month,1)

weekDay = firstDate.strftime("%A")
print(weekDay)