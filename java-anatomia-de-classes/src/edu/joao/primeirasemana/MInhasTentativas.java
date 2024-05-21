package edu.joao.primeirasemana;
public class MInhasTentativas {

    public static void main (String[]args){
        int PrimeiroNumero = 2;
        int SegundoNumero = 3;

        int Soma = soma(PrimeiroNumero, SegundoNumero);
        System.out.println(Soma);
    }
    public static int soma(int primeiroNum, int segundoNum) {
    
        return primeiroNum + segundoNum; // Não se usa concat em váriveis interiras 
        
    }
}
