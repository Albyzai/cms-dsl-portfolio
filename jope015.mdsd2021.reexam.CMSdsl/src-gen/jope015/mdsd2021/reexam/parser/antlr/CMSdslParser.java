/*
 * generated by Xtext 2.22.0
 */
package jope015.mdsd2021.reexam.parser.antlr;

import com.google.inject.Inject;
import jope015.mdsd2021.reexam.parser.antlr.internal.InternalCMSdslParser;
import jope015.mdsd2021.reexam.services.CMSdslGrammarAccess;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class CMSdslParser extends AbstractAntlrParser {

	@Inject
	private CMSdslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new CMSdslTokenSource(super.createLexer(stream));
	}
	
	/**
	 * Indentation aware languages do not support partial parsing since the lexer is inherently stateful.
	 * Override and return {@code true} if your terminal splitting is stateless.
	 */
	@Override
	protected boolean isReparseSupported() {
		return false;
	}

	@Override
	protected InternalCMSdslParser createParser(XtextTokenStream stream) {
		return new InternalCMSdslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Project";
	}

	public CMSdslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CMSdslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}