package models;

import repositories.BrowserInternet;
import repositories.MusicPlayer;
import repositories.Telephone;

import java.util.List;

public class Iphone implements MusicPlayer, BrowserInternet, Telephone {
    private List<Music> musics;
    private List<Contact> contacts;
    private List<Page> browserInternet;
    private List<VoiceMail> voiceMails;

    public Iphone(List<Music> musics, List<Contact> contacts, List<Page> browserInternet, List<VoiceMail> voiceMails) {
        this.musics = musics;
        this.contacts = contacts;
        this.browserInternet = browserInternet;
        this.voiceMails = voiceMails;
    }


    @Override
    public void displayPage(Page page) {
        System.out.println(page);
    }

    @Override
    public void newTab(Page page) {
        browserInternet.add(page);
    }

    @Override
    public Page updatePage(Page oldPage, Page newPage) {
        oldPage = newPage;
        return oldPage;
    }

    @Override
    public void play() {
        int count = 0;
        for (Music m : musics){
            count++;
            System.out.println(count + "º música: " + m);
        }
    }

    @Override
    public void pause() {
        System.out.println("Música pausada");
    }

    @Override
    public void selectMusic(String name) {
        for (Music m : musics){
            if(m.getName().equals(name)) System.out.println("Tocando: " + m);
        }
    }

    @Override
    public void call(Contact contact) {
        System.out.println("Ligando para: " + contact);
    }

    @Override
    public void toMeet() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public String initVoiceMail() {
        return "Correio de voz " + voiceMails;
    }
}
