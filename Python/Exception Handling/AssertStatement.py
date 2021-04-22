
a = 50
try:
    assert a != 150, 'Error : a is equal to 50'

except Exception as e:
    print("-> ", e )
    pass

print('No Any Warnning')