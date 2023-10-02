a = int(input("Введите год "))

def V(a):
    if a % 4 == 0 and (a % 100 != 0 or a % 400 == 0):
        return "Високосный год"
    else:
        return "Невисокосный год"

print(V(a))