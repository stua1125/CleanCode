package cleanCode.chapter13.concurrency.threadingProblem;

public class ClassWithThreadingProblem {
	private int lastIdUsed;

	public ClassWithThreadingProblem(int lastIdUsed) {
		this.lastIdUsed = lastIdUsed;
	}

	public int getNextId() {
		return ++lastIdUsed;
	}

	public static void main(String args[]) {
		final ClassWithThreadingProblem classWithThreadingProblem = new ClassWithThreadingProblem(42);

		Runnable runnable = new Runnable() {
			public void run() {
				classWithThreadingProblem.getNextId();
			}
		};

		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		t1.start();
		t2.start();
	}
}