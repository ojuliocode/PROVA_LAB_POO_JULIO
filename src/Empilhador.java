public class Empilhador extends Robo{
    private Pacote[] pacotes;
    private int pesoMaximo;
    private int pesoTotalAtual;

    public Empilhador(int energia, java.lang.String nome, int energiaMaxima, int pesoMaximo) {
        super(energia, nome, energiaMaxima);
        this.pacotes = new Pacote[10];
        this.pesoMaximo = pesoMaximo;
        this.pesoTotalAtual = 0;
    }

    public void adicionaPacote(int peso){
        if((pesoTotalAtual + peso) > pesoMaximo)
            System.out.println("Peso maximo atingido!");
        else {
            for (int i = 0; i < pacotes.length; i++) {
                if(pacotes[i] == null) {
                    pacotes[i] = new Pacote(peso);
                    pesoTotalAtual = pesoTotalAtual + pacotes[i].getPeso();
                    break;
                }
            }
        }
    }
    public void removePacote(int posicao){
        System.out.println("Removendo pacote na posição " + posicao);
        pesoTotalAtual = pesoTotalAtual-pacotes[posicao].getPeso();
        pacotes[posicao] = null;
    }
    public void mostraPacotes(){
        for (int i = 0; i < pacotes.length; i++) {
            if(pacotes[i] != null)
                System.out.println(pacotes[i].toString());
        }
    }
}
