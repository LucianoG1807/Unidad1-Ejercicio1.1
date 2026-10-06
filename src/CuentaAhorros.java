public class CuentaAhorros {
    /*
    Gestión de Cuenta de Ahorros con Interés

Contexto

Las entidades bancarias manejan cuentas de ahorros que acumulan un rendimiento
 financiero mensual en función de una tasa de interés fija aplicada sobre el saldo actual.

Consigna

Diseñar un programa en Java que modele una cuenta de ahorros capaz de calcular y aplicar intereses periódicos sobre el capital depositado.

Desarrollo requerido

Definir la clase CuentaAhorros con los atributos privados numeroCuenta (String), saldo (double) y tasaInteresAnual (double).

Incorporar un constructor que reciba e inicialice estos atributos, validando que el saldo y la tasa no sean negativos.

Implementar un método aplicarInteresMensual() que incremente el saldo calculando
la proporción mensual correspondiente ($saldo \times (tasaInteresAnual / 12) / 100$), además de métodos para depositar y retirar fondos.

En el método main, instanciar una cuenta de ahorros, simular un depósito,
aplicar el interés mensual y mostrar el saldo actualizado por consola.
     */

    private String numeroDeCuenta;
    private double saldo;
    private double tasaInteresAnual;

    public CuentaAhorros (String numeroDeCuenta, double saldo, double tasaInteresAnual) {
        this.numeroDeCuenta = numeroDeCuenta;

        if (saldo > 0 && tasaInteresAnual > 0) {
            this.saldo = saldo;
            this.tasaInteresAnual = tasaInteresAnual;
        }
        else {
            System.out.println("ERROR.");
        }
    }

    void retirarFondos(double retiro) {

        if (retiro <= saldo) {
            saldo -= retiro;
            System.out.println("RETIRO EXITOSO.");
            System.out.println("SALDO ACTUAL: " + saldo);
        }
        else {
            System.out.println("MONTO INSUFICIENTE.");
        }
    }

    void depositarFondos (double deposito) {

        if (deposito > 0) {
            saldo += deposito;
            System.out.println("DEPOSITO REALIZADO CON EXITO.");
            System.out.println("SALDO ACTUAL: " + saldo);
        }
        else {
            System.out.println("ERROR.");
        }
    }

    void aplicarInteresMensual(){

        saldo = saldo * tasaInteresAnual / 12;

        System.out.println("TASA DE INTERES ANUAL: %" + tasaInteresAnual);
        System.out.println("SALDO ACTUAL: " + saldo);
    }
}
