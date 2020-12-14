// Generated from D:/Documents/La Salle/CMPILER/pseudocode/res\Pseudocode.g4 by ANTLR 4.9
package gen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PseudocodeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PseudocodeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(PseudocodeParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(PseudocodeParser.ValueContext ctx);
}