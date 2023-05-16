import java.io.IOException;

import com.google.gson.Gson;

public class Teste {

	public static void main(String[] args) throws IOException, NoSuchMethodException, SecurityException {

		GetURL conexao = new GetURL();
		Gson gson = new Gson();
		String json = conexao.trazURL();

		Produto p = gson.fromJson(json, Produto.class);

		System.out.println(p.getDescriptions().get(0).getId());
	}
}