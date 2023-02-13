import java.util.Scanner;
public class KullaniciGirisOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password, username;

        System.out.print("Kullanıcı Adını Giriniz:");
        username = input.nextLine();

        if(username.equals("ssomkan60")){
            System.out.println("Kullanıcı Adınız Doğru.");
            System.out.print("Şifrenizi Giriniz:");
            password = input.nextLine();

            if(password.equals("12345")) {
                System.out.println("Şifreniz Doğru.");
            }
            else {
                System.out.println("Şifreniz Yanlış. Şifrenizi Sıfırlamak İster Misiniz? 'Evet' && 'Hayır'");
                String secim = input.nextLine();
                if(secim.equals("Evet")){
                    System.out.println("Yeni Şifreyi Giriniz:");
                    String yenisifre = input.nextLine();

                    if(yenisifre.equals("12345")){
                        System.out.println("Eski Şifrenizle Aynı Olamaz");
                    }
                    else{
                        System.out.println("Şifre Oluşturuldu:" +yenisifre);
                    }
                }
                else {

                }
            }
        }
        else {
            System.out.println("Kullanıcı Adınız Yanlış.");
        }
    }
}
