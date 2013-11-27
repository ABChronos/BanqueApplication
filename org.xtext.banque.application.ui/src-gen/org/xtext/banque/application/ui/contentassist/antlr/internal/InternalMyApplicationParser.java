package org.xtext.banque.application.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.banque.application.services.MyApplicationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyApplicationParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'UIApplication'", "'{'", "'}'", "'pages'", "','", "'models'", "'View'", "'model'", "'description'", "'actions'", "'Model'", "'properties'", "'ownedElements'", "'Action'", "'nextPage'", "'ModelProperty'"
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
    public String getGrammarFileName() { return "../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g"; }


     
     	private MyApplicationGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyApplicationGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleUIApplication"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:60:1: entryRuleUIApplication : ruleUIApplication EOF ;
    public final void entryRuleUIApplication() throws RecognitionException {
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:61:1: ( ruleUIApplication EOF )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:62:1: ruleUIApplication EOF
            {
             before(grammarAccess.getUIApplicationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUIApplication_in_entryRuleUIApplication61);
            ruleUIApplication();

            state._fsp--;

             after(grammarAccess.getUIApplicationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUIApplication68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUIApplication"


    // $ANTLR start "ruleUIApplication"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:69:1: ruleUIApplication : ( ( rule__UIApplication__Group__0 ) ) ;
    public final void ruleUIApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:73:2: ( ( ( rule__UIApplication__Group__0 ) ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:74:1: ( ( rule__UIApplication__Group__0 ) )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:74:1: ( ( rule__UIApplication__Group__0 ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:75:1: ( rule__UIApplication__Group__0 )
            {
             before(grammarAccess.getUIApplicationAccess().getGroup()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:76:1: ( rule__UIApplication__Group__0 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:76:2: rule__UIApplication__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group__0_in_ruleUIApplication94);
            rule__UIApplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUIApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUIApplication"


    // $ANTLR start "entryRuleView"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:88:1: entryRuleView : ruleView EOF ;
    public final void entryRuleView() throws RecognitionException {
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:89:1: ( ruleView EOF )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:90:1: ruleView EOF
            {
             before(grammarAccess.getViewRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleView_in_entryRuleView121);
            ruleView();

            state._fsp--;

             after(grammarAccess.getViewRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleView128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleView"


    // $ANTLR start "ruleView"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:97:1: ruleView : ( ( rule__View__Group__0 ) ) ;
    public final void ruleView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:101:2: ( ( ( rule__View__Group__0 ) ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:102:1: ( ( rule__View__Group__0 ) )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:102:1: ( ( rule__View__Group__0 ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:103:1: ( rule__View__Group__0 )
            {
             before(grammarAccess.getViewAccess().getGroup()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:104:1: ( rule__View__Group__0 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:104:2: rule__View__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__View__Group__0_in_ruleView154);
            rule__View__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleView"


    // $ANTLR start "entryRuleModel"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:116:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:117:1: ( ruleModel EOF )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:118:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel181);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:125:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:129:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:130:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:130:1: ( ( rule__Model__Group__0 ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:131:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:132:1: ( rule__Model__Group__0 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:132:2: rule__Model__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0_in_ruleModel214);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:144:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:145:1: ( ruleEString EOF )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:146:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString241);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:153:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:157:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:158:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:158:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:159:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:160:1: ( rule__EString__Alternatives )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:160:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString274);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAction"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:172:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:173:1: ( ruleAction EOF )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:174:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction301);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:181:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:185:2: ( ( ( rule__Action__Group__0 ) ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:186:1: ( ( rule__Action__Group__0 ) )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:186:1: ( ( rule__Action__Group__0 ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:187:1: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:188:1: ( rule__Action__Group__0 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:188:2: rule__Action__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__0_in_ruleAction334);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleModelProperty"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:200:1: entryRuleModelProperty : ruleModelProperty EOF ;
    public final void entryRuleModelProperty() throws RecognitionException {
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:201:1: ( ruleModelProperty EOF )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:202:1: ruleModelProperty EOF
            {
             before(grammarAccess.getModelPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModelProperty_in_entryRuleModelProperty361);
            ruleModelProperty();

            state._fsp--;

             after(grammarAccess.getModelPropertyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModelProperty368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelProperty"


    // $ANTLR start "ruleModelProperty"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:209:1: ruleModelProperty : ( ( rule__ModelProperty__Group__0 ) ) ;
    public final void ruleModelProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:213:2: ( ( ( rule__ModelProperty__Group__0 ) ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:214:1: ( ( rule__ModelProperty__Group__0 ) )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:214:1: ( ( rule__ModelProperty__Group__0 ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:215:1: ( rule__ModelProperty__Group__0 )
            {
             before(grammarAccess.getModelPropertyAccess().getGroup()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:216:1: ( rule__ModelProperty__Group__0 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:216:2: rule__ModelProperty__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModelProperty__Group__0_in_ruleModelProperty394);
            rule__ModelProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelProperty"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:228:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:232:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:233:1: ( RULE_STRING )
                    {
                    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:233:1: ( RULE_STRING )
                    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:234:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives430); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:239:6: ( RULE_ID )
                    {
                    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:239:6: ( RULE_ID )
                    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:240:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives447); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__UIApplication__Group__0"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:252:1: rule__UIApplication__Group__0 : rule__UIApplication__Group__0__Impl rule__UIApplication__Group__1 ;
    public final void rule__UIApplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:256:1: ( rule__UIApplication__Group__0__Impl rule__UIApplication__Group__1 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:257:2: rule__UIApplication__Group__0__Impl rule__UIApplication__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group__0__Impl_in_rule__UIApplication__Group__0477);
            rule__UIApplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group__1_in_rule__UIApplication__Group__0480);
            rule__UIApplication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group__0"


    // $ANTLR start "rule__UIApplication__Group__0__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:264:1: rule__UIApplication__Group__0__Impl : ( () ) ;
    public final void rule__UIApplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:268:1: ( ( () ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:269:1: ( () )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:269:1: ( () )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:270:1: ()
            {
             before(grammarAccess.getUIApplicationAccess().getUIApplicationAction_0()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:271:1: ()
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:273:1: 
            {
            }

             after(grammarAccess.getUIApplicationAccess().getUIApplicationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group__0__Impl"


    // $ANTLR start "rule__UIApplication__Group__1"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:283:1: rule__UIApplication__Group__1 : rule__UIApplication__Group__1__Impl rule__UIApplication__Group__2 ;
    public final void rule__UIApplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:287:1: ( rule__UIApplication__Group__1__Impl rule__UIApplication__Group__2 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:288:2: rule__UIApplication__Group__1__Impl rule__UIApplication__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group__1__Impl_in_rule__UIApplication__Group__1538);
            rule__UIApplication__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group__2_in_rule__UIApplication__Group__1541);
            rule__UIApplication__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group__1"


    // $ANTLR start "rule__UIApplication__Group__1__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:295:1: rule__UIApplication__Group__1__Impl : ( 'UIApplication' ) ;
    public final void rule__UIApplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:299:1: ( ( 'UIApplication' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:300:1: ( 'UIApplication' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:300:1: ( 'UIApplication' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:301:1: 'UIApplication'
            {
             before(grammarAccess.getUIApplicationAccess().getUIApplicationKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__UIApplication__Group__1__Impl569); 
             after(grammarAccess.getUIApplicationAccess().getUIApplicationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group__1__Impl"


    // $ANTLR start "rule__UIApplication__Group__2"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:314:1: rule__UIApplication__Group__2 : rule__UIApplication__Group__2__Impl rule__UIApplication__Group__3 ;
    public final void rule__UIApplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:318:1: ( rule__UIApplication__Group__2__Impl rule__UIApplication__Group__3 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:319:2: rule__UIApplication__Group__2__Impl rule__UIApplication__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group__2__Impl_in_rule__UIApplication__Group__2600);
            rule__UIApplication__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group__3_in_rule__UIApplication__Group__2603);
            rule__UIApplication__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group__2"


    // $ANTLR start "rule__UIApplication__Group__2__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:326:1: rule__UIApplication__Group__2__Impl : ( '{' ) ;
    public final void rule__UIApplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:330:1: ( ( '{' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:331:1: ( '{' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:331:1: ( '{' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:332:1: '{'
            {
             before(grammarAccess.getUIApplicationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__UIApplication__Group__2__Impl631); 
             after(grammarAccess.getUIApplicationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group__2__Impl"


    // $ANTLR start "rule__UIApplication__Group__3"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:345:1: rule__UIApplication__Group__3 : rule__UIApplication__Group__3__Impl rule__UIApplication__Group__4 ;
    public final void rule__UIApplication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:349:1: ( rule__UIApplication__Group__3__Impl rule__UIApplication__Group__4 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:350:2: rule__UIApplication__Group__3__Impl rule__UIApplication__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group__3__Impl_in_rule__UIApplication__Group__3662);
            rule__UIApplication__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group__4_in_rule__UIApplication__Group__3665);
            rule__UIApplication__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group__3"


    // $ANTLR start "rule__UIApplication__Group__3__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:357:1: rule__UIApplication__Group__3__Impl : ( ( rule__UIApplication__Group_3__0 )? ) ;
    public final void rule__UIApplication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:361:1: ( ( ( rule__UIApplication__Group_3__0 )? ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:362:1: ( ( rule__UIApplication__Group_3__0 )? )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:362:1: ( ( rule__UIApplication__Group_3__0 )? )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:363:1: ( rule__UIApplication__Group_3__0 )?
            {
             before(grammarAccess.getUIApplicationAccess().getGroup_3()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:364:1: ( rule__UIApplication__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:364:2: rule__UIApplication__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_3__0_in_rule__UIApplication__Group__3__Impl692);
                    rule__UIApplication__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUIApplicationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group__3__Impl"


    // $ANTLR start "rule__UIApplication__Group__4"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:374:1: rule__UIApplication__Group__4 : rule__UIApplication__Group__4__Impl rule__UIApplication__Group__5 ;
    public final void rule__UIApplication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:378:1: ( rule__UIApplication__Group__4__Impl rule__UIApplication__Group__5 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:379:2: rule__UIApplication__Group__4__Impl rule__UIApplication__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group__4__Impl_in_rule__UIApplication__Group__4723);
            rule__UIApplication__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group__5_in_rule__UIApplication__Group__4726);
            rule__UIApplication__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group__4"


    // $ANTLR start "rule__UIApplication__Group__4__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:386:1: rule__UIApplication__Group__4__Impl : ( ( rule__UIApplication__Group_4__0 )? ) ;
    public final void rule__UIApplication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:390:1: ( ( ( rule__UIApplication__Group_4__0 )? ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:391:1: ( ( rule__UIApplication__Group_4__0 )? )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:391:1: ( ( rule__UIApplication__Group_4__0 )? )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:392:1: ( rule__UIApplication__Group_4__0 )?
            {
             before(grammarAccess.getUIApplicationAccess().getGroup_4()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:393:1: ( rule__UIApplication__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:393:2: rule__UIApplication__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_4__0_in_rule__UIApplication__Group__4__Impl753);
                    rule__UIApplication__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUIApplicationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group__4__Impl"


    // $ANTLR start "rule__UIApplication__Group__5"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:403:1: rule__UIApplication__Group__5 : rule__UIApplication__Group__5__Impl ;
    public final void rule__UIApplication__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:407:1: ( rule__UIApplication__Group__5__Impl )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:408:2: rule__UIApplication__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group__5__Impl_in_rule__UIApplication__Group__5784);
            rule__UIApplication__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group__5"


    // $ANTLR start "rule__UIApplication__Group__5__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:414:1: rule__UIApplication__Group__5__Impl : ( '}' ) ;
    public final void rule__UIApplication__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:418:1: ( ( '}' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:419:1: ( '}' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:419:1: ( '}' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:420:1: '}'
            {
             before(grammarAccess.getUIApplicationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__UIApplication__Group__5__Impl812); 
             after(grammarAccess.getUIApplicationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group__5__Impl"


    // $ANTLR start "rule__UIApplication__Group_3__0"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:445:1: rule__UIApplication__Group_3__0 : rule__UIApplication__Group_3__0__Impl rule__UIApplication__Group_3__1 ;
    public final void rule__UIApplication__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:449:1: ( rule__UIApplication__Group_3__0__Impl rule__UIApplication__Group_3__1 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:450:2: rule__UIApplication__Group_3__0__Impl rule__UIApplication__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_3__0__Impl_in_rule__UIApplication__Group_3__0855);
            rule__UIApplication__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_3__1_in_rule__UIApplication__Group_3__0858);
            rule__UIApplication__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3__0"


    // $ANTLR start "rule__UIApplication__Group_3__0__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:457:1: rule__UIApplication__Group_3__0__Impl : ( 'pages' ) ;
    public final void rule__UIApplication__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:461:1: ( ( 'pages' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:462:1: ( 'pages' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:462:1: ( 'pages' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:463:1: 'pages'
            {
             before(grammarAccess.getUIApplicationAccess().getPagesKeyword_3_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__UIApplication__Group_3__0__Impl886); 
             after(grammarAccess.getUIApplicationAccess().getPagesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3__0__Impl"


    // $ANTLR start "rule__UIApplication__Group_3__1"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:476:1: rule__UIApplication__Group_3__1 : rule__UIApplication__Group_3__1__Impl rule__UIApplication__Group_3__2 ;
    public final void rule__UIApplication__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:480:1: ( rule__UIApplication__Group_3__1__Impl rule__UIApplication__Group_3__2 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:481:2: rule__UIApplication__Group_3__1__Impl rule__UIApplication__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_3__1__Impl_in_rule__UIApplication__Group_3__1917);
            rule__UIApplication__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_3__2_in_rule__UIApplication__Group_3__1920);
            rule__UIApplication__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3__1"


    // $ANTLR start "rule__UIApplication__Group_3__1__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:488:1: rule__UIApplication__Group_3__1__Impl : ( '{' ) ;
    public final void rule__UIApplication__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:492:1: ( ( '{' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:493:1: ( '{' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:493:1: ( '{' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:494:1: '{'
            {
             before(grammarAccess.getUIApplicationAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__UIApplication__Group_3__1__Impl948); 
             after(grammarAccess.getUIApplicationAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3__1__Impl"


    // $ANTLR start "rule__UIApplication__Group_3__2"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:507:1: rule__UIApplication__Group_3__2 : rule__UIApplication__Group_3__2__Impl rule__UIApplication__Group_3__3 ;
    public final void rule__UIApplication__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:511:1: ( rule__UIApplication__Group_3__2__Impl rule__UIApplication__Group_3__3 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:512:2: rule__UIApplication__Group_3__2__Impl rule__UIApplication__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_3__2__Impl_in_rule__UIApplication__Group_3__2979);
            rule__UIApplication__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_3__3_in_rule__UIApplication__Group_3__2982);
            rule__UIApplication__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3__2"


    // $ANTLR start "rule__UIApplication__Group_3__2__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:519:1: rule__UIApplication__Group_3__2__Impl : ( ( rule__UIApplication__PagesAssignment_3_2 ) ) ;
    public final void rule__UIApplication__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:523:1: ( ( ( rule__UIApplication__PagesAssignment_3_2 ) ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:524:1: ( ( rule__UIApplication__PagesAssignment_3_2 ) )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:524:1: ( ( rule__UIApplication__PagesAssignment_3_2 ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:525:1: ( rule__UIApplication__PagesAssignment_3_2 )
            {
             before(grammarAccess.getUIApplicationAccess().getPagesAssignment_3_2()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:526:1: ( rule__UIApplication__PagesAssignment_3_2 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:526:2: rule__UIApplication__PagesAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__PagesAssignment_3_2_in_rule__UIApplication__Group_3__2__Impl1009);
            rule__UIApplication__PagesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getUIApplicationAccess().getPagesAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3__2__Impl"


    // $ANTLR start "rule__UIApplication__Group_3__3"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:536:1: rule__UIApplication__Group_3__3 : rule__UIApplication__Group_3__3__Impl rule__UIApplication__Group_3__4 ;
    public final void rule__UIApplication__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:540:1: ( rule__UIApplication__Group_3__3__Impl rule__UIApplication__Group_3__4 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:541:2: rule__UIApplication__Group_3__3__Impl rule__UIApplication__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_3__3__Impl_in_rule__UIApplication__Group_3__31039);
            rule__UIApplication__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_3__4_in_rule__UIApplication__Group_3__31042);
            rule__UIApplication__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3__3"


    // $ANTLR start "rule__UIApplication__Group_3__3__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:548:1: rule__UIApplication__Group_3__3__Impl : ( ( rule__UIApplication__Group_3_3__0 )* ) ;
    public final void rule__UIApplication__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:552:1: ( ( ( rule__UIApplication__Group_3_3__0 )* ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:553:1: ( ( rule__UIApplication__Group_3_3__0 )* )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:553:1: ( ( rule__UIApplication__Group_3_3__0 )* )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:554:1: ( rule__UIApplication__Group_3_3__0 )*
            {
             before(grammarAccess.getUIApplicationAccess().getGroup_3_3()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:555:1: ( rule__UIApplication__Group_3_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:555:2: rule__UIApplication__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_3_3__0_in_rule__UIApplication__Group_3__3__Impl1069);
            	    rule__UIApplication__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getUIApplicationAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3__3__Impl"


    // $ANTLR start "rule__UIApplication__Group_3__4"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:565:1: rule__UIApplication__Group_3__4 : rule__UIApplication__Group_3__4__Impl ;
    public final void rule__UIApplication__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:569:1: ( rule__UIApplication__Group_3__4__Impl )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:570:2: rule__UIApplication__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_3__4__Impl_in_rule__UIApplication__Group_3__41100);
            rule__UIApplication__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3__4"


    // $ANTLR start "rule__UIApplication__Group_3__4__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:576:1: rule__UIApplication__Group_3__4__Impl : ( '}' ) ;
    public final void rule__UIApplication__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:580:1: ( ( '}' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:581:1: ( '}' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:581:1: ( '}' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:582:1: '}'
            {
             before(grammarAccess.getUIApplicationAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__UIApplication__Group_3__4__Impl1128); 
             after(grammarAccess.getUIApplicationAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3__4__Impl"


    // $ANTLR start "rule__UIApplication__Group_3_3__0"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:605:1: rule__UIApplication__Group_3_3__0 : rule__UIApplication__Group_3_3__0__Impl rule__UIApplication__Group_3_3__1 ;
    public final void rule__UIApplication__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:609:1: ( rule__UIApplication__Group_3_3__0__Impl rule__UIApplication__Group_3_3__1 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:610:2: rule__UIApplication__Group_3_3__0__Impl rule__UIApplication__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_3_3__0__Impl_in_rule__UIApplication__Group_3_3__01169);
            rule__UIApplication__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_3_3__1_in_rule__UIApplication__Group_3_3__01172);
            rule__UIApplication__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3_3__0"


    // $ANTLR start "rule__UIApplication__Group_3_3__0__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:617:1: rule__UIApplication__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__UIApplication__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:621:1: ( ( ',' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:622:1: ( ',' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:622:1: ( ',' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:623:1: ','
            {
             before(grammarAccess.getUIApplicationAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__UIApplication__Group_3_3__0__Impl1200); 
             after(grammarAccess.getUIApplicationAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3_3__0__Impl"


    // $ANTLR start "rule__UIApplication__Group_3_3__1"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:636:1: rule__UIApplication__Group_3_3__1 : rule__UIApplication__Group_3_3__1__Impl ;
    public final void rule__UIApplication__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:640:1: ( rule__UIApplication__Group_3_3__1__Impl )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:641:2: rule__UIApplication__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_3_3__1__Impl_in_rule__UIApplication__Group_3_3__11231);
            rule__UIApplication__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3_3__1"


    // $ANTLR start "rule__UIApplication__Group_3_3__1__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:647:1: rule__UIApplication__Group_3_3__1__Impl : ( ( rule__UIApplication__PagesAssignment_3_3_1 ) ) ;
    public final void rule__UIApplication__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:651:1: ( ( ( rule__UIApplication__PagesAssignment_3_3_1 ) ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:652:1: ( ( rule__UIApplication__PagesAssignment_3_3_1 ) )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:652:1: ( ( rule__UIApplication__PagesAssignment_3_3_1 ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:653:1: ( rule__UIApplication__PagesAssignment_3_3_1 )
            {
             before(grammarAccess.getUIApplicationAccess().getPagesAssignment_3_3_1()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:654:1: ( rule__UIApplication__PagesAssignment_3_3_1 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:654:2: rule__UIApplication__PagesAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__PagesAssignment_3_3_1_in_rule__UIApplication__Group_3_3__1__Impl1258);
            rule__UIApplication__PagesAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUIApplicationAccess().getPagesAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_3_3__1__Impl"


    // $ANTLR start "rule__UIApplication__Group_4__0"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:668:1: rule__UIApplication__Group_4__0 : rule__UIApplication__Group_4__0__Impl rule__UIApplication__Group_4__1 ;
    public final void rule__UIApplication__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:672:1: ( rule__UIApplication__Group_4__0__Impl rule__UIApplication__Group_4__1 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:673:2: rule__UIApplication__Group_4__0__Impl rule__UIApplication__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_4__0__Impl_in_rule__UIApplication__Group_4__01292);
            rule__UIApplication__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_4__1_in_rule__UIApplication__Group_4__01295);
            rule__UIApplication__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_4__0"


    // $ANTLR start "rule__UIApplication__Group_4__0__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:680:1: rule__UIApplication__Group_4__0__Impl : ( 'models' ) ;
    public final void rule__UIApplication__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:684:1: ( ( 'models' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:685:1: ( 'models' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:685:1: ( 'models' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:686:1: 'models'
            {
             before(grammarAccess.getUIApplicationAccess().getModelsKeyword_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__UIApplication__Group_4__0__Impl1323); 
             after(grammarAccess.getUIApplicationAccess().getModelsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_4__0__Impl"


    // $ANTLR start "rule__UIApplication__Group_4__1"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:699:1: rule__UIApplication__Group_4__1 : rule__UIApplication__Group_4__1__Impl rule__UIApplication__Group_4__2 ;
    public final void rule__UIApplication__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:703:1: ( rule__UIApplication__Group_4__1__Impl rule__UIApplication__Group_4__2 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:704:2: rule__UIApplication__Group_4__1__Impl rule__UIApplication__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_4__1__Impl_in_rule__UIApplication__Group_4__11354);
            rule__UIApplication__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_4__2_in_rule__UIApplication__Group_4__11357);
            rule__UIApplication__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_4__1"


    // $ANTLR start "rule__UIApplication__Group_4__1__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:711:1: rule__UIApplication__Group_4__1__Impl : ( '{' ) ;
    public final void rule__UIApplication__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:715:1: ( ( '{' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:716:1: ( '{' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:716:1: ( '{' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:717:1: '{'
            {
             before(grammarAccess.getUIApplicationAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__UIApplication__Group_4__1__Impl1385); 
             after(grammarAccess.getUIApplicationAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_4__1__Impl"


    // $ANTLR start "rule__UIApplication__Group_4__2"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:730:1: rule__UIApplication__Group_4__2 : rule__UIApplication__Group_4__2__Impl rule__UIApplication__Group_4__3 ;
    public final void rule__UIApplication__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:734:1: ( rule__UIApplication__Group_4__2__Impl rule__UIApplication__Group_4__3 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:735:2: rule__UIApplication__Group_4__2__Impl rule__UIApplication__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_4__2__Impl_in_rule__UIApplication__Group_4__21416);
            rule__UIApplication__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_4__3_in_rule__UIApplication__Group_4__21419);
            rule__UIApplication__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_4__2"


    // $ANTLR start "rule__UIApplication__Group_4__2__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:742:1: rule__UIApplication__Group_4__2__Impl : ( ( rule__UIApplication__ModelsAssignment_4_2 ) ) ;
    public final void rule__UIApplication__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:746:1: ( ( ( rule__UIApplication__ModelsAssignment_4_2 ) ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:747:1: ( ( rule__UIApplication__ModelsAssignment_4_2 ) )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:747:1: ( ( rule__UIApplication__ModelsAssignment_4_2 ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:748:1: ( rule__UIApplication__ModelsAssignment_4_2 )
            {
             before(grammarAccess.getUIApplicationAccess().getModelsAssignment_4_2()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:749:1: ( rule__UIApplication__ModelsAssignment_4_2 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:749:2: rule__UIApplication__ModelsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__ModelsAssignment_4_2_in_rule__UIApplication__Group_4__2__Impl1446);
            rule__UIApplication__ModelsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getUIApplicationAccess().getModelsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_4__2__Impl"


    // $ANTLR start "rule__UIApplication__Group_4__3"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:759:1: rule__UIApplication__Group_4__3 : rule__UIApplication__Group_4__3__Impl rule__UIApplication__Group_4__4 ;
    public final void rule__UIApplication__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:763:1: ( rule__UIApplication__Group_4__3__Impl rule__UIApplication__Group_4__4 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:764:2: rule__UIApplication__Group_4__3__Impl rule__UIApplication__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_4__3__Impl_in_rule__UIApplication__Group_4__31476);
            rule__UIApplication__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_4__4_in_rule__UIApplication__Group_4__31479);
            rule__UIApplication__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_4__3"


    // $ANTLR start "rule__UIApplication__Group_4__3__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:771:1: rule__UIApplication__Group_4__3__Impl : ( ( rule__UIApplication__Group_4_3__0 )* ) ;
    public final void rule__UIApplication__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:775:1: ( ( ( rule__UIApplication__Group_4_3__0 )* ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:776:1: ( ( rule__UIApplication__Group_4_3__0 )* )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:776:1: ( ( rule__UIApplication__Group_4_3__0 )* )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:777:1: ( rule__UIApplication__Group_4_3__0 )*
            {
             before(grammarAccess.getUIApplicationAccess().getGroup_4_3()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:778:1: ( rule__UIApplication__Group_4_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:778:2: rule__UIApplication__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_4_3__0_in_rule__UIApplication__Group_4__3__Impl1506);
            	    rule__UIApplication__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getUIApplicationAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_4__3__Impl"


    // $ANTLR start "rule__UIApplication__Group_4__4"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:788:1: rule__UIApplication__Group_4__4 : rule__UIApplication__Group_4__4__Impl ;
    public final void rule__UIApplication__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:792:1: ( rule__UIApplication__Group_4__4__Impl )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:793:2: rule__UIApplication__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_4__4__Impl_in_rule__UIApplication__Group_4__41537);
            rule__UIApplication__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_4__4"


    // $ANTLR start "rule__UIApplication__Group_4__4__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:799:1: rule__UIApplication__Group_4__4__Impl : ( '}' ) ;
    public final void rule__UIApplication__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:803:1: ( ( '}' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:804:1: ( '}' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:804:1: ( '}' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:805:1: '}'
            {
             before(grammarAccess.getUIApplicationAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__UIApplication__Group_4__4__Impl1565); 
             after(grammarAccess.getUIApplicationAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_4__4__Impl"


    // $ANTLR start "rule__UIApplication__Group_4_3__0"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:828:1: rule__UIApplication__Group_4_3__0 : rule__UIApplication__Group_4_3__0__Impl rule__UIApplication__Group_4_3__1 ;
    public final void rule__UIApplication__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:832:1: ( rule__UIApplication__Group_4_3__0__Impl rule__UIApplication__Group_4_3__1 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:833:2: rule__UIApplication__Group_4_3__0__Impl rule__UIApplication__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_4_3__0__Impl_in_rule__UIApplication__Group_4_3__01606);
            rule__UIApplication__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_4_3__1_in_rule__UIApplication__Group_4_3__01609);
            rule__UIApplication__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_4_3__0"


    // $ANTLR start "rule__UIApplication__Group_4_3__0__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:840:1: rule__UIApplication__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__UIApplication__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:844:1: ( ( ',' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:845:1: ( ',' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:845:1: ( ',' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:846:1: ','
            {
             before(grammarAccess.getUIApplicationAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__UIApplication__Group_4_3__0__Impl1637); 
             after(grammarAccess.getUIApplicationAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_4_3__0__Impl"


    // $ANTLR start "rule__UIApplication__Group_4_3__1"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:859:1: rule__UIApplication__Group_4_3__1 : rule__UIApplication__Group_4_3__1__Impl ;
    public final void rule__UIApplication__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:863:1: ( rule__UIApplication__Group_4_3__1__Impl )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:864:2: rule__UIApplication__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__Group_4_3__1__Impl_in_rule__UIApplication__Group_4_3__11668);
            rule__UIApplication__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_4_3__1"


    // $ANTLR start "rule__UIApplication__Group_4_3__1__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:870:1: rule__UIApplication__Group_4_3__1__Impl : ( ( rule__UIApplication__ModelsAssignment_4_3_1 ) ) ;
    public final void rule__UIApplication__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:874:1: ( ( ( rule__UIApplication__ModelsAssignment_4_3_1 ) ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:875:1: ( ( rule__UIApplication__ModelsAssignment_4_3_1 ) )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:875:1: ( ( rule__UIApplication__ModelsAssignment_4_3_1 ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:876:1: ( rule__UIApplication__ModelsAssignment_4_3_1 )
            {
             before(grammarAccess.getUIApplicationAccess().getModelsAssignment_4_3_1()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:877:1: ( rule__UIApplication__ModelsAssignment_4_3_1 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:877:2: rule__UIApplication__ModelsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UIApplication__ModelsAssignment_4_3_1_in_rule__UIApplication__Group_4_3__1__Impl1695);
            rule__UIApplication__ModelsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUIApplicationAccess().getModelsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__Group_4_3__1__Impl"


    // $ANTLR start "rule__View__Group__0"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:891:1: rule__View__Group__0 : rule__View__Group__0__Impl rule__View__Group__1 ;
    public final void rule__View__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:895:1: ( rule__View__Group__0__Impl rule__View__Group__1 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:896:2: rule__View__Group__0__Impl rule__View__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__View__Group__0__Impl_in_rule__View__Group__01729);
            rule__View__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__View__Group__1_in_rule__View__Group__01732);
            rule__View__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__0"


    // $ANTLR start "rule__View__Group__0__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:903:1: rule__View__Group__0__Impl : ( 'View' ) ;
    public final void rule__View__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:907:1: ( ( 'View' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:908:1: ( 'View' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:908:1: ( 'View' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:909:1: 'View'
            {
             before(grammarAccess.getViewAccess().getViewKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__View__Group__0__Impl1760); 
             after(grammarAccess.getViewAccess().getViewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__0__Impl"


    // $ANTLR start "rule__View__Group__1"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:922:1: rule__View__Group__1 : rule__View__Group__1__Impl rule__View__Group__2 ;
    public final void rule__View__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:926:1: ( rule__View__Group__1__Impl rule__View__Group__2 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:927:2: rule__View__Group__1__Impl rule__View__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__View__Group__1__Impl_in_rule__View__Group__11791);
            rule__View__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__View__Group__2_in_rule__View__Group__11794);
            rule__View__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__1"


    // $ANTLR start "rule__View__Group__1__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:934:1: rule__View__Group__1__Impl : ( ( rule__View__NameAssignment_1 ) ) ;
    public final void rule__View__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:938:1: ( ( ( rule__View__NameAssignment_1 ) ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:939:1: ( ( rule__View__NameAssignment_1 ) )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:939:1: ( ( rule__View__NameAssignment_1 ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:940:1: ( rule__View__NameAssignment_1 )
            {
             before(grammarAccess.getViewAccess().getNameAssignment_1()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:941:1: ( rule__View__NameAssignment_1 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:941:2: rule__View__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__View__NameAssignment_1_in_rule__View__Group__1__Impl1821);
            rule__View__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__1__Impl"


    // $ANTLR start "rule__View__Group__2"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:951:1: rule__View__Group__2 : rule__View__Group__2__Impl rule__View__Group__3 ;
    public final void rule__View__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:955:1: ( rule__View__Group__2__Impl rule__View__Group__3 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:956:2: rule__View__Group__2__Impl rule__View__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__View__Group__2__Impl_in_rule__View__Group__21851);
            rule__View__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__View__Group__3_in_rule__View__Group__21854);
            rule__View__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__2"


    // $ANTLR start "rule__View__Group__2__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:963:1: rule__View__Group__2__Impl : ( '{' ) ;
    public final void rule__View__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:967:1: ( ( '{' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:968:1: ( '{' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:968:1: ( '{' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:969:1: '{'
            {
             before(grammarAccess.getViewAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__View__Group__2__Impl1882); 
             after(grammarAccess.getViewAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__2__Impl"


    // $ANTLR start "rule__View__Group__3"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:982:1: rule__View__Group__3 : rule__View__Group__3__Impl rule__View__Group__4 ;
    public final void rule__View__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:986:1: ( rule__View__Group__3__Impl rule__View__Group__4 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:987:2: rule__View__Group__3__Impl rule__View__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__View__Group__3__Impl_in_rule__View__Group__31913);
            rule__View__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__View__Group__4_in_rule__View__Group__31916);
            rule__View__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__3"


    // $ANTLR start "rule__View__Group__3__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:994:1: rule__View__Group__3__Impl : ( ( rule__View__Group_3__0 )? ) ;
    public final void rule__View__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:998:1: ( ( ( rule__View__Group_3__0 )? ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:999:1: ( ( rule__View__Group_3__0 )? )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:999:1: ( ( rule__View__Group_3__0 )? )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1000:1: ( rule__View__Group_3__0 )?
            {
             before(grammarAccess.getViewAccess().getGroup_3()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1001:1: ( rule__View__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1001:2: rule__View__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__View__Group_3__0_in_rule__View__Group__3__Impl1943);
                    rule__View__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__3__Impl"


    // $ANTLR start "rule__View__Group__4"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1011:1: rule__View__Group__4 : rule__View__Group__4__Impl rule__View__Group__5 ;
    public final void rule__View__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1015:1: ( rule__View__Group__4__Impl rule__View__Group__5 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1016:2: rule__View__Group__4__Impl rule__View__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__View__Group__4__Impl_in_rule__View__Group__41974);
            rule__View__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__View__Group__5_in_rule__View__Group__41977);
            rule__View__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__4"


    // $ANTLR start "rule__View__Group__4__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1023:1: rule__View__Group__4__Impl : ( 'model' ) ;
    public final void rule__View__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1027:1: ( ( 'model' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1028:1: ( 'model' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1028:1: ( 'model' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1029:1: 'model'
            {
             before(grammarAccess.getViewAccess().getModelKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__View__Group__4__Impl2005); 
             after(grammarAccess.getViewAccess().getModelKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__4__Impl"


    // $ANTLR start "rule__View__Group__5"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1042:1: rule__View__Group__5 : rule__View__Group__5__Impl rule__View__Group__6 ;
    public final void rule__View__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1046:1: ( rule__View__Group__5__Impl rule__View__Group__6 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1047:2: rule__View__Group__5__Impl rule__View__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__View__Group__5__Impl_in_rule__View__Group__52036);
            rule__View__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__View__Group__6_in_rule__View__Group__52039);
            rule__View__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__5"


    // $ANTLR start "rule__View__Group__5__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1054:1: rule__View__Group__5__Impl : ( ( rule__View__ModelAssignment_5 ) ) ;
    public final void rule__View__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1058:1: ( ( ( rule__View__ModelAssignment_5 ) ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1059:1: ( ( rule__View__ModelAssignment_5 ) )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1059:1: ( ( rule__View__ModelAssignment_5 ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1060:1: ( rule__View__ModelAssignment_5 )
            {
             before(grammarAccess.getViewAccess().getModelAssignment_5()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1061:1: ( rule__View__ModelAssignment_5 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1061:2: rule__View__ModelAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__View__ModelAssignment_5_in_rule__View__Group__5__Impl2066);
            rule__View__ModelAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getModelAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__5__Impl"


    // $ANTLR start "rule__View__Group__6"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1071:1: rule__View__Group__6 : rule__View__Group__6__Impl rule__View__Group__7 ;
    public final void rule__View__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1075:1: ( rule__View__Group__6__Impl rule__View__Group__7 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1076:2: rule__View__Group__6__Impl rule__View__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__View__Group__6__Impl_in_rule__View__Group__62096);
            rule__View__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__View__Group__7_in_rule__View__Group__62099);
            rule__View__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__6"


    // $ANTLR start "rule__View__Group__6__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1083:1: rule__View__Group__6__Impl : ( ( rule__View__Group_6__0 )? ) ;
    public final void rule__View__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1087:1: ( ( ( rule__View__Group_6__0 )? ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1088:1: ( ( rule__View__Group_6__0 )? )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1088:1: ( ( rule__View__Group_6__0 )? )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1089:1: ( rule__View__Group_6__0 )?
            {
             before(grammarAccess.getViewAccess().getGroup_6()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1090:1: ( rule__View__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1090:2: rule__View__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__View__Group_6__0_in_rule__View__Group__6__Impl2126);
                    rule__View__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__6__Impl"


    // $ANTLR start "rule__View__Group__7"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1100:1: rule__View__Group__7 : rule__View__Group__7__Impl ;
    public final void rule__View__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1104:1: ( rule__View__Group__7__Impl )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1105:2: rule__View__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__View__Group__7__Impl_in_rule__View__Group__72157);
            rule__View__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__7"


    // $ANTLR start "rule__View__Group__7__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1111:1: rule__View__Group__7__Impl : ( '}' ) ;
    public final void rule__View__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1115:1: ( ( '}' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1116:1: ( '}' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1116:1: ( '}' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1117:1: '}'
            {
             before(grammarAccess.getViewAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__View__Group__7__Impl2185); 
             after(grammarAccess.getViewAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__7__Impl"


    // $ANTLR start "rule__View__Group_3__0"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1146:1: rule__View__Group_3__0 : rule__View__Group_3__0__Impl rule__View__Group_3__1 ;
    public final void rule__View__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1150:1: ( rule__View__Group_3__0__Impl rule__View__Group_3__1 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1151:2: rule__View__Group_3__0__Impl rule__View__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__View__Group_3__0__Impl_in_rule__View__Group_3__02232);
            rule__View__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__View__Group_3__1_in_rule__View__Group_3__02235);
            rule__View__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_3__0"


    // $ANTLR start "rule__View__Group_3__0__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1158:1: rule__View__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__View__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1162:1: ( ( 'description' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1163:1: ( 'description' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1163:1: ( 'description' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1164:1: 'description'
            {
             before(grammarAccess.getViewAccess().getDescriptionKeyword_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__View__Group_3__0__Impl2263); 
             after(grammarAccess.getViewAccess().getDescriptionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_3__0__Impl"


    // $ANTLR start "rule__View__Group_3__1"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1177:1: rule__View__Group_3__1 : rule__View__Group_3__1__Impl ;
    public final void rule__View__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1181:1: ( rule__View__Group_3__1__Impl )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1182:2: rule__View__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__View__Group_3__1__Impl_in_rule__View__Group_3__12294);
            rule__View__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_3__1"


    // $ANTLR start "rule__View__Group_3__1__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1188:1: rule__View__Group_3__1__Impl : ( ( rule__View__DescriptionAssignment_3_1 ) ) ;
    public final void rule__View__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1192:1: ( ( ( rule__View__DescriptionAssignment_3_1 ) ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1193:1: ( ( rule__View__DescriptionAssignment_3_1 ) )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1193:1: ( ( rule__View__DescriptionAssignment_3_1 ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1194:1: ( rule__View__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getViewAccess().getDescriptionAssignment_3_1()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1195:1: ( rule__View__DescriptionAssignment_3_1 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1195:2: rule__View__DescriptionAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__View__DescriptionAssignment_3_1_in_rule__View__Group_3__1__Impl2321);
            rule__View__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_3__1__Impl"


    // $ANTLR start "rule__View__Group_6__0"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1209:1: rule__View__Group_6__0 : rule__View__Group_6__0__Impl rule__View__Group_6__1 ;
    public final void rule__View__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1213:1: ( rule__View__Group_6__0__Impl rule__View__Group_6__1 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1214:2: rule__View__Group_6__0__Impl rule__View__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__View__Group_6__0__Impl_in_rule__View__Group_6__02355);
            rule__View__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__View__Group_6__1_in_rule__View__Group_6__02358);
            rule__View__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_6__0"


    // $ANTLR start "rule__View__Group_6__0__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1221:1: rule__View__Group_6__0__Impl : ( 'actions' ) ;
    public final void rule__View__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1225:1: ( ( 'actions' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1226:1: ( 'actions' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1226:1: ( 'actions' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1227:1: 'actions'
            {
             before(grammarAccess.getViewAccess().getActionsKeyword_6_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__View__Group_6__0__Impl2386); 
             after(grammarAccess.getViewAccess().getActionsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_6__0__Impl"


    // $ANTLR start "rule__View__Group_6__1"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1240:1: rule__View__Group_6__1 : rule__View__Group_6__1__Impl rule__View__Group_6__2 ;
    public final void rule__View__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1244:1: ( rule__View__Group_6__1__Impl rule__View__Group_6__2 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1245:2: rule__View__Group_6__1__Impl rule__View__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__View__Group_6__1__Impl_in_rule__View__Group_6__12417);
            rule__View__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__View__Group_6__2_in_rule__View__Group_6__12420);
            rule__View__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_6__1"


    // $ANTLR start "rule__View__Group_6__1__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1252:1: rule__View__Group_6__1__Impl : ( '{' ) ;
    public final void rule__View__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1256:1: ( ( '{' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1257:1: ( '{' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1257:1: ( '{' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1258:1: '{'
            {
             before(grammarAccess.getViewAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__View__Group_6__1__Impl2448); 
             after(grammarAccess.getViewAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_6__1__Impl"


    // $ANTLR start "rule__View__Group_6__2"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1271:1: rule__View__Group_6__2 : rule__View__Group_6__2__Impl rule__View__Group_6__3 ;
    public final void rule__View__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1275:1: ( rule__View__Group_6__2__Impl rule__View__Group_6__3 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1276:2: rule__View__Group_6__2__Impl rule__View__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__View__Group_6__2__Impl_in_rule__View__Group_6__22479);
            rule__View__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__View__Group_6__3_in_rule__View__Group_6__22482);
            rule__View__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_6__2"


    // $ANTLR start "rule__View__Group_6__2__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1283:1: rule__View__Group_6__2__Impl : ( ( rule__View__ActionsAssignment_6_2 ) ) ;
    public final void rule__View__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1287:1: ( ( ( rule__View__ActionsAssignment_6_2 ) ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1288:1: ( ( rule__View__ActionsAssignment_6_2 ) )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1288:1: ( ( rule__View__ActionsAssignment_6_2 ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1289:1: ( rule__View__ActionsAssignment_6_2 )
            {
             before(grammarAccess.getViewAccess().getActionsAssignment_6_2()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1290:1: ( rule__View__ActionsAssignment_6_2 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1290:2: rule__View__ActionsAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__View__ActionsAssignment_6_2_in_rule__View__Group_6__2__Impl2509);
            rule__View__ActionsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getActionsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_6__2__Impl"


    // $ANTLR start "rule__View__Group_6__3"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1300:1: rule__View__Group_6__3 : rule__View__Group_6__3__Impl rule__View__Group_6__4 ;
    public final void rule__View__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1304:1: ( rule__View__Group_6__3__Impl rule__View__Group_6__4 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1305:2: rule__View__Group_6__3__Impl rule__View__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__View__Group_6__3__Impl_in_rule__View__Group_6__32539);
            rule__View__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__View__Group_6__4_in_rule__View__Group_6__32542);
            rule__View__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_6__3"


    // $ANTLR start "rule__View__Group_6__3__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1312:1: rule__View__Group_6__3__Impl : ( ( rule__View__Group_6_3__0 )* ) ;
    public final void rule__View__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1316:1: ( ( ( rule__View__Group_6_3__0 )* ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1317:1: ( ( rule__View__Group_6_3__0 )* )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1317:1: ( ( rule__View__Group_6_3__0 )* )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1318:1: ( rule__View__Group_6_3__0 )*
            {
             before(grammarAccess.getViewAccess().getGroup_6_3()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1319:1: ( rule__View__Group_6_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1319:2: rule__View__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__View__Group_6_3__0_in_rule__View__Group_6__3__Impl2569);
            	    rule__View__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getViewAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_6__3__Impl"


    // $ANTLR start "rule__View__Group_6__4"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1329:1: rule__View__Group_6__4 : rule__View__Group_6__4__Impl ;
    public final void rule__View__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1333:1: ( rule__View__Group_6__4__Impl )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1334:2: rule__View__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__View__Group_6__4__Impl_in_rule__View__Group_6__42600);
            rule__View__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_6__4"


    // $ANTLR start "rule__View__Group_6__4__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1340:1: rule__View__Group_6__4__Impl : ( '}' ) ;
    public final void rule__View__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1344:1: ( ( '}' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1345:1: ( '}' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1345:1: ( '}' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1346:1: '}'
            {
             before(grammarAccess.getViewAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__View__Group_6__4__Impl2628); 
             after(grammarAccess.getViewAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_6__4__Impl"


    // $ANTLR start "rule__View__Group_6_3__0"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1369:1: rule__View__Group_6_3__0 : rule__View__Group_6_3__0__Impl rule__View__Group_6_3__1 ;
    public final void rule__View__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1373:1: ( rule__View__Group_6_3__0__Impl rule__View__Group_6_3__1 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1374:2: rule__View__Group_6_3__0__Impl rule__View__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__View__Group_6_3__0__Impl_in_rule__View__Group_6_3__02669);
            rule__View__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__View__Group_6_3__1_in_rule__View__Group_6_3__02672);
            rule__View__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_6_3__0"


    // $ANTLR start "rule__View__Group_6_3__0__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1381:1: rule__View__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__View__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1385:1: ( ( ',' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1386:1: ( ',' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1386:1: ( ',' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1387:1: ','
            {
             before(grammarAccess.getViewAccess().getCommaKeyword_6_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__View__Group_6_3__0__Impl2700); 
             after(grammarAccess.getViewAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_6_3__0__Impl"


    // $ANTLR start "rule__View__Group_6_3__1"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1400:1: rule__View__Group_6_3__1 : rule__View__Group_6_3__1__Impl ;
    public final void rule__View__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1404:1: ( rule__View__Group_6_3__1__Impl )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1405:2: rule__View__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__View__Group_6_3__1__Impl_in_rule__View__Group_6_3__12731);
            rule__View__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_6_3__1"


    // $ANTLR start "rule__View__Group_6_3__1__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1411:1: rule__View__Group_6_3__1__Impl : ( ( rule__View__ActionsAssignment_6_3_1 ) ) ;
    public final void rule__View__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1415:1: ( ( ( rule__View__ActionsAssignment_6_3_1 ) ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1416:1: ( ( rule__View__ActionsAssignment_6_3_1 ) )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1416:1: ( ( rule__View__ActionsAssignment_6_3_1 ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1417:1: ( rule__View__ActionsAssignment_6_3_1 )
            {
             before(grammarAccess.getViewAccess().getActionsAssignment_6_3_1()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1418:1: ( rule__View__ActionsAssignment_6_3_1 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1418:2: rule__View__ActionsAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__View__ActionsAssignment_6_3_1_in_rule__View__Group_6_3__1__Impl2758);
            rule__View__ActionsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getActionsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_6_3__1__Impl"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1432:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1436:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1437:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02792);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02795);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1444:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1448:1: ( ( () ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1449:1: ( () )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1449:1: ( () )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1450:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1451:1: ()
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1453:1: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1463:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1467:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1468:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12853);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12856);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1475:1: rule__Model__Group__1__Impl : ( 'Model' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1479:1: ( ( 'Model' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1480:1: ( 'Model' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1480:1: ( 'Model' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1481:1: 'Model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Model__Group__1__Impl2884); 
             after(grammarAccess.getModelAccess().getModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1494:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1498:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1499:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22915);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22918);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1506:1: rule__Model__Group__2__Impl : ( ( rule__Model__NameAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1510:1: ( ( ( rule__Model__NameAssignment_2 ) ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1511:1: ( ( rule__Model__NameAssignment_2 ) )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1511:1: ( ( rule__Model__NameAssignment_2 ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1512:1: ( rule__Model__NameAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_2()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1513:1: ( rule__Model__NameAssignment_2 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1513:2: rule__Model__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__NameAssignment_2_in_rule__Model__Group__2__Impl2945);
            rule__Model__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1523:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1527:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1528:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32975);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32978);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1535:1: rule__Model__Group__3__Impl : ( '{' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1539:1: ( ( '{' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1540:1: ( '{' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1540:1: ( '{' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1541:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Model__Group__3__Impl3006); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1554:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1558:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1559:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__43037);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__5_in_rule__Model__Group__43040);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1566:1: rule__Model__Group__4__Impl : ( ( rule__Model__Group_4__0 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1570:1: ( ( ( rule__Model__Group_4__0 )? ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1571:1: ( ( rule__Model__Group_4__0 )? )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1571:1: ( ( rule__Model__Group_4__0 )? )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1572:1: ( rule__Model__Group_4__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1573:1: ( rule__Model__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1573:2: rule__Model__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4__0_in_rule__Model__Group__4__Impl3067);
                    rule__Model__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1583:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1587:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1588:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__53098);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__6_in_rule__Model__Group__53101);
            rule__Model__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1595:1: rule__Model__Group__5__Impl : ( ( rule__Model__Group_5__0 )? ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1599:1: ( ( ( rule__Model__Group_5__0 )? ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1600:1: ( ( rule__Model__Group_5__0 )? )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1600:1: ( ( rule__Model__Group_5__0 )? )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1601:1: ( rule__Model__Group_5__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_5()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1602:1: ( rule__Model__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1602:2: rule__Model__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_5__0_in_rule__Model__Group__5__Impl3128);
                    rule__Model__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1612:1: rule__Model__Group__6 : rule__Model__Group__6__Impl ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1616:1: ( rule__Model__Group__6__Impl )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1617:2: rule__Model__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__63159);
            rule__Model__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1623:1: rule__Model__Group__6__Impl : ( '}' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1627:1: ( ( '}' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1628:1: ( '}' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1628:1: ( '}' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1629:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Model__Group__6__Impl3187); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group_4__0"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1656:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1660:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1661:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4__0__Impl_in_rule__Model__Group_4__03232);
            rule__Model__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4__1_in_rule__Model__Group_4__03235);
            rule__Model__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__0"


    // $ANTLR start "rule__Model__Group_4__0__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1668:1: rule__Model__Group_4__0__Impl : ( 'properties' ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1672:1: ( ( 'properties' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1673:1: ( 'properties' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1673:1: ( 'properties' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1674:1: 'properties'
            {
             before(grammarAccess.getModelAccess().getPropertiesKeyword_4_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Model__Group_4__0__Impl3263); 
             after(grammarAccess.getModelAccess().getPropertiesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__0__Impl"


    // $ANTLR start "rule__Model__Group_4__1"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1687:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl rule__Model__Group_4__2 ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1691:1: ( rule__Model__Group_4__1__Impl rule__Model__Group_4__2 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1692:2: rule__Model__Group_4__1__Impl rule__Model__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4__1__Impl_in_rule__Model__Group_4__13294);
            rule__Model__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4__2_in_rule__Model__Group_4__13297);
            rule__Model__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__1"


    // $ANTLR start "rule__Model__Group_4__1__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1699:1: rule__Model__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1703:1: ( ( '{' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1704:1: ( '{' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1704:1: ( '{' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1705:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Model__Group_4__1__Impl3325); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__1__Impl"


    // $ANTLR start "rule__Model__Group_4__2"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1718:1: rule__Model__Group_4__2 : rule__Model__Group_4__2__Impl rule__Model__Group_4__3 ;
    public final void rule__Model__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1722:1: ( rule__Model__Group_4__2__Impl rule__Model__Group_4__3 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1723:2: rule__Model__Group_4__2__Impl rule__Model__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4__2__Impl_in_rule__Model__Group_4__23356);
            rule__Model__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4__3_in_rule__Model__Group_4__23359);
            rule__Model__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__2"


    // $ANTLR start "rule__Model__Group_4__2__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1730:1: rule__Model__Group_4__2__Impl : ( ( rule__Model__PropertiesAssignment_4_2 ) ) ;
    public final void rule__Model__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1734:1: ( ( ( rule__Model__PropertiesAssignment_4_2 ) ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1735:1: ( ( rule__Model__PropertiesAssignment_4_2 ) )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1735:1: ( ( rule__Model__PropertiesAssignment_4_2 ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1736:1: ( rule__Model__PropertiesAssignment_4_2 )
            {
             before(grammarAccess.getModelAccess().getPropertiesAssignment_4_2()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1737:1: ( rule__Model__PropertiesAssignment_4_2 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1737:2: rule__Model__PropertiesAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__PropertiesAssignment_4_2_in_rule__Model__Group_4__2__Impl3386);
            rule__Model__PropertiesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPropertiesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__2__Impl"


    // $ANTLR start "rule__Model__Group_4__3"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1747:1: rule__Model__Group_4__3 : rule__Model__Group_4__3__Impl rule__Model__Group_4__4 ;
    public final void rule__Model__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1751:1: ( rule__Model__Group_4__3__Impl rule__Model__Group_4__4 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1752:2: rule__Model__Group_4__3__Impl rule__Model__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4__3__Impl_in_rule__Model__Group_4__33416);
            rule__Model__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4__4_in_rule__Model__Group_4__33419);
            rule__Model__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__3"


    // $ANTLR start "rule__Model__Group_4__3__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1759:1: rule__Model__Group_4__3__Impl : ( ( rule__Model__Group_4_3__0 )* ) ;
    public final void rule__Model__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1763:1: ( ( ( rule__Model__Group_4_3__0 )* ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1764:1: ( ( rule__Model__Group_4_3__0 )* )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1764:1: ( ( rule__Model__Group_4_3__0 )* )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1765:1: ( rule__Model__Group_4_3__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_4_3()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1766:1: ( rule__Model__Group_4_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1766:2: rule__Model__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4_3__0_in_rule__Model__Group_4__3__Impl3446);
            	    rule__Model__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__3__Impl"


    // $ANTLR start "rule__Model__Group_4__4"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1776:1: rule__Model__Group_4__4 : rule__Model__Group_4__4__Impl ;
    public final void rule__Model__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1780:1: ( rule__Model__Group_4__4__Impl )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1781:2: rule__Model__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4__4__Impl_in_rule__Model__Group_4__43477);
            rule__Model__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__4"


    // $ANTLR start "rule__Model__Group_4__4__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1787:1: rule__Model__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Model__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1791:1: ( ( '}' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1792:1: ( '}' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1792:1: ( '}' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1793:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Model__Group_4__4__Impl3505); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__4__Impl"


    // $ANTLR start "rule__Model__Group_4_3__0"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1816:1: rule__Model__Group_4_3__0 : rule__Model__Group_4_3__0__Impl rule__Model__Group_4_3__1 ;
    public final void rule__Model__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1820:1: ( rule__Model__Group_4_3__0__Impl rule__Model__Group_4_3__1 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1821:2: rule__Model__Group_4_3__0__Impl rule__Model__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4_3__0__Impl_in_rule__Model__Group_4_3__03546);
            rule__Model__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4_3__1_in_rule__Model__Group_4_3__03549);
            rule__Model__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4_3__0"


    // $ANTLR start "rule__Model__Group_4_3__0__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1828:1: rule__Model__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1832:1: ( ( ',' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1833:1: ( ',' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1833:1: ( ',' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1834:1: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Model__Group_4_3__0__Impl3577); 
             after(grammarAccess.getModelAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4_3__0__Impl"


    // $ANTLR start "rule__Model__Group_4_3__1"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1847:1: rule__Model__Group_4_3__1 : rule__Model__Group_4_3__1__Impl ;
    public final void rule__Model__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1851:1: ( rule__Model__Group_4_3__1__Impl )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1852:2: rule__Model__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4_3__1__Impl_in_rule__Model__Group_4_3__13608);
            rule__Model__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4_3__1"


    // $ANTLR start "rule__Model__Group_4_3__1__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1858:1: rule__Model__Group_4_3__1__Impl : ( ( rule__Model__PropertiesAssignment_4_3_1 ) ) ;
    public final void rule__Model__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1862:1: ( ( ( rule__Model__PropertiesAssignment_4_3_1 ) ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1863:1: ( ( rule__Model__PropertiesAssignment_4_3_1 ) )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1863:1: ( ( rule__Model__PropertiesAssignment_4_3_1 ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1864:1: ( rule__Model__PropertiesAssignment_4_3_1 )
            {
             before(grammarAccess.getModelAccess().getPropertiesAssignment_4_3_1()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1865:1: ( rule__Model__PropertiesAssignment_4_3_1 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1865:2: rule__Model__PropertiesAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__PropertiesAssignment_4_3_1_in_rule__Model__Group_4_3__1__Impl3635);
            rule__Model__PropertiesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPropertiesAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4_3__1__Impl"


    // $ANTLR start "rule__Model__Group_5__0"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1879:1: rule__Model__Group_5__0 : rule__Model__Group_5__0__Impl rule__Model__Group_5__1 ;
    public final void rule__Model__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1883:1: ( rule__Model__Group_5__0__Impl rule__Model__Group_5__1 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1884:2: rule__Model__Group_5__0__Impl rule__Model__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_5__0__Impl_in_rule__Model__Group_5__03669);
            rule__Model__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_5__1_in_rule__Model__Group_5__03672);
            rule__Model__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__0"


    // $ANTLR start "rule__Model__Group_5__0__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1891:1: rule__Model__Group_5__0__Impl : ( 'ownedElements' ) ;
    public final void rule__Model__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1895:1: ( ( 'ownedElements' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1896:1: ( 'ownedElements' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1896:1: ( 'ownedElements' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1897:1: 'ownedElements'
            {
             before(grammarAccess.getModelAccess().getOwnedElementsKeyword_5_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Model__Group_5__0__Impl3700); 
             after(grammarAccess.getModelAccess().getOwnedElementsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__0__Impl"


    // $ANTLR start "rule__Model__Group_5__1"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1910:1: rule__Model__Group_5__1 : rule__Model__Group_5__1__Impl rule__Model__Group_5__2 ;
    public final void rule__Model__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1914:1: ( rule__Model__Group_5__1__Impl rule__Model__Group_5__2 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1915:2: rule__Model__Group_5__1__Impl rule__Model__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_5__1__Impl_in_rule__Model__Group_5__13731);
            rule__Model__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_5__2_in_rule__Model__Group_5__13734);
            rule__Model__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__1"


    // $ANTLR start "rule__Model__Group_5__1__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1922:1: rule__Model__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1926:1: ( ( '{' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1927:1: ( '{' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1927:1: ( '{' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1928:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Model__Group_5__1__Impl3762); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__1__Impl"


    // $ANTLR start "rule__Model__Group_5__2"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1941:1: rule__Model__Group_5__2 : rule__Model__Group_5__2__Impl rule__Model__Group_5__3 ;
    public final void rule__Model__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1945:1: ( rule__Model__Group_5__2__Impl rule__Model__Group_5__3 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1946:2: rule__Model__Group_5__2__Impl rule__Model__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_5__2__Impl_in_rule__Model__Group_5__23793);
            rule__Model__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_5__3_in_rule__Model__Group_5__23796);
            rule__Model__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__2"


    // $ANTLR start "rule__Model__Group_5__2__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1953:1: rule__Model__Group_5__2__Impl : ( ( rule__Model__OwnedElementsAssignment_5_2 ) ) ;
    public final void rule__Model__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1957:1: ( ( ( rule__Model__OwnedElementsAssignment_5_2 ) ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1958:1: ( ( rule__Model__OwnedElementsAssignment_5_2 ) )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1958:1: ( ( rule__Model__OwnedElementsAssignment_5_2 ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1959:1: ( rule__Model__OwnedElementsAssignment_5_2 )
            {
             before(grammarAccess.getModelAccess().getOwnedElementsAssignment_5_2()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1960:1: ( rule__Model__OwnedElementsAssignment_5_2 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1960:2: rule__Model__OwnedElementsAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__OwnedElementsAssignment_5_2_in_rule__Model__Group_5__2__Impl3823);
            rule__Model__OwnedElementsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getOwnedElementsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__2__Impl"


    // $ANTLR start "rule__Model__Group_5__3"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1970:1: rule__Model__Group_5__3 : rule__Model__Group_5__3__Impl rule__Model__Group_5__4 ;
    public final void rule__Model__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1974:1: ( rule__Model__Group_5__3__Impl rule__Model__Group_5__4 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1975:2: rule__Model__Group_5__3__Impl rule__Model__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_5__3__Impl_in_rule__Model__Group_5__33853);
            rule__Model__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_5__4_in_rule__Model__Group_5__33856);
            rule__Model__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__3"


    // $ANTLR start "rule__Model__Group_5__3__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1982:1: rule__Model__Group_5__3__Impl : ( ( rule__Model__Group_5_3__0 )* ) ;
    public final void rule__Model__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1986:1: ( ( ( rule__Model__Group_5_3__0 )* ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1987:1: ( ( rule__Model__Group_5_3__0 )* )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1987:1: ( ( rule__Model__Group_5_3__0 )* )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1988:1: ( rule__Model__Group_5_3__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_5_3()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1989:1: ( rule__Model__Group_5_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1989:2: rule__Model__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_5_3__0_in_rule__Model__Group_5__3__Impl3883);
            	    rule__Model__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__3__Impl"


    // $ANTLR start "rule__Model__Group_5__4"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:1999:1: rule__Model__Group_5__4 : rule__Model__Group_5__4__Impl ;
    public final void rule__Model__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2003:1: ( rule__Model__Group_5__4__Impl )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2004:2: rule__Model__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_5__4__Impl_in_rule__Model__Group_5__43914);
            rule__Model__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__4"


    // $ANTLR start "rule__Model__Group_5__4__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2010:1: rule__Model__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Model__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2014:1: ( ( '}' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2015:1: ( '}' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2015:1: ( '}' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2016:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Model__Group_5__4__Impl3942); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__4__Impl"


    // $ANTLR start "rule__Model__Group_5_3__0"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2039:1: rule__Model__Group_5_3__0 : rule__Model__Group_5_3__0__Impl rule__Model__Group_5_3__1 ;
    public final void rule__Model__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2043:1: ( rule__Model__Group_5_3__0__Impl rule__Model__Group_5_3__1 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2044:2: rule__Model__Group_5_3__0__Impl rule__Model__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_5_3__0__Impl_in_rule__Model__Group_5_3__03983);
            rule__Model__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_5_3__1_in_rule__Model__Group_5_3__03986);
            rule__Model__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5_3__0"


    // $ANTLR start "rule__Model__Group_5_3__0__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2051:1: rule__Model__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2055:1: ( ( ',' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2056:1: ( ',' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2056:1: ( ',' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2057:1: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Model__Group_5_3__0__Impl4014); 
             after(grammarAccess.getModelAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5_3__0__Impl"


    // $ANTLR start "rule__Model__Group_5_3__1"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2070:1: rule__Model__Group_5_3__1 : rule__Model__Group_5_3__1__Impl ;
    public final void rule__Model__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2074:1: ( rule__Model__Group_5_3__1__Impl )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2075:2: rule__Model__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_5_3__1__Impl_in_rule__Model__Group_5_3__14045);
            rule__Model__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5_3__1"


    // $ANTLR start "rule__Model__Group_5_3__1__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2081:1: rule__Model__Group_5_3__1__Impl : ( ( rule__Model__OwnedElementsAssignment_5_3_1 ) ) ;
    public final void rule__Model__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2085:1: ( ( ( rule__Model__OwnedElementsAssignment_5_3_1 ) ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2086:1: ( ( rule__Model__OwnedElementsAssignment_5_3_1 ) )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2086:1: ( ( rule__Model__OwnedElementsAssignment_5_3_1 ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2087:1: ( rule__Model__OwnedElementsAssignment_5_3_1 )
            {
             before(grammarAccess.getModelAccess().getOwnedElementsAssignment_5_3_1()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2088:1: ( rule__Model__OwnedElementsAssignment_5_3_1 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2088:2: rule__Model__OwnedElementsAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__OwnedElementsAssignment_5_3_1_in_rule__Model__Group_5_3__1__Impl4072);
            rule__Model__OwnedElementsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getOwnedElementsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5_3__1__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2102:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2106:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2107:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__04106);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__1_in_rule__Action__Group__04109);
            rule__Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2114:1: rule__Action__Group__0__Impl : ( () ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2118:1: ( ( () ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2119:1: ( () )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2119:1: ( () )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2120:1: ()
            {
             before(grammarAccess.getActionAccess().getActionAction_0()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2121:1: ()
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2123:1: 
            {
            }

             after(grammarAccess.getActionAccess().getActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2133:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2137:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2138:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__14167);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__2_in_rule__Action__Group__14170);
            rule__Action__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2145:1: rule__Action__Group__1__Impl : ( 'Action' ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2149:1: ( ( 'Action' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2150:1: ( 'Action' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2150:1: ( 'Action' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2151:1: 'Action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Action__Group__1__Impl4198); 
             after(grammarAccess.getActionAccess().getActionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2164:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2168:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2169:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__24229);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__3_in_rule__Action__Group__24232);
            rule__Action__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2176:1: rule__Action__Group__2__Impl : ( ( rule__Action__NameAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2180:1: ( ( ( rule__Action__NameAssignment_2 ) ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2181:1: ( ( rule__Action__NameAssignment_2 ) )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2181:1: ( ( rule__Action__NameAssignment_2 ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2182:1: ( rule__Action__NameAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_2()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2183:1: ( rule__Action__NameAssignment_2 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2183:2: rule__Action__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__NameAssignment_2_in_rule__Action__Group__2__Impl4259);
            rule__Action__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2193:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2197:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2198:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__34289);
            rule__Action__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__4_in_rule__Action__Group__34292);
            rule__Action__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2205:1: rule__Action__Group__3__Impl : ( '{' ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2209:1: ( ( '{' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2210:1: ( '{' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2210:1: ( '{' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2211:1: '{'
            {
             before(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Action__Group__3__Impl4320); 
             after(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__Action__Group__4"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2224:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2228:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2229:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__44351);
            rule__Action__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__5_in_rule__Action__Group__44354);
            rule__Action__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4"


    // $ANTLR start "rule__Action__Group__4__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2236:1: rule__Action__Group__4__Impl : ( ( rule__Action__Group_4__0 )? ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2240:1: ( ( ( rule__Action__Group_4__0 )? ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2241:1: ( ( rule__Action__Group_4__0 )? )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2241:1: ( ( rule__Action__Group_4__0 )? )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2242:1: ( rule__Action__Group_4__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_4()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2243:1: ( rule__Action__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2243:2: rule__Action__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Action__Group_4__0_in_rule__Action__Group__4__Impl4381);
                    rule__Action__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4__Impl"


    // $ANTLR start "rule__Action__Group__5"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2253:1: rule__Action__Group__5 : rule__Action__Group__5__Impl ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2257:1: ( rule__Action__Group__5__Impl )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2258:2: rule__Action__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__5__Impl_in_rule__Action__Group__54412);
            rule__Action__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5"


    // $ANTLR start "rule__Action__Group__5__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2264:1: rule__Action__Group__5__Impl : ( '}' ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2268:1: ( ( '}' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2269:1: ( '}' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2269:1: ( '}' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2270:1: '}'
            {
             before(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Action__Group__5__Impl4440); 
             after(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5__Impl"


    // $ANTLR start "rule__Action__Group_4__0"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2295:1: rule__Action__Group_4__0 : rule__Action__Group_4__0__Impl rule__Action__Group_4__1 ;
    public final void rule__Action__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2299:1: ( rule__Action__Group_4__0__Impl rule__Action__Group_4__1 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2300:2: rule__Action__Group_4__0__Impl rule__Action__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_4__0__Impl_in_rule__Action__Group_4__04483);
            rule__Action__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_4__1_in_rule__Action__Group_4__04486);
            rule__Action__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__0"


    // $ANTLR start "rule__Action__Group_4__0__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2307:1: rule__Action__Group_4__0__Impl : ( 'nextPage' ) ;
    public final void rule__Action__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2311:1: ( ( 'nextPage' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2312:1: ( 'nextPage' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2312:1: ( 'nextPage' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2313:1: 'nextPage'
            {
             before(grammarAccess.getActionAccess().getNextPageKeyword_4_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Action__Group_4__0__Impl4514); 
             after(grammarAccess.getActionAccess().getNextPageKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__0__Impl"


    // $ANTLR start "rule__Action__Group_4__1"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2326:1: rule__Action__Group_4__1 : rule__Action__Group_4__1__Impl ;
    public final void rule__Action__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2330:1: ( rule__Action__Group_4__1__Impl )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2331:2: rule__Action__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_4__1__Impl_in_rule__Action__Group_4__14545);
            rule__Action__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__1"


    // $ANTLR start "rule__Action__Group_4__1__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2337:1: rule__Action__Group_4__1__Impl : ( ( rule__Action__NextPageAssignment_4_1 ) ) ;
    public final void rule__Action__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2341:1: ( ( ( rule__Action__NextPageAssignment_4_1 ) ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2342:1: ( ( rule__Action__NextPageAssignment_4_1 ) )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2342:1: ( ( rule__Action__NextPageAssignment_4_1 ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2343:1: ( rule__Action__NextPageAssignment_4_1 )
            {
             before(grammarAccess.getActionAccess().getNextPageAssignment_4_1()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2344:1: ( rule__Action__NextPageAssignment_4_1 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2344:2: rule__Action__NextPageAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__NextPageAssignment_4_1_in_rule__Action__Group_4__1__Impl4572);
            rule__Action__NextPageAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getNextPageAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__1__Impl"


    // $ANTLR start "rule__ModelProperty__Group__0"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2358:1: rule__ModelProperty__Group__0 : rule__ModelProperty__Group__0__Impl rule__ModelProperty__Group__1 ;
    public final void rule__ModelProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2362:1: ( rule__ModelProperty__Group__0__Impl rule__ModelProperty__Group__1 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2363:2: rule__ModelProperty__Group__0__Impl rule__ModelProperty__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModelProperty__Group__0__Impl_in_rule__ModelProperty__Group__04606);
            rule__ModelProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ModelProperty__Group__1_in_rule__ModelProperty__Group__04609);
            rule__ModelProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__0"


    // $ANTLR start "rule__ModelProperty__Group__0__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2370:1: rule__ModelProperty__Group__0__Impl : ( () ) ;
    public final void rule__ModelProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2374:1: ( ( () ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2375:1: ( () )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2375:1: ( () )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2376:1: ()
            {
             before(grammarAccess.getModelPropertyAccess().getModelPropertyAction_0()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2377:1: ()
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2379:1: 
            {
            }

             after(grammarAccess.getModelPropertyAccess().getModelPropertyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__0__Impl"


    // $ANTLR start "rule__ModelProperty__Group__1"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2389:1: rule__ModelProperty__Group__1 : rule__ModelProperty__Group__1__Impl rule__ModelProperty__Group__2 ;
    public final void rule__ModelProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2393:1: ( rule__ModelProperty__Group__1__Impl rule__ModelProperty__Group__2 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2394:2: rule__ModelProperty__Group__1__Impl rule__ModelProperty__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModelProperty__Group__1__Impl_in_rule__ModelProperty__Group__14667);
            rule__ModelProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ModelProperty__Group__2_in_rule__ModelProperty__Group__14670);
            rule__ModelProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__1"


    // $ANTLR start "rule__ModelProperty__Group__1__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2401:1: rule__ModelProperty__Group__1__Impl : ( 'ModelProperty' ) ;
    public final void rule__ModelProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2405:1: ( ( 'ModelProperty' ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2406:1: ( 'ModelProperty' )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2406:1: ( 'ModelProperty' )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2407:1: 'ModelProperty'
            {
             before(grammarAccess.getModelPropertyAccess().getModelPropertyKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ModelProperty__Group__1__Impl4698); 
             after(grammarAccess.getModelPropertyAccess().getModelPropertyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__1__Impl"


    // $ANTLR start "rule__ModelProperty__Group__2"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2420:1: rule__ModelProperty__Group__2 : rule__ModelProperty__Group__2__Impl ;
    public final void rule__ModelProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2424:1: ( rule__ModelProperty__Group__2__Impl )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2425:2: rule__ModelProperty__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModelProperty__Group__2__Impl_in_rule__ModelProperty__Group__24729);
            rule__ModelProperty__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__2"


    // $ANTLR start "rule__ModelProperty__Group__2__Impl"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2431:1: rule__ModelProperty__Group__2__Impl : ( ( rule__ModelProperty__NameAssignment_2 ) ) ;
    public final void rule__ModelProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2435:1: ( ( ( rule__ModelProperty__NameAssignment_2 ) ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2436:1: ( ( rule__ModelProperty__NameAssignment_2 ) )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2436:1: ( ( rule__ModelProperty__NameAssignment_2 ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2437:1: ( rule__ModelProperty__NameAssignment_2 )
            {
             before(grammarAccess.getModelPropertyAccess().getNameAssignment_2()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2438:1: ( rule__ModelProperty__NameAssignment_2 )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2438:2: rule__ModelProperty__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModelProperty__NameAssignment_2_in_rule__ModelProperty__Group__2__Impl4756);
            rule__ModelProperty__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelPropertyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__2__Impl"


    // $ANTLR start "rule__UIApplication__PagesAssignment_3_2"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2455:1: rule__UIApplication__PagesAssignment_3_2 : ( ruleView ) ;
    public final void rule__UIApplication__PagesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2459:1: ( ( ruleView ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2460:1: ( ruleView )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2460:1: ( ruleView )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2461:1: ruleView
            {
             before(grammarAccess.getUIApplicationAccess().getPagesViewParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleView_in_rule__UIApplication__PagesAssignment_3_24797);
            ruleView();

            state._fsp--;

             after(grammarAccess.getUIApplicationAccess().getPagesViewParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__PagesAssignment_3_2"


    // $ANTLR start "rule__UIApplication__PagesAssignment_3_3_1"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2470:1: rule__UIApplication__PagesAssignment_3_3_1 : ( ruleView ) ;
    public final void rule__UIApplication__PagesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2474:1: ( ( ruleView ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2475:1: ( ruleView )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2475:1: ( ruleView )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2476:1: ruleView
            {
             before(grammarAccess.getUIApplicationAccess().getPagesViewParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleView_in_rule__UIApplication__PagesAssignment_3_3_14828);
            ruleView();

            state._fsp--;

             after(grammarAccess.getUIApplicationAccess().getPagesViewParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__PagesAssignment_3_3_1"


    // $ANTLR start "rule__UIApplication__ModelsAssignment_4_2"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2485:1: rule__UIApplication__ModelsAssignment_4_2 : ( ruleModel ) ;
    public final void rule__UIApplication__ModelsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2489:1: ( ( ruleModel ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2490:1: ( ruleModel )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2490:1: ( ruleModel )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2491:1: ruleModel
            {
             before(grammarAccess.getUIApplicationAccess().getModelsModelParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_rule__UIApplication__ModelsAssignment_4_24859);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getUIApplicationAccess().getModelsModelParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__ModelsAssignment_4_2"


    // $ANTLR start "rule__UIApplication__ModelsAssignment_4_3_1"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2500:1: rule__UIApplication__ModelsAssignment_4_3_1 : ( ruleModel ) ;
    public final void rule__UIApplication__ModelsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2504:1: ( ( ruleModel ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2505:1: ( ruleModel )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2505:1: ( ruleModel )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2506:1: ruleModel
            {
             before(grammarAccess.getUIApplicationAccess().getModelsModelParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_rule__UIApplication__ModelsAssignment_4_3_14890);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getUIApplicationAccess().getModelsModelParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIApplication__ModelsAssignment_4_3_1"


    // $ANTLR start "rule__View__NameAssignment_1"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2515:1: rule__View__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__View__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2519:1: ( ( ruleEString ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2520:1: ( ruleEString )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2520:1: ( ruleEString )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2521:1: ruleEString
            {
             before(grammarAccess.getViewAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__View__NameAssignment_14921);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getViewAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__NameAssignment_1"


    // $ANTLR start "rule__View__DescriptionAssignment_3_1"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2530:1: rule__View__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__View__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2534:1: ( ( ruleEString ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2535:1: ( ruleEString )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2535:1: ( ruleEString )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2536:1: ruleEString
            {
             before(grammarAccess.getViewAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__View__DescriptionAssignment_3_14952);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getViewAccess().getDescriptionEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__DescriptionAssignment_3_1"


    // $ANTLR start "rule__View__ModelAssignment_5"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2545:1: rule__View__ModelAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__View__ModelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2549:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2550:1: ( ( ruleEString ) )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2550:1: ( ( ruleEString ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2551:1: ( ruleEString )
            {
             before(grammarAccess.getViewAccess().getModelModelCrossReference_5_0()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2552:1: ( ruleEString )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2553:1: ruleEString
            {
             before(grammarAccess.getViewAccess().getModelModelEStringParserRuleCall_5_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__View__ModelAssignment_54987);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getViewAccess().getModelModelEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getViewAccess().getModelModelCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__ModelAssignment_5"


    // $ANTLR start "rule__View__ActionsAssignment_6_2"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2564:1: rule__View__ActionsAssignment_6_2 : ( ruleAction ) ;
    public final void rule__View__ActionsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2568:1: ( ( ruleAction ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2569:1: ( ruleAction )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2569:1: ( ruleAction )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2570:1: ruleAction
            {
             before(grammarAccess.getViewAccess().getActionsActionParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_rule__View__ActionsAssignment_6_25022);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getViewAccess().getActionsActionParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__ActionsAssignment_6_2"


    // $ANTLR start "rule__View__ActionsAssignment_6_3_1"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2579:1: rule__View__ActionsAssignment_6_3_1 : ( ruleAction ) ;
    public final void rule__View__ActionsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2583:1: ( ( ruleAction ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2584:1: ( ruleAction )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2584:1: ( ruleAction )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2585:1: ruleAction
            {
             before(grammarAccess.getViewAccess().getActionsActionParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_rule__View__ActionsAssignment_6_3_15053);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getViewAccess().getActionsActionParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__ActionsAssignment_6_3_1"


    // $ANTLR start "rule__Model__NameAssignment_2"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2594:1: rule__Model__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Model__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2598:1: ( ( ruleEString ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2599:1: ( ruleEString )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2599:1: ( ruleEString )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2600:1: ruleEString
            {
             before(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Model__NameAssignment_25084);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_2"


    // $ANTLR start "rule__Model__PropertiesAssignment_4_2"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2609:1: rule__Model__PropertiesAssignment_4_2 : ( ruleModelProperty ) ;
    public final void rule__Model__PropertiesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2613:1: ( ( ruleModelProperty ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2614:1: ( ruleModelProperty )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2614:1: ( ruleModelProperty )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2615:1: ruleModelProperty
            {
             before(grammarAccess.getModelAccess().getPropertiesModelPropertyParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleModelProperty_in_rule__Model__PropertiesAssignment_4_25115);
            ruleModelProperty();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPropertiesModelPropertyParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PropertiesAssignment_4_2"


    // $ANTLR start "rule__Model__PropertiesAssignment_4_3_1"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2624:1: rule__Model__PropertiesAssignment_4_3_1 : ( ruleModelProperty ) ;
    public final void rule__Model__PropertiesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2628:1: ( ( ruleModelProperty ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2629:1: ( ruleModelProperty )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2629:1: ( ruleModelProperty )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2630:1: ruleModelProperty
            {
             before(grammarAccess.getModelAccess().getPropertiesModelPropertyParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleModelProperty_in_rule__Model__PropertiesAssignment_4_3_15146);
            ruleModelProperty();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPropertiesModelPropertyParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PropertiesAssignment_4_3_1"


    // $ANTLR start "rule__Model__OwnedElementsAssignment_5_2"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2639:1: rule__Model__OwnedElementsAssignment_5_2 : ( ruleModel ) ;
    public final void rule__Model__OwnedElementsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2643:1: ( ( ruleModel ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2644:1: ( ruleModel )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2644:1: ( ruleModel )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2645:1: ruleModel
            {
             before(grammarAccess.getModelAccess().getOwnedElementsModelParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_rule__Model__OwnedElementsAssignment_5_25177);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelAccess().getOwnedElementsModelParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__OwnedElementsAssignment_5_2"


    // $ANTLR start "rule__Model__OwnedElementsAssignment_5_3_1"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2654:1: rule__Model__OwnedElementsAssignment_5_3_1 : ( ruleModel ) ;
    public final void rule__Model__OwnedElementsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2658:1: ( ( ruleModel ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2659:1: ( ruleModel )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2659:1: ( ruleModel )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2660:1: ruleModel
            {
             before(grammarAccess.getModelAccess().getOwnedElementsModelParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_rule__Model__OwnedElementsAssignment_5_3_15208);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelAccess().getOwnedElementsModelParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__OwnedElementsAssignment_5_3_1"


    // $ANTLR start "rule__Action__NameAssignment_2"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2669:1: rule__Action__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Action__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2673:1: ( ( ruleEString ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2674:1: ( ruleEString )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2674:1: ( ruleEString )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2675:1: ruleEString
            {
             before(grammarAccess.getActionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Action__NameAssignment_25239);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__NameAssignment_2"


    // $ANTLR start "rule__Action__NextPageAssignment_4_1"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2684:1: rule__Action__NextPageAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Action__NextPageAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2688:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2689:1: ( ( ruleEString ) )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2689:1: ( ( ruleEString ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2690:1: ( ruleEString )
            {
             before(grammarAccess.getActionAccess().getNextPageViewCrossReference_4_1_0()); 
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2691:1: ( ruleEString )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2692:1: ruleEString
            {
             before(grammarAccess.getActionAccess().getNextPageViewEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Action__NextPageAssignment_4_15274);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionAccess().getNextPageViewEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getActionAccess().getNextPageViewCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__NextPageAssignment_4_1"


    // $ANTLR start "rule__ModelProperty__NameAssignment_2"
    // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2703:1: rule__ModelProperty__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ModelProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2707:1: ( ( ruleEString ) )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2708:1: ( ruleEString )
            {
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2708:1: ( ruleEString )
            // ../org.xtext.banque.application.ui/src-gen/org/xtext/banque/application/ui/contentassist/antlr/internal/InternalMyApplication.g:2709:1: ruleEString
            {
             before(grammarAccess.getModelPropertyAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ModelProperty__NameAssignment_25309);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModelPropertyAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__NameAssignment_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleUIApplication_in_entryRuleUIApplication61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUIApplication68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__Group__0_in_ruleUIApplication94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleView_in_entryRuleView121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleView128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__View__Group__0_in_ruleView154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__0_in_ruleAction334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModelProperty_in_entryRuleModelProperty361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModelProperty368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModelProperty__Group__0_in_ruleModelProperty394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__Group__0__Impl_in_rule__UIApplication__Group__0477 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__UIApplication__Group__1_in_rule__UIApplication__Group__0480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__Group__1__Impl_in_rule__UIApplication__Group__1538 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__UIApplication__Group__2_in_rule__UIApplication__Group__1541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__UIApplication__Group__1__Impl569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__Group__2__Impl_in_rule__UIApplication__Group__2600 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_rule__UIApplication__Group__3_in_rule__UIApplication__Group__2603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__UIApplication__Group__2__Impl631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__Group__3__Impl_in_rule__UIApplication__Group__3662 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_rule__UIApplication__Group__4_in_rule__UIApplication__Group__3665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_3__0_in_rule__UIApplication__Group__3__Impl692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__Group__4__Impl_in_rule__UIApplication__Group__4723 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_rule__UIApplication__Group__5_in_rule__UIApplication__Group__4726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_4__0_in_rule__UIApplication__Group__4__Impl753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__Group__5__Impl_in_rule__UIApplication__Group__5784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__UIApplication__Group__5__Impl812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_3__0__Impl_in_rule__UIApplication__Group_3__0855 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_3__1_in_rule__UIApplication__Group_3__0858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__UIApplication__Group_3__0__Impl886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_3__1__Impl_in_rule__UIApplication__Group_3__1917 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_3__2_in_rule__UIApplication__Group_3__1920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__UIApplication__Group_3__1__Impl948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_3__2__Impl_in_rule__UIApplication__Group_3__2979 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_3__3_in_rule__UIApplication__Group_3__2982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__PagesAssignment_3_2_in_rule__UIApplication__Group_3__2__Impl1009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_3__3__Impl_in_rule__UIApplication__Group_3__31039 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_3__4_in_rule__UIApplication__Group_3__31042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_3_3__0_in_rule__UIApplication__Group_3__3__Impl1069 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_3__4__Impl_in_rule__UIApplication__Group_3__41100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__UIApplication__Group_3__4__Impl1128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_3_3__0__Impl_in_rule__UIApplication__Group_3_3__01169 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_3_3__1_in_rule__UIApplication__Group_3_3__01172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__UIApplication__Group_3_3__0__Impl1200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_3_3__1__Impl_in_rule__UIApplication__Group_3_3__11231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__PagesAssignment_3_3_1_in_rule__UIApplication__Group_3_3__1__Impl1258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_4__0__Impl_in_rule__UIApplication__Group_4__01292 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_4__1_in_rule__UIApplication__Group_4__01295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__UIApplication__Group_4__0__Impl1323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_4__1__Impl_in_rule__UIApplication__Group_4__11354 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_4__2_in_rule__UIApplication__Group_4__11357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__UIApplication__Group_4__1__Impl1385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_4__2__Impl_in_rule__UIApplication__Group_4__21416 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_4__3_in_rule__UIApplication__Group_4__21419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__ModelsAssignment_4_2_in_rule__UIApplication__Group_4__2__Impl1446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_4__3__Impl_in_rule__UIApplication__Group_4__31476 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_4__4_in_rule__UIApplication__Group_4__31479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_4_3__0_in_rule__UIApplication__Group_4__3__Impl1506 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_4__4__Impl_in_rule__UIApplication__Group_4__41537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__UIApplication__Group_4__4__Impl1565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_4_3__0__Impl_in_rule__UIApplication__Group_4_3__01606 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_4_3__1_in_rule__UIApplication__Group_4_3__01609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__UIApplication__Group_4_3__0__Impl1637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__Group_4_3__1__Impl_in_rule__UIApplication__Group_4_3__11668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UIApplication__ModelsAssignment_4_3_1_in_rule__UIApplication__Group_4_3__1__Impl1695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__View__Group__0__Impl_in_rule__View__Group__01729 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__View__Group__1_in_rule__View__Group__01732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__View__Group__0__Impl1760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__View__Group__1__Impl_in_rule__View__Group__11791 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__View__Group__2_in_rule__View__Group__11794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__View__NameAssignment_1_in_rule__View__Group__1__Impl1821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__View__Group__2__Impl_in_rule__View__Group__21851 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__View__Group__3_in_rule__View__Group__21854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__View__Group__2__Impl1882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__View__Group__3__Impl_in_rule__View__Group__31913 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__View__Group__4_in_rule__View__Group__31916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__View__Group_3__0_in_rule__View__Group__3__Impl1943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__View__Group__4__Impl_in_rule__View__Group__41974 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__View__Group__5_in_rule__View__Group__41977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__View__Group__4__Impl2005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__View__Group__5__Impl_in_rule__View__Group__52036 = new BitSet(new long[]{0x0000000000102000L});
        public static final BitSet FOLLOW_rule__View__Group__6_in_rule__View__Group__52039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__View__ModelAssignment_5_in_rule__View__Group__5__Impl2066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__View__Group__6__Impl_in_rule__View__Group__62096 = new BitSet(new long[]{0x0000000000102000L});
        public static final BitSet FOLLOW_rule__View__Group__7_in_rule__View__Group__62099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__View__Group_6__0_in_rule__View__Group__6__Impl2126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__View__Group__7__Impl_in_rule__View__Group__72157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__View__Group__7__Impl2185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__View__Group_3__0__Impl_in_rule__View__Group_3__02232 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__View__Group_3__1_in_rule__View__Group_3__02235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__View__Group_3__0__Impl2263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__View__Group_3__1__Impl_in_rule__View__Group_3__12294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__View__DescriptionAssignment_3_1_in_rule__View__Group_3__1__Impl2321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__View__Group_6__0__Impl_in_rule__View__Group_6__02355 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__View__Group_6__1_in_rule__View__Group_6__02358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__View__Group_6__0__Impl2386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__View__Group_6__1__Impl_in_rule__View__Group_6__12417 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__View__Group_6__2_in_rule__View__Group_6__12420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__View__Group_6__1__Impl2448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__View__Group_6__2__Impl_in_rule__View__Group_6__22479 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__View__Group_6__3_in_rule__View__Group_6__22482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__View__ActionsAssignment_6_2_in_rule__View__Group_6__2__Impl2509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__View__Group_6__3__Impl_in_rule__View__Group_6__32539 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__View__Group_6__4_in_rule__View__Group_6__32542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__View__Group_6_3__0_in_rule__View__Group_6__3__Impl2569 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__View__Group_6__4__Impl_in_rule__View__Group_6__42600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__View__Group_6__4__Impl2628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__View__Group_6_3__0__Impl_in_rule__View__Group_6_3__02669 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__View__Group_6_3__1_in_rule__View__Group_6_3__02672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__View__Group_6_3__0__Impl2700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__View__Group_6_3__1__Impl_in_rule__View__Group_6_3__12731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__View__ActionsAssignment_6_3_1_in_rule__View__Group_6_3__1__Impl2758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02792 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12853 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Model__Group__1__Impl2884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22915 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__NameAssignment_2_in_rule__Model__Group__2__Impl2945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32975 = new BitSet(new long[]{0x0000000000C02000L});
        public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Model__Group__3__Impl3006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__43037 = new BitSet(new long[]{0x0000000000C02000L});
        public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__43040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_4__0_in_rule__Model__Group__4__Impl3067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__53098 = new BitSet(new long[]{0x0000000000C02000L});
        public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__53101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_5__0_in_rule__Model__Group__5__Impl3128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__63159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Model__Group__6__Impl3187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_4__0__Impl_in_rule__Model__Group_4__03232 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Model__Group_4__1_in_rule__Model__Group_4__03235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Model__Group_4__0__Impl3263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_4__1__Impl_in_rule__Model__Group_4__13294 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Model__Group_4__2_in_rule__Model__Group_4__13297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Model__Group_4__1__Impl3325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_4__2__Impl_in_rule__Model__Group_4__23356 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Model__Group_4__3_in_rule__Model__Group_4__23359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__PropertiesAssignment_4_2_in_rule__Model__Group_4__2__Impl3386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_4__3__Impl_in_rule__Model__Group_4__33416 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Model__Group_4__4_in_rule__Model__Group_4__33419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_4_3__0_in_rule__Model__Group_4__3__Impl3446 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Model__Group_4__4__Impl_in_rule__Model__Group_4__43477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Model__Group_4__4__Impl3505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_4_3__0__Impl_in_rule__Model__Group_4_3__03546 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Model__Group_4_3__1_in_rule__Model__Group_4_3__03549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Model__Group_4_3__0__Impl3577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_4_3__1__Impl_in_rule__Model__Group_4_3__13608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__PropertiesAssignment_4_3_1_in_rule__Model__Group_4_3__1__Impl3635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_5__0__Impl_in_rule__Model__Group_5__03669 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Model__Group_5__1_in_rule__Model__Group_5__03672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Model__Group_5__0__Impl3700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_5__1__Impl_in_rule__Model__Group_5__13731 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Model__Group_5__2_in_rule__Model__Group_5__13734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Model__Group_5__1__Impl3762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_5__2__Impl_in_rule__Model__Group_5__23793 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Model__Group_5__3_in_rule__Model__Group_5__23796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__OwnedElementsAssignment_5_2_in_rule__Model__Group_5__2__Impl3823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_5__3__Impl_in_rule__Model__Group_5__33853 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Model__Group_5__4_in_rule__Model__Group_5__33856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_5_3__0_in_rule__Model__Group_5__3__Impl3883 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Model__Group_5__4__Impl_in_rule__Model__Group_5__43914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Model__Group_5__4__Impl3942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_5_3__0__Impl_in_rule__Model__Group_5_3__03983 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Model__Group_5_3__1_in_rule__Model__Group_5_3__03986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Model__Group_5_3__0__Impl4014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_5_3__1__Impl_in_rule__Model__Group_5_3__14045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__OwnedElementsAssignment_5_3_1_in_rule__Model__Group_5_3__1__Impl4072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__04106 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__04109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__14167 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__14170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Action__Group__1__Impl4198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__24229 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__24232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__NameAssignment_2_in_rule__Action__Group__2__Impl4259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__34289 = new BitSet(new long[]{0x0000000002002000L});
        public static final BitSet FOLLOW_rule__Action__Group__4_in_rule__Action__Group__34292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Action__Group__3__Impl4320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__44351 = new BitSet(new long[]{0x0000000002002000L});
        public static final BitSet FOLLOW_rule__Action__Group__5_in_rule__Action__Group__44354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_4__0_in_rule__Action__Group__4__Impl4381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__5__Impl_in_rule__Action__Group__54412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Action__Group__5__Impl4440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_4__0__Impl_in_rule__Action__Group_4__04483 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Action__Group_4__1_in_rule__Action__Group_4__04486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Action__Group_4__0__Impl4514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_4__1__Impl_in_rule__Action__Group_4__14545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__NextPageAssignment_4_1_in_rule__Action__Group_4__1__Impl4572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModelProperty__Group__0__Impl_in_rule__ModelProperty__Group__04606 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ModelProperty__Group__1_in_rule__ModelProperty__Group__04609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModelProperty__Group__1__Impl_in_rule__ModelProperty__Group__14667 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ModelProperty__Group__2_in_rule__ModelProperty__Group__14670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ModelProperty__Group__1__Impl4698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModelProperty__Group__2__Impl_in_rule__ModelProperty__Group__24729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModelProperty__NameAssignment_2_in_rule__ModelProperty__Group__2__Impl4756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleView_in_rule__UIApplication__PagesAssignment_3_24797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleView_in_rule__UIApplication__PagesAssignment_3_3_14828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModel_in_rule__UIApplication__ModelsAssignment_4_24859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModel_in_rule__UIApplication__ModelsAssignment_4_3_14890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__View__NameAssignment_14921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__View__DescriptionAssignment_3_14952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__View__ModelAssignment_54987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_rule__View__ActionsAssignment_6_25022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_rule__View__ActionsAssignment_6_3_15053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Model__NameAssignment_25084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModelProperty_in_rule__Model__PropertiesAssignment_4_25115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModelProperty_in_rule__Model__PropertiesAssignment_4_3_15146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModel_in_rule__Model__OwnedElementsAssignment_5_25177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModel_in_rule__Model__OwnedElementsAssignment_5_3_15208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Action__NameAssignment_25239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Action__NextPageAssignment_4_15274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ModelProperty__NameAssignment_25309 = new BitSet(new long[]{0x0000000000000002L});
    }


}