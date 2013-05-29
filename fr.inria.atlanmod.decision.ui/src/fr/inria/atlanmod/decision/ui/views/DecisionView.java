package fr.inria.atlanmod.decision.ui.views;

import java.io.File;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.part.ViewPart;

import fr.inria.atlanmod.decision.ui.DecisionEngine;
import fr.inria.atlanmod.decision.ui.DecisionPlugin;

public class DecisionView extends ViewPart implements ISelectionListener, IPartListener2 {
	public static final String ID = "atlanmod.decision.ui.decisionView";

	private static final String LOGIN_ACTION_ICON = "icons/loginAction.png";
	private static final String REFRESH_ACTION_ICON = "icons/refreshAction.png";
	private static final String STRATEGY_ACTION_ICON = "icons/strategyAction.png";
	private static final String DECISION_ACTION_ICON = "icons/decisionAction.png";
	private static final String RESET_ACTION_ICON = "icons/resetAction.png";

	private TreeViewer tree;

	public DecisionView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(final Composite parent) {
		tree = new TreeViewer(parent, SWT.H_SCROLL | SWT.V_SCROLL);
		tree.setContentProvider(new DecisionViewContentProvider());
		tree.setLabelProvider(new DecisionViewLabelProvider());
		//		Object[] elements = getInput();
		//		if(elements.length > 0) tree.setInput(getInput());
		tree.setInput(getViewSite());

		// Reset
		IActionBars bars = getViewSite().getActionBars();
		Action resetAction = new Action() {
			public void run() {
				DecisionEngine.INSTANCE.resetTasks();
				tree.setInput(getViewSite());
				tree.refresh();
			}
		};
		resetAction.setText("0");
		resetAction.setToolTipText("Reset Tasks");
		resetAction.setImageDescriptor(DecisionPlugin.getImage(RESET_ACTION_ICON));
		bars.getMenuManager().add(resetAction);
		bars.getToolBarManager().add(resetAction);

		// Refresh
		Action refreshAction = new Action() {
			public void run() {
				DecisionEngine.INSTANCE.getTasksFromRepository();
				tree.setInput(getViewSite());
				tree.refresh();
			} 
		};
		refreshAction.setText("R");
		refreshAction.setToolTipText("Refresh Tasks");
		refreshAction.setImageDescriptor(DecisionPlugin.getImage(REFRESH_ACTION_ICON));
		bars.getMenuManager().add(refreshAction);
		bars.getToolBarManager().add(refreshAction);

		// Decision
		Action decisionAction = new Action() {
			public void run() {
				DecisionEngine.INSTANCE.applyDecision();
				tree.setInput(getViewSite());
				tree.refresh();
			}
		};
		decisionAction.setText("D");
		decisionAction.setToolTipText("Decide");
		decisionAction.setImageDescriptor(DecisionPlugin.getImage(DECISION_ACTION_ICON));
		bars.getMenuManager().add(decisionAction);
		bars.getToolBarManager().add(decisionAction);

		// Strategy
		Action strategyAction = new Action() {
			public void run() {
				FileDialog dialogStrategy = new FileDialog(parent.getShell());
				dialogStrategy.setText("Select file describing the strategy");
				dialogStrategy.setFilterExtensions(new String[] { "*.strategy" });
				dialogStrategy.setFilterNames(new String[] {"Strategy files(*.strategy)"});
				String strategySelected = dialogStrategy.open();
				File strategyFile = new File(strategySelected);				

				FileDialog dialogCollaboration = new FileDialog(parent.getShell());
				dialogCollaboration.setText("Select file to store the collaboration");
				dialogCollaboration.setFilterExtensions(new String[] { "*.collaboration" });
				dialogCollaboration.setFilterNames(new String[] {"Collaboration files(*.collaboration)"});
				String collaborationSelected = dialogCollaboration.open();
				File collaborationFile = new File(collaborationSelected);
				DecisionEngine.INSTANCE.loadStrategyAndCollaboration(strategyFile, collaborationFile);
			}
		};
		strategyAction.setText("S");
		strategyAction.setToolTipText("Strategy");
		strategyAction.setImageDescriptor(DecisionPlugin.getImage(STRATEGY_ACTION_ICON));
		bars.getMenuManager().add(strategyAction);
		bars.getToolBarManager().add(strategyAction);

		// Login
		Action loginAction = new Action() {
			public void run() {
				InputDialog loginDialog = null;
				loginDialog = new InputDialog(parent.getShell(), "Login", "Username", "Developer 1", null);
				if (loginDialog.open() == Window.OK) {
					String user = loginDialog.getValue();
					DecisionEngine.INSTANCE.login(user);
				}
			}
		};
		loginAction.setText("L");
		loginAction.setToolTipText("Login");
		loginAction.setImageDescriptor(DecisionPlugin.getImage(LOGIN_ACTION_ICON));
		bars.getMenuManager().add(loginAction);
		bars.getToolBarManager().add(loginAction);

		// Contributing Contex menu
		MenuManager contextMenu = new MenuManager("#ViewerPopupMenu");
		Menu menu = contextMenu.createContextMenu(tree.getControl());
		tree.getControl().setMenu(menu);
		getSite().registerContextMenu(contextMenu, tree);
	}


	@Override
	public void setFocus() { 
		// TODO Auto-generated method stub

	}

	@Override
	public void partActivated(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partBroughtToTop(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partClosed(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partDeactivated(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partOpened(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partHidden(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partVisible(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partInputChanged(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// TODO Auto-generated method stub

	}

}
