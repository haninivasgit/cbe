package com.test.pattern.strategy;

import java.io.File;
import java.util.ArrayList;

public interface ICompression {

	public void compressFiles(ArrayList<File> files);
}
