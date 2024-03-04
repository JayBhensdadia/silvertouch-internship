
nums:list = []

for i in range(1,4):
    nums.append(int(input(f'enter number {i} : ')))


nums = sorted(nums)

print(f'largest number is {nums[2]}')
print(f'smallest number is {nums[0]}')
