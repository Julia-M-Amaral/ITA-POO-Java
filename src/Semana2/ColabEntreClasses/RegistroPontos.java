package Semana2.ColabEntreClasses;

public class RegistroPontos {
    private CalculadoraBonus calculadora;

    public RegistroPontos(CalculadoraBonus totalBonus) {
        calculadora = totalBonus;
    }

    public void fazerUmComentario(Usuario usuario){
        usuario.pontos += 3 * calculadora.bonus(usuario);
    }

    public void criarUmTopico(Usuario usuario){
        usuario.pontos += 5 * calculadora.bonus(usuario);
    }

    public void darLike(Usuario usuario){
        usuario.pontos += 1 * calculadora.bonus(usuario);
    }
}
