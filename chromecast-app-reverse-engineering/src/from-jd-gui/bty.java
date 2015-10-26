import android.graphics.Color;
import java.util.Arrays;
import org.json.JSONObject;

public final class bty
{
  float a;
  int b;
  int c;
  int d;
  int e;
  int f;
  int g;
  int h;
  String i;
  int j;
  int k;
  JSONObject l;
  
  public bty()
  {
    a();
  }
  
  static int a(String paramString)
  {
    int n = 0;
    int m = n;
    if (paramString != null)
    {
      m = n;
      if (paramString.length() == 9)
      {
        m = n;
        if (paramString.charAt(0) != '#') {}
      }
    }
    try
    {
      int i1 = Integer.parseInt(paramString.substring(1, 3), 16);
      int i2 = Integer.parseInt(paramString.substring(3, 5), 16);
      m = Integer.parseInt(paramString.substring(5, 7), 16);
      m = Color.argb(Integer.parseInt(paramString.substring(7, 9), 16), i1, i2, m);
      return m;
    }
    catch (NumberFormatException paramString)
    {
      for (;;)
      {
        m = n;
      }
    }
  }
  
  void a()
  {
    this.a = 1.0F;
    this.b = 0;
    this.c = 0;
    this.d = -1;
    this.e = 0;
    this.f = -1;
    this.g = 0;
    this.h = 0;
    this.i = null;
    this.j = -1;
    this.k = -1;
    this.l = null;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (this == paramObject) {
      bool1 = true;
    }
    do
    {
      return bool1;
      bool1 = bool2;
    } while (!(paramObject instanceof bty));
    paramObject = (bty)paramObject;
    int m;
    if (this.l == null)
    {
      m = 1;
      label39:
      if (((bty)paramObject).l != null) {
        break label254;
      }
    }
    label254:
    for (int n = 1;; n = 0)
    {
      bool1 = bool2;
      if (m != n) {
        break;
      }
      if ((this.l != null) && (((bty)paramObject).l != null))
      {
        bool1 = bool2;
        if (!cae.a(this.l, ((bty)paramObject).l)) {
          break;
        }
      }
      bool1 = bool2;
      if (this.a != ((bty)paramObject).a) {
        break;
      }
      bool1 = bool2;
      if (this.b != ((bty)paramObject).b) {
        break;
      }
      bool1 = bool2;
      if (this.c != ((bty)paramObject).c) {
        break;
      }
      bool1 = bool2;
      if (this.d != ((bty)paramObject).d) {
        break;
      }
      bool1 = bool2;
      if (this.e != ((bty)paramObject).e) {
        break;
      }
      bool1 = bool2;
      if (this.f != ((bty)paramObject).f) {
        break;
      }
      bool1 = bool2;
      if (this.h != ((bty)paramObject).h) {
        break;
      }
      bool1 = bool2;
      if (!a.d(this.i, ((bty)paramObject).i)) {
        break;
      }
      bool1 = bool2;
      if (this.j != ((bty)paramObject).j) {
        break;
      }
      bool1 = bool2;
      if (this.k != ((bty)paramObject).k) {
        break;
      }
      bool1 = true;
      break;
      m = 0;
      break label39;
    }
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Float.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), this.i, Integer.valueOf(this.j), Integer.valueOf(this.k), this.l });
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bty.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */