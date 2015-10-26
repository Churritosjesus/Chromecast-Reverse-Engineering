import java.util.ArrayList;
import java.util.List;

public final class wh
  implements yp
{
  final ArrayList a = new ArrayList();
  private eo b = new eo(30);
  private ArrayList c = new ArrayList();
  private wi d;
  private boolean e;
  private yo f;
  
  public wh(wi paramwi)
  {
    this(paramwi, false);
  }
  
  private wh(wi paramwi, boolean paramBoolean)
  {
    this.d = paramwi;
    this.e = false;
    this.f = new yo(this);
  }
  
  private void a(List paramList)
  {
    int j = paramList.size();
    for (int i = 0; i < j; i++) {
      a((wj)paramList.get(i));
    }
    paramList.clear();
  }
  
  private void a(wj paramwj, int paramInt)
  {
    this.d.a(paramwj);
    switch (paramwj.a)
    {
    default: 
      throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
    case 1: 
      this.d.a(paramInt, paramwj.c);
    }
    for (;;)
    {
      return;
      this.d.c(paramInt, paramwj.c);
    }
  }
  
  private int b(int paramInt1, int paramInt2)
  {
    int i = this.c.size() - 1;
    wj localwj;
    if (i >= 0)
    {
      localwj = (wj)this.c.get(i);
      int k;
      int j;
      if (localwj.a == 3) {
        if (localwj.b < localwj.c)
        {
          k = localwj.b;
          j = localwj.c;
          label60:
          if ((paramInt1 < k) || (paramInt1 > j)) {
            break label175;
          }
          if (k != localwj.b) {
            break label137;
          }
          if (paramInt2 != 0) {
            break label119;
          }
          localwj.c += 1;
          label95:
          paramInt1++;
        }
      }
      for (;;)
      {
        i--;
        break;
        k = localwj.c;
        j = localwj.b;
        break label60;
        label119:
        if (paramInt2 != 1) {
          break label95;
        }
        localwj.c -= 1;
        break label95;
        label137:
        if (paramInt2 == 0) {
          localwj.b += 1;
        }
        for (;;)
        {
          paramInt1--;
          break;
          if (paramInt2 == 1) {
            localwj.b -= 1;
          }
        }
        label175:
        if (paramInt1 < localwj.b)
        {
          if (paramInt2 == 0)
          {
            localwj.b += 1;
            localwj.c += 1;
            continue;
          }
          if (paramInt2 == 1)
          {
            localwj.b -= 1;
            localwj.c -= 1;
          }
        }
        continue;
        if (localwj.b <= paramInt1)
        {
          if (localwj.a == 0) {
            paramInt1 -= localwj.c;
          } else if (localwj.a == 1) {
            paramInt1 = localwj.c + paramInt1;
          }
        }
        else if (paramInt2 == 0) {
          localwj.b += 1;
        } else if (paramInt2 == 1) {
          localwj.b -= 1;
        }
      }
    }
    paramInt2 = this.c.size() - 1;
    if (paramInt2 >= 0)
    {
      localwj = (wj)this.c.get(paramInt2);
      if (localwj.a == 3) {
        if ((localwj.c == localwj.b) || (localwj.c < 0))
        {
          this.c.remove(paramInt2);
          a(localwj);
        }
      }
      for (;;)
      {
        paramInt2--;
        break;
        if (localwj.c <= 0)
        {
          this.c.remove(paramInt2);
          a(localwj);
        }
      }
    }
    return paramInt1;
  }
  
  private void b(wj paramwj)
  {
    if ((paramwj.a == 0) || (paramwj.a == 3)) {
      throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }
    int i1 = b(paramwj.b, paramwj.a);
    int j = paramwj.b;
    int k;
    int n;
    int m;
    label105:
    int i2;
    switch (paramwj.a)
    {
    default: 
      throw new IllegalArgumentException("op should be remove or update." + paramwj);
    case 2: 
      k = 1;
      n = 1;
      m = 1;
      if (m >= paramwj.c) {
        break label280;
      }
      i2 = b(paramwj.b + k * m, paramwj.a);
      switch (paramwj.a)
      {
      default: 
        i = 0;
        label162:
        if (i == 0) {}
        break;
      }
      break;
    }
    for (int i = n + 1;; i = n)
    {
      m++;
      n = i;
      break label105;
      k = 0;
      break;
      if (i2 == i1 + 1)
      {
        i = 1;
        break label162;
      }
      i = 0;
      break label162;
      if (i2 == i1)
      {
        i = 1;
        break label162;
      }
      i = 0;
      break label162;
      wj localwj = a(paramwj.a, i1, n);
      a(localwj, j);
      a(localwj);
      i = j;
      if (paramwj.a == 2) {
        i = j + n;
      }
      n = 1;
      i1 = i2;
      j = i;
    }
    label280:
    a(paramwj);
    if (n > 0)
    {
      paramwj = a(paramwj.a, i1, n);
      a(paramwj, j);
      a(paramwj);
    }
  }
  
  private boolean b(int paramInt)
  {
    int k = this.c.size();
    int i = 0;
    wj localwj;
    boolean bool;
    if (i < k)
    {
      localwj = (wj)this.c.get(i);
      if (localwj.a == 3)
      {
        if (a(localwj.c, i + 1) != paramInt) {
          break label118;
        }
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      if (localwj.a == 0)
      {
        int n = localwj.b;
        int m = localwj.c;
        for (int j = localwj.b;; j++)
        {
          if (j >= n + m) {
            break label118;
          }
          if (a(j, i + 1) == paramInt)
          {
            bool = true;
            break;
          }
        }
      }
      label118:
      i++;
      break;
      bool = false;
    }
  }
  
  private void c(wj paramwj)
  {
    this.c.add(paramwj);
    switch (paramwj.a)
    {
    default: 
      throw new IllegalArgumentException("Unknown update op type for " + paramwj);
    case 0: 
      this.d.d(paramwj.b, paramwj.c);
    }
    for (;;)
    {
      return;
      this.d.e(paramwj.b, paramwj.c);
      continue;
      this.d.b(paramwj.b, paramwj.c);
      continue;
      this.d.c(paramwj.b, paramwj.c);
    }
  }
  
  final int a(int paramInt)
  {
    return a(paramInt, 0);
  }
  
  final int a(int paramInt1, int paramInt2)
  {
    int k = this.c.size();
    int j = paramInt2;
    paramInt2 = paramInt1;
    paramInt1 = paramInt2;
    wj localwj;
    if (j < k)
    {
      localwj = (wj)this.c.get(j);
      if (localwj.a == 3) {
        if (localwj.b == paramInt2) {
          paramInt1 = localwj.c;
        }
      }
    }
    for (;;)
    {
      j++;
      paramInt2 = paramInt1;
      break;
      int i = paramInt2;
      if (localwj.b < paramInt2) {
        i = paramInt2 - 1;
      }
      paramInt1 = i;
      if (localwj.c <= i)
      {
        paramInt1 = i + 1;
        continue;
        paramInt1 = paramInt2;
        if (localwj.b <= paramInt2) {
          if (localwj.a == 1)
          {
            if (paramInt2 < localwj.b + localwj.c)
            {
              paramInt1 = -1;
              return paramInt1;
            }
            paramInt1 = paramInt2 - localwj.c;
          }
          else
          {
            paramInt1 = paramInt2;
            if (localwj.a == 0) {
              paramInt1 = paramInt2 + localwj.c;
            }
          }
        }
      }
    }
  }
  
  public final wj a(int paramInt1, int paramInt2, int paramInt3)
  {
    wj localwj = (wj)this.b.a();
    if (localwj == null) {
      localwj = new wj(paramInt1, paramInt2, paramInt3);
    }
    for (;;)
    {
      return localwj;
      localwj.a = paramInt1;
      localwj.b = paramInt2;
      localwj.c = paramInt3;
    }
  }
  
  public final void a()
  {
    a(this.a);
    a(this.c);
  }
  
  public final void a(wj paramwj)
  {
    if (!this.e) {
      this.b.a(paramwj);
    }
  }
  
  public final void b()
  {
    yo localyo = this.f;
    ArrayList localArrayList = this.a;
    int i;
    label24:
    label56:
    int i1;
    wj localwj3;
    wj localwj2;
    int k;
    for (;;)
    {
      j = 0;
      i = localArrayList.size() - 1;
      if (i < 0) {
        break label274;
      }
      if (((wj)localArrayList.get(i)).a != 3) {
        break;
      }
      if (j == 0) {
        break label1805;
      }
      j = i;
      if (j == -1) {
        break label1237;
      }
      i1 = j + 1;
      localwj3 = (wj)localArrayList.get(j);
      localwj2 = (wj)localArrayList.get(i1);
      switch (localwj2.a)
      {
      default: 
        break;
      case 0: 
        i = 0;
        if (localwj3.c < localwj2.b) {
          i = -1;
        }
        k = i;
        if (localwj3.b < localwj2.b) {
          k = i + 1;
        }
        if (localwj2.b <= localwj3.b) {
          localwj3.b += localwj2.c;
        }
        if (localwj2.b <= localwj3.c) {
          localwj3.c += localwj2.c;
        }
        localwj2.b = (k + localwj2.b);
        localArrayList.set(j, localwj2);
        localArrayList.set(i1, localwj3);
      }
    }
    int j = 1;
    label274:
    label356:
    label381:
    label509:
    label584:
    label670:
    label791:
    label961:
    label1002:
    label1027:
    label1138:
    label1213:
    label1237:
    label1411:
    label1490:
    label1805:
    for (;;)
    {
      i--;
      break label24;
      j = -1;
      break label56;
      wj localwj1 = null;
      int n = 0;
      int m;
      if (localwj3.b < localwj3.c)
      {
        m = 0;
        k = m;
        i = n;
        if (localwj2.b == localwj3.b)
        {
          k = m;
          i = n;
          if (localwj2.c == localwj3.c - localwj3.b)
          {
            i = 1;
            k = m;
          }
        }
        if (localwj3.c >= localwj2.b) {
          break label509;
        }
        localwj2.b -= 1;
        if (localwj3.b > localwj2.b) {
          break label584;
        }
        localwj2.b += 1;
      }
      int i2;
      for (;;)
      {
        if (i == 0) {
          break label670;
        }
        localArrayList.set(j, localwj2);
        localArrayList.remove(i1);
        localyo.a.a(localwj3);
        break;
        m = 1;
        k = m;
        i = n;
        if (localwj2.b != localwj3.c + 1) {
          break label356;
        }
        k = m;
        i = n;
        if (localwj2.c != localwj3.b - localwj3.c) {
          break label356;
        }
        i = 1;
        k = m;
        break label356;
        if (localwj3.c >= localwj2.b + localwj2.c) {
          break label381;
        }
        localwj2.c -= 1;
        localwj3.a = 1;
        localwj3.c = 1;
        if (localwj2.c != 0) {
          break;
        }
        localArrayList.remove(i1);
        localyo.a.a(localwj2);
        break;
        if (localwj3.b < localwj2.b + localwj2.c)
        {
          i2 = localwj2.b;
          n = localwj2.c;
          m = localwj3.b;
          localwj1 = localyo.a.a(1, localwj3.b + 1, i2 + n - m);
          localwj2.c = (localwj3.b - localwj2.b);
        }
      }
      if (k != 0)
      {
        if (localwj1 != null)
        {
          if (localwj3.b > localwj1.b) {
            localwj3.b -= localwj1.c;
          }
          if (localwj3.c > localwj1.b) {
            localwj3.c -= localwj1.c;
          }
        }
        if (localwj3.b > localwj2.b) {
          localwj3.b -= localwj2.c;
        }
        if (localwj3.c > localwj2.b) {
          localwj3.c -= localwj2.c;
        }
        localArrayList.set(j, localwj2);
        if (localwj3.b == localwj3.c) {
          break label961;
        }
        localArrayList.set(i1, localwj3);
      }
      while (localwj1 != null)
      {
        localArrayList.add(j, localwj1);
        break;
        if (localwj1 != null)
        {
          if (localwj3.b >= localwj1.b) {
            localwj3.b -= localwj1.c;
          }
          if (localwj3.c >= localwj1.b) {
            localwj3.c -= localwj1.c;
          }
        }
        if (localwj3.b >= localwj2.b) {
          localwj3.b -= localwj2.c;
        }
        if (localwj3.c < localwj2.b) {
          break label791;
        }
        localwj3.c -= localwj2.c;
        break label791;
        localArrayList.remove(i1);
      }
      localwj1 = null;
      Object localObject = null;
      if (localwj3.c < localwj2.b)
      {
        localwj2.b -= 1;
        if (localwj3.b > localwj2.b) {
          break label1138;
        }
        localwj2.b += 1;
        localArrayList.set(i1, localwj3);
        if (localwj2.c <= 0) {
          break label1213;
        }
        localArrayList.set(j, localwj2);
      }
      for (;;)
      {
        if (localwj1 != null) {
          localArrayList.add(j, localwj1);
        }
        if (localObject == null) {
          break;
        }
        localArrayList.add(j, localObject);
        break;
        if (localwj3.c >= localwj2.b + localwj2.c) {
          break label1002;
        }
        localwj2.c -= 1;
        localwj1 = localyo.a.a(2, localwj3.b, 1);
        break label1002;
        if (localwj3.b >= localwj2.b + localwj2.c) {
          break label1027;
        }
        i = localwj2.b + localwj2.c - localwj3.b;
        localObject = localyo.a.a(2, localwj3.b + 1, i);
        localwj2.c -= i;
        break label1027;
        localArrayList.remove(j);
        localyo.a.a(localwj2);
      }
      int i3 = this.a.size();
      i1 = 0;
      if (i1 < i3)
      {
        localwj1 = (wj)this.a.get(i1);
        switch (localwj1.a)
        {
        }
        for (;;)
        {
          i1++;
          break;
          c(localwj1);
          continue;
          int i4 = localwj1.b;
          i = localwj1.b;
          k = localwj1.c + i;
          i2 = -1;
          i = localwj1.b;
          n = 0;
          if (i < k)
          {
            j = 0;
            m = 0;
            if ((this.d.a(i) != null) || (b(i)))
            {
              if (i2 == 0)
              {
                b(a(1, i4, n));
                m = 1;
              }
              j = 1;
              if (m == 0) {
                break label1490;
              }
              m = i - n;
              i = k - n;
            }
            for (k = 1;; k = n)
            {
              n = k;
              k = i;
              i = m + 1;
              i2 = j;
              break;
              if (i2 == 1)
              {
                c(a(1, i4, n));
                j = 1;
              }
              i2 = 0;
              m = j;
              j = i2;
              break label1411;
              n++;
              m = i;
              i = k;
            }
          }
          localObject = localwj1;
          if (n != localwj1.c)
          {
            a(localwj1);
            localObject = a(1, i4, n);
          }
          if (i2 == 0)
          {
            b((wj)localObject);
          }
          else
          {
            c((wj)localObject);
            continue;
            j = localwj1.b;
            i4 = localwj1.b;
            int i5 = localwj1.c;
            i = localwj1.b;
            k = 0;
            i2 = -1;
            if (i < i4 + i5)
            {
              if ((this.d.a(i) != null) || (b(i)))
              {
                n = k;
                m = j;
                if (i2 == 0)
                {
                  b(a(2, j, k));
                  n = 0;
                  m = i;
                }
                k = m;
                m = n;
              }
              for (j = 1;; j = 0)
              {
                n = i + 1;
                m++;
                i = k;
                i2 = j;
                k = m;
                j = i;
                i = n;
                break;
                n = k;
                m = j;
                if (i2 == 1)
                {
                  c(a(2, j, k));
                  n = 0;
                  m = i;
                }
                k = m;
                m = n;
              }
            }
            localObject = localwj1;
            if (k != localwj1.c)
            {
              a(localwj1);
              localObject = a(2, j, k);
            }
            if (i2 == 0)
            {
              b((wj)localObject);
            }
            else
            {
              c((wj)localObject);
              continue;
              c(localwj1);
            }
          }
        }
      }
      this.a.clear();
      return;
    }
  }
  
  public final void c()
  {
    int j = this.c.size();
    for (int i = 0; i < j; i++) {
      this.d.b((wj)this.c.get(i));
    }
    a(this.c);
  }
  
  final boolean d()
  {
    if (this.a.size() > 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final void e()
  {
    c();
    int j = this.a.size();
    int i = 0;
    if (i < j)
    {
      wj localwj = (wj)this.a.get(i);
      switch (localwj.a)
      {
      }
      for (;;)
      {
        i++;
        break;
        this.d.b(localwj);
        this.d.d(localwj.b, localwj.c);
        continue;
        this.d.b(localwj);
        this.d.a(localwj.b, localwj.c);
        continue;
        this.d.b(localwj);
        this.d.c(localwj.b, localwj.c);
        continue;
        this.d.b(localwj);
        this.d.e(localwj.b, localwj.c);
      }
    }
    a(this.a);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\wh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */