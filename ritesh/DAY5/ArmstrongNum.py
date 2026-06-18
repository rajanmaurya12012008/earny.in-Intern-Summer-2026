n = int(input("Enter how many Armstrong numbers to print: "))

count = 0
num = 1

while count < n:
    original = num
    digits = len(str(num))

    total = 0
    temp = num

    while temp > 0:
        digit = temp % 10
        total += digit ** digits
        temp //= 10

    if total == original:
        print(original, end=" ")
        count += 1

    num += 1
