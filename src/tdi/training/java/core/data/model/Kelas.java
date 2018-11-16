package tdi.training.java.core.data.model;

public class Kelas{
    private String namaKelas;
    private Integer tahunAjaran;
    private String jurusan;
    
    public String getnamaKelas(){
        return this.namaKelas;
    }

    public void setNamaKelas(String namaKelas){
        this.namaKelas = namaKelas;
    }

    public Integer getTahunAjaran(){
        return this.tahunAjaran;
    }

    public void setTahunAjaran(Integer tahunAjaran) {
        this.tahunAjaran = tahunAjaran;
    }

    public String getJurusan(){
        return this.jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;

    }
}