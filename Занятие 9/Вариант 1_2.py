B = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

for row in B:
    max_elem = max(row)
    min_elem = min(row)
    first_index = 0
    last_index = len(row) - 1
    max_index = row.index(max_elem)
    row[first_index], row[max_index] = row[max_index], row[first_index]
    min_index = row.index(min_elem)
    row[last_index], row[min_index] = row[min_index], row[last_index]

print(B)