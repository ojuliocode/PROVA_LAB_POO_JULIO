public class Robo {
    private int energia;
    private String nome;
    private static int totalDeRobos;
    private int energiaMaxima;

    public Robo(int energia, String nome, int energiaMaxima) {
        totalDeRobos++;
        this.energia = energia;
        this.nome = nome;
        this.energiaMaxima = energiaMaxima;
    }

    public void trabalhar(){
        this.energia--;
    }

    public int getEnergia() {
        return energia;
    }

    public int getEnergiaMaxima() {
        return energiaMaxima;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public static int getTotalDeRobos() {
        return totalDeRobos;
    }

    public void trocarEnergia(Robo roboAlvo){
        int energiaADiminuir = this.energia;
        if(energiaADiminuir == 0)
            System.out.println("Energia 0");
        for (int i = 0; i < energiaADiminuir; i++) {
            if(this.energia > 0 && roboAlvo.getEnergia() < roboAlvo.getEnergiaMaxima()){
                this.energia--;
                int newEnergia = roboAlvo.getEnergia() + 1;
                roboAlvo.setEnergia(newEnergia);
            }else{
                System.out.println("Limite de energia atingido :((");
                break;
            }
        }
    }

    public void recarregar(int horas){
        System.out.println("Recarregando...");
        for (int i = 0; i < horas; i++) {
            if(this.energia >= this.energiaMaxima)
                break;
            this.energia++;
        }
        System.out.println("Recarregado!");
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Robo{" +
                "energia=" + energia +
                ", nome=" + nome +
                ", energiaMaxima=" + energiaMaxima +
                '}';
    }
}
