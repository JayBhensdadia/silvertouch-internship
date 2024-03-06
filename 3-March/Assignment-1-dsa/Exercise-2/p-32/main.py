def isCapitalizedOrNot(str):
    frstLetter=str[:1]
    restOfString=str[1:]
    if(frstLetter.isupper() and restOfString.islower()):
        return True
    else:
        return False

print(isCapitalizedOrNot("hello"))