public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 7;
        if (nota>=7) {
            System.out.println("Aprovado");
        }
        else if (5 <= nota && nota < 7) {
            System.out.println("Prova Recuperação");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}
