def mult_decorator(prm1,prm2):
    def decorator(func):
        def wrapper(a,b):
            result=prm1*prm2
            
            return func(a,b,result)
        return wrapper
    
    return decorator


@mult_decorator(4,5)
def add(a,b,result):
    print(a+b)
    print(result)
    
add(3,4)    