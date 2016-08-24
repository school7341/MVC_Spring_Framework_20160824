package yong.hello;

public class MessageBeanImple implements MessageBean {
	private String name;
	private String greeting;
	private Outer outer;
	
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
	

	public Outer getOuter() {
		return outer;
	}

	public void setOuter(Outer outer) {
		this.outer = outer;
	}

	@Override
	public void sayHello() {
		String msg=greeting+", "+name+"!!";
		System.out.println(msg);
		try {
			outer.output(msg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
