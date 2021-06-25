import mysql.connector 

try:
    #creating connection object
    conn = mysql.connector.connect(
        user = 'root',
        password ='12345om',
        host = 'localhost',
        port = 3306
        # database = 'world'
    )
    #check connection
    if(conn.is_connected()):
        print("Connect...")

    cur = conn.cursor()
    cur.execute('show databases')
    print(type(cur))
    for x in cur:
        print(x)

except Exception as e:
    print("Unable to connect... (: ",e)

# finally:
# conn.close()
