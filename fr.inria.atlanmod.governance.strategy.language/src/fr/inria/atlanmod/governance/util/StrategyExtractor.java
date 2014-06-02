package fr.inria.atlanmod.governance.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import fr.inria.atlanmod.governance.StrategyStandaloneSetup;
import fr.inria.atlanmod.governance.strategy.Project;
import fr.inria.atlanmod.governance.strategy.StrategyPackage;

public class StrategyExtractor {
	public StrategyExtractor() {
		
	}
	
	public static void main(String[] args) {
		StrategyStandaloneSetup.doSetup();
		
		ResourceSet rset = new ResourceSetImpl();
		rset.getPackageRegistry().put(StrategyPackage.eNS_URI, StrategyPackage.eINSTANCE);
		Resource res = rset.getResource(URI.createFileURI("../fr.inria.atlanmod.governance.strategy/examples/majority.xmi"), true);
		Project project = (Project) res.getContents().get(0);
		
		Resource res2 = rset.createResource(URI.createURI("../fr.inria.atlanmod.governance.strategy/examples/majority.strategy"));

		try {
			res2.getContents().add(project);
			res2.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
		System.out.println(res2.toString());
	}
}
