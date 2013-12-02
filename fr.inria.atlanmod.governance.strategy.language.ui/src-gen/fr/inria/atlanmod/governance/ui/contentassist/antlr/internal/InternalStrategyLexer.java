package fr.inria.atlanmod.governance.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStrategyLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=11;
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

    public InternalStrategyLexer() {;} 
    public InternalStrategyLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalStrategyLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:11:7: ( 'Task' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:11:9: 'Task'
            {
            match("Task"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:12:7: ( 'Patch' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:12:9: 'Patch'
            {
            match("Patch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:13:7: ( 'Comment' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:13:9: 'Comment'
            {
            match("Comment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:14:7: ( '=' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:14:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:15:7: ( '!=' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:15:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:16:7: ( 'TaskReview' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:16:9: 'TaskReview'
            {
            match("TaskReview"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:17:7: ( 'PatchReview' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:17:9: 'PatchReview'
            {
            match("PatchReview"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:18:7: ( 'Release' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:18:9: 'Release'
            {
            match("Release"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:19:7: ( 'Present' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:19:9: 'Present'
            {
            match("Present"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:20:7: ( 'Qualified' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:20:9: 'Qualified'
            {
            match("Qualified"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:21:7: ( 'Project' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:21:9: 'Project'
            {
            match("Project"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:22:7: ( '{' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:22:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:23:7: ( '}' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:23:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:24:7: ( 'Roles' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:24:9: 'Roles'
            {
            match("Roles"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:25:7: ( ':' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:25:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:26:7: ( ',' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:26:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:27:7: ( 'Deadlines' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:27:9: 'Deadlines'
            {
            match("Deadlines"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:28:7: ( 'Strategies' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:28:9: 'Strategies'
            {
            match("Strategies"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:29:7: ( 'Majority' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:29:9: 'Majority'
            {
            match("Majority"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:30:7: ( 'applied to' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:30:9: 'applied to'
            {
            match("applied to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:31:7: ( 'when' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:31:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:32:7: ( 'people' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:32:9: 'people'
            {
            match("people"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:33:7: ( 'range' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:33:9: 'range'
            {
            match("range"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:34:7: ( 'deadline' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:34:9: 'deadline'
            {
            match("deadline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:35:7: ( '(' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:35:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:36:7: ( ')' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:36:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:37:7: ( 'minVotes' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:37:9: 'minVotes'
            {
            match("minVotes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:38:7: ( 'Ratio' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:38:9: 'Ratio'
            {
            match("Ratio"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:39:7: ( 'ratio' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:39:9: 'ratio'
            {
            match("ratio"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:40:7: ( 'LeaderDriven' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:40:9: 'LeaderDriven'
            {
            match("LeaderDriven"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:41:7: ( 'default' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:41:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:42:7: ( 'phases' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:42:9: 'phases'
            {
            match("phases"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:43:7: ( 'days' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:43:9: 'days'
            {
            match("days"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5191:12: ( ( ( '-' | '+' )? ( RULE_INT '.' RULE_INT | '.' RULE_INT | RULE_INT '.' ) ( 'e' ( '-' | '+' ) RULE_INT )? | '1' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5191:14: ( ( '-' | '+' )? ( RULE_INT '.' RULE_INT | '.' RULE_INT | RULE_INT '.' ) ( 'e' ( '-' | '+' ) RULE_INT )? | '1' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5191:14: ( ( '-' | '+' )? ( RULE_INT '.' RULE_INT | '.' RULE_INT | RULE_INT '.' ) ( 'e' ( '-' | '+' ) RULE_INT )? | '1' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='+'||(LA4_0>='-' && LA4_0<='.')||LA4_0=='0'||(LA4_0>='2' && LA4_0<='9')) ) {
                alt4=1;
            }
            else if ( (LA4_0=='1') ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2=='.'||(LA4_2>='0' && LA4_2<='9')) ) {
                    alt4=1;
                }
                else {
                    alt4=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5191:15: ( '-' | '+' )? ( RULE_INT '.' RULE_INT | '.' RULE_INT | RULE_INT '.' ) ( 'e' ( '-' | '+' ) RULE_INT )?
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5191:15: ( '-' | '+' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0=='+'||LA1_0=='-') ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5191:26: ( RULE_INT '.' RULE_INT | '.' RULE_INT | RULE_INT '.' )
                    int alt2=3;
                    alt2 = dfa2.predict(input);
                    switch (alt2) {
                        case 1 :
                            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5191:27: RULE_INT '.' RULE_INT
                            {
                            mRULE_INT(); 
                            match('.'); 
                            mRULE_INT(); 

                            }
                            break;
                        case 2 :
                            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5191:49: '.' RULE_INT
                            {
                            match('.'); 
                            mRULE_INT(); 

                            }
                            break;
                        case 3 :
                            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5191:62: RULE_INT '.'
                            {
                            mRULE_INT(); 
                            match('.'); 

                            }
                            break;

                    }

                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5191:76: ( 'e' ( '-' | '+' ) RULE_INT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='e') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5191:77: 'e' ( '-' | '+' ) RULE_INT
                            {
                            match('e'); 
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            mRULE_INT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5191:102: '1'
                    {
                    match('1'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5193:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5193:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5193:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5193:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5193:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5195:10: ( ( '0' .. '9' )+ )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5195:12: ( '0' .. '9' )+
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5195:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5195:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5197:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5197:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5197:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5197:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5197:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5197:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5197:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5197:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5197:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5197:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5197:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5199:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5199:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5199:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5199:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5201:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5201:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5201:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5201:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5201:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5201:41: ( '\\r' )? '\\n'
                    {
                    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5201:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5201:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5203:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5203:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5203:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5205:16: ( . )
            // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:5205:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_FLOAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=41;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:208: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 35 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:219: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 36 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:227: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 37 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:236: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 38 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:248: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 39 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:264: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 40 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:280: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 41 :
                // ../fr.inria.atlanmod.governance.strategy.language.ui/src-gen/fr/inria/atlanmod/governance/ui/contentassist/antlr/internal/InternalStrategy.g:1:288: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA2_eotS =
        "\3\uffff\1\4\2\uffff";
    static final String DFA2_eofS =
        "\6\uffff";
    static final String DFA2_minS =
        "\2\56\1\uffff\1\60\2\uffff";
    static final String DFA2_maxS =
        "\2\71\1\uffff\1\71\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\uffff\1\3\1\1";
    static final String DFA2_specialS =
        "\6\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1",
            "",
            "\12\5",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    static class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "5191:26: ( RULE_INT '.' RULE_INT | '.' RULE_INT | RULE_INT '.' )";
        }
    }
    static final String DFA16_eotS =
        "\1\uffff\3\44\1\uffff\1\42\2\44\4\uffff\10\44\2\uffff\2\44\1\42"+
        "\1\100\1\42\1\102\1\42\1\uffff\3\42\2\uffff\1\44\1\uffff\3\44\2"+
        "\uffff\4\44\4\uffff\12\44\2\uffff\2\44\1\uffff\1\102\5\uffff\27"+
        "\44\1\166\14\44\1\u0083\6\44\1\u008a\3\44\1\uffff\1\u008f\4\44\1"+
        "\u0094\1\u0095\5\44\1\uffff\2\44\1\u009d\1\u009e\2\44\1\uffff\4"+
        "\44\1\uffff\4\44\2\uffff\5\44\1\u00ae\1\u00af\2\uffff\6\44\1\u00b6"+
        "\1\u00b7\1\u00b8\1\u00b9\5\44\2\uffff\1\44\1\u00c0\4\44\4\uffff"+
        "\3\44\1\u00c8\1\uffff\1\u00c9\1\uffff\1\u00ca\3\44\1\u00ce\1\u00cf"+
        "\1\44\3\uffff\1\44\1\u00d2\1\44\2\uffff\1\u00d4\1\44\1\uffff\1\u00d6"+
        "\1\uffff\1\44\1\uffff\1\u00d8\1\uffff";
    static final String DFA16_eofS =
        "\u00d9\uffff";
    static final String DFA16_minS =
        "\1\0\2\141\1\157\1\uffff\1\75\1\141\1\165\4\uffff\1\145\1\164\1"+
        "\141\1\160\1\150\1\145\2\141\2\uffff\1\151\1\145\1\56\2\60\1\56"+
        "\1\101\1\uffff\2\0\1\52\2\uffff\1\163\1\uffff\1\164\1\145\1\155"+
        "\2\uffff\2\154\1\164\1\141\4\uffff\1\141\1\162\1\152\1\160\1\145"+
        "\1\157\1\141\1\156\1\141\1\171\2\uffff\1\156\1\141\1\uffff\1\56"+
        "\5\uffff\1\153\1\143\1\163\1\152\1\155\2\145\1\151\1\154\1\144\1"+
        "\141\1\157\1\154\1\156\1\160\1\163\1\147\1\151\1\144\1\141\1\163"+
        "\1\126\1\144\1\60\1\150\3\145\1\141\1\163\1\157\1\151\1\154\1\164"+
        "\1\162\1\151\1\60\1\154\2\145\1\157\1\154\1\165\1\60\1\157\2\145"+
        "\1\uffff\1\60\1\156\1\143\1\156\1\163\2\60\1\146\1\151\1\145\1\151"+
        "\1\145\1\uffff\1\145\1\163\2\60\1\151\1\154\1\uffff\1\164\1\162"+
        "\1\166\1\145\1\uffff\3\164\1\145\2\uffff\1\151\1\156\1\147\1\164"+
        "\1\144\2\60\2\uffff\1\156\1\164\1\145\1\104\1\151\1\166\4\60\2\145"+
        "\1\151\1\171\1\40\2\uffff\1\145\1\60\1\163\1\162\1\145\1\151\4\uffff"+
        "\1\144\1\163\1\145\1\60\1\uffff\1\60\1\uffff\1\60\1\151\1\167\1"+
        "\145\2\60\1\163\3\uffff\1\166\1\60\1\167\2\uffff\1\60\1\145\1\uffff"+
        "\1\60\1\uffff\1\156\1\uffff\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\141\1\162\1\157\1\uffff\1\75\1\157\1\165\4\uffff\1\145"+
        "\1\164\1\141\1\160\2\150\1\141\1\145\2\uffff\1\151\1\145\4\71\1"+
        "\172\1\uffff\2\uffff\1\57\2\uffff\1\163\1\uffff\1\164\1\157\1\155"+
        "\2\uffff\2\154\1\164\1\141\4\uffff\1\141\1\162\1\152\1\160\1\145"+
        "\1\157\1\141\1\164\1\146\1\171\2\uffff\1\156\1\141\1\uffff\1\71"+
        "\5\uffff\1\153\1\143\1\163\1\152\1\155\2\145\1\151\1\154\1\144\1"+
        "\141\1\157\1\154\1\156\1\160\1\163\1\147\1\151\1\144\1\141\1\163"+
        "\1\126\1\144\1\172\1\150\3\145\1\141\1\163\1\157\1\151\1\154\1\164"+
        "\1\162\1\151\1\172\1\154\2\145\1\157\1\154\1\165\1\172\1\157\2\145"+
        "\1\uffff\1\172\1\156\1\143\1\156\1\163\2\172\1\146\1\151\1\145\1"+
        "\151\1\145\1\uffff\1\145\1\163\2\172\1\151\1\154\1\uffff\1\164\1"+
        "\162\1\166\1\145\1\uffff\3\164\1\145\2\uffff\1\151\1\156\1\147\1"+
        "\164\1\144\2\172\2\uffff\1\156\1\164\1\145\1\104\1\151\1\166\4\172"+
        "\2\145\1\151\1\171\1\40\2\uffff\1\145\1\172\1\163\1\162\1\145\1"+
        "\151\4\uffff\1\144\1\163\1\145\1\172\1\uffff\1\172\1\uffff\1\172"+
        "\1\151\1\167\1\145\2\172\1\163\3\uffff\1\166\1\172\1\167\2\uffff"+
        "\1\172\1\145\1\uffff\1\172\1\uffff\1\156\1\uffff\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\4\uffff\1\4\3\uffff\1\14\1\15\1\17\1\20\10\uffff\1\31\1\32\7\uffff"+
        "\1\43\3\uffff\1\50\1\51\1\uffff\1\43\3\uffff\1\4\1\5\4\uffff\1\14"+
        "\1\15\1\17\1\20\12\uffff\1\31\1\32\2\uffff\1\42\1\uffff\1\44\1\45"+
        "\1\46\1\47\1\50\57\uffff\1\1\14\uffff\1\25\6\uffff\1\41\4\uffff"+
        "\1\2\4\uffff\1\16\1\34\7\uffff\1\27\1\35\17\uffff\1\26\1\40\6\uffff"+
        "\1\11\1\13\1\3\1\10\4\uffff\1\24\1\uffff\1\37\7\uffff\1\23\1\30"+
        "\1\33\3\uffff\1\12\1\21\2\uffff\1\6\1\uffff\1\22\1\uffff\1\7\1\uffff"+
        "\1\36";
    static final String DFA16_specialS =
        "\1\2\35\uffff\1\0\1\1\u00b9\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\5\1\36\4\42\1\37\1\24\1"+
            "\25\1\42\1\30\1\13\1\30\1\32\1\40\1\33\1\31\10\33\1\12\2\42"+
            "\1\4\3\42\2\35\1\3\1\14\7\35\1\27\1\16\2\35\1\2\1\7\1\6\1\15"+
            "\1\1\6\35\3\42\1\34\1\35\1\42\1\17\2\35\1\23\10\35\1\26\2\35"+
            "\1\21\1\35\1\22\4\35\1\20\3\35\1\10\1\42\1\11\uff82\42",
            "\1\43",
            "\1\45\20\uffff\1\46",
            "\1\47",
            "",
            "\1\51",
            "\1\54\3\uffff\1\52\11\uffff\1\53",
            "\1\55",
            "",
            "",
            "",
            "",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67\2\uffff\1\70",
            "\1\71",
            "\1\73\3\uffff\1\72",
            "",
            "",
            "\1\76",
            "\1\77",
            "\1\100\1\uffff\12\100",
            "\12\101",
            "\12\100",
            "\1\100\1\uffff\12\101",
            "\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\0\103",
            "\0\103",
            "\1\104\4\uffff\1\105",
            "",
            "",
            "\1\107",
            "",
            "\1\110",
            "\1\111\11\uffff\1\112",
            "\1\113",
            "",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "",
            "",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127\5\uffff\1\130",
            "\1\131\4\uffff\1\132",
            "\1\133",
            "",
            "",
            "\1\134",
            "\1\135",
            "",
            "\1\100\1\uffff\12\101",
            "",
            "",
            "",
            "",
            "",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\44\7\uffff\21\44\1\165\10\44\4\uffff\1\44\1\uffff\32\44",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "",
            "\12\44\7\uffff\21\44\1\u008e\10\44\4\uffff\1\44\1\uffff\32"+
            "\44",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\u009b",
            "\1\u009c",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u009f",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "",
            "",
            "\1\u00bf",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "",
            "",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00d0",
            "",
            "",
            "",
            "\1\u00d1",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00d3",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00d5",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00d7",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_FLOAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_30 = input.LA(1);

                        s = -1;
                        if ( ((LA16_30>='\u0000' && LA16_30<='\uFFFF')) ) {s = 67;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_31 = input.LA(1);

                        s = -1;
                        if ( ((LA16_31>='\u0000' && LA16_31<='\uFFFF')) ) {s = 67;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='T') ) {s = 1;}

                        else if ( (LA16_0=='P') ) {s = 2;}

                        else if ( (LA16_0=='C') ) {s = 3;}

                        else if ( (LA16_0=='=') ) {s = 4;}

                        else if ( (LA16_0=='!') ) {s = 5;}

                        else if ( (LA16_0=='R') ) {s = 6;}

                        else if ( (LA16_0=='Q') ) {s = 7;}

                        else if ( (LA16_0=='{') ) {s = 8;}

                        else if ( (LA16_0=='}') ) {s = 9;}

                        else if ( (LA16_0==':') ) {s = 10;}

                        else if ( (LA16_0==',') ) {s = 11;}

                        else if ( (LA16_0=='D') ) {s = 12;}

                        else if ( (LA16_0=='S') ) {s = 13;}

                        else if ( (LA16_0=='M') ) {s = 14;}

                        else if ( (LA16_0=='a') ) {s = 15;}

                        else if ( (LA16_0=='w') ) {s = 16;}

                        else if ( (LA16_0=='p') ) {s = 17;}

                        else if ( (LA16_0=='r') ) {s = 18;}

                        else if ( (LA16_0=='d') ) {s = 19;}

                        else if ( (LA16_0=='(') ) {s = 20;}

                        else if ( (LA16_0==')') ) {s = 21;}

                        else if ( (LA16_0=='m') ) {s = 22;}

                        else if ( (LA16_0=='L') ) {s = 23;}

                        else if ( (LA16_0=='+'||LA16_0=='-') ) {s = 24;}

                        else if ( (LA16_0=='1') ) {s = 25;}

                        else if ( (LA16_0=='.') ) {s = 26;}

                        else if ( (LA16_0=='0'||(LA16_0>='2' && LA16_0<='9')) ) {s = 27;}

                        else if ( (LA16_0=='^') ) {s = 28;}

                        else if ( ((LA16_0>='A' && LA16_0<='B')||(LA16_0>='E' && LA16_0<='K')||(LA16_0>='N' && LA16_0<='O')||(LA16_0>='U' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='b' && LA16_0<='c')||(LA16_0>='e' && LA16_0<='l')||(LA16_0>='n' && LA16_0<='o')||LA16_0=='q'||(LA16_0>='s' && LA16_0<='v')||(LA16_0>='x' && LA16_0<='z')) ) {s = 29;}

                        else if ( (LA16_0=='\"') ) {s = 30;}

                        else if ( (LA16_0=='\'') ) {s = 31;}

                        else if ( (LA16_0=='/') ) {s = 32;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 33;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||(LA16_0>='#' && LA16_0<='&')||LA16_0=='*'||(LA16_0>=';' && LA16_0<='<')||(LA16_0>='>' && LA16_0<='@')||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}