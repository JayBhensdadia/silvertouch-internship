from my_parent_class import My_parent_class




class My_child_class(My_parent_class):
    def __init__(self, a=1, b=2,c=3) -> None:
        super().__init__(a, b)
        self.c=c
    def add(self):
        super().add()
        self.res1+=self.c   
    def sub(self):
        self.res2=self.a*self.b*self.c

    

