package helper;

// $ANTLR 3.1.1 CMinus.g 2017-04-06 13:24:02

import org.antlr.stringtemplate.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class CMinusParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "FP", "INT", "WS", "';'", "'='", "'['", "']'", "'{'", "','", "'}'", "'('", "')'", "'[]'", "'[][]'", "'unsigned'", "'long'", "'int'", "'char'", "'float'", "'double'", "'return'", "'if'", "'else'", "'for'", "'++'", "'--'", "'+='", "'-='", "'*='", "'/='", "'floor'", "'round'", "'ceil'", "'sin'", "'cos'", "'cosh'", "'exp'", "'tan'", "'tanh'", "'sinh'", "'log'", "'log10'", "'sqrt'", "'pow'", "'abs'", "'&&'", "'||'", "'true'", "'false'", "'=='", "'<'", "'<='", "'>='", "'>'", "'!='", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'<<'", "'>>'", "'f'", "'F'", "'u'", "'U'", "'l'", "'L'", "'ll'", "'LL'", "'lu'", "'Lu'", "'lU'", "'LU'", "'ul'", "'uL'", "'Ul'", "'UL'", "'llu'", "'LLu'", "'llU'", "'LLU'", "'ull'", "'uLL'", "'Ull'", "'ULL'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int ID=4;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__10=10;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int FP=5;
    public static final int INT=6;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int WS=7;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators

    protected static class slist_scope {
        List locals;
        List stats;
    }
    protected Stack slist_stack = new Stack();


        public CMinusParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CMinusParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("CMinusParserTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return CMinusParser.tokenNames; }
    public String getGrammarFileName() { return "CMinus.g"; }


    protected static class program_scope {
        List globals;
        List functions;
    }
    protected Stack program_stack = new Stack();

    public static class program_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "program"
    // CMinus.g:23:1: program : ( declaration )+ -> program(globals=$program::globalsfunctions=$program::functions);
    public final CMinusParser.program_return program() throws RecognitionException {
        program_stack.push(new program_scope());
        CMinusParser.program_return retval = new CMinusParser.program_return();
        retval.start = input.LT(1);


          ((program_scope)program_stack.peek()).globals = new ArrayList();
          ((program_scope)program_stack.peek()).functions = new ArrayList();

        try {
            // CMinus.g:32:5: ( ( declaration )+ -> program(globals=$program::globalsfunctions=$program::functions))
            // CMinus.g:32:9: ( declaration )+
            {
            // CMinus.g:32:9: ( declaration )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||(LA1_0>=19 && LA1_0<=24)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // CMinus.g:0:0: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_program61);
            	    declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);



            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 33:9: -> program(globals=$program::globalsfunctions=$program::functions)
              {
                  retval.st = templateLib.getInstanceOf("program",
                new STAttrMap().put("globals", ((program_scope)program_stack.peek()).globals).put("functions", ((program_scope)program_stack.peek()).functions));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            program_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class declaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "declaration"
    // CMinus.g:36:1: declaration : ( variable | f= function );
    public final CMinusParser.declaration_return declaration() throws RecognitionException {
        CMinusParser.declaration_return retval = new CMinusParser.declaration_return();
        retval.start = input.LT(1);

        CMinusParser.function_return f = null;

        CMinusParser.variable_return variable1 = null;


        try {
            // CMinus.g:37:5: ( variable | f= function )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // CMinus.g:37:9: variable
                    {
                    pushFollow(FOLLOW_variable_in_declaration102);
                    variable1=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      ((program_scope)program_stack.peek()).globals.add((variable1!=null?variable1.st:null));
                    }

                    }
                    break;
                case 2 :
                    // CMinus.g:38:9: f= function
                    {
                    pushFollow(FOLLOW_function_in_declaration118);
                    f=function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      ((program_scope)program_stack.peek()).functions.add((f!=null?f.st:null));
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class variable_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variable"
    // CMinus.g:44:1: variable : ( type declarator ';' -> {$function.size()>0 && $function::name==null}? globalVariable(type=$type.stname=$declarator.st) -> variable(type=$type.stname=$declarator.st) | type declarator '=' expr ';' -> {$function.size()>0 && $function::name==null}? globalVariableInit(type=$type.stname=$declarator.stvalue=$expr.st) -> variableInit(type=$type.stname=$declarator.stvalue=$expr.st) | type declarator '[' aexpr ']' ';' -> {$function.size()>0 && $function::name==null}? globalArrayDeclaration(type=$type.stname=$declarator.stsize=$aexpr.st) -> arrayDeclaration(type=$type.stname=$declarator.stsize=$aexpr.st) | type declarator '[' aexpr ']' '=' arrayinit ';' -> {$function.size()>0 && $function::name==null}? globalArrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsize=$aexpr.st) -> arrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsize=$aexpr.st) | type declarator '[' a= aexpr ']' '[' b= aexpr ']' ';' -> {$function.size()>0 && $function::name==null}? globalDoubleArrayDeclaration(type=$type.stname=$declarator.stsizeone=$a.stsizetwo=$b.st) -> doubleArrayDeclaration(type=$type.stname=$declarator.stsize=$a.stsizetwo=$b.st) | type declarator '[' a= aexpr ']' '[' b= aexpr ']' '=' arrayinit ';' -> {$function.size()>0 && $function::name==null}? globalDoubleArrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsizeone=$a.stsizetwo=$b.st) -> doubleArrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsizeone=$a.stsizetwo=$b.st));
    public final CMinusParser.variable_return variable() throws RecognitionException {
        CMinusParser.variable_return retval = new CMinusParser.variable_return();
        retval.start = input.LT(1);

        CMinusParser.aexpr_return a = null;

        CMinusParser.aexpr_return b = null;

        CMinusParser.type_return type2 = null;

        CMinusParser.declarator_return declarator3 = null;

        CMinusParser.type_return type4 = null;

        CMinusParser.declarator_return declarator5 = null;

        CMinusParser.expr_return expr6 = null;

        CMinusParser.type_return type7 = null;

        CMinusParser.declarator_return declarator8 = null;

        CMinusParser.aexpr_return aexpr9 = null;

        CMinusParser.type_return type10 = null;

        CMinusParser.declarator_return declarator11 = null;

        CMinusParser.arrayinit_return arrayinit12 = null;

        CMinusParser.aexpr_return aexpr13 = null;

        CMinusParser.type_return type14 = null;

        CMinusParser.declarator_return declarator15 = null;

        CMinusParser.type_return type16 = null;

        CMinusParser.declarator_return declarator17 = null;

        CMinusParser.arrayinit_return arrayinit18 = null;


        try {
            // CMinus.g:45:5: ( type declarator ';' -> {$function.size()>0 && $function::name==null}? globalVariable(type=$type.stname=$declarator.st) -> variable(type=$type.stname=$declarator.st) | type declarator '=' expr ';' -> {$function.size()>0 && $function::name==null}? globalVariableInit(type=$type.stname=$declarator.stvalue=$expr.st) -> variableInit(type=$type.stname=$declarator.stvalue=$expr.st) | type declarator '[' aexpr ']' ';' -> {$function.size()>0 && $function::name==null}? globalArrayDeclaration(type=$type.stname=$declarator.stsize=$aexpr.st) -> arrayDeclaration(type=$type.stname=$declarator.stsize=$aexpr.st) | type declarator '[' aexpr ']' '=' arrayinit ';' -> {$function.size()>0 && $function::name==null}? globalArrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsize=$aexpr.st) -> arrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsize=$aexpr.st) | type declarator '[' a= aexpr ']' '[' b= aexpr ']' ';' -> {$function.size()>0 && $function::name==null}? globalDoubleArrayDeclaration(type=$type.stname=$declarator.stsizeone=$a.stsizetwo=$b.st) -> doubleArrayDeclaration(type=$type.stname=$declarator.stsize=$a.stsizetwo=$b.st) | type declarator '[' a= aexpr ']' '[' b= aexpr ']' '=' arrayinit ';' -> {$function.size()>0 && $function::name==null}? globalDoubleArrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsizeone=$a.stsizetwo=$b.st) -> doubleArrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsizeone=$a.stsizetwo=$b.st))
            int alt3=6;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // CMinus.g:45:9: type declarator ';'
                    {
                    pushFollow(FOLLOW_type_in_variable142);
                    type2=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_declarator_in_variable144);
                    declarator3=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_variable146); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 46:9: -> {$function.size()>0 && $function::name==null}? globalVariable(type=$type.stname=$declarator.st)
                      if (function_stack.size()>0 && ((function_scope)function_stack.peek()).name==null) {
                          retval.st = templateLib.getInstanceOf("globalVariable",
                        new STAttrMap().put("type", (type2!=null?type2.st:null)).put("name", (declarator3!=null?declarator3.st:null)));
                      }
                      else // 48:9: -> variable(type=$type.stname=$declarator.st)
                      {
                          retval.st = templateLib.getInstanceOf("variable",
                        new STAttrMap().put("type", (type2!=null?type2.st:null)).put("name", (declarator3!=null?declarator3.st:null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:49:6: type declarator '=' expr ';'
                    {
                    pushFollow(FOLLOW_type_in_variable208);
                    type4=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_declarator_in_variable210);
                    declarator5=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,9,FOLLOW_9_in_variable212); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_variable214);
                    expr6=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_variable216); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 50:6: -> {$function.size()>0 && $function::name==null}? globalVariableInit(type=$type.stname=$declarator.stvalue=$expr.st)
                      if (function_stack.size()>0 && ((function_scope)function_stack.peek()).name==null) {
                          retval.st = templateLib.getInstanceOf("globalVariableInit",
                        new STAttrMap().put("type", (type4!=null?type4.st:null)).put("name", (declarator5!=null?declarator5.st:null)).put("value", (expr6!=null?expr6.st:null)));
                      }
                      else // 52:9: -> variableInit(type=$type.stname=$declarator.stvalue=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("variableInit",
                        new STAttrMap().put("type", (type4!=null?type4.st:null)).put("name", (declarator5!=null?declarator5.st:null)).put("value", (expr6!=null?expr6.st:null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:53:6: type declarator '[' aexpr ']' ';'
                    {
                    pushFollow(FOLLOW_type_in_variable283);
                    type7=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_declarator_in_variable285);
                    declarator8=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,10,FOLLOW_10_in_variable287); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_variable289);
                    aexpr9=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,11,FOLLOW_11_in_variable291); if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_variable293); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 54:6: -> {$function.size()>0 && $function::name==null}? globalArrayDeclaration(type=$type.stname=$declarator.stsize=$aexpr.st)
                      if (function_stack.size()>0 && ((function_scope)function_stack.peek()).name==null) {
                          retval.st = templateLib.getInstanceOf("globalArrayDeclaration",
                        new STAttrMap().put("type", (type7!=null?type7.st:null)).put("name", (declarator8!=null?declarator8.st:null)).put("size", (aexpr9!=null?aexpr9.st:null)));
                      }
                      else // 56:9: -> arrayDeclaration(type=$type.stname=$declarator.stsize=$aexpr.st)
                      {
                          retval.st = templateLib.getInstanceOf("arrayDeclaration",
                        new STAttrMap().put("type", (type7!=null?type7.st:null)).put("name", (declarator8!=null?declarator8.st:null)).put("size", (aexpr9!=null?aexpr9.st:null)));
                      }

                    }
                    }
                    break;
                case 4 :
                    // CMinus.g:57:6: type declarator '[' aexpr ']' '=' arrayinit ';'
                    {
                    pushFollow(FOLLOW_type_in_variable360);
                    type10=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_declarator_in_variable362);
                    declarator11=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,10,FOLLOW_10_in_variable364); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_variable366);
                    aexpr13=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,11,FOLLOW_11_in_variable368); if (state.failed) return retval;
                    match(input,9,FOLLOW_9_in_variable370); if (state.failed) return retval;
                    pushFollow(FOLLOW_arrayinit_in_variable372);
                    arrayinit12=arrayinit();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_variable374); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 58:6: -> {$function.size()>0 && $function::name==null}? globalArrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsize=$aexpr.st)
                      if (function_stack.size()>0 && ((function_scope)function_stack.peek()).name==null) {
                          retval.st = templateLib.getInstanceOf("globalArrayInitialization",
                        new STAttrMap().put("type", (type10!=null?type10.st:null)).put("name", (declarator11!=null?declarator11.st:null)).put("values", (arrayinit12!=null?arrayinit12.st:null)).put("size", (aexpr13!=null?aexpr13.st:null)));
                      }
                      else // 60:9: -> arrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsize=$aexpr.st)
                      {
                          retval.st = templateLib.getInstanceOf("arrayInitialization",
                        new STAttrMap().put("type", (type10!=null?type10.st:null)).put("name", (declarator11!=null?declarator11.st:null)).put("values", (arrayinit12!=null?arrayinit12.st:null)).put("size", (aexpr13!=null?aexpr13.st:null)));
                      }

                    }
                    }
                    break;
                case 5 :
                    // CMinus.g:61:6: type declarator '[' a= aexpr ']' '[' b= aexpr ']' ';'
                    {
                    pushFollow(FOLLOW_type_in_variable449);
                    type14=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_declarator_in_variable451);
                    declarator15=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,10,FOLLOW_10_in_variable453); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_variable457);
                    a=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,11,FOLLOW_11_in_variable459); if (state.failed) return retval;
                    match(input,10,FOLLOW_10_in_variable461); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_variable465);
                    b=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,11,FOLLOW_11_in_variable467); if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_variable469); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 62:6: -> {$function.size()>0 && $function::name==null}? globalDoubleArrayDeclaration(type=$type.stname=$declarator.stsizeone=$a.stsizetwo=$b.st)
                      if (function_stack.size()>0 && ((function_scope)function_stack.peek()).name==null) {
                          retval.st = templateLib.getInstanceOf("globalDoubleArrayDeclaration",
                        new STAttrMap().put("type", (type14!=null?type14.st:null)).put("name", (declarator15!=null?declarator15.st:null)).put("sizeone", (a!=null?a.st:null)).put("sizetwo", (b!=null?b.st:null)));
                      }
                      else // 64:9: -> doubleArrayDeclaration(type=$type.stname=$declarator.stsize=$a.stsizetwo=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("doubleArrayDeclaration",
                        new STAttrMap().put("type", (type14!=null?type14.st:null)).put("name", (declarator15!=null?declarator15.st:null)).put("size", (a!=null?a.st:null)).put("sizetwo", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 6 :
                    // CMinus.g:65:6: type declarator '[' a= aexpr ']' '[' b= aexpr ']' '=' arrayinit ';'
                    {
                    pushFollow(FOLLOW_type_in_variable544);
                    type16=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_declarator_in_variable546);
                    declarator17=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,10,FOLLOW_10_in_variable548); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_variable552);
                    a=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,11,FOLLOW_11_in_variable554); if (state.failed) return retval;
                    match(input,10,FOLLOW_10_in_variable556); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_variable560);
                    b=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,11,FOLLOW_11_in_variable562); if (state.failed) return retval;
                    match(input,9,FOLLOW_9_in_variable564); if (state.failed) return retval;
                    pushFollow(FOLLOW_arrayinit_in_variable566);
                    arrayinit18=arrayinit();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_variable568); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 66:6: -> {$function.size()>0 && $function::name==null}? globalDoubleArrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsizeone=$a.stsizetwo=$b.st)
                      if (function_stack.size()>0 && ((function_scope)function_stack.peek()).name==null) {
                          retval.st = templateLib.getInstanceOf("globalDoubleArrayInitialization",
                        new STAttrMap().put("type", (type16!=null?type16.st:null)).put("name", (declarator17!=null?declarator17.st:null)).put("values", (arrayinit18!=null?arrayinit18.st:null)).put("sizeone", (a!=null?a.st:null)).put("sizetwo", (b!=null?b.st:null)));
                      }
                      else // 68:9: -> doubleArrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsizeone=$a.stsizetwo=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("doubleArrayInitialization",
                        new STAttrMap().put("type", (type16!=null?type16.st:null)).put("name", (declarator17!=null?declarator17.st:null)).put("values", (arrayinit18!=null?arrayinit18.st:null)).put("sizeone", (a!=null?a.st:null)).put("sizetwo", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"

    public static class arrayinit_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arrayinit"
    // CMinus.g:71:1: arrayinit : ( '{' (p+= realnum ( ',' p+= realnum )* )? '}' -> arrayInitializationBody(args=$p) | '{' (p+= arrayinit ( ',' p+= arrayinit )* )? '}' -> arrayInitializationBody(args=$p));
    public final CMinusParser.arrayinit_return arrayinit() throws RecognitionException {
        CMinusParser.arrayinit_return retval = new CMinusParser.arrayinit_return();
        retval.start = input.LT(1);

        List list_p=null;
        RuleReturnScope p = null;
        try {
            // CMinus.g:72:5: ( '{' (p+= realnum ( ',' p+= realnum )* )? '}' -> arrayInitializationBody(args=$p) | '{' (p+= arrayinit ( ',' p+= arrayinit )* )? '}' -> arrayInitializationBody(args=$p))
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                switch ( input.LA(2) ) {
                case FP:
                case INT:
                case 61:
                    {
                    alt8=1;
                    }
                    break;
                case 14:
                    {
                    int LA8_3 = input.LA(3);

                    if ( (synpred10_CMinus()) ) {
                        alt8=1;
                    }
                    else if ( (true) ) {
                        alt8=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 12:
                    {
                    alt8=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // CMinus.g:72:9: '{' (p+= realnum ( ',' p+= realnum )* )? '}'
                    {
                    match(input,12,FOLLOW_12_in_arrayinit664); if (state.failed) return retval;
                    // CMinus.g:72:13: (p+= realnum ( ',' p+= realnum )* )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=FP && LA5_0<=INT)||LA5_0==61) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // CMinus.g:72:15: p+= realnum ( ',' p+= realnum )*
                            {
                            pushFollow(FOLLOW_realnum_in_arrayinit670);
                            p=realnum();

                            state._fsp--;
                            if (state.failed) return retval;
                            if (list_p==null) list_p=new ArrayList();
                            list_p.add(p.getTemplate());

                            // CMinus.g:72:26: ( ',' p+= realnum )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( (LA4_0==13) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // CMinus.g:72:28: ',' p+= realnum
                            	    {
                            	    match(input,13,FOLLOW_13_in_arrayinit674); if (state.failed) return retval;
                            	    pushFollow(FOLLOW_realnum_in_arrayinit678);
                            	    p=realnum();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if (list_p==null) list_p=new ArrayList();
                            	    list_p.add(p.getTemplate());


                            	    }
                            	    break;

                            	default :
                            	    break loop4;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,14,FOLLOW_14_in_arrayinit686); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 72:53: -> arrayInitializationBody(args=$p)
                      {
                          retval.st = templateLib.getInstanceOf("arrayInitializationBody",
                        new STAttrMap().put("args", list_p));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:73:6: '{' (p+= arrayinit ( ',' p+= arrayinit )* )? '}'
                    {
                    match(input,12,FOLLOW_12_in_arrayinit702); if (state.failed) return retval;
                    // CMinus.g:73:10: (p+= arrayinit ( ',' p+= arrayinit )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==12) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // CMinus.g:73:12: p+= arrayinit ( ',' p+= arrayinit )*
                            {
                            pushFollow(FOLLOW_arrayinit_in_arrayinit708);
                            p=arrayinit();

                            state._fsp--;
                            if (state.failed) return retval;
                            if (list_p==null) list_p=new ArrayList();
                            list_p.add(p.getTemplate());

                            // CMinus.g:73:25: ( ',' p+= arrayinit )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==13) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // CMinus.g:73:27: ',' p+= arrayinit
                            	    {
                            	    match(input,13,FOLLOW_13_in_arrayinit712); if (state.failed) return retval;
                            	    pushFollow(FOLLOW_arrayinit_in_arrayinit716);
                            	    p=arrayinit();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if (list_p==null) list_p=new ArrayList();
                            	    list_p.add(p.getTemplate());


                            	    }
                            	    break;

                            	default :
                            	    break loop6;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,14,FOLLOW_14_in_arrayinit724); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 73:54: -> arrayInitializationBody(args=$p)
                      {
                          retval.st = templateLib.getInstanceOf("arrayInitializationBody",
                        new STAttrMap().put("args", list_p));
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayinit"

    public static class declarator_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "declarator"
    // CMinus.g:76:1: declarator : ID -> {new StringTemplate($ID.text)};
    public final CMinusParser.declarator_return declarator() throws RecognitionException {
        CMinusParser.declarator_return retval = new CMinusParser.declarator_return();
        retval.start = input.LT(1);

        Token ID19=null;

        try {
            // CMinus.g:77:5: ( ID -> {new StringTemplate($ID.text)})
            // CMinus.g:77:9: ID
            {
            ID19=(Token)match(input,ID,FOLLOW_ID_in_declarator749); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 77:12: -> {new StringTemplate($ID.text)}
              {
                  retval.st = new StringTemplate((ID19!=null?ID19.getText():null));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declarator"

    protected static class function_scope {
        String name;
    }
    protected Stack function_stack = new Stack();

    public static class function_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "function"
    // CMinus.g:80:1: function : type ID '(' (p+= formalParameter ( ',' p+= formalParameter )* )? ')' block -> function(type=$type.stname=$function::namelocals=$slist::localsstats=$slist::statsargs=$p);
    public final CMinusParser.function_return function() throws RecognitionException {
        slist_stack.push(new slist_scope());
        function_stack.push(new function_scope());
        CMinusParser.function_return retval = new CMinusParser.function_return();
        retval.start = input.LT(1);

        Token ID20=null;
        List list_p=null;
        CMinusParser.type_return type21 = null;

        RuleReturnScope p = null;

          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // CMinus.g:89:5: ( type ID '(' (p+= formalParameter ( ',' p+= formalParameter )* )? ')' block -> function(type=$type.stname=$function::namelocals=$slist::localsstats=$slist::statsargs=$p))
            // CMinus.g:89:9: type ID '(' (p+= formalParameter ( ',' p+= formalParameter )* )? ')' block
            {
            pushFollow(FOLLOW_type_in_function786);
            type21=type();

            state._fsp--;
            if (state.failed) return retval;
            ID20=(Token)match(input,ID,FOLLOW_ID_in_function788); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              ((function_scope)function_stack.peek()).name =(ID20!=null?ID20.getText():null);
            }
            match(input,15,FOLLOW_15_in_function800); if (state.failed) return retval;
            // CMinus.g:90:13: (p+= formalParameter ( ',' p+= formalParameter )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID||(LA10_0>=19 && LA10_0<=24)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // CMinus.g:90:15: p+= formalParameter ( ',' p+= formalParameter )*
                    {
                    pushFollow(FOLLOW_formalParameter_in_function806);
                    p=formalParameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_p==null) list_p=new ArrayList();
                    list_p.add(p.getTemplate());

                    // CMinus.g:90:34: ( ',' p+= formalParameter )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==13) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // CMinus.g:90:36: ',' p+= formalParameter
                    	    {
                    	    match(input,13,FOLLOW_13_in_function810); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_formalParameter_in_function814);
                    	    p=formalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if (list_p==null) list_p=new ArrayList();
                    	    list_p.add(p.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_function822); if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_function832);
            block();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 92:9: -> function(type=$type.stname=$function::namelocals=$slist::localsstats=$slist::statsargs=$p)
              {
                  retval.st = templateLib.getInstanceOf("function",
                new STAttrMap().put("type", (type21!=null?type21.st:null)).put("name", ((function_scope)function_stack.peek()).name).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats).put("args", list_p));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();
            function_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "function"

    public static class formalParameter_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "formalParameter"
    // CMinus.g:98:1: formalParameter : ( type declarator -> parameter(type=$type.stname=$declarator.st) | type declarator '[]' -> arrayparameter(type=$type.stname=$declarator.st) | type declarator '[][]' -> doublearrayparameter(type=$type.stname=$declarator.st));
    public final CMinusParser.formalParameter_return formalParameter() throws RecognitionException {
        CMinusParser.formalParameter_return retval = new CMinusParser.formalParameter_return();
        retval.start = input.LT(1);

        CMinusParser.type_return type22 = null;

        CMinusParser.declarator_return declarator23 = null;

        CMinusParser.type_return type24 = null;

        CMinusParser.declarator_return declarator25 = null;

        CMinusParser.type_return type26 = null;

        CMinusParser.declarator_return declarator27 = null;


        try {
            // CMinus.g:99:5: ( type declarator -> parameter(type=$type.stname=$declarator.st) | type declarator '[]' -> arrayparameter(type=$type.stname=$declarator.st) | type declarator '[][]' -> doublearrayparameter(type=$type.stname=$declarator.st))
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // CMinus.g:99:9: type declarator
                    {
                    pushFollow(FOLLOW_type_in_formalParameter948);
                    type22=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_declarator_in_formalParameter950);
                    declarator23=declarator();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 100:9: -> parameter(type=$type.stname=$declarator.st)
                      {
                          retval.st = templateLib.getInstanceOf("parameter",
                        new STAttrMap().put("type", (type22!=null?type22.st:null)).put("name", (declarator23!=null?declarator23.st:null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:101:6: type declarator '[]'
                    {
                    pushFollow(FOLLOW_type_in_formalParameter979);
                    type24=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_declarator_in_formalParameter981);
                    declarator25=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,17,FOLLOW_17_in_formalParameter983); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 102:6: -> arrayparameter(type=$type.stname=$declarator.st)
                      {
                          retval.st = templateLib.getInstanceOf("arrayparameter",
                        new STAttrMap().put("type", (type24!=null?type24.st:null)).put("name", (declarator25!=null?declarator25.st:null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:103:6: type declarator '[][]'
                    {
                    pushFollow(FOLLOW_type_in_formalParameter1008);
                    type26=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_declarator_in_formalParameter1010);
                    declarator27=declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,18,FOLLOW_18_in_formalParameter1012); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 104:6: -> doublearrayparameter(type=$type.stname=$declarator.st)
                      {
                          retval.st = templateLib.getInstanceOf("doublearrayparameter",
                        new STAttrMap().put("type", (type26!=null?type26.st:null)).put("name", (declarator27!=null?declarator27.st:null)));
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formalParameter"

    public static class type_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "type"
    // CMinus.g:107:1: type : ( 'unsigned' 'long' 'long' 'int' -> type_unsigned_long_long_int() | 'long' 'long' 'int' -> type_long_long_int() | 'unsigned' 'long' -> type_unsigned_long_int() | 'unsigned' 'int' -> type_unsigned_int() | 'int' -> type_int() | 'long' -> type_long_int() | 'char' -> type_char() | 'float' -> type_float() | 'double' -> type_double() | ID -> type_user_object(name=$ID.text));
    public final CMinusParser.type_return type() throws RecognitionException {
        CMinusParser.type_return retval = new CMinusParser.type_return();
        retval.start = input.LT(1);

        Token ID28=null;

        try {
            // CMinus.g:108:2: ( 'unsigned' 'long' 'long' 'int' -> type_unsigned_long_long_int() | 'long' 'long' 'int' -> type_long_long_int() | 'unsigned' 'long' -> type_unsigned_long_int() | 'unsigned' 'int' -> type_unsigned_int() | 'int' -> type_int() | 'long' -> type_long_int() | 'char' -> type_char() | 'float' -> type_float() | 'double' -> type_double() | ID -> type_user_object(name=$ID.text))
            int alt12=10;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // CMinus.g:108:6: 'unsigned' 'long' 'long' 'int'
                    {
                    match(input,19,FOLLOW_19_in_type1046); if (state.failed) return retval;
                    match(input,20,FOLLOW_20_in_type1048); if (state.failed) return retval;
                    match(input,20,FOLLOW_20_in_type1050); if (state.failed) return retval;
                    match(input,21,FOLLOW_21_in_type1052); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 108:37: -> type_unsigned_long_long_int()
                      {
                          retval.st = templateLib.getInstanceOf("type_unsigned_long_long_int");
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:109:6: 'long' 'long' 'int'
                    {
                    match(input,20,FOLLOW_20_in_type1065); if (state.failed) return retval;
                    match(input,20,FOLLOW_20_in_type1067); if (state.failed) return retval;
                    match(input,21,FOLLOW_21_in_type1069); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 109:26: -> type_long_long_int()
                      {
                          retval.st = templateLib.getInstanceOf("type_long_long_int");
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:110:6: 'unsigned' 'long'
                    {
                    match(input,19,FOLLOW_19_in_type1082); if (state.failed) return retval;
                    match(input,20,FOLLOW_20_in_type1084); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 110:24: -> type_unsigned_long_int()
                      {
                          retval.st = templateLib.getInstanceOf("type_unsigned_long_int");
                      }

                    }
                    }
                    break;
                case 4 :
                    // CMinus.g:111:6: 'unsigned' 'int'
                    {
                    match(input,19,FOLLOW_19_in_type1097); if (state.failed) return retval;
                    match(input,21,FOLLOW_21_in_type1099); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 111:23: -> type_unsigned_int()
                      {
                          retval.st = templateLib.getInstanceOf("type_unsigned_int");
                      }

                    }
                    }
                    break;
                case 5 :
                    // CMinus.g:112:6: 'int'
                    {
                    match(input,21,FOLLOW_21_in_type1112); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 112:13: -> type_int()
                      {
                          retval.st = templateLib.getInstanceOf("type_int");
                      }

                    }
                    }
                    break;
                case 6 :
                    // CMinus.g:113:6: 'long'
                    {
                    match(input,20,FOLLOW_20_in_type1126); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 113:13: -> type_long_int()
                      {
                          retval.st = templateLib.getInstanceOf("type_long_int");
                      }

                    }
                    }
                    break;
                case 7 :
                    // CMinus.g:114:9: 'char'
                    {
                    match(input,22,FOLLOW_22_in_type1142); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 114:16: -> type_char()
                      {
                          retval.st = templateLib.getInstanceOf("type_char");
                      }

                    }
                    }
                    break;
                case 8 :
                    // CMinus.g:115:6: 'float'
                    {
                    match(input,23,FOLLOW_23_in_type1155); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 115:14: -> type_float()
                      {
                          retval.st = templateLib.getInstanceOf("type_float");
                      }

                    }
                    }
                    break;
                case 9 :
                    // CMinus.g:116:6: 'double'
                    {
                    match(input,24,FOLLOW_24_in_type1168); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 116:15: -> type_double()
                      {
                          retval.st = templateLib.getInstanceOf("type_double");
                      }

                    }
                    }
                    break;
                case 10 :
                    // CMinus.g:117:9: ID
                    {
                    ID28=(Token)match(input,ID,FOLLOW_ID_in_type1184); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 117:16: -> type_user_object(name=$ID.text)
                      {
                          retval.st = templateLib.getInstanceOf("type_user_object",
                        new STAttrMap().put("name", (ID28!=null?ID28.getText():null)));
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class block_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "block"
    // CMinus.g:120:1: block : '{' ( variable | stat )* '}' ;
    public final CMinusParser.block_return block() throws RecognitionException {
        CMinusParser.block_return retval = new CMinusParser.block_return();
        retval.start = input.LT(1);

        CMinusParser.variable_return variable29 = null;

        CMinusParser.stat_return stat30 = null;


        try {
            // CMinus.g:121:5: ( '{' ( variable | stat )* '}' )
            // CMinus.g:121:8: '{' ( variable | stat )* '}'
            {
            match(input,12,FOLLOW_12_in_block1215); if (state.failed) return retval;
            // CMinus.g:122:8: ( variable | stat )*
            loop13:
            do {
                int alt13=3;
                switch ( input.LA(1) ) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    {
                    alt13=1;
                    }
                    break;
                case ID:
                    {
                    int LA13_3 = input.LA(2);

                    if ( (LA13_3==ID) ) {
                        int LA13_5 = input.LA(3);

                        if ( (LA13_5==15) ) {
                            alt13=2;
                        }
                        else if ( ((LA13_5>=8 && LA13_5<=10)) ) {
                            alt13=1;
                        }


                    }
                    else if ( ((LA13_3>=8 && LA13_3<=10)||LA13_3==15||(LA13_3>=29 && LA13_3<=34)||(LA13_3>=50 && LA13_3<=51)||(LA13_3>=54 && LA13_3<=68)) ) {
                        alt13=2;
                    }


                    }
                    break;
                case FP:
                case INT:
                case 8:
                case 12:
                case 15:
                case 25:
                case 26:
                case 27:
                case 28:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 52:
                case 53:
                case 61:
                    {
                    alt13=2;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // CMinus.g:122:10: variable
            	    {
            	    pushFollow(FOLLOW_variable_in_block1226);
            	    variable29=variable();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	      ((slist_scope)slist_stack.peek()).locals.add((variable29!=null?variable29.st:null));
            	    }

            	    }
            	    break;
            	case 2 :
            	    // CMinus.g:122:57: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_block1232);
            	    stat30=stat();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	      ((slist_scope)slist_stack.peek()).stats.add((stat30!=null?stat30.st:null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_block1245); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class stat_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "stat"
    // CMinus.g:127:1: stat : ( forStat -> {$forStat.st} | constructExpr ';' -> {$constructExpr.st} | assignStat ';' -> valueWithSemicolon(value=$assignStat.st) | ifStat -> {$ifStat.st} | elseStat -> {$elseStat.st} | expr ';' -> statement(expr=$expr.st) | block -> statementList(locals=$slist::localsstats=$slist::stats) | 'return' expr ';' -> return(expr=$expr.st) | ';' -> {new StringTemplate(\";\")});
    public final CMinusParser.stat_return stat() throws RecognitionException {
        slist_stack.push(new slist_scope());

        CMinusParser.stat_return retval = new CMinusParser.stat_return();
        retval.start = input.LT(1);

        CMinusParser.forStat_return forStat31 = null;

        CMinusParser.constructExpr_return constructExpr32 = null;

        CMinusParser.assignStat_return assignStat33 = null;

        CMinusParser.ifStat_return ifStat34 = null;

        CMinusParser.elseStat_return elseStat35 = null;

        CMinusParser.expr_return expr36 = null;

        CMinusParser.expr_return expr37 = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // CMinus.g:133:5: ( forStat -> {$forStat.st} | constructExpr ';' -> {$constructExpr.st} | assignStat ';' -> valueWithSemicolon(value=$assignStat.st) | ifStat -> {$ifStat.st} | elseStat -> {$elseStat.st} | expr ';' -> statement(expr=$expr.st) | block -> statementList(locals=$slist::localsstats=$slist::stats) | 'return' expr ';' -> return(expr=$expr.st) | ';' -> {new StringTemplate(\";\")})
            int alt14=9;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // CMinus.g:133:7: forStat
                    {
                    pushFollow(FOLLOW_forStat_in_stat1274);
                    forStat31=forStat();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 133:15: -> {$forStat.st}
                      {
                          retval.st = (forStat31!=null?forStat31.st:null);
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:134:4: constructExpr ';'
                    {
                    pushFollow(FOLLOW_constructExpr_in_stat1283);
                    constructExpr32=constructExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_stat1285); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 134:22: -> {$constructExpr.st}
                      {
                          retval.st = (constructExpr32!=null?constructExpr32.st:null);
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:135:4: assignStat ';'
                    {
                    pushFollow(FOLLOW_assignStat_in_stat1294);
                    assignStat33=assignStat();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_stat1296); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 135:19: -> valueWithSemicolon(value=$assignStat.st)
                      {
                          retval.st = templateLib.getInstanceOf("valueWithSemicolon",
                        new STAttrMap().put("value", (assignStat33!=null?assignStat33.st:null)));
                      }

                    }
                    }
                    break;
                case 4 :
                    // CMinus.g:136:4: ifStat
                    {
                    pushFollow(FOLLOW_ifStat_in_stat1310);
                    ifStat34=ifStat();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 136:11: -> {$ifStat.st}
                      {
                          retval.st = (ifStat34!=null?ifStat34.st:null);
                      }

                    }
                    }
                    break;
                case 5 :
                    // CMinus.g:137:4: elseStat
                    {
                    pushFollow(FOLLOW_elseStat_in_stat1319);
                    elseStat35=elseStat();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 137:13: -> {$elseStat.st}
                      {
                          retval.st = (elseStat35!=null?elseStat35.st:null);
                      }

                    }
                    }
                    break;
                case 6 :
                    // CMinus.g:138:7: expr ';'
                    {
                    pushFollow(FOLLOW_expr_in_stat1331);
                    expr36=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_stat1333); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 138:16: -> statement(expr=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("statement",
                        new STAttrMap().put("expr", (expr36!=null?expr36.st:null)));
                      }

                    }
                    }
                    break;
                case 7 :
                    // CMinus.g:139:7: block
                    {
                    pushFollow(FOLLOW_block_in_stat1350);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 139:13: -> statementList(locals=$slist::localsstats=$slist::stats)
                      {
                          retval.st = templateLib.getInstanceOf("statementList",
                        new STAttrMap().put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
                      }

                    }
                    }
                    break;
                case 8 :
                    // CMinus.g:140:4: 'return' expr ';'
                    {
                    match(input,25,FOLLOW_25_in_stat1369); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_stat1371);
                    expr37=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,8,FOLLOW_8_in_stat1373); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 140:22: -> return(expr=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("return",
                        new STAttrMap().put("expr", (expr37!=null?expr37.st:null)));
                      }

                    }
                    }
                    break;
                case 9 :
                    // CMinus.g:141:7: ';'
                    {
                    match(input,8,FOLLOW_8_in_stat1390); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 141:11: -> {new StringTemplate(\";\")}
                      {
                          retval.st = new StringTemplate(";");
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "stat"

    public static class ifStat_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ifStat"
    // CMinus.g:144:1: ifStat : 'if' '(' e= condExpr ')' block -> ifBlock(e=$e.stlocals=$slist::localsstats=$slist::stats);
    public final CMinusParser.ifStat_return ifStat() throws RecognitionException {
        slist_stack.push(new slist_scope());

        CMinusParser.ifStat_return retval = new CMinusParser.ifStat_return();
        retval.start = input.LT(1);

        CMinusParser.condExpr_return e = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // CMinus.g:150:5: ( 'if' '(' e= condExpr ')' block -> ifBlock(e=$e.stlocals=$slist::localsstats=$slist::stats))
            // CMinus.g:150:9: 'if' '(' e= condExpr ')' block
            {
            match(input,26,FOLLOW_26_in_ifStat1424); if (state.failed) return retval;
            match(input,15,FOLLOW_15_in_ifStat1426); if (state.failed) return retval;
            pushFollow(FOLLOW_condExpr_in_ifStat1430);
            e=condExpr();

            state._fsp--;
            if (state.failed) return retval;
            match(input,16,FOLLOW_16_in_ifStat1432); if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_ifStat1434);
            block();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 151:9: -> ifBlock(e=$e.stlocals=$slist::localsstats=$slist::stats)
              {
                  retval.st = templateLib.getInstanceOf("ifBlock",
                new STAttrMap().put("e", (e!=null?e.st:null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "ifStat"

    public static class elseStat_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "elseStat"
    // CMinus.g:155:1: elseStat : 'else' block -> elseBlock(locals=$slist::localsstats=$slist::stats);
    public final CMinusParser.elseStat_return elseStat() throws RecognitionException {
        slist_stack.push(new slist_scope());

        CMinusParser.elseStat_return retval = new CMinusParser.elseStat_return();
        retval.start = input.LT(1);


          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // CMinus.g:161:5: ( 'else' block -> elseBlock(locals=$slist::localsstats=$slist::stats))
            // CMinus.g:161:9: 'else' block
            {
            match(input,27,FOLLOW_27_in_elseStat1510); if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_elseStat1512);
            block();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 162:9: -> elseBlock(locals=$slist::localsstats=$slist::stats)
              {
                  retval.st = templateLib.getInstanceOf("elseBlock",
                new STAttrMap().put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "elseStat"

    public static class forStat_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "forStat"
    // CMinus.g:165:1: forStat : 'for' '(' e1= assignStat ';' e2= expr ';' e3= assignStat ')' block -> forLoop(e1=$e1.ste2=$e2.ste3=$e3.stlocals=$slist::localsstats=$slist::stats);
    public final CMinusParser.forStat_return forStat() throws RecognitionException {
        slist_stack.push(new slist_scope());

        CMinusParser.forStat_return retval = new CMinusParser.forStat_return();
        retval.start = input.LT(1);

        CMinusParser.assignStat_return e1 = null;

        CMinusParser.expr_return e2 = null;

        CMinusParser.assignStat_return e3 = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // CMinus.g:171:5: ( 'for' '(' e1= assignStat ';' e2= expr ';' e3= assignStat ')' block -> forLoop(e1=$e1.ste2=$e2.ste3=$e3.stlocals=$slist::localsstats=$slist::stats))
            // CMinus.g:171:9: 'for' '(' e1= assignStat ';' e2= expr ';' e3= assignStat ')' block
            {
            match(input,28,FOLLOW_28_in_forStat1563); if (state.failed) return retval;
            match(input,15,FOLLOW_15_in_forStat1565); if (state.failed) return retval;
            pushFollow(FOLLOW_assignStat_in_forStat1569);
            e1=assignStat();

            state._fsp--;
            if (state.failed) return retval;
            match(input,8,FOLLOW_8_in_forStat1571); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_forStat1575);
            e2=expr();

            state._fsp--;
            if (state.failed) return retval;
            match(input,8,FOLLOW_8_in_forStat1577); if (state.failed) return retval;
            pushFollow(FOLLOW_assignStat_in_forStat1581);
            e3=assignStat();

            state._fsp--;
            if (state.failed) return retval;
            match(input,16,FOLLOW_16_in_forStat1583); if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_forStat1585);
            block();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 172:9: -> forLoop(e1=$e1.ste2=$e2.ste3=$e3.stlocals=$slist::localsstats=$slist::stats)
              {
                  retval.st = templateLib.getInstanceOf("forLoop",
                new STAttrMap().put("e1", (e1!=null?e1.st:null)).put("e2", (e2!=null?e2.st:null)).put("e3", (e3!=null?e3.st:null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "forStat"

    public static class assignStat_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignStat"
    // CMinus.g:176:1: assignStat : (e1= expr '=' e2= expr -> assign(lhs=$e1.strhs=$e2.st) | expr '++' -> inkrement(e=$expr.st) | expr '--' -> dekrement(e=$expr.st) | e1= expr '+=' e2= expr -> inkrementby(lhs=$e1.strhs=$e2.st) | e1= expr '-=' e2= expr -> dekrementby(lhs=$e1.strhs=$e2.st) | e1= expr '*=' e2= expr -> assignmultiply(lhs=$e1.strhs=$e2.st) | e1= expr '/=' e2= expr -> assigndivide(lhs=$e1.strhs=$e2.st));
    public final CMinusParser.assignStat_return assignStat() throws RecognitionException {
        CMinusParser.assignStat_return retval = new CMinusParser.assignStat_return();
        retval.start = input.LT(1);

        CMinusParser.expr_return e1 = null;

        CMinusParser.expr_return e2 = null;

        CMinusParser.expr_return expr38 = null;

        CMinusParser.expr_return expr39 = null;


        try {
            // CMinus.g:177:2: (e1= expr '=' e2= expr -> assign(lhs=$e1.strhs=$e2.st) | expr '++' -> inkrement(e=$expr.st) | expr '--' -> dekrement(e=$expr.st) | e1= expr '+=' e2= expr -> inkrementby(lhs=$e1.strhs=$e2.st) | e1= expr '-=' e2= expr -> dekrementby(lhs=$e1.strhs=$e2.st) | e1= expr '*=' e2= expr -> assignmultiply(lhs=$e1.strhs=$e2.st) | e1= expr '/=' e2= expr -> assigndivide(lhs=$e1.strhs=$e2.st))
            int alt15=7;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // CMinus.g:177:6: e1= expr '=' e2= expr
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1657);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,9,FOLLOW_9_in_assignStat1659); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignStat1663);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 177:26: -> assign(lhs=$e1.strhs=$e2.st)
                      {
                          retval.st = templateLib.getInstanceOf("assign",
                        new STAttrMap().put("lhs", (e1!=null?e1.st:null)).put("rhs", (e2!=null?e2.st:null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:178:6: expr '++'
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1684);
                    expr38=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,29,FOLLOW_29_in_assignStat1686); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 178:16: -> inkrement(e=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("inkrement",
                        new STAttrMap().put("e", (expr38!=null?expr38.st:null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:179:6: expr '--'
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1702);
                    expr39=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,30,FOLLOW_30_in_assignStat1704); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 179:16: -> dekrement(e=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("dekrement",
                        new STAttrMap().put("e", (expr39!=null?expr39.st:null)));
                      }

                    }
                    }
                    break;
                case 4 :
                    // CMinus.g:180:6: e1= expr '+=' e2= expr
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1722);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,31,FOLLOW_31_in_assignStat1724); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignStat1728);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 180:27: -> inkrementby(lhs=$e1.strhs=$e2.st)
                      {
                          retval.st = templateLib.getInstanceOf("inkrementby",
                        new STAttrMap().put("lhs", (e1!=null?e1.st:null)).put("rhs", (e2!=null?e2.st:null)));
                      }

                    }
                    }
                    break;
                case 5 :
                    // CMinus.g:181:6: e1= expr '-=' e2= expr
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1751);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,32,FOLLOW_32_in_assignStat1753); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignStat1757);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 181:27: -> dekrementby(lhs=$e1.strhs=$e2.st)
                      {
                          retval.st = templateLib.getInstanceOf("dekrementby",
                        new STAttrMap().put("lhs", (e1!=null?e1.st:null)).put("rhs", (e2!=null?e2.st:null)));
                      }

                    }
                    }
                    break;
                case 6 :
                    // CMinus.g:182:6: e1= expr '*=' e2= expr
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1780);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,33,FOLLOW_33_in_assignStat1782); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignStat1786);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 182:27: -> assignmultiply(lhs=$e1.strhs=$e2.st)
                      {
                          retval.st = templateLib.getInstanceOf("assignmultiply",
                        new STAttrMap().put("lhs", (e1!=null?e1.st:null)).put("rhs", (e2!=null?e2.st:null)));
                      }

                    }
                    }
                    break;
                case 7 :
                    // CMinus.g:183:6: e1= expr '/=' e2= expr
                    {
                    pushFollow(FOLLOW_expr_in_assignStat1809);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,34,FOLLOW_34_in_assignStat1811); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignStat1815);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 183:27: -> assigndivide(lhs=$e1.strhs=$e2.st)
                      {
                          retval.st = templateLib.getInstanceOf("assigndivide",
                        new STAttrMap().put("lhs", (e1!=null?e1.st:null)).put("rhs", (e2!=null?e2.st:null)));
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignStat"

    public static class expr_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr"
    // CMinus.g:186:1: expr : ( condExpr -> {$condExpr.st} | aexpr -> {$aexpr.st} | arrayinit -> {$arrayinit.st});
    public final CMinusParser.expr_return expr() throws RecognitionException {
        CMinusParser.expr_return retval = new CMinusParser.expr_return();
        retval.start = input.LT(1);

        CMinusParser.condExpr_return condExpr40 = null;

        CMinusParser.aexpr_return aexpr41 = null;

        CMinusParser.arrayinit_return arrayinit42 = null;


        try {
            // CMinus.g:186:5: ( condExpr -> {$condExpr.st} | aexpr -> {$aexpr.st} | arrayinit -> {$arrayinit.st})
            int alt16=3;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // CMinus.g:186:9: condExpr
                    {
                    pushFollow(FOLLOW_condExpr_in_expr1843);
                    condExpr40=condExpr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 186:18: -> {$condExpr.st}
                      {
                          retval.st = (condExpr40!=null?condExpr40.st:null);
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:187:6: aexpr
                    {
                    pushFollow(FOLLOW_aexpr_in_expr1854);
                    aexpr41=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 187:12: -> {$aexpr.st}
                      {
                          retval.st = (aexpr41!=null?aexpr41.st:null);
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:188:6: arrayinit
                    {
                    pushFollow(FOLLOW_arrayinit_in_expr1865);
                    arrayinit42=arrayinit();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 188:16: -> {$arrayinit.st}
                      {
                          retval.st = (arrayinit42!=null?arrayinit42.st:null);
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class arrayexpr_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arrayexpr"
    // CMinus.g:191:1: arrayexpr : ID ( '[' p+= aexpr ']' )+ -> array(name=$ID.textindices=$p);
    public final CMinusParser.arrayexpr_return arrayexpr() throws RecognitionException {
        CMinusParser.arrayexpr_return retval = new CMinusParser.arrayexpr_return();
        retval.start = input.LT(1);

        Token ID43=null;
        List list_p=null;
        RuleReturnScope p = null;
        try {
            // CMinus.g:192:2: ( ID ( '[' p+= aexpr ']' )+ -> array(name=$ID.textindices=$p))
            // CMinus.g:192:6: ID ( '[' p+= aexpr ']' )+
            {
            ID43=(Token)match(input,ID,FOLLOW_ID_in_arrayexpr1886); if (state.failed) return retval;
            // CMinus.g:192:9: ( '[' p+= aexpr ']' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==10) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // CMinus.g:192:10: '[' p+= aexpr ']'
            	    {
            	    match(input,10,FOLLOW_10_in_arrayexpr1889); if (state.failed) return retval;
            	    pushFollow(FOLLOW_aexpr_in_arrayexpr1893);
            	    p=aexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_p==null) list_p=new ArrayList();
            	    list_p.add(p.getTemplate());

            	    match(input,11,FOLLOW_11_in_arrayexpr1895); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);



            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 192:29: -> array(name=$ID.textindices=$p)
              {
                  retval.st = templateLib.getInstanceOf("array",
                new STAttrMap().put("name", (ID43!=null?ID43.getText():null)).put("indices", list_p));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayexpr"

    public static class funcexpr_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "funcexpr"
    // CMinus.g:195:1: funcexpr : ( enumeratedFunction -> {$enumeratedFunction.st} | ID '(' (p+= aexpr ( ',' p+= aexpr )* )? ')' -> funcinstance(name=$ID.textargs=$p));
    public final CMinusParser.funcexpr_return funcexpr() throws RecognitionException {
        CMinusParser.funcexpr_return retval = new CMinusParser.funcexpr_return();
        retval.start = input.LT(1);

        Token ID45=null;
        List list_p=null;
        CMinusParser.enumeratedFunction_return enumeratedFunction44 = null;

        RuleReturnScope p = null;
        try {
            // CMinus.g:196:2: ( enumeratedFunction -> {$enumeratedFunction.st} | ID '(' (p+= aexpr ( ',' p+= aexpr )* )? ')' -> funcinstance(name=$ID.textargs=$p))
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=35 && LA20_0<=49)) ) {
                alt20=1;
            }
            else if ( (LA20_0==ID) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // CMinus.g:196:4: enumeratedFunction
                    {
                    pushFollow(FOLLOW_enumeratedFunction_in_funcexpr1922);
                    enumeratedFunction44=enumeratedFunction();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 196:23: -> {$enumeratedFunction.st}
                      {
                          retval.st = (enumeratedFunction44!=null?enumeratedFunction44.st:null);
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:197:9: ID '(' (p+= aexpr ( ',' p+= aexpr )* )? ')'
                    {
                    ID45=(Token)match(input,ID,FOLLOW_ID_in_funcexpr1936); if (state.failed) return retval;
                    match(input,15,FOLLOW_15_in_funcexpr1938); if (state.failed) return retval;
                    // CMinus.g:197:16: (p+= aexpr ( ',' p+= aexpr )* )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=ID && LA19_0<=INT)||LA19_0==15||(LA19_0>=35 && LA19_0<=49)||LA19_0==61) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // CMinus.g:197:18: p+= aexpr ( ',' p+= aexpr )*
                            {
                            pushFollow(FOLLOW_aexpr_in_funcexpr1944);
                            p=aexpr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if (list_p==null) list_p=new ArrayList();
                            list_p.add(p.getTemplate());

                            // CMinus.g:197:27: ( ',' p+= aexpr )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==13) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // CMinus.g:197:29: ',' p+= aexpr
                            	    {
                            	    match(input,13,FOLLOW_13_in_funcexpr1948); if (state.failed) return retval;
                            	    pushFollow(FOLLOW_aexpr_in_funcexpr1952);
                            	    p=aexpr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if (list_p==null) list_p=new ArrayList();
                            	    list_p.add(p.getTemplate());


                            	    }
                            	    break;

                            	default :
                            	    break loop18;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,16,FOLLOW_16_in_funcexpr1960); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 197:52: -> funcinstance(name=$ID.textargs=$p)
                      {
                          retval.st = templateLib.getInstanceOf("funcinstance",
                        new STAttrMap().put("name", (ID45!=null?ID45.getText():null)).put("args", list_p));
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "funcexpr"

    public static class enumeratedFunction_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "enumeratedFunction"
    // CMinus.g:200:1: enumeratedFunction : ( 'floor' '(' aexpr ')' -> floor_function(argument=$aexpr.st) | 'round' '(' aexpr ')' -> round_function(argument=$aexpr.st) | 'ceil' '(' aexpr ')' -> ceil_function(argument=$aexpr.st) | 'sin' '(' aexpr ')' -> sin_function(argument=$aexpr.st) | 'cos' '(' aexpr ')' -> cos_function(argument=$aexpr.st) | 'cosh' '(' aexpr ')' -> cosh_function(argument=$aexpr.st) | 'exp' '(' aexpr ')' -> exp_function(argument=$aexpr.st) | 'tan' '(' aexpr ')' -> tan_function(argument=$aexpr.st) | 'tanh' '(' aexpr ')' -> tanh_function(argument=$aexpr.st) | 'sinh' '(' aexpr ')' -> sinh_function(argument=$aexpr.st) | 'log' '(' aexpr ')' -> log_function(argument=$aexpr.st) | 'log10' '(' aexpr ')' -> log10_function(argument=$aexpr.st) | 'sqrt' '(' aexpr ')' -> sqrt_function(argument=$aexpr.st) | 'pow' '(' base= aexpr ',' exponent= aexpr ')' -> pow_function(base=$base.stexponent=$exponent.st) | 'abs' '(' aexpr ')' -> abs_function(argument=$aexpr.st));
    public final CMinusParser.enumeratedFunction_return enumeratedFunction() throws RecognitionException {
        CMinusParser.enumeratedFunction_return retval = new CMinusParser.enumeratedFunction_return();
        retval.start = input.LT(1);

        CMinusParser.aexpr_return base = null;

        CMinusParser.aexpr_return exponent = null;

        CMinusParser.aexpr_return aexpr46 = null;

        CMinusParser.aexpr_return aexpr47 = null;

        CMinusParser.aexpr_return aexpr48 = null;

        CMinusParser.aexpr_return aexpr49 = null;

        CMinusParser.aexpr_return aexpr50 = null;

        CMinusParser.aexpr_return aexpr51 = null;

        CMinusParser.aexpr_return aexpr52 = null;

        CMinusParser.aexpr_return aexpr53 = null;

        CMinusParser.aexpr_return aexpr54 = null;

        CMinusParser.aexpr_return aexpr55 = null;

        CMinusParser.aexpr_return aexpr56 = null;

        CMinusParser.aexpr_return aexpr57 = null;

        CMinusParser.aexpr_return aexpr58 = null;

        CMinusParser.aexpr_return aexpr59 = null;


        try {
            // CMinus.g:201:2: ( 'floor' '(' aexpr ')' -> floor_function(argument=$aexpr.st) | 'round' '(' aexpr ')' -> round_function(argument=$aexpr.st) | 'ceil' '(' aexpr ')' -> ceil_function(argument=$aexpr.st) | 'sin' '(' aexpr ')' -> sin_function(argument=$aexpr.st) | 'cos' '(' aexpr ')' -> cos_function(argument=$aexpr.st) | 'cosh' '(' aexpr ')' -> cosh_function(argument=$aexpr.st) | 'exp' '(' aexpr ')' -> exp_function(argument=$aexpr.st) | 'tan' '(' aexpr ')' -> tan_function(argument=$aexpr.st) | 'tanh' '(' aexpr ')' -> tanh_function(argument=$aexpr.st) | 'sinh' '(' aexpr ')' -> sinh_function(argument=$aexpr.st) | 'log' '(' aexpr ')' -> log_function(argument=$aexpr.st) | 'log10' '(' aexpr ')' -> log10_function(argument=$aexpr.st) | 'sqrt' '(' aexpr ')' -> sqrt_function(argument=$aexpr.st) | 'pow' '(' base= aexpr ',' exponent= aexpr ')' -> pow_function(base=$base.stexponent=$exponent.st) | 'abs' '(' aexpr ')' -> abs_function(argument=$aexpr.st))
            int alt21=15;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt21=1;
                }
                break;
            case 36:
                {
                alt21=2;
                }
                break;
            case 37:
                {
                alt21=3;
                }
                break;
            case 38:
                {
                alt21=4;
                }
                break;
            case 39:
                {
                alt21=5;
                }
                break;
            case 40:
                {
                alt21=6;
                }
                break;
            case 41:
                {
                alt21=7;
                }
                break;
            case 42:
                {
                alt21=8;
                }
                break;
            case 43:
                {
                alt21=9;
                }
                break;
            case 44:
                {
                alt21=10;
                }
                break;
            case 45:
                {
                alt21=11;
                }
                break;
            case 46:
                {
                alt21=12;
                }
                break;
            case 47:
                {
                alt21=13;
                }
                break;
            case 48:
                {
                alt21=14;
                }
                break;
            case 49:
                {
                alt21=15;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // CMinus.g:201:4: 'floor' '(' aexpr ')'
                    {
                    match(input,35,FOLLOW_35_in_enumeratedFunction1985); if (state.failed) return retval;
                    match(input,15,FOLLOW_15_in_enumeratedFunction1987); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_enumeratedFunction1989);
                    aexpr46=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,16,FOLLOW_16_in_enumeratedFunction1991); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 201:26: -> floor_function(argument=$aexpr.st)
                      {
                          retval.st = templateLib.getInstanceOf("floor_function",
                        new STAttrMap().put("argument", (aexpr46!=null?aexpr46.st:null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:202:4: 'round' '(' aexpr ')'
                    {
                    match(input,36,FOLLOW_36_in_enumeratedFunction2005); if (state.failed) return retval;
                    match(input,15,FOLLOW_15_in_enumeratedFunction2007); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_enumeratedFunction2009);
                    aexpr47=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,16,FOLLOW_16_in_enumeratedFunction2011); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 202:26: -> round_function(argument=$aexpr.st)
                      {
                          retval.st = templateLib.getInstanceOf("round_function",
                        new STAttrMap().put("argument", (aexpr47!=null?aexpr47.st:null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:203:4: 'ceil' '(' aexpr ')'
                    {
                    match(input,37,FOLLOW_37_in_enumeratedFunction2025); if (state.failed) return retval;
                    match(input,15,FOLLOW_15_in_enumeratedFunction2027); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_enumeratedFunction2029);
                    aexpr48=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,16,FOLLOW_16_in_enumeratedFunction2031); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 203:25: -> ceil_function(argument=$aexpr.st)
                      {
                          retval.st = templateLib.getInstanceOf("ceil_function",
                        new STAttrMap().put("argument", (aexpr48!=null?aexpr48.st:null)));
                      }

                    }
                    }
                    break;
                case 4 :
                    // CMinus.g:204:4: 'sin' '(' aexpr ')'
                    {
                    match(input,38,FOLLOW_38_in_enumeratedFunction2045); if (state.failed) return retval;
                    match(input,15,FOLLOW_15_in_enumeratedFunction2047); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_enumeratedFunction2049);
                    aexpr49=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,16,FOLLOW_16_in_enumeratedFunction2051); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 204:24: -> sin_function(argument=$aexpr.st)
                      {
                          retval.st = templateLib.getInstanceOf("sin_function",
                        new STAttrMap().put("argument", (aexpr49!=null?aexpr49.st:null)));
                      }

                    }
                    }
                    break;
                case 5 :
                    // CMinus.g:205:4: 'cos' '(' aexpr ')'
                    {
                    match(input,39,FOLLOW_39_in_enumeratedFunction2065); if (state.failed) return retval;
                    match(input,15,FOLLOW_15_in_enumeratedFunction2067); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_enumeratedFunction2069);
                    aexpr50=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,16,FOLLOW_16_in_enumeratedFunction2071); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 205:24: -> cos_function(argument=$aexpr.st)
                      {
                          retval.st = templateLib.getInstanceOf("cos_function",
                        new STAttrMap().put("argument", (aexpr50!=null?aexpr50.st:null)));
                      }

                    }
                    }
                    break;
                case 6 :
                    // CMinus.g:206:4: 'cosh' '(' aexpr ')'
                    {
                    match(input,40,FOLLOW_40_in_enumeratedFunction2085); if (state.failed) return retval;
                    match(input,15,FOLLOW_15_in_enumeratedFunction2087); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_enumeratedFunction2089);
                    aexpr51=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,16,FOLLOW_16_in_enumeratedFunction2091); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 206:25: -> cosh_function(argument=$aexpr.st)
                      {
                          retval.st = templateLib.getInstanceOf("cosh_function",
                        new STAttrMap().put("argument", (aexpr51!=null?aexpr51.st:null)));
                      }

                    }
                    }
                    break;
                case 7 :
                    // CMinus.g:207:4: 'exp' '(' aexpr ')'
                    {
                    match(input,41,FOLLOW_41_in_enumeratedFunction2105); if (state.failed) return retval;
                    match(input,15,FOLLOW_15_in_enumeratedFunction2107); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_enumeratedFunction2109);
                    aexpr52=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,16,FOLLOW_16_in_enumeratedFunction2111); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 207:24: -> exp_function(argument=$aexpr.st)
                      {
                          retval.st = templateLib.getInstanceOf("exp_function",
                        new STAttrMap().put("argument", (aexpr52!=null?aexpr52.st:null)));
                      }

                    }
                    }
                    break;
                case 8 :
                    // CMinus.g:208:4: 'tan' '(' aexpr ')'
                    {
                    match(input,42,FOLLOW_42_in_enumeratedFunction2125); if (state.failed) return retval;
                    match(input,15,FOLLOW_15_in_enumeratedFunction2127); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_enumeratedFunction2129);
                    aexpr53=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,16,FOLLOW_16_in_enumeratedFunction2131); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 208:24: -> tan_function(argument=$aexpr.st)
                      {
                          retval.st = templateLib.getInstanceOf("tan_function",
                        new STAttrMap().put("argument", (aexpr53!=null?aexpr53.st:null)));
                      }

                    }
                    }
                    break;
                case 9 :
                    // CMinus.g:209:4: 'tanh' '(' aexpr ')'
                    {
                    match(input,43,FOLLOW_43_in_enumeratedFunction2145); if (state.failed) return retval;
                    match(input,15,FOLLOW_15_in_enumeratedFunction2147); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_enumeratedFunction2149);
                    aexpr54=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,16,FOLLOW_16_in_enumeratedFunction2151); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 209:25: -> tanh_function(argument=$aexpr.st)
                      {
                          retval.st = templateLib.getInstanceOf("tanh_function",
                        new STAttrMap().put("argument", (aexpr54!=null?aexpr54.st:null)));
                      }

                    }
                    }
                    break;
                case 10 :
                    // CMinus.g:210:4: 'sinh' '(' aexpr ')'
                    {
                    match(input,44,FOLLOW_44_in_enumeratedFunction2165); if (state.failed) return retval;
                    match(input,15,FOLLOW_15_in_enumeratedFunction2167); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_enumeratedFunction2169);
                    aexpr55=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,16,FOLLOW_16_in_enumeratedFunction2171); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 210:25: -> sinh_function(argument=$aexpr.st)
                      {
                          retval.st = templateLib.getInstanceOf("sinh_function",
                        new STAttrMap().put("argument", (aexpr55!=null?aexpr55.st:null)));
                      }

                    }
                    }
                    break;
                case 11 :
                    // CMinus.g:211:4: 'log' '(' aexpr ')'
                    {
                    match(input,45,FOLLOW_45_in_enumeratedFunction2185); if (state.failed) return retval;
                    match(input,15,FOLLOW_15_in_enumeratedFunction2187); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_enumeratedFunction2189);
                    aexpr56=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,16,FOLLOW_16_in_enumeratedFunction2191); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 211:24: -> log_function(argument=$aexpr.st)
                      {
                          retval.st = templateLib.getInstanceOf("log_function",
                        new STAttrMap().put("argument", (aexpr56!=null?aexpr56.st:null)));
                      }

                    }
                    }
                    break;
                case 12 :
                    // CMinus.g:212:4: 'log10' '(' aexpr ')'
                    {
                    match(input,46,FOLLOW_46_in_enumeratedFunction2205); if (state.failed) return retval;
                    match(input,15,FOLLOW_15_in_enumeratedFunction2207); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_enumeratedFunction2209);
                    aexpr57=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,16,FOLLOW_16_in_enumeratedFunction2211); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 212:26: -> log10_function(argument=$aexpr.st)
                      {
                          retval.st = templateLib.getInstanceOf("log10_function",
                        new STAttrMap().put("argument", (aexpr57!=null?aexpr57.st:null)));
                      }

                    }
                    }
                    break;
                case 13 :
                    // CMinus.g:213:4: 'sqrt' '(' aexpr ')'
                    {
                    match(input,47,FOLLOW_47_in_enumeratedFunction2225); if (state.failed) return retval;
                    match(input,15,FOLLOW_15_in_enumeratedFunction2227); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_enumeratedFunction2229);
                    aexpr58=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,16,FOLLOW_16_in_enumeratedFunction2231); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 213:25: -> sqrt_function(argument=$aexpr.st)
                      {
                          retval.st = templateLib.getInstanceOf("sqrt_function",
                        new STAttrMap().put("argument", (aexpr58!=null?aexpr58.st:null)));
                      }

                    }
                    }
                    break;
                case 14 :
                    // CMinus.g:214:4: 'pow' '(' base= aexpr ',' exponent= aexpr ')'
                    {
                    match(input,48,FOLLOW_48_in_enumeratedFunction2245); if (state.failed) return retval;
                    match(input,15,FOLLOW_15_in_enumeratedFunction2247); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_enumeratedFunction2251);
                    base=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,13,FOLLOW_13_in_enumeratedFunction2253); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_enumeratedFunction2257);
                    exponent=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,16,FOLLOW_16_in_enumeratedFunction2259); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 214:48: -> pow_function(base=$base.stexponent=$exponent.st)
                      {
                          retval.st = templateLib.getInstanceOf("pow_function",
                        new STAttrMap().put("base", (base!=null?base.st:null)).put("exponent", (exponent!=null?exponent.st:null)));
                      }

                    }
                    }
                    break;
                case 15 :
                    // CMinus.g:215:4: 'abs' '(' aexpr ')'
                    {
                    match(input,49,FOLLOW_49_in_enumeratedFunction2277); if (state.failed) return retval;
                    match(input,15,FOLLOW_15_in_enumeratedFunction2279); if (state.failed) return retval;
                    pushFollow(FOLLOW_aexpr_in_enumeratedFunction2281);
                    aexpr59=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,16,FOLLOW_16_in_enumeratedFunction2283); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 215:24: -> abs_function(argument=$aexpr.st)
                      {
                          retval.st = templateLib.getInstanceOf("abs_function",
                        new STAttrMap().put("argument", (aexpr59!=null?aexpr59.st:null)));
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "enumeratedFunction"

    public static class constructExpr_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "constructExpr"
    // CMinus.g:218:1: constructExpr : id1= ID id2= ID '(' (p+= aexpr ( ',' p+= aexpr )* )? ')' -> constrinstance(type=$id1.textname=$id2.textargs=$p);
    public final CMinusParser.constructExpr_return constructExpr() throws RecognitionException {
        CMinusParser.constructExpr_return retval = new CMinusParser.constructExpr_return();
        retval.start = input.LT(1);

        Token id1=null;
        Token id2=null;
        List list_p=null;
        RuleReturnScope p = null;
        try {
            // CMinus.g:219:5: (id1= ID id2= ID '(' (p+= aexpr ( ',' p+= aexpr )* )? ')' -> constrinstance(type=$id1.textname=$id2.textargs=$p))
            // CMinus.g:219:9: id1= ID id2= ID '(' (p+= aexpr ( ',' p+= aexpr )* )? ')'
            {
            id1=(Token)match(input,ID,FOLLOW_ID_in_constructExpr2311); if (state.failed) return retval;
            id2=(Token)match(input,ID,FOLLOW_ID_in_constructExpr2315); if (state.failed) return retval;
            match(input,15,FOLLOW_15_in_constructExpr2317); if (state.failed) return retval;
            // CMinus.g:219:27: (p+= aexpr ( ',' p+= aexpr )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=ID && LA23_0<=INT)||LA23_0==15||(LA23_0>=35 && LA23_0<=49)||LA23_0==61) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // CMinus.g:219:29: p+= aexpr ( ',' p+= aexpr )*
                    {
                    pushFollow(FOLLOW_aexpr_in_constructExpr2323);
                    p=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if (list_p==null) list_p=new ArrayList();
                    list_p.add(p.getTemplate());

                    // CMinus.g:219:38: ( ',' p+= aexpr )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==13) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // CMinus.g:219:40: ',' p+= aexpr
                    	    {
                    	    match(input,13,FOLLOW_13_in_constructExpr2327); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_aexpr_in_constructExpr2331);
                    	    p=aexpr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if (list_p==null) list_p=new ArrayList();
                    	    list_p.add(p.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_constructExpr2339); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 219:63: -> constrinstance(type=$id1.textname=$id2.textargs=$p)
              {
                  retval.st = templateLib.getInstanceOf("constrinstance",
                new STAttrMap().put("type", (id1!=null?id1.getText():null)).put("name", (id2!=null?id2.getText():null)).put("args", list_p));
              }

            }
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constructExpr"

    public static class condExpr_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "condExpr"
    // CMinus.g:222:1: condExpr : (c1= condexp '&&' c2= condexp -> conjunction(left=$c1.stright=$c2.st) | c1= condexp '||' c2= condexp -> disjunction(left=$c1.stright=$c2.st) | c= condexp -> {$condexp.st});
    public final CMinusParser.condExpr_return condExpr() throws RecognitionException {
        CMinusParser.condExpr_return retval = new CMinusParser.condExpr_return();
        retval.start = input.LT(1);

        CMinusParser.condexp_return c1 = null;

        CMinusParser.condexp_return c2 = null;

        CMinusParser.condexp_return c = null;


        try {
            // CMinus.g:223:2: (c1= condexp '&&' c2= condexp -> conjunction(left=$c1.stright=$c2.st) | c1= condexp '||' c2= condexp -> disjunction(left=$c1.stright=$c2.st) | c= condexp -> {$condexp.st})
            int alt24=3;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // CMinus.g:223:6: c1= condexp '&&' c2= condexp
                    {
                    pushFollow(FOLLOW_condexp_in_condExpr2372);
                    c1=condexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,50,FOLLOW_50_in_condExpr2374); if (state.failed) return retval;
                    pushFollow(FOLLOW_condexp_in_condExpr2378);
                    c2=condexp();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 223:33: -> conjunction(left=$c1.stright=$c2.st)
                      {
                          retval.st = templateLib.getInstanceOf("conjunction",
                        new STAttrMap().put("left", (c1!=null?c1.st:null)).put("right", (c2!=null?c2.st:null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:224:6: c1= condexp '||' c2= condexp
                    {
                    pushFollow(FOLLOW_condexp_in_condExpr2400);
                    c1=condexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,51,FOLLOW_51_in_condExpr2402); if (state.failed) return retval;
                    pushFollow(FOLLOW_condexp_in_condExpr2406);
                    c2=condexp();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 224:33: -> disjunction(left=$c1.stright=$c2.st)
                      {
                          retval.st = templateLib.getInstanceOf("disjunction",
                        new STAttrMap().put("left", (c1!=null?c1.st:null)).put("right", (c2!=null?c2.st:null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:225:6: c= condexp
                    {
                    pushFollow(FOLLOW_condexp_in_condExpr2428);
                    c=condexp();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 225:16: -> {$condexp.st}
                      {
                          retval.st = (c!=null?c.st:null);
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condExpr"

    public static class condexp_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "condexp"
    // CMinus.g:228:1: condexp : ( 'true' -> boolean_true() | 'false' -> boolean_false() | a= aexpr ( ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st)) | -> {$a.st}) );
    public final CMinusParser.condexp_return condexp() throws RecognitionException {
        CMinusParser.condexp_return retval = new CMinusParser.condexp_return();
        retval.start = input.LT(1);

        CMinusParser.aexpr_return a = null;

        CMinusParser.aexpr_return b = null;


        try {
            // CMinus.g:229:2: ( 'true' -> boolean_true() | 'false' -> boolean_false() | a= aexpr ( ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st)) | -> {$a.st}) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt27=1;
                }
                break;
            case 53:
                {
                alt27=2;
                }
                break;
            case ID:
            case FP:
            case INT:
            case 15:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 61:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // CMinus.g:229:4: 'true'
                    {
                    match(input,52,FOLLOW_52_in_condexp2443); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 229:11: -> boolean_true()
                      {
                          retval.st = templateLib.getInstanceOf("boolean_true");
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:230:4: 'false'
                    {
                    match(input,53,FOLLOW_53_in_condexp2454); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 230:12: -> boolean_false()
                      {
                          retval.st = templateLib.getInstanceOf("boolean_false");
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:231:9: a= aexpr ( ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st)) | -> {$a.st})
                    {
                    pushFollow(FOLLOW_aexpr_in_condexp2472);
                    a=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    // CMinus.g:232:9: ( ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st)) | -> {$a.st})
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=54 && LA26_0<=59)) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==EOF||(LA26_0>=8 && LA26_0<=9)||LA26_0==16||(LA26_0>=29 && LA26_0<=34)||(LA26_0>=50 && LA26_0<=51)) ) {
                        alt26=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // CMinus.g:232:13: ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st))
                            {
                            // CMinus.g:232:13: ( '==' b= aexpr -> equals(left=$a.stright=$b.st) | '<' b= aexpr -> lessThan(left=$a.stright=$b.st) | '<=' b= aexpr -> lessOrEqual(left=$a.stright=$b.st) | '>=' b= aexpr -> moreOrEqual(left=$a.stright=$b.st) | '>' b= aexpr -> moreThan(left=$a.stright=$b.st) | '!=' b= aexpr -> unEqual(left=$a.stright=$b.st))
                            int alt25=6;
                            switch ( input.LA(1) ) {
                            case 54:
                                {
                                alt25=1;
                                }
                                break;
                            case 55:
                                {
                                alt25=2;
                                }
                                break;
                            case 56:
                                {
                                alt25=3;
                                }
                                break;
                            case 57:
                                {
                                alt25=4;
                                }
                                break;
                            case 58:
                                {
                                alt25=5;
                                }
                                break;
                            case 59:
                                {
                                alt25=6;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 25, 0, input);

                                throw nvae;
                            }

                            switch (alt25) {
                                case 1 :
                                    // CMinus.g:232:16: '==' b= aexpr
                                    {
                                    match(input,54,FOLLOW_54_in_condexp2489); if (state.failed) return retval;
                                    pushFollow(FOLLOW_aexpr_in_condexp2493);
                                    b=aexpr();

                                    state._fsp--;
                                    if (state.failed) return retval;


                                    // TEMPLATE REWRITE
                                    if ( state.backtracking==0 ) {
                                      // 232:29: -> equals(left=$a.stright=$b.st)
                                      {
                                          retval.st = templateLib.getInstanceOf("equals",
                                        new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                                      }

                                    }
                                    }
                                    break;
                                case 2 :
                                    // CMinus.g:233:16: '<' b= aexpr
                                    {
                                    match(input,55,FOLLOW_55_in_condexp2523); if (state.failed) return retval;
                                    pushFollow(FOLLOW_aexpr_in_condexp2527);
                                    b=aexpr();

                                    state._fsp--;
                                    if (state.failed) return retval;


                                    // TEMPLATE REWRITE
                                    if ( state.backtracking==0 ) {
                                      // 233:30: -> lessThan(left=$a.stright=$b.st)
                                      {
                                          retval.st = templateLib.getInstanceOf("lessThan",
                                        new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                                      }

                                    }
                                    }
                                    break;
                                case 3 :
                                    // CMinus.g:234:7: '<=' b= aexpr
                                    {
                                    match(input,56,FOLLOW_56_in_condexp2550); if (state.failed) return retval;
                                    pushFollow(FOLLOW_aexpr_in_condexp2554);
                                    b=aexpr();

                                    state._fsp--;
                                    if (state.failed) return retval;


                                    // TEMPLATE REWRITE
                                    if ( state.backtracking==0 ) {
                                      // 234:22: -> lessOrEqual(left=$a.stright=$b.st)
                                      {
                                          retval.st = templateLib.getInstanceOf("lessOrEqual",
                                        new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                                      }

                                    }
                                    }
                                    break;
                                case 4 :
                                    // CMinus.g:235:7: '>=' b= aexpr
                                    {
                                    match(input,57,FOLLOW_57_in_condexp2577); if (state.failed) return retval;
                                    pushFollow(FOLLOW_aexpr_in_condexp2581);
                                    b=aexpr();

                                    state._fsp--;
                                    if (state.failed) return retval;


                                    // TEMPLATE REWRITE
                                    if ( state.backtracking==0 ) {
                                      // 235:22: -> moreOrEqual(left=$a.stright=$b.st)
                                      {
                                          retval.st = templateLib.getInstanceOf("moreOrEqual",
                                        new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                                      }

                                    }
                                    }
                                    break;
                                case 5 :
                                    // CMinus.g:236:7: '>' b= aexpr
                                    {
                                    match(input,58,FOLLOW_58_in_condexp2604); if (state.failed) return retval;
                                    pushFollow(FOLLOW_aexpr_in_condexp2608);
                                    b=aexpr();

                                    state._fsp--;
                                    if (state.failed) return retval;


                                    // TEMPLATE REWRITE
                                    if ( state.backtracking==0 ) {
                                      // 236:21: -> moreThan(left=$a.stright=$b.st)
                                      {
                                          retval.st = templateLib.getInstanceOf("moreThan",
                                        new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                                      }

                                    }
                                    }
                                    break;
                                case 6 :
                                    // CMinus.g:237:7: '!=' b= aexpr
                                    {
                                    match(input,59,FOLLOW_59_in_condexp2631); if (state.failed) return retval;
                                    pushFollow(FOLLOW_aexpr_in_condexp2635);
                                    b=aexpr();

                                    state._fsp--;
                                    if (state.failed) return retval;


                                    // TEMPLATE REWRITE
                                    if ( state.backtracking==0 ) {
                                      // 237:22: -> unEqual(left=$a.stright=$b.st)
                                      {
                                          retval.st = templateLib.getInstanceOf("unEqual",
                                        new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                                      }

                                    }
                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // CMinus.g:239:13: 
                            {

                            // TEMPLATE REWRITE
                            if ( state.backtracking==0 ) {
                              // 239:13: -> {$a.st}
                              {
                                  retval.st = (a!=null?a.st:null);
                              }

                            }
                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condexp"

    public static class basicexpr_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "basicexpr"
    // CMinus.g:243:1: basicexpr : ( '(' type ')' atom -> castvalue(type=$type.stvalue=$atom.st) | atom -> {$atom.st});
    public final CMinusParser.basicexpr_return basicexpr() throws RecognitionException {
        CMinusParser.basicexpr_return retval = new CMinusParser.basicexpr_return();
        retval.start = input.LT(1);

        CMinusParser.type_return type60 = null;

        CMinusParser.atom_return atom61 = null;

        CMinusParser.atom_return atom62 = null;


        try {
            // CMinus.g:244:2: ( '(' type ')' atom -> castvalue(type=$type.stvalue=$atom.st) | atom -> {$atom.st})
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // CMinus.g:244:6: '(' type ')' atom
                    {
                    match(input,15,FOLLOW_15_in_basicexpr2708); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_basicexpr2710);
                    type60=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,16,FOLLOW_16_in_basicexpr2712); if (state.failed) return retval;
                    pushFollow(FOLLOW_atom_in_basicexpr2714);
                    atom61=atom();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 244:24: -> castvalue(type=$type.stvalue=$atom.st)
                      {
                          retval.st = templateLib.getInstanceOf("castvalue",
                        new STAttrMap().put("type", (type60!=null?type60.st:null)).put("value", (atom61!=null?atom61.st:null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:245:6: atom
                    {
                    pushFollow(FOLLOW_atom_in_basicexpr2734);
                    atom62=atom();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 245:11: -> {$atom.st}
                      {
                          retval.st = (atom62!=null?atom62.st:null);
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "basicexpr"

    public static class aexpr_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "aexpr"
    // CMinus.g:248:1: aexpr : (a= basicexpr -> {$a.st}) ( ( '+' b= basicexpr -> add(left=$aexpr.stright=$b.st)) | ( '-' b= basicexpr -> substract(left=$aexpr.stright=$b.st)) | ( '*' b= basicexpr -> multiply(left=$aexpr.stright=$b.st)) | ( '/' b= basicexpr -> substract(left=$aexpr.stright=$b.st)) | ( '&' b= basicexpr -> bitwiseand(left=$aexpr.stright=$b.st)) | ( '|' b= basicexpr -> bitwiseor(left=$aexpr.stright=$b.st)) | ( '^' b= basicexpr -> bitwisexor(left=$aexpr.stright=$b.st)) | ( '<<' b= basicexpr -> bitwiseleftshift(left=$aexpr.stright=$b.st)) | ( '>>' b= basicexpr -> bitwiserightshift(left=$aexpr.stright=$b.st)) )* ;
    public final CMinusParser.aexpr_return aexpr() throws RecognitionException {
        CMinusParser.aexpr_return retval = new CMinusParser.aexpr_return();
        retval.start = input.LT(1);

        CMinusParser.basicexpr_return a = null;

        CMinusParser.basicexpr_return b = null;


        try {
            // CMinus.g:249:5: ( (a= basicexpr -> {$a.st}) ( ( '+' b= basicexpr -> add(left=$aexpr.stright=$b.st)) | ( '-' b= basicexpr -> substract(left=$aexpr.stright=$b.st)) | ( '*' b= basicexpr -> multiply(left=$aexpr.stright=$b.st)) | ( '/' b= basicexpr -> substract(left=$aexpr.stright=$b.st)) | ( '&' b= basicexpr -> bitwiseand(left=$aexpr.stright=$b.st)) | ( '|' b= basicexpr -> bitwiseor(left=$aexpr.stright=$b.st)) | ( '^' b= basicexpr -> bitwisexor(left=$aexpr.stright=$b.st)) | ( '<<' b= basicexpr -> bitwiseleftshift(left=$aexpr.stright=$b.st)) | ( '>>' b= basicexpr -> bitwiserightshift(left=$aexpr.stright=$b.st)) )* )
            // CMinus.g:249:9: (a= basicexpr -> {$a.st}) ( ( '+' b= basicexpr -> add(left=$aexpr.stright=$b.st)) | ( '-' b= basicexpr -> substract(left=$aexpr.stright=$b.st)) | ( '*' b= basicexpr -> multiply(left=$aexpr.stright=$b.st)) | ( '/' b= basicexpr -> substract(left=$aexpr.stright=$b.st)) | ( '&' b= basicexpr -> bitwiseand(left=$aexpr.stright=$b.st)) | ( '|' b= basicexpr -> bitwiseor(left=$aexpr.stright=$b.st)) | ( '^' b= basicexpr -> bitwisexor(left=$aexpr.stright=$b.st)) | ( '<<' b= basicexpr -> bitwiseleftshift(left=$aexpr.stright=$b.st)) | ( '>>' b= basicexpr -> bitwiserightshift(left=$aexpr.stright=$b.st)) )*
            {
            // CMinus.g:249:9: (a= basicexpr -> {$a.st})
            // CMinus.g:249:10: a= basicexpr
            {
            pushFollow(FOLLOW_basicexpr_in_aexpr2757);
            a=basicexpr();

            state._fsp--;
            if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 249:22: -> {$a.st}
              {
                  retval.st = (a!=null?a.st:null);
              }

            }
            }

            // CMinus.g:250:9: ( ( '+' b= basicexpr -> add(left=$aexpr.stright=$b.st)) | ( '-' b= basicexpr -> substract(left=$aexpr.stright=$b.st)) | ( '*' b= basicexpr -> multiply(left=$aexpr.stright=$b.st)) | ( '/' b= basicexpr -> substract(left=$aexpr.stright=$b.st)) | ( '&' b= basicexpr -> bitwiseand(left=$aexpr.stright=$b.st)) | ( '|' b= basicexpr -> bitwiseor(left=$aexpr.stright=$b.st)) | ( '^' b= basicexpr -> bitwisexor(left=$aexpr.stright=$b.st)) | ( '<<' b= basicexpr -> bitwiseleftshift(left=$aexpr.stright=$b.st)) | ( '>>' b= basicexpr -> bitwiserightshift(left=$aexpr.stright=$b.st)) )*
            loop29:
            do {
                int alt29=10;
                switch ( input.LA(1) ) {
                case 60:
                    {
                    alt29=1;
                    }
                    break;
                case 61:
                    {
                    alt29=2;
                    }
                    break;
                case 62:
                    {
                    alt29=3;
                    }
                    break;
                case 63:
                    {
                    alt29=4;
                    }
                    break;
                case 64:
                    {
                    alt29=5;
                    }
                    break;
                case 65:
                    {
                    alt29=6;
                    }
                    break;
                case 66:
                    {
                    alt29=7;
                    }
                    break;
                case 67:
                    {
                    alt29=8;
                    }
                    break;
                case 68:
                    {
                    alt29=9;
                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // CMinus.g:250:10: ( '+' b= basicexpr -> add(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:250:10: ( '+' b= basicexpr -> add(left=$aexpr.stright=$b.st))
            	    // CMinus.g:250:12: '+' b= basicexpr
            	    {
            	    match(input,60,FOLLOW_60_in_aexpr2775); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr2779);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 250:28: -> add(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("add",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;
            	case 2 :
            	    // CMinus.g:251:3: ( '-' b= basicexpr -> substract(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:251:3: ( '-' b= basicexpr -> substract(left=$aexpr.stright=$b.st))
            	    // CMinus.g:251:5: '-' b= basicexpr
            	    {
            	    match(input,61,FOLLOW_61_in_aexpr2803); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr2807);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 251:21: -> substract(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("substract",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;
            	case 3 :
            	    // CMinus.g:252:3: ( '*' b= basicexpr -> multiply(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:252:3: ( '*' b= basicexpr -> multiply(left=$aexpr.stright=$b.st))
            	    // CMinus.g:252:5: '*' b= basicexpr
            	    {
            	    match(input,62,FOLLOW_62_in_aexpr2831); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr2835);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 252:21: -> multiply(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("multiply",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;
            	case 4 :
            	    // CMinus.g:253:3: ( '/' b= basicexpr -> substract(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:253:3: ( '/' b= basicexpr -> substract(left=$aexpr.stright=$b.st))
            	    // CMinus.g:253:5: '/' b= basicexpr
            	    {
            	    match(input,63,FOLLOW_63_in_aexpr2859); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr2863);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 253:21: -> substract(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("substract",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;
            	case 5 :
            	    // CMinus.g:254:3: ( '&' b= basicexpr -> bitwiseand(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:254:3: ( '&' b= basicexpr -> bitwiseand(left=$aexpr.stright=$b.st))
            	    // CMinus.g:254:5: '&' b= basicexpr
            	    {
            	    match(input,64,FOLLOW_64_in_aexpr2887); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr2891);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 254:21: -> bitwiseand(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("bitwiseand",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;
            	case 6 :
            	    // CMinus.g:255:3: ( '|' b= basicexpr -> bitwiseor(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:255:3: ( '|' b= basicexpr -> bitwiseor(left=$aexpr.stright=$b.st))
            	    // CMinus.g:255:5: '|' b= basicexpr
            	    {
            	    match(input,65,FOLLOW_65_in_aexpr2915); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr2919);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 255:21: -> bitwiseor(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("bitwiseor",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;
            	case 7 :
            	    // CMinus.g:256:3: ( '^' b= basicexpr -> bitwisexor(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:256:3: ( '^' b= basicexpr -> bitwisexor(left=$aexpr.stright=$b.st))
            	    // CMinus.g:256:5: '^' b= basicexpr
            	    {
            	    match(input,66,FOLLOW_66_in_aexpr2943); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr2947);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 256:21: -> bitwisexor(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("bitwisexor",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;
            	case 8 :
            	    // CMinus.g:257:3: ( '<<' b= basicexpr -> bitwiseleftshift(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:257:3: ( '<<' b= basicexpr -> bitwiseleftshift(left=$aexpr.stright=$b.st))
            	    // CMinus.g:257:5: '<<' b= basicexpr
            	    {
            	    match(input,67,FOLLOW_67_in_aexpr2971); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr2975);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 257:22: -> bitwiseleftshift(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("bitwiseleftshift",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;
            	case 9 :
            	    // CMinus.g:258:3: ( '>>' b= basicexpr -> bitwiserightshift(left=$aexpr.stright=$b.st))
            	    {
            	    // CMinus.g:258:3: ( '>>' b= basicexpr -> bitwiserightshift(left=$aexpr.stright=$b.st))
            	    // CMinus.g:258:5: '>>' b= basicexpr
            	    {
            	    match(input,68,FOLLOW_68_in_aexpr2999); if (state.failed) return retval;
            	    pushFollow(FOLLOW_basicexpr_in_aexpr3003);
            	    b=basicexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;


            	    // TEMPLATE REWRITE
            	    if ( state.backtracking==0 ) {
            	      // 258:22: -> bitwiserightshift(left=$aexpr.stright=$b.st)
            	      {
            	          retval.st = templateLib.getInstanceOf("bitwiserightshift",
            	        new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	      }

            	    }
            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "aexpr"

    public static class atom_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "atom"
    // CMinus.g:261:1: atom : ( arrayexpr -> {$arrayexpr.st} | funcexpr -> {$funcexpr.st} | ID -> refVar(id=$ID.text) | numericexpr -> iconst(value=$numericexpr.st) | '(' expr ')' -> brackets(expr=$expr.st) | '-' a= atom -> minusNumber(value=$a.st));
    public final CMinusParser.atom_return atom() throws RecognitionException {
        CMinusParser.atom_return retval = new CMinusParser.atom_return();
        retval.start = input.LT(1);

        Token ID65=null;
        CMinusParser.atom_return a = null;

        CMinusParser.arrayexpr_return arrayexpr63 = null;

        CMinusParser.funcexpr_return funcexpr64 = null;

        CMinusParser.numericexpr_return numericexpr66 = null;

        CMinusParser.expr_return expr67 = null;


        try {
            // CMinus.g:262:5: ( arrayexpr -> {$arrayexpr.st} | funcexpr -> {$funcexpr.st} | ID -> refVar(id=$ID.text) | numericexpr -> iconst(value=$numericexpr.st) | '(' expr ')' -> brackets(expr=$expr.st) | '-' a= atom -> minusNumber(value=$a.st))
            int alt30=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 15:
                    {
                    alt30=2;
                    }
                    break;
                case 10:
                    {
                    alt30=1;
                    }
                    break;
                case EOF:
                case 8:
                case 9:
                case 11:
                case 13:
                case 16:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 50:
                case 51:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    {
                    alt30=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }

                }
                break;
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                {
                alt30=2;
                }
                break;
            case FP:
            case INT:
                {
                alt30=4;
                }
                break;
            case 15:
                {
                alt30=5;
                }
                break;
            case 61:
                {
                alt30=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // CMinus.g:262:7: arrayexpr
                    {
                    pushFollow(FOLLOW_arrayexpr_in_atom3038);
                    arrayexpr63=arrayexpr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 262:17: -> {$arrayexpr.st}
                      {
                          retval.st = (arrayexpr63!=null?arrayexpr63.st:null);
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:263:4: funcexpr
                    {
                    pushFollow(FOLLOW_funcexpr_in_atom3047);
                    funcexpr64=funcexpr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 263:13: -> {$funcexpr.st}
                      {
                          retval.st = (funcexpr64!=null?funcexpr64.st:null);
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:264:7: ID
                    {
                    ID65=(Token)match(input,ID,FOLLOW_ID_in_atom3059); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 264:10: -> refVar(id=$ID.text)
                      {
                          retval.st = templateLib.getInstanceOf("refVar",
                        new STAttrMap().put("id", (ID65!=null?ID65.getText():null)));
                      }

                    }
                    }
                    break;
                case 4 :
                    // CMinus.g:265:7: numericexpr
                    {
                    pushFollow(FOLLOW_numericexpr_in_atom3076);
                    numericexpr66=numericexpr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 265:19: -> iconst(value=$numericexpr.st)
                      {
                          retval.st = templateLib.getInstanceOf("iconst",
                        new STAttrMap().put("value", (numericexpr66!=null?numericexpr66.st:null)));
                      }

                    }
                    }
                    break;
                case 5 :
                    // CMinus.g:266:7: '(' expr ')'
                    {
                    match(input,15,FOLLOW_15_in_atom3093); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_atom3095);
                    expr67=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,16,FOLLOW_16_in_atom3097); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 266:20: -> brackets(expr=$expr.st)
                      {
                          retval.st = templateLib.getInstanceOf("brackets",
                        new STAttrMap().put("expr", (expr67!=null?expr67.st:null)));
                      }

                    }
                    }
                    break;
                case 6 :
                    // CMinus.g:267:4: '-' a= atom
                    {
                    match(input,61,FOLLOW_61_in_atom3111); if (state.failed) return retval;
                    pushFollow(FOLLOW_atom_in_atom3115);
                    a=atom();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 267:15: -> minusNumber(value=$a.st)
                      {
                          retval.st = templateLib.getInstanceOf("minusNumber",
                        new STAttrMap().put("value", (a!=null?a.st:null)));
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class realnum_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "realnum"
    // CMinus.g:270:1: realnum : ( numericexpr -> {$numericexpr.st} | '-' numericexpr -> minusNumber(value=$numericexpr.st));
    public final CMinusParser.realnum_return realnum() throws RecognitionException {
        CMinusParser.realnum_return retval = new CMinusParser.realnum_return();
        retval.start = input.LT(1);

        CMinusParser.numericexpr_return numericexpr68 = null;

        CMinusParser.numericexpr_return numericexpr69 = null;


        try {
            // CMinus.g:271:5: ( numericexpr -> {$numericexpr.st} | '-' numericexpr -> minusNumber(value=$numericexpr.st))
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=FP && LA31_0<=INT)) ) {
                alt31=1;
            }
            else if ( (LA31_0==61) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // CMinus.g:271:7: numericexpr
                    {
                    pushFollow(FOLLOW_numericexpr_in_realnum3143);
                    numericexpr68=numericexpr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 271:19: -> {$numericexpr.st}
                      {
                          retval.st = (numericexpr68!=null?numericexpr68.st:null);
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:272:4: '-' numericexpr
                    {
                    match(input,61,FOLLOW_61_in_realnum3152); if (state.failed) return retval;
                    pushFollow(FOLLOW_numericexpr_in_realnum3154);
                    numericexpr69=numericexpr();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 272:20: -> minusNumber(value=$numericexpr.st)
                      {
                          retval.st = templateLib.getInstanceOf("minusNumber",
                        new STAttrMap().put("value", (numericexpr69!=null?numericexpr69.st:null)));
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "realnum"

    public static class numericexpr_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "numericexpr"
    // CMinus.g:275:1: numericexpr : ( FP ( 'f' | 'F' ) -> floatFloatingPoint(value=$FP.text) | FP -> doubleFloatingPoint(value=$FP.text) | INT ( 'u' | 'U' ) -> unsignedInt(value=$INT.text) | INT ( 'l' | 'L' ) -> longInt(value=$INT.text) | INT ( 'll' | 'LL' ) -> longLongInt(value=$INT.text) | INT ( 'lu' | 'Lu' | 'lU' | 'LU' | 'ul' | 'uL' | 'Ul' | 'UL' ) -> unsignedLongInt(value=$INT.text) | INT ( 'llu' | 'LLu' | 'llU' | 'LLU' | 'ull' | 'uLL' | 'Ull' | 'ULL' ) -> unsignedLongLongInt(value=$INT.text) | INT -> defaultInt(value=$INT.text));
    public final CMinusParser.numericexpr_return numericexpr() throws RecognitionException {
        CMinusParser.numericexpr_return retval = new CMinusParser.numericexpr_return();
        retval.start = input.LT(1);

        Token FP70=null;
        Token FP71=null;
        Token INT72=null;
        Token INT73=null;
        Token INT74=null;
        Token INT75=null;
        Token INT76=null;
        Token INT77=null;

        try {
            // CMinus.g:276:5: ( FP ( 'f' | 'F' ) -> floatFloatingPoint(value=$FP.text) | FP -> doubleFloatingPoint(value=$FP.text) | INT ( 'u' | 'U' ) -> unsignedInt(value=$INT.text) | INT ( 'l' | 'L' ) -> longInt(value=$INT.text) | INT ( 'll' | 'LL' ) -> longLongInt(value=$INT.text) | INT ( 'lu' | 'Lu' | 'lU' | 'LU' | 'ul' | 'uL' | 'Ul' | 'UL' ) -> unsignedLongInt(value=$INT.text) | INT ( 'llu' | 'LLu' | 'llU' | 'LLU' | 'ull' | 'uLL' | 'Ull' | 'ULL' ) -> unsignedLongLongInt(value=$INT.text) | INT -> defaultInt(value=$INT.text))
            int alt38=8;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // CMinus.g:276:7: FP ( 'f' | 'F' )
                    {
                    FP70=(Token)match(input,FP,FOLLOW_FP_in_numericexpr3178); if (state.failed) return retval;
                    // CMinus.g:276:10: ( 'f' | 'F' )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==69) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==70) ) {
                        alt32=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // CMinus.g:276:11: 'f'
                            {
                            match(input,69,FOLLOW_69_in_numericexpr3181); if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // CMinus.g:276:15: 'F'
                            {
                            match(input,70,FOLLOW_70_in_numericexpr3183); if (state.failed) return retval;

                            }
                            break;

                    }



                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 276:20: -> floatFloatingPoint(value=$FP.text)
                      {
                          retval.st = templateLib.getInstanceOf("floatFloatingPoint",
                        new STAttrMap().put("value", (FP70!=null?FP70.getText():null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // CMinus.g:277:4: FP
                    {
                    FP71=(Token)match(input,FP,FOLLOW_FP_in_numericexpr3198); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 277:7: -> doubleFloatingPoint(value=$FP.text)
                      {
                          retval.st = templateLib.getInstanceOf("doubleFloatingPoint",
                        new STAttrMap().put("value", (FP71!=null?FP71.getText():null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // CMinus.g:278:4: INT ( 'u' | 'U' )
                    {
                    INT72=(Token)match(input,INT,FOLLOW_INT_in_numericexpr3212); if (state.failed) return retval;
                    // CMinus.g:278:8: ( 'u' | 'U' )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==71) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==72) ) {
                        alt33=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // CMinus.g:278:9: 'u'
                            {
                            match(input,71,FOLLOW_71_in_numericexpr3215); if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // CMinus.g:278:13: 'U'
                            {
                            match(input,72,FOLLOW_72_in_numericexpr3217); if (state.failed) return retval;

                            }
                            break;

                    }



                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 278:18: -> unsignedInt(value=$INT.text)
                      {
                          retval.st = templateLib.getInstanceOf("unsignedInt",
                        new STAttrMap().put("value", (INT72!=null?INT72.getText():null)));
                      }

                    }
                    }
                    break;
                case 4 :
                    // CMinus.g:279:4: INT ( 'l' | 'L' )
                    {
                    INT73=(Token)match(input,INT,FOLLOW_INT_in_numericexpr3232); if (state.failed) return retval;
                    // CMinus.g:279:8: ( 'l' | 'L' )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==73) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==74) ) {
                        alt34=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // CMinus.g:279:9: 'l'
                            {
                            match(input,73,FOLLOW_73_in_numericexpr3235); if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // CMinus.g:279:13: 'L'
                            {
                            match(input,74,FOLLOW_74_in_numericexpr3237); if (state.failed) return retval;

                            }
                            break;

                    }



                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 279:18: -> longInt(value=$INT.text)
                      {
                          retval.st = templateLib.getInstanceOf("longInt",
                        new STAttrMap().put("value", (INT73!=null?INT73.getText():null)));
                      }

                    }
                    }
                    break;
                case 5 :
                    // CMinus.g:280:4: INT ( 'll' | 'LL' )
                    {
                    INT74=(Token)match(input,INT,FOLLOW_INT_in_numericexpr3252); if (state.failed) return retval;
                    // CMinus.g:280:8: ( 'll' | 'LL' )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==75) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==76) ) {
                        alt35=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // CMinus.g:280:9: 'll'
                            {
                            match(input,75,FOLLOW_75_in_numericexpr3255); if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // CMinus.g:280:14: 'LL'
                            {
                            match(input,76,FOLLOW_76_in_numericexpr3257); if (state.failed) return retval;

                            }
                            break;

                    }



                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 280:20: -> longLongInt(value=$INT.text)
                      {
                          retval.st = templateLib.getInstanceOf("longLongInt",
                        new STAttrMap().put("value", (INT74!=null?INT74.getText():null)));
                      }

                    }
                    }
                    break;
                case 6 :
                    // CMinus.g:281:4: INT ( 'lu' | 'Lu' | 'lU' | 'LU' | 'ul' | 'uL' | 'Ul' | 'UL' )
                    {
                    INT75=(Token)match(input,INT,FOLLOW_INT_in_numericexpr3272); if (state.failed) return retval;
                    // CMinus.g:281:8: ( 'lu' | 'Lu' | 'lU' | 'LU' | 'ul' | 'uL' | 'Ul' | 'UL' )
                    int alt36=8;
                    switch ( input.LA(1) ) {
                    case 77:
                        {
                        alt36=1;
                        }
                        break;
                    case 78:
                        {
                        alt36=2;
                        }
                        break;
                    case 79:
                        {
                        alt36=3;
                        }
                        break;
                    case 80:
                        {
                        alt36=4;
                        }
                        break;
                    case 81:
                        {
                        alt36=5;
                        }
                        break;
                    case 82:
                        {
                        alt36=6;
                        }
                        break;
                    case 83:
                        {
                        alt36=7;
                        }
                        break;
                    case 84:
                        {
                        alt36=8;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }

                    switch (alt36) {
                        case 1 :
                            // CMinus.g:281:9: 'lu'
                            {
                            match(input,77,FOLLOW_77_in_numericexpr3275); if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // CMinus.g:281:14: 'Lu'
                            {
                            match(input,78,FOLLOW_78_in_numericexpr3277); if (state.failed) return retval;

                            }
                            break;
                        case 3 :
                            // CMinus.g:281:19: 'lU'
                            {
                            match(input,79,FOLLOW_79_in_numericexpr3279); if (state.failed) return retval;

                            }
                            break;
                        case 4 :
                            // CMinus.g:281:24: 'LU'
                            {
                            match(input,80,FOLLOW_80_in_numericexpr3281); if (state.failed) return retval;

                            }
                            break;
                        case 5 :
                            // CMinus.g:281:29: 'ul'
                            {
                            match(input,81,FOLLOW_81_in_numericexpr3283); if (state.failed) return retval;

                            }
                            break;
                        case 6 :
                            // CMinus.g:281:34: 'uL'
                            {
                            match(input,82,FOLLOW_82_in_numericexpr3285); if (state.failed) return retval;

                            }
                            break;
                        case 7 :
                            // CMinus.g:281:39: 'Ul'
                            {
                            match(input,83,FOLLOW_83_in_numericexpr3287); if (state.failed) return retval;

                            }
                            break;
                        case 8 :
                            // CMinus.g:281:44: 'UL'
                            {
                            match(input,84,FOLLOW_84_in_numericexpr3289); if (state.failed) return retval;

                            }
                            break;

                    }



                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 281:50: -> unsignedLongInt(value=$INT.text)
                      {
                          retval.st = templateLib.getInstanceOf("unsignedLongInt",
                        new STAttrMap().put("value", (INT75!=null?INT75.getText():null)));
                      }

                    }
                    }
                    break;
                case 7 :
                    // CMinus.g:282:4: INT ( 'llu' | 'LLu' | 'llU' | 'LLU' | 'ull' | 'uLL' | 'Ull' | 'ULL' )
                    {
                    INT76=(Token)match(input,INT,FOLLOW_INT_in_numericexpr3304); if (state.failed) return retval;
                    // CMinus.g:282:8: ( 'llu' | 'LLu' | 'llU' | 'LLU' | 'ull' | 'uLL' | 'Ull' | 'ULL' )
                    int alt37=8;
                    switch ( input.LA(1) ) {
                    case 85:
                        {
                        alt37=1;
                        }
                        break;
                    case 86:
                        {
                        alt37=2;
                        }
                        break;
                    case 87:
                        {
                        alt37=3;
                        }
                        break;
                    case 88:
                        {
                        alt37=4;
                        }
                        break;
                    case 89:
                        {
                        alt37=5;
                        }
                        break;
                    case 90:
                        {
                        alt37=6;
                        }
                        break;
                    case 91:
                        {
                        alt37=7;
                        }
                        break;
                    case 92:
                        {
                        alt37=8;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }

                    switch (alt37) {
                        case 1 :
                            // CMinus.g:282:9: 'llu'
                            {
                            match(input,85,FOLLOW_85_in_numericexpr3307); if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // CMinus.g:282:15: 'LLu'
                            {
                            match(input,86,FOLLOW_86_in_numericexpr3309); if (state.failed) return retval;

                            }
                            break;
                        case 3 :
                            // CMinus.g:282:21: 'llU'
                            {
                            match(input,87,FOLLOW_87_in_numericexpr3311); if (state.failed) return retval;

                            }
                            break;
                        case 4 :
                            // CMinus.g:282:27: 'LLU'
                            {
                            match(input,88,FOLLOW_88_in_numericexpr3313); if (state.failed) return retval;

                            }
                            break;
                        case 5 :
                            // CMinus.g:282:33: 'ull'
                            {
                            match(input,89,FOLLOW_89_in_numericexpr3315); if (state.failed) return retval;

                            }
                            break;
                        case 6 :
                            // CMinus.g:282:39: 'uLL'
                            {
                            match(input,90,FOLLOW_90_in_numericexpr3317); if (state.failed) return retval;

                            }
                            break;
                        case 7 :
                            // CMinus.g:282:45: 'Ull'
                            {
                            match(input,91,FOLLOW_91_in_numericexpr3319); if (state.failed) return retval;

                            }
                            break;
                        case 8 :
                            // CMinus.g:282:51: 'ULL'
                            {
                            match(input,92,FOLLOW_92_in_numericexpr3321); if (state.failed) return retval;

                            }
                            break;

                    }



                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 282:58: -> unsignedLongLongInt(value=$INT.text)
                      {
                          retval.st = templateLib.getInstanceOf("unsignedLongLongInt",
                        new STAttrMap().put("value", (INT76!=null?INT76.getText():null)));
                      }

                    }
                    }
                    break;
                case 8 :
                    // CMinus.g:283:4: INT
                    {
                    INT77=(Token)match(input,INT,FOLLOW_INT_in_numericexpr3336); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 283:8: -> defaultInt(value=$INT.text)
                      {
                          retval.st = templateLib.getInstanceOf("defaultInt",
                        new STAttrMap().put("value", (INT77!=null?INT77.getText():null)));
                      }

                    }
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numericexpr"

    // $ANTLR start synpred3_CMinus
    public final void synpred3_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:45:9: ( type declarator ';' )
        // CMinus.g:45:9: type declarator ';'
        {
        pushFollow(FOLLOW_type_in_synpred3_CMinus142);
        type();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_declarator_in_synpred3_CMinus144);
        declarator();

        state._fsp--;
        if (state.failed) return ;
        match(input,8,FOLLOW_8_in_synpred3_CMinus146); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_CMinus

    // $ANTLR start synpred4_CMinus
    public final void synpred4_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:49:6: ( type declarator '=' expr ';' )
        // CMinus.g:49:6: type declarator '=' expr ';'
        {
        pushFollow(FOLLOW_type_in_synpred4_CMinus208);
        type();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_declarator_in_synpred4_CMinus210);
        declarator();

        state._fsp--;
        if (state.failed) return ;
        match(input,9,FOLLOW_9_in_synpred4_CMinus212); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred4_CMinus214);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,8,FOLLOW_8_in_synpred4_CMinus216); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_CMinus

    // $ANTLR start synpred5_CMinus
    public final void synpred5_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:53:6: ( type declarator '[' aexpr ']' ';' )
        // CMinus.g:53:6: type declarator '[' aexpr ']' ';'
        {
        pushFollow(FOLLOW_type_in_synpred5_CMinus283);
        type();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_declarator_in_synpred5_CMinus285);
        declarator();

        state._fsp--;
        if (state.failed) return ;
        match(input,10,FOLLOW_10_in_synpred5_CMinus287); if (state.failed) return ;
        pushFollow(FOLLOW_aexpr_in_synpred5_CMinus289);
        aexpr();

        state._fsp--;
        if (state.failed) return ;
        match(input,11,FOLLOW_11_in_synpred5_CMinus291); if (state.failed) return ;
        match(input,8,FOLLOW_8_in_synpred5_CMinus293); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_CMinus

    // $ANTLR start synpred6_CMinus
    public final void synpred6_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:57:6: ( type declarator '[' aexpr ']' '=' arrayinit ';' )
        // CMinus.g:57:6: type declarator '[' aexpr ']' '=' arrayinit ';'
        {
        pushFollow(FOLLOW_type_in_synpred6_CMinus360);
        type();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_declarator_in_synpred6_CMinus362);
        declarator();

        state._fsp--;
        if (state.failed) return ;
        match(input,10,FOLLOW_10_in_synpred6_CMinus364); if (state.failed) return ;
        pushFollow(FOLLOW_aexpr_in_synpred6_CMinus366);
        aexpr();

        state._fsp--;
        if (state.failed) return ;
        match(input,11,FOLLOW_11_in_synpred6_CMinus368); if (state.failed) return ;
        match(input,9,FOLLOW_9_in_synpred6_CMinus370); if (state.failed) return ;
        pushFollow(FOLLOW_arrayinit_in_synpred6_CMinus372);
        arrayinit();

        state._fsp--;
        if (state.failed) return ;
        match(input,8,FOLLOW_8_in_synpred6_CMinus374); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_CMinus

    // $ANTLR start synpred7_CMinus
    public final void synpred7_CMinus_fragment() throws RecognitionException {   
        CMinusParser.aexpr_return a = null;

        CMinusParser.aexpr_return b = null;


        // CMinus.g:61:6: ( type declarator '[' a= aexpr ']' '[' b= aexpr ']' ';' )
        // CMinus.g:61:6: type declarator '[' a= aexpr ']' '[' b= aexpr ']' ';'
        {
        pushFollow(FOLLOW_type_in_synpred7_CMinus449);
        type();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_declarator_in_synpred7_CMinus451);
        declarator();

        state._fsp--;
        if (state.failed) return ;
        match(input,10,FOLLOW_10_in_synpred7_CMinus453); if (state.failed) return ;
        pushFollow(FOLLOW_aexpr_in_synpred7_CMinus457);
        a=aexpr();

        state._fsp--;
        if (state.failed) return ;
        match(input,11,FOLLOW_11_in_synpred7_CMinus459); if (state.failed) return ;
        match(input,10,FOLLOW_10_in_synpred7_CMinus461); if (state.failed) return ;
        pushFollow(FOLLOW_aexpr_in_synpred7_CMinus465);
        b=aexpr();

        state._fsp--;
        if (state.failed) return ;
        match(input,11,FOLLOW_11_in_synpred7_CMinus467); if (state.failed) return ;
        match(input,8,FOLLOW_8_in_synpred7_CMinus469); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_CMinus

    // $ANTLR start synpred10_CMinus
    public final void synpred10_CMinus_fragment() throws RecognitionException {   
        List list_p=null;
        RuleReturnScope p = null;
        // CMinus.g:72:9: ( '{' (p+= realnum ( ',' p+= realnum )* )? '}' )
        // CMinus.g:72:9: '{' (p+= realnum ( ',' p+= realnum )* )? '}'
        {
        match(input,12,FOLLOW_12_in_synpred10_CMinus664); if (state.failed) return ;
        // CMinus.g:72:13: (p+= realnum ( ',' p+= realnum )* )?
        int alt41=2;
        int LA41_0 = input.LA(1);

        if ( ((LA41_0>=FP && LA41_0<=INT)||LA41_0==61) ) {
            alt41=1;
        }
        switch (alt41) {
            case 1 :
                // CMinus.g:72:15: p+= realnum ( ',' p+= realnum )*
                {
                pushFollow(FOLLOW_realnum_in_synpred10_CMinus670);
                p=realnum();

                state._fsp--;
                if (state.failed) return ;
                if (list_p==null) list_p=new ArrayList();
                list_p.add(p);

                // CMinus.g:72:26: ( ',' p+= realnum )*
                loop40:
                do {
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==13) ) {
                        alt40=1;
                    }


                    switch (alt40) {
                	case 1 :
                	    // CMinus.g:72:28: ',' p+= realnum
                	    {
                	    match(input,13,FOLLOW_13_in_synpred10_CMinus674); if (state.failed) return ;
                	    pushFollow(FOLLOW_realnum_in_synpred10_CMinus678);
                	    p=realnum();

                	    state._fsp--;
                	    if (state.failed) return ;
                	    if (list_p==null) list_p=new ArrayList();
                	    list_p.add(p);


                	    }
                	    break;

                	default :
                	    break loop40;
                    }
                } while (true);


                }
                break;

        }

        match(input,14,FOLLOW_14_in_synpred10_CMinus686); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_CMinus

    // $ANTLR start synpred29_CMinus
    public final void synpred29_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:134:4: ( constructExpr ';' )
        // CMinus.g:134:4: constructExpr ';'
        {
        pushFollow(FOLLOW_constructExpr_in_synpred29_CMinus1283);
        constructExpr();

        state._fsp--;
        if (state.failed) return ;
        match(input,8,FOLLOW_8_in_synpred29_CMinus1285); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_CMinus

    // $ANTLR start synpred30_CMinus
    public final void synpred30_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:135:4: ( assignStat ';' )
        // CMinus.g:135:4: assignStat ';'
        {
        pushFollow(FOLLOW_assignStat_in_synpred30_CMinus1294);
        assignStat();

        state._fsp--;
        if (state.failed) return ;
        match(input,8,FOLLOW_8_in_synpred30_CMinus1296); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_CMinus

    // $ANTLR start synpred33_CMinus
    public final void synpred33_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:138:7: ( expr ';' )
        // CMinus.g:138:7: expr ';'
        {
        pushFollow(FOLLOW_expr_in_synpred33_CMinus1331);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,8,FOLLOW_8_in_synpred33_CMinus1333); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_CMinus

    // $ANTLR start synpred34_CMinus
    public final void synpred34_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:139:7: ( block )
        // CMinus.g:139:7: block
        {
        pushFollow(FOLLOW_block_in_synpred34_CMinus1350);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_CMinus

    // $ANTLR start synpred36_CMinus
    public final void synpred36_CMinus_fragment() throws RecognitionException {   
        CMinusParser.expr_return e1 = null;

        CMinusParser.expr_return e2 = null;


        // CMinus.g:177:6: (e1= expr '=' e2= expr )
        // CMinus.g:177:6: e1= expr '=' e2= expr
        {
        pushFollow(FOLLOW_expr_in_synpred36_CMinus1657);
        e1=expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,9,FOLLOW_9_in_synpred36_CMinus1659); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred36_CMinus1663);
        e2=expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_CMinus

    // $ANTLR start synpred37_CMinus
    public final void synpred37_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:178:6: ( expr '++' )
        // CMinus.g:178:6: expr '++'
        {
        pushFollow(FOLLOW_expr_in_synpred37_CMinus1684);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,29,FOLLOW_29_in_synpred37_CMinus1686); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_CMinus

    // $ANTLR start synpred38_CMinus
    public final void synpred38_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:179:6: ( expr '--' )
        // CMinus.g:179:6: expr '--'
        {
        pushFollow(FOLLOW_expr_in_synpred38_CMinus1702);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,30,FOLLOW_30_in_synpred38_CMinus1704); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_CMinus

    // $ANTLR start synpred39_CMinus
    public final void synpred39_CMinus_fragment() throws RecognitionException {   
        CMinusParser.expr_return e1 = null;

        CMinusParser.expr_return e2 = null;


        // CMinus.g:180:6: (e1= expr '+=' e2= expr )
        // CMinus.g:180:6: e1= expr '+=' e2= expr
        {
        pushFollow(FOLLOW_expr_in_synpred39_CMinus1722);
        e1=expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,31,FOLLOW_31_in_synpred39_CMinus1724); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred39_CMinus1728);
        e2=expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_CMinus

    // $ANTLR start synpred40_CMinus
    public final void synpred40_CMinus_fragment() throws RecognitionException {   
        CMinusParser.expr_return e1 = null;

        CMinusParser.expr_return e2 = null;


        // CMinus.g:181:6: (e1= expr '-=' e2= expr )
        // CMinus.g:181:6: e1= expr '-=' e2= expr
        {
        pushFollow(FOLLOW_expr_in_synpred40_CMinus1751);
        e1=expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,32,FOLLOW_32_in_synpred40_CMinus1753); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred40_CMinus1757);
        e2=expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_CMinus

    // $ANTLR start synpred41_CMinus
    public final void synpred41_CMinus_fragment() throws RecognitionException {   
        CMinusParser.expr_return e1 = null;

        CMinusParser.expr_return e2 = null;


        // CMinus.g:182:6: (e1= expr '*=' e2= expr )
        // CMinus.g:182:6: e1= expr '*=' e2= expr
        {
        pushFollow(FOLLOW_expr_in_synpred41_CMinus1780);
        e1=expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,33,FOLLOW_33_in_synpred41_CMinus1782); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred41_CMinus1786);
        e2=expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_CMinus

    // $ANTLR start synpred42_CMinus
    public final void synpred42_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:186:9: ( condExpr )
        // CMinus.g:186:9: condExpr
        {
        pushFollow(FOLLOW_condExpr_in_synpred42_CMinus1843);
        condExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_CMinus

    // $ANTLR start synpred43_CMinus
    public final void synpred43_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:187:6: ( aexpr )
        // CMinus.g:187:6: aexpr
        {
        pushFollow(FOLLOW_aexpr_in_synpred43_CMinus1854);
        aexpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_CMinus

    // $ANTLR start synpred64_CMinus
    public final void synpred64_CMinus_fragment() throws RecognitionException {   
        CMinusParser.condexp_return c1 = null;

        CMinusParser.condexp_return c2 = null;


        // CMinus.g:223:6: (c1= condexp '&&' c2= condexp )
        // CMinus.g:223:6: c1= condexp '&&' c2= condexp
        {
        pushFollow(FOLLOW_condexp_in_synpred64_CMinus2372);
        c1=condexp();

        state._fsp--;
        if (state.failed) return ;
        match(input,50,FOLLOW_50_in_synpred64_CMinus2374); if (state.failed) return ;
        pushFollow(FOLLOW_condexp_in_synpred64_CMinus2378);
        c2=condexp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_CMinus

    // $ANTLR start synpred65_CMinus
    public final void synpred65_CMinus_fragment() throws RecognitionException {   
        CMinusParser.condexp_return c1 = null;

        CMinusParser.condexp_return c2 = null;


        // CMinus.g:224:6: (c1= condexp '||' c2= condexp )
        // CMinus.g:224:6: c1= condexp '||' c2= condexp
        {
        pushFollow(FOLLOW_condexp_in_synpred65_CMinus2400);
        c1=condexp();

        state._fsp--;
        if (state.failed) return ;
        match(input,51,FOLLOW_51_in_synpred65_CMinus2402); if (state.failed) return ;
        pushFollow(FOLLOW_condexp_in_synpred65_CMinus2406);
        c2=condexp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_CMinus

    // $ANTLR start synpred74_CMinus
    public final void synpred74_CMinus_fragment() throws RecognitionException {   
        // CMinus.g:244:6: ( '(' type ')' atom )
        // CMinus.g:244:6: '(' type ')' atom
        {
        match(input,15,FOLLOW_15_in_synpred74_CMinus2708); if (state.failed) return ;
        pushFollow(FOLLOW_type_in_synpred74_CMinus2710);
        type();

        state._fsp--;
        if (state.failed) return ;
        match(input,16,FOLLOW_16_in_synpred74_CMinus2712); if (state.failed) return ;
        pushFollow(FOLLOW_atom_in_synpred74_CMinus2714);
        atom();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred74_CMinus

    // Delegated rules

    public final boolean synpred10_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_CMinus() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_CMinus_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA38 dfa38 = new DFA38(this);
    static final String DFA2_eotS =
        "\21\uffff";
    static final String DFA2_eofS =
        "\21\uffff";
    static final String DFA2_minS =
        "\1\4\1\24\10\4\1\25\1\10\1\25\1\4\2\uffff\1\4";
    static final String DFA2_maxS =
        "\1\30\1\25\1\24\5\4\1\24\1\4\1\25\1\17\1\25\1\4\2\uffff\1\4";
    static final String DFA2_acceptS =
        "\16\uffff\1\1\1\2\1\uffff";
    static final String DFA2_specialS =
        "\21\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\7\16\uffff\1\1\1\2\1\3\1\4\1\5\1\6",
            "\1\10\1\11",
            "\1\13\17\uffff\1\12",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13\17\uffff\1\14",
            "\1\13",
            "\1\15",
            "\3\16\4\uffff\1\17",
            "\1\20",
            "\1\13",
            "",
            "",
            "\1\13"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "36:1: declaration : ( variable | f= function );";
        }
    }
    static final String DFA3_eotS =
        "\16\uffff";
    static final String DFA3_eofS =
        "\16\uffff";
    static final String DFA3_minS =
        "\1\4\7\0\6\uffff";
    static final String DFA3_maxS =
        "\1\30\7\0\6\uffff";
    static final String DFA3_acceptS =
        "\10\uffff\1\1\1\2\1\3\1\4\1\5\1\6";
    static final String DFA3_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\6\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\7\16\uffff\1\1\1\2\1\3\1\4\1\5\1\6",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "44:1: variable : ( type declarator ';' -> {$function.size()>0 && $function::name==null}? globalVariable(type=$type.stname=$declarator.st) -> variable(type=$type.stname=$declarator.st) | type declarator '=' expr ';' -> {$function.size()>0 && $function::name==null}? globalVariableInit(type=$type.stname=$declarator.stvalue=$expr.st) -> variableInit(type=$type.stname=$declarator.stvalue=$expr.st) | type declarator '[' aexpr ']' ';' -> {$function.size()>0 && $function::name==null}? globalArrayDeclaration(type=$type.stname=$declarator.stsize=$aexpr.st) -> arrayDeclaration(type=$type.stname=$declarator.stsize=$aexpr.st) | type declarator '[' aexpr ']' '=' arrayinit ';' -> {$function.size()>0 && $function::name==null}? globalArrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsize=$aexpr.st) -> arrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsize=$aexpr.st) | type declarator '[' a= aexpr ']' '[' b= aexpr ']' ';' -> {$function.size()>0 && $function::name==null}? globalDoubleArrayDeclaration(type=$type.stname=$declarator.stsizeone=$a.stsizetwo=$b.st) -> doubleArrayDeclaration(type=$type.stname=$declarator.stsize=$a.stsizetwo=$b.st) | type declarator '[' a= aexpr ']' '[' b= aexpr ']' '=' arrayinit ';' -> {$function.size()>0 && $function::name==null}? globalDoubleArrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsizeone=$a.stsizetwo=$b.st) -> doubleArrayInitialization(type=$type.stname=$declarator.stvalues=$arrayinit.stsizeone=$a.stsizetwo=$b.st));";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_1 = input.LA(1);

                         
                        int index3_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_CMinus()) ) {s = 8;}

                        else if ( (synpred4_CMinus()) ) {s = 9;}

                        else if ( (synpred5_CMinus()) ) {s = 10;}

                        else if ( (synpred6_CMinus()) ) {s = 11;}

                        else if ( (synpred7_CMinus()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index3_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_2 = input.LA(1);

                         
                        int index3_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_CMinus()) ) {s = 8;}

                        else if ( (synpred4_CMinus()) ) {s = 9;}

                        else if ( (synpred5_CMinus()) ) {s = 10;}

                        else if ( (synpred6_CMinus()) ) {s = 11;}

                        else if ( (synpred7_CMinus()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index3_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_3 = input.LA(1);

                         
                        int index3_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_CMinus()) ) {s = 8;}

                        else if ( (synpred4_CMinus()) ) {s = 9;}

                        else if ( (synpred5_CMinus()) ) {s = 10;}

                        else if ( (synpred6_CMinus()) ) {s = 11;}

                        else if ( (synpred7_CMinus()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index3_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_4 = input.LA(1);

                         
                        int index3_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_CMinus()) ) {s = 8;}

                        else if ( (synpred4_CMinus()) ) {s = 9;}

                        else if ( (synpred5_CMinus()) ) {s = 10;}

                        else if ( (synpred6_CMinus()) ) {s = 11;}

                        else if ( (synpred7_CMinus()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index3_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_5 = input.LA(1);

                         
                        int index3_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_CMinus()) ) {s = 8;}

                        else if ( (synpred4_CMinus()) ) {s = 9;}

                        else if ( (synpred5_CMinus()) ) {s = 10;}

                        else if ( (synpred6_CMinus()) ) {s = 11;}

                        else if ( (synpred7_CMinus()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index3_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA3_6 = input.LA(1);

                         
                        int index3_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_CMinus()) ) {s = 8;}

                        else if ( (synpred4_CMinus()) ) {s = 9;}

                        else if ( (synpred5_CMinus()) ) {s = 10;}

                        else if ( (synpred6_CMinus()) ) {s = 11;}

                        else if ( (synpred7_CMinus()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index3_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA3_7 = input.LA(1);

                         
                        int index3_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_CMinus()) ) {s = 8;}

                        else if ( (synpred4_CMinus()) ) {s = 9;}

                        else if ( (synpred5_CMinus()) ) {s = 10;}

                        else if ( (synpred6_CMinus()) ) {s = 11;}

                        else if ( (synpred7_CMinus()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index3_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA11_eotS =
        "\22\uffff";
    static final String DFA11_eofS =
        "\13\uffff\1\16\6\uffff";
    static final String DFA11_minS =
        "\1\4\1\24\10\4\1\25\1\15\1\25\1\4\3\uffff\1\4";
    static final String DFA11_maxS =
        "\1\30\1\25\1\24\5\4\1\24\1\4\1\25\1\22\1\25\1\4\3\uffff\1\4";
    static final String DFA11_acceptS =
        "\16\uffff\1\1\1\3\1\2\1\uffff";
    static final String DFA11_specialS =
        "\22\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\7\16\uffff\1\1\1\2\1\3\1\4\1\5\1\6",
            "\1\10\1\11",
            "\1\13\17\uffff\1\12",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13\17\uffff\1\14",
            "\1\13",
            "\1\15",
            "\1\16\2\uffff\1\16\1\20\1\17",
            "\1\21",
            "\1\13",
            "",
            "",
            "",
            "\1\13"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "98:1: formalParameter : ( type declarator -> parameter(type=$type.stname=$declarator.st) | type declarator '[]' -> arrayparameter(type=$type.stname=$declarator.st) | type declarator '[][]' -> doublearrayparameter(type=$type.stname=$declarator.st));";
        }
    }
    static final String DFA12_eotS =
        "\16\uffff";
    static final String DFA12_eofS =
        "\16\uffff";
    static final String DFA12_minS =
        "\1\4\1\24\1\4\5\uffff\1\4\5\uffff";
    static final String DFA12_maxS =
        "\1\30\1\25\1\24\5\uffff\1\24\5\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\5\1\7\1\10\1\11\1\12\1\uffff\1\4\1\2\1\6\1\1\1\3";
    static final String DFA12_specialS =
        "\16\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\7\16\uffff\1\1\1\2\1\3\1\4\1\5\1\6",
            "\1\10\1\11",
            "\1\13\13\uffff\1\13\3\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\15\13\uffff\1\15\3\uffff\1\14",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "107:1: type : ( 'unsigned' 'long' 'long' 'int' -> type_unsigned_long_long_int() | 'long' 'long' 'int' -> type_long_long_int() | 'unsigned' 'long' -> type_unsigned_long_int() | 'unsigned' 'int' -> type_unsigned_int() | 'int' -> type_int() | 'long' -> type_long_int() | 'char' -> type_char() | 'float' -> type_float() | 'double' -> type_double() | ID -> type_user_object(name=$ID.text));";
        }
    }
    static final String DFA14_eotS =
        "\41\uffff";
    static final String DFA14_eofS =
        "\41\uffff";
    static final String DFA14_minS =
        "\1\4\1\uffff\27\0\10\uffff";
    static final String DFA14_maxS =
        "\1\75\1\uffff\27\0\10\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\27\uffff\1\4\1\5\1\10\1\11\1\2\1\3\1\6\1\7";
    static final String DFA14_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\10\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\1\25\1\26\1\uffff\1\34\3\uffff\1\30\2\uffff\1\5\11\uffff"+
            "\1\33\1\31\1\32\1\1\6\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\2\uffff\1\3\1\4\7\uffff"+
            "\1\27",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "127:1: stat : ( forStat -> {$forStat.st} | constructExpr ';' -> {$constructExpr.st} | assignStat ';' -> valueWithSemicolon(value=$assignStat.st) | ifStat -> {$ifStat.st} | elseStat -> {$elseStat.st} | expr ';' -> statement(expr=$expr.st) | block -> statementList(locals=$slist::localsstats=$slist::stats) | 'return' expr ';' -> return(expr=$expr.st) | ';' -> {new StringTemplate(\";\")});";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_2 = input.LA(1);

                         
                        int index14_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_CMinus()) ) {s = 29;}

                        else if ( (synpred30_CMinus()) ) {s = 30;}

                        else if ( (synpred33_CMinus()) ) {s = 31;}

                         
                        input.seek(index14_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_3 = input.LA(1);

                         
                        int index14_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_CMinus()) ) {s = 30;}

                        else if ( (synpred33_CMinus()) ) {s = 31;}

                         
                        input.seek(index14_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_4 = input.LA(1);

                         
                        int index14_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_CMinus()) ) {s = 30;}

                        else if ( (synpred33_CMinus()) ) {s = 31;}

                         
                        input.seek(index14_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_5 = input.LA(1);

                         
                        int index14_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_CMinus()) ) {s = 30;}

                        else if ( (synpred33_CMinus()) ) {s = 31;}

                         
                        input.seek(index14_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_6 = input.LA(1);

                         
                        int index14_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_CMinus()) ) {s = 30;}

                        else if ( (synpred33_CMinus()) ) {s = 31;}

                         
                        input.seek(index14_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_7 = input.LA(1);

                         
                        int index14_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_CMinus()) ) {s = 30;}

                        else if ( (synpred33_CMinus()) ) {s = 31;}

                         
                        input.seek(index14_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_8 = input.LA(1);

                         
                        int index14_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_CMinus()) ) {s = 30;}

                        else if ( (synpred33_CMinus()) ) {s = 31;}

                         
                        input.seek(index14_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_9 = input.LA(1);

                         
                        int index14_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_CMinus()) ) {s = 30;}

                        else if ( (synpred33_CMinus()) ) {s = 31;}

                         
                        input.seek(index14_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA14_10 = input.LA(1);

                         
                        int index14_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_CMinus()) ) {s = 30;}

                        else if ( (synpred33_CMinus()) ) {s = 31;}

                         
                        input.seek(index14_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA14_11 = input.LA(1);

                         
                        int index14_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_CMinus()) ) {s = 30;}

                        else if ( (synpred33_CMinus()) ) {s = 31;}

                         
                        input.seek(index14_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA14_12 = input.LA(1);

                         
                        int index14_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_CMinus()) ) {s = 30;}

                        else if ( (synpred33_CMinus()) ) {s = 31;}

                         
                        input.seek(index14_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA14_13 = input.LA(1);

                         
                        int index14_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_CMinus()) ) {s = 30;}

                        else if ( (synpred33_CMinus()) ) {s = 31;}

                         
                        input.seek(index14_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA14_14 = input.LA(1);

                         
                        int index14_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_CMinus()) ) {s = 30;}

                        else if ( (synpred33_CMinus()) ) {s = 31;}

                         
                        input.seek(index14_14);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA14_15 = input.LA(1);

                         
                        int index14_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_CMinus()) ) {s = 30;}

                        else if ( (synpred33_CMinus()) ) {s = 31;}

                         
                        input.seek(index14_15);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA14_16 = input.LA(1);

                         
                        int index14_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_CMinus()) ) {s = 30;}

                        else if ( (synpred33_CMinus()) ) {s = 31;}

                         
                        input.seek(index14_16);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA14_17 = input.LA(1);

                         
                        int index14_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_CMinus()) ) {s = 30;}

                        else if ( (synpred33_CMinus()) ) {s = 31;}

                         
                        input.seek(index14_17);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA14_18 = input.LA(1);

                         
                        int index14_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_CMinus()) ) {s = 30;}

                        else if ( (synpred33_CMinus()) ) {s = 31;}

                         
                        input.seek(index14_18);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA14_19 = input.LA(1);

                         
                        int index14_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_CMinus()) ) {s = 30;}

                        else if ( (synpred33_CMinus()) ) {s = 31;}

                         
                        input.seek(index14_19);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA14_20 = input.LA(1);

                         
                        int index14_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_CMinus()) ) {s = 30;}

                        else if ( (synpred33_CMinus()) ) {s = 31;}

                         
                        input.seek(index14_20);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA14_21 = input.LA(1);

                         
                        int index14_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_CMinus()) ) {s = 30;}

                        else if ( (synpred33_CMinus()) ) {s = 31;}

                         
                        input.seek(index14_21);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA14_22 = input.LA(1);

                         
                        int index14_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_CMinus()) ) {s = 30;}

                        else if ( (synpred33_CMinus()) ) {s = 31;}

                         
                        input.seek(index14_22);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA14_23 = input.LA(1);

                         
                        int index14_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_CMinus()) ) {s = 30;}

                        else if ( (synpred33_CMinus()) ) {s = 31;}

                         
                        input.seek(index14_23);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA14_24 = input.LA(1);

                         
                        int index14_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_CMinus()) ) {s = 30;}

                        else if ( (synpred33_CMinus()) ) {s = 31;}

                        else if ( (synpred34_CMinus()) ) {s = 32;}

                         
                        input.seek(index14_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA15_eotS =
        "\37\uffff";
    static final String DFA15_eofS =
        "\37\uffff";
    static final String DFA15_minS =
        "\1\4\27\0\7\uffff";
    static final String DFA15_maxS =
        "\1\75\27\0\7\uffff";
    static final String DFA15_acceptS =
        "\30\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7";
    static final String DFA15_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\7\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\4\1\24\1\25\5\uffff\1\27\2\uffff\1\3\23\uffff\1\5\1\6\1"+
            "\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1"+
            "\23\2\uffff\1\1\1\2\7\uffff\1\26",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "176:1: assignStat : (e1= expr '=' e2= expr -> assign(lhs=$e1.strhs=$e2.st) | expr '++' -> inkrement(e=$expr.st) | expr '--' -> dekrement(e=$expr.st) | e1= expr '+=' e2= expr -> inkrementby(lhs=$e1.strhs=$e2.st) | e1= expr '-=' e2= expr -> dekrementby(lhs=$e1.strhs=$e2.st) | e1= expr '*=' e2= expr -> assignmultiply(lhs=$e1.strhs=$e2.st) | e1= expr '/=' e2= expr -> assigndivide(lhs=$e1.strhs=$e2.st));";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_CMinus()) ) {s = 24;}

                        else if ( (synpred37_CMinus()) ) {s = 25;}

                        else if ( (synpred38_CMinus()) ) {s = 26;}

                        else if ( (synpred39_CMinus()) ) {s = 27;}

                        else if ( (synpred40_CMinus()) ) {s = 28;}

                        else if ( (synpred41_CMinus()) ) {s = 29;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_2 = input.LA(1);

                         
                        int index15_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_CMinus()) ) {s = 24;}

                        else if ( (synpred37_CMinus()) ) {s = 25;}

                        else if ( (synpred38_CMinus()) ) {s = 26;}

                        else if ( (synpred39_CMinus()) ) {s = 27;}

                        else if ( (synpred40_CMinus()) ) {s = 28;}

                        else if ( (synpred41_CMinus()) ) {s = 29;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index15_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_3 = input.LA(1);

                         
                        int index15_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_CMinus()) ) {s = 24;}

                        else if ( (synpred37_CMinus()) ) {s = 25;}

                        else if ( (synpred38_CMinus()) ) {s = 26;}

                        else if ( (synpred39_CMinus()) ) {s = 27;}

                        else if ( (synpred40_CMinus()) ) {s = 28;}

                        else if ( (synpred41_CMinus()) ) {s = 29;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index15_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_4 = input.LA(1);

                         
                        int index15_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_CMinus()) ) {s = 24;}

                        else if ( (synpred37_CMinus()) ) {s = 25;}

                        else if ( (synpred38_CMinus()) ) {s = 26;}

                        else if ( (synpred39_CMinus()) ) {s = 27;}

                        else if ( (synpred40_CMinus()) ) {s = 28;}

                        else if ( (synpred41_CMinus()) ) {s = 29;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index15_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_5 = input.LA(1);

                         
                        int index15_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_CMinus()) ) {s = 24;}

                        else if ( (synpred37_CMinus()) ) {s = 25;}

                        else if ( (synpred38_CMinus()) ) {s = 26;}

                        else if ( (synpred39_CMinus()) ) {s = 27;}

                        else if ( (synpred40_CMinus()) ) {s = 28;}

                        else if ( (synpred41_CMinus()) ) {s = 29;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index15_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_6 = input.LA(1);

                         
                        int index15_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_CMinus()) ) {s = 24;}

                        else if ( (synpred37_CMinus()) ) {s = 25;}

                        else if ( (synpred38_CMinus()) ) {s = 26;}

                        else if ( (synpred39_CMinus()) ) {s = 27;}

                        else if ( (synpred40_CMinus()) ) {s = 28;}

                        else if ( (synpred41_CMinus()) ) {s = 29;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index15_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_7 = input.LA(1);

                         
                        int index15_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_CMinus()) ) {s = 24;}

                        else if ( (synpred37_CMinus()) ) {s = 25;}

                        else if ( (synpred38_CMinus()) ) {s = 26;}

                        else if ( (synpred39_CMinus()) ) {s = 27;}

                        else if ( (synpred40_CMinus()) ) {s = 28;}

                        else if ( (synpred41_CMinus()) ) {s = 29;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index15_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA15_8 = input.LA(1);

                         
                        int index15_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_CMinus()) ) {s = 24;}

                        else if ( (synpred37_CMinus()) ) {s = 25;}

                        else if ( (synpred38_CMinus()) ) {s = 26;}

                        else if ( (synpred39_CMinus()) ) {s = 27;}

                        else if ( (synpred40_CMinus()) ) {s = 28;}

                        else if ( (synpred41_CMinus()) ) {s = 29;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index15_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA15_9 = input.LA(1);

                         
                        int index15_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_CMinus()) ) {s = 24;}

                        else if ( (synpred37_CMinus()) ) {s = 25;}

                        else if ( (synpred38_CMinus()) ) {s = 26;}

                        else if ( (synpred39_CMinus()) ) {s = 27;}

                        else if ( (synpred40_CMinus()) ) {s = 28;}

                        else if ( (synpred41_CMinus()) ) {s = 29;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index15_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA15_10 = input.LA(1);

                         
                        int index15_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_CMinus()) ) {s = 24;}

                        else if ( (synpred37_CMinus()) ) {s = 25;}

                        else if ( (synpred38_CMinus()) ) {s = 26;}

                        else if ( (synpred39_CMinus()) ) {s = 27;}

                        else if ( (synpred40_CMinus()) ) {s = 28;}

                        else if ( (synpred41_CMinus()) ) {s = 29;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index15_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA15_11 = input.LA(1);

                         
                        int index15_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_CMinus()) ) {s = 24;}

                        else if ( (synpred37_CMinus()) ) {s = 25;}

                        else if ( (synpred38_CMinus()) ) {s = 26;}

                        else if ( (synpred39_CMinus()) ) {s = 27;}

                        else if ( (synpred40_CMinus()) ) {s = 28;}

                        else if ( (synpred41_CMinus()) ) {s = 29;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index15_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA15_12 = input.LA(1);

                         
                        int index15_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_CMinus()) ) {s = 24;}

                        else if ( (synpred37_CMinus()) ) {s = 25;}

                        else if ( (synpred38_CMinus()) ) {s = 26;}

                        else if ( (synpred39_CMinus()) ) {s = 27;}

                        else if ( (synpred40_CMinus()) ) {s = 28;}

                        else if ( (synpred41_CMinus()) ) {s = 29;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index15_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA15_13 = input.LA(1);

                         
                        int index15_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_CMinus()) ) {s = 24;}

                        else if ( (synpred37_CMinus()) ) {s = 25;}

                        else if ( (synpred38_CMinus()) ) {s = 26;}

                        else if ( (synpred39_CMinus()) ) {s = 27;}

                        else if ( (synpred40_CMinus()) ) {s = 28;}

                        else if ( (synpred41_CMinus()) ) {s = 29;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index15_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA15_14 = input.LA(1);

                         
                        int index15_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_CMinus()) ) {s = 24;}

                        else if ( (synpred37_CMinus()) ) {s = 25;}

                        else if ( (synpred38_CMinus()) ) {s = 26;}

                        else if ( (synpred39_CMinus()) ) {s = 27;}

                        else if ( (synpred40_CMinus()) ) {s = 28;}

                        else if ( (synpred41_CMinus()) ) {s = 29;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index15_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA15_15 = input.LA(1);

                         
                        int index15_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_CMinus()) ) {s = 24;}

                        else if ( (synpred37_CMinus()) ) {s = 25;}

                        else if ( (synpred38_CMinus()) ) {s = 26;}

                        else if ( (synpred39_CMinus()) ) {s = 27;}

                        else if ( (synpred40_CMinus()) ) {s = 28;}

                        else if ( (synpred41_CMinus()) ) {s = 29;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index15_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA15_16 = input.LA(1);

                         
                        int index15_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_CMinus()) ) {s = 24;}

                        else if ( (synpred37_CMinus()) ) {s = 25;}

                        else if ( (synpred38_CMinus()) ) {s = 26;}

                        else if ( (synpred39_CMinus()) ) {s = 27;}

                        else if ( (synpred40_CMinus()) ) {s = 28;}

                        else if ( (synpred41_CMinus()) ) {s = 29;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index15_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA15_17 = input.LA(1);

                         
                        int index15_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_CMinus()) ) {s = 24;}

                        else if ( (synpred37_CMinus()) ) {s = 25;}

                        else if ( (synpred38_CMinus()) ) {s = 26;}

                        else if ( (synpred39_CMinus()) ) {s = 27;}

                        else if ( (synpred40_CMinus()) ) {s = 28;}

                        else if ( (synpred41_CMinus()) ) {s = 29;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index15_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA15_18 = input.LA(1);

                         
                        int index15_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_CMinus()) ) {s = 24;}

                        else if ( (synpred37_CMinus()) ) {s = 25;}

                        else if ( (synpred38_CMinus()) ) {s = 26;}

                        else if ( (synpred39_CMinus()) ) {s = 27;}

                        else if ( (synpred40_CMinus()) ) {s = 28;}

                        else if ( (synpred41_CMinus()) ) {s = 29;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index15_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA15_19 = input.LA(1);

                         
                        int index15_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_CMinus()) ) {s = 24;}

                        else if ( (synpred37_CMinus()) ) {s = 25;}

                        else if ( (synpred38_CMinus()) ) {s = 26;}

                        else if ( (synpred39_CMinus()) ) {s = 27;}

                        else if ( (synpred40_CMinus()) ) {s = 28;}

                        else if ( (synpred41_CMinus()) ) {s = 29;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index15_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA15_20 = input.LA(1);

                         
                        int index15_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_CMinus()) ) {s = 24;}

                        else if ( (synpred37_CMinus()) ) {s = 25;}

                        else if ( (synpred38_CMinus()) ) {s = 26;}

                        else if ( (synpred39_CMinus()) ) {s = 27;}

                        else if ( (synpred40_CMinus()) ) {s = 28;}

                        else if ( (synpred41_CMinus()) ) {s = 29;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index15_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA15_21 = input.LA(1);

                         
                        int index15_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_CMinus()) ) {s = 24;}

                        else if ( (synpred37_CMinus()) ) {s = 25;}

                        else if ( (synpred38_CMinus()) ) {s = 26;}

                        else if ( (synpred39_CMinus()) ) {s = 27;}

                        else if ( (synpred40_CMinus()) ) {s = 28;}

                        else if ( (synpred41_CMinus()) ) {s = 29;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index15_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA15_22 = input.LA(1);

                         
                        int index15_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_CMinus()) ) {s = 24;}

                        else if ( (synpred37_CMinus()) ) {s = 25;}

                        else if ( (synpred38_CMinus()) ) {s = 26;}

                        else if ( (synpred39_CMinus()) ) {s = 27;}

                        else if ( (synpred40_CMinus()) ) {s = 28;}

                        else if ( (synpred41_CMinus()) ) {s = 29;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index15_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA15_23 = input.LA(1);

                         
                        int index15_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_CMinus()) ) {s = 24;}

                        else if ( (synpred37_CMinus()) ) {s = 25;}

                        else if ( (synpred38_CMinus()) ) {s = 26;}

                        else if ( (synpred39_CMinus()) ) {s = 27;}

                        else if ( (synpred40_CMinus()) ) {s = 28;}

                        else if ( (synpred41_CMinus()) ) {s = 29;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index15_23);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA16_eotS =
        "\31\uffff";
    static final String DFA16_eofS =
        "\31\uffff";
    static final String DFA16_minS =
        "\1\4\2\uffff\24\0\2\uffff";
    static final String DFA16_maxS =
        "\1\75\2\uffff\24\0\2\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\25\uffff\1\3\1\2";
    static final String DFA16_specialS =
        "\3\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\2\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\4\1\24\1\25\5\uffff\1\27\2\uffff\1\3\23\uffff\1\5\1\6\1"+
            "\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1"+
            "\23\2\uffff\2\1\7\uffff\1\26",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "186:1: expr : ( condExpr -> {$condExpr.st} | aexpr -> {$aexpr.st} | arrayinit -> {$arrayinit.st});";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_3 = input.LA(1);

                         
                        int index16_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_CMinus()) ) {s = 1;}

                        else if ( (synpred43_CMinus()) ) {s = 24;}

                         
                        input.seek(index16_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_4 = input.LA(1);

                         
                        int index16_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_CMinus()) ) {s = 1;}

                        else if ( (synpred43_CMinus()) ) {s = 24;}

                         
                        input.seek(index16_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_5 = input.LA(1);

                         
                        int index16_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_CMinus()) ) {s = 1;}

                        else if ( (synpred43_CMinus()) ) {s = 24;}

                         
                        input.seek(index16_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_6 = input.LA(1);

                         
                        int index16_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_CMinus()) ) {s = 1;}

                        else if ( (synpred43_CMinus()) ) {s = 24;}

                         
                        input.seek(index16_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_7 = input.LA(1);

                         
                        int index16_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_CMinus()) ) {s = 1;}

                        else if ( (synpred43_CMinus()) ) {s = 24;}

                         
                        input.seek(index16_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_8 = input.LA(1);

                         
                        int index16_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_CMinus()) ) {s = 1;}

                        else if ( (synpred43_CMinus()) ) {s = 24;}

                         
                        input.seek(index16_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_9 = input.LA(1);

                         
                        int index16_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_CMinus()) ) {s = 1;}

                        else if ( (synpred43_CMinus()) ) {s = 24;}

                         
                        input.seek(index16_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA16_10 = input.LA(1);

                         
                        int index16_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_CMinus()) ) {s = 1;}

                        else if ( (synpred43_CMinus()) ) {s = 24;}

                         
                        input.seek(index16_10);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA16_11 = input.LA(1);

                         
                        int index16_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_CMinus()) ) {s = 1;}

                        else if ( (synpred43_CMinus()) ) {s = 24;}

                         
                        input.seek(index16_11);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA16_12 = input.LA(1);

                         
                        int index16_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_CMinus()) ) {s = 1;}

                        else if ( (synpred43_CMinus()) ) {s = 24;}

                         
                        input.seek(index16_12);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA16_13 = input.LA(1);

                         
                        int index16_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_CMinus()) ) {s = 1;}

                        else if ( (synpred43_CMinus()) ) {s = 24;}

                         
                        input.seek(index16_13);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA16_14 = input.LA(1);

                         
                        int index16_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_CMinus()) ) {s = 1;}

                        else if ( (synpred43_CMinus()) ) {s = 24;}

                         
                        input.seek(index16_14);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA16_15 = input.LA(1);

                         
                        int index16_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_CMinus()) ) {s = 1;}

                        else if ( (synpred43_CMinus()) ) {s = 24;}

                         
                        input.seek(index16_15);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA16_16 = input.LA(1);

                         
                        int index16_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_CMinus()) ) {s = 1;}

                        else if ( (synpred43_CMinus()) ) {s = 24;}

                         
                        input.seek(index16_16);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA16_17 = input.LA(1);

                         
                        int index16_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_CMinus()) ) {s = 1;}

                        else if ( (synpred43_CMinus()) ) {s = 24;}

                         
                        input.seek(index16_17);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA16_18 = input.LA(1);

                         
                        int index16_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_CMinus()) ) {s = 1;}

                        else if ( (synpred43_CMinus()) ) {s = 24;}

                         
                        input.seek(index16_18);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA16_19 = input.LA(1);

                         
                        int index16_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_CMinus()) ) {s = 1;}

                        else if ( (synpred43_CMinus()) ) {s = 24;}

                         
                        input.seek(index16_19);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA16_20 = input.LA(1);

                         
                        int index16_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_CMinus()) ) {s = 1;}

                        else if ( (synpred43_CMinus()) ) {s = 24;}

                         
                        input.seek(index16_20);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA16_21 = input.LA(1);

                         
                        int index16_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_CMinus()) ) {s = 1;}

                        else if ( (synpred43_CMinus()) ) {s = 24;}

                         
                        input.seek(index16_21);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA16_22 = input.LA(1);

                         
                        int index16_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_CMinus()) ) {s = 1;}

                        else if ( (synpred43_CMinus()) ) {s = 24;}

                         
                        input.seek(index16_22);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA24_eotS =
        "\32\uffff";
    static final String DFA24_eofS =
        "\32\uffff";
    static final String DFA24_minS =
        "\1\4\26\0\3\uffff";
    static final String DFA24_maxS =
        "\1\75\26\0\3\uffff";
    static final String DFA24_acceptS =
        "\27\uffff\1\1\1\2\1\3";
    static final String DFA24_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\3\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\4\1\24\1\25\10\uffff\1\3\23\uffff\1\5\1\6\1\7\1\10\1\11"+
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\2\uffff\1"+
            "\1\1\2\7\uffff\1\26",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "222:1: condExpr : (c1= condexp '&&' c2= condexp -> conjunction(left=$c1.stright=$c2.st) | c1= condexp '||' c2= condexp -> disjunction(left=$c1.stright=$c2.st) | c= condexp -> {$condexp.st});";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_1 = input.LA(1);

                         
                        int index24_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_CMinus()) ) {s = 23;}

                        else if ( (synpred65_CMinus()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index24_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_2 = input.LA(1);

                         
                        int index24_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_CMinus()) ) {s = 23;}

                        else if ( (synpred65_CMinus()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index24_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_3 = input.LA(1);

                         
                        int index24_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_CMinus()) ) {s = 23;}

                        else if ( (synpred65_CMinus()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index24_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA24_4 = input.LA(1);

                         
                        int index24_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_CMinus()) ) {s = 23;}

                        else if ( (synpred65_CMinus()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index24_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA24_5 = input.LA(1);

                         
                        int index24_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_CMinus()) ) {s = 23;}

                        else if ( (synpred65_CMinus()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index24_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA24_6 = input.LA(1);

                         
                        int index24_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_CMinus()) ) {s = 23;}

                        else if ( (synpred65_CMinus()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index24_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA24_7 = input.LA(1);

                         
                        int index24_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_CMinus()) ) {s = 23;}

                        else if ( (synpred65_CMinus()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index24_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA24_8 = input.LA(1);

                         
                        int index24_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_CMinus()) ) {s = 23;}

                        else if ( (synpred65_CMinus()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index24_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA24_9 = input.LA(1);

                         
                        int index24_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_CMinus()) ) {s = 23;}

                        else if ( (synpred65_CMinus()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index24_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA24_10 = input.LA(1);

                         
                        int index24_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_CMinus()) ) {s = 23;}

                        else if ( (synpred65_CMinus()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index24_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA24_11 = input.LA(1);

                         
                        int index24_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_CMinus()) ) {s = 23;}

                        else if ( (synpred65_CMinus()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index24_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA24_12 = input.LA(1);

                         
                        int index24_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_CMinus()) ) {s = 23;}

                        else if ( (synpred65_CMinus()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index24_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA24_13 = input.LA(1);

                         
                        int index24_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_CMinus()) ) {s = 23;}

                        else if ( (synpred65_CMinus()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index24_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA24_14 = input.LA(1);

                         
                        int index24_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_CMinus()) ) {s = 23;}

                        else if ( (synpred65_CMinus()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index24_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA24_15 = input.LA(1);

                         
                        int index24_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_CMinus()) ) {s = 23;}

                        else if ( (synpred65_CMinus()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index24_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA24_16 = input.LA(1);

                         
                        int index24_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_CMinus()) ) {s = 23;}

                        else if ( (synpred65_CMinus()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index24_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA24_17 = input.LA(1);

                         
                        int index24_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_CMinus()) ) {s = 23;}

                        else if ( (synpred65_CMinus()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index24_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA24_18 = input.LA(1);

                         
                        int index24_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_CMinus()) ) {s = 23;}

                        else if ( (synpred65_CMinus()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index24_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA24_19 = input.LA(1);

                         
                        int index24_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_CMinus()) ) {s = 23;}

                        else if ( (synpred65_CMinus()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index24_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA24_20 = input.LA(1);

                         
                        int index24_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_CMinus()) ) {s = 23;}

                        else if ( (synpred65_CMinus()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index24_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA24_21 = input.LA(1);

                         
                        int index24_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_CMinus()) ) {s = 23;}

                        else if ( (synpred65_CMinus()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index24_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA24_22 = input.LA(1);

                         
                        int index24_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_CMinus()) ) {s = 23;}

                        else if ( (synpred65_CMinus()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index24_22);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA28_eotS =
        "\26\uffff";
    static final String DFA28_eofS =
        "\26\uffff";
    static final String DFA28_minS =
        "\1\4\1\0\24\uffff";
    static final String DFA28_maxS =
        "\1\75\1\0\24\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\2\22\uffff\1\1";
    static final String DFA28_specialS =
        "\1\uffff\1\0\24\uffff}>";
    static final String[] DFA28_transitionS = {
            "\3\2\10\uffff\1\1\23\uffff\17\2\13\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "243:1: basicexpr : ( '(' type ')' atom -> castvalue(type=$type.stvalue=$atom.st) | atom -> {$atom.st});";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_CMinus()) ) {s = 21;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA38_eotS =
        "\13\uffff";
    static final String DFA38_eofS =
        "\1\uffff\1\3\1\12\10\uffff";
    static final String DFA38_minS =
        "\1\5\2\10\10\uffff";
    static final String DFA38_maxS =
        "\1\6\1\106\1\134\10\uffff";
    static final String DFA38_acceptS =
        "\3\uffff\1\2\1\1\1\7\1\6\1\5\1\4\1\3\1\10";
    static final String DFA38_specialS =
        "\13\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\1\1\2",
            "\2\3\1\uffff\1\3\1\uffff\2\3\1\uffff\1\3\14\uffff\6\3\17\uffff"+
            "\2\3\2\uffff\17\3\2\4",
            "\2\12\1\uffff\1\12\1\uffff\2\12\1\uffff\1\12\14\uffff\6\12"+
            "\17\uffff\2\12\2\uffff\17\12\2\uffff\2\11\2\10\2\7\10\6\10\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "275:1: numericexpr : ( FP ( 'f' | 'F' ) -> floatFloatingPoint(value=$FP.text) | FP -> doubleFloatingPoint(value=$FP.text) | INT ( 'u' | 'U' ) -> unsignedInt(value=$INT.text) | INT ( 'l' | 'L' ) -> longInt(value=$INT.text) | INT ( 'll' | 'LL' ) -> longLongInt(value=$INT.text) | INT ( 'lu' | 'Lu' | 'lU' | 'LU' | 'ul' | 'uL' | 'Ul' | 'UL' ) -> unsignedLongInt(value=$INT.text) | INT ( 'llu' | 'LLu' | 'llU' | 'LLU' | 'ull' | 'uLL' | 'Ull' | 'ULL' ) -> unsignedLongLongInt(value=$INT.text) | INT -> defaultInt(value=$INT.text));";
        }
    }
 

    public static final BitSet FOLLOW_declaration_in_program61 = new BitSet(new long[]{0x0000000001F80012L});
    public static final BitSet FOLLOW_variable_in_declaration102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_declaration118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variable142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_variable144 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_variable146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variable208 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_variable210 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_variable212 = new BitSet(new long[]{0x2033FFF800009070L});
    public static final BitSet FOLLOW_expr_in_variable214 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_variable216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variable283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_variable285 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_variable287 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_variable289 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_variable291 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_variable293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variable360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_variable362 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_variable364 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_variable366 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_variable368 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_variable370 = new BitSet(new long[]{0x2033FFF800009070L});
    public static final BitSet FOLLOW_arrayinit_in_variable372 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_variable374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variable449 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_variable451 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_variable453 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_variable457 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_variable459 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_variable461 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_variable465 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_variable467 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_variable469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variable544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_variable546 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_variable548 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_variable552 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_variable554 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_variable556 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_variable560 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_variable562 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_variable564 = new BitSet(new long[]{0x2033FFF800009070L});
    public static final BitSet FOLLOW_arrayinit_in_variable566 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_variable568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_arrayinit664 = new BitSet(new long[]{0x2000000000004060L});
    public static final BitSet FOLLOW_realnum_in_arrayinit670 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_arrayinit674 = new BitSet(new long[]{0x2000000000000060L});
    public static final BitSet FOLLOW_realnum_in_arrayinit678 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_arrayinit686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_arrayinit702 = new BitSet(new long[]{0x2033FFF80000D070L});
    public static final BitSet FOLLOW_arrayinit_in_arrayinit708 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_arrayinit712 = new BitSet(new long[]{0x2033FFF800009070L});
    public static final BitSet FOLLOW_arrayinit_in_arrayinit716 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_arrayinit724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_declarator749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_function786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_function788 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_function800 = new BitSet(new long[]{0x0000000001F90010L});
    public static final BitSet FOLLOW_formalParameter_in_function806 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_function810 = new BitSet(new long[]{0x0000000001F80010L});
    public static final BitSet FOLLOW_formalParameter_in_function814 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_function822 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_block_in_function832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameter948 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_formalParameter950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameter979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_formalParameter981 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_formalParameter983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameter1008 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_formalParameter1010 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_formalParameter1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_type1046 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_type1048 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_type1050 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_type1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_type1065 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_type1067 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_type1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_type1082 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_type1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_type1097 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_type1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_type1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_type1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_type1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_type1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_type1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_block1215 = new BitSet(new long[]{0x2033FFF81FF8D170L});
    public static final BitSet FOLLOW_variable_in_block1226 = new BitSet(new long[]{0x2033FFF81FF8D170L});
    public static final BitSet FOLLOW_stat_in_block1232 = new BitSet(new long[]{0x2033FFF81FF8D170L});
    public static final BitSet FOLLOW_14_in_block1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStat_in_stat1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructExpr_in_stat1283 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_stat1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignStat_in_stat1294 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_stat1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStat_in_stat1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elseStat_in_stat1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stat1331 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_stat1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_stat1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_stat1369 = new BitSet(new long[]{0x2033FFF800009070L});
    public static final BitSet FOLLOW_expr_in_stat1371 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_stat1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_stat1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ifStat1424 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ifStat1426 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_condExpr_in_ifStat1430 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ifStat1432 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_block_in_ifStat1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_elseStat1510 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_block_in_elseStat1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_forStat1563 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_forStat1565 = new BitSet(new long[]{0x2033FFF800009070L});
    public static final BitSet FOLLOW_assignStat_in_forStat1569 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_forStat1571 = new BitSet(new long[]{0x2033FFF800009070L});
    public static final BitSet FOLLOW_expr_in_forStat1575 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_forStat1577 = new BitSet(new long[]{0x2033FFF800009070L});
    public static final BitSet FOLLOW_assignStat_in_forStat1581 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_forStat1583 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_block_in_forStat1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1657 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_assignStat1659 = new BitSet(new long[]{0x2033FFF800009070L});
    public static final BitSet FOLLOW_expr_in_assignStat1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1684 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_assignStat1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1702 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_assignStat1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1722 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_assignStat1724 = new BitSet(new long[]{0x2033FFF800009070L});
    public static final BitSet FOLLOW_expr_in_assignStat1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1751 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_assignStat1753 = new BitSet(new long[]{0x2033FFF800009070L});
    public static final BitSet FOLLOW_expr_in_assignStat1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1780 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_assignStat1782 = new BitSet(new long[]{0x2033FFF800009070L});
    public static final BitSet FOLLOW_expr_in_assignStat1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assignStat1809 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_assignStat1811 = new BitSet(new long[]{0x2033FFF800009070L});
    public static final BitSet FOLLOW_expr_in_assignStat1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExpr_in_expr1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpr_in_expr1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayinit_in_expr1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_arrayexpr1886 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_arrayexpr1889 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_arrayexpr1893 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_arrayexpr1895 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_enumeratedFunction_in_funcexpr1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcexpr1936 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_funcexpr1938 = new BitSet(new long[]{0x2033FFF800018070L});
    public static final BitSet FOLLOW_aexpr_in_funcexpr1944 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_funcexpr1948 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_funcexpr1952 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_funcexpr1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_enumeratedFunction1985 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_enumeratedFunction1987 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_enumeratedFunction1989 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_enumeratedFunction1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_enumeratedFunction2005 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_enumeratedFunction2007 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_enumeratedFunction2009 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_enumeratedFunction2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_enumeratedFunction2025 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_enumeratedFunction2027 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_enumeratedFunction2029 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_enumeratedFunction2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_enumeratedFunction2045 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_enumeratedFunction2047 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_enumeratedFunction2049 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_enumeratedFunction2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_enumeratedFunction2065 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_enumeratedFunction2067 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_enumeratedFunction2069 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_enumeratedFunction2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_enumeratedFunction2085 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_enumeratedFunction2087 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_enumeratedFunction2089 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_enumeratedFunction2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_enumeratedFunction2105 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_enumeratedFunction2107 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_enumeratedFunction2109 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_enumeratedFunction2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_enumeratedFunction2125 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_enumeratedFunction2127 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_enumeratedFunction2129 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_enumeratedFunction2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_enumeratedFunction2145 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_enumeratedFunction2147 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_enumeratedFunction2149 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_enumeratedFunction2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_enumeratedFunction2165 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_enumeratedFunction2167 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_enumeratedFunction2169 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_enumeratedFunction2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_enumeratedFunction2185 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_enumeratedFunction2187 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_enumeratedFunction2189 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_enumeratedFunction2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_enumeratedFunction2205 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_enumeratedFunction2207 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_enumeratedFunction2209 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_enumeratedFunction2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_enumeratedFunction2225 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_enumeratedFunction2227 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_enumeratedFunction2229 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_enumeratedFunction2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_enumeratedFunction2245 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_enumeratedFunction2247 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_enumeratedFunction2251 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_enumeratedFunction2253 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_enumeratedFunction2257 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_enumeratedFunction2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_enumeratedFunction2277 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_enumeratedFunction2279 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_enumeratedFunction2281 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_enumeratedFunction2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_constructExpr2311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_constructExpr2315 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_constructExpr2317 = new BitSet(new long[]{0x2033FFF800018070L});
    public static final BitSet FOLLOW_aexpr_in_constructExpr2323 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_constructExpr2327 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_constructExpr2331 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_constructExpr2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condexp_in_condExpr2372 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_condExpr2374 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_condexp_in_condExpr2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condexp_in_condExpr2400 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_condExpr2402 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_condexp_in_condExpr2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condexp_in_condExpr2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_condexp2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_condexp2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpr_in_condexp2472 = new BitSet(new long[]{0x0FC0000000000002L});
    public static final BitSet FOLLOW_54_in_condexp2489 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_condexp2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_condexp2523 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_condexp2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_condexp2550 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_condexp2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_condexp2577 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_condexp2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_condexp2604 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_condexp2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_condexp2631 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_condexp2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_basicexpr2708 = new BitSet(new long[]{0x0000000001F80010L});
    public static final BitSet FOLLOW_type_in_basicexpr2710 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_basicexpr2712 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_atom_in_basicexpr2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_basicexpr2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr2757 = new BitSet(new long[]{0xF000000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_60_in_aexpr2775 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr2779 = new BitSet(new long[]{0xF000000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_61_in_aexpr2803 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr2807 = new BitSet(new long[]{0xF000000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_62_in_aexpr2831 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr2835 = new BitSet(new long[]{0xF000000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_63_in_aexpr2859 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr2863 = new BitSet(new long[]{0xF000000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_64_in_aexpr2887 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr2891 = new BitSet(new long[]{0xF000000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_65_in_aexpr2915 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr2919 = new BitSet(new long[]{0xF000000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_66_in_aexpr2943 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr2947 = new BitSet(new long[]{0xF000000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_67_in_aexpr2971 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr2975 = new BitSet(new long[]{0xF000000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_68_in_aexpr2999 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_basicexpr_in_aexpr3003 = new BitSet(new long[]{0xF000000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_arrayexpr_in_atom3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcexpr_in_atom3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericexpr_in_atom3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_atom3093 = new BitSet(new long[]{0x2033FFF800009070L});
    public static final BitSet FOLLOW_expr_in_atom3095 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_atom3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_atom3111 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_atom_in_atom3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericexpr_in_realnum3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_realnum3152 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_numericexpr_in_realnum3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FP_in_numericexpr3178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_numericexpr3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_numericexpr3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FP_in_numericexpr3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_numericexpr3212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_71_in_numericexpr3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_numericexpr3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_numericexpr3232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_73_in_numericexpr3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_numericexpr3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_numericexpr3252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_numericexpr3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_numericexpr3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_numericexpr3272 = new BitSet(new long[]{0x0000000000000000L,0x00000000001FE000L});
    public static final BitSet FOLLOW_77_in_numericexpr3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_numericexpr3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_numericexpr3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_numericexpr3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_numericexpr3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_numericexpr3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_numericexpr3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_numericexpr3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_numericexpr3304 = new BitSet(new long[]{0x0000000000000000L,0x000000001FE00000L});
    public static final BitSet FOLLOW_85_in_numericexpr3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_numericexpr3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_numericexpr3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_numericexpr3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_numericexpr3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_numericexpr3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_numericexpr3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_numericexpr3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_numericexpr3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred3_CMinus142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_synpred3_CMinus144 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_synpred3_CMinus146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred4_CMinus208 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_synpred4_CMinus210 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_synpred4_CMinus212 = new BitSet(new long[]{0x2033FFF800009070L});
    public static final BitSet FOLLOW_expr_in_synpred4_CMinus214 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_synpred4_CMinus216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred5_CMinus283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_synpred5_CMinus285 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_synpred5_CMinus287 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_synpred5_CMinus289 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred5_CMinus291 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_synpred5_CMinus293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred6_CMinus360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_synpred6_CMinus362 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_synpred6_CMinus364 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_synpred6_CMinus366 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred6_CMinus368 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_synpred6_CMinus370 = new BitSet(new long[]{0x2033FFF800009070L});
    public static final BitSet FOLLOW_arrayinit_in_synpred6_CMinus372 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_synpred6_CMinus374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred7_CMinus449 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declarator_in_synpred7_CMinus451 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_synpred7_CMinus453 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_synpred7_CMinus457 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred7_CMinus459 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_synpred7_CMinus461 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_aexpr_in_synpred7_CMinus465 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred7_CMinus467 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_synpred7_CMinus469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred10_CMinus664 = new BitSet(new long[]{0x2000000000004060L});
    public static final BitSet FOLLOW_realnum_in_synpred10_CMinus670 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_synpred10_CMinus674 = new BitSet(new long[]{0x2000000000000060L});
    public static final BitSet FOLLOW_realnum_in_synpred10_CMinus678 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_synpred10_CMinus686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructExpr_in_synpred29_CMinus1283 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_synpred29_CMinus1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignStat_in_synpred30_CMinus1294 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_synpred30_CMinus1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred33_CMinus1331 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_synpred33_CMinus1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred34_CMinus1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred36_CMinus1657 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_synpred36_CMinus1659 = new BitSet(new long[]{0x2033FFF800009070L});
    public static final BitSet FOLLOW_expr_in_synpred36_CMinus1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred37_CMinus1684 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_synpred37_CMinus1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred38_CMinus1702 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_synpred38_CMinus1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred39_CMinus1722 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_synpred39_CMinus1724 = new BitSet(new long[]{0x2033FFF800009070L});
    public static final BitSet FOLLOW_expr_in_synpred39_CMinus1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred40_CMinus1751 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_synpred40_CMinus1753 = new BitSet(new long[]{0x2033FFF800009070L});
    public static final BitSet FOLLOW_expr_in_synpred40_CMinus1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred41_CMinus1780 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_synpred41_CMinus1782 = new BitSet(new long[]{0x2033FFF800009070L});
    public static final BitSet FOLLOW_expr_in_synpred41_CMinus1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExpr_in_synpred42_CMinus1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpr_in_synpred43_CMinus1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condexp_in_synpred64_CMinus2372 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_synpred64_CMinus2374 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_condexp_in_synpred64_CMinus2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condexp_in_synpred65_CMinus2400 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_synpred65_CMinus2402 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_condexp_in_synpred65_CMinus2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred74_CMinus2708 = new BitSet(new long[]{0x0000000001F80010L});
    public static final BitSet FOLLOW_type_in_synpred74_CMinus2710 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_synpred74_CMinus2712 = new BitSet(new long[]{0x2033FFF800008070L});
    public static final BitSet FOLLOW_atom_in_synpred74_CMinus2714 = new BitSet(new long[]{0x0000000000000002L});

}