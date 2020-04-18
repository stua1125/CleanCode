package cleanCode.chapter14.successiveRefinement;

import java.util.Iterator;
import java.util.NoSuchElementException;

import cleanCode.chapter14.successiveRefinement.ArgsException.ErrorCode;

/**
 * This class is IntegerArgumentMarshaler same pattern
 * StringArray type implemention
 */
public class StringArrayArgumentMarshaler implements ArgumentMarshaler {
	private ErrorCode INVALID_String;
	private ErrorCode MISSING_STRING;
	String stringValue = null;
	
	@Override
	public void set(Iterator<String> currentArgument) throws ArgsException {
		String parameter = currentArgument.next();
		stringValue = parameter;
		try {
			
		} catch (NoSuchElementException e) {
			throw new ArgsException(MISSING_STRING);
		} catch (NumberFormatException e) {
			throw new ArgsException(INVALID_String, parameter);
		}
	}
	
	public static String getValue(ArgumentMarshaler am) {
		if (am != null && am instanceof StringArrayArgumentMarshaler)
			return am.toString();
		else 
			return "";
	}
}
