public class Estudiante extends Persona {

    Estudiante(String n, String oc, int ed) {
        super(n, oc, ed);
    }

    @Override
    public void comer() {
        System.out.println("Completo a 500 ke oferton xdxdxd");
    }


    public void dormir(int n) {
        if (n<6) {
            System.out.println("ZzzzZz");
        }
        if (n>=24) {
            System.out.println("No estoy muerto we");
        }
        else {
            String f;
            f = "z".repeat(n);
            System.out.println(f);
        }
    }

    @Override
    public String hacerLoSuyo() {
        return super.hacerLoSuyo() + "ver anime y netflics";
    }
}
