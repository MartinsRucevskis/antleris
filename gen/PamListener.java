// Generated from C:/Users/marti/PycharmProjects/antleris/src/Pam.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PamParser}.
 */
public interface PamListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PamParser#progr}.
	 * @param ctx the parse tree
	 */
	void enterProgr(PamParser.ProgrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#progr}.
	 * @param ctx the parse tree
	 */
	void exitProgr(PamParser.ProgrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#series}.
	 * @param ctx the parse tree
	 */
	void enterSeries(PamParser.SeriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#series}.
	 * @param ctx the parse tree
	 */
	void exitSeries(PamParser.SeriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PamParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PamParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInput_stmt(PamParser.Input_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInput_stmt(PamParser.Input_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#output_stmt}.
	 * @param ctx the parse tree
	 */
	void enterOutput_stmt(PamParser.Output_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#output_stmt}.
	 * @param ctx the parse tree
	 */
	void exitOutput_stmt(PamParser.Output_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(PamParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(PamParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#cond_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCond_stmt(PamParser.Cond_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#cond_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCond_stmt(PamParser.Cond_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(PamParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(PamParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#logical_weak}.
	 * @param ctx the parse tree
	 */
	void enterLogical_weak(PamParser.Logical_weakContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#logical_weak}.
	 * @param ctx the parse tree
	 */
	void exitLogical_weak(PamParser.Logical_weakContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#logical_strong}.
	 * @param ctx the parse tree
	 */
	void enterLogical_strong(PamParser.Logical_strongContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#logical_strong}.
	 * @param ctx the parse tree
	 */
	void exitLogical_strong(PamParser.Logical_strongContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#logical_strongest}.
	 * @param ctx the parse tree
	 */
	void enterLogical_strongest(PamParser.Logical_strongestContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#logical_strongest}.
	 * @param ctx the parse tree
	 */
	void exitLogical_strongest(PamParser.Logical_strongestContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#compar}.
	 * @param ctx the parse tree
	 */
	void enterCompar(PamParser.ComparContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#compar}.
	 * @param ctx the parse tree
	 */
	void exitCompar(PamParser.ComparContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(PamParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(PamParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PamParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PamParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PamParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PamParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#elem}.
	 * @param ctx the parse tree
	 */
	void enterElem(PamParser.ElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#elem}.
	 * @param ctx the parse tree
	 */
	void exitElem(PamParser.ElemContext ctx);
}