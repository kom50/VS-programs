try:
    file = open('G:\VS programs\Python\File Handling\Hello.txt', 'r+')

    if file:
        print("File open success")
        file.write("Python is easy to use and learn...");
        print("Content of file ")
        print(file.tell())
        file.seek(7)
        print(file.read())
       

except Exception as e:
    print("Error : ",e)


finally:
     file.close()

print("Rest of the code (`.`)")