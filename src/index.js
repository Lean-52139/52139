import antlr4 from 'antlr4';
import metadataLexer from '../generated/metadataLexer.js';
import metadataParser from '../generated/metadataParser.js';
import CustomMetadataVisitor from './CustomMetadataVisitor.js';
import fs from 'fs';

const input = fs.readFileSync('./input.txt', 'utf-8');

console.log("\n=== Análisis Léxico ===");
const inputStream = new antlr4.InputStream(input);
const lexer = new metadataLexer(inputStream);
let token;
console.log("--------------------------------------------------");
console.log("| Línea | Lexema                          | Token         |");
console.log("--------------------------------------------------");
lexer.reset();
while ((token = lexer.nextToken()).type !== antlr4.Token.EOF) {
  const typeName = metadataLexer.symbolicNames[token.type] ?? "(desconocido)";
  console.log(`| ${token.line.toString().padEnd(5)} | ${token.text.padEnd(30)} | ${typeName.padEnd(12)} |`);
}
console.log("--------------------------------------------------\n");

// Análisis sintáctico
console.log("=== Análisis Sintáctico ===");
lexer.reset();
const tokens = new antlr4.CommonTokenStream(lexer);
const parser = new metadataParser(tokens);
parser.buildParseTrees = true;
const tree = parser.programa();

if (parser._syntaxErrors > 0) {
  console.log("Errores sintácticos encontrados.");
} else {
  console.log("Entrada válida sin errores sintácticos.");
}

// Árbol de análisis sintáctico
console.log("\n=== Árbol de Análisis Sintáctico ===");
console.log(tree.toStringTree(parser.ruleNames));

// Interpretación y traducción a JavaScript
console.log("\n=== Interpretación ===");
const visitor = new CustomMetadataVisitor();
const metadata = visitor.visit(tree);

console.log("\n=== Traducción a JavaScript ===");
let js = "const archivoMetadata = `";
for (const [k, v] of Object.entries(metadata)) {
  js += `${k}: ${v}; `;
}
js += "`;\nconsole.log(archivoMetadata);";
console.log(js);