import math
#squre of number

def squre(num):
     return  num * num
# print(squre(12))

def add(num1 , num2):
     return num1+num2

# print(add(9,45))

def mul(p1 , p2):
     return p1 * p2

# print(mul(4,5))
# print(mul(4,'N'))

def circle_stats(radius):
     area = math.pi * radius **2
     circumference = 2 * math.pi *radius
     return round(area, 2), round(circumference, 2)

a,c = circle_stats(3)
# print(a,c)

def fact(n):
     if n == 0:
          return 1
     else:
         return n * fact(n-1)

print(fact(5))