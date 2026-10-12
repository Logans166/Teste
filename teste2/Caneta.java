package teste2;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status() {
        System.out.println("Uma caneta" + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Modelo: " + this.modelo);
    }

    void rabiscar() {

    }

    void tampar() {

    }

    void destampar() {

    }
}