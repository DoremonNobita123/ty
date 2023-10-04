#1
import pandas as pd
import matplotlib.pyplot as plt
df=pd.DataFrame(columns=['name','age','percentage'])
df.loc[0]=['aman',22,70]
df.loc[1]=['Raj',23,80]
df.loc[2]=['ram',19,60]
df.loc[3]=['anikat',25,78]
df.loc[4]=['rahul',15,71]
df.loc[5]=['rohan',30,72]
df.loc[6]=['eajesh',29,73]
df.loc[7]=['pandey',28,74]
df.loc[8]=['abhishak',27,77]
df.loc[9]=['roshan',26,89]
print("Data frame is :",df)

#2
print("shape :",df.shape)
print("Data type :",df.dtypes)
print("feature names :",list(df.columns))
print("Discription of data :",df.describe())

#3
print("Statisticals details :",df.describe())

#4
print("duplicate value and missing value ")
df.loc[10]=['om',31,69]
df.loc[11]=['omkar',21,68]
df.loc[12]=['nikita',18,71]
df.loc[13]=['roshani',20,65]
df.loc[14]=['ajay',11,59]
df["newcolumn"]=None
print(df)

#5
print("Observation :",df.info())
print("missing values :",df.isnull())
print("DUPLICATE VALUSE:",df.duplicated())

#6drop a column from dataframe 
df.drop(columns='newcolumn',axis=1,inplace=True)
print("Drop a column from data frame :")
print(df)

#7
df.plot(x="name",y="percentage")
plt.show()

#8
df.plot(Kind="scatter",x="NAME",Y="percentage")
df.plot.scatter(x="NAME",y="percentage")
plt.show()
