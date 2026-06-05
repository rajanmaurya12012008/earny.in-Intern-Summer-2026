# Online Shopping Free Delivery Checker

customer_name = input("Enter Customer Name: ")
purchase_amount = float(input("Enter Purchase Amount: "))

if purchase_amount >= 1000:
    delivery_charge = 0
    print("Free Delivery Applied")
else:
    delivery_charge = 50

final_amount = purchase_amount + delivery_charge

print("\nPurchase Amount:", purchase_amount)
print("Delivery Charge:", delivery_charge)
print("Final Amount Payable:", final_amount)