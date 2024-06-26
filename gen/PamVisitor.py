# Generated from C:/Users/marti/PycharmProjects/antleris/src/Pam.g4 by ANTLR 4.13.1
import re

from antlr4 import *
from gen import *

if "." in __name__:
    from .PamParser import PamParser
else:
    from PamParser import PamParser


# This class defines a complete generic visitor for a parse tree produced by PamParser.

class PamVisitor(ParseTreeVisitor):
    vars = {}
    readVars = 0
    # Visit a parse tree produced by PamParser#progr.
    def visitProgr(self, ctx: PamParser.ProgrContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by PamParser#series.
    def visitSeries(self, ctx: PamParser.SeriesContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by PamParser#stmt.
    def visitStmt(self, ctx: PamParser.StmtContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by PamParser#input_stmt.
    def visitInput_stmt(self, ctx: PamParser.Input_stmtContext):
        varList = self.visitVarlist(ctx.getChild(1))
        input = open('data.txt').read()
        values = input.split(',')
        for varname in varList:
            self.vars[varname] = values[self.readVars]
            self.readVars+=1
        return self.visitChildren(ctx)

    # Visit a parse tree produced by PamParser#output_stmt.
    def visitOutput_stmt(self, ctx: PamParser.Output_stmtContext):
        varlist = self.visitVarlist(ctx.getChild(1))
        for varname in varlist:
            print([varname, ' has value ', self.vars[varname]])

    # Visit a parse tree produced by PamParser#assign_stmt.
    def visitAssign_stmt(self, ctx: PamParser.Assign_stmtContext):
        self.vars[ctx.getChild(0).__str__()] = self.visitExpr(ctx.getChild(2))

    # Visit a parse tree produced by PamParser#cond_stmt.
    def visitCond_stmt(self, ctx: PamParser.Cond_stmtContext):
        if(self.visitLogical_strongest(ctx.getChild(1))):
            self.visitSeries(ctx.getChild(3))
        elif(ctx.getChildCount() > 5):
            self.visitSeries(ctx.getChild(5))

    # Visit a parse tree produced by PamParser#loop.
    def visitLoop(self, ctx: PamParser.LoopContext):
        while self.visitLogical_strongest(ctx.getChild(1)):
            self.visitSeries(ctx.getChild(3))

    # Visit a parse tree produced by PamParser#logical_weak.
    def visitLogical_weak(self, ctx: PamParser.Logical_weakContext):
        result = self.visitCompar(ctx.getChild(ctx.getChildCount()-1))
        if ctx.getChildCount() > 1:
            for i in range(ctx.getChildCount()):
                if i != ctx.getChildCount()-1:
                    result = not result
        return result

    # Visit a parse tree produced by PamParser#logical_strong.
    def visitLogical_strong(self, ctx: PamParser.Logical_strongContext):
        result = self.visitLogical_weak(ctx.getChild(0));
        if ctx.getChildCount() > 1:
            for i in ctx.getChildCount():
                if(i%2 == 0 and i != 0):
                    result = result and self.visitLogical_weak(ctx.getChild(i))
        return result

    # Visit a parse tree produced by PamParser#logical_strongest.
    def visitLogical_strongest(self, ctx: PamParser.Logical_strongestContext):
        result = self.visitLogical_strong(ctx.getChild(0));
        if ctx.getChildCount() > 1:
            for i in ctx.getChildCount():
                if(i%2 == 0 and i != 0):
                    result = result or self.visitLogical_strong(ctx.getChild(i))

        return result

    # Visit a parse tree produced by PamParser#compar.
    def visitCompar(self, ctx: PamParser.ComparContext):
        relation = str(ctx.getChild(1))
        left = self.visitExpr(ctx.getChild(0))
        right = self.visitExpr(ctx.getChild(2))
        result = False

        # for each relation, figure out the result
        if relation == '=':
            result = left == right
        elif relation == '<>':
            result = left != right
        elif relation == '<':
            result = left < right
        elif relation == '>':
            result = left > right
        elif relation == '=<':
            result = left <= right
        elif relation == '>=':
            result = left >= right

        return result

    # Visit a parse tree produced by PamParser#varlist.
    def visitVarlist(self, ctx: PamParser.VarlistContext):
        variableList = []
        for i in range(ctx.getChildCount()):
            if i % 2 == 0:
                variableList.append(str(ctx.getChild(i)))

        return variableList

    # Visit a parse tree produced by PamParser#expr.
    def visitExpr(self, ctx: PamParser.ExprContext):
        expres = ''
        for x in range(ctx.getChildCount()):
            if(x%2 != 0):
                expres+=ctx.getChild(x).__str__()
            else:
                expres+=str(self.visitTerm(ctx.getChild(x)))
        if(expres == ''):
            expres = ctx.__str__()
        return eval(expres)

    # Visit a parse tree produced by PamParser#term.
    def visitTerm(self, ctx: PamParser.TermContext):
        expres = ''
        for x in range(ctx.getChildCount()):
            if(x%2 != 0):
                expres+=ctx.getChild(x).__str__()
            else:
                expres+=str(self.visitElem(ctx.getChild(x)))
        return eval (expres)

    # Visit a parse tree produced by PamParser#elem.
    def visitElem(self, ctx: PamParser.ElemContext):
        number = re.compile("^[1-9]\d*$")
        varName = re.compile("([a-z]|[A-Z]|'_')([a-z]|[A-Z]|[0-9]|'_')*")
        if number.match(ctx.getChild(0).__str__()):
            return ctx.getChild(0).__str__()
        elif varName.match(ctx.getChild(0).__str__()):
            return self.vars[ctx.getChild(0).__str__()];
        else:
            return self.visitExpr(ctx.getChild(0))



del PamParser
