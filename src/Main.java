import models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Music> musics = new ArrayList<>(Arrays.asList(new Music("", "")));


        List<Contact> contacts = new ArrayList<>(Arrays.asList(new Contact("", 0)));


        List<VoiceMail> voiceMails = new ArrayList<>(Arrays.asList(new VoiceMail(0, "")));


        List<Page> browserInternet = new ArrayList<>(Arrays.asList(new Page("", "")));

        //criando objeto do iphone
        Iphone iphone = new Iphone(musics, contacts, browserInternet, voiceMails);
    }

}