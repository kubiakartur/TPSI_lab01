/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
enum GatunekPiwa {
    LAGER, PILZNER, PORTER, STOUT, PIWO_Z_BIEDRONKI
}
/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zadanie1:");
        // Zadanie 1
        int liczbyLosowe[] = new int[6];
        
        for ( int i=0; i<=5; i++)
        {
            liczbyLosowe[i]=(int)(Math.floor(Math.random()*49+1));
        }   
        
        for (int i=0 ; i<=5; i++)
        {
            System.out.println(liczbyLosowe[i]);
        }
        System.out.println("Zadanie2:");
        // Zadanie 2
        Integer liczbyLosowe2[] = new Integer[6];
        
        for ( int i=0; i<=5; i++)
        {
            liczbyLosowe2[i]=(int)(Math.floor(Math.random()*49+1));
        }   
        
        for (int i=0 ; i<=5; i++)
        {
            System.out.println(liczbyLosowe2[i]);
        }
        System.out.println("Zadanie3:");
        // Zadanie 3 
        GatunekPiwa[] gatunki = GatunekPiwa.values(); 
        int wylosowana;
        for (int i=0; i <=2; i++ )
        {
            wylosowana = (int)(Math.floor(Math.random()*4+1));
            //System.out.println(gatunki[wylosowana]);
            switch(gatunki[wylosowana])
            {
                case LAGER:
                case PILZNER:
                   System.out.println("piwo jasne");
                break;
                case PORTER:
                case STOUT:
                   System.out.println("piwo ciemne");
                break;
                case PIWO_Z_BIEDRONKI:
                   System.out.println("piwo tanie");
                break;
            }
        }
    }
 }
  