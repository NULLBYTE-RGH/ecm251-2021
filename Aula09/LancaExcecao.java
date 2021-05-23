public class LancaExcecao {
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("Fim do main");
    }
    private static void metodo1() {
        System.out.println("Inicio do metodo1");
        //try {
            metodo2();
//        }
//        catch (ChegueiNoFinalDoArray e){
//            System.out.println(e.getMessage());
//        }
        try {
            String nulo = null;
            nulo.toUpperCase();
        }
        catch (NullPointerException exception){
            System.out.println("Faltou algo não?");
        }
        System.out.println("Fim do metodo1");
    }
    private static void metodo2() throws ChegueiNoFinalDoArray {
        System.out.println("Inicio do metodo2");
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(i);
        }
        throw (new ChegueiNoFinalDoArray());
        //System.out.println("Fim do metodo2");
    }
}