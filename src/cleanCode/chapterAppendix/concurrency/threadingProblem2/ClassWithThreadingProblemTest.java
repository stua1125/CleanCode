package cleanCode.chapterAppendix.concurrency.threadingProblem2;

import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

public class ClassWithThreadingProblemTest {

	/*
	 * Test Case

	- NextId의 현재 값을 기억한다. 

	- 스레드 두 개를 생성한다. 각 스레드가 takeNextId()를 한 번씩 호출한다. 

	- nextId가 처음보다 2 증가했는지 확인한다. 

	- nextId가 1만 증가할 때까지 위 단계를 반복한다.
	*/ 
	
	@Test
	public void twoThreadsShouldFailEventually() throws Exception {

		final ClassWithThreadingProblem classWithThreadingProblem = new ClassWithThreadingProblem(); // 아래 anonymous 로
																									 // runnable에 넣을
																									 // 값이기 때문에
																									 // final을 붙였다.

		Runnable runnable = new Runnable() {
			public void run() {
				classWithThreadingProblem.takeNextId();
			}
		};

		for (int i = 0; i < 50000; ++i) { // 50000만 번의 test는 적은 숫자일 수도 있다. 더 많이 test해야만 문제가 나올 수도 있다.

			int startingId = classWithThreadingProblem.lastId;

			int expectedResult = 2 + startingId;

			Thread t1 = new Thread(runnable);

			Thread t2 = new Thread(runnable);

			t1.start();

			t2.start();

			t1.join();

			t2.join();

			int endingId = classWithThreadingProblem.lastId;

			if (endingId = !expectedResult)

				return;

		}

		fail("Should have exposed a threading issue but	it did not.");

	}

}
