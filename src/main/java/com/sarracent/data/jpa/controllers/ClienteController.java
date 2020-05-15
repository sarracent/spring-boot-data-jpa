package com.sarracent.data.jpa.controllers;

import com.sarracent.data.jpa.models.dao.IClienteDao;
import com.sarracent.data.jpa.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class ClienteController {

    @Autowired
    private IClienteDao clienteDao;

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("titulo", "Listado de clientes");
        model.addAttribute("clientes", clienteDao.findAll());
        return "listar";
    }

    @GetMapping("/form")
    public String crear(Map<String, Object> model) {
        Cliente cliente = new Cliente();
        model.put("cliente", cliente);
        model.put("titulo", "Formulario de Cliente");
        return "form";
    }

    @PostMapping("/form")
    public String guardar(Cliente cliente) {
        clienteDao.save(cliente);
        return "redirect:listar";
    }
}
