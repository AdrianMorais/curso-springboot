package com.curso.entities.enums;

public enum StatusPedido {

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private StatusPedido(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static StatusPedido valueOf(int code) {
		for(StatusPedido value : StatusPedido.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Codigo Invalido");
	}
	
}
