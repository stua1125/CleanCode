package cleanCode.chapterAppendix.concurrency.threadingProblem2;

public class ClassWithThreadingProblem{

	int nextId;

	public int takeNextId(){
		return nextId++;
	}

}

