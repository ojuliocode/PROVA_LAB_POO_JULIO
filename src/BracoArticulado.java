public class BracoArticulado extends Robo{
    private int numeroDeArticulacoes;
    private Garra garra;
    private Camera camera;


    public BracoArticulado(int energia, String nome, int energiaMaxima) {
        super(energia, nome, energiaMaxima);
        this.garra = new Garra();
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
    @java.lang.Override
    public void trabalhar() {
        System.out.println("Trabalhando...");
        if(this.getEnergia() > 0) {
            super.trabalhar();
            if (this.camera != null) {
                int pecaAchada = this.camera.acharPecas();
                this.garra.agarrarPeca(pecaAchada);
            } else
                this.garra.agarrarPeca();
        }else{
            System.out.println("Você está de férias XD. Sem energia pra trabalhar");
        }

    }
}
