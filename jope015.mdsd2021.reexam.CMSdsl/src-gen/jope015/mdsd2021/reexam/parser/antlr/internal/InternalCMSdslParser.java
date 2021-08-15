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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "InputType", "Validator", "Database", "Hostname", "Password", "Textarea", "Username", "Belongs", "Default", "Dialect", "Library", "Project", "Success", "Warning", "Entity", "Number", "String", "Check", "Email", "Error", "False", "Field", "Float", "Bool", "Date", "Eval", "Hide", "Long", "Many", "Port", "Test", "Text", "True", "And", "Has", "Int", "One", "ExclamationMarkEqualsSign", "AmpersandAmpersand", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "EqualsSignGreaterThanSign", "GreaterThanSignEqualsSign", "To", "VerticalLineVerticalLine", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "Solidus", "Colon", "LessThanSign", "GreaterThanSign", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Entity=18;
    public static final int Email=22;
    public static final int RULE_BEGIN=59;
    public static final int EqualsSignGreaterThanSign=45;
    public static final int Port=33;
    public static final int Check=21;
    public static final int True=36;
    public static final int String=20;
    public static final int False=24;
    public static final int Success=16;
    public static final int LessThanSign=57;
    public static final int LeftParenthesis=49;
    public static final int Bool=27;
    public static final int Test=34;
    public static final int Database=6;
    public static final int To=47;
    public static final int Eval=29;
    public static final int GreaterThanSign=58;
    public static final int RULE_ID=61;
    public static final int Hostname=7;
    public static final int RightParenthesis=50;
    public static final int Belongs=11;
    public static final int GreaterThanSignEqualsSign=46;
    public static final int Project=15;
    public static final int Float=26;
    public static final int EqualsSignEqualsSign=44;
    public static final int InputType=4;
    public static final int And=37;
    public static final int PlusSign=52;
    public static final int RULE_INT=62;
    public static final int Long=31;
    public static final int RULE_ML_COMMENT=64;
    public static final int Library=14;
    public static final int Hide=30;
    public static final int Warning=17;
    public static final int RULE_END=60;
    public static final int VerticalLineVerticalLine=48;
    public static final int One=40;
    public static final int RULE_STRING=63;
    public static final int Int=39;
    public static final int RULE_SL_COMMENT=65;
    public static final int Field=25;
    public static final int Comma=53;
    public static final int HyphenMinus=54;
    public static final int Textarea=9;
    public static final int Number=19;
    public static final int AmpersandAmpersand=42;
    public static final int Dialect=13;
    public static final int Many=32;
    public static final int LessThanSignEqualsSign=43;
    public static final int Solidus=55;
    public static final int Colon=56;
    public static final int EOF=-1;
    public static final int Asterisk=51;
    public static final int Password=8;
    public static final int RULE_WS=66;
    public static final int Error=23;
    public static final int Text=35;
    public static final int RULE_ANY_OTHER=67;
    public static final int Default=12;
    public static final int Date=28;
    public static final int Username=10;
    public static final int Has=38;
    public static final int ExclamationMarkEqualsSign=41;
    public static final int Validator=5;

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

                if ( ((LA3_0>=Hostname && LA3_0<=Password)||LA3_0==Username||(LA3_0>=Dialect && LA3_0<=Library)||LA3_0==Port) ) {
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
    // InternalCMSdslParser.g:555:1: ruleEntity returns [EObject current=null] : ( () otherlv_1= Entity ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_relations_3_0= ruleRelationship ) ) (otherlv_4= And ( (lv_relations_5_0= ruleRelationship ) ) )* )? otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_members_8_0= ruleEntityDecl ) )* this_END_9= RULE_END ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        EObject lv_relations_3_0 = null;

        EObject lv_relations_5_0 = null;

        EObject lv_members_8_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:561:2: ( ( () otherlv_1= Entity ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_relations_3_0= ruleRelationship ) ) (otherlv_4= And ( (lv_relations_5_0= ruleRelationship ) ) )* )? otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_members_8_0= ruleEntityDecl ) )* this_END_9= RULE_END ) )
            // InternalCMSdslParser.g:562:2: ( () otherlv_1= Entity ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_relations_3_0= ruleRelationship ) ) (otherlv_4= And ( (lv_relations_5_0= ruleRelationship ) ) )* )? otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_members_8_0= ruleEntityDecl ) )* this_END_9= RULE_END )
            {
            // InternalCMSdslParser.g:562:2: ( () otherlv_1= Entity ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_relations_3_0= ruleRelationship ) ) (otherlv_4= And ( (lv_relations_5_0= ruleRelationship ) ) )* )? otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_members_8_0= ruleEntityDecl ) )* this_END_9= RULE_END )
            // InternalCMSdslParser.g:563:3: () otherlv_1= Entity ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_relations_3_0= ruleRelationship ) ) (otherlv_4= And ( (lv_relations_5_0= ruleRelationship ) ) )* )? otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_members_8_0= ruleEntityDecl ) )* this_END_9= RULE_END
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

            // InternalCMSdslParser.g:592:3: ( ( (lv_relations_3_0= ruleRelationship ) ) (otherlv_4= And ( (lv_relations_5_0= ruleRelationship ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Belongs||LA6_0==Has) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCMSdslParser.g:593:4: ( (lv_relations_3_0= ruleRelationship ) ) (otherlv_4= And ( (lv_relations_5_0= ruleRelationship ) ) )*
                    {
                    // InternalCMSdslParser.g:593:4: ( (lv_relations_3_0= ruleRelationship ) )
                    // InternalCMSdslParser.g:594:5: (lv_relations_3_0= ruleRelationship )
                    {
                    // InternalCMSdslParser.g:594:5: (lv_relations_3_0= ruleRelationship )
                    // InternalCMSdslParser.g:595:6: lv_relations_3_0= ruleRelationship
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getRelationsRelationshipParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_relations_3_0=ruleRelationship();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						add(
                    							current,
                    							"relations",
                    							lv_relations_3_0,
                    							"jope015.mdsd2021.reexam.CMSdsl.Relationship");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCMSdslParser.g:612:4: (otherlv_4= And ( (lv_relations_5_0= ruleRelationship ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==And) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCMSdslParser.g:613:5: otherlv_4= And ( (lv_relations_5_0= ruleRelationship ) )
                    	    {
                    	    otherlv_4=(Token)match(input,And,FOLLOW_12); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getAndKeyword_3_1_0());
                    	    				
                    	    // InternalCMSdslParser.g:617:5: ( (lv_relations_5_0= ruleRelationship ) )
                    	    // InternalCMSdslParser.g:618:6: (lv_relations_5_0= ruleRelationship )
                    	    {
                    	    // InternalCMSdslParser.g:618:6: (lv_relations_5_0= ruleRelationship )
                    	    // InternalCMSdslParser.g:619:7: lv_relations_5_0= ruleRelationship
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityAccess().getRelationsRelationshipParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_relations_5_0=ruleRelationship();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relations",
                    	    								lv_relations_5_0,
                    	    								"jope015.mdsd2021.reexam.CMSdsl.Relationship");
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

            otherlv_6=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getColonKeyword_4());
            		
            this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            			newLeafNode(this_BEGIN_7, grammarAccess.getEntityAccess().getBEGINTerminalRuleCall_5());
            		
            // InternalCMSdslParser.g:646:3: ( (lv_members_8_0= ruleEntityDecl ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Check||LA7_0==Field||LA7_0==Hide) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCMSdslParser.g:647:4: (lv_members_8_0= ruleEntityDecl )
            	    {
            	    // InternalCMSdslParser.g:647:4: (lv_members_8_0= ruleEntityDecl )
            	    // InternalCMSdslParser.g:648:5: lv_members_8_0= ruleEntityDecl
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getMembersEntityDeclParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_members_8_0=ruleEntityDecl();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"members",
            	    						lv_members_8_0,
            	    						"jope015.mdsd2021.reexam.CMSdsl.EntityDecl");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            this_END_9=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_9, grammarAccess.getEntityAccess().getENDTerminalRuleCall_7());
            		

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
    // InternalCMSdslParser.g:673:1: entryRuleEntityDecl returns [EObject current=null] : iv_ruleEntityDecl= ruleEntityDecl EOF ;
    public final EObject entryRuleEntityDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityDecl = null;


        try {
            // InternalCMSdslParser.g:673:51: (iv_ruleEntityDecl= ruleEntityDecl EOF )
            // InternalCMSdslParser.g:674:2: iv_ruleEntityDecl= ruleEntityDecl EOF
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
    // InternalCMSdslParser.g:680:1: ruleEntityDecl returns [EObject current=null] : (this_Field_0= ruleField | this_ValidationCheck_1= ruleValidationCheck ) ;
    public final EObject ruleEntityDecl() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_ValidationCheck_1 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:686:2: ( (this_Field_0= ruleField | this_ValidationCheck_1= ruleValidationCheck ) )
            // InternalCMSdslParser.g:687:2: (this_Field_0= ruleField | this_ValidationCheck_1= ruleValidationCheck )
            {
            // InternalCMSdslParser.g:687:2: (this_Field_0= ruleField | this_ValidationCheck_1= ruleValidationCheck )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Field||LA8_0==Hide) ) {
                alt8=1;
            }
            else if ( (LA8_0==Check) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCMSdslParser.g:688:3: this_Field_0= ruleField
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
                    // InternalCMSdslParser.g:697:3: this_ValidationCheck_1= ruleValidationCheck
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
    // InternalCMSdslParser.g:709:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalCMSdslParser.g:709:46: (iv_ruleField= ruleField EOF )
            // InternalCMSdslParser.g:710:2: iv_ruleField= ruleField EOF
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
    // InternalCMSdslParser.g:716:1: ruleField returns [EObject current=null] : ( ( (lv_dontShow_0_0= Hide ) )? otherlv_1= Field ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_type_4_0= ruleDataType ) ) (otherlv_5= EqualsSignGreaterThanSign this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleFieldProp ) )* this_END_8= RULE_END )? ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_dontShow_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_BEGIN_6=null;
        Token this_END_8=null;
        EObject lv_type_4_0 = null;

        EObject lv_properties_7_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:722:2: ( ( ( (lv_dontShow_0_0= Hide ) )? otherlv_1= Field ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_type_4_0= ruleDataType ) ) (otherlv_5= EqualsSignGreaterThanSign this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleFieldProp ) )* this_END_8= RULE_END )? ) )
            // InternalCMSdslParser.g:723:2: ( ( (lv_dontShow_0_0= Hide ) )? otherlv_1= Field ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_type_4_0= ruleDataType ) ) (otherlv_5= EqualsSignGreaterThanSign this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleFieldProp ) )* this_END_8= RULE_END )? )
            {
            // InternalCMSdslParser.g:723:2: ( ( (lv_dontShow_0_0= Hide ) )? otherlv_1= Field ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_type_4_0= ruleDataType ) ) (otherlv_5= EqualsSignGreaterThanSign this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleFieldProp ) )* this_END_8= RULE_END )? )
            // InternalCMSdslParser.g:724:3: ( (lv_dontShow_0_0= Hide ) )? otherlv_1= Field ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_type_4_0= ruleDataType ) ) (otherlv_5= EqualsSignGreaterThanSign this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleFieldProp ) )* this_END_8= RULE_END )?
            {
            // InternalCMSdslParser.g:724:3: ( (lv_dontShow_0_0= Hide ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Hide) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCMSdslParser.g:725:4: (lv_dontShow_0_0= Hide )
                    {
                    // InternalCMSdslParser.g:725:4: (lv_dontShow_0_0= Hide )
                    // InternalCMSdslParser.g:726:5: lv_dontShow_0_0= Hide
                    {
                    lv_dontShow_0_0=(Token)match(input,Hide,FOLLOW_14); 

                    					newLeafNode(lv_dontShow_0_0, grammarAccess.getFieldAccess().getDontShowHideKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldRule());
                    					}
                    					setWithLastConsumed(current, "dontShow", lv_dontShow_0_0 != null, "hide");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,Field,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getFieldKeyword_1());
            		
            // InternalCMSdslParser.g:742:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCMSdslParser.g:743:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCMSdslParser.g:743:4: (lv_name_2_0= RULE_ID )
            // InternalCMSdslParser.g:744:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,Colon,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getColonKeyword_3());
            		
            // InternalCMSdslParser.g:764:3: ( (lv_type_4_0= ruleDataType ) )
            // InternalCMSdslParser.g:765:4: (lv_type_4_0= ruleDataType )
            {
            // InternalCMSdslParser.g:765:4: (lv_type_4_0= ruleDataType )
            // InternalCMSdslParser.g:766:5: lv_type_4_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getTypeDataTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
            lv_type_4_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"jope015.mdsd2021.reexam.CMSdsl.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCMSdslParser.g:783:3: (otherlv_5= EqualsSignGreaterThanSign this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleFieldProp ) )* this_END_8= RULE_END )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==EqualsSignGreaterThanSign) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCMSdslParser.g:784:4: otherlv_5= EqualsSignGreaterThanSign this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleFieldProp ) )* this_END_8= RULE_END
                    {
                    otherlv_5=(Token)match(input,EqualsSignGreaterThanSign,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getEqualsSignGreaterThanSignKeyword_5_0());
                    			
                    this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

                    				newLeafNode(this_BEGIN_6, grammarAccess.getFieldAccess().getBEGINTerminalRuleCall_5_1());
                    			
                    // InternalCMSdslParser.g:792:4: ( (lv_properties_7_0= ruleFieldProp ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==InputType||LA10_0==Default||LA10_0==Test) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalCMSdslParser.g:793:5: (lv_properties_7_0= ruleFieldProp )
                    	    {
                    	    // InternalCMSdslParser.g:793:5: (lv_properties_7_0= ruleFieldProp )
                    	    // InternalCMSdslParser.g:794:6: lv_properties_7_0= ruleFieldProp
                    	    {

                    	    						newCompositeNode(grammarAccess.getFieldAccess().getPropertiesFieldPropParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_properties_7_0=ruleFieldProp();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"properties",
                    	    							lv_properties_7_0,
                    	    							"jope015.mdsd2021.reexam.CMSdsl.FieldProp");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_8, grammarAccess.getFieldAccess().getENDTerminalRuleCall_5_3());
                    			

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleValidationCheck"
    // InternalCMSdslParser.g:820:1: entryRuleValidationCheck returns [EObject current=null] : iv_ruleValidationCheck= ruleValidationCheck EOF ;
    public final EObject entryRuleValidationCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidationCheck = null;


        try {
            // InternalCMSdslParser.g:820:56: (iv_ruleValidationCheck= ruleValidationCheck EOF )
            // InternalCMSdslParser.g:821:2: iv_ruleValidationCheck= ruleValidationCheck EOF
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
    // InternalCMSdslParser.g:827:1: ruleValidationCheck returns [EObject current=null] : (otherlv_0= Check ( (lv_validator_1_0= ruleValidatorUse ) ) otherlv_2= EqualsSignGreaterThanSign ( (lv_errrorMsg_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleValidationCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_errrorMsg_3_0=null;
        EObject lv_validator_1_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:833:2: ( (otherlv_0= Check ( (lv_validator_1_0= ruleValidatorUse ) ) otherlv_2= EqualsSignGreaterThanSign ( (lv_errrorMsg_3_0= RULE_STRING ) ) ) )
            // InternalCMSdslParser.g:834:2: (otherlv_0= Check ( (lv_validator_1_0= ruleValidatorUse ) ) otherlv_2= EqualsSignGreaterThanSign ( (lv_errrorMsg_3_0= RULE_STRING ) ) )
            {
            // InternalCMSdslParser.g:834:2: (otherlv_0= Check ( (lv_validator_1_0= ruleValidatorUse ) ) otherlv_2= EqualsSignGreaterThanSign ( (lv_errrorMsg_3_0= RULE_STRING ) ) )
            // InternalCMSdslParser.g:835:3: otherlv_0= Check ( (lv_validator_1_0= ruleValidatorUse ) ) otherlv_2= EqualsSignGreaterThanSign ( (lv_errrorMsg_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Check,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getValidationCheckAccess().getCheckKeyword_0());
            		
            // InternalCMSdslParser.g:839:3: ( (lv_validator_1_0= ruleValidatorUse ) )
            // InternalCMSdslParser.g:840:4: (lv_validator_1_0= ruleValidatorUse )
            {
            // InternalCMSdslParser.g:840:4: (lv_validator_1_0= ruleValidatorUse )
            // InternalCMSdslParser.g:841:5: lv_validator_1_0= ruleValidatorUse
            {

            					newCompositeNode(grammarAccess.getValidationCheckAccess().getValidatorValidatorUseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
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
            		
            // InternalCMSdslParser.g:862:3: ( (lv_errrorMsg_3_0= RULE_STRING ) )
            // InternalCMSdslParser.g:863:4: (lv_errrorMsg_3_0= RULE_STRING )
            {
            // InternalCMSdslParser.g:863:4: (lv_errrorMsg_3_0= RULE_STRING )
            // InternalCMSdslParser.g:864:5: lv_errrorMsg_3_0= RULE_STRING
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


    // $ANTLR start "entryRuleValidatorUse"
    // InternalCMSdslParser.g:884:1: entryRuleValidatorUse returns [EObject current=null] : iv_ruleValidatorUse= ruleValidatorUse EOF ;
    public final EObject entryRuleValidatorUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidatorUse = null;


        try {
            // InternalCMSdslParser.g:884:53: (iv_ruleValidatorUse= ruleValidatorUse EOF )
            // InternalCMSdslParser.g:885:2: iv_ruleValidatorUse= ruleValidatorUse EOF
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
    // InternalCMSdslParser.g:891:1: ruleValidatorUse returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis ) ;
    public final EObject ruleValidatorUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalCMSdslParser.g:897:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis ) )
            // InternalCMSdslParser.g:898:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )
            {
            // InternalCMSdslParser.g:898:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )
            // InternalCMSdslParser.g:899:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis
            {
            // InternalCMSdslParser.g:899:3: ()
            // InternalCMSdslParser.g:900:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValidatorUseAccess().getValidatorUseAction_0(),
            					current);
            			

            }

            // InternalCMSdslParser.g:906:3: ( (otherlv_1= RULE_ID ) )
            // InternalCMSdslParser.g:907:4: (otherlv_1= RULE_ID )
            {
            // InternalCMSdslParser.g:907:4: (otherlv_1= RULE_ID )
            // InternalCMSdslParser.g:908:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValidatorUseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_1, grammarAccess.getValidatorUseAccess().getValidatorValidatorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getValidatorUseAccess().getLeftParenthesisKeyword_2());
            		
            // InternalCMSdslParser.g:923:3: ( (otherlv_3= RULE_ID ) )
            // InternalCMSdslParser.g:924:4: (otherlv_3= RULE_ID )
            {
            // InternalCMSdslParser.g:924:4: (otherlv_3= RULE_ID )
            // InternalCMSdslParser.g:925:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValidatorUseRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_3, grammarAccess.getValidatorUseAccess().getArgsFieldCrossReference_3_0());
            				

            }


            }

            // InternalCMSdslParser.g:936:3: (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Comma) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCMSdslParser.g:937:4: otherlv_4= Comma ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getValidatorUseAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCMSdslParser.g:941:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalCMSdslParser.g:942:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalCMSdslParser.g:942:5: (otherlv_5= RULE_ID )
            	    // InternalCMSdslParser.g:943:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getValidatorUseRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_20); 

            	    						newLeafNode(otherlv_5, grammarAccess.getValidatorUseAccess().getArgsFieldCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getValidatorUseAccess().getRightParenthesisKeyword_5());
            		

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


    // $ANTLR start "entryRuleValidationStatus"
    // InternalCMSdslParser.g:963:1: entryRuleValidationStatus returns [EObject current=null] : iv_ruleValidationStatus= ruleValidationStatus EOF ;
    public final EObject entryRuleValidationStatus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidationStatus = null;


        try {
            // InternalCMSdslParser.g:963:57: (iv_ruleValidationStatus= ruleValidationStatus EOF )
            // InternalCMSdslParser.g:964:2: iv_ruleValidationStatus= ruleValidationStatus EOF
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
    // InternalCMSdslParser.g:970:1: ruleValidationStatus returns [EObject current=null] : ( ( () otherlv_1= Error otherlv_2= Colon ( (lv_msg_3_0= RULE_STRING ) ) ) | ( () otherlv_5= Warning otherlv_6= Colon ( (lv_msg_7_0= RULE_STRING ) ) ) | ( () otherlv_9= Success otherlv_10= Colon ( (lv_msg_11_0= RULE_STRING ) ) ) ) ;
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
            // InternalCMSdslParser.g:976:2: ( ( ( () otherlv_1= Error otherlv_2= Colon ( (lv_msg_3_0= RULE_STRING ) ) ) | ( () otherlv_5= Warning otherlv_6= Colon ( (lv_msg_7_0= RULE_STRING ) ) ) | ( () otherlv_9= Success otherlv_10= Colon ( (lv_msg_11_0= RULE_STRING ) ) ) ) )
            // InternalCMSdslParser.g:977:2: ( ( () otherlv_1= Error otherlv_2= Colon ( (lv_msg_3_0= RULE_STRING ) ) ) | ( () otherlv_5= Warning otherlv_6= Colon ( (lv_msg_7_0= RULE_STRING ) ) ) | ( () otherlv_9= Success otherlv_10= Colon ( (lv_msg_11_0= RULE_STRING ) ) ) )
            {
            // InternalCMSdslParser.g:977:2: ( ( () otherlv_1= Error otherlv_2= Colon ( (lv_msg_3_0= RULE_STRING ) ) ) | ( () otherlv_5= Warning otherlv_6= Colon ( (lv_msg_7_0= RULE_STRING ) ) ) | ( () otherlv_9= Success otherlv_10= Colon ( (lv_msg_11_0= RULE_STRING ) ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case Error:
                {
                alt13=1;
                }
                break;
            case Warning:
                {
                alt13=2;
                }
                break;
            case Success:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalCMSdslParser.g:978:3: ( () otherlv_1= Error otherlv_2= Colon ( (lv_msg_3_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:978:3: ( () otherlv_1= Error otherlv_2= Colon ( (lv_msg_3_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:979:4: () otherlv_1= Error otherlv_2= Colon ( (lv_msg_3_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:979:4: ()
                    // InternalCMSdslParser.g:980:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getValidationStatusAccess().getErrAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,Error,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getValidationStatusAccess().getErrorKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,Colon,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getValidationStatusAccess().getColonKeyword_0_2());
                    			
                    // InternalCMSdslParser.g:994:4: ( (lv_msg_3_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:995:5: (lv_msg_3_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:995:5: (lv_msg_3_0= RULE_STRING )
                    // InternalCMSdslParser.g:996:6: lv_msg_3_0= RULE_STRING
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
                    // InternalCMSdslParser.g:1014:3: ( () otherlv_5= Warning otherlv_6= Colon ( (lv_msg_7_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:1014:3: ( () otherlv_5= Warning otherlv_6= Colon ( (lv_msg_7_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:1015:4: () otherlv_5= Warning otherlv_6= Colon ( (lv_msg_7_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:1015:4: ()
                    // InternalCMSdslParser.g:1016:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getValidationStatusAccess().getWarnAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,Warning,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getValidationStatusAccess().getWarningKeyword_1_1());
                    			
                    otherlv_6=(Token)match(input,Colon,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getValidationStatusAccess().getColonKeyword_1_2());
                    			
                    // InternalCMSdslParser.g:1030:4: ( (lv_msg_7_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:1031:5: (lv_msg_7_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:1031:5: (lv_msg_7_0= RULE_STRING )
                    // InternalCMSdslParser.g:1032:6: lv_msg_7_0= RULE_STRING
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
                    // InternalCMSdslParser.g:1050:3: ( () otherlv_9= Success otherlv_10= Colon ( (lv_msg_11_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:1050:3: ( () otherlv_9= Success otherlv_10= Colon ( (lv_msg_11_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:1051:4: () otherlv_9= Success otherlv_10= Colon ( (lv_msg_11_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:1051:4: ()
                    // InternalCMSdslParser.g:1052:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getValidationStatusAccess().getSuccAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,Success,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getValidationStatusAccess().getSuccessKeyword_2_1());
                    			
                    otherlv_10=(Token)match(input,Colon,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getValidationStatusAccess().getColonKeyword_2_2());
                    			
                    // InternalCMSdslParser.g:1066:4: ( (lv_msg_11_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:1067:5: (lv_msg_11_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:1067:5: (lv_msg_11_0= RULE_STRING )
                    // InternalCMSdslParser.g:1068:6: lv_msg_11_0= RULE_STRING
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
    // InternalCMSdslParser.g:1089:1: entryRuleFieldProp returns [EObject current=null] : iv_ruleFieldProp= ruleFieldProp EOF ;
    public final EObject entryRuleFieldProp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldProp = null;


        try {
            // InternalCMSdslParser.g:1089:50: (iv_ruleFieldProp= ruleFieldProp EOF )
            // InternalCMSdslParser.g:1090:2: iv_ruleFieldProp= ruleFieldProp EOF
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
    // InternalCMSdslParser.g:1096:1: ruleFieldProp returns [EObject current=null] : ( ( () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_type_9_0= InputType ) ) otherlv_10= Colon ( (lv_value_11_0= ruleInputType ) ) ) ) ;
    public final EObject ruleFieldProp() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;
        Token lv_type_9_0=null;
        Token otherlv_10=null;
        EObject lv_value_11_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:1102:2: ( ( ( () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_type_9_0= InputType ) ) otherlv_10= Colon ( (lv_value_11_0= ruleInputType ) ) ) ) )
            // InternalCMSdslParser.g:1103:2: ( ( () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_type_9_0= InputType ) ) otherlv_10= Colon ( (lv_value_11_0= ruleInputType ) ) ) )
            {
            // InternalCMSdslParser.g:1103:2: ( ( () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_type_9_0= InputType ) ) otherlv_10= Colon ( (lv_value_11_0= ruleInputType ) ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case Default:
                {
                alt14=1;
                }
                break;
            case Test:
                {
                alt14=2;
                }
                break;
            case InputType:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalCMSdslParser.g:1104:3: ( () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:1104:3: ( () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:1105:4: () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:1105:4: ()
                    // InternalCMSdslParser.g:1106:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFieldPropAccess().getDefAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1112:4: ( (lv_type_1_0= Default ) )
                    // InternalCMSdslParser.g:1113:5: (lv_type_1_0= Default )
                    {
                    // InternalCMSdslParser.g:1113:5: (lv_type_1_0= Default )
                    // InternalCMSdslParser.g:1114:6: lv_type_1_0= Default
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
                    			
                    // InternalCMSdslParser.g:1130:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:1131:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:1131:5: (lv_value_3_0= RULE_STRING )
                    // InternalCMSdslParser.g:1132:6: lv_value_3_0= RULE_STRING
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
                    // InternalCMSdslParser.g:1150:3: ( () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:1150:3: ( () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:1151:4: () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:1151:4: ()
                    // InternalCMSdslParser.g:1152:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFieldPropAccess().getPropTestAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1158:4: ( (lv_type_5_0= Test ) )
                    // InternalCMSdslParser.g:1159:5: (lv_type_5_0= Test )
                    {
                    // InternalCMSdslParser.g:1159:5: (lv_type_5_0= Test )
                    // InternalCMSdslParser.g:1160:6: lv_type_5_0= Test
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
                    			
                    // InternalCMSdslParser.g:1176:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:1177:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:1177:5: (lv_value_7_0= RULE_STRING )
                    // InternalCMSdslParser.g:1178:6: lv_value_7_0= RULE_STRING
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
                case 3 :
                    // InternalCMSdslParser.g:1196:3: ( () ( (lv_type_9_0= InputType ) ) otherlv_10= Colon ( (lv_value_11_0= ruleInputType ) ) )
                    {
                    // InternalCMSdslParser.g:1196:3: ( () ( (lv_type_9_0= InputType ) ) otherlv_10= Colon ( (lv_value_11_0= ruleInputType ) ) )
                    // InternalCMSdslParser.g:1197:4: () ( (lv_type_9_0= InputType ) ) otherlv_10= Colon ( (lv_value_11_0= ruleInputType ) )
                    {
                    // InternalCMSdslParser.g:1197:4: ()
                    // InternalCMSdslParser.g:1198:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFieldPropAccess().getInputFieldAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1204:4: ( (lv_type_9_0= InputType ) )
                    // InternalCMSdslParser.g:1205:5: (lv_type_9_0= InputType )
                    {
                    // InternalCMSdslParser.g:1205:5: (lv_type_9_0= InputType )
                    // InternalCMSdslParser.g:1206:6: lv_type_9_0= InputType
                    {
                    lv_type_9_0=(Token)match(input,InputType,FOLLOW_4); 

                    						newLeafNode(lv_type_9_0, grammarAccess.getFieldPropAccess().getTypeInputTypeKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldPropRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_9_0, "inputType");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,Colon,FOLLOW_21); 

                    				newLeafNode(otherlv_10, grammarAccess.getFieldPropAccess().getColonKeyword_2_2());
                    			
                    // InternalCMSdslParser.g:1222:4: ( (lv_value_11_0= ruleInputType ) )
                    // InternalCMSdslParser.g:1223:5: (lv_value_11_0= ruleInputType )
                    {
                    // InternalCMSdslParser.g:1223:5: (lv_value_11_0= ruleInputType )
                    // InternalCMSdslParser.g:1224:6: lv_value_11_0= ruleInputType
                    {

                    						newCompositeNode(grammarAccess.getFieldPropAccess().getValueInputTypeParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_11_0=ruleInputType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldPropRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_11_0,
                    							"jope015.mdsd2021.reexam.CMSdsl.InputType");
                    						afterParserOrEnumRuleCall();
                    					

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


    // $ANTLR start "entryRuleInputType"
    // InternalCMSdslParser.g:1246:1: entryRuleInputType returns [EObject current=null] : iv_ruleInputType= ruleInputType EOF ;
    public final EObject entryRuleInputType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputType = null;


        try {
            // InternalCMSdslParser.g:1246:50: (iv_ruleInputType= ruleInputType EOF )
            // InternalCMSdslParser.g:1247:2: iv_ruleInputType= ruleInputType EOF
            {
             newCompositeNode(grammarAccess.getInputTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputType=ruleInputType();

            state._fsp--;

             current =iv_ruleInputType; 
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
    // $ANTLR end "entryRuleInputType"


    // $ANTLR start "ruleInputType"
    // InternalCMSdslParser.g:1253:1: ruleInputType returns [EObject current=null] : ( ( () ( (lv_type_1_0= Email ) ) ) | ( () ( (lv_type_3_0= Date ) ) ) | ( () ( (lv_type_5_0= Number ) ) ) | ( () ( (lv_type_7_0= Password ) ) ) | ( () ( (lv_type_9_0= Text ) ) ) | ( () ( (lv_type_11_0= Textarea ) ) ) ) ;
    public final EObject ruleInputType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
        Token lv_type_3_0=null;
        Token lv_type_5_0=null;
        Token lv_type_7_0=null;
        Token lv_type_9_0=null;
        Token lv_type_11_0=null;


        	enterRule();

        try {
            // InternalCMSdslParser.g:1259:2: ( ( ( () ( (lv_type_1_0= Email ) ) ) | ( () ( (lv_type_3_0= Date ) ) ) | ( () ( (lv_type_5_0= Number ) ) ) | ( () ( (lv_type_7_0= Password ) ) ) | ( () ( (lv_type_9_0= Text ) ) ) | ( () ( (lv_type_11_0= Textarea ) ) ) ) )
            // InternalCMSdslParser.g:1260:2: ( ( () ( (lv_type_1_0= Email ) ) ) | ( () ( (lv_type_3_0= Date ) ) ) | ( () ( (lv_type_5_0= Number ) ) ) | ( () ( (lv_type_7_0= Password ) ) ) | ( () ( (lv_type_9_0= Text ) ) ) | ( () ( (lv_type_11_0= Textarea ) ) ) )
            {
            // InternalCMSdslParser.g:1260:2: ( ( () ( (lv_type_1_0= Email ) ) ) | ( () ( (lv_type_3_0= Date ) ) ) | ( () ( (lv_type_5_0= Number ) ) ) | ( () ( (lv_type_7_0= Password ) ) ) | ( () ( (lv_type_9_0= Text ) ) ) | ( () ( (lv_type_11_0= Textarea ) ) ) )
            int alt15=6;
            switch ( input.LA(1) ) {
            case Email:
                {
                alt15=1;
                }
                break;
            case Date:
                {
                alt15=2;
                }
                break;
            case Number:
                {
                alt15=3;
                }
                break;
            case Password:
                {
                alt15=4;
                }
                break;
            case Text:
                {
                alt15=5;
                }
                break;
            case Textarea:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalCMSdslParser.g:1261:3: ( () ( (lv_type_1_0= Email ) ) )
                    {
                    // InternalCMSdslParser.g:1261:3: ( () ( (lv_type_1_0= Email ) ) )
                    // InternalCMSdslParser.g:1262:4: () ( (lv_type_1_0= Email ) )
                    {
                    // InternalCMSdslParser.g:1262:4: ()
                    // InternalCMSdslParser.g:1263:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getInputTypeAccess().getInpMailAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1269:4: ( (lv_type_1_0= Email ) )
                    // InternalCMSdslParser.g:1270:5: (lv_type_1_0= Email )
                    {
                    // InternalCMSdslParser.g:1270:5: (lv_type_1_0= Email )
                    // InternalCMSdslParser.g:1271:6: lv_type_1_0= Email
                    {
                    lv_type_1_0=(Token)match(input,Email,FOLLOW_2); 

                    						newLeafNode(lv_type_1_0, grammarAccess.getInputTypeAccess().getTypeEmailKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_1_0, "email");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCMSdslParser.g:1285:3: ( () ( (lv_type_3_0= Date ) ) )
                    {
                    // InternalCMSdslParser.g:1285:3: ( () ( (lv_type_3_0= Date ) ) )
                    // InternalCMSdslParser.g:1286:4: () ( (lv_type_3_0= Date ) )
                    {
                    // InternalCMSdslParser.g:1286:4: ()
                    // InternalCMSdslParser.g:1287:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getInputTypeAccess().getInpDateAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1293:4: ( (lv_type_3_0= Date ) )
                    // InternalCMSdslParser.g:1294:5: (lv_type_3_0= Date )
                    {
                    // InternalCMSdslParser.g:1294:5: (lv_type_3_0= Date )
                    // InternalCMSdslParser.g:1295:6: lv_type_3_0= Date
                    {
                    lv_type_3_0=(Token)match(input,Date,FOLLOW_2); 

                    						newLeafNode(lv_type_3_0, grammarAccess.getInputTypeAccess().getTypeDateKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_3_0, "date");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCMSdslParser.g:1309:3: ( () ( (lv_type_5_0= Number ) ) )
                    {
                    // InternalCMSdslParser.g:1309:3: ( () ( (lv_type_5_0= Number ) ) )
                    // InternalCMSdslParser.g:1310:4: () ( (lv_type_5_0= Number ) )
                    {
                    // InternalCMSdslParser.g:1310:4: ()
                    // InternalCMSdslParser.g:1311:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getInputTypeAccess().getInpNumAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1317:4: ( (lv_type_5_0= Number ) )
                    // InternalCMSdslParser.g:1318:5: (lv_type_5_0= Number )
                    {
                    // InternalCMSdslParser.g:1318:5: (lv_type_5_0= Number )
                    // InternalCMSdslParser.g:1319:6: lv_type_5_0= Number
                    {
                    lv_type_5_0=(Token)match(input,Number,FOLLOW_2); 

                    						newLeafNode(lv_type_5_0, grammarAccess.getInputTypeAccess().getTypeNumberKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_5_0, "number");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCMSdslParser.g:1333:3: ( () ( (lv_type_7_0= Password ) ) )
                    {
                    // InternalCMSdslParser.g:1333:3: ( () ( (lv_type_7_0= Password ) ) )
                    // InternalCMSdslParser.g:1334:4: () ( (lv_type_7_0= Password ) )
                    {
                    // InternalCMSdslParser.g:1334:4: ()
                    // InternalCMSdslParser.g:1335:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getInputTypeAccess().getInpPassAction_3_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1341:4: ( (lv_type_7_0= Password ) )
                    // InternalCMSdslParser.g:1342:5: (lv_type_7_0= Password )
                    {
                    // InternalCMSdslParser.g:1342:5: (lv_type_7_0= Password )
                    // InternalCMSdslParser.g:1343:6: lv_type_7_0= Password
                    {
                    lv_type_7_0=(Token)match(input,Password,FOLLOW_2); 

                    						newLeafNode(lv_type_7_0, grammarAccess.getInputTypeAccess().getTypePasswordKeyword_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_7_0, "password");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalCMSdslParser.g:1357:3: ( () ( (lv_type_9_0= Text ) ) )
                    {
                    // InternalCMSdslParser.g:1357:3: ( () ( (lv_type_9_0= Text ) ) )
                    // InternalCMSdslParser.g:1358:4: () ( (lv_type_9_0= Text ) )
                    {
                    // InternalCMSdslParser.g:1358:4: ()
                    // InternalCMSdslParser.g:1359:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getInputTypeAccess().getInpTextAction_4_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1365:4: ( (lv_type_9_0= Text ) )
                    // InternalCMSdslParser.g:1366:5: (lv_type_9_0= Text )
                    {
                    // InternalCMSdslParser.g:1366:5: (lv_type_9_0= Text )
                    // InternalCMSdslParser.g:1367:6: lv_type_9_0= Text
                    {
                    lv_type_9_0=(Token)match(input,Text,FOLLOW_2); 

                    						newLeafNode(lv_type_9_0, grammarAccess.getInputTypeAccess().getTypeTextKeyword_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_9_0, "text");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalCMSdslParser.g:1381:3: ( () ( (lv_type_11_0= Textarea ) ) )
                    {
                    // InternalCMSdslParser.g:1381:3: ( () ( (lv_type_11_0= Textarea ) ) )
                    // InternalCMSdslParser.g:1382:4: () ( (lv_type_11_0= Textarea ) )
                    {
                    // InternalCMSdslParser.g:1382:4: ()
                    // InternalCMSdslParser.g:1383:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getInputTypeAccess().getInpTextAreaAction_5_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1389:4: ( (lv_type_11_0= Textarea ) )
                    // InternalCMSdslParser.g:1390:5: (lv_type_11_0= Textarea )
                    {
                    // InternalCMSdslParser.g:1390:5: (lv_type_11_0= Textarea )
                    // InternalCMSdslParser.g:1391:6: lv_type_11_0= Textarea
                    {
                    lv_type_11_0=(Token)match(input,Textarea,FOLLOW_2); 

                    						newLeafNode(lv_type_11_0, grammarAccess.getInputTypeAccess().getTypeTextareaKeyword_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_11_0, "textarea");
                    					

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
    // $ANTLR end "ruleInputType"


    // $ANTLR start "entryRuleDataType"
    // InternalCMSdslParser.g:1408:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalCMSdslParser.g:1408:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalCMSdslParser.g:1409:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalCMSdslParser.g:1415:1: ruleDataType returns [EObject current=null] : ( ( () ( (lv_type_1_0= String ) ) ) | ( () ( (lv_type_3_0= Date ) ) ) | ( () ( (lv_type_5_0= Int ) ) ) | ( () ( (lv_type_7_0= Long ) ) ) | ( () ( (lv_type_9_0= Bool ) ) ) | ( () ( (lv_type_11_0= Float ) ) ) ) ;
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
            // InternalCMSdslParser.g:1421:2: ( ( ( () ( (lv_type_1_0= String ) ) ) | ( () ( (lv_type_3_0= Date ) ) ) | ( () ( (lv_type_5_0= Int ) ) ) | ( () ( (lv_type_7_0= Long ) ) ) | ( () ( (lv_type_9_0= Bool ) ) ) | ( () ( (lv_type_11_0= Float ) ) ) ) )
            // InternalCMSdslParser.g:1422:2: ( ( () ( (lv_type_1_0= String ) ) ) | ( () ( (lv_type_3_0= Date ) ) ) | ( () ( (lv_type_5_0= Int ) ) ) | ( () ( (lv_type_7_0= Long ) ) ) | ( () ( (lv_type_9_0= Bool ) ) ) | ( () ( (lv_type_11_0= Float ) ) ) )
            {
            // InternalCMSdslParser.g:1422:2: ( ( () ( (lv_type_1_0= String ) ) ) | ( () ( (lv_type_3_0= Date ) ) ) | ( () ( (lv_type_5_0= Int ) ) ) | ( () ( (lv_type_7_0= Long ) ) ) | ( () ( (lv_type_9_0= Bool ) ) ) | ( () ( (lv_type_11_0= Float ) ) ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case String:
                {
                alt16=1;
                }
                break;
            case Date:
                {
                alt16=2;
                }
                break;
            case Int:
                {
                alt16=3;
                }
                break;
            case Long:
                {
                alt16=4;
                }
                break;
            case Bool:
                {
                alt16=5;
                }
                break;
            case Float:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalCMSdslParser.g:1423:3: ( () ( (lv_type_1_0= String ) ) )
                    {
                    // InternalCMSdslParser.g:1423:3: ( () ( (lv_type_1_0= String ) ) )
                    // InternalCMSdslParser.g:1424:4: () ( (lv_type_1_0= String ) )
                    {
                    // InternalCMSdslParser.g:1424:4: ()
                    // InternalCMSdslParser.g:1425:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getStrAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1431:4: ( (lv_type_1_0= String ) )
                    // InternalCMSdslParser.g:1432:5: (lv_type_1_0= String )
                    {
                    // InternalCMSdslParser.g:1432:5: (lv_type_1_0= String )
                    // InternalCMSdslParser.g:1433:6: lv_type_1_0= String
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
                    // InternalCMSdslParser.g:1447:3: ( () ( (lv_type_3_0= Date ) ) )
                    {
                    // InternalCMSdslParser.g:1447:3: ( () ( (lv_type_3_0= Date ) ) )
                    // InternalCMSdslParser.g:1448:4: () ( (lv_type_3_0= Date ) )
                    {
                    // InternalCMSdslParser.g:1448:4: ()
                    // InternalCMSdslParser.g:1449:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getDtAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1455:4: ( (lv_type_3_0= Date ) )
                    // InternalCMSdslParser.g:1456:5: (lv_type_3_0= Date )
                    {
                    // InternalCMSdslParser.g:1456:5: (lv_type_3_0= Date )
                    // InternalCMSdslParser.g:1457:6: lv_type_3_0= Date
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
                    // InternalCMSdslParser.g:1471:3: ( () ( (lv_type_5_0= Int ) ) )
                    {
                    // InternalCMSdslParser.g:1471:3: ( () ( (lv_type_5_0= Int ) ) )
                    // InternalCMSdslParser.g:1472:4: () ( (lv_type_5_0= Int ) )
                    {
                    // InternalCMSdslParser.g:1472:4: ()
                    // InternalCMSdslParser.g:1473:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getIntegAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1479:4: ( (lv_type_5_0= Int ) )
                    // InternalCMSdslParser.g:1480:5: (lv_type_5_0= Int )
                    {
                    // InternalCMSdslParser.g:1480:5: (lv_type_5_0= Int )
                    // InternalCMSdslParser.g:1481:6: lv_type_5_0= Int
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
                    // InternalCMSdslParser.g:1495:3: ( () ( (lv_type_7_0= Long ) ) )
                    {
                    // InternalCMSdslParser.g:1495:3: ( () ( (lv_type_7_0= Long ) ) )
                    // InternalCMSdslParser.g:1496:4: () ( (lv_type_7_0= Long ) )
                    {
                    // InternalCMSdslParser.g:1496:4: ()
                    // InternalCMSdslParser.g:1497:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getLngAction_3_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1503:4: ( (lv_type_7_0= Long ) )
                    // InternalCMSdslParser.g:1504:5: (lv_type_7_0= Long )
                    {
                    // InternalCMSdslParser.g:1504:5: (lv_type_7_0= Long )
                    // InternalCMSdslParser.g:1505:6: lv_type_7_0= Long
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
                    // InternalCMSdslParser.g:1519:3: ( () ( (lv_type_9_0= Bool ) ) )
                    {
                    // InternalCMSdslParser.g:1519:3: ( () ( (lv_type_9_0= Bool ) ) )
                    // InternalCMSdslParser.g:1520:4: () ( (lv_type_9_0= Bool ) )
                    {
                    // InternalCMSdslParser.g:1520:4: ()
                    // InternalCMSdslParser.g:1521:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getBoolAction_4_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1527:4: ( (lv_type_9_0= Bool ) )
                    // InternalCMSdslParser.g:1528:5: (lv_type_9_0= Bool )
                    {
                    // InternalCMSdslParser.g:1528:5: (lv_type_9_0= Bool )
                    // InternalCMSdslParser.g:1529:6: lv_type_9_0= Bool
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
                    // InternalCMSdslParser.g:1543:3: ( () ( (lv_type_11_0= Float ) ) )
                    {
                    // InternalCMSdslParser.g:1543:3: ( () ( (lv_type_11_0= Float ) ) )
                    // InternalCMSdslParser.g:1544:4: () ( (lv_type_11_0= Float ) )
                    {
                    // InternalCMSdslParser.g:1544:4: ()
                    // InternalCMSdslParser.g:1545:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getFltAction_5_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1551:4: ( (lv_type_11_0= Float ) )
                    // InternalCMSdslParser.g:1552:5: (lv_type_11_0= Float )
                    {
                    // InternalCMSdslParser.g:1552:5: (lv_type_11_0= Float )
                    // InternalCMSdslParser.g:1553:6: lv_type_11_0= Float
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
    // InternalCMSdslParser.g:1570:1: entryRuleValidator returns [EObject current=null] : iv_ruleValidator= ruleValidator EOF ;
    public final EObject entryRuleValidator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidator = null;


        try {
            // InternalCMSdslParser.g:1570:50: (iv_ruleValidator= ruleValidator EOF )
            // InternalCMSdslParser.g:1571:2: iv_ruleValidator= ruleValidator EOF
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
    // InternalCMSdslParser.g:1577:1: ruleValidator returns [EObject current=null] : (otherlv_0= Validator ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= RightParenthesis otherlv_7= EqualsSignGreaterThanSign this_BEGIN_8= RULE_BEGIN ( (lv_comparison_9_0= ruleExpression ) ) this_END_10= RULE_END ) ;
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
            // InternalCMSdslParser.g:1583:2: ( (otherlv_0= Validator ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= RightParenthesis otherlv_7= EqualsSignGreaterThanSign this_BEGIN_8= RULE_BEGIN ( (lv_comparison_9_0= ruleExpression ) ) this_END_10= RULE_END ) )
            // InternalCMSdslParser.g:1584:2: (otherlv_0= Validator ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= RightParenthesis otherlv_7= EqualsSignGreaterThanSign this_BEGIN_8= RULE_BEGIN ( (lv_comparison_9_0= ruleExpression ) ) this_END_10= RULE_END )
            {
            // InternalCMSdslParser.g:1584:2: (otherlv_0= Validator ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= RightParenthesis otherlv_7= EqualsSignGreaterThanSign this_BEGIN_8= RULE_BEGIN ( (lv_comparison_9_0= ruleExpression ) ) this_END_10= RULE_END )
            // InternalCMSdslParser.g:1585:3: otherlv_0= Validator ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= RightParenthesis otherlv_7= EqualsSignGreaterThanSign this_BEGIN_8= RULE_BEGIN ( (lv_comparison_9_0= ruleExpression ) ) this_END_10= RULE_END
            {
            otherlv_0=(Token)match(input,Validator,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getValidatorAccess().getValidatorKeyword_0());
            		
            // InternalCMSdslParser.g:1589:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCMSdslParser.g:1590:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCMSdslParser.g:1590:4: (lv_name_1_0= RULE_ID )
            // InternalCMSdslParser.g:1591:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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
            		
            // InternalCMSdslParser.g:1611:3: ( (lv_params_3_0= ruleParameter ) )
            // InternalCMSdslParser.g:1612:4: (lv_params_3_0= ruleParameter )
            {
            // InternalCMSdslParser.g:1612:4: (lv_params_3_0= ruleParameter )
            // InternalCMSdslParser.g:1613:5: lv_params_3_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getValidatorAccess().getParamsParameterParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalCMSdslParser.g:1630:3: (otherlv_4= Comma ( (lv_params_5_0= ruleParameter ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Comma) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCMSdslParser.g:1631:4: otherlv_4= Comma ( (lv_params_5_0= ruleParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getValidatorAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCMSdslParser.g:1635:4: ( (lv_params_5_0= ruleParameter ) )
            	    // InternalCMSdslParser.g:1636:5: (lv_params_5_0= ruleParameter )
            	    {
            	    // InternalCMSdslParser.g:1636:5: (lv_params_5_0= ruleParameter )
            	    // InternalCMSdslParser.g:1637:6: lv_params_5_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getValidatorAccess().getParamsParameterParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
            	    break loop17;
                }
            } while (true);

            otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getValidatorAccess().getRightParenthesisKeyword_5());
            		
            otherlv_7=(Token)match(input,EqualsSignGreaterThanSign,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getValidatorAccess().getEqualsSignGreaterThanSignKeyword_6());
            		
            this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_22); 

            			newLeafNode(this_BEGIN_8, grammarAccess.getValidatorAccess().getBEGINTerminalRuleCall_7());
            		
            // InternalCMSdslParser.g:1667:3: ( (lv_comparison_9_0= ruleExpression ) )
            // InternalCMSdslParser.g:1668:4: (lv_comparison_9_0= ruleExpression )
            {
            // InternalCMSdslParser.g:1668:4: (lv_comparison_9_0= ruleExpression )
            // InternalCMSdslParser.g:1669:5: lv_comparison_9_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getValidatorAccess().getComparisonExpressionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_23);
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
    // InternalCMSdslParser.g:1694:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalCMSdslParser.g:1694:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalCMSdslParser.g:1695:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalCMSdslParser.g:1701:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleDataType ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:1707:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleDataType ) ) ) )
            // InternalCMSdslParser.g:1708:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleDataType ) ) )
            {
            // InternalCMSdslParser.g:1708:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleDataType ) ) )
            // InternalCMSdslParser.g:1709:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleDataType ) )
            {
            // InternalCMSdslParser.g:1709:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCMSdslParser.g:1710:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCMSdslParser.g:1710:4: (lv_name_0_0= RULE_ID )
            // InternalCMSdslParser.g:1711:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,Colon,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalCMSdslParser.g:1731:3: ( (lv_type_2_0= ruleDataType ) )
            // InternalCMSdslParser.g:1732:4: (lv_type_2_0= ruleDataType )
            {
            // InternalCMSdslParser.g:1732:4: (lv_type_2_0= ruleDataType )
            // InternalCMSdslParser.g:1733:5: lv_type_2_0= ruleDataType
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


    // $ANTLR start "entryRuleParamOrArgUse"
    // InternalCMSdslParser.g:1754:1: entryRuleParamOrArgUse returns [EObject current=null] : iv_ruleParamOrArgUse= ruleParamOrArgUse EOF ;
    public final EObject entryRuleParamOrArgUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamOrArgUse = null;


        try {
            // InternalCMSdslParser.g:1754:54: (iv_ruleParamOrArgUse= ruleParamOrArgUse EOF )
            // InternalCMSdslParser.g:1755:2: iv_ruleParamOrArgUse= ruleParamOrArgUse EOF
            {
             newCompositeNode(grammarAccess.getParamOrArgUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamOrArgUse=ruleParamOrArgUse();

            state._fsp--;

             current =iv_ruleParamOrArgUse; 
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
    // $ANTLR end "entryRuleParamOrArgUse"


    // $ANTLR start "ruleParamOrArgUse"
    // InternalCMSdslParser.g:1761:1: ruleParamOrArgUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleParamOrArgUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalCMSdslParser.g:1767:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalCMSdslParser.g:1768:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalCMSdslParser.g:1768:2: ( (otherlv_0= RULE_ID ) )
            // InternalCMSdslParser.g:1769:3: (otherlv_0= RULE_ID )
            {
            // InternalCMSdslParser.g:1769:3: (otherlv_0= RULE_ID )
            // InternalCMSdslParser.g:1770:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getParamOrArgUseRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getParamOrArgUseAccess().getRefParamOrArgCrossReference_0());
            			

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
    // $ANTLR end "ruleParamOrArgUse"


    // $ANTLR start "entryRuleRelationship"
    // InternalCMSdslParser.g:1784:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalCMSdslParser.g:1784:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalCMSdslParser.g:1785:2: iv_ruleRelationship= ruleRelationship EOF
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
    // InternalCMSdslParser.g:1791:1: ruleRelationship returns [EObject current=null] : ( ( (lv_relationType_0_0= ruleRelationshipType ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_relationType_0_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:1797:2: ( ( ( (lv_relationType_0_0= ruleRelationshipType ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // InternalCMSdslParser.g:1798:2: ( ( (lv_relationType_0_0= ruleRelationshipType ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalCMSdslParser.g:1798:2: ( ( (lv_relationType_0_0= ruleRelationshipType ) ) ( (otherlv_1= RULE_ID ) ) )
            // InternalCMSdslParser.g:1799:3: ( (lv_relationType_0_0= ruleRelationshipType ) ) ( (otherlv_1= RULE_ID ) )
            {
            // InternalCMSdslParser.g:1799:3: ( (lv_relationType_0_0= ruleRelationshipType ) )
            // InternalCMSdslParser.g:1800:4: (lv_relationType_0_0= ruleRelationshipType )
            {
            // InternalCMSdslParser.g:1800:4: (lv_relationType_0_0= ruleRelationshipType )
            // InternalCMSdslParser.g:1801:5: lv_relationType_0_0= ruleRelationshipType
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

            // InternalCMSdslParser.g:1818:3: ( (otherlv_1= RULE_ID ) )
            // InternalCMSdslParser.g:1819:4: (otherlv_1= RULE_ID )
            {
            // InternalCMSdslParser.g:1819:4: (otherlv_1= RULE_ID )
            // InternalCMSdslParser.g:1820:5: otherlv_1= RULE_ID
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
    // InternalCMSdslParser.g:1835:1: entryRuleRelationshipType returns [EObject current=null] : iv_ruleRelationshipType= ruleRelationshipType EOF ;
    public final EObject entryRuleRelationshipType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipType = null;


        try {
            // InternalCMSdslParser.g:1835:57: (iv_ruleRelationshipType= ruleRelationshipType EOF )
            // InternalCMSdslParser.g:1836:2: iv_ruleRelationshipType= ruleRelationshipType EOF
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
    // InternalCMSdslParser.g:1842:1: ruleRelationshipType returns [EObject current=null] : ( ( () otherlv_1= Belongs otherlv_2= To ) | ( () otherlv_4= Belongs otherlv_5= To otherlv_6= Many ) | ( () otherlv_8= Has otherlv_9= One ) | ( () otherlv_11= Has otherlv_12= Many ) ) ;
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
            // InternalCMSdslParser.g:1848:2: ( ( ( () otherlv_1= Belongs otherlv_2= To ) | ( () otherlv_4= Belongs otherlv_5= To otherlv_6= Many ) | ( () otherlv_8= Has otherlv_9= One ) | ( () otherlv_11= Has otherlv_12= Many ) ) )
            // InternalCMSdslParser.g:1849:2: ( ( () otherlv_1= Belongs otherlv_2= To ) | ( () otherlv_4= Belongs otherlv_5= To otherlv_6= Many ) | ( () otherlv_8= Has otherlv_9= One ) | ( () otherlv_11= Has otherlv_12= Many ) )
            {
            // InternalCMSdslParser.g:1849:2: ( ( () otherlv_1= Belongs otherlv_2= To ) | ( () otherlv_4= Belongs otherlv_5= To otherlv_6= Many ) | ( () otherlv_8= Has otherlv_9= One ) | ( () otherlv_11= Has otherlv_12= Many ) )
            int alt18=4;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Belongs) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==To) ) {
                    int LA18_3 = input.LA(3);

                    if ( (LA18_3==Many) ) {
                        alt18=2;
                    }
                    else if ( (LA18_3==EOF||LA18_3==RULE_ID) ) {
                        alt18=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA18_0==Has) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==Many) ) {
                    alt18=4;
                }
                else if ( (LA18_2==One) ) {
                    alt18=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalCMSdslParser.g:1850:3: ( () otherlv_1= Belongs otherlv_2= To )
                    {
                    // InternalCMSdslParser.g:1850:3: ( () otherlv_1= Belongs otherlv_2= To )
                    // InternalCMSdslParser.g:1851:4: () otherlv_1= Belongs otherlv_2= To
                    {
                    // InternalCMSdslParser.g:1851:4: ()
                    // InternalCMSdslParser.g:1852:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationshipTypeAccess().getBelongsToAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,Belongs,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getRelationshipTypeAccess().getBelongsKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,To,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getRelationshipTypeAccess().getToKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCMSdslParser.g:1868:3: ( () otherlv_4= Belongs otherlv_5= To otherlv_6= Many )
                    {
                    // InternalCMSdslParser.g:1868:3: ( () otherlv_4= Belongs otherlv_5= To otherlv_6= Many )
                    // InternalCMSdslParser.g:1869:4: () otherlv_4= Belongs otherlv_5= To otherlv_6= Many
                    {
                    // InternalCMSdslParser.g:1869:4: ()
                    // InternalCMSdslParser.g:1870:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationshipTypeAccess().getBelongsToManyAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,Belongs,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelationshipTypeAccess().getBelongsKeyword_1_1());
                    			
                    otherlv_5=(Token)match(input,To,FOLLOW_25); 

                    				newLeafNode(otherlv_5, grammarAccess.getRelationshipTypeAccess().getToKeyword_1_2());
                    			
                    otherlv_6=(Token)match(input,Many,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelationshipTypeAccess().getManyKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCMSdslParser.g:1890:3: ( () otherlv_8= Has otherlv_9= One )
                    {
                    // InternalCMSdslParser.g:1890:3: ( () otherlv_8= Has otherlv_9= One )
                    // InternalCMSdslParser.g:1891:4: () otherlv_8= Has otherlv_9= One
                    {
                    // InternalCMSdslParser.g:1891:4: ()
                    // InternalCMSdslParser.g:1892:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationshipTypeAccess().getHasOneAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,Has,FOLLOW_26); 

                    				newLeafNode(otherlv_8, grammarAccess.getRelationshipTypeAccess().getHasKeyword_2_1());
                    			
                    otherlv_9=(Token)match(input,One,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getRelationshipTypeAccess().getOneKeyword_2_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCMSdslParser.g:1908:3: ( () otherlv_11= Has otherlv_12= Many )
                    {
                    // InternalCMSdslParser.g:1908:3: ( () otherlv_11= Has otherlv_12= Many )
                    // InternalCMSdslParser.g:1909:4: () otherlv_11= Has otherlv_12= Many
                    {
                    // InternalCMSdslParser.g:1909:4: ()
                    // InternalCMSdslParser.g:1910:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationshipTypeAccess().getHasManyAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,Has,FOLLOW_25); 

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
    // InternalCMSdslParser.g:1929:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalCMSdslParser.g:1929:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalCMSdslParser.g:1930:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalCMSdslParser.g:1936:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:1942:2: (this_Or_0= ruleOr )
            // InternalCMSdslParser.g:1943:2: this_Or_0= ruleOr
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
    // InternalCMSdslParser.g:1954:1: entryRuleEval returns [EObject current=null] : iv_ruleEval= ruleEval EOF ;
    public final EObject entryRuleEval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEval = null;


        try {
            // InternalCMSdslParser.g:1954:45: (iv_ruleEval= ruleEval EOF )
            // InternalCMSdslParser.g:1955:2: iv_ruleEval= ruleEval EOF
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
    // InternalCMSdslParser.g:1961:1: ruleEval returns [EObject current=null] : ( () otherlv_1= Eval ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleEval() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:1967:2: ( ( () otherlv_1= Eval ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalCMSdslParser.g:1968:2: ( () otherlv_1= Eval ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalCMSdslParser.g:1968:2: ( () otherlv_1= Eval ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalCMSdslParser.g:1969:3: () otherlv_1= Eval ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalCMSdslParser.g:1969:3: ()
            // InternalCMSdslParser.g:1970:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvalAccess().getEvalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Eval,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getEvalAccess().getEvalKeyword_1());
            		
            // InternalCMSdslParser.g:1980:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalCMSdslParser.g:1981:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalCMSdslParser.g:1981:4: (lv_expression_2_0= ruleExpression )
            // InternalCMSdslParser.g:1982:5: lv_expression_2_0= ruleExpression
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
    // InternalCMSdslParser.g:2003:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalCMSdslParser.g:2003:43: (iv_ruleOr= ruleOr EOF )
            // InternalCMSdslParser.g:2004:2: iv_ruleOr= ruleOr EOF
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
    // InternalCMSdslParser.g:2010:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:2016:2: ( (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalCMSdslParser.g:2017:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalCMSdslParser.g:2017:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalCMSdslParser.g:2018:3: this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCMSdslParser.g:2026:3: ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==VerticalLineVerticalLine) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCMSdslParser.g:2027:4: () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalCMSdslParser.g:2027:4: ()
            	    // InternalCMSdslParser.g:2028:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,VerticalLineVerticalLine,FOLLOW_22); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalCMSdslParser.g:2038:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalCMSdslParser.g:2039:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalCMSdslParser.g:2039:5: (lv_right_3_0= ruleAnd )
            	    // InternalCMSdslParser.g:2040:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_27);
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
            	    break loop19;
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
    // InternalCMSdslParser.g:2062:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalCMSdslParser.g:2062:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalCMSdslParser.g:2063:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalCMSdslParser.g:2069:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:2075:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalCMSdslParser.g:2076:2: (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalCMSdslParser.g:2076:2: (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalCMSdslParser.g:2077:3: this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCMSdslParser.g:2085:3: ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==AmpersandAmpersand) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCMSdslParser.g:2086:4: () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalCMSdslParser.g:2086:4: ()
            	    // InternalCMSdslParser.g:2087:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,AmpersandAmpersand,FOLLOW_22); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalCMSdslParser.g:2097:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalCMSdslParser.g:2098:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalCMSdslParser.g:2098:5: (lv_right_3_0= ruleEquality )
            	    // InternalCMSdslParser.g:2099:6: lv_right_3_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalCMSdslParser.g:2121:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalCMSdslParser.g:2121:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalCMSdslParser.g:2122:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalCMSdslParser.g:2128:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:2134:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalCMSdslParser.g:2135:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalCMSdslParser.g:2135:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalCMSdslParser.g:2136:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCMSdslParser.g:2144:3: ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==ExclamationMarkEqualsSign||LA22_0==EqualsSignEqualsSign) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCMSdslParser.g:2145:4: () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalCMSdslParser.g:2145:4: ()
            	    // InternalCMSdslParser.g:2146:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCMSdslParser.g:2152:4: ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) )
            	    // InternalCMSdslParser.g:2153:5: ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) )
            	    {
            	    // InternalCMSdslParser.g:2153:5: ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) )
            	    // InternalCMSdslParser.g:2154:6: (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign )
            	    {
            	    // InternalCMSdslParser.g:2154:6: (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==EqualsSignEqualsSign) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==ExclamationMarkEqualsSign) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalCMSdslParser.g:2155:7: lv_op_2_1= EqualsSignEqualsSign
            	            {
            	            lv_op_2_1=(Token)match(input,EqualsSignEqualsSign,FOLLOW_22); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalCMSdslParser.g:2166:7: lv_op_2_2= ExclamationMarkEqualsSign
            	            {
            	            lv_op_2_2=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_22); 

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

            	    // InternalCMSdslParser.g:2179:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalCMSdslParser.g:2180:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalCMSdslParser.g:2180:5: (lv_right_3_0= ruleComparison )
            	    // InternalCMSdslParser.g:2181:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalCMSdslParser.g:2203:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalCMSdslParser.g:2203:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalCMSdslParser.g:2204:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalCMSdslParser.g:2210:1: ruleComparison returns [EObject current=null] : (this_PlusMinus_0= rulePlusMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusMinus ) ) )* ) ;
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
            // InternalCMSdslParser.g:2216:2: ( (this_PlusMinus_0= rulePlusMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusMinus ) ) )* ) )
            // InternalCMSdslParser.g:2217:2: (this_PlusMinus_0= rulePlusMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusMinus ) ) )* )
            {
            // InternalCMSdslParser.g:2217:2: (this_PlusMinus_0= rulePlusMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusMinus ) ) )* )
            // InternalCMSdslParser.g:2218:3: this_PlusMinus_0= rulePlusMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_PlusMinus_0=rulePlusMinus();

            state._fsp--;


            			current = this_PlusMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCMSdslParser.g:2226:3: ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusMinus ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==LessThanSignEqualsSign||LA24_0==GreaterThanSignEqualsSign||(LA24_0>=LessThanSign && LA24_0<=GreaterThanSign)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCMSdslParser.g:2227:4: () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusMinus ) )
            	    {
            	    // InternalCMSdslParser.g:2227:4: ()
            	    // InternalCMSdslParser.g:2228:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCMSdslParser.g:2234:4: ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) )
            	    // InternalCMSdslParser.g:2235:5: ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) )
            	    {
            	    // InternalCMSdslParser.g:2235:5: ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) )
            	    // InternalCMSdslParser.g:2236:6: (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign )
            	    {
            	    // InternalCMSdslParser.g:2236:6: (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign )
            	    int alt23=4;
            	    switch ( input.LA(1) ) {
            	    case GreaterThanSignEqualsSign:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case LessThanSignEqualsSign:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case GreaterThanSign:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    case LessThanSign:
            	        {
            	        alt23=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // InternalCMSdslParser.g:2237:7: lv_op_2_1= GreaterThanSignEqualsSign
            	            {
            	            lv_op_2_1=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_22); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalCMSdslParser.g:2248:7: lv_op_2_2= LessThanSignEqualsSign
            	            {
            	            lv_op_2_2=(Token)match(input,LessThanSignEqualsSign,FOLLOW_22); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalCMSdslParser.g:2259:7: lv_op_2_3= GreaterThanSign
            	            {
            	            lv_op_2_3=(Token)match(input,GreaterThanSign,FOLLOW_22); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalCMSdslParser.g:2270:7: lv_op_2_4= LessThanSign
            	            {
            	            lv_op_2_4=(Token)match(input,LessThanSign,FOLLOW_22); 

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

            	    // InternalCMSdslParser.g:2283:4: ( (lv_right_3_0= rulePlusMinus ) )
            	    // InternalCMSdslParser.g:2284:5: (lv_right_3_0= rulePlusMinus )
            	    {
            	    // InternalCMSdslParser.g:2284:5: (lv_right_3_0= rulePlusMinus )
            	    // InternalCMSdslParser.g:2285:6: lv_right_3_0= rulePlusMinus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusMinus"
    // InternalCMSdslParser.g:2307:1: entryRulePlusMinus returns [EObject current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final EObject entryRulePlusMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinus = null;


        try {
            // InternalCMSdslParser.g:2307:50: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalCMSdslParser.g:2308:2: iv_rulePlusMinus= rulePlusMinus EOF
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
    // InternalCMSdslParser.g:2314:1: rulePlusMinus returns [EObject current=null] : (this_MulDiv_0= ruleMulDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMulDiv ) ) )* ) ;
    public final EObject rulePlusMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:2320:2: ( (this_MulDiv_0= ruleMulDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMulDiv ) ) )* ) )
            // InternalCMSdslParser.g:2321:2: (this_MulDiv_0= ruleMulDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMulDiv ) ) )* )
            {
            // InternalCMSdslParser.g:2321:2: (this_MulDiv_0= ruleMulDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMulDiv ) ) )* )
            // InternalCMSdslParser.g:2322:3: this_MulDiv_0= ruleMulDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMulDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusMinusAccess().getMulDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_MulDiv_0=ruleMulDiv();

            state._fsp--;


            			current = this_MulDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCMSdslParser.g:2330:3: ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMulDiv ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==PlusSign||LA26_0==HyphenMinus) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCMSdslParser.g:2331:4: ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMulDiv ) )
            	    {
            	    // InternalCMSdslParser.g:2331:4: ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==PlusSign) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==HyphenMinus) ) {
            	        alt25=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalCMSdslParser.g:2332:5: ( () otherlv_2= PlusSign )
            	            {
            	            // InternalCMSdslParser.g:2332:5: ( () otherlv_2= PlusSign )
            	            // InternalCMSdslParser.g:2333:6: () otherlv_2= PlusSign
            	            {
            	            // InternalCMSdslParser.g:2333:6: ()
            	            // InternalCMSdslParser.g:2334:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,PlusSign,FOLLOW_22); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalCMSdslParser.g:2346:5: ( () otherlv_4= HyphenMinus )
            	            {
            	            // InternalCMSdslParser.g:2346:5: ( () otherlv_4= HyphenMinus )
            	            // InternalCMSdslParser.g:2347:6: () otherlv_4= HyphenMinus
            	            {
            	            // InternalCMSdslParser.g:2347:6: ()
            	            // InternalCMSdslParser.g:2348:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,HyphenMinus,FOLLOW_22); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalCMSdslParser.g:2360:4: ( (lv_right_5_0= ruleMulDiv ) )
            	    // InternalCMSdslParser.g:2361:5: (lv_right_5_0= ruleMulDiv )
            	    {
            	    // InternalCMSdslParser.g:2361:5: (lv_right_5_0= ruleMulDiv )
            	    // InternalCMSdslParser.g:2362:6: lv_right_5_0= ruleMulDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusMinusAccess().getRightMulDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
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
            	    break loop26;
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
    // InternalCMSdslParser.g:2384:1: entryRuleMulDiv returns [EObject current=null] : iv_ruleMulDiv= ruleMulDiv EOF ;
    public final EObject entryRuleMulDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulDiv = null;


        try {
            // InternalCMSdslParser.g:2384:47: (iv_ruleMulDiv= ruleMulDiv EOF )
            // InternalCMSdslParser.g:2385:2: iv_ruleMulDiv= ruleMulDiv EOF
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
    // InternalCMSdslParser.g:2391:1: ruleMulDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= Asterisk ) | ( () otherlv_4= Solidus ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:2397:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= Asterisk ) | ( () otherlv_4= Solidus ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalCMSdslParser.g:2398:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= Asterisk ) | ( () otherlv_4= Solidus ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalCMSdslParser.g:2398:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= Asterisk ) | ( () otherlv_4= Solidus ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalCMSdslParser.g:2399:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= Asterisk ) | ( () otherlv_4= Solidus ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCMSdslParser.g:2407:3: ( ( ( () otherlv_2= Asterisk ) | ( () otherlv_4= Solidus ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==Asterisk||LA28_0==Solidus) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCMSdslParser.g:2408:4: ( ( () otherlv_2= Asterisk ) | ( () otherlv_4= Solidus ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalCMSdslParser.g:2408:4: ( ( () otherlv_2= Asterisk ) | ( () otherlv_4= Solidus ) )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==Asterisk) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==Solidus) ) {
            	        alt27=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalCMSdslParser.g:2409:5: ( () otherlv_2= Asterisk )
            	            {
            	            // InternalCMSdslParser.g:2409:5: ( () otherlv_2= Asterisk )
            	            // InternalCMSdslParser.g:2410:6: () otherlv_2= Asterisk
            	            {
            	            // InternalCMSdslParser.g:2410:6: ()
            	            // InternalCMSdslParser.g:2411:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMulDivAccess().getMulLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,Asterisk,FOLLOW_22); 

            	            						newLeafNode(otherlv_2, grammarAccess.getMulDivAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalCMSdslParser.g:2423:5: ( () otherlv_4= Solidus )
            	            {
            	            // InternalCMSdslParser.g:2423:5: ( () otherlv_4= Solidus )
            	            // InternalCMSdslParser.g:2424:6: () otherlv_4= Solidus
            	            {
            	            // InternalCMSdslParser.g:2424:6: ()
            	            // InternalCMSdslParser.g:2425:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMulDivAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,Solidus,FOLLOW_22); 

            	            						newLeafNode(otherlv_4, grammarAccess.getMulDivAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalCMSdslParser.g:2437:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalCMSdslParser.g:2438:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalCMSdslParser.g:2438:5: (lv_right_5_0= rulePrimary )
            	    // InternalCMSdslParser.g:2439:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulDivAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"jope015.mdsd2021.reexam.CMSdsl.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
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


    // $ANTLR start "entryRulePrimary"
    // InternalCMSdslParser.g:2461:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalCMSdslParser.g:2461:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalCMSdslParser.g:2462:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalCMSdslParser.g:2468:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Atomic_3= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_Atomic_3 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:2474:2: ( ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Atomic_3= ruleAtomic ) )
            // InternalCMSdslParser.g:2475:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Atomic_3= ruleAtomic )
            {
            // InternalCMSdslParser.g:2475:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Atomic_3= ruleAtomic )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==LeftParenthesis) ) {
                alt29=1;
            }
            else if ( (LA29_0==False||LA29_0==True||(LA29_0>=RULE_ID && LA29_0<=RULE_STRING)) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalCMSdslParser.g:2476:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    {
                    // InternalCMSdslParser.g:2476:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    // InternalCMSdslParser.g:2477:4: otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_22); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_33);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCMSdslParser.g:2495:3: this_Atomic_3= ruleAtomic
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_3=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_3;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalCMSdslParser.g:2507:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalCMSdslParser.g:2507:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalCMSdslParser.g:2508:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalCMSdslParser.g:2514:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | this_ParamOrArgUse_6= ruleParamOrArgUse ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        EObject this_ParamOrArgUse_6 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:2520:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | this_ParamOrArgUse_6= ruleParamOrArgUse ) )
            // InternalCMSdslParser.g:2521:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | this_ParamOrArgUse_6= ruleParamOrArgUse )
            {
            // InternalCMSdslParser.g:2521:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) ) | this_ParamOrArgUse_6= ruleParamOrArgUse )
            int alt31=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt31=1;
                }
                break;
            case RULE_STRING:
                {
                alt31=2;
                }
                break;
            case False:
            case True:
                {
                alt31=3;
                }
                break;
            case RULE_ID:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalCMSdslParser.g:2522:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalCMSdslParser.g:2522:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalCMSdslParser.g:2523:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalCMSdslParser.g:2523:4: ()
                    // InternalCMSdslParser.g:2524:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getNumAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:2530:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalCMSdslParser.g:2531:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalCMSdslParser.g:2531:5: (lv_value_1_0= RULE_INT )
                    // InternalCMSdslParser.g:2532:6: lv_value_1_0= RULE_INT
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
                    // InternalCMSdslParser.g:2550:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:2550:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:2551:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:2551:4: ()
                    // InternalCMSdslParser.g:2552:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getStrAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:2558:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:2559:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:2559:5: (lv_value_3_0= RULE_STRING )
                    // InternalCMSdslParser.g:2560:6: lv_value_3_0= RULE_STRING
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
                    // InternalCMSdslParser.g:2578:3: ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) )
                    {
                    // InternalCMSdslParser.g:2578:3: ( () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) ) )
                    // InternalCMSdslParser.g:2579:4: () ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) )
                    {
                    // InternalCMSdslParser.g:2579:4: ()
                    // InternalCMSdslParser.g:2580:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBoolAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:2586:4: ( ( (lv_value_5_1= True | lv_value_5_2= False ) ) )
                    // InternalCMSdslParser.g:2587:5: ( (lv_value_5_1= True | lv_value_5_2= False ) )
                    {
                    // InternalCMSdslParser.g:2587:5: ( (lv_value_5_1= True | lv_value_5_2= False ) )
                    // InternalCMSdslParser.g:2588:6: (lv_value_5_1= True | lv_value_5_2= False )
                    {
                    // InternalCMSdslParser.g:2588:6: (lv_value_5_1= True | lv_value_5_2= False )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==True) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==False) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalCMSdslParser.g:2589:7: lv_value_5_1= True
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
                            // InternalCMSdslParser.g:2600:7: lv_value_5_2= False
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
                    // InternalCMSdslParser.g:2615:3: this_ParamOrArgUse_6= ruleParamOrArgUse
                    {

                    			newCompositeNode(grammarAccess.getAtomicAccess().getParamOrArgUseParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParamOrArgUse_6=ruleParamOrArgUse();

                    state._fsp--;


                    			current = this_ParamOrArgUse_6;
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x1000000020040060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x1000000200006580L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0100004000000800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0100002000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000004000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x1000000042200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000809C100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x1000000400001010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0024000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000810480300L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0xE002001001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000120000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0600480000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0050000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0088000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0004000000000000L});

}