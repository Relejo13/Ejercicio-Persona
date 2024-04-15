class Persona:
    def __init__(self, curp, nombre, apellido, edad, altura, peso, domicilio, genero, telefono, correo):
        self.curp = curp
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
        self.altura = altura
        self.peso = peso
        self.domicilio = domicilio
        self.genero = genero
        self.telefono = telefono
        self.correo = correo

    def imprimir_datos(self):
        print("CURP:", self.curp)
        print("Nombre:", self.nombre)
        print("Apellido:", self.apellido)
        print("Edad:", self.edad)
        print("Altura:", self.altura)
        print("Peso:", self.peso)
        print("Domicilio:", self.domicilio)
        print("Género:", self.genero)
        print("Teléfono:", self.telefono)
        print("Correo:", self.correo)

# Prueba de la clase Persona
if __name__ == "__main__":
    persona = Persona("ABC123456DEF789GH", "Juan", "Pérez", 30, 1.75, 70.5, "Calle 123", 'M', "1234567890", "juan@example.com")
    persona.imprimir_datos()
