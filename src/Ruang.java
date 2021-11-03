public class Ruang {
    private char kd_ruang;
    private String ket_ruang;
    private String lokasi;

    public char getKdRuang() {
        return kd_ruang;
    }

    public String getketRuang() {
        return ket_ruang;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setKdRuang(char kd) {
        this.kd_ruang = kd;
    }

    public void setKetRuang(String ket) {
        this.ket_ruang = ket;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
}