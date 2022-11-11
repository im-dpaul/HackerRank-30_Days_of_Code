class Person:
	def __init__(self, firstName, lastName, idNumber):
		self.firstName = firstName
		self.lastName = lastName
		self.idNumber = idNumber
	def printPerson(self):
		print("Name:", self.lastName + ",", self.firstName)
		print("ID:", self.idNumber)

class Student(Person):
    def __init__(self, firstName, lastName, idNumber, scores):
        self.firstName = firstName
        self.lastName = lastName
        self.idNumber = idNumber
        self.scores = scores

    def calculate(self):
 
        avgScores = sum(scores) // numScores
        
        if avgScores in range(90, 101):
            grade = 'O'
        
        elif avgScores in range(80, 91):
            grade = 'E'
        
        elif avgScores in range(70, 81):
            grade = 'A'
        
        elif avgScores in range(55, 71):
            grade = 'P'
            
        elif avgScores in range(40, 56):
            grade = 'D'
            
        elif avgScores in range(0, 41):
            grade = 'T'
            
        else:
            grade = 'Invalid grade'
            
        return grade

line = input().split()
firstName = line[0]
lastName = line[1]
idNum = line[2]
numScores = int(input()) # not needed for Python
scores = list( map(int, input().split()) )
s = Student(firstName, lastName, idNum, scores)
s.printPerson()
print("Grade:", s.calculate())