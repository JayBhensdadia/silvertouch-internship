import pickle

def load_variables(filename):
    try:
        with open(filename, 'rb') as file:
            loaded_variables = pickle.load(file)
            print("Variables successfully loaded from", filename)
            return loaded_variables
    except FileNotFoundError:
        print("Error: File", filename, "not found.")
        return None
    except IOError:
        print("Error: Unable to load variables from file", filename)
        return None

def main():
    filename = "my_variables.data"
    loaded_variables = load_variables(filename)

    if loaded_variables:
        print("Loaded variables:", loaded_variables)

if __name__ == "__main__":
    main()
