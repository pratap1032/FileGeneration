package com.ppt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.model.TextRun;
import org.apache.poi.hslf.usermodel.SlideShow;

public class ReadPPT {


	public static void main(String[] args) throws IOException {
		String title="title";
		String name="name";
		String companyName="companyName";
		String pptfile="slideshow.ppt";
		FileInputStream fileInputStream = new FileInputStream(pptfile);
		SlideShow slideShow = new SlideShow(fileInputStream);

		//Slide indexSlide = slideShow.getSlides()[1];

		Slide[] slides = slideShow.getSlides();
		for (Slide slide : slides) {
			TextRun[] textRuns = slide.getTextRuns();
			if (textRuns == null || textRuns.length == 0) {
				continue;
			}
			for (TextRun run : textRuns) {
				String currentText = run.getText();
				if(currentText.equalsIgnoreCase(title)){
					run.setText("ROI v5 tool!!");
				}else if(currentText.equalsIgnoreCase(name)){
					run.setText("Raja");
				}else if(currentText.equalsIgnoreCase(companyName)){
					run.setText("Persistent");
				}
				System.out.println(run.getText());
			}
		}
		 FileOutputStream out = new FileOutputStream("slideshow2.ppt");
		 slideShow.write(out);
		fileInputStream.close();
	}

}