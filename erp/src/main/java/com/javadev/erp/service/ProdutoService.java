package com.javadev.erp.service;

import com.javadev.erp.model.Produto;
import com.javadev.erp.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public List<Produto> listProduct(){
        return produtoRepository.findAll();
    }

    public Produto save(Produto produto){
        return produtoRepository.save(produto);
    }

    public void delete(Long id){
        produtoRepository.deleteById(id);
    }

    public Produto update(Long id, Produto produto){
        if (produtoRepository.existsById(id)){
            produto.setId(id);
            return produtoRepository.save(produto);
        } else {
            throw new RuntimeException("Produto não econtrado");
        }
    }

    public Optional<Produto> findById(Long id){
        return produtoRepository.findById(id);
    }
}
