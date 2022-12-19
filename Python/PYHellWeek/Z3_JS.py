import csv

with open('files/scores.csv') as csvf:
    reader = csv.DictReader(csvf)
    darekScore = 0
    edekScore = 0
    zdzisiekScore = 0
    for row in reader:
        print(row)
        if row['Zdzisiek'] < row['Edek'] < row['Darek']:
            darekScore += 3
            zdzisiekScore -= 1

        elif row['Edek'] < row['Zdzisiek'] < row['Darek']:
            darekScore += 3
            edekScore -= 1

        elif row['Zdzisiek'] > row['Darek'] > row['Edek'] and row['Edek'] < row['Zdzisiek']:
            zdzisiekScore += 3
            edekScore -= 1

        elif row['Darek'] < row['Edek'] < row['Zdzisiek']:
            zdzisiekScore += 3
            darekScore -= 1

        elif row['Darek'] < row['Zdzisiek'] < row['Edek']:
            edekScore += 3
            darekScore -= 1

        elif row['Zdzisiek'] < row['Darek'] < row['Edek']:
            edekScore += 3
            zdzisiekScore -= 1

        elif row['Darek'] == row['Zdzisiek'] < row['Edek']:
            edekScore += 3
            zdzisiekScore += 0
            darekScore += 0

        else:
            edekScore += 0
            zdzisiekScore += 0
            darekScore += 0

        print(f'Darek: {darekScore}')
        print(f'Zdzisiek: {zdzisiekScore}')
        print(f'Edek: {edekScore}')


import csv
#
# file = open("files/scores.csv")
# reader = csv.reader(file)
# header = [next(reader)]
# points = {header[0][0]: 0, header[0][1]: 0, header[0][2]: 0}
# file.close()
# file = open("files/scores.csv")
# dict_reader = csv.DictReader(file)
# for row in dict_reader:
#     winner = max(row, key=row.get)
#     loser = min(row, key=row.get)
#     print(row)
#     if winner != loser:
#         points[winner] += 3
#         points[loser] -= 1
#
# print()
# print(points)
