import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		Scanner entrada = new Scanner(System.in);
		
		int opc;
		
		 do{
		     System.out.print("Menu de opções:"
		                +"\n1. Push"
		                +"\n2. Pop"
		                +"\n3. Size"
		                +"\n4. Empty"
		                +"\n5. Clear"
		                +"\n6. Topo"
		                +"\n7. Contains"
		                +"\n8. Print"
		                +"\n0. Sair"
		                +"\nDigite sua escolha:");
		     opc = entrada.nextInt();
		     System.out.println();
    		 switch(opc)
    		 {
    		     case 1:
    		     {
    		         int numero;
    		         System.out.print("Digite um número para inserir: ");
    		         numero = entrada.nextInt();
    		         pilha.push(numero);
    		         System.out.println();
    		         break;
    		     }
    		     case 2:
    		     {
    		         System.out.println("Numero removido: "+pilha.pop()+"\n");
    		         break;
    		     }
    		     case 3:
    		     {
    		         System.out.println("Tamanho da pilha: "+pilha.size()+"\n");
    		         break;
    		     }
    		     case 4:
    		     {
    		         if(pilha.empty())
    		         {
    		             System.out.println("Pilha vazia.\n");
    		         }
    		         else
    		            System.out.println("A pilha não está vazia.\n");
    		         break;
    		     }
    		     case 5:
    		     {
    		         pilha.clear();
    		         break;
    		     }
    		     case 6:
    		     {
    		         try{
    		             System.out.println("Topo da pilha: "+ pilha.topo()+"\n");
    		         }
    		         catch(Exception NullPointerException)
    		         {
    		             System.out.println("Pilha vazia.\n");
    		         }
    		         
    		         break;
    		     }
    		     case 7:
    		     {
    		         int numero;
    		         System.out.print("Digite um número para verificar: ");
    		         numero = entrada.nextInt();
    		         if(pilha.contains(numero))
    		         {
    		            System.out.println("A pilha contem o número:"+ numero+"\n");
    		         }
    		         else
    		            System.out.println("A pilha não contem o número:"+numero+"\n");
    		         break;
    		     }
    		     case 8:
		         {
		             pilha.print();
		             System.out.println("\n");
		             break;
		         }
    		     case 0:
    		     {
    		         System.out.println("Saindo...");
    		         break;
    		     }
    		     default:
    		     {
    		         System.out.println("Opção inválida, Digite novamente.\n");
    		     }
    		 }
		 }while(opc != 0);
	}
}
