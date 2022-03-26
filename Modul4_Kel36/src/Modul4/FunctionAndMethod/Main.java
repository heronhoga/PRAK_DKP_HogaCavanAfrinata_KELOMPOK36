package Modul4.FunctionAndMethod;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String pilih = null;
            //Bagian Vincent (Buat Tampilan utama dan exit)
            System.out.println("*** WELCOME TO PC EPIC STORE ***");
            System.out.println("===============================");
            System.out.println("-----------MENU UTAMA----------");
            System.out.println("===============================");
            System.out.println("1. Paket");
            System.out.println("2. Komponen");
            System.out.println("3. Exit");
            System.out.print("Masukkan Pilihan : ");
            int menu = scan.nextInt();
            pilihan(menu);

            System.out.println("Apakah ingin melanjutkan belanja anda? (Yes/No)");
            pilih = scan.nextLine();
            pilih = scan.nextLine();
            if (pilih.toLowerCase().equals("yes")){
                continue;
            }
            else if (pilih.toLowerCase().equals("no")){
                System.out.println("Terimakasih telah berbelanja di PC EPIC STORE");
                break;
            }

        }
    }

    public static void pilihan(int pilih){
        while (true) {
            int menu = pilih;
            if (menu == 1) {
                PaketPC();
                break;
            } else if (menu == 2) {
                Method1 object = new Method1();
                object.main();
                break;
            } else if (menu == 3) {
                System.out.println("Terimakasih telah berkunjung ke toko kami :)");
                System.exit(0);
            } else {
                System.out.println("Maaf menu yang anda pilih tidak valid :(");
            }
        }
    }
    //Bagian Feri
        public static void PaketPC() {
        Scanner input = new Scanner(System.in);
        int pilih = 0;
        boolean n = true;
        while(n == true) {
            System.out.println("Silahkan pilih paket yang Anda inginkan!");
            System.out.println("========================================");
            System.out.println("1. Paket Basic");
            System.out.println("2. Paket Medium");
            System.out.println("3. Paket High");
            System.out.println("4. Paket Advance");
            System.out.println("5. Paket SULTAN");
            System.out.println("6. EXIT");
            System.out.print("Masukkan Pilihan : ");
            pilih = input.nextInt();
            String pilih2 = null;

            //Pengkondisian
            if (pilih == 1) {
                System.out.println("Paket Basic");
                System.out.println("Rp 5.500.000");
                System.out.println("=======================");

                System.out.println("+ Prosesor Intel Core i3");
                System.out.println("+ RAM 8 GB");
                System.out.println("+ VGA GTX 450");
                System.out.println("+ Monitor Samsung");
                System.out.println("+ Keyboard Logitech");
                System.out.println("+ Power Supply Corsair");
                System.out.println("+ Penyimpanan SSD 256 GB NvME");
                System.out.println("+ Mouse Aukey");
                System.out.println("+ Speaker Logitech");
                System.out.println("+ Headset Corsair");
                while (true) {
                    System.out.println("Apakah Anda ingin membeli paket ini? (Yes/No)");
                    pilih2 = input.next();
                    if (pilih2.toLowerCase().equals("yes")) {
                        System.out.println("Anda telah membeli paket ini \n" +
                                "Terima kasih telah berbelanja");
                        n = false;
                        break;
                    } else if (pilih2.toLowerCase().equals("no")) {
                        break;
                    } else {
                        System.out.println("Masukan tidak valid");
                    }
                }
            } else if (pilih == 2) {
                System.out.println("Paket Medium");
                System.out.println("Rp 8.750.000");
                System.out.println("=======================");

                System.out.println("+ Prosesor AMD Ryzen 5");
                System.out.println("+ RAM 16 GB");
                System.out.println("+ VGA GTX 750");
                System.out.println("+ Monitor Asus");
                System.out.println("+ Keyboard Fantech");
                System.out.println("+ Power Supply Armaggeddon");
                System.out.println("+ Penyimpanan SSD 512 GB NvME");
                System.out.println("+ Mouse Rexus");
                System.out.println("+ Speaker Logitech");
                while (true) {
                    System.out.println("Apakah Anda ingin membeli paket ini? (Yes/No)");
                    pilih2 = input.next();
                    if (pilih2.toLowerCase().equals("yes")) {
                        System.out.println("Anda telah membeli paket ini \n" +
                                "Terima kasih telah berbelanja");
                        n = false;
                        break;
                    } else if (pilih2.toLowerCase().equals("no")) {
                        break;
                    } else {
                        System.out.println("Masukan tidak valid");
                    }
                }
            } else if (pilih == 3) {
                System.out.println("Paket High");
                System.out.println("Rp 10.800.000");
                System.out.println("=======================");

                System.out.println("+ Prosesor Intel Core i5");
                System.out.println("+ RAM 24 GB");
                System.out.println("+ VGA GTX 1650");
                System.out.println("+ Monitor Asus");
                System.out.println("+ Keyboard Logitech");
                System.out.println("+ Power Supply Armaggeddon Optimus");
                System.out.println("+ Penyimpanan SSD 1 TB NvME");
                System.out.println("+ Mouse Razer");
                System.out.println("+ Speaker Logitech");
                while (true) {
                    System.out.println("Apakah Anda ingin membeli paket ini? (Yes/No)");
                    pilih2 = input.next();
                    if (pilih2.toLowerCase().equals("yes")) {
                        System.out.println("Anda telah membeli paket ini \n" +
                                "Terima kasih telah berbelanja");
                        n = false;
                        break;
                    } else if (pilih2.toLowerCase().equals("no")) {
                        break;
                    } else {
                        System.out.println("Masukan tidak valid");
                    }
                }
            } else if (pilih == 4) {
                System.out.println("Paket Advance");
                System.out.println("Rp 15.450.000");
                System.out.println("=======================");

                System.out.println("+ Prosesor AMD Ryzen 7");
                System.out.println("+ RAM 32 GB");
                System.out.println("+ Monitor Samsung+");
                System.out.println("+ Keyboard Razer");
                System.out.println("+ Power Supply Corsair Maximus");
                System.out.println("+ Penyimpanan SSD 1 TB NvME");
                System.out.println("+ Mouse Joyseus");
                System.out.println("+ Speaker Razer");
                while (true) {
                    System.out.println("Apakah Anda ingin membeli paket ini? (Yes/No)");
                    pilih2 = input.next();
                    if (pilih2.toLowerCase().equals("yes")) {
                        System.out.println("Anda telah membeli paket ini \n" +
                                "Terima kasih telah berbelanja");
                        n = false;
                        break;
                    } else if (pilih2.toLowerCase().equals("no")) {
                        break;
                    } else {
                        System.out.println("Masukkan tidak valid");
                    }
                }
            } else if (pilih == 5) {
                System.out.println("Paket SULTAN");
                System.out.println("Rp 25.999.000");
                System.out.println("=======================");

                System.out.println("+ Prosesor Intel Core i9");
                System.out.println("+ RAM 64 GB");
                System.out.println("+ Monitor Samsung oled");
                System.out.println("+ Keyboard Fantech Domination");
                System.out.println("+ Power Supply Corsair Extreme");
                System.out.println("+ Penyimpanan SSD 2 TB NvME");
                System.out.println("+ Mouse Razer Special Edition");
                System.out.println("+ Speaker Logitech Power UP");
                while (true) {
                    System.out.println("Apakah Anda ingin membeli paket ini? (Yes/No)");
                    pilih2 = input.next();
                    if (pilih2.toLowerCase().equals("yes")) {
                        System.out.println("Anda telah membeli paket ini \n" +
                                "Terima kasih telah berbelanja");
                        n = false;
                        break;
                    } else if (pilih2.toLowerCase().equals("no")) {
                        break;
                    } else {
                        System.out.println("Masukan tidak valid");
                    }
                }
            }
            else if (pilih == 6) {
                n = false;
                break;
            }
            else
                System.out.println("Maaf pilihan anda tidak valid");
        }
    }


    //Bagian Ryan
    public void Total(String[] barang) {
        Method1 objek = new Method1();
        int[] harga = new int[50];
        int total = 0;
        //Pengecekan harga dari barang
        for (int i=0; i<barang.length;i++){
            if (barang[i] != null){
                //Komponen
                //Komponen Luar
                if (barang[i].equals("MONITOR A"))
                    harga[i] = 1000000;
                else if (barang[i].equals("MONITOR B"))
                    harga[i] = 1100000;
                else if (barang[i].equals("MONITOR C"))
                    harga[i] = 1200000;
                else if (barang[i].equals("MOUSE A"))
                    harga[i] = 250000;
                else if (barang[i].equals("MOUSE B"))
                    harga[i] = 300000;
                else if (barang[i].equals("MOUSE C"))
                    harga[i] = 350000;
                else if (barang[i].equals("KEYBOARD A"))
                    harga[i] = 400000;
                else if (barang[i].equals("KEYBOARD B"))
                    harga[i] = 450000;
                else if (barang[i].equals("KEYBOARD C"))
                    harga[i] = 500000;
                //Komponen Dalam
                else if (barang[i].equals("PROCESSOR INTEL A"))
                    harga[i] = 3000000;
                else if (barang[i].equals("PROCESSOR INTEL B"))
                    harga[i] = 3500000;
                else if (barang[i].equals("PROCESSOR AMD A"))
                    harga[i] = 2500000;
                else if (barang[i].equals("PROCESSOR AMD B"))
                    harga[i] = 2700000;
                else if (barang[i].equals("GRAPHICS CARD NVIDIA"))
                    harga[i] = 4000000;
                else if (barang[i].equals("GRAPHICS CARD RADEON"))
                    harga[i] = 3500000;
                else if (barang[i].equals("RAM 4GB DDR4"))
                    harga[i] = 300000;
                else if (barang[i].equals("RAM 8GB DDR4"))
                    harga[i] = 550000;
                else if (barang[i].equals("RAM 16GB DDR4"))
                    harga[i] = 1000000;
                else if (barang[i].equals("SSD 256 GB"))
                    harga[i] = 500000;
                else if (barang[i].equals("SSD 512 GB"))
                    harga[i] = 900000;
                else if (barang[i].equals("HDD 500 GB"))
                    harga[i] = 500000;
                else if (barang[i].equals("HDD 1 TB"))
                    harga[i] = 800000;
                else if (barang[i].equals("POWER SUPPLY 450W 80+ BRONZE"))
                    harga[i] = 450000;
                else if (barang[i].equals("POWER SUPPLy 500W 80+ BRONZE"))
                    harga[i] = 500000;
                else if (barang[i].equals("POWER SUPPLY 600W 80+ BRONZE"))
                    harga[i] = 650000;
                //Paketan
                else if (barang[i].equals("Paket Basic"))
                    harga[i] = 800000;
                else if (barang[i].equals("Paket Medium"))
                    harga[i] = 450000;
                else if (barang[i].equals("Paket High"))
                    harga[i] = 500000;
                else if (barang[i].equals("Paket Sultan"))
                    harga[i] = 650000;
            }
        }

        //Cetakan
        System.out.println("----TOTAL HARGA----");
        System.out.println("====================");
        for (int i = 0; i < barang.length; i++){
            if (barang[i] != null) {
                int k = 1;
                System.out.println(k + ". " + barang[i] + "         Rp." + harga[i]);
                total += harga[i];
            }
        }
        System.out.println("-------------------- +");
        System.out.println("TOTAL     Rp."+total);
        System.out.println("Terima kasih telah berbelanja");
    }
}


