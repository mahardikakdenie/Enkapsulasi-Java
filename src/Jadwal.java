public class Jadwal {
    private int periode;
    private String hari;
    private int jam_masuk;
    private int jam_keluar;

    public int getPeriode() {
        return periode;
    }

    public String getHari() {
        return hari;
    }

    public int getJamMasuk() {
        return jam_masuk;
    }

    public int getJamKeluar() {
        return jam_keluar;
    }

    public void setPeriode(int periode) {
        this.periode = periode;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public void setJamMasuk(int masuk) {
        this.jam_masuk = masuk;
    }

    public void setJamKeluar(int keluar) {
        this.jam_keluar = keluar;
    }

    public void getTotalTime() {
        if (this.jam_masuk > this.jam_keluar) {
            System.out.println("Data Error");
        } else {
            int tot = this.jam_keluar - this.jam_masuk;

            System.out.println("Total Jam nya adalah : " + tot);
        }
    }
}