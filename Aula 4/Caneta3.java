package teste2;
public class Caneta3 {
    public String modelo;
    private float ponta;
    private boolean tampada;

    public Caneta3(String m, String c, float p) { // este é o metodo construtor
        this.tampar();
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
    }

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampar = false;
    }

    public void status() {
        System.out.println("Sobre a Caneta");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.ponta);
        System.out.println("cor" + this.cor);
        System.out.println("tampada" + this.tampada);
    }
}