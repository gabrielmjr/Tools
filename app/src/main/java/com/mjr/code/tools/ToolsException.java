package com.mjr.code.tools;

@Deprecated(forRemoval = true)
public class ToolsException extends Exception {
    public ToolsException(String message) {
        super(message);
    }
    
    public ToolsException(String message, Throwable cause) {
        super(message, cause);
    }
}
