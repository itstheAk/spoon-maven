package com.spoon.demo.spoon_demo;

import spoon.Launcher;

public class SpoonASTViewer extends Launcher {

	public static void main(String[] args) {
		SpoonASTViewer viewer =  new SpoonASTViewer();
		viewer.showGUI("E:\\git_repo\\spoon-maven\\spoon-demo\\src\\main\\java\\com\\spoon\\demo\\spoon_demo\\SpoonASTViewer.java");
	}
	
	public void showGUI(String javaFilePath) {
		String[] args = new String[] {"-g", "-i", javaFilePath};
		super.run(args);
	}

}
