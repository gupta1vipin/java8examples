package java8.interfacedefaultmethod;

public interface IOrderService {
	
	void createOrder();
	
	void updatOrder();
	
	//BEFORE Java 8
	//static void doSomething();
	
	//WITH Java 8
	static void sendOrderNotification(){ 
		//do your stuff here 
	}
	
}
