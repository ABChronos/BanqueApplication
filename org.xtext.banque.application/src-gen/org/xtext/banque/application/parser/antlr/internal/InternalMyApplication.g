/*
* generated by Xtext
*/
grammar InternalMyApplication;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.banque.application.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.banque.application.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.banque.application.services.MyApplicationGrammarAccess;

}

@parser::members {

 	private MyApplicationGrammarAccess grammarAccess;
 	
    public InternalMyApplicationParser(TokenStream input, MyApplicationGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "UIApplication";	
   	}
   	
   	@Override
   	protected MyApplicationGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleUIApplication
entryRuleUIApplication returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getUIApplicationRule()); }
	 iv_ruleUIApplication=ruleUIApplication 
	 { $current=$iv_ruleUIApplication.current; } 
	 EOF 
;

// Rule UIApplication
ruleUIApplication returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getUIApplicationAccess().getUIApplicationAction_0(),
            $current);
    }
)	otherlv_1='UIApplication' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getUIApplicationAccess().getUIApplicationKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getUIApplicationAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='pages' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getUIApplicationAccess().getPagesKeyword_3_0());
    }
	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getUIApplicationAccess().getLeftCurlyBracketKeyword_3_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getUIApplicationAccess().getPagesViewParserRuleCall_3_2_0()); 
	    }
		lv_pages_5_0=ruleView		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUIApplicationRule());
	        }
       		add(
       			$current, 
       			"pages",
        		lv_pages_5_0, 
        		"View");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_6=',' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getUIApplicationAccess().getCommaKeyword_3_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getUIApplicationAccess().getPagesViewParserRuleCall_3_3_1_0()); 
	    }
		lv_pages_7_0=ruleView		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUIApplicationRule());
	        }
       		add(
       			$current, 
       			"pages",
        		lv_pages_7_0, 
        		"View");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getUIApplicationAccess().getRightCurlyBracketKeyword_3_4());
    }
)?(	otherlv_9='models' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getUIApplicationAccess().getModelsKeyword_4_0());
    }
	otherlv_10='{' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getUIApplicationAccess().getLeftCurlyBracketKeyword_4_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getUIApplicationAccess().getModelsModelParserRuleCall_4_2_0()); 
	    }
		lv_models_11_0=ruleModel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUIApplicationRule());
	        }
       		add(
       			$current, 
       			"models",
        		lv_models_11_0, 
        		"Model");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_12=',' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getUIApplicationAccess().getCommaKeyword_4_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getUIApplicationAccess().getModelsModelParserRuleCall_4_3_1_0()); 
	    }
		lv_models_13_0=ruleModel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUIApplicationRule());
	        }
       		add(
       			$current, 
       			"models",
        		lv_models_13_0, 
        		"Model");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_14='}' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getUIApplicationAccess().getRightCurlyBracketKeyword_4_4());
    }
)?	otherlv_15='}' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getUIApplicationAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleView
entryRuleView returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getViewRule()); }
	 iv_ruleView=ruleView 
	 { $current=$iv_ruleView.current; } 
	 EOF 
;

// Rule View
ruleView returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='View' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getViewAccess().getViewKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getViewAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getViewRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getViewAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='description' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getViewAccess().getDescriptionKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getViewAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
	    }
		lv_description_4_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getViewRule());
	        }
       		set(
       			$current, 
       			"description",
        		lv_description_4_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_5='model' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getViewAccess().getModelKeyword_4());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getViewRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getViewAccess().getModelModelCrossReference_5_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_7='actions' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getViewAccess().getActionsKeyword_6_0());
    }
	otherlv_8='{' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getViewAccess().getLeftCurlyBracketKeyword_6_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getViewAccess().getActionsActionParserRuleCall_6_2_0()); 
	    }
		lv_actions_9_0=ruleAction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getViewRule());
	        }
       		add(
       			$current, 
       			"actions",
        		lv_actions_9_0, 
        		"Action");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_10=',' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getViewAccess().getCommaKeyword_6_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getViewAccess().getActionsActionParserRuleCall_6_3_1_0()); 
	    }
		lv_actions_11_0=ruleAction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getViewRule());
	        }
       		add(
       			$current, 
       			"actions",
        		lv_actions_11_0, 
        		"Action");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_12='}' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getViewAccess().getRightCurlyBracketKeyword_6_4());
    }
)?	otherlv_13='}' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getViewAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getModelAccess().getModelAction_0(),
            $current);
    }
)	otherlv_1='Model' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='properties' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getPropertiesKeyword_4_0());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getPropertiesModelPropertyParserRuleCall_4_2_0()); 
	    }
		lv_properties_6_0=ruleModelProperty		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"properties",
        		lv_properties_6_0, 
        		"ModelProperty");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_7=',' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getModelAccess().getCommaKeyword_4_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getPropertiesModelPropertyParserRuleCall_4_3_1_0()); 
	    }
		lv_properties_8_0=ruleModelProperty		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"properties",
        		lv_properties_8_0, 
        		"ModelProperty");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4_4());
    }
)?(	otherlv_10='ownedElements' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getModelAccess().getOwnedElementsKeyword_5_0());
    }
	otherlv_11='{' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getOwnedElementsModelParserRuleCall_5_2_0()); 
	    }
		lv_ownedElements_12_0=ruleModel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"ownedElements",
        		lv_ownedElements_12_0, 
        		"Model");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_13=',' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getModelAccess().getCommaKeyword_5_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getOwnedElementsModelParserRuleCall_5_3_1_0()); 
	    }
		lv_ownedElements_14_0=ruleModel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"ownedElements",
        		lv_ownedElements_14_0, 
        		"Model");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_15='}' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5_4());
    }
)?	otherlv_16='}' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	 iv_ruleAction=ruleAction 
	 { $current=$iv_ruleAction.current; } 
	 EOF 
;

// Rule Action
ruleAction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getActionAccess().getActionAction_0(),
            $current);
    }
)	otherlv_1='Action' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getActionAccess().getActionKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActionRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='nextPage' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getActionAccess().getNextPageKeyword_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getActionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getActionAccess().getNextPageViewCrossReference_4_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleModelProperty
entryRuleModelProperty returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelPropertyRule()); }
	 iv_ruleModelProperty=ruleModelProperty 
	 { $current=$iv_ruleModelProperty.current; } 
	 EOF 
;

// Rule ModelProperty
ruleModelProperty returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getModelPropertyAccess().getModelPropertyAction_0(),
            $current);
    }
)	otherlv_1='ModelProperty' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getModelPropertyAccess().getModelPropertyKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelPropertyAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelPropertyRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


