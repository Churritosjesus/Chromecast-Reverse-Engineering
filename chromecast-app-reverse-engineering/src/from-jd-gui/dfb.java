import java.util.concurrent.TimeUnit;

public final class dfb
{
  public final boolean a;
  public final boolean b;
  public final int c;
  public final boolean d;
  public final boolean e;
  public final boolean f;
  public final int g;
  public final int h;
  public final boolean i;
  private final int j;
  private final boolean k;
  private String l;
  
  static
  {
    dfc localdfc = new dfc();
    localdfc.a = true;
    localdfc.a();
    localdfc = new dfc();
    localdfc.e = true;
    long l1 = TimeUnit.SECONDS.toSeconds(2147483647L);
    if (l1 > 2147483647L) {}
    for (int m = Integer.MAX_VALUE;; m = (int)l1)
    {
      localdfc.c = m;
      localdfc.a();
      return;
    }
  }
  
  dfb(dfc paramdfc)
  {
    this.a = paramdfc.a;
    this.b = false;
    this.c = paramdfc.b;
    this.j = -1;
    this.d = false;
    this.e = false;
    this.f = false;
    this.g = paramdfc.c;
    this.h = paramdfc.d;
    this.i = paramdfc.e;
    this.k = false;
  }
  
  private dfb(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, int paramInt3, int paramInt4, boolean paramBoolean6, boolean paramBoolean7, String paramString)
  {
    this.a = paramBoolean1;
    this.b = paramBoolean2;
    this.c = paramInt1;
    this.j = paramInt2;
    this.d = paramBoolean3;
    this.e = paramBoolean4;
    this.f = paramBoolean5;
    this.g = paramInt3;
    this.h = paramInt4;
    this.i = paramBoolean6;
    this.k = paramBoolean7;
    this.l = paramString;
  }
  
