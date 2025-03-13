
import java.util.Date;
import java.util.Locale;


public class HoraDoSistema {

    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());

        Locale locale = Locale.getDefault();
        System.out.println("Este é o país no qual sua maquína se encontra: "+ locale.getCountry());
        System.out.println("O idioma atual de sua máquina é : " + locale.getLanguage());
    }





}