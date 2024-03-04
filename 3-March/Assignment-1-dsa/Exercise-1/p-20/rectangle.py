class Rectangle:
    length:float
    breadth:float

    def __init__(self,length,breadth):
        self.length = length
        self.breadth = breadth

    def printResult(num):
        print(f'result = {num}')
    
    def area(self):
        Rectangle.printResult(self.length * self.breadth)

    

