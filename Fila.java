public class Fila {

    private int elementos[];
    private int total;
    private int primeiro;
    private int ultimo;

    public Fila(){
        elementos = new int[20];
        primeiro = 0;
        ultimo = 0;
        total = 0;
    }

    public void AdcionarElemento(int novoElemento){
        elementos[ultimo] = novoElemento;
        ultimo = (ultimo + 1) % elementos.length;
        total++;
    }

   public int ExcluirElemento(){
        int controle = elementos[primeiro];
        primeiro = (primeiro + 1) % elementos.length;
        total --;
        return controle;
   }

    public void ObterPrimeiroElemento(){

     System.out.println(elementos[primeiro]);

   }


   public void VerificarFia(){
        if( total == 0){
            System.out.println("Fila está vazia");
        } else {
            System.out.println("Há elementos");
        }
   }


  

}
