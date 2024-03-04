
class my_parent_class:
    x:float = 10.0
    y:float = 12.0

    # def __init__(self, a=None, b=None):

    #     if a==None and b==None:
    #         self.a = self.x
    #         self.b = self.y

    #     if a==None and b!=None:
    #         self.a = self.x
    #         self.b = b
        
    #     if b==None and a!=None:
    #         self.b = self.y
    #         self.a = a

    #     if a!=None and b!=None:
    #         self.a = a
    #         self.b = b

    def __init__(self, a = x, b = y):
        self.a = a
        self.b = b

    def add(self):
        self.res1 = self.x + self.a
        self.res2 = self.y + self.b
    
    def sub(self):
        self.res1 = self.x - self.a
        self.res2 = self.y - self.b

    def print_result(self):
        print(self.res1)
        print(self.res2)

        
