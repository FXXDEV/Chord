import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PrimitiveIterator;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import com.LerArquivo;
import com.No;





public class Hashtable {
 
    Random rand = new Random();
    private static ReadFile rf = new ReadFile();
    private static ArrayList<Node> activeNodes = new ArrayList<>();
    private static StringBuilder actives = new StringBuilder();
    private static StringBuilder inactives = new StringBuilder();
    private static Map<Integer, Node> ring;
    private static ArrayList arrayList;


    private Map<Integer, Node> musics;

    public Hashtable(){
        this.musics = new HashMap<Integer,Node>();
    }

    
    
    static void sweepHash(){
    	activeNodes.clear();
        ArrayList<Node> previousNodes = new ArrayList<>();
        int first = -1;
        int flag=0;
        int previousActive = -1;
        int last = -1;

        for (int k = 0; k < ring.size(); k++) {
        	previousNodes.add(ring.get(k));
            if (ring.get(k).isActive()) {
            	activeNodes.add(ring.get(k));
                ring.get(k).setMusics(previousNodes);
                previousNodes = new ArrayList<>();
                if (flag == 0) {
                    first = k;
                    flag = 1;
                }
                if(previousActive!=-1){
                    ring.get(previousActive).setNext(ring.get(k).getKey());
                }
                previousActive = ring.get(k).getKey();
                last = ring.get(k).getKey();
            }
        }
        ring.get(last).setNext(first);

        for (int h = 0; h<=first; h++){
            previousNodes.add(ring.get(h));
            if(h == first){
                ring.get(h).setMusics(previousNodes);
                ArrayList<Node> test = (ArrayList<Node>) ring.get(h).getMusics();
            }
        }
    }
    
    
    public void mountRing() throws IOException {
        Node node = new Node();
        arrayList = rf.mountList();
        
        int i = 0;
        for (Object m : arrayList) {
            node = new Node();
            node.setKey(i);
            node.setMusic(m + "");
            node.setActive(false);
            i++;
            ring.put(node.getKey(), node);
        }

    }
    
    

    public static void nodeStatus(){
    	inactives.setLength(0);
    	actives.setLength(0);

        for (int i=0; i<ring.size(); i++){
            if(!(ring.get(i).isActive())){
            	inactives.append("Inactive: "+ring.get(i).getKey()+"\n");
            }else{
            	actives.append("Active: "+ring.get(i).getKey()+"\n");
            }
        }

    }

    
    public static String search(String music){

        for (int i=0; i<activeNodes.size();i++){
            for (int j=0; j< activeNodes.get(i).getMusics().size(); j++){
                System.out.println("sad");
                if(activeNodes.get(i).getMusics().get(j).getMusic().equalsIgnoreCase(music)){
                    return "Music " + music + "are in node: "+activeNodes.get(i).getMusics().get(j).getKey()+ "found in active node:"+activeNodes.get(i).getKey();
                }
            }
        }
        return "Not found";
    }

    public static void main(String[] args) throws IOException {
      Hashtable hash = new Hashtable();

     
    


}

