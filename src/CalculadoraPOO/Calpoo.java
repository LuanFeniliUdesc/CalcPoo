package CalculadoraPOO;

public class Calpoo {
    public class Calculadora {

        private int num1;
        private int num2;
        private int resultado;

        public Calculadora(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
        }

        public void somar() {
            resultado = num1 + num2;
            System.out.println("Soma: " + resultado);
        }

        public void subtrair() {
            resultado = num1 - num2;
            System.out.println("Subtração: " + resultado);
        }

        public void multiplicar() {
            resultado = num1 * num2;
            System.out.println("Multiplicação: " + resultado);
        }

        public void dividir() {
            if (num2 != 0) {
                resultado = num1 / num2;
                System.out.println("Divisão: " + resultado);
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
        }

    }

}
