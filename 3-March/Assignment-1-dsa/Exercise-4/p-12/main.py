binary_number = '11010001111100111'


decimal_number = int(binary_number, 2)
print("Decimal representation:", decimal_number)


hexadecimal_number = hex(int(binary_number, 2))
print("Hexadecimal representation:", hexadecimal_number)


octal_number = oct(int(binary_number, 2))
print("Octal representation:", octal_number)
