/**
 * DO NOT MODIFY THIS CODE
 *
 * Place all of your changes in NoteAttribute.java
 *
 * It has been machine generated from fixtures and your changes will be
 * lost if anything new needs to be added to the API.
 **/
// Last Generated: 2011-09-26T15:53:49-04:00
package com.shopify.api.resources;

import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * This code has been machine generated by processing the single entry
 * fixtures found from the Shopify API Documentation
 */

public class MGNoteAttribute extends ShopifyResource {

	@JsonProperty("name")
	public String getName() {
		return (String)getAttribute("name");
	}
	@JsonProperty("name")
	public void setName(String _name) {
		setAttribute("name", _name);
	}

	@JsonProperty("value")
	public String getValue() {
		return (String)getAttribute("value");
	}
	@JsonProperty("value")
	public void setValue(String _value) {
		setAttribute("value", _value);
	}

}
