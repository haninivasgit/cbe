package com.test.pattern.strategy;

import java.io.File;
import java.util.ArrayList;

public class RarCompression implements ICompression {
	public void compressFiles(ArrayList<File> files) {
		System.out.println( "RARCompression Test");
	}

}
