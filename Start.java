package test;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.apache.commons.io.FileUtils;

public class Start {

	public static void main(String[] args) throws IOException {
		//GBK编码格式源码路径 
		String srcDirPath = "D:\\#2000 Work\\23.深银联\\YBSNoCardPayment_V1.1.0"; 
		//转为UTF-8编码格式源码路径 
		String utf8DirPath = "D:\\#2000 Work\\23.深银联\\new com2"; 
		        
		//获取所有java文件 
		Collection<File> javaGbkFileCol =  FileUtils.listFiles(new File(srcDirPath), new String[]{"java"}, true); 
		        
		for (File javaGbkFile : javaGbkFileCol) { 
		      //UTF8格式文件路径 
		      String utf8FilePath = utf8DirPath+javaGbkFile.getAbsolutePath().substring(srcDirPath.length()); 
		       //使用GBK读取数据，然后用UTF-8写入数据 
		      FileUtils.writeLines(new File(utf8FilePath), "UTF-8", FileUtils.readLines(javaGbkFile, "GBK"));        
		}
		

		
	}
}
