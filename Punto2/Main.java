Packge Main;

import java.util.*;

class Tortuga
{
    private int Peso;
    private int Carga;

    public Tortuga(int Peso,int Carga){
        this.Peso = Peso;
        this.Carga = Carga-Peso;
    }

    public int getPeso(){
        return Peso;
    }

    public int getCarga(){
        return Carga;
    }
    

 class Main{

    ArrayList<Tortuga> lista=new ArrayList<>();
    int win = 0;

    public void Tortugas(int p,int c) {
          Tortuga  Tor = new Tortuga(p,c);
            lista.add(Tor);
    }

    public int Dinamico(ArrayList<Tortuga> lista){
        int campeon=0;
        int numero=0;
        if(lista.size()<=0){
            return 0;
        }else if(lista.size()==1){
            return 1;
        }else{
            for (int i = 0; i < lista.size()-1; i++) {
                Tortuga tor = lista.get(i);
                if(tor.getCarga()>campeon){
                    campeon= tor.getCarga();
                }
                
            }
            while (win==0) {
                win = campeon-win;
                if(win<0){win=win*-1;}
                lista.remove(lista.size());
                numero++;
                Dinamico(lista);
            }  
        }
        return numero;
    }




    public void main(String[] args) {
        String entrada = "";
        Scanner entradaEscaner = new Scanner (System.in);
        entrada = entradaEscaner.nextLine ();
        String [] var = entrada.split(" ");
        int num=0;
        for(int i=0; i<=var.length-2;i=i+2){
          Tortugas(Integer.parseInt(var[i]),Integer.parseInt(var[i+1]));
    }
    System.out.println(Dinamico(lista));
}
}