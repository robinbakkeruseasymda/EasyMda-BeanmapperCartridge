package test;

import mda.template.BeanMapperConstants;
import mda.template.TidBeanMapper;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import test.data.BeanMapperData;

import com.flca.mda.codegen.helpers.LogHelper;

import flca.mda.codegen.CodegenConstants;
import flca.mda.test.Model;
import flca.test.base.AbstractTestTemplates;

public class TestBeanMapperTemplates extends AbstractTestTemplates {
	@BeforeClass
	public static void beforeOnce() {
		AbstractTestTemplates.beforeOnceBase(new BeanMapperData());
		System.setProperty(CodegenConstants.OVERWRITE_WITHOUT_MERGING, "true");
	}

	@AfterClass
	public static void afterOnce() {
		if (LogHelper.getLogbackErrorCount() > startLogbackErrorCount) {
			System.err.println("errors encountered see logfile ");
		}
	}

	// @SuppressWarnings("unused")
	@Test
	public void testTemplates() {
		Class<?> classes[] = new Class<?>[] { Model.class, };

		for (Class<?> c : classes) {
			 generate(c, BeanMapperConstants.getTemplate(TidBeanMapper.BEANMAPPERS ));
		}
	}

}
