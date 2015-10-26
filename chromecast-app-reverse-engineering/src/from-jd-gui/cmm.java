import java.util.List;

public abstract class cmm
  extends cms
{
  public cmo m;
  
  private cmm b()
  {
    cmm localcmm = (cmm)super.d();
    cmq.a(this, localcmm);
    return localcmm;
  }
  
  protected int a()
  {
    int j = 0;
    if (this.m != null)
    {
      int i = 0;
      for (;;)
      {
        k = i;
        if (j >= this.m.d) {
          break;
        }
        i += this.m.c[j].a();
        j++;
      }
    }
    int k = 0;
    return k;
  }
  
  public final Object a(cmn paramcmn)
  {
    Object localObject = null;
    if (this.m == null) {}
    cmp localcmp;
    do
    {
      return localObject;
      localcmp = this.m.a(cmu.b(paramcmn.b));
    } while (localcmp == null);
    if (localcmp.b != null)
    {
      if (localcmp.a != paramcmn) {
        throw new IllegalStateException("Tried to getExtension with a differernt Extension.");
      }
    }
    else
    {
      localcmp.a = paramcmn;
      localObject = localcmp.c;
      if (localObject != null) {
        break label89;
      }
      paramcmn = null;
    }
    for (;;)
    {
      localcmp.b = paramcmn;
      localcmp.c = null;
      localObject = localcmp.b;
      break;
      label89:
      if (paramcmn.c) {
        paramcmn = paramcmn.a((List)localObject);
      } else {
        paramcmn = paramcmn.b((List)localObject);
      }
    }
  }
  
  public void a(cmk paramcmk)
  {
    if (this.m == null) {}
    for (;;)
    {
      return;
      for (int i = 0; i < this.m.d; i++) {
        this.m.c[i].a(paramcmk);
      }
    }
  }
  
  protected final boolean a(cmj paramcmj, int paramInt)
  {
    int n = paramcmj.i();
    boolean bool;
    if (!paramcmj.b(paramInt))
    {
      bool = false;
      return bool;
    }
    int i = cmu.b(paramInt);
    int k = paramcmj.i() - n;
    label44:
    cmt localcmt;
    label75:
    Object localObject;
    cmo localcmo;
    if (k == 0)
    {
      paramcmj = cmu.d;
      localcmt = new cmt(paramInt, paramcmj);
      paramcmj = null;
      if (this.m != null) {
        break label165;
      }
      this.m = new cmo();
      localObject = paramcmj;
      if (paramcmj == null)
      {
        localObject = new cmp();
        localcmo = this.m;
        paramInt = localcmo.c(i);
        if (paramInt < 0) {
          break label178;
        }
        localcmo.c[paramInt] = localObject;
      }
    }
    for (;;)
    {
      ((cmp)localObject).c.add(localcmt);
      bool = true;
      break;
      localObject = new byte[k];
      int j = paramcmj.b;
      System.arraycopy(paramcmj.a, n + j, localObject, 0, k);
      paramcmj = (cmj)localObject;
      break label44;
      label165:
      paramcmj = this.m.a(i);
      break label75;
      label178:
      paramInt ^= 0xFFFFFFFF;
      if ((paramInt < localcmo.d) && (localcmo.c[paramInt] == cmo.a))
      {
        localcmo.b[paramInt] = i;
        localcmo.c[paramInt] = localObject;
      }
      else
      {
        if (localcmo.d >= localcmo.b.length)
        {
          j = localcmo.b(localcmo.d + 1);
          paramcmj = new int[j];
          cmp[] arrayOfcmp = new cmp[j];
          System.arraycopy(localcmo.b, 0, paramcmj, 0, localcmo.b.length);
          System.arraycopy(localcmo.c, 0, arrayOfcmp, 0, localcmo.c.length);
          localcmo.b = paramcmj;
          localcmo.c = arrayOfcmp;
        }
        if (localcmo.d - paramInt != 0)
        {
          System.arraycopy(localcmo.b, paramInt, localcmo.b, paramInt + 1, localcmo.d - paramInt);
          System.arraycopy(localcmo.c, paramInt, localcmo.c, paramInt + 1, localcmo.d - paramInt);
        }
        localcmo.b[paramInt] = i;
        localcmo.c[paramInt] = localObject;
        localcmo.d += 1;
      }
    }
  }
  
  protected final boolean a(cmm paramcmm)
  {
    boolean bool;
    if ((this.m == null) || (this.m.a())) {
      if ((paramcmm.m == null) || (paramcmm.m.a())) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      continue;
      bool = this.m.equals(paramcmm.m);
    }
  }
  
  protected final int c()
  {
    if ((this.m == null) || (this.m.a())) {}
    for (int i = 0;; i = this.m.hashCode()) {
      return i;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cmm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */