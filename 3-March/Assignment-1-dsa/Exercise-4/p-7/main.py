
def isPrime(n):
    for i in range(2,n):
        if n % i == 0:
            return False
    
    return True


def generatePrime():
    for i in range(1,101):
        if isPrime(i):
            yield i



for prime in generatePrime():
    print(prime)