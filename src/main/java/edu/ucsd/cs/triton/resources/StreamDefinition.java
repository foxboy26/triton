package edu.ucsd.cs.triton.resources;

public class StreamDefinition extends AbstractDefinition {
	
	public StreamDefinition(final String streamName) {
		super(streamName);
	}
	
	public StreamDefinition(final String streamName, final DynamicSource source) {
		super(streamName, source);
	}
}
