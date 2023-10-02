A = int(input('Введите A >= B '))
B = int(input('Введите B '))
if A <= B:
    for i in range(A, B+1):
        print(i)
else:
    print("Ошибка")