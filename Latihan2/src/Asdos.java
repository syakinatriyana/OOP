public class Asdos extends Mahasiswa{
    private int jamNgasdos;

    //constructor subclass
    public Asdos(String nama, int sks, int jamNgasdos){
        super(nama, sks); 
        setJamNgasdos(jamNgasdos);
    }

    //Polymorphism pada konsep overriding
    public int getJamSibuk(){
        //Menggunakan getJamSibuk() milik Mahasiswa untuk menghitung getJamSibuk() milik Asdos
        jamSibuk = super.getJamSibuk() + jamNgasdos;
        return jamSibuk;
    }

    public void display(){
        System.out.println(getNama() + " adalah seorang asdos dengan jam sibuk " + getJamSibuk());
    }

    public void setJamNgasdos(int jlhJamNgasdos){
        if(jlhJamNgasdos > 0){
            jamNgasdos = jlhJamNgasdos;
        }
    }
}
