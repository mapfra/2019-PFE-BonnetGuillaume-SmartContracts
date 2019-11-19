package snippet;

public class Snippet {
	grammar org.xtext.example.mydsl.MyDsl with org.eclipse.xtext.common.Terminals
	
	generate myDsl "http://www.xtext.org/example/mydsl/MyDsl"
	
	Domainmodel :
	    (elements+=Type)*;
	  
	Type:
	    DataType | Entity;
	  
	DataType:
	    'datatype' name=ID;
	 
	Entity:
	    'entity' name=ID ('extends' superType=[Entity])? '{'
	        (features+=Feature)*
	    '}';
	 
	Feature:
	    (many?='many')? name=ID ':' type=[Type];
	
}

