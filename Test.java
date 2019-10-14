package sk.itsovy.vasinsky.other;

import java.util.Random;
import java.util.Scanner;

public class Test {

    public void test() {
        for (int i = 10; i < 100; i++) {
            System.out.print(i + " ");
        }
    }

    public void neparne() {
        for (int i = 99; i > 10; i--) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public void delitelne11() {
        for (int i = 100; i <= 999; i++) {
            if (i % 11 == 0 && i % 3 > 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void delitelne2alebo3() {
        for (int i = 10; i < 100; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void pekne3cifcisla() {
        for (int i = 100; i <= 999; i++) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;
            if (a == b || b == c || c == a) {
                System.out.print(i + " ");
            }
        }
    }

    public void prave2pekne3cifcisla() {
        for (int i = 100; i <= 999; i++) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;
            if ((a == b && a != c) || (b == c && b != a) || (c == a && c != b)) {
                System.out.print(i + " ");
            }
        }
    }

    //vypisat kolko je peknych cisel, neparne, ciferny sucet je menej ako 6
    public void kolkojepeknychcisel() {
        int p = 0;
        for (int i = 1; i <= 500; i++) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;

            if (i % 2 == 1) {
                if ((a + b + c) < 6) {
                    p++;
                }
            }
        }
        System.out.print(p);
    }

    public void daco() {
        int count = 0;
        int j = 870;
        for (int i = 1; i < 870; i++) {
            if (j % i == 0) {
                count++;
            }
        }
        System.out.println(count);

    }

    //vypisat mocniny cisla 2 do 100 000
    public void mocniny2do100000() {
        for (int i = 2; i < 100000; i *= 2) {
            System.out.print(i + " ");
        }
    }

    public void pinkod() {
        for (int i = 1000; i < 10000; i++) {
            int a = i / 1000;
            int b = (i / 100) % 10;
            //int c = i % 10;
            int d = i % 10;
            if (i % 12 == 0 && a > d && b % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void cas() {
        int time = 514623;
        int day = time / 86400;
        time = time % 86400;
        int hour = time / 3600;
        time = time % 3600;
        int minute = time / 60;
        time = time % 60;

        System.out.println(day);
        System.out.println(hour);
        System.out.println(minute);

    }


    public void scitaniecisel() {
        int p = 1;
        for (int i = 1; i <= 30; i++) {
            p = p * 2;
        }
        System.out.println(p);
    }

    public void zlomky() {
        double p = 0;
        for (double n = 1; n <= 100; n++) {

            p = (p + (1 / n));
        }
        System.out.println(p);
    }

    public void prvocislo() {
        int c = 1357;
        int p = 0;
        for (int i = 1; i <= c; i++) {
            if (c % i == 0) {
                p++;
            }
        }
        if (p == 2) {
            System.out.println("Je prvocislo, pocet delitelov:" + p);
        } else {
            System.out.println("Nie je prvocislo, pocet delitelov:" + p);
        }
    }


    //vsetky 5cif cisla kt maju cif sucet 43

    public void funkciawhile() {
        int i = 10000;
        while (i < 99999) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;
            int d = (i / 1000) % 10;
            int e = (i / 10000) % 10;
            if (a + b + c + d + e == 43) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
    //najvacsie 5cif cislo ktore je delitelne 613

    public void delitelne613() {
        int m = 99999;
        while (m % 613 != 0) {
            m--;
        }
        System.out.println(m);
    }

    //najmensi spolocny nasobok
    public void nsn() {
        int a = 244;
        int b = 312;
        int x = 1;
        while ((a * x) % b != 0) {
            x++;
        }
        System.out.println(a * x);
    }

    //najvacsi spolocny delitel
    public void nsd() {
        int a = 48;
        int b = 88;
        int m = 0;
        if (a < b) {
            m = a;
            a = b;
            b = m;
        }
        while (a % b != 0) {
            m = b;
            b = a - b;
            a = m;
        }
        System.out.println(b);
    }

    public void uloha2() {
        int i = 5;
        int k = 7;
        int n = 0;
        do {
            n = k * i;
            i++;
            System.out.println(n);
            k = k + 3;
        }
        while (k * i < k);
    }

    public void uloha3() {

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public void uloha4() {
        for (int i = 20; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    int p = 10;

    public void uloha5() {
        for (int a = 10; a >= 0; a--) {
            p = p + 1;

            for (int c = 0; c <= p; c++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= a; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    int x = 1;

    public void uloha6() {
        for (int rows = 1; rows <= 7; rows++) {

            for (int spaces = 6; spaces >= rows; spaces--) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= x; stars++) {
                System.out.print("*");
            }
            System.out.println();
            x += 2;
        }
    }

    public void stvorec() {
        for (int rows = 1; rows <= 8; rows++) {

            for (int spaces = 1; spaces <= 8; spaces++) {

                if (rows == 1 || rows == 8 || spaces == 1 || spaces == 8) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void mesiace() {
        Scanner Months = new Scanner(System.in);

        System.out.println("Month number");


        int m = Months.nextInt();


        if (m == 1) {
            System.out.println("January");

        } else {
            if (m == 2) {
                System.out.println("February");
            } else {

                if (m == 3) {
                    System.out.println("March");
                } else {
                    if (m == 4) {
                        System.out.println("April");
                    } else {

                        if (m == 5) {
                            System.out.println("May");
                        } else {
                            if (m == 6) {
                                System.out.println("June");
                            } else {

                                if (m == 7) {
                                    System.out.println("July");
                                } else {
                                    if (m == 8) {
                                        System.out.println("August");
                                    } else {

                                        if (m == 9) {
                                            System.out.println("September");
                                        } else {
                                            if (m == 10) {
                                                System.out.println("October");
                                            } else {

                                                if (m == 11) {
                                                    System.out.println("November");
                                                } else {
                                                    if (m == 12) {
                                                        System.out.println("December");
                                                    } else {
                                                        System.out.println("Error");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void monthsswitch() {
        Scanner Months = new Scanner(System.in);
        System.out.println("Month number");
        int m = Months.nextInt();
        switch (m) {


            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Error");


        }

        switch (m) {

            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:

            case 4:

            case 5:
                System.out.println("spring");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Error");
        }
    }

    public void znamky() {

        Scanner znamky = new Scanner(System.in);
        System.out.println("Zadaj znamku");
        int m = znamky.nextInt();

        switch (m) {

            case 1:
                System.out.println("vyborny");
                break;
            case 2:
                System.out.println("chvalitebny");
                break;
            case 3:
                System.out.println("dobry");
                break;
            case 4:
                System.out.println("dostatocny");
                break;
            case 5:
                System.out.println("nedostatocny");
                break;
            default:
                System.out.println("Error");
        }
    }

    public void kvadraticka() {
        System.out.println("Hello this is a program for solving math problems");
        Scanner myObj = new Scanner(System.in);
        double D = 0;
        double x = 0;
        double x1 = 0;
        double x2 = 0;
        double a = 0;
        double b = 0;
        double c = 0;

        System.out.println("Enter a:");
        a = myObj.nextInt();
        System.out.println("Enter b:");
        b = myObj.nextInt();
        System.out.println("Enter c:");
        c = myObj.nextInt();

        if (a == 0) {
            System.out.println("Nie je to kvadraticka rovnica");
        } else {
            D = Math.pow(b, 2) - 4 * a * c;
            System.out.println("D=" + D);
            if (D > 0) {
                x1 = ((-b) + Math.sqrt(D) / (2 * a));
                x2 = ((-b) - Math.sqrt(D) / (2 * a));
                System.out.println("dve riesenia: x1=" + x1 + " x2=" + x2);
            }
            if (D == 0) {
                x1 = (-b) / (2 * a);
                System.out.println("Jedno riesenie: x=" + x);
            }
            if (D < 0) {
                System.out.println("Nema riesenie");
            }
        }
    }

    public void random() {
        Random rnd = new Random();
        int a, b, c;

        do {
            a = rnd.nextInt(6) + 1;
            b = rnd.nextInt(6) + 1;
            c = rnd.nextInt(6) + 1;

        } while ((a == b) || (b == c) || (a == c));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }


    public void random1() {
        Random rnd = new Random();
        int a = -10;
        int b = 10;
        int x;

        x = rnd.nextInt((b - a + 1) + a); //<-10;10> (b - a + 1) + a;  10 - (-10) = 20 +1= { 21 + -10}
        System.out.println(x);
    }


    public void randomtrojcifcisla() {
        Random rnd = new Random();

        int x;
        x = 11 * (rnd.nextInt(81) + 10);
        System.out.println(x);
    }

    public void nahodneprvocislo4cif() {
        Random rnd = new Random();
        int pocitadlo = 0;
        int i = 2;
        int u11;
        do {
            u11 = (rnd.nextInt(9000) + 1000);

            while (i < u11) {
                if (u11 % i == 0) {
                    pocitadlo++;
                }
                i++;
            }
        }while (pocitadlo==0);
    System.out.println("nahodne prvocislo od 1000 do 9000: "+u11);
}

 public void password() {   //heslo len z velkych cisel abecedy
     Random rnd = new Random();

     String password = "";
     for (int i = 0; i < 6; i++) {
         int num = rnd.nextInt(26) + 65;
         char letter = (char) num;
         password = password + "" + letter;
     }
     System.out.println(password);
 }
  public void password2(){
        StringBuilder password= new StringBuilder();
      Random rnd = new Random();
        for(int i=0;i<10;i++){
            int num=rnd.nextInt(75)+48;
                if(num>57 && num<65 || num>90 && num<97){
                    i--;
                    continue;
            }
               char letter= (char)num;
             password.append(letter);
        }
      System.out.println(password);
}
//du - prerobit tento program tak aby tam bola aspon 1 cislica aspon 1 velke a aspon 1 male pismeno

public void priklad() {

    Scanner scanner = new Scanner(System.in);
    Random rnd = new Random();

    for (int i = 1; i <= 10; i++) {

        int a = rnd.nextInt(90) + 10;
        int b = rnd.nextInt(90) + 10;
        int r = 0;
        int input = 0;

        int num = 0;
        int symbol = rnd.nextInt(4);

        switch (symbol) {
            case 0:

                System.out.println("Problem" + i);
                System.out.println(a + " + " + b + " = ");
                r = a + b;
                break;


            case 1:
                System.out.println(i);
                System.out.println(a + " + " + b + " = ");
                r = a + b;
                break;
            case 2:
                System.out.println(i);
                System.out.println(a + " - " + b + " = ");
                r = a - b;
                break;


            case 3:
                System.out.println( i);
                System.out.println(a + " * " + b + " = ");
                r = a * b;
                break;
        }
        input = scanner.nextInt();

        if (input == r) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect. Correct answer is " + r);
        }

    }


}




}
