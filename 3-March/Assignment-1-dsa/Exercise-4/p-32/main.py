from functools import  wraps

def squre_number(func):
    
    def wrapper(args):
        result=args**2
        
        return func(result)
    
    return wrapper

def add_num(func):
    
    def wrapper(args):
        result=args+10
        
        return func(result)
    
    return wrapper



@squre_number
@add_num
def function(x):
    print(x)
    
    
function(2)    
        
    