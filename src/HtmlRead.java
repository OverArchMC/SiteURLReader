import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class HtmlRead {

    public static void main(String[] args) {
        HtmlRead html = new HtmlRead();
    }

    public HtmlRead() {

        try {
            System.out.println();
            System.out.print("hello \n");

            String contains = "athletics";


            URL url = new URL("https://www.milton.edu/");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream())
            );
            String line;
            while ( (line = reader.readLine()) != null ) {
                String[] temp = line.split("\'");
                for(int i = 0; i < temp.length; i++){
                    if(temp[i].indexOf("https://") == 0&& temp[i].contains(contains)){
                        System.out.println(temp[i]);
                    }

                }
                String[] temp2 = line.split("\"");
                for(int i = 0; i < temp2.length; i++){
                    if(temp2[i].indexOf("https://") == 0 && temp2[i].contains(contains)){
                        System.out.println(temp2[i]);
                    }

                }
                //System.out.println(line);
            }
            reader.close();
        } catch(Exception ex) {
            System.out.println(ex);
        }

    }

}
