hexadecimal_number = '10'


binary_number = bin(int(hexadecimal_number, 16))
print("Binary representation:", binary_number)


decimal_number = int(hexadecimal_number, 16)
print("Decimal representation:", decimal_number)


octal_number = oct(int(hexadecimal_number, 16))
print("Octal representation:", octal_number)
