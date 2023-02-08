principal = float(input('Enter the principle amount: '))
time = float(input('Enter the time: '))
rate = float(input('Enter the rate: '))
simple_interest = (principal*time*rate)/100
Amount =principal*(pow((1+rate/100),time))
Compound_Intrest=Amount-principal
print("Simple interest is:", simple_interest)
print("Compound interest is:", Compound_Intrest)