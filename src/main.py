import antlr4
from gen.PamLexer import PamLexer
from gen.PamParser import PamParser

from gen.PamVisitor import PamVisitor


def main():
    code = open('input.txt', 'r').read()
    lexer = PamLexer(antlr4.InputStream(code))
    stream = antlr4.CommonTokenStream(lexer)
    parser = PamParser(stream)

    tree = parser.progr()
    visitor = PamVisitor()
    visitor.visit(tree)


if __name__ == '__main__':
    main()