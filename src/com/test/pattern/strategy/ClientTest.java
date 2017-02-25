package com.test.pattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class ClientTest {

	public static void main(String[] args) {
		/*Compression ctx = new Compression();
		ctx.setCompressionStrategy(new RarCompression());
		ctx.createArchive(new ArrayList());*/
		
		
		System.out.println(new LoadSlot().setLoadStrategy(4).load(true)) ;
		
		
		
		
		
		
		
		
	}
}
