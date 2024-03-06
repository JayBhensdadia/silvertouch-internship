octal_number = '13'


binary_number = bin(int(octal_number, 8))
print("Binary representation:", binary_number)


decimal_number = int(octal_number, 8)
print("Decimal representation:", decimal_number)


hexadecimal_number = hex(int(octal_number, 8))
print("Hexadecimal representation:", hexadecimal_number)
