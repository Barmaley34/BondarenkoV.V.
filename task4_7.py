n = int(input("Введите натуральное число "))

summ = 0
f = 1

for i in range(1, n+1):
        f *= i
        summ += f

print(summ)