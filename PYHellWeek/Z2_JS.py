print("Zadanie 1")

word = "Python"

with open('content.txt') as f:
    data = f.readlines()
    for line in data:
        if word in line:
            print(line)

print("Zadanie 2")

word2 = str(input("Podaj szukaną literę: ")).lower()
with open('content.txt') as fi:
    for line in fi:
        for word in line.split():
            print(word) if word.lower().startswith(word2) else None

