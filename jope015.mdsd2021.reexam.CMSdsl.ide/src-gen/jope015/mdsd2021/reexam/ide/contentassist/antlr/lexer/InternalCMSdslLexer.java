package jope015.mdsd2021.reexam.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCMSdslLexer extends Lexer {
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

    public InternalCMSdslLexer() {;} 
    public InternalCMSdslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCMSdslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCMSdslLexer.g"; }

    // $ANTLR start "InputType"
    public final void mInputType() throws RecognitionException {
        try {
            int _type = InputType;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:14:11: ( 'inputType' )
            // InternalCMSdslLexer.g:14:13: 'inputType'
            {
            match("inputType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "InputType"

    // $ANTLR start "Validator"
    public final void mValidator() throws RecognitionException {
        try {
            int _type = Validator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:16:11: ( 'validator' )
            // InternalCMSdslLexer.g:16:13: 'validator'
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
            // InternalCMSdslLexer.g:18:10: ( 'database' )
            // InternalCMSdslLexer.g:18:12: 'database'
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
            // InternalCMSdslLexer.g:20:10: ( 'hostname' )
            // InternalCMSdslLexer.g:20:12: 'hostname'
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
            // InternalCMSdslLexer.g:22:10: ( 'password' )
            // InternalCMSdslLexer.g:22:12: 'password'
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

    // $ANTLR start "Textarea"
    public final void mTextarea() throws RecognitionException {
        try {
            int _type = Textarea;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:24:10: ( 'textarea' )
            // InternalCMSdslLexer.g:24:12: 'textarea'
            {
            match("textarea"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Textarea"

    // $ANTLR start "Username"
    public final void mUsername() throws RecognitionException {
        try {
            int _type = Username;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:26:10: ( 'username' )
            // InternalCMSdslLexer.g:26:12: 'username'
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
            // InternalCMSdslLexer.g:28:9: ( 'belongs' )
            // InternalCMSdslLexer.g:28:11: 'belongs'
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
            // InternalCMSdslLexer.g:30:9: ( 'default' )
            // InternalCMSdslLexer.g:30:11: 'default'
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
            // InternalCMSdslLexer.g:32:9: ( 'dialect' )
            // InternalCMSdslLexer.g:32:11: 'dialect'
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
            // InternalCMSdslLexer.g:34:9: ( 'library' )
            // InternalCMSdslLexer.g:34:11: 'library'
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
            // InternalCMSdslLexer.g:36:9: ( 'project' )
            // InternalCMSdslLexer.g:36:11: 'project'
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
            // InternalCMSdslLexer.g:38:9: ( 'success' )
            // InternalCMSdslLexer.g:38:11: 'success'
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
            // InternalCMSdslLexer.g:40:9: ( 'warning' )
            // InternalCMSdslLexer.g:40:11: 'warning'
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
            // InternalCMSdslLexer.g:42:8: ( 'entity' )
            // InternalCMSdslLexer.g:42:10: 'entity'
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

    // $ANTLR start "Number"
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:44:8: ( 'number' )
            // InternalCMSdslLexer.g:44:10: 'number'
            {
            match("number"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Number"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:46:8: ( 'string' )
            // InternalCMSdslLexer.g:46:10: 'string'
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
            // InternalCMSdslLexer.g:48:7: ( 'check' )
            // InternalCMSdslLexer.g:48:9: 'check'
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

    // $ANTLR start "Email"
    public final void mEmail() throws RecognitionException {
        try {
            int _type = Email;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:50:7: ( 'email' )
            // InternalCMSdslLexer.g:50:9: 'email'
            {
            match("email"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Email"

    // $ANTLR start "Error"
    public final void mError() throws RecognitionException {
        try {
            int _type = Error;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:52:7: ( 'error' )
            // InternalCMSdslLexer.g:52:9: 'error'
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
            // InternalCMSdslLexer.g:54:7: ( 'false' )
            // InternalCMSdslLexer.g:54:9: 'false'
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
            // InternalCMSdslLexer.g:56:7: ( 'field' )
            // InternalCMSdslLexer.g:56:9: 'field'
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
            // InternalCMSdslLexer.g:58:7: ( 'float' )
            // InternalCMSdslLexer.g:58:9: 'float'
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
            // InternalCMSdslLexer.g:60:6: ( 'bool' )
            // InternalCMSdslLexer.g:60:8: 'bool'
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
            // InternalCMSdslLexer.g:62:6: ( 'date' )
            // InternalCMSdslLexer.g:62:8: 'date'
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
            // InternalCMSdslLexer.g:64:6: ( 'eval' )
            // InternalCMSdslLexer.g:64:8: 'eval'
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

    // $ANTLR start "Hide"
    public final void mHide() throws RecognitionException {
        try {
            int _type = Hide;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:66:6: ( 'hide' )
            // InternalCMSdslLexer.g:66:8: 'hide'
            {
            match("hide"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Hide"

    // $ANTLR start "Long"
    public final void mLong() throws RecognitionException {
        try {
            int _type = Long;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:68:6: ( 'long' )
            // InternalCMSdslLexer.g:68:8: 'long'
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
            // InternalCMSdslLexer.g:70:6: ( 'many' )
            // InternalCMSdslLexer.g:70:8: 'many'
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
            // InternalCMSdslLexer.g:72:6: ( 'port' )
            // InternalCMSdslLexer.g:72:8: 'port'
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
            // InternalCMSdslLexer.g:74:6: ( 'test' )
            // InternalCMSdslLexer.g:74:8: 'test'
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

    // $ANTLR start "Text"
    public final void mText() throws RecognitionException {
        try {
            int _type = Text;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:76:6: ( 'text' )
            // InternalCMSdslLexer.g:76:8: 'text'
            {
            match("text"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Text"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:78:6: ( 'true' )
            // InternalCMSdslLexer.g:78:8: 'true'
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

    // $ANTLR start "And"
    public final void mAnd() throws RecognitionException {
        try {
            int _type = And;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:80:5: ( 'and' )
            // InternalCMSdslLexer.g:80:7: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "And"

    // $ANTLR start "Has"
    public final void mHas() throws RecognitionException {
        try {
            int _type = Has;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:82:5: ( 'has' )
            // InternalCMSdslLexer.g:82:7: 'has'
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
            // InternalCMSdslLexer.g:84:5: ( 'int' )
            // InternalCMSdslLexer.g:84:7: 'int'
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
            // InternalCMSdslLexer.g:86:5: ( 'one' )
            // InternalCMSdslLexer.g:86:7: 'one'
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
            // InternalCMSdslLexer.g:88:27: ( '!=' )
            // InternalCMSdslLexer.g:88:29: '!='
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
            // InternalCMSdslLexer.g:90:20: ( '&&' )
            // InternalCMSdslLexer.g:90:22: '&&'
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
            // InternalCMSdslLexer.g:92:24: ( '<=' )
            // InternalCMSdslLexer.g:92:26: '<='
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
            // InternalCMSdslLexer.g:94:22: ( '==' )
            // InternalCMSdslLexer.g:94:24: '=='
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
            // InternalCMSdslLexer.g:96:27: ( '=>' )
            // InternalCMSdslLexer.g:96:29: '=>'
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
            // InternalCMSdslLexer.g:98:27: ( '>=' )
            // InternalCMSdslLexer.g:98:29: '>='
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
            // InternalCMSdslLexer.g:100:4: ( 'to' )
            // InternalCMSdslLexer.g:100:6: 'to'
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
            // InternalCMSdslLexer.g:102:26: ( '||' )
            // InternalCMSdslLexer.g:102:28: '||'
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
            // InternalCMSdslLexer.g:104:17: ( '(' )
            // InternalCMSdslLexer.g:104:19: '('
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
            // InternalCMSdslLexer.g:106:18: ( ')' )
            // InternalCMSdslLexer.g:106:20: ')'
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
            // InternalCMSdslLexer.g:108:10: ( '*' )
            // InternalCMSdslLexer.g:108:12: '*'
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
            // InternalCMSdslLexer.g:110:10: ( '+' )
            // InternalCMSdslLexer.g:110:12: '+'
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
            // InternalCMSdslLexer.g:112:7: ( ',' )
            // InternalCMSdslLexer.g:112:9: ','
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
            // InternalCMSdslLexer.g:114:13: ( '-' )
            // InternalCMSdslLexer.g:114:15: '-'
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
            // InternalCMSdslLexer.g:116:9: ( '/' )
            // InternalCMSdslLexer.g:116:11: '/'
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
            // InternalCMSdslLexer.g:118:7: ( ':' )
            // InternalCMSdslLexer.g:118:9: ':'
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
            // InternalCMSdslLexer.g:120:14: ( '<' )
            // InternalCMSdslLexer.g:120:16: '<'
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
            // InternalCMSdslLexer.g:122:17: ( '>' )
            // InternalCMSdslLexer.g:122:19: '>'
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
            // InternalCMSdslLexer.g:124:21: ()
            // InternalCMSdslLexer.g:124:23: 
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
            // InternalCMSdslLexer.g:126:19: ()
            // InternalCMSdslLexer.g:126:21: 
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
            // InternalCMSdslLexer.g:128:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCMSdslLexer.g:128:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCMSdslLexer.g:128:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCMSdslLexer.g:128:11: '^'
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

            // InternalCMSdslLexer.g:128:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalCMSdslLexer.g:130:10: ( ( '0' .. '9' )+ )
            // InternalCMSdslLexer.g:130:12: ( '0' .. '9' )+
            {
            // InternalCMSdslLexer.g:130:12: ( '0' .. '9' )+
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
            	    // InternalCMSdslLexer.g:130:13: '0' .. '9'
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
            // InternalCMSdslLexer.g:132:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCMSdslLexer.g:132:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCMSdslLexer.g:132:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalCMSdslLexer.g:132:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCMSdslLexer.g:132:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalCMSdslLexer.g:132:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCMSdslLexer.g:132:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalCMSdslLexer.g:132:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCMSdslLexer.g:132:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalCMSdslLexer.g:132:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCMSdslLexer.g:132:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalCMSdslLexer.g:134:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCMSdslLexer.g:134:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCMSdslLexer.g:134:24: ( options {greedy=false; } : . )*
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
            	    // InternalCMSdslLexer.g:134:52: .
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
            // InternalCMSdslLexer.g:136:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCMSdslLexer.g:136:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCMSdslLexer.g:136:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCMSdslLexer.g:136:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalCMSdslLexer.g:136:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCMSdslLexer.g:136:41: ( '\\r' )? '\\n'
                    {
                    // InternalCMSdslLexer.g:136:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalCMSdslLexer.g:136:41: '\\r'
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
            // InternalCMSdslLexer.g:138:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCMSdslLexer.g:138:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCMSdslLexer.g:138:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalCMSdslLexer.g:140:16: ( . )
            // InternalCMSdslLexer.g:140:18: .
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
        // InternalCMSdslLexer.g:1:8: ( InputType | Validator | Database | Hostname | Password | Textarea | Username | Belongs | Default | Dialect | Library | Project | Success | Warning | Entity | Number | String | Check | Email | Error | False | Field | Float | Bool | Date | Eval | Hide | Long | Many | Port | Test | Text | True | And | Has | Int | One | ExclamationMarkEqualsSign | AmpersandAmpersand | LessThanSignEqualsSign | EqualsSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | To | VerticalLineVerticalLine | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | Solidus | Colon | LessThanSign | GreaterThanSign | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=62;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalCMSdslLexer.g:1:10: InputType
                {
                mInputType(); 

                }
                break;
            case 2 :
                // InternalCMSdslLexer.g:1:20: Validator
                {
                mValidator(); 

                }
                break;
            case 3 :
                // InternalCMSdslLexer.g:1:30: Database
                {
                mDatabase(); 

                }
                break;
            case 4 :
                // InternalCMSdslLexer.g:1:39: Hostname
                {
                mHostname(); 

                }
                break;
            case 5 :
                // InternalCMSdslLexer.g:1:48: Password
                {
                mPassword(); 

                }
                break;
            case 6 :
                // InternalCMSdslLexer.g:1:57: Textarea
                {
                mTextarea(); 

                }
                break;
            case 7 :
                // InternalCMSdslLexer.g:1:66: Username
                {
                mUsername(); 

                }
                break;
            case 8 :
                // InternalCMSdslLexer.g:1:75: Belongs
                {
                mBelongs(); 

                }
                break;
            case 9 :
                // InternalCMSdslLexer.g:1:83: Default
                {
                mDefault(); 

                }
                break;
            case 10 :
                // InternalCMSdslLexer.g:1:91: Dialect
                {
                mDialect(); 

                }
                break;
            case 11 :
                // InternalCMSdslLexer.g:1:99: Library
                {
                mLibrary(); 

                }
                break;
            case 12 :
                // InternalCMSdslLexer.g:1:107: Project
                {
                mProject(); 

                }
                break;
            case 13 :
                // InternalCMSdslLexer.g:1:115: Success
                {
                mSuccess(); 

                }
                break;
            case 14 :
                // InternalCMSdslLexer.g:1:123: Warning
                {
                mWarning(); 

                }
                break;
            case 15 :
                // InternalCMSdslLexer.g:1:131: Entity
                {
                mEntity(); 

                }
                break;
            case 16 :
                // InternalCMSdslLexer.g:1:138: Number
                {
                mNumber(); 

                }
                break;
            case 17 :
                // InternalCMSdslLexer.g:1:145: String
                {
                mString(); 

                }
                break;
            case 18 :
                // InternalCMSdslLexer.g:1:152: Check
                {
                mCheck(); 

                }
                break;
            case 19 :
                // InternalCMSdslLexer.g:1:158: Email
                {
                mEmail(); 

                }
                break;
            case 20 :
                // InternalCMSdslLexer.g:1:164: Error
                {
                mError(); 

                }
                break;
            case 21 :
                // InternalCMSdslLexer.g:1:170: False
                {
                mFalse(); 

                }
                break;
            case 22 :
                // InternalCMSdslLexer.g:1:176: Field
                {
                mField(); 

                }
                break;
            case 23 :
                // InternalCMSdslLexer.g:1:182: Float
                {
                mFloat(); 

                }
                break;
            case 24 :
                // InternalCMSdslLexer.g:1:188: Bool
                {
                mBool(); 

                }
                break;
            case 25 :
                // InternalCMSdslLexer.g:1:193: Date
                {
                mDate(); 

                }
                break;
            case 26 :
                // InternalCMSdslLexer.g:1:198: Eval
                {
                mEval(); 

                }
                break;
            case 27 :
                // InternalCMSdslLexer.g:1:203: Hide
                {
                mHide(); 

                }
                break;
            case 28 :
                // InternalCMSdslLexer.g:1:208: Long
                {
                mLong(); 

                }
                break;
            case 29 :
                // InternalCMSdslLexer.g:1:213: Many
                {
                mMany(); 

                }
                break;
            case 30 :
                // InternalCMSdslLexer.g:1:218: Port
                {
                mPort(); 

                }
                break;
            case 31 :
                // InternalCMSdslLexer.g:1:223: Test
                {
                mTest(); 

                }
                break;
            case 32 :
                // InternalCMSdslLexer.g:1:228: Text
                {
                mText(); 

                }
                break;
            case 33 :
                // InternalCMSdslLexer.g:1:233: True
                {
                mTrue(); 

                }
                break;
            case 34 :
                // InternalCMSdslLexer.g:1:238: And
                {
                mAnd(); 

                }
                break;
            case 35 :
                // InternalCMSdslLexer.g:1:242: Has
                {
                mHas(); 

                }
                break;
            case 36 :
                // InternalCMSdslLexer.g:1:246: Int
                {
                mInt(); 

                }
                break;
            case 37 :
                // InternalCMSdslLexer.g:1:250: One
                {
                mOne(); 

                }
                break;
            case 38 :
                // InternalCMSdslLexer.g:1:254: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 39 :
                // InternalCMSdslLexer.g:1:280: AmpersandAmpersand
                {
                mAmpersandAmpersand(); 

                }
                break;
            case 40 :
                // InternalCMSdslLexer.g:1:299: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 41 :
                // InternalCMSdslLexer.g:1:322: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 42 :
                // InternalCMSdslLexer.g:1:343: EqualsSignGreaterThanSign
                {
                mEqualsSignGreaterThanSign(); 

                }
                break;
            case 43 :
                // InternalCMSdslLexer.g:1:369: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 44 :
                // InternalCMSdslLexer.g:1:395: To
                {
                mTo(); 

                }
                break;
            case 45 :
                // InternalCMSdslLexer.g:1:398: VerticalLineVerticalLine
                {
                mVerticalLineVerticalLine(); 

                }
                break;
            case 46 :
                // InternalCMSdslLexer.g:1:423: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 47 :
                // InternalCMSdslLexer.g:1:439: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 48 :
                // InternalCMSdslLexer.g:1:456: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 49 :
                // InternalCMSdslLexer.g:1:465: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 50 :
                // InternalCMSdslLexer.g:1:474: Comma
                {
                mComma(); 

                }
                break;
            case 51 :
                // InternalCMSdslLexer.g:1:480: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 52 :
                // InternalCMSdslLexer.g:1:492: Solidus
                {
                mSolidus(); 

                }
                break;
            case 53 :
                // InternalCMSdslLexer.g:1:500: Colon
                {
                mColon(); 

                }
                break;
            case 54 :
                // InternalCMSdslLexer.g:1:506: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 55 :
                // InternalCMSdslLexer.g:1:519: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 56 :
                // InternalCMSdslLexer.g:1:535: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 57 :
                // InternalCMSdslLexer.g:1:543: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 58 :
                // InternalCMSdslLexer.g:1:552: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 59 :
                // InternalCMSdslLexer.g:1:564: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 60 :
                // InternalCMSdslLexer.g:1:580: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 61 :
                // InternalCMSdslLexer.g:1:596: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 62 :
                // InternalCMSdslLexer.g:1:604: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\22\51\2\47\1\116\1\47\1\122\1\47\6\uffff\1\134\1\uffff\1\47\2\uffff\2\47\2\uffff\1\51\1\uffff\14\51\1\160\24\51\26\uffff\1\51\1\u0086\6\51\1\u008e\6\51\1\uffff\22\51\1\u00a7\1\u00a8\1\51\1\uffff\2\51\1\u00ac\3\51\1\u00b0\1\uffff\2\51\1\u00b3\1\u00b5\1\u00b6\1\u00b7\2\51\1\u00ba\1\51\1\u00bc\6\51\1\u00c3\5\51\1\u00c9\2\uffff\3\51\1\uffff\3\51\1\uffff\2\51\1\uffff\1\51\3\uffff\2\51\1\uffff\1\51\1\uffff\4\51\1\u00da\1\u00db\1\uffff\1\51\1\u00dd\1\u00de\1\u00df\1\u00e0\1\uffff\15\51\1\u00ee\1\51\1\u00f0\2\uffff\1\u00f1\4\uffff\3\51\1\u00f5\1\u00f6\2\51\1\u00f9\2\51\1\u00fc\1\u00fd\1\u00fe\1\uffff\1\u00ff\2\uffff\2\51\1\u0102\2\uffff\1\u0103\1\u0104\1\uffff\1\u0105\1\u0106\4\uffff\1\u0107\1\u0108\7\uffff";
    static final String DFA12_eofS =
        "\u0109\uffff";
    static final String DFA12_minS =
        "\1\0\1\156\4\141\1\145\1\163\1\145\1\151\1\164\1\141\1\155\1\165\1\150\2\141\2\156\1\75\1\46\3\75\1\174\6\uffff\1\52\1\uffff\1\101\2\uffff\2\0\2\uffff\1\160\1\uffff\1\154\1\164\1\146\1\141\1\163\1\144\2\163\1\157\1\162\1\163\1\165\1\60\1\145\1\154\1\157\1\142\1\156\1\143\2\162\1\164\1\141\1\162\1\141\1\155\1\145\1\154\1\145\1\157\1\156\1\144\1\145\26\uffff\1\165\1\60\1\151\2\141\1\154\1\164\1\145\1\60\1\163\1\152\3\164\1\145\1\uffff\1\162\1\157\1\154\1\162\1\147\1\143\1\151\1\156\2\151\1\157\1\154\1\142\1\143\1\163\1\154\1\141\1\171\2\60\1\164\1\uffff\1\144\1\142\1\60\1\165\1\145\1\156\1\60\1\uffff\1\167\1\145\4\60\2\156\1\60\1\141\1\60\1\145\1\156\1\151\1\164\1\154\1\162\1\60\1\145\1\153\1\145\1\144\1\164\1\60\2\uffff\1\124\2\141\1\uffff\1\154\1\143\1\141\1\uffff\1\157\1\143\1\uffff\1\162\3\uffff\1\141\1\147\1\uffff\1\162\1\uffff\1\163\1\147\1\156\1\171\2\60\1\uffff\1\162\4\60\1\uffff\1\171\1\164\1\163\2\164\1\155\1\162\1\164\1\145\1\155\1\163\1\171\1\163\1\60\1\147\1\60\2\uffff\1\60\4\uffff\1\160\1\157\1\145\2\60\1\145\1\144\1\60\1\141\1\145\3\60\1\uffff\1\60\2\uffff\1\145\1\162\1\60\2\uffff\2\60\1\uffff\2\60\4\uffff\2\60\7\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\156\1\141\1\151\1\157\2\162\1\163\2\157\1\165\1\141\1\166\1\165\1\150\1\154\1\141\2\156\1\75\1\46\1\75\1\76\1\75\1\174\6\uffff\1\57\1\uffff\1\172\2\uffff\2\uffff\2\uffff\1\164\1\uffff\1\154\1\164\1\146\1\141\1\163\1\144\2\163\1\157\1\162\1\170\1\165\1\172\1\145\1\154\1\157\1\142\1\156\1\143\2\162\1\164\1\141\1\162\1\141\1\155\1\145\1\154\1\145\1\157\1\156\1\144\1\145\26\uffff\1\165\1\172\1\151\1\145\1\141\1\154\1\164\1\145\1\172\1\163\1\152\3\164\1\145\1\uffff\1\162\1\157\1\154\1\162\1\147\1\143\1\151\1\156\2\151\1\157\1\154\1\142\1\143\1\163\1\154\1\141\1\171\2\172\1\164\1\uffff\1\144\1\142\1\172\1\165\1\145\1\156\1\172\1\uffff\1\167\1\145\4\172\2\156\1\172\1\141\1\172\1\145\1\156\1\151\1\164\1\154\1\162\1\172\1\145\1\153\1\145\1\144\1\164\1\172\2\uffff\1\124\2\141\1\uffff\1\154\1\143\1\141\1\uffff\1\157\1\143\1\uffff\1\162\3\uffff\1\141\1\147\1\uffff\1\162\1\uffff\1\163\1\147\1\156\1\171\2\172\1\uffff\1\162\4\172\1\uffff\1\171\1\164\1\163\2\164\1\155\1\162\1\164\1\145\1\155\1\163\1\171\1\163\1\172\1\147\1\172\2\uffff\1\172\4\uffff\1\160\1\157\1\145\2\172\1\145\1\144\1\172\1\141\1\145\3\172\1\uffff\1\172\2\uffff\1\145\1\162\1\172\2\uffff\2\172\1\uffff\2\172\4\uffff\2\172\7\uffff";
    static final String DFA12_acceptS =
        "\31\uffff\1\56\1\57\1\60\1\61\1\62\1\63\1\uffff\1\65\1\uffff\1\70\1\71\2\uffff\1\75\1\76\1\uffff\1\70\41\uffff\1\46\1\47\1\50\1\66\1\51\1\52\1\53\1\67\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\73\1\74\1\64\1\65\1\71\1\72\1\75\17\uffff\1\54\25\uffff\1\44\7\uffff\1\43\30\uffff\1\42\1\45\3\uffff\1\31\3\uffff\1\33\2\uffff\1\36\1\uffff\1\40\1\37\1\41\2\uffff\1\30\1\uffff\1\34\6\uffff\1\32\5\uffff\1\35\20\uffff\1\23\1\24\1\uffff\1\22\1\25\1\26\1\27\15\uffff\1\21\1\uffff\1\17\1\20\3\uffff\1\11\1\12\2\uffff\1\14\2\uffff\1\10\1\13\1\15\1\16\2\uffff\1\3\1\4\1\5\1\6\1\7\1\1\1\2";
    static final String DFA12_specialS =
        "\1\1\43\uffff\1\2\1\0\u00e3\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\47\2\46\2\47\1\46\22\47\1\46\1\23\1\44\3\47\1\24\1\45\1\31\1\32\1\33\1\34\1\35\1\36\1\47\1\37\12\43\1\40\1\47\1\25\1\26\1\27\2\47\32\42\3\47\1\41\1\42\1\47\1\21\1\10\1\16\1\3\1\14\1\17\1\42\1\4\1\1\2\42\1\11\1\20\1\15\1\22\1\5\2\42\1\12\1\6\1\7\1\2\1\13\3\42\1\47\1\30\uff83\47",
            "\1\50",
            "\1\52",
            "\1\53\3\uffff\1\54\3\uffff\1\55",
            "\1\60\7\uffff\1\57\5\uffff\1\56",
            "\1\61\15\uffff\1\63\2\uffff\1\62",
            "\1\64\11\uffff\1\66\2\uffff\1\65",
            "\1\67",
            "\1\70\11\uffff\1\71",
            "\1\72\5\uffff\1\73",
            "\1\75\1\74",
            "\1\76",
            "\1\100\1\77\3\uffff\1\101\3\uffff\1\102",
            "\1\103",
            "\1\104",
            "\1\105\7\uffff\1\106\2\uffff\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\117\1\120",
            "\1\121",
            "\1\123",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\132\4\uffff\1\133",
            "",
            "\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\0\137",
            "\0\137",
            "",
            "",
            "\1\141\3\uffff\1\142",
            "",
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
            "\1\156\4\uffff\1\155",
            "\1\157",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
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
            "\1\u0083",
            "\1\u0084",
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
            "\1\u0085",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0087",
            "\1\u0088\3\uffff\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00a9",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\1\u00b4\31\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00b8",
            "\1\u00b9",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00bb",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "",
            "",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u00dc",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00ef",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00f7",
            "\1\u00f8",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00fa",
            "\1\u00fb",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\u0100",
            "\1\u0101",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
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
            return "1:1: Tokens : ( InputType | Validator | Database | Hostname | Password | Textarea | Username | Belongs | Default | Dialect | Library | Project | Success | Warning | Entity | Number | String | Check | Email | Error | False | Field | Float | Bool | Date | Eval | Hide | Long | Many | Port | Test | Text | True | And | Has | Int | One | ExclamationMarkEqualsSign | AmpersandAmpersand | LessThanSignEqualsSign | EqualsSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | To | VerticalLineVerticalLine | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | Solidus | Colon | LessThanSign | GreaterThanSign | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_37 = input.LA(1);

                        s = -1;
                        if ( ((LA12_37>='\u0000' && LA12_37<='\uFFFF')) ) {s = 95;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='i') ) {s = 1;}

                        else if ( (LA12_0=='v') ) {s = 2;}

                        else if ( (LA12_0=='d') ) {s = 3;}

                        else if ( (LA12_0=='h') ) {s = 4;}

                        else if ( (LA12_0=='p') ) {s = 5;}

                        else if ( (LA12_0=='t') ) {s = 6;}

                        else if ( (LA12_0=='u') ) {s = 7;}

                        else if ( (LA12_0=='b') ) {s = 8;}

                        else if ( (LA12_0=='l') ) {s = 9;}

                        else if ( (LA12_0=='s') ) {s = 10;}

                        else if ( (LA12_0=='w') ) {s = 11;}

                        else if ( (LA12_0=='e') ) {s = 12;}

                        else if ( (LA12_0=='n') ) {s = 13;}

                        else if ( (LA12_0=='c') ) {s = 14;}

                        else if ( (LA12_0=='f') ) {s = 15;}

                        else if ( (LA12_0=='m') ) {s = 16;}

                        else if ( (LA12_0=='a') ) {s = 17;}

                        else if ( (LA12_0=='o') ) {s = 18;}

                        else if ( (LA12_0=='!') ) {s = 19;}

                        else if ( (LA12_0=='&') ) {s = 20;}

                        else if ( (LA12_0=='<') ) {s = 21;}

                        else if ( (LA12_0=='=') ) {s = 22;}

                        else if ( (LA12_0=='>') ) {s = 23;}

                        else if ( (LA12_0=='|') ) {s = 24;}

                        else if ( (LA12_0=='(') ) {s = 25;}

                        else if ( (LA12_0==')') ) {s = 26;}

                        else if ( (LA12_0=='*') ) {s = 27;}

                        else if ( (LA12_0=='+') ) {s = 28;}

                        else if ( (LA12_0==',') ) {s = 29;}

                        else if ( (LA12_0=='-') ) {s = 30;}

                        else if ( (LA12_0=='/') ) {s = 31;}

                        else if ( (LA12_0==':') ) {s = 32;}

                        else if ( (LA12_0=='^') ) {s = 33;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='g'||(LA12_0>='j' && LA12_0<='k')||(LA12_0>='q' && LA12_0<='r')||(LA12_0>='x' && LA12_0<='z')) ) {s = 34;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 35;}

                        else if ( (LA12_0=='\"') ) {s = 36;}

                        else if ( (LA12_0=='\'') ) {s = 37;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 38;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='%')||LA12_0=='.'||LA12_0==';'||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='{'||(LA12_0>='}' && LA12_0<='\uFFFF')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_36 = input.LA(1);

                        s = -1;
                        if ( ((LA12_36>='\u0000' && LA12_36<='\uFFFF')) ) {s = 95;}

                        else s = 39;

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