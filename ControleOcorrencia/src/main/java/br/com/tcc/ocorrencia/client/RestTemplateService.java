package br.com.tcc.ocorrencia.client;

import java.net.URI;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class RestTemplateService {

    public Map<String, String> getUserInfoFor() {
        RestTemplate restTemplate = new RestTemplate();

        RequestEntity<MultiValueMap<String, String>> requestEntity = new RequestEntity<>(getHeader(
                "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGhvcml0aWVzIjpbIlJPTEVfQURNSU4iXSwiaWF0IjoxNTM4Nzk1Njg2LCJleHAiOjE1Mzg3OTkyODZ9.LQrjP0LZHL9AjWmOqOjrswljhsTRU6p7eUBvstjjOc6G_DiiUhgGqDxyRvDkk-x0ngXX-lC3QdGYKk2zTIYrcQ"),
                HttpMethod.GET,
                URI.create("http://localhost:9090/api/carga-service/controle-carga/listarItemBemProduto")
        );

        ResponseEntity<Map> result = restTemplate.exchange(
                requestEntity, Map.class);

        if (result.getStatusCode().is2xxSuccessful()) {
            return result.getBody();
        }

        throw new RuntimeException("It wasn't possible to retrieve userInfo");
    }

    private MultiValueMap getHeader(String token) {
        MultiValueMap httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", token);
        return httpHeaders;
    }

}