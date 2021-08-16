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

    public InternalCMSdslLexer() {;} 
    public InternalCMSdslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCMSdslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCMSdslLexer.g"; }

    // $ANTLR start "DisplayAs"
    public final void mDisplayAs() throws RecognitionException {
        try {
            int _type = DisplayAs;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:14:11: ( 'displayAs' )
            // InternalCMSdslLexer.g:14:13: 'displayAs'
            {
            match("displayAs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DisplayAs"

    // $ANTLR start "InputType"
    public final void mInputType() throws RecognitionException {
        try {
            int _type = InputType;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:16:11: ( 'inputType' )
            // InternalCMSdslLexer.g:16:13: 'inputType'
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
            // InternalCMSdslLexer.g:18:11: ( 'validator' )
            // InternalCMSdslLexer.g:18:13: 'validator'
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
            // InternalCMSdslLexer.g:20:10: ( 'database' )
            // InternalCMSdslLexer.g:20:12: 'database'
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
            // InternalCMSdslLexer.g:22:10: ( 'hostname' )
            // InternalCMSdslLexer.g:22:12: 'hostname'
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

    // $ANTLR start "Nullable"
    public final void mNullable() throws RecognitionException {
        try {
            int _type = Nullable;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:24:10: ( 'nullable' )
            // InternalCMSdslLexer.g:24:12: 'nullable'
            {
            match("nullable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Nullable"

    // $ANTLR start "Password"
    public final void mPassword() throws RecognitionException {
        try {
            int _type = Password;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:26:10: ( 'password' )
            // InternalCMSdslLexer.g:26:12: 'password'
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
            // InternalCMSdslLexer.g:28:10: ( 'textarea' )
            // InternalCMSdslLexer.g:28:12: 'textarea'
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
            // InternalCMSdslLexer.g:30:10: ( 'username' )
            // InternalCMSdslLexer.g:30:12: 'username'
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
            // InternalCMSdslLexer.g:32:9: ( 'belongs' )
            // InternalCMSdslLexer.g:32:11: 'belongs'
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
            // InternalCMSdslLexer.g:34:9: ( 'default' )
            // InternalCMSdslLexer.g:34:11: 'default'
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
            // InternalCMSdslLexer.g:36:9: ( 'dialect' )
            // InternalCMSdslLexer.g:36:11: 'dialect'
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
            // InternalCMSdslLexer.g:38:9: ( 'library' )
            // InternalCMSdslLexer.g:38:11: 'library'
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
            // InternalCMSdslLexer.g:40:9: ( 'project' )
            // InternalCMSdslLexer.g:40:11: 'project'
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

    // $ANTLR start "Client"
    public final void mClient() throws RecognitionException {
        try {
            int _type = Client;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:42:8: ( 'client' )
            // InternalCMSdslLexer.g:42:10: 'client'
            {
            match("client"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Client"

    // $ANTLR start "Entity"
    public final void mEntity() throws RecognitionException {
        try {
            int _type = Entity;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:44:8: ( 'entity' )
            // InternalCMSdslLexer.g:44:10: 'entity'
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
            // InternalCMSdslLexer.g:46:8: ( 'number' )
            // InternalCMSdslLexer.g:46:10: 'number'
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

    // $ANTLR start "Server"
    public final void mServer() throws RecognitionException {
        try {
            int _type = Server;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:48:8: ( 'server' )
            // InternalCMSdslLexer.g:48:10: 'server'
            {
            match("server"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Server"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:50:8: ( 'string' )
            // InternalCMSdslLexer.g:50:10: 'string'
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

    // $ANTLR start "Unique"
    public final void mUnique() throws RecognitionException {
        try {
            int _type = Unique;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:52:8: ( 'unique' )
            // InternalCMSdslLexer.g:52:10: 'unique'
            {
            match("unique"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Unique"

    // $ANTLR start "Check"
    public final void mCheck() throws RecognitionException {
        try {
            int _type = Check;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:54:7: ( 'check' )
            // InternalCMSdslLexer.g:54:9: 'check'
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
            // InternalCMSdslLexer.g:56:7: ( 'email' )
            // InternalCMSdslLexer.g:56:9: 'email'
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

    // $ANTLR start "Field"
    public final void mField() throws RecognitionException {
        try {
            int _type = Field;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:58:7: ( 'field' )
            // InternalCMSdslLexer.g:58:9: 'field'
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
            // InternalCMSdslLexer.g:60:7: ( 'float' )
            // InternalCMSdslLexer.g:60:9: 'float'
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
            // InternalCMSdslLexer.g:62:6: ( 'bool' )
            // InternalCMSdslLexer.g:62:8: 'bool'
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
            // InternalCMSdslLexer.g:64:6: ( 'date' )
            // InternalCMSdslLexer.g:64:8: 'date'
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

    // $ANTLR start "And"
    public final void mAnd() throws RecognitionException {
        try {
            int _type = And;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:78:5: ( 'and' )
            // InternalCMSdslLexer.g:78:7: 'and'
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
            // InternalCMSdslLexer.g:80:5: ( 'has' )
            // InternalCMSdslLexer.g:80:7: 'has'
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
            // InternalCMSdslLexer.g:82:5: ( 'int' )
            // InternalCMSdslLexer.g:82:7: 'int'
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
            // InternalCMSdslLexer.g:84:5: ( 'one' )
            // InternalCMSdslLexer.g:84:7: 'one'
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
            // InternalCMSdslLexer.g:86:27: ( '!=' )
            // InternalCMSdslLexer.g:86:29: '!='
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
            // InternalCMSdslLexer.g:88:20: ( '&&' )
            // InternalCMSdslLexer.g:88:22: '&&'
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
            // InternalCMSdslLexer.g:90:24: ( '<=' )
            // InternalCMSdslLexer.g:90:26: '<='
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
            // InternalCMSdslLexer.g:92:22: ( '==' )
            // InternalCMSdslLexer.g:92:24: '=='
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
            // InternalCMSdslLexer.g:94:27: ( '=>' )
            // InternalCMSdslLexer.g:94:29: '=>'
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
            // InternalCMSdslLexer.g:96:27: ( '>=' )
            // InternalCMSdslLexer.g:96:29: '>='
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
            // InternalCMSdslLexer.g:98:4: ( 'to' )
            // InternalCMSdslLexer.g:98:6: 'to'
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
            // InternalCMSdslLexer.g:100:26: ( '||' )
            // InternalCMSdslLexer.g:100:28: '||'
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
            // InternalCMSdslLexer.g:102:17: ( '(' )
            // InternalCMSdslLexer.g:102:19: '('
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
            // InternalCMSdslLexer.g:104:18: ( ')' )
            // InternalCMSdslLexer.g:104:20: ')'
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
            // InternalCMSdslLexer.g:106:10: ( '*' )
            // InternalCMSdslLexer.g:106:12: '*'
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
            // InternalCMSdslLexer.g:108:10: ( '+' )
            // InternalCMSdslLexer.g:108:12: '+'
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
            // InternalCMSdslLexer.g:110:7: ( ',' )
            // InternalCMSdslLexer.g:110:9: ','
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
            // InternalCMSdslLexer.g:112:13: ( '-' )
            // InternalCMSdslLexer.g:112:15: '-'
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
            // InternalCMSdslLexer.g:114:9: ( '/' )
            // InternalCMSdslLexer.g:114:11: '/'
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
            // InternalCMSdslLexer.g:116:7: ( ':' )
            // InternalCMSdslLexer.g:116:9: ':'
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
            // InternalCMSdslLexer.g:118:14: ( '<' )
            // InternalCMSdslLexer.g:118:16: '<'
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
            // InternalCMSdslLexer.g:120:17: ( '>' )
            // InternalCMSdslLexer.g:120:19: '>'
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

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCMSdslLexer.g:122:14: ( ( 'true' | 'false' ) )
            // InternalCMSdslLexer.g:122:16: ( 'true' | 'false' )
            {
            // InternalCMSdslLexer.g:122:16: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCMSdslLexer.g:122:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalCMSdslLexer.g:122:24: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEAN"

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
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
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
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    break loop3;
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
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCMSdslLexer.g:130:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCMSdslLexer.g:132:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCMSdslLexer.g:132:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
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
                    	    break loop5;
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
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
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
                    	    break loop6;
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
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCMSdslLexer.g:134:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
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
            	    break loop9;
                }
            } while (true);

            // InternalCMSdslLexer.g:136:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCMSdslLexer.g:136:41: ( '\\r' )? '\\n'
                    {
                    // InternalCMSdslLexer.g:136:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
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
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
        // InternalCMSdslLexer.g:1:8: ( DisplayAs | InputType | Validator | Database | Hostname | Nullable | Password | Textarea | Username | Belongs | Default | Dialect | Library | Project | Client | Entity | Number | Server | String | Unique | Check | Email | Field | Float | Bool | Date | Hide | Long | Many | Port | Test | Text | And | Has | Int | One | ExclamationMarkEqualsSign | AmpersandAmpersand | LessThanSignEqualsSign | EqualsSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | To | VerticalLineVerticalLine | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | Solidus | Colon | LessThanSign | GreaterThanSign | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=62;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalCMSdslLexer.g:1:10: DisplayAs
                {
                mDisplayAs(); 

                }
                break;
            case 2 :
                // InternalCMSdslLexer.g:1:20: InputType
                {
                mInputType(); 

                }
                break;
            case 3 :
                // InternalCMSdslLexer.g:1:30: Validator
                {
                mValidator(); 

                }
                break;
            case 4 :
                // InternalCMSdslLexer.g:1:40: Database
                {
                mDatabase(); 

                }
                break;
            case 5 :
                // InternalCMSdslLexer.g:1:49: Hostname
                {
                mHostname(); 

                }
                break;
            case 6 :
                // InternalCMSdslLexer.g:1:58: Nullable
                {
                mNullable(); 

                }
                break;
            case 7 :
                // InternalCMSdslLexer.g:1:67: Password
                {
                mPassword(); 

                }
                break;
            case 8 :
                // InternalCMSdslLexer.g:1:76: Textarea
                {
                mTextarea(); 

                }
                break;
            case 9 :
                // InternalCMSdslLexer.g:1:85: Username
                {
                mUsername(); 

                }
                break;
            case 10 :
                // InternalCMSdslLexer.g:1:94: Belongs
                {
                mBelongs(); 

                }
                break;
            case 11 :
                // InternalCMSdslLexer.g:1:102: Default
                {
                mDefault(); 

                }
                break;
            case 12 :
                // InternalCMSdslLexer.g:1:110: Dialect
                {
                mDialect(); 

                }
                break;
            case 13 :
                // InternalCMSdslLexer.g:1:118: Library
                {
                mLibrary(); 

                }
                break;
            case 14 :
                // InternalCMSdslLexer.g:1:126: Project
                {
                mProject(); 

                }
                break;
            case 15 :
                // InternalCMSdslLexer.g:1:134: Client
                {
                mClient(); 

                }
                break;
            case 16 :
                // InternalCMSdslLexer.g:1:141: Entity
                {
                mEntity(); 

                }
                break;
            case 17 :
                // InternalCMSdslLexer.g:1:148: Number
                {
                mNumber(); 

                }
                break;
            case 18 :
                // InternalCMSdslLexer.g:1:155: Server
                {
                mServer(); 

                }
                break;
            case 19 :
                // InternalCMSdslLexer.g:1:162: String
                {
                mString(); 

                }
                break;
            case 20 :
                // InternalCMSdslLexer.g:1:169: Unique
                {
                mUnique(); 

                }
                break;
            case 21 :
                // InternalCMSdslLexer.g:1:176: Check
                {
                mCheck(); 

                }
                break;
            case 22 :
                // InternalCMSdslLexer.g:1:182: Email
                {
                mEmail(); 

                }
                break;
            case 23 :
                // InternalCMSdslLexer.g:1:188: Field
                {
                mField(); 

                }
                break;
            case 24 :
                // InternalCMSdslLexer.g:1:194: Float
                {
                mFloat(); 

                }
                break;
            case 25 :
                // InternalCMSdslLexer.g:1:200: Bool
                {
                mBool(); 

                }
                break;
            case 26 :
                // InternalCMSdslLexer.g:1:205: Date
                {
                mDate(); 

                }
                break;
            case 27 :
                // InternalCMSdslLexer.g:1:210: Hide
                {
                mHide(); 

                }
                break;
            case 28 :
                // InternalCMSdslLexer.g:1:215: Long
                {
                mLong(); 

                }
                break;
            case 29 :
                // InternalCMSdslLexer.g:1:220: Many
                {
                mMany(); 

                }
                break;
            case 30 :
                // InternalCMSdslLexer.g:1:225: Port
                {
                mPort(); 

                }
                break;
            case 31 :
                // InternalCMSdslLexer.g:1:230: Test
                {
                mTest(); 

                }
                break;
            case 32 :
                // InternalCMSdslLexer.g:1:235: Text
                {
                mText(); 

                }
                break;
            case 33 :
                // InternalCMSdslLexer.g:1:240: And
                {
                mAnd(); 

                }
                break;
            case 34 :
                // InternalCMSdslLexer.g:1:244: Has
                {
                mHas(); 

                }
                break;
            case 35 :
                // InternalCMSdslLexer.g:1:248: Int
                {
                mInt(); 

                }
                break;
            case 36 :
                // InternalCMSdslLexer.g:1:252: One
                {
                mOne(); 

                }
                break;
            case 37 :
                // InternalCMSdslLexer.g:1:256: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 38 :
                // InternalCMSdslLexer.g:1:282: AmpersandAmpersand
                {
                mAmpersandAmpersand(); 

                }
                break;
            case 39 :
                // InternalCMSdslLexer.g:1:301: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 40 :
                // InternalCMSdslLexer.g:1:324: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 41 :
                // InternalCMSdslLexer.g:1:345: EqualsSignGreaterThanSign
                {
                mEqualsSignGreaterThanSign(); 

                }
                break;
            case 42 :
                // InternalCMSdslLexer.g:1:371: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 43 :
                // InternalCMSdslLexer.g:1:397: To
                {
                mTo(); 

                }
                break;
            case 44 :
                // InternalCMSdslLexer.g:1:400: VerticalLineVerticalLine
                {
                mVerticalLineVerticalLine(); 

                }
                break;
            case 45 :
                // InternalCMSdslLexer.g:1:425: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 46 :
                // InternalCMSdslLexer.g:1:441: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 47 :
                // InternalCMSdslLexer.g:1:458: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 48 :
                // InternalCMSdslLexer.g:1:467: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 49 :
                // InternalCMSdslLexer.g:1:476: Comma
                {
                mComma(); 

                }
                break;
            case 50 :
                // InternalCMSdslLexer.g:1:482: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 51 :
                // InternalCMSdslLexer.g:1:494: Solidus
                {
                mSolidus(); 

                }
                break;
            case 52 :
                // InternalCMSdslLexer.g:1:502: Colon
                {
                mColon(); 

                }
                break;
            case 53 :
                // InternalCMSdslLexer.g:1:508: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 54 :
                // InternalCMSdslLexer.g:1:521: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 55 :
                // InternalCMSdslLexer.g:1:537: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 56 :
                // InternalCMSdslLexer.g:1:550: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 57 :
                // InternalCMSdslLexer.g:1:558: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 58 :
                // InternalCMSdslLexer.g:1:567: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 59 :
                // InternalCMSdslLexer.g:1:579: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 60 :
                // InternalCMSdslLexer.g:1:595: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 61 :
                // InternalCMSdslLexer.g:1:611: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 62 :
                // InternalCMSdslLexer.g:1:619: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\21\52\2\46\1\114\1\46\1\120\1\46\6\uffff\1\132\1\uffff\1\46\2\uffff\2\46\2\uffff\3\52\1\uffff\12\52\1\160\23\52\26\uffff\5\52\1\u008a\3\52\1\u008e\7\52\1\uffff\21\52\1\u00a7\1\u00a8\3\52\1\u00ac\2\52\1\uffff\2\52\1\u00b1\1\uffff\4\52\1\u00b6\1\u00b8\1\u00b9\1\u00ba\3\52\1\u00be\1\52\1\u00c0\11\52\1\u00ca\2\uffff\3\52\1\uffff\4\52\1\uffff\4\52\1\uffff\1\52\3\uffff\3\52\1\uffff\1\52\1\uffff\1\52\1\u00dc\1\52\1\u00de\2\52\1\u00e1\1\u00e2\1\u00ba\1\uffff\10\52\1\u00eb\4\52\1\u00f0\2\52\1\u00f3\1\uffff\1\u00f4\1\uffff\1\u00f5\1\u00f6\2\uffff\1\52\1\u00f8\1\52\1\u00fa\4\52\1\uffff\1\52\1\u0100\2\52\1\uffff\1\u0103\1\u0104\4\uffff\1\52\1\uffff\1\u0106\1\uffff\2\52\1\u0109\1\u010a\1\u010b\1\uffff\1\u010c\1\u010d\2\uffff\1\u010e\1\uffff\1\u010f\1\u0110\10\uffff";
    static final String DFA13_eofS =
        "\u0111\uffff";
    static final String DFA13_minS =
        "\1\0\1\141\1\156\2\141\1\165\1\141\1\145\1\156\1\145\1\151\1\150\1\155\1\145\2\141\2\156\1\75\1\46\3\75\1\174\6\uffff\1\52\1\uffff\1\101\2\uffff\2\0\2\uffff\1\141\1\164\1\146\1\uffff\1\160\1\154\1\163\1\144\1\163\1\154\1\163\1\157\1\162\1\163\1\60\1\165\1\145\1\151\1\154\1\157\1\142\1\156\1\151\1\145\1\164\1\141\2\162\1\145\1\157\1\154\1\156\1\144\1\145\26\uffff\1\160\1\154\2\141\1\165\1\60\1\151\1\164\1\145\1\60\1\154\1\142\1\163\1\152\3\164\1\uffff\1\145\1\162\1\161\1\157\1\154\1\162\1\147\1\145\1\143\2\151\1\166\1\151\1\154\1\141\1\163\1\171\2\60\1\154\1\145\1\142\1\60\1\165\1\164\1\uffff\1\144\1\156\1\60\1\uffff\1\141\1\145\1\167\1\145\4\60\1\156\1\165\1\156\1\60\1\141\1\60\1\156\1\153\1\164\1\154\1\145\1\156\1\144\1\164\1\145\1\60\2\uffff\1\141\1\143\1\141\1\uffff\1\154\1\124\2\141\1\uffff\1\142\1\162\1\157\1\143\1\uffff\1\162\3\uffff\1\141\1\145\1\147\1\uffff\1\162\1\uffff\1\164\1\60\1\171\1\60\1\162\1\147\3\60\1\uffff\1\171\1\164\1\163\1\164\1\171\1\164\1\155\1\154\1\60\1\162\1\164\1\145\1\155\1\60\1\163\1\171\1\60\1\uffff\1\60\1\uffff\2\60\2\uffff\1\101\1\60\1\145\1\60\1\160\1\157\2\145\1\uffff\1\144\1\60\1\141\1\145\1\uffff\2\60\4\uffff\1\163\1\uffff\1\60\1\uffff\1\145\1\162\3\60\1\uffff\2\60\2\uffff\1\60\1\uffff\2\60\10\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\151\1\156\1\141\1\157\1\165\2\162\1\163\2\157\1\154\1\156\1\164\1\154\1\141\2\156\1\75\1\46\1\75\1\76\1\75\1\174\6\uffff\1\57\1\uffff\1\172\2\uffff\2\uffff\2\uffff\1\163\1\164\1\146\1\uffff\1\164\1\154\1\163\1\144\1\163\1\155\1\163\1\157\1\162\1\170\1\172\1\165\1\145\1\151\1\154\1\157\1\142\1\156\1\151\1\145\1\164\1\141\2\162\1\145\1\157\1\154\1\156\1\144\1\145\26\uffff\1\160\1\154\1\145\1\141\1\165\1\172\1\151\1\164\1\145\1\172\1\154\1\142\1\163\1\152\3\164\1\uffff\1\145\1\162\1\161\1\157\1\154\1\162\1\147\1\145\1\143\2\151\1\166\1\151\1\154\1\141\1\163\1\171\2\172\1\154\1\145\1\142\1\172\1\165\1\164\1\uffff\1\144\1\156\1\172\1\uffff\1\141\1\145\1\167\1\145\4\172\1\156\1\165\1\156\1\172\1\141\1\172\1\156\1\153\1\164\1\154\1\145\1\156\1\144\1\164\1\145\1\172\2\uffff\1\141\1\143\1\141\1\uffff\1\154\1\124\2\141\1\uffff\1\142\1\162\1\157\1\143\1\uffff\1\162\3\uffff\1\141\1\145\1\147\1\uffff\1\162\1\uffff\1\164\1\172\1\171\1\172\1\162\1\147\3\172\1\uffff\1\171\1\164\1\163\1\164\1\171\1\164\1\155\1\154\1\172\1\162\1\164\1\145\1\155\1\172\1\163\1\171\1\172\1\uffff\1\172\1\uffff\2\172\2\uffff\1\101\1\172\1\145\1\172\1\160\1\157\2\145\1\uffff\1\144\1\172\1\141\1\145\1\uffff\2\172\4\uffff\1\163\1\uffff\1\172\1\uffff\1\145\1\162\3\172\1\uffff\2\172\2\uffff\1\172\1\uffff\2\172\10\uffff";
    static final String DFA13_acceptS =
        "\30\uffff\1\55\1\56\1\57\1\60\1\61\1\62\1\uffff\1\64\1\uffff\1\70\1\71\2\uffff\1\75\1\76\3\uffff\1\70\36\uffff\1\45\1\46\1\47\1\65\1\50\1\51\1\52\1\66\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\73\1\74\1\63\1\64\1\71\1\72\1\75\21\uffff\1\53\31\uffff\1\43\3\uffff\1\42\30\uffff\1\41\1\44\3\uffff\1\32\4\uffff\1\33\4\uffff\1\36\1\uffff\1\40\1\37\1\67\3\uffff\1\31\1\uffff\1\34\11\uffff\1\35\21\uffff\1\25\1\uffff\1\26\2\uffff\1\27\1\30\10\uffff\1\21\4\uffff\1\24\2\uffff\1\17\1\20\1\22\1\23\1\uffff\1\14\1\uffff\1\13\5\uffff\1\16\2\uffff\1\12\1\15\1\uffff\1\4\2\uffff\1\5\1\6\1\7\1\10\1\11\1\1\1\2\1\3";
    static final String DFA13_specialS =
        "\1\0\42\uffff\1\1\1\2\u00ec\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\46\2\45\2\46\1\45\22\46\1\45\1\22\1\43\3\46\1\23\1\44\1\30\1\31\1\32\1\33\1\34\1\35\1\46\1\36\12\42\1\37\1\46\1\24\1\25\1\26\2\46\32\41\3\46\1\40\1\41\1\46\1\20\1\11\1\13\1\1\1\14\1\16\1\41\1\4\1\2\2\41\1\12\1\17\1\5\1\21\1\6\2\41\1\15\1\7\1\10\1\3\4\41\1\46\1\27\uff83\46",
            "\1\50\3\uffff\1\51\3\uffff\1\47",
            "\1\53",
            "\1\54",
            "\1\57\7\uffff\1\56\5\uffff\1\55",
            "\1\60",
            "\1\61\15\uffff\1\63\2\uffff\1\62",
            "\1\64\11\uffff\1\65\2\uffff\1\66",
            "\1\70\4\uffff\1\67",
            "\1\71\11\uffff\1\72",
            "\1\73\5\uffff\1\74",
            "\1\76\3\uffff\1\75",
            "\1\100\1\77",
            "\1\101\16\uffff\1\102",
            "\1\105\7\uffff\1\103\2\uffff\1\104",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\115\1\116",
            "\1\117",
            "\1\121",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\130\4\uffff\1\131",
            "",
            "\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\0\135",
            "\0\135",
            "",
            "",
            "\1\140\21\uffff\1\137",
            "\1\141",
            "\1\142",
            "",
            "\1\143\3\uffff\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\157\4\uffff\1\156",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
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
            "\1\u0084",
            "\1\u0085",
            "\1\u0086\3\uffff\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "",
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
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u00b7\31\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00bf",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "\1\u00d6",
            "",
            "",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "\1\u00da",
            "",
            "\1\u00db",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00dd",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00df",
            "\1\u00e0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00f1",
            "\1\u00f2",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u00f7",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00f9",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "",
            "\1\u00ff",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0101",
            "\1\u0102",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "\1\u0105",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0107",
            "\1\u0108",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( DisplayAs | InputType | Validator | Database | Hostname | Nullable | Password | Textarea | Username | Belongs | Default | Dialect | Library | Project | Client | Entity | Number | Server | String | Unique | Check | Email | Field | Float | Bool | Date | Hide | Long | Many | Port | Test | Text | And | Has | Int | One | ExclamationMarkEqualsSign | AmpersandAmpersand | LessThanSignEqualsSign | EqualsSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | To | VerticalLineVerticalLine | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | Solidus | Colon | LessThanSign | GreaterThanSign | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='d') ) {s = 1;}

                        else if ( (LA13_0=='i') ) {s = 2;}

                        else if ( (LA13_0=='v') ) {s = 3;}

                        else if ( (LA13_0=='h') ) {s = 4;}

                        else if ( (LA13_0=='n') ) {s = 5;}

                        else if ( (LA13_0=='p') ) {s = 6;}

                        else if ( (LA13_0=='t') ) {s = 7;}

                        else if ( (LA13_0=='u') ) {s = 8;}

                        else if ( (LA13_0=='b') ) {s = 9;}

                        else if ( (LA13_0=='l') ) {s = 10;}

                        else if ( (LA13_0=='c') ) {s = 11;}

                        else if ( (LA13_0=='e') ) {s = 12;}

                        else if ( (LA13_0=='s') ) {s = 13;}

                        else if ( (LA13_0=='f') ) {s = 14;}

                        else if ( (LA13_0=='m') ) {s = 15;}

                        else if ( (LA13_0=='a') ) {s = 16;}

                        else if ( (LA13_0=='o') ) {s = 17;}

                        else if ( (LA13_0=='!') ) {s = 18;}

                        else if ( (LA13_0=='&') ) {s = 19;}

                        else if ( (LA13_0=='<') ) {s = 20;}

                        else if ( (LA13_0=='=') ) {s = 21;}

                        else if ( (LA13_0=='>') ) {s = 22;}

                        else if ( (LA13_0=='|') ) {s = 23;}

                        else if ( (LA13_0=='(') ) {s = 24;}

                        else if ( (LA13_0==')') ) {s = 25;}

                        else if ( (LA13_0=='*') ) {s = 26;}

                        else if ( (LA13_0=='+') ) {s = 27;}

                        else if ( (LA13_0==',') ) {s = 28;}

                        else if ( (LA13_0=='-') ) {s = 29;}

                        else if ( (LA13_0=='/') ) {s = 30;}

                        else if ( (LA13_0==':') ) {s = 31;}

                        else if ( (LA13_0=='^') ) {s = 32;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='g'||(LA13_0>='j' && LA13_0<='k')||(LA13_0>='q' && LA13_0<='r')||(LA13_0>='w' && LA13_0<='z')) ) {s = 33;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 34;}

                        else if ( (LA13_0=='\"') ) {s = 35;}

                        else if ( (LA13_0=='\'') ) {s = 36;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 37;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='#' && LA13_0<='%')||LA13_0=='.'||LA13_0==';'||(LA13_0>='?' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='{'||(LA13_0>='}' && LA13_0<='\uFFFF')) ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_35 = input.LA(1);

                        s = -1;
                        if ( ((LA13_35>='\u0000' && LA13_35<='\uFFFF')) ) {s = 93;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_36 = input.LA(1);

                        s = -1;
                        if ( ((LA13_36>='\u0000' && LA13_36<='\uFFFF')) ) {s = 93;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}