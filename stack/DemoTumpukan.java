public class DemoTumpukan {
    public static void main(String[] args) {
        Tumpukan t = new Tumpukan();

        // belum diisi
        System.out.println("Apakah kosong ? "+t.apakahKosong());
        
        Barang meja = new Barang("Meja");
        Barang keyboard = new Barang("Keyboard");
        Barang mouse = new Barang("Mouse");

        t.tumpuk(meja);
        t.tumpuk(keyboard);
        t.tumpuk(mouse);

        t.lihatIsiTumpukan();

        System.out.println("Apakah kosong ? "+t.apakahKosong());

        System.out.println("Lihat paling atas : "+t.lihatPalingAtas().nama);
        System.out.println("Lihat paling atas : "+t.lihatPalingAtas().nama);
        System.out.println("Lihat paling atas : "+t.lihatPalingAtas().nama);

        /* karena berulang, kita konversi jadi loop
        System.out.println("Ambil paling atas : "+ (t.kosongkah() ? "Sudah habis" : t.ambil().nama));
        System.out.println("Ambil paling atas : "+ (t.kosongkah() ? "Sudah habis" : t.ambil().nama));
        System.out.println("Ambil paling atas : "+ (t.kosongkah() ? "Sudah habis" : t.ambil().nama));
        System.out.println("Ambil paling atas : "+ (t.kosongkah() ? "Sudah habis" : t.ambil().nama));
         */

        while(t.adaIsinya()) {
            System.out.println("Ambil paling atas : "+ t.ambil().nama);    
        }
        
        System.out.println("Sudah habis");
    }
}
