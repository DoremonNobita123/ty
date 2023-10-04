#12
"""
from pandas import*
from numpy import*
from matplotlib.pyplot import*
df=read_csv("Iris(1).csv")
print(df)
data=df["SepalLengthCm"]
data1=df["SepalWidthCm"]
scatter(data,data1)
show()
"""
"""
#1
from pandas import*
from numpy import*
from matplotlib.pyplot import*
df=read_csv("Iris(1).csv")
print(df)
data=df["PetalLengthCm"]
data1=df["PetalWidthCm"]
scatter(data,data1)
show()

"""
#3

from pandas import*
import seaborn as sns
from numpy import*
from matplotlib.pyplot import*
df=read_csv("Iris(1).csv")
print(df)
sns.boxplot(x=df["Species"],y=df["SepalLengthCm"],palette="Blues")
show()

