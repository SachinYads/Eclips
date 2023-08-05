package springannotationcompletesolution.config;

import org.springframework.context.annotation.Bean;

import springannotationcompletesolution.model.AmarilloVisitor;
import springannotationcompletesolution.model.Greeter;
import springannotationcompletesolution.model.JersyVisitor;
import springannotationcompletesolution.model.PopupGreeter;
import springannotationcompletesolution.model.Visitor;

public class AppConfig {
@Bean
public Visitor createVisitor() {
	return new AmarilloVisitor();
}
@Bean(name="greeter")
public Greeter createGreeter() {
	return new PopupGreeter();
}
@Bean("jersyVisitor")
public Visitor createjerseyVisitor() {
	return new JersyVisitor();
}
}
