package yong.hello;

public class MessageBeanImple implements MessageBean {
	private String name;
	private String greeting;
	
	
	
	public MessageBeanImple(String name) {
		super();
		this.name = name;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}



	@Override
	public void sayHello() {
		System.out.println(greeting+", "+name+"!!");
		
	}

}
