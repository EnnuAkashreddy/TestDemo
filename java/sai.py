temp = int(input("enter temp: "))
unit = input("enter units: ")
if unit.upper() == "C":
    res = (temp * (5 / 9)) + 32
    units = "fahrenheit"
elif unit.upper() == "F":
    res = (temp - 32) * (5 / 9)
    units = "celsius"
else:
    print("invalid unit not found...!")
print(f"The temp is {res} in {units}")
