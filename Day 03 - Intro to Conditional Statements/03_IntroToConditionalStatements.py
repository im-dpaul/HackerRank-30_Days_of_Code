#!/bin/python3
import math
import os
import random
import re
import sys

if __name__ == '__main__':
    N = int(input().strip())
    print("Weird" if N%2==1 or 6 <= N <= 20 else "Not Weird" )
