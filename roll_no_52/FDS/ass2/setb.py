#1
import pandas as pd
from matplotlib.pyplot import*
df=pd.read_csv("file:///data/ty52/Downloads/Iris.csv")
print(df)

#1

print("max of sapellength :",max(df['SepallengthCm']))
print("max of sapellength :",min(df['SepallengthCm']))
print("max of Petalwidth :",max(df['Petalwidth']))
print("max of Petalwidth :",min(df['Petalwidth']))

#2
print("number of record of distinct value of class attributes :",df['species'].value_count())

#3

