from my_parent_class import my_parent_class


class my_child_class(my_parent_class):

    z:float = 20.0

    def __init__(self,a=10.0, b=12.0,c=z):
        super().__init__(a,b)
        self.c = c

    def add(self):
        super().add()
        self.res1 += self.c
        self.res2 += self.c

    def sub(self):
        super().sub()
        self.res1 -= self.c
        self.res2 -= self.c


    

