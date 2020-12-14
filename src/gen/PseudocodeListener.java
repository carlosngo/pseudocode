// Generated from D:/Documents/La Salle/CMPILER/pseudocode/res\Pseudocode.g4 by ANTLR 4.9
package gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PseudocodeParser}.
 */
public interface PseudocodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(PseudocodeParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(PseudocodeParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PseudocodeParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PseudocodeParser.ValueContext ctx);
}