public class Persona {
    private String curp;
    private String nombre;
    private String apellido;
    private int edad;
    private double altura;
    private double peso;
    private String domicilio;
    private char genero;
    private String telefono;
    private String correo;

    // Constructor
    public Persona(String curp, String nombre, String apellido, int edad, double altura, double peso, String domicilio, char genero, String telefono, String correo) {
        this.curp = curp;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.domicilio = domicilio;
        this.genero = genero;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Getters y Setters
    // Aquí debes agregar los métodos para acceder y modificar los atributos de la clase

    // Método para imprimir los datos de la persona
    public void imprimirDatos() {
        System.out.println("CURP: " + curp);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("Género: " + genero);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Correo: " + correo);
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        Persona persona = new Persona("ABC123456DEF789GH", "Juan", "Pérez", 30, 1.75, 70.5, "Calle 123", 'M', "1234567890", "juan@example.com");
        persona.imprimirDatos();
    }
}
