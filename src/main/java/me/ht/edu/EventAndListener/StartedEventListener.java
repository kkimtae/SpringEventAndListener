package me.ht.edu.EventAndListener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class StartedEventListener implements ApplicationListener<ApplicationStartedEvent> {

	// Application Context 생성 이후에 발생하는 Event 이므로 @Component를 이용하여
	// Bean 등록 시 정상동작한다.
	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		System.out.println("== Applicatino is started ==");
	}

}
