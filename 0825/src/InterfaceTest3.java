
public class InterfaceTest3 {

	public static void main(String[] args) {
		BasicButton loginBtn = new BasicButton();
		
		loginBtn.addClickEventHandler(new LoginClick());
		loginBtn.click(); // 로그인 처리

		BasicButton joinBtn = new BasicButton();
		joinBtn.addClickEventHandler(new IClick() {
			@Override
			public void iclick() {
				System.out.println("회원가입 처리");
			}
		});
		
		// new IClick() 부모 클래스로부터 상속받아,
		// iclick() 메서드를 Override를 해주겠다는 것
		joinBtn.click();
	}

}

class BasicButton {
	String title;
	IClick iClick;
	
	void click() {
		System.out.println("버튼 기본 처리");
		
		if(iClick != null) {
			iClick.iclick();
		}
	}
	
	void addClickEventHandler(IClick iClick) {
		this.iClick = iClick;
	}
}

interface IClick {
	void iclick();
}

class LoginClick implements IClick {
	@Override
	public void iclick() {
		System.out.println("로그인 처리");
		
	}
}