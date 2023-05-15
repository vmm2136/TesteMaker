package exercicio04;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ProdutoController {

	@RequestMapping(value = "/produto", method = RequestMethod.GET)
	public ModelAndView produto() {
		return new ModelAndView("produto", "command", new Produto());
	}

	@RequestMapping(value = "/addProduto", method = RequestMethod.POST)
	public String adicionarProduto(@ModelAttribute("SpringWeb") Produto produto, ModelMap model,
			HttpServletRequest request) {

		model.addAttribute("nome", produto.getNome());
		model.addAttribute("marca", produto.getMarca());
		model.addAttribute("Departamento", produto.getDepartamento());
		model.addAttribute("cor", produto.getCor());
		model.addAttribute("sku", produto.getSku());

		List<Produto> produtos = (List<Produto>) request.getSession().getAttribute("produtos");
		if (produtos == null) {
			produtos = new ArrayList<Produto>();
		}
		produtos.add((Produto) produtos);
		request.getSession().setAttribute("Produtos", produtos);

		return "exibeProduto";
	}

	@RequestMapping(value = "/listaProdutos", method = RequestMethod.GET)
	public String listarProdutos(@ModelAttribute("SpringWeb") ModelMap model, HttpServletRequest request) {

		List<Produto> produtos = (List<Produto>) request.getAttribute("produtos");

		model.addAttribute("produtos", produtos);

		return "listaClientes";
	}
}
