import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class cmn
{
  public final Class a;
  public final int b;
  public final boolean c;
  private int d;
  
  cmn(int paramInt1, Class paramClass, int paramInt2, boolean paramBoolean)
  {
    this.d = paramInt1;
    this.a = paramClass;
    this.b = paramInt2;
    this.c = false;
  }
  
  private Object a(cmj paramcmj)
  {
    Class localClass;
    if (this.c) {
      localClass = this.a.getComponentType();
    }
    try
    {
      switch (this.d)
      {
      default: 
        paramcmj = new java/lang/IllegalArgumentException;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("Unknown type ");
        paramcmj.<init>(this.d);
        throw paramcmj;
      }
    }
    catch (InstantiationException paramcmj)
    {
      for (;;)
      {
        throw new IllegalArgumentException("Error creating instance of class " + localClass, paramcmj);
        localClass = this.a;
      }
      localObject = (cms)localClass.newInstance();
      i = cmu.b(this.b);
      if (paramcmj.c >= paramcmj.d) {
        throw cmr.g();
      }
    }
    catch (IllegalAccessException paramcmj)
    {
      Object localObject;
      int i;
      throw new IllegalArgumentException("Error creating instance of class " + localClass, paramcmj);
      paramcmj.c += 1;
      ((cms)localObject).a(paramcmj);
      paramcmj.a(cmu.a(i, 4));
      paramcmj.c -= 1;
      for (paramcmj = (cmj)localObject;; paramcmj = (cmj)localObject)
      {
        return paramcmj;
        localObject = (cms)localClass.newInstance();
        paramcmj.a((cms)localObject);
      }
    }
    catch (IOException paramcmj)
    {
      throw new IllegalArgumentException("Error reading extension field", paramcmj);
    }
  }
  
  private int b(Object paramObject)
  {
    int i = cmu.b(this.b);
    switch (this.d)
    {
    default: 
      throw new IllegalArgumentException("Unknown type " + this.d);
    case 10: 
      paramObject = (cms)paramObject;
    }
    for (i = (cmk.c(i) << 1) + ((cms)paramObject).f();; i = cmk.b(i, (cms)paramObject)) {
      return i;
    }
  }
  
  private void b(Object paramObject, cmk paramcmk)
  {
    try
    {
      paramcmk.d(this.b);
      switch (this.d)
      {
      default: 
        paramObject = new java/lang/IllegalArgumentException;
        paramcmk = new java/lang/StringBuilder;
        paramcmk.<init>("Unknown type ");
        ((IllegalArgumentException)paramObject).<init>(this.d);
        throw ((Throwable)paramObject);
      }
    }
    catch (IOException paramObject)
    {
      throw new IllegalStateException((Throwable)paramObject);
    }
    paramObject = (cms)paramObject;
    int i = cmu.b(this.b);
    ((cms)paramObject).a(paramcmk);
    paramcmk.c(i, 4);
    for (;;)
    {
      return;
      paramcmk.a((cms)paramObject);
    }
  }
  
  final int a(Object paramObject)
  {
    int i = 0;
    if (this.c)
    {
      int m = Array.getLength(paramObject);
      int j = 0;
      for (;;)
      {
        k = i;
        if (j >= m) {
          break;
        }
        k = i;
        if (Array.get(paramObject, j) != null) {
          k = i + b(Array.get(paramObject, j));
        }
        j++;
        i = k;
      }
    }
    int k = b(paramObject);
    return k;
  }
  
  Object a(List paramList)
  {
    int j = 0;
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramList.size(); i++)
    {
      localObject = (cmt)paramList.get(i);
      if (((cmt)localObject).b.length != 0)
      {
        localObject = ((cmt)localObject).b;
        localArrayList.add(a(cmj.a((byte[])localObject, 0, localObject.length)));
      }
    }
    int k = localArrayList.size();
    if (k == 0)
    {
      paramList = null;
      return paramList;
    }
    Object localObject = this.a.cast(Array.newInstance(this.a.getComponentType(), k));
    for (i = j;; i++)
    {
      paramList = (List)localObject;
      if (i >= k) {
        break;
      }
      Array.set(localObject, i, localArrayList.get(i));
    }
  }
  
  final void a(Object paramObject, cmk paramcmk)
  {
    if (this.c)
    {
      int j = Array.getLength(paramObject);
      for (int i = 0; i < j; i++)
      {
        Object localObject = Array.get(paramObject, i);
        if (localObject != null) {
          b(localObject, paramcmk);
        }
      }
    }
    b(paramObject, paramcmk);
  }
  
  Object b(List paramList)
  {
    if (paramList.isEmpty()) {}
    Object localObject;
    for (paramList = null;; paramList = paramList.cast(a(cmj.a((byte[])localObject, 0, localObject.length))))
    {
      return paramList;
      localObject = (cmt)paramList.get(paramList.size() - 1);
      paramList = this.a;
      localObject = ((cmt)localObject).b;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cmn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */