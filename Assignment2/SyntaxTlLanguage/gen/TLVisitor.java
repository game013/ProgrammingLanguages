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
	 * Visit a parse tree produced by {@link TLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_statement(TLParser.Simple_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#composed_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposed_statement(TLParser.Composed_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#import_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_block(TLParser.Import_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#regular_import}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegular_import(TLParser.Regular_importContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#from_import}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_import(TLParser.From_importContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(TLParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#log_invoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_invoke(TLParser.Log_invokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#method_invoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_invoke(TLParser.Method_invokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(TLParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(TLParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(TLParser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#if_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_header(TLParser.If_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_block(TLParser.If_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#elif_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_header(TLParser.Elif_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#while_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_block(TLParser.While_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#for_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_block(TLParser.For_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TLParser.BlockContext ctx);
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
	 * Visit a parse tree produced by {@link TLParser#simple_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expr(TLParser.Simple_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(TLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(TLParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#array_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_def(TLParser.Array_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#binary_oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_oper(TLParser.Binary_operContext ctx);
}