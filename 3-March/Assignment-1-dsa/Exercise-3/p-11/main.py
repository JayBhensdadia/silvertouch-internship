def read_from_file(filename):
    try:
        with open(filename,'r') as file:
            data = file.read()
        print(data)
    except IOError:
        print("there was an error")


def main():
    filename = "test_file.txt"
    read_from_file(filename)


if __name__ == "__main__":
    main()