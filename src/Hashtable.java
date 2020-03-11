import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Hashtable {


    private Map<Integer,String> musics;
    //key, music_name, active, next, list
    public Hashtable() throws IOException {
        musics = new HashMap<Integer,String>();
        this.mountList();

    }


    public static void mountList() throws IOException {
        Path file = Paths.get("..\\Chord\\src\\files\\musics");
        List<String> musicsFile = Files.readAllLines(file);

        int i=0;
        for(String m: musicsFile){
            i++;
            musics.put(i,m);
        }

        System.out.println(musics);
    }


    public static void main(String[] args) throws IOException {
          mountList();
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
