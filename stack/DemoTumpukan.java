public class DemoTumpukan {
    public static void main(String[] args) {
        Tumpukan t = new Tumpukan();
        
        Barang meja = new Barang("Meja");
        Barang keyboard = new Barang("Keyboard");
        Barang mouse = new Barang("Mouse");

        t.tumpuk(meja);
        t.tumpuk(keyboard);
        t.tumpuk(mouse);

        t.lihatIsiTumpukan();
    }
}
