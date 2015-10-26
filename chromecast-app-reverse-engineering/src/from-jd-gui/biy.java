import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class biy
  extends bjq
  implements SurfaceHolder.Callback
{
  private TextView Z;
  public MediaPlayer a;
  private SurfaceHolder aa;
  private bjd ab;
  private boolean ac;
  public boolean b;
  private final blp d = new blp("OtaWaitVideoFragment");
  
  public static biy a(String paramString)
  {
    biy localbiy = new biy();
    Bundle localBundle = new Bundle();
    localBundle.putString("videoUrl", paramString);
    localbiy.f(localBundle);
    return localbiy;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(a.gr, paramViewGroup, false);
    this.aa = ((SurfaceView)paramLayoutInflater.findViewById(f.es)).getHolder();
    this.aa.addCallback(this);
    paramLayoutInflater.findViewById(f.dR).setOnClickListener(new bjc(this));
    this.Z = ((TextView)paramLayoutInflater.findViewById(f.cE));
    return paramLayoutInflater;
  }
  
  public final void a()
  {
    super.a();
    this.ab = null;
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.ab = ((bjd)paramActivity);
  }
  
  public final void a(Bundle paramBundle)
  {
    int i = 0;
    super.a(paramBundle);
    c(true);
    this.a = new MediaPlayer();
    this.a.setAudioStreamType(3);
    try
    {
      this.a.setDataSource(this.m.getString("videoUrl"));
      if (paramBundle != null) {
        i = paramBundle.getInt("playbackPosition");
      }
      this.a.setOnPreparedListener(new biz(this, i));
      this.a.setOnCompletionListener(new bja(this));
      this.a.setOnErrorListener(new bjb(this));
      this.a.prepareAsync();
      return;
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        this.d.a("Issue playing video: %s", new Object[] { paramBundle });
        this.ab.a(0, 0);
      }
    }
  }
  
  public final void d()
  {
    this.Z = null;
    super.d();
  }
  
  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    if (paramBundle != null) {
      this.ac = paramBundle.getBoolean("shouldPlay");
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putInt("playbackPosition", this.a.getCurrentPosition());
    paramBundle.putBoolean("shouldPlay", this.ac);
  }
  
  public final void j()
  {
    super.j();
    if ((this.ac) && (!this.a.isPlaying()))
    {
      this.a.start();
      this.ac = false;
    }
  }
  
  public final void k()
  {
    super.k();
    if ((!this.y.isChangingConfigurations()) && (this.a.isPlaying()))
    {
      this.ac = true;
      this.a.pause();
    }
  }
  
  public final void l()
  {
    super.l();
    if (this.a.isPlaying()) {
      this.a.stop();
    }
    this.a.release();
    this.a = null;
  }
  
  protected final TextView p()
  {
    return this.Z;
  }
  
  public void q()
  {
    int j = this.a.getVideoWidth();
    if (j > 0)
    {
      int k = this.a.getVideoHeight();
      int i = blx.a(this.y);
      j = k * i / j;
      this.aa.setFixedSize(i, j);
    }
  }
  
  public final void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    this.a.setDisplay(paramSurfaceHolder);
    if (this.b) {
      q();
    }
  }
  
  public final void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    this.a.setDisplay(null);
    paramSurfaceHolder.removeCallback(this);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\biy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */