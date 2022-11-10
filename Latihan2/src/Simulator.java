public class Simulator {
    public static void main(String[] args) {
        /*Asumsi jam sibuk tiap orang :
        Mahasiswa 1 -> Firman -> 60/3 -> 20 sks
        Mahasiswa 2 -> Nid to pass this sem -> 69/3 -> 23 sks
        Asdos 1 -> Fairuzikun -> 73 -> 24 sks + 1 jam ngasdos / 23 sks + 4 jam ngasdos
        Asdos 2 -> Angel-chan -> 64 -> 21 sks + 1 jam ngasdos / 20 sks + 4 jam ngasdos / 19 sks + 7 jam
        Dosen 1 -> Raja OP Damanik -> 40/8 -> 5 hari kerja
        Dosen 2 -> Nivotko -> 24/8 -> 3 hari
        */

        //Polymorphism pada semua objek dibawah, karena masing2 objek paling tidak memiliki 2 bentuk
        Elemen mhs1 = new Mahasiswa("Firman", 20); //Upcasting
        Mahasiswa mhs2 = new Mahasiswa("Nid to pass this sem", 23);
        Elemen asdos1 = new Asdos("Fairuzikun", 23 , 4); //Upcasting
        Asdos asdos2 = new Asdos("Angel-chan", 19, 7); 
        Elemen dosen1 = new Dosen("Raja OP Damanik", 5); //Upcasting
        Dosen dosen2 = new Dosen("Nivotko", 3); 

        asdos1.display();
        dosen1.display();
        asdos2.display();
        mhs1.display();
        mhs2.display();
        dosen2.display();

        int total = asdos1.getJamSibuk() + dosen1.getJamSibuk() + asdos2.getJamSibuk() + mhs1.getJamSibuk() + 
                    mhs2.getJamSibuk() + dosen2.getJamSibuk();
        System.out.println("Total jam sibuk elemen Fasilkom adalah " + total);
    }
}
