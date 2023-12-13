import math

def square():
    side = float(input("Введите длину стороны квадрата: "))
    area = side ** 2
    print("Площадь квадрата:", area)

def rectangle():
    length = float(input("Введите длину прямоугольника: "))
    width = float(input("Введите ширину прямоугольника: "))
    area = length * width
    print("Площадь прямоугольника:", area)

def circle():
    radius = float(input("Введите радиус окружности: "))
    area = math.pi * radius ** 2
    print("Площадь окружности:", area)

def triangle():
    base = float(input("Введите длину основания треугольника: "))
    height = float(input("Введите высоту треугольника: "))
    area = 0.5 * base * height
    print("Площадь треугольника:", area)

square()
rectangle()
circle()
triangle()