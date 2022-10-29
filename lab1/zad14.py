def czy_pal(text):
    n = len(text)
    for i in range(n - 1):
        if text[i] != text[n - 1 - i]:
            return False
    return True


print(czy_pal("ALALA"))
print(czy_pal("ALABA"))
