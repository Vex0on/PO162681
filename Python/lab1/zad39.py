from typing import Dict

di1: Dict[str, int] = {"c": 15, "a": 29, "b": 7, "d": 18}

print(dict(sorted(di1.items())))
di1 = dict(sorted(di1.items()))
di1_sorted = sorted(di1, key=di1.get)
di2: Dict[str, int] = {}
for i in di1_sorted:
    di2[i] = di1[i]

di1 = di2
print(di1)
