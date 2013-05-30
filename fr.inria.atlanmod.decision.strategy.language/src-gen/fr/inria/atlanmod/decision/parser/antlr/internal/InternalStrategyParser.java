package fr.inria.atlanmod.decision.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.inria.atlanmod.decision.services.StrategyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStrategyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Project'", "'{'", "'Roles'", "':'", "','", "'Deadlines'", "'Strategies'", "'}'", "'Majority'", "'applied to'", "'('", "')'", "'when'", "'people'", "'range'", "'minVotes'", "'deadline'", "'Ratio'", "'Task'", "'Patch'", "'Comment'", "'ratio'", "'LeaderDriven'", "'default'", "'phases'", "'='", "'!='", "'days'", "'TaskReview'", "'PatchReview'", "'Release'", "'Present'", "'Qualified'"
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
    public String getGrammarFileName() { return "../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g"; }



     	private StrategyGrammarAccess grammarAccess;
     	
        public InternalStrategyParser(TokenStream input, StrategyGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Project";	
       	}
       	
       	@Override
       	protected StrategyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProject"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:68:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:69:2: (iv_ruleProject= ruleProject EOF )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:70:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProject_in_entryRuleProject75);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProject85); 

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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:77:1: ruleProject returns [EObject current=null] : ( () otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Roles' otherlv_5= ':' ( (lv_roles_6_0= ruleRole ) ) (otherlv_7= ',' ( (lv_roles_8_0= ruleRole ) ) )* )? (otherlv_9= 'Deadlines' otherlv_10= ':' ( (lv_deadlines_11_0= ruleDeadline ) ) (otherlv_12= ',' ( (lv_deadlines_13_0= ruleDeadline ) ) )* )? (otherlv_14= 'Strategies' otherlv_15= ':' ( (lv_strategies_16_0= ruleStrategy ) ) (otherlv_17= ',' ( (lv_strategies_18_0= ruleStrategy ) ) )* )? otherlv_19= '}' ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_roles_6_0 = null;

        EObject lv_roles_8_0 = null;

        EObject lv_deadlines_11_0 = null;

        EObject lv_deadlines_13_0 = null;

        EObject lv_strategies_16_0 = null;

        EObject lv_strategies_18_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:80:28: ( ( () otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Roles' otherlv_5= ':' ( (lv_roles_6_0= ruleRole ) ) (otherlv_7= ',' ( (lv_roles_8_0= ruleRole ) ) )* )? (otherlv_9= 'Deadlines' otherlv_10= ':' ( (lv_deadlines_11_0= ruleDeadline ) ) (otherlv_12= ',' ( (lv_deadlines_13_0= ruleDeadline ) ) )* )? (otherlv_14= 'Strategies' otherlv_15= ':' ( (lv_strategies_16_0= ruleStrategy ) ) (otherlv_17= ',' ( (lv_strategies_18_0= ruleStrategy ) ) )* )? otherlv_19= '}' ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:81:1: ( () otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Roles' otherlv_5= ':' ( (lv_roles_6_0= ruleRole ) ) (otherlv_7= ',' ( (lv_roles_8_0= ruleRole ) ) )* )? (otherlv_9= 'Deadlines' otherlv_10= ':' ( (lv_deadlines_11_0= ruleDeadline ) ) (otherlv_12= ',' ( (lv_deadlines_13_0= ruleDeadline ) ) )* )? (otherlv_14= 'Strategies' otherlv_15= ':' ( (lv_strategies_16_0= ruleStrategy ) ) (otherlv_17= ',' ( (lv_strategies_18_0= ruleStrategy ) ) )* )? otherlv_19= '}' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:81:1: ( () otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Roles' otherlv_5= ':' ( (lv_roles_6_0= ruleRole ) ) (otherlv_7= ',' ( (lv_roles_8_0= ruleRole ) ) )* )? (otherlv_9= 'Deadlines' otherlv_10= ':' ( (lv_deadlines_11_0= ruleDeadline ) ) (otherlv_12= ',' ( (lv_deadlines_13_0= ruleDeadline ) ) )* )? (otherlv_14= 'Strategies' otherlv_15= ':' ( (lv_strategies_16_0= ruleStrategy ) ) (otherlv_17= ',' ( (lv_strategies_18_0= ruleStrategy ) ) )* )? otherlv_19= '}' )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:81:2: () otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Roles' otherlv_5= ':' ( (lv_roles_6_0= ruleRole ) ) (otherlv_7= ',' ( (lv_roles_8_0= ruleRole ) ) )* )? (otherlv_9= 'Deadlines' otherlv_10= ':' ( (lv_deadlines_11_0= ruleDeadline ) ) (otherlv_12= ',' ( (lv_deadlines_13_0= ruleDeadline ) ) )* )? (otherlv_14= 'Strategies' otherlv_15= ':' ( (lv_strategies_16_0= ruleStrategy ) ) (otherlv_17= ',' ( (lv_strategies_18_0= ruleStrategy ) ) )* )? otherlv_19= '}'
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:81:2: ()
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProjectAccess().getProjectAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleProject131); 

                	newLeafNode(otherlv_1, grammarAccess.getProjectAccess().getProjectKeyword_1());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:91:1: ( (lv_name_2_0= RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:92:1: (lv_name_2_0= RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:92:1: (lv_name_2_0= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:93:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleProject148); 

            			newLeafNode(lv_name_2_0, grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleProject165); 

                	newLeafNode(otherlv_3, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_3());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:113:1: (otherlv_4= 'Roles' otherlv_5= ':' ( (lv_roles_6_0= ruleRole ) ) (otherlv_7= ',' ( (lv_roles_8_0= ruleRole ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:113:3: otherlv_4= 'Roles' otherlv_5= ':' ( (lv_roles_6_0= ruleRole ) ) (otherlv_7= ',' ( (lv_roles_8_0= ruleRole ) ) )*
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProject178); 

                        	newLeafNode(otherlv_4, grammarAccess.getProjectAccess().getRolesKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProject190); 

                        	newLeafNode(otherlv_5, grammarAccess.getProjectAccess().getColonKeyword_4_1());
                        
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:121:1: ( (lv_roles_6_0= ruleRole ) )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:122:1: (lv_roles_6_0= ruleRole )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:122:1: (lv_roles_6_0= ruleRole )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:123:3: lv_roles_6_0= ruleRole
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getRolesRoleParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRole_in_ruleProject211);
                    lv_roles_6_0=ruleRole();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	        }
                           		add(
                           			current, 
                           			"roles",
                            		lv_roles_6_0, 
                            		"Role");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:139:2: (otherlv_7= ',' ( (lv_roles_8_0= ruleRole ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==16) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:139:4: otherlv_7= ',' ( (lv_roles_8_0= ruleRole ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleProject224); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getProjectAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:143:1: ( (lv_roles_8_0= ruleRole ) )
                    	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:144:1: (lv_roles_8_0= ruleRole )
                    	    {
                    	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:144:1: (lv_roles_8_0= ruleRole )
                    	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:145:3: lv_roles_8_0= ruleRole
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProjectAccess().getRolesRoleParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRole_in_ruleProject245);
                    	    lv_roles_8_0=ruleRole();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"roles",
                    	            		lv_roles_8_0, 
                    	            		"Role");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:161:6: (otherlv_9= 'Deadlines' otherlv_10= ':' ( (lv_deadlines_11_0= ruleDeadline ) ) (otherlv_12= ',' ( (lv_deadlines_13_0= ruleDeadline ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:161:8: otherlv_9= 'Deadlines' otherlv_10= ':' ( (lv_deadlines_11_0= ruleDeadline ) ) (otherlv_12= ',' ( (lv_deadlines_13_0= ruleDeadline ) ) )*
                    {
                    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProject262); 

                        	newLeafNode(otherlv_9, grammarAccess.getProjectAccess().getDeadlinesKeyword_5_0());
                        
                    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProject274); 

                        	newLeafNode(otherlv_10, grammarAccess.getProjectAccess().getColonKeyword_5_1());
                        
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:169:1: ( (lv_deadlines_11_0= ruleDeadline ) )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:170:1: (lv_deadlines_11_0= ruleDeadline )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:170:1: (lv_deadlines_11_0= ruleDeadline )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:171:3: lv_deadlines_11_0= ruleDeadline
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getDeadlinesDeadlineParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDeadline_in_ruleProject295);
                    lv_deadlines_11_0=ruleDeadline();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	        }
                           		add(
                           			current, 
                           			"deadlines",
                            		lv_deadlines_11_0, 
                            		"Deadline");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:187:2: (otherlv_12= ',' ( (lv_deadlines_13_0= ruleDeadline ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:187:4: otherlv_12= ',' ( (lv_deadlines_13_0= ruleDeadline ) )
                    	    {
                    	    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleProject308); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getProjectAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:191:1: ( (lv_deadlines_13_0= ruleDeadline ) )
                    	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:192:1: (lv_deadlines_13_0= ruleDeadline )
                    	    {
                    	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:192:1: (lv_deadlines_13_0= ruleDeadline )
                    	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:193:3: lv_deadlines_13_0= ruleDeadline
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProjectAccess().getDeadlinesDeadlineParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeadline_in_ruleProject329);
                    	    lv_deadlines_13_0=ruleDeadline();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"deadlines",
                    	            		lv_deadlines_13_0, 
                    	            		"Deadline");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:209:6: (otherlv_14= 'Strategies' otherlv_15= ':' ( (lv_strategies_16_0= ruleStrategy ) ) (otherlv_17= ',' ( (lv_strategies_18_0= ruleStrategy ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:209:8: otherlv_14= 'Strategies' otherlv_15= ':' ( (lv_strategies_16_0= ruleStrategy ) ) (otherlv_17= ',' ( (lv_strategies_18_0= ruleStrategy ) ) )*
                    {
                    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleProject346); 

                        	newLeafNode(otherlv_14, grammarAccess.getProjectAccess().getStrategiesKeyword_6_0());
                        
                    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProject358); 

                        	newLeafNode(otherlv_15, grammarAccess.getProjectAccess().getColonKeyword_6_1());
                        
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:217:1: ( (lv_strategies_16_0= ruleStrategy ) )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:218:1: (lv_strategies_16_0= ruleStrategy )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:218:1: (lv_strategies_16_0= ruleStrategy )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:219:3: lv_strategies_16_0= ruleStrategy
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getStrategiesStrategyParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleProject379);
                    lv_strategies_16_0=ruleStrategy();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	        }
                           		add(
                           			current, 
                           			"strategies",
                            		lv_strategies_16_0, 
                            		"Strategy");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:235:2: (otherlv_17= ',' ( (lv_strategies_18_0= ruleStrategy ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:235:4: otherlv_17= ',' ( (lv_strategies_18_0= ruleStrategy ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleProject392); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getProjectAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:239:1: ( (lv_strategies_18_0= ruleStrategy ) )
                    	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:240:1: (lv_strategies_18_0= ruleStrategy )
                    	    {
                    	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:240:1: (lv_strategies_18_0= ruleStrategy )
                    	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:241:3: lv_strategies_18_0= ruleStrategy
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProjectAccess().getStrategiesStrategyParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleProject413);
                    	    lv_strategies_18_0=ruleStrategy();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"strategies",
                    	            		lv_strategies_18_0, 
                    	            		"Strategy");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_19=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleProject429); 

                	newLeafNode(otherlv_19, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleStrategy"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:269:1: entryRuleStrategy returns [EObject current=null] : iv_ruleStrategy= ruleStrategy EOF ;
    public final EObject entryRuleStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategy = null;


        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:270:2: (iv_ruleStrategy= ruleStrategy EOF )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:271:2: iv_ruleStrategy= ruleStrategy EOF
            {
             newCompositeNode(grammarAccess.getStrategyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_entryRuleStrategy465);
            iv_ruleStrategy=ruleStrategy();

            state._fsp--;

             current =iv_ruleStrategy; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStrategy475); 

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
    // $ANTLR end "entryRuleStrategy"


    // $ANTLR start "ruleStrategy"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:278:1: ruleStrategy returns [EObject current=null] : (this_Majority_0= ruleMajority | this_RatioMajority_1= ruleRatioMajority | this_LeaderDriven_2= ruleLeaderDriven | this_PhasedStrategy_3= rulePhasedStrategy ) ;
    public final EObject ruleStrategy() throws RecognitionException {
        EObject current = null;

        EObject this_Majority_0 = null;

        EObject this_RatioMajority_1 = null;

        EObject this_LeaderDriven_2 = null;

        EObject this_PhasedStrategy_3 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:281:28: ( (this_Majority_0= ruleMajority | this_RatioMajority_1= ruleRatioMajority | this_LeaderDriven_2= ruleLeaderDriven | this_PhasedStrategy_3= rulePhasedStrategy ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:282:1: (this_Majority_0= ruleMajority | this_RatioMajority_1= ruleRatioMajority | this_LeaderDriven_2= ruleLeaderDriven | this_PhasedStrategy_3= rulePhasedStrategy )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:282:1: (this_Majority_0= ruleMajority | this_RatioMajority_1= ruleRatioMajority | this_LeaderDriven_2= ruleLeaderDriven | this_PhasedStrategy_3= rulePhasedStrategy )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==15) ) {
                    switch ( input.LA(3) ) {
                    case 29:
                        {
                        int LA7_3 = input.LA(4);

                        if ( (LA7_3==13) ) {
                            int LA7_6 = input.LA(5);

                            if ( (LA7_6==36) ) {
                                alt7=4;
                            }
                            else if ( (LA7_6==21) ) {
                                alt7=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 7, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 34:
                        {
                        alt7=3;
                        }
                        break;
                    case 20:
                        {
                        alt7=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:283:5: this_Majority_0= ruleMajority
                    {
                     
                            newCompositeNode(grammarAccess.getStrategyAccess().getMajorityParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMajority_in_ruleStrategy522);
                    this_Majority_0=ruleMajority();

                    state._fsp--;

                     
                            current = this_Majority_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:293:5: this_RatioMajority_1= ruleRatioMajority
                    {
                     
                            newCompositeNode(grammarAccess.getStrategyAccess().getRatioMajorityParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRatioMajority_in_ruleStrategy549);
                    this_RatioMajority_1=ruleRatioMajority();

                    state._fsp--;

                     
                            current = this_RatioMajority_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:303:5: this_LeaderDriven_2= ruleLeaderDriven
                    {
                     
                            newCompositeNode(grammarAccess.getStrategyAccess().getLeaderDrivenParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLeaderDriven_in_ruleStrategy576);
                    this_LeaderDriven_2=ruleLeaderDriven();

                    state._fsp--;

                     
                            current = this_LeaderDriven_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:313:5: this_PhasedStrategy_3= rulePhasedStrategy
                    {
                     
                            newCompositeNode(grammarAccess.getStrategyAccess().getPhasedStrategyParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePhasedStrategy_in_ruleStrategy603);
                    this_PhasedStrategy_3=rulePhasedStrategy();

                    state._fsp--;

                     
                            current = this_PhasedStrategy_3; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleStrategy"


    // $ANTLR start "entryRuleRole"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:329:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:330:2: (iv_ruleRole= ruleRole EOF )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:331:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_entryRuleRole638);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRole648); 

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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:338:1: ruleRole returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:341:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:342:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:342:1: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:343:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:343:1: (lv_name_0_0= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:344:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRole689); 

            			newLeafNode(lv_name_0_0, grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleMajority"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:368:1: entryRuleMajority returns [EObject current=null] : iv_ruleMajority= ruleMajority EOF ;
    public final EObject entryRuleMajority() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMajority = null;


        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:369:2: (iv_ruleMajority= ruleMajority EOF )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:370:2: iv_ruleMajority= ruleMajority EOF
            {
             newCompositeNode(grammarAccess.getMajorityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMajority_in_entryRuleMajority729);
            iv_ruleMajority=ruleMajority();

            state._fsp--;

             current =iv_ruleMajority; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMajority739); 

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
    // $ANTLR end "entryRuleMajority"


    // $ANTLR start "ruleMajority"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:377:1: ruleMajority returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Majority' otherlv_3= '{' otherlv_4= 'applied to' ( (lv_appliedTo_5_0= ruleCollaborationType ) ) (otherlv_6= '(' ruleFilter otherlv_8= ')' )? otherlv_9= 'when' ( (lv_stage_10_0= ruleStageType ) ) otherlv_11= 'people' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= 'range' ( (lv_range_16_0= ruleRangeType ) ) (otherlv_17= 'minVotes' ( (lv_minVotes_18_0= RULE_INT ) ) )? otherlv_19= 'deadline' ( (otherlv_20= RULE_ID ) ) otherlv_21= '}' ) ;
    public final EObject ruleMajority() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token lv_minVotes_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Enumerator lv_appliedTo_5_0 = null;

        Enumerator lv_stage_10_0 = null;

        Enumerator lv_range_16_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:380:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Majority' otherlv_3= '{' otherlv_4= 'applied to' ( (lv_appliedTo_5_0= ruleCollaborationType ) ) (otherlv_6= '(' ruleFilter otherlv_8= ')' )? otherlv_9= 'when' ( (lv_stage_10_0= ruleStageType ) ) otherlv_11= 'people' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= 'range' ( (lv_range_16_0= ruleRangeType ) ) (otherlv_17= 'minVotes' ( (lv_minVotes_18_0= RULE_INT ) ) )? otherlv_19= 'deadline' ( (otherlv_20= RULE_ID ) ) otherlv_21= '}' ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:381:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Majority' otherlv_3= '{' otherlv_4= 'applied to' ( (lv_appliedTo_5_0= ruleCollaborationType ) ) (otherlv_6= '(' ruleFilter otherlv_8= ')' )? otherlv_9= 'when' ( (lv_stage_10_0= ruleStageType ) ) otherlv_11= 'people' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= 'range' ( (lv_range_16_0= ruleRangeType ) ) (otherlv_17= 'minVotes' ( (lv_minVotes_18_0= RULE_INT ) ) )? otherlv_19= 'deadline' ( (otherlv_20= RULE_ID ) ) otherlv_21= '}' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:381:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Majority' otherlv_3= '{' otherlv_4= 'applied to' ( (lv_appliedTo_5_0= ruleCollaborationType ) ) (otherlv_6= '(' ruleFilter otherlv_8= ')' )? otherlv_9= 'when' ( (lv_stage_10_0= ruleStageType ) ) otherlv_11= 'people' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= 'range' ( (lv_range_16_0= ruleRangeType ) ) (otherlv_17= 'minVotes' ( (lv_minVotes_18_0= RULE_INT ) ) )? otherlv_19= 'deadline' ( (otherlv_20= RULE_ID ) ) otherlv_21= '}' )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:381:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Majority' otherlv_3= '{' otherlv_4= 'applied to' ( (lv_appliedTo_5_0= ruleCollaborationType ) ) (otherlv_6= '(' ruleFilter otherlv_8= ')' )? otherlv_9= 'when' ( (lv_stage_10_0= ruleStageType ) ) otherlv_11= 'people' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= 'range' ( (lv_range_16_0= ruleRangeType ) ) (otherlv_17= 'minVotes' ( (lv_minVotes_18_0= RULE_INT ) ) )? otherlv_19= 'deadline' ( (otherlv_20= RULE_ID ) ) otherlv_21= '}'
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:381:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:382:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:382:1: (lv_name_0_0= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:383:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMajority781); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMajorityAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMajorityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMajority798); 

                	newLeafNode(otherlv_1, grammarAccess.getMajorityAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMajority810); 

                	newLeafNode(otherlv_2, grammarAccess.getMajorityAccess().getMajorityKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMajority822); 

                	newLeafNode(otherlv_3, grammarAccess.getMajorityAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMajority834); 

                	newLeafNode(otherlv_4, grammarAccess.getMajorityAccess().getAppliedToKeyword_4());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:415:1: ( (lv_appliedTo_5_0= ruleCollaborationType ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:416:1: (lv_appliedTo_5_0= ruleCollaborationType )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:416:1: (lv_appliedTo_5_0= ruleCollaborationType )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:417:3: lv_appliedTo_5_0= ruleCollaborationType
            {
             
            	        newCompositeNode(grammarAccess.getMajorityAccess().getAppliedToCollaborationTypeEnumRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleCollaborationType_in_ruleMajority855);
            lv_appliedTo_5_0=ruleCollaborationType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMajorityRule());
            	        }
                   		set(
                   			current, 
                   			"appliedTo",
                    		lv_appliedTo_5_0, 
                    		"CollaborationType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:433:2: (otherlv_6= '(' ruleFilter otherlv_8= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:433:4: otherlv_6= '(' ruleFilter otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMajority868); 

                        	newLeafNode(otherlv_6, grammarAccess.getMajorityAccess().getLeftParenthesisKeyword_6_0());
                        
                     
                            newCompositeNode(grammarAccess.getMajorityAccess().getFilterParserRuleCall_6_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFilter_in_ruleMajority884);
                    ruleFilter();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMajority895); 

                        	newLeafNode(otherlv_8, grammarAccess.getMajorityAccess().getRightParenthesisKeyword_6_2());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMajority909); 

                	newLeafNode(otherlv_9, grammarAccess.getMajorityAccess().getWhenKeyword_7());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:453:1: ( (lv_stage_10_0= ruleStageType ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:454:1: (lv_stage_10_0= ruleStageType )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:454:1: (lv_stage_10_0= ruleStageType )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:455:3: lv_stage_10_0= ruleStageType
            {
             
            	        newCompositeNode(grammarAccess.getMajorityAccess().getStageStageTypeEnumRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleStageType_in_ruleMajority930);
            lv_stage_10_0=ruleStageType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMajorityRule());
            	        }
                   		set(
                   			current, 
                   			"stage",
                    		lv_stage_10_0, 
                    		"StageType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMajority942); 

                	newLeafNode(otherlv_11, grammarAccess.getMajorityAccess().getPeopleKeyword_9());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:475:1: ( (otherlv_12= RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:476:1: (otherlv_12= RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:476:1: (otherlv_12= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:477:3: otherlv_12= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMajorityRule());
            	        }
                    
            otherlv_12=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMajority962); 

            		newLeafNode(otherlv_12, grammarAccess.getMajorityAccess().getPeopleRoleCrossReference_10_0()); 
            	

            }


            }

            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:488:2: (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:488:4: otherlv_13= ',' ( (otherlv_14= RULE_ID ) )
            	    {
            	    otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMajority975); 

            	        	newLeafNode(otherlv_13, grammarAccess.getMajorityAccess().getCommaKeyword_11_0());
            	        
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:492:1: ( (otherlv_14= RULE_ID ) )
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:493:1: (otherlv_14= RULE_ID )
            	    {
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:493:1: (otherlv_14= RULE_ID )
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:494:3: otherlv_14= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMajorityRule());
            	    	        }
            	            
            	    otherlv_14=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMajority995); 

            	    		newLeafNode(otherlv_14, grammarAccess.getMajorityAccess().getPeopleRoleCrossReference_11_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_15=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMajority1009); 

                	newLeafNode(otherlv_15, grammarAccess.getMajorityAccess().getRangeKeyword_12());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:509:1: ( (lv_range_16_0= ruleRangeType ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:510:1: (lv_range_16_0= ruleRangeType )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:510:1: (lv_range_16_0= ruleRangeType )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:511:3: lv_range_16_0= ruleRangeType
            {
             
            	        newCompositeNode(grammarAccess.getMajorityAccess().getRangeRangeTypeEnumRuleCall_13_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleRangeType_in_ruleMajority1030);
            lv_range_16_0=ruleRangeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMajorityRule());
            	        }
                   		set(
                   			current, 
                   			"range",
                    		lv_range_16_0, 
                    		"RangeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:527:2: (otherlv_17= 'minVotes' ( (lv_minVotes_18_0= RULE_INT ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:527:4: otherlv_17= 'minVotes' ( (lv_minVotes_18_0= RULE_INT ) )
                    {
                    otherlv_17=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMajority1043); 

                        	newLeafNode(otherlv_17, grammarAccess.getMajorityAccess().getMinVotesKeyword_14_0());
                        
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:531:1: ( (lv_minVotes_18_0= RULE_INT ) )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:532:1: (lv_minVotes_18_0= RULE_INT )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:532:1: (lv_minVotes_18_0= RULE_INT )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:533:3: lv_minVotes_18_0= RULE_INT
                    {
                    lv_minVotes_18_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleMajority1060); 

                    			newLeafNode(lv_minVotes_18_0, grammarAccess.getMajorityAccess().getMinVotesINTTerminalRuleCall_14_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMajorityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"minVotes",
                            		lv_minVotes_18_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMajority1079); 

                	newLeafNode(otherlv_19, grammarAccess.getMajorityAccess().getDeadlineKeyword_15());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:553:1: ( (otherlv_20= RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:554:1: (otherlv_20= RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:554:1: (otherlv_20= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:555:3: otherlv_20= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMajorityRule());
            	        }
                    
            otherlv_20=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMajority1099); 

            		newLeafNode(otherlv_20, grammarAccess.getMajorityAccess().getDeadlineDeadlineCrossReference_16_0()); 
            	

            }


            }

            otherlv_21=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMajority1111); 

                	newLeafNode(otherlv_21, grammarAccess.getMajorityAccess().getRightCurlyBracketKeyword_17());
                

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
    // $ANTLR end "ruleMajority"


    // $ANTLR start "entryRuleRatioMajority"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:578:1: entryRuleRatioMajority returns [EObject current=null] : iv_ruleRatioMajority= ruleRatioMajority EOF ;
    public final EObject entryRuleRatioMajority() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRatioMajority = null;


        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:579:2: (iv_ruleRatioMajority= ruleRatioMajority EOF )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:580:2: iv_ruleRatioMajority= ruleRatioMajority EOF
            {
             newCompositeNode(grammarAccess.getRatioMajorityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRatioMajority_in_entryRuleRatioMajority1147);
            iv_ruleRatioMajority=ruleRatioMajority();

            state._fsp--;

             current =iv_ruleRatioMajority; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRatioMajority1157); 

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
    // $ANTLR end "entryRuleRatioMajority"


    // $ANTLR start "ruleRatioMajority"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:587:1: ruleRatioMajority returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Ratio' otherlv_3= '{' otherlv_4= 'applied to' (otherlv_5= 'Task' | otherlv_6= 'Patch' | otherlv_7= 'Comment' ) (otherlv_8= '(' ruleFilter otherlv_10= ')' )? otherlv_11= 'when' ( (lv_stage_12_0= ruleStageType ) ) otherlv_13= 'people' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= 'range' ( (lv_range_18_0= ruleRangeType ) ) (otherlv_19= 'minVotes' ( (lv_minVotes_20_0= RULE_INT ) ) )? otherlv_21= 'ratio' ( (lv_ratio_22_0= RULE_FLOAT ) ) otherlv_23= 'deadline' ( (otherlv_24= RULE_ID ) ) otherlv_25= '}' ) ;
    public final EObject ruleRatioMajority() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_minVotes_20_0=null;
        Token otherlv_21=null;
        Token lv_ratio_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Enumerator lv_stage_12_0 = null;

        Enumerator lv_range_18_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:590:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Ratio' otherlv_3= '{' otherlv_4= 'applied to' (otherlv_5= 'Task' | otherlv_6= 'Patch' | otherlv_7= 'Comment' ) (otherlv_8= '(' ruleFilter otherlv_10= ')' )? otherlv_11= 'when' ( (lv_stage_12_0= ruleStageType ) ) otherlv_13= 'people' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= 'range' ( (lv_range_18_0= ruleRangeType ) ) (otherlv_19= 'minVotes' ( (lv_minVotes_20_0= RULE_INT ) ) )? otherlv_21= 'ratio' ( (lv_ratio_22_0= RULE_FLOAT ) ) otherlv_23= 'deadline' ( (otherlv_24= RULE_ID ) ) otherlv_25= '}' ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:591:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Ratio' otherlv_3= '{' otherlv_4= 'applied to' (otherlv_5= 'Task' | otherlv_6= 'Patch' | otherlv_7= 'Comment' ) (otherlv_8= '(' ruleFilter otherlv_10= ')' )? otherlv_11= 'when' ( (lv_stage_12_0= ruleStageType ) ) otherlv_13= 'people' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= 'range' ( (lv_range_18_0= ruleRangeType ) ) (otherlv_19= 'minVotes' ( (lv_minVotes_20_0= RULE_INT ) ) )? otherlv_21= 'ratio' ( (lv_ratio_22_0= RULE_FLOAT ) ) otherlv_23= 'deadline' ( (otherlv_24= RULE_ID ) ) otherlv_25= '}' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:591:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Ratio' otherlv_3= '{' otherlv_4= 'applied to' (otherlv_5= 'Task' | otherlv_6= 'Patch' | otherlv_7= 'Comment' ) (otherlv_8= '(' ruleFilter otherlv_10= ')' )? otherlv_11= 'when' ( (lv_stage_12_0= ruleStageType ) ) otherlv_13= 'people' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= 'range' ( (lv_range_18_0= ruleRangeType ) ) (otherlv_19= 'minVotes' ( (lv_minVotes_20_0= RULE_INT ) ) )? otherlv_21= 'ratio' ( (lv_ratio_22_0= RULE_FLOAT ) ) otherlv_23= 'deadline' ( (otherlv_24= RULE_ID ) ) otherlv_25= '}' )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:591:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Ratio' otherlv_3= '{' otherlv_4= 'applied to' (otherlv_5= 'Task' | otherlv_6= 'Patch' | otherlv_7= 'Comment' ) (otherlv_8= '(' ruleFilter otherlv_10= ')' )? otherlv_11= 'when' ( (lv_stage_12_0= ruleStageType ) ) otherlv_13= 'people' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= 'range' ( (lv_range_18_0= ruleRangeType ) ) (otherlv_19= 'minVotes' ( (lv_minVotes_20_0= RULE_INT ) ) )? otherlv_21= 'ratio' ( (lv_ratio_22_0= RULE_FLOAT ) ) otherlv_23= 'deadline' ( (otherlv_24= RULE_ID ) ) otherlv_25= '}'
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:591:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:592:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:592:1: (lv_name_0_0= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:593:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRatioMajority1199); 

            			newLeafNode(lv_name_0_0, grammarAccess.getRatioMajorityAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRatioMajorityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRatioMajority1216); 

                	newLeafNode(otherlv_1, grammarAccess.getRatioMajorityAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleRatioMajority1228); 

                	newLeafNode(otherlv_2, grammarAccess.getRatioMajorityAccess().getRatioKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRatioMajority1240); 

                	newLeafNode(otherlv_3, grammarAccess.getRatioMajorityAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleRatioMajority1252); 

                	newLeafNode(otherlv_4, grammarAccess.getRatioMajorityAccess().getAppliedToKeyword_4());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:625:1: (otherlv_5= 'Task' | otherlv_6= 'Patch' | otherlv_7= 'Comment' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt11=1;
                }
                break;
            case 31:
                {
                alt11=2;
                }
                break;
            case 32:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:625:3: otherlv_5= 'Task'
                    {
                    otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRatioMajority1265); 

                        	newLeafNode(otherlv_5, grammarAccess.getRatioMajorityAccess().getTaskKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:630:7: otherlv_6= 'Patch'
                    {
                    otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRatioMajority1283); 

                        	newLeafNode(otherlv_6, grammarAccess.getRatioMajorityAccess().getPatchKeyword_5_1());
                        

                    }
                    break;
                case 3 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:635:7: otherlv_7= 'Comment'
                    {
                    otherlv_7=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleRatioMajority1301); 

                        	newLeafNode(otherlv_7, grammarAccess.getRatioMajorityAccess().getCommentKeyword_5_2());
                        

                    }
                    break;

            }

            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:639:2: (otherlv_8= '(' ruleFilter otherlv_10= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:639:4: otherlv_8= '(' ruleFilter otherlv_10= ')'
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleRatioMajority1315); 

                        	newLeafNode(otherlv_8, grammarAccess.getRatioMajorityAccess().getLeftParenthesisKeyword_6_0());
                        
                     
                            newCompositeNode(grammarAccess.getRatioMajorityAccess().getFilterParserRuleCall_6_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFilter_in_ruleRatioMajority1331);
                    ruleFilter();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleRatioMajority1342); 

                        	newLeafNode(otherlv_10, grammarAccess.getRatioMajorityAccess().getRightParenthesisKeyword_6_2());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRatioMajority1356); 

                	newLeafNode(otherlv_11, grammarAccess.getRatioMajorityAccess().getWhenKeyword_7());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:659:1: ( (lv_stage_12_0= ruleStageType ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:660:1: (lv_stage_12_0= ruleStageType )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:660:1: (lv_stage_12_0= ruleStageType )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:661:3: lv_stage_12_0= ruleStageType
            {
             
            	        newCompositeNode(grammarAccess.getRatioMajorityAccess().getStageStageTypeEnumRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleStageType_in_ruleRatioMajority1377);
            lv_stage_12_0=ruleStageType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRatioMajorityRule());
            	        }
                   		set(
                   			current, 
                   			"stage",
                    		lv_stage_12_0, 
                    		"StageType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_13=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRatioMajority1389); 

                	newLeafNode(otherlv_13, grammarAccess.getRatioMajorityAccess().getPeopleKeyword_9());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:681:1: ( (otherlv_14= RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:682:1: (otherlv_14= RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:682:1: (otherlv_14= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:683:3: otherlv_14= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRatioMajorityRule());
            	        }
                    
            otherlv_14=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRatioMajority1409); 

            		newLeafNode(otherlv_14, grammarAccess.getRatioMajorityAccess().getPeopleRoleCrossReference_10_0()); 
            	

            }


            }

            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:694:2: (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:694:4: otherlv_15= ',' ( (otherlv_16= RULE_ID ) )
            	    {
            	    otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRatioMajority1422); 

            	        	newLeafNode(otherlv_15, grammarAccess.getRatioMajorityAccess().getCommaKeyword_11_0());
            	        
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:698:1: ( (otherlv_16= RULE_ID ) )
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:699:1: (otherlv_16= RULE_ID )
            	    {
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:699:1: (otherlv_16= RULE_ID )
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:700:3: otherlv_16= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRatioMajorityRule());
            	    	        }
            	            
            	    otherlv_16=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRatioMajority1442); 

            	    		newLeafNode(otherlv_16, grammarAccess.getRatioMajorityAccess().getPeopleRoleCrossReference_11_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_17=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRatioMajority1456); 

                	newLeafNode(otherlv_17, grammarAccess.getRatioMajorityAccess().getRangeKeyword_12());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:715:1: ( (lv_range_18_0= ruleRangeType ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:716:1: (lv_range_18_0= ruleRangeType )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:716:1: (lv_range_18_0= ruleRangeType )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:717:3: lv_range_18_0= ruleRangeType
            {
             
            	        newCompositeNode(grammarAccess.getRatioMajorityAccess().getRangeRangeTypeEnumRuleCall_13_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleRangeType_in_ruleRatioMajority1477);
            lv_range_18_0=ruleRangeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRatioMajorityRule());
            	        }
                   		set(
                   			current, 
                   			"range",
                    		lv_range_18_0, 
                    		"RangeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:733:2: (otherlv_19= 'minVotes' ( (lv_minVotes_20_0= RULE_INT ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:733:4: otherlv_19= 'minVotes' ( (lv_minVotes_20_0= RULE_INT ) )
                    {
                    otherlv_19=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRatioMajority1490); 

                        	newLeafNode(otherlv_19, grammarAccess.getRatioMajorityAccess().getMinVotesKeyword_14_0());
                        
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:737:1: ( (lv_minVotes_20_0= RULE_INT ) )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:738:1: (lv_minVotes_20_0= RULE_INT )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:738:1: (lv_minVotes_20_0= RULE_INT )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:739:3: lv_minVotes_20_0= RULE_INT
                    {
                    lv_minVotes_20_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleRatioMajority1507); 

                    			newLeafNode(lv_minVotes_20_0, grammarAccess.getRatioMajorityAccess().getMinVotesINTTerminalRuleCall_14_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRatioMajorityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"minVotes",
                            		lv_minVotes_20_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleRatioMajority1526); 

                	newLeafNode(otherlv_21, grammarAccess.getRatioMajorityAccess().getRatioKeyword_15());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:759:1: ( (lv_ratio_22_0= RULE_FLOAT ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:760:1: (lv_ratio_22_0= RULE_FLOAT )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:760:1: (lv_ratio_22_0= RULE_FLOAT )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:761:3: lv_ratio_22_0= RULE_FLOAT
            {
            lv_ratio_22_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleRatioMajority1543); 

            			newLeafNode(lv_ratio_22_0, grammarAccess.getRatioMajorityAccess().getRatioFLOATTerminalRuleCall_16_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRatioMajorityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ratio",
                    		lv_ratio_22_0, 
                    		"FLOAT");
            	    

            }


            }

            otherlv_23=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRatioMajority1560); 

                	newLeafNode(otherlv_23, grammarAccess.getRatioMajorityAccess().getDeadlineKeyword_17());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:781:1: ( (otherlv_24= RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:782:1: (otherlv_24= RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:782:1: (otherlv_24= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:783:3: otherlv_24= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRatioMajorityRule());
            	        }
                    
            otherlv_24=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRatioMajority1580); 

            		newLeafNode(otherlv_24, grammarAccess.getRatioMajorityAccess().getDeadlineDeadlineCrossReference_18_0()); 
            	

            }


            }

            otherlv_25=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRatioMajority1592); 

                	newLeafNode(otherlv_25, grammarAccess.getRatioMajorityAccess().getRightCurlyBracketKeyword_19());
                

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
    // $ANTLR end "ruleRatioMajority"


    // $ANTLR start "entryRuleLeaderDriven"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:806:1: entryRuleLeaderDriven returns [EObject current=null] : iv_ruleLeaderDriven= ruleLeaderDriven EOF ;
    public final EObject entryRuleLeaderDriven() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeaderDriven = null;


        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:807:2: (iv_ruleLeaderDriven= ruleLeaderDriven EOF )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:808:2: iv_ruleLeaderDriven= ruleLeaderDriven EOF
            {
             newCompositeNode(grammarAccess.getLeaderDrivenRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLeaderDriven_in_entryRuleLeaderDriven1628);
            iv_ruleLeaderDriven=ruleLeaderDriven();

            state._fsp--;

             current =iv_ruleLeaderDriven; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLeaderDriven1638); 

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
    // $ANTLR end "entryRuleLeaderDriven"


    // $ANTLR start "ruleLeaderDriven"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:815:1: ruleLeaderDriven returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'LeaderDriven' otherlv_3= '{' otherlv_4= 'applied to' (otherlv_5= 'Task' | otherlv_6= 'Patch' | otherlv_7= 'Comment' ) (otherlv_8= '(' ( (lv_filter_9_0= ruleFilter ) ) otherlv_10= ')' )? otherlv_11= 'when' ( (lv_stage_12_0= ruleStageType ) ) otherlv_13= 'default' ( (otherlv_14= RULE_ID ) ) otherlv_15= 'deadline' ( (otherlv_16= RULE_ID ) ) otherlv_17= '}' ) ;
    public final EObject ruleLeaderDriven() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_filter_9_0 = null;

        Enumerator lv_stage_12_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:818:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'LeaderDriven' otherlv_3= '{' otherlv_4= 'applied to' (otherlv_5= 'Task' | otherlv_6= 'Patch' | otherlv_7= 'Comment' ) (otherlv_8= '(' ( (lv_filter_9_0= ruleFilter ) ) otherlv_10= ')' )? otherlv_11= 'when' ( (lv_stage_12_0= ruleStageType ) ) otherlv_13= 'default' ( (otherlv_14= RULE_ID ) ) otherlv_15= 'deadline' ( (otherlv_16= RULE_ID ) ) otherlv_17= '}' ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:819:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'LeaderDriven' otherlv_3= '{' otherlv_4= 'applied to' (otherlv_5= 'Task' | otherlv_6= 'Patch' | otherlv_7= 'Comment' ) (otherlv_8= '(' ( (lv_filter_9_0= ruleFilter ) ) otherlv_10= ')' )? otherlv_11= 'when' ( (lv_stage_12_0= ruleStageType ) ) otherlv_13= 'default' ( (otherlv_14= RULE_ID ) ) otherlv_15= 'deadline' ( (otherlv_16= RULE_ID ) ) otherlv_17= '}' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:819:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'LeaderDriven' otherlv_3= '{' otherlv_4= 'applied to' (otherlv_5= 'Task' | otherlv_6= 'Patch' | otherlv_7= 'Comment' ) (otherlv_8= '(' ( (lv_filter_9_0= ruleFilter ) ) otherlv_10= ')' )? otherlv_11= 'when' ( (lv_stage_12_0= ruleStageType ) ) otherlv_13= 'default' ( (otherlv_14= RULE_ID ) ) otherlv_15= 'deadline' ( (otherlv_16= RULE_ID ) ) otherlv_17= '}' )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:819:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'LeaderDriven' otherlv_3= '{' otherlv_4= 'applied to' (otherlv_5= 'Task' | otherlv_6= 'Patch' | otherlv_7= 'Comment' ) (otherlv_8= '(' ( (lv_filter_9_0= ruleFilter ) ) otherlv_10= ')' )? otherlv_11= 'when' ( (lv_stage_12_0= ruleStageType ) ) otherlv_13= 'default' ( (otherlv_14= RULE_ID ) ) otherlv_15= 'deadline' ( (otherlv_16= RULE_ID ) ) otherlv_17= '}'
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:819:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:820:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:820:1: (lv_name_0_0= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:821:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLeaderDriven1680); 

            			newLeafNode(lv_name_0_0, grammarAccess.getLeaderDrivenAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLeaderDrivenRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLeaderDriven1697); 

                	newLeafNode(otherlv_1, grammarAccess.getLeaderDrivenAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleLeaderDriven1709); 

                	newLeafNode(otherlv_2, grammarAccess.getLeaderDrivenAccess().getLeaderDrivenKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleLeaderDriven1721); 

                	newLeafNode(otherlv_3, grammarAccess.getLeaderDrivenAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleLeaderDriven1733); 

                	newLeafNode(otherlv_4, grammarAccess.getLeaderDrivenAccess().getAppliedToKeyword_4());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:853:1: (otherlv_5= 'Task' | otherlv_6= 'Patch' | otherlv_7= 'Comment' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt15=1;
                }
                break;
            case 31:
                {
                alt15=2;
                }
                break;
            case 32:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:853:3: otherlv_5= 'Task'
                    {
                    otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleLeaderDriven1746); 

                        	newLeafNode(otherlv_5, grammarAccess.getLeaderDrivenAccess().getTaskKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:858:7: otherlv_6= 'Patch'
                    {
                    otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleLeaderDriven1764); 

                        	newLeafNode(otherlv_6, grammarAccess.getLeaderDrivenAccess().getPatchKeyword_5_1());
                        

                    }
                    break;
                case 3 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:863:7: otherlv_7= 'Comment'
                    {
                    otherlv_7=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleLeaderDriven1782); 

                        	newLeafNode(otherlv_7, grammarAccess.getLeaderDrivenAccess().getCommentKeyword_5_2());
                        

                    }
                    break;

            }

            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:867:2: (otherlv_8= '(' ( (lv_filter_9_0= ruleFilter ) ) otherlv_10= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:867:4: otherlv_8= '(' ( (lv_filter_9_0= ruleFilter ) ) otherlv_10= ')'
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleLeaderDriven1796); 

                        	newLeafNode(otherlv_8, grammarAccess.getLeaderDrivenAccess().getLeftParenthesisKeyword_6_0());
                        
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:871:1: ( (lv_filter_9_0= ruleFilter ) )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:872:1: (lv_filter_9_0= ruleFilter )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:872:1: (lv_filter_9_0= ruleFilter )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:873:3: lv_filter_9_0= ruleFilter
                    {
                     
                    	        newCompositeNode(grammarAccess.getLeaderDrivenAccess().getFilterFilterParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFilter_in_ruleLeaderDriven1817);
                    lv_filter_9_0=ruleFilter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLeaderDrivenRule());
                    	        }
                           		set(
                           			current, 
                           			"filter",
                            		lv_filter_9_0, 
                            		"Filter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleLeaderDriven1829); 

                        	newLeafNode(otherlv_10, grammarAccess.getLeaderDrivenAccess().getRightParenthesisKeyword_6_2());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleLeaderDriven1843); 

                	newLeafNode(otherlv_11, grammarAccess.getLeaderDrivenAccess().getWhenKeyword_7());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:897:1: ( (lv_stage_12_0= ruleStageType ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:898:1: (lv_stage_12_0= ruleStageType )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:898:1: (lv_stage_12_0= ruleStageType )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:899:3: lv_stage_12_0= ruleStageType
            {
             
            	        newCompositeNode(grammarAccess.getLeaderDrivenAccess().getStageStageTypeEnumRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleStageType_in_ruleLeaderDriven1864);
            lv_stage_12_0=ruleStageType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLeaderDrivenRule());
            	        }
                   		set(
                   			current, 
                   			"stage",
                    		lv_stage_12_0, 
                    		"StageType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_13=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleLeaderDriven1876); 

                	newLeafNode(otherlv_13, grammarAccess.getLeaderDrivenAccess().getDefaultKeyword_9());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:919:1: ( (otherlv_14= RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:920:1: (otherlv_14= RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:920:1: (otherlv_14= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:921:3: otherlv_14= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLeaderDrivenRule());
            	        }
                    
            otherlv_14=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLeaderDriven1896); 

            		newLeafNode(otherlv_14, grammarAccess.getLeaderDrivenAccess().getDefaultStrategyCrossReference_10_0()); 
            	

            }


            }

            otherlv_15=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleLeaderDriven1908); 

                	newLeafNode(otherlv_15, grammarAccess.getLeaderDrivenAccess().getDeadlineKeyword_11());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:936:1: ( (otherlv_16= RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:937:1: (otherlv_16= RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:937:1: (otherlv_16= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:938:3: otherlv_16= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLeaderDrivenRule());
            	        }
                    
            otherlv_16=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLeaderDriven1928); 

            		newLeafNode(otherlv_16, grammarAccess.getLeaderDrivenAccess().getDeadlineDeadlineCrossReference_12_0()); 
            	

            }


            }

            otherlv_17=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLeaderDriven1940); 

                	newLeafNode(otherlv_17, grammarAccess.getLeaderDrivenAccess().getRightCurlyBracketKeyword_13());
                

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
    // $ANTLR end "ruleLeaderDriven"


    // $ANTLR start "entryRulePhasedStrategy"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:961:1: entryRulePhasedStrategy returns [EObject current=null] : iv_rulePhasedStrategy= rulePhasedStrategy EOF ;
    public final EObject entryRulePhasedStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhasedStrategy = null;


        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:962:2: (iv_rulePhasedStrategy= rulePhasedStrategy EOF )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:963:2: iv_rulePhasedStrategy= rulePhasedStrategy EOF
            {
             newCompositeNode(grammarAccess.getPhasedStrategyRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePhasedStrategy_in_entryRulePhasedStrategy1976);
            iv_rulePhasedStrategy=rulePhasedStrategy();

            state._fsp--;

             current =iv_rulePhasedStrategy; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePhasedStrategy1986); 

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
    // $ANTLR end "entryRulePhasedStrategy"


    // $ANTLR start "rulePhasedStrategy"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:970:1: rulePhasedStrategy returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Ratio' otherlv_3= '{' otherlv_4= 'phases' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject rulePhasedStrategy() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:973:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Ratio' otherlv_3= '{' otherlv_4= 'phases' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:974:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Ratio' otherlv_3= '{' otherlv_4= 'phases' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:974:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Ratio' otherlv_3= '{' otherlv_4= 'phases' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' otherlv_8= '}' )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:974:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Ratio' otherlv_3= '{' otherlv_4= 'phases' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' otherlv_8= '}'
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:974:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:975:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:975:1: (lv_name_0_0= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:976:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePhasedStrategy2028); 

            			newLeafNode(lv_name_0_0, grammarAccess.getPhasedStrategyAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPhasedStrategyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePhasedStrategy2045); 

                	newLeafNode(otherlv_1, grammarAccess.getPhasedStrategyAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_rulePhasedStrategy2057); 

                	newLeafNode(otherlv_2, grammarAccess.getPhasedStrategyAccess().getRatioKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePhasedStrategy2069); 

                	newLeafNode(otherlv_3, grammarAccess.getPhasedStrategyAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_36_in_rulePhasedStrategy2081); 

                	newLeafNode(otherlv_4, grammarAccess.getPhasedStrategyAccess().getPhasesKeyword_4());
                
            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePhasedStrategy2093); 

                	newLeafNode(otherlv_5, grammarAccess.getPhasedStrategyAccess().getLeftCurlyBracketKeyword_5());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1012:1: ( (otherlv_6= RULE_ID ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1013:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1013:1: (otherlv_6= RULE_ID )
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1014:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPhasedStrategyRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePhasedStrategy2113); 

            	    		newLeafNode(otherlv_6, grammarAccess.getPhasedStrategyAccess().getPhasesStrategyCrossReference_6_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePhasedStrategy2126); 

                	newLeafNode(otherlv_7, grammarAccess.getPhasedStrategyAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePhasedStrategy2138); 

                	newLeafNode(otherlv_8, grammarAccess.getPhasedStrategyAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "rulePhasedStrategy"


    // $ANTLR start "entryRuleFilter"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1041:1: entryRuleFilter returns [String current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final String entryRuleFilter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFilter = null;


        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1042:2: (iv_ruleFilter= ruleFilter EOF )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1043:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilter_in_entryRuleFilter2175);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFilter2186); 

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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1050:1: ruleFilter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID (kw= '=' | kw= '!=' ) this_ID_3= RULE_ID ) (kw= ',' this_ID_5= RULE_ID (kw= '=' | kw= '!=' ) this_ID_8= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleFilter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_3=null;
        Token this_ID_5=null;
        Token this_ID_8=null;

         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1053:28: ( ( (this_ID_0= RULE_ID (kw= '=' | kw= '!=' ) this_ID_3= RULE_ID ) (kw= ',' this_ID_5= RULE_ID (kw= '=' | kw= '!=' ) this_ID_8= RULE_ID )? ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1054:1: ( (this_ID_0= RULE_ID (kw= '=' | kw= '!=' ) this_ID_3= RULE_ID ) (kw= ',' this_ID_5= RULE_ID (kw= '=' | kw= '!=' ) this_ID_8= RULE_ID )? )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1054:1: ( (this_ID_0= RULE_ID (kw= '=' | kw= '!=' ) this_ID_3= RULE_ID ) (kw= ',' this_ID_5= RULE_ID (kw= '=' | kw= '!=' ) this_ID_8= RULE_ID )? )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1054:2: (this_ID_0= RULE_ID (kw= '=' | kw= '!=' ) this_ID_3= RULE_ID ) (kw= ',' this_ID_5= RULE_ID (kw= '=' | kw= '!=' ) this_ID_8= RULE_ID )?
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1054:2: (this_ID_0= RULE_ID (kw= '=' | kw= '!=' ) this_ID_3= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1054:7: this_ID_0= RULE_ID (kw= '=' | kw= '!=' ) this_ID_3= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFilter2227); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFilterAccess().getIDTerminalRuleCall_0_0()); 
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1061:1: (kw= '=' | kw= '!=' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            else if ( (LA18_0==38) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1062:2: kw= '='
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleFilter2246); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFilterAccess().getEqualsSignKeyword_0_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1069:2: kw= '!='
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleFilter2265); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFilterAccess().getExclamationMarkEqualsSignKeyword_0_1_1()); 
                        

                    }
                    break;

            }

            this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFilter2281); 

            		current.merge(this_ID_3);
                
             
                newLeafNode(this_ID_3, grammarAccess.getFilterAccess().getIDTerminalRuleCall_0_2()); 
                

            }

            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1081:2: (kw= ',' this_ID_5= RULE_ID (kw= '=' | kw= '!=' ) this_ID_8= RULE_ID )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1082:2: kw= ',' this_ID_5= RULE_ID (kw= '=' | kw= '!=' ) this_ID_8= RULE_ID
                    {
                    kw=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFilter2301); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFilterAccess().getCommaKeyword_1_0()); 
                        
                    this_ID_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFilter2316); 

                    		current.merge(this_ID_5);
                        
                     
                        newLeafNode(this_ID_5, grammarAccess.getFilterAccess().getIDTerminalRuleCall_1_1()); 
                        
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1094:1: (kw= '=' | kw= '!=' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==37) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==38) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1095:2: kw= '='
                            {
                            kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleFilter2335); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getFilterAccess().getEqualsSignKeyword_1_2_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1102:2: kw= '!='
                            {
                            kw=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleFilter2354); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getFilterAccess().getExclamationMarkEqualsSignKeyword_1_2_1()); 
                                

                            }
                            break;

                    }

                    this_ID_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFilter2370); 

                    		current.merge(this_ID_8);
                        
                     
                        newLeafNode(this_ID_8, grammarAccess.getFilterAccess().getIDTerminalRuleCall_1_3()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleDeadline"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1122:1: entryRuleDeadline returns [EObject current=null] : iv_ruleDeadline= ruleDeadline EOF ;
    public final EObject entryRuleDeadline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeadline = null;


        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1123:2: (iv_ruleDeadline= ruleDeadline EOF )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1124:2: iv_ruleDeadline= ruleDeadline EOF
            {
             newCompositeNode(grammarAccess.getDeadlineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeadline_in_entryRuleDeadline2417);
            iv_ruleDeadline=ruleDeadline();

            state._fsp--;

             current =iv_ruleDeadline; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeadline2427); 

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
    // $ANTLR end "entryRuleDeadline"


    // $ANTLR start "ruleDeadline"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1131:1: ruleDeadline returns [EObject current=null] : (this_Timer_0= ruleTimer | this_WaitForVote_1= ruleWaitForVote | this_OCLCondition_2= ruleOCLCondition ) ;
    public final EObject ruleDeadline() throws RecognitionException {
        EObject current = null;

        EObject this_Timer_0 = null;

        EObject this_WaitForVote_1 = null;

        EObject this_OCLCondition_2 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1134:28: ( (this_Timer_0= ruleTimer | this_WaitForVote_1= ruleWaitForVote | this_OCLCondition_2= ruleOCLCondition ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1135:1: (this_Timer_0= ruleTimer | this_WaitForVote_1= ruleWaitForVote | this_OCLCondition_2= ruleOCLCondition )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1135:1: (this_Timer_0= ruleTimer | this_WaitForVote_1= ruleWaitForVote | this_OCLCondition_2= ruleOCLCondition )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==EOF||LA21_1==16||(LA21_1>=18 && LA21_1<=19)) ) {
                    alt21=2;
                }
                else if ( (LA21_1==15) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA21_0==RULE_STRING) ) {
                alt21=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1136:5: this_Timer_0= ruleTimer
                    {
                     
                            newCompositeNode(grammarAccess.getDeadlineAccess().getTimerParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTimer_in_ruleDeadline2474);
                    this_Timer_0=ruleTimer();

                    state._fsp--;

                     
                            current = this_Timer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1146:5: this_WaitForVote_1= ruleWaitForVote
                    {
                     
                            newCompositeNode(grammarAccess.getDeadlineAccess().getWaitForVoteParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWaitForVote_in_ruleDeadline2501);
                    this_WaitForVote_1=ruleWaitForVote();

                    state._fsp--;

                     
                            current = this_WaitForVote_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1156:5: this_OCLCondition_2= ruleOCLCondition
                    {
                     
                            newCompositeNode(grammarAccess.getDeadlineAccess().getOCLConditionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOCLCondition_in_ruleDeadline2528);
                    this_OCLCondition_2=ruleOCLCondition();

                    state._fsp--;

                     
                            current = this_OCLCondition_2; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleDeadline"


    // $ANTLR start "entryRuleTimer"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1172:1: entryRuleTimer returns [EObject current=null] : iv_ruleTimer= ruleTimer EOF ;
    public final EObject entryRuleTimer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimer = null;


        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1173:2: (iv_ruleTimer= ruleTimer EOF )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1174:2: iv_ruleTimer= ruleTimer EOF
            {
             newCompositeNode(grammarAccess.getTimerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTimer_in_entryRuleTimer2563);
            iv_ruleTimer=ruleTimer();

            state._fsp--;

             current =iv_ruleTimer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTimer2573); 

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
    // $ANTLR end "entryRuleTimer"


    // $ANTLR start "ruleTimer"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1181:1: ruleTimer returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_timeStamp_3_0= RULE_INT ) ) otherlv_4= 'days' ) ;
    public final EObject ruleTimer() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_timeStamp_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1184:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_timeStamp_3_0= RULE_INT ) ) otherlv_4= 'days' ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1185:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_timeStamp_3_0= RULE_INT ) ) otherlv_4= 'days' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1185:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_timeStamp_3_0= RULE_INT ) ) otherlv_4= 'days' )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1185:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_timeStamp_3_0= RULE_INT ) ) otherlv_4= 'days'
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1185:2: ()
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1186:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTimerAccess().getTimerAction_0(),
                        current);
                

            }

            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1191:2: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1192:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1192:1: (lv_name_1_0= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1193:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTimer2624); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTimerAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTimerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTimer2641); 

                	newLeafNode(otherlv_2, grammarAccess.getTimerAccess().getColonKeyword_2());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1213:1: ( (lv_timeStamp_3_0= RULE_INT ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1214:1: (lv_timeStamp_3_0= RULE_INT )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1214:1: (lv_timeStamp_3_0= RULE_INT )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1215:3: lv_timeStamp_3_0= RULE_INT
            {
            lv_timeStamp_3_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleTimer2658); 

            			newLeafNode(lv_timeStamp_3_0, grammarAccess.getTimerAccess().getTimeStampINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTimerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"timeStamp",
                    		lv_timeStamp_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleTimer2675); 

                	newLeafNode(otherlv_4, grammarAccess.getTimerAccess().getDaysKeyword_4());
                

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
    // $ANTLR end "ruleTimer"


    // $ANTLR start "entryRuleOCLCondition"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1243:1: entryRuleOCLCondition returns [EObject current=null] : iv_ruleOCLCondition= ruleOCLCondition EOF ;
    public final EObject entryRuleOCLCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOCLCondition = null;


        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1244:2: (iv_ruleOCLCondition= ruleOCLCondition EOF )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1245:2: iv_ruleOCLCondition= ruleOCLCondition EOF
            {
             newCompositeNode(grammarAccess.getOCLConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOCLCondition_in_entryRuleOCLCondition2711);
            iv_ruleOCLCondition=ruleOCLCondition();

            state._fsp--;

             current =iv_ruleOCLCondition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOCLCondition2721); 

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
    // $ANTLR end "entryRuleOCLCondition"


    // $ANTLR start "ruleOCLCondition"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1252:1: ruleOCLCondition returns [EObject current=null] : ( (lv_oclExpression_0_0= RULE_STRING ) ) ;
    public final EObject ruleOCLCondition() throws RecognitionException {
        EObject current = null;

        Token lv_oclExpression_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1255:28: ( ( (lv_oclExpression_0_0= RULE_STRING ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1256:1: ( (lv_oclExpression_0_0= RULE_STRING ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1256:1: ( (lv_oclExpression_0_0= RULE_STRING ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1257:1: (lv_oclExpression_0_0= RULE_STRING )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1257:1: (lv_oclExpression_0_0= RULE_STRING )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1258:3: lv_oclExpression_0_0= RULE_STRING
            {
            lv_oclExpression_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleOCLCondition2762); 

            			newLeafNode(lv_oclExpression_0_0, grammarAccess.getOCLConditionAccess().getOclExpressionSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOCLConditionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"oclExpression",
                    		lv_oclExpression_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleOCLCondition"


    // $ANTLR start "entryRuleWaitForVote"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1282:1: entryRuleWaitForVote returns [EObject current=null] : iv_ruleWaitForVote= ruleWaitForVote EOF ;
    public final EObject entryRuleWaitForVote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWaitForVote = null;


        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1283:2: (iv_ruleWaitForVote= ruleWaitForVote EOF )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1284:2: iv_ruleWaitForVote= ruleWaitForVote EOF
            {
             newCompositeNode(grammarAccess.getWaitForVoteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWaitForVote_in_entryRuleWaitForVote2802);
            iv_ruleWaitForVote=ruleWaitForVote();

            state._fsp--;

             current =iv_ruleWaitForVote; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWaitForVote2812); 

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
    // $ANTLR end "entryRuleWaitForVote"


    // $ANTLR start "ruleWaitForVote"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1291:1: ruleWaitForVote returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleWaitForVote() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1294:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1295:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1295:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1295:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1295:2: ( (otherlv_0= RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1296:1: (otherlv_0= RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1296:1: (otherlv_0= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1297:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWaitForVoteRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleWaitForVote2857); 

            		newLeafNode(otherlv_0, grammarAccess.getWaitForVoteAccess().getRolesRoleCrossReference_0_0()); 
            	

            }


            }

            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1308:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==16) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==RULE_ID) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1308:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleWaitForVote2870); 

            	        	newLeafNode(otherlv_1, grammarAccess.getWaitForVoteAccess().getCommaKeyword_1_0());
            	        
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1312:1: ( (otherlv_2= RULE_ID ) )
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1313:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1313:1: (otherlv_2= RULE_ID )
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1314:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getWaitForVoteRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleWaitForVote2890); 

            	    		newLeafNode(otherlv_2, grammarAccess.getWaitForVoteAccess().getRolesRoleCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


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
    // $ANTLR end "ruleWaitForVote"


    // $ANTLR start "ruleCollaborationType"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1333:1: ruleCollaborationType returns [Enumerator current=null] : ( (enumLiteral_0= 'Task' ) | (enumLiteral_1= 'Patch' ) | (enumLiteral_2= 'Comment' ) ) ;
    public final Enumerator ruleCollaborationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1335:28: ( ( (enumLiteral_0= 'Task' ) | (enumLiteral_1= 'Patch' ) | (enumLiteral_2= 'Comment' ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1336:1: ( (enumLiteral_0= 'Task' ) | (enumLiteral_1= 'Patch' ) | (enumLiteral_2= 'Comment' ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1336:1: ( (enumLiteral_0= 'Task' ) | (enumLiteral_1= 'Patch' ) | (enumLiteral_2= 'Comment' ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt23=1;
                }
                break;
            case 31:
                {
                alt23=2;
                }
                break;
            case 32:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1336:2: (enumLiteral_0= 'Task' )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1336:2: (enumLiteral_0= 'Task' )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1336:4: enumLiteral_0= 'Task'
                    {
                    enumLiteral_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCollaborationType2942); 

                            current = grammarAccess.getCollaborationTypeAccess().getTASKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCollaborationTypeAccess().getTASKEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1342:6: (enumLiteral_1= 'Patch' )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1342:6: (enumLiteral_1= 'Patch' )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1342:8: enumLiteral_1= 'Patch'
                    {
                    enumLiteral_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCollaborationType2959); 

                            current = grammarAccess.getCollaborationTypeAccess().getPATCHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCollaborationTypeAccess().getPATCHEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1348:6: (enumLiteral_2= 'Comment' )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1348:6: (enumLiteral_2= 'Comment' )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1348:8: enumLiteral_2= 'Comment'
                    {
                    enumLiteral_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleCollaborationType2976); 

                            current = grammarAccess.getCollaborationTypeAccess().getCOMMENTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCollaborationTypeAccess().getCOMMENTEnumLiteralDeclaration_2()); 
                        

                    }


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
    // $ANTLR end "ruleCollaborationType"


    // $ANTLR start "ruleStageType"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1358:1: ruleStageType returns [Enumerator current=null] : ( (enumLiteral_0= 'TaskReview' ) | (enumLiteral_1= 'PatchReview' ) | (enumLiteral_2= 'Release' ) ) ;
    public final Enumerator ruleStageType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1360:28: ( ( (enumLiteral_0= 'TaskReview' ) | (enumLiteral_1= 'PatchReview' ) | (enumLiteral_2= 'Release' ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1361:1: ( (enumLiteral_0= 'TaskReview' ) | (enumLiteral_1= 'PatchReview' ) | (enumLiteral_2= 'Release' ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1361:1: ( (enumLiteral_0= 'TaskReview' ) | (enumLiteral_1= 'PatchReview' ) | (enumLiteral_2= 'Release' ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt24=1;
                }
                break;
            case 41:
                {
                alt24=2;
                }
                break;
            case 42:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1361:2: (enumLiteral_0= 'TaskReview' )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1361:2: (enumLiteral_0= 'TaskReview' )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1361:4: enumLiteral_0= 'TaskReview'
                    {
                    enumLiteral_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleStageType3021); 

                            current = grammarAccess.getStageTypeAccess().getTASK_REVIEWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getStageTypeAccess().getTASK_REVIEWEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1367:6: (enumLiteral_1= 'PatchReview' )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1367:6: (enumLiteral_1= 'PatchReview' )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1367:8: enumLiteral_1= 'PatchReview'
                    {
                    enumLiteral_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleStageType3038); 

                            current = grammarAccess.getStageTypeAccess().getPATCH_REVIEWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getStageTypeAccess().getPATCH_REVIEWEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1373:6: (enumLiteral_2= 'Release' )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1373:6: (enumLiteral_2= 'Release' )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1373:8: enumLiteral_2= 'Release'
                    {
                    enumLiteral_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleStageType3055); 

                            current = grammarAccess.getStageTypeAccess().getRELEASEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getStageTypeAccess().getRELEASEEnumLiteralDeclaration_2()); 
                        

                    }


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
    // $ANTLR end "ruleStageType"


    // $ANTLR start "ruleRangeType"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1383:1: ruleRangeType returns [Enumerator current=null] : ( (enumLiteral_0= 'Present' ) | (enumLiteral_1= 'Qualified' ) ) ;
    public final Enumerator ruleRangeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1385:28: ( ( (enumLiteral_0= 'Present' ) | (enumLiteral_1= 'Qualified' ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1386:1: ( (enumLiteral_0= 'Present' ) | (enumLiteral_1= 'Qualified' ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1386:1: ( (enumLiteral_0= 'Present' ) | (enumLiteral_1= 'Qualified' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            else if ( (LA25_0==44) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1386:2: (enumLiteral_0= 'Present' )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1386:2: (enumLiteral_0= 'Present' )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1386:4: enumLiteral_0= 'Present'
                    {
                    enumLiteral_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleRangeType3100); 

                            current = grammarAccess.getRangeTypeAccess().getPRESENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRangeTypeAccess().getPRESENTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1392:6: (enumLiteral_1= 'Qualified' )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1392:6: (enumLiteral_1= 'Qualified' )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1392:8: enumLiteral_1= 'Qualified'
                    {
                    enumLiteral_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleRangeType3117); 

                            current = grammarAccess.getRangeTypeAccess().getQUALIFIEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRangeTypeAccess().getQUALIFIEDEnumLiteralDeclaration_1()); 
                        

                    }


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
    // $ANTLR end "ruleRangeType"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleProject_in_entryRuleProject75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProject85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleProject131 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleProject148 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleProject165 = new BitSet(new long[]{0x00000000000E4000L});
        public static final BitSet FOLLOW_14_in_ruleProject178 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleProject190 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleRole_in_ruleProject211 = new BitSet(new long[]{0x00000000000F0000L});
        public static final BitSet FOLLOW_16_in_ruleProject224 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleRole_in_ruleProject245 = new BitSet(new long[]{0x00000000000F0000L});
        public static final BitSet FOLLOW_17_in_ruleProject262 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleProject274 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleDeadline_in_ruleProject295 = new BitSet(new long[]{0x00000000000D0000L});
        public static final BitSet FOLLOW_16_in_ruleProject308 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleDeadline_in_ruleProject329 = new BitSet(new long[]{0x00000000000D0000L});
        public static final BitSet FOLLOW_18_in_ruleProject346 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleProject358 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleProject379 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleProject392 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleProject413 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleProject429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_entryRuleStrategy465 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStrategy475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMajority_in_ruleStrategy522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRatioMajority_in_ruleStrategy549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeaderDriven_in_ruleStrategy576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePhasedStrategy_in_ruleStrategy603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_entryRuleRole638 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRole648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRole689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMajority_in_entryRuleMajority729 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMajority739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMajority781 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMajority798 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleMajority810 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMajority822 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleMajority834 = new BitSet(new long[]{0x00000001C0000000L});
        public static final BitSet FOLLOW_ruleCollaborationType_in_ruleMajority855 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_22_in_ruleMajority868 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFilter_in_ruleMajority884 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleMajority895 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleMajority909 = new BitSet(new long[]{0x0000070000000000L});
        public static final BitSet FOLLOW_ruleStageType_in_ruleMajority930 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleMajority942 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMajority962 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_16_in_ruleMajority975 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMajority995 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_26_in_ruleMajority1009 = new BitSet(new long[]{0x0000180000000000L});
        public static final BitSet FOLLOW_ruleRangeType_in_ruleMajority1030 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_27_in_ruleMajority1043 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleMajority1060 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleMajority1079 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMajority1099 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMajority1111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRatioMajority_in_entryRuleRatioMajority1147 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRatioMajority1157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRatioMajority1199 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRatioMajority1216 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleRatioMajority1228 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRatioMajority1240 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleRatioMajority1252 = new BitSet(new long[]{0x00000001C0000000L});
        public static final BitSet FOLLOW_30_in_ruleRatioMajority1265 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_31_in_ruleRatioMajority1283 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_32_in_ruleRatioMajority1301 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_22_in_ruleRatioMajority1315 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFilter_in_ruleRatioMajority1331 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleRatioMajority1342 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleRatioMajority1356 = new BitSet(new long[]{0x0000070000000000L});
        public static final BitSet FOLLOW_ruleStageType_in_ruleRatioMajority1377 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleRatioMajority1389 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRatioMajority1409 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_16_in_ruleRatioMajority1422 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRatioMajority1442 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_26_in_ruleRatioMajority1456 = new BitSet(new long[]{0x0000180000000000L});
        public static final BitSet FOLLOW_ruleRangeType_in_ruleRatioMajority1477 = new BitSet(new long[]{0x0000000208000000L});
        public static final BitSet FOLLOW_27_in_ruleRatioMajority1490 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleRatioMajority1507 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleRatioMajority1526 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleRatioMajority1543 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleRatioMajority1560 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRatioMajority1580 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleRatioMajority1592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeaderDriven_in_entryRuleLeaderDriven1628 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLeaderDriven1638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLeaderDriven1680 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleLeaderDriven1697 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleLeaderDriven1709 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleLeaderDriven1721 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleLeaderDriven1733 = new BitSet(new long[]{0x00000001C0000000L});
        public static final BitSet FOLLOW_30_in_ruleLeaderDriven1746 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_31_in_ruleLeaderDriven1764 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_32_in_ruleLeaderDriven1782 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_22_in_ruleLeaderDriven1796 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFilter_in_ruleLeaderDriven1817 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleLeaderDriven1829 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleLeaderDriven1843 = new BitSet(new long[]{0x0000070000000000L});
        public static final BitSet FOLLOW_ruleStageType_in_ruleLeaderDriven1864 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleLeaderDriven1876 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLeaderDriven1896 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleLeaderDriven1908 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLeaderDriven1928 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleLeaderDriven1940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePhasedStrategy_in_entryRulePhasedStrategy1976 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePhasedStrategy1986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePhasedStrategy2028 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePhasedStrategy2045 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_rulePhasedStrategy2057 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePhasedStrategy2069 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_rulePhasedStrategy2081 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePhasedStrategy2093 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePhasedStrategy2113 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_19_in_rulePhasedStrategy2126 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulePhasedStrategy2138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilter_in_entryRuleFilter2175 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFilter2186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFilter2227 = new BitSet(new long[]{0x0000006000000000L});
        public static final BitSet FOLLOW_37_in_ruleFilter2246 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_38_in_ruleFilter2265 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFilter2281 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleFilter2301 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFilter2316 = new BitSet(new long[]{0x0000006000000000L});
        public static final BitSet FOLLOW_37_in_ruleFilter2335 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_38_in_ruleFilter2354 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFilter2370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeadline_in_entryRuleDeadline2417 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeadline2427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimer_in_ruleDeadline2474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWaitForVote_in_ruleDeadline2501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOCLCondition_in_ruleDeadline2528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimer_in_entryRuleTimer2563 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTimer2573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTimer2624 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTimer2641 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleTimer2658 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleTimer2675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOCLCondition_in_entryRuleOCLCondition2711 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOCLCondition2721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleOCLCondition2762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWaitForVote_in_entryRuleWaitForVote2802 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWaitForVote2812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleWaitForVote2857 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleWaitForVote2870 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleWaitForVote2890 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_30_in_ruleCollaborationType2942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleCollaborationType2959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleCollaborationType2976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleStageType3021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleStageType3038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleStageType3055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleRangeType3100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleRangeType3117 = new BitSet(new long[]{0x0000000000000002L});
    }


}