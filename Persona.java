
import java.util.Calendar;

// Declaración de datos de Persona
public class Persona {

    private String nombre;
    private String DNI;
    private String direccion;
    private String localidad;
    private String provincia;
    private String codigoPostal;
    private String telefono;
    private Calendar fechaAlta;
    private Calendar fechaNacimiento;
    private char sexo;

    public Persona(String nombre, String DNI, String direccion, String localidad, String provincia, String codigoPostal, String telefono, Calendar fechaAlta, Calendar fechaNacimiento) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.direccion = direccion;
        this.localidad = localidad;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
        this.telefono = telefono;
        this.fechaAlta = fechaAlta;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Me ayudó Miguel
    public static boolean validarTelefono(String telefono) {
        // Debe empezar por 6, 8 o 9 y tener 9 dígitos
        return telefono.matches("(^[689][0-9]{8}$)");
    }

    // Validar DNI
    public static boolean validarDNI(String DNI) {
        // del 0 al 9 7 u 8 numeros de la A la z mayus & minus
        return DNI.matches("[0-9]{7,8}[A-Z a-z]");
    }
    
    // Validar no más de 99 años // https://gist.github.com/javerosanonimos/3640161f18f8527bcf5088414f10bc91
    /*
    public static int validarFecha(fechaNacimiento){
    Calendar fechaActual = Calendar.getInstance();
    int año = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);    
    return año;
    } */
    
    public static int getEdad(Calendar fechaNacimiento){

       // Donde se guarda la fecha actual 
       Calendar fechaActual = Calendar.getInstance();
       
       //Se restan la fecha actual y la fecha de nacimiento
       int año = fechaActual.get(Calendar.YEAR)- fechaNacimiento.get(Calendar.YEAR);
       int mes = fechaActual.get(Calendar.MONTH)- fechaNacimiento.get(Calendar.MONTH);
       int dia = fechaActual.get(Calendar.DATE)- fechaNacimiento.get(Calendar.DATE);
       
       //Se ajusta el año dependiendo el mes y el día
       if(mes<0 || (mes==0 && dia<0)){
           año--;
       }
       
       //Regresa la edad en base a la fecha de nacimiento
       return año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        if (!validarDNI(DNI)) {
            throw new IllegalArgumentException("DNI incorrecto");
        }
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getTelefono() {
        return telefono;
    }
    // Si es distinto de validarTelefono el String telefono lanza una excepcion

    public void setTelefono(String telefono) {
        if (!validarTelefono(telefono)) {
            throw new IllegalArgumentException("Teléfono incorrecto");
        }
        this.telefono = telefono;
    }

    public Calendar getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Calendar fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento; 
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
        /* if (sexo.equals("m") || sexo.equals("M")) {
        sexo = "M";
        }

        También se puede poner:

        if (sexo.equalsIgnoreCase("m")) {
            sexo = "M";
        }*/
    }

}
