import csv

with open('sample_transcation/BTC_03-01-2020_04-13-2020.csv') as csvfile:
    readCSV = csv.reader(csvfile, delimiter=',')
    for row in readCSV:
        print(row)
        print(row[0],row[1],row[2],)