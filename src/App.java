public class App {
    public static void main(String[] args) throws Exception {
        Dosen dosen = new Dosen();
        dosen.setNamaDosen("bolu");
        System.out.println(dosen.getNamaDosen());

        Nilai value = new Nilai();
        value.setAbsen(2);
        value.setTugas(2);
        value.setUts(2);
        value.setUas(2);

        System.out.println(value.sum(value.getAbsen(), value.getTugas(), value.getUts(), value.getUas()));

        Jadwal jadwal = new Jadwal();
        jadwal.setPeriode(2);
        jadwal.setHari("Senin");
        jadwal.setJamMasuk(9);
        jadwal.setJamKeluar(10);
        jadwal.getTotalTime();

        MataKuliah mataKuliah = new MataKuliah();
        mataKuliah.setNamaMatkul("Kalkulus");
        System.out.println(mataKuliah.getNamaMatkul());

        Ruang ruang = new Ruang();
        ruang.setKdRuang('Y');
        System.out.println(ruang.getKdRuang());

        Krs krs = new Krs();
        krs.setSemester(2);
        krs.max(krs.getSemester());

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNamaMhs("Kurniawan");
        System.out.println(mahasiswa.getNamaMhs());
    }
}
