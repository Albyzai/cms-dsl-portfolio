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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCMSdslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Validator", "Database", "Hostname", "Password", "Username", "Belongs", "Default", "Dialect", "Library", "Project", "Success", "Warning", "Entity", "String", "Check", "Error", "False", "Field", "Float", "Bool", "Date", "Eval", "Long", "Many", "Port", "Test", "True", "Has", "Int", "One", "ExclamationMarkEqualsSign", "AmpersandAmpersand", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "EqualsSignGreaterThanSign", "GreaterThanSignEqualsSign", "To", "VerticalLineVerticalLine", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "Solidus", "Colon", "LessThanSign", "GreaterThanSign", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Entity=16;
    public static final int RULE_BEGIN=52;
    public static final int EqualsSignGreaterThanSign=38;
    public static final int Port=28;
    public static final int Check=18;
    public static final int True=30;
    public static final int String=17;
    public static final int False=20;
    public static final int Success=14;
    public static final int LessThanSign=50;
    public static final int LeftParenthesis=42;
    public static final int Bool=23;
    public static final int Test=29;
    public static final int Database=5;
    public static final int To=40;
    public static final int Eval=25;
    public static final int GreaterThanSign=51;
    public static final int RULE_ID=54;
    public static final int Hostname=6;
    public static final int RightParenthesis=43;
    public static final int Belongs=9;
    public static final int GreaterThanSignEqualsSign=39;
    public static final int Project=13;
    public static final int Float=22;
    public static final int EqualsSignEqualsSign=37;
    public static final int PlusSign=45;
    public static final int RULE_INT=55;
    public static final int Long=26;
    public static final int RULE_ML_COMMENT=57;
    public static final int Library=12;
    public static final int Warning=15;
    public static final int RULE_END=53;
    public static final int VerticalLineVerticalLine=41;
    public static final int One=33;
    public static final int RULE_STRING=56;
    public static final int Int=32;
    public static final int RULE_SL_COMMENT=58;
    public static final int Field=21;
    public static final int Comma=46;
    public static final int HyphenMinus=47;
    public static final int AmpersandAmpersand=35;
    public static final int Dialect=11;
    public static final int Many=27;
    public static final int LessThanSignEqualsSign=36;
    public static final int Solidus=48;
    public static final int Colon=49;
    public static final int EOF=-1;
    public static final int Asterisk=44;
    public static final int Password=7;
    public static final int RULE_WS=59;
    public static final int Error=19;
    public static final int RULE_ANY_OTHER=60;
    public static final int Default=10;
    public static final int Date=24;
    public static final int Username=8;
    public static final int Has=31;
    public static final int ExclamationMarkEqualsSign=34;
    public static final int Validator=4;

    // delegates
    // delegators


        public InternalCMSdslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCMSdslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCMSdslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCMSdslParser.g"; }



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




    // $ANTLR start "entryRuleProject"
    // InternalCMSdslParser.g:57:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalCMSdslParser.g:57:48: (iv_ruleProject= ruleProject EOF )
            // InternalCMSdslParser.g:58:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCMSdslParser.g:64:1: ruleProject returns [EObject current=null] : (otherlv_0= Project ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_elements_4_0= rulePrimaryElement ) )* this_END_5= RULE_END ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:70:2: ( (otherlv_0= Project ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_elements_4_0= rulePrimaryElement ) )* this_END_5= RULE_END ) )
            // InternalCMSdslParser.g:71:2: (otherlv_0= Project ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_elements_4_0= rulePrimaryElement ) )* this_END_5= RULE_END )
            {
            // InternalCMSdslParser.g:71:2: (otherlv_0= Project ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_elements_4_0= rulePrimaryElement ) )* this_END_5= RULE_END )
            // InternalCMSdslParser.g:72:3: otherlv_0= Project ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_elements_4_0= rulePrimaryElement ) )* this_END_5= RULE_END
            {
            otherlv_0=(Token)match(input,Project,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getProjectKeyword_0());
            		
            // InternalCMSdslParser.g:76:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCMSdslParser.g:77:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCMSdslParser.g:77:4: (lv_name_1_0= RULE_ID )
            // InternalCMSdslParser.g:78:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getProjectAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalCMSdslParser.g:102:3: ( (lv_elements_4_0= rulePrimaryElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=Validator && LA1_0<=Database)||LA1_0==Entity||LA1_0==Eval) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCMSdslParser.g:103:4: (lv_elements_4_0= rulePrimaryElement )
            	    {
            	    // InternalCMSdslParser.g:103:4: (lv_elements_4_0= rulePrimaryElement )
            	    // InternalCMSdslParser.g:104:5: lv_elements_4_0= rulePrimaryElement
            	    {

            	    					newCompositeNode(grammarAccess.getProjectAccess().getElementsPrimaryElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_elements_4_0=rulePrimaryElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"jope015.mdsd2021.reexam.CMSdsl.PrimaryElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_5, grammarAccess.getProjectAccess().getENDTerminalRuleCall_5());
            		

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


    // $ANTLR start "entryRulePrimaryElement"
    // InternalCMSdslParser.g:129:1: entryRulePrimaryElement returns [EObject current=null] : iv_rulePrimaryElement= rulePrimaryElement EOF ;
    public final EObject entryRulePrimaryElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryElement = null;


        try {
            // InternalCMSdslParser.g:129:55: (iv_rulePrimaryElement= rulePrimaryElement EOF )
            // InternalCMSdslParser.g:130:2: iv_rulePrimaryElement= rulePrimaryElement EOF
            {
             newCompositeNode(grammarAccess.getPrimaryElementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryElement=rulePrimaryElement();

            state._fsp--;

             current =iv_rulePrimaryElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimaryElement"


    // $ANTLR start "rulePrimaryElement"
    // InternalCMSdslParser.g:136:1: rulePrimaryElement returns [EObject current=null] : (this_DBConfig_0= ruleDBConfig | this_Entity_1= ruleEntity | this_Validator_2= ruleValidator | this_Eval_3= ruleEval ) ;
    public final EObject rulePrimaryElement() throws RecognitionException {
        EObject current = null;

        EObject this_DBConfig_0 = null;

        EObject this_Entity_1 = null;

        EObject this_Validator_2 = null;

        EObject this_Eval_3 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:142:2: ( (this_DBConfig_0= ruleDBConfig | this_Entity_1= ruleEntity | this_Validator_2= ruleValidator | this_Eval_3= ruleEval ) )
            // InternalCMSdslParser.g:143:2: (this_DBConfig_0= ruleDBConfig | this_Entity_1= ruleEntity | this_Validator_2= ruleValidator | this_Eval_3= ruleEval )
            {
            // InternalCMSdslParser.g:143:2: (this_DBConfig_0= ruleDBConfig | this_Entity_1= ruleEntity | this_Validator_2= ruleValidator | this_Eval_3= ruleEval )
            int alt2=4;
            switch ( input.LA(1) ) {
            case Database:
                {
                alt2=1;
                }
                break;
            case Entity:
                {
                alt2=2;
                }
                break;
            case Validator:
                {
                alt2=3;
                }
                break;
            case Eval:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCMSdslParser.g:144:3: this_DBConfig_0= ruleDBConfig
                    {

                    			newCompositeNode(grammarAccess.getPrimaryElementAccess().getDBConfigParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DBConfig_0=ruleDBConfig();

                    state._fsp--;


                    			current = this_DBConfig_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCMSdslParser.g:153:3: this_Entity_1= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getPrimaryElementAccess().getEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_1=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCMSdslParser.g:162:3: this_Validator_2= ruleValidator
                    {

                    			newCompositeNode(grammarAccess.getPrimaryElementAccess().getValidatorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Validator_2=ruleValidator();

                    state._fsp--;


                    			current = this_Validator_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCMSdslParser.g:171:3: this_Eval_3= ruleEval
                    {

                    			newCompositeNode(grammarAccess.getPrimaryElementAccess().getEvalParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Eval_3=ruleEval();

                    state._fsp--;


                    			current = this_Eval_3;
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
    // $ANTLR end "rulePrimaryElement"


    // $ANTLR start "entryRuleDBConfig"
    // InternalCMSdslParser.g:183:1: entryRuleDBConfig returns [EObject current=null] : iv_ruleDBConfig= ruleDBConfig EOF ;
    public final EObject entryRuleDBConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBConfig = null;


        try {
            // InternalCMSdslParser.g:183:49: (iv_ruleDBConfig= ruleDBConfig EOF )
            // InternalCMSdslParser.g:184:2: iv_ruleDBConfig= ruleDBConfig EOF
            {
             newCompositeNode(grammarAccess.getDBConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDBConfig=ruleDBConfig();

            state._fsp--;

             current =iv_ruleDBConfig; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDBConfig"


    // $ANTLR start "ruleDBConfig"
    // InternalCMSdslParser.g:190:1: ruleDBConfig returns [EObject current=null] : ( () ( (lv_type_1_0= Database ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_config_4_0= ruleDBDecl ) )* this_END_5= RULE_END ) ;
    public final EObject ruleDBConfig() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_config_4_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:196:2: ( ( () ( (lv_type_1_0= Database ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_config_4_0= ruleDBDecl ) )* this_END_5= RULE_END ) )
            // InternalCMSdslParser.g:197:2: ( () ( (lv_type_1_0= Database ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_config_4_0= ruleDBDecl ) )* this_END_5= RULE_END )
            {
            // InternalCMSdslParser.g:197:2: ( () ( (lv_type_1_0= Database ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_config_4_0= ruleDBDecl ) )* this_END_5= RULE_END )
            // InternalCMSdslParser.g:198:3: () ( (lv_type_1_0= Database ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_config_4_0= ruleDBDecl ) )* this_END_5= RULE_END
            {
            // InternalCMSdslParser.g:198:3: ()
            // InternalCMSdslParser.g:199:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDBConfigAccess().getDBConfigAction_0(),
            					current);
            			

            }

            // InternalCMSdslParser.g:205:3: ( (lv_type_1_0= Database ) )
            // InternalCMSdslParser.g:206:4: (lv_type_1_0= Database )
            {
            // InternalCMSdslParser.g:206:4: (lv_type_1_0= Database )
            // InternalCMSdslParser.g:207:5: lv_type_1_0= Database
            {
            lv_type_1_0=(Token)match(input,Database,FOLLOW_4); 

            					newLeafNode(lv_type_1_0, grammarAccess.getDBConfigAccess().getTypeDatabaseKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDBConfigRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_1_0, "database");
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDBConfigAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getDBConfigAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalCMSdslParser.g:227:3: ( (lv_config_4_0= ruleDBDecl ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=Hostname && LA3_0<=Username)||(LA3_0>=Dialect && LA3_0<=Library)||LA3_0==Port) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCMSdslParser.g:228:4: (lv_config_4_0= ruleDBDecl )
            	    {
            	    // InternalCMSdslParser.g:228:4: (lv_config_4_0= ruleDBDecl )
            	    // InternalCMSdslParser.g:229:5: lv_config_4_0= ruleDBDecl
            	    {

            	    					newCompositeNode(grammarAccess.getDBConfigAccess().getConfigDBDeclParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_config_4_0=ruleDBDecl();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDBConfigRule());
            	    					}
            	    					add(
            	    						current,
            	    						"config",
            	    						lv_config_4_0,
            	    						"jope015.mdsd2021.reexam.CMSdsl.DBDecl");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_5, grammarAccess.getDBConfigAccess().getENDTerminalRuleCall_5());
            		

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
    // $ANTLR end "ruleDBConfig"


    // $ANTLR start "entryRuleDBDecl"
    // InternalCMSdslParser.g:254:1: entryRuleDBDecl returns [EObject current=null] : iv_ruleDBDecl= ruleDBDecl EOF ;
    public final EObject entryRuleDBDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBDecl = null;


        try {
            // InternalCMSdslParser.g:254:47: (iv_ruleDBDecl= ruleDBDecl EOF )
            // InternalCMSdslParser.g:255:2: iv_ruleDBDecl= ruleDBDecl EOF
            {
             newCompositeNode(grammarAccess.getDBDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDBDecl=ruleDBDecl();

            state._fsp--;

             current =iv_ruleDBDecl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDBDecl"


    // $ANTLR start "ruleDBDecl"
    // InternalCMSdslParser.g:261:1: ruleDBDecl returns [EObject current=null] : ( ( () ( (lv_type_1_0= Library ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_type_5_0= Hostname ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_type_9_0= Port ) ) otherlv_10= Colon ( (lv_value_11_0= RULE_INT ) ) ) | ( () ( (lv_type_13_0= Dialect ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) ) ) | ( () ( (lv_type_17_0= Username ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_STRING ) ) ) | ( () ( (lv_type_21_0= Password ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleDBDecl() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;
        Token lv_type_9_0=null;
        Token otherlv_10=null;
        Token lv_value_11_0=null;
        Token lv_type_13_0=null;
        Token otherlv_14=null;
        Token lv_value_15_0=null;
        Token lv_type_17_0=null;
        Token otherlv_18=null;
        Token lv_value_19_0=null;
        Token lv_type_21_0=null;
        Token otherlv_22=null;
        Token lv_value_23_0=null;


        	enterRule();

        try {
            // InternalCMSdslParser.g:267:2: ( ( ( () ( (lv_type_1_0= Library ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_type_5_0= Hostname ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_type_9_0= Port ) ) otherlv_10= Colon ( (lv_value_11_0= RULE_INT ) ) ) | ( () ( (lv_type_13_0= Dialect ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) ) ) | ( () ( (lv_type_17_0= Username ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_STRING ) ) ) | ( () ( (lv_type_21_0= Password ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_STRING ) ) ) ) )
            // InternalCMSdslParser.g:268:2: ( ( () ( (lv_type_1_0= Library ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_type_5_0= Hostname ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_type_9_0= Port ) ) otherlv_10= Colon ( (lv_value_11_0= RULE_INT ) ) ) | ( () ( (lv_type_13_0= Dialect ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) ) ) | ( () ( (lv_type_17_0= Username ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_STRING ) ) ) | ( () ( (lv_type_21_0= Password ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_STRING ) ) ) )
            {
            // InternalCMSdslParser.g:268:2: ( ( () ( (lv_type_1_0= Library ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_type_5_0= Hostname ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_type_9_0= Port ) ) otherlv_10= Colon ( (lv_value_11_0= RULE_INT ) ) ) | ( () ( (lv_type_13_0= Dialect ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) ) ) | ( () ( (lv_type_17_0= Username ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_STRING ) ) ) | ( () ( (lv_type_21_0= Password ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_STRING ) ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case Library:
                {
                alt4=1;
                }
                break;
            case Hostname:
                {
                alt4=2;
                }
                break;
            case Port:
                {
                alt4=3;
                }
                break;
            case Dialect:
                {
                alt4=4;
                }
                break;
            case Username:
                {
                alt4=5;
                }
                break;
            case Password:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCMSdslParser.g:269:3: ( () ( (lv_type_1_0= Library ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:269:3: ( () ( (lv_type_1_0= Library ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:270:4: () ( (lv_type_1_0= Library ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:270:4: ()
                    // InternalCMSdslParser.g:271:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDBDeclAccess().getLibAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:277:4: ( (lv_type_1_0= Library ) )
                    // InternalCMSdslParser.g:278:5: (lv_type_1_0= Library )
                    {
                    // InternalCMSdslParser.g:278:5: (lv_type_1_0= Library )
                    // InternalCMSdslParser.g:279:6: lv_type_1_0= Library
                    {
                    lv_type_1_0=(Token)match(input,Library,FOLLOW_4); 

                    						newLeafNode(lv_type_1_0, grammarAccess.getDBDeclAccess().getTypeLibraryKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDBDeclRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_1_0, "library");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,Colon,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getDBDeclAccess().getColonKeyword_0_2());
                    			
                    // InternalCMSdslParser.g:295:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:296:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:296:5: (lv_value_3_0= RULE_STRING )
                    // InternalCMSdslParser.g:297:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getDBDeclAccess().getValueSTRINGTerminalRuleCall_0_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDBDeclRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCMSdslParser.g:315:3: ( () ( (lv_type_5_0= Hostname ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:315:3: ( () ( (lv_type_5_0= Hostname ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:316:4: () ( (lv_type_5_0= Hostname ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:316:4: ()
                    // InternalCMSdslParser.g:317:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDBDeclAccess().getHostAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:323:4: ( (lv_type_5_0= Hostname ) )
                    // InternalCMSdslParser.g:324:5: (lv_type_5_0= Hostname )
                    {
                    // InternalCMSdslParser.g:324:5: (lv_type_5_0= Hostname )
                    // InternalCMSdslParser.g:325:6: lv_type_5_0= Hostname
                    {
                    lv_type_5_0=(Token)match(input,Hostname,FOLLOW_4); 

                    						newLeafNode(lv_type_5_0, grammarAccess.getDBDeclAccess().getTypeHostnameKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDBDeclRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_5_0, "hostname");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,Colon,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getDBDeclAccess().getColonKeyword_1_2());
                    			
                    // InternalCMSdslParser.g:341:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:342:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:342:5: (lv_value_7_0= RULE_STRING )
                    // InternalCMSdslParser.g:343:6: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_7_0, grammarAccess.getDBDeclAccess().getValueSTRINGTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDBDeclRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCMSdslParser.g:361:3: ( () ( (lv_type_9_0= Port ) ) otherlv_10= Colon ( (lv_value_11_0= RULE_INT ) ) )
                    {
                    // InternalCMSdslParser.g:361:3: ( () ( (lv_type_9_0= Port ) ) otherlv_10= Colon ( (lv_value_11_0= RULE_INT ) ) )
                    // InternalCMSdslParser.g:362:4: () ( (lv_type_9_0= Port ) ) otherlv_10= Colon ( (lv_value_11_0= RULE_INT ) )
                    {
                    // InternalCMSdslParser.g:362:4: ()
                    // InternalCMSdslParser.g:363:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDBDeclAccess().getPortAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:369:4: ( (lv_type_9_0= Port ) )
                    // InternalCMSdslParser.g:370:5: (lv_type_9_0= Port )
                    {
                    // InternalCMSdslParser.g:370:5: (lv_type_9_0= Port )
                    // InternalCMSdslParser.g:371:6: lv_type_9_0= Port
                    {
                    lv_type_9_0=(Token)match(input,Port,FOLLOW_4); 

                    						newLeafNode(lv_type_9_0, grammarAccess.getDBDeclAccess().getTypePortKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDBDeclRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_9_0, "port");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,Colon,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getDBDeclAccess().getColonKeyword_2_2());
                    			
                    // InternalCMSdslParser.g:387:4: ( (lv_value_11_0= RULE_INT ) )
                    // InternalCMSdslParser.g:388:5: (lv_value_11_0= RULE_INT )
                    {
                    // InternalCMSdslParser.g:388:5: (lv_value_11_0= RULE_INT )
                    // InternalCMSdslParser.g:389:6: lv_value_11_0= RULE_INT
                    {
                    lv_value_11_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_11_0, grammarAccess.getDBDeclAccess().getValueINTTerminalRuleCall_2_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDBDeclRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_11_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCMSdslParser.g:407:3: ( () ( (lv_type_13_0= Dialect ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:407:3: ( () ( (lv_type_13_0= Dialect ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:408:4: () ( (lv_type_13_0= Dialect ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:408:4: ()
                    // InternalCMSdslParser.g:409:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDBDeclAccess().getDialectAction_3_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:415:4: ( (lv_type_13_0= Dialect ) )
                    // InternalCMSdslParser.g:416:5: (lv_type_13_0= Dialect )
                    {
                    // InternalCMSdslParser.g:416:5: (lv_type_13_0= Dialect )
                    // InternalCMSdslParser.g:417:6: lv_type_13_0= Dialect
                    {
                    lv_type_13_0=(Token)match(input,Dialect,FOLLOW_4); 

                    						newLeafNode(lv_type_13_0, grammarAccess.getDBDeclAccess().getTypeDialectKeyword_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDBDeclRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_13_0, "dialect");
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,Colon,FOLLOW_8); 

                    				newLeafNode(otherlv_14, grammarAccess.getDBDeclAccess().getColonKeyword_3_2());
                    			
                    // InternalCMSdslParser.g:433:4: ( (lv_value_15_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:434:5: (lv_value_15_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:434:5: (lv_value_15_0= RULE_STRING )
                    // InternalCMSdslParser.g:435:6: lv_value_15_0= RULE_STRING
                    {
                    lv_value_15_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_15_0, grammarAccess.getDBDeclAccess().getValueSTRINGTerminalRuleCall_3_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDBDeclRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_15_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalCMSdslParser.g:453:3: ( () ( (lv_type_17_0= Username ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:453:3: ( () ( (lv_type_17_0= Username ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:454:4: () ( (lv_type_17_0= Username ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:454:4: ()
                    // InternalCMSdslParser.g:455:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDBDeclAccess().getUserAction_4_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:461:4: ( (lv_type_17_0= Username ) )
                    // InternalCMSdslParser.g:462:5: (lv_type_17_0= Username )
                    {
                    // InternalCMSdslParser.g:462:5: (lv_type_17_0= Username )
                    // InternalCMSdslParser.g:463:6: lv_type_17_0= Username
                    {
                    lv_type_17_0=(Token)match(input,Username,FOLLOW_4); 

                    						newLeafNode(lv_type_17_0, grammarAccess.getDBDeclAccess().getTypeUsernameKeyword_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDBDeclRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_17_0, "username");
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,Colon,FOLLOW_8); 

                    				newLeafNode(otherlv_18, grammarAccess.getDBDeclAccess().getColonKeyword_4_2());
                    			
                    // InternalCMSdslParser.g:479:4: ( (lv_value_19_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:480:5: (lv_value_19_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:480:5: (lv_value_19_0= RULE_STRING )
                    // InternalCMSdslParser.g:481:6: lv_value_19_0= RULE_STRING
                    {
                    lv_value_19_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_19_0, grammarAccess.getDBDeclAccess().getValueSTRINGTerminalRuleCall_4_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDBDeclRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_19_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalCMSdslParser.g:499:3: ( () ( (lv_type_21_0= Password ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:499:3: ( () ( (lv_type_21_0= Password ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:500:4: () ( (lv_type_21_0= Password ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:500:4: ()
                    // InternalCMSdslParser.g:501:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDBDeclAccess().getPassAction_5_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:507:4: ( (lv_type_21_0= Password ) )
                    // InternalCMSdslParser.g:508:5: (lv_type_21_0= Password )
                    {
                    // InternalCMSdslParser.g:508:5: (lv_type_21_0= Password )
                    // InternalCMSdslParser.g:509:6: lv_type_21_0= Password
                    {
                    lv_type_21_0=(Token)match(input,Password,FOLLOW_4); 

                    						newLeafNode(lv_type_21_0, grammarAccess.getDBDeclAccess().getTypePasswordKeyword_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDBDeclRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_21_0, "password");
                    					

                    }


                    }

                    otherlv_22=(Token)match(input,Colon,FOLLOW_8); 

                    				newLeafNode(otherlv_22, grammarAccess.getDBDeclAccess().getColonKeyword_5_2());
                    			
                    // InternalCMSdslParser.g:525:4: ( (lv_value_23_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:526:5: (lv_value_23_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:526:5: (lv_value_23_0= RULE_STRING )
                    // InternalCMSdslParser.g:527:6: lv_value_23_0= RULE_STRING
                    {
                    lv_value_23_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_23_0, grammarAccess.getDBDeclAccess().getValueSTRINGTerminalRuleCall_5_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDBDeclRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_23_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


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
    // $ANTLR end "ruleDBDecl"


    // $ANTLR start "entryRuleEntity"
    // InternalCMSdslParser.g:548:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalCMSdslParser.g:548:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalCMSdslParser.g:549:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalCMSdslParser.g:555:1: ruleEntity returns [EObject current=null] : ( () otherlv_1= Entity ( (lv_name_2_0= RULE_ID ) ) ( (lv_relationship_3_0= ruleRelationship ) )? otherlv_4= Colon this_BEGIN_5= RULE_BEGIN ( (lv_members_6_0= ruleEntityDecl ) )* this_END_7= RULE_END ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token this_BEGIN_5=null;
        Token this_END_7=null;
        EObject lv_relationship_3_0 = null;

        EObject lv_members_6_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:561:2: ( ( () otherlv_1= Entity ( (lv_name_2_0= RULE_ID ) ) ( (lv_relationship_3_0= ruleRelationship ) )? otherlv_4= Colon this_BEGIN_5= RULE_BEGIN ( (lv_members_6_0= ruleEntityDecl ) )* this_END_7= RULE_END ) )
            // InternalCMSdslParser.g:562:2: ( () otherlv_1= Entity ( (lv_name_2_0= RULE_ID ) ) ( (lv_relationship_3_0= ruleRelationship ) )? otherlv_4= Colon this_BEGIN_5= RULE_BEGIN ( (lv_members_6_0= ruleEntityDecl ) )* this_END_7= RULE_END )
            {
            // InternalCMSdslParser.g:562:2: ( () otherlv_1= Entity ( (lv_name_2_0= RULE_ID ) ) ( (lv_relationship_3_0= ruleRelationship ) )? otherlv_4= Colon this_BEGIN_5= RULE_BEGIN ( (lv_members_6_0= ruleEntityDecl ) )* this_END_7= RULE_END )
            // InternalCMSdslParser.g:563:3: () otherlv_1= Entity ( (lv_name_2_0= RULE_ID ) ) ( (lv_relationship_3_0= ruleRelationship ) )? otherlv_4= Colon this_BEGIN_5= RULE_BEGIN ( (lv_members_6_0= ruleEntityDecl ) )* this_END_7= RULE_END
            {
            // InternalCMSdslParser.g:563:3: ()
            // InternalCMSdslParser.g:564:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityAccess().getEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Entity,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
            		
            // InternalCMSdslParser.g:574:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCMSdslParser.g:575:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCMSdslParser.g:575:4: (lv_name_2_0= RULE_ID )
            // InternalCMSdslParser.g:576:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCMSdslParser.g:592:3: ( (lv_relationship_3_0= ruleRelationship ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Belongs||LA5_0==Has) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCMSdslParser.g:593:4: (lv_relationship_3_0= ruleRelationship )
                    {
                    // InternalCMSdslParser.g:593:4: (lv_relationship_3_0= ruleRelationship )
                    // InternalCMSdslParser.g:594:5: lv_relationship_3_0= ruleRelationship
                    {

                    					newCompositeNode(grammarAccess.getEntityAccess().getRelationshipRelationshipParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_relationship_3_0=ruleRelationship();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityRule());
                    					}
                    					set(
                    						current,
                    						"relationship",
                    						lv_relationship_3_0,
                    						"jope015.mdsd2021.reexam.CMSdsl.Relationship");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getColonKeyword_4());
            		
            this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_11); 

            			newLeafNode(this_BEGIN_5, grammarAccess.getEntityAccess().getBEGINTerminalRuleCall_5());
            		
            // InternalCMSdslParser.g:619:3: ( (lv_members_6_0= ruleEntityDecl ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Check||LA6_0==Field) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCMSdslParser.g:620:4: (lv_members_6_0= ruleEntityDecl )
            	    {
            	    // InternalCMSdslParser.g:620:4: (lv_members_6_0= ruleEntityDecl )
            	    // InternalCMSdslParser.g:621:5: lv_members_6_0= ruleEntityDecl
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getMembersEntityDeclParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_members_6_0=ruleEntityDecl();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"members",
            	    						lv_members_6_0,
            	    						"jope015.mdsd2021.reexam.CMSdsl.EntityDecl");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            this_END_7=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_7, grammarAccess.getEntityAccess().getENDTerminalRuleCall_7());
            		

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntityDecl"
    // InternalCMSdslParser.g:646:1: entryRuleEntityDecl returns [EObject current=null] : iv_ruleEntityDecl= ruleEntityDecl EOF ;
    public final EObject entryRuleEntityDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityDecl = null;


        try {
            // InternalCMSdslParser.g:646:51: (iv_ruleEntityDecl= ruleEntityDecl EOF )
            // InternalCMSdslParser.g:647:2: iv_ruleEntityDecl= ruleEntityDecl EOF
            {
             newCompositeNode(grammarAccess.getEntityDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityDecl=ruleEntityDecl();

            state._fsp--;

             current =iv_ruleEntityDecl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntityDecl"


    // $ANTLR start "ruleEntityDecl"
    // InternalCMSdslParser.g:653:1: ruleEntityDecl returns [EObject current=null] : (this_Field_0= ruleField | this_ValidationCheck_1= ruleValidationCheck ) ;
    public final EObject ruleEntityDecl() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_ValidationCheck_1 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:659:2: ( (this_Field_0= ruleField | this_ValidationCheck_1= ruleValidationCheck ) )
            // InternalCMSdslParser.g:660:2: (this_Field_0= ruleField | this_ValidationCheck_1= ruleValidationCheck )
            {
            // InternalCMSdslParser.g:660:2: (this_Field_0= ruleField | this_ValidationCheck_1= ruleValidationCheck )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Field) ) {
                alt7=1;
            }
            else if ( (LA7_0==Check) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCMSdslParser.g:661:3: this_Field_0= ruleField
                    {

                    			newCompositeNode(grammarAccess.getEntityDeclAccess().getFieldParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Field_0=ruleField();

                    state._fsp--;


                    			current = this_Field_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCMSdslParser.g:670:3: this_ValidationCheck_1= ruleValidationCheck
                    {

                    			newCompositeNode(grammarAccess.getEntityDeclAccess().getValidationCheckParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValidationCheck_1=ruleValidationCheck();

                    state._fsp--;


                    			current = this_ValidationCheck_1;
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
    // $ANTLR end "ruleEntityDecl"


    // $ANTLR start "entryRuleField"
    // InternalCMSdslParser.g:682:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalCMSdslParser.g:682:46: (iv_ruleField= ruleField EOF )
            // InternalCMSdslParser.g:683:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalCMSdslParser.g:689:1: ruleField returns [EObject current=null] : (otherlv_0= Field ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_type_3_0= ruleDataType ) ) otherlv_4= EqualsSignGreaterThanSign this_BEGIN_5= RULE_BEGIN ( (lv_properties_6_0= ruleFieldProp ) )* this_END_7= RULE_END ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_BEGIN_5=null;
        Token this_END_7=null;
        EObject lv_type_3_0 = null;

        EObject lv_properties_6_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:695:2: ( (otherlv_0= Field ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_type_3_0= ruleDataType ) ) otherlv_4= EqualsSignGreaterThanSign this_BEGIN_5= RULE_BEGIN ( (lv_properties_6_0= ruleFieldProp ) )* this_END_7= RULE_END ) )
            // InternalCMSdslParser.g:696:2: (otherlv_0= Field ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_type_3_0= ruleDataType ) ) otherlv_4= EqualsSignGreaterThanSign this_BEGIN_5= RULE_BEGIN ( (lv_properties_6_0= ruleFieldProp ) )* this_END_7= RULE_END )
            {
            // InternalCMSdslParser.g:696:2: (otherlv_0= Field ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_type_3_0= ruleDataType ) ) otherlv_4= EqualsSignGreaterThanSign this_BEGIN_5= RULE_BEGIN ( (lv_properties_6_0= ruleFieldProp ) )* this_END_7= RULE_END )
            // InternalCMSdslParser.g:697:3: otherlv_0= Field ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_type_3_0= ruleDataType ) ) otherlv_4= EqualsSignGreaterThanSign this_BEGIN_5= RULE_BEGIN ( (lv_properties_6_0= ruleFieldProp ) )* this_END_7= RULE_END
            {
            otherlv_0=(Token)match(input,Field,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFieldKeyword_0());
            		
            // InternalCMSdslParser.g:701:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCMSdslParser.g:702:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCMSdslParser.g:702:4: (lv_name_1_0= RULE_ID )
            // InternalCMSdslParser.g:703:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getColonKeyword_2());
            		
            // InternalCMSdslParser.g:723:3: ( (lv_type_3_0= ruleDataType ) )
            // InternalCMSdslParser.g:724:4: (lv_type_3_0= ruleDataType )
            {
            // InternalCMSdslParser.g:724:4: (lv_type_3_0= ruleDataType )
            // InternalCMSdslParser.g:725:5: lv_type_3_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getTypeDataTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_type_3_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"jope015.mdsd2021.reexam.CMSdsl.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,EqualsSignGreaterThanSign,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getEqualsSignGreaterThanSignKeyword_4());
            		
            this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            			newLeafNode(this_BEGIN_5, grammarAccess.getFieldAccess().getBEGINTerminalRuleCall_5());
            		
            // InternalCMSdslParser.g:750:3: ( (lv_properties_6_0= ruleFieldProp ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Default||LA8_0==Test) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCMSdslParser.g:751:4: (lv_properties_6_0= ruleFieldProp )
            	    {
            	    // InternalCMSdslParser.g:751:4: (lv_properties_6_0= ruleFieldProp )
            	    // InternalCMSdslParser.g:752:5: lv_properties_6_0= ruleFieldProp
            	    {

            	    					newCompositeNode(grammarAccess.getFieldAccess().getPropertiesFieldPropParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_properties_6_0=ruleFieldProp();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFieldRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_6_0,
            	    						"jope015.mdsd2021.reexam.CMSdsl.FieldProp");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            this_END_7=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_7, grammarAccess.getFieldAccess().getENDTerminalRuleCall_7());
            		

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleValidationCheck"
    // InternalCMSdslParser.g:777:1: entryRuleValidationCheck returns [EObject current=null] : iv_ruleValidationCheck= ruleValidationCheck EOF ;
    public final EObject entryRuleValidationCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidationCheck = null;


        try {
            // InternalCMSdslParser.g:777:56: (iv_ruleValidationCheck= ruleValidationCheck EOF )
            // InternalCMSdslParser.g:778:2: iv_ruleValidationCheck= ruleValidationCheck EOF
            {
             newCompositeNode(grammarAccess.getValidationCheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidationCheck=ruleValidationCheck();

            state._fsp--;

             current =iv_ruleValidationCheck; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValidationCheck"


    // $ANTLR start "ruleValidationCheck"
    // InternalCMSdslParser.g:784:1: ruleValidationCheck returns [EObject current=null] : (otherlv_0= Check ( (lv_validator_1_0= ruleValidatorUse ) ) otherlv_2= EqualsSignGreaterThanSign ( (lv_errrorMsg_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleValidationCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_errrorMsg_3_0=null;
        EObject lv_validator_1_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:790:2: ( (otherlv_0= Check ( (lv_validator_1_0= ruleValidatorUse ) ) otherlv_2= EqualsSignGreaterThanSign ( (lv_errrorMsg_3_0= RULE_STRING ) ) ) )
            // InternalCMSdslParser.g:791:2: (otherlv_0= Check ( (lv_validator_1_0= ruleValidatorUse ) ) otherlv_2= EqualsSignGreaterThanSign ( (lv_errrorMsg_3_0= RULE_STRING ) ) )
            {
            // InternalCMSdslParser.g:791:2: (otherlv_0= Check ( (lv_validator_1_0= ruleValidatorUse ) ) otherlv_2= EqualsSignGreaterThanSign ( (lv_errrorMsg_3_0= RULE_STRING ) ) )
            // InternalCMSdslParser.g:792:3: otherlv_0= Check ( (lv_validator_1_0= ruleValidatorUse ) ) otherlv_2= EqualsSignGreaterThanSign ( (lv_errrorMsg_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Check,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getValidationCheckAccess().getCheckKeyword_0());
            		
            // InternalCMSdslParser.g:796:3: ( (lv_validator_1_0= ruleValidatorUse ) )
            // InternalCMSdslParser.g:797:4: (lv_validator_1_0= ruleValidatorUse )
            {
            // InternalCMSdslParser.g:797:4: (lv_validator_1_0= ruleValidatorUse )
            // InternalCMSdslParser.g:798:5: lv_validator_1_0= ruleValidatorUse
            {

            					newCompositeNode(grammarAccess.getValidationCheckAccess().getValidatorValidatorUseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_validator_1_0=ruleValidatorUse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValidationCheckRule());
            					}
            					set(
            						current,
            						"validator",
            						lv_validator_1_0,
            						"jope015.mdsd2021.reexam.CMSdsl.ValidatorUse");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,EqualsSignGreaterThanSign,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getValidationCheckAccess().getEqualsSignGreaterThanSignKeyword_2());
            		
            // InternalCMSdslParser.g:819:3: ( (lv_errrorMsg_3_0= RULE_STRING ) )
            // InternalCMSdslParser.g:820:4: (lv_errrorMsg_3_0= RULE_STRING )
            {
            // InternalCMSdslParser.g:820:4: (lv_errrorMsg_3_0= RULE_STRING )
            // InternalCMSdslParser.g:821:5: lv_errrorMsg_3_0= RULE_STRING
            {
            lv_errrorMsg_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_errrorMsg_3_0, grammarAccess.getValidationCheckAccess().getErrrorMsgSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValidationCheckRule());
            					}
            					setWithLastConsumed(
            						current,
            						"errrorMsg",
            						lv_errrorMsg_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleValidationCheck"


    // $ANTLR start "entryRuleValidationStatus"
    // InternalCMSdslParser.g:841:1: entryRuleValidationStatus returns [EObject current=null] : iv_ruleValidationStatus= ruleValidationStatus EOF ;
    public final EObject entryRuleValidationStatus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidationStatus = null;


        try {
            // InternalCMSdslParser.g:841:57: (iv_ruleValidationStatus= ruleValidationStatus EOF )
            // InternalCMSdslParser.g:842:2: iv_ruleValidationStatus= ruleValidationStatus EOF
            {
             newCompositeNode(grammarAccess.getValidationStatusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidationStatus=ruleValidationStatus();

            state._fsp--;

             current =iv_ruleValidationStatus; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValidationStatus"


    // $ANTLR start "ruleValidationStatus"
    // InternalCMSdslParser.g:848:1: ruleValidationStatus returns [EObject current=null] : ( ( () otherlv_1= Error otherlv_2= Colon ( (lv_msg_3_0= RULE_STRING ) ) ) | ( () otherlv_5= Warning otherlv_6= Colon ( (lv_msg_7_0= RULE_STRING ) ) ) | ( () otherlv_9= Success otherlv_10= Colon ( (lv_msg_11_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleValidationStatus() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_msg_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_msg_7_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_msg_11_0=null;


        	enterRule();

        try {
            // InternalCMSdslParser.g:854:2: ( ( ( () otherlv_1= Error otherlv_2= Colon ( (lv_msg_3_0= RULE_STRING ) ) ) | ( () otherlv_5= Warning otherlv_6= Colon ( (lv_msg_7_0= RULE_STRING ) ) ) | ( () otherlv_9= Success otherlv_10= Colon ( (lv_msg_11_0= RULE_STRING ) ) ) ) )
            // InternalCMSdslParser.g:855:2: ( ( () otherlv_1= Error otherlv_2= Colon ( (lv_msg_3_0= RULE_STRING ) ) ) | ( () otherlv_5= Warning otherlv_6= Colon ( (lv_msg_7_0= RULE_STRING ) ) ) | ( () otherlv_9= Success otherlv_10= Colon ( (lv_msg_11_0= RULE_STRING ) ) ) )
            {
            // InternalCMSdslParser.g:855:2: ( ( () otherlv_1= Error otherlv_2= Colon ( (lv_msg_3_0= RULE_STRING ) ) ) | ( () otherlv_5= Warning otherlv_6= Colon ( (lv_msg_7_0= RULE_STRING ) ) ) | ( () otherlv_9= Success otherlv_10= Colon ( (lv_msg_11_0= RULE_STRING ) ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case Error:
                {
                alt9=1;
                }
                break;
            case Warning:
                {
                alt9=2;
                }
                break;
            case Success:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalCMSdslParser.g:856:3: ( () otherlv_1= Error otherlv_2= Colon ( (lv_msg_3_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:856:3: ( () otherlv_1= Error otherlv_2= Colon ( (lv_msg_3_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:857:4: () otherlv_1= Error otherlv_2= Colon ( (lv_msg_3_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:857:4: ()
                    // InternalCMSdslParser.g:858:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getValidationStatusAccess().getErrAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,Error,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getValidationStatusAccess().getErrorKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,Colon,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getValidationStatusAccess().getColonKeyword_0_2());
                    			
                    // InternalCMSdslParser.g:872:4: ( (lv_msg_3_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:873:5: (lv_msg_3_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:873:5: (lv_msg_3_0= RULE_STRING )
                    // InternalCMSdslParser.g:874:6: lv_msg_3_0= RULE_STRING
                    {
                    lv_msg_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_msg_3_0, grammarAccess.getValidationStatusAccess().getMsgSTRINGTerminalRuleCall_0_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValidationStatusRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"msg",
                    							lv_msg_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCMSdslParser.g:892:3: ( () otherlv_5= Warning otherlv_6= Colon ( (lv_msg_7_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:892:3: ( () otherlv_5= Warning otherlv_6= Colon ( (lv_msg_7_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:893:4: () otherlv_5= Warning otherlv_6= Colon ( (lv_msg_7_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:893:4: ()
                    // InternalCMSdslParser.g:894:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getValidationStatusAccess().getWarnAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,Warning,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getValidationStatusAccess().getWarningKeyword_1_1());
                    			
                    otherlv_6=(Token)match(input,Colon,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getValidationStatusAccess().getColonKeyword_1_2());
                    			
                    // InternalCMSdslParser.g:908:4: ( (lv_msg_7_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:909:5: (lv_msg_7_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:909:5: (lv_msg_7_0= RULE_STRING )
                    // InternalCMSdslParser.g:910:6: lv_msg_7_0= RULE_STRING
                    {
                    lv_msg_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_msg_7_0, grammarAccess.getValidationStatusAccess().getMsgSTRINGTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValidationStatusRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"msg",
                    							lv_msg_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCMSdslParser.g:928:3: ( () otherlv_9= Success otherlv_10= Colon ( (lv_msg_11_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:928:3: ( () otherlv_9= Success otherlv_10= Colon ( (lv_msg_11_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:929:4: () otherlv_9= Success otherlv_10= Colon ( (lv_msg_11_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:929:4: ()
                    // InternalCMSdslParser.g:930:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getValidationStatusAccess().getSuccAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,Success,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getValidationStatusAccess().getSuccessKeyword_2_1());
                    			
                    otherlv_10=(Token)match(input,Colon,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getValidationStatusAccess().getColonKeyword_2_2());
                    			
                    // InternalCMSdslParser.g:944:4: ( (lv_msg_11_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:945:5: (lv_msg_11_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:945:5: (lv_msg_11_0= RULE_STRING )
                    // InternalCMSdslParser.g:946:6: lv_msg_11_0= RULE_STRING
                    {
                    lv_msg_11_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_msg_11_0, grammarAccess.getValidationStatusAccess().getMsgSTRINGTerminalRuleCall_2_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValidationStatusRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"msg",
                    							lv_msg_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


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
    // $ANTLR end "ruleValidationStatus"


    // $ANTLR start "entryRuleFieldProp"
    // InternalCMSdslParser.g:967:1: entryRuleFieldProp returns [EObject current=null] : iv_ruleFieldProp= ruleFieldProp EOF ;
    public final EObject entryRuleFieldProp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldProp = null;


        try {
            // InternalCMSdslParser.g:967:50: (iv_ruleFieldProp= ruleFieldProp EOF )
            // InternalCMSdslParser.g:968:2: iv_ruleFieldProp= ruleFieldProp EOF
            {
             newCompositeNode(grammarAccess.getFieldPropRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldProp=ruleFieldProp();

            state._fsp--;

             current =iv_ruleFieldProp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFieldProp"


    // $ANTLR start "ruleFieldProp"
    // InternalCMSdslParser.g:974:1: ruleFieldProp returns [EObject current=null] : ( ( () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleFieldProp() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;


        	enterRule();

        try {
            // InternalCMSdslParser.g:980:2: ( ( ( () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) ) )
            // InternalCMSdslParser.g:981:2: ( ( () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) )
            {
            // InternalCMSdslParser.g:981:2: ( ( () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Default) ) {
                alt10=1;
            }
            else if ( (LA10_0==Test) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalCMSdslParser.g:982:3: ( () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:982:3: ( () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:983:4: () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:983:4: ()
                    // InternalCMSdslParser.g:984:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFieldPropAccess().getDefAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:990:4: ( (lv_type_1_0= Default ) )
                    // InternalCMSdslParser.g:991:5: (lv_type_1_0= Default )
                    {
                    // InternalCMSdslParser.g:991:5: (lv_type_1_0= Default )
                    // InternalCMSdslParser.g:992:6: lv_type_1_0= Default
                    {
                    lv_type_1_0=(Token)match(input,Default,FOLLOW_4); 

                    						newLeafNode(lv_type_1_0, grammarAccess.getFieldPropAccess().getTypeDefaultKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldPropRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_1_0, "default");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,Colon,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getFieldPropAccess().getColonKeyword_0_2());
                    			
                    // InternalCMSdslParser.g:1008:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:1009:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:1009:5: (lv_value_3_0= RULE_STRING )
                    // InternalCMSdslParser.g:1010:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getFieldPropAccess().getValueSTRINGTerminalRuleCall_0_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldPropRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCMSdslParser.g:1028:3: ( () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:1028:3: ( () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:1029:4: () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:1029:4: ()
                    // InternalCMSdslParser.g:1030:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFieldPropAccess().getPropTestAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1036:4: ( (lv_type_5_0= Test ) )
                    // InternalCMSdslParser.g:1037:5: (lv_type_5_0= Test )
                    {
                    // InternalCMSdslParser.g:1037:5: (lv_type_5_0= Test )
                    // InternalCMSdslParser.g:1038:6: lv_type_5_0= Test
                    {
                    lv_type_5_0=(Token)match(input,Test,FOLLOW_4); 

                    						newLeafNode(lv_type_5_0, grammarAccess.getFieldPropAccess().getTypeTestKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldPropRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_5_0, "test");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,Colon,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getFieldPropAccess().getColonKeyword_1_2());
                    			
                    // InternalCMSdslParser.g:1054:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:1055:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:1055:5: (lv_value_7_0= RULE_STRING )
                    // InternalCMSdslParser.g:1056:6: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_7_0, grammarAccess.getFieldPropAccess().getValueSTRINGTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldPropRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


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
    // $ANTLR end "ruleFieldProp"


    // $ANTLR start "entryRuleDataType"
    // InternalCMSdslParser.g:1077:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalCMSdslParser.g:1077:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalCMSdslParser.g:1078:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalCMSdslParser.g:1084:1: ruleDataType returns [EObject current=null] : ( ( () ( (lv_type_1_0= String ) ) ) | ( () ( (lv_type_3_0= Date ) ) ) | ( () ( (lv_type_5_0= Int ) ) ) | ( () ( (lv_type_7_0= Long ) ) ) | ( () ( (lv_type_9_0= Bool ) ) ) | ( () ( (lv_type_11_0= Float ) ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
        Token lv_type_3_0=null;
        Token lv_type_5_0=null;
        Token lv_type_7_0=null;
        Token lv_type_9_0=null;
        Token lv_type_11_0=null;


        	enterRule();

        try {
            // InternalCMSdslParser.g:1090:2: ( ( ( () ( (lv_type_1_0= String ) ) ) | ( () ( (lv_type_3_0= Date ) ) ) | ( () ( (lv_type_5_0= Int ) ) ) | ( () ( (lv_type_7_0= Long ) ) ) | ( () ( (lv_type_9_0= Bool ) ) ) | ( () ( (lv_type_11_0= Float ) ) ) ) )
            // InternalCMSdslParser.g:1091:2: ( ( () ( (lv_type_1_0= String ) ) ) | ( () ( (lv_type_3_0= Date ) ) ) | ( () ( (lv_type_5_0= Int ) ) ) | ( () ( (lv_type_7_0= Long ) ) ) | ( () ( (lv_type_9_0= Bool ) ) ) | ( () ( (lv_type_11_0= Float ) ) ) )
            {
            // InternalCMSdslParser.g:1091:2: ( ( () ( (lv_type_1_0= String ) ) ) | ( () ( (lv_type_3_0= Date ) ) ) | ( () ( (lv_type_5_0= Int ) ) ) | ( () ( (lv_type_7_0= Long ) ) ) | ( () ( (lv_type_9_0= Bool ) ) ) | ( () ( (lv_type_11_0= Float ) ) ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case String:
                {
                alt11=1;
                }
                break;
            case Date:
                {
                alt11=2;
                }
                break;
            case Int:
                {
                alt11=3;
                }
                break;
            case Long:
                {
                alt11=4;
                }
                break;
            case Bool:
                {
                alt11=5;
                }
                break;
            case Float:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalCMSdslParser.g:1092:3: ( () ( (lv_type_1_0= String ) ) )
                    {
                    // InternalCMSdslParser.g:1092:3: ( () ( (lv_type_1_0= String ) ) )
                    // InternalCMSdslParser.g:1093:4: () ( (lv_type_1_0= String ) )
                    {
                    // InternalCMSdslParser.g:1093:4: ()
                    // InternalCMSdslParser.g:1094:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getStrAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1100:4: ( (lv_type_1_0= String ) )
                    // InternalCMSdslParser.g:1101:5: (lv_type_1_0= String )
                    {
                    // InternalCMSdslParser.g:1101:5: (lv_type_1_0= String )
                    // InternalCMSdslParser.g:1102:6: lv_type_1_0= String
                    {
                    lv_type_1_0=(Token)match(input,String,FOLLOW_2); 

                    						newLeafNode(lv_type_1_0, grammarAccess.getDataTypeAccess().getTypeStringKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_1_0, "string");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCMSdslParser.g:1116:3: ( () ( (lv_type_3_0= Date ) ) )
                    {
                    // InternalCMSdslParser.g:1116:3: ( () ( (lv_type_3_0= Date ) ) )
                    // InternalCMSdslParser.g:1117:4: () ( (lv_type_3_0= Date ) )
                    {
                    // InternalCMSdslParser.g:1117:4: ()
                    // InternalCMSdslParser.g:1118:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getDtAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1124:4: ( (lv_type_3_0= Date ) )
                    // InternalCMSdslParser.g:1125:5: (lv_type_3_0= Date )
                    {
                    // InternalCMSdslParser.g:1125:5: (lv_type_3_0= Date )
                    // InternalCMSdslParser.g:1126:6: lv_type_3_0= Date
                    {
                    lv_type_3_0=(Token)match(input,Date,FOLLOW_2); 

                    						newLeafNode(lv_type_3_0, grammarAccess.getDataTypeAccess().getTypeDateKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_3_0, "date");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCMSdslParser.g:1140:3: ( () ( (lv_type_5_0= Int ) ) )
                    {
                    // InternalCMSdslParser.g:1140:3: ( () ( (lv_type_5_0= Int ) ) )
                    // InternalCMSdslParser.g:1141:4: () ( (lv_type_5_0= Int ) )
                    {
                    // InternalCMSdslParser.g:1141:4: ()
                    // InternalCMSdslParser.g:1142:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getIntegAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1148:4: ( (lv_type_5_0= Int ) )
                    // InternalCMSdslParser.g:1149:5: (lv_type_5_0= Int )
                    {
                    // InternalCMSdslParser.g:1149:5: (lv_type_5_0= Int )
                    // InternalCMSdslParser.g:1150:6: lv_type_5_0= Int
                    {
                    lv_type_5_0=(Token)match(input,Int,FOLLOW_2); 

                    						newLeafNode(lv_type_5_0, grammarAccess.getDataTypeAccess().getTypeIntKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_5_0, "int");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCMSdslParser.g:1164:3: ( () ( (lv_type_7_0= Long ) ) )
                    {
                    // InternalCMSdslParser.g:1164:3: ( () ( (lv_type_7_0= Long ) ) )
                    // InternalCMSdslParser.g:1165:4: () ( (lv_type_7_0= Long ) )
                    {
                    // InternalCMSdslParser.g:1165:4: ()
                    // InternalCMSdslParser.g:1166:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getLngAction_3_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1172:4: ( (lv_type_7_0= Long ) )
                    // InternalCMSdslParser.g:1173:5: (lv_type_7_0= Long )
                    {
                    // InternalCMSdslParser.g:1173:5: (lv_type_7_0= Long )
                    // InternalCMSdslParser.g:1174:6: lv_type_7_0= Long
                    {
                    lv_type_7_0=(Token)match(input,Long,FOLLOW_2); 

                    						newLeafNode(lv_type_7_0, grammarAccess.getDataTypeAccess().getTypeLongKeyword_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_7_0, "long");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalCMSdslParser.g:1188:3: ( () ( (lv_type_9_0= Bool ) ) )
                    {
                    // InternalCMSdslParser.g:1188:3: ( () ( (lv_type_9_0= Bool ) ) )
                    // InternalCMSdslParser.g:1189:4: () ( (lv_type_9_0= Bool ) )
                    {
                    // InternalCMSdslParser.g:1189:4: ()
                    // InternalCMSdslParser.g:1190:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getBoolAction_4_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1196:4: ( (lv_type_9_0= Bool ) )
                    // InternalCMSdslParser.g:1197:5: (lv_type_9_0= Bool )
                    {
                    // InternalCMSdslParser.g:1197:5: (lv_type_9_0= Bool )
                    // InternalCMSdslParser.g:1198:6: lv_type_9_0= Bool
                    {
                    lv_type_9_0=(Token)match(input,Bool,FOLLOW_2); 

                    						newLeafNode(lv_type_9_0, grammarAccess.getDataTypeAccess().getTypeBoolKeyword_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_9_0, "bool");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalCMSdslParser.g:1212:3: ( () ( (lv_type_11_0= Float ) ) )
                    {
                    // InternalCMSdslParser.g:1212:3: ( () ( (lv_type_11_0= Float ) ) )
                    // InternalCMSdslParser.g:1213:4: () ( (lv_type_11_0= Float ) )
                    {
                    // InternalCMSdslParser.g:1213:4: ()
                    // InternalCMSdslParser.g:1214:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getFltAction_5_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1220:4: ( (lv_type_11_0= Float ) )
                    // InternalCMSdslParser.g:1221:5: (lv_type_11_0= Float )
                    {
                    // InternalCMSdslParser.g:1221:5: (lv_type_11_0= Float )
                    // InternalCMSdslParser.g:1222:6: lv_type_11_0= Float
                    {
                    lv_type_11_0=(Token)match(input,Float,FOLLOW_2); 

                    						newLeafNode(lv_type_11_0, grammarAccess.getDataTypeAccess().getTypeFloatKeyword_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_11_0, "float");
                    					

                    }


                    }


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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleValidator"
    // InternalCMSdslParser.g:1239:1: entryRuleValidator returns [EObject current=null] : iv_ruleValidator= ruleValidator EOF ;
    public final EObject entryRuleValidator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidator = null;


        try {
            // InternalCMSdslParser.g:1239:50: (iv_ruleValidator= ruleValidator EOF )
            // InternalCMSdslParser.g:1240:2: iv_ruleValidator= ruleValidator EOF
            {
             newCompositeNode(grammarAccess.getValidatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidator=ruleValidator();

            state._fsp--;

             current =iv_ruleValidator; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValidator"


    // $ANTLR start "ruleValidator"
    // InternalCMSdslParser.g:1246:1: ruleValidator returns [EObject current=null] : (otherlv_0= Validator ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= RightParenthesis otherlv_7= EqualsSignGreaterThanSign this_BEGIN_8= RULE_BEGIN ( (lv_comparison_9_0= ruleExpression ) ) this_END_10= RULE_END ) ;
    public final EObject ruleValidator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_BEGIN_8=null;
        Token this_END_10=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_comparison_9_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:1252:2: ( (otherlv_0= Validator ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= RightParenthesis otherlv_7= EqualsSignGreaterThanSign this_BEGIN_8= RULE_BEGIN ( (lv_comparison_9_0= ruleExpression ) ) this_END_10= RULE_END ) )
            // InternalCMSdslParser.g:1253:2: (otherlv_0= Validator ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= RightParenthesis otherlv_7= EqualsSignGreaterThanSign this_BEGIN_8= RULE_BEGIN ( (lv_comparison_9_0= ruleExpression ) ) this_END_10= RULE_END )
            {
            // InternalCMSdslParser.g:1253:2: (otherlv_0= Validator ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= RightParenthesis otherlv_7= EqualsSignGreaterThanSign this_BEGIN_8= RULE_BEGIN ( (lv_comparison_9_0= ruleExpression ) ) this_END_10= RULE_END )
            // InternalCMSdslParser.g:1254:3: otherlv_0= Validator ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= RightParenthesis otherlv_7= EqualsSignGreaterThanSign this_BEGIN_8= RULE_BEGIN ( (lv_comparison_9_0= ruleExpression ) ) this_END_10= RULE_END
            {
            otherlv_0=(Token)match(input,Validator,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getValidatorAccess().getValidatorKeyword_0());
            		
            // InternalCMSdslParser.g:1258:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCMSdslParser.g:1259:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCMSdslParser.g:1259:4: (lv_name_1_0= RULE_ID )
            // InternalCMSdslParser.g:1260:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getValidatorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValidatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getValidatorAccess().getLeftParenthesisKeyword_2());
            		
            // InternalCMSdslParser.g:1280:3: ( (lv_params_3_0= ruleParameter ) )
            // InternalCMSdslParser.g:1281:4: (lv_params_3_0= ruleParameter )
            {
            // InternalCMSdslParser.g:1281:4: (lv_params_3_0= ruleParameter )
            // InternalCMSdslParser.g:1282:5: lv_params_3_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getValidatorAccess().getParamsParameterParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_params_3_0=ruleParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValidatorRule());
            					}
            					add(
            						current,
            						"params",
            						lv_params_3_0,
            						"jope015.mdsd2021.reexam.CMSdsl.Parameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCMSdslParser.g:1299:3: (otherlv_4= Comma ( (lv_params_5_0= ruleParameter ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Comma) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCMSdslParser.g:1300:4: otherlv_4= Comma ( (lv_params_5_0= ruleParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getValidatorAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCMSdslParser.g:1304:4: ( (lv_params_5_0= ruleParameter ) )
            	    // InternalCMSdslParser.g:1305:5: (lv_params_5_0= ruleParameter )
            	    {
            	    // InternalCMSdslParser.g:1305:5: (lv_params_5_0= ruleParameter )
            	    // InternalCMSdslParser.g:1306:6: lv_params_5_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getValidatorAccess().getParamsParameterParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_params_5_0=ruleParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getValidatorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"params",
            	    							lv_params_5_0,
            	    							"jope015.mdsd2021.reexam.CMSdsl.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getValidatorAccess().getRightParenthesisKeyword_5());
            		
            otherlv_7=(Token)match(input,EqualsSignGreaterThanSign,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getValidatorAccess().getEqualsSignGreaterThanSignKeyword_6());
            		
            this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

            			newLeafNode(this_BEGIN_8, grammarAccess.getValidatorAccess().getBEGINTerminalRuleCall_7());
            		
            // InternalCMSdslParser.g:1336:3: ( (lv_comparison_9_0= ruleExpression ) )
            // InternalCMSdslParser.g:1337:4: (lv_comparison_9_0= ruleExpression )
            {
            // InternalCMSdslParser.g:1337:4: (lv_comparison_9_0= ruleExpression )
            // InternalCMSdslParser.g:1338:5: lv_comparison_9_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getValidatorAccess().getComparisonExpressionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_18);
            lv_comparison_9_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValidatorRule());
            					}
            					set(
            						current,
            						"comparison",
            						lv_comparison_9_0,
            						"jope015.mdsd2021.reexam.CMSdsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_10=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_10, grammarAccess.getValidatorAccess().getENDTerminalRuleCall_9());
            		

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
    // $ANTLR end "ruleValidator"


    // $ANTLR start "entryRuleParameter"
    // InternalCMSdslParser.g:1363:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalCMSdslParser.g:1363:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalCMSdslParser.g:1364:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalCMSdslParser.g:1370:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleDataType ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:1376:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleDataType ) ) ) )
            // InternalCMSdslParser.g:1377:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleDataType ) ) )
            {
            // InternalCMSdslParser.g:1377:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleDataType ) ) )
            // InternalCMSdslParser.g:1378:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleDataType ) )
            {
            // InternalCMSdslParser.g:1378:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCMSdslParser.g:1379:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCMSdslParser.g:1379:4: (lv_name_0_0= RULE_ID )
            // InternalCMSdslParser.g:1380:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalCMSdslParser.g:1400:3: ( (lv_type_2_0= ruleDataType ) )
            // InternalCMSdslParser.g:1401:4: (lv_type_2_0= ruleDataType )
            {
            // InternalCMSdslParser.g:1401:4: (lv_type_2_0= ruleDataType )
            // InternalCMSdslParser.g:1402:5: lv_type_2_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeDataTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"jope015.mdsd2021.reexam.CMSdsl.DataType");
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleParameterUse"
    // InternalCMSdslParser.g:1423:1: entryRuleParameterUse returns [EObject current=null] : iv_ruleParameterUse= ruleParameterUse EOF ;
    public final EObject entryRuleParameterUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterUse = null;


        try {
            // InternalCMSdslParser.g:1423:53: (iv_ruleParameterUse= ruleParameterUse EOF )
            // InternalCMSdslParser.g:1424:2: iv_ruleParameterUse= ruleParameterUse EOF
            {
             newCompositeNode(grammarAccess.getParameterUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterUse=ruleParameterUse();

            state._fsp--;

             current =iv_ruleParameterUse; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterUse"


    // $ANTLR start "ruleParameterUse"
    // InternalCMSdslParser.g:1430:1: ruleParameterUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleParameterUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalCMSdslParser.g:1436:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalCMSdslParser.g:1437:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalCMSdslParser.g:1437:2: ( (otherlv_0= RULE_ID ) )
            // InternalCMSdslParser.g:1438:3: (otherlv_0= RULE_ID )
            {
            // InternalCMSdslParser.g:1438:3: (otherlv_0= RULE_ID )
            // InternalCMSdslParser.g:1439:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getParameterUseRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getParameterUseAccess().getRefParameterCrossReference_0());
            			

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
    // $ANTLR end "ruleParameterUse"


    // $ANTLR start "entryRuleValidatorUse"
    // InternalCMSdslParser.g:1453:1: entryRuleValidatorUse returns [EObject current=null] : iv_ruleValidatorUse= ruleValidatorUse EOF ;
    public final EObject entryRuleValidatorUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidatorUse = null;


        try {
            // InternalCMSdslParser.g:1453:53: (iv_ruleValidatorUse= ruleValidatorUse EOF )
            // InternalCMSdslParser.g:1454:2: iv_ruleValidatorUse= ruleValidatorUse EOF
            {
             newCompositeNode(grammarAccess.getValidatorUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidatorUse=ruleValidatorUse();

            state._fsp--;

             current =iv_ruleValidatorUse; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValidatorUse"


    // $ANTLR start "ruleValidatorUse"
    // InternalCMSdslParser.g:1460:1: ruleValidatorUse returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) (otherlv_3= Comma ( (otherlv_4= RULE_ID ) ) )* otherlv_5= RightParenthesis ) ;
    public final EObject ruleValidatorUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalCMSdslParser.g:1466:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) (otherlv_3= Comma ( (otherlv_4= RULE_ID ) ) )* otherlv_5= RightParenthesis ) )
            // InternalCMSdslParser.g:1467:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) (otherlv_3= Comma ( (otherlv_4= RULE_ID ) ) )* otherlv_5= RightParenthesis )
            {
            // InternalCMSdslParser.g:1467:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) (otherlv_3= Comma ( (otherlv_4= RULE_ID ) ) )* otherlv_5= RightParenthesis )
            // InternalCMSdslParser.g:1468:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) (otherlv_3= Comma ( (otherlv_4= RULE_ID ) ) )* otherlv_5= RightParenthesis
            {
            // InternalCMSdslParser.g:1468:3: ( (otherlv_0= RULE_ID ) )
            // InternalCMSdslParser.g:1469:4: (otherlv_0= RULE_ID )
            {
            // InternalCMSdslParser.g:1469:4: (otherlv_0= RULE_ID )
            // InternalCMSdslParser.g:1470:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValidatorUseRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getValidatorUseAccess().getValidatorValidatorCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getValidatorUseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCMSdslParser.g:1485:3: ( (otherlv_2= RULE_ID ) )
            // InternalCMSdslParser.g:1486:4: (otherlv_2= RULE_ID )
            {
            // InternalCMSdslParser.g:1486:4: (otherlv_2= RULE_ID )
            // InternalCMSdslParser.g:1487:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValidatorUseRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_2, grammarAccess.getValidatorUseAccess().getArgsFieldCrossReference_2_0());
            				

            }


            }

            // InternalCMSdslParser.g:1498:3: (otherlv_3= Comma ( (otherlv_4= RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Comma) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCMSdslParser.g:1499:4: otherlv_3= Comma ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getValidatorUseAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalCMSdslParser.g:1503:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalCMSdslParser.g:1504:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalCMSdslParser.g:1504:5: (otherlv_4= RULE_ID )
            	    // InternalCMSdslParser.g:1505:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getValidatorUseRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    						newLeafNode(otherlv_4, grammarAccess.getValidatorUseAccess().getArgsFieldCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getValidatorUseAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleValidatorUse"


    // $ANTLR start "entryRuleRelationship"
    // InternalCMSdslParser.g:1525:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalCMSdslParser.g:1525:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalCMSdslParser.g:1526:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalCMSdslParser.g:1532:1: ruleRelationship returns [EObject current=null] : ( ( (lv_relationType_0_0= ruleRelationshipType ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_relationType_0_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:1538:2: ( ( ( (lv_relationType_0_0= ruleRelationshipType ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // InternalCMSdslParser.g:1539:2: ( ( (lv_relationType_0_0= ruleRelationshipType ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalCMSdslParser.g:1539:2: ( ( (lv_relationType_0_0= ruleRelationshipType ) ) ( (otherlv_1= RULE_ID ) ) )
            // InternalCMSdslParser.g:1540:3: ( (lv_relationType_0_0= ruleRelationshipType ) ) ( (otherlv_1= RULE_ID ) )
            {
            // InternalCMSdslParser.g:1540:3: ( (lv_relationType_0_0= ruleRelationshipType ) )
            // InternalCMSdslParser.g:1541:4: (lv_relationType_0_0= ruleRelationshipType )
            {
            // InternalCMSdslParser.g:1541:4: (lv_relationType_0_0= ruleRelationshipType )
            // InternalCMSdslParser.g:1542:5: lv_relationType_0_0= ruleRelationshipType
            {

            					newCompositeNode(grammarAccess.getRelationshipAccess().getRelationTypeRelationshipTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_relationType_0_0=ruleRelationshipType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationshipRule());
            					}
            					set(
            						current,
            						"relationType",
            						lv_relationType_0_0,
            						"jope015.mdsd2021.reexam.CMSdsl.RelationshipType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCMSdslParser.g:1559:3: ( (otherlv_1= RULE_ID ) )
            // InternalCMSdslParser.g:1560:4: (otherlv_1= RULE_ID )
            {
            // InternalCMSdslParser.g:1560:4: (otherlv_1= RULE_ID )
            // InternalCMSdslParser.g:1561:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationshipRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getRelationshipAccess().getEntityEntityCrossReference_1_0());
            				

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
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleRelationshipType"
    // InternalCMSdslParser.g:1576:1: entryRuleRelationshipType returns [EObject current=null] : iv_ruleRelationshipType= ruleRelationshipType EOF ;
    public final EObject entryRuleRelationshipType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipType = null;


        try {
            // InternalCMSdslParser.g:1576:57: (iv_ruleRelationshipType= ruleRelationshipType EOF )
            // InternalCMSdslParser.g:1577:2: iv_ruleRelationshipType= ruleRelationshipType EOF
            {
             newCompositeNode(grammarAccess.getRelationshipTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationshipType=ruleRelationshipType();

            state._fsp--;

             current =iv_ruleRelationshipType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRelationshipType"


    // $ANTLR start "ruleRelationshipType"
    // InternalCMSdslParser.g:1583:1: ruleRelationshipType returns [EObject current=null] : ( ( () otherlv_1= Belongs otherlv_2= To ) | ( () otherlv_4= Belongs otherlv_5= To otherlv_6= Many ) | ( () otherlv_8= Has otherlv_9= One ) | ( () otherlv_11= Has otherlv_12= Many ) ) ;
    public final EObject ruleRelationshipType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalCMSdslParser.g:1589:2: ( ( ( () otherlv_1= Belongs otherlv_2= To ) | ( () otherlv_4= Belongs otherlv_5= To otherlv_6= Many ) | ( () otherlv_8= Has otherlv_9= One ) | ( () otherlv_11= Has otherlv_12= Many ) ) )
            // InternalCMSdslParser.g:1590:2: ( ( () otherlv_1= Belongs otherlv_2= To ) | ( () otherlv_4= Belongs otherlv_5= To otherlv_6= Many ) | ( () otherlv_8= Has otherlv_9= One ) | ( () otherlv_11= Has otherlv_12= Many ) )
            {
            // InternalCMSdslParser.g:1590:2: ( ( () otherlv_1= Belongs otherlv_2= To ) | ( () otherlv_4= Belongs otherlv_5= To otherlv_6= Many ) | ( () otherlv_8= Has otherlv_9= One ) | ( () otherlv_11= Has otherlv_12= Many ) )
            int alt14=4;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Belongs) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==To) ) {
                    int LA14_3 = input.LA(3);

                    if ( (LA14_3==Many) ) {
                        alt14=2;
                    }
                    else if ( (LA14_3==EOF||LA14_3==RULE_ID) ) {
                        alt14=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA14_0==Has) ) {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==One) ) {
                    alt14=3;
                }
                else if ( (LA14_2==Many) ) {
                    alt14=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalCMSdslParser.g:1591:3: ( () otherlv_1= Belongs otherlv_2= To )
                    {
                    // InternalCMSdslParser.g:1591:3: ( () otherlv_1= Belongs otherlv_2= To )
                    // InternalCMSdslParser.g:1592:4: () otherlv_1= Belongs otherlv_2= To
                    {
                    // InternalCMSdslParser.g:1592:4: ()
                    // InternalCMSdslParser.g:1593:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationshipTypeAccess().getBelongsToAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,Belongs,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getRelationshipTypeAccess().getBelongsKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,To,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getRelationshipTypeAccess().getToKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCMSdslParser.g:1609:3: ( () otherlv_4= Belongs otherlv_5= To otherlv_6= Many )
                    {
                    // InternalCMSdslParser.g:1609:3: ( () otherlv_4= Belongs otherlv_5= To otherlv_6= Many )
                    // InternalCMSdslParser.g:1610:4: () otherlv_4= Belongs otherlv_5= To otherlv_6= Many
                    {
                    // InternalCMSdslParser.g:1610:4: ()
                    // InternalCMSdslParser.g:1611:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationshipTypeAccess().getBelongsToManyAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,Belongs,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelationshipTypeAccess().getBelongsKeyword_1_1());
                    			
                    otherlv_5=(Token)match(input,To,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getRelationshipTypeAccess().getToKeyword_1_2());
                    			
                    otherlv_6=(Token)match(input,Many,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelationshipTypeAccess().getManyKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCMSdslParser.g:1631:3: ( () otherlv_8= Has otherlv_9= One )
                    {
                    // InternalCMSdslParser.g:1631:3: ( () otherlv_8= Has otherlv_9= One )
                    // InternalCMSdslParser.g:1632:4: () otherlv_8= Has otherlv_9= One
                    {
                    // InternalCMSdslParser.g:1632:4: ()
                    // InternalCMSdslParser.g:1633:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationshipTypeAccess().getHasOneAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,Has,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getRelationshipTypeAccess().getHasKeyword_2_1());
                    			
                    otherlv_9=(Token)match(input,One,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getRelationshipTypeAccess().getOneKeyword_2_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCMSdslParser.g:1649:3: ( () otherlv_11= Has otherlv_12= Many )
                    {
                    // InternalCMSdslParser.g:1649:3: ( () otherlv_11= Has otherlv_12= Many )
                    // InternalCMSdslParser.g:1650:4: () otherlv_11= Has otherlv_12= Many
                    {
                    // InternalCMSdslParser.g:1650:4: ()
                    // InternalCMSdslParser.g:1651:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationshipTypeAccess().getHasManyAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,Has,FOLLOW_20); 

                    				newLeafNode(otherlv_11, grammarAccess.getRelationshipTypeAccess().getHasKeyword_3_1());
                    			
                    otherlv_12=(Token)match(input,Many,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getRelationshipTypeAccess().getManyKeyword_3_2());
                    			

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
    // $ANTLR end "ruleRelationshipType"


    // $ANTLR start "entryRuleExpression"
    // InternalCMSdslParser.g:1670:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalCMSdslParser.g:1670:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalCMSdslParser.g:1671:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalCMSdslParser.g:1677:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:1683:2: (this_Or_0= ruleOr )
            // InternalCMSdslParser.g:1684:2: this_Or_0= ruleOr
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Or_0=ruleOr();

            state._fsp--;


            		current = this_Or_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleEval"
    // InternalCMSdslParser.g:1695:1: entryRuleEval returns [EObject current=null] : iv_ruleEval= ruleEval EOF ;
    public final EObject entryRuleEval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEval = null;


        try {
            // InternalCMSdslParser.g:1695:45: (iv_ruleEval= ruleEval EOF )
            // InternalCMSdslParser.g:1696:2: iv_ruleEval= ruleEval EOF
            {
             newCompositeNode(grammarAccess.getEvalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEval=ruleEval();

            state._fsp--;

             current =iv_ruleEval; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEval"


    // $ANTLR start "ruleEval"
    // InternalCMSdslParser.g:1702:1: ruleEval returns [EObject current=null] : ( () otherlv_1= Eval ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleEval() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:1708:2: ( ( () otherlv_1= Eval ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalCMSdslParser.g:1709:2: ( () otherlv_1= Eval ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalCMSdslParser.g:1709:2: ( () otherlv_1= Eval ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalCMSdslParser.g:1710:3: () otherlv_1= Eval ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalCMSdslParser.g:1710:3: ()
            // InternalCMSdslParser.g:1711:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvalAccess().getEvalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Eval,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getEvalAccess().getEvalKeyword_1());
            		
            // InternalCMSdslParser.g:1721:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalCMSdslParser.g:1722:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalCMSdslParser.g:1722:4: (lv_expression_2_0= ruleExpression )
            // InternalCMSdslParser.g:1723:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getEvalAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvalRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"jope015.mdsd2021.reexam.CMSdsl.Expression");
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
    // $ANTLR end "ruleEval"


    // $ANTLR start "entryRuleOr"
    // InternalCMSdslParser.g:1744:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalCMSdslParser.g:1744:43: (iv_ruleOr= ruleOr EOF )
            // InternalCMSdslParser.g:1745:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalCMSdslParser.g:1751:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:1757:2: ( (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalCMSdslParser.g:1758:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalCMSdslParser.g:1758:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalCMSdslParser.g:1759:3: this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCMSdslParser.g:1767:3: ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==VerticalLineVerticalLine) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCMSdslParser.g:1768:4: () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalCMSdslParser.g:1768:4: ()
            	    // InternalCMSdslParser.g:1769:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,VerticalLineVerticalLine,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalCMSdslParser.g:1779:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalCMSdslParser.g:1780:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalCMSdslParser.g:1780:5: (lv_right_3_0= ruleAnd )
            	    // InternalCMSdslParser.g:1781:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"jope015.mdsd2021.reexam.CMSdsl.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalCMSdslParser.g:1803:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalCMSdslParser.g:1803:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalCMSdslParser.g:1804:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalCMSdslParser.g:1810:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:1816:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalCMSdslParser.g:1817:2: (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalCMSdslParser.g:1817:2: (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalCMSdslParser.g:1818:3: this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCMSdslParser.g:1826:3: ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==AmpersandAmpersand) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCMSdslParser.g:1827:4: () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalCMSdslParser.g:1827:4: ()
            	    // InternalCMSdslParser.g:1828:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,AmpersandAmpersand,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalCMSdslParser.g:1838:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalCMSdslParser.g:1839:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalCMSdslParser.g:1839:5: (lv_right_3_0= ruleEquality )
            	    // InternalCMSdslParser.g:1840:6: lv_right_3_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"jope015.mdsd2021.reexam.CMSdsl.Equality");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalCMSdslParser.g:1862:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalCMSdslParser.g:1862:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalCMSdslParser.g:1863:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalCMSdslParser.g:1869:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:1875:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalCMSdslParser.g:1876:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalCMSdslParser.g:1876:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalCMSdslParser.g:1877:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCMSdslParser.g:1885:3: ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==ExclamationMarkEqualsSign||LA18_0==EqualsSignEqualsSign) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCMSdslParser.g:1886:4: () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalCMSdslParser.g:1886:4: ()
            	    // InternalCMSdslParser.g:1887:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCMSdslParser.g:1893:4: ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) )
            	    // InternalCMSdslParser.g:1894:5: ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) )
            	    {
            	    // InternalCMSdslParser.g:1894:5: ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) )
            	    // InternalCMSdslParser.g:1895:6: (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign )
            	    {
            	    // InternalCMSdslParser.g:1895:6: (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==EqualsSignEqualsSign) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==ExclamationMarkEqualsSign) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalCMSdslParser.g:1896:7: lv_op_2_1= EqualsSignEqualsSign
            	            {
            	            lv_op_2_1=(Token)match(input,EqualsSignEqualsSign,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalCMSdslParser.g:1907:7: lv_op_2_2= ExclamationMarkEqualsSign
            	            {
            	            lv_op_2_2=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalCMSdslParser.g:1920:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalCMSdslParser.g:1921:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalCMSdslParser.g:1921:5: (lv_right_3_0= ruleComparison )
            	    // InternalCMSdslParser.g:1922:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"jope015.mdsd2021.reexam.CMSdsl.Comparison");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalCMSdslParser.g:1944:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalCMSdslParser.g:1944:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalCMSdslParser.g:1945:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalCMSdslParser.g:1951:1: ruleComparison returns [EObject current=null] : (this_PlusMinus_0= rulePlusMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PlusMinus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:1957:2: ( (this_PlusMinus_0= rulePlusMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusMinus ) ) )* ) )
            // InternalCMSdslParser.g:1958:2: (this_PlusMinus_0= rulePlusMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusMinus ) ) )* )
            {
            // InternalCMSdslParser.g:1958:2: (this_PlusMinus_0= rulePlusMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusMinus ) ) )* )
            // InternalCMSdslParser.g:1959:3: this_PlusMinus_0= rulePlusMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_PlusMinus_0=rulePlusMinus();

            state._fsp--;


            			current = this_PlusMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCMSdslParser.g:1967:3: ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusMinus ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==LessThanSignEqualsSign||LA20_0==GreaterThanSignEqualsSign||(LA20_0>=LessThanSign && LA20_0<=GreaterThanSign)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCMSdslParser.g:1968:4: () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusMinus ) )
            	    {
            	    // InternalCMSdslParser.g:1968:4: ()
            	    // InternalCMSdslParser.g:1969:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCMSdslParser.g:1975:4: ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) )
            	    // InternalCMSdslParser.g:1976:5: ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) )
            	    {
            	    // InternalCMSdslParser.g:1976:5: ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) )
            	    // InternalCMSdslParser.g:1977:6: (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign )
            	    {
            	    // InternalCMSdslParser.g:1977:6: (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign )
            	    int alt19=4;
            	    switch ( input.LA(1) ) {
            	    case GreaterThanSignEqualsSign:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case LessThanSignEqualsSign:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case GreaterThanSign:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    case LessThanSign:
            	        {
            	        alt19=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // InternalCMSdslParser.g:1978:7: lv_op_2_1= GreaterThanSignEqualsSign
            	            {
            	            lv_op_2_1=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalCMSdslParser.g:1989:7: lv_op_2_2= LessThanSignEqualsSign
            	            {
            	            lv_op_2_2=(Token)match(input,LessThanSignEqualsSign,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalCMSdslParser.g:2000:7: lv_op_2_3= GreaterThanSign
            	            {
            	            lv_op_2_3=(Token)match(input,GreaterThanSign,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalCMSdslParser.g:2011:7: lv_op_2_4= LessThanSign
            	            {
            	            lv_op_2_4=(Token)match(input,LessThanSign,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalCMSdslParser.g:2024:4: ( (lv_right_3_0= rulePlusMinus ) )
            	    // InternalCMSdslParser.g:2025:5: (lv_right_3_0= rulePlusMinus )
            	    {
            	    // InternalCMSdslParser.g:2025:5: (lv_right_3_0= rulePlusMinus )
            	    // InternalCMSdslParser.g:2026:6: lv_right_3_0= rulePlusMinus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_right_3_0=rulePlusMinus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"jope015.mdsd2021.reexam.CMSdsl.PlusMinus");
            	    						afterParserOrEnumRuleCall();
            	    					

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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusMinus"
    // InternalCMSdslParser.g:2048:1: entryRulePlusMinus returns [EObject current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final EObject entryRulePlusMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinus = null;


        try {
            // InternalCMSdslParser.g:2048:50: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalCMSdslParser.g:2049:2: iv_rulePlusMinus= rulePlusMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusMinus=rulePlusMinus();

            state._fsp--;

             current =iv_rulePlusMinus; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePlusMinus"


    // $ANTLR start "rulePlusMinus"
    // InternalCMSdslParser.g:2055:1: rulePlusMinus returns [EObject current=null] : (this_MulDiv_0= ruleMulDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMulDiv ) ) )* ) ;
    public final EObject rulePlusMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:2061:2: ( (this_MulDiv_0= ruleMulDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMulDiv ) ) )* ) )
            // InternalCMSdslParser.g:2062:2: (this_MulDiv_0= ruleMulDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMulDiv ) ) )* )
            {
            // InternalCMSdslParser.g:2062:2: (this_MulDiv_0= ruleMulDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMulDiv ) ) )* )
            // InternalCMSdslParser.g:2063:3: this_MulDiv_0= ruleMulDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMulDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusMinusAccess().getMulDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_MulDiv_0=ruleMulDiv();

            state._fsp--;


            			current = this_MulDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCMSdslParser.g:2071:3: ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMulDiv ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==PlusSign||LA22_0==HyphenMinus) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCMSdslParser.g:2072:4: ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMulDiv ) )
            	    {
            	    // InternalCMSdslParser.g:2072:4: ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==PlusSign) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==HyphenMinus) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalCMSdslParser.g:2073:5: ( () otherlv_2= PlusSign )
            	            {
            	            // InternalCMSdslParser.g:2073:5: ( () otherlv_2= PlusSign )
            	            // InternalCMSdslParser.g:2074:6: () otherlv_2= PlusSign
            	            {
            	            // InternalCMSdslParser.g:2074:6: ()
            	            // InternalCMSdslParser.g:2075:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,PlusSign,FOLLOW_17); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalCMSdslParser.g:2087:5: ( () otherlv_4= HyphenMinus )
            	            {
            	            // InternalCMSdslParser.g:2087:5: ( () otherlv_4= HyphenMinus )
            	            // InternalCMSdslParser.g:2088:6: () otherlv_4= HyphenMinus
            	            {
            	            // InternalCMSdslParser.g:2088:6: ()
            	            // InternalCMSdslParser.g:2089:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,HyphenMinus,FOLLOW_17); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalCMSdslParser.g:2101:4: ( (lv_right_5_0= ruleMulDiv ) )
            	    // InternalCMSdslParser.g:2102:5: (lv_right_5_0= ruleMulDiv )
            	    {
            	    // InternalCMSdslParser.g:2102:5: (lv_right_5_0= ruleMulDiv )
            	    // InternalCMSdslParser.g:2103:6: lv_right_5_0= ruleMulDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusMinusAccess().getRightMulDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_right_5_0=ruleMulDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"jope015.mdsd2021.reexam.CMSdsl.MulDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

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
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleMulDiv"
    // InternalCMSdslParser.g:2125:1: entryRuleMulDiv returns [EObject current=null] : iv_ruleMulDiv= ruleMulDiv EOF ;
    public final EObject entryRuleMulDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulDiv = null;


        try {
            // InternalCMSdslParser.g:2125:47: (iv_ruleMulDiv= ruleMulDiv EOF )
            // InternalCMSdslParser.g:2126:2: iv_ruleMulDiv= ruleMulDiv EOF
            {
             newCompositeNode(grammarAccess.getMulDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulDiv=ruleMulDiv();

            state._fsp--;

             current =iv_ruleMulDiv; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMulDiv"


    // $ANTLR start "ruleMulDiv"
    // InternalCMSdslParser.g:2132:1: ruleMulDiv returns [EObject current=null] : (this_Atomic_0= ruleAtomic ( ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ) ( (lv_right_3_0= ruleAtomic ) ) )* ) ;
    public final EObject ruleMulDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Atomic_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:2138:2: ( (this_Atomic_0= ruleAtomic ( ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ) ( (lv_right_3_0= ruleAtomic ) ) )* ) )
            // InternalCMSdslParser.g:2139:2: (this_Atomic_0= ruleAtomic ( ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ) ( (lv_right_3_0= ruleAtomic ) ) )* )
            {
            // InternalCMSdslParser.g:2139:2: (this_Atomic_0= ruleAtomic ( ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ) ( (lv_right_3_0= ruleAtomic ) ) )* )
            // InternalCMSdslParser.g:2140:3: this_Atomic_0= ruleAtomic ( ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ) ( (lv_right_3_0= ruleAtomic ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulDivAccess().getAtomicParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_Atomic_0=ruleAtomic();

            state._fsp--;


            			current = this_Atomic_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCMSdslParser.g:2148:3: ( ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ) ( (lv_right_3_0= ruleAtomic ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Asterisk||LA24_0==Solidus) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCMSdslParser.g:2149:4: ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ) ( (lv_right_3_0= ruleAtomic ) )
            	    {
            	    // InternalCMSdslParser.g:2149:4: ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) )
            	    // InternalCMSdslParser.g:2150:5: () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) )
            	    {
            	    // InternalCMSdslParser.g:2150:5: ()
            	    // InternalCMSdslParser.g:2151:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMulDivAccess().getMulDivLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalCMSdslParser.g:2157:5: ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) )
            	    // InternalCMSdslParser.g:2158:6: ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) )
            	    {
            	    // InternalCMSdslParser.g:2158:6: ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) )
            	    // InternalCMSdslParser.g:2159:7: (lv_op_2_1= Asterisk | lv_op_2_2= Solidus )
            	    {
            	    // InternalCMSdslParser.g:2159:7: (lv_op_2_1= Asterisk | lv_op_2_2= Solidus )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==Asterisk) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==Solidus) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalCMSdslParser.g:2160:8: lv_op_2_1= Asterisk
            	            {
            	            lv_op_2_1=(Token)match(input,Asterisk,FOLLOW_17); 

            	            								newLeafNode(lv_op_2_1, grammarAccess.getMulDivAccess().getOpAsteriskKeyword_1_0_1_0_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getMulDivRule());
            	            								}
            	            								setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            							

            	            }
            	            break;
            	        case 2 :
            	            // InternalCMSdslParser.g:2171:8: lv_op_2_2= Solidus
            	            {
            	            lv_op_2_2=(Token)match(input,Solidus,FOLLOW_17); 

            	            								newLeafNode(lv_op_2_2, grammarAccess.getMulDivAccess().getOpSolidusKeyword_1_0_1_0_1());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getMulDivRule());
            	            								}
            	            								setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            							

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    // InternalCMSdslParser.g:2185:4: ( (lv_right_3_0= ruleAtomic ) )
            	    // InternalCMSdslParser.g:2186:5: (lv_right_3_0= ruleAtomic )
            	    {
            	    // InternalCMSdslParser.g:2186:5: (lv_right_3_0= ruleAtomic )
            	    // InternalCMSdslParser.g:2187:6: lv_right_3_0= ruleAtomic
            	    {

            	    						newCompositeNode(grammarAccess.getMulDivAccess().getRightAtomicParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_right_3_0=ruleAtomic();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"jope015.mdsd2021.reexam.CMSdsl.Atomic");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "ruleMulDiv"


    // $ANTLR start "entryRuleAtomic"
    // InternalCMSdslParser.g:2209:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalCMSdslParser.g:2209:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalCMSdslParser.g:2210:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalCMSdslParser.g:2216:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | (otherlv_6= LeftParenthesis this_Expression_7= ruleExpression otherlv_8= RightParenthesis ) | this_ParameterUse_9= ruleParameterUse ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_Expression_7 = null;

        EObject this_ParameterUse_9 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:2222:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | (otherlv_6= LeftParenthesis this_Expression_7= ruleExpression otherlv_8= RightParenthesis ) | this_ParameterUse_9= ruleParameterUse ) )
            // InternalCMSdslParser.g:2223:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | (otherlv_6= LeftParenthesis this_Expression_7= ruleExpression otherlv_8= RightParenthesis ) | this_ParameterUse_9= ruleParameterUse )
            {
            // InternalCMSdslParser.g:2223:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | (otherlv_6= LeftParenthesis this_Expression_7= ruleExpression otherlv_8= RightParenthesis ) | this_ParameterUse_9= ruleParameterUse )
            int alt26=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt26=1;
                }
                break;
            case RULE_STRING:
                {
                alt26=2;
                }
                break;
            case False:
            case True:
                {
                alt26=3;
                }
                break;
            case LeftParenthesis:
                {
                alt26=4;
                }
                break;
            case RULE_ID:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalCMSdslParser.g:2224:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalCMSdslParser.g:2224:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalCMSdslParser.g:2225:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalCMSdslParser.g:2225:4: ()
                    // InternalCMSdslParser.g:2226:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getNumAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:2232:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalCMSdslParser.g:2233:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalCMSdslParser.g:2233:5: (lv_value_1_0= RULE_INT )
                    // InternalCMSdslParser.g:2234:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCMSdslParser.g:2252:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:2252:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:2253:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:2253:4: ()
                    // InternalCMSdslParser.g:2254:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getStrAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:2260:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:2261:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:2261:5: (lv_value_3_0= RULE_STRING )
                    // InternalCMSdslParser.g:2262:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCMSdslParser.g:2280:3: ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) )
                    {
                    // InternalCMSdslParser.g:2280:3: ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) )
                    // InternalCMSdslParser.g:2281:4: () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) )
                    {
                    // InternalCMSdslParser.g:2281:4: ()
                    // InternalCMSdslParser.g:2282:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBoolAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:2288:4: ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) )
                    // InternalCMSdslParser.g:2289:5: ( (lv_value_5_1= True | lv_value_5_2= False ) )
                    {
                    // InternalCMSdslParser.g:2289:5: ( (lv_value_5_1= True | lv_value_5_2= False ) )
                    // InternalCMSdslParser.g:2290:6: (lv_value_5_1= True | lv_value_5_2= False )
                    {
                    // InternalCMSdslParser.g:2290:6: (lv_value_5_1= True | lv_value_5_2= False )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==True) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==False) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalCMSdslParser.g:2291:7: lv_value_5_1= True
                            {
                            lv_value_5_1=(Token)match(input,True,FOLLOW_2); 

                            							newLeafNode(lv_value_5_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalCMSdslParser.g:2302:7: lv_value_5_2= False
                            {
                            lv_value_5_2=(Token)match(input,False,FOLLOW_2); 

                            							newLeafNode(lv_value_5_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCMSdslParser.g:2317:3: (otherlv_6= LeftParenthesis this_Expression_7= ruleExpression otherlv_8= RightParenthesis )
                    {
                    // InternalCMSdslParser.g:2317:3: (otherlv_6= LeftParenthesis this_Expression_7= ruleExpression otherlv_8= RightParenthesis )
                    // InternalCMSdslParser.g:2318:4: otherlv_6= LeftParenthesis this_Expression_7= ruleExpression otherlv_8= RightParenthesis
                    {
                    otherlv_6=(Token)match(input,LeftParenthesis,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getAtomicAccess().getExpressionParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_28);
                    this_Expression_7=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_7;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_8=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getAtomicAccess().getRightParenthesisKeyword_3_2());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCMSdslParser.g:2336:3: this_ParameterUse_9= ruleParameterUse
                    {

                    			newCompositeNode(grammarAccess.getAtomicAccess().getParameterUseParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterUse_9=ruleParameterUse();

                    state._fsp--;


                    			current = this_ParameterUse_9;
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
    // $ANTLR end "ruleAtomic"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0020000002010030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00200000100019C0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0002000080000200L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0020000000240000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000105C20000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0020000020000400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000480000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x01C0040040100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002400000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000C009000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000A00000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001100000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080000000000L});

}