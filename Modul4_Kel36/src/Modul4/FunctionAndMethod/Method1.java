package Modul4.FunctionAndMethod;
import java.util.Scanner;

public class Method1 {
  
    //Bagian Hoga
    public void main() {
        Scanner input = new Scanner(System.in);
        String[] komponen = new String[50];
        int b = 0;
        while (true) {
            System.out.println("");
            System.out.println("SILAHKAN PILIH KOMPONEN");
            System.out.println("1. Komponen Luar");
            System.out.println("2. Komponen Dalam");
            System.out.println("3. Exit");
            System.out.print("Masukkan pilihan: ");
            int pilih = input.nextInt();

            //Pengkondisian TODO
            if (pilih == 1) {
                komponen[b] = komponenLuar(b);
                b++;
            } else if (pilih == 2) {
                komponen[b] = komponenDalam(b);
                b++;
            } else if (pilih == 3) {
                //Akhir Pilihan
                Main objek = new Main();
                objek.Total(komponen);
                break;
            }
            else
                System.out.println("Maaf, Pilihan anda tidak valid");


        }
    }



    private String komponenLuar(int a) {
        Scanner input = new Scanner(System.in);
        String barang = null;
        System.out.println("");
        System.out.println("BERIKUT DAFTAR KOMPONEN EXTERNAL PC YANG TERSEDIA DI TOKO PC EPIC STORE :");
        System.out.println("1. MONITOR");
        System.out.println("2. MOUSE");
        System.out.println("3. KEYBOARD");
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();

        //Pengkondisian TODO
        if (pilih == 1)
            barang = monitor();
        else if (pilih == 2)
            barang = mouse();
        else if (pilih == 3)
            barang = keyboard();
        else
            System.out.println("Maaf, pilihan tidak valid");

        return barang;
    }

    private String komponenDalam(int a) {
        Scanner input = new Scanner(System.in);
        String barang = null;

        System.out.println("");
        System.out.println("BERIKUT DAFTAR KOMPONEN INTERNAL PC YANG TERSEDIA DI TOKO PC EPIC STORE :");
        System.out.println("1. PROCESSOR");
        System.out.println("2. GRAPHICS CARD");
        System.out.println("3. RAM");
        System.out.println("4. STORAGE (HDD/SSD)");
        System.out.println("5. POWER SUPPLY");
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();

        //Pengkondisian
        if (pilih == 1){
            barang = procie();
        } else if(pilih ==2){
            barang = gpu();
        } else if (pilih == 3){
            barang = ram();
        } else if (pilih == 4) {
            barang = storage();
        } else if (pilih == 5) {
            barang = psu();
        } else
            System.out.println("Maaf, Pilihan tidak valid");

        return barang;
        //Pengkondisian


    }

    //KOMPONEN EXTERNAL
    private String monitor() {
        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.println("DAFTAR JENIS DAN HARGA MONITOR :");
        System.out.println("1. MONITOR A Rp. 1.000.000,-");
        System.out.println("2. MONITOR B Rp. 1.100.000,-");
        System.out.println("3. MONITOR C Rp. 1.200.000,-");

        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        String barang = null;

        //Pengkondisian Pilihan
        if (pilih == 1) {
            barang = "MONITOR A";
            System.out.println("Pilihan telah masuk keranjang!\n");
        }
        else if (pilih == 2) {
            barang = "MONITOR B";
            System.out.println("Pilihan telah masuk keranjang!\n");
        }
        else if (pilih == 3) {
            barang = "MONITOR C";
            System.out.println("Pilihan telah masuk keranjang!\n");
        }
        else
              System.out.println("Maaf, Pilihan tidak valid");

        return barang;
    }

    private String mouse() {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("DAFTAR JENIS DAN HARGA MOUSE :");
        System.out.println("1. MOUSE A Rp. 250.000,-");
        System.out.println("2. MOUSE B Rp. 300.000,-");
        System.out.println("3. MOUSE C Rp. 350.000,-");
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        String barang = null;

        //Pengkondisian Pilihan
        if (pilih == 1){
            barang = "MOUSE A";
            System.out.println("Pilihan telah masuk keranjang!\n");
        }
        else if (pilih == 2){
            barang = "MOUSE B";
            System.out.println("Pilihan telah masuk keranjang!\n");
        }
        else if (pilih == 3){
            barang = "MOUSE C";
            System.out.println("Pilihan telah masuk keranjang!\n");
        }
        else
            System.out.println("Maaf, pilihan anda tidak valid");

        return barang;
    }

    private String keyboard() {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("DAFTAR JENIS DAN HARGA KEYBOARD :");
        System.out.println("1. KEYBOARD A Rp. 400.000,-");
        System.out.println("2. KEYBOARD B Rp. 450.000,-");
        System.out.println("3. KEYBOARD C Rp. 500.000,-");
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        String barang = null;

        //Pengkondisian Pilihan
        if (pilih == 1){
            barang = "KEYBOARD A";
            System.out.println("Pilihan telah masuk keranjang!\n");
        }
        else if (pilih == 2){
            barang = "KEYBOARD B";
            System.out.println("Pilihan telah masuk keranjang!\n");
        }
        else if (pilih == 3){
            barang = "KEYBOARD C";
            System.out.println("Pilihan telah masuk keranjang!\n");
        }
        else
            System.out.println("Maaf, pilihan anda tidak valid");

        return barang;
    }

