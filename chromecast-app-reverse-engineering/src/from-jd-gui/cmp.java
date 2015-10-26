import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class cmp
  implements Cloneable
{
  cmn a;
  Object b;
  List c = new ArrayList();
  
  private byte[] c()
  {
    byte[] arrayOfByte = new byte[a()];
    a(cmk.a(arrayOfByte, 0, arrayOfByte.length));
    return arrayOfByte;
  }
  
  final int a()
  {
    int j;
    if (this.b != null)
    {
      j = this.a.a(this.b);
      return j;
    }
    Iterator localIterator = this.c.iterator();
    cmt localcmt;
    for (int i = 0;; i = localcmt.b.length + (j + 0) + i)
    {
      j = i;
      if (!localIterator.hasNext()) {
        break;
      }
      localcmt = (cmt)localIterator.next();
      j = cmk.e(localcmt.a);
    }
  }
  
  final void a(cmk paramcmk)
  {
    if (this.b != null) {
      this.a.a(this.b, paramcmk);
    }
    for (;;)
    {
      return;
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext())
      {
        cmt localcmt = (cmt)localIterator.next();
        paramcmk.d(localcmt.a);
        paramcmk.b(localcmt.b);
      }
    }
  }
  
  public final cmp b()
  {
    int i = 0;
    cmp localcmp = new cmp();
    for (;;)
    {
      try
      {
        localcmp.a = this.a;
        if (this.c == null)
        {
          localcmp.c = null;
          if (this.b != null)
          {
            if ((this.b instanceof cms)) {
              localcmp.b = ((cms)this.b).d();
            }
          }
          else {
            return localcmp;
          }
        }
        else
        {
          localcmp.c.addAll(this.c);
          continue;
        }
        if (!(this.b instanceof byte[])) {
          break label118;
        }
      }
      catch (CloneNotSupportedException localCloneNotSupportedException)
      {
        throw new AssertionError(localCloneNotSupportedException);
      }
      localCloneNotSupportedException.b = ((byte[])this.b).clone();
      continue;
      label118:
      Object localObject1;
      Object localObject2;
      if ((this.b instanceof byte[][]))
      {
        localObject1 = (byte[][])this.b;
        localObject2 = new byte[localObject1.length][];
        localCloneNotSupportedException.b = localObject2;
        for (i = 0; i < localObject1.length; i++) {
          localObject2[i] = ((byte[])localObject1[i].clone());
        }
      }
      else if ((this.b instanceof boolean[]))
      {
        localCloneNotSupportedException.b = ((boolean[])this.b).clone();
      }
      else if ((this.b instanceof int[]))
      {
        localCloneNotSupportedException.b = ((int[])this.b).clone();
      }
      else if ((this.b instanceof long[]))
      {
        localCloneNotSupportedException.b = ((long[])this.b).clone();
      }
      else if ((this.b instanceof float[]))
      {
        localCloneNotSupportedException.b = ((float[])this.b).clone();
      }
      else if ((this.b instanceof double[]))
      {
        localCloneNotSupportedException.b = ((double[])this.b).clone();
      }
      else if ((this.b instanceof cms[]))
      {
        localObject1 = (cms[])this.b;
        localObject2 = new cms[localObject1.length];
        localCloneNotSupportedException.b = localObject2;
        while (i < localObject1.length)
        {
          localObject2[i] = localObject1[i].d();
          i++;
        }
      }
    }
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
      if (!(paramObject instanceof cmp)) {
        continue;
      }
      paramObject = (cmp)paramObject;
      if ((this.b != null) && (((cmp)paramObject).b != null))
      {
        bool1 = bool2;
        if (this.a != ((cmp)paramObject).a) {
          continue;
        }
        if (!this.a.a.isArray())
        {
          bool1 = this.b.equals(((cmp)paramObject).b);
          continue;
        }
        if ((this.b instanceof byte[]))
        {
          bool1 = Arrays.equals((byte[])this.b, (byte[])((cmp)paramObject).b);
          continue;
        }
        if ((this.b instanceof int[]))
        {
          bool1 = Arrays.equals((int[])this.b, (int[])((cmp)paramObject).b);
          continue;
        }
        if ((this.b instanceof long[]))
        {
          bool1 = Arrays.equals((long[])this.b, (long[])((cmp)paramObject).b);
          continue;
        }
        if ((this.b instanceof float[]))
        {
          bool1 = Arrays.equals((float[])this.b, (float[])((cmp)paramObject).b);
          continue;
        }
        if ((this.b instanceof double[]))
        {
          bool1 = Arrays.equals((double[])this.b, (double[])((cmp)paramObject).b);
          continue;
        }
        if ((this.b instanceof boolean[]))
        {
          bool1 = Arrays.equals((boolean[])this.b, (boolean[])((cmp)paramObject).b);
          continue;
        }
        bool1 = Arrays.deepEquals((Object[])this.b, (Object[])((cmp)paramObject).b);
        continue;
      }
      if ((this.c != null) && (((cmp)paramObject).c != null))
      {
        bool1 = this.c.equals(((cmp)paramObject).c);
        continue;
      }
      try
      {
        bool1 = Arrays.equals(c(), ((cmp)paramObject).c());
      }
      catch (IOException paramObject)
      {
        throw new IllegalStateException((Throwable)paramObject);
      }
    }
  }
  
  public final int hashCode()
  {
    try
    {
      int i = Arrays.hashCode(c());
      return i + 527;
    }
    catch (IOException localIOException)
    {
      throw new IllegalStateException(localIOException);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cmp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */