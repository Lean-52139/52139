import metadataVisitor from "../generated/metadataVisitor.js";

export default class CustomMetadataVisitor extends metadataVisitor {
  constructor() {
    super();
    this.datos = {};
  }

  visitPrograma(ctx) {
    ctx.campo().forEach(campoCtx => this.visit(campoCtx));
    return this.datos;
  }

  visitCampo(ctx) {
    const clave = ctx.NOMBRECAMPO().getText();
    const valor = ctx.VALOR().getText().trim();
    this.datos[clave] = valor;
  }
}