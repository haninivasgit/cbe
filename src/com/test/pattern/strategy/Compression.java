package com.test.pattern.strategy;

import java.io.File;
import java.util.ArrayList;

public class Compression {
	 private ICompression strategy;
	  //this can be set at runtime by the application preferences
	  public void setCompressionStrategy(ICompression strategy) {
	    this.strategy = strategy;
	  }
	  
	  //use the strategy
	  public void createArchive(ArrayList<File> files) {
		  strategy.compressFiles(files);
	  }
}
