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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DisplayAs", "InputType", "Validator", "Database", "Hostname", "Nullable", "Password", "Textarea", "Username", "Belongs", "Default", "Dialect", "Library", "Project", "Client", "Entity", "Number", "Server", "String", "Unique", "Check", "Email", "Field", "Float", "Bool", "Date", "Hide", "Long", "Many", "Port", "Test", "Text", "And", "Has", "Int", "One", "ExclamationMarkEqualsSign", "AmpersandAmpersand", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "EqualsSignGreaterThanSign", "GreaterThanSignEqualsSign", "To", "VerticalLineVerticalLine", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "Solidus", "Colon", "LessThanSign", "GreaterThanSign", "RULE_BOOLEAN", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Entity=19;
    public static final int Email=25;
    public static final int RULE_BEGIN=59;
    public static final int Server=21;
    public static final int EqualsSignGreaterThanSign=44;
    public static final int Port=33;
    public static final int Check=24;
    public static final int RULE_BOOLEAN=58;
    public static final int String=22;
    public static final int LessThanSign=56;
    public static final int LeftParenthesis=48;
    public static final int Bool=28;
    public static final int Test=34;
    public static final int Database=7;
    public static final int To=46;
    public static final int Client=18;
    public static final int GreaterThanSign=57;
    public static final int RULE_ID=61;
    public static final int Hostname=8;
    public static final int RightParenthesis=49;
    public static final int Belongs=13;
    public static final int GreaterThanSignEqualsSign=45;
    public static final int Project=17;
    public static final int Float=27;
    public static final int EqualsSignEqualsSign=43;
    public static final int InputType=5;
    public static final int And=36;
    public static final int PlusSign=51;
    public static final int RULE_INT=62;
    public static final int Long=31;
    public static final int RULE_ML_COMMENT=64;
    public static final int Unique=23;
    public static final int Library=16;
    public static final int Nullable=9;
    public static final int DisplayAs=4;
    public static final int Hide=30;
    public static final int RULE_END=60;
    public static final int VerticalLineVerticalLine=47;
    public static final int One=39;
    public static final int RULE_STRING=63;
    public static final int Int=38;
    public static final int RULE_SL_COMMENT=65;
    public static final int Field=26;
    public static final int Comma=52;
    public static final int HyphenMinus=53;
    public static final int Textarea=11;
    public static final int Number=20;
    public static final int AmpersandAmpersand=41;
    public static final int Dialect=15;
    public static final int Many=32;
    public static final int LessThanSignEqualsSign=42;
    public static final int Solidus=54;
    public static final int Colon=55;
    public static final int EOF=-1;
    public static final int Asterisk=50;
    public static final int Password=10;
    public static final int RULE_WS=66;
    public static final int Text=35;
    public static final int RULE_ANY_OTHER=67;
    public static final int Default=14;
    public static final int Date=29;
    public static final int Username=12;
    public static final int Has=37;
    public static final int ExclamationMarkEqualsSign=40;
    public static final int Validator=6;

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

                if ( ((LA1_0>=Validator && LA1_0<=Database)||LA1_0==Entity) ) {
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
    // InternalCMSdslParser.g:136:1: rulePrimaryElement returns [EObject current=null] : (this_DBConfig_0= ruleDBConfig | this_Entity_1= ruleEntity | this_Validator_2= ruleValidator ) ;
    public final EObject rulePrimaryElement() throws RecognitionException {
        EObject current = null;

        EObject this_DBConfig_0 = null;

        EObject this_Entity_1 = null;

        EObject this_Validator_2 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:142:2: ( (this_DBConfig_0= ruleDBConfig | this_Entity_1= ruleEntity | this_Validator_2= ruleValidator ) )
            // InternalCMSdslParser.g:143:2: (this_DBConfig_0= ruleDBConfig | this_Entity_1= ruleEntity | this_Validator_2= ruleValidator )
            {
            // InternalCMSdslParser.g:143:2: (this_DBConfig_0= ruleDBConfig | this_Entity_1= ruleEntity | this_Validator_2= ruleValidator )
            int alt2=3;
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
    // InternalCMSdslParser.g:174:1: entryRuleDBConfig returns [EObject current=null] : iv_ruleDBConfig= ruleDBConfig EOF ;
    public final EObject entryRuleDBConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBConfig = null;


        try {
            // InternalCMSdslParser.g:174:49: (iv_ruleDBConfig= ruleDBConfig EOF )
            // InternalCMSdslParser.g:175:2: iv_ruleDBConfig= ruleDBConfig EOF
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
    // InternalCMSdslParser.g:181:1: ruleDBConfig returns [EObject current=null] : ( () ( (lv_type_1_0= Database ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_config_4_0= ruleDBDecl ) )* this_END_5= RULE_END ) ;
    public final EObject ruleDBConfig() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_config_4_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:187:2: ( ( () ( (lv_type_1_0= Database ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_config_4_0= ruleDBDecl ) )* this_END_5= RULE_END ) )
            // InternalCMSdslParser.g:188:2: ( () ( (lv_type_1_0= Database ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_config_4_0= ruleDBDecl ) )* this_END_5= RULE_END )
            {
            // InternalCMSdslParser.g:188:2: ( () ( (lv_type_1_0= Database ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_config_4_0= ruleDBDecl ) )* this_END_5= RULE_END )
            // InternalCMSdslParser.g:189:3: () ( (lv_type_1_0= Database ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_config_4_0= ruleDBDecl ) )* this_END_5= RULE_END
            {
            // InternalCMSdslParser.g:189:3: ()
            // InternalCMSdslParser.g:190:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDBConfigAccess().getDBConfigAction_0(),
            					current);
            			

            }

            // InternalCMSdslParser.g:196:3: ( (lv_type_1_0= Database ) )
            // InternalCMSdslParser.g:197:4: (lv_type_1_0= Database )
            {
            // InternalCMSdslParser.g:197:4: (lv_type_1_0= Database )
            // InternalCMSdslParser.g:198:5: lv_type_1_0= Database
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
            		
            // InternalCMSdslParser.g:218:3: ( (lv_config_4_0= ruleDBDecl ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==Hostname||LA3_0==Password||LA3_0==Username||(LA3_0>=Dialect && LA3_0<=Library)||LA3_0==Port) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCMSdslParser.g:219:4: (lv_config_4_0= ruleDBDecl )
            	    {
            	    // InternalCMSdslParser.g:219:4: (lv_config_4_0= ruleDBDecl )
            	    // InternalCMSdslParser.g:220:5: lv_config_4_0= ruleDBDecl
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
    // InternalCMSdslParser.g:245:1: entryRuleDBDecl returns [EObject current=null] : iv_ruleDBDecl= ruleDBDecl EOF ;
    public final EObject entryRuleDBDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBDecl = null;


        try {
            // InternalCMSdslParser.g:245:47: (iv_ruleDBDecl= ruleDBDecl EOF )
            // InternalCMSdslParser.g:246:2: iv_ruleDBDecl= ruleDBDecl EOF
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
    // InternalCMSdslParser.g:252:1: ruleDBDecl returns [EObject current=null] : ( ( () ( (lv_type_1_0= Library ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_type_5_0= Hostname ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_type_9_0= Port ) ) otherlv_10= Colon ( (lv_value_11_0= RULE_INT ) ) ) | ( () ( (lv_type_13_0= Dialect ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) ) ) | ( () ( (lv_type_17_0= Username ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_STRING ) ) ) | ( () ( (lv_type_21_0= Password ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_STRING ) ) ) ) ;
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
            // InternalCMSdslParser.g:258:2: ( ( ( () ( (lv_type_1_0= Library ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_type_5_0= Hostname ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_type_9_0= Port ) ) otherlv_10= Colon ( (lv_value_11_0= RULE_INT ) ) ) | ( () ( (lv_type_13_0= Dialect ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) ) ) | ( () ( (lv_type_17_0= Username ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_STRING ) ) ) | ( () ( (lv_type_21_0= Password ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_STRING ) ) ) ) )
            // InternalCMSdslParser.g:259:2: ( ( () ( (lv_type_1_0= Library ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_type_5_0= Hostname ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_type_9_0= Port ) ) otherlv_10= Colon ( (lv_value_11_0= RULE_INT ) ) ) | ( () ( (lv_type_13_0= Dialect ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) ) ) | ( () ( (lv_type_17_0= Username ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_STRING ) ) ) | ( () ( (lv_type_21_0= Password ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_STRING ) ) ) )
            {
            // InternalCMSdslParser.g:259:2: ( ( () ( (lv_type_1_0= Library ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_type_5_0= Hostname ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_type_9_0= Port ) ) otherlv_10= Colon ( (lv_value_11_0= RULE_INT ) ) ) | ( () ( (lv_type_13_0= Dialect ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) ) ) | ( () ( (lv_type_17_0= Username ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_STRING ) ) ) | ( () ( (lv_type_21_0= Password ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_STRING ) ) ) )
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
                    // InternalCMSdslParser.g:260:3: ( () ( (lv_type_1_0= Library ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:260:3: ( () ( (lv_type_1_0= Library ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:261:4: () ( (lv_type_1_0= Library ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:261:4: ()
                    // InternalCMSdslParser.g:262:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDBDeclAccess().getLibAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:268:4: ( (lv_type_1_0= Library ) )
                    // InternalCMSdslParser.g:269:5: (lv_type_1_0= Library )
                    {
                    // InternalCMSdslParser.g:269:5: (lv_type_1_0= Library )
                    // InternalCMSdslParser.g:270:6: lv_type_1_0= Library
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
                    			
                    // InternalCMSdslParser.g:286:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:287:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:287:5: (lv_value_3_0= RULE_STRING )
                    // InternalCMSdslParser.g:288:6: lv_value_3_0= RULE_STRING
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
                    // InternalCMSdslParser.g:306:3: ( () ( (lv_type_5_0= Hostname ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:306:3: ( () ( (lv_type_5_0= Hostname ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:307:4: () ( (lv_type_5_0= Hostname ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:307:4: ()
                    // InternalCMSdslParser.g:308:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDBDeclAccess().getHostAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:314:4: ( (lv_type_5_0= Hostname ) )
                    // InternalCMSdslParser.g:315:5: (lv_type_5_0= Hostname )
                    {
                    // InternalCMSdslParser.g:315:5: (lv_type_5_0= Hostname )
                    // InternalCMSdslParser.g:316:6: lv_type_5_0= Hostname
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
                    			
                    // InternalCMSdslParser.g:332:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:333:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:333:5: (lv_value_7_0= RULE_STRING )
                    // InternalCMSdslParser.g:334:6: lv_value_7_0= RULE_STRING
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
                    // InternalCMSdslParser.g:352:3: ( () ( (lv_type_9_0= Port ) ) otherlv_10= Colon ( (lv_value_11_0= RULE_INT ) ) )
                    {
                    // InternalCMSdslParser.g:352:3: ( () ( (lv_type_9_0= Port ) ) otherlv_10= Colon ( (lv_value_11_0= RULE_INT ) ) )
                    // InternalCMSdslParser.g:353:4: () ( (lv_type_9_0= Port ) ) otherlv_10= Colon ( (lv_value_11_0= RULE_INT ) )
                    {
                    // InternalCMSdslParser.g:353:4: ()
                    // InternalCMSdslParser.g:354:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDBDeclAccess().getPortAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:360:4: ( (lv_type_9_0= Port ) )
                    // InternalCMSdslParser.g:361:5: (lv_type_9_0= Port )
                    {
                    // InternalCMSdslParser.g:361:5: (lv_type_9_0= Port )
                    // InternalCMSdslParser.g:362:6: lv_type_9_0= Port
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
                    			
                    // InternalCMSdslParser.g:378:4: ( (lv_value_11_0= RULE_INT ) )
                    // InternalCMSdslParser.g:379:5: (lv_value_11_0= RULE_INT )
                    {
                    // InternalCMSdslParser.g:379:5: (lv_value_11_0= RULE_INT )
                    // InternalCMSdslParser.g:380:6: lv_value_11_0= RULE_INT
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
                    // InternalCMSdslParser.g:398:3: ( () ( (lv_type_13_0= Dialect ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:398:3: ( () ( (lv_type_13_0= Dialect ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:399:4: () ( (lv_type_13_0= Dialect ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:399:4: ()
                    // InternalCMSdslParser.g:400:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDBDeclAccess().getDialectAction_3_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:406:4: ( (lv_type_13_0= Dialect ) )
                    // InternalCMSdslParser.g:407:5: (lv_type_13_0= Dialect )
                    {
                    // InternalCMSdslParser.g:407:5: (lv_type_13_0= Dialect )
                    // InternalCMSdslParser.g:408:6: lv_type_13_0= Dialect
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
                    			
                    // InternalCMSdslParser.g:424:4: ( (lv_value_15_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:425:5: (lv_value_15_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:425:5: (lv_value_15_0= RULE_STRING )
                    // InternalCMSdslParser.g:426:6: lv_value_15_0= RULE_STRING
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
                    // InternalCMSdslParser.g:444:3: ( () ( (lv_type_17_0= Username ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:444:3: ( () ( (lv_type_17_0= Username ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:445:4: () ( (lv_type_17_0= Username ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:445:4: ()
                    // InternalCMSdslParser.g:446:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDBDeclAccess().getUserAction_4_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:452:4: ( (lv_type_17_0= Username ) )
                    // InternalCMSdslParser.g:453:5: (lv_type_17_0= Username )
                    {
                    // InternalCMSdslParser.g:453:5: (lv_type_17_0= Username )
                    // InternalCMSdslParser.g:454:6: lv_type_17_0= Username
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
                    			
                    // InternalCMSdslParser.g:470:4: ( (lv_value_19_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:471:5: (lv_value_19_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:471:5: (lv_value_19_0= RULE_STRING )
                    // InternalCMSdslParser.g:472:6: lv_value_19_0= RULE_STRING
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
                    // InternalCMSdslParser.g:490:3: ( () ( (lv_type_21_0= Password ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:490:3: ( () ( (lv_type_21_0= Password ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:491:4: () ( (lv_type_21_0= Password ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:491:4: ()
                    // InternalCMSdslParser.g:492:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDBDeclAccess().getPassAction_5_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:498:4: ( (lv_type_21_0= Password ) )
                    // InternalCMSdslParser.g:499:5: (lv_type_21_0= Password )
                    {
                    // InternalCMSdslParser.g:499:5: (lv_type_21_0= Password )
                    // InternalCMSdslParser.g:500:6: lv_type_21_0= Password
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
                    			
                    // InternalCMSdslParser.g:516:4: ( (lv_value_23_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:517:5: (lv_value_23_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:517:5: (lv_value_23_0= RULE_STRING )
                    // InternalCMSdslParser.g:518:6: lv_value_23_0= RULE_STRING
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
    // InternalCMSdslParser.g:539:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalCMSdslParser.g:539:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalCMSdslParser.g:540:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalCMSdslParser.g:546:1: ruleEntity returns [EObject current=null] : ( () otherlv_1= Entity ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_relations_3_0= ruleRelationship ) ) (otherlv_4= And ( (lv_relations_5_0= ruleRelationship ) ) )* )? otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_members_8_0= ruleEntityDecl ) )* this_END_9= RULE_END ) ;
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
            // InternalCMSdslParser.g:552:2: ( ( () otherlv_1= Entity ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_relations_3_0= ruleRelationship ) ) (otherlv_4= And ( (lv_relations_5_0= ruleRelationship ) ) )* )? otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_members_8_0= ruleEntityDecl ) )* this_END_9= RULE_END ) )
            // InternalCMSdslParser.g:553:2: ( () otherlv_1= Entity ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_relations_3_0= ruleRelationship ) ) (otherlv_4= And ( (lv_relations_5_0= ruleRelationship ) ) )* )? otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_members_8_0= ruleEntityDecl ) )* this_END_9= RULE_END )
            {
            // InternalCMSdslParser.g:553:2: ( () otherlv_1= Entity ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_relations_3_0= ruleRelationship ) ) (otherlv_4= And ( (lv_relations_5_0= ruleRelationship ) ) )* )? otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_members_8_0= ruleEntityDecl ) )* this_END_9= RULE_END )
            // InternalCMSdslParser.g:554:3: () otherlv_1= Entity ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_relations_3_0= ruleRelationship ) ) (otherlv_4= And ( (lv_relations_5_0= ruleRelationship ) ) )* )? otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_members_8_0= ruleEntityDecl ) )* this_END_9= RULE_END
            {
            // InternalCMSdslParser.g:554:3: ()
            // InternalCMSdslParser.g:555:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityAccess().getEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Entity,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
            		
            // InternalCMSdslParser.g:565:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCMSdslParser.g:566:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCMSdslParser.g:566:4: (lv_name_2_0= RULE_ID )
            // InternalCMSdslParser.g:567:5: lv_name_2_0= RULE_ID
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

            // InternalCMSdslParser.g:583:3: ( ( (lv_relations_3_0= ruleRelationship ) ) (otherlv_4= And ( (lv_relations_5_0= ruleRelationship ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Belongs||LA6_0==Has) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCMSdslParser.g:584:4: ( (lv_relations_3_0= ruleRelationship ) ) (otherlv_4= And ( (lv_relations_5_0= ruleRelationship ) ) )*
                    {
                    // InternalCMSdslParser.g:584:4: ( (lv_relations_3_0= ruleRelationship ) )
                    // InternalCMSdslParser.g:585:5: (lv_relations_3_0= ruleRelationship )
                    {
                    // InternalCMSdslParser.g:585:5: (lv_relations_3_0= ruleRelationship )
                    // InternalCMSdslParser.g:586:6: lv_relations_3_0= ruleRelationship
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

                    // InternalCMSdslParser.g:603:4: (otherlv_4= And ( (lv_relations_5_0= ruleRelationship ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==And) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCMSdslParser.g:604:5: otherlv_4= And ( (lv_relations_5_0= ruleRelationship ) )
                    	    {
                    	    otherlv_4=(Token)match(input,And,FOLLOW_12); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getAndKeyword_3_1_0());
                    	    				
                    	    // InternalCMSdslParser.g:608:5: ( (lv_relations_5_0= ruleRelationship ) )
                    	    // InternalCMSdslParser.g:609:6: (lv_relations_5_0= ruleRelationship )
                    	    {
                    	    // InternalCMSdslParser.g:609:6: (lv_relations_5_0= ruleRelationship )
                    	    // InternalCMSdslParser.g:610:7: lv_relations_5_0= ruleRelationship
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
            		
            // InternalCMSdslParser.g:637:3: ( (lv_members_8_0= ruleEntityDecl ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Check||LA7_0==Field||LA7_0==Hide) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCMSdslParser.g:638:4: (lv_members_8_0= ruleEntityDecl )
            	    {
            	    // InternalCMSdslParser.g:638:4: (lv_members_8_0= ruleEntityDecl )
            	    // InternalCMSdslParser.g:639:5: lv_members_8_0= ruleEntityDecl
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
    // InternalCMSdslParser.g:664:1: entryRuleEntityDecl returns [EObject current=null] : iv_ruleEntityDecl= ruleEntityDecl EOF ;
    public final EObject entryRuleEntityDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityDecl = null;


        try {
            // InternalCMSdslParser.g:664:51: (iv_ruleEntityDecl= ruleEntityDecl EOF )
            // InternalCMSdslParser.g:665:2: iv_ruleEntityDecl= ruleEntityDecl EOF
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
    // InternalCMSdslParser.g:671:1: ruleEntityDecl returns [EObject current=null] : (this_Field_0= ruleField | this_ValidationCheck_1= ruleValidationCheck ) ;
    public final EObject ruleEntityDecl() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_ValidationCheck_1 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:677:2: ( (this_Field_0= ruleField | this_ValidationCheck_1= ruleValidationCheck ) )
            // InternalCMSdslParser.g:678:2: (this_Field_0= ruleField | this_ValidationCheck_1= ruleValidationCheck )
            {
            // InternalCMSdslParser.g:678:2: (this_Field_0= ruleField | this_ValidationCheck_1= ruleValidationCheck )
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
                    // InternalCMSdslParser.g:679:3: this_Field_0= ruleField
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
                    // InternalCMSdslParser.g:688:3: this_ValidationCheck_1= ruleValidationCheck
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
    // InternalCMSdslParser.g:700:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalCMSdslParser.g:700:46: (iv_ruleField= ruleField EOF )
            // InternalCMSdslParser.g:701:2: iv_ruleField= ruleField EOF
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
    // InternalCMSdslParser.g:707:1: ruleField returns [EObject current=null] : ( ( (lv_dontShow_0_0= Hide ) )? otherlv_1= Field ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_type_4_0= ruleDataType ) ) (otherlv_5= EqualsSignGreaterThanSign this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleFieldProp ) )* this_END_8= RULE_END )? ) ;
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
            // InternalCMSdslParser.g:713:2: ( ( ( (lv_dontShow_0_0= Hide ) )? otherlv_1= Field ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_type_4_0= ruleDataType ) ) (otherlv_5= EqualsSignGreaterThanSign this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleFieldProp ) )* this_END_8= RULE_END )? ) )
            // InternalCMSdslParser.g:714:2: ( ( (lv_dontShow_0_0= Hide ) )? otherlv_1= Field ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_type_4_0= ruleDataType ) ) (otherlv_5= EqualsSignGreaterThanSign this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleFieldProp ) )* this_END_8= RULE_END )? )
            {
            // InternalCMSdslParser.g:714:2: ( ( (lv_dontShow_0_0= Hide ) )? otherlv_1= Field ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_type_4_0= ruleDataType ) ) (otherlv_5= EqualsSignGreaterThanSign this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleFieldProp ) )* this_END_8= RULE_END )? )
            // InternalCMSdslParser.g:715:3: ( (lv_dontShow_0_0= Hide ) )? otherlv_1= Field ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_type_4_0= ruleDataType ) ) (otherlv_5= EqualsSignGreaterThanSign this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleFieldProp ) )* this_END_8= RULE_END )?
            {
            // InternalCMSdslParser.g:715:3: ( (lv_dontShow_0_0= Hide ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Hide) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCMSdslParser.g:716:4: (lv_dontShow_0_0= Hide )
                    {
                    // InternalCMSdslParser.g:716:4: (lv_dontShow_0_0= Hide )
                    // InternalCMSdslParser.g:717:5: lv_dontShow_0_0= Hide
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
            		
            // InternalCMSdslParser.g:733:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCMSdslParser.g:734:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCMSdslParser.g:734:4: (lv_name_2_0= RULE_ID )
            // InternalCMSdslParser.g:735:5: lv_name_2_0= RULE_ID
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
            		
            // InternalCMSdslParser.g:755:3: ( (lv_type_4_0= ruleDataType ) )
            // InternalCMSdslParser.g:756:4: (lv_type_4_0= ruleDataType )
            {
            // InternalCMSdslParser.g:756:4: (lv_type_4_0= ruleDataType )
            // InternalCMSdslParser.g:757:5: lv_type_4_0= ruleDataType
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

            // InternalCMSdslParser.g:774:3: (otherlv_5= EqualsSignGreaterThanSign this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleFieldProp ) )* this_END_8= RULE_END )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==EqualsSignGreaterThanSign) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCMSdslParser.g:775:4: otherlv_5= EqualsSignGreaterThanSign this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleFieldProp ) )* this_END_8= RULE_END
                    {
                    otherlv_5=(Token)match(input,EqualsSignGreaterThanSign,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getEqualsSignGreaterThanSignKeyword_5_0());
                    			
                    this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

                    				newLeafNode(this_BEGIN_6, grammarAccess.getFieldAccess().getBEGINTerminalRuleCall_5_1());
                    			
                    // InternalCMSdslParser.g:783:4: ( (lv_properties_7_0= ruleFieldProp ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=DisplayAs && LA10_0<=InputType)||LA10_0==Nullable||LA10_0==Default||LA10_0==Unique||LA10_0==Test) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalCMSdslParser.g:784:5: (lv_properties_7_0= ruleFieldProp )
                    	    {
                    	    // InternalCMSdslParser.g:784:5: (lv_properties_7_0= ruleFieldProp )
                    	    // InternalCMSdslParser.g:785:6: lv_properties_7_0= ruleFieldProp
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
    // InternalCMSdslParser.g:811:1: entryRuleValidationCheck returns [EObject current=null] : iv_ruleValidationCheck= ruleValidationCheck EOF ;
    public final EObject entryRuleValidationCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidationCheck = null;


        try {
            // InternalCMSdslParser.g:811:56: (iv_ruleValidationCheck= ruleValidationCheck EOF )
            // InternalCMSdslParser.g:812:2: iv_ruleValidationCheck= ruleValidationCheck EOF
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
    // InternalCMSdslParser.g:818:1: ruleValidationCheck returns [EObject current=null] : (otherlv_0= Check ( ( (lv_locations_1_0= ruleValidationCheckLocation ) ) (otherlv_2= And ( (lv_locations_3_0= ruleValidationCheckLocation ) ) )? )? ( (lv_validator_4_0= ruleValidatorUse ) ) otherlv_5= EqualsSignGreaterThanSign ( (lv_errrorMsg_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleValidationCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token lv_errrorMsg_6_0=null;
        EObject lv_locations_1_0 = null;

        EObject lv_locations_3_0 = null;

        EObject lv_validator_4_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:824:2: ( (otherlv_0= Check ( ( (lv_locations_1_0= ruleValidationCheckLocation ) ) (otherlv_2= And ( (lv_locations_3_0= ruleValidationCheckLocation ) ) )? )? ( (lv_validator_4_0= ruleValidatorUse ) ) otherlv_5= EqualsSignGreaterThanSign ( (lv_errrorMsg_6_0= RULE_STRING ) ) ) )
            // InternalCMSdslParser.g:825:2: (otherlv_0= Check ( ( (lv_locations_1_0= ruleValidationCheckLocation ) ) (otherlv_2= And ( (lv_locations_3_0= ruleValidationCheckLocation ) ) )? )? ( (lv_validator_4_0= ruleValidatorUse ) ) otherlv_5= EqualsSignGreaterThanSign ( (lv_errrorMsg_6_0= RULE_STRING ) ) )
            {
            // InternalCMSdslParser.g:825:2: (otherlv_0= Check ( ( (lv_locations_1_0= ruleValidationCheckLocation ) ) (otherlv_2= And ( (lv_locations_3_0= ruleValidationCheckLocation ) ) )? )? ( (lv_validator_4_0= ruleValidatorUse ) ) otherlv_5= EqualsSignGreaterThanSign ( (lv_errrorMsg_6_0= RULE_STRING ) ) )
            // InternalCMSdslParser.g:826:3: otherlv_0= Check ( ( (lv_locations_1_0= ruleValidationCheckLocation ) ) (otherlv_2= And ( (lv_locations_3_0= ruleValidationCheckLocation ) ) )? )? ( (lv_validator_4_0= ruleValidatorUse ) ) otherlv_5= EqualsSignGreaterThanSign ( (lv_errrorMsg_6_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Check,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getValidationCheckAccess().getCheckKeyword_0());
            		
            // InternalCMSdslParser.g:830:3: ( ( (lv_locations_1_0= ruleValidationCheckLocation ) ) (otherlv_2= And ( (lv_locations_3_0= ruleValidationCheckLocation ) ) )? )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Client||LA13_0==Server) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCMSdslParser.g:831:4: ( (lv_locations_1_0= ruleValidationCheckLocation ) ) (otherlv_2= And ( (lv_locations_3_0= ruleValidationCheckLocation ) ) )?
                    {
                    // InternalCMSdslParser.g:831:4: ( (lv_locations_1_0= ruleValidationCheckLocation ) )
                    // InternalCMSdslParser.g:832:5: (lv_locations_1_0= ruleValidationCheckLocation )
                    {
                    // InternalCMSdslParser.g:832:5: (lv_locations_1_0= ruleValidationCheckLocation )
                    // InternalCMSdslParser.g:833:6: lv_locations_1_0= ruleValidationCheckLocation
                    {

                    						newCompositeNode(grammarAccess.getValidationCheckAccess().getLocationsValidationCheckLocationParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_locations_1_0=ruleValidationCheckLocation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValidationCheckRule());
                    						}
                    						add(
                    							current,
                    							"locations",
                    							lv_locations_1_0,
                    							"jope015.mdsd2021.reexam.CMSdsl.ValidationCheckLocation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCMSdslParser.g:850:4: (otherlv_2= And ( (lv_locations_3_0= ruleValidationCheckLocation ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==And) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalCMSdslParser.g:851:5: otherlv_2= And ( (lv_locations_3_0= ruleValidationCheckLocation ) )
                            {
                            otherlv_2=(Token)match(input,And,FOLLOW_20); 

                            					newLeafNode(otherlv_2, grammarAccess.getValidationCheckAccess().getAndKeyword_1_1_0());
                            				
                            // InternalCMSdslParser.g:855:5: ( (lv_locations_3_0= ruleValidationCheckLocation ) )
                            // InternalCMSdslParser.g:856:6: (lv_locations_3_0= ruleValidationCheckLocation )
                            {
                            // InternalCMSdslParser.g:856:6: (lv_locations_3_0= ruleValidationCheckLocation )
                            // InternalCMSdslParser.g:857:7: lv_locations_3_0= ruleValidationCheckLocation
                            {

                            							newCompositeNode(grammarAccess.getValidationCheckAccess().getLocationsValidationCheckLocationParserRuleCall_1_1_1_0());
                            						
                            pushFollow(FOLLOW_18);
                            lv_locations_3_0=ruleValidationCheckLocation();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getValidationCheckRule());
                            							}
                            							add(
                            								current,
                            								"locations",
                            								lv_locations_3_0,
                            								"jope015.mdsd2021.reexam.CMSdsl.ValidationCheckLocation");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalCMSdslParser.g:876:3: ( (lv_validator_4_0= ruleValidatorUse ) )
            // InternalCMSdslParser.g:877:4: (lv_validator_4_0= ruleValidatorUse )
            {
            // InternalCMSdslParser.g:877:4: (lv_validator_4_0= ruleValidatorUse )
            // InternalCMSdslParser.g:878:5: lv_validator_4_0= ruleValidatorUse
            {

            					newCompositeNode(grammarAccess.getValidationCheckAccess().getValidatorValidatorUseParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_validator_4_0=ruleValidatorUse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValidationCheckRule());
            					}
            					set(
            						current,
            						"validator",
            						lv_validator_4_0,
            						"jope015.mdsd2021.reexam.CMSdsl.ValidatorUse");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,EqualsSignGreaterThanSign,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getValidationCheckAccess().getEqualsSignGreaterThanSignKeyword_3());
            		
            // InternalCMSdslParser.g:899:3: ( (lv_errrorMsg_6_0= RULE_STRING ) )
            // InternalCMSdslParser.g:900:4: (lv_errrorMsg_6_0= RULE_STRING )
            {
            // InternalCMSdslParser.g:900:4: (lv_errrorMsg_6_0= RULE_STRING )
            // InternalCMSdslParser.g:901:5: lv_errrorMsg_6_0= RULE_STRING
            {
            lv_errrorMsg_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_errrorMsg_6_0, grammarAccess.getValidationCheckAccess().getErrrorMsgSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValidationCheckRule());
            					}
            					setWithLastConsumed(
            						current,
            						"errrorMsg",
            						lv_errrorMsg_6_0,
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


    // $ANTLR start "entryRuleValidationCheckLocation"
    // InternalCMSdslParser.g:921:1: entryRuleValidationCheckLocation returns [EObject current=null] : iv_ruleValidationCheckLocation= ruleValidationCheckLocation EOF ;
    public final EObject entryRuleValidationCheckLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidationCheckLocation = null;


        try {
            // InternalCMSdslParser.g:921:64: (iv_ruleValidationCheckLocation= ruleValidationCheckLocation EOF )
            // InternalCMSdslParser.g:922:2: iv_ruleValidationCheckLocation= ruleValidationCheckLocation EOF
            {
             newCompositeNode(grammarAccess.getValidationCheckLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidationCheckLocation=ruleValidationCheckLocation();

            state._fsp--;

             current =iv_ruleValidationCheckLocation; 
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
    // $ANTLR end "entryRuleValidationCheckLocation"


    // $ANTLR start "ruleValidationCheckLocation"
    // InternalCMSdslParser.g:928:1: ruleValidationCheckLocation returns [EObject current=null] : ( ( (lv_location_0_0= Client ) ) | ( (lv_location_1_0= Server ) ) ) ;
    public final EObject ruleValidationCheckLocation() throws RecognitionException {
        EObject current = null;

        Token lv_location_0_0=null;
        Token lv_location_1_0=null;


        	enterRule();

        try {
            // InternalCMSdslParser.g:934:2: ( ( ( (lv_location_0_0= Client ) ) | ( (lv_location_1_0= Server ) ) ) )
            // InternalCMSdslParser.g:935:2: ( ( (lv_location_0_0= Client ) ) | ( (lv_location_1_0= Server ) ) )
            {
            // InternalCMSdslParser.g:935:2: ( ( (lv_location_0_0= Client ) ) | ( (lv_location_1_0= Server ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Client) ) {
                alt14=1;
            }
            else if ( (LA14_0==Server) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalCMSdslParser.g:936:3: ( (lv_location_0_0= Client ) )
                    {
                    // InternalCMSdslParser.g:936:3: ( (lv_location_0_0= Client ) )
                    // InternalCMSdslParser.g:937:4: (lv_location_0_0= Client )
                    {
                    // InternalCMSdslParser.g:937:4: (lv_location_0_0= Client )
                    // InternalCMSdslParser.g:938:5: lv_location_0_0= Client
                    {
                    lv_location_0_0=(Token)match(input,Client,FOLLOW_2); 

                    					newLeafNode(lv_location_0_0, grammarAccess.getValidationCheckLocationAccess().getLocationClientKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValidationCheckLocationRule());
                    					}
                    					setWithLastConsumed(current, "location", lv_location_0_0, "client");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCMSdslParser.g:951:3: ( (lv_location_1_0= Server ) )
                    {
                    // InternalCMSdslParser.g:951:3: ( (lv_location_1_0= Server ) )
                    // InternalCMSdslParser.g:952:4: (lv_location_1_0= Server )
                    {
                    // InternalCMSdslParser.g:952:4: (lv_location_1_0= Server )
                    // InternalCMSdslParser.g:953:5: lv_location_1_0= Server
                    {
                    lv_location_1_0=(Token)match(input,Server,FOLLOW_2); 

                    					newLeafNode(lv_location_1_0, grammarAccess.getValidationCheckLocationAccess().getLocationServerKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValidationCheckLocationRule());
                    					}
                    					setWithLastConsumed(current, "location", lv_location_1_0, "server");
                    				

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
    // $ANTLR end "ruleValidationCheckLocation"


    // $ANTLR start "entryRuleValidatorUse"
    // InternalCMSdslParser.g:969:1: entryRuleValidatorUse returns [EObject current=null] : iv_ruleValidatorUse= ruleValidatorUse EOF ;
    public final EObject entryRuleValidatorUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidatorUse = null;


        try {
            // InternalCMSdslParser.g:969:53: (iv_ruleValidatorUse= ruleValidatorUse EOF )
            // InternalCMSdslParser.g:970:2: iv_ruleValidatorUse= ruleValidatorUse EOF
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
    // InternalCMSdslParser.g:976:1: ruleValidatorUse returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis ) ;
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
            // InternalCMSdslParser.g:982:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis ) )
            // InternalCMSdslParser.g:983:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )
            {
            // InternalCMSdslParser.g:983:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )
            // InternalCMSdslParser.g:984:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis
            {
            // InternalCMSdslParser.g:984:3: ()
            // InternalCMSdslParser.g:985:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValidatorUseAccess().getValidatorUseAction_0(),
            					current);
            			

            }

            // InternalCMSdslParser.g:991:3: ( (otherlv_1= RULE_ID ) )
            // InternalCMSdslParser.g:992:4: (otherlv_1= RULE_ID )
            {
            // InternalCMSdslParser.g:992:4: (otherlv_1= RULE_ID )
            // InternalCMSdslParser.g:993:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValidatorUseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_1, grammarAccess.getValidatorUseAccess().getValidatorValidatorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getValidatorUseAccess().getLeftParenthesisKeyword_2());
            		
            // InternalCMSdslParser.g:1008:3: ( (otherlv_3= RULE_ID ) )
            // InternalCMSdslParser.g:1009:4: (otherlv_3= RULE_ID )
            {
            // InternalCMSdslParser.g:1009:4: (otherlv_3= RULE_ID )
            // InternalCMSdslParser.g:1010:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValidatorUseRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_3, grammarAccess.getValidatorUseAccess().getArgsFieldCrossReference_3_0());
            				

            }


            }

            // InternalCMSdslParser.g:1021:3: (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Comma) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCMSdslParser.g:1022:4: otherlv_4= Comma ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getValidatorUseAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCMSdslParser.g:1026:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalCMSdslParser.g:1027:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalCMSdslParser.g:1027:5: (otherlv_5= RULE_ID )
            	    // InternalCMSdslParser.g:1028:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getValidatorUseRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_23); 

            	    						newLeafNode(otherlv_5, grammarAccess.getValidatorUseAccess().getArgsFieldCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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


    // $ANTLR start "entryRuleFieldProp"
    // InternalCMSdslParser.g:1048:1: entryRuleFieldProp returns [EObject current=null] : iv_ruleFieldProp= ruleFieldProp EOF ;
    public final EObject entryRuleFieldProp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldProp = null;


        try {
            // InternalCMSdslParser.g:1048:50: (iv_ruleFieldProp= ruleFieldProp EOF )
            // InternalCMSdslParser.g:1049:2: iv_ruleFieldProp= ruleFieldProp EOF
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
    // InternalCMSdslParser.g:1055:1: ruleFieldProp returns [EObject current=null] : ( ( () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= ruleAtomic ) ) ) | ( () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_type_9_0= InputType ) ) otherlv_10= Colon ( (lv_value_11_0= ruleInputType ) ) ) | ( () ( (lv_type_13_0= DisplayAs ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) ) ) | ( () ( (lv_type_17_0= Nullable ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_type_21_0= Unique ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_BOOLEAN ) ) ) ) ;
    public final EObject ruleFieldProp() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;
        Token lv_type_9_0=null;
        Token otherlv_10=null;
        Token lv_type_13_0=null;
        Token otherlv_14=null;
        Token lv_value_15_0=null;
        Token lv_type_17_0=null;
        Token otherlv_18=null;
        Token lv_value_19_0=null;
        Token lv_type_21_0=null;
        Token otherlv_22=null;
        Token lv_value_23_0=null;
        EObject lv_value_3_0 = null;

        EObject lv_value_11_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:1061:2: ( ( ( () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= ruleAtomic ) ) ) | ( () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_type_9_0= InputType ) ) otherlv_10= Colon ( (lv_value_11_0= ruleInputType ) ) ) | ( () ( (lv_type_13_0= DisplayAs ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) ) ) | ( () ( (lv_type_17_0= Nullable ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_type_21_0= Unique ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_BOOLEAN ) ) ) ) )
            // InternalCMSdslParser.g:1062:2: ( ( () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= ruleAtomic ) ) ) | ( () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_type_9_0= InputType ) ) otherlv_10= Colon ( (lv_value_11_0= ruleInputType ) ) ) | ( () ( (lv_type_13_0= DisplayAs ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) ) ) | ( () ( (lv_type_17_0= Nullable ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_type_21_0= Unique ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_BOOLEAN ) ) ) )
            {
            // InternalCMSdslParser.g:1062:2: ( ( () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= ruleAtomic ) ) ) | ( () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_type_9_0= InputType ) ) otherlv_10= Colon ( (lv_value_11_0= ruleInputType ) ) ) | ( () ( (lv_type_13_0= DisplayAs ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) ) ) | ( () ( (lv_type_17_0= Nullable ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_type_21_0= Unique ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_BOOLEAN ) ) ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case Default:
                {
                alt16=1;
                }
                break;
            case Test:
                {
                alt16=2;
                }
                break;
            case InputType:
                {
                alt16=3;
                }
                break;
            case DisplayAs:
                {
                alt16=4;
                }
                break;
            case Nullable:
                {
                alt16=5;
                }
                break;
            case Unique:
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
                    // InternalCMSdslParser.g:1063:3: ( () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= ruleAtomic ) ) )
                    {
                    // InternalCMSdslParser.g:1063:3: ( () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= ruleAtomic ) ) )
                    // InternalCMSdslParser.g:1064:4: () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= ruleAtomic ) )
                    {
                    // InternalCMSdslParser.g:1064:4: ()
                    // InternalCMSdslParser.g:1065:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFieldPropAccess().getDefAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1071:4: ( (lv_type_1_0= Default ) )
                    // InternalCMSdslParser.g:1072:5: (lv_type_1_0= Default )
                    {
                    // InternalCMSdslParser.g:1072:5: (lv_type_1_0= Default )
                    // InternalCMSdslParser.g:1073:6: lv_type_1_0= Default
                    {
                    lv_type_1_0=(Token)match(input,Default,FOLLOW_4); 

                    						newLeafNode(lv_type_1_0, grammarAccess.getFieldPropAccess().getTypeDefaultKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldPropRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_1_0, "default");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,Colon,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getFieldPropAccess().getColonKeyword_0_2());
                    			
                    // InternalCMSdslParser.g:1089:4: ( (lv_value_3_0= ruleAtomic ) )
                    // InternalCMSdslParser.g:1090:5: (lv_value_3_0= ruleAtomic )
                    {
                    // InternalCMSdslParser.g:1090:5: (lv_value_3_0= ruleAtomic )
                    // InternalCMSdslParser.g:1091:6: lv_value_3_0= ruleAtomic
                    {

                    						newCompositeNode(grammarAccess.getFieldPropAccess().getValueAtomicParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleAtomic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldPropRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"jope015.mdsd2021.reexam.CMSdsl.Atomic");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCMSdslParser.g:1110:3: ( () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:1110:3: ( () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:1111:4: () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:1111:4: ()
                    // InternalCMSdslParser.g:1112:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFieldPropAccess().getPropTestAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1118:4: ( (lv_type_5_0= Test ) )
                    // InternalCMSdslParser.g:1119:5: (lv_type_5_0= Test )
                    {
                    // InternalCMSdslParser.g:1119:5: (lv_type_5_0= Test )
                    // InternalCMSdslParser.g:1120:6: lv_type_5_0= Test
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
                    			
                    // InternalCMSdslParser.g:1136:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:1137:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:1137:5: (lv_value_7_0= RULE_STRING )
                    // InternalCMSdslParser.g:1138:6: lv_value_7_0= RULE_STRING
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
                    // InternalCMSdslParser.g:1156:3: ( () ( (lv_type_9_0= InputType ) ) otherlv_10= Colon ( (lv_value_11_0= ruleInputType ) ) )
                    {
                    // InternalCMSdslParser.g:1156:3: ( () ( (lv_type_9_0= InputType ) ) otherlv_10= Colon ( (lv_value_11_0= ruleInputType ) ) )
                    // InternalCMSdslParser.g:1157:4: () ( (lv_type_9_0= InputType ) ) otherlv_10= Colon ( (lv_value_11_0= ruleInputType ) )
                    {
                    // InternalCMSdslParser.g:1157:4: ()
                    // InternalCMSdslParser.g:1158:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFieldPropAccess().getInputFieldAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1164:4: ( (lv_type_9_0= InputType ) )
                    // InternalCMSdslParser.g:1165:5: (lv_type_9_0= InputType )
                    {
                    // InternalCMSdslParser.g:1165:5: (lv_type_9_0= InputType )
                    // InternalCMSdslParser.g:1166:6: lv_type_9_0= InputType
                    {
                    lv_type_9_0=(Token)match(input,InputType,FOLLOW_4); 

                    						newLeafNode(lv_type_9_0, grammarAccess.getFieldPropAccess().getTypeInputTypeKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldPropRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_9_0, "inputType");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,Colon,FOLLOW_25); 

                    				newLeafNode(otherlv_10, grammarAccess.getFieldPropAccess().getColonKeyword_2_2());
                    			
                    // InternalCMSdslParser.g:1182:4: ( (lv_value_11_0= ruleInputType ) )
                    // InternalCMSdslParser.g:1183:5: (lv_value_11_0= ruleInputType )
                    {
                    // InternalCMSdslParser.g:1183:5: (lv_value_11_0= ruleInputType )
                    // InternalCMSdslParser.g:1184:6: lv_value_11_0= ruleInputType
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
                case 4 :
                    // InternalCMSdslParser.g:1203:3: ( () ( (lv_type_13_0= DisplayAs ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:1203:3: ( () ( (lv_type_13_0= DisplayAs ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:1204:4: () ( (lv_type_13_0= DisplayAs ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:1204:4: ()
                    // InternalCMSdslParser.g:1205:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFieldPropAccess().getDisplayAsAction_3_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1211:4: ( (lv_type_13_0= DisplayAs ) )
                    // InternalCMSdslParser.g:1212:5: (lv_type_13_0= DisplayAs )
                    {
                    // InternalCMSdslParser.g:1212:5: (lv_type_13_0= DisplayAs )
                    // InternalCMSdslParser.g:1213:6: lv_type_13_0= DisplayAs
                    {
                    lv_type_13_0=(Token)match(input,DisplayAs,FOLLOW_4); 

                    						newLeafNode(lv_type_13_0, grammarAccess.getFieldPropAccess().getTypeDisplayAsKeyword_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldPropRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_13_0, "displayAs");
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,Colon,FOLLOW_8); 

                    				newLeafNode(otherlv_14, grammarAccess.getFieldPropAccess().getColonKeyword_3_2());
                    			
                    // InternalCMSdslParser.g:1229:4: ( (lv_value_15_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:1230:5: (lv_value_15_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:1230:5: (lv_value_15_0= RULE_STRING )
                    // InternalCMSdslParser.g:1231:6: lv_value_15_0= RULE_STRING
                    {
                    lv_value_15_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_15_0, grammarAccess.getFieldPropAccess().getValueSTRINGTerminalRuleCall_3_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldPropRule());
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
                    // InternalCMSdslParser.g:1249:3: ( () ( (lv_type_17_0= Nullable ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalCMSdslParser.g:1249:3: ( () ( (lv_type_17_0= Nullable ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_BOOLEAN ) ) )
                    // InternalCMSdslParser.g:1250:4: () ( (lv_type_17_0= Nullable ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_BOOLEAN ) )
                    {
                    // InternalCMSdslParser.g:1250:4: ()
                    // InternalCMSdslParser.g:1251:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFieldPropAccess().getNullableAction_4_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1257:4: ( (lv_type_17_0= Nullable ) )
                    // InternalCMSdslParser.g:1258:5: (lv_type_17_0= Nullable )
                    {
                    // InternalCMSdslParser.g:1258:5: (lv_type_17_0= Nullable )
                    // InternalCMSdslParser.g:1259:6: lv_type_17_0= Nullable
                    {
                    lv_type_17_0=(Token)match(input,Nullable,FOLLOW_4); 

                    						newLeafNode(lv_type_17_0, grammarAccess.getFieldPropAccess().getTypeNullableKeyword_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldPropRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_17_0, "nullable");
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,Colon,FOLLOW_26); 

                    				newLeafNode(otherlv_18, grammarAccess.getFieldPropAccess().getColonKeyword_4_2());
                    			
                    // InternalCMSdslParser.g:1275:4: ( (lv_value_19_0= RULE_BOOLEAN ) )
                    // InternalCMSdslParser.g:1276:5: (lv_value_19_0= RULE_BOOLEAN )
                    {
                    // InternalCMSdslParser.g:1276:5: (lv_value_19_0= RULE_BOOLEAN )
                    // InternalCMSdslParser.g:1277:6: lv_value_19_0= RULE_BOOLEAN
                    {
                    lv_value_19_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    						newLeafNode(lv_value_19_0, grammarAccess.getFieldPropAccess().getValueBOOLEANTerminalRuleCall_4_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldPropRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_19_0,
                    							"jope015.mdsd2021.reexam.CMSdsl.BOOLEAN");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalCMSdslParser.g:1295:3: ( () ( (lv_type_21_0= Unique ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalCMSdslParser.g:1295:3: ( () ( (lv_type_21_0= Unique ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_BOOLEAN ) ) )
                    // InternalCMSdslParser.g:1296:4: () ( (lv_type_21_0= Unique ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_BOOLEAN ) )
                    {
                    // InternalCMSdslParser.g:1296:4: ()
                    // InternalCMSdslParser.g:1297:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFieldPropAccess().getUniqueAction_5_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1303:4: ( (lv_type_21_0= Unique ) )
                    // InternalCMSdslParser.g:1304:5: (lv_type_21_0= Unique )
                    {
                    // InternalCMSdslParser.g:1304:5: (lv_type_21_0= Unique )
                    // InternalCMSdslParser.g:1305:6: lv_type_21_0= Unique
                    {
                    lv_type_21_0=(Token)match(input,Unique,FOLLOW_4); 

                    						newLeafNode(lv_type_21_0, grammarAccess.getFieldPropAccess().getTypeUniqueKeyword_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldPropRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_21_0, "unique");
                    					

                    }


                    }

                    otherlv_22=(Token)match(input,Colon,FOLLOW_26); 

                    				newLeafNode(otherlv_22, grammarAccess.getFieldPropAccess().getColonKeyword_5_2());
                    			
                    // InternalCMSdslParser.g:1321:4: ( (lv_value_23_0= RULE_BOOLEAN ) )
                    // InternalCMSdslParser.g:1322:5: (lv_value_23_0= RULE_BOOLEAN )
                    {
                    // InternalCMSdslParser.g:1322:5: (lv_value_23_0= RULE_BOOLEAN )
                    // InternalCMSdslParser.g:1323:6: lv_value_23_0= RULE_BOOLEAN
                    {
                    lv_value_23_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    						newLeafNode(lv_value_23_0, grammarAccess.getFieldPropAccess().getValueBOOLEANTerminalRuleCall_5_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldPropRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_23_0,
                    							"jope015.mdsd2021.reexam.CMSdsl.BOOLEAN");
                    					

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
    // InternalCMSdslParser.g:1344:1: entryRuleInputType returns [EObject current=null] : iv_ruleInputType= ruleInputType EOF ;
    public final EObject entryRuleInputType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputType = null;


        try {
            // InternalCMSdslParser.g:1344:50: (iv_ruleInputType= ruleInputType EOF )
            // InternalCMSdslParser.g:1345:2: iv_ruleInputType= ruleInputType EOF
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
    // InternalCMSdslParser.g:1351:1: ruleInputType returns [EObject current=null] : ( ( () ( (lv_type_1_0= Email ) ) ) | ( () ( (lv_type_3_0= Date ) ) ) | ( () ( (lv_type_5_0= Number ) ) ) | ( () ( (lv_type_7_0= Password ) ) ) | ( () ( (lv_type_9_0= Text ) ) ) | ( () ( (lv_type_11_0= Textarea ) ) ) ) ;
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
            // InternalCMSdslParser.g:1357:2: ( ( ( () ( (lv_type_1_0= Email ) ) ) | ( () ( (lv_type_3_0= Date ) ) ) | ( () ( (lv_type_5_0= Number ) ) ) | ( () ( (lv_type_7_0= Password ) ) ) | ( () ( (lv_type_9_0= Text ) ) ) | ( () ( (lv_type_11_0= Textarea ) ) ) ) )
            // InternalCMSdslParser.g:1358:2: ( ( () ( (lv_type_1_0= Email ) ) ) | ( () ( (lv_type_3_0= Date ) ) ) | ( () ( (lv_type_5_0= Number ) ) ) | ( () ( (lv_type_7_0= Password ) ) ) | ( () ( (lv_type_9_0= Text ) ) ) | ( () ( (lv_type_11_0= Textarea ) ) ) )
            {
            // InternalCMSdslParser.g:1358:2: ( ( () ( (lv_type_1_0= Email ) ) ) | ( () ( (lv_type_3_0= Date ) ) ) | ( () ( (lv_type_5_0= Number ) ) ) | ( () ( (lv_type_7_0= Password ) ) ) | ( () ( (lv_type_9_0= Text ) ) ) | ( () ( (lv_type_11_0= Textarea ) ) ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case Email:
                {
                alt17=1;
                }
                break;
            case Date:
                {
                alt17=2;
                }
                break;
            case Number:
                {
                alt17=3;
                }
                break;
            case Password:
                {
                alt17=4;
                }
                break;
            case Text:
                {
                alt17=5;
                }
                break;
            case Textarea:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalCMSdslParser.g:1359:3: ( () ( (lv_type_1_0= Email ) ) )
                    {
                    // InternalCMSdslParser.g:1359:3: ( () ( (lv_type_1_0= Email ) ) )
                    // InternalCMSdslParser.g:1360:4: () ( (lv_type_1_0= Email ) )
                    {
                    // InternalCMSdslParser.g:1360:4: ()
                    // InternalCMSdslParser.g:1361:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getInputTypeAccess().getInpMailAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1367:4: ( (lv_type_1_0= Email ) )
                    // InternalCMSdslParser.g:1368:5: (lv_type_1_0= Email )
                    {
                    // InternalCMSdslParser.g:1368:5: (lv_type_1_0= Email )
                    // InternalCMSdslParser.g:1369:6: lv_type_1_0= Email
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
                    // InternalCMSdslParser.g:1383:3: ( () ( (lv_type_3_0= Date ) ) )
                    {
                    // InternalCMSdslParser.g:1383:3: ( () ( (lv_type_3_0= Date ) ) )
                    // InternalCMSdslParser.g:1384:4: () ( (lv_type_3_0= Date ) )
                    {
                    // InternalCMSdslParser.g:1384:4: ()
                    // InternalCMSdslParser.g:1385:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getInputTypeAccess().getInpDateAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1391:4: ( (lv_type_3_0= Date ) )
                    // InternalCMSdslParser.g:1392:5: (lv_type_3_0= Date )
                    {
                    // InternalCMSdslParser.g:1392:5: (lv_type_3_0= Date )
                    // InternalCMSdslParser.g:1393:6: lv_type_3_0= Date
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
                    // InternalCMSdslParser.g:1407:3: ( () ( (lv_type_5_0= Number ) ) )
                    {
                    // InternalCMSdslParser.g:1407:3: ( () ( (lv_type_5_0= Number ) ) )
                    // InternalCMSdslParser.g:1408:4: () ( (lv_type_5_0= Number ) )
                    {
                    // InternalCMSdslParser.g:1408:4: ()
                    // InternalCMSdslParser.g:1409:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getInputTypeAccess().getInpNumAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1415:4: ( (lv_type_5_0= Number ) )
                    // InternalCMSdslParser.g:1416:5: (lv_type_5_0= Number )
                    {
                    // InternalCMSdslParser.g:1416:5: (lv_type_5_0= Number )
                    // InternalCMSdslParser.g:1417:6: lv_type_5_0= Number
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
                    // InternalCMSdslParser.g:1431:3: ( () ( (lv_type_7_0= Password ) ) )
                    {
                    // InternalCMSdslParser.g:1431:3: ( () ( (lv_type_7_0= Password ) ) )
                    // InternalCMSdslParser.g:1432:4: () ( (lv_type_7_0= Password ) )
                    {
                    // InternalCMSdslParser.g:1432:4: ()
                    // InternalCMSdslParser.g:1433:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getInputTypeAccess().getInpPassAction_3_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1439:4: ( (lv_type_7_0= Password ) )
                    // InternalCMSdslParser.g:1440:5: (lv_type_7_0= Password )
                    {
                    // InternalCMSdslParser.g:1440:5: (lv_type_7_0= Password )
                    // InternalCMSdslParser.g:1441:6: lv_type_7_0= Password
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
                    // InternalCMSdslParser.g:1455:3: ( () ( (lv_type_9_0= Text ) ) )
                    {
                    // InternalCMSdslParser.g:1455:3: ( () ( (lv_type_9_0= Text ) ) )
                    // InternalCMSdslParser.g:1456:4: () ( (lv_type_9_0= Text ) )
                    {
                    // InternalCMSdslParser.g:1456:4: ()
                    // InternalCMSdslParser.g:1457:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getInputTypeAccess().getInpTextAction_4_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1463:4: ( (lv_type_9_0= Text ) )
                    // InternalCMSdslParser.g:1464:5: (lv_type_9_0= Text )
                    {
                    // InternalCMSdslParser.g:1464:5: (lv_type_9_0= Text )
                    // InternalCMSdslParser.g:1465:6: lv_type_9_0= Text
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
                    // InternalCMSdslParser.g:1479:3: ( () ( (lv_type_11_0= Textarea ) ) )
                    {
                    // InternalCMSdslParser.g:1479:3: ( () ( (lv_type_11_0= Textarea ) ) )
                    // InternalCMSdslParser.g:1480:4: () ( (lv_type_11_0= Textarea ) )
                    {
                    // InternalCMSdslParser.g:1480:4: ()
                    // InternalCMSdslParser.g:1481:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getInputTypeAccess().getInpTextAreaAction_5_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1487:4: ( (lv_type_11_0= Textarea ) )
                    // InternalCMSdslParser.g:1488:5: (lv_type_11_0= Textarea )
                    {
                    // InternalCMSdslParser.g:1488:5: (lv_type_11_0= Textarea )
                    // InternalCMSdslParser.g:1489:6: lv_type_11_0= Textarea
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
    // InternalCMSdslParser.g:1506:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalCMSdslParser.g:1506:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalCMSdslParser.g:1507:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalCMSdslParser.g:1513:1: ruleDataType returns [EObject current=null] : ( ( () ( (lv_type_1_0= String ) ) ) | ( () ( (lv_type_3_0= Date ) ) ) | ( () ( (lv_type_5_0= Int ) ) ) | ( () ( (lv_type_7_0= Long ) ) ) | ( () ( (lv_type_9_0= Bool ) ) ) | ( () ( (lv_type_11_0= Float ) ) ) ) ;
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
            // InternalCMSdslParser.g:1519:2: ( ( ( () ( (lv_type_1_0= String ) ) ) | ( () ( (lv_type_3_0= Date ) ) ) | ( () ( (lv_type_5_0= Int ) ) ) | ( () ( (lv_type_7_0= Long ) ) ) | ( () ( (lv_type_9_0= Bool ) ) ) | ( () ( (lv_type_11_0= Float ) ) ) ) )
            // InternalCMSdslParser.g:1520:2: ( ( () ( (lv_type_1_0= String ) ) ) | ( () ( (lv_type_3_0= Date ) ) ) | ( () ( (lv_type_5_0= Int ) ) ) | ( () ( (lv_type_7_0= Long ) ) ) | ( () ( (lv_type_9_0= Bool ) ) ) | ( () ( (lv_type_11_0= Float ) ) ) )
            {
            // InternalCMSdslParser.g:1520:2: ( ( () ( (lv_type_1_0= String ) ) ) | ( () ( (lv_type_3_0= Date ) ) ) | ( () ( (lv_type_5_0= Int ) ) ) | ( () ( (lv_type_7_0= Long ) ) ) | ( () ( (lv_type_9_0= Bool ) ) ) | ( () ( (lv_type_11_0= Float ) ) ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case String:
                {
                alt18=1;
                }
                break;
            case Date:
                {
                alt18=2;
                }
                break;
            case Int:
                {
                alt18=3;
                }
                break;
            case Long:
                {
                alt18=4;
                }
                break;
            case Bool:
                {
                alt18=5;
                }
                break;
            case Float:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalCMSdslParser.g:1521:3: ( () ( (lv_type_1_0= String ) ) )
                    {
                    // InternalCMSdslParser.g:1521:3: ( () ( (lv_type_1_0= String ) ) )
                    // InternalCMSdslParser.g:1522:4: () ( (lv_type_1_0= String ) )
                    {
                    // InternalCMSdslParser.g:1522:4: ()
                    // InternalCMSdslParser.g:1523:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getStrAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1529:4: ( (lv_type_1_0= String ) )
                    // InternalCMSdslParser.g:1530:5: (lv_type_1_0= String )
                    {
                    // InternalCMSdslParser.g:1530:5: (lv_type_1_0= String )
                    // InternalCMSdslParser.g:1531:6: lv_type_1_0= String
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
                    // InternalCMSdslParser.g:1545:3: ( () ( (lv_type_3_0= Date ) ) )
                    {
                    // InternalCMSdslParser.g:1545:3: ( () ( (lv_type_3_0= Date ) ) )
                    // InternalCMSdslParser.g:1546:4: () ( (lv_type_3_0= Date ) )
                    {
                    // InternalCMSdslParser.g:1546:4: ()
                    // InternalCMSdslParser.g:1547:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getDtAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1553:4: ( (lv_type_3_0= Date ) )
                    // InternalCMSdslParser.g:1554:5: (lv_type_3_0= Date )
                    {
                    // InternalCMSdslParser.g:1554:5: (lv_type_3_0= Date )
                    // InternalCMSdslParser.g:1555:6: lv_type_3_0= Date
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
                    // InternalCMSdslParser.g:1569:3: ( () ( (lv_type_5_0= Int ) ) )
                    {
                    // InternalCMSdslParser.g:1569:3: ( () ( (lv_type_5_0= Int ) ) )
                    // InternalCMSdslParser.g:1570:4: () ( (lv_type_5_0= Int ) )
                    {
                    // InternalCMSdslParser.g:1570:4: ()
                    // InternalCMSdslParser.g:1571:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getIntegAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1577:4: ( (lv_type_5_0= Int ) )
                    // InternalCMSdslParser.g:1578:5: (lv_type_5_0= Int )
                    {
                    // InternalCMSdslParser.g:1578:5: (lv_type_5_0= Int )
                    // InternalCMSdslParser.g:1579:6: lv_type_5_0= Int
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
                    // InternalCMSdslParser.g:1593:3: ( () ( (lv_type_7_0= Long ) ) )
                    {
                    // InternalCMSdslParser.g:1593:3: ( () ( (lv_type_7_0= Long ) ) )
                    // InternalCMSdslParser.g:1594:4: () ( (lv_type_7_0= Long ) )
                    {
                    // InternalCMSdslParser.g:1594:4: ()
                    // InternalCMSdslParser.g:1595:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getLngAction_3_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1601:4: ( (lv_type_7_0= Long ) )
                    // InternalCMSdslParser.g:1602:5: (lv_type_7_0= Long )
                    {
                    // InternalCMSdslParser.g:1602:5: (lv_type_7_0= Long )
                    // InternalCMSdslParser.g:1603:6: lv_type_7_0= Long
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
                    // InternalCMSdslParser.g:1617:3: ( () ( (lv_type_9_0= Bool ) ) )
                    {
                    // InternalCMSdslParser.g:1617:3: ( () ( (lv_type_9_0= Bool ) ) )
                    // InternalCMSdslParser.g:1618:4: () ( (lv_type_9_0= Bool ) )
                    {
                    // InternalCMSdslParser.g:1618:4: ()
                    // InternalCMSdslParser.g:1619:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getBoolAction_4_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1625:4: ( (lv_type_9_0= Bool ) )
                    // InternalCMSdslParser.g:1626:5: (lv_type_9_0= Bool )
                    {
                    // InternalCMSdslParser.g:1626:5: (lv_type_9_0= Bool )
                    // InternalCMSdslParser.g:1627:6: lv_type_9_0= Bool
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
                    // InternalCMSdslParser.g:1641:3: ( () ( (lv_type_11_0= Float ) ) )
                    {
                    // InternalCMSdslParser.g:1641:3: ( () ( (lv_type_11_0= Float ) ) )
                    // InternalCMSdslParser.g:1642:4: () ( (lv_type_11_0= Float ) )
                    {
                    // InternalCMSdslParser.g:1642:4: ()
                    // InternalCMSdslParser.g:1643:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getFltAction_5_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1649:4: ( (lv_type_11_0= Float ) )
                    // InternalCMSdslParser.g:1650:5: (lv_type_11_0= Float )
                    {
                    // InternalCMSdslParser.g:1650:5: (lv_type_11_0= Float )
                    // InternalCMSdslParser.g:1651:6: lv_type_11_0= Float
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
    // InternalCMSdslParser.g:1668:1: entryRuleValidator returns [EObject current=null] : iv_ruleValidator= ruleValidator EOF ;
    public final EObject entryRuleValidator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidator = null;


        try {
            // InternalCMSdslParser.g:1668:50: (iv_ruleValidator= ruleValidator EOF )
            // InternalCMSdslParser.g:1669:2: iv_ruleValidator= ruleValidator EOF
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
    // InternalCMSdslParser.g:1675:1: ruleValidator returns [EObject current=null] : (otherlv_0= Validator ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= RightParenthesis otherlv_7= EqualsSignGreaterThanSign this_BEGIN_8= RULE_BEGIN ( (lv_comparison_9_0= ruleExpression ) ) this_END_10= RULE_END ) ;
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
            // InternalCMSdslParser.g:1681:2: ( (otherlv_0= Validator ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= RightParenthesis otherlv_7= EqualsSignGreaterThanSign this_BEGIN_8= RULE_BEGIN ( (lv_comparison_9_0= ruleExpression ) ) this_END_10= RULE_END ) )
            // InternalCMSdslParser.g:1682:2: (otherlv_0= Validator ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= RightParenthesis otherlv_7= EqualsSignGreaterThanSign this_BEGIN_8= RULE_BEGIN ( (lv_comparison_9_0= ruleExpression ) ) this_END_10= RULE_END )
            {
            // InternalCMSdslParser.g:1682:2: (otherlv_0= Validator ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= RightParenthesis otherlv_7= EqualsSignGreaterThanSign this_BEGIN_8= RULE_BEGIN ( (lv_comparison_9_0= ruleExpression ) ) this_END_10= RULE_END )
            // InternalCMSdslParser.g:1683:3: otherlv_0= Validator ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleParameter ) ) )* otherlv_6= RightParenthesis otherlv_7= EqualsSignGreaterThanSign this_BEGIN_8= RULE_BEGIN ( (lv_comparison_9_0= ruleExpression ) ) this_END_10= RULE_END
            {
            otherlv_0=(Token)match(input,Validator,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getValidatorAccess().getValidatorKeyword_0());
            		
            // InternalCMSdslParser.g:1687:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCMSdslParser.g:1688:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCMSdslParser.g:1688:4: (lv_name_1_0= RULE_ID )
            // InternalCMSdslParser.g:1689:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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
            		
            // InternalCMSdslParser.g:1709:3: ( (lv_params_3_0= ruleParameter ) )
            // InternalCMSdslParser.g:1710:4: (lv_params_3_0= ruleParameter )
            {
            // InternalCMSdslParser.g:1710:4: (lv_params_3_0= ruleParameter )
            // InternalCMSdslParser.g:1711:5: lv_params_3_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getValidatorAccess().getParamsParameterParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalCMSdslParser.g:1728:3: (otherlv_4= Comma ( (lv_params_5_0= ruleParameter ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Comma) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCMSdslParser.g:1729:4: otherlv_4= Comma ( (lv_params_5_0= ruleParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getValidatorAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCMSdslParser.g:1733:4: ( (lv_params_5_0= ruleParameter ) )
            	    // InternalCMSdslParser.g:1734:5: (lv_params_5_0= ruleParameter )
            	    {
            	    // InternalCMSdslParser.g:1734:5: (lv_params_5_0= ruleParameter )
            	    // InternalCMSdslParser.g:1735:6: lv_params_5_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getValidatorAccess().getParamsParameterParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
            	    break loop19;
                }
            } while (true);

            otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getValidatorAccess().getRightParenthesisKeyword_5());
            		
            otherlv_7=(Token)match(input,EqualsSignGreaterThanSign,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getValidatorAccess().getEqualsSignGreaterThanSignKeyword_6());
            		
            this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_27); 

            			newLeafNode(this_BEGIN_8, grammarAccess.getValidatorAccess().getBEGINTerminalRuleCall_7());
            		
            // InternalCMSdslParser.g:1765:3: ( (lv_comparison_9_0= ruleExpression ) )
            // InternalCMSdslParser.g:1766:4: (lv_comparison_9_0= ruleExpression )
            {
            // InternalCMSdslParser.g:1766:4: (lv_comparison_9_0= ruleExpression )
            // InternalCMSdslParser.g:1767:5: lv_comparison_9_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getValidatorAccess().getComparisonExpressionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_28);
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
    // InternalCMSdslParser.g:1792:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalCMSdslParser.g:1792:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalCMSdslParser.g:1793:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalCMSdslParser.g:1799:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleDataType ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:1805:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleDataType ) ) ) )
            // InternalCMSdslParser.g:1806:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleDataType ) ) )
            {
            // InternalCMSdslParser.g:1806:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleDataType ) ) )
            // InternalCMSdslParser.g:1807:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleDataType ) )
            {
            // InternalCMSdslParser.g:1807:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCMSdslParser.g:1808:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCMSdslParser.g:1808:4: (lv_name_0_0= RULE_ID )
            // InternalCMSdslParser.g:1809:5: lv_name_0_0= RULE_ID
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
            		
            // InternalCMSdslParser.g:1829:3: ( (lv_type_2_0= ruleDataType ) )
            // InternalCMSdslParser.g:1830:4: (lv_type_2_0= ruleDataType )
            {
            // InternalCMSdslParser.g:1830:4: (lv_type_2_0= ruleDataType )
            // InternalCMSdslParser.g:1831:5: lv_type_2_0= ruleDataType
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
    // InternalCMSdslParser.g:1852:1: entryRuleParamOrArgUse returns [EObject current=null] : iv_ruleParamOrArgUse= ruleParamOrArgUse EOF ;
    public final EObject entryRuleParamOrArgUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamOrArgUse = null;


        try {
            // InternalCMSdslParser.g:1852:54: (iv_ruleParamOrArgUse= ruleParamOrArgUse EOF )
            // InternalCMSdslParser.g:1853:2: iv_ruleParamOrArgUse= ruleParamOrArgUse EOF
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
    // InternalCMSdslParser.g:1859:1: ruleParamOrArgUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleParamOrArgUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalCMSdslParser.g:1865:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalCMSdslParser.g:1866:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalCMSdslParser.g:1866:2: ( (otherlv_0= RULE_ID ) )
            // InternalCMSdslParser.g:1867:3: (otherlv_0= RULE_ID )
            {
            // InternalCMSdslParser.g:1867:3: (otherlv_0= RULE_ID )
            // InternalCMSdslParser.g:1868:4: otherlv_0= RULE_ID
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
    // InternalCMSdslParser.g:1882:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalCMSdslParser.g:1882:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalCMSdslParser.g:1883:2: iv_ruleRelationship= ruleRelationship EOF
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
    // InternalCMSdslParser.g:1889:1: ruleRelationship returns [EObject current=null] : ( ( (lv_relationType_0_0= ruleRelationshipType ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_relationType_0_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:1895:2: ( ( ( (lv_relationType_0_0= ruleRelationshipType ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // InternalCMSdslParser.g:1896:2: ( ( (lv_relationType_0_0= ruleRelationshipType ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalCMSdslParser.g:1896:2: ( ( (lv_relationType_0_0= ruleRelationshipType ) ) ( (otherlv_1= RULE_ID ) ) )
            // InternalCMSdslParser.g:1897:3: ( (lv_relationType_0_0= ruleRelationshipType ) ) ( (otherlv_1= RULE_ID ) )
            {
            // InternalCMSdslParser.g:1897:3: ( (lv_relationType_0_0= ruleRelationshipType ) )
            // InternalCMSdslParser.g:1898:4: (lv_relationType_0_0= ruleRelationshipType )
            {
            // InternalCMSdslParser.g:1898:4: (lv_relationType_0_0= ruleRelationshipType )
            // InternalCMSdslParser.g:1899:5: lv_relationType_0_0= ruleRelationshipType
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

            // InternalCMSdslParser.g:1916:3: ( (otherlv_1= RULE_ID ) )
            // InternalCMSdslParser.g:1917:4: (otherlv_1= RULE_ID )
            {
            // InternalCMSdslParser.g:1917:4: (otherlv_1= RULE_ID )
            // InternalCMSdslParser.g:1918:5: otherlv_1= RULE_ID
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
    // InternalCMSdslParser.g:1933:1: entryRuleRelationshipType returns [EObject current=null] : iv_ruleRelationshipType= ruleRelationshipType EOF ;
    public final EObject entryRuleRelationshipType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipType = null;


        try {
            // InternalCMSdslParser.g:1933:57: (iv_ruleRelationshipType= ruleRelationshipType EOF )
            // InternalCMSdslParser.g:1934:2: iv_ruleRelationshipType= ruleRelationshipType EOF
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
    // InternalCMSdslParser.g:1940:1: ruleRelationshipType returns [EObject current=null] : ( ( () otherlv_1= Belongs otherlv_2= To ) | ( () otherlv_4= Belongs otherlv_5= To otherlv_6= Many ) | ( () otherlv_8= Has otherlv_9= One ) | ( () otherlv_11= Has otherlv_12= Many ) ) ;
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
            // InternalCMSdslParser.g:1946:2: ( ( ( () otherlv_1= Belongs otherlv_2= To ) | ( () otherlv_4= Belongs otherlv_5= To otherlv_6= Many ) | ( () otherlv_8= Has otherlv_9= One ) | ( () otherlv_11= Has otherlv_12= Many ) ) )
            // InternalCMSdslParser.g:1947:2: ( ( () otherlv_1= Belongs otherlv_2= To ) | ( () otherlv_4= Belongs otherlv_5= To otherlv_6= Many ) | ( () otherlv_8= Has otherlv_9= One ) | ( () otherlv_11= Has otherlv_12= Many ) )
            {
            // InternalCMSdslParser.g:1947:2: ( ( () otherlv_1= Belongs otherlv_2= To ) | ( () otherlv_4= Belongs otherlv_5= To otherlv_6= Many ) | ( () otherlv_8= Has otherlv_9= One ) | ( () otherlv_11= Has otherlv_12= Many ) )
            int alt20=4;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Belongs) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==To) ) {
                    int LA20_3 = input.LA(3);

                    if ( (LA20_3==Many) ) {
                        alt20=2;
                    }
                    else if ( (LA20_3==EOF||LA20_3==RULE_ID) ) {
                        alt20=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA20_0==Has) ) {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==Many) ) {
                    alt20=4;
                }
                else if ( (LA20_2==One) ) {
                    alt20=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalCMSdslParser.g:1948:3: ( () otherlv_1= Belongs otherlv_2= To )
                    {
                    // InternalCMSdslParser.g:1948:3: ( () otherlv_1= Belongs otherlv_2= To )
                    // InternalCMSdslParser.g:1949:4: () otherlv_1= Belongs otherlv_2= To
                    {
                    // InternalCMSdslParser.g:1949:4: ()
                    // InternalCMSdslParser.g:1950:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationshipTypeAccess().getBelongsToAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,Belongs,FOLLOW_29); 

                    				newLeafNode(otherlv_1, grammarAccess.getRelationshipTypeAccess().getBelongsKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,To,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getRelationshipTypeAccess().getToKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCMSdslParser.g:1966:3: ( () otherlv_4= Belongs otherlv_5= To otherlv_6= Many )
                    {
                    // InternalCMSdslParser.g:1966:3: ( () otherlv_4= Belongs otherlv_5= To otherlv_6= Many )
                    // InternalCMSdslParser.g:1967:4: () otherlv_4= Belongs otherlv_5= To otherlv_6= Many
                    {
                    // InternalCMSdslParser.g:1967:4: ()
                    // InternalCMSdslParser.g:1968:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationshipTypeAccess().getBelongsToManyAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,Belongs,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelationshipTypeAccess().getBelongsKeyword_1_1());
                    			
                    otherlv_5=(Token)match(input,To,FOLLOW_30); 

                    				newLeafNode(otherlv_5, grammarAccess.getRelationshipTypeAccess().getToKeyword_1_2());
                    			
                    otherlv_6=(Token)match(input,Many,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelationshipTypeAccess().getManyKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCMSdslParser.g:1988:3: ( () otherlv_8= Has otherlv_9= One )
                    {
                    // InternalCMSdslParser.g:1988:3: ( () otherlv_8= Has otherlv_9= One )
                    // InternalCMSdslParser.g:1989:4: () otherlv_8= Has otherlv_9= One
                    {
                    // InternalCMSdslParser.g:1989:4: ()
                    // InternalCMSdslParser.g:1990:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationshipTypeAccess().getHasOneAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,Has,FOLLOW_31); 

                    				newLeafNode(otherlv_8, grammarAccess.getRelationshipTypeAccess().getHasKeyword_2_1());
                    			
                    otherlv_9=(Token)match(input,One,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getRelationshipTypeAccess().getOneKeyword_2_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCMSdslParser.g:2006:3: ( () otherlv_11= Has otherlv_12= Many )
                    {
                    // InternalCMSdslParser.g:2006:3: ( () otherlv_11= Has otherlv_12= Many )
                    // InternalCMSdslParser.g:2007:4: () otherlv_11= Has otherlv_12= Many
                    {
                    // InternalCMSdslParser.g:2007:4: ()
                    // InternalCMSdslParser.g:2008:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationshipTypeAccess().getHasManyAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,Has,FOLLOW_30); 

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
    // InternalCMSdslParser.g:2027:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalCMSdslParser.g:2027:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalCMSdslParser.g:2028:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalCMSdslParser.g:2034:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:2040:2: (this_Or_0= ruleOr )
            // InternalCMSdslParser.g:2041:2: this_Or_0= ruleOr
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


    // $ANTLR start "entryRuleOr"
    // InternalCMSdslParser.g:2052:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalCMSdslParser.g:2052:43: (iv_ruleOr= ruleOr EOF )
            // InternalCMSdslParser.g:2053:2: iv_ruleOr= ruleOr EOF
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
    // InternalCMSdslParser.g:2059:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:2065:2: ( (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalCMSdslParser.g:2066:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalCMSdslParser.g:2066:2: (this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalCMSdslParser.g:2067:3: this_And_0= ruleAnd ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCMSdslParser.g:2075:3: ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==VerticalLineVerticalLine) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCMSdslParser.g:2076:4: () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalCMSdslParser.g:2076:4: ()
            	    // InternalCMSdslParser.g:2077:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,VerticalLineVerticalLine,FOLLOW_27); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalCMSdslParser.g:2087:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalCMSdslParser.g:2088:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalCMSdslParser.g:2088:5: (lv_right_3_0= ruleAnd )
            	    // InternalCMSdslParser.g:2089:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
            	    break loop21;
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
    // InternalCMSdslParser.g:2111:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalCMSdslParser.g:2111:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalCMSdslParser.g:2112:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalCMSdslParser.g:2118:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:2124:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalCMSdslParser.g:2125:2: (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalCMSdslParser.g:2125:2: (this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalCMSdslParser.g:2126:3: this_Equality_0= ruleEquality ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCMSdslParser.g:2134:3: ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==AmpersandAmpersand) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCMSdslParser.g:2135:4: () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalCMSdslParser.g:2135:4: ()
            	    // InternalCMSdslParser.g:2136:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,AmpersandAmpersand,FOLLOW_27); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalCMSdslParser.g:2146:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalCMSdslParser.g:2147:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalCMSdslParser.g:2147:5: (lv_right_3_0= ruleEquality )
            	    // InternalCMSdslParser.g:2148:6: lv_right_3_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_33);
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalCMSdslParser.g:2170:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalCMSdslParser.g:2170:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalCMSdslParser.g:2171:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalCMSdslParser.g:2177:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:2183:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalCMSdslParser.g:2184:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalCMSdslParser.g:2184:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalCMSdslParser.g:2185:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCMSdslParser.g:2193:3: ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==ExclamationMarkEqualsSign||LA24_0==EqualsSignEqualsSign) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCMSdslParser.g:2194:4: () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalCMSdslParser.g:2194:4: ()
            	    // InternalCMSdslParser.g:2195:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCMSdslParser.g:2201:4: ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) ) )
            	    // InternalCMSdslParser.g:2202:5: ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) )
            	    {
            	    // InternalCMSdslParser.g:2202:5: ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign ) )
            	    // InternalCMSdslParser.g:2203:6: (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign )
            	    {
            	    // InternalCMSdslParser.g:2203:6: (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= ExclamationMarkEqualsSign )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==EqualsSignEqualsSign) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==ExclamationMarkEqualsSign) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalCMSdslParser.g:2204:7: lv_op_2_1= EqualsSignEqualsSign
            	            {
            	            lv_op_2_1=(Token)match(input,EqualsSignEqualsSign,FOLLOW_27); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalCMSdslParser.g:2215:7: lv_op_2_2= ExclamationMarkEqualsSign
            	            {
            	            lv_op_2_2=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_27); 

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

            	    // InternalCMSdslParser.g:2228:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalCMSdslParser.g:2229:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalCMSdslParser.g:2229:5: (lv_right_3_0= ruleComparison )
            	    // InternalCMSdslParser.g:2230:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_34);
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalCMSdslParser.g:2252:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalCMSdslParser.g:2252:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalCMSdslParser.g:2253:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalCMSdslParser.g:2259:1: ruleComparison returns [EObject current=null] : (this_PlusMinus_0= rulePlusMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusMinus ) ) )* ) ;
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
            // InternalCMSdslParser.g:2265:2: ( (this_PlusMinus_0= rulePlusMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusMinus ) ) )* ) )
            // InternalCMSdslParser.g:2266:2: (this_PlusMinus_0= rulePlusMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusMinus ) ) )* )
            {
            // InternalCMSdslParser.g:2266:2: (this_PlusMinus_0= rulePlusMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusMinus ) ) )* )
            // InternalCMSdslParser.g:2267:3: this_PlusMinus_0= rulePlusMinus ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_PlusMinus_0=rulePlusMinus();

            state._fsp--;


            			current = this_PlusMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCMSdslParser.g:2275:3: ( () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusMinus ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==LessThanSignEqualsSign||LA26_0==GreaterThanSignEqualsSign||(LA26_0>=LessThanSign && LA26_0<=GreaterThanSign)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCMSdslParser.g:2276:4: () ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) ) ( (lv_right_3_0= rulePlusMinus ) )
            	    {
            	    // InternalCMSdslParser.g:2276:4: ()
            	    // InternalCMSdslParser.g:2277:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCMSdslParser.g:2283:4: ( ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) ) )
            	    // InternalCMSdslParser.g:2284:5: ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) )
            	    {
            	    // InternalCMSdslParser.g:2284:5: ( (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign ) )
            	    // InternalCMSdslParser.g:2285:6: (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign )
            	    {
            	    // InternalCMSdslParser.g:2285:6: (lv_op_2_1= GreaterThanSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSign | lv_op_2_4= LessThanSign )
            	    int alt25=4;
            	    switch ( input.LA(1) ) {
            	    case GreaterThanSignEqualsSign:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case LessThanSignEqualsSign:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case GreaterThanSign:
            	        {
            	        alt25=3;
            	        }
            	        break;
            	    case LessThanSign:
            	        {
            	        alt25=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // InternalCMSdslParser.g:2286:7: lv_op_2_1= GreaterThanSignEqualsSign
            	            {
            	            lv_op_2_1=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_27); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalCMSdslParser.g:2297:7: lv_op_2_2= LessThanSignEqualsSign
            	            {
            	            lv_op_2_2=(Token)match(input,LessThanSignEqualsSign,FOLLOW_27); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalCMSdslParser.g:2308:7: lv_op_2_3= GreaterThanSign
            	            {
            	            lv_op_2_3=(Token)match(input,GreaterThanSign,FOLLOW_27); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalCMSdslParser.g:2319:7: lv_op_2_4= LessThanSign
            	            {
            	            lv_op_2_4=(Token)match(input,LessThanSign,FOLLOW_27); 

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

            	    // InternalCMSdslParser.g:2332:4: ( (lv_right_3_0= rulePlusMinus ) )
            	    // InternalCMSdslParser.g:2333:5: (lv_right_3_0= rulePlusMinus )
            	    {
            	    // InternalCMSdslParser.g:2333:5: (lv_right_3_0= rulePlusMinus )
            	    // InternalCMSdslParser.g:2334:6: lv_right_3_0= rulePlusMinus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_35);
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusMinus"
    // InternalCMSdslParser.g:2356:1: entryRulePlusMinus returns [EObject current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final EObject entryRulePlusMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinus = null;


        try {
            // InternalCMSdslParser.g:2356:50: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalCMSdslParser.g:2357:2: iv_rulePlusMinus= rulePlusMinus EOF
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
    // InternalCMSdslParser.g:2363:1: rulePlusMinus returns [EObject current=null] : (this_MulDiv_0= ruleMulDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMulDiv ) ) )* ) ;
    public final EObject rulePlusMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:2369:2: ( (this_MulDiv_0= ruleMulDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMulDiv ) ) )* ) )
            // InternalCMSdslParser.g:2370:2: (this_MulDiv_0= ruleMulDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMulDiv ) ) )* )
            {
            // InternalCMSdslParser.g:2370:2: (this_MulDiv_0= ruleMulDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMulDiv ) ) )* )
            // InternalCMSdslParser.g:2371:3: this_MulDiv_0= ruleMulDiv ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMulDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusMinusAccess().getMulDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_MulDiv_0=ruleMulDiv();

            state._fsp--;


            			current = this_MulDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCMSdslParser.g:2379:3: ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMulDiv ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==PlusSign||LA28_0==HyphenMinus) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCMSdslParser.g:2380:4: ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMulDiv ) )
            	    {
            	    // InternalCMSdslParser.g:2380:4: ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==PlusSign) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==HyphenMinus) ) {
            	        alt27=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalCMSdslParser.g:2381:5: ( () otherlv_2= PlusSign )
            	            {
            	            // InternalCMSdslParser.g:2381:5: ( () otherlv_2= PlusSign )
            	            // InternalCMSdslParser.g:2382:6: () otherlv_2= PlusSign
            	            {
            	            // InternalCMSdslParser.g:2382:6: ()
            	            // InternalCMSdslParser.g:2383:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,PlusSign,FOLLOW_27); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalCMSdslParser.g:2395:5: ( () otherlv_4= HyphenMinus )
            	            {
            	            // InternalCMSdslParser.g:2395:5: ( () otherlv_4= HyphenMinus )
            	            // InternalCMSdslParser.g:2396:6: () otherlv_4= HyphenMinus
            	            {
            	            // InternalCMSdslParser.g:2396:6: ()
            	            // InternalCMSdslParser.g:2397:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,HyphenMinus,FOLLOW_27); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalCMSdslParser.g:2409:4: ( (lv_right_5_0= ruleMulDiv ) )
            	    // InternalCMSdslParser.g:2410:5: (lv_right_5_0= ruleMulDiv )
            	    {
            	    // InternalCMSdslParser.g:2410:5: (lv_right_5_0= ruleMulDiv )
            	    // InternalCMSdslParser.g:2411:6: lv_right_5_0= ruleMulDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusMinusAccess().getRightMulDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
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
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleMulDiv"
    // InternalCMSdslParser.g:2433:1: entryRuleMulDiv returns [EObject current=null] : iv_ruleMulDiv= ruleMulDiv EOF ;
    public final EObject entryRuleMulDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulDiv = null;


        try {
            // InternalCMSdslParser.g:2433:47: (iv_ruleMulDiv= ruleMulDiv EOF )
            // InternalCMSdslParser.g:2434:2: iv_ruleMulDiv= ruleMulDiv EOF
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
    // InternalCMSdslParser.g:2440:1: ruleMulDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= Asterisk ) | ( () otherlv_4= Solidus ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:2446:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= Asterisk ) | ( () otherlv_4= Solidus ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalCMSdslParser.g:2447:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= Asterisk ) | ( () otherlv_4= Solidus ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalCMSdslParser.g:2447:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= Asterisk ) | ( () otherlv_4= Solidus ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalCMSdslParser.g:2448:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= Asterisk ) | ( () otherlv_4= Solidus ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCMSdslParser.g:2456:3: ( ( ( () otherlv_2= Asterisk ) | ( () otherlv_4= Solidus ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==Asterisk||LA30_0==Solidus) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCMSdslParser.g:2457:4: ( ( () otherlv_2= Asterisk ) | ( () otherlv_4= Solidus ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalCMSdslParser.g:2457:4: ( ( () otherlv_2= Asterisk ) | ( () otherlv_4= Solidus ) )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==Asterisk) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==Solidus) ) {
            	        alt29=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalCMSdslParser.g:2458:5: ( () otherlv_2= Asterisk )
            	            {
            	            // InternalCMSdslParser.g:2458:5: ( () otherlv_2= Asterisk )
            	            // InternalCMSdslParser.g:2459:6: () otherlv_2= Asterisk
            	            {
            	            // InternalCMSdslParser.g:2459:6: ()
            	            // InternalCMSdslParser.g:2460:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMulDivAccess().getMulLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,Asterisk,FOLLOW_27); 

            	            						newLeafNode(otherlv_2, grammarAccess.getMulDivAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalCMSdslParser.g:2472:5: ( () otherlv_4= Solidus )
            	            {
            	            // InternalCMSdslParser.g:2472:5: ( () otherlv_4= Solidus )
            	            // InternalCMSdslParser.g:2473:6: () otherlv_4= Solidus
            	            {
            	            // InternalCMSdslParser.g:2473:6: ()
            	            // InternalCMSdslParser.g:2474:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMulDivAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,Solidus,FOLLOW_27); 

            	            						newLeafNode(otherlv_4, grammarAccess.getMulDivAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalCMSdslParser.g:2486:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalCMSdslParser.g:2487:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalCMSdslParser.g:2487:5: (lv_right_5_0= rulePrimary )
            	    // InternalCMSdslParser.g:2488:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulDivAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_37);
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
            	    break loop30;
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
    // InternalCMSdslParser.g:2510:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalCMSdslParser.g:2510:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalCMSdslParser.g:2511:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalCMSdslParser.g:2517:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Atomic_3= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_Atomic_3 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:2523:2: ( ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Atomic_3= ruleAtomic ) )
            // InternalCMSdslParser.g:2524:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Atomic_3= ruleAtomic )
            {
            // InternalCMSdslParser.g:2524:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Atomic_3= ruleAtomic )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==LeftParenthesis) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_BOOLEAN||(LA31_0>=RULE_ID && LA31_0<=RULE_STRING)) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalCMSdslParser.g:2525:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    {
                    // InternalCMSdslParser.g:2525:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    // InternalCMSdslParser.g:2526:4: otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_27); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_38);
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
                    // InternalCMSdslParser.g:2544:3: this_Atomic_3= ruleAtomic
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
    // InternalCMSdslParser.g:2556:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalCMSdslParser.g:2556:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalCMSdslParser.g:2557:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalCMSdslParser.g:2563:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | this_ParamOrArgUse_6= ruleParamOrArgUse ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        EObject this_ParamOrArgUse_6 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:2569:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | this_ParamOrArgUse_6= ruleParamOrArgUse ) )
            // InternalCMSdslParser.g:2570:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | this_ParamOrArgUse_6= ruleParamOrArgUse )
            {
            // InternalCMSdslParser.g:2570:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | this_ParamOrArgUse_6= ruleParamOrArgUse )
            int alt32=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt32=1;
                }
                break;
            case RULE_STRING:
                {
                alt32=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt32=3;
                }
                break;
            case RULE_ID:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalCMSdslParser.g:2571:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalCMSdslParser.g:2571:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalCMSdslParser.g:2572:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalCMSdslParser.g:2572:4: ()
                    // InternalCMSdslParser.g:2573:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getNumAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:2579:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalCMSdslParser.g:2580:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalCMSdslParser.g:2580:5: (lv_value_1_0= RULE_INT )
                    // InternalCMSdslParser.g:2581:6: lv_value_1_0= RULE_INT
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
                    // InternalCMSdslParser.g:2599:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:2599:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:2600:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:2600:4: ()
                    // InternalCMSdslParser.g:2601:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getStrAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:2607:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:2608:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:2608:5: (lv_value_3_0= RULE_STRING )
                    // InternalCMSdslParser.g:2609:6: lv_value_3_0= RULE_STRING
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
                    // InternalCMSdslParser.g:2627:3: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalCMSdslParser.g:2627:3: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    // InternalCMSdslParser.g:2628:4: () ( (lv_value_5_0= RULE_BOOLEAN ) )
                    {
                    // InternalCMSdslParser.g:2628:4: ()
                    // InternalCMSdslParser.g:2629:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBoolAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:2635:4: ( (lv_value_5_0= RULE_BOOLEAN ) )
                    // InternalCMSdslParser.g:2636:5: (lv_value_5_0= RULE_BOOLEAN )
                    {
                    // InternalCMSdslParser.g:2636:5: (lv_value_5_0= RULE_BOOLEAN )
                    // InternalCMSdslParser.g:2637:6: lv_value_5_0= RULE_BOOLEAN
                    {
                    lv_value_5_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    						newLeafNode(lv_value_5_0, grammarAccess.getAtomicAccess().getValueBOOLEANTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"jope015.mdsd2021.reexam.CMSdsl.BOOLEAN");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCMSdslParser.g:2655:3: this_ParamOrArgUse_6= ruleParamOrArgUse
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x10000000000800C0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x1000000200019500L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0080002000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0080001000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x1000000045000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000040B8400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x1000000400804230L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x2000000000240000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x2000001000240000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0xE400000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000822100C00L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xE401000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000090000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0300240000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0028000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0044000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000000000000L});

}