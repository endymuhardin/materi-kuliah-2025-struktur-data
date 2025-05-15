public class DemoKelas {
    public static void main(String[] args) {
        Siswa endy = new Siswa("Endy");

        Kelas k = new Kelas(endy);

        Siswa fikri = new Siswa("Fikri");
        k.tambah(fikri);
        k.tambah(new Siswa("Naufal"));
        k.tambah(new Siswa("Azmi"));
        k.tambah(new Siswa("Rahma"));
        k.tampilkanSemua();
    }
}
