package com.global;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ShowBeanLife implements InitializingBean,DisposableBean{

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stubs
		System.out.println("will run before set attribute to beans");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("will run after destroy context");

	}

}
