package com.esigproject.project.controller;

import com.esigproject.project.model.Item;
import com.esigproject.project.services.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller("/")
public class ProjectEsigController {

    @Autowired
    private ItemService itemService; 

    @RequestMapping("home")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("item", new Item());
        mv.setViewName("home/index");
        return mv;
    }

    @GetMapping("allItens")
    public ModelAndView allItens(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("allItens", itemService.findAll());
        return mv;
    }

    @PostMapping("salvar")
    public void salvar(@RequestBody Item item) {
        itemService.save(item);
    }
    
    @DeleteMapping
    public void delete(@RequestBody Item item) {
        itemService.deleteById(item.getId());
    }

    @PostMapping("update")
    public void update(@RequestBody Item item) {
        Item itemNovo = itemService.findById(item.getId());

        itemNovo.setDestinatario(item.getDestinatario());
        itemNovo.setRemetente(item.getRemetente());
        itemNovo.setEmail(item.getEmail());

        itemService.save(itemNovo);
    }
}