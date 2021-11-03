public class Krs {
    private int kd_krs;
    private String kelas;
    private int semester;

    public int getKdKrs() {
        return kd_krs;
    }

    public String getKelas() {
        return kelas;
    }

    public int getSemester() {
        return semester;
    }

    public void setKdKrs(int krs) {
        this.kd_krs = krs;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setSemester(int smster) {
        this.semester = smster;
    }

    public void max(int semester) {
        if (semester > 8) {
            System.out.println("Semester Tidak benar");
        } else {
            System.out.println("Anda mahasiswa Semester : " + this.semester);
        }
    }
}