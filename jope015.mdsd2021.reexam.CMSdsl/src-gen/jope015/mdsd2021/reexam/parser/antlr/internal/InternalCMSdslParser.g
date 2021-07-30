/*
 * generated by Xtext 2.22.0
 */
parser grammar InternalCMSdslParser;

options {
	tokenVocab=InternalCMSdslLexer;
	superClass=AbstractInternalAntlrParser;
}

@header {
package jope015.mdsd2021.reexam.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import jope015.mdsd2021.reexam.services.CMSdslGrammarAccess;

}

@members {

 	private CMSdslGrammarAccess grammarAccess;

    public InternalCMSdslParser(TokenStream input, CMSdslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Project";
   	}

   	@Override
   	protected CMSdslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProject
entryRuleProject returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProjectRule()); }
	iv_ruleProject=ruleProject
	{ $current=$iv_ruleProject.current; }
	EOF;

// Rule Project
ruleProject returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Project
		{
			newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getProjectKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProjectRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=Colon
		{
			newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getColonKeyword_2());
		}
		this_BEGIN_3=RULE_BEGIN
		{
			newLeafNode(this_BEGIN_3, grammarAccess.getProjectAccess().getBEGINTerminalRuleCall_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProjectAccess().getElementsPrimaryElementParserRuleCall_4_0());
				}
				lv_elements_4_0=rulePrimaryElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProjectRule());
					}
					add(
						$current,
						"elements",
						lv_elements_4_0,
						"jope015.mdsd2021.reexam.CMSdsl.PrimaryElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		this_END_5=RULE_END
		{
			newLeafNode(this_END_5, grammarAccess.getProjectAccess().getENDTerminalRuleCall_5());
		}
	)
;

// Entry rule entryRulePrimaryElement
entryRulePrimaryElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryElementRule()); }
	iv_rulePrimaryElement=rulePrimaryElement
	{ $current=$iv_rulePrimaryElement.current; }
	EOF;

// Rule PrimaryElement
rulePrimaryElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPrimaryElementAccess().getDBConfigParserRuleCall_0());
		}
		this_DBConfig_0=ruleDBConfig
		{
			$current = $this_DBConfig_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryElementAccess().getEntityParserRuleCall_1());
		}
		this_Entity_1=ruleEntity
		{
			$current = $this_Entity_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDBConfig
entryRuleDBConfig returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDBConfigRule()); }
	iv_ruleDBConfig=ruleDBConfig
	{ $current=$iv_ruleDBConfig.current; }
	EOF;

// Rule DBConfig
ruleDBConfig returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDBConfigAccess().getDBConfigAction_0(),
					$current);
			}
		)
		(
			(
				lv_type_1_0=Database
				{
					newLeafNode(lv_type_1_0, grammarAccess.getDBConfigAccess().getTypeDatabaseKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDBConfigRule());
					}
					setWithLastConsumed($current, "type", lv_type_1_0, "database");
				}
			)
		)
		otherlv_2=Colon
		{
			newLeafNode(otherlv_2, grammarAccess.getDBConfigAccess().getColonKeyword_2());
		}
		this_BEGIN_3=RULE_BEGIN
		{
			newLeafNode(this_BEGIN_3, grammarAccess.getDBConfigAccess().getBEGINTerminalRuleCall_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDBConfigAccess().getConfigDBDeclParserRuleCall_4_0());
				}
				lv_config_4_0=ruleDBDecl
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDBConfigRule());
					}
					add(
						$current,
						"config",
						lv_config_4_0,
						"jope015.mdsd2021.reexam.CMSdsl.DBDecl");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		this_END_5=RULE_END
		{
			newLeafNode(this_END_5, grammarAccess.getDBConfigAccess().getENDTerminalRuleCall_5());
		}
	)
;

// Entry rule entryRuleDBDecl
entryRuleDBDecl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDBDeclRule()); }
	iv_ruleDBDecl=ruleDBDecl
	{ $current=$iv_ruleDBDecl.current; }
	EOF;

