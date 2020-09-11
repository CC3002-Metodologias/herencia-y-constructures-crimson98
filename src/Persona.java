public class Persona {
    protected String nombre;
    protected String ocupacion;
    protected int edad;

    public Persona(String n, String oc, int ed) {
        this.nombre = n;
        this.ocupacion = oc;
        this.edad = ed;
    }

    public void comer() {
        System.out.println("Ñom Ñom comida casera");
    }

    public void dormir() {
        System.out.println("ZzzZzZzZ");
    }

    public String hacerLoSuyo() {
        return "Hacer Cuarentena";
    }
}
