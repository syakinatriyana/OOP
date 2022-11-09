public class Gaji extends Pegawai{
    private double salary;

    //subclass constructor
    public Gaji(String name, String address, int number, double salary){
        super(name, address, number);
        setSalary(salary);
    }

    public void mailCheck() { /*polymorphism pada konsep overriding
        method ini digunakan untuk menampilkan informasi, method ini ada pada superclass (Pegawai)
        dan subclass (Gaji), namun keduanya memprint informasi yang berbeda, jadi ada dua bentuk method mailCheck()*/
        System.out.println("Memeriksa kelas gaji dalam surat");
        System.out.println("Surat tertuju untuk " + getName() + " dengan gaji " + salary);
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double newSalary){
        if(newSalary >= 0.0){
            salary = newSalary;
        }
    }

    public double computePay(){
        System.out.println("Menghitung pembayaran gaji untuk " + getName());
        return salary/52;
    }
}