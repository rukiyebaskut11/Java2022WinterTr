package p03_ucusProjesi;

import java.util.Scanner;

public class JavaAirLines {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("javaAirlines'a hos geldin AGAM..\n B C D rotasından birini seciniz : ");

        String city = scan.next().toUpperCase();
        System.out.println("ucusunuz icin \n tek yön--->1 \n cift yön--->2 \n giriniz : ");

        int flytype = scan.nextInt();
        System.out.println("agam yasını da gir : ");
        int age = scan.nextInt();
        double priceC = 0.10 * 700;
        double priceB = 0.10 * 500;
        double priceD = 0.10 * 900;

        if (city.equals("B") || city.equals("C") || city.equals("D")) {

            if (age > 65) {
                if (city.equals("B")) {
                    if (flytype == 1) {
                        System.out.println("    ******    ");
                        System.out.println("ucusunuz icin bilet ödemeniz : " + priceB * 0.7 + " $");


                    } else if (flytype == 2) {
                        System.out.println("    ******    ");
                        System.out.println("ucusunuz icin bilet ödemeniz : " + (priceB * 0.7 * 0.8) * 2 + " $");

                        if (city.equals("C")) {
                            if (flytype == 1) {
                                System.out.println("    ******    ");
                                System.out.println("ucusunuz icin bilet ödemeniz : " + priceC * 0.7 + " $");


                            } else if (flytype == 2) {
                                System.out.println("    ******    ");
                                System.out.println("ucusunuz icin bilet ödemeniz : " + (priceC * 0.7 * 0.8) * 2 + " $");

                                if (city.equals("D")) {
                                    if (flytype == 1) {
                                        System.out.println("    ******    ");
                                        System.out.println("ucusunuz icin bilet ödemeniz : " + priceD * 0.7 + " $");


                                    } else if (flytype == 2) {
                                        System.out.println("    ******    ");
                                        System.out.println("ucusunuz icin bilet ödemeniz : " + (priceD * 0.7 * 0.8) * 2 + " $");

                                    } else System.out.println("hatalı veri girdiniz");
                                }
                            }


                        } else System.out.println("agam o gezegene ucus henüz yok");


                    }
                }
            }
        }

    }
}