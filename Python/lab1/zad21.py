def del_common(tab1, tab2, tab3):
    for i in tab1[:]:
        if i in tab2:
            tab1.remove(i)
            tab2.remove(i)
    for j in tab1[:]:
        if j in tab3:
            tab1.remove(j)
            tab3.remove(j)

    return tab1


def tab_create(number, tab):
    tab.append(number)
    for i in tab:
        result = i
        result += 1
        if result <= 1000:
            tab.append(result)
    return tab


def triple_mult_tab(number, pow1, tab):
    tab.append(number)
    for i in tab:
        result = i
        result *= pow1
        if result <= 1000:
            tab.append(result)
    return tab


tab, tab2, tab3 = [], [], []
print(del_common(tab_create(2, tab), triple_mult_tab(4, 2, tab2), triple_mult_tab(9, 3, tab3)))
