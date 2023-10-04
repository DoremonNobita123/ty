#x-special/nautilus-clipboard
#copy
import pandas as pd
import matplotlib.pyplot as plt
df=pd.read_csv("file:///data/ty52/roll_no_52/FDS/ass1/SOCR-HeightWeight.csv")
df.head(10);
df.tail(10);
df.sample(20);
print(df);
print("shape ",df.shape)
print("size ",df.size)
print("shape ",df.dtypes)
print("Statisticals details :",df.describe())
print("Observation :",df.info())
print("missing values :",df.isnull())
print("nan VALUSE:",df.notnull())
#height=10;
#weight=25;

df["BMI"]=(df['Weight(Pounds)']/(df['Height(Inches)']**2));
print(df)

print("Maximum BMI ",df.BMI.max())
print("Minimum BMI ",df.BMI.min())
df.plot.scatter(x='Height(Inches)',y='Weight(Pounds)',color="red")
plt.show()
