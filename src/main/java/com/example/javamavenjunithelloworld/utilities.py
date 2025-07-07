import math

def apoorva():
    print("I am Apoorva")

def find_area_of_circle(radius):
    return math.pi * radius * radius

# Example usage:
if __name__ == "__main__":
    apoorva()
    r = 5
    print(f"Area of circle with radius {r} is {find_area_of_circle(r):.2f}")
