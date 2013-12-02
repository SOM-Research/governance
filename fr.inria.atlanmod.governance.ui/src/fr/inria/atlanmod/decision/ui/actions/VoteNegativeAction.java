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



package fr.inria.atlanmod.decision.ui.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

import fr.inria.atlanmod.decision.ui.DecisionEngine;
import fr.inria.atlanmod.decision.ui.ProxyTask;

public class VoteNegativeAction implements IViewActionDelegate {
	private Shell shell;
	private ProxyTask task;

	@Override
	public void run(IAction action) {
		task.voteNo(DecisionEngine.INSTANCE.getUser());
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof TreeSelection) {
			TreeSelection treeSelection = (TreeSelection) selection;
			Object element = treeSelection.getFirstElement();
			if (element instanceof ProxyTask) {
				ProxyTask task = (ProxyTask) element;
				this.task = task;
			}
		}
	}

	@Override
	public void init(IViewPart view) {
		shell = view.getViewSite().getShell();
	}

}
