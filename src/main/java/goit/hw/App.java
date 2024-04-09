package goit.hw;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Gson gson = new Gson();
        System.out.println(gson.toJson(Map.of("name", "Denis", "lastName", "Suchan")));
    }
}
