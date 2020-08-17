/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mdsd.parser.antlr;

import com.google.inject.Inject;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mdsd.parser.antlr.internal.InternalAndroidGeneratorParser;
import org.xtext.example.mdsd.services.AndroidGeneratorGrammarAccess;

public class AndroidGeneratorParser extends AbstractAntlrParser {

	@Inject
	private AndroidGeneratorGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new AndroidGeneratorTokenSource(super.createLexer(stream));
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
	protected InternalAndroidGeneratorParser createParser(XtextTokenStream stream) {
		return new InternalAndroidGeneratorParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "AndroidAppProject";
	}

	public AndroidGeneratorGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AndroidGeneratorGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
