public class Mahasiswa extends Elemen{
    private int SKS;

    //constructor subclass
    public Mahasiswa(String nama, int SKS){
        super(nama);
        setSKS(SKS);
    }

    //Polymorphism pada konsep overriding
    public int getJamSibuk(){
        jamSibuk = SKS * 3;
        return jamSibuk;
    }

    public void display(){
        System.out.println(getNama() + " adalah seorang mahasiswa dengan jam sibuk " + getJamSibuk());
    }

    public void setSKS(int jlhSks){
        if(jlhSks > 0){
            SKS = jlhSks;
        }
    }
}
