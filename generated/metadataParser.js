// Generated from metadata.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import metadataListener from './metadataListener.js';
import metadataVisitor from './metadataVisitor.js';

const serializedATN = [4,1,5,22,2,0,7,0,2,1,7,1,2,2,7,2,1,0,5,0,8,8,0,10,
0,12,0,11,9,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,2,1,2,1,2,0,0,3,0,2,4,0,0,19,
0,9,1,0,0,0,2,14,1,0,0,0,4,19,1,0,0,0,6,8,3,2,1,0,7,6,1,0,0,0,8,11,1,0,0,
0,9,7,1,0,0,0,9,10,1,0,0,0,10,12,1,0,0,0,11,9,1,0,0,0,12,13,5,0,0,1,13,1,
1,0,0,0,14,15,5,2,0,0,15,16,5,3,0,0,16,17,5,4,0,0,17,18,3,4,2,0,18,3,1,0,
0,0,19,20,5,1,0,0,20,5,1,0,0,0,1,9];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class metadataParser extends antlr4.Parser {

    static grammarFileName = "metadata.g4";
    static literalNames = [ null, "';'", null, "':'" ];
    static symbolicNames = [ null, null, "NOMBRECAMPO", "COLON", "VALOR", 
                             "WS" ];
    static ruleNames = [ "programa", "campo", "finCampo" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = metadataParser.ruleNames;
        this.literalNames = metadataParser.literalNames;
        this.symbolicNames = metadataParser.symbolicNames;
    }



	programa() {
	    let localctx = new ProgramaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, metadataParser.RULE_programa);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 9;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===2) {
	            this.state = 6;
	            this.campo();
	            this.state = 11;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 12;
	        this.match(metadataParser.EOF);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	campo() {
	    let localctx = new CampoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, metadataParser.RULE_campo);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 14;
	        this.match(metadataParser.NOMBRECAMPO);
	        this.state = 15;
	        this.match(metadataParser.COLON);
	        this.state = 16;
	        this.match(metadataParser.VALOR);
	        this.state = 17;
	        this.finCampo();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	finCampo() {
	    let localctx = new FinCampoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, metadataParser.RULE_finCampo);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 19;
	        this.match(metadataParser.T__0);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

metadataParser.EOF = antlr4.Token.EOF;
metadataParser.T__0 = 1;
metadataParser.NOMBRECAMPO = 2;
metadataParser.COLON = 3;
metadataParser.VALOR = 4;
metadataParser.WS = 5;

metadataParser.RULE_programa = 0;
metadataParser.RULE_campo = 1;
metadataParser.RULE_finCampo = 2;

class ProgramaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = metadataParser.RULE_programa;
    }

	EOF() {
	    return this.getToken(metadataParser.EOF, 0);
	};

	campo = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(CampoContext);
	    } else {
	        return this.getTypedRuleContext(CampoContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof metadataListener ) {
	        listener.enterPrograma(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof metadataListener ) {
	        listener.exitPrograma(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof metadataVisitor ) {
	        return visitor.visitPrograma(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class CampoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = metadataParser.RULE_campo;
    }

	NOMBRECAMPO() {
	    return this.getToken(metadataParser.NOMBRECAMPO, 0);
	};

	COLON() {
	    return this.getToken(metadataParser.COLON, 0);
	};

	VALOR() {
	    return this.getToken(metadataParser.VALOR, 0);
	};

	finCampo() {
	    return this.getTypedRuleContext(FinCampoContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof metadataListener ) {
	        listener.enterCampo(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof metadataListener ) {
	        listener.exitCampo(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof metadataVisitor ) {
	        return visitor.visitCampo(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class FinCampoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = metadataParser.RULE_finCampo;
    }


	enterRule(listener) {
	    if(listener instanceof metadataListener ) {
	        listener.enterFinCampo(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof metadataListener ) {
	        listener.exitFinCampo(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof metadataVisitor ) {
	        return visitor.visitFinCampo(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




metadataParser.ProgramaContext = ProgramaContext; 
metadataParser.CampoContext = CampoContext; 
metadataParser.FinCampoContext = FinCampoContext; 
