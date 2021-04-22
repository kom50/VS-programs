try:
    print(b)
    a = 5 / 0
    print("Inside try block")

except (Exception, ZeroDivisionError) as e:
    print('Error : ',e)
else:
    print("Exception not occured")

finally:
    print("This block is always execute while exception ccured or not.")

print("Rest of the code.");