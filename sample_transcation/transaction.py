import matplotlib.pyplot as plt
import csv

x = []
y = []

with open("sample_transcation/BTC_03-01-2020_04-13-2020.csv", "r") as csvfile:
      plots = csv.reader(csvfile, delimiter=",")
      for row in plots:
            x.append(int(row[0]))
            y.append(int(row[1]))

# print(csvfile)

plt.plot(x, y, marker="o")
plt.title("My Bitcoin Transactions 2020")
plt.xlabel("x")
plt.ylabel("y")
plt.show()