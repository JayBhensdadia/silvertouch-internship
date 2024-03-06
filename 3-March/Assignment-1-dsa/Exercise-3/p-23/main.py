from datetime import date, timedelta


today = date.today()
oneMonthFromToday = today + timedelta(days=7)

print('one month from today:',oneMonthFromToday)