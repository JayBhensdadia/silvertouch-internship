import pickle

def save_variables(filename, *args):
    try:
        with open(filename, 'wb') as file:
            pickle.dump(args, file)
        print("Variables successfully saved to", filename)
    except IOError:
        print("Error: Unable to save variables to file", filename)

def main():
    filename = "my_variables.data"
    var1 = 42
    var2 = "Hello, world!"
    var3 = [1, 2, 3, 4, 5]
    var4 = {'key': 'value'}

    save_variables(filename, var1, var2, var3, var4)

if __name__ == "__main__":
    main()
