# To write any utility function from the given list

def karthikFindIsLeapYear(year):
    if (year % 4)==0 and year%100!=0 or (year%400)==0:
        return True
    else:
        return False
year=int(input("Enter the year: "))  # 2020 - True, 1900 - False, 2000 - True
print(karthikFindIsLeapYear(year))