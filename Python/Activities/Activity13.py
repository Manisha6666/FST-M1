nums = [10,20,40,60]


def CalculateSum(nums):
    sum = 0
    for num in nums:
        sum+=num
    return sum

result = CalculateSum(nums)
print(result)
