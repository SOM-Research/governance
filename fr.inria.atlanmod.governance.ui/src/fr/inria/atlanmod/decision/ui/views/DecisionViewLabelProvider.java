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



package fr.inria.atlanmod.decision.ui.views;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import fr.inria.atlanmod.decision.ui.DecisionPlugin;
import fr.inria.atlanmod.decision.ui.ProxyTask;

public class DecisionViewLabelProvider implements ILabelProvider {

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof ProxyTask) {
			ProxyTask task = (ProxyTask) element;
			if(task.isDecided() && task.isAccepted()) {
				return DecisionPlugin.getImage("icons/accepted.png").createImage();
			} else if(task.isDecided() && !task.isAccepted()){
				return DecisionPlugin.getImage("icons/notAccepted.png").createImage();
			}
		}
		return null;
	}

	@Override
	public String getText(Object element) {
		if (element instanceof ProxyTask) {
			ProxyTask proxyTask = (ProxyTask) element;
			return "Task " + proxyTask.getTaskId();
		}
		return null;
	}

}
