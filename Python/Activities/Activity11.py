fruits = {
    "apple" : 20,
    "Orange" : 10,
    "Grapes" : 5
}

fruit = input("Enter the fruit name").lower()
if(fruit in fruits):
    print("Yes available")
else:
    print("Not available")
