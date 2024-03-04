from vehicle import Vehicle

class Car(Vehicle):

    def __init__(self):
        print("car created")

    def __del__(self):
        print("car deleted")

    def drive():
        print("car is being driven")

    def honk():
        print("peep peep")

