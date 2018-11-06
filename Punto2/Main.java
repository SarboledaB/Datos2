//Codigo hecho en c++ por: https://github.com/ajahuang/UVa/blob/master/UVa%2010154%20-%20Weights%20and%20Measures.cpp
//codigo hecho en java por: Sebastian Arboleda Botero

import java.util.*;

public class Main{
	
static Turtle [] T;
static int[] dp;
	

public static void solve(){

	Arrays.sort(T);

    Arrays.fill(dp, dp[5607]);
    dp[0] = 0;
    
    int maxNTurtles = 0;

    for (int i = 0; i < T.length; ++i){
        for (int j = maxNTurtles; j >= 0; --j){
            // Intenta colocar la tortuga i debajo de la pila actual de j tortugas.
            // 1.Turtle puedo llevar el stack más el mismo.
            // 2. Producen un peso menor para la pila actual de j + 1 tortugas.
            if (T[i].s >= dp[j] + T[i].w && T[i].w + dp[j] < dp[j + 1]){
                dp[j + 1] = dp[j] + T[i].w;
                maxNTurtles = Math.max(maxNTurtles, j + 1);
            }
        }
        }
    
    System.out.println(maxNTurtles);
}

public static void main(String []args)
{
    @SuppressWarnings("resource")
   	Scanner reader = new Scanner(System.in);
         int w = 0;
         int s = 0;
         int i = 0;
        do {			
         w = reader.nextInt();
         s   = reader.nextInt();
         Turtle turtle = new Turtle(w,s);
         T[i]=turtle;
         i++;
        } while (i==5607);
}
}