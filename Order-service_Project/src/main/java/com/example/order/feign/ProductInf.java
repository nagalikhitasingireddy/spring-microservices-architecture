package com.example.order.feign;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.order.model.ProductDto;
@FeignClient(name="ProductService" , url ="http://localhost:8082")
public interface ProductInf {

	@GetMapping("/get/{id}")
	public ProductDto getProductById(@PathVariable int id) ;
	

	
}
