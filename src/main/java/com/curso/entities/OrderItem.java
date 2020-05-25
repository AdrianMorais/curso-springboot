package com.curso.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.curso.entities.pk.OrderItemPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class OrderItem  implements Serializable{

	private static final long serialVersionUID = 1L;
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@EmbeddedId
	private OrderItemPK id = new OrderItemPK();
	
	private Integer quantidade;
	private Double preco;
	
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@JsonIgnore
	public Pedido getPedido() {
		return id.getPedido();
	}
	
	public void setPedido(Pedido pedido) {
		id.setPedido(pedido);
	}
	
	@JsonIgnore
	public Produto getProduto() {
		return id.getProduto();
	}
	
	public Double getSubTotal() {
		return  preco * quantidade;
	}
	
	public void setProduto(Produto produto) {
		id.setProduto(produto);
	}
	
	public OrderItem() {
		
	}
	
	public OrderItem(Pedido pedido,Produto produto,Integer quantidade, Double preco) {
		id.setPedido(pedido);
		id.setProduto(produto);		
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	
	
}
