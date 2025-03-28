package org.example.services;

import org.example.dto.FornecedorDTO;
import org.example.entities.Contato;
import org.example.entities.Fornecedor;
import org.example.repositories.FornecedorRepository;
import org.springframework.stereotype.Service;

@Service
public class FornecedorSevice {

        public FornecedorSevice update(Long id, FornecedorDTO objDTO) {
                try {
                        Fornecedor entity = findById(id);

                        entity.setRazaoSocial(objDTO.getRazaoSocial());
                        entity.setNomeFantasia(objDTO.getNomeFantasia());
                        entity.setCnpj(objDTO.getCnpj());
                        entity.setStatus(objDTO.getStatus());

                        Contato contato = entity.getContatos().get(0);

                        contato.setConCelular(objDTO.getConCelular());
                        contato.setConTelefone(objDTO.getConTelefone());
                        contato.setConEmail(objDTO.getConEmail());
                        contato.setConEmailSecundario(objDTO.getConEmailSecundario());

                        return FornecedorRepository.save(entity);
                } catch (Exception e) {
                        throw new RuntimeException("Erro ao atualizar fornecedor", e);
                }
        }
}
