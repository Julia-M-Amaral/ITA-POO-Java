package Semana2.ColabEntreClasses;

public class Main {
    public static void main(String[] args) {

        Usuario u = new Usuario();
        u.nome = "Julia";
        u.vip = false;

        CalculadoraBonus cb = new CalculadoraBonus();

        RegistroPontos rp = new RegistroPontos(cb);

        rp.fazerUmComentario(u);
        System.out.println("Pontos após fazer um comentário: " + u.pontos);

        rp.criarUmTopico(u);
        System.out.println("Pontos após criar um tópico: " + u.pontos);

        rp.darLike(u);
        System.out.println("Pontos após dar um like: " + u.pontos);
    }
}