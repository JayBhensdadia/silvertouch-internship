
def customFunction(num1, num2, *nums):
    if len(nums)==0:
        print(num1 * num2)
    elif len(nums)==1:
        print(f'{num1}\n{num2}\n{nums[0]}')
    elif len(nums) ==2:
        print(num1+num2+sum(nums))
    elif len(nums)==3:
        print((num1*num2) + (nums[0]*nums[1]*nums[2]))
    else:
        print("invalid input")


customFunction(2,3)
print("---------------------")
customFunction(2,3,4)
print("---------------------")
customFunction(2,3,4,5)
print("---------------------")
customFunction(2,3,4,5,6)
