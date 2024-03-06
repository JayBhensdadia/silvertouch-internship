def read_from_file(filename):
    try:
        with open(filename,'r') as file:
            for line in file:
                print(line.strip())
        
    except IOError:
        print("there was an error")


def main():
    filename = "test_file.txt"
    read_from_file(filename)


if __name__ == "__main__":
    main()