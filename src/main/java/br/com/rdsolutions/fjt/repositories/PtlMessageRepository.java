package br.com.rdsolutions.fjt.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.rdsolutions.fjt.models.PtlMessage;

public interface PtlMessageRepository extends CrudRepository<PtlMessage, Integer> {

}
