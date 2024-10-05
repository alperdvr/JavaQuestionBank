package Variables;

import java.util.Scanner;

public class Gun01 {
    public static void main(String[] args) {

        //  1) Herhangi bir 3 öğenin fiyatları için double veri tipinde değişkenler oluşturunuz. Fiyatların toplamını konsola yazdırınız.


        double gFiyat = 15.55;
        double sFiyat = 17.21;
        double aFiyat = 8.75;

        double tFiyat = gFiyat + sFiyat + aFiyat;

        System.out.println("Toplam Fiyat : " + tFiyat);

        System.out.println("//-------------------------------------");

        //  Herhangi bir 3 öğe için float, long ve integer veri tipinde değişkenler oluşturunuz. Bu değişkenlerin değerlerinin çarpımını konsolda yazdırınız.

        float a = 15.87F;
        long b = 12L;
        int c = 14;
        System.out.println("Degisken Carpimi : " + a * b * c);

        //        Çarpma İşlemi:
        //        int → long: İlk adımda, int türündeki c, long türüne genişletilir. Bu, veri kaybını önlemek için yapılır. Şu an elimizde long * long durumu vardır.
        //        long → float: Daha sonra, long türündeki b ile float türündeki a çarpılırken, Java daha küçük bir tür olan long'u float türüne genişletir.
        //        Sonuç olarak, çarpım işlemi float türünde bir sonuç verir.
        //
        //                Sonuç:
        //        Çıktının türü float olur.

        System.out.println("//-------------------------------------");

        // 3) Bas!t fa!z! bulmak !ç!n b!r kod yazınız.

        int anaPara = 10000;
        int oran = 6;
        int yilDegeri = 3;

        int basitFaiz = anaPara * oran * yilDegeri / 100;
        System.out.println("Basit Faiz Degeri: " + basitFaiz);

        System.out.println("//-------------------------------------");

        //4.Bir String ve iki long data tipinde değişken oluşturunuz. Konsolda bu long değişkenlerin toplamını ve çarpımını String ile yazdırınız.

        String s1 = "Sonuc: ";
        Long a1 = 123L;
        Long b1 = 9123456782L;
        System.out.println(s1 + (a + b));
        System.out.println(s1 + a1 * b1);

        System.out.println("//-------------------------------------");

        //  5 Değerleri farklı olan iki boolean veri tipinde değişken oluşturunuz ve bu değerleri iki ardışık değer arasında boşluk bırakacak şekilde aynı satırda yazdırınız.

        boolean x = true;
        boolean y = false;

        System.out.println(x + " " + y);

        System.out.println("//---------------------------------------");


        //6.) 3 öge (k!tap, defter ve laptop) f!yatı !ç!n long data t!p!nde deg!skenler olusturunuz. Konsolda 2 k!tap, 4 defter ve 3 laptop !ç!n toplam f!yatını yazdırınız.

        float kitap = 12.99F;
        float defter = 23.45F;
        float laptop = 34.12F;

        float toplamFiyat = 2 * kitap + 4 * defter + 3 * laptop;
        System.out.println("Toplam Fiyat : " + toplamFiyat);


        System.out.println("//-------------------------------------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 2 Sayi Giriniz");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        System.out.println("Degistirmeden once: " + n1 + " -- " + n2);

        //1.yol degisken kullanarak
        double bos = n1;
        n1 = n2;
        n2 = bos;
        System.out.println("Degistirildikten sonra: " + n1 + " -- " + n2);






//        //2.yol degisken kullanmadan
//        n1 = n1 + n2;
//        n2 = n1 - n2;
//        n1 = n1 - n2;
//        System.out.println("Degistirildikten sonra: " + n1 + "-" + n2);


    }
}
