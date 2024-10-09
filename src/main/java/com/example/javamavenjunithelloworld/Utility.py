b=int(input("Enter the value of b:"))
m=int(input("Enter the value of m:"))
w=int(input("Enter the value of w:"))
if b>m and b>w:
    print("b is greater than m,w")
elif m>b and m>w:
    print("m is greater than b,w")
else:
    print("w is greater than b,m")