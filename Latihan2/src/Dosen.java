public class Dosen extends Elemen{
    private int jumlahHariKerja;

    //constructor subclass
    public Dosen(String nama, int jumlahHariKerja){
        super(nama);
        setJumlahHariKerja(jumlahHariKerja);
    }

    //Polymorphism pada konsep overriding
    public int getJamSibuk(){
        jamSibuk = jumlahHariKerja * 8;
        return jamSibuk;
    }

    public void display(){
        System.out.println(getNama() + " adalah seorang dosen dengan jam sibuk " + getJamSibuk());
    }

    public void setJumlahHariKerja(int hariKerja){
        if(hariKerja > 0){
            jumlahHariKerja = hariKerja;
        }
    }
}
