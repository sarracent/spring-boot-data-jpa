package com.sarracent.data.jpa.models.dao;

import com.sarracent.data.jpa.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
