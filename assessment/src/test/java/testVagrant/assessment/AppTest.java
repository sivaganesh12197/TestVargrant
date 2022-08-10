package testVagrant.assessment;

import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.testng.annotations.Test;
import testVagrant.assessment.*;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     * @throws FileNotFoundException 
     * @throws IOException 
     * @throws ParseException 
     */
    @Test
    public void VerifyPlayerCount() throws FileNotFoundException, IOException, ParseException 
    {
    	List<String> playerCountries = new ArrayList<String>();
    	playerCountries = App.getSpecificPlayerInfo("country"); 
    	int n = (int) playerCountries.stream().filter(s->!s.equals("India")).count();
    	Assert.assertTrue(n==4);
    }
    
    @Test
    public void VerifyWicketKeeper() throws IOException, ParseException
    {
    	List<String> playerCountries = new ArrayList<String>();
    	playerCountries = App.getSpecificPlayerInfo("role"); 
    	int m = (int) playerCountries.stream().filter(s->s.equalsIgnoreCase("Wicket-keeper")).count();
    	Assert.assertTrue(m>=1);
    }
}
