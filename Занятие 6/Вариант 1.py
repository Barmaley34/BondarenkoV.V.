str = "Еж, ель, абрикос, ельник"
def f(str):
    words = str.split()
    count = 0

    for word in words:
        if word.lower().startswith('е'):
            count += 1

    return count


result = f(str)
print("Количество слов, начинающихся с буквы 'е': ", result)