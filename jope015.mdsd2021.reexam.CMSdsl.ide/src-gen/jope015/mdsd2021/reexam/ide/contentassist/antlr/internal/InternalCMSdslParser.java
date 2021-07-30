package jope015.mdsd2021.reexam.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import jope015.mdsd2021.reexam.services.CMSdslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCMSdslParser extends AbstractInternalContentAssistParser {
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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("Ui", "'ui'");
    		tokenNameToValue.put("Int", "'int'");
    		tokenNameToValue.put("Bool", "'bool'");
    		tokenNameToValue.put("Date", "'date'");
    		tokenNameToValue.put("Long", "'long'");
    		tokenNameToValue.put("Port", "'port'");
    		tokenNameToValue.put("Test", "'test'");
    		tokenNameToValue.put("Float", "'float'");
    		tokenNameToValue.put("Entity", "'entity'");
    		tokenNameToValue.put("String", "'string'");
    		tokenNameToValue.put("Default", "'default'");
    		tokenNameToValue.put("Dialect", "'dialect'");
    		tokenNameToValue.put("Library", "'library'");
    		tokenNameToValue.put("Project", "'project'");
    		tokenNameToValue.put("Service", "'service'");
    		tokenNameToValue.put("Database", "'database'");
    		tokenNameToValue.put("Hostname", "'hostname'");
    		tokenNameToValue.put("Password", "'password'");
    		tokenNameToValue.put("Username", "'username'");
    	}

    	public void setGrammarAccess(CMSdslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleProject"
    // InternalCMSdslParser.g:75:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // InternalCMSdslParser.g:76:1: ( ruleProject EOF )
            // InternalCMSdslParser.g:77:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCMSdslParser.g:84:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:88:2: ( ( ( rule__Project__Group__0 ) ) )
            // InternalCMSdslParser.g:89:2: ( ( rule__Project__Group__0 ) )
            {
            // InternalCMSdslParser.g:89:2: ( ( rule__Project__Group__0 ) )
            // InternalCMSdslParser.g:90:3: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // InternalCMSdslParser.g:91:3: ( rule__Project__Group__0 )
            // InternalCMSdslParser.g:91:4: rule__Project__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRulePrimaryElement"
    // InternalCMSdslParser.g:100:1: entryRulePrimaryElement : rulePrimaryElement EOF ;
    public final void entryRulePrimaryElement() throws RecognitionException {
        try {
            // InternalCMSdslParser.g:101:1: ( rulePrimaryElement EOF )
            // InternalCMSdslParser.g:102:1: rulePrimaryElement EOF
            {
             before(grammarAccess.getPrimaryElementRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryElement();

            state._fsp--;

             after(grammarAccess.getPrimaryElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimaryElement"


    // $ANTLR start "rulePrimaryElement"
    // InternalCMSdslParser.g:109:1: rulePrimaryElement : ( ( rule__PrimaryElement__Alternatives ) ) ;
    public final void rulePrimaryElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:113:2: ( ( ( rule__PrimaryElement__Alternatives ) ) )
            // InternalCMSdslParser.g:114:2: ( ( rule__PrimaryElement__Alternatives ) )
            {
            // InternalCMSdslParser.g:114:2: ( ( rule__PrimaryElement__Alternatives ) )
            // InternalCMSdslParser.g:115:3: ( rule__PrimaryElement__Alternatives )
            {
             before(grammarAccess.getPrimaryElementAccess().getAlternatives()); 
            // InternalCMSdslParser.g:116:3: ( rule__PrimaryElement__Alternatives )
            // InternalCMSdslParser.g:116:4: rule__PrimaryElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryElementAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimaryElement"


    // $ANTLR start "entryRuleDBConfig"
    // InternalCMSdslParser.g:125:1: entryRuleDBConfig : ruleDBConfig EOF ;
    public final void entryRuleDBConfig() throws RecognitionException {
        try {
            // InternalCMSdslParser.g:126:1: ( ruleDBConfig EOF )
            // InternalCMSdslParser.g:127:1: ruleDBConfig EOF
            {
             before(grammarAccess.getDBConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleDBConfig();

            state._fsp--;

             after(grammarAccess.getDBConfigRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDBConfig"


    // $ANTLR start "ruleDBConfig"
    // InternalCMSdslParser.g:134:1: ruleDBConfig : ( ( rule__DBConfig__Group__0 ) ) ;
    public final void ruleDBConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:138:2: ( ( ( rule__DBConfig__Group__0 ) ) )
            // InternalCMSdslParser.g:139:2: ( ( rule__DBConfig__Group__0 ) )
            {
            // InternalCMSdslParser.g:139:2: ( ( rule__DBConfig__Group__0 ) )
            // InternalCMSdslParser.g:140:3: ( rule__DBConfig__Group__0 )
            {
             before(grammarAccess.getDBConfigAccess().getGroup()); 
            // InternalCMSdslParser.g:141:3: ( rule__DBConfig__Group__0 )
            // InternalCMSdslParser.g:141:4: rule__DBConfig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DBConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDBConfigAccess().getGroup()); 

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
    // $ANTLR end "ruleDBConfig"


    // $ANTLR start "entryRuleDBDecl"
    // InternalCMSdslParser.g:150:1: entryRuleDBDecl : ruleDBDecl EOF ;
    public final void entryRuleDBDecl() throws RecognitionException {
        try {
            // InternalCMSdslParser.g:151:1: ( ruleDBDecl EOF )
            // InternalCMSdslParser.g:152:1: ruleDBDecl EOF
            {
             before(grammarAccess.getDBDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleDBDecl();

            state._fsp--;

             after(grammarAccess.getDBDeclRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDBDecl"


    // $ANTLR start "ruleDBDecl"
    // InternalCMSdslParser.g:159:1: ruleDBDecl : ( ( rule__DBDecl__Alternatives ) ) ;
    public final void ruleDBDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:163:2: ( ( ( rule__DBDecl__Alternatives ) ) )
            // InternalCMSdslParser.g:164:2: ( ( rule__DBDecl__Alternatives ) )
            {
            // InternalCMSdslParser.g:164:2: ( ( rule__DBDecl__Alternatives ) )
            // InternalCMSdslParser.g:165:3: ( rule__DBDecl__Alternatives )
            {
             before(grammarAccess.getDBDeclAccess().getAlternatives()); 
            // InternalCMSdslParser.g:166:3: ( rule__DBDecl__Alternatives )
            // InternalCMSdslParser.g:166:4: rule__DBDecl__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DBDecl__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDBDeclAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDBDecl"


    // $ANTLR start "entryRuleEntity"
    // InternalCMSdslParser.g:175:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalCMSdslParser.g:176:1: ( ruleEntity EOF )
            // InternalCMSdslParser.g:177:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalCMSdslParser.g:184:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:188:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalCMSdslParser.g:189:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalCMSdslParser.g:189:2: ( ( rule__Entity__Group__0 ) )
            // InternalCMSdslParser.g:190:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalCMSdslParser.g:191:3: ( rule__Entity__Group__0 )
            // InternalCMSdslParser.g:191:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntityModel"
    // InternalCMSdslParser.g:200:1: entryRuleEntityModel : ruleEntityModel EOF ;
    public final void entryRuleEntityModel() throws RecognitionException {
        try {
            // InternalCMSdslParser.g:201:1: ( ruleEntityModel EOF )
            // InternalCMSdslParser.g:202:1: ruleEntityModel EOF
            {
             before(grammarAccess.getEntityModelRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityModel();

            state._fsp--;

             after(grammarAccess.getEntityModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntityModel"


    // $ANTLR start "ruleEntityModel"
    // InternalCMSdslParser.g:209:1: ruleEntityModel : ( ( rule__EntityModel__Group__0 ) ) ;
    public final void ruleEntityModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:213:2: ( ( ( rule__EntityModel__Group__0 ) ) )
            // InternalCMSdslParser.g:214:2: ( ( rule__EntityModel__Group__0 ) )
            {
            // InternalCMSdslParser.g:214:2: ( ( rule__EntityModel__Group__0 ) )
            // InternalCMSdslParser.g:215:3: ( rule__EntityModel__Group__0 )
            {
             before(grammarAccess.getEntityModelAccess().getGroup()); 
            // InternalCMSdslParser.g:216:3: ( rule__EntityModel__Group__0 )
            // InternalCMSdslParser.g:216:4: rule__EntityModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityModelAccess().getGroup()); 

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
    // $ANTLR end "ruleEntityModel"


    // $ANTLR start "entryRuleEntityService"
    // InternalCMSdslParser.g:225:1: entryRuleEntityService : ruleEntityService EOF ;
    public final void entryRuleEntityService() throws RecognitionException {
        try {
            // InternalCMSdslParser.g:226:1: ( ruleEntityService EOF )
            // InternalCMSdslParser.g:227:1: ruleEntityService EOF
            {
             before(grammarAccess.getEntityServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityService();

            state._fsp--;

             after(grammarAccess.getEntityServiceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntityService"


    // $ANTLR start "ruleEntityService"
    // InternalCMSdslParser.g:234:1: ruleEntityService : ( ( rule__EntityService__Group__0 ) ) ;
    public final void ruleEntityService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:238:2: ( ( ( rule__EntityService__Group__0 ) ) )
            // InternalCMSdslParser.g:239:2: ( ( rule__EntityService__Group__0 ) )
            {
            // InternalCMSdslParser.g:239:2: ( ( rule__EntityService__Group__0 ) )
            // InternalCMSdslParser.g:240:3: ( rule__EntityService__Group__0 )
            {
             before(grammarAccess.getEntityServiceAccess().getGroup()); 
            // InternalCMSdslParser.g:241:3: ( rule__EntityService__Group__0 )
            // InternalCMSdslParser.g:241:4: rule__EntityService__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityService__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityServiceAccess().getGroup()); 

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
    // $ANTLR end "ruleEntityService"


    // $ANTLR start "entryRuleEntityUI"
    // InternalCMSdslParser.g:250:1: entryRuleEntityUI : ruleEntityUI EOF ;
    public final void entryRuleEntityUI() throws RecognitionException {
        try {
            // InternalCMSdslParser.g:251:1: ( ruleEntityUI EOF )
            // InternalCMSdslParser.g:252:1: ruleEntityUI EOF
            {
             before(grammarAccess.getEntityUIRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityUI();

            state._fsp--;

             after(grammarAccess.getEntityUIRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntityUI"


    // $ANTLR start "ruleEntityUI"
    // InternalCMSdslParser.g:259:1: ruleEntityUI : ( Ui ) ;
    public final void ruleEntityUI() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:263:2: ( ( Ui ) )
            // InternalCMSdslParser.g:264:2: ( Ui )
            {
            // InternalCMSdslParser.g:264:2: ( Ui )
            // InternalCMSdslParser.g:265:3: Ui
            {
             before(grammarAccess.getEntityUIAccess().getUiKeyword()); 
            match(input,Ui,FOLLOW_2); 
             after(grammarAccess.getEntityUIAccess().getUiKeyword()); 

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
    // $ANTLR end "ruleEntityUI"


    // $ANTLR start "entryRuleField"
    // InternalCMSdslParser.g:275:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalCMSdslParser.g:276:1: ( ruleField EOF )
            // InternalCMSdslParser.g:277:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalCMSdslParser.g:284:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:288:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalCMSdslParser.g:289:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalCMSdslParser.g:289:2: ( ( rule__Field__Group__0 ) )
            // InternalCMSdslParser.g:290:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalCMSdslParser.g:291:3: ( rule__Field__Group__0 )
            // InternalCMSdslParser.g:291:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleFieldProp"
    // InternalCMSdslParser.g:300:1: entryRuleFieldProp : ruleFieldProp EOF ;
    public final void entryRuleFieldProp() throws RecognitionException {
        try {
            // InternalCMSdslParser.g:301:1: ( ruleFieldProp EOF )
            // InternalCMSdslParser.g:302:1: ruleFieldProp EOF
            {
             before(grammarAccess.getFieldPropRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldProp();

            state._fsp--;

             after(grammarAccess.getFieldPropRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFieldProp"


    // $ANTLR start "ruleFieldProp"
    // InternalCMSdslParser.g:309:1: ruleFieldProp : ( ( rule__FieldProp__Alternatives ) ) ;
    public final void ruleFieldProp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:313:2: ( ( ( rule__FieldProp__Alternatives ) ) )
            // InternalCMSdslParser.g:314:2: ( ( rule__FieldProp__Alternatives ) )
            {
            // InternalCMSdslParser.g:314:2: ( ( rule__FieldProp__Alternatives ) )
            // InternalCMSdslParser.g:315:3: ( rule__FieldProp__Alternatives )
            {
             before(grammarAccess.getFieldPropAccess().getAlternatives()); 
            // InternalCMSdslParser.g:316:3: ( rule__FieldProp__Alternatives )
            // InternalCMSdslParser.g:316:4: rule__FieldProp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FieldProp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldPropAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFieldProp"


    // $ANTLR start "entryRuleDataType"
    // InternalCMSdslParser.g:325:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalCMSdslParser.g:326:1: ( ruleDataType EOF )
            // InternalCMSdslParser.g:327:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalCMSdslParser.g:334:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:338:2: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalCMSdslParser.g:339:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalCMSdslParser.g:339:2: ( ( rule__DataType__Alternatives ) )
            // InternalCMSdslParser.g:340:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalCMSdslParser.g:341:3: ( rule__DataType__Alternatives )
            // InternalCMSdslParser.g:341:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "rule__PrimaryElement__Alternatives"
    // InternalCMSdslParser.g:349:1: rule__PrimaryElement__Alternatives : ( ( ruleDBConfig ) | ( ruleEntity ) );
    public final void rule__PrimaryElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:353:1: ( ( ruleDBConfig ) | ( ruleEntity ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Database) ) {
                alt1=1;
            }
            else if ( (LA1_0==Entity) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCMSdslParser.g:354:2: ( ruleDBConfig )
                    {
                    // InternalCMSdslParser.g:354:2: ( ruleDBConfig )
                    // InternalCMSdslParser.g:355:3: ruleDBConfig
                    {
                     before(grammarAccess.getPrimaryElementAccess().getDBConfigParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDBConfig();

                    state._fsp--;

                     after(grammarAccess.getPrimaryElementAccess().getDBConfigParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCMSdslParser.g:360:2: ( ruleEntity )
                    {
                    // InternalCMSdslParser.g:360:2: ( ruleEntity )
                    // InternalCMSdslParser.g:361:3: ruleEntity
                    {
                     before(grammarAccess.getPrimaryElementAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getPrimaryElementAccess().getEntityParserRuleCall_1()); 

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
    // $ANTLR end "rule__PrimaryElement__Alternatives"


    // $ANTLR start "rule__DBDecl__Alternatives"
    // InternalCMSdslParser.g:370:1: rule__DBDecl__Alternatives : ( ( ( rule__DBDecl__Group_0__0 ) ) | ( ( rule__DBDecl__Group_1__0 ) ) | ( ( rule__DBDecl__Group_2__0 ) ) | ( ( rule__DBDecl__Group_3__0 ) ) | ( ( rule__DBDecl__Group_4__0 ) ) | ( ( rule__DBDecl__Group_5__0 ) ) );
    public final void rule__DBDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:374:1: ( ( ( rule__DBDecl__Group_0__0 ) ) | ( ( rule__DBDecl__Group_1__0 ) ) | ( ( rule__DBDecl__Group_2__0 ) ) | ( ( rule__DBDecl__Group_3__0 ) ) | ( ( rule__DBDecl__Group_4__0 ) ) | ( ( rule__DBDecl__Group_5__0 ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case Library:
                {
                alt2=1;
                }
                break;
            case Hostname:
                {
                alt2=2;
                }
                break;
            case Port:
                {
                alt2=3;
                }
                break;
            case Dialect:
                {
                alt2=4;
                }
                break;
            case Username:
                {
                alt2=5;
                }
                break;
            case Password:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCMSdslParser.g:375:2: ( ( rule__DBDecl__Group_0__0 ) )
                    {
                    // InternalCMSdslParser.g:375:2: ( ( rule__DBDecl__Group_0__0 ) )
                    // InternalCMSdslParser.g:376:3: ( rule__DBDecl__Group_0__0 )
                    {
                     before(grammarAccess.getDBDeclAccess().getGroup_0()); 
                    // InternalCMSdslParser.g:377:3: ( rule__DBDecl__Group_0__0 )
                    // InternalCMSdslParser.g:377:4: rule__DBDecl__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DBDecl__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDBDeclAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCMSdslParser.g:381:2: ( ( rule__DBDecl__Group_1__0 ) )
                    {
                    // InternalCMSdslParser.g:381:2: ( ( rule__DBDecl__Group_1__0 ) )
                    // InternalCMSdslParser.g:382:3: ( rule__DBDecl__Group_1__0 )
                    {
                     before(grammarAccess.getDBDeclAccess().getGroup_1()); 
                    // InternalCMSdslParser.g:383:3: ( rule__DBDecl__Group_1__0 )
                    // InternalCMSdslParser.g:383:4: rule__DBDecl__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DBDecl__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDBDeclAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCMSdslParser.g:387:2: ( ( rule__DBDecl__Group_2__0 ) )
                    {
                    // InternalCMSdslParser.g:387:2: ( ( rule__DBDecl__Group_2__0 ) )
                    // InternalCMSdslParser.g:388:3: ( rule__DBDecl__Group_2__0 )
                    {
                     before(grammarAccess.getDBDeclAccess().getGroup_2()); 
                    // InternalCMSdslParser.g:389:3: ( rule__DBDecl__Group_2__0 )
                    // InternalCMSdslParser.g:389:4: rule__DBDecl__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DBDecl__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDBDeclAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCMSdslParser.g:393:2: ( ( rule__DBDecl__Group_3__0 ) )
                    {
                    // InternalCMSdslParser.g:393:2: ( ( rule__DBDecl__Group_3__0 ) )
                    // InternalCMSdslParser.g:394:3: ( rule__DBDecl__Group_3__0 )
                    {
                     before(grammarAccess.getDBDeclAccess().getGroup_3()); 
                    // InternalCMSdslParser.g:395:3: ( rule__DBDecl__Group_3__0 )
                    // InternalCMSdslParser.g:395:4: rule__DBDecl__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DBDecl__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDBDeclAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCMSdslParser.g:399:2: ( ( rule__DBDecl__Group_4__0 ) )
                    {
                    // InternalCMSdslParser.g:399:2: ( ( rule__DBDecl__Group_4__0 ) )
                    // InternalCMSdslParser.g:400:3: ( rule__DBDecl__Group_4__0 )
                    {
                     before(grammarAccess.getDBDeclAccess().getGroup_4()); 
                    // InternalCMSdslParser.g:401:3: ( rule__DBDecl__Group_4__0 )
                    // InternalCMSdslParser.g:401:4: rule__DBDecl__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DBDecl__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDBDeclAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCMSdslParser.g:405:2: ( ( rule__DBDecl__Group_5__0 ) )
                    {
                    // InternalCMSdslParser.g:405:2: ( ( rule__DBDecl__Group_5__0 ) )
                    // InternalCMSdslParser.g:406:3: ( rule__DBDecl__Group_5__0 )
                    {
                     before(grammarAccess.getDBDeclAccess().getGroup_5()); 
                    // InternalCMSdslParser.g:407:3: ( rule__DBDecl__Group_5__0 )
                    // InternalCMSdslParser.g:407:4: rule__DBDecl__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DBDecl__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDBDeclAccess().getGroup_5()); 

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
    // $ANTLR end "rule__DBDecl__Alternatives"


    // $ANTLR start "rule__FieldProp__Alternatives"
    // InternalCMSdslParser.g:415:1: rule__FieldProp__Alternatives : ( ( ( rule__FieldProp__Group_0__0 ) ) | ( ( rule__FieldProp__Group_1__0 ) ) );
    public final void rule__FieldProp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:419:1: ( ( ( rule__FieldProp__Group_0__0 ) ) | ( ( rule__FieldProp__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Default) ) {
                alt3=1;
            }
            else if ( (LA3_0==Test) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCMSdslParser.g:420:2: ( ( rule__FieldProp__Group_0__0 ) )
                    {
                    // InternalCMSdslParser.g:420:2: ( ( rule__FieldProp__Group_0__0 ) )
                    // InternalCMSdslParser.g:421:3: ( rule__FieldProp__Group_0__0 )
                    {
                     before(grammarAccess.getFieldPropAccess().getGroup_0()); 
                    // InternalCMSdslParser.g:422:3: ( rule__FieldProp__Group_0__0 )
                    // InternalCMSdslParser.g:422:4: rule__FieldProp__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldProp__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldPropAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCMSdslParser.g:426:2: ( ( rule__FieldProp__Group_1__0 ) )
                    {
                    // InternalCMSdslParser.g:426:2: ( ( rule__FieldProp__Group_1__0 ) )
                    // InternalCMSdslParser.g:427:3: ( rule__FieldProp__Group_1__0 )
                    {
                     before(grammarAccess.getFieldPropAccess().getGroup_1()); 
                    // InternalCMSdslParser.g:428:3: ( rule__FieldProp__Group_1__0 )
                    // InternalCMSdslParser.g:428:4: rule__FieldProp__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldProp__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldPropAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FieldProp__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalCMSdslParser.g:436:1: rule__DataType__Alternatives : ( ( ( rule__DataType__Group_0__0 ) ) | ( ( rule__DataType__Group_1__0 ) ) | ( ( rule__DataType__Group_2__0 ) ) | ( ( rule__DataType__Group_3__0 ) ) | ( ( rule__DataType__Group_4__0 ) ) | ( ( rule__DataType__Group_5__0 ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:440:1: ( ( ( rule__DataType__Group_0__0 ) ) | ( ( rule__DataType__Group_1__0 ) ) | ( ( rule__DataType__Group_2__0 ) ) | ( ( rule__DataType__Group_3__0 ) ) | ( ( rule__DataType__Group_4__0 ) ) | ( ( rule__DataType__Group_5__0 ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case String:
                {
                alt4=1;
                }
                break;
            case Date:
                {
                alt4=2;
                }
                break;
            case Int:
                {
                alt4=3;
                }
                break;
            case Long:
                {
                alt4=4;
                }
                break;
            case Bool:
                {
                alt4=5;
                }
                break;
            case Float:
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
                    // InternalCMSdslParser.g:441:2: ( ( rule__DataType__Group_0__0 ) )
                    {
                    // InternalCMSdslParser.g:441:2: ( ( rule__DataType__Group_0__0 ) )
                    // InternalCMSdslParser.g:442:3: ( rule__DataType__Group_0__0 )
                    {
                     before(grammarAccess.getDataTypeAccess().getGroup_0()); 
                    // InternalCMSdslParser.g:443:3: ( rule__DataType__Group_0__0 )
                    // InternalCMSdslParser.g:443:4: rule__DataType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCMSdslParser.g:447:2: ( ( rule__DataType__Group_1__0 ) )
                    {
                    // InternalCMSdslParser.g:447:2: ( ( rule__DataType__Group_1__0 ) )
                    // InternalCMSdslParser.g:448:3: ( rule__DataType__Group_1__0 )
                    {
                     before(grammarAccess.getDataTypeAccess().getGroup_1()); 
                    // InternalCMSdslParser.g:449:3: ( rule__DataType__Group_1__0 )
                    // InternalCMSdslParser.g:449:4: rule__DataType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataTypeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCMSdslParser.g:453:2: ( ( rule__DataType__Group_2__0 ) )
                    {
                    // InternalCMSdslParser.g:453:2: ( ( rule__DataType__Group_2__0 ) )
                    // InternalCMSdslParser.g:454:3: ( rule__DataType__Group_2__0 )
                    {
                     before(grammarAccess.getDataTypeAccess().getGroup_2()); 
                    // InternalCMSdslParser.g:455:3: ( rule__DataType__Group_2__0 )
                    // InternalCMSdslParser.g:455:4: rule__DataType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataTypeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCMSdslParser.g:459:2: ( ( rule__DataType__Group_3__0 ) )
                    {
                    // InternalCMSdslParser.g:459:2: ( ( rule__DataType__Group_3__0 ) )
                    // InternalCMSdslParser.g:460:3: ( rule__DataType__Group_3__0 )
                    {
                     before(grammarAccess.getDataTypeAccess().getGroup_3()); 
                    // InternalCMSdslParser.g:461:3: ( rule__DataType__Group_3__0 )
                    // InternalCMSdslParser.g:461:4: rule__DataType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataTypeAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCMSdslParser.g:465:2: ( ( rule__DataType__Group_4__0 ) )
                    {
                    // InternalCMSdslParser.g:465:2: ( ( rule__DataType__Group_4__0 ) )
                    // InternalCMSdslParser.g:466:3: ( rule__DataType__Group_4__0 )
                    {
                     before(grammarAccess.getDataTypeAccess().getGroup_4()); 
                    // InternalCMSdslParser.g:467:3: ( rule__DataType__Group_4__0 )
                    // InternalCMSdslParser.g:467:4: rule__DataType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataTypeAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCMSdslParser.g:471:2: ( ( rule__DataType__Group_5__0 ) )
                    {
                    // InternalCMSdslParser.g:471:2: ( ( rule__DataType__Group_5__0 ) )
                    // InternalCMSdslParser.g:472:3: ( rule__DataType__Group_5__0 )
                    {
                     before(grammarAccess.getDataTypeAccess().getGroup_5()); 
                    // InternalCMSdslParser.g:473:3: ( rule__DataType__Group_5__0 )
                    // InternalCMSdslParser.g:473:4: rule__DataType__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataTypeAccess().getGroup_5()); 

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
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__Project__Group__0"
    // InternalCMSdslParser.g:481:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:485:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // InternalCMSdslParser.g:486:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Project__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalCMSdslParser.g:493:1: rule__Project__Group__0__Impl : ( Project ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:497:1: ( ( Project ) )
            // InternalCMSdslParser.g:498:1: ( Project )
            {
            // InternalCMSdslParser.g:498:1: ( Project )
            // InternalCMSdslParser.g:499:2: Project
            {
             before(grammarAccess.getProjectAccess().getProjectKeyword_0()); 
            match(input,Project,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getProjectKeyword_0()); 

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
    // $ANTLR end "rule__Project__Group__0__Impl"


    // $ANTLR start "rule__Project__Group__1"
    // InternalCMSdslParser.g:508:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:512:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // InternalCMSdslParser.g:513:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Project__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalCMSdslParser.g:520:1: rule__Project__Group__1__Impl : ( ( rule__Project__NameAssignment_1 ) ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:524:1: ( ( ( rule__Project__NameAssignment_1 ) ) )
            // InternalCMSdslParser.g:525:1: ( ( rule__Project__NameAssignment_1 ) )
            {
            // InternalCMSdslParser.g:525:1: ( ( rule__Project__NameAssignment_1 ) )
            // InternalCMSdslParser.g:526:2: ( rule__Project__NameAssignment_1 )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment_1()); 
            // InternalCMSdslParser.g:527:2: ( rule__Project__NameAssignment_1 )
            // InternalCMSdslParser.g:527:3: rule__Project__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Project__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getNameAssignment_1()); 

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
    // InternalCMSdslParser.g:535:1: rule__Project__Group__2 : rule__Project__Group__2__Impl rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:539:1: ( rule__Project__Group__2__Impl rule__Project__Group__3 )
            // InternalCMSdslParser.g:540:2: rule__Project__Group__2__Impl rule__Project__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Project__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalCMSdslParser.g:547:1: rule__Project__Group__2__Impl : ( Colon ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:551:1: ( ( Colon ) )
            // InternalCMSdslParser.g:552:1: ( Colon )
            {
            // InternalCMSdslParser.g:552:1: ( Colon )
            // InternalCMSdslParser.g:553:2: Colon
            {
             before(grammarAccess.getProjectAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getColonKeyword_2()); 

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
    // InternalCMSdslParser.g:562:1: rule__Project__Group__3 : rule__Project__Group__3__Impl rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:566:1: ( rule__Project__Group__3__Impl rule__Project__Group__4 )
            // InternalCMSdslParser.g:567:2: rule__Project__Group__3__Impl rule__Project__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Project__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalCMSdslParser.g:574:1: rule__Project__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__Project__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:578:1: ( ( RULE_BEGIN ) )
            // InternalCMSdslParser.g:579:1: ( RULE_BEGIN )
            {
            // InternalCMSdslParser.g:579:1: ( RULE_BEGIN )
            // InternalCMSdslParser.g:580:2: RULE_BEGIN
            {
             before(grammarAccess.getProjectAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getBEGINTerminalRuleCall_3()); 

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
    // InternalCMSdslParser.g:589:1: rule__Project__Group__4 : rule__Project__Group__4__Impl rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:593:1: ( rule__Project__Group__4__Impl rule__Project__Group__5 )
            // InternalCMSdslParser.g:594:2: rule__Project__Group__4__Impl rule__Project__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Project__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalCMSdslParser.g:601:1: rule__Project__Group__4__Impl : ( ( rule__Project__ElementsAssignment_4 )* ) ;
    public final void rule__Project__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:605:1: ( ( ( rule__Project__ElementsAssignment_4 )* ) )
            // InternalCMSdslParser.g:606:1: ( ( rule__Project__ElementsAssignment_4 )* )
            {
            // InternalCMSdslParser.g:606:1: ( ( rule__Project__ElementsAssignment_4 )* )
            // InternalCMSdslParser.g:607:2: ( rule__Project__ElementsAssignment_4 )*
            {
             before(grammarAccess.getProjectAccess().getElementsAssignment_4()); 
            // InternalCMSdslParser.g:608:2: ( rule__Project__ElementsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Database||LA5_0==Entity) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCMSdslParser.g:608:3: rule__Project__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Project__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getElementsAssignment_4()); 

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
    // InternalCMSdslParser.g:616:1: rule__Project__Group__5 : rule__Project__Group__5__Impl ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:620:1: ( rule__Project__Group__5__Impl )
            // InternalCMSdslParser.g:621:2: rule__Project__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__5__Impl();

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
    // InternalCMSdslParser.g:627:1: rule__Project__Group__5__Impl : ( RULE_END ) ;
    public final void rule__Project__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:631:1: ( ( RULE_END ) )
            // InternalCMSdslParser.g:632:1: ( RULE_END )
            {
            // InternalCMSdslParser.g:632:1: ( RULE_END )
            // InternalCMSdslParser.g:633:2: RULE_END
            {
             before(grammarAccess.getProjectAccess().getENDTerminalRuleCall_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getENDTerminalRuleCall_5()); 

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


    // $ANTLR start "rule__DBConfig__Group__0"
    // InternalCMSdslParser.g:643:1: rule__DBConfig__Group__0 : rule__DBConfig__Group__0__Impl rule__DBConfig__Group__1 ;
    public final void rule__DBConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:647:1: ( rule__DBConfig__Group__0__Impl rule__DBConfig__Group__1 )
            // InternalCMSdslParser.g:648:2: rule__DBConfig__Group__0__Impl rule__DBConfig__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__DBConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBConfig__Group__1();

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
    // $ANTLR end "rule__DBConfig__Group__0"


    // $ANTLR start "rule__DBConfig__Group__0__Impl"
    // InternalCMSdslParser.g:655:1: rule__DBConfig__Group__0__Impl : ( () ) ;
    public final void rule__DBConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:659:1: ( ( () ) )
            // InternalCMSdslParser.g:660:1: ( () )
            {
            // InternalCMSdslParser.g:660:1: ( () )
            // InternalCMSdslParser.g:661:2: ()
            {
             before(grammarAccess.getDBConfigAccess().getDBConfigAction_0()); 
            // InternalCMSdslParser.g:662:2: ()
            // InternalCMSdslParser.g:662:3: 
            {
            }

             after(grammarAccess.getDBConfigAccess().getDBConfigAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBConfig__Group__0__Impl"


    // $ANTLR start "rule__DBConfig__Group__1"
    // InternalCMSdslParser.g:670:1: rule__DBConfig__Group__1 : rule__DBConfig__Group__1__Impl rule__DBConfig__Group__2 ;
    public final void rule__DBConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:674:1: ( rule__DBConfig__Group__1__Impl rule__DBConfig__Group__2 )
            // InternalCMSdslParser.g:675:2: rule__DBConfig__Group__1__Impl rule__DBConfig__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DBConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBConfig__Group__2();

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
    // $ANTLR end "rule__DBConfig__Group__1"


    // $ANTLR start "rule__DBConfig__Group__1__Impl"
    // InternalCMSdslParser.g:682:1: rule__DBConfig__Group__1__Impl : ( ( rule__DBConfig__TypeAssignment_1 ) ) ;
    public final void rule__DBConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:686:1: ( ( ( rule__DBConfig__TypeAssignment_1 ) ) )
            // InternalCMSdslParser.g:687:1: ( ( rule__DBConfig__TypeAssignment_1 ) )
            {
            // InternalCMSdslParser.g:687:1: ( ( rule__DBConfig__TypeAssignment_1 ) )
            // InternalCMSdslParser.g:688:2: ( rule__DBConfig__TypeAssignment_1 )
            {
             before(grammarAccess.getDBConfigAccess().getTypeAssignment_1()); 
            // InternalCMSdslParser.g:689:2: ( rule__DBConfig__TypeAssignment_1 )
            // InternalCMSdslParser.g:689:3: rule__DBConfig__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DBConfig__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDBConfigAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__DBConfig__Group__1__Impl"


    // $ANTLR start "rule__DBConfig__Group__2"
    // InternalCMSdslParser.g:697:1: rule__DBConfig__Group__2 : rule__DBConfig__Group__2__Impl rule__DBConfig__Group__3 ;
    public final void rule__DBConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:701:1: ( rule__DBConfig__Group__2__Impl rule__DBConfig__Group__3 )
            // InternalCMSdslParser.g:702:2: rule__DBConfig__Group__2__Impl rule__DBConfig__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__DBConfig__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBConfig__Group__3();

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
    // $ANTLR end "rule__DBConfig__Group__2"


    // $ANTLR start "rule__DBConfig__Group__2__Impl"
    // InternalCMSdslParser.g:709:1: rule__DBConfig__Group__2__Impl : ( Colon ) ;
    public final void rule__DBConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:713:1: ( ( Colon ) )
            // InternalCMSdslParser.g:714:1: ( Colon )
            {
            // InternalCMSdslParser.g:714:1: ( Colon )
            // InternalCMSdslParser.g:715:2: Colon
            {
             before(grammarAccess.getDBConfigAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getDBConfigAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__DBConfig__Group__2__Impl"


    // $ANTLR start "rule__DBConfig__Group__3"
    // InternalCMSdslParser.g:724:1: rule__DBConfig__Group__3 : rule__DBConfig__Group__3__Impl rule__DBConfig__Group__4 ;
    public final void rule__DBConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:728:1: ( rule__DBConfig__Group__3__Impl rule__DBConfig__Group__4 )
            // InternalCMSdslParser.g:729:2: rule__DBConfig__Group__3__Impl rule__DBConfig__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__DBConfig__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBConfig__Group__4();

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
    // $ANTLR end "rule__DBConfig__Group__3"


    // $ANTLR start "rule__DBConfig__Group__3__Impl"
    // InternalCMSdslParser.g:736:1: rule__DBConfig__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__DBConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:740:1: ( ( RULE_BEGIN ) )
            // InternalCMSdslParser.g:741:1: ( RULE_BEGIN )
            {
            // InternalCMSdslParser.g:741:1: ( RULE_BEGIN )
            // InternalCMSdslParser.g:742:2: RULE_BEGIN
            {
             before(grammarAccess.getDBConfigAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getDBConfigAccess().getBEGINTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__DBConfig__Group__3__Impl"


    // $ANTLR start "rule__DBConfig__Group__4"
    // InternalCMSdslParser.g:751:1: rule__DBConfig__Group__4 : rule__DBConfig__Group__4__Impl rule__DBConfig__Group__5 ;
    public final void rule__DBConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:755:1: ( rule__DBConfig__Group__4__Impl rule__DBConfig__Group__5 )
            // InternalCMSdslParser.g:756:2: rule__DBConfig__Group__4__Impl rule__DBConfig__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__DBConfig__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBConfig__Group__5();

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
    // $ANTLR end "rule__DBConfig__Group__4"


    // $ANTLR start "rule__DBConfig__Group__4__Impl"
    // InternalCMSdslParser.g:763:1: rule__DBConfig__Group__4__Impl : ( ( rule__DBConfig__ConfigAssignment_4 )* ) ;
    public final void rule__DBConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:767:1: ( ( ( rule__DBConfig__ConfigAssignment_4 )* ) )
            // InternalCMSdslParser.g:768:1: ( ( rule__DBConfig__ConfigAssignment_4 )* )
            {
            // InternalCMSdslParser.g:768:1: ( ( rule__DBConfig__ConfigAssignment_4 )* )
            // InternalCMSdslParser.g:769:2: ( rule__DBConfig__ConfigAssignment_4 )*
            {
             before(grammarAccess.getDBConfigAccess().getConfigAssignment_4()); 
            // InternalCMSdslParser.g:770:2: ( rule__DBConfig__ConfigAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=Hostname && LA6_0<=Username)||(LA6_0>=Dialect && LA6_0<=Library)||LA6_0==Port) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCMSdslParser.g:770:3: rule__DBConfig__ConfigAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__DBConfig__ConfigAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDBConfigAccess().getConfigAssignment_4()); 

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
    // $ANTLR end "rule__DBConfig__Group__4__Impl"


    // $ANTLR start "rule__DBConfig__Group__5"
    // InternalCMSdslParser.g:778:1: rule__DBConfig__Group__5 : rule__DBConfig__Group__5__Impl ;
    public final void rule__DBConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:782:1: ( rule__DBConfig__Group__5__Impl )
            // InternalCMSdslParser.g:783:2: rule__DBConfig__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DBConfig__Group__5__Impl();

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
    // $ANTLR end "rule__DBConfig__Group__5"


    // $ANTLR start "rule__DBConfig__Group__5__Impl"
    // InternalCMSdslParser.g:789:1: rule__DBConfig__Group__5__Impl : ( RULE_END ) ;
    public final void rule__DBConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:793:1: ( ( RULE_END ) )
            // InternalCMSdslParser.g:794:1: ( RULE_END )
            {
            // InternalCMSdslParser.g:794:1: ( RULE_END )
            // InternalCMSdslParser.g:795:2: RULE_END
            {
             before(grammarAccess.getDBConfigAccess().getENDTerminalRuleCall_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getDBConfigAccess().getENDTerminalRuleCall_5()); 

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
    // $ANTLR end "rule__DBConfig__Group__5__Impl"


    // $ANTLR start "rule__DBDecl__Group_0__0"
    // InternalCMSdslParser.g:805:1: rule__DBDecl__Group_0__0 : rule__DBDecl__Group_0__0__Impl rule__DBDecl__Group_0__1 ;
    public final void rule__DBDecl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:809:1: ( rule__DBDecl__Group_0__0__Impl rule__DBDecl__Group_0__1 )
            // InternalCMSdslParser.g:810:2: rule__DBDecl__Group_0__0__Impl rule__DBDecl__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__DBDecl__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBDecl__Group_0__1();

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
    // $ANTLR end "rule__DBDecl__Group_0__0"


    // $ANTLR start "rule__DBDecl__Group_0__0__Impl"
    // InternalCMSdslParser.g:817:1: rule__DBDecl__Group_0__0__Impl : ( () ) ;
    public final void rule__DBDecl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:821:1: ( ( () ) )
            // InternalCMSdslParser.g:822:1: ( () )
            {
            // InternalCMSdslParser.g:822:1: ( () )
            // InternalCMSdslParser.g:823:2: ()
            {
             before(grammarAccess.getDBDeclAccess().getLibAction_0_0()); 
            // InternalCMSdslParser.g:824:2: ()
            // InternalCMSdslParser.g:824:3: 
            {
            }

             after(grammarAccess.getDBDeclAccess().getLibAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBDecl__Group_0__0__Impl"


    // $ANTLR start "rule__DBDecl__Group_0__1"
    // InternalCMSdslParser.g:832:1: rule__DBDecl__Group_0__1 : rule__DBDecl__Group_0__1__Impl rule__DBDecl__Group_0__2 ;
    public final void rule__DBDecl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:836:1: ( rule__DBDecl__Group_0__1__Impl rule__DBDecl__Group_0__2 )
            // InternalCMSdslParser.g:837:2: rule__DBDecl__Group_0__1__Impl rule__DBDecl__Group_0__2
            {
            pushFollow(FOLLOW_4);
            rule__DBDecl__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBDecl__Group_0__2();

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
    // $ANTLR end "rule__DBDecl__Group_0__1"


    // $ANTLR start "rule__DBDecl__Group_0__1__Impl"
    // InternalCMSdslParser.g:844:1: rule__DBDecl__Group_0__1__Impl : ( ( rule__DBDecl__TypeAssignment_0_1 ) ) ;
    public final void rule__DBDecl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:848:1: ( ( ( rule__DBDecl__TypeAssignment_0_1 ) ) )
            // InternalCMSdslParser.g:849:1: ( ( rule__DBDecl__TypeAssignment_0_1 ) )
            {
            // InternalCMSdslParser.g:849:1: ( ( rule__DBDecl__TypeAssignment_0_1 ) )
            // InternalCMSdslParser.g:850:2: ( rule__DBDecl__TypeAssignment_0_1 )
            {
             before(grammarAccess.getDBDeclAccess().getTypeAssignment_0_1()); 
            // InternalCMSdslParser.g:851:2: ( rule__DBDecl__TypeAssignment_0_1 )
            // InternalCMSdslParser.g:851:3: rule__DBDecl__TypeAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DBDecl__TypeAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDBDeclAccess().getTypeAssignment_0_1()); 

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
    // $ANTLR end "rule__DBDecl__Group_0__1__Impl"


    // $ANTLR start "rule__DBDecl__Group_0__2"
    // InternalCMSdslParser.g:859:1: rule__DBDecl__Group_0__2 : rule__DBDecl__Group_0__2__Impl rule__DBDecl__Group_0__3 ;
    public final void rule__DBDecl__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:863:1: ( rule__DBDecl__Group_0__2__Impl rule__DBDecl__Group_0__3 )
            // InternalCMSdslParser.g:864:2: rule__DBDecl__Group_0__2__Impl rule__DBDecl__Group_0__3
            {
            pushFollow(FOLLOW_12);
            rule__DBDecl__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBDecl__Group_0__3();

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
    // $ANTLR end "rule__DBDecl__Group_0__2"


    // $ANTLR start "rule__DBDecl__Group_0__2__Impl"
    // InternalCMSdslParser.g:871:1: rule__DBDecl__Group_0__2__Impl : ( Colon ) ;
    public final void rule__DBDecl__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:875:1: ( ( Colon ) )
            // InternalCMSdslParser.g:876:1: ( Colon )
            {
            // InternalCMSdslParser.g:876:1: ( Colon )
            // InternalCMSdslParser.g:877:2: Colon
            {
             before(grammarAccess.getDBDeclAccess().getColonKeyword_0_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getDBDeclAccess().getColonKeyword_0_2()); 

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
    // $ANTLR end "rule__DBDecl__Group_0__2__Impl"


    // $ANTLR start "rule__DBDecl__Group_0__3"
    // InternalCMSdslParser.g:886:1: rule__DBDecl__Group_0__3 : rule__DBDecl__Group_0__3__Impl ;
    public final void rule__DBDecl__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:890:1: ( rule__DBDecl__Group_0__3__Impl )
            // InternalCMSdslParser.g:891:2: rule__DBDecl__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DBDecl__Group_0__3__Impl();

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
    // $ANTLR end "rule__DBDecl__Group_0__3"


    // $ANTLR start "rule__DBDecl__Group_0__3__Impl"
    // InternalCMSdslParser.g:897:1: rule__DBDecl__Group_0__3__Impl : ( ( rule__DBDecl__ValueAssignment_0_3 ) ) ;
    public final void rule__DBDecl__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:901:1: ( ( ( rule__DBDecl__ValueAssignment_0_3 ) ) )
            // InternalCMSdslParser.g:902:1: ( ( rule__DBDecl__ValueAssignment_0_3 ) )
            {
            // InternalCMSdslParser.g:902:1: ( ( rule__DBDecl__ValueAssignment_0_3 ) )
            // InternalCMSdslParser.g:903:2: ( rule__DBDecl__ValueAssignment_0_3 )
            {
             before(grammarAccess.getDBDeclAccess().getValueAssignment_0_3()); 
            // InternalCMSdslParser.g:904:2: ( rule__DBDecl__ValueAssignment_0_3 )
            // InternalCMSdslParser.g:904:3: rule__DBDecl__ValueAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__DBDecl__ValueAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getDBDeclAccess().getValueAssignment_0_3()); 

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
    // $ANTLR end "rule__DBDecl__Group_0__3__Impl"


    // $ANTLR start "rule__DBDecl__Group_1__0"
    // InternalCMSdslParser.g:913:1: rule__DBDecl__Group_1__0 : rule__DBDecl__Group_1__0__Impl rule__DBDecl__Group_1__1 ;
    public final void rule__DBDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:917:1: ( rule__DBDecl__Group_1__0__Impl rule__DBDecl__Group_1__1 )
            // InternalCMSdslParser.g:918:2: rule__DBDecl__Group_1__0__Impl rule__DBDecl__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__DBDecl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBDecl__Group_1__1();

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
    // $ANTLR end "rule__DBDecl__Group_1__0"


    // $ANTLR start "rule__DBDecl__Group_1__0__Impl"
    // InternalCMSdslParser.g:925:1: rule__DBDecl__Group_1__0__Impl : ( () ) ;
    public final void rule__DBDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:929:1: ( ( () ) )
            // InternalCMSdslParser.g:930:1: ( () )
            {
            // InternalCMSdslParser.g:930:1: ( () )
            // InternalCMSdslParser.g:931:2: ()
            {
             before(grammarAccess.getDBDeclAccess().getHostAction_1_0()); 
            // InternalCMSdslParser.g:932:2: ()
            // InternalCMSdslParser.g:932:3: 
            {
            }

             after(grammarAccess.getDBDeclAccess().getHostAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBDecl__Group_1__0__Impl"


    // $ANTLR start "rule__DBDecl__Group_1__1"
    // InternalCMSdslParser.g:940:1: rule__DBDecl__Group_1__1 : rule__DBDecl__Group_1__1__Impl rule__DBDecl__Group_1__2 ;
    public final void rule__DBDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:944:1: ( rule__DBDecl__Group_1__1__Impl rule__DBDecl__Group_1__2 )
            // InternalCMSdslParser.g:945:2: rule__DBDecl__Group_1__1__Impl rule__DBDecl__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__DBDecl__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBDecl__Group_1__2();

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
    // $ANTLR end "rule__DBDecl__Group_1__1"


    // $ANTLR start "rule__DBDecl__Group_1__1__Impl"
    // InternalCMSdslParser.g:952:1: rule__DBDecl__Group_1__1__Impl : ( ( rule__DBDecl__TypeAssignment_1_1 ) ) ;
    public final void rule__DBDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:956:1: ( ( ( rule__DBDecl__TypeAssignment_1_1 ) ) )
            // InternalCMSdslParser.g:957:1: ( ( rule__DBDecl__TypeAssignment_1_1 ) )
            {
            // InternalCMSdslParser.g:957:1: ( ( rule__DBDecl__TypeAssignment_1_1 ) )
            // InternalCMSdslParser.g:958:2: ( rule__DBDecl__TypeAssignment_1_1 )
            {
             before(grammarAccess.getDBDeclAccess().getTypeAssignment_1_1()); 
            // InternalCMSdslParser.g:959:2: ( rule__DBDecl__TypeAssignment_1_1 )
            // InternalCMSdslParser.g:959:3: rule__DBDecl__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DBDecl__TypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDBDeclAccess().getTypeAssignment_1_1()); 

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
    // $ANTLR end "rule__DBDecl__Group_1__1__Impl"


    // $ANTLR start "rule__DBDecl__Group_1__2"
    // InternalCMSdslParser.g:967:1: rule__DBDecl__Group_1__2 : rule__DBDecl__Group_1__2__Impl rule__DBDecl__Group_1__3 ;
    public final void rule__DBDecl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:971:1: ( rule__DBDecl__Group_1__2__Impl rule__DBDecl__Group_1__3 )
            // InternalCMSdslParser.g:972:2: rule__DBDecl__Group_1__2__Impl rule__DBDecl__Group_1__3
            {
            pushFollow(FOLLOW_12);
            rule__DBDecl__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBDecl__Group_1__3();

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
    // $ANTLR end "rule__DBDecl__Group_1__2"


    // $ANTLR start "rule__DBDecl__Group_1__2__Impl"
    // InternalCMSdslParser.g:979:1: rule__DBDecl__Group_1__2__Impl : ( Colon ) ;
    public final void rule__DBDecl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:983:1: ( ( Colon ) )
            // InternalCMSdslParser.g:984:1: ( Colon )
            {
            // InternalCMSdslParser.g:984:1: ( Colon )
            // InternalCMSdslParser.g:985:2: Colon
            {
             before(grammarAccess.getDBDeclAccess().getColonKeyword_1_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getDBDeclAccess().getColonKeyword_1_2()); 

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
    // $ANTLR end "rule__DBDecl__Group_1__2__Impl"


    // $ANTLR start "rule__DBDecl__Group_1__3"
    // InternalCMSdslParser.g:994:1: rule__DBDecl__Group_1__3 : rule__DBDecl__Group_1__3__Impl ;
    public final void rule__DBDecl__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:998:1: ( rule__DBDecl__Group_1__3__Impl )
            // InternalCMSdslParser.g:999:2: rule__DBDecl__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DBDecl__Group_1__3__Impl();

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
    // $ANTLR end "rule__DBDecl__Group_1__3"


    // $ANTLR start "rule__DBDecl__Group_1__3__Impl"
    // InternalCMSdslParser.g:1005:1: rule__DBDecl__Group_1__3__Impl : ( ( rule__DBDecl__ValueAssignment_1_3 ) ) ;
    public final void rule__DBDecl__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1009:1: ( ( ( rule__DBDecl__ValueAssignment_1_3 ) ) )
            // InternalCMSdslParser.g:1010:1: ( ( rule__DBDecl__ValueAssignment_1_3 ) )
            {
            // InternalCMSdslParser.g:1010:1: ( ( rule__DBDecl__ValueAssignment_1_3 ) )
            // InternalCMSdslParser.g:1011:2: ( rule__DBDecl__ValueAssignment_1_3 )
            {
             before(grammarAccess.getDBDeclAccess().getValueAssignment_1_3()); 
            // InternalCMSdslParser.g:1012:2: ( rule__DBDecl__ValueAssignment_1_3 )
            // InternalCMSdslParser.g:1012:3: rule__DBDecl__ValueAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__DBDecl__ValueAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getDBDeclAccess().getValueAssignment_1_3()); 

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
    // $ANTLR end "rule__DBDecl__Group_1__3__Impl"


    // $ANTLR start "rule__DBDecl__Group_2__0"
    // InternalCMSdslParser.g:1021:1: rule__DBDecl__Group_2__0 : rule__DBDecl__Group_2__0__Impl rule__DBDecl__Group_2__1 ;
    public final void rule__DBDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1025:1: ( rule__DBDecl__Group_2__0__Impl rule__DBDecl__Group_2__1 )
            // InternalCMSdslParser.g:1026:2: rule__DBDecl__Group_2__0__Impl rule__DBDecl__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__DBDecl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBDecl__Group_2__1();

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
    // $ANTLR end "rule__DBDecl__Group_2__0"


    // $ANTLR start "rule__DBDecl__Group_2__0__Impl"
    // InternalCMSdslParser.g:1033:1: rule__DBDecl__Group_2__0__Impl : ( () ) ;
    public final void rule__DBDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1037:1: ( ( () ) )
            // InternalCMSdslParser.g:1038:1: ( () )
            {
            // InternalCMSdslParser.g:1038:1: ( () )
            // InternalCMSdslParser.g:1039:2: ()
            {
             before(grammarAccess.getDBDeclAccess().getPortAction_2_0()); 
            // InternalCMSdslParser.g:1040:2: ()
            // InternalCMSdslParser.g:1040:3: 
            {
            }

             after(grammarAccess.getDBDeclAccess().getPortAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBDecl__Group_2__0__Impl"


    // $ANTLR start "rule__DBDecl__Group_2__1"
    // InternalCMSdslParser.g:1048:1: rule__DBDecl__Group_2__1 : rule__DBDecl__Group_2__1__Impl rule__DBDecl__Group_2__2 ;
    public final void rule__DBDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1052:1: ( rule__DBDecl__Group_2__1__Impl rule__DBDecl__Group_2__2 )
            // InternalCMSdslParser.g:1053:2: rule__DBDecl__Group_2__1__Impl rule__DBDecl__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__DBDecl__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBDecl__Group_2__2();

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
    // $ANTLR end "rule__DBDecl__Group_2__1"


    // $ANTLR start "rule__DBDecl__Group_2__1__Impl"
    // InternalCMSdslParser.g:1060:1: rule__DBDecl__Group_2__1__Impl : ( ( rule__DBDecl__TypeAssignment_2_1 ) ) ;
    public final void rule__DBDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1064:1: ( ( ( rule__DBDecl__TypeAssignment_2_1 ) ) )
            // InternalCMSdslParser.g:1065:1: ( ( rule__DBDecl__TypeAssignment_2_1 ) )
            {
            // InternalCMSdslParser.g:1065:1: ( ( rule__DBDecl__TypeAssignment_2_1 ) )
            // InternalCMSdslParser.g:1066:2: ( rule__DBDecl__TypeAssignment_2_1 )
            {
             before(grammarAccess.getDBDeclAccess().getTypeAssignment_2_1()); 
            // InternalCMSdslParser.g:1067:2: ( rule__DBDecl__TypeAssignment_2_1 )
            // InternalCMSdslParser.g:1067:3: rule__DBDecl__TypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DBDecl__TypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDBDeclAccess().getTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__DBDecl__Group_2__1__Impl"


    // $ANTLR start "rule__DBDecl__Group_2__2"
    // InternalCMSdslParser.g:1075:1: rule__DBDecl__Group_2__2 : rule__DBDecl__Group_2__2__Impl rule__DBDecl__Group_2__3 ;
    public final void rule__DBDecl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1079:1: ( rule__DBDecl__Group_2__2__Impl rule__DBDecl__Group_2__3 )
            // InternalCMSdslParser.g:1080:2: rule__DBDecl__Group_2__2__Impl rule__DBDecl__Group_2__3
            {
            pushFollow(FOLLOW_15);
            rule__DBDecl__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBDecl__Group_2__3();

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
    // $ANTLR end "rule__DBDecl__Group_2__2"


    // $ANTLR start "rule__DBDecl__Group_2__2__Impl"
    // InternalCMSdslParser.g:1087:1: rule__DBDecl__Group_2__2__Impl : ( Colon ) ;
    public final void rule__DBDecl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1091:1: ( ( Colon ) )
            // InternalCMSdslParser.g:1092:1: ( Colon )
            {
            // InternalCMSdslParser.g:1092:1: ( Colon )
            // InternalCMSdslParser.g:1093:2: Colon
            {
             before(grammarAccess.getDBDeclAccess().getColonKeyword_2_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getDBDeclAccess().getColonKeyword_2_2()); 

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
    // $ANTLR end "rule__DBDecl__Group_2__2__Impl"


    // $ANTLR start "rule__DBDecl__Group_2__3"
    // InternalCMSdslParser.g:1102:1: rule__DBDecl__Group_2__3 : rule__DBDecl__Group_2__3__Impl ;
    public final void rule__DBDecl__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1106:1: ( rule__DBDecl__Group_2__3__Impl )
            // InternalCMSdslParser.g:1107:2: rule__DBDecl__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DBDecl__Group_2__3__Impl();

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
    // $ANTLR end "rule__DBDecl__Group_2__3"


    // $ANTLR start "rule__DBDecl__Group_2__3__Impl"
    // InternalCMSdslParser.g:1113:1: rule__DBDecl__Group_2__3__Impl : ( ( rule__DBDecl__ValueAssignment_2_3 ) ) ;
    public final void rule__DBDecl__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1117:1: ( ( ( rule__DBDecl__ValueAssignment_2_3 ) ) )
            // InternalCMSdslParser.g:1118:1: ( ( rule__DBDecl__ValueAssignment_2_3 ) )
            {
            // InternalCMSdslParser.g:1118:1: ( ( rule__DBDecl__ValueAssignment_2_3 ) )
            // InternalCMSdslParser.g:1119:2: ( rule__DBDecl__ValueAssignment_2_3 )
            {
             before(grammarAccess.getDBDeclAccess().getValueAssignment_2_3()); 
            // InternalCMSdslParser.g:1120:2: ( rule__DBDecl__ValueAssignment_2_3 )
            // InternalCMSdslParser.g:1120:3: rule__DBDecl__ValueAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__DBDecl__ValueAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getDBDeclAccess().getValueAssignment_2_3()); 

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
    // $ANTLR end "rule__DBDecl__Group_2__3__Impl"


    // $ANTLR start "rule__DBDecl__Group_3__0"
    // InternalCMSdslParser.g:1129:1: rule__DBDecl__Group_3__0 : rule__DBDecl__Group_3__0__Impl rule__DBDecl__Group_3__1 ;
    public final void rule__DBDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1133:1: ( rule__DBDecl__Group_3__0__Impl rule__DBDecl__Group_3__1 )
            // InternalCMSdslParser.g:1134:2: rule__DBDecl__Group_3__0__Impl rule__DBDecl__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__DBDecl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBDecl__Group_3__1();

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
    // $ANTLR end "rule__DBDecl__Group_3__0"


    // $ANTLR start "rule__DBDecl__Group_3__0__Impl"
    // InternalCMSdslParser.g:1141:1: rule__DBDecl__Group_3__0__Impl : ( () ) ;
    public final void rule__DBDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1145:1: ( ( () ) )
            // InternalCMSdslParser.g:1146:1: ( () )
            {
            // InternalCMSdslParser.g:1146:1: ( () )
            // InternalCMSdslParser.g:1147:2: ()
            {
             before(grammarAccess.getDBDeclAccess().getDialectAction_3_0()); 
            // InternalCMSdslParser.g:1148:2: ()
            // InternalCMSdslParser.g:1148:3: 
            {
            }

             after(grammarAccess.getDBDeclAccess().getDialectAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBDecl__Group_3__0__Impl"


    // $ANTLR start "rule__DBDecl__Group_3__1"
    // InternalCMSdslParser.g:1156:1: rule__DBDecl__Group_3__1 : rule__DBDecl__Group_3__1__Impl rule__DBDecl__Group_3__2 ;
    public final void rule__DBDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1160:1: ( rule__DBDecl__Group_3__1__Impl rule__DBDecl__Group_3__2 )
            // InternalCMSdslParser.g:1161:2: rule__DBDecl__Group_3__1__Impl rule__DBDecl__Group_3__2
            {
            pushFollow(FOLLOW_4);
            rule__DBDecl__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBDecl__Group_3__2();

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
    // $ANTLR end "rule__DBDecl__Group_3__1"


    // $ANTLR start "rule__DBDecl__Group_3__1__Impl"
    // InternalCMSdslParser.g:1168:1: rule__DBDecl__Group_3__1__Impl : ( ( rule__DBDecl__TypeAssignment_3_1 ) ) ;
    public final void rule__DBDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1172:1: ( ( ( rule__DBDecl__TypeAssignment_3_1 ) ) )
            // InternalCMSdslParser.g:1173:1: ( ( rule__DBDecl__TypeAssignment_3_1 ) )
            {
            // InternalCMSdslParser.g:1173:1: ( ( rule__DBDecl__TypeAssignment_3_1 ) )
            // InternalCMSdslParser.g:1174:2: ( rule__DBDecl__TypeAssignment_3_1 )
            {
             before(grammarAccess.getDBDeclAccess().getTypeAssignment_3_1()); 
            // InternalCMSdslParser.g:1175:2: ( rule__DBDecl__TypeAssignment_3_1 )
            // InternalCMSdslParser.g:1175:3: rule__DBDecl__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DBDecl__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDBDeclAccess().getTypeAssignment_3_1()); 

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
    // $ANTLR end "rule__DBDecl__Group_3__1__Impl"


    // $ANTLR start "rule__DBDecl__Group_3__2"
    // InternalCMSdslParser.g:1183:1: rule__DBDecl__Group_3__2 : rule__DBDecl__Group_3__2__Impl rule__DBDecl__Group_3__3 ;
    public final void rule__DBDecl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1187:1: ( rule__DBDecl__Group_3__2__Impl rule__DBDecl__Group_3__3 )
            // InternalCMSdslParser.g:1188:2: rule__DBDecl__Group_3__2__Impl rule__DBDecl__Group_3__3
            {
            pushFollow(FOLLOW_12);
            rule__DBDecl__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBDecl__Group_3__3();

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
    // $ANTLR end "rule__DBDecl__Group_3__2"


    // $ANTLR start "rule__DBDecl__Group_3__2__Impl"
    // InternalCMSdslParser.g:1195:1: rule__DBDecl__Group_3__2__Impl : ( Colon ) ;
    public final void rule__DBDecl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1199:1: ( ( Colon ) )
            // InternalCMSdslParser.g:1200:1: ( Colon )
            {
            // InternalCMSdslParser.g:1200:1: ( Colon )
            // InternalCMSdslParser.g:1201:2: Colon
            {
             before(grammarAccess.getDBDeclAccess().getColonKeyword_3_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getDBDeclAccess().getColonKeyword_3_2()); 

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
    // $ANTLR end "rule__DBDecl__Group_3__2__Impl"


    // $ANTLR start "rule__DBDecl__Group_3__3"
    // InternalCMSdslParser.g:1210:1: rule__DBDecl__Group_3__3 : rule__DBDecl__Group_3__3__Impl ;
    public final void rule__DBDecl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1214:1: ( rule__DBDecl__Group_3__3__Impl )
            // InternalCMSdslParser.g:1215:2: rule__DBDecl__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DBDecl__Group_3__3__Impl();

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
    // $ANTLR end "rule__DBDecl__Group_3__3"


    // $ANTLR start "rule__DBDecl__Group_3__3__Impl"
    // InternalCMSdslParser.g:1221:1: rule__DBDecl__Group_3__3__Impl : ( ( rule__DBDecl__ValueAssignment_3_3 ) ) ;
    public final void rule__DBDecl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1225:1: ( ( ( rule__DBDecl__ValueAssignment_3_3 ) ) )
            // InternalCMSdslParser.g:1226:1: ( ( rule__DBDecl__ValueAssignment_3_3 ) )
            {
            // InternalCMSdslParser.g:1226:1: ( ( rule__DBDecl__ValueAssignment_3_3 ) )
            // InternalCMSdslParser.g:1227:2: ( rule__DBDecl__ValueAssignment_3_3 )
            {
             before(grammarAccess.getDBDeclAccess().getValueAssignment_3_3()); 
            // InternalCMSdslParser.g:1228:2: ( rule__DBDecl__ValueAssignment_3_3 )
            // InternalCMSdslParser.g:1228:3: rule__DBDecl__ValueAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__DBDecl__ValueAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getDBDeclAccess().getValueAssignment_3_3()); 

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
    // $ANTLR end "rule__DBDecl__Group_3__3__Impl"


    // $ANTLR start "rule__DBDecl__Group_4__0"
    // InternalCMSdslParser.g:1237:1: rule__DBDecl__Group_4__0 : rule__DBDecl__Group_4__0__Impl rule__DBDecl__Group_4__1 ;
    public final void rule__DBDecl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1241:1: ( rule__DBDecl__Group_4__0__Impl rule__DBDecl__Group_4__1 )
            // InternalCMSdslParser.g:1242:2: rule__DBDecl__Group_4__0__Impl rule__DBDecl__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__DBDecl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBDecl__Group_4__1();

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
    // $ANTLR end "rule__DBDecl__Group_4__0"


    // $ANTLR start "rule__DBDecl__Group_4__0__Impl"
    // InternalCMSdslParser.g:1249:1: rule__DBDecl__Group_4__0__Impl : ( () ) ;
    public final void rule__DBDecl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1253:1: ( ( () ) )
            // InternalCMSdslParser.g:1254:1: ( () )
            {
            // InternalCMSdslParser.g:1254:1: ( () )
            // InternalCMSdslParser.g:1255:2: ()
            {
             before(grammarAccess.getDBDeclAccess().getUserAction_4_0()); 
            // InternalCMSdslParser.g:1256:2: ()
            // InternalCMSdslParser.g:1256:3: 
            {
            }

             after(grammarAccess.getDBDeclAccess().getUserAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBDecl__Group_4__0__Impl"


    // $ANTLR start "rule__DBDecl__Group_4__1"
    // InternalCMSdslParser.g:1264:1: rule__DBDecl__Group_4__1 : rule__DBDecl__Group_4__1__Impl rule__DBDecl__Group_4__2 ;
    public final void rule__DBDecl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1268:1: ( rule__DBDecl__Group_4__1__Impl rule__DBDecl__Group_4__2 )
            // InternalCMSdslParser.g:1269:2: rule__DBDecl__Group_4__1__Impl rule__DBDecl__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__DBDecl__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBDecl__Group_4__2();

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
    // $ANTLR end "rule__DBDecl__Group_4__1"


    // $ANTLR start "rule__DBDecl__Group_4__1__Impl"
    // InternalCMSdslParser.g:1276:1: rule__DBDecl__Group_4__1__Impl : ( ( rule__DBDecl__TypeAssignment_4_1 ) ) ;
    public final void rule__DBDecl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1280:1: ( ( ( rule__DBDecl__TypeAssignment_4_1 ) ) )
            // InternalCMSdslParser.g:1281:1: ( ( rule__DBDecl__TypeAssignment_4_1 ) )
            {
            // InternalCMSdslParser.g:1281:1: ( ( rule__DBDecl__TypeAssignment_4_1 ) )
            // InternalCMSdslParser.g:1282:2: ( rule__DBDecl__TypeAssignment_4_1 )
            {
             before(grammarAccess.getDBDeclAccess().getTypeAssignment_4_1()); 
            // InternalCMSdslParser.g:1283:2: ( rule__DBDecl__TypeAssignment_4_1 )
            // InternalCMSdslParser.g:1283:3: rule__DBDecl__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DBDecl__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDBDeclAccess().getTypeAssignment_4_1()); 

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
    // $ANTLR end "rule__DBDecl__Group_4__1__Impl"


    // $ANTLR start "rule__DBDecl__Group_4__2"
    // InternalCMSdslParser.g:1291:1: rule__DBDecl__Group_4__2 : rule__DBDecl__Group_4__2__Impl rule__DBDecl__Group_4__3 ;
    public final void rule__DBDecl__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1295:1: ( rule__DBDecl__Group_4__2__Impl rule__DBDecl__Group_4__3 )
            // InternalCMSdslParser.g:1296:2: rule__DBDecl__Group_4__2__Impl rule__DBDecl__Group_4__3
            {
            pushFollow(FOLLOW_12);
            rule__DBDecl__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBDecl__Group_4__3();

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
    // $ANTLR end "rule__DBDecl__Group_4__2"


    // $ANTLR start "rule__DBDecl__Group_4__2__Impl"
    // InternalCMSdslParser.g:1303:1: rule__DBDecl__Group_4__2__Impl : ( Colon ) ;
    public final void rule__DBDecl__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1307:1: ( ( Colon ) )
            // InternalCMSdslParser.g:1308:1: ( Colon )
            {
            // InternalCMSdslParser.g:1308:1: ( Colon )
            // InternalCMSdslParser.g:1309:2: Colon
            {
             before(grammarAccess.getDBDeclAccess().getColonKeyword_4_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getDBDeclAccess().getColonKeyword_4_2()); 

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
    // $ANTLR end "rule__DBDecl__Group_4__2__Impl"


    // $ANTLR start "rule__DBDecl__Group_4__3"
    // InternalCMSdslParser.g:1318:1: rule__DBDecl__Group_4__3 : rule__DBDecl__Group_4__3__Impl ;
    public final void rule__DBDecl__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1322:1: ( rule__DBDecl__Group_4__3__Impl )
            // InternalCMSdslParser.g:1323:2: rule__DBDecl__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DBDecl__Group_4__3__Impl();

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
    // $ANTLR end "rule__DBDecl__Group_4__3"


    // $ANTLR start "rule__DBDecl__Group_4__3__Impl"
    // InternalCMSdslParser.g:1329:1: rule__DBDecl__Group_4__3__Impl : ( ( rule__DBDecl__ValueAssignment_4_3 ) ) ;
    public final void rule__DBDecl__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1333:1: ( ( ( rule__DBDecl__ValueAssignment_4_3 ) ) )
            // InternalCMSdslParser.g:1334:1: ( ( rule__DBDecl__ValueAssignment_4_3 ) )
            {
            // InternalCMSdslParser.g:1334:1: ( ( rule__DBDecl__ValueAssignment_4_3 ) )
            // InternalCMSdslParser.g:1335:2: ( rule__DBDecl__ValueAssignment_4_3 )
            {
             before(grammarAccess.getDBDeclAccess().getValueAssignment_4_3()); 
            // InternalCMSdslParser.g:1336:2: ( rule__DBDecl__ValueAssignment_4_3 )
            // InternalCMSdslParser.g:1336:3: rule__DBDecl__ValueAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__DBDecl__ValueAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getDBDeclAccess().getValueAssignment_4_3()); 

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
    // $ANTLR end "rule__DBDecl__Group_4__3__Impl"


    // $ANTLR start "rule__DBDecl__Group_5__0"
    // InternalCMSdslParser.g:1345:1: rule__DBDecl__Group_5__0 : rule__DBDecl__Group_5__0__Impl rule__DBDecl__Group_5__1 ;
    public final void rule__DBDecl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1349:1: ( rule__DBDecl__Group_5__0__Impl rule__DBDecl__Group_5__1 )
            // InternalCMSdslParser.g:1350:2: rule__DBDecl__Group_5__0__Impl rule__DBDecl__Group_5__1
            {
            pushFollow(FOLLOW_18);
            rule__DBDecl__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBDecl__Group_5__1();

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
    // $ANTLR end "rule__DBDecl__Group_5__0"


    // $ANTLR start "rule__DBDecl__Group_5__0__Impl"
    // InternalCMSdslParser.g:1357:1: rule__DBDecl__Group_5__0__Impl : ( () ) ;
    public final void rule__DBDecl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1361:1: ( ( () ) )
            // InternalCMSdslParser.g:1362:1: ( () )
            {
            // InternalCMSdslParser.g:1362:1: ( () )
            // InternalCMSdslParser.g:1363:2: ()
            {
             before(grammarAccess.getDBDeclAccess().getPassAction_5_0()); 
            // InternalCMSdslParser.g:1364:2: ()
            // InternalCMSdslParser.g:1364:3: 
            {
            }

             after(grammarAccess.getDBDeclAccess().getPassAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBDecl__Group_5__0__Impl"


    // $ANTLR start "rule__DBDecl__Group_5__1"
    // InternalCMSdslParser.g:1372:1: rule__DBDecl__Group_5__1 : rule__DBDecl__Group_5__1__Impl rule__DBDecl__Group_5__2 ;
    public final void rule__DBDecl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1376:1: ( rule__DBDecl__Group_5__1__Impl rule__DBDecl__Group_5__2 )
            // InternalCMSdslParser.g:1377:2: rule__DBDecl__Group_5__1__Impl rule__DBDecl__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__DBDecl__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBDecl__Group_5__2();

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
    // $ANTLR end "rule__DBDecl__Group_5__1"


    // $ANTLR start "rule__DBDecl__Group_5__1__Impl"
    // InternalCMSdslParser.g:1384:1: rule__DBDecl__Group_5__1__Impl : ( ( rule__DBDecl__TypeAssignment_5_1 ) ) ;
    public final void rule__DBDecl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1388:1: ( ( ( rule__DBDecl__TypeAssignment_5_1 ) ) )
            // InternalCMSdslParser.g:1389:1: ( ( rule__DBDecl__TypeAssignment_5_1 ) )
            {
            // InternalCMSdslParser.g:1389:1: ( ( rule__DBDecl__TypeAssignment_5_1 ) )
            // InternalCMSdslParser.g:1390:2: ( rule__DBDecl__TypeAssignment_5_1 )
            {
             before(grammarAccess.getDBDeclAccess().getTypeAssignment_5_1()); 
            // InternalCMSdslParser.g:1391:2: ( rule__DBDecl__TypeAssignment_5_1 )
            // InternalCMSdslParser.g:1391:3: rule__DBDecl__TypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__DBDecl__TypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDBDeclAccess().getTypeAssignment_5_1()); 

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
    // $ANTLR end "rule__DBDecl__Group_5__1__Impl"


    // $ANTLR start "rule__DBDecl__Group_5__2"
    // InternalCMSdslParser.g:1399:1: rule__DBDecl__Group_5__2 : rule__DBDecl__Group_5__2__Impl rule__DBDecl__Group_5__3 ;
    public final void rule__DBDecl__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1403:1: ( rule__DBDecl__Group_5__2__Impl rule__DBDecl__Group_5__3 )
            // InternalCMSdslParser.g:1404:2: rule__DBDecl__Group_5__2__Impl rule__DBDecl__Group_5__3
            {
            pushFollow(FOLLOW_12);
            rule__DBDecl__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBDecl__Group_5__3();

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
    // $ANTLR end "rule__DBDecl__Group_5__2"


    // $ANTLR start "rule__DBDecl__Group_5__2__Impl"
    // InternalCMSdslParser.g:1411:1: rule__DBDecl__Group_5__2__Impl : ( Colon ) ;
    public final void rule__DBDecl__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1415:1: ( ( Colon ) )
            // InternalCMSdslParser.g:1416:1: ( Colon )
            {
            // InternalCMSdslParser.g:1416:1: ( Colon )
            // InternalCMSdslParser.g:1417:2: Colon
            {
             before(grammarAccess.getDBDeclAccess().getColonKeyword_5_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getDBDeclAccess().getColonKeyword_5_2()); 

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
    // $ANTLR end "rule__DBDecl__Group_5__2__Impl"


    // $ANTLR start "rule__DBDecl__Group_5__3"
    // InternalCMSdslParser.g:1426:1: rule__DBDecl__Group_5__3 : rule__DBDecl__Group_5__3__Impl ;
    public final void rule__DBDecl__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1430:1: ( rule__DBDecl__Group_5__3__Impl )
            // InternalCMSdslParser.g:1431:2: rule__DBDecl__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DBDecl__Group_5__3__Impl();

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
    // $ANTLR end "rule__DBDecl__Group_5__3"


    // $ANTLR start "rule__DBDecl__Group_5__3__Impl"
    // InternalCMSdslParser.g:1437:1: rule__DBDecl__Group_5__3__Impl : ( ( rule__DBDecl__ValueAssignment_5_3 ) ) ;
    public final void rule__DBDecl__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1441:1: ( ( ( rule__DBDecl__ValueAssignment_5_3 ) ) )
            // InternalCMSdslParser.g:1442:1: ( ( rule__DBDecl__ValueAssignment_5_3 ) )
            {
            // InternalCMSdslParser.g:1442:1: ( ( rule__DBDecl__ValueAssignment_5_3 ) )
            // InternalCMSdslParser.g:1443:2: ( rule__DBDecl__ValueAssignment_5_3 )
            {
             before(grammarAccess.getDBDeclAccess().getValueAssignment_5_3()); 
            // InternalCMSdslParser.g:1444:2: ( rule__DBDecl__ValueAssignment_5_3 )
            // InternalCMSdslParser.g:1444:3: rule__DBDecl__ValueAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__DBDecl__ValueAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getDBDeclAccess().getValueAssignment_5_3()); 

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
    // $ANTLR end "rule__DBDecl__Group_5__3__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalCMSdslParser.g:1453:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1457:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalCMSdslParser.g:1458:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalCMSdslParser.g:1465:1: rule__Entity__Group__0__Impl : ( () ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1469:1: ( ( () ) )
            // InternalCMSdslParser.g:1470:1: ( () )
            {
            // InternalCMSdslParser.g:1470:1: ( () )
            // InternalCMSdslParser.g:1471:2: ()
            {
             before(grammarAccess.getEntityAccess().getEntityAction_0()); 
            // InternalCMSdslParser.g:1472:2: ()
            // InternalCMSdslParser.g:1472:3: 
            {
            }

             after(grammarAccess.getEntityAccess().getEntityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalCMSdslParser.g:1480:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1484:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalCMSdslParser.g:1485:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalCMSdslParser.g:1492:1: rule__Entity__Group__1__Impl : ( Entity ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1496:1: ( ( Entity ) )
            // InternalCMSdslParser.g:1497:1: ( Entity )
            {
            // InternalCMSdslParser.g:1497:1: ( Entity )
            // InternalCMSdslParser.g:1498:2: Entity
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,Entity,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalCMSdslParser.g:1507:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1511:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalCMSdslParser.g:1512:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalCMSdslParser.g:1519:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1523:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // InternalCMSdslParser.g:1524:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // InternalCMSdslParser.g:1524:1: ( ( rule__Entity__NameAssignment_2 ) )
            // InternalCMSdslParser.g:1525:2: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // InternalCMSdslParser.g:1526:2: ( rule__Entity__NameAssignment_2 )
            // InternalCMSdslParser.g:1526:3: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalCMSdslParser.g:1534:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1538:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalCMSdslParser.g:1539:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalCMSdslParser.g:1546:1: rule__Entity__Group__3__Impl : ( Colon ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1550:1: ( ( Colon ) )
            // InternalCMSdslParser.g:1551:1: ( Colon )
            {
            // InternalCMSdslParser.g:1551:1: ( Colon )
            // InternalCMSdslParser.g:1552:2: Colon
            {
             before(grammarAccess.getEntityAccess().getColonKeyword_3()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalCMSdslParser.g:1561:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1565:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalCMSdslParser.g:1566:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalCMSdslParser.g:1573:1: rule__Entity__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1577:1: ( ( RULE_BEGIN ) )
            // InternalCMSdslParser.g:1578:1: ( RULE_BEGIN )
            {
            // InternalCMSdslParser.g:1578:1: ( RULE_BEGIN )
            // InternalCMSdslParser.g:1579:2: RULE_BEGIN
            {
             before(grammarAccess.getEntityAccess().getBEGINTerminalRuleCall_4()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getBEGINTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalCMSdslParser.g:1588:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1592:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalCMSdslParser.g:1593:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__6();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalCMSdslParser.g:1600:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__ModelAssignment_5 ) ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1604:1: ( ( ( rule__Entity__ModelAssignment_5 ) ) )
            // InternalCMSdslParser.g:1605:1: ( ( rule__Entity__ModelAssignment_5 ) )
            {
            // InternalCMSdslParser.g:1605:1: ( ( rule__Entity__ModelAssignment_5 ) )
            // InternalCMSdslParser.g:1606:2: ( rule__Entity__ModelAssignment_5 )
            {
             before(grammarAccess.getEntityAccess().getModelAssignment_5()); 
            // InternalCMSdslParser.g:1607:2: ( rule__Entity__ModelAssignment_5 )
            // InternalCMSdslParser.g:1607:3: rule__Entity__ModelAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Entity__ModelAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getModelAssignment_5()); 

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
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // InternalCMSdslParser.g:1615:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1619:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // InternalCMSdslParser.g:1620:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__7();

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
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // InternalCMSdslParser.g:1627:1: rule__Entity__Group__6__Impl : ( ( rule__Entity__ServiceAssignment_6 )? ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1631:1: ( ( ( rule__Entity__ServiceAssignment_6 )? ) )
            // InternalCMSdslParser.g:1632:1: ( ( rule__Entity__ServiceAssignment_6 )? )
            {
            // InternalCMSdslParser.g:1632:1: ( ( rule__Entity__ServiceAssignment_6 )? )
            // InternalCMSdslParser.g:1633:2: ( rule__Entity__ServiceAssignment_6 )?
            {
             before(grammarAccess.getEntityAccess().getServiceAssignment_6()); 
            // InternalCMSdslParser.g:1634:2: ( rule__Entity__ServiceAssignment_6 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Service) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCMSdslParser.g:1634:3: rule__Entity__ServiceAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__ServiceAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getServiceAssignment_6()); 

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
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group__7"
    // InternalCMSdslParser.g:1642:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl rule__Entity__Group__8 ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1646:1: ( rule__Entity__Group__7__Impl rule__Entity__Group__8 )
            // InternalCMSdslParser.g:1647:2: rule__Entity__Group__7__Impl rule__Entity__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__Entity__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__8();

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
    // $ANTLR end "rule__Entity__Group__7"


    // $ANTLR start "rule__Entity__Group__7__Impl"
    // InternalCMSdslParser.g:1654:1: rule__Entity__Group__7__Impl : ( ( rule__Entity__UiAssignment_7 )? ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1658:1: ( ( ( rule__Entity__UiAssignment_7 )? ) )
            // InternalCMSdslParser.g:1659:1: ( ( rule__Entity__UiAssignment_7 )? )
            {
            // InternalCMSdslParser.g:1659:1: ( ( rule__Entity__UiAssignment_7 )? )
            // InternalCMSdslParser.g:1660:2: ( rule__Entity__UiAssignment_7 )?
            {
             before(grammarAccess.getEntityAccess().getUiAssignment_7()); 
            // InternalCMSdslParser.g:1661:2: ( rule__Entity__UiAssignment_7 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Ui) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCMSdslParser.g:1661:3: rule__Entity__UiAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__UiAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getUiAssignment_7()); 

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
    // $ANTLR end "rule__Entity__Group__7__Impl"


    // $ANTLR start "rule__Entity__Group__8"
    // InternalCMSdslParser.g:1669:1: rule__Entity__Group__8 : rule__Entity__Group__8__Impl ;
    public final void rule__Entity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1673:1: ( rule__Entity__Group__8__Impl )
            // InternalCMSdslParser.g:1674:2: rule__Entity__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__8__Impl();

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
    // $ANTLR end "rule__Entity__Group__8"


    // $ANTLR start "rule__Entity__Group__8__Impl"
    // InternalCMSdslParser.g:1680:1: rule__Entity__Group__8__Impl : ( RULE_END ) ;
    public final void rule__Entity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1684:1: ( ( RULE_END ) )
            // InternalCMSdslParser.g:1685:1: ( RULE_END )
            {
            // InternalCMSdslParser.g:1685:1: ( RULE_END )
            // InternalCMSdslParser.g:1686:2: RULE_END
            {
             before(grammarAccess.getEntityAccess().getENDTerminalRuleCall_8()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getENDTerminalRuleCall_8()); 

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
    // $ANTLR end "rule__Entity__Group__8__Impl"


    // $ANTLR start "rule__EntityModel__Group__0"
    // InternalCMSdslParser.g:1696:1: rule__EntityModel__Group__0 : rule__EntityModel__Group__0__Impl rule__EntityModel__Group__1 ;
    public final void rule__EntityModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1700:1: ( rule__EntityModel__Group__0__Impl rule__EntityModel__Group__1 )
            // InternalCMSdslParser.g:1701:2: rule__EntityModel__Group__0__Impl rule__EntityModel__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__EntityModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityModel__Group__1();

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
    // $ANTLR end "rule__EntityModel__Group__0"


    // $ANTLR start "rule__EntityModel__Group__0__Impl"
    // InternalCMSdslParser.g:1708:1: rule__EntityModel__Group__0__Impl : ( () ) ;
    public final void rule__EntityModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1712:1: ( ( () ) )
            // InternalCMSdslParser.g:1713:1: ( () )
            {
            // InternalCMSdslParser.g:1713:1: ( () )
            // InternalCMSdslParser.g:1714:2: ()
            {
             before(grammarAccess.getEntityModelAccess().getEntityModelAction_0()); 
            // InternalCMSdslParser.g:1715:2: ()
            // InternalCMSdslParser.g:1715:3: 
            {
            }

             after(grammarAccess.getEntityModelAccess().getEntityModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityModel__Group__0__Impl"


    // $ANTLR start "rule__EntityModel__Group__1"
    // InternalCMSdslParser.g:1723:1: rule__EntityModel__Group__1 : rule__EntityModel__Group__1__Impl ;
    public final void rule__EntityModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1727:1: ( rule__EntityModel__Group__1__Impl )
            // InternalCMSdslParser.g:1728:2: rule__EntityModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityModel__Group__1__Impl();

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
    // $ANTLR end "rule__EntityModel__Group__1"


    // $ANTLR start "rule__EntityModel__Group__1__Impl"
    // InternalCMSdslParser.g:1734:1: rule__EntityModel__Group__1__Impl : ( ( rule__EntityModel__FieldsAssignment_1 )* ) ;
    public final void rule__EntityModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1738:1: ( ( ( rule__EntityModel__FieldsAssignment_1 )* ) )
            // InternalCMSdslParser.g:1739:1: ( ( rule__EntityModel__FieldsAssignment_1 )* )
            {
            // InternalCMSdslParser.g:1739:1: ( ( rule__EntityModel__FieldsAssignment_1 )* )
            // InternalCMSdslParser.g:1740:2: ( rule__EntityModel__FieldsAssignment_1 )*
            {
             before(grammarAccess.getEntityModelAccess().getFieldsAssignment_1()); 
            // InternalCMSdslParser.g:1741:2: ( rule__EntityModel__FieldsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=String && LA9_0<=Long)||LA9_0==Int) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCMSdslParser.g:1741:3: rule__EntityModel__FieldsAssignment_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__EntityModel__FieldsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEntityModelAccess().getFieldsAssignment_1()); 

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
    // $ANTLR end "rule__EntityModel__Group__1__Impl"


    // $ANTLR start "rule__EntityService__Group__0"
    // InternalCMSdslParser.g:1750:1: rule__EntityService__Group__0 : rule__EntityService__Group__0__Impl rule__EntityService__Group__1 ;
    public final void rule__EntityService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1754:1: ( rule__EntityService__Group__0__Impl rule__EntityService__Group__1 )
            // InternalCMSdslParser.g:1755:2: rule__EntityService__Group__0__Impl rule__EntityService__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__EntityService__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityService__Group__1();

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
    // $ANTLR end "rule__EntityService__Group__0"


    // $ANTLR start "rule__EntityService__Group__0__Impl"
    // InternalCMSdslParser.g:1762:1: rule__EntityService__Group__0__Impl : ( () ) ;
    public final void rule__EntityService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1766:1: ( ( () ) )
            // InternalCMSdslParser.g:1767:1: ( () )
            {
            // InternalCMSdslParser.g:1767:1: ( () )
            // InternalCMSdslParser.g:1768:2: ()
            {
             before(grammarAccess.getEntityServiceAccess().getEntityServiceAction_0()); 
            // InternalCMSdslParser.g:1769:2: ()
            // InternalCMSdslParser.g:1769:3: 
            {
            }

             after(grammarAccess.getEntityServiceAccess().getEntityServiceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityService__Group__0__Impl"


    // $ANTLR start "rule__EntityService__Group__1"
    // InternalCMSdslParser.g:1777:1: rule__EntityService__Group__1 : rule__EntityService__Group__1__Impl rule__EntityService__Group__2 ;
    public final void rule__EntityService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1781:1: ( rule__EntityService__Group__1__Impl rule__EntityService__Group__2 )
            // InternalCMSdslParser.g:1782:2: rule__EntityService__Group__1__Impl rule__EntityService__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__EntityService__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityService__Group__2();

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
    // $ANTLR end "rule__EntityService__Group__1"


    // $ANTLR start "rule__EntityService__Group__1__Impl"
    // InternalCMSdslParser.g:1789:1: rule__EntityService__Group__1__Impl : ( Service ) ;
    public final void rule__EntityService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1793:1: ( ( Service ) )
            // InternalCMSdslParser.g:1794:1: ( Service )
            {
            // InternalCMSdslParser.g:1794:1: ( Service )
            // InternalCMSdslParser.g:1795:2: Service
            {
             before(grammarAccess.getEntityServiceAccess().getServiceKeyword_1()); 
            match(input,Service,FOLLOW_2); 
             after(grammarAccess.getEntityServiceAccess().getServiceKeyword_1()); 

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
    // $ANTLR end "rule__EntityService__Group__1__Impl"


    // $ANTLR start "rule__EntityService__Group__2"
    // InternalCMSdslParser.g:1804:1: rule__EntityService__Group__2 : rule__EntityService__Group__2__Impl ;
    public final void rule__EntityService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1808:1: ( rule__EntityService__Group__2__Impl )
            // InternalCMSdslParser.g:1809:2: rule__EntityService__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityService__Group__2__Impl();

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
    // $ANTLR end "rule__EntityService__Group__2"


    // $ANTLR start "rule__EntityService__Group__2__Impl"
    // InternalCMSdslParser.g:1815:1: rule__EntityService__Group__2__Impl : ( Colon ) ;
    public final void rule__EntityService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1819:1: ( ( Colon ) )
            // InternalCMSdslParser.g:1820:1: ( Colon )
            {
            // InternalCMSdslParser.g:1820:1: ( Colon )
            // InternalCMSdslParser.g:1821:2: Colon
            {
             before(grammarAccess.getEntityServiceAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getEntityServiceAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__EntityService__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalCMSdslParser.g:1831:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1835:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalCMSdslParser.g:1836:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

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
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalCMSdslParser.g:1843:1: rule__Field__Group__0__Impl : ( ( rule__Field__TypeAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1847:1: ( ( ( rule__Field__TypeAssignment_0 ) ) )
            // InternalCMSdslParser.g:1848:1: ( ( rule__Field__TypeAssignment_0 ) )
            {
            // InternalCMSdslParser.g:1848:1: ( ( rule__Field__TypeAssignment_0 ) )
            // InternalCMSdslParser.g:1849:2: ( rule__Field__TypeAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_0()); 
            // InternalCMSdslParser.g:1850:2: ( rule__Field__TypeAssignment_0 )
            // InternalCMSdslParser.g:1850:3: rule__Field__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Field__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalCMSdslParser.g:1858:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1862:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalCMSdslParser.g:1863:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

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
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalCMSdslParser.g:1870:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1874:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // InternalCMSdslParser.g:1875:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // InternalCMSdslParser.g:1875:1: ( ( rule__Field__NameAssignment_1 ) )
            // InternalCMSdslParser.g:1876:2: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // InternalCMSdslParser.g:1877:2: ( rule__Field__NameAssignment_1 )
            // InternalCMSdslParser.g:1877:3: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // InternalCMSdslParser.g:1885:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1889:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // InternalCMSdslParser.g:1890:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__3();

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
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalCMSdslParser.g:1897:1: rule__Field__Group__2__Impl : ( Colon ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1901:1: ( ( Colon ) )
            // InternalCMSdslParser.g:1902:1: ( Colon )
            {
            // InternalCMSdslParser.g:1902:1: ( Colon )
            // InternalCMSdslParser.g:1903:2: Colon
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // InternalCMSdslParser.g:1912:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1916:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // InternalCMSdslParser.g:1917:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__4();

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
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // InternalCMSdslParser.g:1924:1: rule__Field__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1928:1: ( ( RULE_BEGIN ) )
            // InternalCMSdslParser.g:1929:1: ( RULE_BEGIN )
            {
            // InternalCMSdslParser.g:1929:1: ( RULE_BEGIN )
            // InternalCMSdslParser.g:1930:2: RULE_BEGIN
            {
             before(grammarAccess.getFieldAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getBEGINTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Field__Group__4"
    // InternalCMSdslParser.g:1939:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1943:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // InternalCMSdslParser.g:1944:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Field__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__5();

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
    // $ANTLR end "rule__Field__Group__4"


    // $ANTLR start "rule__Field__Group__4__Impl"
    // InternalCMSdslParser.g:1951:1: rule__Field__Group__4__Impl : ( ( rule__Field__PropertiesAssignment_4 )* ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1955:1: ( ( ( rule__Field__PropertiesAssignment_4 )* ) )
            // InternalCMSdslParser.g:1956:1: ( ( rule__Field__PropertiesAssignment_4 )* )
            {
            // InternalCMSdslParser.g:1956:1: ( ( rule__Field__PropertiesAssignment_4 )* )
            // InternalCMSdslParser.g:1957:2: ( rule__Field__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getFieldAccess().getPropertiesAssignment_4()); 
            // InternalCMSdslParser.g:1958:2: ( rule__Field__PropertiesAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Default||LA10_0==Test) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCMSdslParser.g:1958:3: rule__Field__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Field__PropertiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getFieldAccess().getPropertiesAssignment_4()); 

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
    // $ANTLR end "rule__Field__Group__4__Impl"


    // $ANTLR start "rule__Field__Group__5"
    // InternalCMSdslParser.g:1966:1: rule__Field__Group__5 : rule__Field__Group__5__Impl ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1970:1: ( rule__Field__Group__5__Impl )
            // InternalCMSdslParser.g:1971:2: rule__Field__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__5__Impl();

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
    // $ANTLR end "rule__Field__Group__5"


    // $ANTLR start "rule__Field__Group__5__Impl"
    // InternalCMSdslParser.g:1977:1: rule__Field__Group__5__Impl : ( RULE_END ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1981:1: ( ( RULE_END ) )
            // InternalCMSdslParser.g:1982:1: ( RULE_END )
            {
            // InternalCMSdslParser.g:1982:1: ( RULE_END )
            // InternalCMSdslParser.g:1983:2: RULE_END
            {
             before(grammarAccess.getFieldAccess().getENDTerminalRuleCall_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getENDTerminalRuleCall_5()); 

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
    // $ANTLR end "rule__Field__Group__5__Impl"


    // $ANTLR start "rule__FieldProp__Group_0__0"
    // InternalCMSdslParser.g:1993:1: rule__FieldProp__Group_0__0 : rule__FieldProp__Group_0__0__Impl rule__FieldProp__Group_0__1 ;
    public final void rule__FieldProp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:1997:1: ( rule__FieldProp__Group_0__0__Impl rule__FieldProp__Group_0__1 )
            // InternalCMSdslParser.g:1998:2: rule__FieldProp__Group_0__0__Impl rule__FieldProp__Group_0__1
            {
            pushFollow(FOLLOW_26);
            rule__FieldProp__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldProp__Group_0__1();

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
    // $ANTLR end "rule__FieldProp__Group_0__0"


    // $ANTLR start "rule__FieldProp__Group_0__0__Impl"
    // InternalCMSdslParser.g:2005:1: rule__FieldProp__Group_0__0__Impl : ( () ) ;
    public final void rule__FieldProp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2009:1: ( ( () ) )
            // InternalCMSdslParser.g:2010:1: ( () )
            {
            // InternalCMSdslParser.g:2010:1: ( () )
            // InternalCMSdslParser.g:2011:2: ()
            {
             before(grammarAccess.getFieldPropAccess().getDefAction_0_0()); 
            // InternalCMSdslParser.g:2012:2: ()
            // InternalCMSdslParser.g:2012:3: 
            {
            }

             after(grammarAccess.getFieldPropAccess().getDefAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldProp__Group_0__0__Impl"


    // $ANTLR start "rule__FieldProp__Group_0__1"
    // InternalCMSdslParser.g:2020:1: rule__FieldProp__Group_0__1 : rule__FieldProp__Group_0__1__Impl rule__FieldProp__Group_0__2 ;
    public final void rule__FieldProp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2024:1: ( rule__FieldProp__Group_0__1__Impl rule__FieldProp__Group_0__2 )
            // InternalCMSdslParser.g:2025:2: rule__FieldProp__Group_0__1__Impl rule__FieldProp__Group_0__2
            {
            pushFollow(FOLLOW_4);
            rule__FieldProp__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldProp__Group_0__2();

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
    // $ANTLR end "rule__FieldProp__Group_0__1"


    // $ANTLR start "rule__FieldProp__Group_0__1__Impl"
    // InternalCMSdslParser.g:2032:1: rule__FieldProp__Group_0__1__Impl : ( ( rule__FieldProp__TypeAssignment_0_1 ) ) ;
    public final void rule__FieldProp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2036:1: ( ( ( rule__FieldProp__TypeAssignment_0_1 ) ) )
            // InternalCMSdslParser.g:2037:1: ( ( rule__FieldProp__TypeAssignment_0_1 ) )
            {
            // InternalCMSdslParser.g:2037:1: ( ( rule__FieldProp__TypeAssignment_0_1 ) )
            // InternalCMSdslParser.g:2038:2: ( rule__FieldProp__TypeAssignment_0_1 )
            {
             before(grammarAccess.getFieldPropAccess().getTypeAssignment_0_1()); 
            // InternalCMSdslParser.g:2039:2: ( rule__FieldProp__TypeAssignment_0_1 )
            // InternalCMSdslParser.g:2039:3: rule__FieldProp__TypeAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldProp__TypeAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldPropAccess().getTypeAssignment_0_1()); 

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
    // $ANTLR end "rule__FieldProp__Group_0__1__Impl"


    // $ANTLR start "rule__FieldProp__Group_0__2"
    // InternalCMSdslParser.g:2047:1: rule__FieldProp__Group_0__2 : rule__FieldProp__Group_0__2__Impl rule__FieldProp__Group_0__3 ;
    public final void rule__FieldProp__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2051:1: ( rule__FieldProp__Group_0__2__Impl rule__FieldProp__Group_0__3 )
            // InternalCMSdslParser.g:2052:2: rule__FieldProp__Group_0__2__Impl rule__FieldProp__Group_0__3
            {
            pushFollow(FOLLOW_12);
            rule__FieldProp__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldProp__Group_0__3();

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
    // $ANTLR end "rule__FieldProp__Group_0__2"


    // $ANTLR start "rule__FieldProp__Group_0__2__Impl"
    // InternalCMSdslParser.g:2059:1: rule__FieldProp__Group_0__2__Impl : ( Colon ) ;
    public final void rule__FieldProp__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2063:1: ( ( Colon ) )
            // InternalCMSdslParser.g:2064:1: ( Colon )
            {
            // InternalCMSdslParser.g:2064:1: ( Colon )
            // InternalCMSdslParser.g:2065:2: Colon
            {
             before(grammarAccess.getFieldPropAccess().getColonKeyword_0_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getFieldPropAccess().getColonKeyword_0_2()); 

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
    // $ANTLR end "rule__FieldProp__Group_0__2__Impl"


    // $ANTLR start "rule__FieldProp__Group_0__3"
    // InternalCMSdslParser.g:2074:1: rule__FieldProp__Group_0__3 : rule__FieldProp__Group_0__3__Impl ;
    public final void rule__FieldProp__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2078:1: ( rule__FieldProp__Group_0__3__Impl )
            // InternalCMSdslParser.g:2079:2: rule__FieldProp__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldProp__Group_0__3__Impl();

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
    // $ANTLR end "rule__FieldProp__Group_0__3"


    // $ANTLR start "rule__FieldProp__Group_0__3__Impl"
    // InternalCMSdslParser.g:2085:1: rule__FieldProp__Group_0__3__Impl : ( ( rule__FieldProp__ValueAssignment_0_3 ) ) ;
    public final void rule__FieldProp__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2089:1: ( ( ( rule__FieldProp__ValueAssignment_0_3 ) ) )
            // InternalCMSdslParser.g:2090:1: ( ( rule__FieldProp__ValueAssignment_0_3 ) )
            {
            // InternalCMSdslParser.g:2090:1: ( ( rule__FieldProp__ValueAssignment_0_3 ) )
            // InternalCMSdslParser.g:2091:2: ( rule__FieldProp__ValueAssignment_0_3 )
            {
             before(grammarAccess.getFieldPropAccess().getValueAssignment_0_3()); 
            // InternalCMSdslParser.g:2092:2: ( rule__FieldProp__ValueAssignment_0_3 )
            // InternalCMSdslParser.g:2092:3: rule__FieldProp__ValueAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__FieldProp__ValueAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getFieldPropAccess().getValueAssignment_0_3()); 

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
    // $ANTLR end "rule__FieldProp__Group_0__3__Impl"


    // $ANTLR start "rule__FieldProp__Group_1__0"
    // InternalCMSdslParser.g:2101:1: rule__FieldProp__Group_1__0 : rule__FieldProp__Group_1__0__Impl rule__FieldProp__Group_1__1 ;
    public final void rule__FieldProp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2105:1: ( rule__FieldProp__Group_1__0__Impl rule__FieldProp__Group_1__1 )
            // InternalCMSdslParser.g:2106:2: rule__FieldProp__Group_1__0__Impl rule__FieldProp__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__FieldProp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldProp__Group_1__1();

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
    // $ANTLR end "rule__FieldProp__Group_1__0"


    // $ANTLR start "rule__FieldProp__Group_1__0__Impl"
    // InternalCMSdslParser.g:2113:1: rule__FieldProp__Group_1__0__Impl : ( () ) ;
    public final void rule__FieldProp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2117:1: ( ( () ) )
            // InternalCMSdslParser.g:2118:1: ( () )
            {
            // InternalCMSdslParser.g:2118:1: ( () )
            // InternalCMSdslParser.g:2119:2: ()
            {
             before(grammarAccess.getFieldPropAccess().getPropTestAction_1_0()); 
            // InternalCMSdslParser.g:2120:2: ()
            // InternalCMSdslParser.g:2120:3: 
            {
            }

             after(grammarAccess.getFieldPropAccess().getPropTestAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldProp__Group_1__0__Impl"


    // $ANTLR start "rule__FieldProp__Group_1__1"
    // InternalCMSdslParser.g:2128:1: rule__FieldProp__Group_1__1 : rule__FieldProp__Group_1__1__Impl rule__FieldProp__Group_1__2 ;
    public final void rule__FieldProp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2132:1: ( rule__FieldProp__Group_1__1__Impl rule__FieldProp__Group_1__2 )
            // InternalCMSdslParser.g:2133:2: rule__FieldProp__Group_1__1__Impl rule__FieldProp__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__FieldProp__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldProp__Group_1__2();

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
    // $ANTLR end "rule__FieldProp__Group_1__1"


    // $ANTLR start "rule__FieldProp__Group_1__1__Impl"
    // InternalCMSdslParser.g:2140:1: rule__FieldProp__Group_1__1__Impl : ( ( rule__FieldProp__TypeAssignment_1_1 ) ) ;
    public final void rule__FieldProp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2144:1: ( ( ( rule__FieldProp__TypeAssignment_1_1 ) ) )
            // InternalCMSdslParser.g:2145:1: ( ( rule__FieldProp__TypeAssignment_1_1 ) )
            {
            // InternalCMSdslParser.g:2145:1: ( ( rule__FieldProp__TypeAssignment_1_1 ) )
            // InternalCMSdslParser.g:2146:2: ( rule__FieldProp__TypeAssignment_1_1 )
            {
             before(grammarAccess.getFieldPropAccess().getTypeAssignment_1_1()); 
            // InternalCMSdslParser.g:2147:2: ( rule__FieldProp__TypeAssignment_1_1 )
            // InternalCMSdslParser.g:2147:3: rule__FieldProp__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldProp__TypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldPropAccess().getTypeAssignment_1_1()); 

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
    // $ANTLR end "rule__FieldProp__Group_1__1__Impl"


    // $ANTLR start "rule__FieldProp__Group_1__2"
    // InternalCMSdslParser.g:2155:1: rule__FieldProp__Group_1__2 : rule__FieldProp__Group_1__2__Impl rule__FieldProp__Group_1__3 ;
    public final void rule__FieldProp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2159:1: ( rule__FieldProp__Group_1__2__Impl rule__FieldProp__Group_1__3 )
            // InternalCMSdslParser.g:2160:2: rule__FieldProp__Group_1__2__Impl rule__FieldProp__Group_1__3
            {
            pushFollow(FOLLOW_12);
            rule__FieldProp__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldProp__Group_1__3();

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
    // $ANTLR end "rule__FieldProp__Group_1__2"


    // $ANTLR start "rule__FieldProp__Group_1__2__Impl"
    // InternalCMSdslParser.g:2167:1: rule__FieldProp__Group_1__2__Impl : ( Colon ) ;
    public final void rule__FieldProp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2171:1: ( ( Colon ) )
            // InternalCMSdslParser.g:2172:1: ( Colon )
            {
            // InternalCMSdslParser.g:2172:1: ( Colon )
            // InternalCMSdslParser.g:2173:2: Colon
            {
             before(grammarAccess.getFieldPropAccess().getColonKeyword_1_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getFieldPropAccess().getColonKeyword_1_2()); 

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
    // $ANTLR end "rule__FieldProp__Group_1__2__Impl"


    // $ANTLR start "rule__FieldProp__Group_1__3"
    // InternalCMSdslParser.g:2182:1: rule__FieldProp__Group_1__3 : rule__FieldProp__Group_1__3__Impl ;
    public final void rule__FieldProp__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2186:1: ( rule__FieldProp__Group_1__3__Impl )
            // InternalCMSdslParser.g:2187:2: rule__FieldProp__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldProp__Group_1__3__Impl();

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
    // $ANTLR end "rule__FieldProp__Group_1__3"


    // $ANTLR start "rule__FieldProp__Group_1__3__Impl"
    // InternalCMSdslParser.g:2193:1: rule__FieldProp__Group_1__3__Impl : ( ( rule__FieldProp__ValueAssignment_1_3 ) ) ;
    public final void rule__FieldProp__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2197:1: ( ( ( rule__FieldProp__ValueAssignment_1_3 ) ) )
            // InternalCMSdslParser.g:2198:1: ( ( rule__FieldProp__ValueAssignment_1_3 ) )
            {
            // InternalCMSdslParser.g:2198:1: ( ( rule__FieldProp__ValueAssignment_1_3 ) )
            // InternalCMSdslParser.g:2199:2: ( rule__FieldProp__ValueAssignment_1_3 )
            {
             before(grammarAccess.getFieldPropAccess().getValueAssignment_1_3()); 
            // InternalCMSdslParser.g:2200:2: ( rule__FieldProp__ValueAssignment_1_3 )
            // InternalCMSdslParser.g:2200:3: rule__FieldProp__ValueAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__FieldProp__ValueAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getFieldPropAccess().getValueAssignment_1_3()); 

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
    // $ANTLR end "rule__FieldProp__Group_1__3__Impl"


    // $ANTLR start "rule__DataType__Group_0__0"
    // InternalCMSdslParser.g:2209:1: rule__DataType__Group_0__0 : rule__DataType__Group_0__0__Impl rule__DataType__Group_0__1 ;
    public final void rule__DataType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2213:1: ( rule__DataType__Group_0__0__Impl rule__DataType__Group_0__1 )
            // InternalCMSdslParser.g:2214:2: rule__DataType__Group_0__0__Impl rule__DataType__Group_0__1
            {
            pushFollow(FOLLOW_28);
            rule__DataType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_0__1();

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
    // $ANTLR end "rule__DataType__Group_0__0"


    // $ANTLR start "rule__DataType__Group_0__0__Impl"
    // InternalCMSdslParser.g:2221:1: rule__DataType__Group_0__0__Impl : ( () ) ;
    public final void rule__DataType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2225:1: ( ( () ) )
            // InternalCMSdslParser.g:2226:1: ( () )
            {
            // InternalCMSdslParser.g:2226:1: ( () )
            // InternalCMSdslParser.g:2227:2: ()
            {
             before(grammarAccess.getDataTypeAccess().getStrAction_0_0()); 
            // InternalCMSdslParser.g:2228:2: ()
            // InternalCMSdslParser.g:2228:3: 
            {
            }

             after(grammarAccess.getDataTypeAccess().getStrAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_0__0__Impl"


    // $ANTLR start "rule__DataType__Group_0__1"
    // InternalCMSdslParser.g:2236:1: rule__DataType__Group_0__1 : rule__DataType__Group_0__1__Impl ;
    public final void rule__DataType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2240:1: ( rule__DataType__Group_0__1__Impl )
            // InternalCMSdslParser.g:2241:2: rule__DataType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group_0__1__Impl();

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
    // $ANTLR end "rule__DataType__Group_0__1"


    // $ANTLR start "rule__DataType__Group_0__1__Impl"
    // InternalCMSdslParser.g:2247:1: rule__DataType__Group_0__1__Impl : ( ( rule__DataType__TypeAssignment_0_1 ) ) ;
    public final void rule__DataType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2251:1: ( ( ( rule__DataType__TypeAssignment_0_1 ) ) )
            // InternalCMSdslParser.g:2252:1: ( ( rule__DataType__TypeAssignment_0_1 ) )
            {
            // InternalCMSdslParser.g:2252:1: ( ( rule__DataType__TypeAssignment_0_1 ) )
            // InternalCMSdslParser.g:2253:2: ( rule__DataType__TypeAssignment_0_1 )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAssignment_0_1()); 
            // InternalCMSdslParser.g:2254:2: ( rule__DataType__TypeAssignment_0_1 )
            // InternalCMSdslParser.g:2254:3: rule__DataType__TypeAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__TypeAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getTypeAssignment_0_1()); 

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
    // $ANTLR end "rule__DataType__Group_0__1__Impl"


    // $ANTLR start "rule__DataType__Group_1__0"
    // InternalCMSdslParser.g:2263:1: rule__DataType__Group_1__0 : rule__DataType__Group_1__0__Impl rule__DataType__Group_1__1 ;
    public final void rule__DataType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2267:1: ( rule__DataType__Group_1__0__Impl rule__DataType__Group_1__1 )
            // InternalCMSdslParser.g:2268:2: rule__DataType__Group_1__0__Impl rule__DataType__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__DataType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_1__1();

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
    // $ANTLR end "rule__DataType__Group_1__0"


    // $ANTLR start "rule__DataType__Group_1__0__Impl"
    // InternalCMSdslParser.g:2275:1: rule__DataType__Group_1__0__Impl : ( () ) ;
    public final void rule__DataType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2279:1: ( ( () ) )
            // InternalCMSdslParser.g:2280:1: ( () )
            {
            // InternalCMSdslParser.g:2280:1: ( () )
            // InternalCMSdslParser.g:2281:2: ()
            {
             before(grammarAccess.getDataTypeAccess().getDtAction_1_0()); 
            // InternalCMSdslParser.g:2282:2: ()
            // InternalCMSdslParser.g:2282:3: 
            {
            }

             after(grammarAccess.getDataTypeAccess().getDtAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1__0__Impl"


    // $ANTLR start "rule__DataType__Group_1__1"
    // InternalCMSdslParser.g:2290:1: rule__DataType__Group_1__1 : rule__DataType__Group_1__1__Impl ;
    public final void rule__DataType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2294:1: ( rule__DataType__Group_1__1__Impl )
            // InternalCMSdslParser.g:2295:2: rule__DataType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group_1__1__Impl();

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
    // $ANTLR end "rule__DataType__Group_1__1"


    // $ANTLR start "rule__DataType__Group_1__1__Impl"
    // InternalCMSdslParser.g:2301:1: rule__DataType__Group_1__1__Impl : ( ( rule__DataType__TypeAssignment_1_1 ) ) ;
    public final void rule__DataType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2305:1: ( ( ( rule__DataType__TypeAssignment_1_1 ) ) )
            // InternalCMSdslParser.g:2306:1: ( ( rule__DataType__TypeAssignment_1_1 ) )
            {
            // InternalCMSdslParser.g:2306:1: ( ( rule__DataType__TypeAssignment_1_1 ) )
            // InternalCMSdslParser.g:2307:2: ( rule__DataType__TypeAssignment_1_1 )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAssignment_1_1()); 
            // InternalCMSdslParser.g:2308:2: ( rule__DataType__TypeAssignment_1_1 )
            // InternalCMSdslParser.g:2308:3: rule__DataType__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__TypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getTypeAssignment_1_1()); 

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
    // $ANTLR end "rule__DataType__Group_1__1__Impl"


    // $ANTLR start "rule__DataType__Group_2__0"
    // InternalCMSdslParser.g:2317:1: rule__DataType__Group_2__0 : rule__DataType__Group_2__0__Impl rule__DataType__Group_2__1 ;
    public final void rule__DataType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2321:1: ( rule__DataType__Group_2__0__Impl rule__DataType__Group_2__1 )
            // InternalCMSdslParser.g:2322:2: rule__DataType__Group_2__0__Impl rule__DataType__Group_2__1
            {
            pushFollow(FOLLOW_30);
            rule__DataType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_2__1();

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
    // $ANTLR end "rule__DataType__Group_2__0"


    // $ANTLR start "rule__DataType__Group_2__0__Impl"
    // InternalCMSdslParser.g:2329:1: rule__DataType__Group_2__0__Impl : ( () ) ;
    public final void rule__DataType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2333:1: ( ( () ) )
            // InternalCMSdslParser.g:2334:1: ( () )
            {
            // InternalCMSdslParser.g:2334:1: ( () )
            // InternalCMSdslParser.g:2335:2: ()
            {
             before(grammarAccess.getDataTypeAccess().getIntegAction_2_0()); 
            // InternalCMSdslParser.g:2336:2: ()
            // InternalCMSdslParser.g:2336:3: 
            {
            }

             after(grammarAccess.getDataTypeAccess().getIntegAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__0__Impl"


    // $ANTLR start "rule__DataType__Group_2__1"
    // InternalCMSdslParser.g:2344:1: rule__DataType__Group_2__1 : rule__DataType__Group_2__1__Impl ;
    public final void rule__DataType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2348:1: ( rule__DataType__Group_2__1__Impl )
            // InternalCMSdslParser.g:2349:2: rule__DataType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group_2__1__Impl();

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
    // $ANTLR end "rule__DataType__Group_2__1"


    // $ANTLR start "rule__DataType__Group_2__1__Impl"
    // InternalCMSdslParser.g:2355:1: rule__DataType__Group_2__1__Impl : ( ( rule__DataType__TypeAssignment_2_1 ) ) ;
    public final void rule__DataType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2359:1: ( ( ( rule__DataType__TypeAssignment_2_1 ) ) )
            // InternalCMSdslParser.g:2360:1: ( ( rule__DataType__TypeAssignment_2_1 ) )
            {
            // InternalCMSdslParser.g:2360:1: ( ( rule__DataType__TypeAssignment_2_1 ) )
            // InternalCMSdslParser.g:2361:2: ( rule__DataType__TypeAssignment_2_1 )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAssignment_2_1()); 
            // InternalCMSdslParser.g:2362:2: ( rule__DataType__TypeAssignment_2_1 )
            // InternalCMSdslParser.g:2362:3: rule__DataType__TypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__TypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__DataType__Group_2__1__Impl"


    // $ANTLR start "rule__DataType__Group_3__0"
    // InternalCMSdslParser.g:2371:1: rule__DataType__Group_3__0 : rule__DataType__Group_3__0__Impl rule__DataType__Group_3__1 ;
    public final void rule__DataType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2375:1: ( rule__DataType__Group_3__0__Impl rule__DataType__Group_3__1 )
            // InternalCMSdslParser.g:2376:2: rule__DataType__Group_3__0__Impl rule__DataType__Group_3__1
            {
            pushFollow(FOLLOW_31);
            rule__DataType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_3__1();

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
    // $ANTLR end "rule__DataType__Group_3__0"


    // $ANTLR start "rule__DataType__Group_3__0__Impl"
    // InternalCMSdslParser.g:2383:1: rule__DataType__Group_3__0__Impl : ( () ) ;
    public final void rule__DataType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2387:1: ( ( () ) )
            // InternalCMSdslParser.g:2388:1: ( () )
            {
            // InternalCMSdslParser.g:2388:1: ( () )
            // InternalCMSdslParser.g:2389:2: ()
            {
             before(grammarAccess.getDataTypeAccess().getLngAction_3_0()); 
            // InternalCMSdslParser.g:2390:2: ()
            // InternalCMSdslParser.g:2390:3: 
            {
            }

             after(grammarAccess.getDataTypeAccess().getLngAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_3__0__Impl"


    // $ANTLR start "rule__DataType__Group_3__1"
    // InternalCMSdslParser.g:2398:1: rule__DataType__Group_3__1 : rule__DataType__Group_3__1__Impl ;
    public final void rule__DataType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2402:1: ( rule__DataType__Group_3__1__Impl )
            // InternalCMSdslParser.g:2403:2: rule__DataType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group_3__1__Impl();

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
    // $ANTLR end "rule__DataType__Group_3__1"


    // $ANTLR start "rule__DataType__Group_3__1__Impl"
    // InternalCMSdslParser.g:2409:1: rule__DataType__Group_3__1__Impl : ( ( rule__DataType__TypeAssignment_3_1 ) ) ;
    public final void rule__DataType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2413:1: ( ( ( rule__DataType__TypeAssignment_3_1 ) ) )
            // InternalCMSdslParser.g:2414:1: ( ( rule__DataType__TypeAssignment_3_1 ) )
            {
            // InternalCMSdslParser.g:2414:1: ( ( rule__DataType__TypeAssignment_3_1 ) )
            // InternalCMSdslParser.g:2415:2: ( rule__DataType__TypeAssignment_3_1 )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAssignment_3_1()); 
            // InternalCMSdslParser.g:2416:2: ( rule__DataType__TypeAssignment_3_1 )
            // InternalCMSdslParser.g:2416:3: rule__DataType__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getTypeAssignment_3_1()); 

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
    // $ANTLR end "rule__DataType__Group_3__1__Impl"


    // $ANTLR start "rule__DataType__Group_4__0"
    // InternalCMSdslParser.g:2425:1: rule__DataType__Group_4__0 : rule__DataType__Group_4__0__Impl rule__DataType__Group_4__1 ;
    public final void rule__DataType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2429:1: ( rule__DataType__Group_4__0__Impl rule__DataType__Group_4__1 )
            // InternalCMSdslParser.g:2430:2: rule__DataType__Group_4__0__Impl rule__DataType__Group_4__1
            {
            pushFollow(FOLLOW_32);
            rule__DataType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_4__1();

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
    // $ANTLR end "rule__DataType__Group_4__0"


    // $ANTLR start "rule__DataType__Group_4__0__Impl"
    // InternalCMSdslParser.g:2437:1: rule__DataType__Group_4__0__Impl : ( () ) ;
    public final void rule__DataType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2441:1: ( ( () ) )
            // InternalCMSdslParser.g:2442:1: ( () )
            {
            // InternalCMSdslParser.g:2442:1: ( () )
            // InternalCMSdslParser.g:2443:2: ()
            {
             before(grammarAccess.getDataTypeAccess().getBoolAction_4_0()); 
            // InternalCMSdslParser.g:2444:2: ()
            // InternalCMSdslParser.g:2444:3: 
            {
            }

             after(grammarAccess.getDataTypeAccess().getBoolAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_4__0__Impl"


    // $ANTLR start "rule__DataType__Group_4__1"
    // InternalCMSdslParser.g:2452:1: rule__DataType__Group_4__1 : rule__DataType__Group_4__1__Impl ;
    public final void rule__DataType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2456:1: ( rule__DataType__Group_4__1__Impl )
            // InternalCMSdslParser.g:2457:2: rule__DataType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group_4__1__Impl();

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
    // $ANTLR end "rule__DataType__Group_4__1"


    // $ANTLR start "rule__DataType__Group_4__1__Impl"
    // InternalCMSdslParser.g:2463:1: rule__DataType__Group_4__1__Impl : ( ( rule__DataType__TypeAssignment_4_1 ) ) ;
    public final void rule__DataType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2467:1: ( ( ( rule__DataType__TypeAssignment_4_1 ) ) )
            // InternalCMSdslParser.g:2468:1: ( ( rule__DataType__TypeAssignment_4_1 ) )
            {
            // InternalCMSdslParser.g:2468:1: ( ( rule__DataType__TypeAssignment_4_1 ) )
            // InternalCMSdslParser.g:2469:2: ( rule__DataType__TypeAssignment_4_1 )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAssignment_4_1()); 
            // InternalCMSdslParser.g:2470:2: ( rule__DataType__TypeAssignment_4_1 )
            // InternalCMSdslParser.g:2470:3: rule__DataType__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getTypeAssignment_4_1()); 

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
    // $ANTLR end "rule__DataType__Group_4__1__Impl"


    // $ANTLR start "rule__DataType__Group_5__0"
    // InternalCMSdslParser.g:2479:1: rule__DataType__Group_5__0 : rule__DataType__Group_5__0__Impl rule__DataType__Group_5__1 ;
    public final void rule__DataType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2483:1: ( rule__DataType__Group_5__0__Impl rule__DataType__Group_5__1 )
            // InternalCMSdslParser.g:2484:2: rule__DataType__Group_5__0__Impl rule__DataType__Group_5__1
            {
            pushFollow(FOLLOW_20);
            rule__DataType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_5__1();

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
    // $ANTLR end "rule__DataType__Group_5__0"


    // $ANTLR start "rule__DataType__Group_5__0__Impl"
    // InternalCMSdslParser.g:2491:1: rule__DataType__Group_5__0__Impl : ( () ) ;
    public final void rule__DataType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2495:1: ( ( () ) )
            // InternalCMSdslParser.g:2496:1: ( () )
            {
            // InternalCMSdslParser.g:2496:1: ( () )
            // InternalCMSdslParser.g:2497:2: ()
            {
             before(grammarAccess.getDataTypeAccess().getFltAction_5_0()); 
            // InternalCMSdslParser.g:2498:2: ()
            // InternalCMSdslParser.g:2498:3: 
            {
            }

             after(grammarAccess.getDataTypeAccess().getFltAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_5__0__Impl"


    // $ANTLR start "rule__DataType__Group_5__1"
    // InternalCMSdslParser.g:2506:1: rule__DataType__Group_5__1 : rule__DataType__Group_5__1__Impl ;
    public final void rule__DataType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2510:1: ( rule__DataType__Group_5__1__Impl )
            // InternalCMSdslParser.g:2511:2: rule__DataType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group_5__1__Impl();

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
    // $ANTLR end "rule__DataType__Group_5__1"


    // $ANTLR start "rule__DataType__Group_5__1__Impl"
    // InternalCMSdslParser.g:2517:1: rule__DataType__Group_5__1__Impl : ( ( rule__DataType__TypeAssignment_5_1 ) ) ;
    public final void rule__DataType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2521:1: ( ( ( rule__DataType__TypeAssignment_5_1 ) ) )
            // InternalCMSdslParser.g:2522:1: ( ( rule__DataType__TypeAssignment_5_1 ) )
            {
            // InternalCMSdslParser.g:2522:1: ( ( rule__DataType__TypeAssignment_5_1 ) )
            // InternalCMSdslParser.g:2523:2: ( rule__DataType__TypeAssignment_5_1 )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAssignment_5_1()); 
            // InternalCMSdslParser.g:2524:2: ( rule__DataType__TypeAssignment_5_1 )
            // InternalCMSdslParser.g:2524:3: rule__DataType__TypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__TypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getTypeAssignment_5_1()); 

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
    // $ANTLR end "rule__DataType__Group_5__1__Impl"


    // $ANTLR start "rule__Project__NameAssignment_1"
    // InternalCMSdslParser.g:2533:1: rule__Project__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Project__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2537:1: ( ( RULE_ID ) )
            // InternalCMSdslParser.g:2538:2: ( RULE_ID )
            {
            // InternalCMSdslParser.g:2538:2: ( RULE_ID )
            // InternalCMSdslParser.g:2539:3: RULE_ID
            {
             before(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Project__NameAssignment_1"


    // $ANTLR start "rule__Project__ElementsAssignment_4"
    // InternalCMSdslParser.g:2548:1: rule__Project__ElementsAssignment_4 : ( rulePrimaryElement ) ;
    public final void rule__Project__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2552:1: ( ( rulePrimaryElement ) )
            // InternalCMSdslParser.g:2553:2: ( rulePrimaryElement )
            {
            // InternalCMSdslParser.g:2553:2: ( rulePrimaryElement )
            // InternalCMSdslParser.g:2554:3: rulePrimaryElement
            {
             before(grammarAccess.getProjectAccess().getElementsPrimaryElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryElement();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getElementsPrimaryElementParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Project__ElementsAssignment_4"


    // $ANTLR start "rule__DBConfig__TypeAssignment_1"
    // InternalCMSdslParser.g:2563:1: rule__DBConfig__TypeAssignment_1 : ( ( Database ) ) ;
    public final void rule__DBConfig__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2567:1: ( ( ( Database ) ) )
            // InternalCMSdslParser.g:2568:2: ( ( Database ) )
            {
            // InternalCMSdslParser.g:2568:2: ( ( Database ) )
            // InternalCMSdslParser.g:2569:3: ( Database )
            {
             before(grammarAccess.getDBConfigAccess().getTypeDatabaseKeyword_1_0()); 
            // InternalCMSdslParser.g:2570:3: ( Database )
            // InternalCMSdslParser.g:2571:4: Database
            {
             before(grammarAccess.getDBConfigAccess().getTypeDatabaseKeyword_1_0()); 
            match(input,Database,FOLLOW_2); 
             after(grammarAccess.getDBConfigAccess().getTypeDatabaseKeyword_1_0()); 

            }

             after(grammarAccess.getDBConfigAccess().getTypeDatabaseKeyword_1_0()); 

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
    // $ANTLR end "rule__DBConfig__TypeAssignment_1"


    // $ANTLR start "rule__DBConfig__ConfigAssignment_4"
    // InternalCMSdslParser.g:2582:1: rule__DBConfig__ConfigAssignment_4 : ( ruleDBDecl ) ;
    public final void rule__DBConfig__ConfigAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2586:1: ( ( ruleDBDecl ) )
            // InternalCMSdslParser.g:2587:2: ( ruleDBDecl )
            {
            // InternalCMSdslParser.g:2587:2: ( ruleDBDecl )
            // InternalCMSdslParser.g:2588:3: ruleDBDecl
            {
             before(grammarAccess.getDBConfigAccess().getConfigDBDeclParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDBDecl();

            state._fsp--;

             after(grammarAccess.getDBConfigAccess().getConfigDBDeclParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__DBConfig__ConfigAssignment_4"


    // $ANTLR start "rule__DBDecl__TypeAssignment_0_1"
    // InternalCMSdslParser.g:2597:1: rule__DBDecl__TypeAssignment_0_1 : ( ( Library ) ) ;
    public final void rule__DBDecl__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2601:1: ( ( ( Library ) ) )
            // InternalCMSdslParser.g:2602:2: ( ( Library ) )
            {
            // InternalCMSdslParser.g:2602:2: ( ( Library ) )
            // InternalCMSdslParser.g:2603:3: ( Library )
            {
             before(grammarAccess.getDBDeclAccess().getTypeLibraryKeyword_0_1_0()); 
            // InternalCMSdslParser.g:2604:3: ( Library )
            // InternalCMSdslParser.g:2605:4: Library
            {
             before(grammarAccess.getDBDeclAccess().getTypeLibraryKeyword_0_1_0()); 
            match(input,Library,FOLLOW_2); 
             after(grammarAccess.getDBDeclAccess().getTypeLibraryKeyword_0_1_0()); 

            }

             after(grammarAccess.getDBDeclAccess().getTypeLibraryKeyword_0_1_0()); 

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
    // $ANTLR end "rule__DBDecl__TypeAssignment_0_1"


    // $ANTLR start "rule__DBDecl__ValueAssignment_0_3"
    // InternalCMSdslParser.g:2616:1: rule__DBDecl__ValueAssignment_0_3 : ( RULE_STRING ) ;
    public final void rule__DBDecl__ValueAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2620:1: ( ( RULE_STRING ) )
            // InternalCMSdslParser.g:2621:2: ( RULE_STRING )
            {
            // InternalCMSdslParser.g:2621:2: ( RULE_STRING )
            // InternalCMSdslParser.g:2622:3: RULE_STRING
            {
             before(grammarAccess.getDBDeclAccess().getValueSTRINGTerminalRuleCall_0_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDBDeclAccess().getValueSTRINGTerminalRuleCall_0_3_0()); 

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
    // $ANTLR end "rule__DBDecl__ValueAssignment_0_3"


    // $ANTLR start "rule__DBDecl__TypeAssignment_1_1"
    // InternalCMSdslParser.g:2631:1: rule__DBDecl__TypeAssignment_1_1 : ( ( Hostname ) ) ;
    public final void rule__DBDecl__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2635:1: ( ( ( Hostname ) ) )
            // InternalCMSdslParser.g:2636:2: ( ( Hostname ) )
            {
            // InternalCMSdslParser.g:2636:2: ( ( Hostname ) )
            // InternalCMSdslParser.g:2637:3: ( Hostname )
            {
             before(grammarAccess.getDBDeclAccess().getTypeHostnameKeyword_1_1_0()); 
            // InternalCMSdslParser.g:2638:3: ( Hostname )
            // InternalCMSdslParser.g:2639:4: Hostname
            {
             before(grammarAccess.getDBDeclAccess().getTypeHostnameKeyword_1_1_0()); 
            match(input,Hostname,FOLLOW_2); 
             after(grammarAccess.getDBDeclAccess().getTypeHostnameKeyword_1_1_0()); 

            }

             after(grammarAccess.getDBDeclAccess().getTypeHostnameKeyword_1_1_0()); 

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
    // $ANTLR end "rule__DBDecl__TypeAssignment_1_1"


    // $ANTLR start "rule__DBDecl__ValueAssignment_1_3"
    // InternalCMSdslParser.g:2650:1: rule__DBDecl__ValueAssignment_1_3 : ( RULE_STRING ) ;
    public final void rule__DBDecl__ValueAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2654:1: ( ( RULE_STRING ) )
            // InternalCMSdslParser.g:2655:2: ( RULE_STRING )
            {
            // InternalCMSdslParser.g:2655:2: ( RULE_STRING )
            // InternalCMSdslParser.g:2656:3: RULE_STRING
            {
             before(grammarAccess.getDBDeclAccess().getValueSTRINGTerminalRuleCall_1_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDBDeclAccess().getValueSTRINGTerminalRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__DBDecl__ValueAssignment_1_3"


    // $ANTLR start "rule__DBDecl__TypeAssignment_2_1"
    // InternalCMSdslParser.g:2665:1: rule__DBDecl__TypeAssignment_2_1 : ( ( Port ) ) ;
    public final void rule__DBDecl__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2669:1: ( ( ( Port ) ) )
            // InternalCMSdslParser.g:2670:2: ( ( Port ) )
            {
            // InternalCMSdslParser.g:2670:2: ( ( Port ) )
            // InternalCMSdslParser.g:2671:3: ( Port )
            {
             before(grammarAccess.getDBDeclAccess().getTypePortKeyword_2_1_0()); 
            // InternalCMSdslParser.g:2672:3: ( Port )
            // InternalCMSdslParser.g:2673:4: Port
            {
             before(grammarAccess.getDBDeclAccess().getTypePortKeyword_2_1_0()); 
            match(input,Port,FOLLOW_2); 
             after(grammarAccess.getDBDeclAccess().getTypePortKeyword_2_1_0()); 

            }

             after(grammarAccess.getDBDeclAccess().getTypePortKeyword_2_1_0()); 

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
    // $ANTLR end "rule__DBDecl__TypeAssignment_2_1"


    // $ANTLR start "rule__DBDecl__ValueAssignment_2_3"
    // InternalCMSdslParser.g:2684:1: rule__DBDecl__ValueAssignment_2_3 : ( RULE_INT ) ;
    public final void rule__DBDecl__ValueAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2688:1: ( ( RULE_INT ) )
            // InternalCMSdslParser.g:2689:2: ( RULE_INT )
            {
            // InternalCMSdslParser.g:2689:2: ( RULE_INT )
            // InternalCMSdslParser.g:2690:3: RULE_INT
            {
             before(grammarAccess.getDBDeclAccess().getValueINTTerminalRuleCall_2_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDBDeclAccess().getValueINTTerminalRuleCall_2_3_0()); 

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
    // $ANTLR end "rule__DBDecl__ValueAssignment_2_3"


    // $ANTLR start "rule__DBDecl__TypeAssignment_3_1"
    // InternalCMSdslParser.g:2699:1: rule__DBDecl__TypeAssignment_3_1 : ( ( Dialect ) ) ;
    public final void rule__DBDecl__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2703:1: ( ( ( Dialect ) ) )
            // InternalCMSdslParser.g:2704:2: ( ( Dialect ) )
            {
            // InternalCMSdslParser.g:2704:2: ( ( Dialect ) )
            // InternalCMSdslParser.g:2705:3: ( Dialect )
            {
             before(grammarAccess.getDBDeclAccess().getTypeDialectKeyword_3_1_0()); 
            // InternalCMSdslParser.g:2706:3: ( Dialect )
            // InternalCMSdslParser.g:2707:4: Dialect
            {
             before(grammarAccess.getDBDeclAccess().getTypeDialectKeyword_3_1_0()); 
            match(input,Dialect,FOLLOW_2); 
             after(grammarAccess.getDBDeclAccess().getTypeDialectKeyword_3_1_0()); 

            }

             after(grammarAccess.getDBDeclAccess().getTypeDialectKeyword_3_1_0()); 

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
    // $ANTLR end "rule__DBDecl__TypeAssignment_3_1"


    // $ANTLR start "rule__DBDecl__ValueAssignment_3_3"
    // InternalCMSdslParser.g:2718:1: rule__DBDecl__ValueAssignment_3_3 : ( RULE_STRING ) ;
    public final void rule__DBDecl__ValueAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2722:1: ( ( RULE_STRING ) )
            // InternalCMSdslParser.g:2723:2: ( RULE_STRING )
            {
            // InternalCMSdslParser.g:2723:2: ( RULE_STRING )
            // InternalCMSdslParser.g:2724:3: RULE_STRING
            {
             before(grammarAccess.getDBDeclAccess().getValueSTRINGTerminalRuleCall_3_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDBDeclAccess().getValueSTRINGTerminalRuleCall_3_3_0()); 

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
    // $ANTLR end "rule__DBDecl__ValueAssignment_3_3"


    // $ANTLR start "rule__DBDecl__TypeAssignment_4_1"
    // InternalCMSdslParser.g:2733:1: rule__DBDecl__TypeAssignment_4_1 : ( ( Username ) ) ;
    public final void rule__DBDecl__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2737:1: ( ( ( Username ) ) )
            // InternalCMSdslParser.g:2738:2: ( ( Username ) )
            {
            // InternalCMSdslParser.g:2738:2: ( ( Username ) )
            // InternalCMSdslParser.g:2739:3: ( Username )
            {
             before(grammarAccess.getDBDeclAccess().getTypeUsernameKeyword_4_1_0()); 
            // InternalCMSdslParser.g:2740:3: ( Username )
            // InternalCMSdslParser.g:2741:4: Username
            {
             before(grammarAccess.getDBDeclAccess().getTypeUsernameKeyword_4_1_0()); 
            match(input,Username,FOLLOW_2); 
             after(grammarAccess.getDBDeclAccess().getTypeUsernameKeyword_4_1_0()); 

            }

             after(grammarAccess.getDBDeclAccess().getTypeUsernameKeyword_4_1_0()); 

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
    // $ANTLR end "rule__DBDecl__TypeAssignment_4_1"


    // $ANTLR start "rule__DBDecl__ValueAssignment_4_3"
    // InternalCMSdslParser.g:2752:1: rule__DBDecl__ValueAssignment_4_3 : ( RULE_STRING ) ;
    public final void rule__DBDecl__ValueAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2756:1: ( ( RULE_STRING ) )
            // InternalCMSdslParser.g:2757:2: ( RULE_STRING )
            {
            // InternalCMSdslParser.g:2757:2: ( RULE_STRING )
            // InternalCMSdslParser.g:2758:3: RULE_STRING
            {
             before(grammarAccess.getDBDeclAccess().getValueSTRINGTerminalRuleCall_4_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDBDeclAccess().getValueSTRINGTerminalRuleCall_4_3_0()); 

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
    // $ANTLR end "rule__DBDecl__ValueAssignment_4_3"


    // $ANTLR start "rule__DBDecl__TypeAssignment_5_1"
    // InternalCMSdslParser.g:2767:1: rule__DBDecl__TypeAssignment_5_1 : ( ( Password ) ) ;
    public final void rule__DBDecl__TypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2771:1: ( ( ( Password ) ) )
            // InternalCMSdslParser.g:2772:2: ( ( Password ) )
            {
            // InternalCMSdslParser.g:2772:2: ( ( Password ) )
            // InternalCMSdslParser.g:2773:3: ( Password )
            {
             before(grammarAccess.getDBDeclAccess().getTypePasswordKeyword_5_1_0()); 
            // InternalCMSdslParser.g:2774:3: ( Password )
            // InternalCMSdslParser.g:2775:4: Password
            {
             before(grammarAccess.getDBDeclAccess().getTypePasswordKeyword_5_1_0()); 
            match(input,Password,FOLLOW_2); 
             after(grammarAccess.getDBDeclAccess().getTypePasswordKeyword_5_1_0()); 

            }

             after(grammarAccess.getDBDeclAccess().getTypePasswordKeyword_5_1_0()); 

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
    // $ANTLR end "rule__DBDecl__TypeAssignment_5_1"


    // $ANTLR start "rule__DBDecl__ValueAssignment_5_3"
    // InternalCMSdslParser.g:2786:1: rule__DBDecl__ValueAssignment_5_3 : ( RULE_STRING ) ;
    public final void rule__DBDecl__ValueAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2790:1: ( ( RULE_STRING ) )
            // InternalCMSdslParser.g:2791:2: ( RULE_STRING )
            {
            // InternalCMSdslParser.g:2791:2: ( RULE_STRING )
            // InternalCMSdslParser.g:2792:3: RULE_STRING
            {
             before(grammarAccess.getDBDeclAccess().getValueSTRINGTerminalRuleCall_5_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDBDeclAccess().getValueSTRINGTerminalRuleCall_5_3_0()); 

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
    // $ANTLR end "rule__DBDecl__ValueAssignment_5_3"


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // InternalCMSdslParser.g:2801:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2805:1: ( ( RULE_ID ) )
            // InternalCMSdslParser.g:2806:2: ( RULE_ID )
            {
            // InternalCMSdslParser.g:2806:2: ( RULE_ID )
            // InternalCMSdslParser.g:2807:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_2"


    // $ANTLR start "rule__Entity__ModelAssignment_5"
    // InternalCMSdslParser.g:2816:1: rule__Entity__ModelAssignment_5 : ( ruleEntityModel ) ;
    public final void rule__Entity__ModelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2820:1: ( ( ruleEntityModel ) )
            // InternalCMSdslParser.g:2821:2: ( ruleEntityModel )
            {
            // InternalCMSdslParser.g:2821:2: ( ruleEntityModel )
            // InternalCMSdslParser.g:2822:3: ruleEntityModel
            {
             before(grammarAccess.getEntityAccess().getModelEntityModelParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityModel();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getModelEntityModelParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Entity__ModelAssignment_5"


    // $ANTLR start "rule__Entity__ServiceAssignment_6"
    // InternalCMSdslParser.g:2831:1: rule__Entity__ServiceAssignment_6 : ( ruleEntityService ) ;
    public final void rule__Entity__ServiceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2835:1: ( ( ruleEntityService ) )
            // InternalCMSdslParser.g:2836:2: ( ruleEntityService )
            {
            // InternalCMSdslParser.g:2836:2: ( ruleEntityService )
            // InternalCMSdslParser.g:2837:3: ruleEntityService
            {
             before(grammarAccess.getEntityAccess().getServiceEntityServiceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityService();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getServiceEntityServiceParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Entity__ServiceAssignment_6"


    // $ANTLR start "rule__Entity__UiAssignment_7"
    // InternalCMSdslParser.g:2846:1: rule__Entity__UiAssignment_7 : ( ruleEntityUI ) ;
    public final void rule__Entity__UiAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2850:1: ( ( ruleEntityUI ) )
            // InternalCMSdslParser.g:2851:2: ( ruleEntityUI )
            {
            // InternalCMSdslParser.g:2851:2: ( ruleEntityUI )
            // InternalCMSdslParser.g:2852:3: ruleEntityUI
            {
             before(grammarAccess.getEntityAccess().getUiEntityUIParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityUI();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getUiEntityUIParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Entity__UiAssignment_7"


    // $ANTLR start "rule__EntityModel__FieldsAssignment_1"
    // InternalCMSdslParser.g:2861:1: rule__EntityModel__FieldsAssignment_1 : ( ruleField ) ;
    public final void rule__EntityModel__FieldsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2865:1: ( ( ruleField ) )
            // InternalCMSdslParser.g:2866:2: ( ruleField )
            {
            // InternalCMSdslParser.g:2866:2: ( ruleField )
            // InternalCMSdslParser.g:2867:3: ruleField
            {
             before(grammarAccess.getEntityModelAccess().getFieldsFieldParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getEntityModelAccess().getFieldsFieldParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EntityModel__FieldsAssignment_1"


    // $ANTLR start "rule__Field__TypeAssignment_0"
    // InternalCMSdslParser.g:2876:1: rule__Field__TypeAssignment_0 : ( ruleDataType ) ;
    public final void rule__Field__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2880:1: ( ( ruleDataType ) )
            // InternalCMSdslParser.g:2881:2: ( ruleDataType )
            {
            // InternalCMSdslParser.g:2881:2: ( ruleDataType )
            // InternalCMSdslParser.g:2882:3: ruleDataType
            {
             before(grammarAccess.getFieldAccess().getTypeDataTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypeDataTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Field__TypeAssignment_0"


    // $ANTLR start "rule__Field__NameAssignment_1"
    // InternalCMSdslParser.g:2891:1: rule__Field__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2895:1: ( ( RULE_ID ) )
            // InternalCMSdslParser.g:2896:2: ( RULE_ID )
            {
            // InternalCMSdslParser.g:2896:2: ( RULE_ID )
            // InternalCMSdslParser.g:2897:3: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Field__NameAssignment_1"


    // $ANTLR start "rule__Field__PropertiesAssignment_4"
    // InternalCMSdslParser.g:2906:1: rule__Field__PropertiesAssignment_4 : ( ruleFieldProp ) ;
    public final void rule__Field__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2910:1: ( ( ruleFieldProp ) )
            // InternalCMSdslParser.g:2911:2: ( ruleFieldProp )
            {
            // InternalCMSdslParser.g:2911:2: ( ruleFieldProp )
            // InternalCMSdslParser.g:2912:3: ruleFieldProp
            {
             before(grammarAccess.getFieldAccess().getPropertiesFieldPropParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldProp();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getPropertiesFieldPropParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Field__PropertiesAssignment_4"


    // $ANTLR start "rule__FieldProp__TypeAssignment_0_1"
    // InternalCMSdslParser.g:2921:1: rule__FieldProp__TypeAssignment_0_1 : ( ( Default ) ) ;
    public final void rule__FieldProp__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2925:1: ( ( ( Default ) ) )
            // InternalCMSdslParser.g:2926:2: ( ( Default ) )
            {
            // InternalCMSdslParser.g:2926:2: ( ( Default ) )
            // InternalCMSdslParser.g:2927:3: ( Default )
            {
             before(grammarAccess.getFieldPropAccess().getTypeDefaultKeyword_0_1_0()); 
            // InternalCMSdslParser.g:2928:3: ( Default )
            // InternalCMSdslParser.g:2929:4: Default
            {
             before(grammarAccess.getFieldPropAccess().getTypeDefaultKeyword_0_1_0()); 
            match(input,Default,FOLLOW_2); 
             after(grammarAccess.getFieldPropAccess().getTypeDefaultKeyword_0_1_0()); 

            }

             after(grammarAccess.getFieldPropAccess().getTypeDefaultKeyword_0_1_0()); 

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
    // $ANTLR end "rule__FieldProp__TypeAssignment_0_1"


    // $ANTLR start "rule__FieldProp__ValueAssignment_0_3"
    // InternalCMSdslParser.g:2940:1: rule__FieldProp__ValueAssignment_0_3 : ( RULE_STRING ) ;
    public final void rule__FieldProp__ValueAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2944:1: ( ( RULE_STRING ) )
            // InternalCMSdslParser.g:2945:2: ( RULE_STRING )
            {
            // InternalCMSdslParser.g:2945:2: ( RULE_STRING )
            // InternalCMSdslParser.g:2946:3: RULE_STRING
            {
             before(grammarAccess.getFieldPropAccess().getValueSTRINGTerminalRuleCall_0_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFieldPropAccess().getValueSTRINGTerminalRuleCall_0_3_0()); 

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
    // $ANTLR end "rule__FieldProp__ValueAssignment_0_3"


    // $ANTLR start "rule__FieldProp__TypeAssignment_1_1"
    // InternalCMSdslParser.g:2955:1: rule__FieldProp__TypeAssignment_1_1 : ( ( Test ) ) ;
    public final void rule__FieldProp__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2959:1: ( ( ( Test ) ) )
            // InternalCMSdslParser.g:2960:2: ( ( Test ) )
            {
            // InternalCMSdslParser.g:2960:2: ( ( Test ) )
            // InternalCMSdslParser.g:2961:3: ( Test )
            {
             before(grammarAccess.getFieldPropAccess().getTypeTestKeyword_1_1_0()); 
            // InternalCMSdslParser.g:2962:3: ( Test )
            // InternalCMSdslParser.g:2963:4: Test
            {
             before(grammarAccess.getFieldPropAccess().getTypeTestKeyword_1_1_0()); 
            match(input,Test,FOLLOW_2); 
             after(grammarAccess.getFieldPropAccess().getTypeTestKeyword_1_1_0()); 

            }

             after(grammarAccess.getFieldPropAccess().getTypeTestKeyword_1_1_0()); 

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
    // $ANTLR end "rule__FieldProp__TypeAssignment_1_1"


    // $ANTLR start "rule__FieldProp__ValueAssignment_1_3"
    // InternalCMSdslParser.g:2974:1: rule__FieldProp__ValueAssignment_1_3 : ( RULE_STRING ) ;
    public final void rule__FieldProp__ValueAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2978:1: ( ( RULE_STRING ) )
            // InternalCMSdslParser.g:2979:2: ( RULE_STRING )
            {
            // InternalCMSdslParser.g:2979:2: ( RULE_STRING )
            // InternalCMSdslParser.g:2980:3: RULE_STRING
            {
             before(grammarAccess.getFieldPropAccess().getValueSTRINGTerminalRuleCall_1_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFieldPropAccess().getValueSTRINGTerminalRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__FieldProp__ValueAssignment_1_3"


    // $ANTLR start "rule__DataType__TypeAssignment_0_1"
    // InternalCMSdslParser.g:2989:1: rule__DataType__TypeAssignment_0_1 : ( ( String ) ) ;
    public final void rule__DataType__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:2993:1: ( ( ( String ) ) )
            // InternalCMSdslParser.g:2994:2: ( ( String ) )
            {
            // InternalCMSdslParser.g:2994:2: ( ( String ) )
            // InternalCMSdslParser.g:2995:3: ( String )
            {
             before(grammarAccess.getDataTypeAccess().getTypeStringKeyword_0_1_0()); 
            // InternalCMSdslParser.g:2996:3: ( String )
            // InternalCMSdslParser.g:2997:4: String
            {
             before(grammarAccess.getDataTypeAccess().getTypeStringKeyword_0_1_0()); 
            match(input,String,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getTypeStringKeyword_0_1_0()); 

            }

             after(grammarAccess.getDataTypeAccess().getTypeStringKeyword_0_1_0()); 

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
    // $ANTLR end "rule__DataType__TypeAssignment_0_1"


    // $ANTLR start "rule__DataType__TypeAssignment_1_1"
    // InternalCMSdslParser.g:3008:1: rule__DataType__TypeAssignment_1_1 : ( ( Date ) ) ;
    public final void rule__DataType__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:3012:1: ( ( ( Date ) ) )
            // InternalCMSdslParser.g:3013:2: ( ( Date ) )
            {
            // InternalCMSdslParser.g:3013:2: ( ( Date ) )
            // InternalCMSdslParser.g:3014:3: ( Date )
            {
             before(grammarAccess.getDataTypeAccess().getTypeDateKeyword_1_1_0()); 
            // InternalCMSdslParser.g:3015:3: ( Date )
            // InternalCMSdslParser.g:3016:4: Date
            {
             before(grammarAccess.getDataTypeAccess().getTypeDateKeyword_1_1_0()); 
            match(input,Date,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getTypeDateKeyword_1_1_0()); 

            }

             after(grammarAccess.getDataTypeAccess().getTypeDateKeyword_1_1_0()); 

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
    // $ANTLR end "rule__DataType__TypeAssignment_1_1"


    // $ANTLR start "rule__DataType__TypeAssignment_2_1"
    // InternalCMSdslParser.g:3027:1: rule__DataType__TypeAssignment_2_1 : ( ( Int ) ) ;
    public final void rule__DataType__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:3031:1: ( ( ( Int ) ) )
            // InternalCMSdslParser.g:3032:2: ( ( Int ) )
            {
            // InternalCMSdslParser.g:3032:2: ( ( Int ) )
            // InternalCMSdslParser.g:3033:3: ( Int )
            {
             before(grammarAccess.getDataTypeAccess().getTypeIntKeyword_2_1_0()); 
            // InternalCMSdslParser.g:3034:3: ( Int )
            // InternalCMSdslParser.g:3035:4: Int
            {
             before(grammarAccess.getDataTypeAccess().getTypeIntKeyword_2_1_0()); 
            match(input,Int,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getTypeIntKeyword_2_1_0()); 

            }

             after(grammarAccess.getDataTypeAccess().getTypeIntKeyword_2_1_0()); 

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
    // $ANTLR end "rule__DataType__TypeAssignment_2_1"


    // $ANTLR start "rule__DataType__TypeAssignment_3_1"
    // InternalCMSdslParser.g:3046:1: rule__DataType__TypeAssignment_3_1 : ( ( Long ) ) ;
    public final void rule__DataType__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:3050:1: ( ( ( Long ) ) )
            // InternalCMSdslParser.g:3051:2: ( ( Long ) )
            {
            // InternalCMSdslParser.g:3051:2: ( ( Long ) )
            // InternalCMSdslParser.g:3052:3: ( Long )
            {
             before(grammarAccess.getDataTypeAccess().getTypeLongKeyword_3_1_0()); 
            // InternalCMSdslParser.g:3053:3: ( Long )
            // InternalCMSdslParser.g:3054:4: Long
            {
             before(grammarAccess.getDataTypeAccess().getTypeLongKeyword_3_1_0()); 
            match(input,Long,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getTypeLongKeyword_3_1_0()); 

            }

             after(grammarAccess.getDataTypeAccess().getTypeLongKeyword_3_1_0()); 

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
    // $ANTLR end "rule__DataType__TypeAssignment_3_1"


    // $ANTLR start "rule__DataType__TypeAssignment_4_1"
    // InternalCMSdslParser.g:3065:1: rule__DataType__TypeAssignment_4_1 : ( ( Bool ) ) ;
    public final void rule__DataType__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:3069:1: ( ( ( Bool ) ) )
            // InternalCMSdslParser.g:3070:2: ( ( Bool ) )
            {
            // InternalCMSdslParser.g:3070:2: ( ( Bool ) )
            // InternalCMSdslParser.g:3071:3: ( Bool )
            {
             before(grammarAccess.getDataTypeAccess().getTypeBoolKeyword_4_1_0()); 
            // InternalCMSdslParser.g:3072:3: ( Bool )
            // InternalCMSdslParser.g:3073:4: Bool
            {
             before(grammarAccess.getDataTypeAccess().getTypeBoolKeyword_4_1_0()); 
            match(input,Bool,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getTypeBoolKeyword_4_1_0()); 

            }

             after(grammarAccess.getDataTypeAccess().getTypeBoolKeyword_4_1_0()); 

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
    // $ANTLR end "rule__DataType__TypeAssignment_4_1"


    // $ANTLR start "rule__DataType__TypeAssignment_5_1"
    // InternalCMSdslParser.g:3084:1: rule__DataType__TypeAssignment_5_1 : ( ( Float ) ) ;
    public final void rule__DataType__TypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCMSdslParser.g:3088:1: ( ( ( Float ) ) )
            // InternalCMSdslParser.g:3089:2: ( ( Float ) )
            {
            // InternalCMSdslParser.g:3089:2: ( ( Float ) )
            // InternalCMSdslParser.g:3090:3: ( Float )
            {
             before(grammarAccess.getDataTypeAccess().getTypeFloatKeyword_5_1_0()); 
            // InternalCMSdslParser.g:3091:3: ( Float )
            // InternalCMSdslParser.g:3092:4: Float
            {
             before(grammarAccess.getDataTypeAccess().getTypeFloatKeyword_5_1_0()); 
            match(input,Float,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getTypeFloatKeyword_5_1_0()); 

            }

             after(grammarAccess.getDataTypeAccess().getTypeFloatKeyword_5_1_0()); 

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
    // $ANTLR end "rule__DataType__TypeAssignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000020806E0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000806E2L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000000806E0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000027C000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002401000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000027C002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002100100L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000100102L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000100100L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000010000L});

}