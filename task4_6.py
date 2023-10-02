mnoz = 1
n = int(input("Введите n: "))

for i in range(1, n+1):
    mnoz *= i
    n *= mnoz

print("n! = ", mnoz)