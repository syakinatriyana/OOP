public class Pegawai {
    private String name;
    private String address;
    private int number;

    //constructor
    public Pegawai (String name, String address, int number) {
        System.out.println("Menyusun Pegawai");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void mailCheck() { /*polymorphism pada konsep overriding
        method ini digunakan untuk menampilkan informasi, method ini ada pada superclass (Pegawai)
        dan subclass (Gaji), namun keduanya memprint informasi yang berbeda, jadi ada dua bentuk dari method mailCheck()*/
        System.out.println("Memeriksa surat untuk " + this.name + " " + this.address);
    }

    public String toString(){
        return name + " " + address + " " + number;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String newAddress){
    }
}