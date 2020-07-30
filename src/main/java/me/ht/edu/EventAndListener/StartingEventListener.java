package me.ht.edu.EventAndListener;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

//@Component
public class StartingEventListener implements ApplicationListener<ApplicationStartingEvent> {

	// Application Context 생성 이전에 발생하는 event라 Bean으로 등록해도 아래 메소드가 동작을 하지 않음.
	// Bean으로 등록하는게 아니라 context에 addListener를 해서 등록해준다.
	@Override
	public void onApplicationEvent(ApplicationStartingEvent event) {
		System.out.println("== Application is starting ==");
	}

}
