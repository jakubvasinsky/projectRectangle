package sk.itsovy.vasinsky.other;


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FreeClass {
    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayNHello(int n) {
        int i;
        for (i = 1; i <= n; i++) {
            System.out.print("Hello ");
        }
        System.out.println();
    }

    public void sayHi() {
        System.out.println("Hi");
    }

    public void sayNHi(int n) {
        int i = 1;
        while (i <= n) //cyklus...opakovanie
        {
            System.out.print("Hi");
            i++;
        }
        System.out.println();  //odriadkovanie
    }

    public int getEvenNumber(int number) {
        if (number % 2 == 0)
            return number;
        else
            return number + 1;
    }


   /* public void getname() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);

    }

    public void getnumber() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Zadaj cislo");
        int value = myObj.nextInt();
        System.out.println("tvoje cislo je:" + value);


        for (int i = 1; i <= value; i++) {
            System.out.println("*");


//zadaj meno heslo
          String meno = "jakub";
            int heslo = 123456;
            System.out.println("ENTER USERNAME");
            String userName = myObj.nextLine();
            System.out.println("ENTER PASSWORD");
            int password = myObj.nextInt();
            if (meno.equals(userName) && heslo == password) {
                System.out.println("correct data");
            }

        }
    }
*/




        public void obdlznika() {
            Scanner fullRectangle = new Scanner(System.in);
            System.out.println("Enter value");
            int row = fullRectangle.nextInt();
            int symbol = fullRectangle.nextInt();

            for (int a = 1; a <= row; a++) {
                System.out.println();
                for (int j = 1; j <= symbol; j++) {
                    System.out.print("@");
                }
            }

        }
        public void obdlznikb() {
            Scanner Rectangle = new Scanner(System.in);

            System.out.println("Enter value");
            String symbol2 = Rectangle.nextLine();
            int row = Rectangle.nextInt();
            int symbol = Rectangle.nextInt();

            for (int a = 1; a <= row; a++) {
                for (int j = 1; j <= symbol; j++) {
                    if (a == 1 || a == row || j == 1 || j == symbol) {
                        System.out.print(symbol2);
                    }
                else{
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }





        }






