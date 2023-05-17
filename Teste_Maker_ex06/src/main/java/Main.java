import org.json.JSONObject;
import org.json.XML;

public class Main {
    public static void main(String[] args) {
        String xml = "<Movies>\r\n"
        		+ "    <Movie>\r\n"
        		+ "        <Title>Filme 1</Title>\r\n"
        		+ "        <Rating>PG-13</Rating>\r\n"
        		+ "        <Duration>120 minutos</Duration>\r\n"
        		+ "        <Category>Ação</Category>\r\n"
        		+ "    </Movie>\r\n"
        		+ "    <Movie>\r\n"
        		+ "        <Title>Filme 2</Title>\r\n"
        		+ "        <Rating>R</Rating>\r\n"
        		+ "        <Duration>105 minutos</Duration>\r\n"
        		+ "        <Category>Terror</Category>\r\n"
        		+ "    </Movie>\r\n"
        		+ "    <Movie>\r\n"
        		+ "        <Title>Filme 3</Title>\r\n"
        		+ "        <Rating>PG</Rating>\r\n"
        		+ "        <Duration>90 minutos</Duration>\r\n"
        		+ "        <Category>Aventura</Category>\r\n"
        		+ "    </Movie>\r\n"
        		+ "    <Movie>\r\n"
        		+ "        <Title>Filme 4</Title>\r\n"
        		+ "        <Rating>G</Rating>\r\n"
        		+ "        <Duration>95 minutos</Duration>\r\n"
        		+ "        <Category>Animação</Category>\r\n"
        		+ "    </Movie>\r\n"
        		+ "    <Movie>\r\n"
        		+ "        <Title>Filme 5</Title>\r\n"
        		+ "        <Rating>PG-13</Rating>\r\n"
        		+ "        <Duration>110 minutos</Duration>\r\n"
        		+ "        <Category>Drama</Category>\r\n"
        		+ "    </Movie>\r\n"
        		+ "</Movies>\r\n"
        		+ "";

        try {
            JSONObject jsonObject = XML.toJSONObject(xml);
            String json = jsonObject.toString(4);
            
            System.out.println(json);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
