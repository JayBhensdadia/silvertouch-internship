from datetime import date, timedelta


today = date.today()
oneWeekFromToday = today + timedelta(days=7)

print('one week from today:',oneWeekFromToday)