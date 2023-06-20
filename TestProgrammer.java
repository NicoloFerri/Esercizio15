package co.develhope.introduction._15;
import java.util.Scanner;


public class TestProgrammer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il nome del primo programmatore :");
        String nameProgrammer1 = scanner.nextLine();

        boolean isInt = false;
        int ageProgrammer1=0;
        do {
            System.out.println("inserisci quanti anni ha il primo programamtore :");
            if (scanner.hasNextInt()) {
                ageProgrammer1 = scanner.nextInt();
                isInt = !isInt;
            } else {
                scanner.next();
            }
        } while (!isInt);


        System.out.println("Dimmi se questo programmatore porta gli occhiali, Premi 1) se li porta , oppure premi 2) se non li porta");
        boolean isNumber = false;
        boolean glassesProgrammer1=false;
        do {
            if (scanner.hasNextInt()) {
                int k = scanner.nextInt();
                if ((k == 1) || (k == 2)) {
                    if (k == 1) {
                        glassesProgrammer1 = true;
                        isNumber = !isNumber;
                    } else {
                        glassesProgrammer1 = false;
                        isNumber = !isNumber;
                    }
                } else {
                    System.out.println("Hai immesso un carattere numerico intero ma non è valido ! Puoi immettere solo 1 o 2 , riprova : ");
                }
            } else {
                System.out.println("Non hai immesso un carattere numerico intero, puoi digitare solo 1 e 2 , riprova : ");
                scanner.next();
            }
        }
        while (!isNumber) ;

        scanner.nextLine();

        System.out.println("Inserisci il nome del secondo programmatore :");
        String nameProgrammer2 = scanner.nextLine();

        boolean isInt1 = false;
        int ageProgrammer2=0;
        do {
            System.out.println("inserisci quanti anni ha il secondo programamtore :");
            if (scanner.hasNextInt()) {
                ageProgrammer2 = scanner.nextInt();
                isInt1 = !isInt1;
            } else {
                scanner.next();
            }
        } while (!isInt1);


        System.out.println("Dimmi se questo programmatore porta gli occhiali, Premi 1) se li porta , oppure premi 2) se non li porta");
        boolean isNumber1 = false;
        boolean glassesProgrammer2=false;
        do {
            if (scanner.hasNextInt()) {
                int k = scanner.nextInt();
                if ((k == 1) || (k == 2)) {
                    if (k == 1) {
                        glassesProgrammer2 = true;
                        isNumber1 = !isNumber1;
                    } else {
                        glassesProgrammer2 = false;
                        isNumber1 = !isNumber1;
                    }
                } else {
                    System.out.println("Hai immesso un carattere numerico intero ma non è valido ! Puoi immettere solo 1 o 2 , riprova : ");
                }
            } else {
                System.out.println("Non hai immesso un carattere numerico intero, puoi digitare solo 1 e 2 , riprova : ");
                scanner.next();
            }
        }
        while (!isNumber1) ;
        scanner.close();

        Programmer programmer1 = new Programmer();
            programmer1.name = nameProgrammer1;
            programmer1.age = ageProgrammer1;
            programmer1.wearsGlasses = glassesProgrammer1;

            programmer1.drinkcoffee();
            programmer1.printDetails();

        System.out.println(" ");

        Programmer programmer2 = new Programmer();
        programmer2.name = nameProgrammer2;
        programmer2.age = ageProgrammer2;
        programmer2.wearsGlasses = glassesProgrammer2;

        programmer2.drinkcoffee();
        programmer2.printDetails();

    }

}
