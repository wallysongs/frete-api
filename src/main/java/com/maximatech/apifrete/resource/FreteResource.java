package com.maximatech.apifrete.resource;

import com.maximatech.apifrete.entity.dto.FreteDTO;
import com.maximatech.apifrete.service.FreteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("frete")
public class FreteResource {

    private FreteService freteService;

    public FreteResource(FreteService freteService) {
        this.freteService = freteService;
    }

    @GetMapping("{quantidade}")
    public ResponseEntity<FreteDTO> calcularFrete(@PathVariable Long quantidade) {
        FreteDTO dto = new FreteDTO().fromFrete(freteService.calcularValorFrete(quantidade));
        return ResponseEntity.ok(dto);
    }
}
