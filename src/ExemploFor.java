import java.util.concurrent.ForkJoinPool;

public class ExemploFor {
    public static void main(String[] args) {
        // for(int carneirinhos =1; carneirinhos<=20; carneirinhos++){
        //     System.out.println("contando carneirinhos: " + carneirinhos);
        // }
        // System.out.println("Joãozinho dormiu");

        String alunos[] ={"FELIPE", "JONAS","JULIA", "MARCOS"};

        for (int i = 0; i < alunos.length; i++){
            System.out.println("O aluno no indice i="+ i + " é " + alunos[i]);
        }
    }
}
