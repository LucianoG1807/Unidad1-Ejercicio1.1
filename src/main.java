public class main {
    static void main(String[] args) {

        CuentaAhorros cuenta1 = new CuentaAhorros(
                "123456",
                1500000,
                25
        );

        cuenta1.retirarFondos(500000); //$500.000
        System.out.println(" ");
        cuenta1.depositarFondos(250000); // $250.000
        System.out.println(" ");
        cuenta1.aplicarInteresMensual();
    }
}
