class SingletonMeta(type):
    _instances = {}
    def __call__(cls, *args, **kwargs):
        if cls not in cls._instances:
            cls._instances[cls] = super(SingletonMeta, cls).__call__(*args, **kwargs)
        return cls._instances[cls]

class Singleton(metaclass = SingletonMeta):
    def __init__(self):
        self.declared_vars = {}

    def declare_var(self, var_name):
        if self.declared_vars.get(var_name):
            raise Exception("Variable already declared")
        else:
            self.declared_vars[var_name] = False
