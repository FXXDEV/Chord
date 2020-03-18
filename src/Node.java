import java.util.ArrayList;
import java.util.Map;

public class Node {
    private int key, next;
    private Boolean active;
    private String music;
    private ArrayList<Node> musics;

    
  

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

    public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public void setMusics(ArrayList<Node> musics) {
		this.musics = musics;
	}

	public ArrayList<Node> getMusics() {
		return musics;
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

    
}
