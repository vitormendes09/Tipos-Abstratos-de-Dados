public class main {
public static void main (String[] args) {
    

    Fila filinha = new Fila();
     
    filinha.VerificarFia();

    filinha.AdcionarElemento(399);
    filinha.AdcionarElemento(3);
    filinha.AdcionarElemento(21);

    filinha.ObterPrimeiroElemento();
    filinha.ExcluirElemento();
    
    filinha.ObterPrimeiroElemento();

    filinha.AdcionarElemento(46);
    filinha.AdcionarElemento(85);

    filinha.ObterPrimeiroElemento();

    filinha.VerificarFia();


    Pilha pilinha = new Pilha();

    pilinha.VerificarPilha();

    pilinha.EmpilharElemento(233);
    pilinha.EmpilharElemento(244);
    pilinha.EmpilharElemento(455);

    pilinha.ObterTopo();

    pilinha.DesempilharElemento();
    pilinha.EmpilharElemento(86);
    pilinha.EmpilharElemento(10);

    pilinha.ObterTopo();
    pilinha.VerificarPilha();

    pilinha.MostrarElementosPilha();
    }
}
