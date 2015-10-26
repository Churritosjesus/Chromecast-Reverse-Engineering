import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.RatingBar;

public final class wr
  extends RatingBar
{
  private static final int[] a = { 16843067, 16843068 };
  private Bitmap b;
  
  public wr(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.N);
  }
  
  private wr(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (tf.a)
    {
      paramContext = th.a(getContext(), paramAttributeSet, a, paramInt, 0);
      paramAttributeSet = paramContext.b(0);
      if (paramAttributeSet != null) {
        setIndeterminateDrawable(a(paramAttributeSet));
      }
      paramAttributeSet = paramContext.b(1);
      if (paramAttributeSet != null) {
        setProgressDrawable(a(paramAttributeSet, false));
      }
      paramContext.a.recycle();
    }
  }
  
  private Drawable a(Drawable paramDrawable)
  {
    Object localObject = paramDrawable;
    if ((paramDrawable instanceof AnimationDrawable))
    {
      paramDrawable = (AnimationDrawable)paramDrawable;
      int j = paramDrawable.getNumberOfFrames();
      localObject = new AnimationDrawable();
      ((AnimationDrawable)localObject).setOneShot(paramDrawable.isOneShot());
      for (int i = 0; i < j; i++)
      {
        Drawable localDrawable = a(paramDrawable.getFrame(i), true);
        localDrawable.setLevel(10000);
        ((AnimationDrawable)localObject).addFrame(localDrawable, paramDrawable.getDuration(i));
      }
      ((AnimationDrawable)localObject).setLevel(10000);
    }
    return (Drawable)localObject;
  }
  
  private Drawable a(Drawable paramDrawable, boolean paramBoolean)
  {
    int j = 0;
    Object localObject2;
    Object localObject1;
    if ((paramDrawable instanceof bu))
    {
      localObject2 = ((bu)paramDrawable).a();
      localObject1 = paramDrawable;
      if (localObject2 != null)
      {
        localObject1 = a((Drawable)localObject2, paramBoolean);
        ((bu)paramDrawable).a((Drawable)localObject1);
        localObject1 = paramDrawable;
      }
    }
    for (;;)
    {
      return (Drawable)localObject1;
      if ((paramDrawable instanceof LayerDrawable))
      {
        paramDrawable = (LayerDrawable)paramDrawable;
        int k = paramDrawable.getNumberOfLayers();
        localObject2 = new Drawable[k];
        int i = 0;
        if (i < k)
        {
          int m = paramDrawable.getId(i);
          localObject1 = paramDrawable.getDrawable(i);
          if ((m == 16908301) || (m == 16908303)) {}
          for (paramBoolean = true;; paramBoolean = false)
          {
            localObject2[i] = a((Drawable)localObject1, paramBoolean);
            i++;
            break;
          }
        }
        localObject1 = new LayerDrawable((Drawable[])localObject2);
        for (i = j; i < k; i++) {
          ((LayerDrawable)localObject1).setId(i, paramDrawable.getId(i));
        }
      }
      else
      {
        localObject1 = paramDrawable;
        if ((paramDrawable instanceof BitmapDrawable))
        {
          paramDrawable = ((BitmapDrawable)paramDrawable).getBitmap();
          if (this.b == null) {
            this.b = paramDrawable;
          }
          localObject1 = new ShapeDrawable(new RoundRectShape(new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F }, null, null));
          paramDrawable = new BitmapShader(paramDrawable, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
          ((ShapeDrawable)localObject1).getPaint().setShader(paramDrawable);
          if (paramBoolean) {
            localObject1 = new ClipDrawable((Drawable)localObject1, 3, 1);
          }
        }
      }
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      if (this.b != null) {
        setMeasuredDimension(gt.a(this.b.getWidth() * getNumStars(), paramInt1, 0), getMeasuredHeight());
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\wr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */