package test.data;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import flca.mda.codegen.data.SubsValue;
import flca.mda.codegen.helpers.ShellUtils;
import flca.test.base.AbstractTestTemplatesData;

public class BeanMapperData extends AbstractTestTemplatesData 
{
	private static final String PLUGIN_DIR = "EasyMda-CoreGenerator/flca.mda.generator";
	private static final String MODEL_DIR = "flca.mda.test.beanmapper";
	private static final String CARTRIDGE_DIR = "EasyMda-BeanmapperCartridge/flca.mda.cartridge.beanmapper";

	@Override
	public File getPluginDir() {
		return new File(currentDir().getParentFile().getParent() + "/" + PLUGIN_DIR);
	}

	@Override
	public File getModelDir() {
		return new File(currentDir().getParent() + "/" + MODEL_DIR);
	}

	@Override
	public File getTemplateDir() {
		return new File(currentDir().getParentFile().getParent() + "/" + CARTRIDGE_DIR);
	}

	protected File currentDir() {
		String currentDir = System.getProperty("user.dir");
		return new File(currentDir);
	}
	
//	@Override
//	public List<ITemplate> getAllTemplates() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public List<SubsValue> getSubsvalues() {
		List<SubsValue> r = new ArrayList<SubsValue>();
		r.add(new SubsValue("App-name", "BeanMapper"));
//		r.add(new SubsValue(CodegenConstants.APP_PACKAGE, "org.demo"));
//		r.add(new SubsValue(BeanMapperConstants.BACKEND, BACKEND_SRC_GEN));
		if (ShellUtils.isLinux()) {
			String basedir = "/tmp/easymda/bean-mapper";
			r.add(new SubsValue("Backend" , basedir));
			
		} else {
			String basedir = "c:/temp/easymda/bean-mapper";
			r.add(new SubsValue("Backend" , basedir));
		}
		
		return r;
	}
}

