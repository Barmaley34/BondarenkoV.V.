n = int(input("Введите количество ступенек "))
s = ''

if n <= 9:
    for i in range(1, n+1):
        s += str(i)
        print(s)