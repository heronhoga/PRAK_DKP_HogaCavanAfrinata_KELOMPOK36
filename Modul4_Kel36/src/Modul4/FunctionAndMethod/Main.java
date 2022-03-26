package Modul4.FunctionAndMethod;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String pilih = null;
            //Bagian Vincent (Buat Tampilan utama dan exit)

    //Bagian Feri

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


