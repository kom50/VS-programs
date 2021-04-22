class Student:
    id = 121
    name = 'prakash'
    email = 'p12@gmail.com'
    #defining a function
    def getInfo(self):
        print(self.id, self.name, self.email)

s = Student()
s.getInfo()

delattr(Student, 'name')
# s.getInfo() #error : throws an error