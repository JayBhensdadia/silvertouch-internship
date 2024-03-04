def takeInput() -> str:
    return input("what is your name: ")

def greet() -> None:
    name = takeInput()
    print(f'hi {name}, how are you?')

greet()
