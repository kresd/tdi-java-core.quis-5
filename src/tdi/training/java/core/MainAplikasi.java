package tdi.training.java.core;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

import tdi.training.java.core.data.model.Kelas;
import tdi.training.java.core.data.model.Mahasiswa;

public class MainAplikasi{
    public static void main(String[] args) {
        
        List<Mahasiswa> dataMhs = new ArrayList<>();
        dataMhs.add(new Mahasiswa("10511148","Dimas Maryanto",LocalDate.of(1992,03,11), 2014, "IF", "Teknik Informatika"));
        dataMhs.add(new Mahasiswa("10511150","Muhammad Yusuf",LocalDate.of(1994,01,20), 2014, "SI", "Sistem Informasi"));
        dataMhs.add(new Mahasiswa("10511170","Adib",LocalDate.of(1995,02,12), 2014, "IF", "Teknik Informatika"));
        dataMhs.add(new Mahasiswa("10511160","Hari Sapto Adi",LocalDate.of(1991,03,15), 2014, "SI", "Sistem Informasi"));
        dataMhs.add(new Mahasiswa("10511110","Hariaty",LocalDate.of(1992,04,16), 2014, "IF", "Teknik Informatika"));

        
        dataMhs.forEach(data ->{
            System.out.println(data.toString());
        });
    }
}
