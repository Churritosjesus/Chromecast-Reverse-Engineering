import android.net.Uri;
import android.text.TextUtils;
import android.util.Xml;
import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class ayl
  extends bfd
{
  private Uri a;
  private aym b;
  private List g;
  private final blp h;
  
  public ayl(Uri paramUri, aym paramaym)
  {
    this.a = paramUri;
    this.b = paramaym;
    this.h = new blp("GetDeviceDescriptorRequest", false);
  }
  
  private void a(XmlPullParser paramXmlPullParser)
  {
    paramXmlPullParser.require(2, null, "root");
    while (paramXmlPullParser.next() != 3) {
      if (paramXmlPullParser.getEventType() == 2) {
        if (paramXmlPullParser.getName().equals("device"))
        {
          paramXmlPullParser.require(2, null, "device");
          while (paramXmlPullParser.next() != 3) {
            if (paramXmlPullParser.getEventType() == 2)
            {
              Object localObject = paramXmlPullParser.getName();
              if (((String)localObject).equalsIgnoreCase("friendlyName"))
              {
                this.b.c = a.b(paramXmlPullParser);
              }
              else if (((String)localObject).equalsIgnoreCase("modelName"))
              {
                this.b.d = a.b(paramXmlPullParser);
              }
              else if (((String)localObject).equalsIgnoreCase("UDN"))
              {
                String str = a.b(paramXmlPullParser);
                localObject = str;
                if (str.startsWith("uuid:")) {
                  localObject = str.substring(5);
                }
                this.b.a = ((String)localObject);
              }
              else if (((String)localObject).equalsIgnoreCase("serviceList"))
              {
                this.g = new ArrayList();
                paramXmlPullParser.require(2, null, "serviceList");
                while (paramXmlPullParser.next() != 3) {
                  if (paramXmlPullParser.getEventType() == 2) {
                    if (paramXmlPullParser.getName().equalsIgnoreCase("service")) {
                      b(paramXmlPullParser);
                    } else {
                      a.a(paramXmlPullParser);
                    }
                  }
                }
              }
              else if (((String)localObject).equalsIgnoreCase("iconList"))
              {
                c(paramXmlPullParser);
              }
              else
              {
                a.a(paramXmlPullParser);
              }
            }
          }
        }
        else
        {
          a.a(paramXmlPullParser);
        }
      }
    }
  }
  
  private void b(XmlPullParser paramXmlPullParser)
  {
    paramXmlPullParser.require(2, null, "service");
    while (paramXmlPullParser.next() != 3) {
      if (paramXmlPullParser.getEventType() == 2)
      {
        Object localObject = paramXmlPullParser.getName();
        if (((String)localObject).equalsIgnoreCase("serviceType"))
        {
          this.g.add(a.b(paramXmlPullParser));
        }
        else if (((String)localObject).equalsIgnoreCase("SCPDURL"))
        {
          localObject = this.b;
          a.b(paramXmlPullParser);
        }
        else
        {
          a.a(paramXmlPullParser);
        }
      }
    }
  }
  
  private void c(XmlPullParser paramXmlPullParser)
  {
    paramXmlPullParser.require(2, null, "iconList");
    ArrayList localArrayList = new ArrayList(1);
    while (paramXmlPullParser.next() != 3) {
      if (paramXmlPullParser.getEventType() == 2) {
        if (paramXmlPullParser.getName().equalsIgnoreCase("icon"))
        {
          ayo localayo = d(paramXmlPullParser);
          if (localayo != null) {
            localArrayList.add(localayo);
          }
        }
        else
        {
          a.a(paramXmlPullParser);
        }
      }
    }
    this.b.f = localArrayList;
  }
  
  private ayo d(XmlPullParser paramXmlPullParser)
  {
    Object localObject = null;
    int k = 0;
    paramXmlPullParser.require(2, null, "icon");
    int j = 0;
    int i = 0;
    String str1 = null;
    while (paramXmlPullParser.next() != 3) {
      if (paramXmlPullParser.getEventType() == 2)
      {
        String str2 = paramXmlPullParser.getName();
        if (str2.equalsIgnoreCase("width")) {
          i = Integer.parseInt(a.b(paramXmlPullParser));
        } else if (str2.equalsIgnoreCase("height")) {
          j = Integer.parseInt(a.b(paramXmlPullParser));
        } else if (str2.equalsIgnoreCase("depth")) {
          k = Integer.parseInt(a.b(paramXmlPullParser));
        } else if (str2.equalsIgnoreCase("url")) {
          str1 = a.b(paramXmlPullParser);
        } else {
          a.a(paramXmlPullParser);
        }
      }
    }
    paramXmlPullParser = (XmlPullParser)localObject;
    if (!TextUtils.isEmpty(str1))
    {
      paramXmlPullParser = (XmlPullParser)localObject;
      if (i > 0)
      {
        paramXmlPullParser = (XmlPullParser)localObject;
        if (j > 0) {
          if (k > 0) {
            break label174;
          }
        }
      }
    }
    label174:
    for (paramXmlPullParser = (XmlPullParser)localObject;; paramXmlPullParser = new ayo(i, j, Uri.parse(URI.create(this.a.toString()).resolve(str1).toString()))) {
      return paramXmlPullParser;
    }
  }
  
  public final int a()
  {
    int i = -1;
    try
    {
      localObject = a(this.a, c);
      if (((bfq)localObject).b() != 200) {}
      for (;;)
      {
        return i;
        bfc localbfc = ((bfq)localObject).c();
        localObject = ((bfq)localObject).a("application-url");
        if (localObject == null)
        {
          i = -3;
        }
        else
        {
          this.b.e = Uri.parse((String)localObject);
          if (!this.f) {
            break;
          }
          i = -99;
        }
      }
    }
    catch (TimeoutException localTimeoutException)
    {
      for (;;)
      {
        Object localObject;
        i = -2;
        continue;
        if ((localTimeoutException == null) || (!"application/xml".equals(localTimeoutException.b))) {
          i = -3;
        } else if (localTimeoutException.a() == null) {
          i = -3;
        } else {
          try
          {
            localObject = Xml.newPullParser();
            StringReader localStringReader = new java/io/StringReader;
            localStringReader.<init>(localTimeoutException.a());
            ((XmlPullParser)localObject).setInput(localStringReader);
            ((XmlPullParser)localObject).nextTag();
            a((XmlPullParser)localObject);
            i = 0;
          }
          catch (IOException localIOException1)
          {
            i = -3;
          }
          catch (XmlPullParserException localXmlPullParserException)
          {
            i = -3;
          }
        }
      }
    }
    catch (IOException localIOException2)
    {
      for (;;) {}
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ayl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */