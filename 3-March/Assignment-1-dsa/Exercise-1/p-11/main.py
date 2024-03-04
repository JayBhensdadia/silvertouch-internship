nums:list[int] = list(map(int,input(
    f'enter number: '
).split()))


nums = sorted(nums)

print(f'largest number is {nums[2]}')
print(f'smallest number is {nums[0]}')

