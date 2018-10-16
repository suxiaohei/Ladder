package com.study.ladder.thread.callback;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CallbackDigest implements Runnable{

	private File inputFile;
	
	public CallbackDigest(File input){
		this.inputFile = input;
	}
	
	@Override
	public void run() {
		try {
			FileInputStream in = new FileInputStream(inputFile);
			MessageDigest sha = MessageDigest.getInstance("MD5");
			DigestInputStream din = new DigestInputStream(in,sha);
			int b;
			while((b = din.read()) != -1);
			din.close();
			byte[] digest = sha.digest();
			CallbackDigestUserInterface.receiveDigest(digest, inputFile.getName());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
