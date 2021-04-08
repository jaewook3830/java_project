package ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex09 {
	public static void main(String[] args) {
		// c:\\study\\util\\test100.txt ���Ͼȿ�
		// �̸� : 000
		// ���� : 00
		// ��ȭ��ȣ : 000-0000-0000��
		// �ۼ��ϴ� �ڵ��� �Ͻÿ�
		
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"test100.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			String msg = "�̸� : �����\n���� : 26\n��ȭ��ȣ : 010-5579-9425";
			byte[] b = msg.getBytes();
			fos.write(b);
			fos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e) {
				
			}
		}
	}
}