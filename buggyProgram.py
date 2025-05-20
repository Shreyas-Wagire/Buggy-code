# This script should calculate the factorial of a number entered by the user

def factorial(n):
    if n == 0:
        return 0  
    else:
        return n * factorial(n - 1)

def main():
    number = input("Enter a number: ")  
    if number < 0: 
        print("Factorial is not defined for negative numbers.")
    else:
        print("Factorial of", number, "is", factorial(number)) 

main()