  public static dfb a(dfo paramdfo)
  {
    boolean bool5 = false;
    int i4 = -1;
    int i3 = -1;
    boolean bool7 = false;
    boolean bool6 = false;
    boolean bool4 = false;
    int i2 = -1;
    int i1 = -1;
    boolean bool3 = false;
    boolean bool2 = false;
    int m = 1;
    int i11 = paramdfo.a.length / 2;
    int i5 = 0;
    Object localObject1 = null;
    boolean bool1 = false;
    while (i5 < i11)
    {
      Object localObject2 = paramdfo.a(i5);
      String str1 = paramdfo.b(i5);
      int i6;
      if (((String)localObject2).equalsIgnoreCase("Cache-Control")) {
        if (localObject1 != null)
        {
          m = 0;
          i6 = 0;
        }
      }
      for (;;)
      {
        label90:
        localObject2 = localObject1;
        bool14 = bool5;
        i10 = i4;
        i9 = i3;
        bool13 = bool7;
        bool12 = bool6;
        bool11 = bool4;
        i8 = i2;
        i7 = i1;
        bool10 = bool3;
        bool9 = bool2;
        n = m;
        bool8 = bool1;
        if (i6 >= str1.length()) {
          break label608;
        }
        n = a.a(str1, i6, "=,;");
        String str2 = str1.substring(i6, n).trim();
        if ((n == str1.length()) || (str1.charAt(n) == ',') || (str1.charAt(n) == ';'))
        {
          n++;
          localObject2 = null;
        }
        for (;;)
        {
          if (!"no-cache".equalsIgnoreCase(str2)) {
            break label337;
          }
          bool1 = true;
          i6 = n;
          break label90;
          localObject1 = str1;
          break;
          if (!((String)localObject2).equalsIgnoreCase("Pragma")) {
            break label558;
          }
          m = 0;
          break;
          i6 = a.b(str1, n + 1);
          if ((i6 < str1.length()) && (str1.charAt(i6) == '"'))
          {
            n = i6 + 1;
            i6 = a.a(str1, n, "\"");
            localObject2 = str1.substring(n, i6);
            n = i6 + 1;
          }
          else
          {
            n = a.a(str1, i6, ",;");
            localObject2 = str1.substring(i6, n).trim();
          }
        }
        label337:
        if ("no-store".equalsIgnoreCase(str2))
        {
          bool5 = true;
          i6 = n;
        }
        else if ("max-age".equalsIgnoreCase(str2))
        {
          i4 = a.c((String)localObject2, -1);
          i6 = n;
        }
        else if ("s-maxage".equalsIgnoreCase(str2))
        {
          i3 = a.c((String)localObject2, -1);
          i6 = n;
        }
        else if ("private".equalsIgnoreCase(str2))
        {
          bool7 = true;
          i6 = n;
        }
        else if ("public".equalsIgnoreCase(str2))
        {
          bool6 = true;
          i6 = n;
        }
        else if ("must-revalidate".equalsIgnoreCase(str2))
        {
          bool4 = true;
          i6 = n;
        }
        else if ("max-stale".equalsIgnoreCase(str2))
        {
          i2 = a.c((String)localObject2, Integer.MAX_VALUE);
          i6 = n;
        }
        else if ("min-fresh".equalsIgnoreCase(str2))
        {
          i1 = a.c((String)localObject2, -1);
          i6 = n;
        }
        else if ("only-if-cached".equalsIgnoreCase(str2))
        {
          bool3 = true;
          i6 = n;
        }
        else
        {
          i6 = n;
          if ("no-transform".equalsIgnoreCase(str2))
          {
            bool2 = true;
            i6 = n;
          }
        }
      }
      label558:
      boolean bool8 = bool1;
      int n = m;
      boolean bool9 = bool2;
      boolean bool10 = bool3;
      int i7 = i1;
      int i8 = i2;
      boolean bool11 = bool4;
      boolean bool12 = bool6;
      boolean bool13 = bool7;
      int i9 = i3;
      int i10 = i4;
      boolean bool14 = bool5;
      localObject2 = localObject1;
      label608:
      i5++;
      bool1 = bool8;
      localObject1 = localObject2;
      bool5 = bool14;
      i4 = i10;
      i3 = i9;
      bool7 = bool13;
      bool6 = bool12;
      bool4 = bool11;
      i2 = i8;
      i1 = i7;
      bool3 = bool10;
      bool2 = bool9;
      m = n;
    }
    if (m == 0) {}
    for (paramdfo = null;; paramdfo = (dfo)localObject1) {
      return new dfb(bool1, bool5, i4, i3, bool7, bool6, bool4, i2, i1, bool3, bool2, paramdfo);
    }
  }
  
  public final String toString()
  {
    Object localObject = this.l;
    if (localObject != null) {
      return (String)localObject;
    }
    localObject = new StringBuilder();
    if (this.a) {
      ((StringBuilder)localObject).append("no-cache, ");
    }
    if (this.b) {
      ((StringBuilder)localObject).append("no-store, ");
    }
    if (this.c != -1) {
      ((StringBuilder)localObject).append("max-age=").append(this.c).append(", ");
    }
    if (this.j != -1) {
      ((StringBuilder)localObject).append("s-maxage=").append(this.j).append(", ");
    }
    if (this.d) {
      ((StringBuilder)localObject).append("private, ");
    }
    if (this.e) {
      ((StringBuilder)localObject).append("public, ");
    }
    if (this.f) {
      ((StringBuilder)localObject).append("must-revalidate, ");
    }
    if (this.g != -1) {
      ((StringBuilder)localObject).append("max-stale=").append(this.g).append(", ");
    }
    if (this.h != -1) {
      ((StringBuilder)localObject).append("min-fresh=").append(this.h).append(", ");
    }
    if (this.i) {
      ((StringBuilder)localObject).append("only-if-cached, ");
    }
    if (this.k) {
      ((StringBuilder)localObject).append("no-transform, ");
    }
    if (((StringBuilder)localObject).length() == 0) {}
    for (localObject = "";; localObject = ((StringBuilder)localObject).toString())
    {
      this.l = ((String)localObject);
      break;
      ((StringBuilder)localObject).delete(((StringBuilder)localObject).length() - 2, ((StringBuilder)localObject).length());
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dfb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */