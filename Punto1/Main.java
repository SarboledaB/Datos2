
import java.util.*;
import java.util.Stack;

class Elefante{
   private int Peso;
   private int ci;
   private int num;

   public Elefante(int Peso,int ci,int num){
       this.Peso = Peso;
       this.ci = ci;
       this.num = num;
   }

   public int getPeso(){
       return Peso;
   }

   public int getCi(){
       return ci;
   }

   public int getNum(){
       return num;
   }
   
}

public class Main{

   ArrayList<Elefante> lista=new ArrayList<>();
   Stack <> stack = new Stack<>();

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
               int campeon;
               Elefante Elf=lista.get(p);
               int n= Elf.getNum();
               for(int q=0;q<=lista.size()-1;q++){
                   Elefante Elf1=lista.get(q);
                   int Result1= Elf.getPeso()-Elf.getCi();
                   int Result2= Elf1.getPeso()-Elf.getCi();
                   if(Result1<0){Result1=Result1*-1;}
                   if(Result2<0){Result2=Result2*-1;}
                   if(Result1 > Result2){
                       campeon=Result2;
                       n=Elf1.getNum();
                   }
               }
               stack.puts(n);
           }

       }
       for(int i=0;i<stack.size()-2;i++){
         return  System.out.println(stack.poop());
       }
        return  System.out.println(stack.poop());
   }




   public void main(String[] args) {
       String entrada = "";
       Scanner entradaEscaner = new Scanner (System.in);
       entrada = entradaEscaner.nextLine ();
       String [] var = entrada.split(" ");
       int num=0;
       for(int i=0; i<=var.length-2;i=i+2){
         num++;
         Elefantes(Integer.parseInt(var[i]),Integer.parseInt(var[i+1]),num);
   }
   }
}