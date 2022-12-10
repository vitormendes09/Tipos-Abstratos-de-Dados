public class Pilha{

    private int elementos[];
    private int controle;

    public Pilha (){

        elementos = new int[20];
        controle = -1;
    }


    public void EmpilharElemento ( int novoElemento){  //push
        controle ++;

        elementos[controle] = novoElemento;
    }

    public int DesempilharElemento(){  //pop
        int primeiroElemento;
        primeiroElemento = elementos[controle];
        controle--;
        return primeiroElemento;
    } 


    public void ObterTopo (){   //top

        System.out.println("O primeiro elemento da pilha é: " + elementos[controle]); 
    }

    public void VerificarPilha(){
        if(controle == -1){

            System.out.println("Pilha vazia!!");

        } else {

            System.out.println("Há elementos na pilha !!");

        }

    }

    public void MostrarElementosPilha(){
        int topo;

        System.out.println("Mostrando elementos noformatode pilha: ");
        for(topo = controle; topo > -1; topo--){

            System.out.println(  "----------");
            System.out.println(elementos[topo]);
        }
    }
}