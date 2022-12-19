import random

random.seed(123456)
randomlist = [random.randrange(1, 101) for i in range(200)]
randomlist2 = []

print(f"Lista z polecenia: {randomlist}")

for x in randomlist:
    if randomlist.count(x) == 1:
        if x not in randomlist2:
            randomlist2.append(x)

randomlist2.sort()
print(f"Lista bez duplikatow: {randomlist2}")