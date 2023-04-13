import java.util.Scanner;

public class ativiade24 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int quantidade;
        System.out.print("Digite a quantidade de repetições desejadas: ");
        quantidade = ler.nextInt();
        for(int i = 1; i <= quantidade; i++){
            while (true) {
                System.out.print("Digite um número: ");
                while (true) {
                    try {
                        Float numero1 = Float.parseFloat(ler.next());
                        if(numero1 == 0){
                            System.out.println("voce digitou zero");
                            break;
                        }else if(numero1 > 0){
                            System.out.println("Número "+numero1+" é positivo");
                            break;
                        }else{
                            System.out.println("Número"+numero1+ " é negativo");
                            break;
                        }
                        
                    } catch (NumberFormatException e){
                        System.out.println("Caractere Inválido");
                        System.out.println("Digite novamente");
                    }
                
                    
               }
               break;
            }
            
        }
    }
}
