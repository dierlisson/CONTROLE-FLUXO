public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidException e) {
            // TODO Auto-generated catch block
            System.out.println("o cep nao corresponde com as regras de negocio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidException {
        if (cep.length() != 8) {
            throw new CepInvalidException();
        }
        return "23.765-064";
    }
}
