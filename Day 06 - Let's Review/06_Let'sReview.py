# Enter your code here. Read input from STDIN. Print output to STDOUT

n = int(input())

myList = []
for i in range(n):
    s = input()
    myList.append(s)

for item in myList:
    s = list(item)
    even = []
    odd = []
    for i in range(len(s)):
        if (i % 2 == 0):
            even.append(s[i])
        else:
            odd.append(s[i])
    
    print(''.join(even), end=' ')
    print(''.join(odd))
