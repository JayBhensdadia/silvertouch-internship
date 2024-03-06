
class MinLengthError(Exception):

    def __init__(self, message="list length is less than 5"):
        self.message = message
        super().__init__(self.message)

        