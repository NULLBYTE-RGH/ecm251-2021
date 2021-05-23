public class DadoTestDrive {
    public static void main(String[] args) {
        Dado d1 = new Dado(6);
        for (int i = 0; i < 10; i++) {
            System.out.println("Informações do Dado:");
            System.out.println("Lançamento:" + d1.lancarDado());
            System.out.println("Lançamento Atual:"+
                    d1.lerLancamentoAtual());
        }
    }
}