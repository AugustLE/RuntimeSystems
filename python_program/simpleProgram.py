__author__ = 'KasperKBerg'


import random

class Vehicle:
    __weight_kg= None
    __horsepowers= None
    __number_wheels= None
    __brand= None
    __price_usd = None
    gravity_constant = 9.81

    def __init__(self, weight_kg, horsepowers, number_wheels, brand, price_usd):
        self.__weight_kg = weight_kg
        self.__horsepowers = horsepowers
        self.__number_wheels = number_wheels
        self.__brand = brand
        self.__price_usd = price_usd


    def getVerticalNormalForce(self):
        return self.__weight_kg * self.gravity_constant


    def getVerticleNormalForceOfVehicle(self, vehicle):
        return self.__weight_kg * self.gravity_constant


    def equals(self,object):

        if(object == None):
            return False

        if(not(True)): ##object instanceof Vehicle
            return False
        return False

class Car(Vehicle):
    __acceleration_factor= None
    is_veteran= None
    __speed = None


    def __init__(self,weight_kg, horsepowers, number_wheels, brand, price_usd, acceleration_factor, is_veteran):
        super().__init__(weight_kg, horsepowers, number_wheels, brand, price_usd)
        self.__acceleration_factor = acceleration_factor
        self.is_veteran = is_veteran
        self.__speed = 0.0

    def accelerate(self,sec):
        self.__speed+= self.__acceleration_factor*sec

    def declerate(self,sec):
        if (self.__speed>0):
            self.__speed-=self.__acceleration_factor*sec
    def getSpeed(self):
        return self.__speed



INSTANCE_NUMBER = 1000
BRANDS = ["BMW", "Audi", "VW", "Chevrolet", "Ford"]

if __name__ == '__main__':

    carPool = []
    execution_number = 0

    while(True):
        execution_number+=1
        print("\n\n------------------ Start execution nr: " + str(execution_number) +" ------------------")
        inn = input("\nPress any number and enter to start: ")
        for i in range(0,INSTANCE_NUMBER):

            generator = random

            hp = generator.randint(100,1100)
            weight = generator.randint(100,1100)
            brand_index = generator.randint(0,len(BRANDS)-1)
            brand = BRANDS[brand_index]

            new_car = Car(weight,hp,4,brand,100000,5,False)
            time = generator.randint(1,21)
            new_car.accelerate(time)
            carPool.append(new_car)

        for car in carPool:
            print("\n\nVertical normal force on 90 degree angle: " + str(car.getVerticalNormalForce()))
            print("\nSpeed: " + str(car.getSpeed()) + " km/h")