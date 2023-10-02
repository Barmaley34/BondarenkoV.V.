a1 = int(input())
a2 = int(input())
b1 = int(input())
b2 = int(input())

def f(a1,a2,b1,b2):
    if ((a1+a2) % 2 == 0 and (b1+b2) % 2 ==0 ) or ((a1+a2) % 2 != 0 and (b1+b2) %2 != 0):
        return 'один цвет'

print(f(a1,a2, b1, b2))