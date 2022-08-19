package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases Envolventes de tipos primitivos
        //CUENTA CON METODOS PARA CONVERTIR EL VALOR QUE SE ESTÁ ALMACENANDO
        /*
            int - Integer
            long - Long
            float - Float
            double - Double
            boolean - Boolean
            byte - Byte
            char - Character
            short - Short
        */

        //Para utilizar como objeto
        Integer entero = 10; //Ya es un Object
        System.out.println("entero = " + entero); //Imprime como tipo primitivo, pero como esta envuelta se pueden obtener más información
        System.out.println("entero = " + entero.toString()); //Esto ya es una cadena
        System.out.println("entero = " + entero.floatValue());
        System.out.println("entero = " + entero.doubleValue());
        
        //Unboxing
        int entero2 = entero; //El valor que almacena el valor de 10 se extrae y por eso se conoce como unboxing
        //Del objeto que almacena la literal de 10 se extrae y por eso se conoce como unboxing
        System.out.println("entero2 = " + entero2); //Ya es el tipo primitivo
    }
}
