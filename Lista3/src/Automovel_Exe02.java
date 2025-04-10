public class Automovel_Exe02 {
    private double distancia;
    private double combustivel;

    public Automovel_Exe02(double distancia, double combustivel) {
        this.distancia = distancia;
        this.combustivel = combustivel;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public double getDistancia() {
        return distancia;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public double calcularConsumo(){
        return distancia / combustivel;
    }
}
