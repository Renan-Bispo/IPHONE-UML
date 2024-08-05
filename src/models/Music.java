package models;

public class Music {
    private String name;
    private String artista;

    public Music(String name, String artista) {
        this.name = name;
        this.artista = artista;
    }

    public String getName() {
        return name;
    }

    public String getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return "Music{" +
                "name='" + name + '\'' +
                ", artista='" + artista + '\'' +
                '}';
    }
}
