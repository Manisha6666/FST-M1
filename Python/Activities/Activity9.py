# Given lists
num1 = [30, 2, 23, 10, 19]
num2 = [10, 23, 54, 56, 10]

print("First List ", num1)
print("Second List ", num2)

num3 = []

for num in num1:
    if (num % 2 != 0):
        num3.append(num)

for num in num2:
    if (num % 2 == 0):
        num3.append(num)

print("result List is:")
print(num3)