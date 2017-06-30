package com.jk.controller;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jk.areaService.RegionService;
import com.jk.model.Json;
import com.jk.model.Region;
import com.jk.service.Area;
import com.jk.service.AreaService;

@Controller
@RequestMapping("AreaController")
public class AreaController extends BaseController{
	
	@Autowired
	private AreaService areaService;
	
	@Autowired
	private RegionService regionService;
	
	/**
	 * <pre>findAreaXml(解析xml，并且批量添加到数据库)   
	 */
	@RequestMapping("findAreaXml")
	public void findAreaXml(Area area1,HttpServletResponse response) throws Exception{
		  areaService.dom4JXml(area1);
		// 创建saxReader对象  
        SAXReader reader = new SAXReader();  
        // 通过read方法读取一个文件 转换成Document对象  
        Document document = reader.read(new File("F://area.xml"));  
        //获取根节点元素对象  
        Element node = document.getRootElement();  
        // 当前节点下面子节点迭代器  
        //Iterator<Element> it = node.elementIterator();
        List<Area> areaList = new ArrayList<>();
        for (Iterator i = node.elementIterator(); i.hasNext();) { 
        	 Element el = (Element) i.next(); 
        	 Area area=new Area();
        	 for(Iterator it = el.attributeIterator();it.hasNext();){ 
        		 Attribute attribute = (Attribute) it.next(); 
        		 //获取结点元素的属性的值  
                 String text=attribute.getName();
                 if(text!=null){
                	 if (text.equals("id")) { 
                		 String  text2= attribute.getText();
                		 area.setId(Integer.parseInt(text2));
                	 }
                	/* if (text.equals("createDate")) {
                		 XMLGregorianCalendar  text3= (XMLGregorianCalendar) attribute.getData();
						area.setCreateDate(text3);
                	 }*/
                	 if (text.equals("fullName")) { 
                		 String  text4= attribute.getText();
                		 area.setFullName(text4);;
                	 }
                	 if (text.equals("name")) {
                		 String  text5= attribute.getText();
                		 area.setName(text5);
                	 }
                	 if (text.equals("parent")) {
                		 String  text6= attribute.getText();
                		 if(!"null".equals(text6)){
                			 area.setParent(Integer.parseInt(text6));
                		 }
                	 }
              	 if (text.equals("orders")) {
                		 String  text7= attribute.getText();
                		if(!"null".equals(text7)){
                			area.setOrders(Integer.parseInt(text7));
                		}
                	 }
                	 if (text.equals("treePath")) {
                		 String  text8= attribute.getText();
                		 area.setTreePath(text8);
                	 }
                	 /*if (text.equals("modifyDate")) {
                		 XMLGregorianCalendar  text9= (XMLGregorianCalendar) attribute.getData();
							area.setModifyDate(text9);
                	 }*/
                 }
        	 }
        	 areaList.add(area);
        }
        System.out.println(areaList.toString());
        regionService.addRegion(areaList);
	}

	/**
	 * <pre>queryS(查询省)   
	 */
	@RequestMapping("queryS")
	public void queryS(HttpServletResponse response){
		Json j=new Json();
		List<Region> regionList=new ArrayList<>();
		regionList=regionService.queryS();
		j.setSuccess(true);
		j.setObject(regionList);
		super.writeJson(j, response);
	}
	/**
	 * <pre>queryShi(查询市县)   
	 */
	@RequestMapping("queryShi")
	public void queryShi(Integer id,HttpServletResponse response){
		Json j=new Json();
		List<Region> shiList=new ArrayList<>();
		shiList = regionService.queryShi(id);
		j.setSuccess(true);
		j.setObject(shiList);
		super.writeJson(j, response);
	}
}
