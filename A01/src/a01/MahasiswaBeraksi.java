package a01;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        //ini adalah instance (pembuatan objek dengan nama objek
        Mahasiswa m1 = new Mahasiswa();
        //
        
        //mengisi atribut objek
        m1.NPM = "16.63.0007";
        m1.nama = "AAD";
        m1.IPK = 3.2;
        m1.kelas = 'A';
        m1.nilaiPBO1 = 'A';
        m1.statusAktif = true;
        
        //menjalankan method objek
        m1.infoMhs();
        
        m1.ubahNilai('C');
        System.out.println("Nilai Baru : "+m1.nilaiPBO1);
    }
}
