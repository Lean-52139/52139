// Generated from c:/tarditi/grammar/metadata.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class metadataLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NOMBRECAMPO=2, COLON=3, VALOR=4, WS=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "NOMBRECAMPO", "COLON", "VALOR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "NOMBRECAMPO", "COLON", "VALOR", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public metadataLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "metadata.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0005]\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001N\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0004\u0003S\b\u0003\u000b\u0003\f\u0003T\u0001\u0004\u0004\u0004X\b"+
		"\u0004\u000b\u0004\f\u0004Y\u0001\u0004\u0001\u0004\u0000\u0000\u0005"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u0001\u0000\u0002"+
		"\u0003\u0000\n\n\r\r:;\u0003\u0000\t\n\r\r  f\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0001\u000b\u0001\u0000\u0000\u0000\u0003M\u0001\u0000\u0000\u0000"+
		"\u0005O\u0001\u0000\u0000\u0000\u0007R\u0001\u0000\u0000\u0000\tW\u0001"+
		"\u0000\u0000\u0000\u000b\f\u0005;\u0000\u0000\f\u0002\u0001\u0000\u0000"+
		"\u0000\r\u000e\u0005n\u0000\u0000\u000e\u000f\u0005o\u0000\u0000\u000f"+
		"\u0010\u0005m\u0000\u0000\u0010\u0011\u0005b\u0000\u0000\u0011\u0012\u0005"+
		"r\u0000\u0000\u0012N\u0005e\u0000\u0000\u0013\u0014\u0005t\u0000\u0000"+
		"\u0014\u0015\u0005i\u0000\u0000\u0015\u0016\u0005p\u0000\u0000\u0016N"+
		"\u0005o\u0000\u0000\u0017\u0018\u0005t\u0000\u0000\u0018\u0019\u0005a"+
		"\u0000\u0000\u0019\u001a\u0005m\u0000\u0000\u001a\u001b\u0005a\u0000\u0000"+
		"\u001b\u001c\u0005n\u0000\u0000\u001cN\u0005o\u0000\u0000\u001d\u001e"+
		"\u0005t\u0000\u0000\u001e\u001f\u0005a\u0000\u0000\u001f \u0005m\u0000"+
		"\u0000 !\u0005a\u0000\u0000!\"\u0005\u00c3\u0000\u0000\"#\u0005\u00b1"+
		"\u0000\u0000#N\u0005o\u0000\u0000$%\u0005c\u0000\u0000%&\u0005r\u0000"+
		"\u0000&\'\u0005e\u0000\u0000\'(\u0005a\u0000\u0000()\u0005d\u0000\u0000"+
		")N\u0005o\u0000\u0000*+\u0005m\u0000\u0000+,\u0005o\u0000\u0000,-\u0005"+
		"d\u0000\u0000-.\u0005i\u0000\u0000./\u0005f\u0000\u0000/0\u0005i\u0000"+
		"\u000001\u0005c\u0000\u000012\u0005a\u0000\u000023\u0005d\u0000\u0000"+
		"3N\u0005o\u0000\u000045\u0005a\u0000\u000056\u0005u\u0000\u000067\u0005"+
		"t\u0000\u000078\u0005o\u0000\u00008N\u0005r\u0000\u00009:\u0005d\u0000"+
		"\u0000:;\u0005e\u0000\u0000;<\u0005s\u0000\u0000<=\u0005c\u0000\u0000"+
		"=>\u0005r\u0000\u0000>?\u0005i\u0000\u0000?@\u0005p\u0000\u0000@A\u0005"+
		"c\u0000\u0000AB\u0005i\u0000\u0000BC\u0005o\u0000\u0000CN\u0005n\u0000"+
		"\u0000DE\u0005e\u0000\u0000EF\u0005t\u0000\u0000FG\u0005i\u0000\u0000"+
		"GH\u0005q\u0000\u0000HI\u0005u\u0000\u0000IJ\u0005e\u0000\u0000JK\u0005"+
		"t\u0000\u0000KL\u0005a\u0000\u0000LN\u0005s\u0000\u0000M\r\u0001\u0000"+
		"\u0000\u0000M\u0013\u0001\u0000\u0000\u0000M\u0017\u0001\u0000\u0000\u0000"+
		"M\u001d\u0001\u0000\u0000\u0000M$\u0001\u0000\u0000\u0000M*\u0001\u0000"+
		"\u0000\u0000M4\u0001\u0000\u0000\u0000M9\u0001\u0000\u0000\u0000MD\u0001"+
		"\u0000\u0000\u0000N\u0004\u0001\u0000\u0000\u0000OP\u0005:\u0000\u0000"+
		"P\u0006\u0001\u0000\u0000\u0000QS\b\u0000\u0000\u0000RQ\u0001\u0000\u0000"+
		"\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000U\b\u0001\u0000\u0000\u0000VX\u0007\u0001\u0000\u0000WV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0006\u0004\u0000"+
		"\u0000\\\n\u0001\u0000\u0000\u0000\u0004\u0000MTY\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}