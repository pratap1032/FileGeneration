package com.ppt;

import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.model.TextBox;
import org.apache.poi.hslf.usermodel.SlideShow;
import java.io.*;


public class CreatePPT
{
	public static void main(String str[])
	{
		try{
			SlideShow slideShow = new SlideShow();
			Slide slide = slideShow.createSlide();
			TextBox txt = new TextBox();
			txt.setText("Pratap Raj");
			txt.setRotation(12);
			slide.addShape(txt);
			FileOutputStream out = new FileOutputStream("slideshow.ppt");
			slideShow.write(out);
			out.close();
		}catch(Exception e){}}
}