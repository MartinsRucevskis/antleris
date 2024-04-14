# Generated from C:/Users/marti/PycharmProjects/antleris/src/Pam.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .PamParser import PamParser
else:
    from PamParser import PamParser

# This class defines a complete generic visitor for a parse tree produced by PamParser.

class PamVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by PamParser#progr.
    def visitProgr(self, ctx:PamParser.ProgrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PamParser#series.
    def visitSeries(self, ctx:PamParser.SeriesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PamParser#stmt.
    def visitStmt(self, ctx:PamParser.StmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PamParser#input_stmt.
    def visitInput_stmt(self, ctx:PamParser.Input_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PamParser#output_stmt.
    def visitOutput_stmt(self, ctx:PamParser.Output_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PamParser#assign_stmt.
    def visitAssign_stmt(self, ctx:PamParser.Assign_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PamParser#cond_stmt.
    def visitCond_stmt(self, ctx:PamParser.Cond_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PamParser#loop.
    def visitLoop(self, ctx:PamParser.LoopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PamParser#logical_weak.
    def visitLogical_weak(self, ctx:PamParser.Logical_weakContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PamParser#logical_strong.
    def visitLogical_strong(self, ctx:PamParser.Logical_strongContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PamParser#logical_strongest.
    def visitLogical_strongest(self, ctx:PamParser.Logical_strongestContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PamParser#compar.
    def visitCompar(self, ctx:PamParser.ComparContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PamParser#varlist.
    def visitVarlist(self, ctx:PamParser.VarlistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PamParser#expr.
    def visitExpr(self, ctx:PamParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PamParser#term.
    def visitTerm(self, ctx:PamParser.TermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PamParser#elem.
    def visitElem(self, ctx:PamParser.ElemContext):
        return self.visitChildren(ctx)



del PamParser