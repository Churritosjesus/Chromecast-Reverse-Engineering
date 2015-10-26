import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;

public final class bfb
  extends bfp
{
  String a;
  
  public bfb(String paramString)
  {
    super(paramString);
  }
  
  public final int a()
  {
    int i = -1;
    try
    {
      Object localObject = a("NOTICE.html.gz", c);
      if (((bfq)localObject).b() != 200) {
        return i;
      }
      localObject = ((bfq)localObject).c();
      if (localObject != null)
      {
        byte[] arrayOfByte = ((bfc)localObject).a;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        char[] arrayOfChar = new char['ࠀ'];
        localObject = new java/io/InputStreamReader;
        GZIPInputStream localGZIPInputStream = new java/util/zip/GZIPInputStream;
        ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
        localByteArrayInputStream.<init>(arrayOfByte);
        localGZIPInputStream.<init>(localByteArrayInputStream);
        ((InputStreamReader)localObject).<init>(localGZIPInputStream);
        for (;;)
        {
          int j = ((Reader)localObject).read(arrayOfChar);
          if (j < 0) {
            break;
          }
          localStringBuilder.append(arrayOfChar, 0, j);
        }
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        StringBuilder localStringBuilder;
        continue;
        localIOException.close();
        this.a = localStringBuilder.toString();
        i = 0;
      }
    }
    catch (TimeoutException localTimeoutException)
    {
      for (;;)
      {
        i = -2;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bfb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */