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

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import fr.inria.atlanmod.decision.ui.DecisionEngine;

public class DecisionViewContentProvider implements IStructuredContentProvider,
		ITreeContentProvider {

	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

	}

	@Override
	public Object[] getChildren(Object parentElement) {
		return null;
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return false;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		Object[] elements = DecisionEngine.INSTANCE.getTasks();
		return elements;
//		if (inputElement instanceof List<?>) {
//			List<?> elementList = (List<?>) inputElement;
//			Object firstElement = elementList.get(0);
//			if (firstElement instanceof ProxyTask) {
//				ProxyTask proxyTask = (ProxyTask) firstElement;
//				List<ProxyTask> proxyTaskElementList = (List<ProxyTask>) elementList;
//				return proxyTaskElementList.toArray();
//			}
//		}
//		return null;
	}

}
