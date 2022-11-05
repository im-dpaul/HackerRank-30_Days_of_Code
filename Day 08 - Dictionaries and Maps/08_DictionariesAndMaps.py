# Enter your code here. Read input from STDIN. Print output to STDOUT

n = int(input())
dic = {}
for i in range(n):
    phn = list(input().split(" "))
    dic[phn[0]]= phn[1]
while True:
    try:
        j = input()
        if j in dic.keys():
             print(j+'='+dic[j])
        else:
            print("Not found")     
    
    except EOFError:
        break