// Rule DBDecl
ruleDBDecl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getDBDeclAccess().getLibAction_0_0(),
						$current);
				}
			)
			(
				(
					lv_type_1_0=Library
					{
						newLeafNode(lv_type_1_0, grammarAccess.getDBDeclAccess().getTypeLibraryKeyword_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDBDeclRule());
						}
						setWithLastConsumed($current, "type", lv_type_1_0, "library");
					}
				)
			)
			otherlv_2=Colon
			{
				newLeafNode(otherlv_2, grammarAccess.getDBDeclAccess().getColonKeyword_0_2());
			}
			(
				(
					lv_value_3_0=RULE_STRING
					{
						newLeafNode(lv_value_3_0, grammarAccess.getDBDeclAccess().getValueSTRINGTerminalRuleCall_0_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDBDeclRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_3_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getDBDeclAccess().getHostAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_type_5_0=Hostname
					{
						newLeafNode(lv_type_5_0, grammarAccess.getDBDeclAccess().getTypeHostnameKeyword_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDBDeclRule());
						}
						setWithLastConsumed($current, "type", lv_type_5_0, "hostname");
					}
				)
			)
			otherlv_6=Colon
			{
				newLeafNode(otherlv_6, grammarAccess.getDBDeclAccess().getColonKeyword_1_2());
			}
			(
				(
					lv_value_7_0=RULE_STRING
					{
						newLeafNode(lv_value_7_0, grammarAccess.getDBDeclAccess().getValueSTRINGTerminalRuleCall_1_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDBDeclRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_7_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getDBDeclAccess().getPortAction_2_0(),
						$current);
				}
			)
			(
				(
					lv_type_9_0=Port
					{
						newLeafNode(lv_type_9_0, grammarAccess.getDBDeclAccess().getTypePortKeyword_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDBDeclRule());
						}
						setWithLastConsumed($current, "type", lv_type_9_0, "port");
					}
				)
			)
			otherlv_10=Colon
			{
				newLeafNode(otherlv_10, grammarAccess.getDBDeclAccess().getColonKeyword_2_2());
			}
			(
				(
					lv_value_11_0=RULE_INT
					{
						newLeafNode(lv_value_11_0, grammarAccess.getDBDeclAccess().getValueINTTerminalRuleCall_2_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDBDeclRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_11_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getDBDeclAccess().getDialectAction_3_0(),
						$current);
				}
			)
			(
				(
					lv_type_13_0=Dialect
					{
						newLeafNode(lv_type_13_0, grammarAccess.getDBDeclAccess().getTypeDialectKeyword_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDBDeclRule());
						}
						setWithLastConsumed($current, "type", lv_type_13_0, "dialect");
					}
				)
			)
			otherlv_14=Colon
			{
				newLeafNode(otherlv_14, grammarAccess.getDBDeclAccess().getColonKeyword_3_2());
			}
			(
				(
					lv_value_15_0=RULE_STRING
					{
						newLeafNode(lv_value_15_0, grammarAccess.getDBDeclAccess().getValueSTRINGTerminalRuleCall_3_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDBDeclRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_15_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getDBDeclAccess().getUserAction_4_0(),
						$current);
				}
			)
			(
				(
					lv_type_17_0=Username
					{
						newLeafNode(lv_type_17_0, grammarAccess.getDBDeclAccess().getTypeUsernameKeyword_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDBDeclRule());
						}
						setWithLastConsumed($current, "type", lv_type_17_0, "username");
					}
				)
			)
			otherlv_18=Colon
			{
				newLeafNode(otherlv_18, grammarAccess.getDBDeclAccess().getColonKeyword_4_2());
			}
			(
				(
					lv_value_19_0=RULE_STRING
					{
						newLeafNode(lv_value_19_0, grammarAccess.getDBDeclAccess().getValueSTRINGTerminalRuleCall_4_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDBDeclRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_19_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getDBDeclAccess().getPassAction_5_0(),
						$current);
				}
			)
			(
				(
					lv_type_21_0=Password
					{
						newLeafNode(lv_type_21_0, grammarAccess.getDBDeclAccess().getTypePasswordKeyword_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDBDeclRule());
						}
						setWithLastConsumed($current, "type", lv_type_21_0, "password");
					}
				)
			)
			otherlv_22=Colon
			{
				newLeafNode(otherlv_22, grammarAccess.getDBDeclAccess().getColonKeyword_5_2());
			}
			(
				(
					lv_value_23_0=RULE_STRING
					{
						newLeafNode(lv_value_23_0, grammarAccess.getDBDeclAccess().getValueSTRINGTerminalRuleCall_5_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDBDeclRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_23_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	iv_ruleEntity=ruleEntity
	{ $current=$iv_ruleEntity.current; }
	EOF;

// Rule Entity
ruleEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getEntityAccess().getEntityAction_0(),
					$current);
			}
		)
		otherlv_1=Entity
		{
			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=Colon
		{
			newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getColonKeyword_3());
		}
		this_BEGIN_4=RULE_BEGIN
		{
			newLeafNode(this_BEGIN_4, grammarAccess.getEntityAccess().getBEGINTerminalRuleCall_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getModelEntityModelParserRuleCall_5_0());
				}
				lv_model_5_0=ruleEntityModel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					set(
						$current,
						"model",
						lv_model_5_0,
						"jope015.mdsd2021.reexam.CMSdsl.EntityModel");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getServiceEntityServiceParserRuleCall_6_0());
				}
				lv_service_6_0=ruleEntityService
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					set(
						$current,
						"service",
						lv_service_6_0,
						"jope015.mdsd2021.reexam.CMSdsl.EntityService");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getUiEntityUIParserRuleCall_7_0());
				}
				lv_ui_7_0=ruleEntityUI
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					set(
						$current,
						"ui",
						lv_ui_7_0,
						"jope015.mdsd2021.reexam.CMSdsl.EntityUI");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		this_END_8=RULE_END
		{
			newLeafNode(this_END_8, grammarAccess.getEntityAccess().getENDTerminalRuleCall_8());
		}
	)
