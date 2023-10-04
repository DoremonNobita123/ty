import pandas as pd
d=pd.read_csv("data.csv")
print("\n")
print(d)
print(d.info())
print(d.shape)
print("Display 3 rows from table :",d.head(3))

#2
"""
print(d.isnull())
print("")
m=d['Age'].mean()
d['Age'].fillna(m,inplace=True)
print(d)
#3


from sklearn.preprocessing import LabelEncoder
labelencoder = LabelEncoder()
d['Country']=labelencoder.fit_transform(d['Country'])
"""
#2
#handling missing value
imputer =Simplelmputer
