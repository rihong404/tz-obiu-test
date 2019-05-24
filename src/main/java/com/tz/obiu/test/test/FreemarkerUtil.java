package com.tz.obiu.test.test;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.StringWriter;
import java.net.URLDecoder;
import java.util.zip.ZipOutputStream;



@Slf4j
public class FreemarkerUtil {

    /**
     * 获取模板内容
     * @param <E>
     *
     * @param template 模板文件
     * @param map      模板参数
     * @return 渲染后的模板内容
     * @throws IOException       IOException
     * 
     * @throws TemplateException TemplateException
     */
    public static String getTemplate(String template, Object obj) throws IOException, TemplateException {
    	
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_27);
        
//      String templatePath = "/com/dx/business/print/template";
        String templatePath = "/templates";
        templatePath = URLDecoder.decode(templatePath, "UTF-8");
        log.info("FreemarkerUtil template  = " + template);
        log.debug("templatePath = " + templatePath);
        cfg.setClassForTemplateLoading(FreemarkerUtil.class, templatePath);
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        cfg.setLogTemplateExceptions(false);
        cfg.setWrapUncheckedExceptions(true);
        
        Template temp = cfg.getTemplate(template);
        
        StringWriter stringWriter = new StringWriter();
        temp.process(obj, stringWriter);
        return stringWriter.toString();
    }
}