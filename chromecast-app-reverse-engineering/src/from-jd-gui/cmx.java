import java.util.Arrays;

public final class cmx
  extends cmm
{
  private byte[] a = cmu.d;
  private byte[][] b = cmu.c;
  private boolean c = false;
  
  public cmx()
  {
    this.m = null;
    this.n = -1;
  }
  
  protected final int a()
  {
    int k = 0;
    int j = super.a();
    int i = j;
    if (!Arrays.equals(this.a, cmu.d)) {
      i = j + cmk.b(1, this.a);
    }
    j = i;
    if (this.b != null)
    {
      j = i;
      if (this.b.length > 0)
      {
        j = 0;
        int m;
        for (int n = 0; k < this.b.length; n = m)
        {
          byte[] arrayOfByte = this.b[k];
          int i1 = j;
          m = n;
          if (arrayOfByte != null)
          {
            m = n + 1;
            i1 = j + cmk.a(arrayOfByte);
          }
          k++;
          j = i1;
        }
        j = i + j + n * 1;
      }
    }
    i = j;
    if (this.c)
    {
      boolean bool = this.c;
      i = j + (cmk.c(3) + 1);
    }
    return i;
  }
  
  public final void a(cmk paramcmk)
  {
    if (!Arrays.equals(this.a, cmu.d)) {
      paramcmk.a(1, this.a);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        byte[] arrayOfByte = this.b[i];
        if (arrayOfByte != null) {
          paramcmk.a(2, arrayOfByte);
        }
      }
    }
    if (this.c) {
      paramcmk.a(3, this.c);
    }
    super.a(paramcmk);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramObject == this) {
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      bool1 = bool2;
      if ((paramObject instanceof cmx))
      {
        paramObject = (cmx)paramObject;
        bool1 = bool2;
        if (Arrays.equals(this.a, ((cmx)paramObject).a))
        {
          bool1 = bool2;
          if (cmq.a(this.b, ((cmx)paramObject).b))
          {
            bool1 = bool2;
            if (this.c == ((cmx)paramObject).c) {
              bool1 = a((cmm)paramObject);
            }
          }
        }
      }
    }
  }
  
  public final int hashCode()
  {
    int k = Arrays.hashCode(this.a);
    int j = cmq.a(this.b);
    if (this.c) {}
    for (int i = 1231;; i = 1237) {
      return (i + ((k + 527) * 31 + j) * 31) * 31 + c();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cmx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */