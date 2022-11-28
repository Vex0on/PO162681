tup = (2, 8, 4)

def tuple_to_number(tuple):
    result = ""
    for i in tuple:
        result += str(i)
    tuple = int(result)
    print(tuple)


tuple_to_number(tup)
