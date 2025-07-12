package pelatihan;

public class peserta {
    private String nama;
    private int idKaryawan;

    public peserta(String nama, int idKaryawan) {
        this.nama = nama;
        this.idKaryawan = idKaryawan;
    }

    public String getNama() {
        return nama;
    }

    public int getIdKaryawan() {
        return idKaryawan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setIdKaryawan(int idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String info() {
        return "Nama: " + nama + ", ID: " + idKaryawan;
    }
}