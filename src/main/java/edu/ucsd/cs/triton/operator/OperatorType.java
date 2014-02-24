package edu.ucsd.cs.triton.operator;

public enum OperatorType {
	BASIC,
	PRODUCT,
	WINDOW,
	LENGTH_WINDOW,
	TIME_WINDOW,
	TIME_BATCH_WINDOW,
	SELECTION,
	PROJECTION,
	INPUT_STREAM,
	JOIN,
	AGGREGATION;
}