
#q1:-
"""
import numpy as np
import matplotlib.pyplot as plt
x=np.random.rand(50)
y=np.random.rand(50)
#plt.plot(x,y)
#plt.grid(True)
#plt.hist(x,color="m",linewidth=2,edgecolor="b",bins=30,alpha=0.6)
plt.boxplot(x)
#plt.scatter(x,y,color="red",marker="*")
plt.show()
"""

#Q2:-
"""
import numpy as np
import matplotlib.pyplot as plt
x=np.random.rand(50)
arr1=np.append(x,[2,3])
plt.boxplot(arr1)
plt.show()
"""

#Q3:-
"""
import matplotlib.pyplot as plt
sub=['FDS','wts','TCS','CN']
marks=[77,89,80,92]
#plt.bar(sub,marks,color="g",width=o.5,align='center',bottom=10,edgecolor='b',linewidth=2,tick_label=sub)

plt.pie(marks,labels=sub,autopct="%1.1f%%",explode=[0.0,0.0,0.2,0.0])
plt.show() 
"""

#Q4:-
"""
from pandas import*
from numpy import*
from matplotlib.pyplot import*
df=read_csv("Iris(1).csv")
data=df['Species']
data1=df['Id']
bar(data,data1)
show()
"""
#Q5:-

from pandas import*
from numpy import*
from matplotlib.pyplot import*
df=read_csv("Iris(1).csv")
data=df["Species"]
data1=df["Id"]
pie(data1,labels=data)
show()

#6:-
"""
from pandas import*
from numpy import*
from matplotlib.pyplot import*
df=read_csv("Iris(1).csv")
data=df["Species"]
#data1=df["Id"]
hist(data,edgecolor="k",bins=1)
show()
"""






