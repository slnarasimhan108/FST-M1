numbers = list(input("Enter a list of comma separated values: ").split(", "))
sum = 0

for number in numbers:
  sum += int(number)

print(sum)