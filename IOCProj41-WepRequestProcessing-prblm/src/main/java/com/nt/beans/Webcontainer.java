package com.nt.beans;

public class Webcontainer {
    private RequestHandler req;

	public Webcontainer(RequestHandler req) {
		System.out.println("Webcontainer oneParamConstructor");
		this.req = req;
	}

	public void  handleRequest(String data) {
		System.out.println("WebContainer ::request came for processing with data::"+data+"---->"+this.hashCode());
		req.processingRequest(data);
		System.out.println("WebContainer :: request processing completed with data::"+data);
	}
    
    
}
