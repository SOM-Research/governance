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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Project'", "'{'", "'Roles'", "':'", "','", "'Deadlines'", "'Strategies'", "'}'", "'Majority'", "'applied to'", "'('", "')'", "'people'", "'range'", "'minVotes'", "'deadline'", "'Ratio'", "'Task'", "'Patch'", "'Comment'", "'ratio'", "'LeaderDriven'", "'default'", "'phases'", "'='", "'days'", "'Present'", "'Qualified'"
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
                    case 20:
                        {
                        alt7=1;
                        }
                        break;
                    case 28:
                        {
                        int LA7_4 = input.LA(4);

                        if ( (LA7_4==13) ) {
                            int LA7_6 = input.LA(5);

                            if ( (LA7_6==21) ) {
                                alt7=2;
                            }
                            else if ( (LA7_6==35) ) {
                                alt7=4;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 7, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 33:
                        {
                        alt7=3;
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
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:377:1: ruleMajority returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Majority' otherlv_3= '{' otherlv_4= 'applied to' ( (lv_appliedTo_5_0= ruleCollaborationType ) ) (otherlv_6= '(' ruleFilter otherlv_8= ')' )? otherlv_9= 'people' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'range' ( (lv_range_14_0= ruleRangeType ) ) (otherlv_15= 'minVotes' ( (lv_minVotes_16_0= RULE_INT ) ) )? otherlv_17= 'deadline' ( (otherlv_18= RULE_ID ) ) otherlv_19= '}' ) ;
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
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token lv_minVotes_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Enumerator lv_appliedTo_5_0 = null;

        Enumerator lv_range_14_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:380:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Majority' otherlv_3= '{' otherlv_4= 'applied to' ( (lv_appliedTo_5_0= ruleCollaborationType ) ) (otherlv_6= '(' ruleFilter otherlv_8= ')' )? otherlv_9= 'people' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'range' ( (lv_range_14_0= ruleRangeType ) ) (otherlv_15= 'minVotes' ( (lv_minVotes_16_0= RULE_INT ) ) )? otherlv_17= 'deadline' ( (otherlv_18= RULE_ID ) ) otherlv_19= '}' ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:381:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Majority' otherlv_3= '{' otherlv_4= 'applied to' ( (lv_appliedTo_5_0= ruleCollaborationType ) ) (otherlv_6= '(' ruleFilter otherlv_8= ')' )? otherlv_9= 'people' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'range' ( (lv_range_14_0= ruleRangeType ) ) (otherlv_15= 'minVotes' ( (lv_minVotes_16_0= RULE_INT ) ) )? otherlv_17= 'deadline' ( (otherlv_18= RULE_ID ) ) otherlv_19= '}' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:381:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Majority' otherlv_3= '{' otherlv_4= 'applied to' ( (lv_appliedTo_5_0= ruleCollaborationType ) ) (otherlv_6= '(' ruleFilter otherlv_8= ')' )? otherlv_9= 'people' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'range' ( (lv_range_14_0= ruleRangeType ) ) (otherlv_15= 'minVotes' ( (lv_minVotes_16_0= RULE_INT ) ) )? otherlv_17= 'deadline' ( (otherlv_18= RULE_ID ) ) otherlv_19= '}' )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:381:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Majority' otherlv_3= '{' otherlv_4= 'applied to' ( (lv_appliedTo_5_0= ruleCollaborationType ) ) (otherlv_6= '(' ruleFilter otherlv_8= ')' )? otherlv_9= 'people' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'range' ( (lv_range_14_0= ruleRangeType ) ) (otherlv_15= 'minVotes' ( (lv_minVotes_16_0= RULE_INT ) ) )? otherlv_17= 'deadline' ( (otherlv_18= RULE_ID ) ) otherlv_19= '}'
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

                	newLeafNode(otherlv_9, grammarAccess.getMajorityAccess().getPeopleKeyword_7());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:453:1: ( (otherlv_10= RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:454:1: (otherlv_10= RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:454:1: (otherlv_10= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:455:3: otherlv_10= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMajorityRule());
            	        }
                    
            otherlv_10=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMajority929); 

            		newLeafNode(otherlv_10, grammarAccess.getMajorityAccess().getPeopleRoleCrossReference_8_0()); 
            	

            }


            }

            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:466:2: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:466:4: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
            	    {
            	    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMajority942); 

            	        	newLeafNode(otherlv_11, grammarAccess.getMajorityAccess().getCommaKeyword_9_0());
            	        
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:470:1: ( (otherlv_12= RULE_ID ) )
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:471:1: (otherlv_12= RULE_ID )
            	    {
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:471:1: (otherlv_12= RULE_ID )
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:472:3: otherlv_12= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMajorityRule());
            	    	        }
            	            
            	    otherlv_12=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMajority962); 

            	    		newLeafNode(otherlv_12, grammarAccess.getMajorityAccess().getPeopleRoleCrossReference_9_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_13=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMajority976); 

                	newLeafNode(otherlv_13, grammarAccess.getMajorityAccess().getRangeKeyword_10());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:487:1: ( (lv_range_14_0= ruleRangeType ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:488:1: (lv_range_14_0= ruleRangeType )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:488:1: (lv_range_14_0= ruleRangeType )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:489:3: lv_range_14_0= ruleRangeType
            {
             
            	        newCompositeNode(grammarAccess.getMajorityAccess().getRangeRangeTypeEnumRuleCall_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleRangeType_in_ruleMajority997);
            lv_range_14_0=ruleRangeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMajorityRule());
            	        }
                   		set(
                   			current, 
                   			"range",
                    		lv_range_14_0, 
                    		"RangeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:505:2: (otherlv_15= 'minVotes' ( (lv_minVotes_16_0= RULE_INT ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:505:4: otherlv_15= 'minVotes' ( (lv_minVotes_16_0= RULE_INT ) )
                    {
                    otherlv_15=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMajority1010); 

                        	newLeafNode(otherlv_15, grammarAccess.getMajorityAccess().getMinVotesKeyword_12_0());
                        
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:509:1: ( (lv_minVotes_16_0= RULE_INT ) )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:510:1: (lv_minVotes_16_0= RULE_INT )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:510:1: (lv_minVotes_16_0= RULE_INT )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:511:3: lv_minVotes_16_0= RULE_INT
                    {
                    lv_minVotes_16_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleMajority1027); 

                    			newLeafNode(lv_minVotes_16_0, grammarAccess.getMajorityAccess().getMinVotesINTTerminalRuleCall_12_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMajorityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"minVotes",
                            		lv_minVotes_16_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMajority1046); 

                	newLeafNode(otherlv_17, grammarAccess.getMajorityAccess().getDeadlineKeyword_13());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:531:1: ( (otherlv_18= RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:532:1: (otherlv_18= RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:532:1: (otherlv_18= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:533:3: otherlv_18= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMajorityRule());
            	        }
                    
            otherlv_18=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMajority1066); 

            		newLeafNode(otherlv_18, grammarAccess.getMajorityAccess().getDeadlineDeadlineCrossReference_14_0()); 
            	

            }


            }

            otherlv_19=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMajority1078); 

                	newLeafNode(otherlv_19, grammarAccess.getMajorityAccess().getRightCurlyBracketKeyword_15());
                

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
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:556:1: entryRuleRatioMajority returns [EObject current=null] : iv_ruleRatioMajority= ruleRatioMajority EOF ;
    public final EObject entryRuleRatioMajority() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRatioMajority = null;


        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:557:2: (iv_ruleRatioMajority= ruleRatioMajority EOF )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:558:2: iv_ruleRatioMajority= ruleRatioMajority EOF
            {
             newCompositeNode(grammarAccess.getRatioMajorityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRatioMajority_in_entryRuleRatioMajority1114);
            iv_ruleRatioMajority=ruleRatioMajority();

            state._fsp--;

             current =iv_ruleRatioMajority; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRatioMajority1124); 

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
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:565:1: ruleRatioMajority returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Ratio' otherlv_3= '{' otherlv_4= 'applied to' (otherlv_5= 'Task' | otherlv_6= 'Patch' | otherlv_7= 'Comment' ) (otherlv_8= '(' ruleFilter otherlv_10= ')' )? otherlv_11= 'people' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= 'range' ( (lv_range_16_0= ruleRangeType ) ) (otherlv_17= 'minVotes' ( (lv_minVotes_18_0= RULE_INT ) ) )? otherlv_19= 'ratio' ( (lv_ratio_20_0= RULE_FLOAT ) ) otherlv_21= 'deadline' ( (otherlv_22= RULE_ID ) ) otherlv_23= '}' ) ;
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
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token lv_minVotes_18_0=null;
        Token otherlv_19=null;
        Token lv_ratio_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Enumerator lv_range_16_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:568:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Ratio' otherlv_3= '{' otherlv_4= 'applied to' (otherlv_5= 'Task' | otherlv_6= 'Patch' | otherlv_7= 'Comment' ) (otherlv_8= '(' ruleFilter otherlv_10= ')' )? otherlv_11= 'people' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= 'range' ( (lv_range_16_0= ruleRangeType ) ) (otherlv_17= 'minVotes' ( (lv_minVotes_18_0= RULE_INT ) ) )? otherlv_19= 'ratio' ( (lv_ratio_20_0= RULE_FLOAT ) ) otherlv_21= 'deadline' ( (otherlv_22= RULE_ID ) ) otherlv_23= '}' ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:569:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Ratio' otherlv_3= '{' otherlv_4= 'applied to' (otherlv_5= 'Task' | otherlv_6= 'Patch' | otherlv_7= 'Comment' ) (otherlv_8= '(' ruleFilter otherlv_10= ')' )? otherlv_11= 'people' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= 'range' ( (lv_range_16_0= ruleRangeType ) ) (otherlv_17= 'minVotes' ( (lv_minVotes_18_0= RULE_INT ) ) )? otherlv_19= 'ratio' ( (lv_ratio_20_0= RULE_FLOAT ) ) otherlv_21= 'deadline' ( (otherlv_22= RULE_ID ) ) otherlv_23= '}' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:569:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Ratio' otherlv_3= '{' otherlv_4= 'applied to' (otherlv_5= 'Task' | otherlv_6= 'Patch' | otherlv_7= 'Comment' ) (otherlv_8= '(' ruleFilter otherlv_10= ')' )? otherlv_11= 'people' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= 'range' ( (lv_range_16_0= ruleRangeType ) ) (otherlv_17= 'minVotes' ( (lv_minVotes_18_0= RULE_INT ) ) )? otherlv_19= 'ratio' ( (lv_ratio_20_0= RULE_FLOAT ) ) otherlv_21= 'deadline' ( (otherlv_22= RULE_ID ) ) otherlv_23= '}' )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:569:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Ratio' otherlv_3= '{' otherlv_4= 'applied to' (otherlv_5= 'Task' | otherlv_6= 'Patch' | otherlv_7= 'Comment' ) (otherlv_8= '(' ruleFilter otherlv_10= ')' )? otherlv_11= 'people' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= 'range' ( (lv_range_16_0= ruleRangeType ) ) (otherlv_17= 'minVotes' ( (lv_minVotes_18_0= RULE_INT ) ) )? otherlv_19= 'ratio' ( (lv_ratio_20_0= RULE_FLOAT ) ) otherlv_21= 'deadline' ( (otherlv_22= RULE_ID ) ) otherlv_23= '}'
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:569:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:570:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:570:1: (lv_name_0_0= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:571:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRatioMajority1166); 

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

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRatioMajority1183); 

                	newLeafNode(otherlv_1, grammarAccess.getRatioMajorityAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRatioMajority1195); 

                	newLeafNode(otherlv_2, grammarAccess.getRatioMajorityAccess().getRatioKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRatioMajority1207); 

                	newLeafNode(otherlv_3, grammarAccess.getRatioMajorityAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleRatioMajority1219); 

                	newLeafNode(otherlv_4, grammarAccess.getRatioMajorityAccess().getAppliedToKeyword_4());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:603:1: (otherlv_5= 'Task' | otherlv_6= 'Patch' | otherlv_7= 'Comment' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt11=1;
                }
                break;
            case 30:
                {
                alt11=2;
                }
                break;
            case 31:
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
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:603:3: otherlv_5= 'Task'
                    {
                    otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleRatioMajority1232); 

                        	newLeafNode(otherlv_5, grammarAccess.getRatioMajorityAccess().getTaskKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:608:7: otherlv_6= 'Patch'
                    {
                    otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRatioMajority1250); 

                        	newLeafNode(otherlv_6, grammarAccess.getRatioMajorityAccess().getPatchKeyword_5_1());
                        

                    }
                    break;
                case 3 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:613:7: otherlv_7= 'Comment'
                    {
                    otherlv_7=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRatioMajority1268); 

                        	newLeafNode(otherlv_7, grammarAccess.getRatioMajorityAccess().getCommentKeyword_5_2());
                        

                    }
                    break;

            }

            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:617:2: (otherlv_8= '(' ruleFilter otherlv_10= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:617:4: otherlv_8= '(' ruleFilter otherlv_10= ')'
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleRatioMajority1282); 

                        	newLeafNode(otherlv_8, grammarAccess.getRatioMajorityAccess().getLeftParenthesisKeyword_6_0());
                        
                     
                            newCompositeNode(grammarAccess.getRatioMajorityAccess().getFilterParserRuleCall_6_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFilter_in_ruleRatioMajority1298);
                    ruleFilter();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleRatioMajority1309); 

                        	newLeafNode(otherlv_10, grammarAccess.getRatioMajorityAccess().getRightParenthesisKeyword_6_2());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRatioMajority1323); 

                	newLeafNode(otherlv_11, grammarAccess.getRatioMajorityAccess().getPeopleKeyword_7());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:637:1: ( (otherlv_12= RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:638:1: (otherlv_12= RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:638:1: (otherlv_12= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:639:3: otherlv_12= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRatioMajorityRule());
            	        }
                    
            otherlv_12=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRatioMajority1343); 

            		newLeafNode(otherlv_12, grammarAccess.getRatioMajorityAccess().getPeopleRoleCrossReference_8_0()); 
            	

            }


            }

            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:650:2: (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:650:4: otherlv_13= ',' ( (otherlv_14= RULE_ID ) )
            	    {
            	    otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRatioMajority1356); 

            	        	newLeafNode(otherlv_13, grammarAccess.getRatioMajorityAccess().getCommaKeyword_9_0());
            	        
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:654:1: ( (otherlv_14= RULE_ID ) )
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:655:1: (otherlv_14= RULE_ID )
            	    {
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:655:1: (otherlv_14= RULE_ID )
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:656:3: otherlv_14= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRatioMajorityRule());
            	    	        }
            	            
            	    otherlv_14=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRatioMajority1376); 

            	    		newLeafNode(otherlv_14, grammarAccess.getRatioMajorityAccess().getPeopleRoleCrossReference_9_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_15=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRatioMajority1390); 

                	newLeafNode(otherlv_15, grammarAccess.getRatioMajorityAccess().getRangeKeyword_10());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:671:1: ( (lv_range_16_0= ruleRangeType ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:672:1: (lv_range_16_0= ruleRangeType )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:672:1: (lv_range_16_0= ruleRangeType )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:673:3: lv_range_16_0= ruleRangeType
            {
             
            	        newCompositeNode(grammarAccess.getRatioMajorityAccess().getRangeRangeTypeEnumRuleCall_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleRangeType_in_ruleRatioMajority1411);
            lv_range_16_0=ruleRangeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRatioMajorityRule());
            	        }
                   		set(
                   			current, 
                   			"range",
                    		lv_range_16_0, 
                    		"RangeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:689:2: (otherlv_17= 'minVotes' ( (lv_minVotes_18_0= RULE_INT ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:689:4: otherlv_17= 'minVotes' ( (lv_minVotes_18_0= RULE_INT ) )
                    {
                    otherlv_17=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRatioMajority1424); 

                        	newLeafNode(otherlv_17, grammarAccess.getRatioMajorityAccess().getMinVotesKeyword_12_0());
                        
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:693:1: ( (lv_minVotes_18_0= RULE_INT ) )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:694:1: (lv_minVotes_18_0= RULE_INT )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:694:1: (lv_minVotes_18_0= RULE_INT )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:695:3: lv_minVotes_18_0= RULE_INT
                    {
                    lv_minVotes_18_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleRatioMajority1441); 

                    			newLeafNode(lv_minVotes_18_0, grammarAccess.getRatioMajorityAccess().getMinVotesINTTerminalRuleCall_12_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRatioMajorityRule());
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

            otherlv_19=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleRatioMajority1460); 

                	newLeafNode(otherlv_19, grammarAccess.getRatioMajorityAccess().getRatioKeyword_13());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:715:1: ( (lv_ratio_20_0= RULE_FLOAT ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:716:1: (lv_ratio_20_0= RULE_FLOAT )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:716:1: (lv_ratio_20_0= RULE_FLOAT )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:717:3: lv_ratio_20_0= RULE_FLOAT
            {
            lv_ratio_20_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleRatioMajority1477); 

            			newLeafNode(lv_ratio_20_0, grammarAccess.getRatioMajorityAccess().getRatioFLOATTerminalRuleCall_14_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRatioMajorityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ratio",
                    		lv_ratio_20_0, 
                    		"FLOAT");
            	    

            }


            }

            otherlv_21=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRatioMajority1494); 

                	newLeafNode(otherlv_21, grammarAccess.getRatioMajorityAccess().getDeadlineKeyword_15());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:737:1: ( (otherlv_22= RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:738:1: (otherlv_22= RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:738:1: (otherlv_22= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:739:3: otherlv_22= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRatioMajorityRule());
            	        }
                    
            otherlv_22=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRatioMajority1514); 

            		newLeafNode(otherlv_22, grammarAccess.getRatioMajorityAccess().getDeadlineDeadlineCrossReference_16_0()); 
            	

            }


            }

            otherlv_23=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRatioMajority1526); 

                	newLeafNode(otherlv_23, grammarAccess.getRatioMajorityAccess().getRightCurlyBracketKeyword_17());
                

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
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:762:1: entryRuleLeaderDriven returns [EObject current=null] : iv_ruleLeaderDriven= ruleLeaderDriven EOF ;
    public final EObject entryRuleLeaderDriven() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeaderDriven = null;


        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:763:2: (iv_ruleLeaderDriven= ruleLeaderDriven EOF )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:764:2: iv_ruleLeaderDriven= ruleLeaderDriven EOF
            {
             newCompositeNode(grammarAccess.getLeaderDrivenRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLeaderDriven_in_entryRuleLeaderDriven1562);
            iv_ruleLeaderDriven=ruleLeaderDriven();

            state._fsp--;

             current =iv_ruleLeaderDriven; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLeaderDriven1572); 

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
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:771:1: ruleLeaderDriven returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'LeaderDriven' otherlv_3= '{' otherlv_4= 'applied to' (otherlv_5= 'Task' | otherlv_6= 'Patch' | otherlv_7= 'Comment' ) (otherlv_8= '(' ( (lv_filter_9_0= ruleFilter ) ) otherlv_10= ')' )? otherlv_11= 'default' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'deadline' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' ) ;
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
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_filter_9_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:774:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'LeaderDriven' otherlv_3= '{' otherlv_4= 'applied to' (otherlv_5= 'Task' | otherlv_6= 'Patch' | otherlv_7= 'Comment' ) (otherlv_8= '(' ( (lv_filter_9_0= ruleFilter ) ) otherlv_10= ')' )? otherlv_11= 'default' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'deadline' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:775:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'LeaderDriven' otherlv_3= '{' otherlv_4= 'applied to' (otherlv_5= 'Task' | otherlv_6= 'Patch' | otherlv_7= 'Comment' ) (otherlv_8= '(' ( (lv_filter_9_0= ruleFilter ) ) otherlv_10= ')' )? otherlv_11= 'default' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'deadline' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:775:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'LeaderDriven' otherlv_3= '{' otherlv_4= 'applied to' (otherlv_5= 'Task' | otherlv_6= 'Patch' | otherlv_7= 'Comment' ) (otherlv_8= '(' ( (lv_filter_9_0= ruleFilter ) ) otherlv_10= ')' )? otherlv_11= 'default' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'deadline' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:775:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'LeaderDriven' otherlv_3= '{' otherlv_4= 'applied to' (otherlv_5= 'Task' | otherlv_6= 'Patch' | otherlv_7= 'Comment' ) (otherlv_8= '(' ( (lv_filter_9_0= ruleFilter ) ) otherlv_10= ')' )? otherlv_11= 'default' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'deadline' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}'
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:775:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:776:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:776:1: (lv_name_0_0= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:777:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLeaderDriven1614); 

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

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLeaderDriven1631); 

                	newLeafNode(otherlv_1, grammarAccess.getLeaderDrivenAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleLeaderDriven1643); 

                	newLeafNode(otherlv_2, grammarAccess.getLeaderDrivenAccess().getLeaderDrivenKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleLeaderDriven1655); 

                	newLeafNode(otherlv_3, grammarAccess.getLeaderDrivenAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleLeaderDriven1667); 

                	newLeafNode(otherlv_4, grammarAccess.getLeaderDrivenAccess().getAppliedToKeyword_4());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:809:1: (otherlv_5= 'Task' | otherlv_6= 'Patch' | otherlv_7= 'Comment' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt15=1;
                }
                break;
            case 30:
                {
                alt15=2;
                }
                break;
            case 31:
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
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:809:3: otherlv_5= 'Task'
                    {
                    otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleLeaderDriven1680); 

                        	newLeafNode(otherlv_5, grammarAccess.getLeaderDrivenAccess().getTaskKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:814:7: otherlv_6= 'Patch'
                    {
                    otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleLeaderDriven1698); 

                        	newLeafNode(otherlv_6, grammarAccess.getLeaderDrivenAccess().getPatchKeyword_5_1());
                        

                    }
                    break;
                case 3 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:819:7: otherlv_7= 'Comment'
                    {
                    otherlv_7=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleLeaderDriven1716); 

                        	newLeafNode(otherlv_7, grammarAccess.getLeaderDrivenAccess().getCommentKeyword_5_2());
                        

                    }
                    break;

            }

            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:823:2: (otherlv_8= '(' ( (lv_filter_9_0= ruleFilter ) ) otherlv_10= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:823:4: otherlv_8= '(' ( (lv_filter_9_0= ruleFilter ) ) otherlv_10= ')'
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleLeaderDriven1730); 

                        	newLeafNode(otherlv_8, grammarAccess.getLeaderDrivenAccess().getLeftParenthesisKeyword_6_0());
                        
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:827:1: ( (lv_filter_9_0= ruleFilter ) )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:828:1: (lv_filter_9_0= ruleFilter )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:828:1: (lv_filter_9_0= ruleFilter )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:829:3: lv_filter_9_0= ruleFilter
                    {
                     
                    	        newCompositeNode(grammarAccess.getLeaderDrivenAccess().getFilterFilterParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFilter_in_ruleLeaderDriven1751);
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

                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleLeaderDriven1763); 

                        	newLeafNode(otherlv_10, grammarAccess.getLeaderDrivenAccess().getRightParenthesisKeyword_6_2());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleLeaderDriven1777); 

                	newLeafNode(otherlv_11, grammarAccess.getLeaderDrivenAccess().getDefaultKeyword_7());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:853:1: ( (otherlv_12= RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:854:1: (otherlv_12= RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:854:1: (otherlv_12= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:855:3: otherlv_12= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLeaderDrivenRule());
            	        }
                    
            otherlv_12=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLeaderDriven1797); 

            		newLeafNode(otherlv_12, grammarAccess.getLeaderDrivenAccess().getDefaultStrategyCrossReference_8_0()); 
            	

            }


            }

            otherlv_13=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleLeaderDriven1809); 

                	newLeafNode(otherlv_13, grammarAccess.getLeaderDrivenAccess().getDeadlineKeyword_9());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:870:1: ( (otherlv_14= RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:871:1: (otherlv_14= RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:871:1: (otherlv_14= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:872:3: otherlv_14= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLeaderDrivenRule());
            	        }
                    
            otherlv_14=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLeaderDriven1829); 

            		newLeafNode(otherlv_14, grammarAccess.getLeaderDrivenAccess().getDeadlineDeadlineCrossReference_10_0()); 
            	

            }


            }

            otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLeaderDriven1841); 

                	newLeafNode(otherlv_15, grammarAccess.getLeaderDrivenAccess().getRightCurlyBracketKeyword_11());
                

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
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:895:1: entryRulePhasedStrategy returns [EObject current=null] : iv_rulePhasedStrategy= rulePhasedStrategy EOF ;
    public final EObject entryRulePhasedStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhasedStrategy = null;


        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:896:2: (iv_rulePhasedStrategy= rulePhasedStrategy EOF )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:897:2: iv_rulePhasedStrategy= rulePhasedStrategy EOF
            {
             newCompositeNode(grammarAccess.getPhasedStrategyRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePhasedStrategy_in_entryRulePhasedStrategy1877);
            iv_rulePhasedStrategy=rulePhasedStrategy();

            state._fsp--;

             current =iv_rulePhasedStrategy; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePhasedStrategy1887); 

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
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:904:1: rulePhasedStrategy returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Ratio' otherlv_3= '{' otherlv_4= 'phases' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' otherlv_8= '}' ) ;
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
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:907:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Ratio' otherlv_3= '{' otherlv_4= 'phases' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:908:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Ratio' otherlv_3= '{' otherlv_4= 'phases' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:908:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Ratio' otherlv_3= '{' otherlv_4= 'phases' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' otherlv_8= '}' )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:908:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'Ratio' otherlv_3= '{' otherlv_4= 'phases' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' otherlv_8= '}'
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:908:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:909:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:909:1: (lv_name_0_0= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:910:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePhasedStrategy1929); 

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

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePhasedStrategy1946); 

                	newLeafNode(otherlv_1, grammarAccess.getPhasedStrategyAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_rulePhasedStrategy1958); 

                	newLeafNode(otherlv_2, grammarAccess.getPhasedStrategyAccess().getRatioKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePhasedStrategy1970); 

                	newLeafNode(otherlv_3, grammarAccess.getPhasedStrategyAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_35_in_rulePhasedStrategy1982); 

                	newLeafNode(otherlv_4, grammarAccess.getPhasedStrategyAccess().getPhasesKeyword_4());
                
            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePhasedStrategy1994); 

                	newLeafNode(otherlv_5, grammarAccess.getPhasedStrategyAccess().getLeftCurlyBracketKeyword_5());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:946:1: ( (otherlv_6= RULE_ID ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:947:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:947:1: (otherlv_6= RULE_ID )
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:948:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPhasedStrategyRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePhasedStrategy2014); 

            	    		newLeafNode(otherlv_6, grammarAccess.getPhasedStrategyAccess().getPhasesStrategyCrossReference_6_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePhasedStrategy2027); 

                	newLeafNode(otherlv_7, grammarAccess.getPhasedStrategyAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePhasedStrategy2039); 

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
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:975:1: entryRuleFilter returns [String current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final String entryRuleFilter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFilter = null;


        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:976:2: (iv_ruleFilter= ruleFilter EOF )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:977:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilter_in_entryRuleFilter2076);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFilter2087); 

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
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:984:1: ruleFilter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '=' this_ID_2= RULE_ID ) (kw= ',' this_ID_4= RULE_ID kw= '=' this_ID_6= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleFilter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        Token this_ID_6=null;

         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:987:28: ( ( (this_ID_0= RULE_ID kw= '=' this_ID_2= RULE_ID ) (kw= ',' this_ID_4= RULE_ID kw= '=' this_ID_6= RULE_ID )? ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:988:1: ( (this_ID_0= RULE_ID kw= '=' this_ID_2= RULE_ID ) (kw= ',' this_ID_4= RULE_ID kw= '=' this_ID_6= RULE_ID )? )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:988:1: ( (this_ID_0= RULE_ID kw= '=' this_ID_2= RULE_ID ) (kw= ',' this_ID_4= RULE_ID kw= '=' this_ID_6= RULE_ID )? )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:988:2: (this_ID_0= RULE_ID kw= '=' this_ID_2= RULE_ID ) (kw= ',' this_ID_4= RULE_ID kw= '=' this_ID_6= RULE_ID )?
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:988:2: (this_ID_0= RULE_ID kw= '=' this_ID_2= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:988:7: this_ID_0= RULE_ID kw= '=' this_ID_2= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFilter2128); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFilterAccess().getIDTerminalRuleCall_0_0()); 
                
            kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleFilter2146); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFilterAccess().getEqualsSignKeyword_0_1()); 
                
            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFilter2161); 

            		current.merge(this_ID_2);
                
             
                newLeafNode(this_ID_2, grammarAccess.getFilterAccess().getIDTerminalRuleCall_0_2()); 
                

            }

            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1008:2: (kw= ',' this_ID_4= RULE_ID kw= '=' this_ID_6= RULE_ID )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1009:2: kw= ',' this_ID_4= RULE_ID kw= '=' this_ID_6= RULE_ID
                    {
                    kw=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFilter2181); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFilterAccess().getCommaKeyword_1_0()); 
                        
                    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFilter2196); 

                    		current.merge(this_ID_4);
                        
                     
                        newLeafNode(this_ID_4, grammarAccess.getFilterAccess().getIDTerminalRuleCall_1_1()); 
                        
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleFilter2214); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFilterAccess().getEqualsSignKeyword_1_2()); 
                        
                    this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFilter2229); 

                    		current.merge(this_ID_6);
                        
                     
                        newLeafNode(this_ID_6, grammarAccess.getFilterAccess().getIDTerminalRuleCall_1_3()); 
                        

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
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1042:1: entryRuleDeadline returns [EObject current=null] : iv_ruleDeadline= ruleDeadline EOF ;
    public final EObject entryRuleDeadline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeadline = null;


        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1043:2: (iv_ruleDeadline= ruleDeadline EOF )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1044:2: iv_ruleDeadline= ruleDeadline EOF
            {
             newCompositeNode(grammarAccess.getDeadlineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeadline_in_entryRuleDeadline2276);
            iv_ruleDeadline=ruleDeadline();

            state._fsp--;

             current =iv_ruleDeadline; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeadline2286); 

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
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1051:1: ruleDeadline returns [EObject current=null] : (this_Timer_0= ruleTimer | this_WaitForVote_1= ruleWaitForVote | this_OCLCondition_2= ruleOCLCondition ) ;
    public final EObject ruleDeadline() throws RecognitionException {
        EObject current = null;

        EObject this_Timer_0 = null;

        EObject this_WaitForVote_1 = null;

        EObject this_OCLCondition_2 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1054:28: ( (this_Timer_0= ruleTimer | this_WaitForVote_1= ruleWaitForVote | this_OCLCondition_2= ruleOCLCondition ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1055:1: (this_Timer_0= ruleTimer | this_WaitForVote_1= ruleWaitForVote | this_OCLCondition_2= ruleOCLCondition )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1055:1: (this_Timer_0= ruleTimer | this_WaitForVote_1= ruleWaitForVote | this_OCLCondition_2= ruleOCLCondition )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==15) ) {
                    alt19=1;
                }
                else if ( (LA19_1==EOF||LA19_1==16||(LA19_1>=18 && LA19_1<=19)) ) {
                    alt19=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA19_0==RULE_STRING) ) {
                alt19=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1056:5: this_Timer_0= ruleTimer
                    {
                     
                            newCompositeNode(grammarAccess.getDeadlineAccess().getTimerParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTimer_in_ruleDeadline2333);
                    this_Timer_0=ruleTimer();

                    state._fsp--;

                     
                            current = this_Timer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1066:5: this_WaitForVote_1= ruleWaitForVote
                    {
                     
                            newCompositeNode(grammarAccess.getDeadlineAccess().getWaitForVoteParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWaitForVote_in_ruleDeadline2360);
                    this_WaitForVote_1=ruleWaitForVote();

                    state._fsp--;

                     
                            current = this_WaitForVote_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1076:5: this_OCLCondition_2= ruleOCLCondition
                    {
                     
                            newCompositeNode(grammarAccess.getDeadlineAccess().getOCLConditionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOCLCondition_in_ruleDeadline2387);
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
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1092:1: entryRuleTimer returns [EObject current=null] : iv_ruleTimer= ruleTimer EOF ;
    public final EObject entryRuleTimer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimer = null;


        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1093:2: (iv_ruleTimer= ruleTimer EOF )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1094:2: iv_ruleTimer= ruleTimer EOF
            {
             newCompositeNode(grammarAccess.getTimerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTimer_in_entryRuleTimer2422);
            iv_ruleTimer=ruleTimer();

            state._fsp--;

             current =iv_ruleTimer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTimer2432); 

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
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1101:1: ruleTimer returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_timeStamp_3_0= RULE_INT ) ) otherlv_4= 'days' ) ;
    public final EObject ruleTimer() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_timeStamp_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1104:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_timeStamp_3_0= RULE_INT ) ) otherlv_4= 'days' ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1105:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_timeStamp_3_0= RULE_INT ) ) otherlv_4= 'days' )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1105:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_timeStamp_3_0= RULE_INT ) ) otherlv_4= 'days' )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1105:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_timeStamp_3_0= RULE_INT ) ) otherlv_4= 'days'
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1105:2: ()
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1106:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTimerAccess().getTimerAction_0(),
                        current);
                

            }

            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1111:2: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1112:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1112:1: (lv_name_1_0= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1113:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTimer2483); 

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

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTimer2500); 

                	newLeafNode(otherlv_2, grammarAccess.getTimerAccess().getColonKeyword_2());
                
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1133:1: ( (lv_timeStamp_3_0= RULE_INT ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1134:1: (lv_timeStamp_3_0= RULE_INT )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1134:1: (lv_timeStamp_3_0= RULE_INT )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1135:3: lv_timeStamp_3_0= RULE_INT
            {
            lv_timeStamp_3_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleTimer2517); 

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

            otherlv_4=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleTimer2534); 

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
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1163:1: entryRuleOCLCondition returns [EObject current=null] : iv_ruleOCLCondition= ruleOCLCondition EOF ;
    public final EObject entryRuleOCLCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOCLCondition = null;


        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1164:2: (iv_ruleOCLCondition= ruleOCLCondition EOF )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1165:2: iv_ruleOCLCondition= ruleOCLCondition EOF
            {
             newCompositeNode(grammarAccess.getOCLConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOCLCondition_in_entryRuleOCLCondition2570);
            iv_ruleOCLCondition=ruleOCLCondition();

            state._fsp--;

             current =iv_ruleOCLCondition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOCLCondition2580); 

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
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1172:1: ruleOCLCondition returns [EObject current=null] : ( (lv_oclExpression_0_0= RULE_STRING ) ) ;
    public final EObject ruleOCLCondition() throws RecognitionException {
        EObject current = null;

        Token lv_oclExpression_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1175:28: ( ( (lv_oclExpression_0_0= RULE_STRING ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1176:1: ( (lv_oclExpression_0_0= RULE_STRING ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1176:1: ( (lv_oclExpression_0_0= RULE_STRING ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1177:1: (lv_oclExpression_0_0= RULE_STRING )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1177:1: (lv_oclExpression_0_0= RULE_STRING )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1178:3: lv_oclExpression_0_0= RULE_STRING
            {
            lv_oclExpression_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleOCLCondition2621); 

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
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1202:1: entryRuleWaitForVote returns [EObject current=null] : iv_ruleWaitForVote= ruleWaitForVote EOF ;
    public final EObject entryRuleWaitForVote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWaitForVote = null;


        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1203:2: (iv_ruleWaitForVote= ruleWaitForVote EOF )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1204:2: iv_ruleWaitForVote= ruleWaitForVote EOF
            {
             newCompositeNode(grammarAccess.getWaitForVoteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWaitForVote_in_entryRuleWaitForVote2661);
            iv_ruleWaitForVote=ruleWaitForVote();

            state._fsp--;

             current =iv_ruleWaitForVote; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWaitForVote2671); 

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
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1211:1: ruleWaitForVote returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleWaitForVote() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1214:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1215:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1215:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1215:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1215:2: ( (otherlv_0= RULE_ID ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1216:1: (otherlv_0= RULE_ID )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1216:1: (otherlv_0= RULE_ID )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1217:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWaitForVoteRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleWaitForVote2716); 

            		newLeafNode(otherlv_0, grammarAccess.getWaitForVoteAccess().getRolesRoleCrossReference_0_0()); 
            	

            }


            }

            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1228:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==16) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==RULE_ID) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1228:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleWaitForVote2729); 

            	        	newLeafNode(otherlv_1, grammarAccess.getWaitForVoteAccess().getCommaKeyword_1_0());
            	        
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1232:1: ( (otherlv_2= RULE_ID ) )
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1233:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1233:1: (otherlv_2= RULE_ID )
            	    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1234:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getWaitForVoteRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleWaitForVote2749); 

            	    		newLeafNode(otherlv_2, grammarAccess.getWaitForVoteAccess().getRolesRoleCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1253:1: ruleCollaborationType returns [Enumerator current=null] : ( (enumLiteral_0= 'Task' ) | (enumLiteral_1= 'Patch' ) | (enumLiteral_2= 'Comment' ) ) ;
    public final Enumerator ruleCollaborationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1255:28: ( ( (enumLiteral_0= 'Task' ) | (enumLiteral_1= 'Patch' ) | (enumLiteral_2= 'Comment' ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1256:1: ( (enumLiteral_0= 'Task' ) | (enumLiteral_1= 'Patch' ) | (enumLiteral_2= 'Comment' ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1256:1: ( (enumLiteral_0= 'Task' ) | (enumLiteral_1= 'Patch' ) | (enumLiteral_2= 'Comment' ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt21=1;
                }
                break;
            case 30:
                {
                alt21=2;
                }
                break;
            case 31:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1256:2: (enumLiteral_0= 'Task' )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1256:2: (enumLiteral_0= 'Task' )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1256:4: enumLiteral_0= 'Task'
                    {
                    enumLiteral_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCollaborationType2801); 

                            current = grammarAccess.getCollaborationTypeAccess().getTASKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCollaborationTypeAccess().getTASKEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1262:6: (enumLiteral_1= 'Patch' )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1262:6: (enumLiteral_1= 'Patch' )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1262:8: enumLiteral_1= 'Patch'
                    {
                    enumLiteral_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCollaborationType2818); 

                            current = grammarAccess.getCollaborationTypeAccess().getPATCHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCollaborationTypeAccess().getPATCHEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1268:6: (enumLiteral_2= 'Comment' )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1268:6: (enumLiteral_2= 'Comment' )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1268:8: enumLiteral_2= 'Comment'
                    {
                    enumLiteral_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCollaborationType2835); 

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


    // $ANTLR start "ruleRangeType"
    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1278:1: ruleRangeType returns [Enumerator current=null] : ( (enumLiteral_0= 'Present' ) | (enumLiteral_1= 'Qualified' ) ) ;
    public final Enumerator ruleRangeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1280:28: ( ( (enumLiteral_0= 'Present' ) | (enumLiteral_1= 'Qualified' ) ) )
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1281:1: ( (enumLiteral_0= 'Present' ) | (enumLiteral_1= 'Qualified' ) )
            {
            // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1281:1: ( (enumLiteral_0= 'Present' ) | (enumLiteral_1= 'Qualified' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            else if ( (LA22_0==39) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1281:2: (enumLiteral_0= 'Present' )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1281:2: (enumLiteral_0= 'Present' )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1281:4: enumLiteral_0= 'Present'
                    {
                    enumLiteral_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleRangeType2880); 

                            current = grammarAccess.getRangeTypeAccess().getPRESENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRangeTypeAccess().getPRESENTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1287:6: (enumLiteral_1= 'Qualified' )
                    {
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1287:6: (enumLiteral_1= 'Qualified' )
                    // ../fr.inria.atlanmod.decision.strategy.language/src-gen/fr/inria/atlanmod/decision/parser/antlr/internal/InternalStrategy.g:1287:8: enumLiteral_1= 'Qualified'
                    {
                    enumLiteral_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleRangeType2897); 

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
        public static final BitSet FOLLOW_21_in_ruleMajority834 = new BitSet(new long[]{0x00000000E0000000L});
        public static final BitSet FOLLOW_ruleCollaborationType_in_ruleMajority855 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_22_in_ruleMajority868 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFilter_in_ruleMajority884 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleMajority895 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleMajority909 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMajority929 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_16_in_ruleMajority942 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMajority962 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_25_in_ruleMajority976 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_ruleRangeType_in_ruleMajority997 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_26_in_ruleMajority1010 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleMajority1027 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleMajority1046 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMajority1066 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMajority1078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRatioMajority_in_entryRuleRatioMajority1114 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRatioMajority1124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRatioMajority1166 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRatioMajority1183 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleRatioMajority1195 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRatioMajority1207 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleRatioMajority1219 = new BitSet(new long[]{0x00000000E0000000L});
        public static final BitSet FOLLOW_29_in_ruleRatioMajority1232 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_30_in_ruleRatioMajority1250 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_31_in_ruleRatioMajority1268 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_22_in_ruleRatioMajority1282 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFilter_in_ruleRatioMajority1298 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleRatioMajority1309 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleRatioMajority1323 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRatioMajority1343 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_16_in_ruleRatioMajority1356 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRatioMajority1376 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_25_in_ruleRatioMajority1390 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_ruleRangeType_in_ruleRatioMajority1411 = new BitSet(new long[]{0x0000000104000000L});
        public static final BitSet FOLLOW_26_in_ruleRatioMajority1424 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleRatioMajority1441 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleRatioMajority1460 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleRatioMajority1477 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleRatioMajority1494 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRatioMajority1514 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleRatioMajority1526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeaderDriven_in_entryRuleLeaderDriven1562 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLeaderDriven1572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLeaderDriven1614 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleLeaderDriven1631 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleLeaderDriven1643 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleLeaderDriven1655 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleLeaderDriven1667 = new BitSet(new long[]{0x00000000E0000000L});
        public static final BitSet FOLLOW_29_in_ruleLeaderDriven1680 = new BitSet(new long[]{0x0000000400400000L});
        public static final BitSet FOLLOW_30_in_ruleLeaderDriven1698 = new BitSet(new long[]{0x0000000400400000L});
        public static final BitSet FOLLOW_31_in_ruleLeaderDriven1716 = new BitSet(new long[]{0x0000000400400000L});
        public static final BitSet FOLLOW_22_in_ruleLeaderDriven1730 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFilter_in_ruleLeaderDriven1751 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleLeaderDriven1763 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleLeaderDriven1777 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLeaderDriven1797 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleLeaderDriven1809 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLeaderDriven1829 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleLeaderDriven1841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePhasedStrategy_in_entryRulePhasedStrategy1877 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePhasedStrategy1887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePhasedStrategy1929 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePhasedStrategy1946 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_rulePhasedStrategy1958 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePhasedStrategy1970 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_rulePhasedStrategy1982 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePhasedStrategy1994 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePhasedStrategy2014 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_19_in_rulePhasedStrategy2027 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulePhasedStrategy2039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilter_in_entryRuleFilter2076 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFilter2087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFilter2128 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleFilter2146 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFilter2161 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleFilter2181 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFilter2196 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleFilter2214 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFilter2229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeadline_in_entryRuleDeadline2276 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeadline2286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimer_in_ruleDeadline2333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWaitForVote_in_ruleDeadline2360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOCLCondition_in_ruleDeadline2387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimer_in_entryRuleTimer2422 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTimer2432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTimer2483 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTimer2500 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleTimer2517 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleTimer2534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOCLCondition_in_entryRuleOCLCondition2570 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOCLCondition2580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleOCLCondition2621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWaitForVote_in_entryRuleWaitForVote2661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWaitForVote2671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleWaitForVote2716 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleWaitForVote2729 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleWaitForVote2749 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_29_in_ruleCollaborationType2801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleCollaborationType2818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleCollaborationType2835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleRangeType2880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleRangeType2897 = new BitSet(new long[]{0x0000000000000002L});
    }


}