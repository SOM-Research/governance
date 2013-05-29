package fr.inria.atlanmod.decision.ui.contentassist.antlr.internal; 

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
import fr.inria.atlanmod.decision.services.StrategyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStrategyParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Task'", "'Patch'", "'Comment'", "'Present'", "'Qualified'", "'Project'", "'{'", "'}'", "'Roles'", "':'", "','", "'Deadlines'", "'Strategies'", "'Majority'", "'applied to'", "'people'", "'range'", "'deadline'", "'('", "')'", "'minVotes'", "'Ratio'", "'ratio'", "'LeaderDriven'", "'default'", "'phases'", "'='", "'days'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_FLOAT=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalStrategyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStrategyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStrategyParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g"; }


     
     	private StrategyGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(StrategyGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleProject"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:60:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:61:1: ( ruleProject EOF )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:62:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProject_in_entryRuleProject61);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProject68); 

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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:69:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:73:2: ( ( ( rule__Project__Group__0 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:74:1: ( ( rule__Project__Group__0 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:74:1: ( ( rule__Project__Group__0 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:75:1: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:76:1: ( rule__Project__Group__0 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:76:2: rule__Project__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__0_in_ruleProject94);
            rule__Project__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getGroup()); 

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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleStrategy"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:88:1: entryRuleStrategy : ruleStrategy EOF ;
    public final void entryRuleStrategy() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:89:1: ( ruleStrategy EOF )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:90:1: ruleStrategy EOF
            {
             before(grammarAccess.getStrategyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_entryRuleStrategy121);
            ruleStrategy();

            state._fsp--;

             after(grammarAccess.getStrategyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStrategy128); 

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
    // $ANTLR end "entryRuleStrategy"


    // $ANTLR start "ruleStrategy"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:97:1: ruleStrategy : ( ( rule__Strategy__Alternatives ) ) ;
    public final void ruleStrategy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:101:2: ( ( ( rule__Strategy__Alternatives ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:102:1: ( ( rule__Strategy__Alternatives ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:102:1: ( ( rule__Strategy__Alternatives ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:103:1: ( rule__Strategy__Alternatives )
            {
             before(grammarAccess.getStrategyAccess().getAlternatives()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:104:1: ( rule__Strategy__Alternatives )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:104:2: rule__Strategy__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Strategy__Alternatives_in_ruleStrategy154);
            rule__Strategy__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStrategyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStrategy"


    // $ANTLR start "entryRuleRole"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:116:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:117:1: ( ruleRole EOF )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:118:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_entryRuleRole181);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRole188); 

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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:125:1: ruleRole : ( ( rule__Role__NameAssignment ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:129:2: ( ( ( rule__Role__NameAssignment ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:130:1: ( ( rule__Role__NameAssignment ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:130:1: ( ( rule__Role__NameAssignment ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:131:1: ( rule__Role__NameAssignment )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:132:1: ( rule__Role__NameAssignment )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:132:2: rule__Role__NameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__NameAssignment_in_ruleRole214);
            rule__Role__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleMajority"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:144:1: entryRuleMajority : ruleMajority EOF ;
    public final void entryRuleMajority() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:145:1: ( ruleMajority EOF )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:146:1: ruleMajority EOF
            {
             before(grammarAccess.getMajorityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMajority_in_entryRuleMajority241);
            ruleMajority();

            state._fsp--;

             after(grammarAccess.getMajorityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMajority248); 

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
    // $ANTLR end "entryRuleMajority"


    // $ANTLR start "ruleMajority"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:153:1: ruleMajority : ( ( rule__Majority__Group__0 ) ) ;
    public final void ruleMajority() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:157:2: ( ( ( rule__Majority__Group__0 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:158:1: ( ( rule__Majority__Group__0 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:158:1: ( ( rule__Majority__Group__0 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:159:1: ( rule__Majority__Group__0 )
            {
             before(grammarAccess.getMajorityAccess().getGroup()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:160:1: ( rule__Majority__Group__0 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:160:2: rule__Majority__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__0_in_ruleMajority274);
            rule__Majority__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMajorityAccess().getGroup()); 

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
    // $ANTLR end "ruleMajority"


    // $ANTLR start "entryRuleRatioMajority"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:172:1: entryRuleRatioMajority : ruleRatioMajority EOF ;
    public final void entryRuleRatioMajority() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:173:1: ( ruleRatioMajority EOF )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:174:1: ruleRatioMajority EOF
            {
             before(grammarAccess.getRatioMajorityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRatioMajority_in_entryRuleRatioMajority301);
            ruleRatioMajority();

            state._fsp--;

             after(grammarAccess.getRatioMajorityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRatioMajority308); 

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
    // $ANTLR end "entryRuleRatioMajority"


    // $ANTLR start "ruleRatioMajority"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:181:1: ruleRatioMajority : ( ( rule__RatioMajority__Group__0 ) ) ;
    public final void ruleRatioMajority() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:185:2: ( ( ( rule__RatioMajority__Group__0 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:186:1: ( ( rule__RatioMajority__Group__0 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:186:1: ( ( rule__RatioMajority__Group__0 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:187:1: ( rule__RatioMajority__Group__0 )
            {
             before(grammarAccess.getRatioMajorityAccess().getGroup()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:188:1: ( rule__RatioMajority__Group__0 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:188:2: rule__RatioMajority__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__0_in_ruleRatioMajority334);
            rule__RatioMajority__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRatioMajorityAccess().getGroup()); 

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
    // $ANTLR end "ruleRatioMajority"


    // $ANTLR start "entryRuleLeaderDriven"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:200:1: entryRuleLeaderDriven : ruleLeaderDriven EOF ;
    public final void entryRuleLeaderDriven() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:201:1: ( ruleLeaderDriven EOF )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:202:1: ruleLeaderDriven EOF
            {
             before(grammarAccess.getLeaderDrivenRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLeaderDriven_in_entryRuleLeaderDriven361);
            ruleLeaderDriven();

            state._fsp--;

             after(grammarAccess.getLeaderDrivenRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLeaderDriven368); 

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
    // $ANTLR end "entryRuleLeaderDriven"


    // $ANTLR start "ruleLeaderDriven"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:209:1: ruleLeaderDriven : ( ( rule__LeaderDriven__Group__0 ) ) ;
    public final void ruleLeaderDriven() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:213:2: ( ( ( rule__LeaderDriven__Group__0 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:214:1: ( ( rule__LeaderDriven__Group__0 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:214:1: ( ( rule__LeaderDriven__Group__0 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:215:1: ( rule__LeaderDriven__Group__0 )
            {
             before(grammarAccess.getLeaderDrivenAccess().getGroup()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:216:1: ( rule__LeaderDriven__Group__0 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:216:2: rule__LeaderDriven__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__0_in_ruleLeaderDriven394);
            rule__LeaderDriven__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeaderDrivenAccess().getGroup()); 

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
    // $ANTLR end "ruleLeaderDriven"


    // $ANTLR start "entryRulePhasedStrategy"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:228:1: entryRulePhasedStrategy : rulePhasedStrategy EOF ;
    public final void entryRulePhasedStrategy() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:229:1: ( rulePhasedStrategy EOF )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:230:1: rulePhasedStrategy EOF
            {
             before(grammarAccess.getPhasedStrategyRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePhasedStrategy_in_entryRulePhasedStrategy421);
            rulePhasedStrategy();

            state._fsp--;

             after(grammarAccess.getPhasedStrategyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePhasedStrategy428); 

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
    // $ANTLR end "entryRulePhasedStrategy"


    // $ANTLR start "rulePhasedStrategy"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:237:1: rulePhasedStrategy : ( ( rule__PhasedStrategy__Group__0 ) ) ;
    public final void rulePhasedStrategy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:241:2: ( ( ( rule__PhasedStrategy__Group__0 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:242:1: ( ( rule__PhasedStrategy__Group__0 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:242:1: ( ( rule__PhasedStrategy__Group__0 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:243:1: ( rule__PhasedStrategy__Group__0 )
            {
             before(grammarAccess.getPhasedStrategyAccess().getGroup()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:244:1: ( rule__PhasedStrategy__Group__0 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:244:2: rule__PhasedStrategy__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__0_in_rulePhasedStrategy454);
            rule__PhasedStrategy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhasedStrategyAccess().getGroup()); 

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
    // $ANTLR end "rulePhasedStrategy"


    // $ANTLR start "entryRuleFilter"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:256:1: entryRuleFilter : ruleFilter EOF ;
    public final void entryRuleFilter() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:257:1: ( ruleFilter EOF )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:258:1: ruleFilter EOF
            {
             before(grammarAccess.getFilterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilter_in_entryRuleFilter481);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getFilterRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFilter488); 

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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:265:1: ruleFilter : ( ( rule__Filter__Group__0 ) ) ;
    public final void ruleFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:269:2: ( ( ( rule__Filter__Group__0 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:270:1: ( ( rule__Filter__Group__0 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:270:1: ( ( rule__Filter__Group__0 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:271:1: ( rule__Filter__Group__0 )
            {
             before(grammarAccess.getFilterAccess().getGroup()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:272:1: ( rule__Filter__Group__0 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:272:2: rule__Filter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group__0_in_ruleFilter514);
            rule__Filter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getGroup()); 

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
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleDeadline"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:284:1: entryRuleDeadline : ruleDeadline EOF ;
    public final void entryRuleDeadline() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:285:1: ( ruleDeadline EOF )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:286:1: ruleDeadline EOF
            {
             before(grammarAccess.getDeadlineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeadline_in_entryRuleDeadline541);
            ruleDeadline();

            state._fsp--;

             after(grammarAccess.getDeadlineRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeadline548); 

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
    // $ANTLR end "entryRuleDeadline"


    // $ANTLR start "ruleDeadline"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:293:1: ruleDeadline : ( ( rule__Deadline__Alternatives ) ) ;
    public final void ruleDeadline() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:297:2: ( ( ( rule__Deadline__Alternatives ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:298:1: ( ( rule__Deadline__Alternatives ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:298:1: ( ( rule__Deadline__Alternatives ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:299:1: ( rule__Deadline__Alternatives )
            {
             before(grammarAccess.getDeadlineAccess().getAlternatives()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:300:1: ( rule__Deadline__Alternatives )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:300:2: rule__Deadline__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Deadline__Alternatives_in_ruleDeadline574);
            rule__Deadline__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeadlineAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDeadline"


    // $ANTLR start "entryRuleTimer"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:312:1: entryRuleTimer : ruleTimer EOF ;
    public final void entryRuleTimer() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:313:1: ( ruleTimer EOF )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:314:1: ruleTimer EOF
            {
             before(grammarAccess.getTimerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTimer_in_entryRuleTimer601);
            ruleTimer();

            state._fsp--;

             after(grammarAccess.getTimerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTimer608); 

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
    // $ANTLR end "entryRuleTimer"


    // $ANTLR start "ruleTimer"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:321:1: ruleTimer : ( ( rule__Timer__Group__0 ) ) ;
    public final void ruleTimer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:325:2: ( ( ( rule__Timer__Group__0 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:326:1: ( ( rule__Timer__Group__0 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:326:1: ( ( rule__Timer__Group__0 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:327:1: ( rule__Timer__Group__0 )
            {
             before(grammarAccess.getTimerAccess().getGroup()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:328:1: ( rule__Timer__Group__0 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:328:2: rule__Timer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Timer__Group__0_in_ruleTimer634);
            rule__Timer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getGroup()); 

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
    // $ANTLR end "ruleTimer"


    // $ANTLR start "entryRuleOCLCondition"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:340:1: entryRuleOCLCondition : ruleOCLCondition EOF ;
    public final void entryRuleOCLCondition() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:341:1: ( ruleOCLCondition EOF )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:342:1: ruleOCLCondition EOF
            {
             before(grammarAccess.getOCLConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOCLCondition_in_entryRuleOCLCondition661);
            ruleOCLCondition();

            state._fsp--;

             after(grammarAccess.getOCLConditionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOCLCondition668); 

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
    // $ANTLR end "entryRuleOCLCondition"


    // $ANTLR start "ruleOCLCondition"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:349:1: ruleOCLCondition : ( ( rule__OCLCondition__OclExpressionAssignment ) ) ;
    public final void ruleOCLCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:353:2: ( ( ( rule__OCLCondition__OclExpressionAssignment ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:354:1: ( ( rule__OCLCondition__OclExpressionAssignment ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:354:1: ( ( rule__OCLCondition__OclExpressionAssignment ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:355:1: ( rule__OCLCondition__OclExpressionAssignment )
            {
             before(grammarAccess.getOCLConditionAccess().getOclExpressionAssignment()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:356:1: ( rule__OCLCondition__OclExpressionAssignment )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:356:2: rule__OCLCondition__OclExpressionAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__OCLCondition__OclExpressionAssignment_in_ruleOCLCondition694);
            rule__OCLCondition__OclExpressionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOCLConditionAccess().getOclExpressionAssignment()); 

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
    // $ANTLR end "ruleOCLCondition"


    // $ANTLR start "entryRuleWaitForVote"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:368:1: entryRuleWaitForVote : ruleWaitForVote EOF ;
    public final void entryRuleWaitForVote() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:369:1: ( ruleWaitForVote EOF )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:370:1: ruleWaitForVote EOF
            {
             before(grammarAccess.getWaitForVoteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWaitForVote_in_entryRuleWaitForVote721);
            ruleWaitForVote();

            state._fsp--;

             after(grammarAccess.getWaitForVoteRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWaitForVote728); 

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
    // $ANTLR end "entryRuleWaitForVote"


    // $ANTLR start "ruleWaitForVote"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:377:1: ruleWaitForVote : ( ( rule__WaitForVote__Group__0 ) ) ;
    public final void ruleWaitForVote() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:381:2: ( ( ( rule__WaitForVote__Group__0 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:382:1: ( ( rule__WaitForVote__Group__0 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:382:1: ( ( rule__WaitForVote__Group__0 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:383:1: ( rule__WaitForVote__Group__0 )
            {
             before(grammarAccess.getWaitForVoteAccess().getGroup()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:384:1: ( rule__WaitForVote__Group__0 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:384:2: rule__WaitForVote__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__WaitForVote__Group__0_in_ruleWaitForVote754);
            rule__WaitForVote__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWaitForVoteAccess().getGroup()); 

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
    // $ANTLR end "ruleWaitForVote"


    // $ANTLR start "ruleCollaborationType"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:397:1: ruleCollaborationType : ( ( rule__CollaborationType__Alternatives ) ) ;
    public final void ruleCollaborationType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:401:1: ( ( ( rule__CollaborationType__Alternatives ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:402:1: ( ( rule__CollaborationType__Alternatives ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:402:1: ( ( rule__CollaborationType__Alternatives ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:403:1: ( rule__CollaborationType__Alternatives )
            {
             before(grammarAccess.getCollaborationTypeAccess().getAlternatives()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:404:1: ( rule__CollaborationType__Alternatives )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:404:2: rule__CollaborationType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CollaborationType__Alternatives_in_ruleCollaborationType791);
            rule__CollaborationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCollaborationTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCollaborationType"


    // $ANTLR start "ruleRangeType"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:416:1: ruleRangeType : ( ( rule__RangeType__Alternatives ) ) ;
    public final void ruleRangeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:420:1: ( ( ( rule__RangeType__Alternatives ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:421:1: ( ( rule__RangeType__Alternatives ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:421:1: ( ( rule__RangeType__Alternatives ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:422:1: ( rule__RangeType__Alternatives )
            {
             before(grammarAccess.getRangeTypeAccess().getAlternatives()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:423:1: ( rule__RangeType__Alternatives )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:423:2: rule__RangeType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__RangeType__Alternatives_in_ruleRangeType827);
            rule__RangeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRangeTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRangeType"


    // $ANTLR start "rule__Strategy__Alternatives"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:434:1: rule__Strategy__Alternatives : ( ( ruleMajority ) | ( ruleRatioMajority ) | ( ruleLeaderDriven ) | ( rulePhasedStrategy ) );
    public final void rule__Strategy__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:438:1: ( ( ruleMajority ) | ( ruleRatioMajority ) | ( ruleLeaderDriven ) | ( rulePhasedStrategy ) )
            int alt1=4;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==21) ) {
                    switch ( input.LA(3) ) {
                    case 25:
                        {
                        alt1=1;
                        }
                        break;
                    case 33:
                        {
                        int LA1_4 = input.LA(4);

                        if ( (LA1_4==18) ) {
                            int LA1_6 = input.LA(5);

                            if ( (LA1_6==26) ) {
                                alt1=2;
                            }
                            else if ( (LA1_6==37) ) {
                                alt1=4;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 35:
                        {
                        alt1=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:439:1: ( ruleMajority )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:439:1: ( ruleMajority )
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:440:1: ruleMajority
                    {
                     before(grammarAccess.getStrategyAccess().getMajorityParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMajority_in_rule__Strategy__Alternatives862);
                    ruleMajority();

                    state._fsp--;

                     after(grammarAccess.getStrategyAccess().getMajorityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:445:6: ( ruleRatioMajority )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:445:6: ( ruleRatioMajority )
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:446:1: ruleRatioMajority
                    {
                     before(grammarAccess.getStrategyAccess().getRatioMajorityParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRatioMajority_in_rule__Strategy__Alternatives879);
                    ruleRatioMajority();

                    state._fsp--;

                     after(grammarAccess.getStrategyAccess().getRatioMajorityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:451:6: ( ruleLeaderDriven )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:451:6: ( ruleLeaderDriven )
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:452:1: ruleLeaderDriven
                    {
                     before(grammarAccess.getStrategyAccess().getLeaderDrivenParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLeaderDriven_in_rule__Strategy__Alternatives896);
                    ruleLeaderDriven();

                    state._fsp--;

                     after(grammarAccess.getStrategyAccess().getLeaderDrivenParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:457:6: ( rulePhasedStrategy )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:457:6: ( rulePhasedStrategy )
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:458:1: rulePhasedStrategy
                    {
                     before(grammarAccess.getStrategyAccess().getPhasedStrategyParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_rulePhasedStrategy_in_rule__Strategy__Alternatives913);
                    rulePhasedStrategy();

                    state._fsp--;

                     after(grammarAccess.getStrategyAccess().getPhasedStrategyParserRuleCall_3()); 

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
    // $ANTLR end "rule__Strategy__Alternatives"


    // $ANTLR start "rule__RatioMajority__Alternatives_5"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:468:1: rule__RatioMajority__Alternatives_5 : ( ( 'Task' ) | ( 'Patch' ) | ( 'Comment' ) );
    public final void rule__RatioMajority__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:472:1: ( ( 'Task' ) | ( 'Patch' ) | ( 'Comment' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:473:1: ( 'Task' )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:473:1: ( 'Task' )
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:474:1: 'Task'
                    {
                     before(grammarAccess.getRatioMajorityAccess().getTaskKeyword_5_0()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__RatioMajority__Alternatives_5946); 
                     after(grammarAccess.getRatioMajorityAccess().getTaskKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:481:6: ( 'Patch' )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:481:6: ( 'Patch' )
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:482:1: 'Patch'
                    {
                     before(grammarAccess.getRatioMajorityAccess().getPatchKeyword_5_1()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__RatioMajority__Alternatives_5966); 
                     after(grammarAccess.getRatioMajorityAccess().getPatchKeyword_5_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:489:6: ( 'Comment' )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:489:6: ( 'Comment' )
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:490:1: 'Comment'
                    {
                     before(grammarAccess.getRatioMajorityAccess().getCommentKeyword_5_2()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__RatioMajority__Alternatives_5986); 
                     after(grammarAccess.getRatioMajorityAccess().getCommentKeyword_5_2()); 

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
    // $ANTLR end "rule__RatioMajority__Alternatives_5"


    // $ANTLR start "rule__LeaderDriven__Alternatives_5"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:502:1: rule__LeaderDriven__Alternatives_5 : ( ( 'Task' ) | ( 'Patch' ) | ( 'Comment' ) );
    public final void rule__LeaderDriven__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:506:1: ( ( 'Task' ) | ( 'Patch' ) | ( 'Comment' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:507:1: ( 'Task' )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:507:1: ( 'Task' )
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:508:1: 'Task'
                    {
                     before(grammarAccess.getLeaderDrivenAccess().getTaskKeyword_5_0()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__LeaderDriven__Alternatives_51021); 
                     after(grammarAccess.getLeaderDrivenAccess().getTaskKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:515:6: ( 'Patch' )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:515:6: ( 'Patch' )
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:516:1: 'Patch'
                    {
                     before(grammarAccess.getLeaderDrivenAccess().getPatchKeyword_5_1()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__LeaderDriven__Alternatives_51041); 
                     after(grammarAccess.getLeaderDrivenAccess().getPatchKeyword_5_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:523:6: ( 'Comment' )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:523:6: ( 'Comment' )
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:524:1: 'Comment'
                    {
                     before(grammarAccess.getLeaderDrivenAccess().getCommentKeyword_5_2()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__LeaderDriven__Alternatives_51061); 
                     after(grammarAccess.getLeaderDrivenAccess().getCommentKeyword_5_2()); 

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
    // $ANTLR end "rule__LeaderDriven__Alternatives_5"


    // $ANTLR start "rule__Deadline__Alternatives"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:536:1: rule__Deadline__Alternatives : ( ( ruleTimer ) | ( ruleWaitForVote ) | ( ruleOCLCondition ) );
    public final void rule__Deadline__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:540:1: ( ( ruleTimer ) | ( ruleWaitForVote ) | ( ruleOCLCondition ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==21) ) {
                    alt4=1;
                }
                else if ( (LA4_1==EOF||LA4_1==19||LA4_1==22||LA4_1==24) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:541:1: ( ruleTimer )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:541:1: ( ruleTimer )
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:542:1: ruleTimer
                    {
                     before(grammarAccess.getDeadlineAccess().getTimerParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTimer_in_rule__Deadline__Alternatives1095);
                    ruleTimer();

                    state._fsp--;

                     after(grammarAccess.getDeadlineAccess().getTimerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:547:6: ( ruleWaitForVote )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:547:6: ( ruleWaitForVote )
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:548:1: ruleWaitForVote
                    {
                     before(grammarAccess.getDeadlineAccess().getWaitForVoteParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleWaitForVote_in_rule__Deadline__Alternatives1112);
                    ruleWaitForVote();

                    state._fsp--;

                     after(grammarAccess.getDeadlineAccess().getWaitForVoteParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:553:6: ( ruleOCLCondition )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:553:6: ( ruleOCLCondition )
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:554:1: ruleOCLCondition
                    {
                     before(grammarAccess.getDeadlineAccess().getOCLConditionParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOCLCondition_in_rule__Deadline__Alternatives1129);
                    ruleOCLCondition();

                    state._fsp--;

                     after(grammarAccess.getDeadlineAccess().getOCLConditionParserRuleCall_2()); 

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
    // $ANTLR end "rule__Deadline__Alternatives"


    // $ANTLR start "rule__CollaborationType__Alternatives"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:564:1: rule__CollaborationType__Alternatives : ( ( ( 'Task' ) ) | ( ( 'Patch' ) ) | ( ( 'Comment' ) ) );
    public final void rule__CollaborationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:568:1: ( ( ( 'Task' ) ) | ( ( 'Patch' ) ) | ( ( 'Comment' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 14:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:569:1: ( ( 'Task' ) )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:569:1: ( ( 'Task' ) )
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:570:1: ( 'Task' )
                    {
                     before(grammarAccess.getCollaborationTypeAccess().getTASKEnumLiteralDeclaration_0()); 
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:571:1: ( 'Task' )
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:571:3: 'Task'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__CollaborationType__Alternatives1162); 

                    }

                     after(grammarAccess.getCollaborationTypeAccess().getTASKEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:576:6: ( ( 'Patch' ) )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:576:6: ( ( 'Patch' ) )
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:577:1: ( 'Patch' )
                    {
                     before(grammarAccess.getCollaborationTypeAccess().getPATCHEnumLiteralDeclaration_1()); 
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:578:1: ( 'Patch' )
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:578:3: 'Patch'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__CollaborationType__Alternatives1183); 

                    }

                     after(grammarAccess.getCollaborationTypeAccess().getPATCHEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:583:6: ( ( 'Comment' ) )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:583:6: ( ( 'Comment' ) )
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:584:1: ( 'Comment' )
                    {
                     before(grammarAccess.getCollaborationTypeAccess().getCOMMENTEnumLiteralDeclaration_2()); 
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:585:1: ( 'Comment' )
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:585:3: 'Comment'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__CollaborationType__Alternatives1204); 

                    }

                     after(grammarAccess.getCollaborationTypeAccess().getCOMMENTEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__CollaborationType__Alternatives"


    // $ANTLR start "rule__RangeType__Alternatives"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:595:1: rule__RangeType__Alternatives : ( ( ( 'Present' ) ) | ( ( 'Qualified' ) ) );
    public final void rule__RangeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:599:1: ( ( ( 'Present' ) ) | ( ( 'Qualified' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:600:1: ( ( 'Present' ) )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:600:1: ( ( 'Present' ) )
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:601:1: ( 'Present' )
                    {
                     before(grammarAccess.getRangeTypeAccess().getPRESENTEnumLiteralDeclaration_0()); 
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:602:1: ( 'Present' )
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:602:3: 'Present'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__RangeType__Alternatives1240); 

                    }

                     after(grammarAccess.getRangeTypeAccess().getPRESENTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:607:6: ( ( 'Qualified' ) )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:607:6: ( ( 'Qualified' ) )
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:608:1: ( 'Qualified' )
                    {
                     before(grammarAccess.getRangeTypeAccess().getQUALIFIEDEnumLiteralDeclaration_1()); 
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:609:1: ( 'Qualified' )
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:609:3: 'Qualified'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__RangeType__Alternatives1261); 

                    }

                     after(grammarAccess.getRangeTypeAccess().getQUALIFIEDEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__RangeType__Alternatives"


    // $ANTLR start "rule__Project__Group__0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:621:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:625:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:626:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__0__Impl_in_rule__Project__Group__01294);
            rule__Project__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__1_in_rule__Project__Group__01297);
            rule__Project__Group__1();

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
    // $ANTLR end "rule__Project__Group__0"


    // $ANTLR start "rule__Project__Group__0__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:633:1: rule__Project__Group__0__Impl : ( () ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:637:1: ( ( () ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:638:1: ( () )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:638:1: ( () )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:639:1: ()
            {
             before(grammarAccess.getProjectAccess().getProjectAction_0()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:640:1: ()
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:642:1: 
            {
            }

             after(grammarAccess.getProjectAccess().getProjectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0__Impl"


    // $ANTLR start "rule__Project__Group__1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:652:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:656:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:657:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__1__Impl_in_rule__Project__Group__11355);
            rule__Project__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__2_in_rule__Project__Group__11358);
            rule__Project__Group__2();

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
    // $ANTLR end "rule__Project__Group__1"


    // $ANTLR start "rule__Project__Group__1__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:664:1: rule__Project__Group__1__Impl : ( 'Project' ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:668:1: ( ( 'Project' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:669:1: ( 'Project' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:669:1: ( 'Project' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:670:1: 'Project'
            {
             before(grammarAccess.getProjectAccess().getProjectKeyword_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Project__Group__1__Impl1386); 
             after(grammarAccess.getProjectAccess().getProjectKeyword_1()); 

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
    // $ANTLR end "rule__Project__Group__1__Impl"


    // $ANTLR start "rule__Project__Group__2"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:683:1: rule__Project__Group__2 : rule__Project__Group__2__Impl rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:687:1: ( rule__Project__Group__2__Impl rule__Project__Group__3 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:688:2: rule__Project__Group__2__Impl rule__Project__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__2__Impl_in_rule__Project__Group__21417);
            rule__Project__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__3_in_rule__Project__Group__21420);
            rule__Project__Group__3();

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
    // $ANTLR end "rule__Project__Group__2"


    // $ANTLR start "rule__Project__Group__2__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:695:1: rule__Project__Group__2__Impl : ( ( rule__Project__NameAssignment_2 ) ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:699:1: ( ( ( rule__Project__NameAssignment_2 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:700:1: ( ( rule__Project__NameAssignment_2 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:700:1: ( ( rule__Project__NameAssignment_2 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:701:1: ( rule__Project__NameAssignment_2 )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment_2()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:702:1: ( rule__Project__NameAssignment_2 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:702:2: rule__Project__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__NameAssignment_2_in_rule__Project__Group__2__Impl1447);
            rule__Project__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Project__Group__2__Impl"


    // $ANTLR start "rule__Project__Group__3"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:712:1: rule__Project__Group__3 : rule__Project__Group__3__Impl rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:716:1: ( rule__Project__Group__3__Impl rule__Project__Group__4 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:717:2: rule__Project__Group__3__Impl rule__Project__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__3__Impl_in_rule__Project__Group__31477);
            rule__Project__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__4_in_rule__Project__Group__31480);
            rule__Project__Group__4();

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
    // $ANTLR end "rule__Project__Group__3"


    // $ANTLR start "rule__Project__Group__3__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:724:1: rule__Project__Group__3__Impl : ( '{' ) ;
    public final void rule__Project__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:728:1: ( ( '{' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:729:1: ( '{' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:729:1: ( '{' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:730:1: '{'
            {
             before(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Project__Group__3__Impl1508); 
             after(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Project__Group__3__Impl"


    // $ANTLR start "rule__Project__Group__4"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:743:1: rule__Project__Group__4 : rule__Project__Group__4__Impl rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:747:1: ( rule__Project__Group__4__Impl rule__Project__Group__5 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:748:2: rule__Project__Group__4__Impl rule__Project__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__4__Impl_in_rule__Project__Group__41539);
            rule__Project__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__5_in_rule__Project__Group__41542);
            rule__Project__Group__5();

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
    // $ANTLR end "rule__Project__Group__4"


    // $ANTLR start "rule__Project__Group__4__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:755:1: rule__Project__Group__4__Impl : ( ( rule__Project__Group_4__0 )? ) ;
    public final void rule__Project__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:759:1: ( ( ( rule__Project__Group_4__0 )? ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:760:1: ( ( rule__Project__Group_4__0 )? )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:760:1: ( ( rule__Project__Group_4__0 )? )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:761:1: ( rule__Project__Group_4__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_4()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:762:1: ( rule__Project__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:762:2: rule__Project__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Project__Group_4__0_in_rule__Project__Group__4__Impl1569);
                    rule__Project__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Project__Group__4__Impl"


    // $ANTLR start "rule__Project__Group__5"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:772:1: rule__Project__Group__5 : rule__Project__Group__5__Impl rule__Project__Group__6 ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:776:1: ( rule__Project__Group__5__Impl rule__Project__Group__6 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:777:2: rule__Project__Group__5__Impl rule__Project__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__5__Impl_in_rule__Project__Group__51600);
            rule__Project__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__6_in_rule__Project__Group__51603);
            rule__Project__Group__6();

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
    // $ANTLR end "rule__Project__Group__5"


    // $ANTLR start "rule__Project__Group__5__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:784:1: rule__Project__Group__5__Impl : ( ( rule__Project__Group_5__0 )? ) ;
    public final void rule__Project__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:788:1: ( ( ( rule__Project__Group_5__0 )? ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:789:1: ( ( rule__Project__Group_5__0 )? )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:789:1: ( ( rule__Project__Group_5__0 )? )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:790:1: ( rule__Project__Group_5__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_5()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:791:1: ( rule__Project__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:791:2: rule__Project__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Project__Group_5__0_in_rule__Project__Group__5__Impl1630);
                    rule__Project__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Project__Group__5__Impl"


    // $ANTLR start "rule__Project__Group__6"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:801:1: rule__Project__Group__6 : rule__Project__Group__6__Impl rule__Project__Group__7 ;
    public final void rule__Project__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:805:1: ( rule__Project__Group__6__Impl rule__Project__Group__7 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:806:2: rule__Project__Group__6__Impl rule__Project__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__6__Impl_in_rule__Project__Group__61661);
            rule__Project__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__7_in_rule__Project__Group__61664);
            rule__Project__Group__7();

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
    // $ANTLR end "rule__Project__Group__6"


    // $ANTLR start "rule__Project__Group__6__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:813:1: rule__Project__Group__6__Impl : ( ( rule__Project__Group_6__0 )? ) ;
    public final void rule__Project__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:817:1: ( ( ( rule__Project__Group_6__0 )? ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:818:1: ( ( rule__Project__Group_6__0 )? )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:818:1: ( ( rule__Project__Group_6__0 )? )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:819:1: ( rule__Project__Group_6__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_6()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:820:1: ( rule__Project__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:820:2: rule__Project__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Project__Group_6__0_in_rule__Project__Group__6__Impl1691);
                    rule__Project__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Project__Group__6__Impl"


    // $ANTLR start "rule__Project__Group__7"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:830:1: rule__Project__Group__7 : rule__Project__Group__7__Impl ;
    public final void rule__Project__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:834:1: ( rule__Project__Group__7__Impl )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:835:2: rule__Project__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__7__Impl_in_rule__Project__Group__71722);
            rule__Project__Group__7__Impl();

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
    // $ANTLR end "rule__Project__Group__7"


    // $ANTLR start "rule__Project__Group__7__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:841:1: rule__Project__Group__7__Impl : ( '}' ) ;
    public final void rule__Project__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:845:1: ( ( '}' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:846:1: ( '}' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:846:1: ( '}' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:847:1: '}'
            {
             before(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Project__Group__7__Impl1750); 
             after(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Project__Group__7__Impl"


    // $ANTLR start "rule__Project__Group_4__0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:876:1: rule__Project__Group_4__0 : rule__Project__Group_4__0__Impl rule__Project__Group_4__1 ;
    public final void rule__Project__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:880:1: ( rule__Project__Group_4__0__Impl rule__Project__Group_4__1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:881:2: rule__Project__Group_4__0__Impl rule__Project__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_4__0__Impl_in_rule__Project__Group_4__01797);
            rule__Project__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_4__1_in_rule__Project__Group_4__01800);
            rule__Project__Group_4__1();

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
    // $ANTLR end "rule__Project__Group_4__0"


    // $ANTLR start "rule__Project__Group_4__0__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:888:1: rule__Project__Group_4__0__Impl : ( 'Roles' ) ;
    public final void rule__Project__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:892:1: ( ( 'Roles' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:893:1: ( 'Roles' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:893:1: ( 'Roles' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:894:1: 'Roles'
            {
             before(grammarAccess.getProjectAccess().getRolesKeyword_4_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Project__Group_4__0__Impl1828); 
             after(grammarAccess.getProjectAccess().getRolesKeyword_4_0()); 

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
    // $ANTLR end "rule__Project__Group_4__0__Impl"


    // $ANTLR start "rule__Project__Group_4__1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:907:1: rule__Project__Group_4__1 : rule__Project__Group_4__1__Impl rule__Project__Group_4__2 ;
    public final void rule__Project__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:911:1: ( rule__Project__Group_4__1__Impl rule__Project__Group_4__2 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:912:2: rule__Project__Group_4__1__Impl rule__Project__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_4__1__Impl_in_rule__Project__Group_4__11859);
            rule__Project__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_4__2_in_rule__Project__Group_4__11862);
            rule__Project__Group_4__2();

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
    // $ANTLR end "rule__Project__Group_4__1"


    // $ANTLR start "rule__Project__Group_4__1__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:919:1: rule__Project__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Project__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:923:1: ( ( ':' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:924:1: ( ':' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:924:1: ( ':' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:925:1: ':'
            {
             before(grammarAccess.getProjectAccess().getColonKeyword_4_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Project__Group_4__1__Impl1890); 
             after(grammarAccess.getProjectAccess().getColonKeyword_4_1()); 

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
    // $ANTLR end "rule__Project__Group_4__1__Impl"


    // $ANTLR start "rule__Project__Group_4__2"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:938:1: rule__Project__Group_4__2 : rule__Project__Group_4__2__Impl rule__Project__Group_4__3 ;
    public final void rule__Project__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:942:1: ( rule__Project__Group_4__2__Impl rule__Project__Group_4__3 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:943:2: rule__Project__Group_4__2__Impl rule__Project__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_4__2__Impl_in_rule__Project__Group_4__21921);
            rule__Project__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_4__3_in_rule__Project__Group_4__21924);
            rule__Project__Group_4__3();

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
    // $ANTLR end "rule__Project__Group_4__2"


    // $ANTLR start "rule__Project__Group_4__2__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:950:1: rule__Project__Group_4__2__Impl : ( ( rule__Project__RolesAssignment_4_2 ) ) ;
    public final void rule__Project__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:954:1: ( ( ( rule__Project__RolesAssignment_4_2 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:955:1: ( ( rule__Project__RolesAssignment_4_2 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:955:1: ( ( rule__Project__RolesAssignment_4_2 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:956:1: ( rule__Project__RolesAssignment_4_2 )
            {
             before(grammarAccess.getProjectAccess().getRolesAssignment_4_2()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:957:1: ( rule__Project__RolesAssignment_4_2 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:957:2: rule__Project__RolesAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__RolesAssignment_4_2_in_rule__Project__Group_4__2__Impl1951);
            rule__Project__RolesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getRolesAssignment_4_2()); 

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
    // $ANTLR end "rule__Project__Group_4__2__Impl"


    // $ANTLR start "rule__Project__Group_4__3"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:967:1: rule__Project__Group_4__3 : rule__Project__Group_4__3__Impl ;
    public final void rule__Project__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:971:1: ( rule__Project__Group_4__3__Impl )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:972:2: rule__Project__Group_4__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_4__3__Impl_in_rule__Project__Group_4__31981);
            rule__Project__Group_4__3__Impl();

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
    // $ANTLR end "rule__Project__Group_4__3"


    // $ANTLR start "rule__Project__Group_4__3__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:978:1: rule__Project__Group_4__3__Impl : ( ( rule__Project__Group_4_3__0 )* ) ;
    public final void rule__Project__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:982:1: ( ( ( rule__Project__Group_4_3__0 )* ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:983:1: ( ( rule__Project__Group_4_3__0 )* )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:983:1: ( ( rule__Project__Group_4_3__0 )* )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:984:1: ( rule__Project__Group_4_3__0 )*
            {
             before(grammarAccess.getProjectAccess().getGroup_4_3()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:985:1: ( rule__Project__Group_4_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:985:2: rule__Project__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Project__Group_4_3__0_in_rule__Project__Group_4__3__Impl2008);
            	    rule__Project__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Project__Group_4__3__Impl"


    // $ANTLR start "rule__Project__Group_4_3__0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1003:1: rule__Project__Group_4_3__0 : rule__Project__Group_4_3__0__Impl rule__Project__Group_4_3__1 ;
    public final void rule__Project__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1007:1: ( rule__Project__Group_4_3__0__Impl rule__Project__Group_4_3__1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1008:2: rule__Project__Group_4_3__0__Impl rule__Project__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_4_3__0__Impl_in_rule__Project__Group_4_3__02047);
            rule__Project__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_4_3__1_in_rule__Project__Group_4_3__02050);
            rule__Project__Group_4_3__1();

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
    // $ANTLR end "rule__Project__Group_4_3__0"


    // $ANTLR start "rule__Project__Group_4_3__0__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1015:1: rule__Project__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Project__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1019:1: ( ( ',' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1020:1: ( ',' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1020:1: ( ',' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1021:1: ','
            {
             before(grammarAccess.getProjectAccess().getCommaKeyword_4_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Project__Group_4_3__0__Impl2078); 
             after(grammarAccess.getProjectAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Project__Group_4_3__0__Impl"


    // $ANTLR start "rule__Project__Group_4_3__1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1034:1: rule__Project__Group_4_3__1 : rule__Project__Group_4_3__1__Impl ;
    public final void rule__Project__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1038:1: ( rule__Project__Group_4_3__1__Impl )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1039:2: rule__Project__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_4_3__1__Impl_in_rule__Project__Group_4_3__12109);
            rule__Project__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Project__Group_4_3__1"


    // $ANTLR start "rule__Project__Group_4_3__1__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1045:1: rule__Project__Group_4_3__1__Impl : ( ( rule__Project__RolesAssignment_4_3_1 ) ) ;
    public final void rule__Project__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1049:1: ( ( ( rule__Project__RolesAssignment_4_3_1 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1050:1: ( ( rule__Project__RolesAssignment_4_3_1 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1050:1: ( ( rule__Project__RolesAssignment_4_3_1 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1051:1: ( rule__Project__RolesAssignment_4_3_1 )
            {
             before(grammarAccess.getProjectAccess().getRolesAssignment_4_3_1()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1052:1: ( rule__Project__RolesAssignment_4_3_1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1052:2: rule__Project__RolesAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__RolesAssignment_4_3_1_in_rule__Project__Group_4_3__1__Impl2136);
            rule__Project__RolesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getRolesAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Project__Group_4_3__1__Impl"


    // $ANTLR start "rule__Project__Group_5__0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1066:1: rule__Project__Group_5__0 : rule__Project__Group_5__0__Impl rule__Project__Group_5__1 ;
    public final void rule__Project__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1070:1: ( rule__Project__Group_5__0__Impl rule__Project__Group_5__1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1071:2: rule__Project__Group_5__0__Impl rule__Project__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_5__0__Impl_in_rule__Project__Group_5__02170);
            rule__Project__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_5__1_in_rule__Project__Group_5__02173);
            rule__Project__Group_5__1();

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
    // $ANTLR end "rule__Project__Group_5__0"


    // $ANTLR start "rule__Project__Group_5__0__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1078:1: rule__Project__Group_5__0__Impl : ( 'Deadlines' ) ;
    public final void rule__Project__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1082:1: ( ( 'Deadlines' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1083:1: ( 'Deadlines' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1083:1: ( 'Deadlines' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1084:1: 'Deadlines'
            {
             before(grammarAccess.getProjectAccess().getDeadlinesKeyword_5_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Project__Group_5__0__Impl2201); 
             after(grammarAccess.getProjectAccess().getDeadlinesKeyword_5_0()); 

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
    // $ANTLR end "rule__Project__Group_5__0__Impl"


    // $ANTLR start "rule__Project__Group_5__1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1097:1: rule__Project__Group_5__1 : rule__Project__Group_5__1__Impl rule__Project__Group_5__2 ;
    public final void rule__Project__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1101:1: ( rule__Project__Group_5__1__Impl rule__Project__Group_5__2 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1102:2: rule__Project__Group_5__1__Impl rule__Project__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_5__1__Impl_in_rule__Project__Group_5__12232);
            rule__Project__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_5__2_in_rule__Project__Group_5__12235);
            rule__Project__Group_5__2();

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
    // $ANTLR end "rule__Project__Group_5__1"


    // $ANTLR start "rule__Project__Group_5__1__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1109:1: rule__Project__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Project__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1113:1: ( ( ':' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1114:1: ( ':' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1114:1: ( ':' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1115:1: ':'
            {
             before(grammarAccess.getProjectAccess().getColonKeyword_5_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Project__Group_5__1__Impl2263); 
             after(grammarAccess.getProjectAccess().getColonKeyword_5_1()); 

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
    // $ANTLR end "rule__Project__Group_5__1__Impl"


    // $ANTLR start "rule__Project__Group_5__2"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1128:1: rule__Project__Group_5__2 : rule__Project__Group_5__2__Impl rule__Project__Group_5__3 ;
    public final void rule__Project__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1132:1: ( rule__Project__Group_5__2__Impl rule__Project__Group_5__3 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1133:2: rule__Project__Group_5__2__Impl rule__Project__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_5__2__Impl_in_rule__Project__Group_5__22294);
            rule__Project__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_5__3_in_rule__Project__Group_5__22297);
            rule__Project__Group_5__3();

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
    // $ANTLR end "rule__Project__Group_5__2"


    // $ANTLR start "rule__Project__Group_5__2__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1140:1: rule__Project__Group_5__2__Impl : ( ( rule__Project__DeadlinesAssignment_5_2 ) ) ;
    public final void rule__Project__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1144:1: ( ( ( rule__Project__DeadlinesAssignment_5_2 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1145:1: ( ( rule__Project__DeadlinesAssignment_5_2 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1145:1: ( ( rule__Project__DeadlinesAssignment_5_2 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1146:1: ( rule__Project__DeadlinesAssignment_5_2 )
            {
             before(grammarAccess.getProjectAccess().getDeadlinesAssignment_5_2()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1147:1: ( rule__Project__DeadlinesAssignment_5_2 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1147:2: rule__Project__DeadlinesAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__DeadlinesAssignment_5_2_in_rule__Project__Group_5__2__Impl2324);
            rule__Project__DeadlinesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getDeadlinesAssignment_5_2()); 

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
    // $ANTLR end "rule__Project__Group_5__2__Impl"


    // $ANTLR start "rule__Project__Group_5__3"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1157:1: rule__Project__Group_5__3 : rule__Project__Group_5__3__Impl ;
    public final void rule__Project__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1161:1: ( rule__Project__Group_5__3__Impl )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1162:2: rule__Project__Group_5__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_5__3__Impl_in_rule__Project__Group_5__32354);
            rule__Project__Group_5__3__Impl();

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
    // $ANTLR end "rule__Project__Group_5__3"


    // $ANTLR start "rule__Project__Group_5__3__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1168:1: rule__Project__Group_5__3__Impl : ( ( rule__Project__Group_5_3__0 )* ) ;
    public final void rule__Project__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1172:1: ( ( ( rule__Project__Group_5_3__0 )* ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1173:1: ( ( rule__Project__Group_5_3__0 )* )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1173:1: ( ( rule__Project__Group_5_3__0 )* )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1174:1: ( rule__Project__Group_5_3__0 )*
            {
             before(grammarAccess.getProjectAccess().getGroup_5_3()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1175:1: ( rule__Project__Group_5_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1175:2: rule__Project__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Project__Group_5_3__0_in_rule__Project__Group_5__3__Impl2381);
            	    rule__Project__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Project__Group_5__3__Impl"


    // $ANTLR start "rule__Project__Group_5_3__0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1193:1: rule__Project__Group_5_3__0 : rule__Project__Group_5_3__0__Impl rule__Project__Group_5_3__1 ;
    public final void rule__Project__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1197:1: ( rule__Project__Group_5_3__0__Impl rule__Project__Group_5_3__1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1198:2: rule__Project__Group_5_3__0__Impl rule__Project__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_5_3__0__Impl_in_rule__Project__Group_5_3__02420);
            rule__Project__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_5_3__1_in_rule__Project__Group_5_3__02423);
            rule__Project__Group_5_3__1();

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
    // $ANTLR end "rule__Project__Group_5_3__0"


    // $ANTLR start "rule__Project__Group_5_3__0__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1205:1: rule__Project__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Project__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1209:1: ( ( ',' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1210:1: ( ',' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1210:1: ( ',' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1211:1: ','
            {
             before(grammarAccess.getProjectAccess().getCommaKeyword_5_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Project__Group_5_3__0__Impl2451); 
             after(grammarAccess.getProjectAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Project__Group_5_3__0__Impl"


    // $ANTLR start "rule__Project__Group_5_3__1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1224:1: rule__Project__Group_5_3__1 : rule__Project__Group_5_3__1__Impl ;
    public final void rule__Project__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1228:1: ( rule__Project__Group_5_3__1__Impl )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1229:2: rule__Project__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_5_3__1__Impl_in_rule__Project__Group_5_3__12482);
            rule__Project__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Project__Group_5_3__1"


    // $ANTLR start "rule__Project__Group_5_3__1__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1235:1: rule__Project__Group_5_3__1__Impl : ( ( rule__Project__DeadlinesAssignment_5_3_1 ) ) ;
    public final void rule__Project__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1239:1: ( ( ( rule__Project__DeadlinesAssignment_5_3_1 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1240:1: ( ( rule__Project__DeadlinesAssignment_5_3_1 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1240:1: ( ( rule__Project__DeadlinesAssignment_5_3_1 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1241:1: ( rule__Project__DeadlinesAssignment_5_3_1 )
            {
             before(grammarAccess.getProjectAccess().getDeadlinesAssignment_5_3_1()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1242:1: ( rule__Project__DeadlinesAssignment_5_3_1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1242:2: rule__Project__DeadlinesAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__DeadlinesAssignment_5_3_1_in_rule__Project__Group_5_3__1__Impl2509);
            rule__Project__DeadlinesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getDeadlinesAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Project__Group_5_3__1__Impl"


    // $ANTLR start "rule__Project__Group_6__0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1256:1: rule__Project__Group_6__0 : rule__Project__Group_6__0__Impl rule__Project__Group_6__1 ;
    public final void rule__Project__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1260:1: ( rule__Project__Group_6__0__Impl rule__Project__Group_6__1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1261:2: rule__Project__Group_6__0__Impl rule__Project__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_6__0__Impl_in_rule__Project__Group_6__02543);
            rule__Project__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_6__1_in_rule__Project__Group_6__02546);
            rule__Project__Group_6__1();

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
    // $ANTLR end "rule__Project__Group_6__0"


    // $ANTLR start "rule__Project__Group_6__0__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1268:1: rule__Project__Group_6__0__Impl : ( 'Strategies' ) ;
    public final void rule__Project__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1272:1: ( ( 'Strategies' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1273:1: ( 'Strategies' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1273:1: ( 'Strategies' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1274:1: 'Strategies'
            {
             before(grammarAccess.getProjectAccess().getStrategiesKeyword_6_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Project__Group_6__0__Impl2574); 
             after(grammarAccess.getProjectAccess().getStrategiesKeyword_6_0()); 

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
    // $ANTLR end "rule__Project__Group_6__0__Impl"


    // $ANTLR start "rule__Project__Group_6__1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1287:1: rule__Project__Group_6__1 : rule__Project__Group_6__1__Impl rule__Project__Group_6__2 ;
    public final void rule__Project__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1291:1: ( rule__Project__Group_6__1__Impl rule__Project__Group_6__2 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1292:2: rule__Project__Group_6__1__Impl rule__Project__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_6__1__Impl_in_rule__Project__Group_6__12605);
            rule__Project__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_6__2_in_rule__Project__Group_6__12608);
            rule__Project__Group_6__2();

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
    // $ANTLR end "rule__Project__Group_6__1"


    // $ANTLR start "rule__Project__Group_6__1__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1299:1: rule__Project__Group_6__1__Impl : ( ':' ) ;
    public final void rule__Project__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1303:1: ( ( ':' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1304:1: ( ':' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1304:1: ( ':' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1305:1: ':'
            {
             before(grammarAccess.getProjectAccess().getColonKeyword_6_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Project__Group_6__1__Impl2636); 
             after(grammarAccess.getProjectAccess().getColonKeyword_6_1()); 

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
    // $ANTLR end "rule__Project__Group_6__1__Impl"


    // $ANTLR start "rule__Project__Group_6__2"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1318:1: rule__Project__Group_6__2 : rule__Project__Group_6__2__Impl rule__Project__Group_6__3 ;
    public final void rule__Project__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1322:1: ( rule__Project__Group_6__2__Impl rule__Project__Group_6__3 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1323:2: rule__Project__Group_6__2__Impl rule__Project__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_6__2__Impl_in_rule__Project__Group_6__22667);
            rule__Project__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_6__3_in_rule__Project__Group_6__22670);
            rule__Project__Group_6__3();

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
    // $ANTLR end "rule__Project__Group_6__2"


    // $ANTLR start "rule__Project__Group_6__2__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1330:1: rule__Project__Group_6__2__Impl : ( ( rule__Project__StrategiesAssignment_6_2 ) ) ;
    public final void rule__Project__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1334:1: ( ( ( rule__Project__StrategiesAssignment_6_2 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1335:1: ( ( rule__Project__StrategiesAssignment_6_2 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1335:1: ( ( rule__Project__StrategiesAssignment_6_2 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1336:1: ( rule__Project__StrategiesAssignment_6_2 )
            {
             before(grammarAccess.getProjectAccess().getStrategiesAssignment_6_2()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1337:1: ( rule__Project__StrategiesAssignment_6_2 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1337:2: rule__Project__StrategiesAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__StrategiesAssignment_6_2_in_rule__Project__Group_6__2__Impl2697);
            rule__Project__StrategiesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getStrategiesAssignment_6_2()); 

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
    // $ANTLR end "rule__Project__Group_6__2__Impl"


    // $ANTLR start "rule__Project__Group_6__3"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1347:1: rule__Project__Group_6__3 : rule__Project__Group_6__3__Impl ;
    public final void rule__Project__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1351:1: ( rule__Project__Group_6__3__Impl )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1352:2: rule__Project__Group_6__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_6__3__Impl_in_rule__Project__Group_6__32727);
            rule__Project__Group_6__3__Impl();

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
    // $ANTLR end "rule__Project__Group_6__3"


    // $ANTLR start "rule__Project__Group_6__3__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1358:1: rule__Project__Group_6__3__Impl : ( ( rule__Project__Group_6_3__0 )* ) ;
    public final void rule__Project__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1362:1: ( ( ( rule__Project__Group_6_3__0 )* ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1363:1: ( ( rule__Project__Group_6_3__0 )* )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1363:1: ( ( rule__Project__Group_6_3__0 )* )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1364:1: ( rule__Project__Group_6_3__0 )*
            {
             before(grammarAccess.getProjectAccess().getGroup_6_3()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1365:1: ( rule__Project__Group_6_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1365:2: rule__Project__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Project__Group_6_3__0_in_rule__Project__Group_6__3__Impl2754);
            	    rule__Project__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__Project__Group_6__3__Impl"


    // $ANTLR start "rule__Project__Group_6_3__0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1383:1: rule__Project__Group_6_3__0 : rule__Project__Group_6_3__0__Impl rule__Project__Group_6_3__1 ;
    public final void rule__Project__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1387:1: ( rule__Project__Group_6_3__0__Impl rule__Project__Group_6_3__1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1388:2: rule__Project__Group_6_3__0__Impl rule__Project__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_6_3__0__Impl_in_rule__Project__Group_6_3__02793);
            rule__Project__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_6_3__1_in_rule__Project__Group_6_3__02796);
            rule__Project__Group_6_3__1();

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
    // $ANTLR end "rule__Project__Group_6_3__0"


    // $ANTLR start "rule__Project__Group_6_3__0__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1395:1: rule__Project__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Project__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1399:1: ( ( ',' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1400:1: ( ',' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1400:1: ( ',' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1401:1: ','
            {
             before(grammarAccess.getProjectAccess().getCommaKeyword_6_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Project__Group_6_3__0__Impl2824); 
             after(grammarAccess.getProjectAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__Project__Group_6_3__0__Impl"


    // $ANTLR start "rule__Project__Group_6_3__1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1414:1: rule__Project__Group_6_3__1 : rule__Project__Group_6_3__1__Impl ;
    public final void rule__Project__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1418:1: ( rule__Project__Group_6_3__1__Impl )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1419:2: rule__Project__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_6_3__1__Impl_in_rule__Project__Group_6_3__12855);
            rule__Project__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__Project__Group_6_3__1"


    // $ANTLR start "rule__Project__Group_6_3__1__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1425:1: rule__Project__Group_6_3__1__Impl : ( ( rule__Project__StrategiesAssignment_6_3_1 ) ) ;
    public final void rule__Project__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1429:1: ( ( ( rule__Project__StrategiesAssignment_6_3_1 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1430:1: ( ( rule__Project__StrategiesAssignment_6_3_1 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1430:1: ( ( rule__Project__StrategiesAssignment_6_3_1 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1431:1: ( rule__Project__StrategiesAssignment_6_3_1 )
            {
             before(grammarAccess.getProjectAccess().getStrategiesAssignment_6_3_1()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1432:1: ( rule__Project__StrategiesAssignment_6_3_1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1432:2: rule__Project__StrategiesAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__StrategiesAssignment_6_3_1_in_rule__Project__Group_6_3__1__Impl2882);
            rule__Project__StrategiesAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getStrategiesAssignment_6_3_1()); 

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
    // $ANTLR end "rule__Project__Group_6_3__1__Impl"


    // $ANTLR start "rule__Majority__Group__0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1446:1: rule__Majority__Group__0 : rule__Majority__Group__0__Impl rule__Majority__Group__1 ;
    public final void rule__Majority__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1450:1: ( rule__Majority__Group__0__Impl rule__Majority__Group__1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1451:2: rule__Majority__Group__0__Impl rule__Majority__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__0__Impl_in_rule__Majority__Group__02916);
            rule__Majority__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__1_in_rule__Majority__Group__02919);
            rule__Majority__Group__1();

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
    // $ANTLR end "rule__Majority__Group__0"


    // $ANTLR start "rule__Majority__Group__0__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1458:1: rule__Majority__Group__0__Impl : ( ( rule__Majority__NameAssignment_0 ) ) ;
    public final void rule__Majority__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1462:1: ( ( ( rule__Majority__NameAssignment_0 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1463:1: ( ( rule__Majority__NameAssignment_0 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1463:1: ( ( rule__Majority__NameAssignment_0 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1464:1: ( rule__Majority__NameAssignment_0 )
            {
             before(grammarAccess.getMajorityAccess().getNameAssignment_0()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1465:1: ( rule__Majority__NameAssignment_0 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1465:2: rule__Majority__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__NameAssignment_0_in_rule__Majority__Group__0__Impl2946);
            rule__Majority__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMajorityAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Majority__Group__0__Impl"


    // $ANTLR start "rule__Majority__Group__1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1475:1: rule__Majority__Group__1 : rule__Majority__Group__1__Impl rule__Majority__Group__2 ;
    public final void rule__Majority__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1479:1: ( rule__Majority__Group__1__Impl rule__Majority__Group__2 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1480:2: rule__Majority__Group__1__Impl rule__Majority__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__1__Impl_in_rule__Majority__Group__12976);
            rule__Majority__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__2_in_rule__Majority__Group__12979);
            rule__Majority__Group__2();

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
    // $ANTLR end "rule__Majority__Group__1"


    // $ANTLR start "rule__Majority__Group__1__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1487:1: rule__Majority__Group__1__Impl : ( ':' ) ;
    public final void rule__Majority__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1491:1: ( ( ':' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1492:1: ( ':' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1492:1: ( ':' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1493:1: ':'
            {
             before(grammarAccess.getMajorityAccess().getColonKeyword_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Majority__Group__1__Impl3007); 
             after(grammarAccess.getMajorityAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Majority__Group__1__Impl"


    // $ANTLR start "rule__Majority__Group__2"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1506:1: rule__Majority__Group__2 : rule__Majority__Group__2__Impl rule__Majority__Group__3 ;
    public final void rule__Majority__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1510:1: ( rule__Majority__Group__2__Impl rule__Majority__Group__3 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1511:2: rule__Majority__Group__2__Impl rule__Majority__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__2__Impl_in_rule__Majority__Group__23038);
            rule__Majority__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__3_in_rule__Majority__Group__23041);
            rule__Majority__Group__3();

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
    // $ANTLR end "rule__Majority__Group__2"


    // $ANTLR start "rule__Majority__Group__2__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1518:1: rule__Majority__Group__2__Impl : ( 'Majority' ) ;
    public final void rule__Majority__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1522:1: ( ( 'Majority' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1523:1: ( 'Majority' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1523:1: ( 'Majority' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1524:1: 'Majority'
            {
             before(grammarAccess.getMajorityAccess().getMajorityKeyword_2()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Majority__Group__2__Impl3069); 
             after(grammarAccess.getMajorityAccess().getMajorityKeyword_2()); 

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
    // $ANTLR end "rule__Majority__Group__2__Impl"


    // $ANTLR start "rule__Majority__Group__3"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1537:1: rule__Majority__Group__3 : rule__Majority__Group__3__Impl rule__Majority__Group__4 ;
    public final void rule__Majority__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1541:1: ( rule__Majority__Group__3__Impl rule__Majority__Group__4 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1542:2: rule__Majority__Group__3__Impl rule__Majority__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__3__Impl_in_rule__Majority__Group__33100);
            rule__Majority__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__4_in_rule__Majority__Group__33103);
            rule__Majority__Group__4();

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
    // $ANTLR end "rule__Majority__Group__3"


    // $ANTLR start "rule__Majority__Group__3__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1549:1: rule__Majority__Group__3__Impl : ( '{' ) ;
    public final void rule__Majority__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1553:1: ( ( '{' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1554:1: ( '{' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1554:1: ( '{' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1555:1: '{'
            {
             before(grammarAccess.getMajorityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Majority__Group__3__Impl3131); 
             after(grammarAccess.getMajorityAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Majority__Group__3__Impl"


    // $ANTLR start "rule__Majority__Group__4"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1568:1: rule__Majority__Group__4 : rule__Majority__Group__4__Impl rule__Majority__Group__5 ;
    public final void rule__Majority__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1572:1: ( rule__Majority__Group__4__Impl rule__Majority__Group__5 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1573:2: rule__Majority__Group__4__Impl rule__Majority__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__4__Impl_in_rule__Majority__Group__43162);
            rule__Majority__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__5_in_rule__Majority__Group__43165);
            rule__Majority__Group__5();

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
    // $ANTLR end "rule__Majority__Group__4"


    // $ANTLR start "rule__Majority__Group__4__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1580:1: rule__Majority__Group__4__Impl : ( 'applied to' ) ;
    public final void rule__Majority__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1584:1: ( ( 'applied to' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1585:1: ( 'applied to' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1585:1: ( 'applied to' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1586:1: 'applied to'
            {
             before(grammarAccess.getMajorityAccess().getAppliedToKeyword_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Majority__Group__4__Impl3193); 
             after(grammarAccess.getMajorityAccess().getAppliedToKeyword_4()); 

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
    // $ANTLR end "rule__Majority__Group__4__Impl"


    // $ANTLR start "rule__Majority__Group__5"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1599:1: rule__Majority__Group__5 : rule__Majority__Group__5__Impl rule__Majority__Group__6 ;
    public final void rule__Majority__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1603:1: ( rule__Majority__Group__5__Impl rule__Majority__Group__6 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1604:2: rule__Majority__Group__5__Impl rule__Majority__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__5__Impl_in_rule__Majority__Group__53224);
            rule__Majority__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__6_in_rule__Majority__Group__53227);
            rule__Majority__Group__6();

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
    // $ANTLR end "rule__Majority__Group__5"


    // $ANTLR start "rule__Majority__Group__5__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1611:1: rule__Majority__Group__5__Impl : ( ( rule__Majority__AppliedToAssignment_5 ) ) ;
    public final void rule__Majority__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1615:1: ( ( ( rule__Majority__AppliedToAssignment_5 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1616:1: ( ( rule__Majority__AppliedToAssignment_5 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1616:1: ( ( rule__Majority__AppliedToAssignment_5 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1617:1: ( rule__Majority__AppliedToAssignment_5 )
            {
             before(grammarAccess.getMajorityAccess().getAppliedToAssignment_5()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1618:1: ( rule__Majority__AppliedToAssignment_5 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1618:2: rule__Majority__AppliedToAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__AppliedToAssignment_5_in_rule__Majority__Group__5__Impl3254);
            rule__Majority__AppliedToAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMajorityAccess().getAppliedToAssignment_5()); 

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
    // $ANTLR end "rule__Majority__Group__5__Impl"


    // $ANTLR start "rule__Majority__Group__6"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1628:1: rule__Majority__Group__6 : rule__Majority__Group__6__Impl rule__Majority__Group__7 ;
    public final void rule__Majority__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1632:1: ( rule__Majority__Group__6__Impl rule__Majority__Group__7 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1633:2: rule__Majority__Group__6__Impl rule__Majority__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__6__Impl_in_rule__Majority__Group__63284);
            rule__Majority__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__7_in_rule__Majority__Group__63287);
            rule__Majority__Group__7();

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
    // $ANTLR end "rule__Majority__Group__6"


    // $ANTLR start "rule__Majority__Group__6__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1640:1: rule__Majority__Group__6__Impl : ( ( rule__Majority__Group_6__0 )? ) ;
    public final void rule__Majority__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1644:1: ( ( ( rule__Majority__Group_6__0 )? ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1645:1: ( ( rule__Majority__Group_6__0 )? )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1645:1: ( ( rule__Majority__Group_6__0 )? )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1646:1: ( rule__Majority__Group_6__0 )?
            {
             before(grammarAccess.getMajorityAccess().getGroup_6()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1647:1: ( rule__Majority__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1647:2: rule__Majority__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_6__0_in_rule__Majority__Group__6__Impl3314);
                    rule__Majority__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMajorityAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Majority__Group__6__Impl"


    // $ANTLR start "rule__Majority__Group__7"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1657:1: rule__Majority__Group__7 : rule__Majority__Group__7__Impl rule__Majority__Group__8 ;
    public final void rule__Majority__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1661:1: ( rule__Majority__Group__7__Impl rule__Majority__Group__8 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1662:2: rule__Majority__Group__7__Impl rule__Majority__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__7__Impl_in_rule__Majority__Group__73345);
            rule__Majority__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__8_in_rule__Majority__Group__73348);
            rule__Majority__Group__8();

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
    // $ANTLR end "rule__Majority__Group__7"


    // $ANTLR start "rule__Majority__Group__7__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1669:1: rule__Majority__Group__7__Impl : ( 'people' ) ;
    public final void rule__Majority__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1673:1: ( ( 'people' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1674:1: ( 'people' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1674:1: ( 'people' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1675:1: 'people'
            {
             before(grammarAccess.getMajorityAccess().getPeopleKeyword_7()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Majority__Group__7__Impl3376); 
             after(grammarAccess.getMajorityAccess().getPeopleKeyword_7()); 

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
    // $ANTLR end "rule__Majority__Group__7__Impl"


    // $ANTLR start "rule__Majority__Group__8"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1688:1: rule__Majority__Group__8 : rule__Majority__Group__8__Impl rule__Majority__Group__9 ;
    public final void rule__Majority__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1692:1: ( rule__Majority__Group__8__Impl rule__Majority__Group__9 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1693:2: rule__Majority__Group__8__Impl rule__Majority__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__8__Impl_in_rule__Majority__Group__83407);
            rule__Majority__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__9_in_rule__Majority__Group__83410);
            rule__Majority__Group__9();

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
    // $ANTLR end "rule__Majority__Group__8"


    // $ANTLR start "rule__Majority__Group__8__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1700:1: rule__Majority__Group__8__Impl : ( ( rule__Majority__PeopleAssignment_8 ) ) ;
    public final void rule__Majority__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1704:1: ( ( ( rule__Majority__PeopleAssignment_8 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1705:1: ( ( rule__Majority__PeopleAssignment_8 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1705:1: ( ( rule__Majority__PeopleAssignment_8 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1706:1: ( rule__Majority__PeopleAssignment_8 )
            {
             before(grammarAccess.getMajorityAccess().getPeopleAssignment_8()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1707:1: ( rule__Majority__PeopleAssignment_8 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1707:2: rule__Majority__PeopleAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__PeopleAssignment_8_in_rule__Majority__Group__8__Impl3437);
            rule__Majority__PeopleAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getMajorityAccess().getPeopleAssignment_8()); 

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
    // $ANTLR end "rule__Majority__Group__8__Impl"


    // $ANTLR start "rule__Majority__Group__9"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1717:1: rule__Majority__Group__9 : rule__Majority__Group__9__Impl rule__Majority__Group__10 ;
    public final void rule__Majority__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1721:1: ( rule__Majority__Group__9__Impl rule__Majority__Group__10 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1722:2: rule__Majority__Group__9__Impl rule__Majority__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__9__Impl_in_rule__Majority__Group__93467);
            rule__Majority__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__10_in_rule__Majority__Group__93470);
            rule__Majority__Group__10();

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
    // $ANTLR end "rule__Majority__Group__9"


    // $ANTLR start "rule__Majority__Group__9__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1729:1: rule__Majority__Group__9__Impl : ( ( rule__Majority__Group_9__0 )* ) ;
    public final void rule__Majority__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1733:1: ( ( ( rule__Majority__Group_9__0 )* ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1734:1: ( ( rule__Majority__Group_9__0 )* )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1734:1: ( ( rule__Majority__Group_9__0 )* )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1735:1: ( rule__Majority__Group_9__0 )*
            {
             before(grammarAccess.getMajorityAccess().getGroup_9()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1736:1: ( rule__Majority__Group_9__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1736:2: rule__Majority__Group_9__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_9__0_in_rule__Majority__Group__9__Impl3497);
            	    rule__Majority__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMajorityAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Majority__Group__9__Impl"


    // $ANTLR start "rule__Majority__Group__10"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1746:1: rule__Majority__Group__10 : rule__Majority__Group__10__Impl rule__Majority__Group__11 ;
    public final void rule__Majority__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1750:1: ( rule__Majority__Group__10__Impl rule__Majority__Group__11 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1751:2: rule__Majority__Group__10__Impl rule__Majority__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__10__Impl_in_rule__Majority__Group__103528);
            rule__Majority__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__11_in_rule__Majority__Group__103531);
            rule__Majority__Group__11();

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
    // $ANTLR end "rule__Majority__Group__10"


    // $ANTLR start "rule__Majority__Group__10__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1758:1: rule__Majority__Group__10__Impl : ( 'range' ) ;
    public final void rule__Majority__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1762:1: ( ( 'range' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1763:1: ( 'range' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1763:1: ( 'range' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1764:1: 'range'
            {
             before(grammarAccess.getMajorityAccess().getRangeKeyword_10()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Majority__Group__10__Impl3559); 
             after(grammarAccess.getMajorityAccess().getRangeKeyword_10()); 

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
    // $ANTLR end "rule__Majority__Group__10__Impl"


    // $ANTLR start "rule__Majority__Group__11"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1777:1: rule__Majority__Group__11 : rule__Majority__Group__11__Impl rule__Majority__Group__12 ;
    public final void rule__Majority__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1781:1: ( rule__Majority__Group__11__Impl rule__Majority__Group__12 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1782:2: rule__Majority__Group__11__Impl rule__Majority__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__11__Impl_in_rule__Majority__Group__113590);
            rule__Majority__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__12_in_rule__Majority__Group__113593);
            rule__Majority__Group__12();

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
    // $ANTLR end "rule__Majority__Group__11"


    // $ANTLR start "rule__Majority__Group__11__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1789:1: rule__Majority__Group__11__Impl : ( ( rule__Majority__RangeAssignment_11 ) ) ;
    public final void rule__Majority__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1793:1: ( ( ( rule__Majority__RangeAssignment_11 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1794:1: ( ( rule__Majority__RangeAssignment_11 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1794:1: ( ( rule__Majority__RangeAssignment_11 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1795:1: ( rule__Majority__RangeAssignment_11 )
            {
             before(grammarAccess.getMajorityAccess().getRangeAssignment_11()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1796:1: ( rule__Majority__RangeAssignment_11 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1796:2: rule__Majority__RangeAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__RangeAssignment_11_in_rule__Majority__Group__11__Impl3620);
            rule__Majority__RangeAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getMajorityAccess().getRangeAssignment_11()); 

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
    // $ANTLR end "rule__Majority__Group__11__Impl"


    // $ANTLR start "rule__Majority__Group__12"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1806:1: rule__Majority__Group__12 : rule__Majority__Group__12__Impl rule__Majority__Group__13 ;
    public final void rule__Majority__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1810:1: ( rule__Majority__Group__12__Impl rule__Majority__Group__13 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1811:2: rule__Majority__Group__12__Impl rule__Majority__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__12__Impl_in_rule__Majority__Group__123650);
            rule__Majority__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__13_in_rule__Majority__Group__123653);
            rule__Majority__Group__13();

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
    // $ANTLR end "rule__Majority__Group__12"


    // $ANTLR start "rule__Majority__Group__12__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1818:1: rule__Majority__Group__12__Impl : ( ( rule__Majority__Group_12__0 )? ) ;
    public final void rule__Majority__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1822:1: ( ( ( rule__Majority__Group_12__0 )? ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1823:1: ( ( rule__Majority__Group_12__0 )? )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1823:1: ( ( rule__Majority__Group_12__0 )? )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1824:1: ( rule__Majority__Group_12__0 )?
            {
             before(grammarAccess.getMajorityAccess().getGroup_12()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1825:1: ( rule__Majority__Group_12__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1825:2: rule__Majority__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_12__0_in_rule__Majority__Group__12__Impl3680);
                    rule__Majority__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMajorityAccess().getGroup_12()); 

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
    // $ANTLR end "rule__Majority__Group__12__Impl"


    // $ANTLR start "rule__Majority__Group__13"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1835:1: rule__Majority__Group__13 : rule__Majority__Group__13__Impl rule__Majority__Group__14 ;
    public final void rule__Majority__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1839:1: ( rule__Majority__Group__13__Impl rule__Majority__Group__14 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1840:2: rule__Majority__Group__13__Impl rule__Majority__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__13__Impl_in_rule__Majority__Group__133711);
            rule__Majority__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__14_in_rule__Majority__Group__133714);
            rule__Majority__Group__14();

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
    // $ANTLR end "rule__Majority__Group__13"


    // $ANTLR start "rule__Majority__Group__13__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1847:1: rule__Majority__Group__13__Impl : ( 'deadline' ) ;
    public final void rule__Majority__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1851:1: ( ( 'deadline' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1852:1: ( 'deadline' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1852:1: ( 'deadline' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1853:1: 'deadline'
            {
             before(grammarAccess.getMajorityAccess().getDeadlineKeyword_13()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Majority__Group__13__Impl3742); 
             after(grammarAccess.getMajorityAccess().getDeadlineKeyword_13()); 

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
    // $ANTLR end "rule__Majority__Group__13__Impl"


    // $ANTLR start "rule__Majority__Group__14"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1866:1: rule__Majority__Group__14 : rule__Majority__Group__14__Impl rule__Majority__Group__15 ;
    public final void rule__Majority__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1870:1: ( rule__Majority__Group__14__Impl rule__Majority__Group__15 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1871:2: rule__Majority__Group__14__Impl rule__Majority__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__14__Impl_in_rule__Majority__Group__143773);
            rule__Majority__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__15_in_rule__Majority__Group__143776);
            rule__Majority__Group__15();

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
    // $ANTLR end "rule__Majority__Group__14"


    // $ANTLR start "rule__Majority__Group__14__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1878:1: rule__Majority__Group__14__Impl : ( ( rule__Majority__DeadlineAssignment_14 ) ) ;
    public final void rule__Majority__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1882:1: ( ( ( rule__Majority__DeadlineAssignment_14 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1883:1: ( ( rule__Majority__DeadlineAssignment_14 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1883:1: ( ( rule__Majority__DeadlineAssignment_14 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1884:1: ( rule__Majority__DeadlineAssignment_14 )
            {
             before(grammarAccess.getMajorityAccess().getDeadlineAssignment_14()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1885:1: ( rule__Majority__DeadlineAssignment_14 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1885:2: rule__Majority__DeadlineAssignment_14
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__DeadlineAssignment_14_in_rule__Majority__Group__14__Impl3803);
            rule__Majority__DeadlineAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getMajorityAccess().getDeadlineAssignment_14()); 

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
    // $ANTLR end "rule__Majority__Group__14__Impl"


    // $ANTLR start "rule__Majority__Group__15"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1895:1: rule__Majority__Group__15 : rule__Majority__Group__15__Impl ;
    public final void rule__Majority__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1899:1: ( rule__Majority__Group__15__Impl )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1900:2: rule__Majority__Group__15__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__15__Impl_in_rule__Majority__Group__153833);
            rule__Majority__Group__15__Impl();

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
    // $ANTLR end "rule__Majority__Group__15"


    // $ANTLR start "rule__Majority__Group__15__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1906:1: rule__Majority__Group__15__Impl : ( '}' ) ;
    public final void rule__Majority__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1910:1: ( ( '}' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1911:1: ( '}' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1911:1: ( '}' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1912:1: '}'
            {
             before(grammarAccess.getMajorityAccess().getRightCurlyBracketKeyword_15()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Majority__Group__15__Impl3861); 
             after(grammarAccess.getMajorityAccess().getRightCurlyBracketKeyword_15()); 

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
    // $ANTLR end "rule__Majority__Group__15__Impl"


    // $ANTLR start "rule__Majority__Group_6__0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1957:1: rule__Majority__Group_6__0 : rule__Majority__Group_6__0__Impl rule__Majority__Group_6__1 ;
    public final void rule__Majority__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1961:1: ( rule__Majority__Group_6__0__Impl rule__Majority__Group_6__1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1962:2: rule__Majority__Group_6__0__Impl rule__Majority__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_6__0__Impl_in_rule__Majority__Group_6__03924);
            rule__Majority__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_6__1_in_rule__Majority__Group_6__03927);
            rule__Majority__Group_6__1();

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
    // $ANTLR end "rule__Majority__Group_6__0"


    // $ANTLR start "rule__Majority__Group_6__0__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1969:1: rule__Majority__Group_6__0__Impl : ( '(' ) ;
    public final void rule__Majority__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1973:1: ( ( '(' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1974:1: ( '(' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1974:1: ( '(' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1975:1: '('
            {
             before(grammarAccess.getMajorityAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Majority__Group_6__0__Impl3955); 
             after(grammarAccess.getMajorityAccess().getLeftParenthesisKeyword_6_0()); 

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
    // $ANTLR end "rule__Majority__Group_6__0__Impl"


    // $ANTLR start "rule__Majority__Group_6__1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1988:1: rule__Majority__Group_6__1 : rule__Majority__Group_6__1__Impl rule__Majority__Group_6__2 ;
    public final void rule__Majority__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1992:1: ( rule__Majority__Group_6__1__Impl rule__Majority__Group_6__2 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:1993:2: rule__Majority__Group_6__1__Impl rule__Majority__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_6__1__Impl_in_rule__Majority__Group_6__13986);
            rule__Majority__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_6__2_in_rule__Majority__Group_6__13989);
            rule__Majority__Group_6__2();

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
    // $ANTLR end "rule__Majority__Group_6__1"


    // $ANTLR start "rule__Majority__Group_6__1__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2000:1: rule__Majority__Group_6__1__Impl : ( ruleFilter ) ;
    public final void rule__Majority__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2004:1: ( ( ruleFilter ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2005:1: ( ruleFilter )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2005:1: ( ruleFilter )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2006:1: ruleFilter
            {
             before(grammarAccess.getMajorityAccess().getFilterParserRuleCall_6_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilter_in_rule__Majority__Group_6__1__Impl4016);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getMajorityAccess().getFilterParserRuleCall_6_1()); 

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
    // $ANTLR end "rule__Majority__Group_6__1__Impl"


    // $ANTLR start "rule__Majority__Group_6__2"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2017:1: rule__Majority__Group_6__2 : rule__Majority__Group_6__2__Impl ;
    public final void rule__Majority__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2021:1: ( rule__Majority__Group_6__2__Impl )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2022:2: rule__Majority__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_6__2__Impl_in_rule__Majority__Group_6__24045);
            rule__Majority__Group_6__2__Impl();

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
    // $ANTLR end "rule__Majority__Group_6__2"


    // $ANTLR start "rule__Majority__Group_6__2__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2028:1: rule__Majority__Group_6__2__Impl : ( ')' ) ;
    public final void rule__Majority__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2032:1: ( ( ')' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2033:1: ( ')' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2033:1: ( ')' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2034:1: ')'
            {
             before(grammarAccess.getMajorityAccess().getRightParenthesisKeyword_6_2()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Majority__Group_6__2__Impl4073); 
             after(grammarAccess.getMajorityAccess().getRightParenthesisKeyword_6_2()); 

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
    // $ANTLR end "rule__Majority__Group_6__2__Impl"


    // $ANTLR start "rule__Majority__Group_9__0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2053:1: rule__Majority__Group_9__0 : rule__Majority__Group_9__0__Impl rule__Majority__Group_9__1 ;
    public final void rule__Majority__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2057:1: ( rule__Majority__Group_9__0__Impl rule__Majority__Group_9__1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2058:2: rule__Majority__Group_9__0__Impl rule__Majority__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_9__0__Impl_in_rule__Majority__Group_9__04110);
            rule__Majority__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_9__1_in_rule__Majority__Group_9__04113);
            rule__Majority__Group_9__1();

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
    // $ANTLR end "rule__Majority__Group_9__0"


    // $ANTLR start "rule__Majority__Group_9__0__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2065:1: rule__Majority__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Majority__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2069:1: ( ( ',' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2070:1: ( ',' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2070:1: ( ',' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2071:1: ','
            {
             before(grammarAccess.getMajorityAccess().getCommaKeyword_9_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Majority__Group_9__0__Impl4141); 
             after(grammarAccess.getMajorityAccess().getCommaKeyword_9_0()); 

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
    // $ANTLR end "rule__Majority__Group_9__0__Impl"


    // $ANTLR start "rule__Majority__Group_9__1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2084:1: rule__Majority__Group_9__1 : rule__Majority__Group_9__1__Impl ;
    public final void rule__Majority__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2088:1: ( rule__Majority__Group_9__1__Impl )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2089:2: rule__Majority__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_9__1__Impl_in_rule__Majority__Group_9__14172);
            rule__Majority__Group_9__1__Impl();

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
    // $ANTLR end "rule__Majority__Group_9__1"


    // $ANTLR start "rule__Majority__Group_9__1__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2095:1: rule__Majority__Group_9__1__Impl : ( ( rule__Majority__PeopleAssignment_9_1 ) ) ;
    public final void rule__Majority__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2099:1: ( ( ( rule__Majority__PeopleAssignment_9_1 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2100:1: ( ( rule__Majority__PeopleAssignment_9_1 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2100:1: ( ( rule__Majority__PeopleAssignment_9_1 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2101:1: ( rule__Majority__PeopleAssignment_9_1 )
            {
             before(grammarAccess.getMajorityAccess().getPeopleAssignment_9_1()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2102:1: ( rule__Majority__PeopleAssignment_9_1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2102:2: rule__Majority__PeopleAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__PeopleAssignment_9_1_in_rule__Majority__Group_9__1__Impl4199);
            rule__Majority__PeopleAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getMajorityAccess().getPeopleAssignment_9_1()); 

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
    // $ANTLR end "rule__Majority__Group_9__1__Impl"


    // $ANTLR start "rule__Majority__Group_12__0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2116:1: rule__Majority__Group_12__0 : rule__Majority__Group_12__0__Impl rule__Majority__Group_12__1 ;
    public final void rule__Majority__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2120:1: ( rule__Majority__Group_12__0__Impl rule__Majority__Group_12__1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2121:2: rule__Majority__Group_12__0__Impl rule__Majority__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_12__0__Impl_in_rule__Majority__Group_12__04233);
            rule__Majority__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_12__1_in_rule__Majority__Group_12__04236);
            rule__Majority__Group_12__1();

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
    // $ANTLR end "rule__Majority__Group_12__0"


    // $ANTLR start "rule__Majority__Group_12__0__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2128:1: rule__Majority__Group_12__0__Impl : ( 'minVotes' ) ;
    public final void rule__Majority__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2132:1: ( ( 'minVotes' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2133:1: ( 'minVotes' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2133:1: ( 'minVotes' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2134:1: 'minVotes'
            {
             before(grammarAccess.getMajorityAccess().getMinVotesKeyword_12_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Majority__Group_12__0__Impl4264); 
             after(grammarAccess.getMajorityAccess().getMinVotesKeyword_12_0()); 

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
    // $ANTLR end "rule__Majority__Group_12__0__Impl"


    // $ANTLR start "rule__Majority__Group_12__1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2147:1: rule__Majority__Group_12__1 : rule__Majority__Group_12__1__Impl ;
    public final void rule__Majority__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2151:1: ( rule__Majority__Group_12__1__Impl )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2152:2: rule__Majority__Group_12__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_12__1__Impl_in_rule__Majority__Group_12__14295);
            rule__Majority__Group_12__1__Impl();

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
    // $ANTLR end "rule__Majority__Group_12__1"


    // $ANTLR start "rule__Majority__Group_12__1__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2158:1: rule__Majority__Group_12__1__Impl : ( ( rule__Majority__MinVotesAssignment_12_1 ) ) ;
    public final void rule__Majority__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2162:1: ( ( ( rule__Majority__MinVotesAssignment_12_1 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2163:1: ( ( rule__Majority__MinVotesAssignment_12_1 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2163:1: ( ( rule__Majority__MinVotesAssignment_12_1 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2164:1: ( rule__Majority__MinVotesAssignment_12_1 )
            {
             before(grammarAccess.getMajorityAccess().getMinVotesAssignment_12_1()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2165:1: ( rule__Majority__MinVotesAssignment_12_1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2165:2: rule__Majority__MinVotesAssignment_12_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__MinVotesAssignment_12_1_in_rule__Majority__Group_12__1__Impl4322);
            rule__Majority__MinVotesAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getMajorityAccess().getMinVotesAssignment_12_1()); 

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
    // $ANTLR end "rule__Majority__Group_12__1__Impl"


    // $ANTLR start "rule__RatioMajority__Group__0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2179:1: rule__RatioMajority__Group__0 : rule__RatioMajority__Group__0__Impl rule__RatioMajority__Group__1 ;
    public final void rule__RatioMajority__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2183:1: ( rule__RatioMajority__Group__0__Impl rule__RatioMajority__Group__1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2184:2: rule__RatioMajority__Group__0__Impl rule__RatioMajority__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__0__Impl_in_rule__RatioMajority__Group__04356);
            rule__RatioMajority__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__1_in_rule__RatioMajority__Group__04359);
            rule__RatioMajority__Group__1();

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
    // $ANTLR end "rule__RatioMajority__Group__0"


    // $ANTLR start "rule__RatioMajority__Group__0__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2191:1: rule__RatioMajority__Group__0__Impl : ( ( rule__RatioMajority__NameAssignment_0 ) ) ;
    public final void rule__RatioMajority__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2195:1: ( ( ( rule__RatioMajority__NameAssignment_0 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2196:1: ( ( rule__RatioMajority__NameAssignment_0 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2196:1: ( ( rule__RatioMajority__NameAssignment_0 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2197:1: ( rule__RatioMajority__NameAssignment_0 )
            {
             before(grammarAccess.getRatioMajorityAccess().getNameAssignment_0()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2198:1: ( rule__RatioMajority__NameAssignment_0 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2198:2: rule__RatioMajority__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__NameAssignment_0_in_rule__RatioMajority__Group__0__Impl4386);
            rule__RatioMajority__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRatioMajorityAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__RatioMajority__Group__0__Impl"


    // $ANTLR start "rule__RatioMajority__Group__1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2208:1: rule__RatioMajority__Group__1 : rule__RatioMajority__Group__1__Impl rule__RatioMajority__Group__2 ;
    public final void rule__RatioMajority__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2212:1: ( rule__RatioMajority__Group__1__Impl rule__RatioMajority__Group__2 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2213:2: rule__RatioMajority__Group__1__Impl rule__RatioMajority__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__1__Impl_in_rule__RatioMajority__Group__14416);
            rule__RatioMajority__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__2_in_rule__RatioMajority__Group__14419);
            rule__RatioMajority__Group__2();

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
    // $ANTLR end "rule__RatioMajority__Group__1"


    // $ANTLR start "rule__RatioMajority__Group__1__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2220:1: rule__RatioMajority__Group__1__Impl : ( ':' ) ;
    public final void rule__RatioMajority__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2224:1: ( ( ':' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2225:1: ( ':' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2225:1: ( ':' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2226:1: ':'
            {
             before(grammarAccess.getRatioMajorityAccess().getColonKeyword_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__RatioMajority__Group__1__Impl4447); 
             after(grammarAccess.getRatioMajorityAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__RatioMajority__Group__1__Impl"


    // $ANTLR start "rule__RatioMajority__Group__2"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2239:1: rule__RatioMajority__Group__2 : rule__RatioMajority__Group__2__Impl rule__RatioMajority__Group__3 ;
    public final void rule__RatioMajority__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2243:1: ( rule__RatioMajority__Group__2__Impl rule__RatioMajority__Group__3 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2244:2: rule__RatioMajority__Group__2__Impl rule__RatioMajority__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__2__Impl_in_rule__RatioMajority__Group__24478);
            rule__RatioMajority__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__3_in_rule__RatioMajority__Group__24481);
            rule__RatioMajority__Group__3();

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
    // $ANTLR end "rule__RatioMajority__Group__2"


    // $ANTLR start "rule__RatioMajority__Group__2__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2251:1: rule__RatioMajority__Group__2__Impl : ( 'Ratio' ) ;
    public final void rule__RatioMajority__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2255:1: ( ( 'Ratio' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2256:1: ( 'Ratio' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2256:1: ( 'Ratio' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2257:1: 'Ratio'
            {
             before(grammarAccess.getRatioMajorityAccess().getRatioKeyword_2()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__RatioMajority__Group__2__Impl4509); 
             after(grammarAccess.getRatioMajorityAccess().getRatioKeyword_2()); 

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
    // $ANTLR end "rule__RatioMajority__Group__2__Impl"


    // $ANTLR start "rule__RatioMajority__Group__3"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2270:1: rule__RatioMajority__Group__3 : rule__RatioMajority__Group__3__Impl rule__RatioMajority__Group__4 ;
    public final void rule__RatioMajority__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2274:1: ( rule__RatioMajority__Group__3__Impl rule__RatioMajority__Group__4 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2275:2: rule__RatioMajority__Group__3__Impl rule__RatioMajority__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__3__Impl_in_rule__RatioMajority__Group__34540);
            rule__RatioMajority__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__4_in_rule__RatioMajority__Group__34543);
            rule__RatioMajority__Group__4();

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
    // $ANTLR end "rule__RatioMajority__Group__3"


    // $ANTLR start "rule__RatioMajority__Group__3__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2282:1: rule__RatioMajority__Group__3__Impl : ( '{' ) ;
    public final void rule__RatioMajority__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2286:1: ( ( '{' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2287:1: ( '{' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2287:1: ( '{' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2288:1: '{'
            {
             before(grammarAccess.getRatioMajorityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__RatioMajority__Group__3__Impl4571); 
             after(grammarAccess.getRatioMajorityAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__RatioMajority__Group__3__Impl"


    // $ANTLR start "rule__RatioMajority__Group__4"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2301:1: rule__RatioMajority__Group__4 : rule__RatioMajority__Group__4__Impl rule__RatioMajority__Group__5 ;
    public final void rule__RatioMajority__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2305:1: ( rule__RatioMajority__Group__4__Impl rule__RatioMajority__Group__5 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2306:2: rule__RatioMajority__Group__4__Impl rule__RatioMajority__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__4__Impl_in_rule__RatioMajority__Group__44602);
            rule__RatioMajority__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__5_in_rule__RatioMajority__Group__44605);
            rule__RatioMajority__Group__5();

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
    // $ANTLR end "rule__RatioMajority__Group__4"


    // $ANTLR start "rule__RatioMajority__Group__4__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2313:1: rule__RatioMajority__Group__4__Impl : ( 'applied to' ) ;
    public final void rule__RatioMajority__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2317:1: ( ( 'applied to' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2318:1: ( 'applied to' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2318:1: ( 'applied to' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2319:1: 'applied to'
            {
             before(grammarAccess.getRatioMajorityAccess().getAppliedToKeyword_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__RatioMajority__Group__4__Impl4633); 
             after(grammarAccess.getRatioMajorityAccess().getAppliedToKeyword_4()); 

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
    // $ANTLR end "rule__RatioMajority__Group__4__Impl"


    // $ANTLR start "rule__RatioMajority__Group__5"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2332:1: rule__RatioMajority__Group__5 : rule__RatioMajority__Group__5__Impl rule__RatioMajority__Group__6 ;
    public final void rule__RatioMajority__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2336:1: ( rule__RatioMajority__Group__5__Impl rule__RatioMajority__Group__6 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2337:2: rule__RatioMajority__Group__5__Impl rule__RatioMajority__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__5__Impl_in_rule__RatioMajority__Group__54664);
            rule__RatioMajority__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__6_in_rule__RatioMajority__Group__54667);
            rule__RatioMajority__Group__6();

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
    // $ANTLR end "rule__RatioMajority__Group__5"


    // $ANTLR start "rule__RatioMajority__Group__5__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2344:1: rule__RatioMajority__Group__5__Impl : ( ( rule__RatioMajority__Alternatives_5 ) ) ;
    public final void rule__RatioMajority__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2348:1: ( ( ( rule__RatioMajority__Alternatives_5 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2349:1: ( ( rule__RatioMajority__Alternatives_5 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2349:1: ( ( rule__RatioMajority__Alternatives_5 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2350:1: ( rule__RatioMajority__Alternatives_5 )
            {
             before(grammarAccess.getRatioMajorityAccess().getAlternatives_5()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2351:1: ( rule__RatioMajority__Alternatives_5 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2351:2: rule__RatioMajority__Alternatives_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Alternatives_5_in_rule__RatioMajority__Group__5__Impl4694);
            rule__RatioMajority__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getRatioMajorityAccess().getAlternatives_5()); 

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
    // $ANTLR end "rule__RatioMajority__Group__5__Impl"


    // $ANTLR start "rule__RatioMajority__Group__6"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2361:1: rule__RatioMajority__Group__6 : rule__RatioMajority__Group__6__Impl rule__RatioMajority__Group__7 ;
    public final void rule__RatioMajority__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2365:1: ( rule__RatioMajority__Group__6__Impl rule__RatioMajority__Group__7 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2366:2: rule__RatioMajority__Group__6__Impl rule__RatioMajority__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__6__Impl_in_rule__RatioMajority__Group__64724);
            rule__RatioMajority__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__7_in_rule__RatioMajority__Group__64727);
            rule__RatioMajority__Group__7();

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
    // $ANTLR end "rule__RatioMajority__Group__6"


    // $ANTLR start "rule__RatioMajority__Group__6__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2373:1: rule__RatioMajority__Group__6__Impl : ( ( rule__RatioMajority__Group_6__0 )? ) ;
    public final void rule__RatioMajority__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2377:1: ( ( ( rule__RatioMajority__Group_6__0 )? ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2378:1: ( ( rule__RatioMajority__Group_6__0 )? )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2378:1: ( ( rule__RatioMajority__Group_6__0 )? )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2379:1: ( rule__RatioMajority__Group_6__0 )?
            {
             before(grammarAccess.getRatioMajorityAccess().getGroup_6()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2380:1: ( rule__RatioMajority__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2380:2: rule__RatioMajority__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_6__0_in_rule__RatioMajority__Group__6__Impl4754);
                    rule__RatioMajority__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRatioMajorityAccess().getGroup_6()); 

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
    // $ANTLR end "rule__RatioMajority__Group__6__Impl"


    // $ANTLR start "rule__RatioMajority__Group__7"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2390:1: rule__RatioMajority__Group__7 : rule__RatioMajority__Group__7__Impl rule__RatioMajority__Group__8 ;
    public final void rule__RatioMajority__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2394:1: ( rule__RatioMajority__Group__7__Impl rule__RatioMajority__Group__8 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2395:2: rule__RatioMajority__Group__7__Impl rule__RatioMajority__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__7__Impl_in_rule__RatioMajority__Group__74785);
            rule__RatioMajority__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__8_in_rule__RatioMajority__Group__74788);
            rule__RatioMajority__Group__8();

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
    // $ANTLR end "rule__RatioMajority__Group__7"


    // $ANTLR start "rule__RatioMajority__Group__7__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2402:1: rule__RatioMajority__Group__7__Impl : ( 'people' ) ;
    public final void rule__RatioMajority__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2406:1: ( ( 'people' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2407:1: ( 'people' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2407:1: ( 'people' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2408:1: 'people'
            {
             before(grammarAccess.getRatioMajorityAccess().getPeopleKeyword_7()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__RatioMajority__Group__7__Impl4816); 
             after(grammarAccess.getRatioMajorityAccess().getPeopleKeyword_7()); 

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
    // $ANTLR end "rule__RatioMajority__Group__7__Impl"


    // $ANTLR start "rule__RatioMajority__Group__8"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2421:1: rule__RatioMajority__Group__8 : rule__RatioMajority__Group__8__Impl rule__RatioMajority__Group__9 ;
    public final void rule__RatioMajority__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2425:1: ( rule__RatioMajority__Group__8__Impl rule__RatioMajority__Group__9 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2426:2: rule__RatioMajority__Group__8__Impl rule__RatioMajority__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__8__Impl_in_rule__RatioMajority__Group__84847);
            rule__RatioMajority__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__9_in_rule__RatioMajority__Group__84850);
            rule__RatioMajority__Group__9();

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
    // $ANTLR end "rule__RatioMajority__Group__8"


    // $ANTLR start "rule__RatioMajority__Group__8__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2433:1: rule__RatioMajority__Group__8__Impl : ( ( rule__RatioMajority__PeopleAssignment_8 ) ) ;
    public final void rule__RatioMajority__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2437:1: ( ( ( rule__RatioMajority__PeopleAssignment_8 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2438:1: ( ( rule__RatioMajority__PeopleAssignment_8 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2438:1: ( ( rule__RatioMajority__PeopleAssignment_8 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2439:1: ( rule__RatioMajority__PeopleAssignment_8 )
            {
             before(grammarAccess.getRatioMajorityAccess().getPeopleAssignment_8()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2440:1: ( rule__RatioMajority__PeopleAssignment_8 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2440:2: rule__RatioMajority__PeopleAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__PeopleAssignment_8_in_rule__RatioMajority__Group__8__Impl4877);
            rule__RatioMajority__PeopleAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRatioMajorityAccess().getPeopleAssignment_8()); 

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
    // $ANTLR end "rule__RatioMajority__Group__8__Impl"


    // $ANTLR start "rule__RatioMajority__Group__9"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2450:1: rule__RatioMajority__Group__9 : rule__RatioMajority__Group__9__Impl rule__RatioMajority__Group__10 ;
    public final void rule__RatioMajority__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2454:1: ( rule__RatioMajority__Group__9__Impl rule__RatioMajority__Group__10 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2455:2: rule__RatioMajority__Group__9__Impl rule__RatioMajority__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__9__Impl_in_rule__RatioMajority__Group__94907);
            rule__RatioMajority__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__10_in_rule__RatioMajority__Group__94910);
            rule__RatioMajority__Group__10();

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
    // $ANTLR end "rule__RatioMajority__Group__9"


    // $ANTLR start "rule__RatioMajority__Group__9__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2462:1: rule__RatioMajority__Group__9__Impl : ( ( rule__RatioMajority__Group_9__0 )* ) ;
    public final void rule__RatioMajority__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2466:1: ( ( ( rule__RatioMajority__Group_9__0 )* ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2467:1: ( ( rule__RatioMajority__Group_9__0 )* )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2467:1: ( ( rule__RatioMajority__Group_9__0 )* )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2468:1: ( rule__RatioMajority__Group_9__0 )*
            {
             before(grammarAccess.getRatioMajorityAccess().getGroup_9()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2469:1: ( rule__RatioMajority__Group_9__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2469:2: rule__RatioMajority__Group_9__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_9__0_in_rule__RatioMajority__Group__9__Impl4937);
            	    rule__RatioMajority__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getRatioMajorityAccess().getGroup_9()); 

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
    // $ANTLR end "rule__RatioMajority__Group__9__Impl"


    // $ANTLR start "rule__RatioMajority__Group__10"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2479:1: rule__RatioMajority__Group__10 : rule__RatioMajority__Group__10__Impl rule__RatioMajority__Group__11 ;
    public final void rule__RatioMajority__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2483:1: ( rule__RatioMajority__Group__10__Impl rule__RatioMajority__Group__11 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2484:2: rule__RatioMajority__Group__10__Impl rule__RatioMajority__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__10__Impl_in_rule__RatioMajority__Group__104968);
            rule__RatioMajority__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__11_in_rule__RatioMajority__Group__104971);
            rule__RatioMajority__Group__11();

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
    // $ANTLR end "rule__RatioMajority__Group__10"


    // $ANTLR start "rule__RatioMajority__Group__10__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2491:1: rule__RatioMajority__Group__10__Impl : ( 'range' ) ;
    public final void rule__RatioMajority__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2495:1: ( ( 'range' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2496:1: ( 'range' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2496:1: ( 'range' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2497:1: 'range'
            {
             before(grammarAccess.getRatioMajorityAccess().getRangeKeyword_10()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__RatioMajority__Group__10__Impl4999); 
             after(grammarAccess.getRatioMajorityAccess().getRangeKeyword_10()); 

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
    // $ANTLR end "rule__RatioMajority__Group__10__Impl"


    // $ANTLR start "rule__RatioMajority__Group__11"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2510:1: rule__RatioMajority__Group__11 : rule__RatioMajority__Group__11__Impl rule__RatioMajority__Group__12 ;
    public final void rule__RatioMajority__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2514:1: ( rule__RatioMajority__Group__11__Impl rule__RatioMajority__Group__12 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2515:2: rule__RatioMajority__Group__11__Impl rule__RatioMajority__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__11__Impl_in_rule__RatioMajority__Group__115030);
            rule__RatioMajority__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__12_in_rule__RatioMajority__Group__115033);
            rule__RatioMajority__Group__12();

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
    // $ANTLR end "rule__RatioMajority__Group__11"


    // $ANTLR start "rule__RatioMajority__Group__11__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2522:1: rule__RatioMajority__Group__11__Impl : ( ( rule__RatioMajority__RangeAssignment_11 ) ) ;
    public final void rule__RatioMajority__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2526:1: ( ( ( rule__RatioMajority__RangeAssignment_11 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2527:1: ( ( rule__RatioMajority__RangeAssignment_11 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2527:1: ( ( rule__RatioMajority__RangeAssignment_11 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2528:1: ( rule__RatioMajority__RangeAssignment_11 )
            {
             before(grammarAccess.getRatioMajorityAccess().getRangeAssignment_11()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2529:1: ( rule__RatioMajority__RangeAssignment_11 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2529:2: rule__RatioMajority__RangeAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__RangeAssignment_11_in_rule__RatioMajority__Group__11__Impl5060);
            rule__RatioMajority__RangeAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getRatioMajorityAccess().getRangeAssignment_11()); 

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
    // $ANTLR end "rule__RatioMajority__Group__11__Impl"


    // $ANTLR start "rule__RatioMajority__Group__12"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2539:1: rule__RatioMajority__Group__12 : rule__RatioMajority__Group__12__Impl rule__RatioMajority__Group__13 ;
    public final void rule__RatioMajority__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2543:1: ( rule__RatioMajority__Group__12__Impl rule__RatioMajority__Group__13 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2544:2: rule__RatioMajority__Group__12__Impl rule__RatioMajority__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__12__Impl_in_rule__RatioMajority__Group__125090);
            rule__RatioMajority__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__13_in_rule__RatioMajority__Group__125093);
            rule__RatioMajority__Group__13();

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
    // $ANTLR end "rule__RatioMajority__Group__12"


    // $ANTLR start "rule__RatioMajority__Group__12__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2551:1: rule__RatioMajority__Group__12__Impl : ( ( rule__RatioMajority__Group_12__0 )? ) ;
    public final void rule__RatioMajority__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2555:1: ( ( ( rule__RatioMajority__Group_12__0 )? ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2556:1: ( ( rule__RatioMajority__Group_12__0 )? )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2556:1: ( ( rule__RatioMajority__Group_12__0 )? )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2557:1: ( rule__RatioMajority__Group_12__0 )?
            {
             before(grammarAccess.getRatioMajorityAccess().getGroup_12()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2558:1: ( rule__RatioMajority__Group_12__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2558:2: rule__RatioMajority__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_12__0_in_rule__RatioMajority__Group__12__Impl5120);
                    rule__RatioMajority__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRatioMajorityAccess().getGroup_12()); 

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
    // $ANTLR end "rule__RatioMajority__Group__12__Impl"


    // $ANTLR start "rule__RatioMajority__Group__13"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2568:1: rule__RatioMajority__Group__13 : rule__RatioMajority__Group__13__Impl rule__RatioMajority__Group__14 ;
    public final void rule__RatioMajority__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2572:1: ( rule__RatioMajority__Group__13__Impl rule__RatioMajority__Group__14 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2573:2: rule__RatioMajority__Group__13__Impl rule__RatioMajority__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__13__Impl_in_rule__RatioMajority__Group__135151);
            rule__RatioMajority__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__14_in_rule__RatioMajority__Group__135154);
            rule__RatioMajority__Group__14();

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
    // $ANTLR end "rule__RatioMajority__Group__13"


    // $ANTLR start "rule__RatioMajority__Group__13__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2580:1: rule__RatioMajority__Group__13__Impl : ( 'ratio' ) ;
    public final void rule__RatioMajority__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2584:1: ( ( 'ratio' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2585:1: ( 'ratio' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2585:1: ( 'ratio' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2586:1: 'ratio'
            {
             before(grammarAccess.getRatioMajorityAccess().getRatioKeyword_13()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__RatioMajority__Group__13__Impl5182); 
             after(grammarAccess.getRatioMajorityAccess().getRatioKeyword_13()); 

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
    // $ANTLR end "rule__RatioMajority__Group__13__Impl"


    // $ANTLR start "rule__RatioMajority__Group__14"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2599:1: rule__RatioMajority__Group__14 : rule__RatioMajority__Group__14__Impl rule__RatioMajority__Group__15 ;
    public final void rule__RatioMajority__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2603:1: ( rule__RatioMajority__Group__14__Impl rule__RatioMajority__Group__15 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2604:2: rule__RatioMajority__Group__14__Impl rule__RatioMajority__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__14__Impl_in_rule__RatioMajority__Group__145213);
            rule__RatioMajority__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__15_in_rule__RatioMajority__Group__145216);
            rule__RatioMajority__Group__15();

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
    // $ANTLR end "rule__RatioMajority__Group__14"


    // $ANTLR start "rule__RatioMajority__Group__14__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2611:1: rule__RatioMajority__Group__14__Impl : ( ( rule__RatioMajority__RatioAssignment_14 ) ) ;
    public final void rule__RatioMajority__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2615:1: ( ( ( rule__RatioMajority__RatioAssignment_14 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2616:1: ( ( rule__RatioMajority__RatioAssignment_14 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2616:1: ( ( rule__RatioMajority__RatioAssignment_14 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2617:1: ( rule__RatioMajority__RatioAssignment_14 )
            {
             before(grammarAccess.getRatioMajorityAccess().getRatioAssignment_14()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2618:1: ( rule__RatioMajority__RatioAssignment_14 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2618:2: rule__RatioMajority__RatioAssignment_14
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__RatioAssignment_14_in_rule__RatioMajority__Group__14__Impl5243);
            rule__RatioMajority__RatioAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getRatioMajorityAccess().getRatioAssignment_14()); 

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
    // $ANTLR end "rule__RatioMajority__Group__14__Impl"


    // $ANTLR start "rule__RatioMajority__Group__15"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2628:1: rule__RatioMajority__Group__15 : rule__RatioMajority__Group__15__Impl rule__RatioMajority__Group__16 ;
    public final void rule__RatioMajority__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2632:1: ( rule__RatioMajority__Group__15__Impl rule__RatioMajority__Group__16 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2633:2: rule__RatioMajority__Group__15__Impl rule__RatioMajority__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__15__Impl_in_rule__RatioMajority__Group__155273);
            rule__RatioMajority__Group__15__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__16_in_rule__RatioMajority__Group__155276);
            rule__RatioMajority__Group__16();

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
    // $ANTLR end "rule__RatioMajority__Group__15"


    // $ANTLR start "rule__RatioMajority__Group__15__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2640:1: rule__RatioMajority__Group__15__Impl : ( 'deadline' ) ;
    public final void rule__RatioMajority__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2644:1: ( ( 'deadline' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2645:1: ( 'deadline' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2645:1: ( 'deadline' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2646:1: 'deadline'
            {
             before(grammarAccess.getRatioMajorityAccess().getDeadlineKeyword_15()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__RatioMajority__Group__15__Impl5304); 
             after(grammarAccess.getRatioMajorityAccess().getDeadlineKeyword_15()); 

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
    // $ANTLR end "rule__RatioMajority__Group__15__Impl"


    // $ANTLR start "rule__RatioMajority__Group__16"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2659:1: rule__RatioMajority__Group__16 : rule__RatioMajority__Group__16__Impl rule__RatioMajority__Group__17 ;
    public final void rule__RatioMajority__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2663:1: ( rule__RatioMajority__Group__16__Impl rule__RatioMajority__Group__17 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2664:2: rule__RatioMajority__Group__16__Impl rule__RatioMajority__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__16__Impl_in_rule__RatioMajority__Group__165335);
            rule__RatioMajority__Group__16__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__17_in_rule__RatioMajority__Group__165338);
            rule__RatioMajority__Group__17();

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
    // $ANTLR end "rule__RatioMajority__Group__16"


    // $ANTLR start "rule__RatioMajority__Group__16__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2671:1: rule__RatioMajority__Group__16__Impl : ( ( rule__RatioMajority__DeadlineAssignment_16 ) ) ;
    public final void rule__RatioMajority__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2675:1: ( ( ( rule__RatioMajority__DeadlineAssignment_16 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2676:1: ( ( rule__RatioMajority__DeadlineAssignment_16 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2676:1: ( ( rule__RatioMajority__DeadlineAssignment_16 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2677:1: ( rule__RatioMajority__DeadlineAssignment_16 )
            {
             before(grammarAccess.getRatioMajorityAccess().getDeadlineAssignment_16()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2678:1: ( rule__RatioMajority__DeadlineAssignment_16 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2678:2: rule__RatioMajority__DeadlineAssignment_16
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__DeadlineAssignment_16_in_rule__RatioMajority__Group__16__Impl5365);
            rule__RatioMajority__DeadlineAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getRatioMajorityAccess().getDeadlineAssignment_16()); 

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
    // $ANTLR end "rule__RatioMajority__Group__16__Impl"


    // $ANTLR start "rule__RatioMajority__Group__17"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2688:1: rule__RatioMajority__Group__17 : rule__RatioMajority__Group__17__Impl ;
    public final void rule__RatioMajority__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2692:1: ( rule__RatioMajority__Group__17__Impl )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2693:2: rule__RatioMajority__Group__17__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__17__Impl_in_rule__RatioMajority__Group__175395);
            rule__RatioMajority__Group__17__Impl();

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
    // $ANTLR end "rule__RatioMajority__Group__17"


    // $ANTLR start "rule__RatioMajority__Group__17__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2699:1: rule__RatioMajority__Group__17__Impl : ( '}' ) ;
    public final void rule__RatioMajority__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2703:1: ( ( '}' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2704:1: ( '}' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2704:1: ( '}' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2705:1: '}'
            {
             before(grammarAccess.getRatioMajorityAccess().getRightCurlyBracketKeyword_17()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__RatioMajority__Group__17__Impl5423); 
             after(grammarAccess.getRatioMajorityAccess().getRightCurlyBracketKeyword_17()); 

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
    // $ANTLR end "rule__RatioMajority__Group__17__Impl"


    // $ANTLR start "rule__RatioMajority__Group_6__0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2754:1: rule__RatioMajority__Group_6__0 : rule__RatioMajority__Group_6__0__Impl rule__RatioMajority__Group_6__1 ;
    public final void rule__RatioMajority__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2758:1: ( rule__RatioMajority__Group_6__0__Impl rule__RatioMajority__Group_6__1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2759:2: rule__RatioMajority__Group_6__0__Impl rule__RatioMajority__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_6__0__Impl_in_rule__RatioMajority__Group_6__05490);
            rule__RatioMajority__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_6__1_in_rule__RatioMajority__Group_6__05493);
            rule__RatioMajority__Group_6__1();

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
    // $ANTLR end "rule__RatioMajority__Group_6__0"


    // $ANTLR start "rule__RatioMajority__Group_6__0__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2766:1: rule__RatioMajority__Group_6__0__Impl : ( '(' ) ;
    public final void rule__RatioMajority__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2770:1: ( ( '(' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2771:1: ( '(' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2771:1: ( '(' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2772:1: '('
            {
             before(grammarAccess.getRatioMajorityAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__RatioMajority__Group_6__0__Impl5521); 
             after(grammarAccess.getRatioMajorityAccess().getLeftParenthesisKeyword_6_0()); 

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
    // $ANTLR end "rule__RatioMajority__Group_6__0__Impl"


    // $ANTLR start "rule__RatioMajority__Group_6__1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2785:1: rule__RatioMajority__Group_6__1 : rule__RatioMajority__Group_6__1__Impl rule__RatioMajority__Group_6__2 ;
    public final void rule__RatioMajority__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2789:1: ( rule__RatioMajority__Group_6__1__Impl rule__RatioMajority__Group_6__2 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2790:2: rule__RatioMajority__Group_6__1__Impl rule__RatioMajority__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_6__1__Impl_in_rule__RatioMajority__Group_6__15552);
            rule__RatioMajority__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_6__2_in_rule__RatioMajority__Group_6__15555);
            rule__RatioMajority__Group_6__2();

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
    // $ANTLR end "rule__RatioMajority__Group_6__1"


    // $ANTLR start "rule__RatioMajority__Group_6__1__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2797:1: rule__RatioMajority__Group_6__1__Impl : ( ruleFilter ) ;
    public final void rule__RatioMajority__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2801:1: ( ( ruleFilter ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2802:1: ( ruleFilter )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2802:1: ( ruleFilter )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2803:1: ruleFilter
            {
             before(grammarAccess.getRatioMajorityAccess().getFilterParserRuleCall_6_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilter_in_rule__RatioMajority__Group_6__1__Impl5582);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getRatioMajorityAccess().getFilterParserRuleCall_6_1()); 

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
    // $ANTLR end "rule__RatioMajority__Group_6__1__Impl"


    // $ANTLR start "rule__RatioMajority__Group_6__2"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2814:1: rule__RatioMajority__Group_6__2 : rule__RatioMajority__Group_6__2__Impl ;
    public final void rule__RatioMajority__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2818:1: ( rule__RatioMajority__Group_6__2__Impl )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2819:2: rule__RatioMajority__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_6__2__Impl_in_rule__RatioMajority__Group_6__25611);
            rule__RatioMajority__Group_6__2__Impl();

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
    // $ANTLR end "rule__RatioMajority__Group_6__2"


    // $ANTLR start "rule__RatioMajority__Group_6__2__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2825:1: rule__RatioMajority__Group_6__2__Impl : ( ')' ) ;
    public final void rule__RatioMajority__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2829:1: ( ( ')' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2830:1: ( ')' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2830:1: ( ')' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2831:1: ')'
            {
             before(grammarAccess.getRatioMajorityAccess().getRightParenthesisKeyword_6_2()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__RatioMajority__Group_6__2__Impl5639); 
             after(grammarAccess.getRatioMajorityAccess().getRightParenthesisKeyword_6_2()); 

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
    // $ANTLR end "rule__RatioMajority__Group_6__2__Impl"


    // $ANTLR start "rule__RatioMajority__Group_9__0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2850:1: rule__RatioMajority__Group_9__0 : rule__RatioMajority__Group_9__0__Impl rule__RatioMajority__Group_9__1 ;
    public final void rule__RatioMajority__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2854:1: ( rule__RatioMajority__Group_9__0__Impl rule__RatioMajority__Group_9__1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2855:2: rule__RatioMajority__Group_9__0__Impl rule__RatioMajority__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_9__0__Impl_in_rule__RatioMajority__Group_9__05676);
            rule__RatioMajority__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_9__1_in_rule__RatioMajority__Group_9__05679);
            rule__RatioMajority__Group_9__1();

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
    // $ANTLR end "rule__RatioMajority__Group_9__0"


    // $ANTLR start "rule__RatioMajority__Group_9__0__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2862:1: rule__RatioMajority__Group_9__0__Impl : ( ',' ) ;
    public final void rule__RatioMajority__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2866:1: ( ( ',' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2867:1: ( ',' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2867:1: ( ',' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2868:1: ','
            {
             before(grammarAccess.getRatioMajorityAccess().getCommaKeyword_9_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__RatioMajority__Group_9__0__Impl5707); 
             after(grammarAccess.getRatioMajorityAccess().getCommaKeyword_9_0()); 

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
    // $ANTLR end "rule__RatioMajority__Group_9__0__Impl"


    // $ANTLR start "rule__RatioMajority__Group_9__1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2881:1: rule__RatioMajority__Group_9__1 : rule__RatioMajority__Group_9__1__Impl ;
    public final void rule__RatioMajority__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2885:1: ( rule__RatioMajority__Group_9__1__Impl )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2886:2: rule__RatioMajority__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_9__1__Impl_in_rule__RatioMajority__Group_9__15738);
            rule__RatioMajority__Group_9__1__Impl();

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
    // $ANTLR end "rule__RatioMajority__Group_9__1"


    // $ANTLR start "rule__RatioMajority__Group_9__1__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2892:1: rule__RatioMajority__Group_9__1__Impl : ( ( rule__RatioMajority__PeopleAssignment_9_1 ) ) ;
    public final void rule__RatioMajority__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2896:1: ( ( ( rule__RatioMajority__PeopleAssignment_9_1 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2897:1: ( ( rule__RatioMajority__PeopleAssignment_9_1 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2897:1: ( ( rule__RatioMajority__PeopleAssignment_9_1 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2898:1: ( rule__RatioMajority__PeopleAssignment_9_1 )
            {
             before(grammarAccess.getRatioMajorityAccess().getPeopleAssignment_9_1()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2899:1: ( rule__RatioMajority__PeopleAssignment_9_1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2899:2: rule__RatioMajority__PeopleAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__PeopleAssignment_9_1_in_rule__RatioMajority__Group_9__1__Impl5765);
            rule__RatioMajority__PeopleAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getRatioMajorityAccess().getPeopleAssignment_9_1()); 

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
    // $ANTLR end "rule__RatioMajority__Group_9__1__Impl"


    // $ANTLR start "rule__RatioMajority__Group_12__0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2913:1: rule__RatioMajority__Group_12__0 : rule__RatioMajority__Group_12__0__Impl rule__RatioMajority__Group_12__1 ;
    public final void rule__RatioMajority__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2917:1: ( rule__RatioMajority__Group_12__0__Impl rule__RatioMajority__Group_12__1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2918:2: rule__RatioMajority__Group_12__0__Impl rule__RatioMajority__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_12__0__Impl_in_rule__RatioMajority__Group_12__05799);
            rule__RatioMajority__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_12__1_in_rule__RatioMajority__Group_12__05802);
            rule__RatioMajority__Group_12__1();

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
    // $ANTLR end "rule__RatioMajority__Group_12__0"


    // $ANTLR start "rule__RatioMajority__Group_12__0__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2925:1: rule__RatioMajority__Group_12__0__Impl : ( 'minVotes' ) ;
    public final void rule__RatioMajority__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2929:1: ( ( 'minVotes' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2930:1: ( 'minVotes' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2930:1: ( 'minVotes' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2931:1: 'minVotes'
            {
             before(grammarAccess.getRatioMajorityAccess().getMinVotesKeyword_12_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__RatioMajority__Group_12__0__Impl5830); 
             after(grammarAccess.getRatioMajorityAccess().getMinVotesKeyword_12_0()); 

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
    // $ANTLR end "rule__RatioMajority__Group_12__0__Impl"


    // $ANTLR start "rule__RatioMajority__Group_12__1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2944:1: rule__RatioMajority__Group_12__1 : rule__RatioMajority__Group_12__1__Impl ;
    public final void rule__RatioMajority__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2948:1: ( rule__RatioMajority__Group_12__1__Impl )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2949:2: rule__RatioMajority__Group_12__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_12__1__Impl_in_rule__RatioMajority__Group_12__15861);
            rule__RatioMajority__Group_12__1__Impl();

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
    // $ANTLR end "rule__RatioMajority__Group_12__1"


    // $ANTLR start "rule__RatioMajority__Group_12__1__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2955:1: rule__RatioMajority__Group_12__1__Impl : ( ( rule__RatioMajority__MinVotesAssignment_12_1 ) ) ;
    public final void rule__RatioMajority__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2959:1: ( ( ( rule__RatioMajority__MinVotesAssignment_12_1 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2960:1: ( ( rule__RatioMajority__MinVotesAssignment_12_1 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2960:1: ( ( rule__RatioMajority__MinVotesAssignment_12_1 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2961:1: ( rule__RatioMajority__MinVotesAssignment_12_1 )
            {
             before(grammarAccess.getRatioMajorityAccess().getMinVotesAssignment_12_1()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2962:1: ( rule__RatioMajority__MinVotesAssignment_12_1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2962:2: rule__RatioMajority__MinVotesAssignment_12_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__MinVotesAssignment_12_1_in_rule__RatioMajority__Group_12__1__Impl5888);
            rule__RatioMajority__MinVotesAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getRatioMajorityAccess().getMinVotesAssignment_12_1()); 

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
    // $ANTLR end "rule__RatioMajority__Group_12__1__Impl"


    // $ANTLR start "rule__LeaderDriven__Group__0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2976:1: rule__LeaderDriven__Group__0 : rule__LeaderDriven__Group__0__Impl rule__LeaderDriven__Group__1 ;
    public final void rule__LeaderDriven__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2980:1: ( rule__LeaderDriven__Group__0__Impl rule__LeaderDriven__Group__1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2981:2: rule__LeaderDriven__Group__0__Impl rule__LeaderDriven__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__0__Impl_in_rule__LeaderDriven__Group__05922);
            rule__LeaderDriven__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__1_in_rule__LeaderDriven__Group__05925);
            rule__LeaderDriven__Group__1();

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
    // $ANTLR end "rule__LeaderDriven__Group__0"


    // $ANTLR start "rule__LeaderDriven__Group__0__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2988:1: rule__LeaderDriven__Group__0__Impl : ( ( rule__LeaderDriven__NameAssignment_0 ) ) ;
    public final void rule__LeaderDriven__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2992:1: ( ( ( rule__LeaderDriven__NameAssignment_0 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2993:1: ( ( rule__LeaderDriven__NameAssignment_0 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2993:1: ( ( rule__LeaderDriven__NameAssignment_0 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2994:1: ( rule__LeaderDriven__NameAssignment_0 )
            {
             before(grammarAccess.getLeaderDrivenAccess().getNameAssignment_0()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2995:1: ( rule__LeaderDriven__NameAssignment_0 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:2995:2: rule__LeaderDriven__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__NameAssignment_0_in_rule__LeaderDriven__Group__0__Impl5952);
            rule__LeaderDriven__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLeaderDrivenAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__LeaderDriven__Group__0__Impl"


    // $ANTLR start "rule__LeaderDriven__Group__1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3005:1: rule__LeaderDriven__Group__1 : rule__LeaderDriven__Group__1__Impl rule__LeaderDriven__Group__2 ;
    public final void rule__LeaderDriven__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3009:1: ( rule__LeaderDriven__Group__1__Impl rule__LeaderDriven__Group__2 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3010:2: rule__LeaderDriven__Group__1__Impl rule__LeaderDriven__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__1__Impl_in_rule__LeaderDriven__Group__15982);
            rule__LeaderDriven__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__2_in_rule__LeaderDriven__Group__15985);
            rule__LeaderDriven__Group__2();

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
    // $ANTLR end "rule__LeaderDriven__Group__1"


    // $ANTLR start "rule__LeaderDriven__Group__1__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3017:1: rule__LeaderDriven__Group__1__Impl : ( ':' ) ;
    public final void rule__LeaderDriven__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3021:1: ( ( ':' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3022:1: ( ':' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3022:1: ( ':' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3023:1: ':'
            {
             before(grammarAccess.getLeaderDrivenAccess().getColonKeyword_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__LeaderDriven__Group__1__Impl6013); 
             after(grammarAccess.getLeaderDrivenAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__LeaderDriven__Group__1__Impl"


    // $ANTLR start "rule__LeaderDriven__Group__2"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3036:1: rule__LeaderDriven__Group__2 : rule__LeaderDriven__Group__2__Impl rule__LeaderDriven__Group__3 ;
    public final void rule__LeaderDriven__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3040:1: ( rule__LeaderDriven__Group__2__Impl rule__LeaderDriven__Group__3 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3041:2: rule__LeaderDriven__Group__2__Impl rule__LeaderDriven__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__2__Impl_in_rule__LeaderDriven__Group__26044);
            rule__LeaderDriven__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__3_in_rule__LeaderDriven__Group__26047);
            rule__LeaderDriven__Group__3();

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
    // $ANTLR end "rule__LeaderDriven__Group__2"


    // $ANTLR start "rule__LeaderDriven__Group__2__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3048:1: rule__LeaderDriven__Group__2__Impl : ( 'LeaderDriven' ) ;
    public final void rule__LeaderDriven__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3052:1: ( ( 'LeaderDriven' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3053:1: ( 'LeaderDriven' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3053:1: ( 'LeaderDriven' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3054:1: 'LeaderDriven'
            {
             before(grammarAccess.getLeaderDrivenAccess().getLeaderDrivenKeyword_2()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__LeaderDriven__Group__2__Impl6075); 
             after(grammarAccess.getLeaderDrivenAccess().getLeaderDrivenKeyword_2()); 

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
    // $ANTLR end "rule__LeaderDriven__Group__2__Impl"


    // $ANTLR start "rule__LeaderDriven__Group__3"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3067:1: rule__LeaderDriven__Group__3 : rule__LeaderDriven__Group__3__Impl rule__LeaderDriven__Group__4 ;
    public final void rule__LeaderDriven__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3071:1: ( rule__LeaderDriven__Group__3__Impl rule__LeaderDriven__Group__4 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3072:2: rule__LeaderDriven__Group__3__Impl rule__LeaderDriven__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__3__Impl_in_rule__LeaderDriven__Group__36106);
            rule__LeaderDriven__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__4_in_rule__LeaderDriven__Group__36109);
            rule__LeaderDriven__Group__4();

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
    // $ANTLR end "rule__LeaderDriven__Group__3"


    // $ANTLR start "rule__LeaderDriven__Group__3__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3079:1: rule__LeaderDriven__Group__3__Impl : ( '{' ) ;
    public final void rule__LeaderDriven__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3083:1: ( ( '{' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3084:1: ( '{' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3084:1: ( '{' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3085:1: '{'
            {
             before(grammarAccess.getLeaderDrivenAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__LeaderDriven__Group__3__Impl6137); 
             after(grammarAccess.getLeaderDrivenAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__LeaderDriven__Group__3__Impl"


    // $ANTLR start "rule__LeaderDriven__Group__4"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3098:1: rule__LeaderDriven__Group__4 : rule__LeaderDriven__Group__4__Impl rule__LeaderDriven__Group__5 ;
    public final void rule__LeaderDriven__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3102:1: ( rule__LeaderDriven__Group__4__Impl rule__LeaderDriven__Group__5 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3103:2: rule__LeaderDriven__Group__4__Impl rule__LeaderDriven__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__4__Impl_in_rule__LeaderDriven__Group__46168);
            rule__LeaderDriven__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__5_in_rule__LeaderDriven__Group__46171);
            rule__LeaderDriven__Group__5();

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
    // $ANTLR end "rule__LeaderDriven__Group__4"


    // $ANTLR start "rule__LeaderDriven__Group__4__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3110:1: rule__LeaderDriven__Group__4__Impl : ( 'applied to' ) ;
    public final void rule__LeaderDriven__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3114:1: ( ( 'applied to' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3115:1: ( 'applied to' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3115:1: ( 'applied to' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3116:1: 'applied to'
            {
             before(grammarAccess.getLeaderDrivenAccess().getAppliedToKeyword_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__LeaderDriven__Group__4__Impl6199); 
             after(grammarAccess.getLeaderDrivenAccess().getAppliedToKeyword_4()); 

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
    // $ANTLR end "rule__LeaderDriven__Group__4__Impl"


    // $ANTLR start "rule__LeaderDriven__Group__5"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3129:1: rule__LeaderDriven__Group__5 : rule__LeaderDriven__Group__5__Impl rule__LeaderDriven__Group__6 ;
    public final void rule__LeaderDriven__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3133:1: ( rule__LeaderDriven__Group__5__Impl rule__LeaderDriven__Group__6 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3134:2: rule__LeaderDriven__Group__5__Impl rule__LeaderDriven__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__5__Impl_in_rule__LeaderDriven__Group__56230);
            rule__LeaderDriven__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__6_in_rule__LeaderDriven__Group__56233);
            rule__LeaderDriven__Group__6();

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
    // $ANTLR end "rule__LeaderDriven__Group__5"


    // $ANTLR start "rule__LeaderDriven__Group__5__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3141:1: rule__LeaderDriven__Group__5__Impl : ( ( rule__LeaderDriven__Alternatives_5 ) ) ;
    public final void rule__LeaderDriven__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3145:1: ( ( ( rule__LeaderDriven__Alternatives_5 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3146:1: ( ( rule__LeaderDriven__Alternatives_5 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3146:1: ( ( rule__LeaderDriven__Alternatives_5 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3147:1: ( rule__LeaderDriven__Alternatives_5 )
            {
             before(grammarAccess.getLeaderDrivenAccess().getAlternatives_5()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3148:1: ( rule__LeaderDriven__Alternatives_5 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3148:2: rule__LeaderDriven__Alternatives_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Alternatives_5_in_rule__LeaderDriven__Group__5__Impl6260);
            rule__LeaderDriven__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getLeaderDrivenAccess().getAlternatives_5()); 

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
    // $ANTLR end "rule__LeaderDriven__Group__5__Impl"


    // $ANTLR start "rule__LeaderDriven__Group__6"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3158:1: rule__LeaderDriven__Group__6 : rule__LeaderDriven__Group__6__Impl rule__LeaderDriven__Group__7 ;
    public final void rule__LeaderDriven__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3162:1: ( rule__LeaderDriven__Group__6__Impl rule__LeaderDriven__Group__7 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3163:2: rule__LeaderDriven__Group__6__Impl rule__LeaderDriven__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__6__Impl_in_rule__LeaderDriven__Group__66290);
            rule__LeaderDriven__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__7_in_rule__LeaderDriven__Group__66293);
            rule__LeaderDriven__Group__7();

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
    // $ANTLR end "rule__LeaderDriven__Group__6"


    // $ANTLR start "rule__LeaderDriven__Group__6__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3170:1: rule__LeaderDriven__Group__6__Impl : ( ( rule__LeaderDriven__Group_6__0 )? ) ;
    public final void rule__LeaderDriven__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3174:1: ( ( ( rule__LeaderDriven__Group_6__0 )? ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3175:1: ( ( rule__LeaderDriven__Group_6__0 )? )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3175:1: ( ( rule__LeaderDriven__Group_6__0 )? )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3176:1: ( rule__LeaderDriven__Group_6__0 )?
            {
             before(grammarAccess.getLeaderDrivenAccess().getGroup_6()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3177:1: ( rule__LeaderDriven__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3177:2: rule__LeaderDriven__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group_6__0_in_rule__LeaderDriven__Group__6__Impl6320);
                    rule__LeaderDriven__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeaderDrivenAccess().getGroup_6()); 

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
    // $ANTLR end "rule__LeaderDriven__Group__6__Impl"


    // $ANTLR start "rule__LeaderDriven__Group__7"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3187:1: rule__LeaderDriven__Group__7 : rule__LeaderDriven__Group__7__Impl rule__LeaderDriven__Group__8 ;
    public final void rule__LeaderDriven__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3191:1: ( rule__LeaderDriven__Group__7__Impl rule__LeaderDriven__Group__8 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3192:2: rule__LeaderDriven__Group__7__Impl rule__LeaderDriven__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__7__Impl_in_rule__LeaderDriven__Group__76351);
            rule__LeaderDriven__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__8_in_rule__LeaderDriven__Group__76354);
            rule__LeaderDriven__Group__8();

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
    // $ANTLR end "rule__LeaderDriven__Group__7"


    // $ANTLR start "rule__LeaderDriven__Group__7__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3199:1: rule__LeaderDriven__Group__7__Impl : ( 'default' ) ;
    public final void rule__LeaderDriven__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3203:1: ( ( 'default' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3204:1: ( 'default' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3204:1: ( 'default' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3205:1: 'default'
            {
             before(grammarAccess.getLeaderDrivenAccess().getDefaultKeyword_7()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__LeaderDriven__Group__7__Impl6382); 
             after(grammarAccess.getLeaderDrivenAccess().getDefaultKeyword_7()); 

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
    // $ANTLR end "rule__LeaderDriven__Group__7__Impl"


    // $ANTLR start "rule__LeaderDriven__Group__8"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3218:1: rule__LeaderDriven__Group__8 : rule__LeaderDriven__Group__8__Impl rule__LeaderDriven__Group__9 ;
    public final void rule__LeaderDriven__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3222:1: ( rule__LeaderDriven__Group__8__Impl rule__LeaderDriven__Group__9 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3223:2: rule__LeaderDriven__Group__8__Impl rule__LeaderDriven__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__8__Impl_in_rule__LeaderDriven__Group__86413);
            rule__LeaderDriven__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__9_in_rule__LeaderDriven__Group__86416);
            rule__LeaderDriven__Group__9();

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
    // $ANTLR end "rule__LeaderDriven__Group__8"


    // $ANTLR start "rule__LeaderDriven__Group__8__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3230:1: rule__LeaderDriven__Group__8__Impl : ( ( rule__LeaderDriven__DefaultAssignment_8 ) ) ;
    public final void rule__LeaderDriven__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3234:1: ( ( ( rule__LeaderDriven__DefaultAssignment_8 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3235:1: ( ( rule__LeaderDriven__DefaultAssignment_8 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3235:1: ( ( rule__LeaderDriven__DefaultAssignment_8 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3236:1: ( rule__LeaderDriven__DefaultAssignment_8 )
            {
             before(grammarAccess.getLeaderDrivenAccess().getDefaultAssignment_8()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3237:1: ( rule__LeaderDriven__DefaultAssignment_8 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3237:2: rule__LeaderDriven__DefaultAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__DefaultAssignment_8_in_rule__LeaderDriven__Group__8__Impl6443);
            rule__LeaderDriven__DefaultAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getLeaderDrivenAccess().getDefaultAssignment_8()); 

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
    // $ANTLR end "rule__LeaderDriven__Group__8__Impl"


    // $ANTLR start "rule__LeaderDriven__Group__9"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3247:1: rule__LeaderDriven__Group__9 : rule__LeaderDriven__Group__9__Impl rule__LeaderDriven__Group__10 ;
    public final void rule__LeaderDriven__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3251:1: ( rule__LeaderDriven__Group__9__Impl rule__LeaderDriven__Group__10 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3252:2: rule__LeaderDriven__Group__9__Impl rule__LeaderDriven__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__9__Impl_in_rule__LeaderDriven__Group__96473);
            rule__LeaderDriven__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__10_in_rule__LeaderDriven__Group__96476);
            rule__LeaderDriven__Group__10();

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
    // $ANTLR end "rule__LeaderDriven__Group__9"


    // $ANTLR start "rule__LeaderDriven__Group__9__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3259:1: rule__LeaderDriven__Group__9__Impl : ( 'deadline' ) ;
    public final void rule__LeaderDriven__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3263:1: ( ( 'deadline' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3264:1: ( 'deadline' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3264:1: ( 'deadline' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3265:1: 'deadline'
            {
             before(grammarAccess.getLeaderDrivenAccess().getDeadlineKeyword_9()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__LeaderDriven__Group__9__Impl6504); 
             after(grammarAccess.getLeaderDrivenAccess().getDeadlineKeyword_9()); 

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
    // $ANTLR end "rule__LeaderDriven__Group__9__Impl"


    // $ANTLR start "rule__LeaderDriven__Group__10"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3278:1: rule__LeaderDriven__Group__10 : rule__LeaderDriven__Group__10__Impl rule__LeaderDriven__Group__11 ;
    public final void rule__LeaderDriven__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3282:1: ( rule__LeaderDriven__Group__10__Impl rule__LeaderDriven__Group__11 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3283:2: rule__LeaderDriven__Group__10__Impl rule__LeaderDriven__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__10__Impl_in_rule__LeaderDriven__Group__106535);
            rule__LeaderDriven__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__11_in_rule__LeaderDriven__Group__106538);
            rule__LeaderDriven__Group__11();

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
    // $ANTLR end "rule__LeaderDriven__Group__10"


    // $ANTLR start "rule__LeaderDriven__Group__10__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3290:1: rule__LeaderDriven__Group__10__Impl : ( ( rule__LeaderDriven__DeadlineAssignment_10 ) ) ;
    public final void rule__LeaderDriven__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3294:1: ( ( ( rule__LeaderDriven__DeadlineAssignment_10 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3295:1: ( ( rule__LeaderDriven__DeadlineAssignment_10 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3295:1: ( ( rule__LeaderDriven__DeadlineAssignment_10 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3296:1: ( rule__LeaderDriven__DeadlineAssignment_10 )
            {
             before(grammarAccess.getLeaderDrivenAccess().getDeadlineAssignment_10()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3297:1: ( rule__LeaderDriven__DeadlineAssignment_10 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3297:2: rule__LeaderDriven__DeadlineAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__DeadlineAssignment_10_in_rule__LeaderDriven__Group__10__Impl6565);
            rule__LeaderDriven__DeadlineAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getLeaderDrivenAccess().getDeadlineAssignment_10()); 

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
    // $ANTLR end "rule__LeaderDriven__Group__10__Impl"


    // $ANTLR start "rule__LeaderDriven__Group__11"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3307:1: rule__LeaderDriven__Group__11 : rule__LeaderDriven__Group__11__Impl ;
    public final void rule__LeaderDriven__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3311:1: ( rule__LeaderDriven__Group__11__Impl )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3312:2: rule__LeaderDriven__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__11__Impl_in_rule__LeaderDriven__Group__116595);
            rule__LeaderDriven__Group__11__Impl();

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
    // $ANTLR end "rule__LeaderDriven__Group__11"


    // $ANTLR start "rule__LeaderDriven__Group__11__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3318:1: rule__LeaderDriven__Group__11__Impl : ( '}' ) ;
    public final void rule__LeaderDriven__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3322:1: ( ( '}' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3323:1: ( '}' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3323:1: ( '}' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3324:1: '}'
            {
             before(grammarAccess.getLeaderDrivenAccess().getRightCurlyBracketKeyword_11()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__LeaderDriven__Group__11__Impl6623); 
             after(grammarAccess.getLeaderDrivenAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__LeaderDriven__Group__11__Impl"


    // $ANTLR start "rule__LeaderDriven__Group_6__0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3361:1: rule__LeaderDriven__Group_6__0 : rule__LeaderDriven__Group_6__0__Impl rule__LeaderDriven__Group_6__1 ;
    public final void rule__LeaderDriven__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3365:1: ( rule__LeaderDriven__Group_6__0__Impl rule__LeaderDriven__Group_6__1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3366:2: rule__LeaderDriven__Group_6__0__Impl rule__LeaderDriven__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group_6__0__Impl_in_rule__LeaderDriven__Group_6__06678);
            rule__LeaderDriven__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group_6__1_in_rule__LeaderDriven__Group_6__06681);
            rule__LeaderDriven__Group_6__1();

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
    // $ANTLR end "rule__LeaderDriven__Group_6__0"


    // $ANTLR start "rule__LeaderDriven__Group_6__0__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3373:1: rule__LeaderDriven__Group_6__0__Impl : ( '(' ) ;
    public final void rule__LeaderDriven__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3377:1: ( ( '(' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3378:1: ( '(' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3378:1: ( '(' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3379:1: '('
            {
             before(grammarAccess.getLeaderDrivenAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__LeaderDriven__Group_6__0__Impl6709); 
             after(grammarAccess.getLeaderDrivenAccess().getLeftParenthesisKeyword_6_0()); 

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
    // $ANTLR end "rule__LeaderDriven__Group_6__0__Impl"


    // $ANTLR start "rule__LeaderDriven__Group_6__1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3392:1: rule__LeaderDriven__Group_6__1 : rule__LeaderDriven__Group_6__1__Impl rule__LeaderDriven__Group_6__2 ;
    public final void rule__LeaderDriven__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3396:1: ( rule__LeaderDriven__Group_6__1__Impl rule__LeaderDriven__Group_6__2 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3397:2: rule__LeaderDriven__Group_6__1__Impl rule__LeaderDriven__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group_6__1__Impl_in_rule__LeaderDriven__Group_6__16740);
            rule__LeaderDriven__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group_6__2_in_rule__LeaderDriven__Group_6__16743);
            rule__LeaderDriven__Group_6__2();

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
    // $ANTLR end "rule__LeaderDriven__Group_6__1"


    // $ANTLR start "rule__LeaderDriven__Group_6__1__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3404:1: rule__LeaderDriven__Group_6__1__Impl : ( ( rule__LeaderDriven__FilterAssignment_6_1 ) ) ;
    public final void rule__LeaderDriven__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3408:1: ( ( ( rule__LeaderDriven__FilterAssignment_6_1 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3409:1: ( ( rule__LeaderDriven__FilterAssignment_6_1 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3409:1: ( ( rule__LeaderDriven__FilterAssignment_6_1 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3410:1: ( rule__LeaderDriven__FilterAssignment_6_1 )
            {
             before(grammarAccess.getLeaderDrivenAccess().getFilterAssignment_6_1()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3411:1: ( rule__LeaderDriven__FilterAssignment_6_1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3411:2: rule__LeaderDriven__FilterAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__FilterAssignment_6_1_in_rule__LeaderDriven__Group_6__1__Impl6770);
            rule__LeaderDriven__FilterAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLeaderDrivenAccess().getFilterAssignment_6_1()); 

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
    // $ANTLR end "rule__LeaderDriven__Group_6__1__Impl"


    // $ANTLR start "rule__LeaderDriven__Group_6__2"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3421:1: rule__LeaderDriven__Group_6__2 : rule__LeaderDriven__Group_6__2__Impl ;
    public final void rule__LeaderDriven__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3425:1: ( rule__LeaderDriven__Group_6__2__Impl )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3426:2: rule__LeaderDriven__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group_6__2__Impl_in_rule__LeaderDriven__Group_6__26800);
            rule__LeaderDriven__Group_6__2__Impl();

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
    // $ANTLR end "rule__LeaderDriven__Group_6__2"


    // $ANTLR start "rule__LeaderDriven__Group_6__2__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3432:1: rule__LeaderDriven__Group_6__2__Impl : ( ')' ) ;
    public final void rule__LeaderDriven__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3436:1: ( ( ')' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3437:1: ( ')' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3437:1: ( ')' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3438:1: ')'
            {
             before(grammarAccess.getLeaderDrivenAccess().getRightParenthesisKeyword_6_2()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__LeaderDriven__Group_6__2__Impl6828); 
             after(grammarAccess.getLeaderDrivenAccess().getRightParenthesisKeyword_6_2()); 

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
    // $ANTLR end "rule__LeaderDriven__Group_6__2__Impl"


    // $ANTLR start "rule__PhasedStrategy__Group__0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3457:1: rule__PhasedStrategy__Group__0 : rule__PhasedStrategy__Group__0__Impl rule__PhasedStrategy__Group__1 ;
    public final void rule__PhasedStrategy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3461:1: ( rule__PhasedStrategy__Group__0__Impl rule__PhasedStrategy__Group__1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3462:2: rule__PhasedStrategy__Group__0__Impl rule__PhasedStrategy__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__0__Impl_in_rule__PhasedStrategy__Group__06865);
            rule__PhasedStrategy__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__1_in_rule__PhasedStrategy__Group__06868);
            rule__PhasedStrategy__Group__1();

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
    // $ANTLR end "rule__PhasedStrategy__Group__0"


    // $ANTLR start "rule__PhasedStrategy__Group__0__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3469:1: rule__PhasedStrategy__Group__0__Impl : ( ( rule__PhasedStrategy__NameAssignment_0 ) ) ;
    public final void rule__PhasedStrategy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3473:1: ( ( ( rule__PhasedStrategy__NameAssignment_0 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3474:1: ( ( rule__PhasedStrategy__NameAssignment_0 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3474:1: ( ( rule__PhasedStrategy__NameAssignment_0 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3475:1: ( rule__PhasedStrategy__NameAssignment_0 )
            {
             before(grammarAccess.getPhasedStrategyAccess().getNameAssignment_0()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3476:1: ( rule__PhasedStrategy__NameAssignment_0 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3476:2: rule__PhasedStrategy__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__NameAssignment_0_in_rule__PhasedStrategy__Group__0__Impl6895);
            rule__PhasedStrategy__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPhasedStrategyAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__PhasedStrategy__Group__0__Impl"


    // $ANTLR start "rule__PhasedStrategy__Group__1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3486:1: rule__PhasedStrategy__Group__1 : rule__PhasedStrategy__Group__1__Impl rule__PhasedStrategy__Group__2 ;
    public final void rule__PhasedStrategy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3490:1: ( rule__PhasedStrategy__Group__1__Impl rule__PhasedStrategy__Group__2 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3491:2: rule__PhasedStrategy__Group__1__Impl rule__PhasedStrategy__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__1__Impl_in_rule__PhasedStrategy__Group__16925);
            rule__PhasedStrategy__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__2_in_rule__PhasedStrategy__Group__16928);
            rule__PhasedStrategy__Group__2();

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
    // $ANTLR end "rule__PhasedStrategy__Group__1"


    // $ANTLR start "rule__PhasedStrategy__Group__1__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3498:1: rule__PhasedStrategy__Group__1__Impl : ( ':' ) ;
    public final void rule__PhasedStrategy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3502:1: ( ( ':' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3503:1: ( ':' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3503:1: ( ':' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3504:1: ':'
            {
             before(grammarAccess.getPhasedStrategyAccess().getColonKeyword_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__PhasedStrategy__Group__1__Impl6956); 
             after(grammarAccess.getPhasedStrategyAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__PhasedStrategy__Group__1__Impl"


    // $ANTLR start "rule__PhasedStrategy__Group__2"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3517:1: rule__PhasedStrategy__Group__2 : rule__PhasedStrategy__Group__2__Impl rule__PhasedStrategy__Group__3 ;
    public final void rule__PhasedStrategy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3521:1: ( rule__PhasedStrategy__Group__2__Impl rule__PhasedStrategy__Group__3 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3522:2: rule__PhasedStrategy__Group__2__Impl rule__PhasedStrategy__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__2__Impl_in_rule__PhasedStrategy__Group__26987);
            rule__PhasedStrategy__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__3_in_rule__PhasedStrategy__Group__26990);
            rule__PhasedStrategy__Group__3();

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
    // $ANTLR end "rule__PhasedStrategy__Group__2"


    // $ANTLR start "rule__PhasedStrategy__Group__2__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3529:1: rule__PhasedStrategy__Group__2__Impl : ( 'Ratio' ) ;
    public final void rule__PhasedStrategy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3533:1: ( ( 'Ratio' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3534:1: ( 'Ratio' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3534:1: ( 'Ratio' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3535:1: 'Ratio'
            {
             before(grammarAccess.getPhasedStrategyAccess().getRatioKeyword_2()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__PhasedStrategy__Group__2__Impl7018); 
             after(grammarAccess.getPhasedStrategyAccess().getRatioKeyword_2()); 

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
    // $ANTLR end "rule__PhasedStrategy__Group__2__Impl"


    // $ANTLR start "rule__PhasedStrategy__Group__3"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3548:1: rule__PhasedStrategy__Group__3 : rule__PhasedStrategy__Group__3__Impl rule__PhasedStrategy__Group__4 ;
    public final void rule__PhasedStrategy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3552:1: ( rule__PhasedStrategy__Group__3__Impl rule__PhasedStrategy__Group__4 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3553:2: rule__PhasedStrategy__Group__3__Impl rule__PhasedStrategy__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__3__Impl_in_rule__PhasedStrategy__Group__37049);
            rule__PhasedStrategy__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__4_in_rule__PhasedStrategy__Group__37052);
            rule__PhasedStrategy__Group__4();

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
    // $ANTLR end "rule__PhasedStrategy__Group__3"


    // $ANTLR start "rule__PhasedStrategy__Group__3__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3560:1: rule__PhasedStrategy__Group__3__Impl : ( '{' ) ;
    public final void rule__PhasedStrategy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3564:1: ( ( '{' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3565:1: ( '{' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3565:1: ( '{' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3566:1: '{'
            {
             before(grammarAccess.getPhasedStrategyAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__PhasedStrategy__Group__3__Impl7080); 
             after(grammarAccess.getPhasedStrategyAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__PhasedStrategy__Group__3__Impl"


    // $ANTLR start "rule__PhasedStrategy__Group__4"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3579:1: rule__PhasedStrategy__Group__4 : rule__PhasedStrategy__Group__4__Impl rule__PhasedStrategy__Group__5 ;
    public final void rule__PhasedStrategy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3583:1: ( rule__PhasedStrategy__Group__4__Impl rule__PhasedStrategy__Group__5 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3584:2: rule__PhasedStrategy__Group__4__Impl rule__PhasedStrategy__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__4__Impl_in_rule__PhasedStrategy__Group__47111);
            rule__PhasedStrategy__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__5_in_rule__PhasedStrategy__Group__47114);
            rule__PhasedStrategy__Group__5();

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
    // $ANTLR end "rule__PhasedStrategy__Group__4"


    // $ANTLR start "rule__PhasedStrategy__Group__4__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3591:1: rule__PhasedStrategy__Group__4__Impl : ( 'phases' ) ;
    public final void rule__PhasedStrategy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3595:1: ( ( 'phases' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3596:1: ( 'phases' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3596:1: ( 'phases' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3597:1: 'phases'
            {
             before(grammarAccess.getPhasedStrategyAccess().getPhasesKeyword_4()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__PhasedStrategy__Group__4__Impl7142); 
             after(grammarAccess.getPhasedStrategyAccess().getPhasesKeyword_4()); 

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
    // $ANTLR end "rule__PhasedStrategy__Group__4__Impl"


    // $ANTLR start "rule__PhasedStrategy__Group__5"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3610:1: rule__PhasedStrategy__Group__5 : rule__PhasedStrategy__Group__5__Impl rule__PhasedStrategy__Group__6 ;
    public final void rule__PhasedStrategy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3614:1: ( rule__PhasedStrategy__Group__5__Impl rule__PhasedStrategy__Group__6 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3615:2: rule__PhasedStrategy__Group__5__Impl rule__PhasedStrategy__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__5__Impl_in_rule__PhasedStrategy__Group__57173);
            rule__PhasedStrategy__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__6_in_rule__PhasedStrategy__Group__57176);
            rule__PhasedStrategy__Group__6();

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
    // $ANTLR end "rule__PhasedStrategy__Group__5"


    // $ANTLR start "rule__PhasedStrategy__Group__5__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3622:1: rule__PhasedStrategy__Group__5__Impl : ( '{' ) ;
    public final void rule__PhasedStrategy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3626:1: ( ( '{' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3627:1: ( '{' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3627:1: ( '{' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3628:1: '{'
            {
             before(grammarAccess.getPhasedStrategyAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__PhasedStrategy__Group__5__Impl7204); 
             after(grammarAccess.getPhasedStrategyAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__PhasedStrategy__Group__5__Impl"


    // $ANTLR start "rule__PhasedStrategy__Group__6"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3641:1: rule__PhasedStrategy__Group__6 : rule__PhasedStrategy__Group__6__Impl rule__PhasedStrategy__Group__7 ;
    public final void rule__PhasedStrategy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3645:1: ( rule__PhasedStrategy__Group__6__Impl rule__PhasedStrategy__Group__7 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3646:2: rule__PhasedStrategy__Group__6__Impl rule__PhasedStrategy__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__6__Impl_in_rule__PhasedStrategy__Group__67235);
            rule__PhasedStrategy__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__7_in_rule__PhasedStrategy__Group__67238);
            rule__PhasedStrategy__Group__7();

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
    // $ANTLR end "rule__PhasedStrategy__Group__6"


    // $ANTLR start "rule__PhasedStrategy__Group__6__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3653:1: rule__PhasedStrategy__Group__6__Impl : ( ( rule__PhasedStrategy__PhasesAssignment_6 )* ) ;
    public final void rule__PhasedStrategy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3657:1: ( ( ( rule__PhasedStrategy__PhasesAssignment_6 )* ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3658:1: ( ( rule__PhasedStrategy__PhasesAssignment_6 )* )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3658:1: ( ( rule__PhasedStrategy__PhasesAssignment_6 )* )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3659:1: ( rule__PhasedStrategy__PhasesAssignment_6 )*
            {
             before(grammarAccess.getPhasedStrategyAccess().getPhasesAssignment_6()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3660:1: ( rule__PhasedStrategy__PhasesAssignment_6 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3660:2: rule__PhasedStrategy__PhasesAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__PhasesAssignment_6_in_rule__PhasedStrategy__Group__6__Impl7265);
            	    rule__PhasedStrategy__PhasesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getPhasedStrategyAccess().getPhasesAssignment_6()); 

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
    // $ANTLR end "rule__PhasedStrategy__Group__6__Impl"


    // $ANTLR start "rule__PhasedStrategy__Group__7"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3670:1: rule__PhasedStrategy__Group__7 : rule__PhasedStrategy__Group__7__Impl rule__PhasedStrategy__Group__8 ;
    public final void rule__PhasedStrategy__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3674:1: ( rule__PhasedStrategy__Group__7__Impl rule__PhasedStrategy__Group__8 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3675:2: rule__PhasedStrategy__Group__7__Impl rule__PhasedStrategy__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__7__Impl_in_rule__PhasedStrategy__Group__77296);
            rule__PhasedStrategy__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__8_in_rule__PhasedStrategy__Group__77299);
            rule__PhasedStrategy__Group__8();

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
    // $ANTLR end "rule__PhasedStrategy__Group__7"


    // $ANTLR start "rule__PhasedStrategy__Group__7__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3682:1: rule__PhasedStrategy__Group__7__Impl : ( '}' ) ;
    public final void rule__PhasedStrategy__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3686:1: ( ( '}' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3687:1: ( '}' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3687:1: ( '}' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3688:1: '}'
            {
             before(grammarAccess.getPhasedStrategyAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__PhasedStrategy__Group__7__Impl7327); 
             after(grammarAccess.getPhasedStrategyAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__PhasedStrategy__Group__7__Impl"


    // $ANTLR start "rule__PhasedStrategy__Group__8"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3701:1: rule__PhasedStrategy__Group__8 : rule__PhasedStrategy__Group__8__Impl ;
    public final void rule__PhasedStrategy__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3705:1: ( rule__PhasedStrategy__Group__8__Impl )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3706:2: rule__PhasedStrategy__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__8__Impl_in_rule__PhasedStrategy__Group__87358);
            rule__PhasedStrategy__Group__8__Impl();

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
    // $ANTLR end "rule__PhasedStrategy__Group__8"


    // $ANTLR start "rule__PhasedStrategy__Group__8__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3712:1: rule__PhasedStrategy__Group__8__Impl : ( '}' ) ;
    public final void rule__PhasedStrategy__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3716:1: ( ( '}' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3717:1: ( '}' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3717:1: ( '}' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3718:1: '}'
            {
             before(grammarAccess.getPhasedStrategyAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__PhasedStrategy__Group__8__Impl7386); 
             after(grammarAccess.getPhasedStrategyAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__PhasedStrategy__Group__8__Impl"


    // $ANTLR start "rule__Filter__Group__0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3749:1: rule__Filter__Group__0 : rule__Filter__Group__0__Impl rule__Filter__Group__1 ;
    public final void rule__Filter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3753:1: ( rule__Filter__Group__0__Impl rule__Filter__Group__1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3754:2: rule__Filter__Group__0__Impl rule__Filter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group__0__Impl_in_rule__Filter__Group__07435);
            rule__Filter__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group__1_in_rule__Filter__Group__07438);
            rule__Filter__Group__1();

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
    // $ANTLR end "rule__Filter__Group__0"


    // $ANTLR start "rule__Filter__Group__0__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3761:1: rule__Filter__Group__0__Impl : ( ( rule__Filter__Group_0__0 ) ) ;
    public final void rule__Filter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3765:1: ( ( ( rule__Filter__Group_0__0 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3766:1: ( ( rule__Filter__Group_0__0 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3766:1: ( ( rule__Filter__Group_0__0 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3767:1: ( rule__Filter__Group_0__0 )
            {
             before(grammarAccess.getFilterAccess().getGroup_0()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3768:1: ( rule__Filter__Group_0__0 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3768:2: rule__Filter__Group_0__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_0__0_in_rule__Filter__Group__0__Impl7465);
            rule__Filter__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getGroup_0()); 

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
    // $ANTLR end "rule__Filter__Group__0__Impl"


    // $ANTLR start "rule__Filter__Group__1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3778:1: rule__Filter__Group__1 : rule__Filter__Group__1__Impl ;
    public final void rule__Filter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3782:1: ( rule__Filter__Group__1__Impl )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3783:2: rule__Filter__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group__1__Impl_in_rule__Filter__Group__17495);
            rule__Filter__Group__1__Impl();

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
    // $ANTLR end "rule__Filter__Group__1"


    // $ANTLR start "rule__Filter__Group__1__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3789:1: rule__Filter__Group__1__Impl : ( ( rule__Filter__Group_1__0 )? ) ;
    public final void rule__Filter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3793:1: ( ( ( rule__Filter__Group_1__0 )? ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3794:1: ( ( rule__Filter__Group_1__0 )? )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3794:1: ( ( rule__Filter__Group_1__0 )? )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3795:1: ( rule__Filter__Group_1__0 )?
            {
             before(grammarAccess.getFilterAccess().getGroup_1()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3796:1: ( rule__Filter__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3796:2: rule__Filter__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_1__0_in_rule__Filter__Group__1__Impl7522);
                    rule__Filter__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Filter__Group__1__Impl"


    // $ANTLR start "rule__Filter__Group_0__0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3810:1: rule__Filter__Group_0__0 : rule__Filter__Group_0__0__Impl rule__Filter__Group_0__1 ;
    public final void rule__Filter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3814:1: ( rule__Filter__Group_0__0__Impl rule__Filter__Group_0__1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3815:2: rule__Filter__Group_0__0__Impl rule__Filter__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_0__0__Impl_in_rule__Filter__Group_0__07557);
            rule__Filter__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_0__1_in_rule__Filter__Group_0__07560);
            rule__Filter__Group_0__1();

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
    // $ANTLR end "rule__Filter__Group_0__0"


    // $ANTLR start "rule__Filter__Group_0__0__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3822:1: rule__Filter__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__Filter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3826:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3827:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3827:1: ( RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3828:1: RULE_ID
            {
             before(grammarAccess.getFilterAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Filter__Group_0__0__Impl7587); 
             after(grammarAccess.getFilterAccess().getIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Filter__Group_0__0__Impl"


    // $ANTLR start "rule__Filter__Group_0__1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3839:1: rule__Filter__Group_0__1 : rule__Filter__Group_0__1__Impl rule__Filter__Group_0__2 ;
    public final void rule__Filter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3843:1: ( rule__Filter__Group_0__1__Impl rule__Filter__Group_0__2 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3844:2: rule__Filter__Group_0__1__Impl rule__Filter__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_0__1__Impl_in_rule__Filter__Group_0__17616);
            rule__Filter__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_0__2_in_rule__Filter__Group_0__17619);
            rule__Filter__Group_0__2();

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
    // $ANTLR end "rule__Filter__Group_0__1"


    // $ANTLR start "rule__Filter__Group_0__1__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3851:1: rule__Filter__Group_0__1__Impl : ( '=' ) ;
    public final void rule__Filter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3855:1: ( ( '=' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3856:1: ( '=' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3856:1: ( '=' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3857:1: '='
            {
             before(grammarAccess.getFilterAccess().getEqualsSignKeyword_0_1()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Filter__Group_0__1__Impl7647); 
             after(grammarAccess.getFilterAccess().getEqualsSignKeyword_0_1()); 

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
    // $ANTLR end "rule__Filter__Group_0__1__Impl"


    // $ANTLR start "rule__Filter__Group_0__2"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3870:1: rule__Filter__Group_0__2 : rule__Filter__Group_0__2__Impl ;
    public final void rule__Filter__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3874:1: ( rule__Filter__Group_0__2__Impl )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3875:2: rule__Filter__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_0__2__Impl_in_rule__Filter__Group_0__27678);
            rule__Filter__Group_0__2__Impl();

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
    // $ANTLR end "rule__Filter__Group_0__2"


    // $ANTLR start "rule__Filter__Group_0__2__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3881:1: rule__Filter__Group_0__2__Impl : ( RULE_ID ) ;
    public final void rule__Filter__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3885:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3886:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3886:1: ( RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3887:1: RULE_ID
            {
             before(grammarAccess.getFilterAccess().getIDTerminalRuleCall_0_2()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Filter__Group_0__2__Impl7705); 
             after(grammarAccess.getFilterAccess().getIDTerminalRuleCall_0_2()); 

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
    // $ANTLR end "rule__Filter__Group_0__2__Impl"


    // $ANTLR start "rule__Filter__Group_1__0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3904:1: rule__Filter__Group_1__0 : rule__Filter__Group_1__0__Impl rule__Filter__Group_1__1 ;
    public final void rule__Filter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3908:1: ( rule__Filter__Group_1__0__Impl rule__Filter__Group_1__1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3909:2: rule__Filter__Group_1__0__Impl rule__Filter__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_1__0__Impl_in_rule__Filter__Group_1__07740);
            rule__Filter__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_1__1_in_rule__Filter__Group_1__07743);
            rule__Filter__Group_1__1();

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
    // $ANTLR end "rule__Filter__Group_1__0"


    // $ANTLR start "rule__Filter__Group_1__0__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3916:1: rule__Filter__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Filter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3920:1: ( ( ',' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3921:1: ( ',' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3921:1: ( ',' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3922:1: ','
            {
             before(grammarAccess.getFilterAccess().getCommaKeyword_1_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Filter__Group_1__0__Impl7771); 
             after(grammarAccess.getFilterAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__Filter__Group_1__0__Impl"


    // $ANTLR start "rule__Filter__Group_1__1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3935:1: rule__Filter__Group_1__1 : rule__Filter__Group_1__1__Impl rule__Filter__Group_1__2 ;
    public final void rule__Filter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3939:1: ( rule__Filter__Group_1__1__Impl rule__Filter__Group_1__2 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3940:2: rule__Filter__Group_1__1__Impl rule__Filter__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_1__1__Impl_in_rule__Filter__Group_1__17802);
            rule__Filter__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_1__2_in_rule__Filter__Group_1__17805);
            rule__Filter__Group_1__2();

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
    // $ANTLR end "rule__Filter__Group_1__1"


    // $ANTLR start "rule__Filter__Group_1__1__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3947:1: rule__Filter__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Filter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3951:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3952:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3952:1: ( RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3953:1: RULE_ID
            {
             before(grammarAccess.getFilterAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Filter__Group_1__1__Impl7832); 
             after(grammarAccess.getFilterAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Filter__Group_1__1__Impl"


    // $ANTLR start "rule__Filter__Group_1__2"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3964:1: rule__Filter__Group_1__2 : rule__Filter__Group_1__2__Impl rule__Filter__Group_1__3 ;
    public final void rule__Filter__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3968:1: ( rule__Filter__Group_1__2__Impl rule__Filter__Group_1__3 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3969:2: rule__Filter__Group_1__2__Impl rule__Filter__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_1__2__Impl_in_rule__Filter__Group_1__27861);
            rule__Filter__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_1__3_in_rule__Filter__Group_1__27864);
            rule__Filter__Group_1__3();

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
    // $ANTLR end "rule__Filter__Group_1__2"


    // $ANTLR start "rule__Filter__Group_1__2__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3976:1: rule__Filter__Group_1__2__Impl : ( '=' ) ;
    public final void rule__Filter__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3980:1: ( ( '=' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3981:1: ( '=' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3981:1: ( '=' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3982:1: '='
            {
             before(grammarAccess.getFilterAccess().getEqualsSignKeyword_1_2()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Filter__Group_1__2__Impl7892); 
             after(grammarAccess.getFilterAccess().getEqualsSignKeyword_1_2()); 

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
    // $ANTLR end "rule__Filter__Group_1__2__Impl"


    // $ANTLR start "rule__Filter__Group_1__3"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3995:1: rule__Filter__Group_1__3 : rule__Filter__Group_1__3__Impl ;
    public final void rule__Filter__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:3999:1: ( rule__Filter__Group_1__3__Impl )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4000:2: rule__Filter__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_1__3__Impl_in_rule__Filter__Group_1__37923);
            rule__Filter__Group_1__3__Impl();

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
    // $ANTLR end "rule__Filter__Group_1__3"


    // $ANTLR start "rule__Filter__Group_1__3__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4006:1: rule__Filter__Group_1__3__Impl : ( RULE_ID ) ;
    public final void rule__Filter__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4010:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4011:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4011:1: ( RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4012:1: RULE_ID
            {
             before(grammarAccess.getFilterAccess().getIDTerminalRuleCall_1_3()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Filter__Group_1__3__Impl7950); 
             after(grammarAccess.getFilterAccess().getIDTerminalRuleCall_1_3()); 

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
    // $ANTLR end "rule__Filter__Group_1__3__Impl"


    // $ANTLR start "rule__Timer__Group__0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4031:1: rule__Timer__Group__0 : rule__Timer__Group__0__Impl rule__Timer__Group__1 ;
    public final void rule__Timer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4035:1: ( rule__Timer__Group__0__Impl rule__Timer__Group__1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4036:2: rule__Timer__Group__0__Impl rule__Timer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Timer__Group__0__Impl_in_rule__Timer__Group__07987);
            rule__Timer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Timer__Group__1_in_rule__Timer__Group__07990);
            rule__Timer__Group__1();

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
    // $ANTLR end "rule__Timer__Group__0"


    // $ANTLR start "rule__Timer__Group__0__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4043:1: rule__Timer__Group__0__Impl : ( () ) ;
    public final void rule__Timer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4047:1: ( ( () ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4048:1: ( () )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4048:1: ( () )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4049:1: ()
            {
             before(grammarAccess.getTimerAccess().getTimerAction_0()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4050:1: ()
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4052:1: 
            {
            }

             after(grammarAccess.getTimerAccess().getTimerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timer__Group__0__Impl"


    // $ANTLR start "rule__Timer__Group__1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4062:1: rule__Timer__Group__1 : rule__Timer__Group__1__Impl rule__Timer__Group__2 ;
    public final void rule__Timer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4066:1: ( rule__Timer__Group__1__Impl rule__Timer__Group__2 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4067:2: rule__Timer__Group__1__Impl rule__Timer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Timer__Group__1__Impl_in_rule__Timer__Group__18048);
            rule__Timer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Timer__Group__2_in_rule__Timer__Group__18051);
            rule__Timer__Group__2();

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
    // $ANTLR end "rule__Timer__Group__1"


    // $ANTLR start "rule__Timer__Group__1__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4074:1: rule__Timer__Group__1__Impl : ( ( rule__Timer__NameAssignment_1 ) ) ;
    public final void rule__Timer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4078:1: ( ( ( rule__Timer__NameAssignment_1 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4079:1: ( ( rule__Timer__NameAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4079:1: ( ( rule__Timer__NameAssignment_1 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4080:1: ( rule__Timer__NameAssignment_1 )
            {
             before(grammarAccess.getTimerAccess().getNameAssignment_1()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4081:1: ( rule__Timer__NameAssignment_1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4081:2: rule__Timer__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Timer__NameAssignment_1_in_rule__Timer__Group__1__Impl8078);
            rule__Timer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Timer__Group__1__Impl"


    // $ANTLR start "rule__Timer__Group__2"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4091:1: rule__Timer__Group__2 : rule__Timer__Group__2__Impl rule__Timer__Group__3 ;
    public final void rule__Timer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4095:1: ( rule__Timer__Group__2__Impl rule__Timer__Group__3 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4096:2: rule__Timer__Group__2__Impl rule__Timer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Timer__Group__2__Impl_in_rule__Timer__Group__28108);
            rule__Timer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Timer__Group__3_in_rule__Timer__Group__28111);
            rule__Timer__Group__3();

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
    // $ANTLR end "rule__Timer__Group__2"


    // $ANTLR start "rule__Timer__Group__2__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4103:1: rule__Timer__Group__2__Impl : ( ':' ) ;
    public final void rule__Timer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4107:1: ( ( ':' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4108:1: ( ':' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4108:1: ( ':' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4109:1: ':'
            {
             before(grammarAccess.getTimerAccess().getColonKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Timer__Group__2__Impl8139); 
             after(grammarAccess.getTimerAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Timer__Group__2__Impl"


    // $ANTLR start "rule__Timer__Group__3"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4122:1: rule__Timer__Group__3 : rule__Timer__Group__3__Impl rule__Timer__Group__4 ;
    public final void rule__Timer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4126:1: ( rule__Timer__Group__3__Impl rule__Timer__Group__4 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4127:2: rule__Timer__Group__3__Impl rule__Timer__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Timer__Group__3__Impl_in_rule__Timer__Group__38170);
            rule__Timer__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Timer__Group__4_in_rule__Timer__Group__38173);
            rule__Timer__Group__4();

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
    // $ANTLR end "rule__Timer__Group__3"


    // $ANTLR start "rule__Timer__Group__3__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4134:1: rule__Timer__Group__3__Impl : ( ( rule__Timer__TimeStampAssignment_3 ) ) ;
    public final void rule__Timer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4138:1: ( ( ( rule__Timer__TimeStampAssignment_3 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4139:1: ( ( rule__Timer__TimeStampAssignment_3 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4139:1: ( ( rule__Timer__TimeStampAssignment_3 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4140:1: ( rule__Timer__TimeStampAssignment_3 )
            {
             before(grammarAccess.getTimerAccess().getTimeStampAssignment_3()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4141:1: ( rule__Timer__TimeStampAssignment_3 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4141:2: rule__Timer__TimeStampAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Timer__TimeStampAssignment_3_in_rule__Timer__Group__3__Impl8200);
            rule__Timer__TimeStampAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getTimeStampAssignment_3()); 

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
    // $ANTLR end "rule__Timer__Group__3__Impl"


    // $ANTLR start "rule__Timer__Group__4"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4151:1: rule__Timer__Group__4 : rule__Timer__Group__4__Impl ;
    public final void rule__Timer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4155:1: ( rule__Timer__Group__4__Impl )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4156:2: rule__Timer__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Timer__Group__4__Impl_in_rule__Timer__Group__48230);
            rule__Timer__Group__4__Impl();

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
    // $ANTLR end "rule__Timer__Group__4"


    // $ANTLR start "rule__Timer__Group__4__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4162:1: rule__Timer__Group__4__Impl : ( 'days' ) ;
    public final void rule__Timer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4166:1: ( ( 'days' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4167:1: ( 'days' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4167:1: ( 'days' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4168:1: 'days'
            {
             before(grammarAccess.getTimerAccess().getDaysKeyword_4()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Timer__Group__4__Impl8258); 
             after(grammarAccess.getTimerAccess().getDaysKeyword_4()); 

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
    // $ANTLR end "rule__Timer__Group__4__Impl"


    // $ANTLR start "rule__WaitForVote__Group__0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4191:1: rule__WaitForVote__Group__0 : rule__WaitForVote__Group__0__Impl rule__WaitForVote__Group__1 ;
    public final void rule__WaitForVote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4195:1: ( rule__WaitForVote__Group__0__Impl rule__WaitForVote__Group__1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4196:2: rule__WaitForVote__Group__0__Impl rule__WaitForVote__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WaitForVote__Group__0__Impl_in_rule__WaitForVote__Group__08299);
            rule__WaitForVote__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WaitForVote__Group__1_in_rule__WaitForVote__Group__08302);
            rule__WaitForVote__Group__1();

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
    // $ANTLR end "rule__WaitForVote__Group__0"


    // $ANTLR start "rule__WaitForVote__Group__0__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4203:1: rule__WaitForVote__Group__0__Impl : ( ( rule__WaitForVote__RolesAssignment_0 ) ) ;
    public final void rule__WaitForVote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4207:1: ( ( ( rule__WaitForVote__RolesAssignment_0 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4208:1: ( ( rule__WaitForVote__RolesAssignment_0 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4208:1: ( ( rule__WaitForVote__RolesAssignment_0 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4209:1: ( rule__WaitForVote__RolesAssignment_0 )
            {
             before(grammarAccess.getWaitForVoteAccess().getRolesAssignment_0()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4210:1: ( rule__WaitForVote__RolesAssignment_0 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4210:2: rule__WaitForVote__RolesAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__WaitForVote__RolesAssignment_0_in_rule__WaitForVote__Group__0__Impl8329);
            rule__WaitForVote__RolesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWaitForVoteAccess().getRolesAssignment_0()); 

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
    // $ANTLR end "rule__WaitForVote__Group__0__Impl"


    // $ANTLR start "rule__WaitForVote__Group__1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4220:1: rule__WaitForVote__Group__1 : rule__WaitForVote__Group__1__Impl ;
    public final void rule__WaitForVote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4224:1: ( rule__WaitForVote__Group__1__Impl )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4225:2: rule__WaitForVote__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WaitForVote__Group__1__Impl_in_rule__WaitForVote__Group__18359);
            rule__WaitForVote__Group__1__Impl();

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
    // $ANTLR end "rule__WaitForVote__Group__1"


    // $ANTLR start "rule__WaitForVote__Group__1__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4231:1: rule__WaitForVote__Group__1__Impl : ( ( rule__WaitForVote__Group_1__0 )* ) ;
    public final void rule__WaitForVote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4235:1: ( ( ( rule__WaitForVote__Group_1__0 )* ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4236:1: ( ( rule__WaitForVote__Group_1__0 )* )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4236:1: ( ( rule__WaitForVote__Group_1__0 )* )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4237:1: ( rule__WaitForVote__Group_1__0 )*
            {
             before(grammarAccess.getWaitForVoteAccess().getGroup_1()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4238:1: ( rule__WaitForVote__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==22) ) {
                    int LA22_2 = input.LA(2);

                    if ( (LA22_2==RULE_ID) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4238:2: rule__WaitForVote__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__WaitForVote__Group_1__0_in_rule__WaitForVote__Group__1__Impl8386);
            	    rule__WaitForVote__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getWaitForVoteAccess().getGroup_1()); 

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
    // $ANTLR end "rule__WaitForVote__Group__1__Impl"


    // $ANTLR start "rule__WaitForVote__Group_1__0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4252:1: rule__WaitForVote__Group_1__0 : rule__WaitForVote__Group_1__0__Impl rule__WaitForVote__Group_1__1 ;
    public final void rule__WaitForVote__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4256:1: ( rule__WaitForVote__Group_1__0__Impl rule__WaitForVote__Group_1__1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4257:2: rule__WaitForVote__Group_1__0__Impl rule__WaitForVote__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WaitForVote__Group_1__0__Impl_in_rule__WaitForVote__Group_1__08421);
            rule__WaitForVote__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WaitForVote__Group_1__1_in_rule__WaitForVote__Group_1__08424);
            rule__WaitForVote__Group_1__1();

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
    // $ANTLR end "rule__WaitForVote__Group_1__0"


    // $ANTLR start "rule__WaitForVote__Group_1__0__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4264:1: rule__WaitForVote__Group_1__0__Impl : ( ',' ) ;
    public final void rule__WaitForVote__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4268:1: ( ( ',' ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4269:1: ( ',' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4269:1: ( ',' )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4270:1: ','
            {
             before(grammarAccess.getWaitForVoteAccess().getCommaKeyword_1_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__WaitForVote__Group_1__0__Impl8452); 
             after(grammarAccess.getWaitForVoteAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__WaitForVote__Group_1__0__Impl"


    // $ANTLR start "rule__WaitForVote__Group_1__1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4283:1: rule__WaitForVote__Group_1__1 : rule__WaitForVote__Group_1__1__Impl ;
    public final void rule__WaitForVote__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4287:1: ( rule__WaitForVote__Group_1__1__Impl )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4288:2: rule__WaitForVote__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WaitForVote__Group_1__1__Impl_in_rule__WaitForVote__Group_1__18483);
            rule__WaitForVote__Group_1__1__Impl();

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
    // $ANTLR end "rule__WaitForVote__Group_1__1"


    // $ANTLR start "rule__WaitForVote__Group_1__1__Impl"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4294:1: rule__WaitForVote__Group_1__1__Impl : ( ( rule__WaitForVote__RolesAssignment_1_1 ) ) ;
    public final void rule__WaitForVote__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4298:1: ( ( ( rule__WaitForVote__RolesAssignment_1_1 ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4299:1: ( ( rule__WaitForVote__RolesAssignment_1_1 ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4299:1: ( ( rule__WaitForVote__RolesAssignment_1_1 ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4300:1: ( rule__WaitForVote__RolesAssignment_1_1 )
            {
             before(grammarAccess.getWaitForVoteAccess().getRolesAssignment_1_1()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4301:1: ( rule__WaitForVote__RolesAssignment_1_1 )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4301:2: rule__WaitForVote__RolesAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WaitForVote__RolesAssignment_1_1_in_rule__WaitForVote__Group_1__1__Impl8510);
            rule__WaitForVote__RolesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getWaitForVoteAccess().getRolesAssignment_1_1()); 

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
    // $ANTLR end "rule__WaitForVote__Group_1__1__Impl"


    // $ANTLR start "rule__Project__NameAssignment_2"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4316:1: rule__Project__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Project__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4320:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4321:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4321:1: ( RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4322:1: RULE_ID
            {
             before(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Project__NameAssignment_28549); 
             after(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Project__NameAssignment_2"


    // $ANTLR start "rule__Project__RolesAssignment_4_2"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4331:1: rule__Project__RolesAssignment_4_2 : ( ruleRole ) ;
    public final void rule__Project__RolesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4335:1: ( ( ruleRole ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4336:1: ( ruleRole )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4336:1: ( ruleRole )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4337:1: ruleRole
            {
             before(grammarAccess.getProjectAccess().getRolesRoleParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_rule__Project__RolesAssignment_4_28580);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getRolesRoleParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Project__RolesAssignment_4_2"


    // $ANTLR start "rule__Project__RolesAssignment_4_3_1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4346:1: rule__Project__RolesAssignment_4_3_1 : ( ruleRole ) ;
    public final void rule__Project__RolesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4350:1: ( ( ruleRole ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4351:1: ( ruleRole )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4351:1: ( ruleRole )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4352:1: ruleRole
            {
             before(grammarAccess.getProjectAccess().getRolesRoleParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_rule__Project__RolesAssignment_4_3_18611);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getRolesRoleParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Project__RolesAssignment_4_3_1"


    // $ANTLR start "rule__Project__DeadlinesAssignment_5_2"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4361:1: rule__Project__DeadlinesAssignment_5_2 : ( ruleDeadline ) ;
    public final void rule__Project__DeadlinesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4365:1: ( ( ruleDeadline ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4366:1: ( ruleDeadline )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4366:1: ( ruleDeadline )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4367:1: ruleDeadline
            {
             before(grammarAccess.getProjectAccess().getDeadlinesDeadlineParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeadline_in_rule__Project__DeadlinesAssignment_5_28642);
            ruleDeadline();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getDeadlinesDeadlineParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Project__DeadlinesAssignment_5_2"


    // $ANTLR start "rule__Project__DeadlinesAssignment_5_3_1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4376:1: rule__Project__DeadlinesAssignment_5_3_1 : ( ruleDeadline ) ;
    public final void rule__Project__DeadlinesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4380:1: ( ( ruleDeadline ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4381:1: ( ruleDeadline )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4381:1: ( ruleDeadline )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4382:1: ruleDeadline
            {
             before(grammarAccess.getProjectAccess().getDeadlinesDeadlineParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeadline_in_rule__Project__DeadlinesAssignment_5_3_18673);
            ruleDeadline();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getDeadlinesDeadlineParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__Project__DeadlinesAssignment_5_3_1"


    // $ANTLR start "rule__Project__StrategiesAssignment_6_2"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4391:1: rule__Project__StrategiesAssignment_6_2 : ( ruleStrategy ) ;
    public final void rule__Project__StrategiesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4395:1: ( ( ruleStrategy ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4396:1: ( ruleStrategy )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4396:1: ( ruleStrategy )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4397:1: ruleStrategy
            {
             before(grammarAccess.getProjectAccess().getStrategiesStrategyParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Project__StrategiesAssignment_6_28704);
            ruleStrategy();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getStrategiesStrategyParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__Project__StrategiesAssignment_6_2"


    // $ANTLR start "rule__Project__StrategiesAssignment_6_3_1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4406:1: rule__Project__StrategiesAssignment_6_3_1 : ( ruleStrategy ) ;
    public final void rule__Project__StrategiesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4410:1: ( ( ruleStrategy ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4411:1: ( ruleStrategy )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4411:1: ( ruleStrategy )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4412:1: ruleStrategy
            {
             before(grammarAccess.getProjectAccess().getStrategiesStrategyParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Project__StrategiesAssignment_6_3_18735);
            ruleStrategy();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getStrategiesStrategyParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__Project__StrategiesAssignment_6_3_1"


    // $ANTLR start "rule__Role__NameAssignment"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4421:1: rule__Role__NameAssignment : ( RULE_ID ) ;
    public final void rule__Role__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4425:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4426:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4426:1: ( RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4427:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Role__NameAssignment8766); 
             after(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Role__NameAssignment"


    // $ANTLR start "rule__Majority__NameAssignment_0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4436:1: rule__Majority__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Majority__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4440:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4441:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4441:1: ( RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4442:1: RULE_ID
            {
             before(grammarAccess.getMajorityAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Majority__NameAssignment_08797); 
             after(grammarAccess.getMajorityAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Majority__NameAssignment_0"


    // $ANTLR start "rule__Majority__AppliedToAssignment_5"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4451:1: rule__Majority__AppliedToAssignment_5 : ( ruleCollaborationType ) ;
    public final void rule__Majority__AppliedToAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4455:1: ( ( ruleCollaborationType ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4456:1: ( ruleCollaborationType )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4456:1: ( ruleCollaborationType )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4457:1: ruleCollaborationType
            {
             before(grammarAccess.getMajorityAccess().getAppliedToCollaborationTypeEnumRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCollaborationType_in_rule__Majority__AppliedToAssignment_58828);
            ruleCollaborationType();

            state._fsp--;

             after(grammarAccess.getMajorityAccess().getAppliedToCollaborationTypeEnumRuleCall_5_0()); 

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
    // $ANTLR end "rule__Majority__AppliedToAssignment_5"


    // $ANTLR start "rule__Majority__PeopleAssignment_8"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4466:1: rule__Majority__PeopleAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Majority__PeopleAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4470:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4471:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4471:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4472:1: ( RULE_ID )
            {
             before(grammarAccess.getMajorityAccess().getPeopleRoleCrossReference_8_0()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4473:1: ( RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4474:1: RULE_ID
            {
             before(grammarAccess.getMajorityAccess().getPeopleRoleIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Majority__PeopleAssignment_88863); 
             after(grammarAccess.getMajorityAccess().getPeopleRoleIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getMajorityAccess().getPeopleRoleCrossReference_8_0()); 

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
    // $ANTLR end "rule__Majority__PeopleAssignment_8"


    // $ANTLR start "rule__Majority__PeopleAssignment_9_1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4485:1: rule__Majority__PeopleAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__Majority__PeopleAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4489:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4490:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4490:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4491:1: ( RULE_ID )
            {
             before(grammarAccess.getMajorityAccess().getPeopleRoleCrossReference_9_1_0()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4492:1: ( RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4493:1: RULE_ID
            {
             before(grammarAccess.getMajorityAccess().getPeopleRoleIDTerminalRuleCall_9_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Majority__PeopleAssignment_9_18902); 
             after(grammarAccess.getMajorityAccess().getPeopleRoleIDTerminalRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getMajorityAccess().getPeopleRoleCrossReference_9_1_0()); 

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
    // $ANTLR end "rule__Majority__PeopleAssignment_9_1"


    // $ANTLR start "rule__Majority__RangeAssignment_11"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4504:1: rule__Majority__RangeAssignment_11 : ( ruleRangeType ) ;
    public final void rule__Majority__RangeAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4508:1: ( ( ruleRangeType ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4509:1: ( ruleRangeType )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4509:1: ( ruleRangeType )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4510:1: ruleRangeType
            {
             before(grammarAccess.getMajorityAccess().getRangeRangeTypeEnumRuleCall_11_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRangeType_in_rule__Majority__RangeAssignment_118937);
            ruleRangeType();

            state._fsp--;

             after(grammarAccess.getMajorityAccess().getRangeRangeTypeEnumRuleCall_11_0()); 

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
    // $ANTLR end "rule__Majority__RangeAssignment_11"


    // $ANTLR start "rule__Majority__MinVotesAssignment_12_1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4519:1: rule__Majority__MinVotesAssignment_12_1 : ( RULE_INT ) ;
    public final void rule__Majority__MinVotesAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4523:1: ( ( RULE_INT ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4524:1: ( RULE_INT )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4524:1: ( RULE_INT )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4525:1: RULE_INT
            {
             before(grammarAccess.getMajorityAccess().getMinVotesINTTerminalRuleCall_12_1_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Majority__MinVotesAssignment_12_18968); 
             after(grammarAccess.getMajorityAccess().getMinVotesINTTerminalRuleCall_12_1_0()); 

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
    // $ANTLR end "rule__Majority__MinVotesAssignment_12_1"


    // $ANTLR start "rule__Majority__DeadlineAssignment_14"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4534:1: rule__Majority__DeadlineAssignment_14 : ( ( RULE_ID ) ) ;
    public final void rule__Majority__DeadlineAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4538:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4539:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4539:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4540:1: ( RULE_ID )
            {
             before(grammarAccess.getMajorityAccess().getDeadlineDeadlineCrossReference_14_0()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4541:1: ( RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4542:1: RULE_ID
            {
             before(grammarAccess.getMajorityAccess().getDeadlineDeadlineIDTerminalRuleCall_14_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Majority__DeadlineAssignment_149003); 
             after(grammarAccess.getMajorityAccess().getDeadlineDeadlineIDTerminalRuleCall_14_0_1()); 

            }

             after(grammarAccess.getMajorityAccess().getDeadlineDeadlineCrossReference_14_0()); 

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
    // $ANTLR end "rule__Majority__DeadlineAssignment_14"


    // $ANTLR start "rule__RatioMajority__NameAssignment_0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4553:1: rule__RatioMajority__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__RatioMajority__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4557:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4558:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4558:1: ( RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4559:1: RULE_ID
            {
             before(grammarAccess.getRatioMajorityAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RatioMajority__NameAssignment_09038); 
             after(grammarAccess.getRatioMajorityAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__RatioMajority__NameAssignment_0"


    // $ANTLR start "rule__RatioMajority__PeopleAssignment_8"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4568:1: rule__RatioMajority__PeopleAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__RatioMajority__PeopleAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4572:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4573:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4573:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4574:1: ( RULE_ID )
            {
             before(grammarAccess.getRatioMajorityAccess().getPeopleRoleCrossReference_8_0()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4575:1: ( RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4576:1: RULE_ID
            {
             before(grammarAccess.getRatioMajorityAccess().getPeopleRoleIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RatioMajority__PeopleAssignment_89073); 
             after(grammarAccess.getRatioMajorityAccess().getPeopleRoleIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getRatioMajorityAccess().getPeopleRoleCrossReference_8_0()); 

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
    // $ANTLR end "rule__RatioMajority__PeopleAssignment_8"


    // $ANTLR start "rule__RatioMajority__PeopleAssignment_9_1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4587:1: rule__RatioMajority__PeopleAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__RatioMajority__PeopleAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4591:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4592:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4592:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4593:1: ( RULE_ID )
            {
             before(grammarAccess.getRatioMajorityAccess().getPeopleRoleCrossReference_9_1_0()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4594:1: ( RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4595:1: RULE_ID
            {
             before(grammarAccess.getRatioMajorityAccess().getPeopleRoleIDTerminalRuleCall_9_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RatioMajority__PeopleAssignment_9_19112); 
             after(grammarAccess.getRatioMajorityAccess().getPeopleRoleIDTerminalRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getRatioMajorityAccess().getPeopleRoleCrossReference_9_1_0()); 

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
    // $ANTLR end "rule__RatioMajority__PeopleAssignment_9_1"


    // $ANTLR start "rule__RatioMajority__RangeAssignment_11"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4606:1: rule__RatioMajority__RangeAssignment_11 : ( ruleRangeType ) ;
    public final void rule__RatioMajority__RangeAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4610:1: ( ( ruleRangeType ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4611:1: ( ruleRangeType )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4611:1: ( ruleRangeType )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4612:1: ruleRangeType
            {
             before(grammarAccess.getRatioMajorityAccess().getRangeRangeTypeEnumRuleCall_11_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRangeType_in_rule__RatioMajority__RangeAssignment_119147);
            ruleRangeType();

            state._fsp--;

             after(grammarAccess.getRatioMajorityAccess().getRangeRangeTypeEnumRuleCall_11_0()); 

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
    // $ANTLR end "rule__RatioMajority__RangeAssignment_11"


    // $ANTLR start "rule__RatioMajority__MinVotesAssignment_12_1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4621:1: rule__RatioMajority__MinVotesAssignment_12_1 : ( RULE_INT ) ;
    public final void rule__RatioMajority__MinVotesAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4625:1: ( ( RULE_INT ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4626:1: ( RULE_INT )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4626:1: ( RULE_INT )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4627:1: RULE_INT
            {
             before(grammarAccess.getRatioMajorityAccess().getMinVotesINTTerminalRuleCall_12_1_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__RatioMajority__MinVotesAssignment_12_19178); 
             after(grammarAccess.getRatioMajorityAccess().getMinVotesINTTerminalRuleCall_12_1_0()); 

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
    // $ANTLR end "rule__RatioMajority__MinVotesAssignment_12_1"


    // $ANTLR start "rule__RatioMajority__RatioAssignment_14"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4636:1: rule__RatioMajority__RatioAssignment_14 : ( RULE_FLOAT ) ;
    public final void rule__RatioMajority__RatioAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4640:1: ( ( RULE_FLOAT ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4641:1: ( RULE_FLOAT )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4641:1: ( RULE_FLOAT )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4642:1: RULE_FLOAT
            {
             before(grammarAccess.getRatioMajorityAccess().getRatioFLOATTerminalRuleCall_14_0()); 
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__RatioMajority__RatioAssignment_149209); 
             after(grammarAccess.getRatioMajorityAccess().getRatioFLOATTerminalRuleCall_14_0()); 

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
    // $ANTLR end "rule__RatioMajority__RatioAssignment_14"


    // $ANTLR start "rule__RatioMajority__DeadlineAssignment_16"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4651:1: rule__RatioMajority__DeadlineAssignment_16 : ( ( RULE_ID ) ) ;
    public final void rule__RatioMajority__DeadlineAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4655:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4656:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4656:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4657:1: ( RULE_ID )
            {
             before(grammarAccess.getRatioMajorityAccess().getDeadlineDeadlineCrossReference_16_0()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4658:1: ( RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4659:1: RULE_ID
            {
             before(grammarAccess.getRatioMajorityAccess().getDeadlineDeadlineIDTerminalRuleCall_16_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RatioMajority__DeadlineAssignment_169244); 
             after(grammarAccess.getRatioMajorityAccess().getDeadlineDeadlineIDTerminalRuleCall_16_0_1()); 

            }

             after(grammarAccess.getRatioMajorityAccess().getDeadlineDeadlineCrossReference_16_0()); 

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
    // $ANTLR end "rule__RatioMajority__DeadlineAssignment_16"


    // $ANTLR start "rule__LeaderDriven__NameAssignment_0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4670:1: rule__LeaderDriven__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__LeaderDriven__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4674:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4675:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4675:1: ( RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4676:1: RULE_ID
            {
             before(grammarAccess.getLeaderDrivenAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__LeaderDriven__NameAssignment_09279); 
             after(grammarAccess.getLeaderDrivenAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__LeaderDriven__NameAssignment_0"


    // $ANTLR start "rule__LeaderDriven__FilterAssignment_6_1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4685:1: rule__LeaderDriven__FilterAssignment_6_1 : ( ruleFilter ) ;
    public final void rule__LeaderDriven__FilterAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4689:1: ( ( ruleFilter ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4690:1: ( ruleFilter )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4690:1: ( ruleFilter )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4691:1: ruleFilter
            {
             before(grammarAccess.getLeaderDrivenAccess().getFilterFilterParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilter_in_rule__LeaderDriven__FilterAssignment_6_19310);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getLeaderDrivenAccess().getFilterFilterParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__LeaderDriven__FilterAssignment_6_1"


    // $ANTLR start "rule__LeaderDriven__DefaultAssignment_8"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4700:1: rule__LeaderDriven__DefaultAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__LeaderDriven__DefaultAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4704:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4705:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4705:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4706:1: ( RULE_ID )
            {
             before(grammarAccess.getLeaderDrivenAccess().getDefaultStrategyCrossReference_8_0()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4707:1: ( RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4708:1: RULE_ID
            {
             before(grammarAccess.getLeaderDrivenAccess().getDefaultStrategyIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__LeaderDriven__DefaultAssignment_89345); 
             after(grammarAccess.getLeaderDrivenAccess().getDefaultStrategyIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getLeaderDrivenAccess().getDefaultStrategyCrossReference_8_0()); 

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
    // $ANTLR end "rule__LeaderDriven__DefaultAssignment_8"


    // $ANTLR start "rule__LeaderDriven__DeadlineAssignment_10"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4719:1: rule__LeaderDriven__DeadlineAssignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__LeaderDriven__DeadlineAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4723:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4724:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4724:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4725:1: ( RULE_ID )
            {
             before(grammarAccess.getLeaderDrivenAccess().getDeadlineDeadlineCrossReference_10_0()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4726:1: ( RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4727:1: RULE_ID
            {
             before(grammarAccess.getLeaderDrivenAccess().getDeadlineDeadlineIDTerminalRuleCall_10_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__LeaderDriven__DeadlineAssignment_109384); 
             after(grammarAccess.getLeaderDrivenAccess().getDeadlineDeadlineIDTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getLeaderDrivenAccess().getDeadlineDeadlineCrossReference_10_0()); 

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
    // $ANTLR end "rule__LeaderDriven__DeadlineAssignment_10"


    // $ANTLR start "rule__PhasedStrategy__NameAssignment_0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4738:1: rule__PhasedStrategy__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__PhasedStrategy__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4742:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4743:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4743:1: ( RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4744:1: RULE_ID
            {
             before(grammarAccess.getPhasedStrategyAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PhasedStrategy__NameAssignment_09419); 
             after(grammarAccess.getPhasedStrategyAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__PhasedStrategy__NameAssignment_0"


    // $ANTLR start "rule__PhasedStrategy__PhasesAssignment_6"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4753:1: rule__PhasedStrategy__PhasesAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__PhasedStrategy__PhasesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4757:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4758:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4758:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4759:1: ( RULE_ID )
            {
             before(grammarAccess.getPhasedStrategyAccess().getPhasesStrategyCrossReference_6_0()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4760:1: ( RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4761:1: RULE_ID
            {
             before(grammarAccess.getPhasedStrategyAccess().getPhasesStrategyIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PhasedStrategy__PhasesAssignment_69454); 
             after(grammarAccess.getPhasedStrategyAccess().getPhasesStrategyIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getPhasedStrategyAccess().getPhasesStrategyCrossReference_6_0()); 

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
    // $ANTLR end "rule__PhasedStrategy__PhasesAssignment_6"


    // $ANTLR start "rule__Timer__NameAssignment_1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4772:1: rule__Timer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Timer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4776:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4777:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4777:1: ( RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4778:1: RULE_ID
            {
             before(grammarAccess.getTimerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Timer__NameAssignment_19489); 
             after(grammarAccess.getTimerAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Timer__NameAssignment_1"


    // $ANTLR start "rule__Timer__TimeStampAssignment_3"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4787:1: rule__Timer__TimeStampAssignment_3 : ( RULE_INT ) ;
    public final void rule__Timer__TimeStampAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4791:1: ( ( RULE_INT ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4792:1: ( RULE_INT )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4792:1: ( RULE_INT )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4793:1: RULE_INT
            {
             before(grammarAccess.getTimerAccess().getTimeStampINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Timer__TimeStampAssignment_39520); 
             after(grammarAccess.getTimerAccess().getTimeStampINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Timer__TimeStampAssignment_3"


    // $ANTLR start "rule__OCLCondition__OclExpressionAssignment"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4802:1: rule__OCLCondition__OclExpressionAssignment : ( RULE_STRING ) ;
    public final void rule__OCLCondition__OclExpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4806:1: ( ( RULE_STRING ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4807:1: ( RULE_STRING )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4807:1: ( RULE_STRING )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4808:1: RULE_STRING
            {
             before(grammarAccess.getOCLConditionAccess().getOclExpressionSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__OCLCondition__OclExpressionAssignment9551); 
             after(grammarAccess.getOCLConditionAccess().getOclExpressionSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__OCLCondition__OclExpressionAssignment"


    // $ANTLR start "rule__WaitForVote__RolesAssignment_0"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4817:1: rule__WaitForVote__RolesAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__WaitForVote__RolesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4821:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4822:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4822:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4823:1: ( RULE_ID )
            {
             before(grammarAccess.getWaitForVoteAccess().getRolesRoleCrossReference_0_0()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4824:1: ( RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4825:1: RULE_ID
            {
             before(grammarAccess.getWaitForVoteAccess().getRolesRoleIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__WaitForVote__RolesAssignment_09586); 
             after(grammarAccess.getWaitForVoteAccess().getRolesRoleIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getWaitForVoteAccess().getRolesRoleCrossReference_0_0()); 

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
    // $ANTLR end "rule__WaitForVote__RolesAssignment_0"


    // $ANTLR start "rule__WaitForVote__RolesAssignment_1_1"
    // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4836:1: rule__WaitForVote__RolesAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__WaitForVote__RolesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4840:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4841:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4841:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4842:1: ( RULE_ID )
            {
             before(grammarAccess.getWaitForVoteAccess().getRolesRoleCrossReference_1_1_0()); 
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4843:1: ( RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language.ui/src-gen/fr/inria/atlanmod/decision/ui/contentassist/antlr/internal/InternalStrategy.g:4844:1: RULE_ID
            {
             before(grammarAccess.getWaitForVoteAccess().getRolesRoleIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__WaitForVote__RolesAssignment_1_19625); 
             after(grammarAccess.getWaitForVoteAccess().getRolesRoleIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getWaitForVoteAccess().getRolesRoleCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__WaitForVote__RolesAssignment_1_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleProject_in_entryRuleProject61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProject68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group__0_in_ruleProject94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_entryRuleStrategy121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStrategy128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Strategy__Alternatives_in_ruleStrategy154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_entryRuleRole181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRole188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__NameAssignment_in_ruleRole214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMajority_in_entryRuleMajority241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMajority248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__0_in_ruleMajority274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRatioMajority_in_entryRuleRatioMajority301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRatioMajority308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__0_in_ruleRatioMajority334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeaderDriven_in_entryRuleLeaderDriven361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLeaderDriven368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__0_in_ruleLeaderDriven394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePhasedStrategy_in_entryRulePhasedStrategy421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePhasedStrategy428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__0_in_rulePhasedStrategy454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilter_in_entryRuleFilter481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFilter488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filter__Group__0_in_ruleFilter514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeadline_in_entryRuleDeadline541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeadline548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Deadline__Alternatives_in_ruleDeadline574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimer_in_entryRuleTimer601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTimer608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Timer__Group__0_in_ruleTimer634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOCLCondition_in_entryRuleOCLCondition661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOCLCondition668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OCLCondition__OclExpressionAssignment_in_ruleOCLCondition694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWaitForVote_in_entryRuleWaitForVote721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWaitForVote728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WaitForVote__Group__0_in_ruleWaitForVote754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CollaborationType__Alternatives_in_ruleCollaborationType791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RangeType__Alternatives_in_ruleRangeType827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMajority_in_rule__Strategy__Alternatives862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRatioMajority_in_rule__Strategy__Alternatives879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeaderDriven_in_rule__Strategy__Alternatives896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePhasedStrategy_in_rule__Strategy__Alternatives913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__RatioMajority__Alternatives_5946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__RatioMajority__Alternatives_5966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RatioMajority__Alternatives_5986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__LeaderDriven__Alternatives_51021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__LeaderDriven__Alternatives_51041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__LeaderDriven__Alternatives_51061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimer_in_rule__Deadline__Alternatives1095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWaitForVote_in_rule__Deadline__Alternatives1112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOCLCondition_in_rule__Deadline__Alternatives1129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__CollaborationType__Alternatives1162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__CollaborationType__Alternatives1183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__CollaborationType__Alternatives1204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__RangeType__Alternatives1240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__RangeType__Alternatives1261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group__0__Impl_in_rule__Project__Group__01294 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Project__Group__1_in_rule__Project__Group__01297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group__1__Impl_in_rule__Project__Group__11355 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Project__Group__2_in_rule__Project__Group__11358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Project__Group__1__Impl1386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group__2__Impl_in_rule__Project__Group__21417 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Project__Group__3_in_rule__Project__Group__21420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__NameAssignment_2_in_rule__Project__Group__2__Impl1447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group__3__Impl_in_rule__Project__Group__31477 = new BitSet(new long[]{0x0000000001980000L});
        public static final BitSet FOLLOW_rule__Project__Group__4_in_rule__Project__Group__31480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Project__Group__3__Impl1508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group__4__Impl_in_rule__Project__Group__41539 = new BitSet(new long[]{0x0000000001980000L});
        public static final BitSet FOLLOW_rule__Project__Group__5_in_rule__Project__Group__41542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_4__0_in_rule__Project__Group__4__Impl1569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group__5__Impl_in_rule__Project__Group__51600 = new BitSet(new long[]{0x0000000001980000L});
        public static final BitSet FOLLOW_rule__Project__Group__6_in_rule__Project__Group__51603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_5__0_in_rule__Project__Group__5__Impl1630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group__6__Impl_in_rule__Project__Group__61661 = new BitSet(new long[]{0x0000000001980000L});
        public static final BitSet FOLLOW_rule__Project__Group__7_in_rule__Project__Group__61664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_6__0_in_rule__Project__Group__6__Impl1691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group__7__Impl_in_rule__Project__Group__71722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Project__Group__7__Impl1750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_4__0__Impl_in_rule__Project__Group_4__01797 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Project__Group_4__1_in_rule__Project__Group_4__01800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Project__Group_4__0__Impl1828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_4__1__Impl_in_rule__Project__Group_4__11859 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Project__Group_4__2_in_rule__Project__Group_4__11862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Project__Group_4__1__Impl1890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_4__2__Impl_in_rule__Project__Group_4__21921 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Project__Group_4__3_in_rule__Project__Group_4__21924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__RolesAssignment_4_2_in_rule__Project__Group_4__2__Impl1951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_4__3__Impl_in_rule__Project__Group_4__31981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_4_3__0_in_rule__Project__Group_4__3__Impl2008 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__Project__Group_4_3__0__Impl_in_rule__Project__Group_4_3__02047 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Project__Group_4_3__1_in_rule__Project__Group_4_3__02050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Project__Group_4_3__0__Impl2078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_4_3__1__Impl_in_rule__Project__Group_4_3__12109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__RolesAssignment_4_3_1_in_rule__Project__Group_4_3__1__Impl2136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_5__0__Impl_in_rule__Project__Group_5__02170 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Project__Group_5__1_in_rule__Project__Group_5__02173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Project__Group_5__0__Impl2201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_5__1__Impl_in_rule__Project__Group_5__12232 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_rule__Project__Group_5__2_in_rule__Project__Group_5__12235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Project__Group_5__1__Impl2263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_5__2__Impl_in_rule__Project__Group_5__22294 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Project__Group_5__3_in_rule__Project__Group_5__22297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__DeadlinesAssignment_5_2_in_rule__Project__Group_5__2__Impl2324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_5__3__Impl_in_rule__Project__Group_5__32354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_5_3__0_in_rule__Project__Group_5__3__Impl2381 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__Project__Group_5_3__0__Impl_in_rule__Project__Group_5_3__02420 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_rule__Project__Group_5_3__1_in_rule__Project__Group_5_3__02423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Project__Group_5_3__0__Impl2451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_5_3__1__Impl_in_rule__Project__Group_5_3__12482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__DeadlinesAssignment_5_3_1_in_rule__Project__Group_5_3__1__Impl2509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_6__0__Impl_in_rule__Project__Group_6__02543 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Project__Group_6__1_in_rule__Project__Group_6__02546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Project__Group_6__0__Impl2574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_6__1__Impl_in_rule__Project__Group_6__12605 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Project__Group_6__2_in_rule__Project__Group_6__12608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Project__Group_6__1__Impl2636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_6__2__Impl_in_rule__Project__Group_6__22667 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Project__Group_6__3_in_rule__Project__Group_6__22670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__StrategiesAssignment_6_2_in_rule__Project__Group_6__2__Impl2697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_6__3__Impl_in_rule__Project__Group_6__32727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_6_3__0_in_rule__Project__Group_6__3__Impl2754 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__Project__Group_6_3__0__Impl_in_rule__Project__Group_6_3__02793 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Project__Group_6_3__1_in_rule__Project__Group_6_3__02796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Project__Group_6_3__0__Impl2824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_6_3__1__Impl_in_rule__Project__Group_6_3__12855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__StrategiesAssignment_6_3_1_in_rule__Project__Group_6_3__1__Impl2882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__0__Impl_in_rule__Majority__Group__02916 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Majority__Group__1_in_rule__Majority__Group__02919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__NameAssignment_0_in_rule__Majority__Group__0__Impl2946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__1__Impl_in_rule__Majority__Group__12976 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Majority__Group__2_in_rule__Majority__Group__12979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Majority__Group__1__Impl3007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__2__Impl_in_rule__Majority__Group__23038 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Majority__Group__3_in_rule__Majority__Group__23041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Majority__Group__2__Impl3069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__3__Impl_in_rule__Majority__Group__33100 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Majority__Group__4_in_rule__Majority__Group__33103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Majority__Group__3__Impl3131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__4__Impl_in_rule__Majority__Group__43162 = new BitSet(new long[]{0x0000000000007000L});
        public static final BitSet FOLLOW_rule__Majority__Group__5_in_rule__Majority__Group__43165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Majority__Group__4__Impl3193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__5__Impl_in_rule__Majority__Group__53224 = new BitSet(new long[]{0x0000000048000000L});
        public static final BitSet FOLLOW_rule__Majority__Group__6_in_rule__Majority__Group__53227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__AppliedToAssignment_5_in_rule__Majority__Group__5__Impl3254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__6__Impl_in_rule__Majority__Group__63284 = new BitSet(new long[]{0x0000000048000000L});
        public static final BitSet FOLLOW_rule__Majority__Group__7_in_rule__Majority__Group__63287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group_6__0_in_rule__Majority__Group__6__Impl3314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__7__Impl_in_rule__Majority__Group__73345 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Majority__Group__8_in_rule__Majority__Group__73348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Majority__Group__7__Impl3376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__8__Impl_in_rule__Majority__Group__83407 = new BitSet(new long[]{0x0000000010400000L});
        public static final BitSet FOLLOW_rule__Majority__Group__9_in_rule__Majority__Group__83410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__PeopleAssignment_8_in_rule__Majority__Group__8__Impl3437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__9__Impl_in_rule__Majority__Group__93467 = new BitSet(new long[]{0x0000000010400000L});
        public static final BitSet FOLLOW_rule__Majority__Group__10_in_rule__Majority__Group__93470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group_9__0_in_rule__Majority__Group__9__Impl3497 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__Majority__Group__10__Impl_in_rule__Majority__Group__103528 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__Majority__Group__11_in_rule__Majority__Group__103531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Majority__Group__10__Impl3559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__11__Impl_in_rule__Majority__Group__113590 = new BitSet(new long[]{0x0000000120000000L});
        public static final BitSet FOLLOW_rule__Majority__Group__12_in_rule__Majority__Group__113593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__RangeAssignment_11_in_rule__Majority__Group__11__Impl3620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__12__Impl_in_rule__Majority__Group__123650 = new BitSet(new long[]{0x0000000120000000L});
        public static final BitSet FOLLOW_rule__Majority__Group__13_in_rule__Majority__Group__123653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group_12__0_in_rule__Majority__Group__12__Impl3680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__13__Impl_in_rule__Majority__Group__133711 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Majority__Group__14_in_rule__Majority__Group__133714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Majority__Group__13__Impl3742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__14__Impl_in_rule__Majority__Group__143773 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Majority__Group__15_in_rule__Majority__Group__143776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__DeadlineAssignment_14_in_rule__Majority__Group__14__Impl3803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__15__Impl_in_rule__Majority__Group__153833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Majority__Group__15__Impl3861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group_6__0__Impl_in_rule__Majority__Group_6__03924 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Majority__Group_6__1_in_rule__Majority__Group_6__03927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Majority__Group_6__0__Impl3955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group_6__1__Impl_in_rule__Majority__Group_6__13986 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Majority__Group_6__2_in_rule__Majority__Group_6__13989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilter_in_rule__Majority__Group_6__1__Impl4016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group_6__2__Impl_in_rule__Majority__Group_6__24045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Majority__Group_6__2__Impl4073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group_9__0__Impl_in_rule__Majority__Group_9__04110 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Majority__Group_9__1_in_rule__Majority__Group_9__04113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Majority__Group_9__0__Impl4141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group_9__1__Impl_in_rule__Majority__Group_9__14172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__PeopleAssignment_9_1_in_rule__Majority__Group_9__1__Impl4199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group_12__0__Impl_in_rule__Majority__Group_12__04233 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Majority__Group_12__1_in_rule__Majority__Group_12__04236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Majority__Group_12__0__Impl4264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group_12__1__Impl_in_rule__Majority__Group_12__14295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__MinVotesAssignment_12_1_in_rule__Majority__Group_12__1__Impl4322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__0__Impl_in_rule__RatioMajority__Group__04356 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__1_in_rule__RatioMajority__Group__04359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__NameAssignment_0_in_rule__RatioMajority__Group__0__Impl4386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__1__Impl_in_rule__RatioMajority__Group__14416 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__2_in_rule__RatioMajority__Group__14419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__RatioMajority__Group__1__Impl4447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__2__Impl_in_rule__RatioMajority__Group__24478 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__3_in_rule__RatioMajority__Group__24481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__RatioMajority__Group__2__Impl4509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__3__Impl_in_rule__RatioMajority__Group__34540 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__4_in_rule__RatioMajority__Group__34543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__RatioMajority__Group__3__Impl4571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__4__Impl_in_rule__RatioMajority__Group__44602 = new BitSet(new long[]{0x0000000000007000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__5_in_rule__RatioMajority__Group__44605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__RatioMajority__Group__4__Impl4633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__5__Impl_in_rule__RatioMajority__Group__54664 = new BitSet(new long[]{0x0000000048000000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__6_in_rule__RatioMajority__Group__54667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Alternatives_5_in_rule__RatioMajority__Group__5__Impl4694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__6__Impl_in_rule__RatioMajority__Group__64724 = new BitSet(new long[]{0x0000000048000000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__7_in_rule__RatioMajority__Group__64727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_6__0_in_rule__RatioMajority__Group__6__Impl4754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__7__Impl_in_rule__RatioMajority__Group__74785 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__8_in_rule__RatioMajority__Group__74788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__RatioMajority__Group__7__Impl4816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__8__Impl_in_rule__RatioMajority__Group__84847 = new BitSet(new long[]{0x0000000010400000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__9_in_rule__RatioMajority__Group__84850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__PeopleAssignment_8_in_rule__RatioMajority__Group__8__Impl4877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__9__Impl_in_rule__RatioMajority__Group__94907 = new BitSet(new long[]{0x0000000010400000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__10_in_rule__RatioMajority__Group__94910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_9__0_in_rule__RatioMajority__Group__9__Impl4937 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__10__Impl_in_rule__RatioMajority__Group__104968 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__11_in_rule__RatioMajority__Group__104971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__RatioMajority__Group__10__Impl4999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__11__Impl_in_rule__RatioMajority__Group__115030 = new BitSet(new long[]{0x0000000500000000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__12_in_rule__RatioMajority__Group__115033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__RangeAssignment_11_in_rule__RatioMajority__Group__11__Impl5060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__12__Impl_in_rule__RatioMajority__Group__125090 = new BitSet(new long[]{0x0000000500000000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__13_in_rule__RatioMajority__Group__125093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_12__0_in_rule__RatioMajority__Group__12__Impl5120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__13__Impl_in_rule__RatioMajority__Group__135151 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__14_in_rule__RatioMajority__Group__135154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__RatioMajority__Group__13__Impl5182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__14__Impl_in_rule__RatioMajority__Group__145213 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__15_in_rule__RatioMajority__Group__145216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__RatioAssignment_14_in_rule__RatioMajority__Group__14__Impl5243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__15__Impl_in_rule__RatioMajority__Group__155273 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__16_in_rule__RatioMajority__Group__155276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__RatioMajority__Group__15__Impl5304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__16__Impl_in_rule__RatioMajority__Group__165335 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__17_in_rule__RatioMajority__Group__165338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__DeadlineAssignment_16_in_rule__RatioMajority__Group__16__Impl5365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__17__Impl_in_rule__RatioMajority__Group__175395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__RatioMajority__Group__17__Impl5423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_6__0__Impl_in_rule__RatioMajority__Group_6__05490 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_6__1_in_rule__RatioMajority__Group_6__05493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__RatioMajority__Group_6__0__Impl5521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_6__1__Impl_in_rule__RatioMajority__Group_6__15552 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_6__2_in_rule__RatioMajority__Group_6__15555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilter_in_rule__RatioMajority__Group_6__1__Impl5582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_6__2__Impl_in_rule__RatioMajority__Group_6__25611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__RatioMajority__Group_6__2__Impl5639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_9__0__Impl_in_rule__RatioMajority__Group_9__05676 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_9__1_in_rule__RatioMajority__Group_9__05679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__RatioMajority__Group_9__0__Impl5707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_9__1__Impl_in_rule__RatioMajority__Group_9__15738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__PeopleAssignment_9_1_in_rule__RatioMajority__Group_9__1__Impl5765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_12__0__Impl_in_rule__RatioMajority__Group_12__05799 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_12__1_in_rule__RatioMajority__Group_12__05802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__RatioMajority__Group_12__0__Impl5830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_12__1__Impl_in_rule__RatioMajority__Group_12__15861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__MinVotesAssignment_12_1_in_rule__RatioMajority__Group_12__1__Impl5888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__0__Impl_in_rule__LeaderDriven__Group__05922 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__1_in_rule__LeaderDriven__Group__05925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__NameAssignment_0_in_rule__LeaderDriven__Group__0__Impl5952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__1__Impl_in_rule__LeaderDriven__Group__15982 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__2_in_rule__LeaderDriven__Group__15985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__LeaderDriven__Group__1__Impl6013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__2__Impl_in_rule__LeaderDriven__Group__26044 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__3_in_rule__LeaderDriven__Group__26047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__LeaderDriven__Group__2__Impl6075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__3__Impl_in_rule__LeaderDriven__Group__36106 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__4_in_rule__LeaderDriven__Group__36109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__LeaderDriven__Group__3__Impl6137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__4__Impl_in_rule__LeaderDriven__Group__46168 = new BitSet(new long[]{0x0000000000007000L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__5_in_rule__LeaderDriven__Group__46171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__LeaderDriven__Group__4__Impl6199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__5__Impl_in_rule__LeaderDriven__Group__56230 = new BitSet(new long[]{0x0000001040000000L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__6_in_rule__LeaderDriven__Group__56233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Alternatives_5_in_rule__LeaderDriven__Group__5__Impl6260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__6__Impl_in_rule__LeaderDriven__Group__66290 = new BitSet(new long[]{0x0000001040000000L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__7_in_rule__LeaderDriven__Group__66293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group_6__0_in_rule__LeaderDriven__Group__6__Impl6320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__7__Impl_in_rule__LeaderDriven__Group__76351 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__8_in_rule__LeaderDriven__Group__76354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__LeaderDriven__Group__7__Impl6382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__8__Impl_in_rule__LeaderDriven__Group__86413 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__9_in_rule__LeaderDriven__Group__86416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__DefaultAssignment_8_in_rule__LeaderDriven__Group__8__Impl6443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__9__Impl_in_rule__LeaderDriven__Group__96473 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__10_in_rule__LeaderDriven__Group__96476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__LeaderDriven__Group__9__Impl6504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__10__Impl_in_rule__LeaderDriven__Group__106535 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__11_in_rule__LeaderDriven__Group__106538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__DeadlineAssignment_10_in_rule__LeaderDriven__Group__10__Impl6565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__11__Impl_in_rule__LeaderDriven__Group__116595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__LeaderDriven__Group__11__Impl6623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group_6__0__Impl_in_rule__LeaderDriven__Group_6__06678 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group_6__1_in_rule__LeaderDriven__Group_6__06681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__LeaderDriven__Group_6__0__Impl6709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group_6__1__Impl_in_rule__LeaderDriven__Group_6__16740 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group_6__2_in_rule__LeaderDriven__Group_6__16743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__FilterAssignment_6_1_in_rule__LeaderDriven__Group_6__1__Impl6770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group_6__2__Impl_in_rule__LeaderDriven__Group_6__26800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__LeaderDriven__Group_6__2__Impl6828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__0__Impl_in_rule__PhasedStrategy__Group__06865 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__1_in_rule__PhasedStrategy__Group__06868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__NameAssignment_0_in_rule__PhasedStrategy__Group__0__Impl6895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__1__Impl_in_rule__PhasedStrategy__Group__16925 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__2_in_rule__PhasedStrategy__Group__16928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__PhasedStrategy__Group__1__Impl6956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__2__Impl_in_rule__PhasedStrategy__Group__26987 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__3_in_rule__PhasedStrategy__Group__26990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__PhasedStrategy__Group__2__Impl7018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__3__Impl_in_rule__PhasedStrategy__Group__37049 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__4_in_rule__PhasedStrategy__Group__37052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__PhasedStrategy__Group__3__Impl7080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__4__Impl_in_rule__PhasedStrategy__Group__47111 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__5_in_rule__PhasedStrategy__Group__47114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__PhasedStrategy__Group__4__Impl7142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__5__Impl_in_rule__PhasedStrategy__Group__57173 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__6_in_rule__PhasedStrategy__Group__57176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__PhasedStrategy__Group__5__Impl7204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__6__Impl_in_rule__PhasedStrategy__Group__67235 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__7_in_rule__PhasedStrategy__Group__67238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__PhasesAssignment_6_in_rule__PhasedStrategy__Group__6__Impl7265 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__7__Impl_in_rule__PhasedStrategy__Group__77296 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__8_in_rule__PhasedStrategy__Group__77299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__PhasedStrategy__Group__7__Impl7327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__8__Impl_in_rule__PhasedStrategy__Group__87358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__PhasedStrategy__Group__8__Impl7386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filter__Group__0__Impl_in_rule__Filter__Group__07435 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Filter__Group__1_in_rule__Filter__Group__07438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filter__Group_0__0_in_rule__Filter__Group__0__Impl7465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filter__Group__1__Impl_in_rule__Filter__Group__17495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filter__Group_1__0_in_rule__Filter__Group__1__Impl7522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filter__Group_0__0__Impl_in_rule__Filter__Group_0__07557 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Filter__Group_0__1_in_rule__Filter__Group_0__07560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Filter__Group_0__0__Impl7587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filter__Group_0__1__Impl_in_rule__Filter__Group_0__17616 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Filter__Group_0__2_in_rule__Filter__Group_0__17619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Filter__Group_0__1__Impl7647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filter__Group_0__2__Impl_in_rule__Filter__Group_0__27678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Filter__Group_0__2__Impl7705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filter__Group_1__0__Impl_in_rule__Filter__Group_1__07740 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Filter__Group_1__1_in_rule__Filter__Group_1__07743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Filter__Group_1__0__Impl7771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filter__Group_1__1__Impl_in_rule__Filter__Group_1__17802 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Filter__Group_1__2_in_rule__Filter__Group_1__17805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Filter__Group_1__1__Impl7832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filter__Group_1__2__Impl_in_rule__Filter__Group_1__27861 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Filter__Group_1__3_in_rule__Filter__Group_1__27864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Filter__Group_1__2__Impl7892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filter__Group_1__3__Impl_in_rule__Filter__Group_1__37923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Filter__Group_1__3__Impl7950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Timer__Group__0__Impl_in_rule__Timer__Group__07987 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Timer__Group__1_in_rule__Timer__Group__07990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Timer__Group__1__Impl_in_rule__Timer__Group__18048 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Timer__Group__2_in_rule__Timer__Group__18051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Timer__NameAssignment_1_in_rule__Timer__Group__1__Impl8078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Timer__Group__2__Impl_in_rule__Timer__Group__28108 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Timer__Group__3_in_rule__Timer__Group__28111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Timer__Group__2__Impl8139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Timer__Group__3__Impl_in_rule__Timer__Group__38170 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Timer__Group__4_in_rule__Timer__Group__38173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Timer__TimeStampAssignment_3_in_rule__Timer__Group__3__Impl8200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Timer__Group__4__Impl_in_rule__Timer__Group__48230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Timer__Group__4__Impl8258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WaitForVote__Group__0__Impl_in_rule__WaitForVote__Group__08299 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__WaitForVote__Group__1_in_rule__WaitForVote__Group__08302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WaitForVote__RolesAssignment_0_in_rule__WaitForVote__Group__0__Impl8329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WaitForVote__Group__1__Impl_in_rule__WaitForVote__Group__18359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WaitForVote__Group_1__0_in_rule__WaitForVote__Group__1__Impl8386 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__WaitForVote__Group_1__0__Impl_in_rule__WaitForVote__Group_1__08421 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__WaitForVote__Group_1__1_in_rule__WaitForVote__Group_1__08424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__WaitForVote__Group_1__0__Impl8452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WaitForVote__Group_1__1__Impl_in_rule__WaitForVote__Group_1__18483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WaitForVote__RolesAssignment_1_1_in_rule__WaitForVote__Group_1__1__Impl8510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Project__NameAssignment_28549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_rule__Project__RolesAssignment_4_28580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_rule__Project__RolesAssignment_4_3_18611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeadline_in_rule__Project__DeadlinesAssignment_5_28642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeadline_in_rule__Project__DeadlinesAssignment_5_3_18673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Project__StrategiesAssignment_6_28704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Project__StrategiesAssignment_6_3_18735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Role__NameAssignment8766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Majority__NameAssignment_08797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollaborationType_in_rule__Majority__AppliedToAssignment_58828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Majority__PeopleAssignment_88863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Majority__PeopleAssignment_9_18902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRangeType_in_rule__Majority__RangeAssignment_118937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Majority__MinVotesAssignment_12_18968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Majority__DeadlineAssignment_149003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RatioMajority__NameAssignment_09038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RatioMajority__PeopleAssignment_89073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RatioMajority__PeopleAssignment_9_19112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRangeType_in_rule__RatioMajority__RangeAssignment_119147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__RatioMajority__MinVotesAssignment_12_19178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__RatioMajority__RatioAssignment_149209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RatioMajority__DeadlineAssignment_169244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__LeaderDriven__NameAssignment_09279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilter_in_rule__LeaderDriven__FilterAssignment_6_19310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__LeaderDriven__DefaultAssignment_89345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__LeaderDriven__DeadlineAssignment_109384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PhasedStrategy__NameAssignment_09419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PhasedStrategy__PhasesAssignment_69454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Timer__NameAssignment_19489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Timer__TimeStampAssignment_39520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__OCLCondition__OclExpressionAssignment9551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__WaitForVote__RolesAssignment_09586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__WaitForVote__RolesAssignment_1_19625 = new BitSet(new long[]{0x0000000000000002L});
    }


}