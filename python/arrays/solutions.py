
#!Input : arr[] = {1, 2, 3}
#!Output : 6

# arr = {1, 2, 3}
# sum = 0
# for i in arr:
#     sum +=i

# print(sum)
"""
Input : arr[] = {10, 20, 4}
Output : 20
Input : arr[] = {20, 10, 20, 4, 100}
Output : 100"""

# arr = [10, 20, 4]

# n = len(arr)
# def largest(arr,n):
#     max = arr[0]
#     for i in range(1, n):
#         if arr[i] > max:
#             max = arr[i]
#     return max
# print(largest(arr,n))

#! rotate the arrays

arr = [1,2,3,4,5,6]

n = 2
def shifRight(arr,n):
    for i in range(0,n):
        temp = arr[len(arr)-1]
        for j in range(len(arr)-1, 0 , -1):
            arr[j] = arr[j-1]
        arr[0] = temp
    return arr

shifRight(arr,n)    
# print(arr)


arr1 = [1,2,3,4,5,6] # [2 3 4 5 6 1]
n = 2

def shiftLeft(arr1,n):
    for i in range(0,n):
        temp = arr1[0]
        for j in range(0,len(arr1)-1):
            arr1[j]=arr1[j+1]
        arr1[len(arr1)-1]=temp

    return arr1

shiftLeft(arr1,n)
print(arr1)