def all(array):
    sum_of_elements = sum(array)
    average_value = sum_of_elements / len(array)
    return sum_of_elements, average_value
array1 = [1, 2, 3, 4, 5]
array2 = [10, 20, 30]
array3 = [100, 200, 300, 400]
sum1, average1 = all(array1)
sum2, average2 = all(array2)
sum3, average3 = all(array3)
print("Сумма элементов в первом массиве:", sum1)
print("Среднее арифметическое значение в первом массиве:", average1)

print("Сумма элементов во втором массиве:", sum2)
print("Среднее арифметическое значение во втором массиве:", average2)

print("Сумма элементов в третьем массиве:", sum3)
print("Среднее арифметическое значение в третьем массиве:", average3)