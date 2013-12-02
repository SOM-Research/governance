package fr.inria.atlanmod.governance.ui.contentassist.antlr.internal; 

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
import fr.inria.atlanmod.governance.services.StrategyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStrategyParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Task'", "'Patch'", "'Comment'", "'='", "'!='", "'TaskReview'", "'PatchReview'", "'Release'", "'Present'", "'Qualified'", "'Project'", "'{'", "'}'", "'Roles'", "':'", "','", "'Deadlines'", "'Strategies'", "'Majority'", "'applied to'", "'when'", "'people'", "'range'", "'deadline'", "'('", "')'", "'minVotes'", "'Ratio'", "'ratio'", "'LeaderDriven'", "'default'", "'phases'", "'days'"
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_FLOAT=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
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
    public String getGrammarFileName() { return "../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g"; }


     
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:60:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:61:1: ( ruleProject EOF )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:62:1: ruleProject EOF
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:69:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:73:2: ( ( ( rule__Project__Group__0 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:74:1: ( ( rule__Project__Group__0 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:74:1: ( ( rule__Project__Group__0 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:75:1: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:76:1: ( rule__Project__Group__0 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:76:2: rule__Project__Group__0
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:88:1: entryRuleStrategy : ruleStrategy EOF ;
    public final void entryRuleStrategy() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:89:1: ( ruleStrategy EOF )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:90:1: ruleStrategy EOF
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:97:1: ruleStrategy : ( ( rule__Strategy__Alternatives ) ) ;
    public final void ruleStrategy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:101:2: ( ( ( rule__Strategy__Alternatives ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:102:1: ( ( rule__Strategy__Alternatives ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:102:1: ( ( rule__Strategy__Alternatives ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:103:1: ( rule__Strategy__Alternatives )
            {
             before(grammarAccess.getStrategyAccess().getAlternatives()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:104:1: ( rule__Strategy__Alternatives )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:104:2: rule__Strategy__Alternatives
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:116:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:117:1: ( ruleRole EOF )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:118:1: ruleRole EOF
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:125:1: ruleRole : ( ( rule__Role__NameAssignment ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:129:2: ( ( ( rule__Role__NameAssignment ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:130:1: ( ( rule__Role__NameAssignment ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:130:1: ( ( rule__Role__NameAssignment ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:131:1: ( rule__Role__NameAssignment )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:132:1: ( rule__Role__NameAssignment )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:132:2: rule__Role__NameAssignment
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:144:1: entryRuleMajority : ruleMajority EOF ;
    public final void entryRuleMajority() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:145:1: ( ruleMajority EOF )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:146:1: ruleMajority EOF
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:153:1: ruleMajority : ( ( rule__Majority__Group__0 ) ) ;
    public final void ruleMajority() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:157:2: ( ( ( rule__Majority__Group__0 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:158:1: ( ( rule__Majority__Group__0 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:158:1: ( ( rule__Majority__Group__0 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:159:1: ( rule__Majority__Group__0 )
            {
             before(grammarAccess.getMajorityAccess().getGroup()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:160:1: ( rule__Majority__Group__0 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:160:2: rule__Majority__Group__0
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:172:1: entryRuleRatioMajority : ruleRatioMajority EOF ;
    public final void entryRuleRatioMajority() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:173:1: ( ruleRatioMajority EOF )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:174:1: ruleRatioMajority EOF
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:181:1: ruleRatioMajority : ( ( rule__RatioMajority__Group__0 ) ) ;
    public final void ruleRatioMajority() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:185:2: ( ( ( rule__RatioMajority__Group__0 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:186:1: ( ( rule__RatioMajority__Group__0 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:186:1: ( ( rule__RatioMajority__Group__0 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:187:1: ( rule__RatioMajority__Group__0 )
            {
             before(grammarAccess.getRatioMajorityAccess().getGroup()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:188:1: ( rule__RatioMajority__Group__0 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:188:2: rule__RatioMajority__Group__0
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:200:1: entryRuleLeaderDriven : ruleLeaderDriven EOF ;
    public final void entryRuleLeaderDriven() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:201:1: ( ruleLeaderDriven EOF )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:202:1: ruleLeaderDriven EOF
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:209:1: ruleLeaderDriven : ( ( rule__LeaderDriven__Group__0 ) ) ;
    public final void ruleLeaderDriven() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:213:2: ( ( ( rule__LeaderDriven__Group__0 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:214:1: ( ( rule__LeaderDriven__Group__0 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:214:1: ( ( rule__LeaderDriven__Group__0 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:215:1: ( rule__LeaderDriven__Group__0 )
            {
             before(grammarAccess.getLeaderDrivenAccess().getGroup()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:216:1: ( rule__LeaderDriven__Group__0 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:216:2: rule__LeaderDriven__Group__0
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:228:1: entryRulePhasedStrategy : rulePhasedStrategy EOF ;
    public final void entryRulePhasedStrategy() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:229:1: ( rulePhasedStrategy EOF )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:230:1: rulePhasedStrategy EOF
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:237:1: rulePhasedStrategy : ( ( rule__PhasedStrategy__Group__0 ) ) ;
    public final void rulePhasedStrategy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:241:2: ( ( ( rule__PhasedStrategy__Group__0 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:242:1: ( ( rule__PhasedStrategy__Group__0 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:242:1: ( ( rule__PhasedStrategy__Group__0 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:243:1: ( rule__PhasedStrategy__Group__0 )
            {
             before(grammarAccess.getPhasedStrategyAccess().getGroup()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:244:1: ( rule__PhasedStrategy__Group__0 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:244:2: rule__PhasedStrategy__Group__0
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:256:1: entryRuleFilter : ruleFilter EOF ;
    public final void entryRuleFilter() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:257:1: ( ruleFilter EOF )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:258:1: ruleFilter EOF
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:265:1: ruleFilter : ( ( rule__Filter__Group__0 ) ) ;
    public final void ruleFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:269:2: ( ( ( rule__Filter__Group__0 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:270:1: ( ( rule__Filter__Group__0 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:270:1: ( ( rule__Filter__Group__0 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:271:1: ( rule__Filter__Group__0 )
            {
             before(grammarAccess.getFilterAccess().getGroup()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:272:1: ( rule__Filter__Group__0 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:272:2: rule__Filter__Group__0
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:284:1: entryRuleDeadline : ruleDeadline EOF ;
    public final void entryRuleDeadline() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:285:1: ( ruleDeadline EOF )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:286:1: ruleDeadline EOF
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:293:1: ruleDeadline : ( ( rule__Deadline__Alternatives ) ) ;
    public final void ruleDeadline() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:297:2: ( ( ( rule__Deadline__Alternatives ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:298:1: ( ( rule__Deadline__Alternatives ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:298:1: ( ( rule__Deadline__Alternatives ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:299:1: ( rule__Deadline__Alternatives )
            {
             before(grammarAccess.getDeadlineAccess().getAlternatives()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:300:1: ( rule__Deadline__Alternatives )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:300:2: rule__Deadline__Alternatives
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:312:1: entryRuleTimer : ruleTimer EOF ;
    public final void entryRuleTimer() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:313:1: ( ruleTimer EOF )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:314:1: ruleTimer EOF
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:321:1: ruleTimer : ( ( rule__Timer__Group__0 ) ) ;
    public final void ruleTimer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:325:2: ( ( ( rule__Timer__Group__0 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:326:1: ( ( rule__Timer__Group__0 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:326:1: ( ( rule__Timer__Group__0 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:327:1: ( rule__Timer__Group__0 )
            {
             before(grammarAccess.getTimerAccess().getGroup()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:328:1: ( rule__Timer__Group__0 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:328:2: rule__Timer__Group__0
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:340:1: entryRuleOCLCondition : ruleOCLCondition EOF ;
    public final void entryRuleOCLCondition() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:341:1: ( ruleOCLCondition EOF )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:342:1: ruleOCLCondition EOF
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:349:1: ruleOCLCondition : ( ( rule__OCLCondition__OclExpressionAssignment ) ) ;
    public final void ruleOCLCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:353:2: ( ( ( rule__OCLCondition__OclExpressionAssignment ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:354:1: ( ( rule__OCLCondition__OclExpressionAssignment ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:354:1: ( ( rule__OCLCondition__OclExpressionAssignment ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:355:1: ( rule__OCLCondition__OclExpressionAssignment )
            {
             before(grammarAccess.getOCLConditionAccess().getOclExpressionAssignment()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:356:1: ( rule__OCLCondition__OclExpressionAssignment )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:356:2: rule__OCLCondition__OclExpressionAssignment
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:368:1: entryRuleWaitForVote : ruleWaitForVote EOF ;
    public final void entryRuleWaitForVote() throws RecognitionException {
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:369:1: ( ruleWaitForVote EOF )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:370:1: ruleWaitForVote EOF
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:377:1: ruleWaitForVote : ( ( rule__WaitForVote__Group__0 ) ) ;
    public final void ruleWaitForVote() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:381:2: ( ( ( rule__WaitForVote__Group__0 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:382:1: ( ( rule__WaitForVote__Group__0 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:382:1: ( ( rule__WaitForVote__Group__0 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:383:1: ( rule__WaitForVote__Group__0 )
            {
             before(grammarAccess.getWaitForVoteAccess().getGroup()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:384:1: ( rule__WaitForVote__Group__0 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:384:2: rule__WaitForVote__Group__0
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:397:1: ruleCollaborationType : ( ( rule__CollaborationType__Alternatives ) ) ;
    public final void ruleCollaborationType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:401:1: ( ( ( rule__CollaborationType__Alternatives ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:402:1: ( ( rule__CollaborationType__Alternatives ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:402:1: ( ( rule__CollaborationType__Alternatives ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:403:1: ( rule__CollaborationType__Alternatives )
            {
             before(grammarAccess.getCollaborationTypeAccess().getAlternatives()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:404:1: ( rule__CollaborationType__Alternatives )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:404:2: rule__CollaborationType__Alternatives
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


    // $ANTLR start "ruleStageType"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:416:1: ruleStageType : ( ( rule__StageType__Alternatives ) ) ;
    public final void ruleStageType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:420:1: ( ( ( rule__StageType__Alternatives ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:421:1: ( ( rule__StageType__Alternatives ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:421:1: ( ( rule__StageType__Alternatives ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:422:1: ( rule__StageType__Alternatives )
            {
             before(grammarAccess.getStageTypeAccess().getAlternatives()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:423:1: ( rule__StageType__Alternatives )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:423:2: rule__StageType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__StageType__Alternatives_in_ruleStageType827);
            rule__StageType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStageTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStageType"


    // $ANTLR start "ruleRangeType"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:435:1: ruleRangeType : ( ( rule__RangeType__Alternatives ) ) ;
    public final void ruleRangeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:439:1: ( ( ( rule__RangeType__Alternatives ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:440:1: ( ( rule__RangeType__Alternatives ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:440:1: ( ( rule__RangeType__Alternatives ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:441:1: ( rule__RangeType__Alternatives )
            {
             before(grammarAccess.getRangeTypeAccess().getAlternatives()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:442:1: ( rule__RangeType__Alternatives )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:442:2: rule__RangeType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__RangeType__Alternatives_in_ruleRangeType863);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:453:1: rule__Strategy__Alternatives : ( ( ruleMajority ) | ( ruleRatioMajority ) | ( ruleLeaderDriven ) | ( rulePhasedStrategy ) );
    public final void rule__Strategy__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:457:1: ( ( ruleMajority ) | ( ruleRatioMajority ) | ( ruleLeaderDriven ) | ( rulePhasedStrategy ) )
            int alt1=4;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==26) ) {
                    switch ( input.LA(3) ) {
                    case 41:
                        {
                        alt1=3;
                        }
                        break;
                    case 30:
                        {
                        alt1=1;
                        }
                        break;
                    case 39:
                        {
                        int LA1_5 = input.LA(4);

                        if ( (LA1_5==23) ) {
                            int LA1_6 = input.LA(5);

                            if ( (LA1_6==43) ) {
                                alt1=4;
                            }
                            else if ( (LA1_6==31) ) {
                                alt1=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 5, input);

                            throw nvae;
                        }
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
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:458:1: ( ruleMajority )
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:458:1: ( ruleMajority )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:459:1: ruleMajority
                    {
                     before(grammarAccess.getStrategyAccess().getMajorityParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMajority_in_rule__Strategy__Alternatives898);
                    ruleMajority();

                    state._fsp--;

                     after(grammarAccess.getStrategyAccess().getMajorityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:464:6: ( ruleRatioMajority )
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:464:6: ( ruleRatioMajority )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:465:1: ruleRatioMajority
                    {
                     before(grammarAccess.getStrategyAccess().getRatioMajorityParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRatioMajority_in_rule__Strategy__Alternatives915);
                    ruleRatioMajority();

                    state._fsp--;

                     after(grammarAccess.getStrategyAccess().getRatioMajorityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:470:6: ( ruleLeaderDriven )
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:470:6: ( ruleLeaderDriven )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:471:1: ruleLeaderDriven
                    {
                     before(grammarAccess.getStrategyAccess().getLeaderDrivenParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLeaderDriven_in_rule__Strategy__Alternatives932);
                    ruleLeaderDriven();

                    state._fsp--;

                     after(grammarAccess.getStrategyAccess().getLeaderDrivenParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:476:6: ( rulePhasedStrategy )
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:476:6: ( rulePhasedStrategy )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:477:1: rulePhasedStrategy
                    {
                     before(grammarAccess.getStrategyAccess().getPhasedStrategyParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_rulePhasedStrategy_in_rule__Strategy__Alternatives949);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:487:1: rule__RatioMajority__Alternatives_5 : ( ( 'Task' ) | ( 'Patch' ) | ( 'Comment' ) );
    public final void rule__RatioMajority__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:491:1: ( ( 'Task' ) | ( 'Patch' ) | ( 'Comment' ) )
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
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:492:1: ( 'Task' )
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:492:1: ( 'Task' )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:493:1: 'Task'
                    {
                     before(grammarAccess.getRatioMajorityAccess().getTaskKeyword_5_0()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__RatioMajority__Alternatives_5982); 
                     after(grammarAccess.getRatioMajorityAccess().getTaskKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:500:6: ( 'Patch' )
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:500:6: ( 'Patch' )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:501:1: 'Patch'
                    {
                     before(grammarAccess.getRatioMajorityAccess().getPatchKeyword_5_1()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__RatioMajority__Alternatives_51002); 
                     after(grammarAccess.getRatioMajorityAccess().getPatchKeyword_5_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:508:6: ( 'Comment' )
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:508:6: ( 'Comment' )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:509:1: 'Comment'
                    {
                     before(grammarAccess.getRatioMajorityAccess().getCommentKeyword_5_2()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__RatioMajority__Alternatives_51022); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:521:1: rule__LeaderDriven__Alternatives_5 : ( ( 'Task' ) | ( 'Patch' ) | ( 'Comment' ) );
    public final void rule__LeaderDriven__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:525:1: ( ( 'Task' ) | ( 'Patch' ) | ( 'Comment' ) )
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
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:526:1: ( 'Task' )
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:526:1: ( 'Task' )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:527:1: 'Task'
                    {
                     before(grammarAccess.getLeaderDrivenAccess().getTaskKeyword_5_0()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__LeaderDriven__Alternatives_51057); 
                     after(grammarAccess.getLeaderDrivenAccess().getTaskKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:534:6: ( 'Patch' )
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:534:6: ( 'Patch' )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:535:1: 'Patch'
                    {
                     before(grammarAccess.getLeaderDrivenAccess().getPatchKeyword_5_1()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__LeaderDriven__Alternatives_51077); 
                     after(grammarAccess.getLeaderDrivenAccess().getPatchKeyword_5_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:542:6: ( 'Comment' )
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:542:6: ( 'Comment' )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:543:1: 'Comment'
                    {
                     before(grammarAccess.getLeaderDrivenAccess().getCommentKeyword_5_2()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__LeaderDriven__Alternatives_51097); 
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


    // $ANTLR start "rule__Filter__Alternatives_0_1"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:555:1: rule__Filter__Alternatives_0_1 : ( ( '=' ) | ( '!=' ) );
    public final void rule__Filter__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:559:1: ( ( '=' ) | ( '!=' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:560:1: ( '=' )
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:560:1: ( '=' )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:561:1: '='
                    {
                     before(grammarAccess.getFilterAccess().getEqualsSignKeyword_0_1_0()); 
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__Filter__Alternatives_0_11132); 
                     after(grammarAccess.getFilterAccess().getEqualsSignKeyword_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:568:6: ( '!=' )
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:568:6: ( '!=' )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:569:1: '!='
                    {
                     before(grammarAccess.getFilterAccess().getExclamationMarkEqualsSignKeyword_0_1_1()); 
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__Filter__Alternatives_0_11152); 
                     after(grammarAccess.getFilterAccess().getExclamationMarkEqualsSignKeyword_0_1_1()); 

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
    // $ANTLR end "rule__Filter__Alternatives_0_1"


    // $ANTLR start "rule__Filter__Alternatives_1_2"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:581:1: rule__Filter__Alternatives_1_2 : ( ( '=' ) | ( '!=' ) );
    public final void rule__Filter__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:585:1: ( ( '=' ) | ( '!=' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:586:1: ( '=' )
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:586:1: ( '=' )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:587:1: '='
                    {
                     before(grammarAccess.getFilterAccess().getEqualsSignKeyword_1_2_0()); 
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__Filter__Alternatives_1_21187); 
                     after(grammarAccess.getFilterAccess().getEqualsSignKeyword_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:594:6: ( '!=' )
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:594:6: ( '!=' )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:595:1: '!='
                    {
                     before(grammarAccess.getFilterAccess().getExclamationMarkEqualsSignKeyword_1_2_1()); 
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__Filter__Alternatives_1_21207); 
                     after(grammarAccess.getFilterAccess().getExclamationMarkEqualsSignKeyword_1_2_1()); 

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
    // $ANTLR end "rule__Filter__Alternatives_1_2"


    // $ANTLR start "rule__Deadline__Alternatives"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:607:1: rule__Deadline__Alternatives : ( ( ruleTimer ) | ( ruleWaitForVote ) | ( ruleOCLCondition ) );
    public final void rule__Deadline__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:611:1: ( ( ruleTimer ) | ( ruleWaitForVote ) | ( ruleOCLCondition ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==26) ) {
                    alt6=1;
                }
                else if ( (LA6_1==EOF||LA6_1==24||LA6_1==27||LA6_1==29) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:612:1: ( ruleTimer )
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:612:1: ( ruleTimer )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:613:1: ruleTimer
                    {
                     before(grammarAccess.getDeadlineAccess().getTimerParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTimer_in_rule__Deadline__Alternatives1241);
                    ruleTimer();

                    state._fsp--;

                     after(grammarAccess.getDeadlineAccess().getTimerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:618:6: ( ruleWaitForVote )
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:618:6: ( ruleWaitForVote )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:619:1: ruleWaitForVote
                    {
                     before(grammarAccess.getDeadlineAccess().getWaitForVoteParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleWaitForVote_in_rule__Deadline__Alternatives1258);
                    ruleWaitForVote();

                    state._fsp--;

                     after(grammarAccess.getDeadlineAccess().getWaitForVoteParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:624:6: ( ruleOCLCondition )
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:624:6: ( ruleOCLCondition )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:625:1: ruleOCLCondition
                    {
                     before(grammarAccess.getDeadlineAccess().getOCLConditionParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOCLCondition_in_rule__Deadline__Alternatives1275);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:635:1: rule__CollaborationType__Alternatives : ( ( ( 'Task' ) ) | ( ( 'Patch' ) ) | ( ( 'Comment' ) ) );
    public final void rule__CollaborationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:639:1: ( ( ( 'Task' ) ) | ( ( 'Patch' ) ) | ( ( 'Comment' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt7=1;
                }
                break;
            case 13:
                {
                alt7=2;
                }
                break;
            case 14:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:640:1: ( ( 'Task' ) )
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:640:1: ( ( 'Task' ) )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:641:1: ( 'Task' )
                    {
                     before(grammarAccess.getCollaborationTypeAccess().getTASKEnumLiteralDeclaration_0()); 
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:642:1: ( 'Task' )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:642:3: 'Task'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__CollaborationType__Alternatives1308); 

                    }

                     after(grammarAccess.getCollaborationTypeAccess().getTASKEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:647:6: ( ( 'Patch' ) )
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:647:6: ( ( 'Patch' ) )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:648:1: ( 'Patch' )
                    {
                     before(grammarAccess.getCollaborationTypeAccess().getPATCHEnumLiteralDeclaration_1()); 
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:649:1: ( 'Patch' )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:649:3: 'Patch'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__CollaborationType__Alternatives1329); 

                    }

                     after(grammarAccess.getCollaborationTypeAccess().getPATCHEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:654:6: ( ( 'Comment' ) )
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:654:6: ( ( 'Comment' ) )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:655:1: ( 'Comment' )
                    {
                     before(grammarAccess.getCollaborationTypeAccess().getCOMMENTEnumLiteralDeclaration_2()); 
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:656:1: ( 'Comment' )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:656:3: 'Comment'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__CollaborationType__Alternatives1350); 

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


    // $ANTLR start "rule__StageType__Alternatives"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:666:1: rule__StageType__Alternatives : ( ( ( 'TaskReview' ) ) | ( ( 'PatchReview' ) ) | ( ( 'Release' ) ) );
    public final void rule__StageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:670:1: ( ( ( 'TaskReview' ) ) | ( ( 'PatchReview' ) ) | ( ( 'Release' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt8=1;
                }
                break;
            case 18:
                {
                alt8=2;
                }
                break;
            case 19:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:671:1: ( ( 'TaskReview' ) )
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:671:1: ( ( 'TaskReview' ) )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:672:1: ( 'TaskReview' )
                    {
                     before(grammarAccess.getStageTypeAccess().getTASK_REVIEWEnumLiteralDeclaration_0()); 
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:673:1: ( 'TaskReview' )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:673:3: 'TaskReview'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__StageType__Alternatives1386); 

                    }

                     after(grammarAccess.getStageTypeAccess().getTASK_REVIEWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:678:6: ( ( 'PatchReview' ) )
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:678:6: ( ( 'PatchReview' ) )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:679:1: ( 'PatchReview' )
                    {
                     before(grammarAccess.getStageTypeAccess().getPATCH_REVIEWEnumLiteralDeclaration_1()); 
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:680:1: ( 'PatchReview' )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:680:3: 'PatchReview'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__StageType__Alternatives1407); 

                    }

                     after(grammarAccess.getStageTypeAccess().getPATCH_REVIEWEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:685:6: ( ( 'Release' ) )
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:685:6: ( ( 'Release' ) )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:686:1: ( 'Release' )
                    {
                     before(grammarAccess.getStageTypeAccess().getRELEASEEnumLiteralDeclaration_2()); 
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:687:1: ( 'Release' )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:687:3: 'Release'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__StageType__Alternatives1428); 

                    }

                     after(grammarAccess.getStageTypeAccess().getRELEASEEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__StageType__Alternatives"


    // $ANTLR start "rule__RangeType__Alternatives"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:697:1: rule__RangeType__Alternatives : ( ( ( 'Present' ) ) | ( ( 'Qualified' ) ) );
    public final void rule__RangeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:701:1: ( ( ( 'Present' ) ) | ( ( 'Qualified' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:702:1: ( ( 'Present' ) )
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:702:1: ( ( 'Present' ) )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:703:1: ( 'Present' )
                    {
                     before(grammarAccess.getRangeTypeAccess().getPRESENTEnumLiteralDeclaration_0()); 
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:704:1: ( 'Present' )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:704:3: 'Present'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__RangeType__Alternatives1464); 

                    }

                     after(grammarAccess.getRangeTypeAccess().getPRESENTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:709:6: ( ( 'Qualified' ) )
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:709:6: ( ( 'Qualified' ) )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:710:1: ( 'Qualified' )
                    {
                     before(grammarAccess.getRangeTypeAccess().getQUALIFIEDEnumLiteralDeclaration_1()); 
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:711:1: ( 'Qualified' )
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:711:3: 'Qualified'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__RangeType__Alternatives1485); 

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:723:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:727:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:728:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__0__Impl_in_rule__Project__Group__01518);
            rule__Project__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__1_in_rule__Project__Group__01521);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:735:1: rule__Project__Group__0__Impl : ( () ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:739:1: ( ( () ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:740:1: ( () )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:740:1: ( () )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:741:1: ()
            {
             before(grammarAccess.getProjectAccess().getProjectAction_0()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:742:1: ()
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:744:1: 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:754:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:758:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:759:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__1__Impl_in_rule__Project__Group__11579);
            rule__Project__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__2_in_rule__Project__Group__11582);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:766:1: rule__Project__Group__1__Impl : ( 'Project' ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:770:1: ( ( 'Project' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:771:1: ( 'Project' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:771:1: ( 'Project' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:772:1: 'Project'
            {
             before(grammarAccess.getProjectAccess().getProjectKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Project__Group__1__Impl1610); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:785:1: rule__Project__Group__2 : rule__Project__Group__2__Impl rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:789:1: ( rule__Project__Group__2__Impl rule__Project__Group__3 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:790:2: rule__Project__Group__2__Impl rule__Project__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__2__Impl_in_rule__Project__Group__21641);
            rule__Project__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__3_in_rule__Project__Group__21644);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:797:1: rule__Project__Group__2__Impl : ( ( rule__Project__NameAssignment_2 ) ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:801:1: ( ( ( rule__Project__NameAssignment_2 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:802:1: ( ( rule__Project__NameAssignment_2 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:802:1: ( ( rule__Project__NameAssignment_2 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:803:1: ( rule__Project__NameAssignment_2 )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment_2()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:804:1: ( rule__Project__NameAssignment_2 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:804:2: rule__Project__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__NameAssignment_2_in_rule__Project__Group__2__Impl1671);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:814:1: rule__Project__Group__3 : rule__Project__Group__3__Impl rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:818:1: ( rule__Project__Group__3__Impl rule__Project__Group__4 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:819:2: rule__Project__Group__3__Impl rule__Project__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__3__Impl_in_rule__Project__Group__31701);
            rule__Project__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__4_in_rule__Project__Group__31704);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:826:1: rule__Project__Group__3__Impl : ( '{' ) ;
    public final void rule__Project__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:830:1: ( ( '{' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:831:1: ( '{' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:831:1: ( '{' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:832:1: '{'
            {
             before(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Project__Group__3__Impl1732); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:845:1: rule__Project__Group__4 : rule__Project__Group__4__Impl rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:849:1: ( rule__Project__Group__4__Impl rule__Project__Group__5 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:850:2: rule__Project__Group__4__Impl rule__Project__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__4__Impl_in_rule__Project__Group__41763);
            rule__Project__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__5_in_rule__Project__Group__41766);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:857:1: rule__Project__Group__4__Impl : ( ( rule__Project__Group_4__0 )? ) ;
    public final void rule__Project__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:861:1: ( ( ( rule__Project__Group_4__0 )? ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:862:1: ( ( rule__Project__Group_4__0 )? )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:862:1: ( ( rule__Project__Group_4__0 )? )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:863:1: ( rule__Project__Group_4__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_4()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:864:1: ( rule__Project__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:864:2: rule__Project__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Project__Group_4__0_in_rule__Project__Group__4__Impl1793);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:874:1: rule__Project__Group__5 : rule__Project__Group__5__Impl rule__Project__Group__6 ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:878:1: ( rule__Project__Group__5__Impl rule__Project__Group__6 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:879:2: rule__Project__Group__5__Impl rule__Project__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__5__Impl_in_rule__Project__Group__51824);
            rule__Project__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__6_in_rule__Project__Group__51827);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:886:1: rule__Project__Group__5__Impl : ( ( rule__Project__Group_5__0 )? ) ;
    public final void rule__Project__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:890:1: ( ( ( rule__Project__Group_5__0 )? ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:891:1: ( ( rule__Project__Group_5__0 )? )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:891:1: ( ( rule__Project__Group_5__0 )? )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:892:1: ( rule__Project__Group_5__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_5()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:893:1: ( rule__Project__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:893:2: rule__Project__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Project__Group_5__0_in_rule__Project__Group__5__Impl1854);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:903:1: rule__Project__Group__6 : rule__Project__Group__6__Impl rule__Project__Group__7 ;
    public final void rule__Project__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:907:1: ( rule__Project__Group__6__Impl rule__Project__Group__7 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:908:2: rule__Project__Group__6__Impl rule__Project__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__6__Impl_in_rule__Project__Group__61885);
            rule__Project__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__7_in_rule__Project__Group__61888);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:915:1: rule__Project__Group__6__Impl : ( ( rule__Project__Group_6__0 )? ) ;
    public final void rule__Project__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:919:1: ( ( ( rule__Project__Group_6__0 )? ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:920:1: ( ( rule__Project__Group_6__0 )? )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:920:1: ( ( rule__Project__Group_6__0 )? )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:921:1: ( rule__Project__Group_6__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_6()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:922:1: ( rule__Project__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:922:2: rule__Project__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Project__Group_6__0_in_rule__Project__Group__6__Impl1915);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:932:1: rule__Project__Group__7 : rule__Project__Group__7__Impl ;
    public final void rule__Project__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:936:1: ( rule__Project__Group__7__Impl )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:937:2: rule__Project__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__7__Impl_in_rule__Project__Group__71946);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:943:1: rule__Project__Group__7__Impl : ( '}' ) ;
    public final void rule__Project__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:947:1: ( ( '}' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:948:1: ( '}' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:948:1: ( '}' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:949:1: '}'
            {
             before(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Project__Group__7__Impl1974); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:978:1: rule__Project__Group_4__0 : rule__Project__Group_4__0__Impl rule__Project__Group_4__1 ;
    public final void rule__Project__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:982:1: ( rule__Project__Group_4__0__Impl rule__Project__Group_4__1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:983:2: rule__Project__Group_4__0__Impl rule__Project__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_4__0__Impl_in_rule__Project__Group_4__02021);
            rule__Project__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_4__1_in_rule__Project__Group_4__02024);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:990:1: rule__Project__Group_4__0__Impl : ( 'Roles' ) ;
    public final void rule__Project__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:994:1: ( ( 'Roles' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:995:1: ( 'Roles' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:995:1: ( 'Roles' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:996:1: 'Roles'
            {
             before(grammarAccess.getProjectAccess().getRolesKeyword_4_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Project__Group_4__0__Impl2052); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1009:1: rule__Project__Group_4__1 : rule__Project__Group_4__1__Impl rule__Project__Group_4__2 ;
    public final void rule__Project__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1013:1: ( rule__Project__Group_4__1__Impl rule__Project__Group_4__2 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1014:2: rule__Project__Group_4__1__Impl rule__Project__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_4__1__Impl_in_rule__Project__Group_4__12083);
            rule__Project__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_4__2_in_rule__Project__Group_4__12086);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1021:1: rule__Project__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Project__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1025:1: ( ( ':' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1026:1: ( ':' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1026:1: ( ':' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1027:1: ':'
            {
             before(grammarAccess.getProjectAccess().getColonKeyword_4_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Project__Group_4__1__Impl2114); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1040:1: rule__Project__Group_4__2 : rule__Project__Group_4__2__Impl rule__Project__Group_4__3 ;
    public final void rule__Project__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1044:1: ( rule__Project__Group_4__2__Impl rule__Project__Group_4__3 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1045:2: rule__Project__Group_4__2__Impl rule__Project__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_4__2__Impl_in_rule__Project__Group_4__22145);
            rule__Project__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_4__3_in_rule__Project__Group_4__22148);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1052:1: rule__Project__Group_4__2__Impl : ( ( rule__Project__RolesAssignment_4_2 ) ) ;
    public final void rule__Project__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1056:1: ( ( ( rule__Project__RolesAssignment_4_2 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1057:1: ( ( rule__Project__RolesAssignment_4_2 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1057:1: ( ( rule__Project__RolesAssignment_4_2 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1058:1: ( rule__Project__RolesAssignment_4_2 )
            {
             before(grammarAccess.getProjectAccess().getRolesAssignment_4_2()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1059:1: ( rule__Project__RolesAssignment_4_2 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1059:2: rule__Project__RolesAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__RolesAssignment_4_2_in_rule__Project__Group_4__2__Impl2175);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1069:1: rule__Project__Group_4__3 : rule__Project__Group_4__3__Impl ;
    public final void rule__Project__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1073:1: ( rule__Project__Group_4__3__Impl )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1074:2: rule__Project__Group_4__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_4__3__Impl_in_rule__Project__Group_4__32205);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1080:1: rule__Project__Group_4__3__Impl : ( ( rule__Project__Group_4_3__0 )* ) ;
    public final void rule__Project__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1084:1: ( ( ( rule__Project__Group_4_3__0 )* ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1085:1: ( ( rule__Project__Group_4_3__0 )* )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1085:1: ( ( rule__Project__Group_4_3__0 )* )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1086:1: ( rule__Project__Group_4_3__0 )*
            {
             before(grammarAccess.getProjectAccess().getGroup_4_3()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1087:1: ( rule__Project__Group_4_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1087:2: rule__Project__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Project__Group_4_3__0_in_rule__Project__Group_4__3__Impl2232);
            	    rule__Project__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1105:1: rule__Project__Group_4_3__0 : rule__Project__Group_4_3__0__Impl rule__Project__Group_4_3__1 ;
    public final void rule__Project__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1109:1: ( rule__Project__Group_4_3__0__Impl rule__Project__Group_4_3__1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1110:2: rule__Project__Group_4_3__0__Impl rule__Project__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_4_3__0__Impl_in_rule__Project__Group_4_3__02271);
            rule__Project__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_4_3__1_in_rule__Project__Group_4_3__02274);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1117:1: rule__Project__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Project__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1121:1: ( ( ',' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1122:1: ( ',' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1122:1: ( ',' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1123:1: ','
            {
             before(grammarAccess.getProjectAccess().getCommaKeyword_4_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Project__Group_4_3__0__Impl2302); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1136:1: rule__Project__Group_4_3__1 : rule__Project__Group_4_3__1__Impl ;
    public final void rule__Project__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1140:1: ( rule__Project__Group_4_3__1__Impl )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1141:2: rule__Project__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_4_3__1__Impl_in_rule__Project__Group_4_3__12333);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1147:1: rule__Project__Group_4_3__1__Impl : ( ( rule__Project__RolesAssignment_4_3_1 ) ) ;
    public final void rule__Project__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1151:1: ( ( ( rule__Project__RolesAssignment_4_3_1 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1152:1: ( ( rule__Project__RolesAssignment_4_3_1 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1152:1: ( ( rule__Project__RolesAssignment_4_3_1 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1153:1: ( rule__Project__RolesAssignment_4_3_1 )
            {
             before(grammarAccess.getProjectAccess().getRolesAssignment_4_3_1()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1154:1: ( rule__Project__RolesAssignment_4_3_1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1154:2: rule__Project__RolesAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__RolesAssignment_4_3_1_in_rule__Project__Group_4_3__1__Impl2360);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1168:1: rule__Project__Group_5__0 : rule__Project__Group_5__0__Impl rule__Project__Group_5__1 ;
    public final void rule__Project__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1172:1: ( rule__Project__Group_5__0__Impl rule__Project__Group_5__1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1173:2: rule__Project__Group_5__0__Impl rule__Project__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_5__0__Impl_in_rule__Project__Group_5__02394);
            rule__Project__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_5__1_in_rule__Project__Group_5__02397);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1180:1: rule__Project__Group_5__0__Impl : ( 'Deadlines' ) ;
    public final void rule__Project__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1184:1: ( ( 'Deadlines' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1185:1: ( 'Deadlines' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1185:1: ( 'Deadlines' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1186:1: 'Deadlines'
            {
             before(grammarAccess.getProjectAccess().getDeadlinesKeyword_5_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Project__Group_5__0__Impl2425); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1199:1: rule__Project__Group_5__1 : rule__Project__Group_5__1__Impl rule__Project__Group_5__2 ;
    public final void rule__Project__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1203:1: ( rule__Project__Group_5__1__Impl rule__Project__Group_5__2 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1204:2: rule__Project__Group_5__1__Impl rule__Project__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_5__1__Impl_in_rule__Project__Group_5__12456);
            rule__Project__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_5__2_in_rule__Project__Group_5__12459);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1211:1: rule__Project__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Project__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1215:1: ( ( ':' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1216:1: ( ':' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1216:1: ( ':' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1217:1: ':'
            {
             before(grammarAccess.getProjectAccess().getColonKeyword_5_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Project__Group_5__1__Impl2487); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1230:1: rule__Project__Group_5__2 : rule__Project__Group_5__2__Impl rule__Project__Group_5__3 ;
    public final void rule__Project__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1234:1: ( rule__Project__Group_5__2__Impl rule__Project__Group_5__3 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1235:2: rule__Project__Group_5__2__Impl rule__Project__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_5__2__Impl_in_rule__Project__Group_5__22518);
            rule__Project__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_5__3_in_rule__Project__Group_5__22521);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1242:1: rule__Project__Group_5__2__Impl : ( ( rule__Project__DeadlinesAssignment_5_2 ) ) ;
    public final void rule__Project__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1246:1: ( ( ( rule__Project__DeadlinesAssignment_5_2 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1247:1: ( ( rule__Project__DeadlinesAssignment_5_2 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1247:1: ( ( rule__Project__DeadlinesAssignment_5_2 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1248:1: ( rule__Project__DeadlinesAssignment_5_2 )
            {
             before(grammarAccess.getProjectAccess().getDeadlinesAssignment_5_2()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1249:1: ( rule__Project__DeadlinesAssignment_5_2 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1249:2: rule__Project__DeadlinesAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__DeadlinesAssignment_5_2_in_rule__Project__Group_5__2__Impl2548);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1259:1: rule__Project__Group_5__3 : rule__Project__Group_5__3__Impl ;
    public final void rule__Project__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1263:1: ( rule__Project__Group_5__3__Impl )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1264:2: rule__Project__Group_5__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_5__3__Impl_in_rule__Project__Group_5__32578);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1270:1: rule__Project__Group_5__3__Impl : ( ( rule__Project__Group_5_3__0 )* ) ;
    public final void rule__Project__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1274:1: ( ( ( rule__Project__Group_5_3__0 )* ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1275:1: ( ( rule__Project__Group_5_3__0 )* )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1275:1: ( ( rule__Project__Group_5_3__0 )* )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1276:1: ( rule__Project__Group_5_3__0 )*
            {
             before(grammarAccess.getProjectAccess().getGroup_5_3()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1277:1: ( rule__Project__Group_5_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1277:2: rule__Project__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Project__Group_5_3__0_in_rule__Project__Group_5__3__Impl2605);
            	    rule__Project__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1295:1: rule__Project__Group_5_3__0 : rule__Project__Group_5_3__0__Impl rule__Project__Group_5_3__1 ;
    public final void rule__Project__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1299:1: ( rule__Project__Group_5_3__0__Impl rule__Project__Group_5_3__1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1300:2: rule__Project__Group_5_3__0__Impl rule__Project__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_5_3__0__Impl_in_rule__Project__Group_5_3__02644);
            rule__Project__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_5_3__1_in_rule__Project__Group_5_3__02647);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1307:1: rule__Project__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Project__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1311:1: ( ( ',' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1312:1: ( ',' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1312:1: ( ',' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1313:1: ','
            {
             before(grammarAccess.getProjectAccess().getCommaKeyword_5_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Project__Group_5_3__0__Impl2675); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1326:1: rule__Project__Group_5_3__1 : rule__Project__Group_5_3__1__Impl ;
    public final void rule__Project__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1330:1: ( rule__Project__Group_5_3__1__Impl )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1331:2: rule__Project__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_5_3__1__Impl_in_rule__Project__Group_5_3__12706);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1337:1: rule__Project__Group_5_3__1__Impl : ( ( rule__Project__DeadlinesAssignment_5_3_1 ) ) ;
    public final void rule__Project__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1341:1: ( ( ( rule__Project__DeadlinesAssignment_5_3_1 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1342:1: ( ( rule__Project__DeadlinesAssignment_5_3_1 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1342:1: ( ( rule__Project__DeadlinesAssignment_5_3_1 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1343:1: ( rule__Project__DeadlinesAssignment_5_3_1 )
            {
             before(grammarAccess.getProjectAccess().getDeadlinesAssignment_5_3_1()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1344:1: ( rule__Project__DeadlinesAssignment_5_3_1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1344:2: rule__Project__DeadlinesAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__DeadlinesAssignment_5_3_1_in_rule__Project__Group_5_3__1__Impl2733);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1358:1: rule__Project__Group_6__0 : rule__Project__Group_6__0__Impl rule__Project__Group_6__1 ;
    public final void rule__Project__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1362:1: ( rule__Project__Group_6__0__Impl rule__Project__Group_6__1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1363:2: rule__Project__Group_6__0__Impl rule__Project__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_6__0__Impl_in_rule__Project__Group_6__02767);
            rule__Project__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_6__1_in_rule__Project__Group_6__02770);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1370:1: rule__Project__Group_6__0__Impl : ( 'Strategies' ) ;
    public final void rule__Project__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1374:1: ( ( 'Strategies' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1375:1: ( 'Strategies' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1375:1: ( 'Strategies' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1376:1: 'Strategies'
            {
             before(grammarAccess.getProjectAccess().getStrategiesKeyword_6_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Project__Group_6__0__Impl2798); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1389:1: rule__Project__Group_6__1 : rule__Project__Group_6__1__Impl rule__Project__Group_6__2 ;
    public final void rule__Project__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1393:1: ( rule__Project__Group_6__1__Impl rule__Project__Group_6__2 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1394:2: rule__Project__Group_6__1__Impl rule__Project__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_6__1__Impl_in_rule__Project__Group_6__12829);
            rule__Project__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_6__2_in_rule__Project__Group_6__12832);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1401:1: rule__Project__Group_6__1__Impl : ( ':' ) ;
    public final void rule__Project__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1405:1: ( ( ':' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1406:1: ( ':' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1406:1: ( ':' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1407:1: ':'
            {
             before(grammarAccess.getProjectAccess().getColonKeyword_6_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Project__Group_6__1__Impl2860); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1420:1: rule__Project__Group_6__2 : rule__Project__Group_6__2__Impl rule__Project__Group_6__3 ;
    public final void rule__Project__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1424:1: ( rule__Project__Group_6__2__Impl rule__Project__Group_6__3 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1425:2: rule__Project__Group_6__2__Impl rule__Project__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_6__2__Impl_in_rule__Project__Group_6__22891);
            rule__Project__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_6__3_in_rule__Project__Group_6__22894);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1432:1: rule__Project__Group_6__2__Impl : ( ( rule__Project__StrategiesAssignment_6_2 ) ) ;
    public final void rule__Project__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1436:1: ( ( ( rule__Project__StrategiesAssignment_6_2 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1437:1: ( ( rule__Project__StrategiesAssignment_6_2 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1437:1: ( ( rule__Project__StrategiesAssignment_6_2 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1438:1: ( rule__Project__StrategiesAssignment_6_2 )
            {
             before(grammarAccess.getProjectAccess().getStrategiesAssignment_6_2()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1439:1: ( rule__Project__StrategiesAssignment_6_2 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1439:2: rule__Project__StrategiesAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__StrategiesAssignment_6_2_in_rule__Project__Group_6__2__Impl2921);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1449:1: rule__Project__Group_6__3 : rule__Project__Group_6__3__Impl ;
    public final void rule__Project__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1453:1: ( rule__Project__Group_6__3__Impl )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1454:2: rule__Project__Group_6__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_6__3__Impl_in_rule__Project__Group_6__32951);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1460:1: rule__Project__Group_6__3__Impl : ( ( rule__Project__Group_6_3__0 )* ) ;
    public final void rule__Project__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1464:1: ( ( ( rule__Project__Group_6_3__0 )* ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1465:1: ( ( rule__Project__Group_6_3__0 )* )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1465:1: ( ( rule__Project__Group_6_3__0 )* )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1466:1: ( rule__Project__Group_6_3__0 )*
            {
             before(grammarAccess.getProjectAccess().getGroup_6_3()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1467:1: ( rule__Project__Group_6_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1467:2: rule__Project__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Project__Group_6_3__0_in_rule__Project__Group_6__3__Impl2978);
            	    rule__Project__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1485:1: rule__Project__Group_6_3__0 : rule__Project__Group_6_3__0__Impl rule__Project__Group_6_3__1 ;
    public final void rule__Project__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1489:1: ( rule__Project__Group_6_3__0__Impl rule__Project__Group_6_3__1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1490:2: rule__Project__Group_6_3__0__Impl rule__Project__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_6_3__0__Impl_in_rule__Project__Group_6_3__03017);
            rule__Project__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_6_3__1_in_rule__Project__Group_6_3__03020);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1497:1: rule__Project__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Project__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1501:1: ( ( ',' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1502:1: ( ',' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1502:1: ( ',' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1503:1: ','
            {
             before(grammarAccess.getProjectAccess().getCommaKeyword_6_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Project__Group_6_3__0__Impl3048); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1516:1: rule__Project__Group_6_3__1 : rule__Project__Group_6_3__1__Impl ;
    public final void rule__Project__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1520:1: ( rule__Project__Group_6_3__1__Impl )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1521:2: rule__Project__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group_6_3__1__Impl_in_rule__Project__Group_6_3__13079);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1527:1: rule__Project__Group_6_3__1__Impl : ( ( rule__Project__StrategiesAssignment_6_3_1 ) ) ;
    public final void rule__Project__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1531:1: ( ( ( rule__Project__StrategiesAssignment_6_3_1 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1532:1: ( ( rule__Project__StrategiesAssignment_6_3_1 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1532:1: ( ( rule__Project__StrategiesAssignment_6_3_1 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1533:1: ( rule__Project__StrategiesAssignment_6_3_1 )
            {
             before(grammarAccess.getProjectAccess().getStrategiesAssignment_6_3_1()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1534:1: ( rule__Project__StrategiesAssignment_6_3_1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1534:2: rule__Project__StrategiesAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__StrategiesAssignment_6_3_1_in_rule__Project__Group_6_3__1__Impl3106);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1548:1: rule__Majority__Group__0 : rule__Majority__Group__0__Impl rule__Majority__Group__1 ;
    public final void rule__Majority__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1552:1: ( rule__Majority__Group__0__Impl rule__Majority__Group__1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1553:2: rule__Majority__Group__0__Impl rule__Majority__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__0__Impl_in_rule__Majority__Group__03140);
            rule__Majority__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__1_in_rule__Majority__Group__03143);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1560:1: rule__Majority__Group__0__Impl : ( ( rule__Majority__NameAssignment_0 ) ) ;
    public final void rule__Majority__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1564:1: ( ( ( rule__Majority__NameAssignment_0 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1565:1: ( ( rule__Majority__NameAssignment_0 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1565:1: ( ( rule__Majority__NameAssignment_0 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1566:1: ( rule__Majority__NameAssignment_0 )
            {
             before(grammarAccess.getMajorityAccess().getNameAssignment_0()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1567:1: ( rule__Majority__NameAssignment_0 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1567:2: rule__Majority__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__NameAssignment_0_in_rule__Majority__Group__0__Impl3170);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1577:1: rule__Majority__Group__1 : rule__Majority__Group__1__Impl rule__Majority__Group__2 ;
    public final void rule__Majority__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1581:1: ( rule__Majority__Group__1__Impl rule__Majority__Group__2 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1582:2: rule__Majority__Group__1__Impl rule__Majority__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__1__Impl_in_rule__Majority__Group__13200);
            rule__Majority__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__2_in_rule__Majority__Group__13203);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1589:1: rule__Majority__Group__1__Impl : ( ':' ) ;
    public final void rule__Majority__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1593:1: ( ( ':' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1594:1: ( ':' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1594:1: ( ':' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1595:1: ':'
            {
             before(grammarAccess.getMajorityAccess().getColonKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Majority__Group__1__Impl3231); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1608:1: rule__Majority__Group__2 : rule__Majority__Group__2__Impl rule__Majority__Group__3 ;
    public final void rule__Majority__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1612:1: ( rule__Majority__Group__2__Impl rule__Majority__Group__3 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1613:2: rule__Majority__Group__2__Impl rule__Majority__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__2__Impl_in_rule__Majority__Group__23262);
            rule__Majority__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__3_in_rule__Majority__Group__23265);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1620:1: rule__Majority__Group__2__Impl : ( 'Majority' ) ;
    public final void rule__Majority__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1624:1: ( ( 'Majority' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1625:1: ( 'Majority' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1625:1: ( 'Majority' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1626:1: 'Majority'
            {
             before(grammarAccess.getMajorityAccess().getMajorityKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Majority__Group__2__Impl3293); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1639:1: rule__Majority__Group__3 : rule__Majority__Group__3__Impl rule__Majority__Group__4 ;
    public final void rule__Majority__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1643:1: ( rule__Majority__Group__3__Impl rule__Majority__Group__4 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1644:2: rule__Majority__Group__3__Impl rule__Majority__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__3__Impl_in_rule__Majority__Group__33324);
            rule__Majority__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__4_in_rule__Majority__Group__33327);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1651:1: rule__Majority__Group__3__Impl : ( '{' ) ;
    public final void rule__Majority__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1655:1: ( ( '{' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1656:1: ( '{' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1656:1: ( '{' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1657:1: '{'
            {
             before(grammarAccess.getMajorityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Majority__Group__3__Impl3355); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1670:1: rule__Majority__Group__4 : rule__Majority__Group__4__Impl rule__Majority__Group__5 ;
    public final void rule__Majority__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1674:1: ( rule__Majority__Group__4__Impl rule__Majority__Group__5 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1675:2: rule__Majority__Group__4__Impl rule__Majority__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__4__Impl_in_rule__Majority__Group__43386);
            rule__Majority__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__5_in_rule__Majority__Group__43389);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1682:1: rule__Majority__Group__4__Impl : ( 'applied to' ) ;
    public final void rule__Majority__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1686:1: ( ( 'applied to' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1687:1: ( 'applied to' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1687:1: ( 'applied to' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1688:1: 'applied to'
            {
             before(grammarAccess.getMajorityAccess().getAppliedToKeyword_4()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Majority__Group__4__Impl3417); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1701:1: rule__Majority__Group__5 : rule__Majority__Group__5__Impl rule__Majority__Group__6 ;
    public final void rule__Majority__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1705:1: ( rule__Majority__Group__5__Impl rule__Majority__Group__6 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1706:2: rule__Majority__Group__5__Impl rule__Majority__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__5__Impl_in_rule__Majority__Group__53448);
            rule__Majority__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__6_in_rule__Majority__Group__53451);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1713:1: rule__Majority__Group__5__Impl : ( ( rule__Majority__AppliedToAssignment_5 ) ) ;
    public final void rule__Majority__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1717:1: ( ( ( rule__Majority__AppliedToAssignment_5 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1718:1: ( ( rule__Majority__AppliedToAssignment_5 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1718:1: ( ( rule__Majority__AppliedToAssignment_5 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1719:1: ( rule__Majority__AppliedToAssignment_5 )
            {
             before(grammarAccess.getMajorityAccess().getAppliedToAssignment_5()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1720:1: ( rule__Majority__AppliedToAssignment_5 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1720:2: rule__Majority__AppliedToAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__AppliedToAssignment_5_in_rule__Majority__Group__5__Impl3478);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1730:1: rule__Majority__Group__6 : rule__Majority__Group__6__Impl rule__Majority__Group__7 ;
    public final void rule__Majority__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1734:1: ( rule__Majority__Group__6__Impl rule__Majority__Group__7 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1735:2: rule__Majority__Group__6__Impl rule__Majority__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__6__Impl_in_rule__Majority__Group__63508);
            rule__Majority__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__7_in_rule__Majority__Group__63511);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1742:1: rule__Majority__Group__6__Impl : ( ( rule__Majority__Group_6__0 )? ) ;
    public final void rule__Majority__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1746:1: ( ( ( rule__Majority__Group_6__0 )? ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1747:1: ( ( rule__Majority__Group_6__0 )? )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1747:1: ( ( rule__Majority__Group_6__0 )? )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1748:1: ( rule__Majority__Group_6__0 )?
            {
             before(grammarAccess.getMajorityAccess().getGroup_6()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1749:1: ( rule__Majority__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1749:2: rule__Majority__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_6__0_in_rule__Majority__Group__6__Impl3538);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1759:1: rule__Majority__Group__7 : rule__Majority__Group__7__Impl rule__Majority__Group__8 ;
    public final void rule__Majority__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1763:1: ( rule__Majority__Group__7__Impl rule__Majority__Group__8 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1764:2: rule__Majority__Group__7__Impl rule__Majority__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__7__Impl_in_rule__Majority__Group__73569);
            rule__Majority__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__8_in_rule__Majority__Group__73572);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1771:1: rule__Majority__Group__7__Impl : ( 'when' ) ;
    public final void rule__Majority__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1775:1: ( ( 'when' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1776:1: ( 'when' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1776:1: ( 'when' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1777:1: 'when'
            {
             before(grammarAccess.getMajorityAccess().getWhenKeyword_7()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Majority__Group__7__Impl3600); 
             after(grammarAccess.getMajorityAccess().getWhenKeyword_7()); 

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1790:1: rule__Majority__Group__8 : rule__Majority__Group__8__Impl rule__Majority__Group__9 ;
    public final void rule__Majority__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1794:1: ( rule__Majority__Group__8__Impl rule__Majority__Group__9 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1795:2: rule__Majority__Group__8__Impl rule__Majority__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__8__Impl_in_rule__Majority__Group__83631);
            rule__Majority__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__9_in_rule__Majority__Group__83634);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1802:1: rule__Majority__Group__8__Impl : ( ( rule__Majority__StageAssignment_8 ) ) ;
    public final void rule__Majority__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1806:1: ( ( ( rule__Majority__StageAssignment_8 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1807:1: ( ( rule__Majority__StageAssignment_8 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1807:1: ( ( rule__Majority__StageAssignment_8 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1808:1: ( rule__Majority__StageAssignment_8 )
            {
             before(grammarAccess.getMajorityAccess().getStageAssignment_8()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1809:1: ( rule__Majority__StageAssignment_8 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1809:2: rule__Majority__StageAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__StageAssignment_8_in_rule__Majority__Group__8__Impl3661);
            rule__Majority__StageAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getMajorityAccess().getStageAssignment_8()); 

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1819:1: rule__Majority__Group__9 : rule__Majority__Group__9__Impl rule__Majority__Group__10 ;
    public final void rule__Majority__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1823:1: ( rule__Majority__Group__9__Impl rule__Majority__Group__10 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1824:2: rule__Majority__Group__9__Impl rule__Majority__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__9__Impl_in_rule__Majority__Group__93691);
            rule__Majority__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__10_in_rule__Majority__Group__93694);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1831:1: rule__Majority__Group__9__Impl : ( 'people' ) ;
    public final void rule__Majority__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1835:1: ( ( 'people' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1836:1: ( 'people' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1836:1: ( 'people' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1837:1: 'people'
            {
             before(grammarAccess.getMajorityAccess().getPeopleKeyword_9()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Majority__Group__9__Impl3722); 
             after(grammarAccess.getMajorityAccess().getPeopleKeyword_9()); 

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1850:1: rule__Majority__Group__10 : rule__Majority__Group__10__Impl rule__Majority__Group__11 ;
    public final void rule__Majority__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1854:1: ( rule__Majority__Group__10__Impl rule__Majority__Group__11 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1855:2: rule__Majority__Group__10__Impl rule__Majority__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__10__Impl_in_rule__Majority__Group__103753);
            rule__Majority__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__11_in_rule__Majority__Group__103756);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1862:1: rule__Majority__Group__10__Impl : ( ( rule__Majority__PeopleAssignment_10 ) ) ;
    public final void rule__Majority__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1866:1: ( ( ( rule__Majority__PeopleAssignment_10 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1867:1: ( ( rule__Majority__PeopleAssignment_10 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1867:1: ( ( rule__Majority__PeopleAssignment_10 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1868:1: ( rule__Majority__PeopleAssignment_10 )
            {
             before(grammarAccess.getMajorityAccess().getPeopleAssignment_10()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1869:1: ( rule__Majority__PeopleAssignment_10 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1869:2: rule__Majority__PeopleAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__PeopleAssignment_10_in_rule__Majority__Group__10__Impl3783);
            rule__Majority__PeopleAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getMajorityAccess().getPeopleAssignment_10()); 

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1879:1: rule__Majority__Group__11 : rule__Majority__Group__11__Impl rule__Majority__Group__12 ;
    public final void rule__Majority__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1883:1: ( rule__Majority__Group__11__Impl rule__Majority__Group__12 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1884:2: rule__Majority__Group__11__Impl rule__Majority__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__11__Impl_in_rule__Majority__Group__113813);
            rule__Majority__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__12_in_rule__Majority__Group__113816);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1891:1: rule__Majority__Group__11__Impl : ( ( rule__Majority__Group_11__0 )* ) ;
    public final void rule__Majority__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1895:1: ( ( ( rule__Majority__Group_11__0 )* ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1896:1: ( ( rule__Majority__Group_11__0 )* )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1896:1: ( ( rule__Majority__Group_11__0 )* )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1897:1: ( rule__Majority__Group_11__0 )*
            {
             before(grammarAccess.getMajorityAccess().getGroup_11()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1898:1: ( rule__Majority__Group_11__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1898:2: rule__Majority__Group_11__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_11__0_in_rule__Majority__Group__11__Impl3843);
            	    rule__Majority__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getMajorityAccess().getGroup_11()); 

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1908:1: rule__Majority__Group__12 : rule__Majority__Group__12__Impl rule__Majority__Group__13 ;
    public final void rule__Majority__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1912:1: ( rule__Majority__Group__12__Impl rule__Majority__Group__13 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1913:2: rule__Majority__Group__12__Impl rule__Majority__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__12__Impl_in_rule__Majority__Group__123874);
            rule__Majority__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__13_in_rule__Majority__Group__123877);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1920:1: rule__Majority__Group__12__Impl : ( 'range' ) ;
    public final void rule__Majority__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1924:1: ( ( 'range' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1925:1: ( 'range' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1925:1: ( 'range' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1926:1: 'range'
            {
             before(grammarAccess.getMajorityAccess().getRangeKeyword_12()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Majority__Group__12__Impl3905); 
             after(grammarAccess.getMajorityAccess().getRangeKeyword_12()); 

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1939:1: rule__Majority__Group__13 : rule__Majority__Group__13__Impl rule__Majority__Group__14 ;
    public final void rule__Majority__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1943:1: ( rule__Majority__Group__13__Impl rule__Majority__Group__14 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1944:2: rule__Majority__Group__13__Impl rule__Majority__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__13__Impl_in_rule__Majority__Group__133936);
            rule__Majority__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__14_in_rule__Majority__Group__133939);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1951:1: rule__Majority__Group__13__Impl : ( ( rule__Majority__RangeAssignment_13 ) ) ;
    public final void rule__Majority__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1955:1: ( ( ( rule__Majority__RangeAssignment_13 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1956:1: ( ( rule__Majority__RangeAssignment_13 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1956:1: ( ( rule__Majority__RangeAssignment_13 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1957:1: ( rule__Majority__RangeAssignment_13 )
            {
             before(grammarAccess.getMajorityAccess().getRangeAssignment_13()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1958:1: ( rule__Majority__RangeAssignment_13 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1958:2: rule__Majority__RangeAssignment_13
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__RangeAssignment_13_in_rule__Majority__Group__13__Impl3966);
            rule__Majority__RangeAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getMajorityAccess().getRangeAssignment_13()); 

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1968:1: rule__Majority__Group__14 : rule__Majority__Group__14__Impl rule__Majority__Group__15 ;
    public final void rule__Majority__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1972:1: ( rule__Majority__Group__14__Impl rule__Majority__Group__15 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1973:2: rule__Majority__Group__14__Impl rule__Majority__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__14__Impl_in_rule__Majority__Group__143996);
            rule__Majority__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__15_in_rule__Majority__Group__143999);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1980:1: rule__Majority__Group__14__Impl : ( ( rule__Majority__Group_14__0 )? ) ;
    public final void rule__Majority__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1984:1: ( ( ( rule__Majority__Group_14__0 )? ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1985:1: ( ( rule__Majority__Group_14__0 )? )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1985:1: ( ( rule__Majority__Group_14__0 )? )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1986:1: ( rule__Majority__Group_14__0 )?
            {
             before(grammarAccess.getMajorityAccess().getGroup_14()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1987:1: ( rule__Majority__Group_14__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1987:2: rule__Majority__Group_14__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_14__0_in_rule__Majority__Group__14__Impl4026);
                    rule__Majority__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMajorityAccess().getGroup_14()); 

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1997:1: rule__Majority__Group__15 : rule__Majority__Group__15__Impl rule__Majority__Group__16 ;
    public final void rule__Majority__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2001:1: ( rule__Majority__Group__15__Impl rule__Majority__Group__16 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2002:2: rule__Majority__Group__15__Impl rule__Majority__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__15__Impl_in_rule__Majority__Group__154057);
            rule__Majority__Group__15__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__16_in_rule__Majority__Group__154060);
            rule__Majority__Group__16();

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2009:1: rule__Majority__Group__15__Impl : ( 'deadline' ) ;
    public final void rule__Majority__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2013:1: ( ( 'deadline' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2014:1: ( 'deadline' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2014:1: ( 'deadline' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2015:1: 'deadline'
            {
             before(grammarAccess.getMajorityAccess().getDeadlineKeyword_15()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Majority__Group__15__Impl4088); 
             after(grammarAccess.getMajorityAccess().getDeadlineKeyword_15()); 

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


    // $ANTLR start "rule__Majority__Group__16"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2028:1: rule__Majority__Group__16 : rule__Majority__Group__16__Impl rule__Majority__Group__17 ;
    public final void rule__Majority__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2032:1: ( rule__Majority__Group__16__Impl rule__Majority__Group__17 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2033:2: rule__Majority__Group__16__Impl rule__Majority__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__16__Impl_in_rule__Majority__Group__164119);
            rule__Majority__Group__16__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__17_in_rule__Majority__Group__164122);
            rule__Majority__Group__17();

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
    // $ANTLR end "rule__Majority__Group__16"


    // $ANTLR start "rule__Majority__Group__16__Impl"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2040:1: rule__Majority__Group__16__Impl : ( ( rule__Majority__DeadlineAssignment_16 ) ) ;
    public final void rule__Majority__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2044:1: ( ( ( rule__Majority__DeadlineAssignment_16 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2045:1: ( ( rule__Majority__DeadlineAssignment_16 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2045:1: ( ( rule__Majority__DeadlineAssignment_16 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2046:1: ( rule__Majority__DeadlineAssignment_16 )
            {
             before(grammarAccess.getMajorityAccess().getDeadlineAssignment_16()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2047:1: ( rule__Majority__DeadlineAssignment_16 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2047:2: rule__Majority__DeadlineAssignment_16
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__DeadlineAssignment_16_in_rule__Majority__Group__16__Impl4149);
            rule__Majority__DeadlineAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getMajorityAccess().getDeadlineAssignment_16()); 

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
    // $ANTLR end "rule__Majority__Group__16__Impl"


    // $ANTLR start "rule__Majority__Group__17"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2057:1: rule__Majority__Group__17 : rule__Majority__Group__17__Impl ;
    public final void rule__Majority__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2061:1: ( rule__Majority__Group__17__Impl )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2062:2: rule__Majority__Group__17__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group__17__Impl_in_rule__Majority__Group__174179);
            rule__Majority__Group__17__Impl();

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
    // $ANTLR end "rule__Majority__Group__17"


    // $ANTLR start "rule__Majority__Group__17__Impl"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2068:1: rule__Majority__Group__17__Impl : ( '}' ) ;
    public final void rule__Majority__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2072:1: ( ( '}' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2073:1: ( '}' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2073:1: ( '}' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2074:1: '}'
            {
             before(grammarAccess.getMajorityAccess().getRightCurlyBracketKeyword_17()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Majority__Group__17__Impl4207); 
             after(grammarAccess.getMajorityAccess().getRightCurlyBracketKeyword_17()); 

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
    // $ANTLR end "rule__Majority__Group__17__Impl"


    // $ANTLR start "rule__Majority__Group_6__0"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2123:1: rule__Majority__Group_6__0 : rule__Majority__Group_6__0__Impl rule__Majority__Group_6__1 ;
    public final void rule__Majority__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2127:1: ( rule__Majority__Group_6__0__Impl rule__Majority__Group_6__1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2128:2: rule__Majority__Group_6__0__Impl rule__Majority__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_6__0__Impl_in_rule__Majority__Group_6__04274);
            rule__Majority__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_6__1_in_rule__Majority__Group_6__04277);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2135:1: rule__Majority__Group_6__0__Impl : ( '(' ) ;
    public final void rule__Majority__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2139:1: ( ( '(' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2140:1: ( '(' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2140:1: ( '(' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2141:1: '('
            {
             before(grammarAccess.getMajorityAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Majority__Group_6__0__Impl4305); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2154:1: rule__Majority__Group_6__1 : rule__Majority__Group_6__1__Impl rule__Majority__Group_6__2 ;
    public final void rule__Majority__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2158:1: ( rule__Majority__Group_6__1__Impl rule__Majority__Group_6__2 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2159:2: rule__Majority__Group_6__1__Impl rule__Majority__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_6__1__Impl_in_rule__Majority__Group_6__14336);
            rule__Majority__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_6__2_in_rule__Majority__Group_6__14339);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2166:1: rule__Majority__Group_6__1__Impl : ( ruleFilter ) ;
    public final void rule__Majority__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2170:1: ( ( ruleFilter ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2171:1: ( ruleFilter )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2171:1: ( ruleFilter )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2172:1: ruleFilter
            {
             before(grammarAccess.getMajorityAccess().getFilterParserRuleCall_6_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilter_in_rule__Majority__Group_6__1__Impl4366);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2183:1: rule__Majority__Group_6__2 : rule__Majority__Group_6__2__Impl ;
    public final void rule__Majority__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2187:1: ( rule__Majority__Group_6__2__Impl )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2188:2: rule__Majority__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_6__2__Impl_in_rule__Majority__Group_6__24395);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2194:1: rule__Majority__Group_6__2__Impl : ( ')' ) ;
    public final void rule__Majority__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2198:1: ( ( ')' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2199:1: ( ')' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2199:1: ( ')' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2200:1: ')'
            {
             before(grammarAccess.getMajorityAccess().getRightParenthesisKeyword_6_2()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Majority__Group_6__2__Impl4423); 
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


    // $ANTLR start "rule__Majority__Group_11__0"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2219:1: rule__Majority__Group_11__0 : rule__Majority__Group_11__0__Impl rule__Majority__Group_11__1 ;
    public final void rule__Majority__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2223:1: ( rule__Majority__Group_11__0__Impl rule__Majority__Group_11__1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2224:2: rule__Majority__Group_11__0__Impl rule__Majority__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_11__0__Impl_in_rule__Majority__Group_11__04460);
            rule__Majority__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_11__1_in_rule__Majority__Group_11__04463);
            rule__Majority__Group_11__1();

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
    // $ANTLR end "rule__Majority__Group_11__0"


    // $ANTLR start "rule__Majority__Group_11__0__Impl"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2231:1: rule__Majority__Group_11__0__Impl : ( ',' ) ;
    public final void rule__Majority__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2235:1: ( ( ',' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2236:1: ( ',' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2236:1: ( ',' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2237:1: ','
            {
             before(grammarAccess.getMajorityAccess().getCommaKeyword_11_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Majority__Group_11__0__Impl4491); 
             after(grammarAccess.getMajorityAccess().getCommaKeyword_11_0()); 

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
    // $ANTLR end "rule__Majority__Group_11__0__Impl"


    // $ANTLR start "rule__Majority__Group_11__1"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2250:1: rule__Majority__Group_11__1 : rule__Majority__Group_11__1__Impl ;
    public final void rule__Majority__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2254:1: ( rule__Majority__Group_11__1__Impl )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2255:2: rule__Majority__Group_11__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_11__1__Impl_in_rule__Majority__Group_11__14522);
            rule__Majority__Group_11__1__Impl();

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
    // $ANTLR end "rule__Majority__Group_11__1"


    // $ANTLR start "rule__Majority__Group_11__1__Impl"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2261:1: rule__Majority__Group_11__1__Impl : ( ( rule__Majority__PeopleAssignment_11_1 ) ) ;
    public final void rule__Majority__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2265:1: ( ( ( rule__Majority__PeopleAssignment_11_1 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2266:1: ( ( rule__Majority__PeopleAssignment_11_1 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2266:1: ( ( rule__Majority__PeopleAssignment_11_1 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2267:1: ( rule__Majority__PeopleAssignment_11_1 )
            {
             before(grammarAccess.getMajorityAccess().getPeopleAssignment_11_1()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2268:1: ( rule__Majority__PeopleAssignment_11_1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2268:2: rule__Majority__PeopleAssignment_11_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__PeopleAssignment_11_1_in_rule__Majority__Group_11__1__Impl4549);
            rule__Majority__PeopleAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getMajorityAccess().getPeopleAssignment_11_1()); 

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
    // $ANTLR end "rule__Majority__Group_11__1__Impl"


    // $ANTLR start "rule__Majority__Group_14__0"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2282:1: rule__Majority__Group_14__0 : rule__Majority__Group_14__0__Impl rule__Majority__Group_14__1 ;
    public final void rule__Majority__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2286:1: ( rule__Majority__Group_14__0__Impl rule__Majority__Group_14__1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2287:2: rule__Majority__Group_14__0__Impl rule__Majority__Group_14__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_14__0__Impl_in_rule__Majority__Group_14__04583);
            rule__Majority__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_14__1_in_rule__Majority__Group_14__04586);
            rule__Majority__Group_14__1();

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
    // $ANTLR end "rule__Majority__Group_14__0"


    // $ANTLR start "rule__Majority__Group_14__0__Impl"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2294:1: rule__Majority__Group_14__0__Impl : ( 'minVotes' ) ;
    public final void rule__Majority__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2298:1: ( ( 'minVotes' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2299:1: ( 'minVotes' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2299:1: ( 'minVotes' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2300:1: 'minVotes'
            {
             before(grammarAccess.getMajorityAccess().getMinVotesKeyword_14_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Majority__Group_14__0__Impl4614); 
             after(grammarAccess.getMajorityAccess().getMinVotesKeyword_14_0()); 

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
    // $ANTLR end "rule__Majority__Group_14__0__Impl"


    // $ANTLR start "rule__Majority__Group_14__1"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2313:1: rule__Majority__Group_14__1 : rule__Majority__Group_14__1__Impl ;
    public final void rule__Majority__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2317:1: ( rule__Majority__Group_14__1__Impl )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2318:2: rule__Majority__Group_14__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__Group_14__1__Impl_in_rule__Majority__Group_14__14645);
            rule__Majority__Group_14__1__Impl();

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
    // $ANTLR end "rule__Majority__Group_14__1"


    // $ANTLR start "rule__Majority__Group_14__1__Impl"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2324:1: rule__Majority__Group_14__1__Impl : ( ( rule__Majority__MinVotesAssignment_14_1 ) ) ;
    public final void rule__Majority__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2328:1: ( ( ( rule__Majority__MinVotesAssignment_14_1 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2329:1: ( ( rule__Majority__MinVotesAssignment_14_1 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2329:1: ( ( rule__Majority__MinVotesAssignment_14_1 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2330:1: ( rule__Majority__MinVotesAssignment_14_1 )
            {
             before(grammarAccess.getMajorityAccess().getMinVotesAssignment_14_1()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2331:1: ( rule__Majority__MinVotesAssignment_14_1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2331:2: rule__Majority__MinVotesAssignment_14_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Majority__MinVotesAssignment_14_1_in_rule__Majority__Group_14__1__Impl4672);
            rule__Majority__MinVotesAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getMajorityAccess().getMinVotesAssignment_14_1()); 

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
    // $ANTLR end "rule__Majority__Group_14__1__Impl"


    // $ANTLR start "rule__RatioMajority__Group__0"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2345:1: rule__RatioMajority__Group__0 : rule__RatioMajority__Group__0__Impl rule__RatioMajority__Group__1 ;
    public final void rule__RatioMajority__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2349:1: ( rule__RatioMajority__Group__0__Impl rule__RatioMajority__Group__1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2350:2: rule__RatioMajority__Group__0__Impl rule__RatioMajority__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__0__Impl_in_rule__RatioMajority__Group__04706);
            rule__RatioMajority__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__1_in_rule__RatioMajority__Group__04709);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2357:1: rule__RatioMajority__Group__0__Impl : ( ( rule__RatioMajority__NameAssignment_0 ) ) ;
    public final void rule__RatioMajority__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2361:1: ( ( ( rule__RatioMajority__NameAssignment_0 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2362:1: ( ( rule__RatioMajority__NameAssignment_0 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2362:1: ( ( rule__RatioMajority__NameAssignment_0 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2363:1: ( rule__RatioMajority__NameAssignment_0 )
            {
             before(grammarAccess.getRatioMajorityAccess().getNameAssignment_0()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2364:1: ( rule__RatioMajority__NameAssignment_0 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2364:2: rule__RatioMajority__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__NameAssignment_0_in_rule__RatioMajority__Group__0__Impl4736);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2374:1: rule__RatioMajority__Group__1 : rule__RatioMajority__Group__1__Impl rule__RatioMajority__Group__2 ;
    public final void rule__RatioMajority__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2378:1: ( rule__RatioMajority__Group__1__Impl rule__RatioMajority__Group__2 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2379:2: rule__RatioMajority__Group__1__Impl rule__RatioMajority__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__1__Impl_in_rule__RatioMajority__Group__14766);
            rule__RatioMajority__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__2_in_rule__RatioMajority__Group__14769);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2386:1: rule__RatioMajority__Group__1__Impl : ( ':' ) ;
    public final void rule__RatioMajority__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2390:1: ( ( ':' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2391:1: ( ':' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2391:1: ( ':' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2392:1: ':'
            {
             before(grammarAccess.getRatioMajorityAccess().getColonKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__RatioMajority__Group__1__Impl4797); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2405:1: rule__RatioMajority__Group__2 : rule__RatioMajority__Group__2__Impl rule__RatioMajority__Group__3 ;
    public final void rule__RatioMajority__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2409:1: ( rule__RatioMajority__Group__2__Impl rule__RatioMajority__Group__3 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2410:2: rule__RatioMajority__Group__2__Impl rule__RatioMajority__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__2__Impl_in_rule__RatioMajority__Group__24828);
            rule__RatioMajority__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__3_in_rule__RatioMajority__Group__24831);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2417:1: rule__RatioMajority__Group__2__Impl : ( 'Ratio' ) ;
    public final void rule__RatioMajority__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2421:1: ( ( 'Ratio' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2422:1: ( 'Ratio' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2422:1: ( 'Ratio' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2423:1: 'Ratio'
            {
             before(grammarAccess.getRatioMajorityAccess().getRatioKeyword_2()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__RatioMajority__Group__2__Impl4859); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2436:1: rule__RatioMajority__Group__3 : rule__RatioMajority__Group__3__Impl rule__RatioMajority__Group__4 ;
    public final void rule__RatioMajority__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2440:1: ( rule__RatioMajority__Group__3__Impl rule__RatioMajority__Group__4 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2441:2: rule__RatioMajority__Group__3__Impl rule__RatioMajority__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__3__Impl_in_rule__RatioMajority__Group__34890);
            rule__RatioMajority__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__4_in_rule__RatioMajority__Group__34893);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2448:1: rule__RatioMajority__Group__3__Impl : ( '{' ) ;
    public final void rule__RatioMajority__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2452:1: ( ( '{' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2453:1: ( '{' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2453:1: ( '{' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2454:1: '{'
            {
             before(grammarAccess.getRatioMajorityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__RatioMajority__Group__3__Impl4921); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2467:1: rule__RatioMajority__Group__4 : rule__RatioMajority__Group__4__Impl rule__RatioMajority__Group__5 ;
    public final void rule__RatioMajority__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2471:1: ( rule__RatioMajority__Group__4__Impl rule__RatioMajority__Group__5 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2472:2: rule__RatioMajority__Group__4__Impl rule__RatioMajority__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__4__Impl_in_rule__RatioMajority__Group__44952);
            rule__RatioMajority__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__5_in_rule__RatioMajority__Group__44955);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2479:1: rule__RatioMajority__Group__4__Impl : ( 'applied to' ) ;
    public final void rule__RatioMajority__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2483:1: ( ( 'applied to' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2484:1: ( 'applied to' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2484:1: ( 'applied to' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2485:1: 'applied to'
            {
             before(grammarAccess.getRatioMajorityAccess().getAppliedToKeyword_4()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__RatioMajority__Group__4__Impl4983); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2498:1: rule__RatioMajority__Group__5 : rule__RatioMajority__Group__5__Impl rule__RatioMajority__Group__6 ;
    public final void rule__RatioMajority__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2502:1: ( rule__RatioMajority__Group__5__Impl rule__RatioMajority__Group__6 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2503:2: rule__RatioMajority__Group__5__Impl rule__RatioMajority__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__5__Impl_in_rule__RatioMajority__Group__55014);
            rule__RatioMajority__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__6_in_rule__RatioMajority__Group__55017);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2510:1: rule__RatioMajority__Group__5__Impl : ( ( rule__RatioMajority__Alternatives_5 ) ) ;
    public final void rule__RatioMajority__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2514:1: ( ( ( rule__RatioMajority__Alternatives_5 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2515:1: ( ( rule__RatioMajority__Alternatives_5 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2515:1: ( ( rule__RatioMajority__Alternatives_5 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2516:1: ( rule__RatioMajority__Alternatives_5 )
            {
             before(grammarAccess.getRatioMajorityAccess().getAlternatives_5()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2517:1: ( rule__RatioMajority__Alternatives_5 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2517:2: rule__RatioMajority__Alternatives_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Alternatives_5_in_rule__RatioMajority__Group__5__Impl5044);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2527:1: rule__RatioMajority__Group__6 : rule__RatioMajority__Group__6__Impl rule__RatioMajority__Group__7 ;
    public final void rule__RatioMajority__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2531:1: ( rule__RatioMajority__Group__6__Impl rule__RatioMajority__Group__7 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2532:2: rule__RatioMajority__Group__6__Impl rule__RatioMajority__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__6__Impl_in_rule__RatioMajority__Group__65074);
            rule__RatioMajority__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__7_in_rule__RatioMajority__Group__65077);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2539:1: rule__RatioMajority__Group__6__Impl : ( ( rule__RatioMajority__Group_6__0 )? ) ;
    public final void rule__RatioMajority__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2543:1: ( ( ( rule__RatioMajority__Group_6__0 )? ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2544:1: ( ( rule__RatioMajority__Group_6__0 )? )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2544:1: ( ( rule__RatioMajority__Group_6__0 )? )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2545:1: ( rule__RatioMajority__Group_6__0 )?
            {
             before(grammarAccess.getRatioMajorityAccess().getGroup_6()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2546:1: ( rule__RatioMajority__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2546:2: rule__RatioMajority__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_6__0_in_rule__RatioMajority__Group__6__Impl5104);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2556:1: rule__RatioMajority__Group__7 : rule__RatioMajority__Group__7__Impl rule__RatioMajority__Group__8 ;
    public final void rule__RatioMajority__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2560:1: ( rule__RatioMajority__Group__7__Impl rule__RatioMajority__Group__8 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2561:2: rule__RatioMajority__Group__7__Impl rule__RatioMajority__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__7__Impl_in_rule__RatioMajority__Group__75135);
            rule__RatioMajority__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__8_in_rule__RatioMajority__Group__75138);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2568:1: rule__RatioMajority__Group__7__Impl : ( 'when' ) ;
    public final void rule__RatioMajority__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2572:1: ( ( 'when' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2573:1: ( 'when' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2573:1: ( 'when' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2574:1: 'when'
            {
             before(grammarAccess.getRatioMajorityAccess().getWhenKeyword_7()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__RatioMajority__Group__7__Impl5166); 
             after(grammarAccess.getRatioMajorityAccess().getWhenKeyword_7()); 

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2587:1: rule__RatioMajority__Group__8 : rule__RatioMajority__Group__8__Impl rule__RatioMajority__Group__9 ;
    public final void rule__RatioMajority__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2591:1: ( rule__RatioMajority__Group__8__Impl rule__RatioMajority__Group__9 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2592:2: rule__RatioMajority__Group__8__Impl rule__RatioMajority__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__8__Impl_in_rule__RatioMajority__Group__85197);
            rule__RatioMajority__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__9_in_rule__RatioMajority__Group__85200);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2599:1: rule__RatioMajority__Group__8__Impl : ( ( rule__RatioMajority__StageAssignment_8 ) ) ;
    public final void rule__RatioMajority__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2603:1: ( ( ( rule__RatioMajority__StageAssignment_8 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2604:1: ( ( rule__RatioMajority__StageAssignment_8 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2604:1: ( ( rule__RatioMajority__StageAssignment_8 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2605:1: ( rule__RatioMajority__StageAssignment_8 )
            {
             before(grammarAccess.getRatioMajorityAccess().getStageAssignment_8()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2606:1: ( rule__RatioMajority__StageAssignment_8 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2606:2: rule__RatioMajority__StageAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__StageAssignment_8_in_rule__RatioMajority__Group__8__Impl5227);
            rule__RatioMajority__StageAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRatioMajorityAccess().getStageAssignment_8()); 

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2616:1: rule__RatioMajority__Group__9 : rule__RatioMajority__Group__9__Impl rule__RatioMajority__Group__10 ;
    public final void rule__RatioMajority__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2620:1: ( rule__RatioMajority__Group__9__Impl rule__RatioMajority__Group__10 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2621:2: rule__RatioMajority__Group__9__Impl rule__RatioMajority__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__9__Impl_in_rule__RatioMajority__Group__95257);
            rule__RatioMajority__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__10_in_rule__RatioMajority__Group__95260);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2628:1: rule__RatioMajority__Group__9__Impl : ( 'people' ) ;
    public final void rule__RatioMajority__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2632:1: ( ( 'people' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2633:1: ( 'people' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2633:1: ( 'people' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2634:1: 'people'
            {
             before(grammarAccess.getRatioMajorityAccess().getPeopleKeyword_9()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__RatioMajority__Group__9__Impl5288); 
             after(grammarAccess.getRatioMajorityAccess().getPeopleKeyword_9()); 

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2647:1: rule__RatioMajority__Group__10 : rule__RatioMajority__Group__10__Impl rule__RatioMajority__Group__11 ;
    public final void rule__RatioMajority__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2651:1: ( rule__RatioMajority__Group__10__Impl rule__RatioMajority__Group__11 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2652:2: rule__RatioMajority__Group__10__Impl rule__RatioMajority__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__10__Impl_in_rule__RatioMajority__Group__105319);
            rule__RatioMajority__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__11_in_rule__RatioMajority__Group__105322);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2659:1: rule__RatioMajority__Group__10__Impl : ( ( rule__RatioMajority__PeopleAssignment_10 ) ) ;
    public final void rule__RatioMajority__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2663:1: ( ( ( rule__RatioMajority__PeopleAssignment_10 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2664:1: ( ( rule__RatioMajority__PeopleAssignment_10 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2664:1: ( ( rule__RatioMajority__PeopleAssignment_10 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2665:1: ( rule__RatioMajority__PeopleAssignment_10 )
            {
             before(grammarAccess.getRatioMajorityAccess().getPeopleAssignment_10()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2666:1: ( rule__RatioMajority__PeopleAssignment_10 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2666:2: rule__RatioMajority__PeopleAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__PeopleAssignment_10_in_rule__RatioMajority__Group__10__Impl5349);
            rule__RatioMajority__PeopleAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getRatioMajorityAccess().getPeopleAssignment_10()); 

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2676:1: rule__RatioMajority__Group__11 : rule__RatioMajority__Group__11__Impl rule__RatioMajority__Group__12 ;
    public final void rule__RatioMajority__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2680:1: ( rule__RatioMajority__Group__11__Impl rule__RatioMajority__Group__12 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2681:2: rule__RatioMajority__Group__11__Impl rule__RatioMajority__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__11__Impl_in_rule__RatioMajority__Group__115379);
            rule__RatioMajority__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__12_in_rule__RatioMajority__Group__115382);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2688:1: rule__RatioMajority__Group__11__Impl : ( ( rule__RatioMajority__Group_11__0 )* ) ;
    public final void rule__RatioMajority__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2692:1: ( ( ( rule__RatioMajority__Group_11__0 )* ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2693:1: ( ( rule__RatioMajority__Group_11__0 )* )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2693:1: ( ( rule__RatioMajority__Group_11__0 )* )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2694:1: ( rule__RatioMajority__Group_11__0 )*
            {
             before(grammarAccess.getRatioMajorityAccess().getGroup_11()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2695:1: ( rule__RatioMajority__Group_11__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2695:2: rule__RatioMajority__Group_11__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_11__0_in_rule__RatioMajority__Group__11__Impl5409);
            	    rule__RatioMajority__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getRatioMajorityAccess().getGroup_11()); 

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2705:1: rule__RatioMajority__Group__12 : rule__RatioMajority__Group__12__Impl rule__RatioMajority__Group__13 ;
    public final void rule__RatioMajority__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2709:1: ( rule__RatioMajority__Group__12__Impl rule__RatioMajority__Group__13 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2710:2: rule__RatioMajority__Group__12__Impl rule__RatioMajority__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__12__Impl_in_rule__RatioMajority__Group__125440);
            rule__RatioMajority__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__13_in_rule__RatioMajority__Group__125443);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2717:1: rule__RatioMajority__Group__12__Impl : ( 'range' ) ;
    public final void rule__RatioMajority__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2721:1: ( ( 'range' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2722:1: ( 'range' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2722:1: ( 'range' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2723:1: 'range'
            {
             before(grammarAccess.getRatioMajorityAccess().getRangeKeyword_12()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__RatioMajority__Group__12__Impl5471); 
             after(grammarAccess.getRatioMajorityAccess().getRangeKeyword_12()); 

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2736:1: rule__RatioMajority__Group__13 : rule__RatioMajority__Group__13__Impl rule__RatioMajority__Group__14 ;
    public final void rule__RatioMajority__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2740:1: ( rule__RatioMajority__Group__13__Impl rule__RatioMajority__Group__14 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2741:2: rule__RatioMajority__Group__13__Impl rule__RatioMajority__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__13__Impl_in_rule__RatioMajority__Group__135502);
            rule__RatioMajority__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__14_in_rule__RatioMajority__Group__135505);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2748:1: rule__RatioMajority__Group__13__Impl : ( ( rule__RatioMajority__RangeAssignment_13 ) ) ;
    public final void rule__RatioMajority__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2752:1: ( ( ( rule__RatioMajority__RangeAssignment_13 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2753:1: ( ( rule__RatioMajority__RangeAssignment_13 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2753:1: ( ( rule__RatioMajority__RangeAssignment_13 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2754:1: ( rule__RatioMajority__RangeAssignment_13 )
            {
             before(grammarAccess.getRatioMajorityAccess().getRangeAssignment_13()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2755:1: ( rule__RatioMajority__RangeAssignment_13 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2755:2: rule__RatioMajority__RangeAssignment_13
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__RangeAssignment_13_in_rule__RatioMajority__Group__13__Impl5532);
            rule__RatioMajority__RangeAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getRatioMajorityAccess().getRangeAssignment_13()); 

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2765:1: rule__RatioMajority__Group__14 : rule__RatioMajority__Group__14__Impl rule__RatioMajority__Group__15 ;
    public final void rule__RatioMajority__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2769:1: ( rule__RatioMajority__Group__14__Impl rule__RatioMajority__Group__15 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2770:2: rule__RatioMajority__Group__14__Impl rule__RatioMajority__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__14__Impl_in_rule__RatioMajority__Group__145562);
            rule__RatioMajority__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__15_in_rule__RatioMajority__Group__145565);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2777:1: rule__RatioMajority__Group__14__Impl : ( ( rule__RatioMajority__Group_14__0 )? ) ;
    public final void rule__RatioMajority__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2781:1: ( ( ( rule__RatioMajority__Group_14__0 )? ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2782:1: ( ( rule__RatioMajority__Group_14__0 )? )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2782:1: ( ( rule__RatioMajority__Group_14__0 )? )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2783:1: ( rule__RatioMajority__Group_14__0 )?
            {
             before(grammarAccess.getRatioMajorityAccess().getGroup_14()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2784:1: ( rule__RatioMajority__Group_14__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2784:2: rule__RatioMajority__Group_14__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_14__0_in_rule__RatioMajority__Group__14__Impl5592);
                    rule__RatioMajority__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRatioMajorityAccess().getGroup_14()); 

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2794:1: rule__RatioMajority__Group__15 : rule__RatioMajority__Group__15__Impl rule__RatioMajority__Group__16 ;
    public final void rule__RatioMajority__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2798:1: ( rule__RatioMajority__Group__15__Impl rule__RatioMajority__Group__16 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2799:2: rule__RatioMajority__Group__15__Impl rule__RatioMajority__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__15__Impl_in_rule__RatioMajority__Group__155623);
            rule__RatioMajority__Group__15__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__16_in_rule__RatioMajority__Group__155626);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2806:1: rule__RatioMajority__Group__15__Impl : ( 'ratio' ) ;
    public final void rule__RatioMajority__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2810:1: ( ( 'ratio' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2811:1: ( 'ratio' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2811:1: ( 'ratio' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2812:1: 'ratio'
            {
             before(grammarAccess.getRatioMajorityAccess().getRatioKeyword_15()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__RatioMajority__Group__15__Impl5654); 
             after(grammarAccess.getRatioMajorityAccess().getRatioKeyword_15()); 

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2825:1: rule__RatioMajority__Group__16 : rule__RatioMajority__Group__16__Impl rule__RatioMajority__Group__17 ;
    public final void rule__RatioMajority__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2829:1: ( rule__RatioMajority__Group__16__Impl rule__RatioMajority__Group__17 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2830:2: rule__RatioMajority__Group__16__Impl rule__RatioMajority__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__16__Impl_in_rule__RatioMajority__Group__165685);
            rule__RatioMajority__Group__16__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__17_in_rule__RatioMajority__Group__165688);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2837:1: rule__RatioMajority__Group__16__Impl : ( ( rule__RatioMajority__RatioAssignment_16 ) ) ;
    public final void rule__RatioMajority__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2841:1: ( ( ( rule__RatioMajority__RatioAssignment_16 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2842:1: ( ( rule__RatioMajority__RatioAssignment_16 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2842:1: ( ( rule__RatioMajority__RatioAssignment_16 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2843:1: ( rule__RatioMajority__RatioAssignment_16 )
            {
             before(grammarAccess.getRatioMajorityAccess().getRatioAssignment_16()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2844:1: ( rule__RatioMajority__RatioAssignment_16 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2844:2: rule__RatioMajority__RatioAssignment_16
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__RatioAssignment_16_in_rule__RatioMajority__Group__16__Impl5715);
            rule__RatioMajority__RatioAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getRatioMajorityAccess().getRatioAssignment_16()); 

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2854:1: rule__RatioMajority__Group__17 : rule__RatioMajority__Group__17__Impl rule__RatioMajority__Group__18 ;
    public final void rule__RatioMajority__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2858:1: ( rule__RatioMajority__Group__17__Impl rule__RatioMajority__Group__18 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2859:2: rule__RatioMajority__Group__17__Impl rule__RatioMajority__Group__18
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__17__Impl_in_rule__RatioMajority__Group__175745);
            rule__RatioMajority__Group__17__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__18_in_rule__RatioMajority__Group__175748);
            rule__RatioMajority__Group__18();

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2866:1: rule__RatioMajority__Group__17__Impl : ( 'deadline' ) ;
    public final void rule__RatioMajority__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2870:1: ( ( 'deadline' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2871:1: ( 'deadline' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2871:1: ( 'deadline' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2872:1: 'deadline'
            {
             before(grammarAccess.getRatioMajorityAccess().getDeadlineKeyword_17()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__RatioMajority__Group__17__Impl5776); 
             after(grammarAccess.getRatioMajorityAccess().getDeadlineKeyword_17()); 

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


    // $ANTLR start "rule__RatioMajority__Group__18"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2885:1: rule__RatioMajority__Group__18 : rule__RatioMajority__Group__18__Impl rule__RatioMajority__Group__19 ;
    public final void rule__RatioMajority__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2889:1: ( rule__RatioMajority__Group__18__Impl rule__RatioMajority__Group__19 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2890:2: rule__RatioMajority__Group__18__Impl rule__RatioMajority__Group__19
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__18__Impl_in_rule__RatioMajority__Group__185807);
            rule__RatioMajority__Group__18__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__19_in_rule__RatioMajority__Group__185810);
            rule__RatioMajority__Group__19();

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
    // $ANTLR end "rule__RatioMajority__Group__18"


    // $ANTLR start "rule__RatioMajority__Group__18__Impl"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2897:1: rule__RatioMajority__Group__18__Impl : ( ( rule__RatioMajority__DeadlineAssignment_18 ) ) ;
    public final void rule__RatioMajority__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2901:1: ( ( ( rule__RatioMajority__DeadlineAssignment_18 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2902:1: ( ( rule__RatioMajority__DeadlineAssignment_18 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2902:1: ( ( rule__RatioMajority__DeadlineAssignment_18 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2903:1: ( rule__RatioMajority__DeadlineAssignment_18 )
            {
             before(grammarAccess.getRatioMajorityAccess().getDeadlineAssignment_18()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2904:1: ( rule__RatioMajority__DeadlineAssignment_18 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2904:2: rule__RatioMajority__DeadlineAssignment_18
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__DeadlineAssignment_18_in_rule__RatioMajority__Group__18__Impl5837);
            rule__RatioMajority__DeadlineAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getRatioMajorityAccess().getDeadlineAssignment_18()); 

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
    // $ANTLR end "rule__RatioMajority__Group__18__Impl"


    // $ANTLR start "rule__RatioMajority__Group__19"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2914:1: rule__RatioMajority__Group__19 : rule__RatioMajority__Group__19__Impl ;
    public final void rule__RatioMajority__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2918:1: ( rule__RatioMajority__Group__19__Impl )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2919:2: rule__RatioMajority__Group__19__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group__19__Impl_in_rule__RatioMajority__Group__195867);
            rule__RatioMajority__Group__19__Impl();

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
    // $ANTLR end "rule__RatioMajority__Group__19"


    // $ANTLR start "rule__RatioMajority__Group__19__Impl"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2925:1: rule__RatioMajority__Group__19__Impl : ( '}' ) ;
    public final void rule__RatioMajority__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2929:1: ( ( '}' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2930:1: ( '}' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2930:1: ( '}' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2931:1: '}'
            {
             before(grammarAccess.getRatioMajorityAccess().getRightCurlyBracketKeyword_19()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__RatioMajority__Group__19__Impl5895); 
             after(grammarAccess.getRatioMajorityAccess().getRightCurlyBracketKeyword_19()); 

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
    // $ANTLR end "rule__RatioMajority__Group__19__Impl"


    // $ANTLR start "rule__RatioMajority__Group_6__0"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2984:1: rule__RatioMajority__Group_6__0 : rule__RatioMajority__Group_6__0__Impl rule__RatioMajority__Group_6__1 ;
    public final void rule__RatioMajority__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2988:1: ( rule__RatioMajority__Group_6__0__Impl rule__RatioMajority__Group_6__1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2989:2: rule__RatioMajority__Group_6__0__Impl rule__RatioMajority__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_6__0__Impl_in_rule__RatioMajority__Group_6__05966);
            rule__RatioMajority__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_6__1_in_rule__RatioMajority__Group_6__05969);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:2996:1: rule__RatioMajority__Group_6__0__Impl : ( '(' ) ;
    public final void rule__RatioMajority__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3000:1: ( ( '(' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3001:1: ( '(' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3001:1: ( '(' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3002:1: '('
            {
             before(grammarAccess.getRatioMajorityAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__RatioMajority__Group_6__0__Impl5997); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3015:1: rule__RatioMajority__Group_6__1 : rule__RatioMajority__Group_6__1__Impl rule__RatioMajority__Group_6__2 ;
    public final void rule__RatioMajority__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3019:1: ( rule__RatioMajority__Group_6__1__Impl rule__RatioMajority__Group_6__2 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3020:2: rule__RatioMajority__Group_6__1__Impl rule__RatioMajority__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_6__1__Impl_in_rule__RatioMajority__Group_6__16028);
            rule__RatioMajority__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_6__2_in_rule__RatioMajority__Group_6__16031);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3027:1: rule__RatioMajority__Group_6__1__Impl : ( ruleFilter ) ;
    public final void rule__RatioMajority__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3031:1: ( ( ruleFilter ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3032:1: ( ruleFilter )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3032:1: ( ruleFilter )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3033:1: ruleFilter
            {
             before(grammarAccess.getRatioMajorityAccess().getFilterParserRuleCall_6_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilter_in_rule__RatioMajority__Group_6__1__Impl6058);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3044:1: rule__RatioMajority__Group_6__2 : rule__RatioMajority__Group_6__2__Impl ;
    public final void rule__RatioMajority__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3048:1: ( rule__RatioMajority__Group_6__2__Impl )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3049:2: rule__RatioMajority__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_6__2__Impl_in_rule__RatioMajority__Group_6__26087);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3055:1: rule__RatioMajority__Group_6__2__Impl : ( ')' ) ;
    public final void rule__RatioMajority__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3059:1: ( ( ')' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3060:1: ( ')' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3060:1: ( ')' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3061:1: ')'
            {
             before(grammarAccess.getRatioMajorityAccess().getRightParenthesisKeyword_6_2()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__RatioMajority__Group_6__2__Impl6115); 
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


    // $ANTLR start "rule__RatioMajority__Group_11__0"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3080:1: rule__RatioMajority__Group_11__0 : rule__RatioMajority__Group_11__0__Impl rule__RatioMajority__Group_11__1 ;
    public final void rule__RatioMajority__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3084:1: ( rule__RatioMajority__Group_11__0__Impl rule__RatioMajority__Group_11__1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3085:2: rule__RatioMajority__Group_11__0__Impl rule__RatioMajority__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_11__0__Impl_in_rule__RatioMajority__Group_11__06152);
            rule__RatioMajority__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_11__1_in_rule__RatioMajority__Group_11__06155);
            rule__RatioMajority__Group_11__1();

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
    // $ANTLR end "rule__RatioMajority__Group_11__0"


    // $ANTLR start "rule__RatioMajority__Group_11__0__Impl"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3092:1: rule__RatioMajority__Group_11__0__Impl : ( ',' ) ;
    public final void rule__RatioMajority__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3096:1: ( ( ',' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3097:1: ( ',' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3097:1: ( ',' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3098:1: ','
            {
             before(grammarAccess.getRatioMajorityAccess().getCommaKeyword_11_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__RatioMajority__Group_11__0__Impl6183); 
             after(grammarAccess.getRatioMajorityAccess().getCommaKeyword_11_0()); 

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
    // $ANTLR end "rule__RatioMajority__Group_11__0__Impl"


    // $ANTLR start "rule__RatioMajority__Group_11__1"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3111:1: rule__RatioMajority__Group_11__1 : rule__RatioMajority__Group_11__1__Impl ;
    public final void rule__RatioMajority__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3115:1: ( rule__RatioMajority__Group_11__1__Impl )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3116:2: rule__RatioMajority__Group_11__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_11__1__Impl_in_rule__RatioMajority__Group_11__16214);
            rule__RatioMajority__Group_11__1__Impl();

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
    // $ANTLR end "rule__RatioMajority__Group_11__1"


    // $ANTLR start "rule__RatioMajority__Group_11__1__Impl"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3122:1: rule__RatioMajority__Group_11__1__Impl : ( ( rule__RatioMajority__PeopleAssignment_11_1 ) ) ;
    public final void rule__RatioMajority__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3126:1: ( ( ( rule__RatioMajority__PeopleAssignment_11_1 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3127:1: ( ( rule__RatioMajority__PeopleAssignment_11_1 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3127:1: ( ( rule__RatioMajority__PeopleAssignment_11_1 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3128:1: ( rule__RatioMajority__PeopleAssignment_11_1 )
            {
             before(grammarAccess.getRatioMajorityAccess().getPeopleAssignment_11_1()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3129:1: ( rule__RatioMajority__PeopleAssignment_11_1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3129:2: rule__RatioMajority__PeopleAssignment_11_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__PeopleAssignment_11_1_in_rule__RatioMajority__Group_11__1__Impl6241);
            rule__RatioMajority__PeopleAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getRatioMajorityAccess().getPeopleAssignment_11_1()); 

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
    // $ANTLR end "rule__RatioMajority__Group_11__1__Impl"


    // $ANTLR start "rule__RatioMajority__Group_14__0"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3143:1: rule__RatioMajority__Group_14__0 : rule__RatioMajority__Group_14__0__Impl rule__RatioMajority__Group_14__1 ;
    public final void rule__RatioMajority__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3147:1: ( rule__RatioMajority__Group_14__0__Impl rule__RatioMajority__Group_14__1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3148:2: rule__RatioMajority__Group_14__0__Impl rule__RatioMajority__Group_14__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_14__0__Impl_in_rule__RatioMajority__Group_14__06275);
            rule__RatioMajority__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_14__1_in_rule__RatioMajority__Group_14__06278);
            rule__RatioMajority__Group_14__1();

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
    // $ANTLR end "rule__RatioMajority__Group_14__0"


    // $ANTLR start "rule__RatioMajority__Group_14__0__Impl"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3155:1: rule__RatioMajority__Group_14__0__Impl : ( 'minVotes' ) ;
    public final void rule__RatioMajority__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3159:1: ( ( 'minVotes' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3160:1: ( 'minVotes' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3160:1: ( 'minVotes' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3161:1: 'minVotes'
            {
             before(grammarAccess.getRatioMajorityAccess().getMinVotesKeyword_14_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__RatioMajority__Group_14__0__Impl6306); 
             after(grammarAccess.getRatioMajorityAccess().getMinVotesKeyword_14_0()); 

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
    // $ANTLR end "rule__RatioMajority__Group_14__0__Impl"


    // $ANTLR start "rule__RatioMajority__Group_14__1"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3174:1: rule__RatioMajority__Group_14__1 : rule__RatioMajority__Group_14__1__Impl ;
    public final void rule__RatioMajority__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3178:1: ( rule__RatioMajority__Group_14__1__Impl )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3179:2: rule__RatioMajority__Group_14__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__Group_14__1__Impl_in_rule__RatioMajority__Group_14__16337);
            rule__RatioMajority__Group_14__1__Impl();

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
    // $ANTLR end "rule__RatioMajority__Group_14__1"


    // $ANTLR start "rule__RatioMajority__Group_14__1__Impl"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3185:1: rule__RatioMajority__Group_14__1__Impl : ( ( rule__RatioMajority__MinVotesAssignment_14_1 ) ) ;
    public final void rule__RatioMajority__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3189:1: ( ( ( rule__RatioMajority__MinVotesAssignment_14_1 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3190:1: ( ( rule__RatioMajority__MinVotesAssignment_14_1 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3190:1: ( ( rule__RatioMajority__MinVotesAssignment_14_1 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3191:1: ( rule__RatioMajority__MinVotesAssignment_14_1 )
            {
             before(grammarAccess.getRatioMajorityAccess().getMinVotesAssignment_14_1()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3192:1: ( rule__RatioMajority__MinVotesAssignment_14_1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3192:2: rule__RatioMajority__MinVotesAssignment_14_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatioMajority__MinVotesAssignment_14_1_in_rule__RatioMajority__Group_14__1__Impl6364);
            rule__RatioMajority__MinVotesAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getRatioMajorityAccess().getMinVotesAssignment_14_1()); 

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
    // $ANTLR end "rule__RatioMajority__Group_14__1__Impl"


    // $ANTLR start "rule__LeaderDriven__Group__0"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3206:1: rule__LeaderDriven__Group__0 : rule__LeaderDriven__Group__0__Impl rule__LeaderDriven__Group__1 ;
    public final void rule__LeaderDriven__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3210:1: ( rule__LeaderDriven__Group__0__Impl rule__LeaderDriven__Group__1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3211:2: rule__LeaderDriven__Group__0__Impl rule__LeaderDriven__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__0__Impl_in_rule__LeaderDriven__Group__06398);
            rule__LeaderDriven__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__1_in_rule__LeaderDriven__Group__06401);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3218:1: rule__LeaderDriven__Group__0__Impl : ( ( rule__LeaderDriven__NameAssignment_0 ) ) ;
    public final void rule__LeaderDriven__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3222:1: ( ( ( rule__LeaderDriven__NameAssignment_0 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3223:1: ( ( rule__LeaderDriven__NameAssignment_0 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3223:1: ( ( rule__LeaderDriven__NameAssignment_0 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3224:1: ( rule__LeaderDriven__NameAssignment_0 )
            {
             before(grammarAccess.getLeaderDrivenAccess().getNameAssignment_0()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3225:1: ( rule__LeaderDriven__NameAssignment_0 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3225:2: rule__LeaderDriven__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__NameAssignment_0_in_rule__LeaderDriven__Group__0__Impl6428);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3235:1: rule__LeaderDriven__Group__1 : rule__LeaderDriven__Group__1__Impl rule__LeaderDriven__Group__2 ;
    public final void rule__LeaderDriven__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3239:1: ( rule__LeaderDriven__Group__1__Impl rule__LeaderDriven__Group__2 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3240:2: rule__LeaderDriven__Group__1__Impl rule__LeaderDriven__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__1__Impl_in_rule__LeaderDriven__Group__16458);
            rule__LeaderDriven__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__2_in_rule__LeaderDriven__Group__16461);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3247:1: rule__LeaderDriven__Group__1__Impl : ( ':' ) ;
    public final void rule__LeaderDriven__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3251:1: ( ( ':' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3252:1: ( ':' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3252:1: ( ':' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3253:1: ':'
            {
             before(grammarAccess.getLeaderDrivenAccess().getColonKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__LeaderDriven__Group__1__Impl6489); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3266:1: rule__LeaderDriven__Group__2 : rule__LeaderDriven__Group__2__Impl rule__LeaderDriven__Group__3 ;
    public final void rule__LeaderDriven__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3270:1: ( rule__LeaderDriven__Group__2__Impl rule__LeaderDriven__Group__3 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3271:2: rule__LeaderDriven__Group__2__Impl rule__LeaderDriven__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__2__Impl_in_rule__LeaderDriven__Group__26520);
            rule__LeaderDriven__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__3_in_rule__LeaderDriven__Group__26523);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3278:1: rule__LeaderDriven__Group__2__Impl : ( 'LeaderDriven' ) ;
    public final void rule__LeaderDriven__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3282:1: ( ( 'LeaderDriven' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3283:1: ( 'LeaderDriven' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3283:1: ( 'LeaderDriven' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3284:1: 'LeaderDriven'
            {
             before(grammarAccess.getLeaderDrivenAccess().getLeaderDrivenKeyword_2()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__LeaderDriven__Group__2__Impl6551); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3297:1: rule__LeaderDriven__Group__3 : rule__LeaderDriven__Group__3__Impl rule__LeaderDriven__Group__4 ;
    public final void rule__LeaderDriven__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3301:1: ( rule__LeaderDriven__Group__3__Impl rule__LeaderDriven__Group__4 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3302:2: rule__LeaderDriven__Group__3__Impl rule__LeaderDriven__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__3__Impl_in_rule__LeaderDriven__Group__36582);
            rule__LeaderDriven__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__4_in_rule__LeaderDriven__Group__36585);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3309:1: rule__LeaderDriven__Group__3__Impl : ( '{' ) ;
    public final void rule__LeaderDriven__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3313:1: ( ( '{' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3314:1: ( '{' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3314:1: ( '{' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3315:1: '{'
            {
             before(grammarAccess.getLeaderDrivenAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__LeaderDriven__Group__3__Impl6613); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3328:1: rule__LeaderDriven__Group__4 : rule__LeaderDriven__Group__4__Impl rule__LeaderDriven__Group__5 ;
    public final void rule__LeaderDriven__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3332:1: ( rule__LeaderDriven__Group__4__Impl rule__LeaderDriven__Group__5 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3333:2: rule__LeaderDriven__Group__4__Impl rule__LeaderDriven__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__4__Impl_in_rule__LeaderDriven__Group__46644);
            rule__LeaderDriven__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__5_in_rule__LeaderDriven__Group__46647);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3340:1: rule__LeaderDriven__Group__4__Impl : ( 'applied to' ) ;
    public final void rule__LeaderDriven__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3344:1: ( ( 'applied to' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3345:1: ( 'applied to' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3345:1: ( 'applied to' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3346:1: 'applied to'
            {
             before(grammarAccess.getLeaderDrivenAccess().getAppliedToKeyword_4()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__LeaderDriven__Group__4__Impl6675); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3359:1: rule__LeaderDriven__Group__5 : rule__LeaderDriven__Group__5__Impl rule__LeaderDriven__Group__6 ;
    public final void rule__LeaderDriven__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3363:1: ( rule__LeaderDriven__Group__5__Impl rule__LeaderDriven__Group__6 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3364:2: rule__LeaderDriven__Group__5__Impl rule__LeaderDriven__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__5__Impl_in_rule__LeaderDriven__Group__56706);
            rule__LeaderDriven__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__6_in_rule__LeaderDriven__Group__56709);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3371:1: rule__LeaderDriven__Group__5__Impl : ( ( rule__LeaderDriven__Alternatives_5 ) ) ;
    public final void rule__LeaderDriven__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3375:1: ( ( ( rule__LeaderDriven__Alternatives_5 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3376:1: ( ( rule__LeaderDriven__Alternatives_5 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3376:1: ( ( rule__LeaderDriven__Alternatives_5 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3377:1: ( rule__LeaderDriven__Alternatives_5 )
            {
             before(grammarAccess.getLeaderDrivenAccess().getAlternatives_5()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3378:1: ( rule__LeaderDriven__Alternatives_5 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3378:2: rule__LeaderDriven__Alternatives_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Alternatives_5_in_rule__LeaderDriven__Group__5__Impl6736);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3388:1: rule__LeaderDriven__Group__6 : rule__LeaderDriven__Group__6__Impl rule__LeaderDriven__Group__7 ;
    public final void rule__LeaderDriven__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3392:1: ( rule__LeaderDriven__Group__6__Impl rule__LeaderDriven__Group__7 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3393:2: rule__LeaderDriven__Group__6__Impl rule__LeaderDriven__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__6__Impl_in_rule__LeaderDriven__Group__66766);
            rule__LeaderDriven__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__7_in_rule__LeaderDriven__Group__66769);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3400:1: rule__LeaderDriven__Group__6__Impl : ( ( rule__LeaderDriven__Group_6__0 )? ) ;
    public final void rule__LeaderDriven__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3404:1: ( ( ( rule__LeaderDriven__Group_6__0 )? ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3405:1: ( ( rule__LeaderDriven__Group_6__0 )? )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3405:1: ( ( rule__LeaderDriven__Group_6__0 )? )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3406:1: ( rule__LeaderDriven__Group_6__0 )?
            {
             before(grammarAccess.getLeaderDrivenAccess().getGroup_6()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3407:1: ( rule__LeaderDriven__Group_6__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3407:2: rule__LeaderDriven__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group_6__0_in_rule__LeaderDriven__Group__6__Impl6796);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3417:1: rule__LeaderDriven__Group__7 : rule__LeaderDriven__Group__7__Impl rule__LeaderDriven__Group__8 ;
    public final void rule__LeaderDriven__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3421:1: ( rule__LeaderDriven__Group__7__Impl rule__LeaderDriven__Group__8 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3422:2: rule__LeaderDriven__Group__7__Impl rule__LeaderDriven__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__7__Impl_in_rule__LeaderDriven__Group__76827);
            rule__LeaderDriven__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__8_in_rule__LeaderDriven__Group__76830);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3429:1: rule__LeaderDriven__Group__7__Impl : ( 'when' ) ;
    public final void rule__LeaderDriven__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3433:1: ( ( 'when' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3434:1: ( 'when' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3434:1: ( 'when' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3435:1: 'when'
            {
             before(grammarAccess.getLeaderDrivenAccess().getWhenKeyword_7()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__LeaderDriven__Group__7__Impl6858); 
             after(grammarAccess.getLeaderDrivenAccess().getWhenKeyword_7()); 

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3448:1: rule__LeaderDriven__Group__8 : rule__LeaderDriven__Group__8__Impl rule__LeaderDriven__Group__9 ;
    public final void rule__LeaderDriven__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3452:1: ( rule__LeaderDriven__Group__8__Impl rule__LeaderDriven__Group__9 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3453:2: rule__LeaderDriven__Group__8__Impl rule__LeaderDriven__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__8__Impl_in_rule__LeaderDriven__Group__86889);
            rule__LeaderDriven__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__9_in_rule__LeaderDriven__Group__86892);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3460:1: rule__LeaderDriven__Group__8__Impl : ( ( rule__LeaderDriven__StageAssignment_8 ) ) ;
    public final void rule__LeaderDriven__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3464:1: ( ( ( rule__LeaderDriven__StageAssignment_8 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3465:1: ( ( rule__LeaderDriven__StageAssignment_8 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3465:1: ( ( rule__LeaderDriven__StageAssignment_8 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3466:1: ( rule__LeaderDriven__StageAssignment_8 )
            {
             before(grammarAccess.getLeaderDrivenAccess().getStageAssignment_8()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3467:1: ( rule__LeaderDriven__StageAssignment_8 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3467:2: rule__LeaderDriven__StageAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__StageAssignment_8_in_rule__LeaderDriven__Group__8__Impl6919);
            rule__LeaderDriven__StageAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getLeaderDrivenAccess().getStageAssignment_8()); 

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3477:1: rule__LeaderDriven__Group__9 : rule__LeaderDriven__Group__9__Impl rule__LeaderDriven__Group__10 ;
    public final void rule__LeaderDriven__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3481:1: ( rule__LeaderDriven__Group__9__Impl rule__LeaderDriven__Group__10 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3482:2: rule__LeaderDriven__Group__9__Impl rule__LeaderDriven__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__9__Impl_in_rule__LeaderDriven__Group__96949);
            rule__LeaderDriven__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__10_in_rule__LeaderDriven__Group__96952);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3489:1: rule__LeaderDriven__Group__9__Impl : ( 'default' ) ;
    public final void rule__LeaderDriven__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3493:1: ( ( 'default' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3494:1: ( 'default' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3494:1: ( 'default' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3495:1: 'default'
            {
             before(grammarAccess.getLeaderDrivenAccess().getDefaultKeyword_9()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__LeaderDriven__Group__9__Impl6980); 
             after(grammarAccess.getLeaderDrivenAccess().getDefaultKeyword_9()); 

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3508:1: rule__LeaderDriven__Group__10 : rule__LeaderDriven__Group__10__Impl rule__LeaderDriven__Group__11 ;
    public final void rule__LeaderDriven__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3512:1: ( rule__LeaderDriven__Group__10__Impl rule__LeaderDriven__Group__11 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3513:2: rule__LeaderDriven__Group__10__Impl rule__LeaderDriven__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__10__Impl_in_rule__LeaderDriven__Group__107011);
            rule__LeaderDriven__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__11_in_rule__LeaderDriven__Group__107014);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3520:1: rule__LeaderDriven__Group__10__Impl : ( ( rule__LeaderDriven__DefaultAssignment_10 ) ) ;
    public final void rule__LeaderDriven__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3524:1: ( ( ( rule__LeaderDriven__DefaultAssignment_10 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3525:1: ( ( rule__LeaderDriven__DefaultAssignment_10 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3525:1: ( ( rule__LeaderDriven__DefaultAssignment_10 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3526:1: ( rule__LeaderDriven__DefaultAssignment_10 )
            {
             before(grammarAccess.getLeaderDrivenAccess().getDefaultAssignment_10()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3527:1: ( rule__LeaderDriven__DefaultAssignment_10 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3527:2: rule__LeaderDriven__DefaultAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__DefaultAssignment_10_in_rule__LeaderDriven__Group__10__Impl7041);
            rule__LeaderDriven__DefaultAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getLeaderDrivenAccess().getDefaultAssignment_10()); 

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3537:1: rule__LeaderDriven__Group__11 : rule__LeaderDriven__Group__11__Impl rule__LeaderDriven__Group__12 ;
    public final void rule__LeaderDriven__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3541:1: ( rule__LeaderDriven__Group__11__Impl rule__LeaderDriven__Group__12 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3542:2: rule__LeaderDriven__Group__11__Impl rule__LeaderDriven__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__11__Impl_in_rule__LeaderDriven__Group__117071);
            rule__LeaderDriven__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__12_in_rule__LeaderDriven__Group__117074);
            rule__LeaderDriven__Group__12();

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3549:1: rule__LeaderDriven__Group__11__Impl : ( 'deadline' ) ;
    public final void rule__LeaderDriven__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3553:1: ( ( 'deadline' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3554:1: ( 'deadline' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3554:1: ( 'deadline' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3555:1: 'deadline'
            {
             before(grammarAccess.getLeaderDrivenAccess().getDeadlineKeyword_11()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__LeaderDriven__Group__11__Impl7102); 
             after(grammarAccess.getLeaderDrivenAccess().getDeadlineKeyword_11()); 

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


    // $ANTLR start "rule__LeaderDriven__Group__12"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3568:1: rule__LeaderDriven__Group__12 : rule__LeaderDriven__Group__12__Impl rule__LeaderDriven__Group__13 ;
    public final void rule__LeaderDriven__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3572:1: ( rule__LeaderDriven__Group__12__Impl rule__LeaderDriven__Group__13 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3573:2: rule__LeaderDriven__Group__12__Impl rule__LeaderDriven__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__12__Impl_in_rule__LeaderDriven__Group__127133);
            rule__LeaderDriven__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__13_in_rule__LeaderDriven__Group__127136);
            rule__LeaderDriven__Group__13();

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
    // $ANTLR end "rule__LeaderDriven__Group__12"


    // $ANTLR start "rule__LeaderDriven__Group__12__Impl"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3580:1: rule__LeaderDriven__Group__12__Impl : ( ( rule__LeaderDriven__DeadlineAssignment_12 ) ) ;
    public final void rule__LeaderDriven__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3584:1: ( ( ( rule__LeaderDriven__DeadlineAssignment_12 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3585:1: ( ( rule__LeaderDriven__DeadlineAssignment_12 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3585:1: ( ( rule__LeaderDriven__DeadlineAssignment_12 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3586:1: ( rule__LeaderDriven__DeadlineAssignment_12 )
            {
             before(grammarAccess.getLeaderDrivenAccess().getDeadlineAssignment_12()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3587:1: ( rule__LeaderDriven__DeadlineAssignment_12 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3587:2: rule__LeaderDriven__DeadlineAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__DeadlineAssignment_12_in_rule__LeaderDriven__Group__12__Impl7163);
            rule__LeaderDriven__DeadlineAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getLeaderDrivenAccess().getDeadlineAssignment_12()); 

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
    // $ANTLR end "rule__LeaderDriven__Group__12__Impl"


    // $ANTLR start "rule__LeaderDriven__Group__13"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3597:1: rule__LeaderDriven__Group__13 : rule__LeaderDriven__Group__13__Impl ;
    public final void rule__LeaderDriven__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3601:1: ( rule__LeaderDriven__Group__13__Impl )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3602:2: rule__LeaderDriven__Group__13__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group__13__Impl_in_rule__LeaderDriven__Group__137193);
            rule__LeaderDriven__Group__13__Impl();

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
    // $ANTLR end "rule__LeaderDriven__Group__13"


    // $ANTLR start "rule__LeaderDriven__Group__13__Impl"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3608:1: rule__LeaderDriven__Group__13__Impl : ( '}' ) ;
    public final void rule__LeaderDriven__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3612:1: ( ( '}' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3613:1: ( '}' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3613:1: ( '}' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3614:1: '}'
            {
             before(grammarAccess.getLeaderDrivenAccess().getRightCurlyBracketKeyword_13()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__LeaderDriven__Group__13__Impl7221); 
             after(grammarAccess.getLeaderDrivenAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__LeaderDriven__Group__13__Impl"


    // $ANTLR start "rule__LeaderDriven__Group_6__0"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3655:1: rule__LeaderDriven__Group_6__0 : rule__LeaderDriven__Group_6__0__Impl rule__LeaderDriven__Group_6__1 ;
    public final void rule__LeaderDriven__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3659:1: ( rule__LeaderDriven__Group_6__0__Impl rule__LeaderDriven__Group_6__1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3660:2: rule__LeaderDriven__Group_6__0__Impl rule__LeaderDriven__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group_6__0__Impl_in_rule__LeaderDriven__Group_6__07280);
            rule__LeaderDriven__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group_6__1_in_rule__LeaderDriven__Group_6__07283);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3667:1: rule__LeaderDriven__Group_6__0__Impl : ( '(' ) ;
    public final void rule__LeaderDriven__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3671:1: ( ( '(' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3672:1: ( '(' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3672:1: ( '(' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3673:1: '('
            {
             before(grammarAccess.getLeaderDrivenAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__LeaderDriven__Group_6__0__Impl7311); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3686:1: rule__LeaderDriven__Group_6__1 : rule__LeaderDriven__Group_6__1__Impl rule__LeaderDriven__Group_6__2 ;
    public final void rule__LeaderDriven__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3690:1: ( rule__LeaderDriven__Group_6__1__Impl rule__LeaderDriven__Group_6__2 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3691:2: rule__LeaderDriven__Group_6__1__Impl rule__LeaderDriven__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group_6__1__Impl_in_rule__LeaderDriven__Group_6__17342);
            rule__LeaderDriven__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group_6__2_in_rule__LeaderDriven__Group_6__17345);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3698:1: rule__LeaderDriven__Group_6__1__Impl : ( ( rule__LeaderDriven__FilterAssignment_6_1 ) ) ;
    public final void rule__LeaderDriven__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3702:1: ( ( ( rule__LeaderDriven__FilterAssignment_6_1 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3703:1: ( ( rule__LeaderDriven__FilterAssignment_6_1 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3703:1: ( ( rule__LeaderDriven__FilterAssignment_6_1 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3704:1: ( rule__LeaderDriven__FilterAssignment_6_1 )
            {
             before(grammarAccess.getLeaderDrivenAccess().getFilterAssignment_6_1()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3705:1: ( rule__LeaderDriven__FilterAssignment_6_1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3705:2: rule__LeaderDriven__FilterAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__FilterAssignment_6_1_in_rule__LeaderDriven__Group_6__1__Impl7372);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3715:1: rule__LeaderDriven__Group_6__2 : rule__LeaderDriven__Group_6__2__Impl ;
    public final void rule__LeaderDriven__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3719:1: ( rule__LeaderDriven__Group_6__2__Impl )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3720:2: rule__LeaderDriven__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LeaderDriven__Group_6__2__Impl_in_rule__LeaderDriven__Group_6__27402);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3726:1: rule__LeaderDriven__Group_6__2__Impl : ( ')' ) ;
    public final void rule__LeaderDriven__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3730:1: ( ( ')' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3731:1: ( ')' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3731:1: ( ')' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3732:1: ')'
            {
             before(grammarAccess.getLeaderDrivenAccess().getRightParenthesisKeyword_6_2()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__LeaderDriven__Group_6__2__Impl7430); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3751:1: rule__PhasedStrategy__Group__0 : rule__PhasedStrategy__Group__0__Impl rule__PhasedStrategy__Group__1 ;
    public final void rule__PhasedStrategy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3755:1: ( rule__PhasedStrategy__Group__0__Impl rule__PhasedStrategy__Group__1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3756:2: rule__PhasedStrategy__Group__0__Impl rule__PhasedStrategy__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__0__Impl_in_rule__PhasedStrategy__Group__07467);
            rule__PhasedStrategy__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__1_in_rule__PhasedStrategy__Group__07470);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3763:1: rule__PhasedStrategy__Group__0__Impl : ( ( rule__PhasedStrategy__NameAssignment_0 ) ) ;
    public final void rule__PhasedStrategy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3767:1: ( ( ( rule__PhasedStrategy__NameAssignment_0 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3768:1: ( ( rule__PhasedStrategy__NameAssignment_0 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3768:1: ( ( rule__PhasedStrategy__NameAssignment_0 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3769:1: ( rule__PhasedStrategy__NameAssignment_0 )
            {
             before(grammarAccess.getPhasedStrategyAccess().getNameAssignment_0()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3770:1: ( rule__PhasedStrategy__NameAssignment_0 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3770:2: rule__PhasedStrategy__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__NameAssignment_0_in_rule__PhasedStrategy__Group__0__Impl7497);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3780:1: rule__PhasedStrategy__Group__1 : rule__PhasedStrategy__Group__1__Impl rule__PhasedStrategy__Group__2 ;
    public final void rule__PhasedStrategy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3784:1: ( rule__PhasedStrategy__Group__1__Impl rule__PhasedStrategy__Group__2 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3785:2: rule__PhasedStrategy__Group__1__Impl rule__PhasedStrategy__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__1__Impl_in_rule__PhasedStrategy__Group__17527);
            rule__PhasedStrategy__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__2_in_rule__PhasedStrategy__Group__17530);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3792:1: rule__PhasedStrategy__Group__1__Impl : ( ':' ) ;
    public final void rule__PhasedStrategy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3796:1: ( ( ':' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3797:1: ( ':' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3797:1: ( ':' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3798:1: ':'
            {
             before(grammarAccess.getPhasedStrategyAccess().getColonKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__PhasedStrategy__Group__1__Impl7558); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3811:1: rule__PhasedStrategy__Group__2 : rule__PhasedStrategy__Group__2__Impl rule__PhasedStrategy__Group__3 ;
    public final void rule__PhasedStrategy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3815:1: ( rule__PhasedStrategy__Group__2__Impl rule__PhasedStrategy__Group__3 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3816:2: rule__PhasedStrategy__Group__2__Impl rule__PhasedStrategy__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__2__Impl_in_rule__PhasedStrategy__Group__27589);
            rule__PhasedStrategy__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__3_in_rule__PhasedStrategy__Group__27592);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3823:1: rule__PhasedStrategy__Group__2__Impl : ( 'Ratio' ) ;
    public final void rule__PhasedStrategy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3827:1: ( ( 'Ratio' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3828:1: ( 'Ratio' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3828:1: ( 'Ratio' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3829:1: 'Ratio'
            {
             before(grammarAccess.getPhasedStrategyAccess().getRatioKeyword_2()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__PhasedStrategy__Group__2__Impl7620); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3842:1: rule__PhasedStrategy__Group__3 : rule__PhasedStrategy__Group__3__Impl rule__PhasedStrategy__Group__4 ;
    public final void rule__PhasedStrategy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3846:1: ( rule__PhasedStrategy__Group__3__Impl rule__PhasedStrategy__Group__4 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3847:2: rule__PhasedStrategy__Group__3__Impl rule__PhasedStrategy__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__3__Impl_in_rule__PhasedStrategy__Group__37651);
            rule__PhasedStrategy__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__4_in_rule__PhasedStrategy__Group__37654);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3854:1: rule__PhasedStrategy__Group__3__Impl : ( '{' ) ;
    public final void rule__PhasedStrategy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3858:1: ( ( '{' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3859:1: ( '{' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3859:1: ( '{' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3860:1: '{'
            {
             before(grammarAccess.getPhasedStrategyAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__PhasedStrategy__Group__3__Impl7682); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3873:1: rule__PhasedStrategy__Group__4 : rule__PhasedStrategy__Group__4__Impl rule__PhasedStrategy__Group__5 ;
    public final void rule__PhasedStrategy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3877:1: ( rule__PhasedStrategy__Group__4__Impl rule__PhasedStrategy__Group__5 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3878:2: rule__PhasedStrategy__Group__4__Impl rule__PhasedStrategy__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__4__Impl_in_rule__PhasedStrategy__Group__47713);
            rule__PhasedStrategy__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__5_in_rule__PhasedStrategy__Group__47716);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3885:1: rule__PhasedStrategy__Group__4__Impl : ( 'phases' ) ;
    public final void rule__PhasedStrategy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3889:1: ( ( 'phases' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3890:1: ( 'phases' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3890:1: ( 'phases' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3891:1: 'phases'
            {
             before(grammarAccess.getPhasedStrategyAccess().getPhasesKeyword_4()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__PhasedStrategy__Group__4__Impl7744); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3904:1: rule__PhasedStrategy__Group__5 : rule__PhasedStrategy__Group__5__Impl rule__PhasedStrategy__Group__6 ;
    public final void rule__PhasedStrategy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3908:1: ( rule__PhasedStrategy__Group__5__Impl rule__PhasedStrategy__Group__6 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3909:2: rule__PhasedStrategy__Group__5__Impl rule__PhasedStrategy__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__5__Impl_in_rule__PhasedStrategy__Group__57775);
            rule__PhasedStrategy__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__6_in_rule__PhasedStrategy__Group__57778);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3916:1: rule__PhasedStrategy__Group__5__Impl : ( '{' ) ;
    public final void rule__PhasedStrategy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3920:1: ( ( '{' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3921:1: ( '{' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3921:1: ( '{' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3922:1: '{'
            {
             before(grammarAccess.getPhasedStrategyAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__PhasedStrategy__Group__5__Impl7806); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3935:1: rule__PhasedStrategy__Group__6 : rule__PhasedStrategy__Group__6__Impl rule__PhasedStrategy__Group__7 ;
    public final void rule__PhasedStrategy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3939:1: ( rule__PhasedStrategy__Group__6__Impl rule__PhasedStrategy__Group__7 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3940:2: rule__PhasedStrategy__Group__6__Impl rule__PhasedStrategy__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__6__Impl_in_rule__PhasedStrategy__Group__67837);
            rule__PhasedStrategy__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__7_in_rule__PhasedStrategy__Group__67840);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3947:1: rule__PhasedStrategy__Group__6__Impl : ( ( rule__PhasedStrategy__PhasesAssignment_6 )* ) ;
    public final void rule__PhasedStrategy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3951:1: ( ( ( rule__PhasedStrategy__PhasesAssignment_6 )* ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3952:1: ( ( rule__PhasedStrategy__PhasesAssignment_6 )* )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3952:1: ( ( rule__PhasedStrategy__PhasesAssignment_6 )* )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3953:1: ( rule__PhasedStrategy__PhasesAssignment_6 )*
            {
             before(grammarAccess.getPhasedStrategyAccess().getPhasesAssignment_6()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3954:1: ( rule__PhasedStrategy__PhasesAssignment_6 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3954:2: rule__PhasedStrategy__PhasesAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__PhasesAssignment_6_in_rule__PhasedStrategy__Group__6__Impl7867);
            	    rule__PhasedStrategy__PhasesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3964:1: rule__PhasedStrategy__Group__7 : rule__PhasedStrategy__Group__7__Impl rule__PhasedStrategy__Group__8 ;
    public final void rule__PhasedStrategy__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3968:1: ( rule__PhasedStrategy__Group__7__Impl rule__PhasedStrategy__Group__8 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3969:2: rule__PhasedStrategy__Group__7__Impl rule__PhasedStrategy__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__7__Impl_in_rule__PhasedStrategy__Group__77898);
            rule__PhasedStrategy__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__8_in_rule__PhasedStrategy__Group__77901);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3976:1: rule__PhasedStrategy__Group__7__Impl : ( '}' ) ;
    public final void rule__PhasedStrategy__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3980:1: ( ( '}' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3981:1: ( '}' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3981:1: ( '}' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3982:1: '}'
            {
             before(grammarAccess.getPhasedStrategyAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__PhasedStrategy__Group__7__Impl7929); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3995:1: rule__PhasedStrategy__Group__8 : rule__PhasedStrategy__Group__8__Impl ;
    public final void rule__PhasedStrategy__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:3999:1: ( rule__PhasedStrategy__Group__8__Impl )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4000:2: rule__PhasedStrategy__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PhasedStrategy__Group__8__Impl_in_rule__PhasedStrategy__Group__87960);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4006:1: rule__PhasedStrategy__Group__8__Impl : ( '}' ) ;
    public final void rule__PhasedStrategy__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4010:1: ( ( '}' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4011:1: ( '}' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4011:1: ( '}' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4012:1: '}'
            {
             before(grammarAccess.getPhasedStrategyAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__PhasedStrategy__Group__8__Impl7988); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4043:1: rule__Filter__Group__0 : rule__Filter__Group__0__Impl rule__Filter__Group__1 ;
    public final void rule__Filter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4047:1: ( rule__Filter__Group__0__Impl rule__Filter__Group__1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4048:2: rule__Filter__Group__0__Impl rule__Filter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group__0__Impl_in_rule__Filter__Group__08037);
            rule__Filter__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group__1_in_rule__Filter__Group__08040);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4055:1: rule__Filter__Group__0__Impl : ( ( rule__Filter__Group_0__0 ) ) ;
    public final void rule__Filter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4059:1: ( ( ( rule__Filter__Group_0__0 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4060:1: ( ( rule__Filter__Group_0__0 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4060:1: ( ( rule__Filter__Group_0__0 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4061:1: ( rule__Filter__Group_0__0 )
            {
             before(grammarAccess.getFilterAccess().getGroup_0()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4062:1: ( rule__Filter__Group_0__0 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4062:2: rule__Filter__Group_0__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_0__0_in_rule__Filter__Group__0__Impl8067);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4072:1: rule__Filter__Group__1 : rule__Filter__Group__1__Impl ;
    public final void rule__Filter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4076:1: ( rule__Filter__Group__1__Impl )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4077:2: rule__Filter__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group__1__Impl_in_rule__Filter__Group__18097);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4083:1: rule__Filter__Group__1__Impl : ( ( rule__Filter__Group_1__0 )? ) ;
    public final void rule__Filter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4087:1: ( ( ( rule__Filter__Group_1__0 )? ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4088:1: ( ( rule__Filter__Group_1__0 )? )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4088:1: ( ( rule__Filter__Group_1__0 )? )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4089:1: ( rule__Filter__Group_1__0 )?
            {
             before(grammarAccess.getFilterAccess().getGroup_1()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4090:1: ( rule__Filter__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4090:2: rule__Filter__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_1__0_in_rule__Filter__Group__1__Impl8124);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4104:1: rule__Filter__Group_0__0 : rule__Filter__Group_0__0__Impl rule__Filter__Group_0__1 ;
    public final void rule__Filter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4108:1: ( rule__Filter__Group_0__0__Impl rule__Filter__Group_0__1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4109:2: rule__Filter__Group_0__0__Impl rule__Filter__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_0__0__Impl_in_rule__Filter__Group_0__08159);
            rule__Filter__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_0__1_in_rule__Filter__Group_0__08162);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4116:1: rule__Filter__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__Filter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4120:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4121:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4121:1: ( RULE_ID )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4122:1: RULE_ID
            {
             before(grammarAccess.getFilterAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Filter__Group_0__0__Impl8189); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4133:1: rule__Filter__Group_0__1 : rule__Filter__Group_0__1__Impl rule__Filter__Group_0__2 ;
    public final void rule__Filter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4137:1: ( rule__Filter__Group_0__1__Impl rule__Filter__Group_0__2 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4138:2: rule__Filter__Group_0__1__Impl rule__Filter__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_0__1__Impl_in_rule__Filter__Group_0__18218);
            rule__Filter__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_0__2_in_rule__Filter__Group_0__18221);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4145:1: rule__Filter__Group_0__1__Impl : ( ( rule__Filter__Alternatives_0_1 ) ) ;
    public final void rule__Filter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4149:1: ( ( ( rule__Filter__Alternatives_0_1 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4150:1: ( ( rule__Filter__Alternatives_0_1 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4150:1: ( ( rule__Filter__Alternatives_0_1 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4151:1: ( rule__Filter__Alternatives_0_1 )
            {
             before(grammarAccess.getFilterAccess().getAlternatives_0_1()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4152:1: ( rule__Filter__Alternatives_0_1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4152:2: rule__Filter__Alternatives_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filter__Alternatives_0_1_in_rule__Filter__Group_0__1__Impl8248);
            rule__Filter__Alternatives_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getAlternatives_0_1()); 

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4162:1: rule__Filter__Group_0__2 : rule__Filter__Group_0__2__Impl ;
    public final void rule__Filter__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4166:1: ( rule__Filter__Group_0__2__Impl )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4167:2: rule__Filter__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_0__2__Impl_in_rule__Filter__Group_0__28278);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4173:1: rule__Filter__Group_0__2__Impl : ( RULE_ID ) ;
    public final void rule__Filter__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4177:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4178:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4178:1: ( RULE_ID )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4179:1: RULE_ID
            {
             before(grammarAccess.getFilterAccess().getIDTerminalRuleCall_0_2()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Filter__Group_0__2__Impl8305); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4196:1: rule__Filter__Group_1__0 : rule__Filter__Group_1__0__Impl rule__Filter__Group_1__1 ;
    public final void rule__Filter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4200:1: ( rule__Filter__Group_1__0__Impl rule__Filter__Group_1__1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4201:2: rule__Filter__Group_1__0__Impl rule__Filter__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_1__0__Impl_in_rule__Filter__Group_1__08340);
            rule__Filter__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_1__1_in_rule__Filter__Group_1__08343);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4208:1: rule__Filter__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Filter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4212:1: ( ( ',' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4213:1: ( ',' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4213:1: ( ',' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4214:1: ','
            {
             before(grammarAccess.getFilterAccess().getCommaKeyword_1_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Filter__Group_1__0__Impl8371); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4227:1: rule__Filter__Group_1__1 : rule__Filter__Group_1__1__Impl rule__Filter__Group_1__2 ;
    public final void rule__Filter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4231:1: ( rule__Filter__Group_1__1__Impl rule__Filter__Group_1__2 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4232:2: rule__Filter__Group_1__1__Impl rule__Filter__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_1__1__Impl_in_rule__Filter__Group_1__18402);
            rule__Filter__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_1__2_in_rule__Filter__Group_1__18405);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4239:1: rule__Filter__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Filter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4243:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4244:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4244:1: ( RULE_ID )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4245:1: RULE_ID
            {
             before(grammarAccess.getFilterAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Filter__Group_1__1__Impl8432); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4256:1: rule__Filter__Group_1__2 : rule__Filter__Group_1__2__Impl rule__Filter__Group_1__3 ;
    public final void rule__Filter__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4260:1: ( rule__Filter__Group_1__2__Impl rule__Filter__Group_1__3 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4261:2: rule__Filter__Group_1__2__Impl rule__Filter__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_1__2__Impl_in_rule__Filter__Group_1__28461);
            rule__Filter__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_1__3_in_rule__Filter__Group_1__28464);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4268:1: rule__Filter__Group_1__2__Impl : ( ( rule__Filter__Alternatives_1_2 ) ) ;
    public final void rule__Filter__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4272:1: ( ( ( rule__Filter__Alternatives_1_2 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4273:1: ( ( rule__Filter__Alternatives_1_2 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4273:1: ( ( rule__Filter__Alternatives_1_2 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4274:1: ( rule__Filter__Alternatives_1_2 )
            {
             before(grammarAccess.getFilterAccess().getAlternatives_1_2()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4275:1: ( rule__Filter__Alternatives_1_2 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4275:2: rule__Filter__Alternatives_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filter__Alternatives_1_2_in_rule__Filter__Group_1__2__Impl8491);
            rule__Filter__Alternatives_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getAlternatives_1_2()); 

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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4285:1: rule__Filter__Group_1__3 : rule__Filter__Group_1__3__Impl ;
    public final void rule__Filter__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4289:1: ( rule__Filter__Group_1__3__Impl )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4290:2: rule__Filter__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filter__Group_1__3__Impl_in_rule__Filter__Group_1__38521);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4296:1: rule__Filter__Group_1__3__Impl : ( RULE_ID ) ;
    public final void rule__Filter__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4300:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4301:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4301:1: ( RULE_ID )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4302:1: RULE_ID
            {
             before(grammarAccess.getFilterAccess().getIDTerminalRuleCall_1_3()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Filter__Group_1__3__Impl8548); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4321:1: rule__Timer__Group__0 : rule__Timer__Group__0__Impl rule__Timer__Group__1 ;
    public final void rule__Timer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4325:1: ( rule__Timer__Group__0__Impl rule__Timer__Group__1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4326:2: rule__Timer__Group__0__Impl rule__Timer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Timer__Group__0__Impl_in_rule__Timer__Group__08585);
            rule__Timer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Timer__Group__1_in_rule__Timer__Group__08588);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4333:1: rule__Timer__Group__0__Impl : ( () ) ;
    public final void rule__Timer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4337:1: ( ( () ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4338:1: ( () )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4338:1: ( () )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4339:1: ()
            {
             before(grammarAccess.getTimerAccess().getTimerAction_0()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4340:1: ()
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4342:1: 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4352:1: rule__Timer__Group__1 : rule__Timer__Group__1__Impl rule__Timer__Group__2 ;
    public final void rule__Timer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4356:1: ( rule__Timer__Group__1__Impl rule__Timer__Group__2 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4357:2: rule__Timer__Group__1__Impl rule__Timer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Timer__Group__1__Impl_in_rule__Timer__Group__18646);
            rule__Timer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Timer__Group__2_in_rule__Timer__Group__18649);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4364:1: rule__Timer__Group__1__Impl : ( ( rule__Timer__NameAssignment_1 ) ) ;
    public final void rule__Timer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4368:1: ( ( ( rule__Timer__NameAssignment_1 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4369:1: ( ( rule__Timer__NameAssignment_1 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4369:1: ( ( rule__Timer__NameAssignment_1 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4370:1: ( rule__Timer__NameAssignment_1 )
            {
             before(grammarAccess.getTimerAccess().getNameAssignment_1()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4371:1: ( rule__Timer__NameAssignment_1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4371:2: rule__Timer__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Timer__NameAssignment_1_in_rule__Timer__Group__1__Impl8676);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4381:1: rule__Timer__Group__2 : rule__Timer__Group__2__Impl rule__Timer__Group__3 ;
    public final void rule__Timer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4385:1: ( rule__Timer__Group__2__Impl rule__Timer__Group__3 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4386:2: rule__Timer__Group__2__Impl rule__Timer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Timer__Group__2__Impl_in_rule__Timer__Group__28706);
            rule__Timer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Timer__Group__3_in_rule__Timer__Group__28709);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4393:1: rule__Timer__Group__2__Impl : ( ':' ) ;
    public final void rule__Timer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4397:1: ( ( ':' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4398:1: ( ':' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4398:1: ( ':' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4399:1: ':'
            {
             before(grammarAccess.getTimerAccess().getColonKeyword_2()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Timer__Group__2__Impl8737); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4412:1: rule__Timer__Group__3 : rule__Timer__Group__3__Impl rule__Timer__Group__4 ;
    public final void rule__Timer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4416:1: ( rule__Timer__Group__3__Impl rule__Timer__Group__4 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4417:2: rule__Timer__Group__3__Impl rule__Timer__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Timer__Group__3__Impl_in_rule__Timer__Group__38768);
            rule__Timer__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Timer__Group__4_in_rule__Timer__Group__38771);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4424:1: rule__Timer__Group__3__Impl : ( ( rule__Timer__TimeStampAssignment_3 ) ) ;
    public final void rule__Timer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4428:1: ( ( ( rule__Timer__TimeStampAssignment_3 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4429:1: ( ( rule__Timer__TimeStampAssignment_3 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4429:1: ( ( rule__Timer__TimeStampAssignment_3 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4430:1: ( rule__Timer__TimeStampAssignment_3 )
            {
             before(grammarAccess.getTimerAccess().getTimeStampAssignment_3()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4431:1: ( rule__Timer__TimeStampAssignment_3 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4431:2: rule__Timer__TimeStampAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Timer__TimeStampAssignment_3_in_rule__Timer__Group__3__Impl8798);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4441:1: rule__Timer__Group__4 : rule__Timer__Group__4__Impl ;
    public final void rule__Timer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4445:1: ( rule__Timer__Group__4__Impl )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4446:2: rule__Timer__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Timer__Group__4__Impl_in_rule__Timer__Group__48828);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4452:1: rule__Timer__Group__4__Impl : ( 'days' ) ;
    public final void rule__Timer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4456:1: ( ( 'days' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4457:1: ( 'days' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4457:1: ( 'days' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4458:1: 'days'
            {
             before(grammarAccess.getTimerAccess().getDaysKeyword_4()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Timer__Group__4__Impl8856); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4481:1: rule__WaitForVote__Group__0 : rule__WaitForVote__Group__0__Impl rule__WaitForVote__Group__1 ;
    public final void rule__WaitForVote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4485:1: ( rule__WaitForVote__Group__0__Impl rule__WaitForVote__Group__1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4486:2: rule__WaitForVote__Group__0__Impl rule__WaitForVote__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WaitForVote__Group__0__Impl_in_rule__WaitForVote__Group__08897);
            rule__WaitForVote__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WaitForVote__Group__1_in_rule__WaitForVote__Group__08900);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4493:1: rule__WaitForVote__Group__0__Impl : ( ( rule__WaitForVote__RolesAssignment_0 ) ) ;
    public final void rule__WaitForVote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4497:1: ( ( ( rule__WaitForVote__RolesAssignment_0 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4498:1: ( ( rule__WaitForVote__RolesAssignment_0 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4498:1: ( ( rule__WaitForVote__RolesAssignment_0 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4499:1: ( rule__WaitForVote__RolesAssignment_0 )
            {
             before(grammarAccess.getWaitForVoteAccess().getRolesAssignment_0()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4500:1: ( rule__WaitForVote__RolesAssignment_0 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4500:2: rule__WaitForVote__RolesAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__WaitForVote__RolesAssignment_0_in_rule__WaitForVote__Group__0__Impl8927);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4510:1: rule__WaitForVote__Group__1 : rule__WaitForVote__Group__1__Impl ;
    public final void rule__WaitForVote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4514:1: ( rule__WaitForVote__Group__1__Impl )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4515:2: rule__WaitForVote__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WaitForVote__Group__1__Impl_in_rule__WaitForVote__Group__18957);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4521:1: rule__WaitForVote__Group__1__Impl : ( ( rule__WaitForVote__Group_1__0 )* ) ;
    public final void rule__WaitForVote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4525:1: ( ( ( rule__WaitForVote__Group_1__0 )* ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4526:1: ( ( rule__WaitForVote__Group_1__0 )* )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4526:1: ( ( rule__WaitForVote__Group_1__0 )* )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4527:1: ( rule__WaitForVote__Group_1__0 )*
            {
             before(grammarAccess.getWaitForVoteAccess().getGroup_1()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4528:1: ( rule__WaitForVote__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==27) ) {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2==RULE_ID) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4528:2: rule__WaitForVote__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__WaitForVote__Group_1__0_in_rule__WaitForVote__Group__1__Impl8984);
            	    rule__WaitForVote__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4542:1: rule__WaitForVote__Group_1__0 : rule__WaitForVote__Group_1__0__Impl rule__WaitForVote__Group_1__1 ;
    public final void rule__WaitForVote__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4546:1: ( rule__WaitForVote__Group_1__0__Impl rule__WaitForVote__Group_1__1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4547:2: rule__WaitForVote__Group_1__0__Impl rule__WaitForVote__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WaitForVote__Group_1__0__Impl_in_rule__WaitForVote__Group_1__09019);
            rule__WaitForVote__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WaitForVote__Group_1__1_in_rule__WaitForVote__Group_1__09022);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4554:1: rule__WaitForVote__Group_1__0__Impl : ( ',' ) ;
    public final void rule__WaitForVote__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4558:1: ( ( ',' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4559:1: ( ',' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4559:1: ( ',' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4560:1: ','
            {
             before(grammarAccess.getWaitForVoteAccess().getCommaKeyword_1_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__WaitForVote__Group_1__0__Impl9050); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4573:1: rule__WaitForVote__Group_1__1 : rule__WaitForVote__Group_1__1__Impl ;
    public final void rule__WaitForVote__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4577:1: ( rule__WaitForVote__Group_1__1__Impl )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4578:2: rule__WaitForVote__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WaitForVote__Group_1__1__Impl_in_rule__WaitForVote__Group_1__19081);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4584:1: rule__WaitForVote__Group_1__1__Impl : ( ( rule__WaitForVote__RolesAssignment_1_1 ) ) ;
    public final void rule__WaitForVote__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4588:1: ( ( ( rule__WaitForVote__RolesAssignment_1_1 ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4589:1: ( ( rule__WaitForVote__RolesAssignment_1_1 ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4589:1: ( ( rule__WaitForVote__RolesAssignment_1_1 ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4590:1: ( rule__WaitForVote__RolesAssignment_1_1 )
            {
             before(grammarAccess.getWaitForVoteAccess().getRolesAssignment_1_1()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4591:1: ( rule__WaitForVote__RolesAssignment_1_1 )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4591:2: rule__WaitForVote__RolesAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WaitForVote__RolesAssignment_1_1_in_rule__WaitForVote__Group_1__1__Impl9108);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4606:1: rule__Project__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Project__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4610:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4611:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4611:1: ( RULE_ID )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4612:1: RULE_ID
            {
             before(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Project__NameAssignment_29147); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4621:1: rule__Project__RolesAssignment_4_2 : ( ruleRole ) ;
    public final void rule__Project__RolesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4625:1: ( ( ruleRole ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4626:1: ( ruleRole )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4626:1: ( ruleRole )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4627:1: ruleRole
            {
             before(grammarAccess.getProjectAccess().getRolesRoleParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_rule__Project__RolesAssignment_4_29178);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4636:1: rule__Project__RolesAssignment_4_3_1 : ( ruleRole ) ;
    public final void rule__Project__RolesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4640:1: ( ( ruleRole ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4641:1: ( ruleRole )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4641:1: ( ruleRole )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4642:1: ruleRole
            {
             before(grammarAccess.getProjectAccess().getRolesRoleParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_rule__Project__RolesAssignment_4_3_19209);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4651:1: rule__Project__DeadlinesAssignment_5_2 : ( ruleDeadline ) ;
    public final void rule__Project__DeadlinesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4655:1: ( ( ruleDeadline ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4656:1: ( ruleDeadline )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4656:1: ( ruleDeadline )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4657:1: ruleDeadline
            {
             before(grammarAccess.getProjectAccess().getDeadlinesDeadlineParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeadline_in_rule__Project__DeadlinesAssignment_5_29240);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4666:1: rule__Project__DeadlinesAssignment_5_3_1 : ( ruleDeadline ) ;
    public final void rule__Project__DeadlinesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4670:1: ( ( ruleDeadline ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4671:1: ( ruleDeadline )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4671:1: ( ruleDeadline )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4672:1: ruleDeadline
            {
             before(grammarAccess.getProjectAccess().getDeadlinesDeadlineParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeadline_in_rule__Project__DeadlinesAssignment_5_3_19271);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4681:1: rule__Project__StrategiesAssignment_6_2 : ( ruleStrategy ) ;
    public final void rule__Project__StrategiesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4685:1: ( ( ruleStrategy ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4686:1: ( ruleStrategy )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4686:1: ( ruleStrategy )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4687:1: ruleStrategy
            {
             before(grammarAccess.getProjectAccess().getStrategiesStrategyParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Project__StrategiesAssignment_6_29302);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4696:1: rule__Project__StrategiesAssignment_6_3_1 : ( ruleStrategy ) ;
    public final void rule__Project__StrategiesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4700:1: ( ( ruleStrategy ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4701:1: ( ruleStrategy )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4701:1: ( ruleStrategy )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4702:1: ruleStrategy
            {
             before(grammarAccess.getProjectAccess().getStrategiesStrategyParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Project__StrategiesAssignment_6_3_19333);
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4711:1: rule__Role__NameAssignment : ( RULE_ID ) ;
    public final void rule__Role__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4715:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4716:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4716:1: ( RULE_ID )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4717:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Role__NameAssignment9364); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4726:1: rule__Majority__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Majority__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4730:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4731:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4731:1: ( RULE_ID )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4732:1: RULE_ID
            {
             before(grammarAccess.getMajorityAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Majority__NameAssignment_09395); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4741:1: rule__Majority__AppliedToAssignment_5 : ( ruleCollaborationType ) ;
    public final void rule__Majority__AppliedToAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4745:1: ( ( ruleCollaborationType ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4746:1: ( ruleCollaborationType )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4746:1: ( ruleCollaborationType )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4747:1: ruleCollaborationType
            {
             before(grammarAccess.getMajorityAccess().getAppliedToCollaborationTypeEnumRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCollaborationType_in_rule__Majority__AppliedToAssignment_59426);
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


    // $ANTLR start "rule__Majority__StageAssignment_8"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4756:1: rule__Majority__StageAssignment_8 : ( ruleStageType ) ;
    public final void rule__Majority__StageAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4760:1: ( ( ruleStageType ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4761:1: ( ruleStageType )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4761:1: ( ruleStageType )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4762:1: ruleStageType
            {
             before(grammarAccess.getMajorityAccess().getStageStageTypeEnumRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStageType_in_rule__Majority__StageAssignment_89457);
            ruleStageType();

            state._fsp--;

             after(grammarAccess.getMajorityAccess().getStageStageTypeEnumRuleCall_8_0()); 

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
    // $ANTLR end "rule__Majority__StageAssignment_8"


    // $ANTLR start "rule__Majority__PeopleAssignment_10"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4771:1: rule__Majority__PeopleAssignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Majority__PeopleAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4775:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4776:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4776:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4777:1: ( RULE_ID )
            {
             before(grammarAccess.getMajorityAccess().getPeopleRoleCrossReference_10_0()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4778:1: ( RULE_ID )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4779:1: RULE_ID
            {
             before(grammarAccess.getMajorityAccess().getPeopleRoleIDTerminalRuleCall_10_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Majority__PeopleAssignment_109492); 
             after(grammarAccess.getMajorityAccess().getPeopleRoleIDTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getMajorityAccess().getPeopleRoleCrossReference_10_0()); 

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
    // $ANTLR end "rule__Majority__PeopleAssignment_10"


    // $ANTLR start "rule__Majority__PeopleAssignment_11_1"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4790:1: rule__Majority__PeopleAssignment_11_1 : ( ( RULE_ID ) ) ;
    public final void rule__Majority__PeopleAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4794:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4795:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4795:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4796:1: ( RULE_ID )
            {
             before(grammarAccess.getMajorityAccess().getPeopleRoleCrossReference_11_1_0()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4797:1: ( RULE_ID )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4798:1: RULE_ID
            {
             before(grammarAccess.getMajorityAccess().getPeopleRoleIDTerminalRuleCall_11_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Majority__PeopleAssignment_11_19531); 
             after(grammarAccess.getMajorityAccess().getPeopleRoleIDTerminalRuleCall_11_1_0_1()); 

            }

             after(grammarAccess.getMajorityAccess().getPeopleRoleCrossReference_11_1_0()); 

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
    // $ANTLR end "rule__Majority__PeopleAssignment_11_1"


    // $ANTLR start "rule__Majority__RangeAssignment_13"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4809:1: rule__Majority__RangeAssignment_13 : ( ruleRangeType ) ;
    public final void rule__Majority__RangeAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4813:1: ( ( ruleRangeType ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4814:1: ( ruleRangeType )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4814:1: ( ruleRangeType )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4815:1: ruleRangeType
            {
             before(grammarAccess.getMajorityAccess().getRangeRangeTypeEnumRuleCall_13_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRangeType_in_rule__Majority__RangeAssignment_139566);
            ruleRangeType();

            state._fsp--;

             after(grammarAccess.getMajorityAccess().getRangeRangeTypeEnumRuleCall_13_0()); 

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
    // $ANTLR end "rule__Majority__RangeAssignment_13"


    // $ANTLR start "rule__Majority__MinVotesAssignment_14_1"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4824:1: rule__Majority__MinVotesAssignment_14_1 : ( RULE_INT ) ;
    public final void rule__Majority__MinVotesAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4828:1: ( ( RULE_INT ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4829:1: ( RULE_INT )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4829:1: ( RULE_INT )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4830:1: RULE_INT
            {
             before(grammarAccess.getMajorityAccess().getMinVotesINTTerminalRuleCall_14_1_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Majority__MinVotesAssignment_14_19597); 
             after(grammarAccess.getMajorityAccess().getMinVotesINTTerminalRuleCall_14_1_0()); 

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
    // $ANTLR end "rule__Majority__MinVotesAssignment_14_1"


    // $ANTLR start "rule__Majority__DeadlineAssignment_16"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4839:1: rule__Majority__DeadlineAssignment_16 : ( ( RULE_ID ) ) ;
    public final void rule__Majority__DeadlineAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4843:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4844:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4844:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4845:1: ( RULE_ID )
            {
             before(grammarAccess.getMajorityAccess().getDeadlineDeadlineCrossReference_16_0()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4846:1: ( RULE_ID )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4847:1: RULE_ID
            {
             before(grammarAccess.getMajorityAccess().getDeadlineDeadlineIDTerminalRuleCall_16_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Majority__DeadlineAssignment_169632); 
             after(grammarAccess.getMajorityAccess().getDeadlineDeadlineIDTerminalRuleCall_16_0_1()); 

            }

             after(grammarAccess.getMajorityAccess().getDeadlineDeadlineCrossReference_16_0()); 

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
    // $ANTLR end "rule__Majority__DeadlineAssignment_16"


    // $ANTLR start "rule__RatioMajority__NameAssignment_0"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4858:1: rule__RatioMajority__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__RatioMajority__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4862:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4863:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4863:1: ( RULE_ID )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4864:1: RULE_ID
            {
             before(grammarAccess.getRatioMajorityAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RatioMajority__NameAssignment_09667); 
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


    // $ANTLR start "rule__RatioMajority__StageAssignment_8"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4873:1: rule__RatioMajority__StageAssignment_8 : ( ruleStageType ) ;
    public final void rule__RatioMajority__StageAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4877:1: ( ( ruleStageType ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4878:1: ( ruleStageType )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4878:1: ( ruleStageType )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4879:1: ruleStageType
            {
             before(grammarAccess.getRatioMajorityAccess().getStageStageTypeEnumRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStageType_in_rule__RatioMajority__StageAssignment_89698);
            ruleStageType();

            state._fsp--;

             after(grammarAccess.getRatioMajorityAccess().getStageStageTypeEnumRuleCall_8_0()); 

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
    // $ANTLR end "rule__RatioMajority__StageAssignment_8"


    // $ANTLR start "rule__RatioMajority__PeopleAssignment_10"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4888:1: rule__RatioMajority__PeopleAssignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__RatioMajority__PeopleAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4892:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4893:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4893:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4894:1: ( RULE_ID )
            {
             before(grammarAccess.getRatioMajorityAccess().getPeopleRoleCrossReference_10_0()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4895:1: ( RULE_ID )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4896:1: RULE_ID
            {
             before(grammarAccess.getRatioMajorityAccess().getPeopleRoleIDTerminalRuleCall_10_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RatioMajority__PeopleAssignment_109733); 
             after(grammarAccess.getRatioMajorityAccess().getPeopleRoleIDTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getRatioMajorityAccess().getPeopleRoleCrossReference_10_0()); 

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
    // $ANTLR end "rule__RatioMajority__PeopleAssignment_10"


    // $ANTLR start "rule__RatioMajority__PeopleAssignment_11_1"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4907:1: rule__RatioMajority__PeopleAssignment_11_1 : ( ( RULE_ID ) ) ;
    public final void rule__RatioMajority__PeopleAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4911:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4912:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4912:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4913:1: ( RULE_ID )
            {
             before(grammarAccess.getRatioMajorityAccess().getPeopleRoleCrossReference_11_1_0()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4914:1: ( RULE_ID )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4915:1: RULE_ID
            {
             before(grammarAccess.getRatioMajorityAccess().getPeopleRoleIDTerminalRuleCall_11_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RatioMajority__PeopleAssignment_11_19772); 
             after(grammarAccess.getRatioMajorityAccess().getPeopleRoleIDTerminalRuleCall_11_1_0_1()); 

            }

             after(grammarAccess.getRatioMajorityAccess().getPeopleRoleCrossReference_11_1_0()); 

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
    // $ANTLR end "rule__RatioMajority__PeopleAssignment_11_1"


    // $ANTLR start "rule__RatioMajority__RangeAssignment_13"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4926:1: rule__RatioMajority__RangeAssignment_13 : ( ruleRangeType ) ;
    public final void rule__RatioMajority__RangeAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4930:1: ( ( ruleRangeType ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4931:1: ( ruleRangeType )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4931:1: ( ruleRangeType )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4932:1: ruleRangeType
            {
             before(grammarAccess.getRatioMajorityAccess().getRangeRangeTypeEnumRuleCall_13_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRangeType_in_rule__RatioMajority__RangeAssignment_139807);
            ruleRangeType();

            state._fsp--;

             after(grammarAccess.getRatioMajorityAccess().getRangeRangeTypeEnumRuleCall_13_0()); 

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
    // $ANTLR end "rule__RatioMajority__RangeAssignment_13"


    // $ANTLR start "rule__RatioMajority__MinVotesAssignment_14_1"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4941:1: rule__RatioMajority__MinVotesAssignment_14_1 : ( RULE_INT ) ;
    public final void rule__RatioMajority__MinVotesAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4945:1: ( ( RULE_INT ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4946:1: ( RULE_INT )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4946:1: ( RULE_INT )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4947:1: RULE_INT
            {
             before(grammarAccess.getRatioMajorityAccess().getMinVotesINTTerminalRuleCall_14_1_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__RatioMajority__MinVotesAssignment_14_19838); 
             after(grammarAccess.getRatioMajorityAccess().getMinVotesINTTerminalRuleCall_14_1_0()); 

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
    // $ANTLR end "rule__RatioMajority__MinVotesAssignment_14_1"


    // $ANTLR start "rule__RatioMajority__RatioAssignment_16"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4956:1: rule__RatioMajority__RatioAssignment_16 : ( RULE_FLOAT ) ;
    public final void rule__RatioMajority__RatioAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4960:1: ( ( RULE_FLOAT ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4961:1: ( RULE_FLOAT )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4961:1: ( RULE_FLOAT )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4962:1: RULE_FLOAT
            {
             before(grammarAccess.getRatioMajorityAccess().getRatioFLOATTerminalRuleCall_16_0()); 
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__RatioMajority__RatioAssignment_169869); 
             after(grammarAccess.getRatioMajorityAccess().getRatioFLOATTerminalRuleCall_16_0()); 

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
    // $ANTLR end "rule__RatioMajority__RatioAssignment_16"


    // $ANTLR start "rule__RatioMajority__DeadlineAssignment_18"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4971:1: rule__RatioMajority__DeadlineAssignment_18 : ( ( RULE_ID ) ) ;
    public final void rule__RatioMajority__DeadlineAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4975:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4976:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4976:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4977:1: ( RULE_ID )
            {
             before(grammarAccess.getRatioMajorityAccess().getDeadlineDeadlineCrossReference_18_0()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4978:1: ( RULE_ID )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4979:1: RULE_ID
            {
             before(grammarAccess.getRatioMajorityAccess().getDeadlineDeadlineIDTerminalRuleCall_18_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RatioMajority__DeadlineAssignment_189904); 
             after(grammarAccess.getRatioMajorityAccess().getDeadlineDeadlineIDTerminalRuleCall_18_0_1()); 

            }

             after(grammarAccess.getRatioMajorityAccess().getDeadlineDeadlineCrossReference_18_0()); 

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
    // $ANTLR end "rule__RatioMajority__DeadlineAssignment_18"


    // $ANTLR start "rule__LeaderDriven__NameAssignment_0"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4990:1: rule__LeaderDriven__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__LeaderDriven__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4994:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4995:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4995:1: ( RULE_ID )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:4996:1: RULE_ID
            {
             before(grammarAccess.getLeaderDrivenAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__LeaderDriven__NameAssignment_09939); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5005:1: rule__LeaderDriven__FilterAssignment_6_1 : ( ruleFilter ) ;
    public final void rule__LeaderDriven__FilterAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5009:1: ( ( ruleFilter ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5010:1: ( ruleFilter )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5010:1: ( ruleFilter )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5011:1: ruleFilter
            {
             before(grammarAccess.getLeaderDrivenAccess().getFilterFilterParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilter_in_rule__LeaderDriven__FilterAssignment_6_19970);
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


    // $ANTLR start "rule__LeaderDriven__StageAssignment_8"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5020:1: rule__LeaderDriven__StageAssignment_8 : ( ruleStageType ) ;
    public final void rule__LeaderDriven__StageAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5024:1: ( ( ruleStageType ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5025:1: ( ruleStageType )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5025:1: ( ruleStageType )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5026:1: ruleStageType
            {
             before(grammarAccess.getLeaderDrivenAccess().getStageStageTypeEnumRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStageType_in_rule__LeaderDriven__StageAssignment_810001);
            ruleStageType();

            state._fsp--;

             after(grammarAccess.getLeaderDrivenAccess().getStageStageTypeEnumRuleCall_8_0()); 

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
    // $ANTLR end "rule__LeaderDriven__StageAssignment_8"


    // $ANTLR start "rule__LeaderDriven__DefaultAssignment_10"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5035:1: rule__LeaderDriven__DefaultAssignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__LeaderDriven__DefaultAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5039:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5040:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5040:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5041:1: ( RULE_ID )
            {
             before(grammarAccess.getLeaderDrivenAccess().getDefaultStrategyCrossReference_10_0()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5042:1: ( RULE_ID )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5043:1: RULE_ID
            {
             before(grammarAccess.getLeaderDrivenAccess().getDefaultStrategyIDTerminalRuleCall_10_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__LeaderDriven__DefaultAssignment_1010036); 
             after(grammarAccess.getLeaderDrivenAccess().getDefaultStrategyIDTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getLeaderDrivenAccess().getDefaultStrategyCrossReference_10_0()); 

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
    // $ANTLR end "rule__LeaderDriven__DefaultAssignment_10"


    // $ANTLR start "rule__LeaderDriven__DeadlineAssignment_12"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5054:1: rule__LeaderDriven__DeadlineAssignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__LeaderDriven__DeadlineAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5058:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5059:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5059:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5060:1: ( RULE_ID )
            {
             before(grammarAccess.getLeaderDrivenAccess().getDeadlineDeadlineCrossReference_12_0()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5061:1: ( RULE_ID )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5062:1: RULE_ID
            {
             before(grammarAccess.getLeaderDrivenAccess().getDeadlineDeadlineIDTerminalRuleCall_12_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__LeaderDriven__DeadlineAssignment_1210075); 
             after(grammarAccess.getLeaderDrivenAccess().getDeadlineDeadlineIDTerminalRuleCall_12_0_1()); 

            }

             after(grammarAccess.getLeaderDrivenAccess().getDeadlineDeadlineCrossReference_12_0()); 

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
    // $ANTLR end "rule__LeaderDriven__DeadlineAssignment_12"


    // $ANTLR start "rule__PhasedStrategy__NameAssignment_0"
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5073:1: rule__PhasedStrategy__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__PhasedStrategy__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5077:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5078:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5078:1: ( RULE_ID )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5079:1: RULE_ID
            {
             before(grammarAccess.getPhasedStrategyAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PhasedStrategy__NameAssignment_010110); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5088:1: rule__PhasedStrategy__PhasesAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__PhasedStrategy__PhasesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5092:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5093:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5093:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5094:1: ( RULE_ID )
            {
             before(grammarAccess.getPhasedStrategyAccess().getPhasesStrategyCrossReference_6_0()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5095:1: ( RULE_ID )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5096:1: RULE_ID
            {
             before(grammarAccess.getPhasedStrategyAccess().getPhasesStrategyIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PhasedStrategy__PhasesAssignment_610145); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5107:1: rule__Timer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Timer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5111:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5112:1: ( RULE_ID )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5112:1: ( RULE_ID )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5113:1: RULE_ID
            {
             before(grammarAccess.getTimerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Timer__NameAssignment_110180); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5122:1: rule__Timer__TimeStampAssignment_3 : ( RULE_INT ) ;
    public final void rule__Timer__TimeStampAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5126:1: ( ( RULE_INT ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5127:1: ( RULE_INT )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5127:1: ( RULE_INT )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5128:1: RULE_INT
            {
             before(grammarAccess.getTimerAccess().getTimeStampINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Timer__TimeStampAssignment_310211); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5137:1: rule__OCLCondition__OclExpressionAssignment : ( RULE_STRING ) ;
    public final void rule__OCLCondition__OclExpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5141:1: ( ( RULE_STRING ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5142:1: ( RULE_STRING )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5142:1: ( RULE_STRING )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5143:1: RULE_STRING
            {
             before(grammarAccess.getOCLConditionAccess().getOclExpressionSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__OCLCondition__OclExpressionAssignment10242); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5152:1: rule__WaitForVote__RolesAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__WaitForVote__RolesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5156:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5157:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5157:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5158:1: ( RULE_ID )
            {
             before(grammarAccess.getWaitForVoteAccess().getRolesRoleCrossReference_0_0()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5159:1: ( RULE_ID )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5160:1: RULE_ID
            {
             before(grammarAccess.getWaitForVoteAccess().getRolesRoleIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__WaitForVote__RolesAssignment_010277); 
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
    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5171:1: rule__WaitForVote__RolesAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__WaitForVote__RolesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5175:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5176:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5176:1: ( ( RULE_ID ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5177:1: ( RULE_ID )
            {
             before(grammarAccess.getWaitForVoteAccess().getRolesRoleCrossReference_1_1_0()); 
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5178:1: ( RULE_ID )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5179:1: RULE_ID
            {
             before(grammarAccess.getWaitForVoteAccess().getRolesRoleIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__WaitForVote__RolesAssignment_1_110316); 
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
        public static final BitSet FOLLOW_rule__StageType__Alternatives_in_ruleStageType827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RangeType__Alternatives_in_ruleRangeType863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMajority_in_rule__Strategy__Alternatives898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRatioMajority_in_rule__Strategy__Alternatives915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeaderDriven_in_rule__Strategy__Alternatives932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePhasedStrategy_in_rule__Strategy__Alternatives949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__RatioMajority__Alternatives_5982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__RatioMajority__Alternatives_51002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RatioMajority__Alternatives_51022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__LeaderDriven__Alternatives_51057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__LeaderDriven__Alternatives_51077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__LeaderDriven__Alternatives_51097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Filter__Alternatives_0_11132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Filter__Alternatives_0_11152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Filter__Alternatives_1_21187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Filter__Alternatives_1_21207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimer_in_rule__Deadline__Alternatives1241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWaitForVote_in_rule__Deadline__Alternatives1258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOCLCondition_in_rule__Deadline__Alternatives1275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__CollaborationType__Alternatives1308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__CollaborationType__Alternatives1329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__CollaborationType__Alternatives1350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__StageType__Alternatives1386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__StageType__Alternatives1407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__StageType__Alternatives1428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__RangeType__Alternatives1464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__RangeType__Alternatives1485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group__0__Impl_in_rule__Project__Group__01518 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Project__Group__1_in_rule__Project__Group__01521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group__1__Impl_in_rule__Project__Group__11579 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Project__Group__2_in_rule__Project__Group__11582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Project__Group__1__Impl1610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group__2__Impl_in_rule__Project__Group__21641 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Project__Group__3_in_rule__Project__Group__21644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__NameAssignment_2_in_rule__Project__Group__2__Impl1671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group__3__Impl_in_rule__Project__Group__31701 = new BitSet(new long[]{0x0000000033000000L});
        public static final BitSet FOLLOW_rule__Project__Group__4_in_rule__Project__Group__31704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Project__Group__3__Impl1732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group__4__Impl_in_rule__Project__Group__41763 = new BitSet(new long[]{0x0000000033000000L});
        public static final BitSet FOLLOW_rule__Project__Group__5_in_rule__Project__Group__41766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_4__0_in_rule__Project__Group__4__Impl1793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group__5__Impl_in_rule__Project__Group__51824 = new BitSet(new long[]{0x0000000033000000L});
        public static final BitSet FOLLOW_rule__Project__Group__6_in_rule__Project__Group__51827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_5__0_in_rule__Project__Group__5__Impl1854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group__6__Impl_in_rule__Project__Group__61885 = new BitSet(new long[]{0x0000000033000000L});
        public static final BitSet FOLLOW_rule__Project__Group__7_in_rule__Project__Group__61888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_6__0_in_rule__Project__Group__6__Impl1915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group__7__Impl_in_rule__Project__Group__71946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Project__Group__7__Impl1974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_4__0__Impl_in_rule__Project__Group_4__02021 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Project__Group_4__1_in_rule__Project__Group_4__02024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Project__Group_4__0__Impl2052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_4__1__Impl_in_rule__Project__Group_4__12083 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Project__Group_4__2_in_rule__Project__Group_4__12086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Project__Group_4__1__Impl2114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_4__2__Impl_in_rule__Project__Group_4__22145 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Project__Group_4__3_in_rule__Project__Group_4__22148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__RolesAssignment_4_2_in_rule__Project__Group_4__2__Impl2175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_4__3__Impl_in_rule__Project__Group_4__32205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_4_3__0_in_rule__Project__Group_4__3__Impl2232 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Project__Group_4_3__0__Impl_in_rule__Project__Group_4_3__02271 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Project__Group_4_3__1_in_rule__Project__Group_4_3__02274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Project__Group_4_3__0__Impl2302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_4_3__1__Impl_in_rule__Project__Group_4_3__12333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__RolesAssignment_4_3_1_in_rule__Project__Group_4_3__1__Impl2360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_5__0__Impl_in_rule__Project__Group_5__02394 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Project__Group_5__1_in_rule__Project__Group_5__02397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Project__Group_5__0__Impl2425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_5__1__Impl_in_rule__Project__Group_5__12456 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_rule__Project__Group_5__2_in_rule__Project__Group_5__12459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Project__Group_5__1__Impl2487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_5__2__Impl_in_rule__Project__Group_5__22518 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Project__Group_5__3_in_rule__Project__Group_5__22521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__DeadlinesAssignment_5_2_in_rule__Project__Group_5__2__Impl2548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_5__3__Impl_in_rule__Project__Group_5__32578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_5_3__0_in_rule__Project__Group_5__3__Impl2605 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Project__Group_5_3__0__Impl_in_rule__Project__Group_5_3__02644 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_rule__Project__Group_5_3__1_in_rule__Project__Group_5_3__02647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Project__Group_5_3__0__Impl2675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_5_3__1__Impl_in_rule__Project__Group_5_3__12706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__DeadlinesAssignment_5_3_1_in_rule__Project__Group_5_3__1__Impl2733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_6__0__Impl_in_rule__Project__Group_6__02767 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Project__Group_6__1_in_rule__Project__Group_6__02770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Project__Group_6__0__Impl2798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_6__1__Impl_in_rule__Project__Group_6__12829 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Project__Group_6__2_in_rule__Project__Group_6__12832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Project__Group_6__1__Impl2860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_6__2__Impl_in_rule__Project__Group_6__22891 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Project__Group_6__3_in_rule__Project__Group_6__22894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__StrategiesAssignment_6_2_in_rule__Project__Group_6__2__Impl2921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_6__3__Impl_in_rule__Project__Group_6__32951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_6_3__0_in_rule__Project__Group_6__3__Impl2978 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Project__Group_6_3__0__Impl_in_rule__Project__Group_6_3__03017 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Project__Group_6_3__1_in_rule__Project__Group_6_3__03020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Project__Group_6_3__0__Impl3048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group_6_3__1__Impl_in_rule__Project__Group_6_3__13079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__StrategiesAssignment_6_3_1_in_rule__Project__Group_6_3__1__Impl3106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__0__Impl_in_rule__Majority__Group__03140 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Majority__Group__1_in_rule__Majority__Group__03143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__NameAssignment_0_in_rule__Majority__Group__0__Impl3170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__1__Impl_in_rule__Majority__Group__13200 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Majority__Group__2_in_rule__Majority__Group__13203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Majority__Group__1__Impl3231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__2__Impl_in_rule__Majority__Group__23262 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Majority__Group__3_in_rule__Majority__Group__23265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Majority__Group__2__Impl3293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__3__Impl_in_rule__Majority__Group__33324 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Majority__Group__4_in_rule__Majority__Group__33327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Majority__Group__3__Impl3355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__4__Impl_in_rule__Majority__Group__43386 = new BitSet(new long[]{0x0000000000007000L});
        public static final BitSet FOLLOW_rule__Majority__Group__5_in_rule__Majority__Group__43389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Majority__Group__4__Impl3417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__5__Impl_in_rule__Majority__Group__53448 = new BitSet(new long[]{0x0000001100000000L});
        public static final BitSet FOLLOW_rule__Majority__Group__6_in_rule__Majority__Group__53451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__AppliedToAssignment_5_in_rule__Majority__Group__5__Impl3478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__6__Impl_in_rule__Majority__Group__63508 = new BitSet(new long[]{0x0000001100000000L});
        public static final BitSet FOLLOW_rule__Majority__Group__7_in_rule__Majority__Group__63511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group_6__0_in_rule__Majority__Group__6__Impl3538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__7__Impl_in_rule__Majority__Group__73569 = new BitSet(new long[]{0x00000000000E0000L});
        public static final BitSet FOLLOW_rule__Majority__Group__8_in_rule__Majority__Group__73572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Majority__Group__7__Impl3600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__8__Impl_in_rule__Majority__Group__83631 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Majority__Group__9_in_rule__Majority__Group__83634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__StageAssignment_8_in_rule__Majority__Group__8__Impl3661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__9__Impl_in_rule__Majority__Group__93691 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Majority__Group__10_in_rule__Majority__Group__93694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Majority__Group__9__Impl3722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__10__Impl_in_rule__Majority__Group__103753 = new BitSet(new long[]{0x0000000408000000L});
        public static final BitSet FOLLOW_rule__Majority__Group__11_in_rule__Majority__Group__103756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__PeopleAssignment_10_in_rule__Majority__Group__10__Impl3783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__11__Impl_in_rule__Majority__Group__113813 = new BitSet(new long[]{0x0000000408000000L});
        public static final BitSet FOLLOW_rule__Majority__Group__12_in_rule__Majority__Group__113816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group_11__0_in_rule__Majority__Group__11__Impl3843 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__12__Impl_in_rule__Majority__Group__123874 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_rule__Majority__Group__13_in_rule__Majority__Group__123877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Majority__Group__12__Impl3905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__13__Impl_in_rule__Majority__Group__133936 = new BitSet(new long[]{0x0000004800000000L});
        public static final BitSet FOLLOW_rule__Majority__Group__14_in_rule__Majority__Group__133939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__RangeAssignment_13_in_rule__Majority__Group__13__Impl3966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__14__Impl_in_rule__Majority__Group__143996 = new BitSet(new long[]{0x0000004800000000L});
        public static final BitSet FOLLOW_rule__Majority__Group__15_in_rule__Majority__Group__143999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group_14__0_in_rule__Majority__Group__14__Impl4026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__15__Impl_in_rule__Majority__Group__154057 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Majority__Group__16_in_rule__Majority__Group__154060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Majority__Group__15__Impl4088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__16__Impl_in_rule__Majority__Group__164119 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Majority__Group__17_in_rule__Majority__Group__164122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__DeadlineAssignment_16_in_rule__Majority__Group__16__Impl4149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group__17__Impl_in_rule__Majority__Group__174179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Majority__Group__17__Impl4207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group_6__0__Impl_in_rule__Majority__Group_6__04274 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Majority__Group_6__1_in_rule__Majority__Group_6__04277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Majority__Group_6__0__Impl4305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group_6__1__Impl_in_rule__Majority__Group_6__14336 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__Majority__Group_6__2_in_rule__Majority__Group_6__14339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilter_in_rule__Majority__Group_6__1__Impl4366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group_6__2__Impl_in_rule__Majority__Group_6__24395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Majority__Group_6__2__Impl4423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group_11__0__Impl_in_rule__Majority__Group_11__04460 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Majority__Group_11__1_in_rule__Majority__Group_11__04463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Majority__Group_11__0__Impl4491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group_11__1__Impl_in_rule__Majority__Group_11__14522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__PeopleAssignment_11_1_in_rule__Majority__Group_11__1__Impl4549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group_14__0__Impl_in_rule__Majority__Group_14__04583 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Majority__Group_14__1_in_rule__Majority__Group_14__04586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Majority__Group_14__0__Impl4614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__Group_14__1__Impl_in_rule__Majority__Group_14__14645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Majority__MinVotesAssignment_14_1_in_rule__Majority__Group_14__1__Impl4672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__0__Impl_in_rule__RatioMajority__Group__04706 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__1_in_rule__RatioMajority__Group__04709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__NameAssignment_0_in_rule__RatioMajority__Group__0__Impl4736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__1__Impl_in_rule__RatioMajority__Group__14766 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__2_in_rule__RatioMajority__Group__14769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__RatioMajority__Group__1__Impl4797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__2__Impl_in_rule__RatioMajority__Group__24828 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__3_in_rule__RatioMajority__Group__24831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__RatioMajority__Group__2__Impl4859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__3__Impl_in_rule__RatioMajority__Group__34890 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__4_in_rule__RatioMajority__Group__34893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__RatioMajority__Group__3__Impl4921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__4__Impl_in_rule__RatioMajority__Group__44952 = new BitSet(new long[]{0x0000000000007000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__5_in_rule__RatioMajority__Group__44955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__RatioMajority__Group__4__Impl4983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__5__Impl_in_rule__RatioMajority__Group__55014 = new BitSet(new long[]{0x0000001100000000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__6_in_rule__RatioMajority__Group__55017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Alternatives_5_in_rule__RatioMajority__Group__5__Impl5044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__6__Impl_in_rule__RatioMajority__Group__65074 = new BitSet(new long[]{0x0000001100000000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__7_in_rule__RatioMajority__Group__65077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_6__0_in_rule__RatioMajority__Group__6__Impl5104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__7__Impl_in_rule__RatioMajority__Group__75135 = new BitSet(new long[]{0x00000000000E0000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__8_in_rule__RatioMajority__Group__75138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__RatioMajority__Group__7__Impl5166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__8__Impl_in_rule__RatioMajority__Group__85197 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__9_in_rule__RatioMajority__Group__85200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__StageAssignment_8_in_rule__RatioMajority__Group__8__Impl5227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__9__Impl_in_rule__RatioMajority__Group__95257 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__10_in_rule__RatioMajority__Group__95260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__RatioMajority__Group__9__Impl5288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__10__Impl_in_rule__RatioMajority__Group__105319 = new BitSet(new long[]{0x0000000408000000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__11_in_rule__RatioMajority__Group__105322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__PeopleAssignment_10_in_rule__RatioMajority__Group__10__Impl5349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__11__Impl_in_rule__RatioMajority__Group__115379 = new BitSet(new long[]{0x0000000408000000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__12_in_rule__RatioMajority__Group__115382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_11__0_in_rule__RatioMajority__Group__11__Impl5409 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__12__Impl_in_rule__RatioMajority__Group__125440 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__13_in_rule__RatioMajority__Group__125443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__RatioMajority__Group__12__Impl5471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__13__Impl_in_rule__RatioMajority__Group__135502 = new BitSet(new long[]{0x0000014000000000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__14_in_rule__RatioMajority__Group__135505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__RangeAssignment_13_in_rule__RatioMajority__Group__13__Impl5532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__14__Impl_in_rule__RatioMajority__Group__145562 = new BitSet(new long[]{0x0000014000000000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__15_in_rule__RatioMajority__Group__145565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_14__0_in_rule__RatioMajority__Group__14__Impl5592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__15__Impl_in_rule__RatioMajority__Group__155623 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__16_in_rule__RatioMajority__Group__155626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__RatioMajority__Group__15__Impl5654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__16__Impl_in_rule__RatioMajority__Group__165685 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__17_in_rule__RatioMajority__Group__165688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__RatioAssignment_16_in_rule__RatioMajority__Group__16__Impl5715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__17__Impl_in_rule__RatioMajority__Group__175745 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__18_in_rule__RatioMajority__Group__175748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__RatioMajority__Group__17__Impl5776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__18__Impl_in_rule__RatioMajority__Group__185807 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__19_in_rule__RatioMajority__Group__185810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__DeadlineAssignment_18_in_rule__RatioMajority__Group__18__Impl5837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group__19__Impl_in_rule__RatioMajority__Group__195867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__RatioMajority__Group__19__Impl5895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_6__0__Impl_in_rule__RatioMajority__Group_6__05966 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_6__1_in_rule__RatioMajority__Group_6__05969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__RatioMajority__Group_6__0__Impl5997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_6__1__Impl_in_rule__RatioMajority__Group_6__16028 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_6__2_in_rule__RatioMajority__Group_6__16031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilter_in_rule__RatioMajority__Group_6__1__Impl6058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_6__2__Impl_in_rule__RatioMajority__Group_6__26087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__RatioMajority__Group_6__2__Impl6115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_11__0__Impl_in_rule__RatioMajority__Group_11__06152 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_11__1_in_rule__RatioMajority__Group_11__06155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__RatioMajority__Group_11__0__Impl6183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_11__1__Impl_in_rule__RatioMajority__Group_11__16214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__PeopleAssignment_11_1_in_rule__RatioMajority__Group_11__1__Impl6241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_14__0__Impl_in_rule__RatioMajority__Group_14__06275 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_14__1_in_rule__RatioMajority__Group_14__06278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__RatioMajority__Group_14__0__Impl6306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__Group_14__1__Impl_in_rule__RatioMajority__Group_14__16337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatioMajority__MinVotesAssignment_14_1_in_rule__RatioMajority__Group_14__1__Impl6364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__0__Impl_in_rule__LeaderDriven__Group__06398 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__1_in_rule__LeaderDriven__Group__06401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__NameAssignment_0_in_rule__LeaderDriven__Group__0__Impl6428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__1__Impl_in_rule__LeaderDriven__Group__16458 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__2_in_rule__LeaderDriven__Group__16461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__LeaderDriven__Group__1__Impl6489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__2__Impl_in_rule__LeaderDriven__Group__26520 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__3_in_rule__LeaderDriven__Group__26523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__LeaderDriven__Group__2__Impl6551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__3__Impl_in_rule__LeaderDriven__Group__36582 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__4_in_rule__LeaderDriven__Group__36585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__LeaderDriven__Group__3__Impl6613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__4__Impl_in_rule__LeaderDriven__Group__46644 = new BitSet(new long[]{0x0000000000007000L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__5_in_rule__LeaderDriven__Group__46647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__LeaderDriven__Group__4__Impl6675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__5__Impl_in_rule__LeaderDriven__Group__56706 = new BitSet(new long[]{0x0000001100000000L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__6_in_rule__LeaderDriven__Group__56709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Alternatives_5_in_rule__LeaderDriven__Group__5__Impl6736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__6__Impl_in_rule__LeaderDriven__Group__66766 = new BitSet(new long[]{0x0000001100000000L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__7_in_rule__LeaderDriven__Group__66769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group_6__0_in_rule__LeaderDriven__Group__6__Impl6796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__7__Impl_in_rule__LeaderDriven__Group__76827 = new BitSet(new long[]{0x00000000000E0000L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__8_in_rule__LeaderDriven__Group__76830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__LeaderDriven__Group__7__Impl6858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__8__Impl_in_rule__LeaderDriven__Group__86889 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__9_in_rule__LeaderDriven__Group__86892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__StageAssignment_8_in_rule__LeaderDriven__Group__8__Impl6919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__9__Impl_in_rule__LeaderDriven__Group__96949 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__10_in_rule__LeaderDriven__Group__96952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__LeaderDriven__Group__9__Impl6980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__10__Impl_in_rule__LeaderDriven__Group__107011 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__11_in_rule__LeaderDriven__Group__107014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__DefaultAssignment_10_in_rule__LeaderDriven__Group__10__Impl7041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__11__Impl_in_rule__LeaderDriven__Group__117071 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__12_in_rule__LeaderDriven__Group__117074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__LeaderDriven__Group__11__Impl7102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__12__Impl_in_rule__LeaderDriven__Group__127133 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__13_in_rule__LeaderDriven__Group__127136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__DeadlineAssignment_12_in_rule__LeaderDriven__Group__12__Impl7163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group__13__Impl_in_rule__LeaderDriven__Group__137193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__LeaderDriven__Group__13__Impl7221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group_6__0__Impl_in_rule__LeaderDriven__Group_6__07280 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group_6__1_in_rule__LeaderDriven__Group_6__07283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__LeaderDriven__Group_6__0__Impl7311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group_6__1__Impl_in_rule__LeaderDriven__Group_6__17342 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group_6__2_in_rule__LeaderDriven__Group_6__17345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__FilterAssignment_6_1_in_rule__LeaderDriven__Group_6__1__Impl7372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LeaderDriven__Group_6__2__Impl_in_rule__LeaderDriven__Group_6__27402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__LeaderDriven__Group_6__2__Impl7430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__0__Impl_in_rule__PhasedStrategy__Group__07467 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__1_in_rule__PhasedStrategy__Group__07470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__NameAssignment_0_in_rule__PhasedStrategy__Group__0__Impl7497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__1__Impl_in_rule__PhasedStrategy__Group__17527 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__2_in_rule__PhasedStrategy__Group__17530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__PhasedStrategy__Group__1__Impl7558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__2__Impl_in_rule__PhasedStrategy__Group__27589 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__3_in_rule__PhasedStrategy__Group__27592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__PhasedStrategy__Group__2__Impl7620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__3__Impl_in_rule__PhasedStrategy__Group__37651 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__4_in_rule__PhasedStrategy__Group__37654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__PhasedStrategy__Group__3__Impl7682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__4__Impl_in_rule__PhasedStrategy__Group__47713 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__5_in_rule__PhasedStrategy__Group__47716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__PhasedStrategy__Group__4__Impl7744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__5__Impl_in_rule__PhasedStrategy__Group__57775 = new BitSet(new long[]{0x0000000001000010L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__6_in_rule__PhasedStrategy__Group__57778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__PhasedStrategy__Group__5__Impl7806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__6__Impl_in_rule__PhasedStrategy__Group__67837 = new BitSet(new long[]{0x0000000001000010L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__7_in_rule__PhasedStrategy__Group__67840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__PhasesAssignment_6_in_rule__PhasedStrategy__Group__6__Impl7867 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__7__Impl_in_rule__PhasedStrategy__Group__77898 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__8_in_rule__PhasedStrategy__Group__77901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__PhasedStrategy__Group__7__Impl7929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PhasedStrategy__Group__8__Impl_in_rule__PhasedStrategy__Group__87960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__PhasedStrategy__Group__8__Impl7988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filter__Group__0__Impl_in_rule__Filter__Group__08037 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Filter__Group__1_in_rule__Filter__Group__08040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filter__Group_0__0_in_rule__Filter__Group__0__Impl8067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filter__Group__1__Impl_in_rule__Filter__Group__18097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filter__Group_1__0_in_rule__Filter__Group__1__Impl8124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filter__Group_0__0__Impl_in_rule__Filter__Group_0__08159 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__Filter__Group_0__1_in_rule__Filter__Group_0__08162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Filter__Group_0__0__Impl8189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filter__Group_0__1__Impl_in_rule__Filter__Group_0__18218 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Filter__Group_0__2_in_rule__Filter__Group_0__18221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filter__Alternatives_0_1_in_rule__Filter__Group_0__1__Impl8248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filter__Group_0__2__Impl_in_rule__Filter__Group_0__28278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Filter__Group_0__2__Impl8305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filter__Group_1__0__Impl_in_rule__Filter__Group_1__08340 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Filter__Group_1__1_in_rule__Filter__Group_1__08343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Filter__Group_1__0__Impl8371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filter__Group_1__1__Impl_in_rule__Filter__Group_1__18402 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__Filter__Group_1__2_in_rule__Filter__Group_1__18405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Filter__Group_1__1__Impl8432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filter__Group_1__2__Impl_in_rule__Filter__Group_1__28461 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Filter__Group_1__3_in_rule__Filter__Group_1__28464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filter__Alternatives_1_2_in_rule__Filter__Group_1__2__Impl8491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filter__Group_1__3__Impl_in_rule__Filter__Group_1__38521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Filter__Group_1__3__Impl8548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Timer__Group__0__Impl_in_rule__Timer__Group__08585 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Timer__Group__1_in_rule__Timer__Group__08588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Timer__Group__1__Impl_in_rule__Timer__Group__18646 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Timer__Group__2_in_rule__Timer__Group__18649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Timer__NameAssignment_1_in_rule__Timer__Group__1__Impl8676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Timer__Group__2__Impl_in_rule__Timer__Group__28706 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Timer__Group__3_in_rule__Timer__Group__28709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Timer__Group__2__Impl8737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Timer__Group__3__Impl_in_rule__Timer__Group__38768 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__Timer__Group__4_in_rule__Timer__Group__38771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Timer__TimeStampAssignment_3_in_rule__Timer__Group__3__Impl8798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Timer__Group__4__Impl_in_rule__Timer__Group__48828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Timer__Group__4__Impl8856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WaitForVote__Group__0__Impl_in_rule__WaitForVote__Group__08897 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__WaitForVote__Group__1_in_rule__WaitForVote__Group__08900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WaitForVote__RolesAssignment_0_in_rule__WaitForVote__Group__0__Impl8927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WaitForVote__Group__1__Impl_in_rule__WaitForVote__Group__18957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WaitForVote__Group_1__0_in_rule__WaitForVote__Group__1__Impl8984 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__WaitForVote__Group_1__0__Impl_in_rule__WaitForVote__Group_1__09019 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__WaitForVote__Group_1__1_in_rule__WaitForVote__Group_1__09022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__WaitForVote__Group_1__0__Impl9050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WaitForVote__Group_1__1__Impl_in_rule__WaitForVote__Group_1__19081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WaitForVote__RolesAssignment_1_1_in_rule__WaitForVote__Group_1__1__Impl9108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Project__NameAssignment_29147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_rule__Project__RolesAssignment_4_29178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_rule__Project__RolesAssignment_4_3_19209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeadline_in_rule__Project__DeadlinesAssignment_5_29240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeadline_in_rule__Project__DeadlinesAssignment_5_3_19271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Project__StrategiesAssignment_6_29302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Project__StrategiesAssignment_6_3_19333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Role__NameAssignment9364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Majority__NameAssignment_09395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollaborationType_in_rule__Majority__AppliedToAssignment_59426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStageType_in_rule__Majority__StageAssignment_89457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Majority__PeopleAssignment_109492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Majority__PeopleAssignment_11_19531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRangeType_in_rule__Majority__RangeAssignment_139566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Majority__MinVotesAssignment_14_19597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Majority__DeadlineAssignment_169632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RatioMajority__NameAssignment_09667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStageType_in_rule__RatioMajority__StageAssignment_89698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RatioMajority__PeopleAssignment_109733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RatioMajority__PeopleAssignment_11_19772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRangeType_in_rule__RatioMajority__RangeAssignment_139807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__RatioMajority__MinVotesAssignment_14_19838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__RatioMajority__RatioAssignment_169869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RatioMajority__DeadlineAssignment_189904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__LeaderDriven__NameAssignment_09939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilter_in_rule__LeaderDriven__FilterAssignment_6_19970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStageType_in_rule__LeaderDriven__StageAssignment_810001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__LeaderDriven__DefaultAssignment_1010036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__LeaderDriven__DeadlineAssignment_1210075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PhasedStrategy__NameAssignment_010110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PhasedStrategy__PhasesAssignment_610145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Timer__NameAssignment_110180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Timer__TimeStampAssignment_310211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__OCLCondition__OclExpressionAssignment10242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__WaitForVote__RolesAssignment_010277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__WaitForVote__RolesAssignment_1_110316 = new BitSet(new long[]{0x0000000000000002L});
    }


}