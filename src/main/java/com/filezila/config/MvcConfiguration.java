package com.filezila.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan
public class MvcConfiguration extends WebMvcConfigurerAdapter{
	
	
	@Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        registry.viewResolver(resolver);
    }
	
/*	 @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/fonts/**")
	                .addResourceLocations("/WEB-INF/static/fonts/");

	        registry.addResourceHandler("/css/**")
	                .addResourceLocations("/WEB-INF/static/css/");

	        registry.addResourceHandler("/js/**")
	                .addResourceLocations("/WEB-INF/static/js/");
	        
	        registry.addResourceHandler("/images/**")
            .addResourceLocations("/WEB-INF/static/images/");
	        
	        registry.addResourceHandler("/vendor/**")
            .addResourceLocations("/WEB-INF/static/vendor/");
	    }*/

}
