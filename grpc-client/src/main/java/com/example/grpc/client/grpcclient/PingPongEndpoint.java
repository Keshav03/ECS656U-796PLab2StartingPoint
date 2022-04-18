package com.example.grpc.client.grpcclient;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.io.IOException;
import org.springframework.ui.Model;

@Controller
public class PingPongEndpoint {    

	GRPCClientService grpcClientService;    
	@Autowired
    	public PingPongEndpoint(GRPCClientService grpcClientService) {
        	this.grpcClientService = grpcClientService;
    	}    
	@GetMapping("/ping")
    	public String ping() {
        	return grpcClientService.ping();
    	}
        @RequestMapping("/add")
	public String add(Model model,@RequestParam("mA") String mA,@RequestParam("mB") String mB ) {
		String resp = grpcClientService.add(mA,mB);
		model.addAttribute("mA",mA);
		model.addAttribute("mB",mB);
		model.addAttribute("result",resp);
		return "upload";
	}

	@RequestMapping("/multiply")
        public String multiply(Model model,@RequestParam("mA") String mA,@RequestParam("mB") String mB ,@RequestParam("deadline") int deadline) {
                String resp = grpcClientService.multiply(mA,mB,deadline);
                model.addAttribute("mA",mA);
                model.addAttribute("mB",mB);
                model.addAttribute("result",resp);
                return "upload";
        }


}

