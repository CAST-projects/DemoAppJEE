/*
 * Licensed to csti consulting 
 * You may obtain a copy of the License at
 *
 * http://www.csticonsulting.com
 * Copyright (c) 2006-Aug 24, 2010 Consultation CS-TI inc. 
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.salesmanager.core.entity.catalog;

import org.apache.commons.lang.StringUtils;

// Generated Sep 17, 2008 4:47:02 PM by Hibernate Tools 3.2.0.beta8

/**
 * ProductsOptionsDescription generated by hbm2java
 */
public class ProductOptionDescription implements java.io.Serializable {

	// Fields

	private ProductOptionDescriptionId id;

	private String productOptionName;

	private String productOptionComment;

	// Constructors

	/** default constructor */
	public ProductOptionDescription() {
	}

	/** minimal constructor */
	public ProductOptionDescription(ProductOptionDescriptionId id,
			String productOptionName) {
		this.id = id;
		this.productOptionName = productOptionName;
	}

	/** full constructor */
	public ProductOptionDescription(ProductOptionDescriptionId id,
			String productOptionName, String productOptionComment) {
		this.id = id;
		this.productOptionName = productOptionName;
		this.productOptionComment = productOptionComment;
	}

	// Property accessors
	public ProductOptionDescriptionId getId() {
		return this.id;
	}

	public void setId(ProductOptionDescriptionId id) {
		this.id = id;
	}

	public String getProductOptionName() {
		return this.productOptionName;
	}

	public void setProductOptionName(String productOptionName) {
		this.productOptionName = productOptionName;
	}

	public String getProductOptionComment() {
		if (StringUtils.isBlank(this.productOptionComment)) {
			return "";
		} else {
			return this.productOptionComment;
		}
	}

	public void setProductOptionComment(String productOptionComment) {
		if (StringUtils.isBlank(productOptionComment)) {
			this.productOptionComment = "";
		} else {
			this.productOptionComment = productOptionComment;
		}

	}

	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((id == null) ? 0 : id.hashCode());
		result = PRIME
				* result
				+ ((productOptionComment == null) ? 0 : productOptionComment
						.hashCode());
		result = PRIME
				* result
				+ ((productOptionName == null) ? 0 : productOptionName
						.hashCode());
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
		final ProductOptionDescription other = (ProductOptionDescription) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (productOptionComment == null) {
			if (other.productOptionComment != null)
				return false;
		} else if (!productOptionComment.equals(other.productOptionComment))
			return false;
		if (productOptionName == null) {
			if (other.productOptionName != null)
				return false;
		} else if (!productOptionName.equals(other.productOptionName))
			return false;
		return true;
	}

}
