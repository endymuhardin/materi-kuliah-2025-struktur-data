public class Tumpukan {

    Barang palingAtas;

    public void tumpuk(Barang b){
        b.dibawahnya = palingAtas;
        palingAtas = b;
    }

    public void lihatIsiTumpukan(){
        if(palingAtas == null){
            System.out.println("Tumpukan kosong");
            return;
        }

        Barang sekarang = palingAtas;
        System.out.println("Barang : "+sekarang.nama);

        while(sekarang.dibawahnya != null) {
            sekarang = sekarang.dibawahnya;
            System.out.println("Barang : "+sekarang.nama);
        }
    }

    public Barang ambil(){
        return null;
    }

    public Barang lihatPalingAtas(){
        return null;
    }

    public Boolean kosongkah(){
        return null;
    }
}
