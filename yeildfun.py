def infinite_fibonacci():
    a = 0
    b = 1
    # Pauses the function and returns a value to the caller.
    while True :
        yield a
        a = b
        b = a+b

gen = infinite_fibonacci()

for _ in range(10):
    print(next(gen))
