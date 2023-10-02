a = int(input("Введите первое число "))
b = int(input("Введите второе число "))
c = int(input("Введите третье число "))

def naim(a,b,c):
    if a<b<c:
        return a
    elif b<a and b<c:
        return b
    if c < b and c < a:
        return c

print(naim(a,b,c))