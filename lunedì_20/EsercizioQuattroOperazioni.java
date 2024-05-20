import java.util.Scanner;

public class EsercizioQuattroOperazioni {
    
    public static void main(String[] args) {
        
        Scanner scannerN = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome:");
        String nome = scannerS.nextLine();
        String NOME = nome.toUpperCase();

        System.out.println("Benvenuto " + NOME + "!");
        int sceltaMenu=1;
        int contOpeGiuste=0;
        int contOpeSbagliate=0;
        int[] numeroOperazioni = {0,0,0,0};

        do { 

            System.out.println("Digita:\n [1] per fare il TEST; \n [0] per USCIRE. ");
            sceltaMenu = scannerN.nextInt();

            while ((sceltaMenu!=1 && sceltaMenu!=0)) {
                System.out.println("Numero inserito non corretto!");
                System.out.println("Digita:\n [1] per fare il TEST; \n [0] per USCIRE. ");
                sceltaMenu = scannerN.nextInt();   
            }

            if (sceltaMenu==1) {
           
                System.out.println("Scegli l'operazione da svolgere:\n [1] SOMMA; \n [2] SOTTRAZIONE \n [3] MOLTIPLICAZIONE \n [4] DIVISIONE. ");
                int scelta = scannerN.nextInt();

                while ((scelta!=1 && scelta!=2 && scelta!=3 && scelta!=4)) {
                    System.out.println("Numero inserito non corretto!");
                    System.out.println("Scegli l'operazione da svolgere:\n [1] SOMMA; \n [2] SOTTRAZIONE \n [3] MOLTIPLICAZIONE \n [4] DIVISIONE. ");
                    scelta = scannerN.nextInt();   
                }

                int randomX = (int)(Math.random() * 101);
                int randomY = (int)(Math.random() * 101);
                int risultato;
                int somma;
                int sottrazione;
                int prodotto;
                int divisione;

                switch (scelta) {
                    case 1:
                        System.out.println(randomX + " + " + randomY + " = ");
                        risultato = scannerN.nextInt();
                        somma = randomX + randomY;
                        numeroOperazioni[0]++;

                        if (risultato == somma) {
                            System.out.println("Risultato corretto!");
                            contOpeGiuste++;
                                        
                        } else {
                            System.out.println("Risultato sbagliato!");
                            contOpeSbagliate++; 
                        }
                        break;
            
                    case 2:
                        System.out.println(randomX + " - " + randomY + " = ");
                        risultato = scannerN.nextInt();
                        sottrazione = randomX - randomY;
                        numeroOperazioni[1]++;

                        if (risultato == sottrazione) {
                            System.out.println("Risultato corretto!");
                            contOpeGiuste++;                    
                        } else {
                            System.out.println("Risultato sbagliato!");
                            contOpeSbagliate++; 
                        }

                        break;
                
                    case 3:
                        System.out.println(randomX + " * " + randomY + " = ");
                        risultato = scannerN.nextInt();
                        prodotto = randomX*randomY;
                        numeroOperazioni[2]++;

                        if (risultato == prodotto) {
                            System.out.println("Risultato corretto!");
                            contOpeGiuste++;                    
                        } else {
                            System.out.println("Risultato sbagliato!");
                            contOpeSbagliate++; 
                        }

                    break;

                    case 4:
                        System.out.println(randomX + " : " + randomY + " = ");
                        risultato = scannerN.nextInt();
                        divisione = randomX/randomY;
                        numeroOperazioni[3]++;

                        if (risultato == divisione) {
                            System.out.println("Risultato corretto!");
                            contOpeGiuste++;                    
                        } else {
                            System.out.println("Risultato sbagliato!");
                            contOpeSbagliate++; 
                        }
                        break;
            }
               
        } else {
            System.out.println("Hai eseguito " + contOpeGiuste + " operazioni giuste." );
            System.out.println("Hai eseguito " + contOpeSbagliate + " operazioni sbagliate." );
            System.out.println("Hai eseguito " + numeroOperazioni[0]+ " somme." );
            System.out.println("Hai eseguito " + numeroOperazioni[1] + " sottrazioni." );
            System.out.println("Hai eseguito " + numeroOperazioni[2] + " moltiplicazioni." );
            System.out.println("Hai eseguito " + numeroOperazioni[3] + " divisioni." );
            System.out.println("Ciao, "+ NOME +" !");
        }

        } while (sceltaMenu==1);

        scannerN.close();
        scannerS.close();

    }
    
}
