import java.util.Scanner;


public class vetor02 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];
        int maior = vetor[0];
        int posiçaomaior=0;
      

       for (int i = 0; i < vetor.length; i++) {
        System.out.println("digite 15 numeros");
           vetor[i] = scanner.nextInt(); 
           
           

           if (vetor[i] >maior) {
            maior = vetor[i];
            posiçaomaior=i;
            
           }
           
        
       }
       System.out.println("maior numero = " + maior);
       System.out.println(" Sua posição (índice) = "+ posiçaomaior);
       scanner.close();
       
    }
    
}
