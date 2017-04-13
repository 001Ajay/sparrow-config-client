package org.dev;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class ProjectConfig {

	@Value("${group1.property1}")
	private String property;
	
	public String getProperty(){
		return property;
	}
}
