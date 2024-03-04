choice_string = '''
1 - addition
2 - subtraction
3 - multiplication
4 - division
5 - exponent
6 - floor division
-----------------------
enter your choice : 

'''
def calculator():

    def takeInput(n) -> list[int]:
        nums:list[int] = list(map(int,input(f'enter {n} numbers sparated by spaces:\n').split()))

        return nums

    def add() -> int:
        nums = takeInput(3)
        return sum(nums)

    def mul() -> int:
        nums = takeInput(3)
        ans: int = 1
        for i in nums:
            ans *= i
        return ans

    def sub() -> int:
        nums = takeInput(2)
        return nums[0] - nums[1]
    
    def div() -> int:
        nums = takeInput(2)
        return nums[0] / nums[1]

    def exp() -> int:
        nums = takeInput(2)
        return nums[0] ** nums[1]

    def floorDiv() -> int:
        nums = takeInput(2)
        return nums[0] // nums[1]

    choice: int = int(input(choice_string))

    result: int
    match(choice):
        case 1:
            result = add()
        case 2:
            result = sub()
        case 3:
            result = mul()
        case 4:
            result = div()
        case 5:
            result = exp()
        case 6:
            result = floorDiv()
        case _:
            print("invalid input!!")

    print(f'result = {result}')
    
    



calculator()