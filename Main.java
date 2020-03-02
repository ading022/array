// import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // cara pertama
    // String [] nama = {"abu", "andika", "candra", "taupik"};
    // System.out.print(nama[0]);

    //cara kedua
    // String nama[] = {"abu", "andika", "candra", "taupik"};
    // System.out.print(nama[1]);

    // String [] buah = {"jambu", "nanas", "apel", "strawbery"};
    // for (int i = 0; i < buah.length; i++) {
    //     System.out.println(buah[i]);
    // }

    //cara ketiga
    // String[] buah = new String[5];
    // Scanner scan = new Scanner(System.in);
    // for (int i = 0; i < buah.length; i++){
    //  System.out.print("Buah ke-" + i + ": ");
    //  buah[i] = scan.nextLine();
    //  }
    // System.out.println("--------------------------");
    //  for (String b : buah){
    //      System.out.println(b);
    //  }

    //array pengulangan 2 dimensi
    // String [] [] Kontak = {{"Mas alex","08242"}, {"Andika","09267"}, {"Candra","94920"}, {"Taufik","23562"}, {"Gading","08439"}};

    // for (int i = 0; i < Kontak.length; i++) {
    //     System.out.println("Nama: " + Kontak[i][0]);
    //     System.out.println("Mobile: " + Kontak[i][1]);
    //     System.out.println("--------------------------");
    // }

    // array pengulangan 3 dimensi
    String [] [] Biodata = {{"Mas alex","19","Temuguruh"}, {"Andika","20","Jajag City"}, {"Candra","18","Genteng Kulon"}, {"Taufik","20","Genteng Kulon"}, {"Gading","19","Genteng Wetan"}};

    for (int i = 0; i < Biodata.length; i++) {
        System.out.println("Nama: " + Biodata[i][0]);
        System.out.println("Umur: " + Biodata[i][1]);
        System.out.println("Alamat: " + Biodata[i][2]);
        System.out.println("----------------");
    }






  }
}