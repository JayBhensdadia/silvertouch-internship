from datetime import date


today = date.today()

year = today.year
month = 1

tempDate = date(year,month,1)

firstMonth = tempDate.strftime("%B")
print(firstMonth)