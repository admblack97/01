package a01;

public class Mahasiswa {
    //atribut
    String NPM;
    String nama;
    double IPK;
    char kelas;
    char nilaiPBO1;
    boolean statusAktif;
    
    //behavior
    void infoMhs () {
        System.out.println("NPM     :"+NPM);
        System.out.println("Nama    :"+nama);
        System.out.println("IPK     :"+IPK);
        System.out.println("Kelas   :"+kelas);
        System.out.println("Nilai   :"+nilaiPBO1);
        System.out.println("Status  :"+statusAktif);
        
    }
    
    void isiAbsen (){
        
    }
    
    void ubahNilai (char nilaiBaru) {
        nilaiPBO1=nilaiBaru;
        
    }
}