;

// Entry rule entryRuleEntityModel
entryRuleEntityModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityModelRule()); }
	iv_ruleEntityModel=ruleEntityModel
	{ $current=$iv_ruleEntityModel.current; }
	EOF;

// Rule EntityModel
ruleEntityModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getEntityModelAccess().getEntityModelAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityModelAccess().getFieldsFieldParserRuleCall_1_0());
				}
				lv_fields_1_0=ruleField
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityModelRule());
					}
					add(
						$current,
						"fields",
						lv_fields_1_0,
						"jope015.mdsd2021.reexam.CMSdsl.Field");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleEntityService
entryRuleEntityService returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityServiceRule()); }
	iv_ruleEntityService=ruleEntityService
	{ $current=$iv_ruleEntityService.current; }
	EOF;

// Rule EntityService
ruleEntityService returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getEntityServiceAccess().getEntityServiceAction_0(),
					$current);
			}
		)
		otherlv_1=Service
		{
			newLeafNode(otherlv_1, grammarAccess.getEntityServiceAccess().getServiceKeyword_1());
		}
		otherlv_2=Colon
		{
			newLeafNode(otherlv_2, grammarAccess.getEntityServiceAccess().getColonKeyword_2());
		}
	)
;

// Entry rule entryRuleEntityUI
entryRuleEntityUI returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEntityUIRule()); }
	iv_ruleEntityUI=ruleEntityUI
	{ $current=$iv_ruleEntityUI.current.getText(); }
	EOF;

// Rule EntityUI
ruleEntityUI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw=Ui
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getEntityUIAccess().getUiKeyword());
	}
;

// Entry rule entryRuleField
entryRuleField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFieldRule()); }
	iv_ruleField=ruleField
	{ $current=$iv_ruleField.current; }
	EOF;

// Rule Field
ruleField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getFieldAccess().getTypeDataTypeParserRuleCall_0_0());
				}
				lv_type_0_0=ruleDataType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFieldRule());
					}
					set(
						$current,
						"type",
						lv_type_0_0,
						"jope015.mdsd2021.reexam.CMSdsl.DataType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFieldRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=Colon
		{
			newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getColonKeyword_2());
		}
		this_BEGIN_3=RULE_BEGIN
		{
			newLeafNode(this_BEGIN_3, grammarAccess.getFieldAccess().getBEGINTerminalRuleCall_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFieldAccess().getPropertiesFieldPropParserRuleCall_4_0());
				}
				lv_properties_4_0=ruleFieldProp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFieldRule());
					}
					add(
						$current,
						"properties",
						lv_properties_4_0,
						"jope015.mdsd2021.reexam.CMSdsl.FieldProp");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		this_END_5=RULE_END
		{
			newLeafNode(this_END_5, grammarAccess.getFieldAccess().getENDTerminalRuleCall_5());
		}
	)
