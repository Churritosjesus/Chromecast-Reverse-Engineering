import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class aen
{
  public long a;
  public String b;
  public String c;
  public long d;
  public long e;
  public long f;
  public long g;
  public Map h;
  
  private aen() {}
  
  public aen(String paramString, adh paramadh)
  {
    this.b = paramString;
    this.a = paramadh.a.length;
    this.c = paramadh.b;
    this.d = paramadh.c;
    this.e = paramadh.d;
    this.f = paramadh.e;
    this.g = paramadh.f;
    this.h = paramadh.g;
  }
  
  public static aen a(InputStream paramInputStream)
  {
    aen localaen = new aen();
    if (aem.a(paramInputStream) != 538247942) {
      throw new IOException();
    }
    localaen.b = aem.c(paramInputStream);
    localaen.c = aem.c(paramInputStream);
    if (localaen.c.equals("")) {
      localaen.c = null;
    }
    localaen.d = aem.b(paramInputStream);
    localaen.e = aem.b(paramInputStream);
    localaen.f = aem.b(paramInputStream);
    localaen.g = aem.b(paramInputStream);
    localaen.h = aem.d(paramInputStream);
    return localaen;
  }
  
  public final boolean a(OutputStream paramOutputStream)
  {
    Object localObject;
    boolean bool;
    try
    {
      aem.a(paramOutputStream, 538247942);
      aem.a(paramOutputStream, this.b);
      if (this.c == null)
      {
        localObject = "";
        aem.a(paramOutputStream, (String)localObject);
        aem.a(paramOutputStream, this.d);
        aem.a(paramOutputStream, this.e);
        aem.a(paramOutputStream, this.f);
        aem.a(paramOutputStream, this.g);
        localObject = this.h;
        if (localObject == null) {
          break label171;
        }
        aem.a(paramOutputStream, ((Map)localObject).size());
        Iterator localIterator = ((Map)localObject).entrySet().iterator();
        while (localIterator.hasNext())
        {
          localObject = (Map.Entry)localIterator.next();
          aem.a(paramOutputStream, (String)((Map.Entry)localObject).getKey());
          aem.a(paramOutputStream, (String)((Map.Entry)localObject).getValue());
          continue;
          return bool;
        }
      }
    }
    catch (IOException paramOutputStream)
    {
      aeg.b("%s", new Object[] { paramOutputStream.toString() });
      bool = false;
    }
    for (;;)
    {
      localObject = this.c;
      break;
      label171:
      aem.a(paramOutputStream, 0);
      paramOutputStream.flush();
      bool = true;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */