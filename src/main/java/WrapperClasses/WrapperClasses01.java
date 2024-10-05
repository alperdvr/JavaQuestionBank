package WrapperClasses;

public class WrapperClasses01 {
    public static void main(String[] args) {


        //1.)Byte data tipinin minimum değeri ile short data tipinin maksimum değerinin toplamını bulmak için bir kod yazınız.

        byte min = Byte.MIN_VALUE;
        short max = Short.MAX_VALUE;
        System.out.println(min+max);

        System.out.println("//-------------------------------------");

        //2.) Data tipi String olan “103” değerini byte data tipine dönüştürmek için bir kod yazınız ve yine data tipi String olan “2351” değerini short data tipine dönüştürüp konsolda iki değişken arasındaki farkı yazdırınız.

        byte sayi1 = Byte.valueOf("103");
        short sayi2 = Short.valueOf("2351");
        System.out.println(sayi2-sayi1);

        System.out.println("//-------------------------------------");

      //3.) valueOf(String s) ile parseByte(String s) metodları arasındaki farklar nelerdir?

      /*  valueOf(String s) ve parseByte(String s) yöntemleri arasındaki farklar, her bir metodun işlevi ve geri döndürdüğü değer türüyle ilgilidir. Aşağıda her iki metodun temel farkları açıklanmaktadır:

        1. Geri Döndürdükleri Türler
        valueOf(String s): Bu yöntem, belirli bir String değeri ilgili sayısal türde bir nesneye (wrapper class) dönüştürür. Örneğin, Byte.valueOf(String s) çağrıldığında bir Byte nesnesi döndürür.
                Döndürdüğü tür: Byte (wrapper class)
        parseByte(String s): Bu yöntem ise String değeri doğrudan ilkel (primitive) bir veri türüne çevirir. Yani, String bir değeri bir byte primitive türüne dönüştürür.
        Döndürdüğü tür: byte (primitive type)
        2. Kullanım Amacı
        valueOf(String s): Bu metot, bir String değerini dönüştürerek bir Byte nesnesi oluşturmak için kullanılır. Eğer bir Byte wrapper nesnesi ile çalışmak istiyorsanız, valueOf tercih edilmelidir.
        parseByte(String s): Bu metot, String değerini ilkel byte türüne dönüştürmek için kullanılır. Nesne değil, ilkel veri türü ile çalışıyorsanız, parseByte kullanmanız daha uygundur.
        3. Performans
        valueOf(String s): Bir nesne (Byte) oluşturduğundan, bu metodun biraz daha fazla bellek tüketimi olabilir. Çünkü bir ilkel veri türü (byte) yerine bir nesne döndürür.
        parseByte(String s): Nesne oluşturmaz, doğrudan ilkel veri türüne (byte) dönüştürür. Bu nedenle bellek tüketimi açısından daha verimli olabilir.

        Örnek Kullanım
        Byte.valueOf(String s):
        String str = "100";
        Byte byteValue = Byte.valueOf(str);  // Byte nesnesi döndürür

        Byte.parseByte(String s):
        String str = "100";
        byte primitiveByte = Byte.parseByte(str);  // byte primitive türünü döndürür

        Özet
        valueOf(String s) bir nesne (Byte) döndürür.
                parseByte(String s) bir ilkel veri türü (byte) döndürür.
                Nesne yönelimli bir yapı kullanmak istiyorsanız valueOf, daha düşük bellek /*kullanımı ve ilkel türlere ihtiyaç duyuyorsanız parseByte tercih edilmelidir.

    }
}
