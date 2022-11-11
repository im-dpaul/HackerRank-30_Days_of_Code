#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input().strip())

    string=''
    while n>0:
        x=n//2
        string=string+str(n%2)
        n=x
    string=string[::-1]
    list1=string.split('0')
    temp=max(len(i) for i in list1)    
    print(temp)