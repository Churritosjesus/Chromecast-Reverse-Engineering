import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;

class fo
  extends fn
{
  public void a(LayoutInflater paramLayoutInflater, fs paramfs)
  {
    if (paramfs != null)
    {
      paramfs = new fr(paramfs);
      paramLayoutInflater.setFactory2(paramfs);
      LayoutInflater.Factory localFactory = paramLayoutInflater.getFactory();
      if (!(localFactory instanceof LayoutInflater.Factory2)) {
        break label44;
      }
      b.a(paramLayoutInflater, (LayoutInflater.Factory2)localFactory);
    }
    for (;;)
    {
      return;
      paramfs = null;
      break;
      label44:
      b.a(paramLayoutInflater, paramfs);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\fo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */