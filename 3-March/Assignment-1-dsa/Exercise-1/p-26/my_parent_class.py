class My_parent_class:
    res1=0
    res2=0
    def __init__(self,a=1,b=2) -> None:
        self.a=a
        self.b=b
    def add(self):
        self.res1=self.a+self.b
    def sub(self):
        self.res2=self.a-self.b
    def  print_result(self):
        print(f"res1 = {self.res1}\nres2 = {self.res2}")