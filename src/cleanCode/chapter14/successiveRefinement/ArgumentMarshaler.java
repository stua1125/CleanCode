package cleanCode.chapter14.successiveRefinement;

import java.util.Iterator;

public interface ArgumentMarshaler {
	void set(Iterator<String> currentArgument) throws ArgsException;
}
