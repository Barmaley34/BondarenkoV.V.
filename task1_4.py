seconds = int(input("Введите количество секунд "))

minutes = seconds/ 60
hours = minutes / 60
days = hours / 24

print(days, hours, minutes, seconds, sep=':')