package com.example.atividade7.Service;


import com.example.atividade7.DTO.ClienteRequestDTO;
import com.example.atividade7.DTO.ClienteResponseDTO;
import com.example.atividade7.Model.ClienteModel;
import com.example.atividade7.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteResponseDTO>listartodos(){
        return clienteRepository.findAll().stream().map(c -> new ClienteResponseDTO(
                c.getNome(),
                c.getEmail(),
                c.getTelefone(),
                c.getFormaPagamento(),
                c.getEndereco()
        )).toList();
    }

    public ClienteModel salvarCliente(ClienteRequestDTO dto) {
        clienteRepository.findByEmail(dto.getemail()).ifPresent(c -> {
            throw new RuntimeException("Email ja cadastrado");
        });

        ClienteModel clienteModel = new ClienteModel();
        clienteModel.setNome(dto.getNome());
        clienteModel.setEmail(dto.getemail());
        clienteModel.setTelefone(dto.getTelefone());
        clienteModel.setFormaPagamento(dto.getFormaPagamento());
        clienteModel.setEndereco(dto.getEndereco());


        clienteRepository.save(clienteModel);

        return clienteModel;}

    }
