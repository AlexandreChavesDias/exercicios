package fiap.com.exercicios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
@RestController
@RequestMapping("v1/teste")
@RequiredArgsConstructor
public class teste {
    @GetMapping
    public String listAssociates() {
    	return "testess";
    }
}
