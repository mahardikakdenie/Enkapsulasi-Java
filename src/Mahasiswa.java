public class Mahasiswa {
    private char nim;
    private String nama_mhs;
    private String alamat_mhs;

    public char getNim() {
        return nim;
    }

    public String getNamaMhs() {
        return nama_mhs;
    }

    public String getAlamatMhs() {
        return alamat_mhs;
    }

    public void setNim(char nim) {
        this.nim = nim;
    }

    public void setNamaMhs(String name) {
        this.nama_mhs = name;
    }

    public void setAlamatMhs(String alamat) {
        this.alamat_mhs = alamat;
    }
}