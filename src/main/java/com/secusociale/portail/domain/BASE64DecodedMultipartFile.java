package com.secusociale.portail.domain;

import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Decoder;

import java.io.*;
import java.util.Date;

public class BASE64DecodedMultipartFile implements MultipartFile {

    private final byte[] imgContent;
    private final String header;
    private static String typeFile;

    private static String typeContent;
    public BASE64DecodedMultipartFile(byte[] imgContent, String header,String typeFile) {
        this.imgContent = imgContent;
        this.header = header.split(";")[0];
        BASE64DecodedMultipartFile.typeFile = typeFile;

    }

    @Override
    public String getName() {
        // TODO - implementation depends on your requirements
        return System.currentTimeMillis() + Math.random() + "." + header.split("/")[1];
    }

    @Override
    public String getOriginalFilename() {
        // TODO - implementation depends on your requirements
       // return System.currentTimeMillis() + (int) Math.random() * 10000 + "." + header.split("/")[1];

        return BASE64DecodedMultipartFile.typeFile + ".pdf";
    }

    @Override
    public String getContentType() {
        // TODO - implementation depends on your requirements
        BASE64DecodedMultipartFile.typeContent = header.split(":")[1];
        return header.split(":")[1];
    }

    @Override
    public boolean isEmpty() {
        return imgContent == null || imgContent.length == 0;
    }

    @Override
    public long getSize() {
        return imgContent.length;
    }

    @Override
    public byte[] getBytes() throws IOException {
        return imgContent;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new ByteArrayInputStream(imgContent);
    }

    @Override
    public void transferTo(File dest) throws IOException, IllegalStateException {
        new FileOutputStream(dest).write(imgContent);
    }

    /**
     * base64转MultipartFile文件
     *
     * @param base64
     * @return
     */
    public static MultipartFile base64ToMultipart(String base64,String typeFile) {
        try {
            BASE64Decoder decoder = new BASE64Decoder();
            byte[] b = new byte[0];
            b = decoder.decodeBuffer(base64);

            for (int i = 0; i < b.length; ++i) {
                if (b[i] < 0) {
                    b[i] += 256;
                }
            }

            return new BASE64DecodedMultipartFile(b, base64,typeFile+" "+new Date().getTime());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
