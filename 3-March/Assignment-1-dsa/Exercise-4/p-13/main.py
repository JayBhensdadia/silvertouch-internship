
ascii_dict = {chr(i): ord(chr(i)) for i in range(48, 58)}  
ascii_dict.update({chr(i): ord(chr(i)) for i in range(65, 91)})  
ascii_dict.update({chr(i): ord(chr(i)) for i in range(97, 123)})  

print(ascii_dict)