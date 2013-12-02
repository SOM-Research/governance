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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.mylyn.tasks.core.ITask;
import org.eclipse.mylyn.tasks.core.ITaskActivityManager;
import org.eclipse.mylyn.tasks.ui.TasksUi;

public class MylynMediator {
	public final static  MylynMediator INSTANCE = new MylynMediator();
	
	public List<ProxyTask> getProxyTasks() {
		ITaskActivityManager tam = TasksUi.getTaskActivityManager();
		Iterator<ITask> tasks = tam.getAllDueTasks().iterator();	
		List<ProxyTask> proxyTasks = new ArrayList<ProxyTask>();
		while(tasks.hasNext()) {
			ITask task = tasks.next();
			ProxyTask proxyTask = new ProxyTask(task);
			proxyTasks.add(proxyTask);
		}
		return proxyTasks;
	}
}
