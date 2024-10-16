// Bu program basit aritmetik işlemler yapar ve sonuçları ekrana yazdırır.

public class Main {
    public static void main(String[] args) {

        // Değişkenlerin tanımlanması ve başlangıç değerlerinin atanması
        int a = 3; // 'a' değişkenine 3 değeri atanıyor
        int b = 5; // 'b' değişkenine 5 değeri atanıyor
        int c = 3; // 'c' değişkenine 3 değeri atanıyor

        // Aritmetik işlemler ve değişkenlerin kullanılması
        int toplam = a + 2 * b + 3 * c; // Toplam değeri hesaplanıyor

        // Sonucun ekrana yazdırılması
        System.out.println("Toplam = " + toplam); // Toplam değeri ekrana yazdırılıyor

        // Ek bir örnek: Değişken değerlerini güncelleme
        a = a + 1; // 'a' değişkeninin değeri 1 artırılıyor
        b = b - 2; // 'b' değişkeninin değeri 2 azaltılıyor
        c = c * 2; // 'c' değişkeninin değeri 2 ile çarpılıyor

        // Güncellenen değerlerle yeni bir hesaplama
        int yeniToplam = a + b + c;

        // Yeni sonucun ekrana yazdırılması
        System.out.println("Yeni Toplam = " + yeniToplam); // Yeni toplam değeri ekrana yazdırılıyor

        /*
         Çok satırlı yorum örneği:
         Bu bölümde değişkenlerin güncellenmiş değerleri kullanılarak
         yeni bir toplam hesapladık ve sonucu ekrana yazdırdık.
        */

    }
}
