
with open('python.txt', 'r') as file:
    
    python_code = file.read()

    exec(python_code)