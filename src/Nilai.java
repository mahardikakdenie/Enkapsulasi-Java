public class Nilai {
    private int tugas;
    private int absen;
    private int uts;
    private int uas;

    public int getTugas() {
        return tugas;
    }

    public void setTugas(int tugas) {
        this.tugas = tugas;
    }

    public int getAbsen() {
        return absen;
    }

    public void setAbsen(int absen) {
        this.absen = absen;
    }

    public int getUts() {
        return uts;
    }

    public void setUts(int uts) {
        this.uts = uts;
    }

    public int getUas() {
        return uas;
    }

    public void setUas(int uas) {
        this.uas = uas;
    }

    public int sum(int tugas, int absen, int uts, int uas) {
        int sum = tugas + absen + uts + uas;

        return sum;
    }

}