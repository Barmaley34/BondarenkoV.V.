def f():
    n = int(input("Введите размер массива: "))
    array = []

    for i in range(n):
        element = float(input("Введите элемент массива: "))
        array.append(element)

    average = sum(array) / len(array)

    for i in range(len(array)):
        if array[i] == 0:
            array[i] = average

    print("Массив с замененными нулевыми элементами:", array)

f()