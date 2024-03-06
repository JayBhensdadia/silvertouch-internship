class MyClass:
    def __init__(self, x):
        self.x = x
        self.y = 10


obj = MyClass(5)


if hasattr(obj, 'x'):
    print("Attribute 'x' exists in the class.")
else:
    print("Attribute 'x' does not exist in the class.")


value_of_x = getattr(obj, 'x')
print("Value of attribute 'x':", value_of_x)


setattr(obj, 'x', 15)
print("Updated value of attribute 'x':", obj.x)


delattr(obj, 'y')
if hasattr(obj, 'y'):
    print("Attribute 'y' still exists in the class.")
else:
    print("Attribute 'y' has been deleted from the class.")
