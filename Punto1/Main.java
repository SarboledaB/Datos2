import java.util.*;

public class Main{

   ArrayList<Elefante> lista=new ArrayList<>();
   int[ ] Numero;
   int campeon;

   public void Elefantes(int P,int C, int N) {
       Elefante Elf = new Elefante(P,C,N);
       lista.add(Elf);
   }

   public int Dinamico(ArrayList<Elefante> lista){
       if(lista.size()<=0){
           return 0;
       }else if(lista.size()==1){
           Elefante Elf=lista.get(0);
           return Elf.getNum();
       }else{
           for(int p=0;p<=lista.size()-1;p++){
               Elefante Elf=lista.get(p);
               for(int q=p;q<=lista.size()-1;q++){
                   Elefante Elf1=lista.get(q);
                   if(Elf.getPeso()<Elf1.getPeso() && Elf.getCi()>Elf1.getCi()){
                       campeon = Elf.getNum();
                   }else{
                       campeon = 0;
                   }
               }
               if(campeon!=0){
               Numero[p]= campeon;
               }
           }

       }
       for(int i=0;i<Numero.length;i++){
         System.out.println(Numero[i]);
       }
       return Numero[Numero.length];
   }

   public void main(String[] args) {
      @SuppressWarnings("resource")
	Scanner reader = new Scanner(System.in);
      int Peso = 0;
       Peso = 0;
      int iq = 0;
      int i = 1;
     do {			
      Peso = reader.nextInt();
      iq   = reader.nextInt();
      i++;
      Elefantes(Peso,iq,i);
     } while (Peso!=0);
     }
   }