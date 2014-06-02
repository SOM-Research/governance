/*******************************************************************************
 * Copyright (c) 2008, 2013
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Javier Canovas (javier.canovas@inria.fr) 
 *******************************************************************************/



package fr.inria.atlanmod.decision.ui;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class DecisionPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "fr.inria.atlanmod.decision.ui"; //$NON-NLS-1$

	// The shared instance
	private static DecisionPlugin plugin;
	
	/**
	 * The constructor
	 */
	public DecisionPlugin() {
	} 

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context); 
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static DecisionPlugin getDefault() {
		return plugin;
	}


	public static URL getInstallURL() {
		Bundle bundle = Platform.getBundle(DecisionPlugin.PLUGIN_ID);
		if(bundle != null) {
			return bundle.getEntry("/");
		} else
			return null;
	}
	
	public static ImageDescriptor getImage(String relativePath) {
		URL url = DecisionPlugin.getInstallURL();
		ImageDescriptor descriptor= null; 
		try {
			descriptor = ImageDescriptor.createFromURL(FileLocator.find(getDefault().getBundle(), new Path(relativePath),null));
			//descriptor = ImageDescriptor.createFromURL(new URL(url, relativePath)); 
		} catch (Exception e) {
			descriptor = ImageDescriptor.getMissingImageDescriptor();
		}
		return descriptor;
	}

}
