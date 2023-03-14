weight = int(input("enter the weigth:"))
n = input("pounds or kilos: ")
if n == "pounds":
    wt = weight * 0.45
    print(f"you are {wt} kilos")
elif n == "kilos":
    wt = weight / 0.45
    print(f"you are {wt} pounds")
else:
    print("erorr!")
