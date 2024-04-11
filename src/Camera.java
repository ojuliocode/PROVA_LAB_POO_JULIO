public class Camera {
    private int qualidade;
    public int acharPecas(){
        int quantPecas = (int)((Math.random()*9)+1);
        return quantPecas;
    }

    public Camera(int qualidade) {
        this.qualidade = qualidade;
    }
}
