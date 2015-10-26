import java.util.List;

public abstract class der
  extends dew
{
  public des i;
  
  private der b()
  {
    der localder = (der)super.c();
    deu.a(this, localder);
    return localder;
  }
  
  public int a()
  {
    int k = 0;
    if (this.i != null)
    {
      int j = 0;
      for (;;)
      {
        m = j;
        if (k >= this.i.d) {
          break;
        }
        j += this.i.c[k].a();
        k++;
      }
    }
    int m = 0;
    return m;
  }
  
  public void a(dep paramdep)
  {
    if (this.i == null) {}
    for (;;)
    {
      return;
      for (int j = 0; j < this.i.d; j++) {
        this.i.c[j].a(paramdep);
      }
    }
  }
  
  public final boolean a(deo paramdeo, int paramInt)
  {
    int n = paramdeo.i();
    boolean bool;
    if (!paramdeo.b(paramInt))
    {
      bool = false;
      return bool;
    }
    int j = dey.b(paramInt);
    int m = paramdeo.i() - n;
    label44:
    dex localdex;
    label75:
    Object localObject;
    des localdes;
    if (m == 0)
    {
      paramdeo = dey.c;
      localdex = new dex(paramInt, paramdeo);
      if (this.i != null) {
        break label165;
      }
      this.i = new des();
      paramdeo = null;
      localObject = paramdeo;
      if (paramdeo == null)
      {
        localObject = new det();
        localdes = this.i;
        paramInt = localdes.b(j);
        if (paramInt < 0) {
          break label208;
        }
        localdes.c[paramInt] = localObject;
      }
    }
    for (;;)
    {
      ((det)localObject).a.add(localdex);
      bool = true;
      break;
      localObject = new byte[m];
      int k = paramdeo.b;
      System.arraycopy(paramdeo.a, n + k, localObject, 0, m);
      paramdeo = (deo)localObject;
      break label44;
      label165:
      paramdeo = this.i;
      paramInt = paramdeo.b(j);
      if ((paramInt < 0) || (paramdeo.c[paramInt] == des.a))
      {
        paramdeo = null;
        break label75;
      }
      paramdeo = paramdeo.c[paramInt];
      break label75;
      label208:
      k = paramInt ^ 0xFFFFFFFF;
      if ((k < localdes.d) && (localdes.c[k] == des.a))
      {
        localdes.b[k] = j;
        localdes.c[k] = localObject;
      }
      else
      {
        if (localdes.d >= localdes.b.length)
        {
          paramInt = localdes.a(localdes.d + 1);
          paramdeo = new int[paramInt];
          det[] arrayOfdet = new det[paramInt];
          System.arraycopy(localdes.b, 0, paramdeo, 0, localdes.b.length);
          System.arraycopy(localdes.c, 0, arrayOfdet, 0, localdes.c.length);
          localdes.b = paramdeo;
          localdes.c = arrayOfdet;
        }
        if (localdes.d - k != 0)
        {
          System.arraycopy(localdes.b, k, localdes.b, k + 1, localdes.d - k);
          System.arraycopy(localdes.c, k, localdes.c, k + 1, localdes.d - k);
        }
        localdes.b[k] = j;
        localdes.c[k] = localObject;
        localdes.d += 1;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\der.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */