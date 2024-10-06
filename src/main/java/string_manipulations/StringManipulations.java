package string_manipulations;

public class StringManipulations {
    public static void main(String[] args) {

   //     1.)Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda yazdırınız.
        //     Örnek:
        //     mIAMI - Miami
        //     miami - Miami
        //     MIAMI - Miami
        //     mIaMi - Miami vb.

        String sehirIsmi =" mIAMI";
        String konsolSehirIsmi = sehirIsmi.trim().toLowerCase();
        konsolSehirIsmi= konsolSehirIsmi.substring(0,1).toUpperCase()+konsolSehirIsmi.substring(1);
        System.out.println(konsolSehirIsmi);

        System.out.println("//-------------------------------------");

        //2.) Kısa isimler için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki karakter sayısının toplamını yazdırınız.
        // Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.

        String isim1 = "Alper Muslum Devir";
        String isim2 = "Erdogan Devir";
        String isim3 = "Tugay Akoglu";

        Integer c1 =isim1.replaceAll("\\s","").length();
        Integer c2 =isim2.replaceAll("\\s","").length();
        Integer c3 =isim3.replaceAll("\\s","").length();
        System.out.println("Bosluk olmadan uc ismin oplam karakter sayisi: " + (c1+c2+c3));

        System.out.println("//-------------------------------------");


        //3.) Bir String değişkeni oluşturunuz, String’deki toplam alfabetik ve sayısal karakter sayısını konsolda yazdırınız.
        // Örnek: String : ’ Miami 33018!!! ’ ise konsolda 10 yazdırmanız gerekir.

        String s = " Miami 33018!!! ";
        Integer karakterSayisi =s.replaceAll("\\s","").replaceAll("[^A-Za-z0-9]","").length();
        System.out.println("Toplam Alfabetik ve sayisal karakter sayisi: "+ karakterSayisi);

        System.out.println("//-------------------------------------");

        //4.) Bir String değişkeni oluşturunuz, String’deki rakam olmayan karakterlerin sayısını konsolda yazdırınız.
        // Örnek: String: ‘1a3Bcf4!..’ ise konsolda 8 yazdırmanız gerekir.





    }
}
