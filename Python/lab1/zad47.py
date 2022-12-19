col1 = {3, 8, 14, 57, 89}
col2 = {4, 12, 65, 90, 112}

def merged(col1, col2):
    col_both = col1 | col2
    return col_both


print(merged(col1, col2))
