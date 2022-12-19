from ZAD_4 import Stat


def main():
    s1 = Stat([2, 5])
    s2 = Stat([3, 4, 5, 6])
    print(Stat.fun_min(s1))
    print(Stat.fun_max(s1))
    print(Stat.fun_sum(s1))

    print()
    print(Stat.fun_min(s2))
    print(Stat.fun_max(s2))
    print(Stat.fun_sum(s2))


if __name__ == "__main__":
    main()
