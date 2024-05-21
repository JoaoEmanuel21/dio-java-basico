public class MinhaClasse {
    
public static void main (String [] args){

    String primeiroNome = "João"; // Declara o valor das váriaveis já que o usuário não poderá dar entrada  
    String segundoNome = "Emanuel";

    String nomeCompleto = nomeCompleto(primeiroNome,segundoNome); //Declara uma variável dentro do método main que vai chamar o método nome completo
    System.out.println(nomeCompleto); //Dá o comando de mostrar o resultado final para o usuário

    
}

public static String nomeCompleto (String primeiroNome, String sesgundoNome){ // Linha de código para criar método 1- Declara o tipo do metodo 2- O nome 3- E as variaveis que serão utlizadas
    return primeiroNome.concat(" ").concat(sesgundoNome); //Junta primeiro e segundo nome colocando espaço no meio
}
}
