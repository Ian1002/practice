package com.ian.practice.itext;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

/**
 * CreatePdf
 *
 * @author YangJing
 * @date 2018/10/19 16:16
 */
public class CreatePdf {

    public static void main(String[] args) {
        Document doc = null;
        try {
            doc = new Document();
            PdfWriter.getInstance(doc, new FileOutputStream("E:\\itext.pdf"));
            doc.open();
            doc.addTitle("测试标题");
            doc.addAuthor("gie");
            doc.addCreationDate();
            doc.addSubject("测试主题");
            // itext 中文的处理
            BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
            Font FontChinese = new Font(bfChinese, 12, Font.NORMAL);
            Paragraph pragraph = new Paragraph("你好", FontChinese);
            doc.add(pragraph);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            doc.close();
        }
    }
}
