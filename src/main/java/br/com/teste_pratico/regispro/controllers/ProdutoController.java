package br.com.teste_pratico.regispro.controllers;

import br.com.teste_pratico.regispro.Model.Produto;
import br.com.teste_pratico.regispro.Model.ProdutoDisponivel;
import br.com.teste_pratico.regispro.dto.RequisicaoFormProduto;
import br.com.teste_pratico.regispro.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Comparator;
import java.util.List;

@Controller
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/produtos")
    public ModelAndView index() {
        List<Produto> produtos = produtoRepository.findAll();

        produtos = produtos.stream().sorted(Comparator.comparing(Produto::getValor)).toList();

        ModelAndView mv = new ModelAndView("index");
        mv.addObject("produtos", produtos);
        return mv;
    }

    @GetMapping("/produtos/new")
    public ModelAndView nnew() {
        ModelAndView mv = new ModelAndView("new");
        mv.addObject("produtoDisponivel", ProdutoDisponivel.values());
        mv.addObject("requisicaoNovoProduto", new RequisicaoFormProduto());
        return mv;
    }

    @PostMapping("/produtos")
    public ModelAndView create(@Valid @ModelAttribute("requisicaoNovoProduto") RequisicaoFormProduto requisicao,
                               BindingResult result) {
        if (result.hasErrors()) {
            // Retorna a página de criação com os erros e os dados preenchidos
            ModelAndView mv = new ModelAndView("new");
            mv.addObject("produtoDisponivel", ProdutoDisponivel.values());
            mv.addObject("requisicaoNovoProduto", requisicao);
            return mv;
        } else {
            // Salva o produto no banco e redireciona
            Produto produto = requisicao.toProduto();
            produtoRepository.save(produto);
            return new ModelAndView("redirect:/produtos");
        }
    }


}
