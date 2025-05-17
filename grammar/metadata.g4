grammar metadata;

programa     : campo* EOF ;
campo        : NOMBRECAMPO COLON VALOR finCampo ;

NOMBRECAMPO
    : 'nombre'
    | 'tipo'
    | 'tamano'
    | 'tamaño'
    | 'creado'
    | 'modificado'
    | 'autor'
    | 'descripcion'
    | 'etiquetas'
    ;

COLON        : ':' ;
finCampo     : ';' ;

// Valor: cualquier cosa menos salto de línea, punto y coma o dos puntos
VALOR        : ~[:;\r\n]+ ;

WS           : [ \t\r\n]+ -> skip ;