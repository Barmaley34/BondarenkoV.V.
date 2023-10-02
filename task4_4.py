N = int(input("Введите количество чисел N "))
a = []

while N != 0:
    N = N-1
    a.append(int(input()))

print(sum(a))