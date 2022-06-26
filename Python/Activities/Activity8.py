numbers = list(input("Enter the numbers"))
print(numbers)
firstNum = numbers[0]
lastNum = numbers[-1]

if(firstNum==lastNum):
    print(True)
else:
    print(False)