package jope015.mdsd2021.reexam.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCMSdslLexer extends Lexer {
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

    public InternalCMSdslLexer() {;} 
    public InternalCMSdslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCMSdslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCMSdslLexer.g"; }

    // $ANTLR start "Validator"
    public final void mValidator() throws RecognitionException {
        try {
            int _type = Validator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:14:11: ( 'validator' )
            // InternalCMSdslLexer.g:14:13: 'validator'
            {
            match("validator"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Validator"

    // $ANTLR start "Database"
    public final void mDatabase() throws RecognitionException {
        try {
            int _type = Database;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:16:10: ( 'database' )
            // InternalCMSdslLexer.g:16:12: 'database'
            {
            match("database"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Database"

    // $ANTLR start "Hostname"
    public final void mHostname() throws RecognitionException {
        try {
            int _type = Hostname;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:18:10: ( 'hostname' )
            // InternalCMSdslLexer.g:18:12: 'hostname'
            {
            match("hostname"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Hostname"

    // $ANTLR start "Password"
    public final void mPassword() throws RecognitionException {
        try {
            int _type = Password;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:20:10: ( 'password' )
            // InternalCMSdslLexer.g:20:12: 'password'
            {
            match("password"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Password"

    // $ANTLR start "Username"
    public final void mUsername() throws RecognitionException {
        try {
            int _type = Username;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:22:10: ( 'username' )
            // InternalCMSdslLexer.g:22:12: 'username'
            {
            match("username"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Username"

    // $ANTLR start "Belongs"
    public final void mBelongs() throws RecognitionException {
        try {
            int _type = Belongs;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:24:9: ( 'belongs' )
            // InternalCMSdslLexer.g:24:11: 'belongs'
            {
            match("belongs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Belongs"

    // $ANTLR start "Default"
    public final void mDefault() throws RecognitionException {
        try {
            int _type = Default;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:26:9: ( 'default' )
            // InternalCMSdslLexer.g:26:11: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Default"

    // $ANTLR start "Dialect"
    public final void mDialect() throws RecognitionException {
        try {
            int _type = Dialect;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:28:9: ( 'dialect' )
            // InternalCMSdslLexer.g:28:11: 'dialect'
            {
            match("dialect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Dialect"

    // $ANTLR start "Library"
    public final void mLibrary() throws RecognitionException {
        try {
            int _type = Library;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:30:9: ( 'library' )
            // InternalCMSdslLexer.g:30:11: 'library'
            {
            match("library"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Library"

    // $ANTLR start "Project"
    public final void mProject() throws RecognitionException {
        try {
            int _type = Project;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:32:9: ( 'project' )
            // InternalCMSdslLexer.g:32:11: 'project'
            {
            match("project"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Project"

    // $ANTLR start "Success"
    public final void mSuccess() throws RecognitionException {
        try {
            int _type = Success;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:34:9: ( 'success' )
            // InternalCMSdslLexer.g:34:11: 'success'
            {
            match("success"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Success"

    // $ANTLR start "Warning"
    public final void mWarning() throws RecognitionException {
        try {
            int _type = Warning;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:36:9: ( 'warning' )
            // InternalCMSdslLexer.g:36:11: 'warning'
            {
            match("warning"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Warning"

    // $ANTLR start "Entity"
    public final void mEntity() throws RecognitionException {
        try {
            int _type = Entity;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:38:8: ( 'entity' )
            // InternalCMSdslLexer.g:38:10: 'entity'
            {
            match("entity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Entity"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:40:8: ( 'string' )
            // InternalCMSdslLexer.g:40:10: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "String"

    // $ANTLR start "Check"
    public final void mCheck() throws RecognitionException {
        try {
            int _type = Check;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:42:7: ( 'check' )
            // InternalCMSdslLexer.g:42:9: 'check'
            {
            match("check"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Check"

    // $ANTLR start "Error"
    public final void mError() throws RecognitionException {
        try {
            int _type = Error;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:44:7: ( 'error' )
            // InternalCMSdslLexer.g:44:9: 'error'
            {
            match("error"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Error"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:46:7: ( 'false' )
            // InternalCMSdslLexer.g:46:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "False"

    // $ANTLR start "Field"
    public final void mField() throws RecognitionException {
        try {
            int _type = Field;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:48:7: ( 'field' )
            // InternalCMSdslLexer.g:48:9: 'field'
            {
            match("field"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Field"

    // $ANTLR start "Float"
    public final void mFloat() throws RecognitionException {
        try {
            int _type = Float;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:50:7: ( 'float' )
            // InternalCMSdslLexer.g:50:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Float"

    // $ANTLR start "Bool"
    public final void mBool() throws RecognitionException {
        try {
            int _type = Bool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:52:6: ( 'bool' )
            // InternalCMSdslLexer.g:52:8: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bool"

    // $ANTLR start "Date"
    public final void mDate() throws RecognitionException {
        try {
            int _type = Date;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:54:6: ( 'date' )
            // InternalCMSdslLexer.g:54:8: 'date'
            {
            match("date"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Date"

    // $ANTLR start "Eval"
    public final void mEval() throws RecognitionException {
        try {
            int _type = Eval;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:56:6: ( 'eval' )
            // InternalCMSdslLexer.g:56:8: 'eval'
            {
            match("eval"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Eval"

    // $ANTLR start "Long"
    public final void mLong() throws RecognitionException {
        try {
            int _type = Long;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:58:6: ( 'long' )
            // InternalCMSdslLexer.g:58:8: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Long"

    // $ANTLR start "Many"
    public final void mMany() throws RecognitionException {
        try {
            int _type = Many;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:60:6: ( 'many' )
            // InternalCMSdslLexer.g:60:8: 'many'
            {
            match("many"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Many"

    // $ANTLR start "Port"
    public final void mPort() throws RecognitionException {
        try {
            int _type = Port;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:62:6: ( 'port' )
            // InternalCMSdslLexer.g:62:8: 'port'
            {
            match("port"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Port"

    // $ANTLR start "Test"
    public final void mTest() throws RecognitionException {
        try {
            int _type = Test;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:64:6: ( 'test' )
            // InternalCMSdslLexer.g:64:8: 'test'
            {
            match("test"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Test"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:66:6: ( 'true' )
            // InternalCMSdslLexer.g:66:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "True"

    // $ANTLR start "Has"
    public final void mHas() throws RecognitionException {
        try {
            int _type = Has;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:68:5: ( 'has' )
            // InternalCMSdslLexer.g:68:7: 'has'
            {
            match("has"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Has"

    // $ANTLR start "Int"
    public final void mInt() throws RecognitionException {
        try {
            int _type = Int;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:70:5: ( 'int' )
            // InternalCMSdslLexer.g:70:7: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int"

    // $ANTLR start "One"
    public final void mOne() throws RecognitionException {
        try {
            int _type = One;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:72:5: ( 'one' )
            // InternalCMSdslLexer.g:72:7: 'one'
            {
            match("one"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "One"

    // $ANTLR start "ExclamationMarkEqualsSign"
    public final void mExclamationMarkEqualsSign() throws RecognitionException {
        try {
            int _type = ExclamationMarkEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:74:27: ( '!=' )
            // InternalCMSdslLexer.g:74:29: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMarkEqualsSign"

    // $ANTLR start "AmpersandAmpersand"
    public final void mAmpersandAmpersand() throws RecognitionException {
        try {
            int _type = AmpersandAmpersand;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:76:20: ( '&&' )
            // InternalCMSdslLexer.g:76:22: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AmpersandAmpersand"

    // $ANTLR start "LessThanSignEqualsSign"
    public final void mLessThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = LessThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:78:24: ( '<=' )
            // InternalCMSdslLexer.g:78:26: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignEqualsSign"

    // $ANTLR start "EqualsSignEqualsSign"
    public final void mEqualsSignEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:80:22: ( '==' )
            // InternalCMSdslLexer.g:80:24: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignEqualsSign"

    // $ANTLR start "EqualsSignGreaterThanSign"
    public final void mEqualsSignGreaterThanSign() throws RecognitionException {
        try {
            int _type = EqualsSignGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:82:27: ( '=>' )
            // InternalCMSdslLexer.g:82:29: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignGreaterThanSign"

    // $ANTLR start "GreaterThanSignEqualsSign"
    public final void mGreaterThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:84:27: ( '>=' )
            // InternalCMSdslLexer.g:84:29: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSignEqualsSign"

    // $ANTLR start "To"
    public final void mTo() throws RecognitionException {
        try {
            int _type = To;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:86:4: ( 'to' )
            // InternalCMSdslLexer.g:86:6: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "To"

    // $ANTLR start "VerticalLineVerticalLine"
    public final void mVerticalLineVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLineVerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:88:26: ( '||' )
            // InternalCMSdslLexer.g:88:28: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VerticalLineVerticalLine"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:90:17: ( '(' )
            // InternalCMSdslLexer.g:90:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:92:18: ( ')' )
            // InternalCMSdslLexer.g:92:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:94:10: ( '*' )
            // InternalCMSdslLexer.g:94:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "PlusSign"
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:96:10: ( '+' )
            // InternalCMSdslLexer.g:96:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:98:7: ( ',' )
            // InternalCMSdslLexer.g:98:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:100:13: ( '-' )
            // InternalCMSdslLexer.g:100:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:102:9: ( '/' )
            // InternalCMSdslLexer.g:102:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Solidus"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:104:7: ( ':' )
            // InternalCMSdslLexer.g:104:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:106:14: ( '<' )
            // InternalCMSdslLexer.g:106:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSign"

    // $ANTLR start "GreaterThanSign"
    public final void mGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:108:17: ( '>' )
            // InternalCMSdslLexer.g:108:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSign"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalCMSdslLexer.g:110:21: ()
            // InternalCMSdslLexer.g:110:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalCMSdslLexer.g:112:19: ()
            // InternalCMSdslLexer.g:112:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:114:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCMSdslLexer.g:114:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCMSdslLexer.g:114:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCMSdslLexer.g:114:11: '^'
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

            // InternalCMSdslLexer.g:114:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCMSdslLexer.g:
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
            	    break loop2;
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
            // InternalCMSdslLexer.g:116:10: ( ( '0' .. '9' )+ )
            // InternalCMSdslLexer.g:116:12: ( '0' .. '9' )+
            {
            // InternalCMSdslLexer.g:116:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCMSdslLexer.g:116:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // InternalCMSdslLexer.g:118:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCMSdslLexer.g:118:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCMSdslLexer.g:118:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCMSdslLexer.g:118:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCMSdslLexer.g:118:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalCMSdslLexer.g:118:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCMSdslLexer.g:118:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalCMSdslLexer.g:118:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCMSdslLexer.g:118:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCMSdslLexer.g:118:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCMSdslLexer.g:118:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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
            // InternalCMSdslLexer.g:120:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCMSdslLexer.g:120:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCMSdslLexer.g:120:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCMSdslLexer.g:120:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // InternalCMSdslLexer.g:122:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCMSdslLexer.g:122:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCMSdslLexer.g:122:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCMSdslLexer.g:122:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalCMSdslLexer.g:122:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCMSdslLexer.g:122:41: ( '\\r' )? '\\n'
                    {
                    // InternalCMSdslLexer.g:122:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalCMSdslLexer.g:122:41: '\\r'
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
            // InternalCMSdslLexer.g:124:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCMSdslLexer.g:124:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCMSdslLexer.g:124:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCMSdslLexer.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // InternalCMSdslLexer.g:126:16: ( . )
            // InternalCMSdslLexer.g:126:18: .
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
        // InternalCMSdslLexer.g:1:8: ( Validator | Database | Hostname | Password | Username | Belongs | Default | Dialect | Library | Project | Success | Warning | Entity | String | Check | Error | False | Field | Float | Bool | Date | Eval | Long | Many | Port | Test | True | Has | Int | One | ExclamationMarkEqualsSign | AmpersandAmpersand | LessThanSignEqualsSign | EqualsSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | To | VerticalLineVerticalLine | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | Solidus | Colon | LessThanSign | GreaterThanSign | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=55;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalCMSdslLexer.g:1:10: Validator
                {
                mValidator(); 

                }
                break;
            case 2 :
                // InternalCMSdslLexer.g:1:20: Database
                {
                mDatabase(); 

                }
                break;
            case 3 :
                // InternalCMSdslLexer.g:1:29: Hostname
                {
                mHostname(); 

                }
                break;
            case 4 :
                // InternalCMSdslLexer.g:1:38: Password
                {
                mPassword(); 

                }
                break;
            case 5 :
                // InternalCMSdslLexer.g:1:47: Username
                {
                mUsername(); 

                }
                break;
            case 6 :
                // InternalCMSdslLexer.g:1:56: Belongs
                {
                mBelongs(); 

                }
                break;
            case 7 :
                // InternalCMSdslLexer.g:1:64: Default
                {
                mDefault(); 

                }
                break;
            case 8 :
                // InternalCMSdslLexer.g:1:72: Dialect
                {
                mDialect(); 

                }
                break;
            case 9 :
                // InternalCMSdslLexer.g:1:80: Library
                {
                mLibrary(); 

                }
                break;
            case 10 :
                // InternalCMSdslLexer.g:1:88: Project
                {
                mProject(); 

                }
                break;
            case 11 :
                // InternalCMSdslLexer.g:1:96: Success
                {
                mSuccess(); 

                }
                break;
            case 12 :
                // InternalCMSdslLexer.g:1:104: Warning
                {
                mWarning(); 

                }
                break;
            case 13 :
                // InternalCMSdslLexer.g:1:112: Entity
                {
                mEntity(); 

                }
                break;
            case 14 :
                // InternalCMSdslLexer.g:1:119: String
                {
                mString(); 

                }
                break;
            case 15 :
                // InternalCMSdslLexer.g:1:126: Check
                {
                mCheck(); 

                }
                break;
            case 16 :
                // InternalCMSdslLexer.g:1:132: Error
                {
                mError(); 

                }
                break;
            case 17 :
                // InternalCMSdslLexer.g:1:138: False
                {
                mFalse(); 

                }
                break;
            case 18 :
                // InternalCMSdslLexer.g:1:144: Field
                {
                mField(); 

                }
                break;
            case 19 :
                // InternalCMSdslLexer.g:1:150: Float
                {
                mFloat(); 

                }
                break;
            case 20 :
                // InternalCMSdslLexer.g:1:156: Bool
                {
                mBool(); 

                }
                break;
            case 21 :
                // InternalCMSdslLexer.g:1:161: Date
                {
                mDate(); 

                }
                break;
            case 22 :
                // InternalCMSdslLexer.g:1:166: Eval
                {
                mEval(); 

                }
                break;
            case 23 :
                // InternalCMSdslLexer.g:1:171: Long
                {
                mLong(); 

                }
                break;
            case 24 :
                // InternalCMSdslLexer.g:1:176: Many
                {
                mMany(); 

                }
                break;
            case 25 :
                // InternalCMSdslLexer.g:1:181: Port
                {
                mPort(); 

                }
                break;
            case 26 :
                // InternalCMSdslLexer.g:1:186: Test
                {
                mTest(); 

                }
                break;
            case 27 :
                // InternalCMSdslLexer.g:1:191: True
                {
                mTrue(); 

                }
                break;
            case 28 :
                // InternalCMSdslLexer.g:1:196: Has
                {
                mHas(); 

                }
                break;
            case 29 :
                // InternalCMSdslLexer.g:1:200: Int
                {
                mInt(); 

                }
                break;
            case 30 :
                // InternalCMSdslLexer.g:1:204: One
                {
                mOne(); 

                }
                break;
            case 31 :
                // InternalCMSdslLexer.g:1:208: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 32 :
                // InternalCMSdslLexer.g:1:234: AmpersandAmpersand
                {
                mAmpersandAmpersand(); 

                }
                break;
            case 33 :
                // InternalCMSdslLexer.g:1:253: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 34 :
                // InternalCMSdslLexer.g:1:276: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 35 :
                // InternalCMSdslLexer.g:1:297: EqualsSignGreaterThanSign
                {
                mEqualsSignGreaterThanSign(); 

                }
                break;
            case 36 :
                // InternalCMSdslLexer.g:1:323: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 37 :
                // InternalCMSdslLexer.g:1:349: To
                {
                mTo(); 

                }
                break;
            case 38 :
                // InternalCMSdslLexer.g:1:352: VerticalLineVerticalLine
                {
                mVerticalLineVerticalLine(); 

                }
                break;
            case 39 :
                // InternalCMSdslLexer.g:1:377: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 40 :
                // InternalCMSdslLexer.g:1:393: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 41 :
                // InternalCMSdslLexer.g:1:410: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 42 :
                // InternalCMSdslLexer.g:1:419: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 43 :
                // InternalCMSdslLexer.g:1:428: Comma
                {
                mComma(); 

                }
                break;
            case 44 :
                // InternalCMSdslLexer.g:1:434: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 45 :
                // InternalCMSdslLexer.g:1:446: Solidus
                {
                mSolidus(); 

                }
                break;
            case 46 :
                // InternalCMSdslLexer.g:1:454: Colon
                {
                mColon(); 

                }
                break;
            case 47 :
                // InternalCMSdslLexer.g:1:460: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 48 :
                // InternalCMSdslLexer.g:1:473: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 49 :
                // InternalCMSdslLexer.g:1:489: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 50 :
                // InternalCMSdslLexer.g:1:497: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 51 :
                // InternalCMSdslLexer.g:1:506: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 52 :
                // InternalCMSdslLexer.g:1:518: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 53 :
                // InternalCMSdslLexer.g:1:534: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 54 :
                // InternalCMSdslLexer.g:1:550: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 55 :
                // InternalCMSdslLexer.g:1:558: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\20\47\2\45\1\110\1\45\1\114\1\45\6\uffff\1\126\1\uffff\1\45\2\uffff\2\45\2\uffff\1\47\1\uffff\32\47\1\166\2\47\26\uffff\5\47\1\177\25\47\1\uffff\1\u0095\1\u0096\2\47\1\u0099\3\47\1\uffff\2\47\1\u009f\2\47\1\u00a2\1\47\1\u00a4\5\47\1\u00aa\4\47\1\u00af\1\u00b0\1\u00b1\2\uffff\2\47\1\uffff\5\47\1\uffff\2\47\1\uffff\1\47\1\uffff\4\47\1\u00c0\1\uffff\1\u00c1\1\u00c2\1\u00c3\1\u00c4\3\uffff\13\47\1\u00d0\1\47\1\u00d2\5\uffff\2\47\1\u00d5\1\u00d6\2\47\1\u00d9\1\47\1\u00db\1\u00dc\1\u00dd\1\uffff\1\u00de\1\uffff\1\47\1\u00e0\2\uffff\1\u00e1\1\u00e2\1\uffff\1\u00e3\4\uffff\1\u00e4\5\uffff";
    static final String DFA12_eofS =
        "\u00e5\uffff";
    static final String DFA12_minS =
        "\1\0\4\141\1\163\1\145\1\151\1\164\1\141\1\156\1\150\2\141\1\145\2\156\1\75\1\46\3\75\1\174\6\uffff\1\52\1\uffff\1\101\2\uffff\2\0\2\uffff\1\154\1\uffff\1\164\1\146\1\141\3\163\1\157\1\162\1\145\1\154\1\157\1\142\1\156\1\143\2\162\1\164\1\162\1\141\1\145\1\154\1\145\1\157\1\156\1\163\1\165\1\60\1\164\1\145\26\uffff\1\151\2\141\1\154\1\164\1\60\1\163\1\152\1\164\1\162\1\157\1\154\1\162\1\147\1\143\1\151\1\156\1\151\1\157\1\154\1\143\1\163\1\154\1\141\1\171\1\164\1\145\1\uffff\2\60\1\144\1\142\1\60\1\165\1\145\1\156\1\uffff\1\167\1\145\1\60\2\156\1\60\1\141\1\60\1\145\1\156\1\151\1\164\1\162\1\60\1\153\1\145\1\144\1\164\3\60\2\uffff\2\141\1\uffff\1\154\1\143\1\141\1\157\1\143\1\uffff\1\141\1\147\1\uffff\1\162\1\uffff\1\163\1\147\1\156\1\171\1\60\1\uffff\4\60\3\uffff\1\164\1\163\2\164\1\155\1\162\1\164\1\155\1\163\1\171\1\163\1\60\1\147\1\60\5\uffff\1\157\1\145\2\60\1\145\1\144\1\60\1\145\3\60\1\uffff\1\60\1\uffff\1\162\1\60\2\uffff\2\60\1\uffff\1\60\4\uffff\1\60\5\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\141\1\151\1\157\1\162\1\163\2\157\1\165\1\141\1\166\1\150\1\154\1\141\1\162\2\156\1\75\1\46\1\75\1\76\1\75\1\174\6\uffff\1\57\1\uffff\1\172\2\uffff\2\uffff\2\uffff\1\154\1\uffff\1\164\1\146\1\141\3\163\1\157\1\162\1\145\1\154\1\157\1\142\1\156\1\143\2\162\1\164\1\162\1\141\1\145\1\154\1\145\1\157\1\156\1\163\1\165\1\172\1\164\1\145\26\uffff\1\151\1\145\1\141\1\154\1\164\1\172\1\163\1\152\1\164\1\162\1\157\1\154\1\162\1\147\1\143\1\151\1\156\1\151\1\157\1\154\1\143\1\163\1\154\1\141\1\171\1\164\1\145\1\uffff\2\172\1\144\1\142\1\172\1\165\1\145\1\156\1\uffff\1\167\1\145\1\172\2\156\1\172\1\141\1\172\1\145\1\156\1\151\1\164\1\162\1\172\1\153\1\145\1\144\1\164\3\172\2\uffff\2\141\1\uffff\1\154\1\143\1\141\1\157\1\143\1\uffff\1\141\1\147\1\uffff\1\162\1\uffff\1\163\1\147\1\156\1\171\1\172\1\uffff\4\172\3\uffff\1\164\1\163\2\164\1\155\1\162\1\164\1\155\1\163\1\171\1\163\1\172\1\147\1\172\5\uffff\1\157\1\145\2\172\1\145\1\144\1\172\1\145\3\172\1\uffff\1\172\1\uffff\1\162\1\172\2\uffff\2\172\1\uffff\1\172\4\uffff\1\172\5\uffff";
    static final String DFA12_acceptS =
        "\27\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\uffff\1\56\1\uffff\1\61\1\62\2\uffff\1\66\1\67\1\uffff\1\61\35\uffff\1\37\1\40\1\41\1\57\1\42\1\43\1\44\1\60\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\64\1\65\1\55\1\56\1\62\1\63\1\66\33\uffff\1\45\10\uffff\1\34\25\uffff\1\35\1\36\2\uffff\1\25\5\uffff\1\31\2\uffff\1\24\1\uffff\1\27\5\uffff\1\26\4\uffff\1\30\1\32\1\33\16\uffff\1\20\1\17\1\21\1\22\1\23\13\uffff\1\16\1\uffff\1\15\2\uffff\1\7\1\10\2\uffff\1\12\1\uffff\1\6\1\11\1\13\1\14\1\uffff\1\2\1\3\1\4\1\5\1\1";
    static final String DFA12_specialS =
        "\1\2\41\uffff\1\0\1\1\u00c1\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\45\2\44\2\45\1\44\22\45\1\44\1\21\1\42\3\45\1\22\1\43\1\27\1\30\1\31\1\32\1\33\1\34\1\45\1\35\12\41\1\36\1\45\1\23\1\24\1\25\2\45\32\40\3\45\1\37\1\40\1\45\1\40\1\6\1\13\1\2\1\12\1\14\1\40\1\3\1\17\2\40\1\7\1\15\1\40\1\20\1\4\2\40\1\10\1\16\1\5\1\1\1\11\3\40\1\45\1\26\uff83\45",
            "\1\46",
            "\1\50\3\uffff\1\51\3\uffff\1\52",
            "\1\54\15\uffff\1\53",
            "\1\55\15\uffff\1\57\2\uffff\1\56",
            "\1\60",
            "\1\61\11\uffff\1\62",
            "\1\63\5\uffff\1\64",
            "\1\66\1\65",
            "\1\67",
            "\1\70\3\uffff\1\71\3\uffff\1\72",
            "\1\73",
            "\1\74\7\uffff\1\75\2\uffff\1\76",
            "\1\77",
            "\1\100\11\uffff\1\102\2\uffff\1\101",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\111\1\112",
            "\1\113",
            "\1\115",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\124\4\uffff\1\125",
            "",
            "\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\0\131",
            "\0\131",
            "",
            "",
            "\1\133",
            "",
            "\1\134",
            "\1\135",
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
            "\1\165",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\167",
            "\1\170",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\171",
            "\1\172\3\uffff\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0097",
            "\1\u0098",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "",
            "\1\u009d",
            "\1\u009e",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00a0",
            "\1\u00a1",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00a3",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00d1",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00d7",
            "\1\u00d8",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00da",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u00df",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Validator | Database | Hostname | Password | Username | Belongs | Default | Dialect | Library | Project | Success | Warning | Entity | String | Check | Error | False | Field | Float | Bool | Date | Eval | Long | Many | Port | Test | True | Has | Int | One | ExclamationMarkEqualsSign | AmpersandAmpersand | LessThanSignEqualsSign | EqualsSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | To | VerticalLineVerticalLine | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | Solidus | Colon | LessThanSign | GreaterThanSign | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_34 = input.LA(1);

                        s = -1;
                        if ( ((LA12_34>='\u0000' && LA12_34<='\uFFFF')) ) {s = 89;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_35 = input.LA(1);

                        s = -1;
                        if ( ((LA12_35>='\u0000' && LA12_35<='\uFFFF')) ) {s = 89;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='v') ) {s = 1;}

                        else if ( (LA12_0=='d') ) {s = 2;}

                        else if ( (LA12_0=='h') ) {s = 3;}

                        else if ( (LA12_0=='p') ) {s = 4;}

                        else if ( (LA12_0=='u') ) {s = 5;}

                        else if ( (LA12_0=='b') ) {s = 6;}

                        else if ( (LA12_0=='l') ) {s = 7;}

                        else if ( (LA12_0=='s') ) {s = 8;}

                        else if ( (LA12_0=='w') ) {s = 9;}

                        else if ( (LA12_0=='e') ) {s = 10;}

                        else if ( (LA12_0=='c') ) {s = 11;}

                        else if ( (LA12_0=='f') ) {s = 12;}

                        else if ( (LA12_0=='m') ) {s = 13;}

                        else if ( (LA12_0=='t') ) {s = 14;}

                        else if ( (LA12_0=='i') ) {s = 15;}

                        else if ( (LA12_0=='o') ) {s = 16;}

                        else if ( (LA12_0=='!') ) {s = 17;}

                        else if ( (LA12_0=='&') ) {s = 18;}

                        else if ( (LA12_0=='<') ) {s = 19;}

                        else if ( (LA12_0=='=') ) {s = 20;}

                        else if ( (LA12_0=='>') ) {s = 21;}

                        else if ( (LA12_0=='|') ) {s = 22;}

                        else if ( (LA12_0=='(') ) {s = 23;}

                        else if ( (LA12_0==')') ) {s = 24;}

                        else if ( (LA12_0=='*') ) {s = 25;}

                        else if ( (LA12_0=='+') ) {s = 26;}

                        else if ( (LA12_0==',') ) {s = 27;}

                        else if ( (LA12_0=='-') ) {s = 28;}

                        else if ( (LA12_0=='/') ) {s = 29;}

                        else if ( (LA12_0==':') ) {s = 30;}

                        else if ( (LA12_0=='^') ) {s = 31;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='a'||LA12_0=='g'||(LA12_0>='j' && LA12_0<='k')||LA12_0=='n'||(LA12_0>='q' && LA12_0<='r')||(LA12_0>='x' && LA12_0<='z')) ) {s = 32;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 33;}

                        else if ( (LA12_0=='\"') ) {s = 34;}

                        else if ( (LA12_0=='\'') ) {s = 35;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 36;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='%')||LA12_0=='.'||LA12_0==';'||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='{'||(LA12_0>='}' && LA12_0<='\uFFFF')) ) {s = 37;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}