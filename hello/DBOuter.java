package yong.hello;

public class DBOuter implements Outer {

	@Override
	public void output(String msg) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DB연동");
		System.out.println("DB정보:"+msg);
		System.out.println("DB종료");
	}

}
