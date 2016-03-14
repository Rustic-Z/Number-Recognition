import java.io.File;

import com.asprise.ocr.Ocr;

/**
 * Asprise Java OCR实现图像数字识别demo
 * @author zhangchao
 */
public class AspriseOCR {
	public static void main(String[] args) {
		Ocr.setUp(); // one time setup
		Ocr ocr = new Ocr(); // create a new OCR engine
		ocr.startEngine("eng", Ocr.SPEED_FASTEST); // English
		String s = ocr.recognize(new File[] {new File("/home/zhangchao/下载/3115d4499f24491d/1374-2617-147302.jpg")},
				  Ocr.RECOGNIZE_TYPE_TEXT, Ocr.OUTPUT_FORMAT_PLAINTEXT); // PLAINTEXT | XML | PDF | RTF
//		String s = ocr.recognize(new File[] {new File("/home/zhangchao/workspace/DigitRecognition/original/1/downloa宿舍d.jpg")},
//				  Ocr.RECOGNIZE_TYPE_ALL, Ocr.OUTPUT_FORMAT_PLAINTEXT); // PLAINTEXT | XML | PDF | RTF
		System.out.println("Result: " + s);
		ocr.stopEngine();
	}

}
