import com.google.android.apps.chromecast.app.SetupApplication;

public final class blv
{
  dan[] a;
  
  public final dan a(Integer paramInteger, boolean paramBoolean, int paramInt)
  {
    if (this.a == null) {
      paramInteger = null;
    }
    for (;;)
    {
      return paramInteger;
      label162:
      label168:
      label254:
      label260:
      label289:
      label433:
      label439:
      for (int j = 0;; j++)
      {
        if (j >= this.a.length) {
          break label445;
        }
        Object localObject1 = this.a[j];
        int i;
        if ((paramInteger != null) && ((((dan)localObject1).b == null) || (((dan)localObject1).b.longValue() <= paramInteger.intValue()))) {
          i = 0;
        }
        for (;;)
        {
          if (i == 0) {
            break label439;
          }
          paramInteger = this.a[j];
          break;
          if (((dan)localObject1).g == null)
          {
            i = 0;
          }
          else
          {
            Object localObject2 = ((dan)localObject1).d;
            if ((localObject2 == null) || (localObject2.length == 0)) {
              i = 1;
            }
            int k;
            for (;;)
            {
              if (i != 0) {
                break label168;
              }
              i = 0;
              break;
              k = localObject2.length;
              for (i = 0;; i++)
              {
                if (i >= k) {
                  break label162;
                }
                if (localObject2[i] == 0)
                {
                  i = 1;
                  break;
                }
              }
              i = 0;
            }
            String[] arrayOfString = ((dan)localObject1).e;
            if ((arrayOfString == null) || (arrayOfString.length == 0)) {
              i = 1;
            }
            for (;;)
            {
              if (i != 0) {
                break label260;
              }
              i = 0;
              break;
              if (SetupApplication.g())
              {
                localObject2 = SetupApplication.a().c;
                k = arrayOfString.length;
                for (i = 0;; i++)
                {
                  if (i >= k) {
                    break label254;
                  }
                  if (((String)localObject2).equals(arrayOfString[i]))
                  {
                    i = 1;
                    break;
                  }
                }
              }
              i = 0;
            }
            if (((dan)localObject1).c == 0) {}
            for (boolean bool = true;; bool = false)
            {
              if (bool == paramBoolean) {
                break label289;
              }
              i = 0;
              break;
            }
            if ((((dan)localObject1).f != null) && (((dan)localObject1).f.length > 0))
            {
              if (paramInt == 0)
              {
                i = 0;
              }
              else
              {
                switch (blw.a[(paramInt - 1)])
                {
                default: 
                  i = 5;
                }
                for (;;)
                {
                  localObject1 = ((dan)localObject1).f;
                  int m = localObject1.length;
                  for (k = 0; k < m; k++) {
                    if (localObject1[k] == i) {
                      break label433;
                    }
                  }
                  i = 0;
                  continue;
                  i = 1;
                  continue;
                  i = 2;
                  continue;
                  i = 3;
                  continue;
                  i = 4;
                }
                i = 0;
              }
            }
            else {
              i = 1;
            }
          }
        }
      }
      label445:
      paramInteger = null;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\blv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */