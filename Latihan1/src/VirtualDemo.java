public class VirtualDemo {
    public static void main(String[] args) {
        
        /*Kedua objek dibawah adalah polymorph
        karena keduanya merupakan objek baru di class Gaji, dan class Gaji merupakan turunan dari class Pegawai
        jadi kedua objek tersebut merupakan bagian dari class Gaji sekaligus bagian dari class Pegawai
        sama seperti contoh :
        kucing merupakan objek baru dari class mamalia
        class mamalia merupakan turunan dari class hewan
        jadi, kucing merupakan mamalia dan kucing juga merupakan hewan
        */
        
        Gaji s = new Gaji("Wahyu", "KUBAR", 3, 5000.00);
        Pegawai e = new Gaji("Ini nama", "Samarinda", 2, 2500.00); //upcasting
        /*Kenapa upcasting? karena disini bisa kita lihat bahwa objek e merupakan objek dengan tipe data pegawai,
        dimana pegawai merupakan parent class. Tapi objek e di definisikan sebagai objek baru pada class Gaji
        Jadi terjadi typecast child object to parent object -> upcasting
        */

        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
        s.mailCheck();
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai --");
        e.mailCheck();
        

        /*Alasan kenapa output "Menyusun Pegawai" ada 2 : 

        karena penggunaan super() pada constructor di subclass (class Gaji) memanggil 
        constructor superclass (class Pegawai).

        Penjelasan :

        saat kita membuat objek s dan e sebagai objek baru dari class Gaji dan 
        memasukkan nama, address, number, serta salary
        program akan melihat parameter2 tersebut dan mencari constructor dengan parameter2 yang sama,
        karena objek yang dibuat itu di class Gaji, maka program akan melihat constructor di class Gaji
        dan benar bahwa di class Gaji terdapat constructor untuk parameter2 tersebut
        tapi, di constructor class Gaji ada keyword super() untuk nama, address dan number.
        Hanya salary saja yg di set di class Gaji.

        kenapa ada keyword super()?
        karena saat kita membuat constructor pada subclass (Gaji), maka kita perlu membuat constructor 
        yang matching pada superclassnya (Pegawai), matching disini maksudnya pada parameter dari constructor tsb.
        Jika kita tidak membuat, maka akan terjadi error dan menampilkan pesan :
        "Implicit super constructor ... is undefined. Must explicitly invoke another constructor"

        Nah, apa yang dilakukan super() pada constructor di class Gaji?
        super() memanggil constructor pada superclass (class Pegawai) untuk nama, address dan number

            public Pegawai (String name, String address, int number) {
                System.out.println("Menyusun Pegawai");
                this.name = name;
                this.address = address;
                this.number = number;
            }

        pada constructor di class Pegawai ini, program akan langsung mencetak kalimat "Menyusun Pegawai" 
        dan memasukkan nilai dari nama, alamat, dan number dari objek yang dibuat. 
        
        Karena ada 2 objek yang dibuat, maka akan terjadi proses eksekusi constructor Pegawai untuk masing2 objek
        sehingga output dari program terdapat 2 baris kalimat "Menyusun Pegawai" berturut-turut.

        Hal ini bisa terjadi diakibatkan oleh class Gaji yang merupakan turunan atau extends dari class Pegawai.
         */
    }
}
