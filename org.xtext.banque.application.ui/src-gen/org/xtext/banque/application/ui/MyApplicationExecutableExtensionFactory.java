/*
 * generated by Xtext
 */
package org.xtext.banque.application.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.banque.application.ui.internal.MyApplicationActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyApplicationExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MyApplicationActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MyApplicationActivator.getInstance().getInjector(MyApplicationActivator.ORG_XTEXT_BANQUE_APPLICATION_MYAPPLICATION);
	}
	
}
