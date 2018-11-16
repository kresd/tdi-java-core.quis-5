import java.util.HashMap;
import java.util.Map;

public class lat1_2 {
    public static void main(String[] args) {

        Map<String, String> mahasiswa = new HashMap<>();
        mahasiswa.put("001", "Muhammad Yusuf");
        mahasiswa.put("002", "Dimas Maryanto");
        mahasiswa.put("006", "Hari Sapto Adi");
        mahasiswa.put("007", "Putri Harahap");
        mahasiswa.put("008", "Dewa Nyoman Santosa");
        mahasiswa.put("009", "Hariaty");
        mahasiswa.put("010", "Karina Virgi");
        
        String valueOf010 = mahasiswa.get("010");

        System.out.println("Nama saya " + valueOf010 + ", nipnya 010");
    }    
}