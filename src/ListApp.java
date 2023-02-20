import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        // tugas a
        List<String> foods = new ArrayList<String>();
        List<String> namefood = List.of("Rujak","Soto","Sate","Nasi goreng","Mie ayam","Ayam geprek","Nasi bebek","Pecel","Tongseng","Gulai kambing");
        foods.addAll(namefood);
        System.out.println("======== List 10 makanan ========");
        for (var food : foods ) {
            System.out.println(food);
        }


        // tugas b
        List<Integer> tahunPildun = new ArrayList<Integer>();
        List<Integer> semuaTahun = List.of(1982,1986,1990,1994,1998,2002,2006,2010,2014,2018,2022);
        tahunPildun.addAll(semuaTahun);
        System.out.println("\n======== List Tahun Piala Dunia ========");
        for (var tahun : tahunPildun ) {
            System.out.println(tahun);
        }


        // tugas c
        List<String> provinsi = new ArrayList<String>();
        List<String> data = List.of("Jawa Timur","Jawa Tengah","Jawa Barat","Lampung","Bangka Belitung","Banda Aceh","Lampung","Bali","Lombok","NTT","NTB","Papua","Papua Barat","Papua Pegunungan","Sulawesi Selatan","Sulawesi Utara","Kalimantan Selatan","Kalimantan Utara","Kalimantan Barat");
        provinsi.addAll(data);
        System.out.println("\n======== List Provinsi Random ========");
        for (var prov : provinsi ) {
            System.out.println(prov);
        }

        Collections.sort(provinsi,Collections.reverseOrder());
        System.out.println("\n======== List Provinsi Desc ========");
        for (var prov : provinsi ) {
            System.out.println(prov);
        }


        // tugas d
        List<String> programerLang = new ArrayList<String>();
        List<String> listLang = List.of("HTML","CSS","PHP","JAVA SCRIPT","JAVA","C++","C","C#","PYTHON","GO","PASCAL","RUBY");
        programerLang.addAll(listLang);
        System.out.println("\n======== List Programmer Language ========");
        for (var lang : programerLang ) {
            System.out.println(lang);
        }

        programerLang.remove(10);
        programerLang.remove(1);
        programerLang.remove(5);
        programerLang.remove(6);
        programerLang.remove(0);
        System.out.println("\n======== List Programmer Language Deleted 5 Data ========");
        for (var lang : programerLang ) {
            System.out.println(lang);
        }


    }
}
