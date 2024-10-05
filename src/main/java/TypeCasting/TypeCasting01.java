package TypeCasting;

public class TypeCasting01 {
    public static void main(String[] args) {

    //1) Short data t!p!nde b!r deg!sken olusturunuz ve onu b!r !nt deg!sken!ne dönüstürünüz.

        short yas = 30;
        int yeniYas = yas;
        System.out.println("Yeni Yas: " + yeniYas);

        System.out.println("//-------------------------------------");

       // 2) Long data t!p!nde b!r deg!sken olusturunuz ve onu b!r !nt deg!sken!ne dönüstürünüz.

        long yas1= 12L;
        int yeniYas1= (int) yas1;
        System.out.println(yeniYas1);

        System.out.println("//-------------------------------------");

       // 3) Double data t!p!nde b!r deg!sken olusturunuz ve onu b!r float deg!sken!ne dönüstürünüz.

        double fiyat= 1.2;
        short yeniFiyat = (short) fiyat;
        System.out.println(yeniFiyat);

        System.out.println("//-------------------------------------");

      //  4) Double data t!p!nde b!r deg!sken olusturunuz ve onu b!r short deg!sken!ne dönüstürünüz.Sonrasında bu short deg!sken!n deger!n! konsolda yazdırınız.
        //  Not : Çıktıya dikkat ediniz, ondalık bir deger olmayacaktır.

        double fiyat1= 1.2;
        short yeniFiyat1 = (short) fiyat;
        System.out.println(yeniFiyat);

        System.out.println("//-------------------------------------");

       //5.) Byte data tipinde bir değişken oluşturunuz ve onu bir double değişkenine dönüştürünüz. Sonrasında bu double değişkenin değerini konsolda yazdırınız. Not: Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır.

        byte age = 29;
        double newAge = age;
        System.out.println(newAge);

        System.out.println("//-------------------------------------");



    }
}
