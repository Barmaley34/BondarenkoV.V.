A = int(input("Введите число А "))
B = int(input("Введите число B "))

def f(A, B):
    n = []
    if A < B:
        for i in range(A, B+1):
            n.append(i)
    else:
        for i in range(A, B-1, -1):
            n.append(i)
    return n

print(f(A,B))