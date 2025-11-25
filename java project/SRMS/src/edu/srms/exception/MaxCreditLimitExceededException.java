package edu.srms.exception;

/**
 * A custom checked exception for when an enrollment would exceed the credit limit.
 */
public class MaxCreditLimitExceededException extends Exception {
    public MaxCreditLimitExceededException(String message) {
        super(message);
    }
}