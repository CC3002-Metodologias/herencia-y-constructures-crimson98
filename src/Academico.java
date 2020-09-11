public class Academico extends Persona {

    Academico(String n, String oc, int ed) {
        super(n, oc, ed);
    }

    public void comer() {
        super.comer();
    }

    @Override
    public void dormir() {
        System.out.println("ZzZZzZz");
    }

    @Override
    public String hacerLoSuyo() {
        return super.hacerLoSuyo() + "Aprender Zoom" ;
    }

    public String PublicarPaper(Boolean x) {
        if (x == Boolean.TRUE) {
            return "Paper publicado";
        }
        else {
            return "espera tantito un tiempo mas en el horno y listo";
        }
    }
}
