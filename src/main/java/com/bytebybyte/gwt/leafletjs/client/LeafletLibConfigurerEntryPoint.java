package com.bytebybyte.gwt.leafletjs.client;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.bytebybyte.gwt.leafletjs.client.resources.LeafletLibClientBundle;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;

public class LeafletLibConfigurerEntryPoint implements EntryPoint {

	protected Logger logger = Logger.getLogger(LeafletLibConfigurerEntryPoint.class.getName());

	@Override
	public void onModuleLoad() {

		LeafletLibClientBundle bundle = LeafletLibClientBundle.INSTANCE;

		logger.log(Level.INFO, "Injecting leafletjs javascript script element.");

		ScriptInjector.fromString(bundle.leaflet().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
	}

}
