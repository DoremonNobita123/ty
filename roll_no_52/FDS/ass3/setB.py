from pandas import*
from numpy import*
from sklearn import preprocessing
import scipy.stats as s
df=read_csv("file:///data/ty52/Downloads/winequality-red.csv")
print(df)
print("Rescalling Data")
print("\n\n Data scaled between 0 & 1")
data_scaler=preprocessing.MinMaxScaler(feature_range=(0,1))
data_scaled=data_scaler.fit_transform(df)
print("............")
print(data_scaled.round(2))
print("\n Standardizing data")
arr=array(df)
print(arr)
print("\n Initial mean=",s.tmean(arr).round(2))
print("\n Initial Standard devetion=",round(arr.std(),2))
x_scaled=preprocessing.scale(arr)
x_scaled.mean(axis=0)
x_scaled.std(axis=0)
print("\n standardizing data =\n",x_scaled.round(2))
print("\n scaled mean =",s.tmean(x_scaled).round(2))
print("\n Scaled Standard devetion :",round(x_scaled.std(),2))

#normailized data
dn=preprocessing.normalize(df,norm='l1')
print("\n L1 Normalized Data")
print(".....................")
print(dn.round(2))

#binarized
data_binarized=preprocessing.Binarizer(threshold=5).transform(df)
print("\n Binarized data")
print(".........")
print(data_binarized)

