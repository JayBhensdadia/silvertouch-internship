try:
    
    x = int(input("Enter a number: "))
    y = int(input("Enter another number: "))
    result = x / y
except ValueError:
    print("Please enter valid integers.")
except ZeroDivisionError:
    print("You cannot divide by zero.")
else:
    
    print("Division result:", result)
