n = int(input("Введите n: "))

viraz = n**3
a = 1

while a < n:
    viraz += a**3
    a += 1

print(viraz)