    //KOMPONEN INTERNAL
    private String procie() {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("DAFTAR JENIS DAN HARGA PROCESSOR :");
        System.out.println("1. PROCESSOR INTEL A Rp. 3.000.000,-");
        System.out.println("2. PROCESSOR INTEL B Rp. 3.500.000,-");
        System.out.println("3. PROCESSOR AMD A Rp. 2.500.000,-");
        System.out.println("4. PROCESSOR AMD B Rp. 2.700.000,-");
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        String barang = null;

        //Pengkondisian Pilihan
        if (pilih == 1){
            barang = "PROCESSOR INTEL A";
            System.out.println("Pilihan telah masuk keranjang!\n");
        }
        else if (pilih == 2){
            barang = "PROCESSOR INTEL B";
            System.out.println("Pilihan telah masuk keranjang!\n");
        }
        else if (pilih == 3){
            barang = "PROCESSOR AMD A";
            System.out.println("Pilihan telah masuk keranjang!\n");
        }
        else if (pilih == 4) {
            barang = "PROCESSOR AMD B";
            System.out.println("Pilihan telah masuk keranjang!\n");
        }
        else
            System.out.println("Maaf, pilihan anda tidak valid");

        return barang;
    }

    private String gpu() {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("DAFTAR JENIS DAN HARGA GRAPHICS CARD :");
        System.out.println("1. GRAPHICS CARD NVIDIA Rp. 4.000.000,-");
        System.out.println("2. GRAPHICS CARD RADEON Rp. 3.500.000,-");
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        String barang = null;

        //Pengkondisian Pilihan
        if (pilih == 1){
            barang = "GRAPHICS CARD NVIDIA";
            System.out.println("Pilihan telah masuk keranjang!\n");
        }
        else if (pilih == 2){
            barang = "GRAPHICS CARD RADEON";
            System.out.println("Pilihan telah masuk keranjang!\n");
        }
        else
            System.out.println("Maaf, pilihan anda tidak valid");

        return barang;
    }

    private String ram() {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("DAFTAR JENIS DAN HARGA RAM :");
        System.out.println("1. RAM 4GB DDR4 Rp. 300.000,-");
        System.out.println("2. RAM 8GB DDR4 Rp. 550.000,-");
        System.out.println("3. RAM 16GB DDR4 Rp. 1.000.000,-");
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        String barang = null;

        //Pengkondisian pilihan
        if (pilih == 1) {
            barang = "RAM 4GB DDR4";
            System.out.println("Pilihan telah masuk keranjang!\n");
        }else if (pilih == 2) {
            barang = "RAM 8GB DDR4";
            System.out.println("Pilihan telah masuk keranjang!\n");
        } else if (pilih == 3) {
            barang = "RAM 16GB DDR4";
            System.out.println("Pilihan telah masuk keranjang!\n");
        } else
            System.out.println("Maaf, pilihan tidak valid");

        return barang;

        //Menyimpan harga dan barang
    }

    private String storage() {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("DAFTAR JENIS DAN HARGA STORAGE :");
        System.out.println("SSD 256 GB Rp. 500.000,-");
        System.out.println("SSD 512 GB Rp. 900.000,-");
        System.out.println("HDD 500 GB Rp. 500.000,-");
        System.out.println("HDD 1 TB Rp. 800.000,-");
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        String barang = null;
        int harga;

        //Pengkondisian
        if (pilih==1){
            barang= "SSD 256 GB";
            System.out.println("Pilihan telah masuk keranjang!\n");
        }else if(pilih==2){
            barang= "SSD 512 GB";
            System.out.println("Pilihan telah masuk keranjang!\n");
        }else if(pilih ==3){
            barang = "HDD 500 GB";
            System.out.println("Pilihan telah masuk keranjang!\n");
        }else if ( pilih ==4){
            barang = "HDD 1 TB";
            System.out.println("Pilihan telah masuk keranjang!\n");
        }else{
            System.out.println("Maaf, Pilhan tidak valid");
        }
        return barang;
    }

    private String psu() {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("DAFTAR JENIS DAN HARGA POWER SUPPLY:");
        System.out.println("1. POWER SUPPLY 450W 80+ BRONZE Rp. 450.000,-");
        System.out.println("2. POWER SUPPLY 500W 80+ BRONZE Rp. 500.000,-");
        System.out.println("3. POWER SUPPLY 600W 80+ BRONZE Rp. 650.000,-");
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        String barang = null;

        //Pengkondisian Pilihan
        if (pilih == 1){
            barang = "POWER SUPPLY 450W 80+ BRONZE";
            System.out.println("Pilihan telah masuk keranjang!\n");
        }
        else if (pilih == 2){
            barang = "POWER SUPPLY 500W 80+ BRONZE";
            System.out.println("Pilihan telah masuk keranjang!\n");
        }
        else if (pilih == 3){
            barang = "POWER SUPPLY 600W 80+ BRONZE";
            System.out.println("Pilihan telah masuk keranjang!\n");
        }
        else
            System.out.println("Maaf, Pilihan anda tidak valid");

        return barang;
    }

}
