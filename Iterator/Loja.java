public class Censo {

    public static Integer contarClienteAtivosLoja(Loja loja) {
        int quantidade = 0;
        for (Cliente Cliente : loja) {
            if (Cliente.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalClienteloja(Loja loja) {
        int quantidade = 0;
        for (Iterator a = loja.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
