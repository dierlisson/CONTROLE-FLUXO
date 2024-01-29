public class ResultadoEscolar {
    public static void main(String[] args) {
        // int nota = 7;
        // if (nota>=7) {
        //     System.out.println("Aprovado");
        // }
        // else if (5 <= nota && nota < 7) {
        //     System.out.println("Prova Recuperação");
        // }
        // else{
        //     System.out.println("Reprovado");
        // }
        //condição ternária
        // int nota = 5;
        // String resultado = nota>=7 ? "Aprovado" : "Reprovado";
        // System.out.println("resultado: " + resultado);
        //condição ternária elseif
        int nota=7;
        String resultado = nota>=7 ? "Aprovado" : nota>=5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
