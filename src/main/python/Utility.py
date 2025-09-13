import math

#  Check if the given number is odd or even
def is_odd_or_even(x):
    return "Even" if x % 2 == 0 else "Odd"

#  Check if the number is divisible by 2,3,4...9
def is_divisible_by2(x):
    return x % 2 == 0

def is_divisible_by3(x):
    return x % 3 == 0

def is_divisible_by4(x):
    return x % 4 == 0

def is_divisible_by5(x):
    return x % 5 == 0

def is_divisible_by6(x):
    return x % 6 == 0

def is_divisible_by7(x):
    return x % 7 == 0

def is_divisible_by8(x):
    return x % 8 == 0

def is_divisible_by9(x):
    return x % 9 == 0

#  Compare two numbers and return the bigger number
def max_of_two(a, b):
    return a if a > b else b

#  Find the biggest number among 3 numbers
def max_of_three(a, b, c):
    return max(a, b, c)

#  Print numbers from 1 to 10
def print_1_to_10():
    for i in range(1, 11):
        print(i)

# Check if the given year is a leap year
def is_leap_year(year):
    return (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0)

# Add 2 numbers
def add_two_numbers(a, b):
    return a + b

#  Multiply 2 numbers
def multiply_two_numbers(a, b):
    return a * b

#  Divide 2 numbers
def divide_two_numbers(a, b):
    if b == 0:
        return "Cannot divide by zero"
    return a / b

#  Calculate (a + b)²
def square_of_sum(a, b):
    return (a + b) ** 2

# Find the area of the circle
def area_of_circle(radius):
    return math.pi * radius ** 2

#  Find the area of the square
def area_of_square(side):
    return side ** 2

# Find the area of the rectangle
def area_of_rectangle(length, width):
    return length * width

#  Find the area of a triangle
def area_of_triangle(base, height):
    return 0.5 * base * height

#  Find the square root of the given number
def square_root(x):
    if x < 0:
        return "Cannot find square root of negative number"
    return math.sqrt(x)
