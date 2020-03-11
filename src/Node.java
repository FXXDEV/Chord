import java.util.Map;

public class Node {
    int key, next;
    boolean active;
    String music;
    Map<Integer,String> musics;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public Map<Integer, String> getMusics() {
        return musics;
    }

    public void setMusics(Map<Integer, String> musics) {
        this.musics = musics;
    }
}
