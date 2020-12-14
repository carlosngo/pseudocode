// Generated from D:/Documents/La Salle/CMPILER/pseudocode/res\Pseudocode.g4 by ANTLR 4.9
package gen;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link PseudocodeVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class PseudocodeBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements PseudocodeVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInit(PseudocodeParser.InitContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitValue(PseudocodeParser.ValueContext ctx) { return visitChildren(ctx); }
}