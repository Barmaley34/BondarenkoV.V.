N = int(input("Введите количество чисел из ряда Фибоначчи "))

f1 = 1
f2 = 1
f = 0
count = 0
a = [1, 1]

while count < N-2:
    f = f1 + f2
    a.append(f)
    f1 = f2
    f2 = f
    count += 1

print(sum(a))