package com.bchetty.flyingSaucer.filter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 *
 * @author b.chetty
 */
public class ContentCaptureServletResponse extends HttpServletResponseWrapper {
    private ByteArrayOutputStream contentBuffer;
    private PrintWriter writer;

    public ContentCaptureServletResponse(HttpServletResponse originalResponse) {
        super(originalResponse);
    }

    @Override
    public PrintWriter getWriter() throws IOException {
        if (writer == null) {
            contentBuffer = new ByteArrayOutputStream();
            writer = new PrintWriter(contentBuffer);
        }
        return writer;
    }

    public String getContent() {
        writer.flush();
        String xhtmlContent = new String(contentBuffer.toByteArray());
        xhtmlContent = xhtmlContent.replaceAll("<thead>|</thead>|" + "<tbody>|</tbody>", "");
        return xhtmlContent;
    }
}
