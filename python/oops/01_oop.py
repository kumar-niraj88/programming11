class Car:
    total_car = 0
    def __init__(self , brand , model):
        self.__brand = brand
        self.model= model
        Car.total_car +=1
    def get_brand(self):
        return self.__brand + "!"
    
    def full_name(self):
        return f"{self.__brand} {self.model}"

class ElectricCar(Car):
    def __init__(self, brand, model , battery_size):
        super().__init__(brand, model)
        self.battery_size =battery_size

my_Electric_Car = ElectricCar("tesla" , "model s" , "85kWh")

# print(my_Electric_Car.brand)
# print(my_Electric_Car.get_brand()) #tesla!

# print(my_Electric_Car.model)
# print(my_Electric_Car.full_name())


# my_car1 = Car("toyota" ,"fortuner") 
# print(my_car1.brand)
# print(my_car1.model)
# print(my_car1.full_name())

# my_car21 = Car("tata" ,"safari") 
# print(my_car21.brand)
# print(my_car21.model)
# print(my_car21.full_name())

class Battery :
    def battery_info(self):
        return "this is battery information"

class Engine:
    def engine_info(self):
        return "this is engine class"
    

class ElectricticCarNew(Car, Battery ,Engine):
    pass

my_new_ele_car = ElectricticCarNew("tesla" , "model s")

print(my_new_ele_car.battery_info())
print(my_new_ele_car.engine_info())
print(my_new_ele_car.model)
print(my_new_ele_car.get_brand())
