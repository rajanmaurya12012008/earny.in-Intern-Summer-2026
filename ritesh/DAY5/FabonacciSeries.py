
n = int(input("Enter how many Fibonacci numbers you want: "))

a, b = 0, 1  # first two terms
count = 0

if n <= 0:
    print("Please enter a positive number")
elif n == 1:
    print(0)
else:
    print("Fibonacci series:")
    while count < n:
        print(a, end=" ")
        a, b = b, a + b
        count += 1