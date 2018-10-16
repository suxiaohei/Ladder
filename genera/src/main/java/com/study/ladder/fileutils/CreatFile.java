package com.study.ladder.fileutils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CreatFile {

	public static void main(String[] args){
		
		File file = new File("D:\\test.txt");
		if(file.exists()){
			file.delete();
		}
		try {
//			FileInputStream fileInputStram = new FileInputStream(file);
			FileOutputStream fileOutPutStream = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
