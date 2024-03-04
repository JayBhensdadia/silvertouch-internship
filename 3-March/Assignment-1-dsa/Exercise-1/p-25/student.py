
class Student:

    name:str

  
    def __init__(self,name="unknown"):
        self.name = name

   

    def printDetails(self,isFormatted=False):
        print(f'hi, i am {self.name}!')