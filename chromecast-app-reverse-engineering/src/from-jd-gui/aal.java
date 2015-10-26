import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

public final class aal
  extends lq
  implements View.OnClickListener
{
  public int e = 1;
  private final SearchView f;
  private final SearchableInfo g;
  private final Context h;
  private final WeakHashMap i;
  private final int j;
  private boolean k = false;
  private ColorStateList l;
  private int m = -1;
  private int n = -1;
  private int o = -1;
  private int p = -1;
  private int q = -1;
  private int r = -1;
  
  public aal(Context paramContext, SearchView paramSearchView, SearchableInfo paramSearchableInfo, WeakHashMap paramWeakHashMap)
  {
    super(paramContext, paramSearchView.c, null, true);
    this.d.getSystemService("search");
    this.f = paramSearchView;
    this.g = paramSearchableInfo;
    this.j = paramSearchView.d;
    this.h = paramContext;
    this.i = paramWeakHashMap;
  }
  
  private Drawable a(ComponentName paramComponentName)
  {
    localObject1 = null;
    localPackageManager = this.d.getPackageManager();
    try
    {
      localObject2 = localPackageManager.getActivityInfo(paramComponentName, 128);
      i1 = ((ActivityInfo)localObject2).getIconResource();
      if (i1 != 0) {
        break label52;
      }
      paramComponentName = (ComponentName)localObject1;
    }
    catch (PackageManager.NameNotFoundException paramComponentName)
    {
      for (;;)
      {
        int i1;
        Log.w("SuggestionsAdapter", paramComponentName.toString());
        paramComponentName = (ComponentName)localObject1;
        continue;
        Object localObject2 = localPackageManager.getDrawable(paramComponentName.getPackageName(), i1, ((ActivityInfo)localObject2).applicationInfo);
        if (localObject2 == null)
        {
          Log.w("SuggestionsAdapter", "Invalid icon resource " + i1 + " for " + paramComponentName.flattenToShortString());
          paramComponentName = (ComponentName)localObject1;
        }
        else
        {
          paramComponentName = (ComponentName)localObject2;
        }
      }
    }
    return paramComponentName;
  }
  
  /* Error */
  private Drawable a(Uri paramUri)
  {
    // Byte code:
    //   0: ldc -105
    //   2: aload_1
    //   3: invokevirtual 156	android/net/Uri:getScheme	()Ljava/lang/String;
    //   6: invokevirtual 162	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   9: istore 5
    //   11: iload 5
    //   13: ifeq +82 -> 95
    //   16: aload_0
    //   17: aload_1
    //   18: invokespecial 165	aal:b	(Landroid/net/Uri;)Landroid/graphics/drawable/Drawable;
    //   21: astore_2
    //   22: aload_2
    //   23: astore_1
    //   24: aload_1
    //   25: areturn
    //   26: astore_2
    //   27: new 145	java/io/FileNotFoundException
    //   30: astore_3
    //   31: new 124	java/lang/StringBuilder
    //   34: astore_2
    //   35: aload_2
    //   36: ldc -89
    //   38: invokespecial 129	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   41: aload_3
    //   42: aload_2
    //   43: aload_1
    //   44: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   47: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   50: invokespecial 171	java/io/FileNotFoundException:<init>	(Ljava/lang/String;)V
    //   53: aload_3
    //   54: athrow
    //   55: astore_2
    //   56: ldc 99
    //   58: new 124	java/lang/StringBuilder
    //   61: dup
    //   62: ldc -83
    //   64: invokespecial 129	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   67: aload_1
    //   68: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   71: ldc -81
    //   73: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: aload_2
    //   77: invokevirtual 178	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   80: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   86: invokestatic 109	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   89: pop
    //   90: aconst_null
    //   91: astore_1
    //   92: goto -68 -> 24
    //   95: aload_0
    //   96: getfield 74	aal:h	Landroid/content/Context;
    //   99: invokevirtual 182	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   102: aload_1
    //   103: invokevirtual 188	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   106: astore_3
    //   107: aload_3
    //   108: ifnonnull +31 -> 139
    //   111: new 145	java/io/FileNotFoundException
    //   114: astore_3
    //   115: new 124	java/lang/StringBuilder
    //   118: astore_2
    //   119: aload_2
    //   120: ldc -66
    //   122: invokespecial 129	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   125: aload_3
    //   126: aload_2
    //   127: aload_1
    //   128: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   131: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   134: invokespecial 171	java/io/FileNotFoundException:<init>	(Ljava/lang/String;)V
    //   137: aload_3
    //   138: athrow
    //   139: aload_3
    //   140: aconst_null
    //   141: invokestatic 196	android/graphics/drawable/Drawable:createFromStream	(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    //   144: astore_2
    //   145: aload_3
    //   146: invokevirtual 202	java/io/InputStream:close	()V
    //   149: aload_2
    //   150: astore_1
    //   151: goto -127 -> 24
    //   154: astore_3
    //   155: new 124	java/lang/StringBuilder
    //   158: astore 4
    //   160: aload 4
    //   162: ldc -52
    //   164: invokespecial 129	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   167: ldc 99
    //   169: aload 4
    //   171: aload_1
    //   172: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   175: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   178: aload_3
    //   179: invokestatic 207	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   182: pop
    //   183: aload_2
    //   184: astore_1
    //   185: goto -161 -> 24
    //   188: astore_2
    //   189: aload_3
    //   190: invokevirtual 202	java/io/InputStream:close	()V
    //   193: aload_2
    //   194: athrow
    //   195: astore_3
    //   196: new 124	java/lang/StringBuilder
    //   199: astore 4
    //   201: aload 4
    //   203: ldc -52
    //   205: invokespecial 129	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   208: ldc 99
    //   210: aload 4
    //   212: aload_1
    //   213: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   216: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   219: aload_3
    //   220: invokestatic 207	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   223: pop
    //   224: goto -31 -> 193
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	227	0	this	aal
    //   0	227	1	paramUri	Uri
    //   21	2	2	localDrawable	Drawable
    //   26	1	2	localNotFoundException	Resources.NotFoundException
    //   34	9	2	localStringBuilder1	StringBuilder
    //   55	22	2	localFileNotFoundException	FileNotFoundException
    //   118	66	2	localObject1	Object
    //   188	6	2	localObject2	Object
    //   30	116	3	localObject3	Object
    //   154	36	3	localIOException1	java.io.IOException
    //   195	25	3	localIOException2	java.io.IOException
    //   158	53	4	localStringBuilder2	StringBuilder
    //   9	3	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   16	22	26	android/content/res/Resources$NotFoundException
    //   0	11	55	java/io/FileNotFoundException
    //   16	22	55	java/io/FileNotFoundException
    //   27	55	55	java/io/FileNotFoundException
    //   95	107	55	java/io/FileNotFoundException
    //   111	139	55	java/io/FileNotFoundException
    //   145	149	55	java/io/FileNotFoundException
    //   155	183	55	java/io/FileNotFoundException
    //   189	193	55	java/io/FileNotFoundException
    //   193	195	55	java/io/FileNotFoundException
    //   196	224	55	java/io/FileNotFoundException
    //   145	149	154	java/io/IOException
    //   139	145	188	finally
    //   189	193	195	java/io/IOException
  }
  
  private Drawable a(String paramString)
  {
    Object localObject1;
    if ((paramString == null) || (paramString.length() == 0) || ("0".equals(paramString))) {
      localObject1 = null;
    }
    for (;;)
    {
      return (Drawable)localObject1;
      try
      {
        int i1 = Integer.parseInt(paramString);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("android.resource://");
        String str = this.h.getPackageName() + "/" + i1;
        localDrawable = b(str);
        localObject1 = localDrawable;
        if (localDrawable == null)
        {
          localObject1 = au.a(this.h, i1);
          a(str, (Drawable)localObject1);
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        Drawable localDrawable = b(paramString);
        Object localObject2 = localDrawable;
        if (localDrawable == null)
        {
          localObject2 = a(Uri.parse(paramString));
          a(paramString, (Drawable)localObject2);
        }
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        Log.w("SuggestionsAdapter", "Icon resource not found: " + paramString);
        Object localObject3 = null;
      }
    }
  }
  
  private static String a(Cursor paramCursor, int paramInt)
  {
    Object localObject = null;
    if (paramInt == -1) {
      paramCursor = (Cursor)localObject;
    }
    for (;;)
    {
      return paramCursor;
      try
      {
        paramCursor = paramCursor.getString(paramInt);
      }
      catch (Exception paramCursor)
      {
        Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", paramCursor);
        paramCursor = (Cursor)localObject;
      }
    }
  }
  
  public static String a(Cursor paramCursor, String paramString)
  {
    return a(paramCursor, paramCursor.getColumnIndex(paramString));
  }
  
  private static void a(ImageView paramImageView, Drawable paramDrawable, int paramInt)
  {
    paramImageView.setImageDrawable(paramDrawable);
    if (paramDrawable == null) {
      paramImageView.setVisibility(paramInt);
    }
    for (;;)
    {
      return;
      paramImageView.setVisibility(0);
      paramDrawable.setVisible(false, false);
      paramDrawable.setVisible(true, false);
    }
  }
  
  private static void a(TextView paramTextView, CharSequence paramCharSequence)
  {
    paramTextView.setText(paramCharSequence);
    if (TextUtils.isEmpty(paramCharSequence)) {
      paramTextView.setVisibility(8);
    }
    for (;;)
    {
      return;
      paramTextView.setVisibility(0);
    }
  }
  
  private void a(String paramString, Drawable paramDrawable)
  {
    if (paramDrawable != null) {
      this.i.put(paramString, paramDrawable.getConstantState());
    }
  }
  
  private Drawable b(Uri paramUri)
  {
    String str = paramUri.getAuthority();
    if (TextUtils.isEmpty(str)) {
      throw new FileNotFoundException("No authority: " + paramUri);
    }
    Resources localResources;
    List localList;
    try
    {
      localResources = this.d.getPackageManager().getResourcesForApplication(str);
      localList = paramUri.getPathSegments();
      if (localList == null) {
        throw new FileNotFoundException("No path: " + paramUri);
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new FileNotFoundException("No package found for authority: " + paramUri);
    }
    int i1 = localList.size();
    if (i1 == 1) {}
    for (;;)
    {
      try
      {
        i1 = Integer.parseInt((String)localList.get(0));
        if (i1 != 0) {
          break;
        }
        throw new FileNotFoundException("No resource found for: " + paramUri);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new FileNotFoundException("Single path segment is not a resource ID: " + paramUri);
      }
      if (i1 == 2) {
        i1 = localResources.getIdentifier((String)localList.get(1), (String)localList.get(0), localNumberFormatException);
      } else {
        throw new FileNotFoundException("More than two path segments: " + paramUri);
      }
    }
    return localResources.getDrawable(i1);
  }
  
  private Drawable b(String paramString)
  {
    paramString = (Drawable.ConstantState)this.i.get(paramString);
    if (paramString == null) {}
    for (paramString = null;; paramString = paramString.newDrawable()) {
      return paramString;
    }
  }
  
  private static void c(Cursor paramCursor)
  {
    if (paramCursor != null) {}
    for (paramCursor = paramCursor.getExtras();; paramCursor = null)
    {
      if ((paramCursor != null) && (paramCursor.getBoolean("in_progress"))) {}
      return;
    }
  }
  
  public final Cursor a(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null) {}
    for (paramCharSequence = ""; (this.f.getVisibility() != 0) || (this.f.getWindowVisibility() != 0); paramCharSequence = paramCharSequence.toString())
    {
      paramCharSequence = null;
      return paramCharSequence;
    }
    Object localObject;
    for (;;)
    {
      try
      {
        localObject = this.g;
        if (localObject != null) {
          break label83;
        }
        paramCharSequence = null;
        if (paramCharSequence != null) {
          paramCharSequence.getCount();
        }
      }
      catch (RuntimeException paramCharSequence)
      {
        Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", paramCharSequence);
        paramCharSequence = null;
      }
      break;
      label83:
      str = ((SearchableInfo)localObject).getSuggestAuthority();
      if (str != null) {
        break label99;
      }
      paramCharSequence = null;
    }
    label99:
    Uri.Builder localBuilder = new android/net/Uri$Builder;
    localBuilder.<init>();
    localBuilder = localBuilder.scheme("content").authority(str).query("").fragment("");
    String str = ((SearchableInfo)localObject).getSuggestPath();
    if (str != null) {
      localBuilder.appendEncodedPath(str);
    }
    localBuilder.appendPath("search_suggest_query");
    str = ((SearchableInfo)localObject).getSuggestSelection();
    if (str != null)
    {
      localObject = new String[1];
      localObject[0] = paramCharSequence;
    }
    for (paramCharSequence = (CharSequence)localObject;; paramCharSequence = null)
    {
      localBuilder.appendQueryParameter("limit", "50");
      localObject = localBuilder.build();
      paramCharSequence = this.d.getContentResolver().query((Uri)localObject, null, str, paramCharSequence, null);
      break;
      localBuilder.appendPath(paramCharSequence);
    }
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    paramContext = super.a(paramContext, paramCursor, paramViewGroup);
    paramContext.setTag(new aam(paramContext));
    ((ImageView)paramContext.findViewById(a.bf)).setImageResource(this.j);
    return paramContext;
  }
  
  public final void a(Cursor paramCursor)
  {
    try
    {
      super.a(paramCursor);
      if (paramCursor != null)
      {
        this.m = paramCursor.getColumnIndex("suggest_text_1");
        this.n = paramCursor.getColumnIndex("suggest_text_2");
        this.o = paramCursor.getColumnIndex("suggest_text_2_url");
        this.p = paramCursor.getColumnIndex("suggest_icon_1");
        this.q = paramCursor.getColumnIndex("suggest_icon_2");
        this.r = paramCursor.getColumnIndex("suggest_flags");
      }
      return;
    }
    catch (Exception paramCursor)
    {
      for (;;)
      {
        Log.e("SuggestionsAdapter", "error changing cursor and caching columns", paramCursor);
      }
    }
  }
  
  public final void a(View paramView, Cursor paramCursor)
  {
    Object localObject2 = null;
    aam localaam = (aam)paramView.getTag();
    if (this.r != -1) {}
    for (int i1 = paramCursor.getInt(this.r);; i1 = 0)
    {
      if (localaam.a != null)
      {
        paramView = a(paramCursor, this.m);
        a(localaam.a, paramView);
      }
      Object localObject1;
      if (localaam.b != null)
      {
        localObject1 = a(paramCursor, this.o);
        if (localObject1 != null)
        {
          if (this.l == null)
          {
            paramView = new TypedValue();
            this.d.getTheme().resolveAttribute(a.R, paramView, true);
            this.l = this.d.getResources().getColorStateList(paramView.resourceId);
          }
          paramView = new SpannableString((CharSequence)localObject1);
          paramView.setSpan(new TextAppearanceSpan(null, 0, 0, this.l, null), 0, ((CharSequence)localObject1).length(), 33);
          if (!TextUtils.isEmpty(paramView)) {
            break label341;
          }
          if (localaam.a != null)
          {
            localaam.a.setSingleLine(false);
            localaam.a.setMaxLines(2);
          }
          label198:
          a(localaam.b, paramView);
        }
      }
      else
      {
        if (localaam.c != null)
        {
          ImageView localImageView = localaam.c;
          if (this.p != -1) {
            break label370;
          }
          paramView = null;
          label232:
          a(localImageView, paramView, 4);
        }
        if (localaam.d != null)
        {
          localObject1 = localaam.d;
          if (this.q != -1) {
            break label505;
          }
          paramView = (View)localObject2;
          label264:
          a((ImageView)localObject1, paramView, 8);
        }
        if ((this.e != 2) && ((this.e != 1) || ((i1 & 0x1) == 0))) {
          break label523;
        }
        localaam.e.setVisibility(0);
        localaam.e.setTag(localaam.a.getText());
        localaam.e.setOnClickListener(this);
      }
      for (;;)
      {
        return;
        paramView = a(paramCursor, this.n);
        break;
        label341:
        if (localaam.a == null) {
          break label198;
        }
        localaam.a.setSingleLine(true);
        localaam.a.setMaxLines(1);
        break label198;
        label370:
        localObject1 = a(paramCursor.getString(this.p));
        paramView = (View)localObject1;
        if (localObject1 != null) {
          break label232;
        }
        paramView = this.g.getSearchActivity();
        String str = paramView.flattenToShortString();
        if (this.i.containsKey(str))
        {
          paramView = (Drawable.ConstantState)this.i.get(str);
          if (paramView == null) {}
          for (localObject1 = null;; localObject1 = paramView.newDrawable(this.h.getResources()))
          {
            paramView = (View)localObject1;
            if (localObject1 != null) {
              break;
            }
            paramView = this.d.getPackageManager().getDefaultActivityIcon();
            break;
          }
        }
        localObject1 = a(paramView);
        if (localObject1 == null) {}
        for (paramView = null;; paramView = ((Drawable)localObject1).getConstantState())
        {
          this.i.put(str, paramView);
          break;
        }
        label505:
        paramView = a(paramCursor.getString(this.q));
        break label264;
        label523:
        localaam.e.setVisibility(8);
      }
    }
  }
  
  public final CharSequence b(Cursor paramCursor)
  {
    Object localObject2 = null;
    Object localObject1;
    if (paramCursor == null) {
      localObject1 = localObject2;
    }
    for (;;)
    {
      return (CharSequence)localObject1;
      localObject1 = a(paramCursor, "suggest_intent_query");
      if (localObject1 == null) {
        if (this.g.shouldRewriteQueryFromData())
        {
          localObject1 = a(paramCursor, "suggest_intent_data");
          if (localObject1 != null) {}
        }
        else
        {
          localObject1 = localObject2;
          if (this.g.shouldRewriteQueryFromText())
          {
            paramCursor = a(paramCursor, "suggest_text_1");
            localObject1 = localObject2;
            if (paramCursor != null) {
              localObject1 = paramCursor;
            }
          }
        }
      }
    }
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    try
    {
      paramView = super.getView(paramInt, paramView, paramViewGroup);
      return paramView;
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", localRuntimeException);
        paramView = a(this.d, this.c, paramViewGroup);
        if (paramView != null) {
          ((aam)paramView.getTag()).a.setText(localRuntimeException.toString());
        }
      }
    }
  }
  
  public final boolean hasStableIds()
  {
    return false;
  }
  
  public final void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
    c(this.c);
  }
  
  public final void notifyDataSetInvalidated()
  {
    super.notifyDataSetInvalidated();
    c(this.c);
  }
  
  public final void onClick(View paramView)
  {
    paramView = paramView.getTag();
    if ((paramView instanceof CharSequence)) {
      this.f.a((CharSequence)paramView);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */