package edu.ucsd.cs.triton.codegen.language;

public class JavaProgram extends BaseJavaStatement {
	
	private final String _programName;
	
	public JavaProgram(final String programName) {
		_programName = programName;
		_parent = null;
	}

	public ImportStatement newImport() {
		ImportStatement stmt = new ImportStatement();
		addChild(stmt);
		return stmt;
	}

	public ClassStatement newClass() {
		ClassStatement stmt = new ClassStatement(_programName);
		addChild(stmt);
	  return stmt;
  }
	
	public JavaProgram addSimpleStatement(final String stmt) {
		addChild(new SimpleStatement(stmt));
		return this;
	}
	
	@Override
  protected void translate(String prefix, LanguageBuilder sb) {
	  // TODO Auto-generated method stub
		childrenTranslate(prefix, sb);
  }
}