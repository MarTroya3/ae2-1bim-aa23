public class Universidad {
    //atributos de la clase

    private String Nombre;
    private int NumeroProfesores;
    private int NumeroAlumnos;

  
    //Constructores 
    public Universidad (String UCE, int 500, int 50000) {
    }

    public Universidad(String Nombre, int NumeroProfesores, int NumeroAlumnos) {
        this.Nombre = Nombre;
        this.NumeroProfesores = NumeroProfesores;
        this.NumeroAlumnos = NumeroAlumnos;
    }
//Métodos

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNumeroProfesores() {
        return NumeroProfesores;
    }

    public void setNumeroProfesores(int NumeroProfesores) {
        this.NumeroProfesores = NumeroProfesores;
    }

    public int getNumeroAlumnos() {
        return NumeroAlumnos;
    }

    public void setNumeroAlumnos(int NumeroAlumnos) {
        this.NumeroAlumnos = NumeroAlumnos;
    }

    public void selecciondeuniversidad() {
        System.out.println("La Universidad que solicitó es: " + this.Nombre);
    }

//CARRERA
   
public class Carrera {
    //atributos de la clase

    private String NombreCarrera;
    private int NumeroProfesores;
    private int NumeroAlumnos;

  
    //Constructores 
    public Carrera (String Medicina, int 100, int 10000) {
    }

    public Carrera (String NombreCarrera, int NumeroProfesores, int NumeroAlumnos) {
        this.NombreCarrera = NombreCarrera;
        this.NumeroProfesores = NumeroProfesores;
        this.NumeroAlumnos = NumeroAlumnos;
    }
//Métodos

    public String getNombreCarrera() {
        return NombreCarrera;
    }

    public void setNombreCarrera(String NombreCarrera) {
        this.NombreCarrera = NombreCarrera;
    }

    public String getNumeroProfesores() {
        return NumeroProfesores;
    }

    public void setNumeroProfesores(int NumeroProfesores) {
        this.NumeroProfesores = NumeroProfesores;
    }

    public int getNumeroAlumnos() {
        return NumeroAlumnos;
    }

    public void setNumeroAlumnos(int NumeroAlumnos) {
        this.NumeroAlumnos = NumeroAlumnos;
    }

    public void selecciondecarrera() {
        System.out.println("La carrera que solicitó es: " + this.NombreCarrera);
    }
