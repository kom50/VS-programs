import mysql.connector as conne

try:
    con = conne.connect(
        user = 'root',
        password = '12345om'
    )

    if con.is_connected() :
        print( 'connect')

    # create a table
    sql = '''CREATE TABLE student ( 
        id INTAUTO INCREAMENT
    ) '''
    con.close()
except Exception as e:
    print('Unable to connect ', e)
