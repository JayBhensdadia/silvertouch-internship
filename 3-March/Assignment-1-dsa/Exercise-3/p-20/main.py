from datetime import date


year = int(input('enter year of birth: '))
month = int(input('enter month of birth: '))
bdate = int(input('enter date of birth: '))

today = date.today()
bday = date(year, month, bdate)

diff = today - bday

print(f'age in years: {diff.days // 365}')
print(f'age in months: {diff.days // 30}')
print(f'age in days: {diff.days}')