package com.cts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.message.MessageRenderer;

public class HelloWorldSpringAnnotated {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
		renderer.render();
	}
}
