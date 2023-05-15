package exercicio04;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

//Utilizei o Lombok no objeto Produto para reduzir a quantidade de código presente, assim como no objeto SKU;


public class Produto {

	private int id;
	private String nome;
	private String marca;
	private String departamento;
	private String cor;
	private String sku;
	// private List<Image> imagens;

}
