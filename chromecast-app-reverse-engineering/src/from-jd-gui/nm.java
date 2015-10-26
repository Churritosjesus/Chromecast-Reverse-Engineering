import android.content.Context;
import android.view.Window;
import android.view.Window.Callback;

final class nm
  extends nl
{
  boolean n = true;
  
  nm(Context paramContext, Window paramWindow, ng paramng)
  {
    super(paramContext, paramWindow, paramng);
  }
  
  final Window.Callback a(Window.Callback paramCallback)
  {
    return new nn(this, paramCallback);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\nm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */