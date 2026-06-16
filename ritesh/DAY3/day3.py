student_name = input("Enter Student Name: ")
marks = int(input("Enter Marks Obtained (out of 100): "))

if marks < 0 or marks > 100:
    print("Invalid marks! Please enter a value between 0 and 100.")
else:
    print("\nStudent:", student_name)
    print("Marks:", marks)

    # Pass / Fail
    if marks >= 40:
        print("Result: Pass")
    else:
        print("Result: Fail")
    # Grade
    if marks >= 90:
        print("Grade: A+")
    else:
        print("Not Applicable")