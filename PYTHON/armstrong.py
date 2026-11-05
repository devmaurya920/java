# This program checks whether the number is armstrong or not
n = int(input("Enter your number to be checked : "))
n1 = n
dig = 0
while( n1 != 0) :
    n1 //= 10
    dig += 1

n2 = n
s = 0
while(n2 != 0) :
    r = n2 % 10
    s += r**dig
    n2 //= 10

if s==n :
    print(n , "is a armstrong number")
else :
    print(n, "is not a armstrong number")