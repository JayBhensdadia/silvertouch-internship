def write_binary_data(filename, data):
    try:
        with open(filename, "wb") as file:
            file.write(data)
        print("successfully written data")
    except IOError:
        print("Error: Unable to write binary data to file", filename)

def read_binary_data(filename):
    try:
        with open(filename, "rb") as file:
            binary_data = file.read()
            return binary_data
    except FileNotFoundError:
        print("Error: File", filename, "not found.")
        return None
    except IOError:
        print("Error: Unable to read binary data from file", filename)
        return None

def main():
    filename = "test_file.data"
    data_to_write = b'\x48\x65\x6c\x6c\x6f\x20\x77\x6f\x72\x6c\x64'

    write_binary_data(filename, data_to_write)
    print(read_binary_data(filename))

if __name__ == "__main__":
    main()
