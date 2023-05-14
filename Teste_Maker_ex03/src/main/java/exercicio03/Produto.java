package exercicio03;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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

@Entity
@Table(name = "Produtos")

//Utilizei o Hibernate e  para persistir os dados do objeto Produto na Tabela "Produtos" do banco;

public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String marca;
	private String departamento;
	private String cor;
	private String sku;
	// private List<Image> imagens;

}
