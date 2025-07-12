package pelatihan;

public class SesiPelatihan {
    private PesertaPelatihan[] daftar;
    private int jumlah;

    public SesiPelatihan(int kapasitas) {
        daftar = new PesertaPelatihan[kapasitas];
        jumlah = 0;
    }

    public boolean tambahPeserta(PesertaPelatihan peserta) {
        if (jumlah < daftar.length) {
            daftar[jumlah] = peserta;
            jumlah++;
            return true;
        }
        return false;
    }

    public void tampilkanSemua() {
        for (int i = 0; i < jumlah; i++) {
            System.out.println(daftar[i].info());
        }
    }

    public void tampilkanRingkas() {
        for (int i = 0; i < jumlah; i++) {
            System.out.println("- " + daftar[i].info(true));
        }
    }

    public int getJumlah() {
        return jumlah;
    }
}