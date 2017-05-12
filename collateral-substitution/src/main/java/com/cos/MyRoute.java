package com.cos;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("sftp://linuxuser@192.168.1.47/home/linuxuser/Documents?password=p@ssw0rd&passiveMode=true&noop=true").to("file:///home/linuxuser/Documents/camel/2");
	}
}
