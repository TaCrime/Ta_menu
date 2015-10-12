package ptatyanas.exclusive.wspace.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class ProductGroups {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int productGroupId;
	private String productGroupName;
	
	public ProductGroups() {
		super();
	}
	public ProductGroups(int productId, String productName) {
		super();
		this.productGroupId = productId;
		this.productGroupName = productName;
	}
	public int getProductId() {
		return productGroupId;
	}
	public void setProductId(int productId) {
		this.productGroupId = productId;
	}
	public String getProductName() {
		return productGroupName;
	}
	public void setProductName(String productName) {
		this.productGroupName = productName;
	}

}
