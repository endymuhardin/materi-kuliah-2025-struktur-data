public class Tumpukan {

    Barang palingAtas;

    // bahasa inggrisnya push
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

    // bahasa inggrisnya : pop
    public Barang ambil(){
        Barang atas = palingAtas;
        palingAtas = atas.dibawahnya;
        return atas;
    }

    // bahasa inggrisnya : peek
    public Barang lihatPalingAtas(){
        return palingAtas;
    }

    public Boolean apakahKosong(){
        return palingAtas == null;
    }
    
    public Boolean adaIsinya(){
        return !apakahKosong();
    }
}
