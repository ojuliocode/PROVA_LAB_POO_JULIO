public class Garra {
    private int pressao;

    public Garra() {

    }

    public void agarrarPeca(){
        System.out.println("Agarrando a peça padrão");
    }

    public void agarrarPeca(int posicao){
        System.out.println("Agarrando a peça na posição "+ posicao);
    }
}
