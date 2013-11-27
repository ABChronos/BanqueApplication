package org.xtext.banque.application.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.mia.formation.mvc.Action;
import com.mia.formation.mvc.Model;
import com.mia.formation.mvc.ModelProperty;
import com.mia.formation.mvc.MvcPackage;
import com.mia.formation.mvc.UIApplication;
import com.mia.formation.mvc.View;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.xtext.banque.application.services.MyApplicationGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractMyApplicationSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyApplicationGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MvcPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MvcPackage.ACTION:
				if(context == grammarAccess.getActionRule()) {
					sequence_Action(context, (Action) semanticObject); 
					return; 
				}
				else break;
			case MvcPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case MvcPackage.MODEL_PROPERTY:
				if(context == grammarAccess.getModelPropertyRule()) {
					sequence_ModelProperty(context, (ModelProperty) semanticObject); 
					return; 
				}
				else break;
			case MvcPackage.UI_APPLICATION:
				if(context == grammarAccess.getUIApplicationRule()) {
					sequence_UIApplication(context, (UIApplication) semanticObject); 
					return; 
				}
				else break;
			case MvcPackage.VIEW:
				if(context == grammarAccess.getViewRule()) {
					sequence_View(context, (View) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=EString nextPage=[View|EString]?)
	 */
	protected void sequence_Action(EObject context, Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_ModelProperty(EObject context, ModelProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (properties+=ModelProperty properties+=ModelProperty*)? (ownedElements+=Model ownedElements+=Model*)?)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((pages+=View pages+=View*)? (models+=Model models+=Model*)?)
	 */
	protected void sequence_UIApplication(EObject context, UIApplication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString description=EString? model=[Model|EString] (actions+=Action actions+=Action*)?)
	 */
	protected void sequence_View(EObject context, View semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
