package Semana1.MetodosEAtributosEstaticos.Exemplos;

/* Esse exemplo é sobre atributo estático.
    A classe gato possui um atributo que é uma informação pertinente a classe GATO, não de suas instâncias, os gatos.
    Então ao usar o static informa que essa informação é da classe como um todo, porque nao varia de objeto para objeto
 */
public class Gatos {

    static int totalGatos = 0;
    public Gatos(){
        totalGatos++;
    }

    private void mostrarTotalGatos(){
        System.out.println(totalGatos);
    }


    public static void main(String[] args) {
        Gatos frajola = new Gatos();
        Gatos tigrado = new Gatos();

        frajola.mostrarTotalGatos();
        tigrado.mostrarTotalGatos();

    }

}
