package com.bytebybyte.gwt.leafletjs.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface LeafletLibClientBundle extends ClientBundle {

	public final static LeafletLibClientBundle INSTANCE = GWT.create(LeafletLibClientBundle.class);

	@Source("leafletjs/leaflet.js")
	TextResource leaflet();

}
