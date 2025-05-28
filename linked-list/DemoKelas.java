public class DemoKelas {
    public static void main(String[] args) {
        Siswa endy = new Siswa("Endy");

        Kelas k = new Kelas(endy);

        Siswa fikri = new Siswa("Fikri");
        k.tambahDiBelakang(fikri);
        k.tambahDiBelakang(new Siswa("Naufal"));
        k.tambahDiBelakang(new Siswa("Azmi"));
        k.tambahDiBelakang(new Siswa("Rahma"));
        k.tampilkanSemua();

        k.tambahDiDepan(new Siswa("Aisyah"));
        System.out.println("=========================");
        k.tampilkanSemua();

        Integer urutan = 7;
        Siswa x = k.ambilDi(urutan);
        if(x != null) {
            System.out.println("Siswa urutan "+ urutan +" : "+x.nama);
        } else {
            System.out.println("Siswa urutan "+urutan+" tidak ada");
        }
    }
}
