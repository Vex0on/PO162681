smth = {3: 'apple', 1: 'pear', 4: 'wood', 2: 'stone', 5: 'hook'}

a = dict(sorted(smth.items()))
print(a)

b = dict(sorted(smth.items(), key=lambda item: item[1]))
print(b)