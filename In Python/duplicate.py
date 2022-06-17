
msg = input("Enter a message: ")
msg = msg.replace(",","")
array = msg.split()
msg = ""

for i in range(len(array)):
    for j in range(len(array)):
        if i!=j and array[i]==array[j]:
            array[j]=None
    
    if array[i]!=None:
        msg = msg+ " " + array[i]

msg = msg.strip()

print(msg)

