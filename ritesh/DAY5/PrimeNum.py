
n = int(input("Enter how many prime numbers to print: "))

count = 0
number = 2

while count < n:

    is_prime = True

    for i in range(2, number):

        if number % i == 0:
            is_prime = False
            break

    if is_prime:
        print(number, end=" ")
        count += 1

    number += 1