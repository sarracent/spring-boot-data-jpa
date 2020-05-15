package com.sarracent.data.jpa.models.dao;

import com.sarracent.data.jpa.models.entity.Cliente;

import java.util.List;

public interface IClienteDao {
    public List<Cliente> findAll();

    public void save(Cliente cliente);
}
