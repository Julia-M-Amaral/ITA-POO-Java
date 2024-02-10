package Semana2.MetodosOrientadosAObjetos.Escola;

public class Aluno {

    int bim1;
    int bim2;
    int bim3;
    int bim4;

    public Aluno(int bim1, int bim2, int bim3, int bim4) {
        this.bim1 = bim1;
        this.bim2 = bim2;
        this.bim3 = bim3;
        this.bim4 = bim4;
    }

    public int media(){
        int total = 0;
        total += this.bim1;
        total += this.bim2;
        total += this.bim3;
        total += this.bim4;
        return total / 4;
    }

    public boolean passouDeAno(){
        if(media() >= 60){
            return true;
        } else{
            return false;
        }
    }
}
