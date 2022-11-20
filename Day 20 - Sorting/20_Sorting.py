#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input().strip())

    a = list(map(int, input().rstrip().split()))

    # Write your code here

    numberOfSwaps = 0
    for i in range(n):
        for j in range(n-1):
            if (a[j] > a[j + 1]):
                a[j], a[j + 1] = a[j + 1], a[j]
                numberOfSwaps +=1
    print("Array is sorted in",numberOfSwaps, "swaps.")
    print("First Element:", a[0])
    print("Last Element:", a[n-1])