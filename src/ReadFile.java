import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

	public class ReadFile {
		public ArrayList mountList() throws IOException {
		    Path file = Paths.get("..\\Chord\\src\\files\\musics");
	        ArrayList arrayList = new ArrayList();
	        List<String> musicsFile = Files.readAllLines(file);
	
	        int i = 0;
	        for (String m : musicsFile) {
	            i++;
	            arrayList.add(m);
	        }
	        return arrayList;
	    }
	}
