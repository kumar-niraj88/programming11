#! basic programming
#add
# num1 = int(input("enter number first : "))
# num2 = int(input("enter number second : "))
# sum=lambda x,y: x+y
# # print(sum(num1 , num2))

#! taking the multiple args and adding 

# def add(*args):
#     return sum(args)

#print(add(1,2,3,4,5,6,7,8,9))


#!max aur min

# num1 = 12
# num2 = 23
# if num1 > num2:
#     print("greast number", num1)
# else:
#     print("greast number :" ,num2)


#!factorial number

# num = 14
# result = 1
# for i in range(1,num+1):
#     result *= i 
    
# print(result)

#!  Simple Interest

# P = 100000
# R = 3
# T = 1

# SI =( P * R * T)/100
# print(SI)

#! Armstrong Number

number  = 120
result = 0 
temp = number
while number > 0:
    a = number %10
    b = pow(a,3)
    result += b
    print((a*a*a))
    number//=10

if temp == result :
    print("Armstrong Number")
else:
    print(" Not Armstrong Number")

print(temp)
print(result)