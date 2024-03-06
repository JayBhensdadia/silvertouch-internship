def append_to_file(filename,text):
    try:
        with open(filename,'a') as file:
            file.write(text)
        print("file is written successfully")
    except IOError:
        print("there was an error")


def main():
    filename = "test_file.txt"
    text = "\nthis is appended text"
    append_to_file(filename,text)


if __name__ == "__main__":
    main()