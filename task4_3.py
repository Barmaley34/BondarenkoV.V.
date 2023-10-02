A = int(input("Введите число А "))
B = int(input("Введите число B "))

def f(A,B):
    list = []
    if A > B:
        for i in range(A, B-1, -1):
            if i % 2 != 0:
                list.append(i)
        return list


print(f(A, B))