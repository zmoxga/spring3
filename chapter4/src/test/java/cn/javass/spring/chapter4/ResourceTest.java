package cn.javass.spring.chapter4;

import org.junit.Test;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

public class ResourceTest {

  @Test
  public void testByteArrayResource() {
    Resource resource = new ByteArrayResource("".getBytes());
    if (resource.exists()) {
      dumpStream(resource);
    }
  }

  private void dumpStream(Resource resource) {
    InputStream is = null;
    try {
      is = resource.getInputStream();
      byte[] descBytes = new byte[is.available()];
      is.read(descBytes);
    } catch (IOException ioe) {
      System.out.println(ioe);
      ioe.printStackTrace();
    } finally {
      try {
        is.close();
      } catch (IOException E) {

      }
    }
  }
}