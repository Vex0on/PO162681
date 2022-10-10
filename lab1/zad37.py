import random

random.seed(123456)
randomlist = [random.randrange(1, 101) for i in range(200)]
randomlist2 = []

for x in randomlist:
    if (x & 1) == 1:
        randomlist2.append(x)

# print(randomlist) # Printuje liste wygenerowana w tresci
# print(randomlist2) # Printuje liste liczb parzystych z pierwszej listy
print("Ilosc nieparzystych liczb na liscie: " + (str(len(randomlist2))))
