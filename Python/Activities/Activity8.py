numbers = list(input("Enter a list of comma separated values: ").split(", "))
print("Given list is ", numbers)

	
firstElement = numbers[0]
	
lastElement = numbers[-1]
	
if (firstElement == lastElement):
    print(True)
else:
    print(False)