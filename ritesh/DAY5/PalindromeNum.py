
n = int(input("Enter how many palindrome numbers to print: "))

count = 0
num = 1

while count < n:
    original = num
    reverse = 0
    temp = num

    # Reverse the number
    while temp > 0:
        digit = temp % 10
        reverse = reverse * 10 + digit
        temp = temp // 10

    # Check if palindrome
    if original == reverse:
        print(original, end=" ")
        count += 1

    num += 1