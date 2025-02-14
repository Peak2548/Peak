mixue , pay = 275 , 500
result = int (pay - mixue)

Cnt100 = result//100
Cnt10 = (result - Cnt100*100)//10
Cnt1 = ((result - Cnt100*100 - Cnt10*10)//1)
 
torn = f"Bank Roi = {Cnt100} \nCoin Sib = {Cnt10}\nCoin Nueng = {Cnt1}"
print(torn)