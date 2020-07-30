package me.ht.edu.EventAndListener;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class RunAfterSpringStarted implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// started가 끝난 뒤 동작한다.
		// @Order 어노테이션을 통해 여러 ApplicationRunner의 실행 순서를 정할 수 있다.
		System.out.println("ApplicationRunner foo : " + args.containsOption("foo"));
		System.out.println("ApplicationRunner bar : " + args.containsOption("bar"));
	}

}
