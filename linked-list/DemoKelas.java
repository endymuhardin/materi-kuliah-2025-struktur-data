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


        System.out.println("===================");
        System.out.println("Jumlah siswa : "+k.jumlahSiswa());

        Kelas k1 = new Kelas(null);
        System.out.println("Jumlah siswa : "+k1.jumlahSiswa());

        System.out.println("=========================");
        System.out.println("Cari nama Nabila di kelas kosong : " +k1.urutan("Nabila"));
        System.out.println("Cari nama Nabila di kelas berisi : " +k.urutan("Nabila"));
        System.out.println("Cari nama Fikri di kelas berisi : " +k.urutan("Fikri"));
        System.out.println("Cari nama Aisyah di kelas berisi : " +k.urutan("Aisyah"));
        System.out.println("Cari nama Rahma di kelas berisi : " +k.urutan("Rahma"));

        System.out.println("=========================");
        k.tambahSetelah("Azmi", new Siswa("Mutiara"));
        k.tampilkanSemua();
        System.out.println("Jumlah siswa : "+k.jumlahSiswa());

        System.out.println("=========================");
        k1.hapus("Rackisha");
        k1 = new Kelas(new Siswa("Rackisha"));
        System.out.println("Setelah di-add");
        k1.tampilkanSemua();
        k1.hapus("Rackisha");
        System.out.println("Setelah dihapus");
        k1.tampilkanSemua();

        System.out.println("========== Sebelum dihapus ===============");
        k.tampilkanSemua();
        k.hapus("Aisyah");
        System.out.println("========== Setelah hapus pertama ===============");
        k.tampilkanSemua();
        k.hapus("Fikri");
        System.out.println("========== Setelah hapus tengah ===============");
        k.tampilkanSemua();
        k.hapus("Rahma");
        System.out.println("========== Setelah hapus akhir ===============");
        k.tampilkanSemua();
    }

}
