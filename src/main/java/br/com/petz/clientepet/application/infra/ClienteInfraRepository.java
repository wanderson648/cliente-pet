package br.com.petz.clientepet.application.infra;

import br.com.petz.clientepet.application.repository.ClienteRepository;
import br.com.petz.clientepet.cliente.domain.Cliente;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
public class ClienteInfraRepository implements ClienteRepository {
    @Override
    public Cliente salva(Cliente cliente) {
        log.info("[inicia] ClienteInfraRepository - salva");
        log.info("[finaliza] ClienteInfraRepository - salva");
        return cliente;
    }
}
