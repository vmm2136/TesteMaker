package exercicio04;

import java.awt.Image;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class SKU {

	private int id;
	private int quantidade;
	private String codBarras;
	private String sku;
	private List<Image> imagens;
	
	Produto p = new Produto();

	public String geradorSKU(String nome, String marca, String depart, String cor) {

		sku = nome.substring(0, 2).toUpperCase() + marca.substring(0, 2).toUpperCase()
				+ depart.substring(0, 2).toUpperCase() + cor.substring(0, 2).toUpperCase();
		
		
		return sku;
	}
}
