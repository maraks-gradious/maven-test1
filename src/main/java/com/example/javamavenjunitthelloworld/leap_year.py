def check_leap_year(year):
    if (year % 400 == 0) or (year % 4 == 0 and year % 100 != 0):
        print(f"{year} is a Leap Year")
    else:
        print(f"{year} is NOT a Leap Year")

# Example run
check_leap_year(2024)  # Leap Year
check_leap_year(2025)  # Not Leap Year
