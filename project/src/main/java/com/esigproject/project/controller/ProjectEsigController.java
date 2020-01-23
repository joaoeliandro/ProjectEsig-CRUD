package com.esigproject.project.controller;

import java.util.List;

import javax.validation.Valid;

import com.esigproject.project.model.Item;
import com.esigproject.project.services.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/home")
public class ProjectEsigController {

    @Autowired
    private ItemService itemService;

    @RequestMapping
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("Item", new Item());
        mv.addObject("Itens", getAllItens());
        mv.setViewName("home/index");
        return mv;
    }

    private List<Item> getAllItens() {
        return itemService.findAll();
    }

    @PostMapping("/item")
    public ModelAndView salvar(@Valid Item item) throws Exception{
        itemService.save(item);
        return new ModelAndView("redirect:/home");
    }

    @DeleteMapping("/item/{id}")
    public ResponseEntity<Item> delete(@PathVariable(value = "id") Long id) {
        Item item = itemService.findById(id);
        if (item == null) {
            return ResponseEntity.notFound().build();
        }

        itemService.deleteById(id);

        return ResponseEntity.ok().build();
    }

    @PutMapping("/item/{id}")
    public ResponseEntity<Item> update(@PathVariable(value = "id") Long id, @Valid @RequestBody Item item) {
        Item itemNovo = itemService.findById(id);

        if (itemNovo == null) {
            return ResponseEntity.notFound().build();
        }

        itemNovo.setNomeItem(item.getNomeItem());
        itemNovo.setDestinatario(item.getDestinatario());
        itemNovo.setRemetente(item.getRemetente());
        itemNovo.setEmail(item.getEmail());

        itemService.save(itemNovo);
        return ResponseEntity.ok().body(itemNovo);
    }
}