col1 = {3, 8, 14, 57, 89}
col2 = {8, 12, 65, 89, 112}

def shared(col1, col2):
    col_both = col1 & col2
    return col_both


print(shared(col1, col2))
