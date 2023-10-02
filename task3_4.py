a = int(input("Введите длину ряда по горизонтали "))
b = int(input("Введите длину ряда по вертикали "))
l = int(input("Введите длину свободного шнурка "))
N = int(input("Введите количество рядов "))

def dlina(a,b,l,N):
    return (2*N-1)*a + (N-1)*b + l

print(dlina(a,b,l,N))