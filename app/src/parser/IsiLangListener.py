# Generated from IsiLang.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .IsiLangParser import IsiLangParser
else:
    from IsiLangParser import IsiLangParser
 

from isiExceptions import IsiSemanticException
from isiSymbol import IsiSymbol
from isiVariable import IsiVariable
from isiSymbolTable import IsiSymbolTable
from isiProgram import IsiProgram, AbstractCommand, ReadCommand, WriteCommand, AttribCommand, DecisionCommand, WhileCommand



# This class defines a complete listener for a parse tree produced by IsiLangParser.
class IsiLangListener(ParseTreeListener):

    # Enter a parse tree produced by IsiLangParser#prog.
    def enterProg(self, ctx:IsiLangParser.ProgContext):
        pass

    # Exit a parse tree produced by IsiLangParser#prog.
    def exitProg(self, ctx:IsiLangParser.ProgContext):
        pass


    # Enter a parse tree produced by IsiLangParser#decl.
    def enterDecl(self, ctx:IsiLangParser.DeclContext):
        pass

    # Exit a parse tree produced by IsiLangParser#decl.
    def exitDecl(self, ctx:IsiLangParser.DeclContext):
        pass


    # Enter a parse tree produced by IsiLangParser#declaravar.
    def enterDeclaravar(self, ctx:IsiLangParser.DeclaravarContext):
        pass

    # Exit a parse tree produced by IsiLangParser#declaravar.
    def exitDeclaravar(self, ctx:IsiLangParser.DeclaravarContext):
        pass


    # Enter a parse tree produced by IsiLangParser#tipo.
    def enterTipo(self, ctx:IsiLangParser.TipoContext):
        pass

    # Exit a parse tree produced by IsiLangParser#tipo.
    def exitTipo(self, ctx:IsiLangParser.TipoContext):
        pass


    # Enter a parse tree produced by IsiLangParser#bloco.
    def enterBloco(self, ctx:IsiLangParser.BlocoContext):
        pass

    # Exit a parse tree produced by IsiLangParser#bloco.
    def exitBloco(self, ctx:IsiLangParser.BlocoContext):
        pass


    # Enter a parse tree produced by IsiLangParser#cmd.
    def enterCmd(self, ctx:IsiLangParser.CmdContext):
        pass

    # Exit a parse tree produced by IsiLangParser#cmd.
    def exitCmd(self, ctx:IsiLangParser.CmdContext):
        pass


    # Enter a parse tree produced by IsiLangParser#cmdleitura.
    def enterCmdleitura(self, ctx:IsiLangParser.CmdleituraContext):
        pass

    # Exit a parse tree produced by IsiLangParser#cmdleitura.
    def exitCmdleitura(self, ctx:IsiLangParser.CmdleituraContext):
        pass


    # Enter a parse tree produced by IsiLangParser#cmdescrita.
    def enterCmdescrita(self, ctx:IsiLangParser.CmdescritaContext):
        pass

    # Exit a parse tree produced by IsiLangParser#cmdescrita.
    def exitCmdescrita(self, ctx:IsiLangParser.CmdescritaContext):
        pass


    # Enter a parse tree produced by IsiLangParser#invalidcmd.
    def enterInvalidcmd(self, ctx:IsiLangParser.InvalidcmdContext):
        pass

    # Exit a parse tree produced by IsiLangParser#invalidcmd.
    def exitInvalidcmd(self, ctx:IsiLangParser.InvalidcmdContext):
        pass


    # Enter a parse tree produced by IsiLangParser#invalidcmdleitura.
    def enterInvalidcmdleitura(self, ctx:IsiLangParser.InvalidcmdleituraContext):
        pass

    # Exit a parse tree produced by IsiLangParser#invalidcmdleitura.
    def exitInvalidcmdleitura(self, ctx:IsiLangParser.InvalidcmdleituraContext):
        pass


    # Enter a parse tree produced by IsiLangParser#invalidcmdselecao.
    def enterInvalidcmdselecao(self, ctx:IsiLangParser.InvalidcmdselecaoContext):
        pass

    # Exit a parse tree produced by IsiLangParser#invalidcmdselecao.
    def exitInvalidcmdselecao(self, ctx:IsiLangParser.InvalidcmdselecaoContext):
        pass


    # Enter a parse tree produced by IsiLangParser#invalidcmdselecaocmdv.
    def enterInvalidcmdselecaocmdv(self, ctx:IsiLangParser.InvalidcmdselecaocmdvContext):
        pass

    # Exit a parse tree produced by IsiLangParser#invalidcmdselecaocmdv.
    def exitInvalidcmdselecaocmdv(self, ctx:IsiLangParser.InvalidcmdselecaocmdvContext):
        pass


    # Enter a parse tree produced by IsiLangParser#invalidcmdselecaocmdf.
    def enterInvalidcmdselecaocmdf(self, ctx:IsiLangParser.InvalidcmdselecaocmdfContext):
        pass

    # Exit a parse tree produced by IsiLangParser#invalidcmdselecaocmdf.
    def exitInvalidcmdselecaocmdf(self, ctx:IsiLangParser.InvalidcmdselecaocmdfContext):
        pass


    # Enter a parse tree produced by IsiLangParser#invalidcmdselecaocond.
    def enterInvalidcmdselecaocond(self, ctx:IsiLangParser.InvalidcmdselecaocondContext):
        pass

    # Exit a parse tree produced by IsiLangParser#invalidcmdselecaocond.
    def exitInvalidcmdselecaocond(self, ctx:IsiLangParser.InvalidcmdselecaocondContext):
        pass


    # Enter a parse tree produced by IsiLangParser#invalidcmdenquanto.
    def enterInvalidcmdenquanto(self, ctx:IsiLangParser.InvalidcmdenquantoContext):
        pass

    # Exit a parse tree produced by IsiLangParser#invalidcmdenquanto.
    def exitInvalidcmdenquanto(self, ctx:IsiLangParser.InvalidcmdenquantoContext):
        pass


    # Enter a parse tree produced by IsiLangParser#invalidcmdenquantocond.
    def enterInvalidcmdenquantocond(self, ctx:IsiLangParser.InvalidcmdenquantocondContext):
        pass

    # Exit a parse tree produced by IsiLangParser#invalidcmdenquantocond.
    def exitInvalidcmdenquantocond(self, ctx:IsiLangParser.InvalidcmdenquantocondContext):
        pass


    # Enter a parse tree produced by IsiLangParser#invalidcmdenquantocmd.
    def enterInvalidcmdenquantocmd(self, ctx:IsiLangParser.InvalidcmdenquantocmdContext):
        pass

    # Exit a parse tree produced by IsiLangParser#invalidcmdenquantocmd.
    def exitInvalidcmdenquantocmd(self, ctx:IsiLangParser.InvalidcmdenquantocmdContext):
        pass


    # Enter a parse tree produced by IsiLangParser#cmdattrib.
    def enterCmdattrib(self, ctx:IsiLangParser.CmdattribContext):
        pass

    # Exit a parse tree produced by IsiLangParser#cmdattrib.
    def exitCmdattrib(self, ctx:IsiLangParser.CmdattribContext):
        pass


    # Enter a parse tree produced by IsiLangParser#cmdselecao.
    def enterCmdselecao(self, ctx:IsiLangParser.CmdselecaoContext):
        pass

    # Exit a parse tree produced by IsiLangParser#cmdselecao.
    def exitCmdselecao(self, ctx:IsiLangParser.CmdselecaoContext):
        pass


    # Enter a parse tree produced by IsiLangParser#cmdenquanto.
    def enterCmdenquanto(self, ctx:IsiLangParser.CmdenquantoContext):
        pass

    # Exit a parse tree produced by IsiLangParser#cmdenquanto.
    def exitCmdenquanto(self, ctx:IsiLangParser.CmdenquantoContext):
        pass


    # Enter a parse tree produced by IsiLangParser#expr.
    def enterExpr(self, ctx:IsiLangParser.ExprContext):
        pass

    # Exit a parse tree produced by IsiLangParser#expr.
    def exitExpr(self, ctx:IsiLangParser.ExprContext):
        pass


    # Enter a parse tree produced by IsiLangParser#termo.
    def enterTermo(self, ctx:IsiLangParser.TermoContext):
        pass

    # Exit a parse tree produced by IsiLangParser#termo.
    def exitTermo(self, ctx:IsiLangParser.TermoContext):
        pass


    # Enter a parse tree produced by IsiLangParser#invalidelse.
    def enterInvalidelse(self, ctx:IsiLangParser.InvalidelseContext):
        pass

    # Exit a parse tree produced by IsiLangParser#invalidelse.
    def exitInvalidelse(self, ctx:IsiLangParser.InvalidelseContext):
        pass