;

// Entry rule entryRuleFieldProp
entryRuleFieldProp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFieldPropRule()); }
	iv_ruleFieldProp=ruleFieldProp
	{ $current=$iv_ruleFieldProp.current; }
	EOF;

// Rule FieldProp
ruleFieldProp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getFieldPropAccess().getDefAction_0_0(),
						$current);
				}
			)
			(
				(
					lv_type_1_0=Default
					{
						newLeafNode(lv_type_1_0, grammarAccess.getFieldPropAccess().getTypeDefaultKeyword_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFieldPropRule());
						}
						setWithLastConsumed($current, "type", lv_type_1_0, "default");
					}
				)
			)
			otherlv_2=Colon
			{
				newLeafNode(otherlv_2, grammarAccess.getFieldPropAccess().getColonKeyword_0_2());
			}
			(
				(
					lv_value_3_0=RULE_STRING
					{
						newLeafNode(lv_value_3_0, grammarAccess.getFieldPropAccess().getValueSTRINGTerminalRuleCall_0_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFieldPropRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_3_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getFieldPropAccess().getPropTestAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_type_5_0=Test
					{
						newLeafNode(lv_type_5_0, grammarAccess.getFieldPropAccess().getTypeTestKeyword_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFieldPropRule());
						}
						setWithLastConsumed($current, "type", lv_type_5_0, "test");
					}
				)
			)
			otherlv_6=Colon
			{
				newLeafNode(otherlv_6, grammarAccess.getFieldPropAccess().getColonKeyword_1_2());
			}
			(
				(
					lv_value_7_0=RULE_STRING
					{
						newLeafNode(lv_value_7_0, grammarAccess.getFieldPropAccess().getValueSTRINGTerminalRuleCall_1_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFieldPropRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_7_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleDataType
entryRuleDataType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataTypeRule()); }
	iv_ruleDataType=ruleDataType
	{ $current=$iv_ruleDataType.current; }
	EOF;

// Rule DataType
ruleDataType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getDataTypeAccess().getStrAction_0_0(),
						$current);
				}
			)
			(
				(
					lv_type_1_0=String
					{
						newLeafNode(lv_type_1_0, grammarAccess.getDataTypeAccess().getTypeStringKeyword_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDataTypeRule());
						}
						setWithLastConsumed($current, "type", lv_type_1_0, "string");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getDataTypeAccess().getDtAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_type_3_0=Date
					{
						newLeafNode(lv_type_3_0, grammarAccess.getDataTypeAccess().getTypeDateKeyword_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDataTypeRule());
						}
						setWithLastConsumed($current, "type", lv_type_3_0, "date");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getDataTypeAccess().getIntegAction_2_0(),
						$current);
				}
			)
			(
				(
					lv_type_5_0=Int
					{
						newLeafNode(lv_type_5_0, grammarAccess.getDataTypeAccess().getTypeIntKeyword_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDataTypeRule());
						}
						setWithLastConsumed($current, "type", lv_type_5_0, "int");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getDataTypeAccess().getLngAction_3_0(),
						$current);
				}
			)
			(
				(
					lv_type_7_0=Long
					{
						newLeafNode(lv_type_7_0, grammarAccess.getDataTypeAccess().getTypeLongKeyword_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDataTypeRule());
						}
						setWithLastConsumed($current, "type", lv_type_7_0, "long");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getDataTypeAccess().getBoolAction_4_0(),
						$current);
				}
			)
			(
				(
					lv_type_9_0=Bool
					{
						newLeafNode(lv_type_9_0, grammarAccess.getDataTypeAccess().getTypeBoolKeyword_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDataTypeRule());
						}
						setWithLastConsumed($current, "type", lv_type_9_0, "bool");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getDataTypeAccess().getFltAction_5_0(),
						$current);
				}
			)
			(
				(
					lv_type_11_0=Float
					{
						newLeafNode(lv_type_11_0, grammarAccess.getDataTypeAccess().getTypeFloatKeyword_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDataTypeRule());
						}
						setWithLastConsumed($current, "type", lv_type_11_0, "float");
					}
				)
			)
		)
	)
;