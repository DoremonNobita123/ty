#1
"""
import scipy.stats as s
import numpy as np
first=np.array([[0,1],[2,3]])
print(first)
print("Maximum value of the above flattened array :",first.max())
print("Minumum value of the above flattened array :",first.min())
"""
#2
"""
import numpy as np
point1=np.array([1,2,3])
point2=np.array([1,1,1])
dist=np.linalg.norm(point1-point2)
print(dist)
"""
#3
"""
import pandas as pd
from scipy.stats import iqr
import numpy as np
d={"score":[80,63,92,75],"Name":["manas","aman","sawan","raj"]}
df=pd.DataFrame(d)
print(df)
r=max(df["score"])-min(df["score"])
print("value of range is distrubtion is :",r)
col=df["score"]
mean_of_score=col.mean()
print("average iof score:",mean_of_score)
q3,q1=np.percentile(col,[72,25])
iqrvalue=q3-q1
print("inter quartile range:",iqrvalue)
"""
#4
"""
def distancesum(x,y,n):
sum=0
for i in range(n):
    for j in range(i+1,n):
        sum+=(abs(x[i])-x[j]+abs(y[i]-y[j]))
return sum
x=[-1,1,3,2]
y=[5,6,5,3]
n=len(x)
print("sum of manchattan ",distanceSum(x,y,n))
"""

#5

import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
nums=np.array([0.5,0.7,1,1.3,2.1])
bins=np.array([0,1,2,3])
print("nums:",nums)
print("bins:",bins)

plt.hist(nums,bins)
plt.show()

#6
"""
import numpy as np
import scipy.stats as s
import pandas as pd
d={"Name":["manas","aman","sawan","raj","om"],"percentage":[80,70,90,89,92],"age":[19,20,19,21,20]}
df=pd.DataFrame(d)
print(df)
print("Average age of student :",s.tmean(df["age"]).round(2))
print("Average age of student :",s.tmean(df["percentage"]).round(2))
print(df.describe())
"""
