import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class dfr
{
  String a;
  String b = "";
  String c = "";
  String d;
  int e = -1;
  final List f = new ArrayList();
  List g;
  String h;
  
  public dfr()
  {
    this.f.add("");
  }
  
  private static String a(String paramString)
  {
    localObject = null;
    for (;;)
    {
      try
      {
        paramString = IDN.toASCII(paramString).toLowerCase(Locale.US);
        boolean bool = paramString.isEmpty();
        if (!bool) {
          continue;
        }
        paramString = (String)localObject;
      }
      catch (IllegalArgumentException paramString)
      {
        paramString = (String)localObject;
        continue;
      }
      return paramString;
    }
  }
  
  static int b(String paramString, int paramInt1, int paramInt2)
  {
    int i;
    int j;
    if (paramInt1 < paramInt2)
    {
      i = paramInt1;
      j = paramInt1;
    }
    switch (paramString.charAt(paramInt1))
    {
    default: 
      i = paramInt1;
    case '[': 
      for (;;)
      {
        paramInt1 = i + 1;
        break;
        do
        {
          paramInt1 = i + 1;
          i = paramInt1;
          if (paramInt1 >= paramInt2) {
            break;
          }
          i = paramInt1;
        } while (paramString.charAt(paramInt1) != ']');
        i = paramInt1;
      }
      j = paramInt2;
    }
    return j;
  }
  
  static String c(String paramString, int paramInt1, int paramInt2)
  {
    Object localObject1 = null;
    paramString = dfq.a(paramString, paramInt1, paramInt2);
    Object localObject2;
    if ((paramString.startsWith("[")) && (paramString.endsWith("]")))
    {
      localObject2 = e(paramString, 1, paramString.length() - 1);
      paramString = (String)localObject1;
      if (localObject2 != null) {
        paramString = ((InetAddress)localObject2).getHostAddress();
      }
    }
    for (;;)
    {
      return paramString;
      localObject2 = a(paramString);
      paramString = (String)localObject1;
      if (localObject2 != null)
      {
        paramInt1 = ((String)localObject2).length();
        paramString = (String)localObject1;
        if (dfq.a((String)localObject2, 0, paramInt1, "\000\t\n\r #%/:?@[\\]") == paramInt1) {
          paramString = (String)localObject2;
        }
      }
    }
  }
  
  static int d(String paramString, int paramInt1, int paramInt2)
  {
    for (;;)
    {
      try
      {
        paramInt1 = Integer.parseInt(dfq.a(paramString, paramInt1, paramInt2, "", false, false));
        if ((paramInt1 <= 0) || (paramInt1 > 65535)) {
          continue;
        }
      }
      catch (NumberFormatException paramString)
      {
        paramInt1 = -1;
        continue;
      }
      return paramInt1;
      paramInt1 = -1;
    }
  }
  
  private static InetAddress e(String paramString, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[16];
    int i = 0;
    int j = -1;
    int k = -1;
    int m = 1;
    int n = j;
    paramInt1 = i;
    if (m < paramInt2) {
      if (i == 16) {
        paramString = null;
      }
    }
    for (;;)
    {
      label39:
      return paramString;
      if ((m + 2 > paramInt2) || (!paramString.regionMatches(m, "::", 0, 2))) {
        break;
      }
      if (j != -1)
      {
        paramString = null;
      }
      else
      {
        paramInt1 = m + 2;
        i += 2;
        if (paramInt1 != paramInt2) {
          break label535;
        }
        paramInt1 = i;
        n = i;
        label93:
        if (paramInt1 == 16) {
          break label518;
        }
        if (n != -1) {
          break label486;
        }
        paramString = null;
      }
    }
    paramInt1 = m;
    n = j;
    int i1 = i;
    if (i != 0)
    {
      if (!paramString.regionMatches(m, ":", 0, 1)) {
        break label196;
      }
      paramInt1 = m + 1;
      i1 = i;
    }
    for (n = j;; n = i)
    {
      j = 0;
      i = paramInt1;
      for (;;)
      {
        if (i < paramInt2)
        {
          k = dfq.a(paramString.charAt(i));
          if (k != -1)
          {
            j = (j << 4) + k;
            i++;
            continue;
            label196:
            if (paramString.regionMatches(m, ".", 0, 1))
            {
              i1 = i - 2;
              m = i1;
              label219:
              if (k < paramInt2) {
                if (m == 16) {
                  paramInt1 = 0;
                }
              }
              for (;;)
              {
                if (paramInt1 != 0) {
                  break label400;
                }
                paramString = null;
                break;
                paramInt1 = k;
                if (m != i1)
                {
                  if (paramString.charAt(k) != '.') {
                    paramInt1 = 0;
                  } else {
                    paramInt1 = k + 1;
                  }
                }
                else
                {
                  n = 0;
                  for (k = paramInt1;; k++)
                  {
                    if (k >= paramInt2) {
                      break label356;
                    }
                    int i2 = paramString.charAt(k);
                    if ((i2 < 48) || (i2 > 57)) {
                      break label356;
                    }
                    if ((n == 0) && (paramInt1 != k))
                    {
                      paramInt1 = 0;
                      break;
                    }
                    n = n * 10 + i2 - 48;
                    if (n > 255)
                    {
                      paramInt1 = 0;
                      break;
                    }
                  }
                  label356:
                  if (k - paramInt1 == 0)
                  {
                    paramInt1 = 0;
                  }
                  else
                  {
                    arrayOfByte[m] = ((byte)n);
                    m++;
                    break label219;
                    if (m != i1 + 4) {
                      paramInt1 = 0;
                    } else {
                      paramInt1 = 1;
                    }
                  }
                }
              }
              label400:
              paramInt1 = i + 2;
              n = j;
              break label93;
            }
            paramString = null;
            break;
          }
        }
      }
      k = i - paramInt1;
      if ((k == 0) || (k > 4))
      {
        paramString = null;
        break label39;
      }
      m = i1 + 1;
      arrayOfByte[i1] = ((byte)(j >>> 8));
      k = m + 1;
      arrayOfByte[m] = ((byte)j);
      m = i;
      j = n;
      i = k;
      k = paramInt1;
      break;
      label486:
      System.arraycopy(arrayOfByte, n, arrayOfByte, 16 - (paramInt1 - n), paramInt1 - n);
      Arrays.fill(arrayOfByte, n, 16 - paramInt1 + n, (byte)0);
      try
      {
        label518:
        paramString = InetAddress.getByAddress(arrayOfByte);
      }
      catch (UnknownHostException paramString)
      {
        throw new AssertionError();
      }
      label535:
      i1 = i;
    }
  }
  
  final int a()
  {
    if (this.e != -1) {}
    for (int i = this.e;; i = dfq.a(this.a)) {
      return i;
    }
  }
  
  void a(String paramString, int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {
      return;
    }
    int i = paramString.charAt(paramInt1);
    label51:
    int j;
    label75:
    String str;
    if ((i == 47) || (i == 92))
    {
      this.f.clear();
      this.f.add("");
      paramInt1++;
      if (paramInt1 >= paramInt2) {
        break label264;
      }
      j = dfq.a(paramString, paramInt1, paramInt2, "/\\");
      if (j >= paramInt2) {
        break label266;
      }
      i = 1;
      str = dfq.a(paramString, paramInt1, j, " \"<>^`{}|/\\?#", true, false);
      if ((!str.equals(".")) && (!str.equalsIgnoreCase("%2e"))) {
        break label272;
      }
      paramInt1 = 1;
      label110:
      if (paramInt1 == 0)
      {
        if ((!str.equals("..")) && (!str.equalsIgnoreCase("%2e.")) && (!str.equalsIgnoreCase(".%2e")) && (!str.equalsIgnoreCase("%2e%2e"))) {
          break label277;
        }
        paramInt1 = 1;
        label156:
        if (paramInt1 == 0) {
          break label297;
        }
        if ((!((String)this.f.remove(this.f.size() - 1)).isEmpty()) || (this.f.isEmpty())) {
          break label282;
        }
        this.f.set(this.f.size() - 1, "");
      }
    }
    label264:
    label266:
    label272:
    label277:
    label282:
    label297:
    label382:
    for (;;)
    {
      paramInt1 = j;
      if (i != 0) {
        paramInt1 = j + 1;
      }
      break label51;
      this.f.set(this.f.size() - 1, "");
      break label51;
      break;
      i = 0;
      break label75;
      paramInt1 = 0;
      break label110;
      paramInt1 = 0;
      break label156;
      this.f.add("");
      continue;
      if (((String)this.f.get(this.f.size() - 1)).isEmpty()) {
        this.f.set(this.f.size() - 1, str);
      }
      for (;;)
      {
        if (i == 0) {
          break label382;
        }
        this.f.add("");
        break;
        this.f.add(str);
      }
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a);
    localStringBuilder.append("://");
    if ((!this.b.isEmpty()) || (!this.c.isEmpty()))
    {
      localStringBuilder.append(this.b);
      if (!this.c.isEmpty())
      {
        localStringBuilder.append(':');
        localStringBuilder.append(this.c);
      }
      localStringBuilder.append('@');
    }
    if (this.d.indexOf(':') != -1)
    {
      localStringBuilder.append('[');
      localStringBuilder.append(this.d);
      localStringBuilder.append(']');
    }
    for (;;)
    {
      int i = a();
      if (i != dfq.a(this.a))
      {
        localStringBuilder.append(':');
        localStringBuilder.append(i);
      }
      dfq.a(localStringBuilder, this.f);
      if (this.g != null)
      {
        localStringBuilder.append('?');
        dfq.b(localStringBuilder, this.g);
      }
      if (this.h != null)
      {
        localStringBuilder.append('#');
        localStringBuilder.append(this.h);
      }
      return localStringBuilder.toString();
      localStringBuilder.append(this.d);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dfr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */