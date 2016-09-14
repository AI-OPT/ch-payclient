package com.ylink.upp.base.oxm.util;


public class Conversion{
	private ProcessorField processorField;
	private String FieldName;

	/**
	 *
	 */
	public Conversion(ProcessorField processorField,String FieldName) {
		this.processorField = processorField;
		this.FieldName = FieldName;
	}

	public ProcessorField getProcessorField() {
		return processorField;
	}
	public void setProcessorField(ProcessorField processorField) {
		this.processorField = processorField;
	}
	public String getFieldName() {
		return FieldName;
	}
	public void setFieldName(String fieldName) {
		FieldName = fieldName;
	}


}