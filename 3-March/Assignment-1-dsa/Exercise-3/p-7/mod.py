
class Student:

    def __init__(self,name="unknown",rollno=-1):
        self.name = name
        self.rollno = rollno


    def displayDetails(self) -> None:
        print(f'name: {self.name}\nrollno: {self.rollno}')


def _printSchoolName() -> None:
    print('Mount Carmel High School')    
