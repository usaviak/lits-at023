import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentsList {
    public static void main(String[] args)  {
       try {
           ObjectMapper mapper = new ObjectMapper();
           mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
           TypeFactory typeFactory = TypeFactory.defaultInstance();
           //Students students = mapper.readValue(new File("students.json"), Students.class);
           List<Students> students =  mapper.readValue(new File("students.json"), typeFactory.constructCollectionType(ArrayList.class, Students.class));
           System.out.println(students.get(2));
       }
       catch (IOException e) {
           e.printStackTrace();
       }

    }
}
