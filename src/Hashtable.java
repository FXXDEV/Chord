import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Hashtable {


    private Map<Integer, Node> musics;

    public Hashtable(){
        this.musics = new HashMap<Integer,Node>();
    }

    //key, music_name, active, next, list





    void mountList() throws IOException {
        Path file = Paths.get("..\\Chord\\src\\files\\musics");
        List<String> musicsFile = Files.readAllLines(file);

        int i=0;
        for(String m: musicsFile){
            Node nd = new Node();
            nd.setKey(i);
            nd.setMusic(m+"");

            if(i == musicsFile.size()){
                nd.setNext(0);
            }else{
                nd.setNext(i+1);
            }
            i++;
            musics.put(nd.getKey(), nd );
        }

        System.out.println(musics.get(1).getMusic() );


    }


    public static void main(String[] args) throws IOException {
      Hashtable hash = new Hashtable();

      hash.mountList();


//        Node node = new Node();
//
//        Map<Integer, String> musics = node.getMusics();
//
//        System.out.println("Musica: " + musics);

//        System.out.println(alunos.containsValue("Mario"));
//        System.out.println("Valor: " + alunos.get(245234234));
//
//        for(String nome: tabela.getValores()){
//            System.out.println("> " + nome);
//        }
//
//        Set<Integer> chaves = tabela.getChaves();
//        for (Integer id : chaves) {
//            System.out.println("> " + id);
//        }

    }


}

