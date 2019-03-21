package java8.interfacestaticmethod;

public interface IOrderService {
	
	void createOrder();
	
	void updatOrder();
	
	//BEFORE Java 8
	//void sendOrderNotification();
	
	//WITH Java 8
	default void sendOrderNotification(){ 
		//do your stuff here 
	}
	
}
