package com.main;

 

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SbRestConsumerApp0004MiniProjectApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(SbRestConsumerApp0004MiniProjectApplication.class, args);
		
		//test single doctor register api service
		/* Creating Rest Template object */
		RestTemplate template = new RestTemplate();
		
		/*String url = "http://localhost:8080/api/registerSingleDoctor";
		String  jsonData = "{\"docName\":\"Test4\",\"salary\":9000.0,\"specialization\":\"Gastrology\"}";
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> request = new HttpEntity<>(jsonData, header); 
ResponseEntity<String> response = template.postForEntity(url, request, String.class);
		System.out.println(response.getBody());*/
		 
		
		/* Bulk of record inserting service api */
		
		/*String url = "http://localhost:8080/api/registerAllDoctors"; 
		String jsonData = "[{\"docName\":\"Test5\",\"salary\":9000.0,\"specialization\":\"Gastrology\"},{\"docName\":\"Test6\",\"salary\":9000.0,\"specialization\":\"Gastrology\"},\n"
		+"{\"docName\":\"Test7\",\"salary\":9000.0,\"specialization\":\"Gastrology\"}]";
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> request = new HttpEntity<>(jsonData, header); 
		ResponseEntity<String> response = template.postForEntity(url, request, String.class);
		System.out.println(response.getBody());
		System.out.println(response.getStatusCode());*/
		 
		 
		/* Get Single doctor record service api */
		
		/*String url = "http://localhost:8080/api/getSingleDoctor/{id}";
		ResponseEntity<String> response = template.getForEntity(url, String.class,952);
		System.out.println(response.getBody());
		System.out.println(response.getStatusCode());*/
		
		
		/*Get All doctors record service api*/
		
		/*String url = "http://localhost:8080/api/getAllDoctors";
		ResponseEntity<String> response = template.getForEntity(url, String.class);
		System.out.println(response.getBody());
		System.out.println(response.getStatusCode());*/
		
		//delete single doctor
		/*String url = "http://localhost:8080/api/removeDoctor/{id}";
		 template.delete(url, 53);*/
		
		/*String url = "http://localhost:8080/api/getAllDoctorsByIds/{ids}";
		String jsonData = "[54,55,56]";
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> request = new HttpEntity<String>(jsonData, header);
		
		ResponseEntity<String> response = template.postForEntity(url, request, String.class);
		System.out.println(response.getBody());
		*/
		 
		
		System.exit(0);
		
	}

}
