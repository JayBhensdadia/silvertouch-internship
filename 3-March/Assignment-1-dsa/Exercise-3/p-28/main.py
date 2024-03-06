import datetime

def get_first_and_last_date_of_month():
    
    today = datetime.date.today()

    
    year = today.year
    month = today.month

    
    first_date_of_month = datetime.date(year, month, 1)

    
    
    if month == 12:  
        next_month = 1
        next_year = year + 1
    else:
        next_month = month + 1
        next_year = year

    last_date_of_month = datetime.date(next_year, next_month, 1) - datetime.timedelta(days=1)

    return first_date_of_month, last_date_of_month


def format_date(date):
    return date.strftime("%dth %B %Y %A %I:%M:%S %p")

def main():
    
    first_date, last_date = get_first_and_last_date_of_month()

    
    print("First date of the current month:", format_date(first_date))
    print("Last date of the current month:", format_date(last_date))

if __name__ == "__main__":
    main()
