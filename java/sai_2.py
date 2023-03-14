temp = input("enter a number and unit: ")
deg = int(temp[:-1])
con = temp[-1]


if con.upper() == "C":
    result = (deg * (5 / 9)) + 32
    un = "fahrenheit"

elif con.upper() == "F":
    result = (deg - 32) * (5 / 9)
    un = "celsius"

else:
    print("unit is undefined...!")
print(f"The temp is {result} {un}")
