package me.aakash.selection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SelectionService {
	

	
	@Autowired
	SelectionRepo selectionrepository;
	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}

	public List<Useroptions> getallusers() {
		
		return selectionrepository.findAll();
	}

	public Useroptions getbynumber(long mobNo) {
		
		return selectionrepository.findById(mobNo).get();
		
	}

}
