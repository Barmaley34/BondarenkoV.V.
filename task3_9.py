n = int(input())
m = int(input())
k = int(input())


def choco(n, m, k):
    if (n * m - k) % n == 0 or (n * m - k) % m == 0:
        return "Да"
    else:
        return "Нет"


print(choco(n, m, k))