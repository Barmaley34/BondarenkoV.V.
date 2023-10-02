a = int(input("Введите первое число "))
c = int(input("Введите второе число "))
b = int(input("Введите третье число "))

def often(a,b,c):
    if a==b and b==c:
        return "3"
    if (a == b or b == c) and a != c:
        return "2"
    else:
        return "0"

print(often(a,b,c))