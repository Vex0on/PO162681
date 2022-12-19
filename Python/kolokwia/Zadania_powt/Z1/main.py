from Z1 import Stat

def main():
    s1 = Stat([2, 3, 6])
    s2 = Stat([10, 15, 20, 25])
    print(Stat.sum_list(s1))
    print(Stat.sum_list(s2))
    print(Stat.avg_list(s1))
    print(Stat.median_list(s1))
    print(Stat.median_list(s2))
    print(Stat.min_lista(s1))
    print(Stat.max_lista(s1))


if __name__ == "__main__":
    main()
