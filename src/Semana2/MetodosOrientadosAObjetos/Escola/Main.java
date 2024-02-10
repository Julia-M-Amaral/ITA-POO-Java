package Semana2.MetodosOrientadosAObjetos.Escola;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(70,30,100,90);

        System.out.println(a1.media());
        System.out.println(a1.passouDeAno());
    }
}
