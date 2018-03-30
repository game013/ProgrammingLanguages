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
	 * Enter a parse tree produced by {@link TLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_statement(TLParser.Simple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_statement(TLParser.Simple_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#composed_statement}.
	 * @param ctx the parse tree
	 */
	void enterComposed_statement(TLParser.Composed_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#composed_statement}.
	 * @param ctx the parse tree
	 */
	void exitComposed_statement(TLParser.Composed_statementContext ctx);
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
	 * Enter a parse tree produced by {@link TLParser#regular_import}.
	 * @param ctx the parse tree
	 */
	void enterRegular_import(TLParser.Regular_importContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#regular_import}.
	 * @param ctx the parse tree
	 */
	void exitRegular_import(TLParser.Regular_importContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#from_import}.
	 * @param ctx the parse tree
	 */
	void enterFrom_import(TLParser.From_importContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#from_import}.
	 * @param ctx the parse tree
	 */
	void exitFrom_import(TLParser.From_importContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(TLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(TLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#log_invoke}.
	 * @param ctx the parse tree
	 */
	void enterLog_invoke(TLParser.Log_invokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#log_invoke}.
	 * @param ctx the parse tree
	 */
	void exitLog_invoke(TLParser.Log_invokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#method_invoke}.
	 * @param ctx the parse tree
	 */
	void enterMethod_invoke(TLParser.Method_invokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#method_invoke}.
	 * @param ctx the parse tree
	 */
	void exitMethod_invoke(TLParser.Method_invokeContext ctx);
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
	 * Enter a parse tree produced by {@link TLParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(TLParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(TLParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(TLParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(TLParser.Func_defContext ctx);
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
	 * Enter a parse tree produced by {@link TLParser#if_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_block(TLParser.If_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#if_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_block(TLParser.If_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#elif_header}.
	 * @param ctx the parse tree
	 */
	void enterElif_header(TLParser.Elif_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#elif_header}.
	 * @param ctx the parse tree
	 */
	void exitElif_header(TLParser.Elif_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#while_block}.
	 * @param ctx the parse tree
	 */
	void enterWhile_block(TLParser.While_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#while_block}.
	 * @param ctx the parse tree
	 */
	void exitWhile_block(TLParser.While_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#for_block}.
	 * @param ctx the parse tree
	 */
	void enterFor_block(TLParser.For_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#for_block}.
	 * @param ctx the parse tree
	 */
	void exitFor_block(TLParser.For_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TLParser.BlockContext ctx);
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
	 * Enter a parse tree produced by {@link TLParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expr(TLParser.Simple_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expr(TLParser.Simple_exprContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link TLParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(TLParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(TLParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#array_def}.
	 * @param ctx the parse tree
	 */
	void enterArray_def(TLParser.Array_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#array_def}.
	 * @param ctx the parse tree
	 */
	void exitArray_def(TLParser.Array_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#binary_oper}.
	 * @param ctx the parse tree
	 */
	void enterBinary_oper(TLParser.Binary_operContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#binary_oper}.
	 * @param ctx the parse tree
	 */
	void exitBinary_oper(TLParser.Binary_operContext ctx);
}