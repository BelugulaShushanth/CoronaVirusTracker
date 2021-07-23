package com.coronaVirusTracker.Services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.coronaVirusTracker.Beans.DataBean;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CovidDataService {
	
	private final String url = "https://api.covid19api.com/summary";
	
	public DataBean fetchCoronaVirusData() throws JsonMappingException, JsonProcessingException {
		RestTemplate rt = new RestTemplate();
		String data = rt.getForObject(url,String.class);
		ObjectMapper mapper = new ObjectMapper();
        DataBean dataBean = mapper.readValue(data.toLowerCase(), DataBean.class);
        return dataBean;
	}
}
