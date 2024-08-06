import models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Music> musics = new ArrayList<>(Arrays.asList(
                new Music("Eis-me aqui", "Valesca Maysa"),
                new Music("Vem me buscar", "Jeferson e Suelen"),
                new Music("Alfa e Ômega","Eli Soares"),
                new Music("Filho meu","Thales Roberto")
        ));


        List<Contact> contacts = new ArrayList<>(Arrays.asList(
                new Contact("Maria", 11111111),
                new Contact("João", 22222222),
                new Contact("Zé do Pneu", 33333333),

        ));


        List<VoiceMail> voiceMails = new ArrayList<>(Arrays.asList(new VoiceMail(0, "")));


        List<Page> browserInternet = new ArrayList<>(Arrays.asList(new Page("", "")));

        //criando objeto do iphone
        Iphone iphone = new Iphone(musics, contacts, browserInternet, voiceMails);
    }

}