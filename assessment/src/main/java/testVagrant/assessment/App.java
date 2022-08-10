package testVagrant.assessment;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 * Hello world!
 *
 */
public class App 
{
    public static List<String> getSpecificPlayerInfo(String key  ) throws FileNotFoundException, IOException, ParseException 
    {
    	 String file = "json/playerList.json";
    	 JSONParser parser = new JSONParser();
         Object obj = parser.parse(new FileReader(file));
         JSONObject jsonObject = (JSONObject) obj;
         JSONArray players = (JSONArray) jsonObject.get("player");
         List<String> playerinfo = new ArrayList<String>();
         for (Object o : players)
         {
           JSONObject player = (JSONObject) o;
           playerinfo.add(player.get(key).toString());
           System.out.println(player.get(key));
         }
         return playerinfo;
    }
}
