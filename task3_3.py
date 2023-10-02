n = int(input("Введите, сколько прошло минут с начала суток: "))

hours = n / 60
minutes = n % 60


if 0 <= n <= 1440:
    if 0 < hours < 25 and 0 <= minutes < 60:
        print("Часы: ", hours,"Минуты: ",  minutes)
else:
    print("У вас количество введенных минут больше, чем суток --> ошибка")