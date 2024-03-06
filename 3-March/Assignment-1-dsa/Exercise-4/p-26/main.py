class MyClass:
    global_var = "I am a global variable"

    def __init__(self):
        self.instance_var = "I am an instance variable"

    def my_method(self):
        local_var = "I am a local variable"

        global_attributes = globals()
        print("Global attributes:", global_attributes)

        local_attributes = locals()
        print("Local attributes:", local_attributes)

obj = MyClass()

obj.my_method()