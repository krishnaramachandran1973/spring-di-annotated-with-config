package com.cts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cts.message.MessageProvider;
import com.cts.message.MessageRenderer;
import com.cts.message.impl.HelloWorldMessageProvider;
import com.cts.message.impl.StandardOutMessageRenderer;

@Configuration
public class HelloWorldConfig {

	@Bean
	public MessageProvider provider() {
		return new HelloWorldMessageProvider();
	}

	@Bean
	public MessageRenderer renderer() {
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(provider());
		return renderer;
	}

}
