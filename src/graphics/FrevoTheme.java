package graphics;

import java.awt.Font;

import javax.swing.plaf.metal.OceanTheme;

public class FrevoTheme extends OceanTheme {

	public String getName() { return "Frevo"; }
	public Font blueprintFont;
	
	public FrevoTheme() {
		super();
	/*	try {
			blueprintFont = Font.createFont(Font.TRUETYPE_FONT, new File("./Drawable/blueprintextended.ttf"));
			blueprintFont = blueprintFont.deriveFont(Font.BOLD,12);
			System.out.println(blueprintFont.getFontName());
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}
	
	//public FontUIResource getWindowTitleFont() { return fWindowTitleFont;}
	//	public FontUIResource getControlTextFont() { return new FontUIResource(blueprintFont);}
    //public FontUIResource getSystemTextFont() { return fWindowTitleFont;}
    //public FontUIResource getUserTextFont() { return fWindowTitleFont;}
    //public FontUIResource getMenuTextFont() { return fWindowTitleFont;}
	
	//private final FontUIResource fWindowTitleFont = new FontUIResource(blueprintFont);
}
