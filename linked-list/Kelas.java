public class Kelas {
    Siswa pertama;

    public Kelas(Siswa x){
        pertama = x;
    }

    public Siswa ambilDi(Integer index){ // 5
        Integer urutan = 0;
        Siswa sekarang = pertama; //aisyah

        // urutan = 7, siswa = null
        while(true) {
            if(urutan == index) {
                return sekarang;
            }

            // robustness : bisa menghandel inputan yang tidak benar
            if(sekarang.berikutnya == null){
                return null;
            }

            urutan++;
            // pindah ke record berikutnya
            sekarang = sekarang.berikutnya; 
        }
    }

    public Integer urutan(String nama){
        Integer urutan = 0;
        Siswa sekarang = pertama;

        // supaya robust
        if(sekarang == null){
            return null;
        }

        if(nama.equals(sekarang.nama)) {
            return urutan;
        }

        while(sekarang.berikutnya != null){
            urutan++;
            sekarang = sekarang.berikutnya;

            if(nama.equals(sekarang.nama)) {
                return urutan;
            }
        }
        return null;
    }

    public Integer jumlahSiswa(){
        Integer jumlah = 0;
        Siswa sekarang = pertama;

        // supaya robust
        if(sekarang == null){
            return jumlah;
        }

        jumlah++;  //1
        while(sekarang.berikutnya != null){
            jumlah++;
            sekarang = sekarang.berikutnya;
        }
        return jumlah;
    }

    public void tambahDiDepan(Siswa s){
        s.berikutnya = pertama;
        pertama = s;
    }

    public void tambahSetelah(String nama, Siswa s){
        // menggunakan method yang sudah ada, tapi sebetulnya lemot
        // TODO: bahas di sesi tentang notasi O
        Integer urutan = urutan(nama);

        // robustness
        // kalau tidak ketemu, throw exception element tidak ketemu
        if(urutan == null) {
            throw new IllegalArgumentException(nama + " tidak ada di dalam kelas ini");
        }

        // kondisi existing
        Siswa x = ambilDi(urutan);
        Siswa setelahX = x.berikutnya;

        // selipkan s setelah x
        x.berikutnya = s;
        s.berikutnya = setelahX;
    }

    public void hapus(String nama){
        Siswa sekarang = pertama;

        // kelas kosong, tidak ada yang dihapus
        if(sekarang == null){
            return;
        }

        // kalau yang dihapus elemen pertama, 
        // cukup pindahkan status pertama ke element berikutnya
        // nanti test : 
        // - hapus elemen pertama dari list berisi banyak
        // - hapus elemen pertama dari list berisi satu
        // - hapus elemen pertama dari list kosong
        if(nama.equals(sekarang.nama)) {
            if(sekarang.berikutnya != null) {
                pertama = sekarang.berikutnya;
            } else {
                pertama = null;
            }
            return;
        }

        // nanti test :
        // - hapus elemen tengah
        // - hapus elemen terakhir
        while(sekarang.berikutnya != null){
            Siswa sebelumnya = sekarang;
            sekarang = sekarang.berikutnya;

            if(nama.equals(sekarang.nama)) {
                if(sekarang.berikutnya != null) {
                    sebelumnya.berikutnya = sekarang.berikutnya;
                } else {
                    sebelumnya.berikutnya = null;
                }
                return;
            }
        }
        return;
    }

    public void tambahDiBelakang(Siswa s){
        Siswa terakhir = cariTerakhir();
        terakhir.berikutnya = s;
    }

    public void tampilkanSemua(){
        Integer urutan = 0;
        System.out.println("Sekarang urutan ke : "+urutan);

        Siswa sekarang = pertama;
        if(sekarang == null) {
            System.out.println("Kelas kosong");
            return;
        }
        System.out.println("Siswa sekarang : "+ sekarang.nama);

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
