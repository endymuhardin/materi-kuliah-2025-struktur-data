public class Kelas {
    Siswa pertama;

    public Kelas(Siswa x){
        pertama = x;
    }

    public void tambahDiBelakang(Siswa s){
        Siswa terakhir = cariTerakhir();
        terakhir.berikutnya = s;
    }

    public void tampilkanSemua(){
        Integer urutan = 0;
        System.out.println("Sekarang urutan ke : "+urutan);

        Siswa sekarang = pertama; //endy
        System.out.println("Siswa sekarang : "+sekarang.nama);

        while(sekarang.berikutnya != null) {
            urutan++;
            System.out.println("Sekarang urutan ke : "+urutan);
            // pindah ke record berikutnya
            sekarang = sekarang.berikutnya; 
            System.out.println("Siswa sekarang : "+sekarang.nama);
            
        }
    }

    private Siswa cariTerakhir(){
        Siswa sekarang = pertama;
        while(sekarang.berikutnya != null){
            sekarang = sekarang.berikutnya;
        }
        return sekarang;
    }
}
