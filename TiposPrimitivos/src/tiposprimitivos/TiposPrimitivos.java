package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author johnn
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno");
        float nota = teclado.nextFloat();
        
        System.out.format("A nota de %s é %.1f \n" ,nome, nota );
        
        
    }
    
}
