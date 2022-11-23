# Enter your code here. Read input from STDIN. Print output to STDOUT
for _ in range(int(input())):
    n = int(input())
    rng = range(2, int(n**0.5) + 1)
    cond = sum((n % i) == 0 for i in rng) == 0 and n != 1
    print("Prime") if cond else print("Not prime")