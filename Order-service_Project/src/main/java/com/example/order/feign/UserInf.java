package com.example.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.order.model.UserDto;
@FeignClient(name="UserService" ,url="http://localhost:8081")
public interface UserInf {

	@GetMapping("/get/{id}")
	public UserDto getUserById(@PathVariable int id );
}
