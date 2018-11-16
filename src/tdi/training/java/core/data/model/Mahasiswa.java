package tdi.training.java.core.data.model;

import java.util.List;
import java.util.Map;
import java.time.LocalDate;
import tdi.training.java.core.data.model.Kelas;

public class Mahasiswa extends Kelas{
    private String nim, nama;
    private LocalDate tanggalLahir;
    private Integer angkatan;
    private Kelas kelas;

    public Mahasiswa(String nim, String nama, LocalDate tanggalLahir, Integer angkatan, String namaKelas, String jurusan) {
        super.setNamaKelas(namaKelas);
        super.setJurusan(jurusan);
        this.setNim(nim);
        this.setNama(nama);
        this.setTanggalLahir(tanggalLahir);
        this.setAngkatan(angkatan);
        this.setKelas(kelas);
    }

    public String getNim(){
        return this.nim;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public LocalDate getTanggalLahir(){
        return this.tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public Integer getAngkatan(){
        return this.angkatan;
    }

    public void setAngkatan(Integer angkatan){
        this.angkatan = angkatan;
    }

    public Kelas getKelas(){
        return this.kelas;
    }

    public void setKelas(Kelas kelas){
        this.kelas = kelas;
    }

    public String toString(){
        return String.format("Nim: %s, Nama: %s, Tanggal Lahir: %s, Angkatan: %s, Nama Kelas: %s, Jurusan: %s", getNim(), getNama(), getTanggalLahir(), getAngkatan(), getnamaKelas(), getJurusan());
    }

}