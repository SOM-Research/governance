/*
* generated by Xtext
*/
package fr.inria.atlanmod.governance.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import fr.inria.atlanmod.governance.services.StrategyGrammarAccess;

public class StrategyParser extends AbstractContentAssistParser {
	
	@Inject
	private StrategyGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected fr.inria.atlanmod.governance.ui.contentassist.antlr.internal.InternalStrategyParser createParser() {
		fr.inria.atlanmod.governance.ui.contentassist.antlr.internal.InternalStrategyParser result = new fr.inria.atlanmod.governance.ui.contentassist.antlr.internal.InternalStrategyParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getStrategyAccess().getAlternatives(), "rule__Strategy__Alternatives");
					put(grammarAccess.getRatioMajorityAccess().getAlternatives_5(), "rule__RatioMajority__Alternatives_5");
					put(grammarAccess.getLeaderDrivenAccess().getAlternatives_5(), "rule__LeaderDriven__Alternatives_5");
					put(grammarAccess.getFilterAccess().getAlternatives_0_1(), "rule__Filter__Alternatives_0_1");
					put(grammarAccess.getFilterAccess().getAlternatives_1_2(), "rule__Filter__Alternatives_1_2");
					put(grammarAccess.getDeadlineAccess().getAlternatives(), "rule__Deadline__Alternatives");
					put(grammarAccess.getCollaborationTypeAccess().getAlternatives(), "rule__CollaborationType__Alternatives");
					put(grammarAccess.getStageTypeAccess().getAlternatives(), "rule__StageType__Alternatives");
					put(grammarAccess.getRangeTypeAccess().getAlternatives(), "rule__RangeType__Alternatives");
					put(grammarAccess.getProjectAccess().getGroup(), "rule__Project__Group__0");
					put(grammarAccess.getProjectAccess().getGroup_4(), "rule__Project__Group_4__0");
					put(grammarAccess.getProjectAccess().getGroup_4_3(), "rule__Project__Group_4_3__0");
					put(grammarAccess.getProjectAccess().getGroup_5(), "rule__Project__Group_5__0");
					put(grammarAccess.getProjectAccess().getGroup_5_3(), "rule__Project__Group_5_3__0");
					put(grammarAccess.getProjectAccess().getGroup_6(), "rule__Project__Group_6__0");
					put(grammarAccess.getProjectAccess().getGroup_6_3(), "rule__Project__Group_6_3__0");
					put(grammarAccess.getMajorityAccess().getGroup(), "rule__Majority__Group__0");
					put(grammarAccess.getMajorityAccess().getGroup_6(), "rule__Majority__Group_6__0");
					put(grammarAccess.getMajorityAccess().getGroup_11(), "rule__Majority__Group_11__0");
					put(grammarAccess.getMajorityAccess().getGroup_14(), "rule__Majority__Group_14__0");
					put(grammarAccess.getRatioMajorityAccess().getGroup(), "rule__RatioMajority__Group__0");
					put(grammarAccess.getRatioMajorityAccess().getGroup_6(), "rule__RatioMajority__Group_6__0");
					put(grammarAccess.getRatioMajorityAccess().getGroup_11(), "rule__RatioMajority__Group_11__0");
					put(grammarAccess.getRatioMajorityAccess().getGroup_14(), "rule__RatioMajority__Group_14__0");
					put(grammarAccess.getLeaderDrivenAccess().getGroup(), "rule__LeaderDriven__Group__0");
					put(grammarAccess.getLeaderDrivenAccess().getGroup_6(), "rule__LeaderDriven__Group_6__0");
					put(grammarAccess.getPhasedStrategyAccess().getGroup(), "rule__PhasedStrategy__Group__0");
					put(grammarAccess.getFilterAccess().getGroup(), "rule__Filter__Group__0");
					put(grammarAccess.getFilterAccess().getGroup_0(), "rule__Filter__Group_0__0");
					put(grammarAccess.getFilterAccess().getGroup_1(), "rule__Filter__Group_1__0");
					put(grammarAccess.getTimerAccess().getGroup(), "rule__Timer__Group__0");
					put(grammarAccess.getWaitForVoteAccess().getGroup(), "rule__WaitForVote__Group__0");
					put(grammarAccess.getWaitForVoteAccess().getGroup_1(), "rule__WaitForVote__Group_1__0");
					put(grammarAccess.getProjectAccess().getNameAssignment_2(), "rule__Project__NameAssignment_2");
					put(grammarAccess.getProjectAccess().getRolesAssignment_4_2(), "rule__Project__RolesAssignment_4_2");
					put(grammarAccess.getProjectAccess().getRolesAssignment_4_3_1(), "rule__Project__RolesAssignment_4_3_1");
					put(grammarAccess.getProjectAccess().getDeadlinesAssignment_5_2(), "rule__Project__DeadlinesAssignment_5_2");
					put(grammarAccess.getProjectAccess().getDeadlinesAssignment_5_3_1(), "rule__Project__DeadlinesAssignment_5_3_1");
					put(grammarAccess.getProjectAccess().getStrategiesAssignment_6_2(), "rule__Project__StrategiesAssignment_6_2");
					put(grammarAccess.getProjectAccess().getStrategiesAssignment_6_3_1(), "rule__Project__StrategiesAssignment_6_3_1");
					put(grammarAccess.getRoleAccess().getNameAssignment(), "rule__Role__NameAssignment");
					put(grammarAccess.getMajorityAccess().getNameAssignment_0(), "rule__Majority__NameAssignment_0");
					put(grammarAccess.getMajorityAccess().getAppliedToAssignment_5(), "rule__Majority__AppliedToAssignment_5");
					put(grammarAccess.getMajorityAccess().getStageAssignment_8(), "rule__Majority__StageAssignment_8");
					put(grammarAccess.getMajorityAccess().getPeopleAssignment_10(), "rule__Majority__PeopleAssignment_10");
					put(grammarAccess.getMajorityAccess().getPeopleAssignment_11_1(), "rule__Majority__PeopleAssignment_11_1");
					put(grammarAccess.getMajorityAccess().getRangeAssignment_13(), "rule__Majority__RangeAssignment_13");
					put(grammarAccess.getMajorityAccess().getMinVotesAssignment_14_1(), "rule__Majority__MinVotesAssignment_14_1");
					put(grammarAccess.getMajorityAccess().getDeadlineAssignment_16(), "rule__Majority__DeadlineAssignment_16");
					put(grammarAccess.getRatioMajorityAccess().getNameAssignment_0(), "rule__RatioMajority__NameAssignment_0");
					put(grammarAccess.getRatioMajorityAccess().getStageAssignment_8(), "rule__RatioMajority__StageAssignment_8");
					put(grammarAccess.getRatioMajorityAccess().getPeopleAssignment_10(), "rule__RatioMajority__PeopleAssignment_10");
					put(grammarAccess.getRatioMajorityAccess().getPeopleAssignment_11_1(), "rule__RatioMajority__PeopleAssignment_11_1");
					put(grammarAccess.getRatioMajorityAccess().getRangeAssignment_13(), "rule__RatioMajority__RangeAssignment_13");
					put(grammarAccess.getRatioMajorityAccess().getMinVotesAssignment_14_1(), "rule__RatioMajority__MinVotesAssignment_14_1");
					put(grammarAccess.getRatioMajorityAccess().getRatioAssignment_16(), "rule__RatioMajority__RatioAssignment_16");
					put(grammarAccess.getRatioMajorityAccess().getDeadlineAssignment_18(), "rule__RatioMajority__DeadlineAssignment_18");
					put(grammarAccess.getLeaderDrivenAccess().getNameAssignment_0(), "rule__LeaderDriven__NameAssignment_0");
					put(grammarAccess.getLeaderDrivenAccess().getFilterAssignment_6_1(), "rule__LeaderDriven__FilterAssignment_6_1");
					put(grammarAccess.getLeaderDrivenAccess().getStageAssignment_8(), "rule__LeaderDriven__StageAssignment_8");
					put(grammarAccess.getLeaderDrivenAccess().getDefaultAssignment_10(), "rule__LeaderDriven__DefaultAssignment_10");
					put(grammarAccess.getLeaderDrivenAccess().getDeadlineAssignment_12(), "rule__LeaderDriven__DeadlineAssignment_12");
					put(grammarAccess.getPhasedStrategyAccess().getNameAssignment_0(), "rule__PhasedStrategy__NameAssignment_0");
					put(grammarAccess.getPhasedStrategyAccess().getPhasesAssignment_6(), "rule__PhasedStrategy__PhasesAssignment_6");
					put(grammarAccess.getTimerAccess().getNameAssignment_1(), "rule__Timer__NameAssignment_1");
					put(grammarAccess.getTimerAccess().getTimeStampAssignment_3(), "rule__Timer__TimeStampAssignment_3");
					put(grammarAccess.getOCLConditionAccess().getOclExpressionAssignment(), "rule__OCLCondition__OclExpressionAssignment");
					put(grammarAccess.getWaitForVoteAccess().getRolesAssignment_0(), "rule__WaitForVote__RolesAssignment_0");
					put(grammarAccess.getWaitForVoteAccess().getRolesAssignment_1_1(), "rule__WaitForVote__RolesAssignment_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			fr.inria.atlanmod.governance.ui.contentassist.antlr.internal.InternalStrategyParser typedParser = (fr.inria.atlanmod.governance.ui.contentassist.antlr.internal.InternalStrategyParser) parser;
			typedParser.entryRuleProject();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public StrategyGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(StrategyGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}