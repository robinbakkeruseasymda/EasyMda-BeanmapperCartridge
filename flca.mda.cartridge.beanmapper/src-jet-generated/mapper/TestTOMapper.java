package mapper;

import java.util.*;
import flca.mda.api.util.*;
import mda.template.*;
import mda.template.type.*;
import flca.mda.codegen.data.*;

public class TestTOMapper
{
  protected static String nl;
  public static synchronized TestTOMapper create(String lineSeparator)
  {
    nl = lineSeparator;
    TestTOMapper result = new TestTOMapper();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/* generated with BeanMapper */" + NL + "" + NL + "package ";
  protected final String TEXT_3 = ";" + NL + " ";
  protected final String TEXT_4 = NL + "  " + NL;
  protected final String TEXT_5 = NL + NL + "public class ";
  protected final String TEXT_6 = " extends AbstractTestBeanMapper {" + NL + "" + NL + "\tprivate static final byte SHEET1 = 0;" + NL + "" + NL + "\t/*" + NL + "\t* Run this test once than move the generated excel files to src/test/resource and fill with testdata" + NL + "\t*/" + NL + "\t@Test " + NL + "\tpublic void makeExcelTemplates() {";
  protected final String TEXT_7 = NL + "\t\tXlsxDataWriter.writeXlsxFile(\"/tmp/";
  protected final String TEXT_8 = ".xlsx\", ";
  protected final String TEXT_9 = ");" + NL + "\t\tXlsxDataWriter.writeXlsxFile(\"/tmp/";
  protected final String TEXT_10 = ".xlsx\", ";
  protected final String TEXT_11 = ");" + NL + "\t}" + NL + "\t\t" + NL + "\t@Override" + NL + "\tprotected Set<String> ignoreMapToEntityProperties() {" + NL + "\t\tSet<String> result = new HashSet<>();" + NL + "\t\treturn result;" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tprotected Set<String> ignoreMapFromEntityProperties() {" + NL + "\t\tSet<String> result = new HashSet<>();" + NL + "\t\treturn result;" + NL + "\t}" + NL + "" + NL + "\t@Test" + NL + "\tpublic void testMapToEntity() {" + NL + "\t\t";
  protected final String TEXT_12 = " ";
  protected final String TEXT_13 = "1 =(";
  protected final String TEXT_14 = ") populate(";
  protected final String TEXT_15 = ".class);" + NL + "\t\t";
  protected final String TEXT_16 = " ";
  protected final String TEXT_17 = " = ";
  protected final String TEXT_18 = ".mapFromEntity(";
  protected final String TEXT_19 = "1);" + NL + "\t\t";
  protected final String TEXT_20 = " ";
  protected final String TEXT_21 = "2 = ";
  protected final String TEXT_22 = ".mapToEntity(";
  protected final String TEXT_23 = ");" + NL + "\t\ttestEquals(";
  protected final String TEXT_24 = "1, ";
  protected final String TEXT_25 = "2, ignoreMapToEntityProperties());" + NL + "\t}" + NL + "" + NL + "\t@Test" + NL + "\tpublic void testMapFromEntity() {" + NL + "\t\t";
  protected final String TEXT_26 = " ";
  protected final String TEXT_27 = "1 =(";
  protected final String TEXT_28 = ") populate(";
  protected final String TEXT_29 = ".class);" + NL + "\t\t";
  protected final String TEXT_30 = " ";
  protected final String TEXT_31 = "1 = ";
  protected final String TEXT_32 = ".mapToEntity(";
  protected final String TEXT_33 = "1);" + NL + "\t\t";
  protected final String TEXT_34 = " ";
  protected final String TEXT_35 = "2 = ";
  protected final String TEXT_36 = ".mapFromEntity(";
  protected final String TEXT_37 = "1);" + NL + "\t\ttestEquals(";
  protected final String TEXT_38 = "1, ";
  protected final String TEXT_39 = "2, ignoreMapFromEntityProperties());" + NL + "\t}" + NL + "\t" + NL + "}";
  protected final String TEXT_40 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     	// here we parse the input argument(s) and create the object JetArgument:arg and Object[]:args
	JetArgument arg = null;
	Object args[] = null;

	if (argument != null) { 
		if (argument instanceof JetArgument) {
			arg = (JetArgument) argument;
		} else if (argument.getClass().isArray()) { 
			args = (Object[]) argument;
			if (args[0] instanceof JetArgument) {
				arg = (JetArgument) args[0];
			}
		}
	} 

     BeanMapperTypeUtils tu = new BeanMapperTypeUtils();
     NameUtils nu = new NameUtils();
     TemplateUtils tplu = new TemplateUtils();
     InterfaceUtils iu = new InterfaceUtils(); 
     AppUtils au = new AppUtils(); 
     Object element = arg.getElement(); 
     Class cc = element.getClass(); 
     String classname = nu.getCurrentClassname();
     String pck = nu.getCurrentPackage();
     GetFieldsModus EXC = GetFieldsModus.EXCLUDE; 
     GetFieldsModus INC = GetFieldsModus.INCLUDE; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(pck);
    stringBuffer.append(TEXT_3);
     	ImportUtils impu = new ImportUtils(); 
   	StringBuffer importStringBuffer = stringBuffer;
   	int importInsertionPoint = stringBuffer.length();
   	impu.addCompilationUnitImports(stringBuffer.toString()); 
 
    stringBuffer.append(TEXT_4);
     Class toClass = cc; 
     String toClassname = toClass.getSimpleName(); 
     Class entityClass = (Class) args[1]; 
     String entityClassname = entityClass.getSimpleName(); 
     List<Fw> toFws = tu.getFields(toClass, EXC, FwSelectType.ID); 
     List<Fw> entityFws = tu.getFields(entityClass, EXC, FwSelectType.ID); 
     String toUncapname = nu.uncapName(toClassname); 
     String entityUncapname = nu.uncapName(entityClassname); 
     String mapper = toClassname + "Mapper"; //tplu.getClassName(TidBeanMapper.BEANMAPPER_TO.name()); 
     impu.addImport(toClass);
     impu.addImport(entityClass);
     impu.addImport("org.junit.Test"); 
     impu.addImport("java.util.HashSet"); 
     impu.addImport("java.util.Set"); 
     impu.addImport("nl.apg.util.mapper.AbstractTestBeanMapper"); 
     impu.addImport("flca.xlsx.util.XlsxDataWriter");  
     impu.addImport("flca.xlsx.util.Xlsx");  
    stringBuffer.append(TEXT_5);
    stringBuffer.append(classname);
    stringBuffer.append(TEXT_6);
     String entitynames = "";  String tonames = ""; 
     for (NestedObject no : tu.getNestedObjects(entityClass).getNestedObjects()) { 
    	entitynames += no.getNestedType().getSimpleName() + ","; 
     } 
     for (NestedObject no : tu.getNestedObjects(cc).getNestedObjects()) { 
    	tonames += no.getNestedType().getSimpleName() + ","; 
     } 
    stringBuffer.append(TEXT_7);
    stringBuffer.append(entityClassname);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(entitynames);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(toClassname);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(tonames);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(entityClassname);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(entityUncapname);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(entityClassname);
    stringBuffer.append(TEXT_14);
    stringBuffer.append(entityClassname);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(toClassname);
    stringBuffer.append(TEXT_16);
    stringBuffer.append(toUncapname);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(mapper);
    stringBuffer.append(TEXT_18);
    stringBuffer.append(entityUncapname);
    stringBuffer.append(TEXT_19);
    stringBuffer.append(entityClassname);
    stringBuffer.append(TEXT_20);
    stringBuffer.append(entityUncapname);
    stringBuffer.append(TEXT_21);
    stringBuffer.append(mapper);
    stringBuffer.append(TEXT_22);
    stringBuffer.append(toUncapname);
    stringBuffer.append(TEXT_23);
    stringBuffer.append(entityUncapname);
    stringBuffer.append(TEXT_24);
    stringBuffer.append(entityUncapname);
    stringBuffer.append(TEXT_25);
    stringBuffer.append(toClassname);
    stringBuffer.append(TEXT_26);
    stringBuffer.append(toUncapname);
    stringBuffer.append(TEXT_27);
    stringBuffer.append(toClassname);
    stringBuffer.append(TEXT_28);
    stringBuffer.append(toClassname);
    stringBuffer.append(TEXT_29);
    stringBuffer.append(entityClassname);
    stringBuffer.append(TEXT_30);
    stringBuffer.append(entityUncapname);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(mapper);
    stringBuffer.append(TEXT_32);
    stringBuffer.append(toUncapname);
    stringBuffer.append(TEXT_33);
    stringBuffer.append(toClassname);
    stringBuffer.append(TEXT_34);
    stringBuffer.append(toUncapname);
    stringBuffer.append(TEXT_35);
    stringBuffer.append(mapper);
    stringBuffer.append(TEXT_36);
    stringBuffer.append(entityUncapname);
    stringBuffer.append(TEXT_37);
    stringBuffer.append(toUncapname);
    stringBuffer.append(TEXT_38);
    stringBuffer.append(toUncapname);
    stringBuffer.append(TEXT_39);
     importStringBuffer.insert(importInsertionPoint,  impu.computeSortedImports());
    stringBuffer.append(TEXT_40);
    return stringBuffer.toString();
  }
}
