public class MataKuliah {
    private String kd_matkul;
    private String nama_matkul;
    private String singkatan;
    private int jumlah_sks;

    public String getKdMatkul() {
        return kd_matkul;
    }

    public String getNamaMatkul() {
        return nama_matkul;
    }

    public String getSingkatan() {
        return singkatan;
    }

    public int getJumlahSks() {
        return jumlah_sks;
    }

    public void setKdMatkul(String matkul) {
        this.kd_matkul = matkul;
    }

    public void setNamaMatkul(String name) {
        this.nama_matkul = name;
    }

    public void setSingkatan(String singkatan) {
        this.singkatan = singkatan;
    }

    public void setJumlahSks(int jml) {
        this.jumlah_sks = jml;
    }
}