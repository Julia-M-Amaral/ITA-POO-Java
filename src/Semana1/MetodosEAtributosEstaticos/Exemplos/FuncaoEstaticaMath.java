package Semana1.MetodosEAtributosEstaticos.Exemplos;

/*import p usar diretamente os métodos e constantes da classe Math sem precisar prefixá-los com Math.*/
import static java.lang.Math.*;

public class FuncaoEstaticaMath {

    private void mostrarMaiorNum(int a, int b){
        int max;
        int resultado =  max(a,b);
        System.out.println(resultado);

    }

    public static void main(String[] args) {
        FuncaoEstaticaMath f = new FuncaoEstaticaMath();
        f.mostrarMaiorNum(1,3);
    }
}
