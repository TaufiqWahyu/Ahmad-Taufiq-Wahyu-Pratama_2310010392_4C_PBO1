package pelatihan;

public class PesertaPelatihan extends peserta {
    private String bidang;

    public PesertaPelatihan(String nama, int idKaryawan, String bidang) {
        super(nama, idKaryawan);
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    @Override
    public String info() {
        return super.info() + ", Bidang: " + bidang;
    }

    public String info(boolean ringkas) {
        if (ringkas) {
            return getNama() + " (" + bidang + ")";
        } else {
            return info();
        }
    }
}