# Definicao de todas as exceptions utilizadas pelo compilador


class IsiException(Exception):

    def __init__(self, message):
        super().__init__(message)



class IsiSemanticException(IsiException):

    def __init__(self, message):
        super().__init__(message)

