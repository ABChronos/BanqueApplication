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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyApplicationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'UIApplication'", "'{'", "'pages'", "','", "'}'", "'models'", "'View'", "'description'", "'model'", "'actions'", "'Model'", "'properties'", "'ownedElements'", "'Action'", "'nextPage'", "'ModelProperty'"
    };
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalMyApplicationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyApplicationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyApplicationParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g"; }



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



    // $ANTLR start "entryRuleUIApplication"
    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:67:1: entryRuleUIApplication returns [EObject current=null] : iv_ruleUIApplication= ruleUIApplication EOF ;
    public final EObject entryRuleUIApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIApplication = null;


        try {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:68:2: (iv_ruleUIApplication= ruleUIApplication EOF )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:69:2: iv_ruleUIApplication= ruleUIApplication EOF
            {
             newCompositeNode(grammarAccess.getUIApplicationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUIApplication_in_entryRuleUIApplication75);
            iv_ruleUIApplication=ruleUIApplication();

            state._fsp--;

             current =iv_ruleUIApplication; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUIApplication85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUIApplication"


    // $ANTLR start "ruleUIApplication"
    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:76:1: ruleUIApplication returns [EObject current=null] : ( () otherlv_1= 'UIApplication' otherlv_2= '{' (otherlv_3= 'pages' otherlv_4= '{' ( (lv_pages_5_0= ruleView ) ) (otherlv_6= ',' ( (lv_pages_7_0= ruleView ) ) )* otherlv_8= '}' )? (otherlv_9= 'models' otherlv_10= '{' ( (lv_models_11_0= ruleModel ) ) (otherlv_12= ',' ( (lv_models_13_0= ruleModel ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleUIApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_pages_5_0 = null;

        EObject lv_pages_7_0 = null;

        EObject lv_models_11_0 = null;

        EObject lv_models_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:79:28: ( ( () otherlv_1= 'UIApplication' otherlv_2= '{' (otherlv_3= 'pages' otherlv_4= '{' ( (lv_pages_5_0= ruleView ) ) (otherlv_6= ',' ( (lv_pages_7_0= ruleView ) ) )* otherlv_8= '}' )? (otherlv_9= 'models' otherlv_10= '{' ( (lv_models_11_0= ruleModel ) ) (otherlv_12= ',' ( (lv_models_13_0= ruleModel ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:80:1: ( () otherlv_1= 'UIApplication' otherlv_2= '{' (otherlv_3= 'pages' otherlv_4= '{' ( (lv_pages_5_0= ruleView ) ) (otherlv_6= ',' ( (lv_pages_7_0= ruleView ) ) )* otherlv_8= '}' )? (otherlv_9= 'models' otherlv_10= '{' ( (lv_models_11_0= ruleModel ) ) (otherlv_12= ',' ( (lv_models_13_0= ruleModel ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:80:1: ( () otherlv_1= 'UIApplication' otherlv_2= '{' (otherlv_3= 'pages' otherlv_4= '{' ( (lv_pages_5_0= ruleView ) ) (otherlv_6= ',' ( (lv_pages_7_0= ruleView ) ) )* otherlv_8= '}' )? (otherlv_9= 'models' otherlv_10= '{' ( (lv_models_11_0= ruleModel ) ) (otherlv_12= ',' ( (lv_models_13_0= ruleModel ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:80:2: () otherlv_1= 'UIApplication' otherlv_2= '{' (otherlv_3= 'pages' otherlv_4= '{' ( (lv_pages_5_0= ruleView ) ) (otherlv_6= ',' ( (lv_pages_7_0= ruleView ) ) )* otherlv_8= '}' )? (otherlv_9= 'models' otherlv_10= '{' ( (lv_models_11_0= ruleModel ) ) (otherlv_12= ',' ( (lv_models_13_0= ruleModel ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:80:2: ()
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUIApplicationAccess().getUIApplicationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleUIApplication131); 

                	newLeafNode(otherlv_1, grammarAccess.getUIApplicationAccess().getUIApplicationKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleUIApplication143); 

                	newLeafNode(otherlv_2, grammarAccess.getUIApplicationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:94:1: (otherlv_3= 'pages' otherlv_4= '{' ( (lv_pages_5_0= ruleView ) ) (otherlv_6= ',' ( (lv_pages_7_0= ruleView ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:94:3: otherlv_3= 'pages' otherlv_4= '{' ( (lv_pages_5_0= ruleView ) ) (otherlv_6= ',' ( (lv_pages_7_0= ruleView ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleUIApplication156); 

                        	newLeafNode(otherlv_3, grammarAccess.getUIApplicationAccess().getPagesKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleUIApplication168); 

                        	newLeafNode(otherlv_4, grammarAccess.getUIApplicationAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:102:1: ( (lv_pages_5_0= ruleView ) )
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:103:1: (lv_pages_5_0= ruleView )
                    {
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:103:1: (lv_pages_5_0= ruleView )
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:104:3: lv_pages_5_0= ruleView
                    {
                     
                    	        newCompositeNode(grammarAccess.getUIApplicationAccess().getPagesViewParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleView_in_ruleUIApplication189);
                    lv_pages_5_0=ruleView();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUIApplicationRule());
                    	        }
                           		add(
                           			current, 
                           			"pages",
                            		lv_pages_5_0, 
                            		"View");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:120:2: (otherlv_6= ',' ( (lv_pages_7_0= ruleView ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:120:4: otherlv_6= ',' ( (lv_pages_7_0= ruleView ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUIApplication202); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getUIApplicationAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:124:1: ( (lv_pages_7_0= ruleView ) )
                    	    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:125:1: (lv_pages_7_0= ruleView )
                    	    {
                    	    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:125:1: (lv_pages_7_0= ruleView )
                    	    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:126:3: lv_pages_7_0= ruleView
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUIApplicationAccess().getPagesViewParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleView_in_ruleUIApplication223);
                    	    lv_pages_7_0=ruleView();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUIApplicationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"pages",
                    	            		lv_pages_7_0, 
                    	            		"View");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleUIApplication237); 

                        	newLeafNode(otherlv_8, grammarAccess.getUIApplicationAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:146:3: (otherlv_9= 'models' otherlv_10= '{' ( (lv_models_11_0= ruleModel ) ) (otherlv_12= ',' ( (lv_models_13_0= ruleModel ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:146:5: otherlv_9= 'models' otherlv_10= '{' ( (lv_models_11_0= ruleModel ) ) (otherlv_12= ',' ( (lv_models_13_0= ruleModel ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleUIApplication252); 

                        	newLeafNode(otherlv_9, grammarAccess.getUIApplicationAccess().getModelsKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleUIApplication264); 

                        	newLeafNode(otherlv_10, grammarAccess.getUIApplicationAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:154:1: ( (lv_models_11_0= ruleModel ) )
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:155:1: (lv_models_11_0= ruleModel )
                    {
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:155:1: (lv_models_11_0= ruleModel )
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:156:3: lv_models_11_0= ruleModel
                    {
                     
                    	        newCompositeNode(grammarAccess.getUIApplicationAccess().getModelsModelParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleModel_in_ruleUIApplication285);
                    lv_models_11_0=ruleModel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUIApplicationRule());
                    	        }
                           		add(
                           			current, 
                           			"models",
                            		lv_models_11_0, 
                            		"Model");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:172:2: (otherlv_12= ',' ( (lv_models_13_0= ruleModel ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:172:4: otherlv_12= ',' ( (lv_models_13_0= ruleModel ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUIApplication298); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getUIApplicationAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:176:1: ( (lv_models_13_0= ruleModel ) )
                    	    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:177:1: (lv_models_13_0= ruleModel )
                    	    {
                    	    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:177:1: (lv_models_13_0= ruleModel )
                    	    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:178:3: lv_models_13_0= ruleModel
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUIApplicationAccess().getModelsModelParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleModel_in_ruleUIApplication319);
                    	    lv_models_13_0=ruleModel();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUIApplicationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"models",
                    	            		lv_models_13_0, 
                    	            		"Model");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleUIApplication333); 

                        	newLeafNode(otherlv_14, grammarAccess.getUIApplicationAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleUIApplication347); 

                	newLeafNode(otherlv_15, grammarAccess.getUIApplicationAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUIApplication"


    // $ANTLR start "entryRuleView"
    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:210:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:211:2: (iv_ruleView= ruleView EOF )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:212:2: iv_ruleView= ruleView EOF
            {
             newCompositeNode(grammarAccess.getViewRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleView_in_entryRuleView383);
            iv_ruleView=ruleView();

            state._fsp--;

             current =iv_ruleView; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleView393); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleView"


    // $ANTLR start "ruleView"
    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:219:1: ruleView returns [EObject current=null] : (otherlv_0= 'View' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'model' ( ( ruleEString ) ) (otherlv_7= 'actions' otherlv_8= '{' ( (lv_actions_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        EObject lv_actions_9_0 = null;

        EObject lv_actions_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:222:28: ( (otherlv_0= 'View' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'model' ( ( ruleEString ) ) (otherlv_7= 'actions' otherlv_8= '{' ( (lv_actions_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:223:1: (otherlv_0= 'View' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'model' ( ( ruleEString ) ) (otherlv_7= 'actions' otherlv_8= '{' ( (lv_actions_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:223:1: (otherlv_0= 'View' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'model' ( ( ruleEString ) ) (otherlv_7= 'actions' otherlv_8= '{' ( (lv_actions_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:223:3: otherlv_0= 'View' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'model' ( ( ruleEString ) ) (otherlv_7= 'actions' otherlv_8= '{' ( (lv_actions_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleView430); 

                	newLeafNode(otherlv_0, grammarAccess.getViewAccess().getViewKeyword_0());
                
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:227:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:228:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:228:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:229:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getViewAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleView451);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getViewRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleView463); 

                	newLeafNode(otherlv_2, grammarAccess.getViewAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:249:1: (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:249:3: otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleView476); 

                        	newLeafNode(otherlv_3, grammarAccess.getViewAccess().getDescriptionKeyword_3_0());
                        
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:253:1: ( (lv_description_4_0= ruleEString ) )
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:254:1: (lv_description_4_0= ruleEString )
                    {
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:254:1: (lv_description_4_0= ruleEString )
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:255:3: lv_description_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getViewAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleView497);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getViewRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleView511); 

                	newLeafNode(otherlv_5, grammarAccess.getViewAccess().getModelKeyword_4());
                
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:275:1: ( ( ruleEString ) )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:276:1: ( ruleEString )
            {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:276:1: ( ruleEString )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:277:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getViewRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getViewAccess().getModelModelCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleView534);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:290:2: (otherlv_7= 'actions' otherlv_8= '{' ( (lv_actions_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) ) )* otherlv_12= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:290:4: otherlv_7= 'actions' otherlv_8= '{' ( (lv_actions_9_0= ruleAction ) ) (otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleView547); 

                        	newLeafNode(otherlv_7, grammarAccess.getViewAccess().getActionsKeyword_6_0());
                        
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleView559); 

                        	newLeafNode(otherlv_8, grammarAccess.getViewAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:298:1: ( (lv_actions_9_0= ruleAction ) )
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:299:1: (lv_actions_9_0= ruleAction )
                    {
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:299:1: (lv_actions_9_0= ruleAction )
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:300:3: lv_actions_9_0= ruleAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getViewAccess().getActionsActionParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleView580);
                    lv_actions_9_0=ruleAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getViewRule());
                    	        }
                           		add(
                           			current, 
                           			"actions",
                            		lv_actions_9_0, 
                            		"Action");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:316:2: (otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:316:4: otherlv_10= ',' ( (lv_actions_11_0= ruleAction ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleView593); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getViewAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:320:1: ( (lv_actions_11_0= ruleAction ) )
                    	    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:321:1: (lv_actions_11_0= ruleAction )
                    	    {
                    	    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:321:1: (lv_actions_11_0= ruleAction )
                    	    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:322:3: lv_actions_11_0= ruleAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getViewAccess().getActionsActionParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleView614);
                    	    lv_actions_11_0=ruleAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getViewRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"actions",
                    	            		lv_actions_11_0, 
                    	            		"Action");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleView628); 

                        	newLeafNode(otherlv_12, grammarAccess.getViewAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleView642); 

                	newLeafNode(otherlv_13, grammarAccess.getViewAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleView"


    // $ANTLR start "entryRuleModel"
    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:354:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:355:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:356:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel678);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel688); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:363:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleModelProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleModelProperty ) ) )* otherlv_9= '}' )? (otherlv_10= 'ownedElements' otherlv_11= '{' ( (lv_ownedElements_12_0= ruleModel ) ) (otherlv_13= ',' ( (lv_ownedElements_14_0= ruleModel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_properties_6_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_ownedElements_12_0 = null;

        EObject lv_ownedElements_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:366:28: ( ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleModelProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleModelProperty ) ) )* otherlv_9= '}' )? (otherlv_10= 'ownedElements' otherlv_11= '{' ( (lv_ownedElements_12_0= ruleModel ) ) (otherlv_13= ',' ( (lv_ownedElements_14_0= ruleModel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:367:1: ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleModelProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleModelProperty ) ) )* otherlv_9= '}' )? (otherlv_10= 'ownedElements' otherlv_11= '{' ( (lv_ownedElements_12_0= ruleModel ) ) (otherlv_13= ',' ( (lv_ownedElements_14_0= ruleModel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:367:1: ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleModelProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleModelProperty ) ) )* otherlv_9= '}' )? (otherlv_10= 'ownedElements' otherlv_11= '{' ( (lv_ownedElements_12_0= ruleModel ) ) (otherlv_13= ',' ( (lv_ownedElements_14_0= ruleModel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:367:2: () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleModelProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleModelProperty ) ) )* otherlv_9= '}' )? (otherlv_10= 'ownedElements' otherlv_11= '{' ( (lv_ownedElements_12_0= ruleModel ) ) (otherlv_13= ',' ( (lv_ownedElements_14_0= ruleModel ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:367:2: ()
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:368:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleModel734); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
                
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:377:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:378:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:378:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:379:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleModel755);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel767); 

                	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:399:1: (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleModelProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleModelProperty ) ) )* otherlv_9= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:399:3: otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleModelProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleModelProperty ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleModel780); 

                        	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getPropertiesKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel792); 

                        	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:407:1: ( (lv_properties_6_0= ruleModelProperty ) )
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:408:1: (lv_properties_6_0= ruleModelProperty )
                    {
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:408:1: (lv_properties_6_0= ruleModelProperty )
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:409:3: lv_properties_6_0= ruleModelProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getPropertiesModelPropertyParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleModelProperty_in_ruleModel813);
                    lv_properties_6_0=ruleModelProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"properties",
                            		lv_properties_6_0, 
                            		"ModelProperty");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:425:2: (otherlv_7= ',' ( (lv_properties_8_0= ruleModelProperty ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:425:4: otherlv_7= ',' ( (lv_properties_8_0= ruleModelProperty ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleModel826); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getModelAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:429:1: ( (lv_properties_8_0= ruleModelProperty ) )
                    	    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:430:1: (lv_properties_8_0= ruleModelProperty )
                    	    {
                    	    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:430:1: (lv_properties_8_0= ruleModelProperty )
                    	    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:431:3: lv_properties_8_0= ruleModelProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getPropertiesModelPropertyParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleModelProperty_in_ruleModel847);
                    	    lv_properties_8_0=ruleModelProperty();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"properties",
                    	            		lv_properties_8_0, 
                    	            		"ModelProperty");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleModel861); 

                        	newLeafNode(otherlv_9, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:451:3: (otherlv_10= 'ownedElements' otherlv_11= '{' ( (lv_ownedElements_12_0= ruleModel ) ) (otherlv_13= ',' ( (lv_ownedElements_14_0= ruleModel ) ) )* otherlv_15= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:451:5: otherlv_10= 'ownedElements' otherlv_11= '{' ( (lv_ownedElements_12_0= ruleModel ) ) (otherlv_13= ',' ( (lv_ownedElements_14_0= ruleModel ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleModel876); 

                        	newLeafNode(otherlv_10, grammarAccess.getModelAccess().getOwnedElementsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel888); 

                        	newLeafNode(otherlv_11, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:459:1: ( (lv_ownedElements_12_0= ruleModel ) )
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:460:1: (lv_ownedElements_12_0= ruleModel )
                    {
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:460:1: (lv_ownedElements_12_0= ruleModel )
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:461:3: lv_ownedElements_12_0= ruleModel
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getOwnedElementsModelParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleModel_in_ruleModel909);
                    lv_ownedElements_12_0=ruleModel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"ownedElements",
                            		lv_ownedElements_12_0, 
                            		"Model");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:477:2: (otherlv_13= ',' ( (lv_ownedElements_14_0= ruleModel ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:477:4: otherlv_13= ',' ( (lv_ownedElements_14_0= ruleModel ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleModel922); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getModelAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:481:1: ( (lv_ownedElements_14_0= ruleModel ) )
                    	    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:482:1: (lv_ownedElements_14_0= ruleModel )
                    	    {
                    	    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:482:1: (lv_ownedElements_14_0= ruleModel )
                    	    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:483:3: lv_ownedElements_14_0= ruleModel
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getOwnedElementsModelParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleModel_in_ruleModel943);
                    	    lv_ownedElements_14_0=ruleModel();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ownedElements",
                    	            		lv_ownedElements_14_0, 
                    	            		"Model");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleModel957); 

                        	newLeafNode(otherlv_15, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleModel971); 

                	newLeafNode(otherlv_16, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:515:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:516:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:517:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1008);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1019); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:524:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:527:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:528:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:528:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:528:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1059); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:536:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1085); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAction"
    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:551:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:552:2: (iv_ruleAction= ruleAction EOF )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:553:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction1130);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction1140); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:560:1: ruleAction returns [EObject current=null] : ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nextPage' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:563:28: ( ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nextPage' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:564:1: ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nextPage' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:564:1: ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nextPage' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:564:2: () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nextPage' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:564:2: ()
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:565:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getActionAccess().getActionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAction1186); 

                	newLeafNode(otherlv_1, grammarAccess.getActionAccess().getActionKeyword_1());
                
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:574:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:575:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:575:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:576:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction1207);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAction1219); 

                	newLeafNode(otherlv_3, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:596:1: (otherlv_4= 'nextPage' ( ( ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:596:3: otherlv_4= 'nextPage' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAction1232); 

                        	newLeafNode(otherlv_4, grammarAccess.getActionAccess().getNextPageKeyword_4_0());
                        
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:600:1: ( ( ruleEString ) )
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:601:1: ( ruleEString )
                    {
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:601:1: ( ruleEString )
                    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:602:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getNextPageViewCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction1255);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAction1269); 

                	newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleModelProperty"
    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:627:1: entryRuleModelProperty returns [EObject current=null] : iv_ruleModelProperty= ruleModelProperty EOF ;
    public final EObject entryRuleModelProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelProperty = null;


        try {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:628:2: (iv_ruleModelProperty= ruleModelProperty EOF )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:629:2: iv_ruleModelProperty= ruleModelProperty EOF
            {
             newCompositeNode(grammarAccess.getModelPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModelProperty_in_entryRuleModelProperty1305);
            iv_ruleModelProperty=ruleModelProperty();

            state._fsp--;

             current =iv_ruleModelProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModelProperty1315); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelProperty"


    // $ANTLR start "ruleModelProperty"
    // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:636:1: ruleModelProperty returns [EObject current=null] : ( () otherlv_1= 'ModelProperty' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleModelProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:639:28: ( ( () otherlv_1= 'ModelProperty' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:640:1: ( () otherlv_1= 'ModelProperty' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:640:1: ( () otherlv_1= 'ModelProperty' ( (lv_name_2_0= ruleEString ) ) )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:640:2: () otherlv_1= 'ModelProperty' ( (lv_name_2_0= ruleEString ) )
            {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:640:2: ()
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:641:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelPropertyAccess().getModelPropertyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleModelProperty1361); 

                	newLeafNode(otherlv_1, grammarAccess.getModelPropertyAccess().getModelPropertyKeyword_1());
                
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:650:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:651:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:651:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.banque.application/src-gen/org/xtext/banque/application/parser/antlr/internal/InternalMyApplication.g:652:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getModelPropertyAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleModelProperty1382);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelProperty"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleUIApplication_in_entryRuleUIApplication75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUIApplication85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleUIApplication131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleUIApplication143 = new BitSet(new long[]{0x000000000001A000L});
        public static final BitSet FOLLOW_13_in_ruleUIApplication156 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleUIApplication168 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_ruleView_in_ruleUIApplication189 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleUIApplication202 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_ruleView_in_ruleUIApplication223 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleUIApplication237 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleUIApplication252 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleUIApplication264 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleModel_in_ruleUIApplication285 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleUIApplication298 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleModel_in_ruleUIApplication319 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleUIApplication333 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleUIApplication347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleView_in_entryRuleView383 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleView393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleView430 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleView451 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleView463 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleView476 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleView497 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleView511 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleView534 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleView547 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleView559 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleView580 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleView593 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleView614 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleView628 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleView642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel678 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleModel734 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModel755 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModel767 = new BitSet(new long[]{0x0000000000C08000L});
        public static final BitSet FOLLOW_22_in_ruleModel780 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModel792 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleModelProperty_in_ruleModel813 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleModel826 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleModelProperty_in_ruleModel847 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleModel861 = new BitSet(new long[]{0x0000000000808000L});
        public static final BitSet FOLLOW_23_in_ruleModel876 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModel888 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleModel_in_ruleModel909 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleModel922 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleModel_in_ruleModel943 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleModel957 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleModel971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1008 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1130 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction1140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleAction1186 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction1207 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAction1219 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_25_in_ruleAction1232 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction1255 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAction1269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModelProperty_in_entryRuleModelProperty1305 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModelProperty1315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleModelProperty1361 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModelProperty1382 = new BitSet(new long[]{0x0000000000000002L});
    }


}