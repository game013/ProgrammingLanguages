// Generated from /Users/game013/Documents/Git/ProgrammingLanguages/Assignment2/SyntaxTlLanguage/TL.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TLParser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll(TLParser.AllContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#import_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_block(TLParser.Import_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#import_block_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_block_1(TLParser.Import_block_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#import_block_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_block_2(TLParser.Import_block_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(TLParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(TLParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#empty_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_main(TLParser.Empty_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(TLParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(TLParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#cond_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_header(TLParser.Cond_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#if_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_header(TLParser.If_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif(TLParser.ElseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(TLParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(TLParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#binary_bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_bool(TLParser.Binary_boolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#unary_bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_bool(TLParser.Unary_boolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(TLParser.ExprContext ctx);
}