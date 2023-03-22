public class Listagen {
    public Lista Cons(No cabeca, Lista cauda){
        Lista novo = new Lista();
        novo.setCabeca(cabeca);
        novo.setCauda(cauda);
        novo.setTerminal('0');
        return novo;
    }
    public Atomo criaT(String str){
        Atomo novo= new Atomo();
        novo.setInfo(str);
        novo.setTerminal('1');
        return novo;
    }

    public boolean Nula(No l){
        return l==null;
    }

    public boolean Atomo(No l){
        return(!Nula(l))&&(l.isTerminal());
    }


    //CRIA LISTA A PARTIR DE CARACTERES
    //public No criaLista(String str){}

    //EXIBIR LISTA
    public void exibeL(No l){
        if(Atomo(l)){
            System.out.println(((Atomo)l).getInfo());
        }
        else{
            System.out.println("[");
            while(l!=null){
                exibeL(((Lista)l).getCabeca());
                l = ((Lista)l).getCauda();
                if(!Nula(l)){
                    System.out.println(",");
                }
            }
            System.out.print("]");
        }
    }
}

