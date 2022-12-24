package com.di;

public class MainTest {

	public static void main(String[] args) {
		
		

	}

}

interface ILogger{
	
	public void LogContext();
	
}

class HoldLogFile implements ILogger{

	@Override
	public void LogContext() {
	}
	
}

class HoldDBLogs implements ILogger{

	@Override
	public void LogContext() {
	}
	
}

class ManageLogs{
	
	private ILogger _Ilogger;
	
	public ManageLogs(ILogger logger) {
		
		_Ilogger = logger;
		
	}
	
	public void LogContext() {
		
		_Ilogger.LogContext();
		
	}
	
}





















