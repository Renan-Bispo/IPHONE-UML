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
                new Contact("Carlos", 44444444)
        ));


        List<VoiceMail> voiceMails = new ArrayList<>(Arrays.asList(
                new VoiceMail(11111111, "Oi"),
                new VoiceMail(22222222, "Tenho um recado"),
                new VoiceMail(33333333, "Me ligue quando puder"),
                new VoiceMail(44444444, "Vamos nos ver hoje?")
        ));


        List<Page> browserInternet = new ArrayList<>(Arrays.asList(
                new Page("www.instagram.com", ""),
                new Page("www.apple.com",""),
                new Page("www.youtube.com", "")
        ));

        //criando objeto do iphone
        Iphone iphone = new Iphone(musics, contacts, browserInternet, voiceMails);
        //funções de Telefone do Iphone
        iphone.call(contacts.get(1));
        iphone.toMeet();
        iphone.initVoiceMail();
    }

}