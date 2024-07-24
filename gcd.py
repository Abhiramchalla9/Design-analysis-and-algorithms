def gcd(m, n):
    while n != 0:
        m, n = n, m % n
    return abs(m)


m = int(input("Enter the first integer (m): "))
n = int(input("Enter the second integer (n): "))


result = gcd(m, n)
print(f"GCD of {m} and {n} is {result}")
