#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':

    arr = []
    new_arr = []
    count = -999
    
    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))
    
    
    for i in range (1, 5):
        for j in range(1, 5):
            sum_glass = sum([arr[i-1][j-1], arr[i-1][j], arr[i-1][j+1], arr[i][j], arr[i+1][j-1], arr[i+1][j], arr[i+1][j+1]])
            if sum_glass > count:
                count = sum_glass

    print(count)
