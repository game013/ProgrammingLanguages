// Generated from /Users/game013/Documents/Git/ProgrammingLanguages/Assignment2/SyntaxTlLanguage/TL.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TLParser}.
 */
public interface TLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TLParser#all}.
	 * @param ctx the parse tree
	 */
	void enterAll(TLParser.AllContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#all}.
	 * @param ctx the parse tree
	 */
	void exitAll(TLParser.AllContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#import_block}.
	 * @param ctx the parse tree
	 */
	void enterImport_block(TLParser.Import_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#import_block}.
	 * @param ctx the parse tree
	 */
	void exitImport_block(TLParser.Import_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#import_block_1}.
	 * @param ctx the parse tree
	 */
	void enterImport_block_1(TLParser.Import_block_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#import_block_1}.
	 * @param ctx the parse tree
	 */
	void exitImport_block_1(TLParser.Import_block_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#import_block_2}.
	 * @param ctx the parse tree
	 */
	void enterImport_block_2(TLParser.Import_block_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#import_block_2}.
	 * @param ctx the parse tree
	 */
	void exitImport_block_2(TLParser.Import_block_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(TLParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(TLParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(TLParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(TLParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#empty_main}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_main(TLParser.Empty_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#empty_main}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_main(TLParser.Empty_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(TLParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(TLParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(TLParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(TLParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#cond_header}.
	 * @param ctx the parse tree
	 */
	void enterCond_header(TLParser.Cond_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#cond_header}.
	 * @param ctx the parse tree
	 */
	void exitCond_header(TLParser.Cond_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#if_header}.
	 * @param ctx the parse tree
	 */
	void enterIf_header(TLParser.If_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#if_header}.
	 * @param ctx the parse tree
	 */
	void exitIf_header(TLParser.If_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#elseif}.
	 * @param ctx the parse tree
	 */
	void enterElseif(TLParser.ElseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#elseif}.
	 * @param ctx the parse tree
	 */
	void exitElseif(TLParser.ElseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(TLParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(TLParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(TLParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(TLParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#binary_bool}.
	 * @param ctx the parse tree
	 */
	void enterBinary_bool(TLParser.Binary_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#binary_bool}.
	 * @param ctx the parse tree
	 */
	void exitBinary_bool(TLParser.Binary_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#unary_bool}.
	 * @param ctx the parse tree
	 */
	void enterUnary_bool(TLParser.Unary_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#unary_bool}.
	 * @param ctx the parse tree
	 */
	void exitUnary_bool(TLParser.Unary_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TLParser.ExprContext ctx);
}