package com.example.jetsnack.ui.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;


import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BlueLM {
    public static String vivogpt() throws Exception {

        String appId = "3038246567";
        String appKey = "zCywVotSxerdFKhp";
        String URI = "/vivogpt/completions";
        String DOMAIN = "api-ai.vivo.com.cn";
        String METHOD = "POST";
        UUID requestId = UUID.randomUUID();
        System.out.println("requestId: " + requestId);


        Map<String, Object> map = new HashMap<>();
        map.put("requestId", requestId.toString());
        String queryStr = mapToQueryString(map);

        //构建请求体
        Map<String, String> data = new HashMap<>();
        data.put("prompt", "写一首春天的诗");
        data.put("model", "vivo-BlueLM-TB");
        UUID sessionId = UUID.randomUUID();
        data.put("sessionId", sessionId.toString());
        System.out.println(sessionId);


        org.springframework.http.HttpHeaders headers = VivoAuth.generateAuthHeaders(appId, appKey, METHOD, URI, queryStr);
        headers.add("Content-Type", "application/json");
        System.out.println(headers);
        String url = String.format("https://%s%s?%s", DOMAIN, URI, queryStr);
        String requsetBodyString = new ObjectMapper().writeValueAsString(data);
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.valueOf(MediaType.APPLICATION_JSON_VALUE));
        httpHeaders.addAll(headers);
        HttpEntity<String> requestEntity = new HttpEntity<>(requsetBodyString, httpHeaders);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
        if (response.getStatusCode() == HttpStatus.OK) {
            System.out.println("Response body: " + response.getBody());
        } else {
            System.out.println("Error response: " + response.getStatusCode());
        }
        return response.getBody();
    }

    public static String mapToQueryString(Map<String, Object> map) {
        if (map.isEmpty()) {
            return "";
        }
        StringBuilder queryStringBuilder = new StringBuilder();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (queryStringBuilder.length() > 0) {
                queryStringBuilder.append("&");
            }
            queryStringBuilder.append(entry.getKey());
            queryStringBuilder.append("=");
            queryStringBuilder.append(entry.getValue());
        }
        return queryStringBuilder.toString();
    }
}
