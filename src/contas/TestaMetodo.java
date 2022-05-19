package contas;

public class TestaMetodo {
    public static void main(String[] args) {
    Conta contaDoAndre = new Conta();
    contaDoAndre.saldo = 100;
    contaDoAndre.deposita(50);
    System.out.println(contaDoAndre.saldo);

    boolean conseguiuRetirar = contaDoAndre.saca(20);
    System.out.println(contaDoAndre.saldo);
    System.out.println(conseguiuRetirar);

    Conta contaEverton = new Conta();
    contaEverton.deposita(1000);

    if( contaEverton.transfere(300, contaDoAndre)) {
        System.out.println("transferencia com sucesso");
    }else {
        System.out.println("faltou dinheiro");
    }
    System.out.println(contaEverton.saldo);
    System.out.println(contaDoAndre.saldo);
    }

}
