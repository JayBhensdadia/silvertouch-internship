from datetime import date, timedelta


today = date.today()
oneYearFromToday = today + timedelta(days=365)

print('one year from today:',oneYearFromToday)