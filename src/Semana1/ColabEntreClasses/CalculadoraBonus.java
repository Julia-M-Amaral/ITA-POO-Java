package Semana1.ColabEntreClasses;

public class CalculadoraBonus {
    public int bonus(Usuario usuario){
        int multiplicador=2;
        if(usuario.vip){
            multiplicador = 5;
        }
        return multiplicador;
    }

}
