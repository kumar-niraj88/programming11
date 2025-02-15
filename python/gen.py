def squre(num):
    n = 1
    while n <= num:
        sq = n*n
        yield sq
        n +=1

num=11  
value = squre(num)

for i in value:
    print(i)