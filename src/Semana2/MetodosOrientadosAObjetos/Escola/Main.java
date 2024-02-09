package Semana2.MetodosOrientadosAObjetos.Escola;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.bim1 = 70;
        a1.bim2 = 30;
        a1.bim3 = 100;
        a1.bim4 = 90;

        System.out.println(a1.media());
        System.out.println(a1.passouDeAno());
    }
}
