package com.cos;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("sftp://linuxuser@localhost/Documents/camel/1?password=mukilan123&passiveMode=true").to("file:///home/linuxuser/Documents/camel/2");
	}
}
