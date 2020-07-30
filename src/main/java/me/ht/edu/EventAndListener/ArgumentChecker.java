package me.ht.edu.EventAndListener;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class ArgumentChecker {

	public ArgumentChecker(ApplicationArguments argu) {
		// 여기서 들어오는 것은 --로 들어오는것
		// -D로 들어오는 것은 VM option JVM Option은 arguments가 아니다.
		System.out.println("ArgumentChecker foo : " + argu.containsOption("foo"));
		System.out.println("ArgumentChecker bar : " + argu.containsOption("bar"));
	}

}
