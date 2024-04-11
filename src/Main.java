public class Main {
    public static void main(String[] args) {
        Camera cam = new Camera(12);
        BracoArticulado braco = new BracoArticulado(
                450, "Articulado!", 1000
        );
        braco.setCamera(cam);
        Empilhador empilha = new Empilhador(600, "Pilhadeira", 1200, 20);
        empilha.adicionaPacote(19);
        empilha.removePacote(0);
        empilha.mostraPacotes();
        System.out.println(empilha.toString());
        System.out.println(braco.toString());
        braco.trocarEnergia(empilha);
        System.out.println(empilha.toString());
        System.out.println(braco.toString());
        braco.trocarEnergia(empilha);
        braco.trabalhar();
        braco.recarregar(200);
        braco.trabalhar();
        empilha.adicionaPacote(10);
        empilha.adicionaPacote(10);
        System.out.println(empilha.toString());
        System.out.println(braco.toString());
        empilha.recarregar(3000);
        empilha.adicionaPacote(10);
        System.out.println(empilha.toString());

        System.out.println("O total de Robôs criados foi: ");
        System.out.println(Robo.getTotalDeRobos());
    }

}