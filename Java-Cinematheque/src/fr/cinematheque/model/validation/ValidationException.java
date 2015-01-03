package fr.cinematheque.model.validation;

public class ValidationException extends RuntimeException
{
	public ValidationException(String msg)
	{
		super(msg);
	}
}
