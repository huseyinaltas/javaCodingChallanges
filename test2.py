class Person:
    def __init__(self, name, age):
        self._name = name
        self._age = age
    
    @property
    def name(self):
        return self._name
    
    @name.setter
    def name(self,name):
        self._name = name
        
    @property
    def age(self):
        return self._age
    
    @age.setter
    def age(self,age):
        if not isinstance(age,int):
            raise ValueError("Name must be a string.")
        self._age = age
        

# Usage
person = Person("Alice", 30)

# Using getter and setter with property
print(person.name)  # Output: Alice
person.age = 35
print(person.age)  # Output: 35
