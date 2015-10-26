import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

class brx
  extends bqz
{
  private bry a;
  
  public brx(brb parambrb, bry parambry)
  {
    super(parambrb);
    this.a = parambry;
  }
  
  private bb a(XmlResourceParser paramXmlResourceParser)
  {
    for (;;)
    {
      try
      {
        paramXmlResourceParser.next();
        i = paramXmlResourceParser.getEventType();
        if (i == 1) {
          continue;
        }
        if (paramXmlResourceParser.getEventType() == 2)
        {
          str1 = paramXmlResourceParser.getName().toLowerCase();
          if (!str1.equals("screenname")) {
            continue;
          }
          str1 = paramXmlResourceParser.getAttributeValue(null, "name");
          str2 = paramXmlResourceParser.nextText().trim();
          if (!TextUtils.isEmpty(str1)) {
            TextUtils.isEmpty(str2);
          }
        }
      }
      catch (XmlPullParserException paramXmlResourceParser)
      {
        e("Error parsing tracker configuration file", paramXmlResourceParser);
        return this.a.a();
        if (!str1.equals("bool")) {
          continue;
        }
        String str2 = paramXmlResourceParser.getAttributeValue(null, "name");
        str1 = paramXmlResourceParser.nextText().trim();
        if (TextUtils.isEmpty(str2)) {
          continue;
        }
        bool = TextUtils.isEmpty(str1);
        if (bool) {
          continue;
        }
        try
        {
          bool = Boolean.parseBoolean(str1);
          this.a.a(str2, bool);
        }
        catch (NumberFormatException localNumberFormatException1)
        {
          c("Error parsing bool configuration value", str1, localNumberFormatException1);
        }
        continue;
      }
      catch (IOException paramXmlResourceParser)
      {
        int i;
        e("Error parsing tracker configuration file", paramXmlResourceParser);
        continue;
        if (!str1.equals("integer")) {
          continue;
        }
        String str3 = paramXmlResourceParser.getAttributeValue(null, "name");
        String str1 = paramXmlResourceParser.nextText().trim();
        if (TextUtils.isEmpty(str3)) {
          continue;
        }
        boolean bool = TextUtils.isEmpty(str1);
        if (bool) {
          continue;
        }
        try
        {
          i = Integer.parseInt(str1);
          this.a.a(str3, i);
        }
        catch (NumberFormatException localNumberFormatException2)
        {
          c("Error parsing int configuration value", str1, localNumberFormatException2);
        }
        continue;
      }
      i = paramXmlResourceParser.next();
      continue;
      if (!str1.equals("string")) {
        continue;
      }
      str1 = paramXmlResourceParser.getAttributeValue(null, "name");
      str2 = paramXmlResourceParser.nextText().trim();
      if ((!TextUtils.isEmpty(str1)) && (str2 != null)) {
        this.a.a(str1, str2);
      }
    }
  }
  
  public final bb a(int paramInt)
  {
    try
    {
      bb localbb = a(this.d.b.getResources().getXml(paramInt));
      return localbb;
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      for (;;)
      {
        d("inflate() called with unknown resourceId", localNotFoundException);
        Object localObject = null;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\brx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */