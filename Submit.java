import java.io.BufferedReader;
import java.io.FileReader;
import java.io.StringReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Submit {

  public void submit(Integer partId) {
    /*System.out.println(String.format("==\n== [automata-class] Submitting Solutions" +
                " | Programming Exercise %s\n==", homework_id()));*/


    /**
     * Test on Sample
     */
    String sampleoutput=new epsnfa().Start("sampleRE.in");
    
    
    
    	System.err.println("Your output is: "+sampleoutput);
    
    
    	return;
    
    
    }
 public static void main(String [] args) {
    Submit submit = new Submit();
    submit.submit(0);
  }
}
