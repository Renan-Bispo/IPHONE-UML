package models;

public class Page {
    private String url;
    private String ip;

    public Page(String url, String ip) {
        this.url = url;
        this.ip = ip;
    }

    public String getUrl() {
        return url;
    }

    public String getIp() {
        return ip;
    }

    @Override
    public String toString() {
        return "Page{" + " url = " + url + ", ip= " + ip +  '}';
    }
}
