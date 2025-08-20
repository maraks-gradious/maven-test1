def largest(a, b, c):
    max_val = a
    if b > max_val:
        max_val = b
    if c > max_val:
        max_val = c
    return max_val

def main():
    try:
        a, b, c = map(float, input("Enter three numbers (a b c): ").split())
    except ValueError:
        print("Invalid input. Please enter three numeric values separated by spaces.")
        return

    max_val = largest(a, b, c)
    if a == b == c:
        print(f"All numbers are equal: {a}")
    else:
        print(f"Largest: {max_val}")

if __name__ == "__main__":
    main()
