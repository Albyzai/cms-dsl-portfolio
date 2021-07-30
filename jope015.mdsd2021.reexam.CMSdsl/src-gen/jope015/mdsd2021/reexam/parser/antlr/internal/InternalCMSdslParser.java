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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Database", "Hostname", "Password", "Username", "Default", "Dialect", "Library", "Project", "Service", "Entity", "String", "Float", "Bool", "Date", "Long", "Port", "Test", "Int", "Ui", "Colon", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Entity=13;
    public static final int RULE_END=25;
    public static final int RULE_BEGIN=24;
    public static final int Port=19;
    public static final int RULE_STRING=28;
    public static final int String=14;
    public static final int Int=21;
    public static final int RULE_SL_COMMENT=30;
    public static final int Bool=16;
    public static final int Test=20;
    public static final int Database=4;
    public static final int Dialect=9;
    public static final int Colon=23;
    public static final int EOF=-1;
    public static final int Password=6;
    public static final int RULE_ID=26;
    public static final int RULE_WS=31;
    public static final int Hostname=5;
    public static final int Service=12;
    public static final int RULE_ANY_OTHER=32;
    public static final int Default=8;
    public static final int Date=17;
    public static final int Project=11;
    public static final int Float=15;
    public static final int Ui=22;
    public static final int Username=7;
    public static final int RULE_INT=27;
    public static final int Long=18;
    public static final int RULE_ML_COMMENT=29;
    public static final int Library=10;

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

                if ( (LA1_0==Database||LA1_0==Entity) ) {
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
    // InternalCMSdslParser.g:136:1: rulePrimaryElement returns [EObject current=null] : (this_DBConfig_0= ruleDBConfig | this_Entity_1= ruleEntity ) ;
    public final EObject rulePrimaryElement() throws RecognitionException {
        EObject current = null;

        EObject this_DBConfig_0 = null;

        EObject this_Entity_1 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:142:2: ( (this_DBConfig_0= ruleDBConfig | this_Entity_1= ruleEntity ) )
            // InternalCMSdslParser.g:143:2: (this_DBConfig_0= ruleDBConfig | this_Entity_1= ruleEntity )
            {
            // InternalCMSdslParser.g:143:2: (this_DBConfig_0= ruleDBConfig | this_Entity_1= ruleEntity )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Database) ) {
                alt2=1;
            }
            else if ( (LA2_0==Entity) ) {
                alt2=2;
            }
            else {
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
    // InternalCMSdslParser.g:165:1: entryRuleDBConfig returns [EObject current=null] : iv_ruleDBConfig= ruleDBConfig EOF ;
    public final EObject entryRuleDBConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBConfig = null;


        try {
            // InternalCMSdslParser.g:165:49: (iv_ruleDBConfig= ruleDBConfig EOF )
            // InternalCMSdslParser.g:166:2: iv_ruleDBConfig= ruleDBConfig EOF
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
    // InternalCMSdslParser.g:172:1: ruleDBConfig returns [EObject current=null] : ( () ( (lv_type_1_0= Database ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_config_4_0= ruleDBDecl ) )* this_END_5= RULE_END ) ;
    public final EObject ruleDBConfig() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_config_4_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:178:2: ( ( () ( (lv_type_1_0= Database ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_config_4_0= ruleDBDecl ) )* this_END_5= RULE_END ) )
            // InternalCMSdslParser.g:179:2: ( () ( (lv_type_1_0= Database ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_config_4_0= ruleDBDecl ) )* this_END_5= RULE_END )
            {
            // InternalCMSdslParser.g:179:2: ( () ( (lv_type_1_0= Database ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_config_4_0= ruleDBDecl ) )* this_END_5= RULE_END )
            // InternalCMSdslParser.g:180:3: () ( (lv_type_1_0= Database ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_config_4_0= ruleDBDecl ) )* this_END_5= RULE_END
            {
            // InternalCMSdslParser.g:180:3: ()
            // InternalCMSdslParser.g:181:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDBConfigAccess().getDBConfigAction_0(),
            					current);
            			

            }

            // InternalCMSdslParser.g:187:3: ( (lv_type_1_0= Database ) )
            // InternalCMSdslParser.g:188:4: (lv_type_1_0= Database )
            {
            // InternalCMSdslParser.g:188:4: (lv_type_1_0= Database )
            // InternalCMSdslParser.g:189:5: lv_type_1_0= Database
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
            		
            // InternalCMSdslParser.g:209:3: ( (lv_config_4_0= ruleDBDecl ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=Hostname && LA3_0<=Username)||(LA3_0>=Dialect && LA3_0<=Library)||LA3_0==Port) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCMSdslParser.g:210:4: (lv_config_4_0= ruleDBDecl )
            	    {
            	    // InternalCMSdslParser.g:210:4: (lv_config_4_0= ruleDBDecl )
            	    // InternalCMSdslParser.g:211:5: lv_config_4_0= ruleDBDecl
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
    // InternalCMSdslParser.g:236:1: entryRuleDBDecl returns [EObject current=null] : iv_ruleDBDecl= ruleDBDecl EOF ;
    public final EObject entryRuleDBDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBDecl = null;


        try {
            // InternalCMSdslParser.g:236:47: (iv_ruleDBDecl= ruleDBDecl EOF )
            // InternalCMSdslParser.g:237:2: iv_ruleDBDecl= ruleDBDecl EOF
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
    // InternalCMSdslParser.g:243:1: ruleDBDecl returns [EObject current=null] : ( ( () ( (lv_type_1_0= Library ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_type_5_0= Hostname ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_type_9_0= Port ) ) otherlv_10= Colon ( (lv_value_11_0= RULE_INT ) ) ) | ( () ( (lv_type_13_0= Dialect ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) ) ) | ( () ( (lv_type_17_0= Username ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_STRING ) ) ) | ( () ( (lv_type_21_0= Password ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_STRING ) ) ) ) ;
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
            // InternalCMSdslParser.g:249:2: ( ( ( () ( (lv_type_1_0= Library ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_type_5_0= Hostname ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_type_9_0= Port ) ) otherlv_10= Colon ( (lv_value_11_0= RULE_INT ) ) ) | ( () ( (lv_type_13_0= Dialect ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) ) ) | ( () ( (lv_type_17_0= Username ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_STRING ) ) ) | ( () ( (lv_type_21_0= Password ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_STRING ) ) ) ) )
            // InternalCMSdslParser.g:250:2: ( ( () ( (lv_type_1_0= Library ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_type_5_0= Hostname ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_type_9_0= Port ) ) otherlv_10= Colon ( (lv_value_11_0= RULE_INT ) ) ) | ( () ( (lv_type_13_0= Dialect ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) ) ) | ( () ( (lv_type_17_0= Username ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_STRING ) ) ) | ( () ( (lv_type_21_0= Password ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_STRING ) ) ) )
            {
            // InternalCMSdslParser.g:250:2: ( ( () ( (lv_type_1_0= Library ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_type_5_0= Hostname ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_type_9_0= Port ) ) otherlv_10= Colon ( (lv_value_11_0= RULE_INT ) ) ) | ( () ( (lv_type_13_0= Dialect ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) ) ) | ( () ( (lv_type_17_0= Username ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_STRING ) ) ) | ( () ( (lv_type_21_0= Password ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_STRING ) ) ) )
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
                    // InternalCMSdslParser.g:251:3: ( () ( (lv_type_1_0= Library ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:251:3: ( () ( (lv_type_1_0= Library ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:252:4: () ( (lv_type_1_0= Library ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:252:4: ()
                    // InternalCMSdslParser.g:253:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDBDeclAccess().getLibAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:259:4: ( (lv_type_1_0= Library ) )
                    // InternalCMSdslParser.g:260:5: (lv_type_1_0= Library )
                    {
                    // InternalCMSdslParser.g:260:5: (lv_type_1_0= Library )
                    // InternalCMSdslParser.g:261:6: lv_type_1_0= Library
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
                    			
                    // InternalCMSdslParser.g:277:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:278:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:278:5: (lv_value_3_0= RULE_STRING )
                    // InternalCMSdslParser.g:279:6: lv_value_3_0= RULE_STRING
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
                    // InternalCMSdslParser.g:297:3: ( () ( (lv_type_5_0= Hostname ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:297:3: ( () ( (lv_type_5_0= Hostname ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:298:4: () ( (lv_type_5_0= Hostname ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:298:4: ()
                    // InternalCMSdslParser.g:299:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDBDeclAccess().getHostAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:305:4: ( (lv_type_5_0= Hostname ) )
                    // InternalCMSdslParser.g:306:5: (lv_type_5_0= Hostname )
                    {
                    // InternalCMSdslParser.g:306:5: (lv_type_5_0= Hostname )
                    // InternalCMSdslParser.g:307:6: lv_type_5_0= Hostname
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
                    			
                    // InternalCMSdslParser.g:323:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:324:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:324:5: (lv_value_7_0= RULE_STRING )
                    // InternalCMSdslParser.g:325:6: lv_value_7_0= RULE_STRING
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
                    // InternalCMSdslParser.g:343:3: ( () ( (lv_type_9_0= Port ) ) otherlv_10= Colon ( (lv_value_11_0= RULE_INT ) ) )
                    {
                    // InternalCMSdslParser.g:343:3: ( () ( (lv_type_9_0= Port ) ) otherlv_10= Colon ( (lv_value_11_0= RULE_INT ) ) )
                    // InternalCMSdslParser.g:344:4: () ( (lv_type_9_0= Port ) ) otherlv_10= Colon ( (lv_value_11_0= RULE_INT ) )
                    {
                    // InternalCMSdslParser.g:344:4: ()
                    // InternalCMSdslParser.g:345:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDBDeclAccess().getPortAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:351:4: ( (lv_type_9_0= Port ) )
                    // InternalCMSdslParser.g:352:5: (lv_type_9_0= Port )
                    {
                    // InternalCMSdslParser.g:352:5: (lv_type_9_0= Port )
                    // InternalCMSdslParser.g:353:6: lv_type_9_0= Port
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
                    			
                    // InternalCMSdslParser.g:369:4: ( (lv_value_11_0= RULE_INT ) )
                    // InternalCMSdslParser.g:370:5: (lv_value_11_0= RULE_INT )
                    {
                    // InternalCMSdslParser.g:370:5: (lv_value_11_0= RULE_INT )
                    // InternalCMSdslParser.g:371:6: lv_value_11_0= RULE_INT
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
                    // InternalCMSdslParser.g:389:3: ( () ( (lv_type_13_0= Dialect ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:389:3: ( () ( (lv_type_13_0= Dialect ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:390:4: () ( (lv_type_13_0= Dialect ) ) otherlv_14= Colon ( (lv_value_15_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:390:4: ()
                    // InternalCMSdslParser.g:391:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDBDeclAccess().getDialectAction_3_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:397:4: ( (lv_type_13_0= Dialect ) )
                    // InternalCMSdslParser.g:398:5: (lv_type_13_0= Dialect )
                    {
                    // InternalCMSdslParser.g:398:5: (lv_type_13_0= Dialect )
                    // InternalCMSdslParser.g:399:6: lv_type_13_0= Dialect
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
                    			
                    // InternalCMSdslParser.g:415:4: ( (lv_value_15_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:416:5: (lv_value_15_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:416:5: (lv_value_15_0= RULE_STRING )
                    // InternalCMSdslParser.g:417:6: lv_value_15_0= RULE_STRING
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
                    // InternalCMSdslParser.g:435:3: ( () ( (lv_type_17_0= Username ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:435:3: ( () ( (lv_type_17_0= Username ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:436:4: () ( (lv_type_17_0= Username ) ) otherlv_18= Colon ( (lv_value_19_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:436:4: ()
                    // InternalCMSdslParser.g:437:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDBDeclAccess().getUserAction_4_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:443:4: ( (lv_type_17_0= Username ) )
                    // InternalCMSdslParser.g:444:5: (lv_type_17_0= Username )
                    {
                    // InternalCMSdslParser.g:444:5: (lv_type_17_0= Username )
                    // InternalCMSdslParser.g:445:6: lv_type_17_0= Username
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
                    			
                    // InternalCMSdslParser.g:461:4: ( (lv_value_19_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:462:5: (lv_value_19_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:462:5: (lv_value_19_0= RULE_STRING )
                    // InternalCMSdslParser.g:463:6: lv_value_19_0= RULE_STRING
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
                    // InternalCMSdslParser.g:481:3: ( () ( (lv_type_21_0= Password ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:481:3: ( () ( (lv_type_21_0= Password ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:482:4: () ( (lv_type_21_0= Password ) ) otherlv_22= Colon ( (lv_value_23_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:482:4: ()
                    // InternalCMSdslParser.g:483:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDBDeclAccess().getPassAction_5_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:489:4: ( (lv_type_21_0= Password ) )
                    // InternalCMSdslParser.g:490:5: (lv_type_21_0= Password )
                    {
                    // InternalCMSdslParser.g:490:5: (lv_type_21_0= Password )
                    // InternalCMSdslParser.g:491:6: lv_type_21_0= Password
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
                    			
                    // InternalCMSdslParser.g:507:4: ( (lv_value_23_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:508:5: (lv_value_23_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:508:5: (lv_value_23_0= RULE_STRING )
                    // InternalCMSdslParser.g:509:6: lv_value_23_0= RULE_STRING
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
    // InternalCMSdslParser.g:530:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalCMSdslParser.g:530:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalCMSdslParser.g:531:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalCMSdslParser.g:537:1: ruleEntity returns [EObject current=null] : ( () otherlv_1= Entity ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_model_5_0= ruleEntityModel ) ) ( (lv_service_6_0= ruleEntityService ) )? ( (lv_ui_7_0= ruleEntityUI ) )? this_END_8= RULE_END ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token this_END_8=null;
        EObject lv_model_5_0 = null;

        EObject lv_service_6_0 = null;

        AntlrDatatypeRuleToken lv_ui_7_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:543:2: ( ( () otherlv_1= Entity ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_model_5_0= ruleEntityModel ) ) ( (lv_service_6_0= ruleEntityService ) )? ( (lv_ui_7_0= ruleEntityUI ) )? this_END_8= RULE_END ) )
            // InternalCMSdslParser.g:544:2: ( () otherlv_1= Entity ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_model_5_0= ruleEntityModel ) ) ( (lv_service_6_0= ruleEntityService ) )? ( (lv_ui_7_0= ruleEntityUI ) )? this_END_8= RULE_END )
            {
            // InternalCMSdslParser.g:544:2: ( () otherlv_1= Entity ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_model_5_0= ruleEntityModel ) ) ( (lv_service_6_0= ruleEntityService ) )? ( (lv_ui_7_0= ruleEntityUI ) )? this_END_8= RULE_END )
            // InternalCMSdslParser.g:545:3: () otherlv_1= Entity ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Colon this_BEGIN_4= RULE_BEGIN ( (lv_model_5_0= ruleEntityModel ) ) ( (lv_service_6_0= ruleEntityService ) )? ( (lv_ui_7_0= ruleEntityUI ) )? this_END_8= RULE_END
            {
            // InternalCMSdslParser.g:545:3: ()
            // InternalCMSdslParser.g:546:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityAccess().getEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Entity,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
            		
            // InternalCMSdslParser.g:556:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCMSdslParser.g:557:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCMSdslParser.g:557:4: (lv_name_2_0= RULE_ID )
            // InternalCMSdslParser.g:558:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_3=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getColonKeyword_3());
            		
            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_10); 

            			newLeafNode(this_BEGIN_4, grammarAccess.getEntityAccess().getBEGINTerminalRuleCall_4());
            		
            // InternalCMSdslParser.g:582:3: ( (lv_model_5_0= ruleEntityModel ) )
            // InternalCMSdslParser.g:583:4: (lv_model_5_0= ruleEntityModel )
            {
            // InternalCMSdslParser.g:583:4: (lv_model_5_0= ruleEntityModel )
            // InternalCMSdslParser.g:584:5: lv_model_5_0= ruleEntityModel
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getModelEntityModelParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_model_5_0=ruleEntityModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"model",
            						lv_model_5_0,
            						"jope015.mdsd2021.reexam.CMSdsl.EntityModel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCMSdslParser.g:601:3: ( (lv_service_6_0= ruleEntityService ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Service) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCMSdslParser.g:602:4: (lv_service_6_0= ruleEntityService )
                    {
                    // InternalCMSdslParser.g:602:4: (lv_service_6_0= ruleEntityService )
                    // InternalCMSdslParser.g:603:5: lv_service_6_0= ruleEntityService
                    {

                    					newCompositeNode(grammarAccess.getEntityAccess().getServiceEntityServiceParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_service_6_0=ruleEntityService();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityRule());
                    					}
                    					set(
                    						current,
                    						"service",
                    						lv_service_6_0,
                    						"jope015.mdsd2021.reexam.CMSdsl.EntityService");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCMSdslParser.g:620:3: ( (lv_ui_7_0= ruleEntityUI ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Ui) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCMSdslParser.g:621:4: (lv_ui_7_0= ruleEntityUI )
                    {
                    // InternalCMSdslParser.g:621:4: (lv_ui_7_0= ruleEntityUI )
                    // InternalCMSdslParser.g:622:5: lv_ui_7_0= ruleEntityUI
                    {

                    					newCompositeNode(grammarAccess.getEntityAccess().getUiEntityUIParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_ui_7_0=ruleEntityUI();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityRule());
                    					}
                    					set(
                    						current,
                    						"ui",
                    						lv_ui_7_0,
                    						"jope015.mdsd2021.reexam.CMSdsl.EntityUI");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_8, grammarAccess.getEntityAccess().getENDTerminalRuleCall_8());
            		

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


    // $ANTLR start "entryRuleEntityModel"
    // InternalCMSdslParser.g:647:1: entryRuleEntityModel returns [EObject current=null] : iv_ruleEntityModel= ruleEntityModel EOF ;
    public final EObject entryRuleEntityModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityModel = null;


        try {
            // InternalCMSdslParser.g:647:52: (iv_ruleEntityModel= ruleEntityModel EOF )
            // InternalCMSdslParser.g:648:2: iv_ruleEntityModel= ruleEntityModel EOF
            {
             newCompositeNode(grammarAccess.getEntityModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityModel=ruleEntityModel();

            state._fsp--;

             current =iv_ruleEntityModel; 
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
    // $ANTLR end "entryRuleEntityModel"


    // $ANTLR start "ruleEntityModel"
    // InternalCMSdslParser.g:654:1: ruleEntityModel returns [EObject current=null] : ( () ( (lv_fields_1_0= ruleField ) )* ) ;
    public final EObject ruleEntityModel() throws RecognitionException {
        EObject current = null;

        EObject lv_fields_1_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:660:2: ( ( () ( (lv_fields_1_0= ruleField ) )* ) )
            // InternalCMSdslParser.g:661:2: ( () ( (lv_fields_1_0= ruleField ) )* )
            {
            // InternalCMSdslParser.g:661:2: ( () ( (lv_fields_1_0= ruleField ) )* )
            // InternalCMSdslParser.g:662:3: () ( (lv_fields_1_0= ruleField ) )*
            {
            // InternalCMSdslParser.g:662:3: ()
            // InternalCMSdslParser.g:663:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityModelAccess().getEntityModelAction_0(),
            					current);
            			

            }

            // InternalCMSdslParser.g:669:3: ( (lv_fields_1_0= ruleField ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=String && LA7_0<=Long)||LA7_0==Int) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCMSdslParser.g:670:4: (lv_fields_1_0= ruleField )
            	    {
            	    // InternalCMSdslParser.g:670:4: (lv_fields_1_0= ruleField )
            	    // InternalCMSdslParser.g:671:5: lv_fields_1_0= ruleField
            	    {

            	    					newCompositeNode(grammarAccess.getEntityModelAccess().getFieldsFieldParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_fields_1_0=ruleField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_1_0,
            	    						"jope015.mdsd2021.reexam.CMSdsl.Field");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleEntityModel"


    // $ANTLR start "entryRuleEntityService"
    // InternalCMSdslParser.g:692:1: entryRuleEntityService returns [EObject current=null] : iv_ruleEntityService= ruleEntityService EOF ;
    public final EObject entryRuleEntityService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityService = null;


        try {
            // InternalCMSdslParser.g:692:54: (iv_ruleEntityService= ruleEntityService EOF )
            // InternalCMSdslParser.g:693:2: iv_ruleEntityService= ruleEntityService EOF
            {
             newCompositeNode(grammarAccess.getEntityServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityService=ruleEntityService();

            state._fsp--;

             current =iv_ruleEntityService; 
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
    // $ANTLR end "entryRuleEntityService"


    // $ANTLR start "ruleEntityService"
    // InternalCMSdslParser.g:699:1: ruleEntityService returns [EObject current=null] : ( () otherlv_1= Service otherlv_2= Colon ) ;
    public final EObject ruleEntityService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCMSdslParser.g:705:2: ( ( () otherlv_1= Service otherlv_2= Colon ) )
            // InternalCMSdslParser.g:706:2: ( () otherlv_1= Service otherlv_2= Colon )
            {
            // InternalCMSdslParser.g:706:2: ( () otherlv_1= Service otherlv_2= Colon )
            // InternalCMSdslParser.g:707:3: () otherlv_1= Service otherlv_2= Colon
            {
            // InternalCMSdslParser.g:707:3: ()
            // InternalCMSdslParser.g:708:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityServiceAccess().getEntityServiceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Service,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityServiceAccess().getServiceKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityServiceAccess().getColonKeyword_2());
            		

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
    // $ANTLR end "ruleEntityService"


    // $ANTLR start "entryRuleEntityUI"
    // InternalCMSdslParser.g:726:1: entryRuleEntityUI returns [String current=null] : iv_ruleEntityUI= ruleEntityUI EOF ;
    public final String entryRuleEntityUI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEntityUI = null;


        try {
            // InternalCMSdslParser.g:726:48: (iv_ruleEntityUI= ruleEntityUI EOF )
            // InternalCMSdslParser.g:727:2: iv_ruleEntityUI= ruleEntityUI EOF
            {
             newCompositeNode(grammarAccess.getEntityUIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityUI=ruleEntityUI();

            state._fsp--;

             current =iv_ruleEntityUI.getText(); 
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
    // $ANTLR end "entryRuleEntityUI"


    // $ANTLR start "ruleEntityUI"
    // InternalCMSdslParser.g:733:1: ruleEntityUI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Ui ;
    public final AntlrDatatypeRuleToken ruleEntityUI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCMSdslParser.g:739:2: (kw= Ui )
            // InternalCMSdslParser.g:740:2: kw= Ui
            {
            kw=(Token)match(input,Ui,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEntityUIAccess().getUiKeyword());
            	

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
    // $ANTLR end "ruleEntityUI"


    // $ANTLR start "entryRuleField"
    // InternalCMSdslParser.g:748:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalCMSdslParser.g:748:46: (iv_ruleField= ruleField EOF )
            // InternalCMSdslParser.g:749:2: iv_ruleField= ruleField EOF
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
    // InternalCMSdslParser.g:755:1: ruleField returns [EObject current=null] : ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_properties_4_0= ruleFieldProp ) )* this_END_5= RULE_END ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_type_0_0 = null;

        EObject lv_properties_4_0 = null;



        	enterRule();

        try {
            // InternalCMSdslParser.g:761:2: ( ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_properties_4_0= ruleFieldProp ) )* this_END_5= RULE_END ) )
            // InternalCMSdslParser.g:762:2: ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_properties_4_0= ruleFieldProp ) )* this_END_5= RULE_END )
            {
            // InternalCMSdslParser.g:762:2: ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_properties_4_0= ruleFieldProp ) )* this_END_5= RULE_END )
            // InternalCMSdslParser.g:763:3: ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_properties_4_0= ruleFieldProp ) )* this_END_5= RULE_END
            {
            // InternalCMSdslParser.g:763:3: ( (lv_type_0_0= ruleDataType ) )
            // InternalCMSdslParser.g:764:4: (lv_type_0_0= ruleDataType )
            {
            // InternalCMSdslParser.g:764:4: (lv_type_0_0= ruleDataType )
            // InternalCMSdslParser.g:765:5: lv_type_0_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getTypeDataTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"jope015.mdsd2021.reexam.CMSdsl.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCMSdslParser.g:782:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCMSdslParser.g:783:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCMSdslParser.g:783:4: (lv_name_1_0= RULE_ID )
            // InternalCMSdslParser.g:784:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getFieldAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalCMSdslParser.g:808:3: ( (lv_properties_4_0= ruleFieldProp ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Default||LA8_0==Test) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCMSdslParser.g:809:4: (lv_properties_4_0= ruleFieldProp )
            	    {
            	    // InternalCMSdslParser.g:809:4: (lv_properties_4_0= ruleFieldProp )
            	    // InternalCMSdslParser.g:810:5: lv_properties_4_0= ruleFieldProp
            	    {

            	    					newCompositeNode(grammarAccess.getFieldAccess().getPropertiesFieldPropParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_properties_4_0=ruleFieldProp();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFieldRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_4_0,
            	    						"jope015.mdsd2021.reexam.CMSdsl.FieldProp");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_5, grammarAccess.getFieldAccess().getENDTerminalRuleCall_5());
            		

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


    // $ANTLR start "entryRuleFieldProp"
    // InternalCMSdslParser.g:835:1: entryRuleFieldProp returns [EObject current=null] : iv_ruleFieldProp= ruleFieldProp EOF ;
    public final EObject entryRuleFieldProp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldProp = null;


        try {
            // InternalCMSdslParser.g:835:50: (iv_ruleFieldProp= ruleFieldProp EOF )
            // InternalCMSdslParser.g:836:2: iv_ruleFieldProp= ruleFieldProp EOF
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
    // InternalCMSdslParser.g:842:1: ruleFieldProp returns [EObject current=null] : ( ( () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) ) ;
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
            // InternalCMSdslParser.g:848:2: ( ( ( () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) ) )
            // InternalCMSdslParser.g:849:2: ( ( () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) )
            {
            // InternalCMSdslParser.g:849:2: ( ( () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Default) ) {
                alt9=1;
            }
            else if ( (LA9_0==Test) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCMSdslParser.g:850:3: ( () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:850:3: ( () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:851:4: () ( (lv_type_1_0= Default ) ) otherlv_2= Colon ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:851:4: ()
                    // InternalCMSdslParser.g:852:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFieldPropAccess().getDefAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:858:4: ( (lv_type_1_0= Default ) )
                    // InternalCMSdslParser.g:859:5: (lv_type_1_0= Default )
                    {
                    // InternalCMSdslParser.g:859:5: (lv_type_1_0= Default )
                    // InternalCMSdslParser.g:860:6: lv_type_1_0= Default
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
                    			
                    // InternalCMSdslParser.g:876:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:877:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:877:5: (lv_value_3_0= RULE_STRING )
                    // InternalCMSdslParser.g:878:6: lv_value_3_0= RULE_STRING
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
                    // InternalCMSdslParser.g:896:3: ( () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // InternalCMSdslParser.g:896:3: ( () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) ) )
                    // InternalCMSdslParser.g:897:4: () ( (lv_type_5_0= Test ) ) otherlv_6= Colon ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // InternalCMSdslParser.g:897:4: ()
                    // InternalCMSdslParser.g:898:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFieldPropAccess().getPropTestAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:904:4: ( (lv_type_5_0= Test ) )
                    // InternalCMSdslParser.g:905:5: (lv_type_5_0= Test )
                    {
                    // InternalCMSdslParser.g:905:5: (lv_type_5_0= Test )
                    // InternalCMSdslParser.g:906:6: lv_type_5_0= Test
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
                    			
                    // InternalCMSdslParser.g:922:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalCMSdslParser.g:923:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalCMSdslParser.g:923:5: (lv_value_7_0= RULE_STRING )
                    // InternalCMSdslParser.g:924:6: lv_value_7_0= RULE_STRING
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
    // InternalCMSdslParser.g:945:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalCMSdslParser.g:945:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalCMSdslParser.g:946:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalCMSdslParser.g:952:1: ruleDataType returns [EObject current=null] : ( ( () ( (lv_type_1_0= String ) ) ) | ( () ( (lv_type_3_0= Date ) ) ) | ( () ( (lv_type_5_0= Int ) ) ) | ( () ( (lv_type_7_0= Long ) ) ) | ( () ( (lv_type_9_0= Bool ) ) ) | ( () ( (lv_type_11_0= Float ) ) ) ) ;
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
            // InternalCMSdslParser.g:958:2: ( ( ( () ( (lv_type_1_0= String ) ) ) | ( () ( (lv_type_3_0= Date ) ) ) | ( () ( (lv_type_5_0= Int ) ) ) | ( () ( (lv_type_7_0= Long ) ) ) | ( () ( (lv_type_9_0= Bool ) ) ) | ( () ( (lv_type_11_0= Float ) ) ) ) )
            // InternalCMSdslParser.g:959:2: ( ( () ( (lv_type_1_0= String ) ) ) | ( () ( (lv_type_3_0= Date ) ) ) | ( () ( (lv_type_5_0= Int ) ) ) | ( () ( (lv_type_7_0= Long ) ) ) | ( () ( (lv_type_9_0= Bool ) ) ) | ( () ( (lv_type_11_0= Float ) ) ) )
            {
            // InternalCMSdslParser.g:959:2: ( ( () ( (lv_type_1_0= String ) ) ) | ( () ( (lv_type_3_0= Date ) ) ) | ( () ( (lv_type_5_0= Int ) ) ) | ( () ( (lv_type_7_0= Long ) ) ) | ( () ( (lv_type_9_0= Bool ) ) ) | ( () ( (lv_type_11_0= Float ) ) ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case String:
                {
                alt10=1;
                }
                break;
            case Date:
                {
                alt10=2;
                }
                break;
            case Int:
                {
                alt10=3;
                }
                break;
            case Long:
                {
                alt10=4;
                }
                break;
            case Bool:
                {
                alt10=5;
                }
                break;
            case Float:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalCMSdslParser.g:960:3: ( () ( (lv_type_1_0= String ) ) )
                    {
                    // InternalCMSdslParser.g:960:3: ( () ( (lv_type_1_0= String ) ) )
                    // InternalCMSdslParser.g:961:4: () ( (lv_type_1_0= String ) )
                    {
                    // InternalCMSdslParser.g:961:4: ()
                    // InternalCMSdslParser.g:962:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getStrAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:968:4: ( (lv_type_1_0= String ) )
                    // InternalCMSdslParser.g:969:5: (lv_type_1_0= String )
                    {
                    // InternalCMSdslParser.g:969:5: (lv_type_1_0= String )
                    // InternalCMSdslParser.g:970:6: lv_type_1_0= String
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
                    // InternalCMSdslParser.g:984:3: ( () ( (lv_type_3_0= Date ) ) )
                    {
                    // InternalCMSdslParser.g:984:3: ( () ( (lv_type_3_0= Date ) ) )
                    // InternalCMSdslParser.g:985:4: () ( (lv_type_3_0= Date ) )
                    {
                    // InternalCMSdslParser.g:985:4: ()
                    // InternalCMSdslParser.g:986:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getDtAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:992:4: ( (lv_type_3_0= Date ) )
                    // InternalCMSdslParser.g:993:5: (lv_type_3_0= Date )
                    {
                    // InternalCMSdslParser.g:993:5: (lv_type_3_0= Date )
                    // InternalCMSdslParser.g:994:6: lv_type_3_0= Date
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
                    // InternalCMSdslParser.g:1008:3: ( () ( (lv_type_5_0= Int ) ) )
                    {
                    // InternalCMSdslParser.g:1008:3: ( () ( (lv_type_5_0= Int ) ) )
                    // InternalCMSdslParser.g:1009:4: () ( (lv_type_5_0= Int ) )
                    {
                    // InternalCMSdslParser.g:1009:4: ()
                    // InternalCMSdslParser.g:1010:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getIntegAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1016:4: ( (lv_type_5_0= Int ) )
                    // InternalCMSdslParser.g:1017:5: (lv_type_5_0= Int )
                    {
                    // InternalCMSdslParser.g:1017:5: (lv_type_5_0= Int )
                    // InternalCMSdslParser.g:1018:6: lv_type_5_0= Int
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
                    // InternalCMSdslParser.g:1032:3: ( () ( (lv_type_7_0= Long ) ) )
                    {
                    // InternalCMSdslParser.g:1032:3: ( () ( (lv_type_7_0= Long ) ) )
                    // InternalCMSdslParser.g:1033:4: () ( (lv_type_7_0= Long ) )
                    {
                    // InternalCMSdslParser.g:1033:4: ()
                    // InternalCMSdslParser.g:1034:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getLngAction_3_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1040:4: ( (lv_type_7_0= Long ) )
                    // InternalCMSdslParser.g:1041:5: (lv_type_7_0= Long )
                    {
                    // InternalCMSdslParser.g:1041:5: (lv_type_7_0= Long )
                    // InternalCMSdslParser.g:1042:6: lv_type_7_0= Long
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
                    // InternalCMSdslParser.g:1056:3: ( () ( (lv_type_9_0= Bool ) ) )
                    {
                    // InternalCMSdslParser.g:1056:3: ( () ( (lv_type_9_0= Bool ) ) )
                    // InternalCMSdslParser.g:1057:4: () ( (lv_type_9_0= Bool ) )
                    {
                    // InternalCMSdslParser.g:1057:4: ()
                    // InternalCMSdslParser.g:1058:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getBoolAction_4_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1064:4: ( (lv_type_9_0= Bool ) )
                    // InternalCMSdslParser.g:1065:5: (lv_type_9_0= Bool )
                    {
                    // InternalCMSdslParser.g:1065:5: (lv_type_9_0= Bool )
                    // InternalCMSdslParser.g:1066:6: lv_type_9_0= Bool
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
                    // InternalCMSdslParser.g:1080:3: ( () ( (lv_type_11_0= Float ) ) )
                    {
                    // InternalCMSdslParser.g:1080:3: ( () ( (lv_type_11_0= Float ) ) )
                    // InternalCMSdslParser.g:1081:4: () ( (lv_type_11_0= Float ) )
                    {
                    // InternalCMSdslParser.g:1081:4: ()
                    // InternalCMSdslParser.g:1082:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataTypeAccess().getFltAction_5_0(),
                    						current);
                    				

                    }

                    // InternalCMSdslParser.g:1088:4: ( (lv_type_11_0= Float ) )
                    // InternalCMSdslParser.g:1089:5: (lv_type_11_0= Float )
                    {
                    // InternalCMSdslParser.g:1089:5: (lv_type_11_0= Float )
                    // InternalCMSdslParser.g:1090:6: lv_type_11_0= Float
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000020806E0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000267D000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002401000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000027C002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002100100L});

}