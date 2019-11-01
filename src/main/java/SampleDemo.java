import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationConfig;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Rajesh Dwivedi
 * Date: 11/1/19
 */
public class SampleDemo {
    public static void main(String[] args) throws IOException {
        final InputStream fileData = ClassLoader.getSystemResourceAsStream("file.json");
        ObjectMapper mapper = new ObjectMapper();
        InitialJson initialJson = mapper.readValue(fileData, InitialJson.class);
        System.out.println(mapper.writeValueAsString(initialJson));
        final FinalJson finalJson = new FinalJson();
        finalJson.setListOfFruits(initialJson);
        System.out.println(mapper.writeValueAsString(finalJson));
    }
}
