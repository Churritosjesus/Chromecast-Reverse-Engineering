.class public Lajq;
.super Landroid/app/Dialog;
.source "PG"


# instance fields
.field a:Ljava/lang/String;

.field b:Lajx;

.field c:Landroid/webkit/WebView;

.field d:Z

.field e:Z

.field private f:Ljava/lang/String;

.field private g:Landroid/app/ProgressDialog;

.field private h:Landroid/widget/ImageView;

.field private i:Landroid/widget/FrameLayout;

.field private j:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 113
    const v0, 0x1030010

    invoke-direct {p0, p1, p2, v0}, Lajq;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    .line 114
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 125
    const v0, 0x1030010

    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 80
    const-string v0, "fbconnect://success"

    iput-object v0, p0, Lajq;->a:Ljava/lang/String;

    .line 86
    iput-boolean v1, p0, Lajq;->d:Z

    .line 87
    iput-boolean v1, p0, Lajq;->j:Z

    .line 88
    iput-boolean v1, p0, Lajq;->e:Z

    .line 126
    iput-object p2, p0, Lajq;->f:Ljava/lang/String;

    .line 127
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;ILajx;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 139
    if-nez p4, :cond_0

    const p4, 0x1030010

    :cond_0
    invoke-direct {p0, p1, p4}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 80
    const-string v0, "fbconnect://success"

    iput-object v0, p0, Lajq;->a:Ljava/lang/String;

    .line 86
    iput-boolean v1, p0, Lajq;->d:Z

    .line 87
    iput-boolean v1, p0, Lajq;->j:Z

    .line 88
    iput-boolean v1, p0, Lajq;->e:Z

    .line 141
    if-nez p3, :cond_1

    .line 142
    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 146
    :cond_1
    const-string v0, "redirect_uri"

    const-string v1, "fbconnect://success"

    invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    const-string v0, "display"

    const-string v1, "touch"

    invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    invoke-static {}, Lajh;->a()Ljava/lang/String;

    move-result-object v0

    .line 152
    invoke-static {}, Lajh;->d()Ljava/lang/String;

    move-result-object v1

    const-string v2, "dialog/"

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "/"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 150
    invoke-static {v0, v1, p3}, Laji;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/net/Uri;

    move-result-object v0

    .line 154
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lajq;->f:Ljava/lang/String;

    .line 155
    iput-object p5, p0, Lajq;->b:Lajx;

    .line 156
    return-void
.end method

.method private static a(IFII)I
    .locals 6

    .prologue
    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    .line 316
    int-to-float v2, p0

    div-float/2addr v2, p1

    float-to-int v2, v2

    .line 318
    if-gt v2, p2, :cond_1

    .line 319
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 330
    :cond_0
    :goto_0
    int-to-double v2, p0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    return v0

    .line 320
    :cond_1
    if-ge v2, p3, :cond_0

    .line 325
    sub-int v2, p3, v2

    int-to-double v2, v2

    sub-int v4, p3, p2

    int-to-double v4, v4

    div-double/2addr v2, v4

    mul-double/2addr v2, v0

    add-double/2addr v0, v2

    goto :goto_0
.end method

.method static synthetic a(Lajq;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lajq;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lajq;Z)Z
    .locals 1

    .prologue
    .line 55
    const/4 v0, 0x1

    iput-boolean v0, p0, Lajq;->e:Z

    return v0
.end method

.method static synthetic b(Lajq;)Z
    .locals 1

    .prologue
    .line 55
    iget-boolean v0, p0, Lajq;->j:Z

    return v0
.end method

.method static synthetic c(Lajq;)Landroid/app/ProgressDialog;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lajq;->g:Landroid/app/ProgressDialog;

    return-object v0
.end method

.method static synthetic d(Lajq;)Landroid/widget/FrameLayout;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lajq;->i:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method static synthetic e(Lajq;)Landroid/webkit/WebView;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lajq;->c:Landroid/webkit/WebView;

    return-object v0
.end method

.method static synthetic f(Lajq;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lajq;->h:Landroid/widget/ImageView;

    return-object v0
.end method


# virtual methods
.method protected a(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 2

    .prologue
    .line 267
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 269
    invoke-virtual {v0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Laji;->b(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    .line 270
    invoke-virtual {v0}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Laji;->b(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 272
    return-object v1
.end method

.method public final a()V
    .locals 6

    .prologue
    const/16 v5, 0x320

    .line 288
    invoke-virtual {p0}, Lajq;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 289
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 290
    new-instance v2, Landroid/util/DisplayMetrics;

    invoke-direct {v2}, Landroid/util/DisplayMetrics;-><init>()V

    .line 291
    invoke-virtual {v0, v2}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 294
    iget v0, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v1, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    if-ge v0, v1, :cond_0

    iget v0, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 295
    :goto_0
    iget v1, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v3, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    if-ge v1, v3, :cond_1

    iget v1, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 297
    :goto_1
    iget v3, v2, Landroid/util/DisplayMetrics;->density:F

    const/16 v4, 0x1e0

    .line 298
    invoke-static {v0, v3, v4, v5}, Lajq;->a(IFII)I

    move-result v0

    iget v3, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 297
    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 300
    iget v3, v2, Landroid/util/DisplayMetrics;->density:F

    const/16 v4, 0x500

    .line 301
    invoke-static {v1, v3, v5, v4}, Lajq;->a(IFII)I

    move-result v1

    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 300
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 304
    invoke-virtual {p0}, Lajq;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Landroid/view/Window;->setLayout(II)V

    .line 305
    return-void

    .line 294
    :cond_0
    iget v0, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    goto :goto_0

    .line 295
    :cond_1
    iget v1, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    goto :goto_1
.end method

.method protected final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 342
    iget-object v0, p0, Lajq;->b:Lajx;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lajq;->d:Z

    if-nez v0, :cond_0

    .line 343
    const/4 v0, 0x1

    iput-boolean v0, p0, Lajq;->d:Z

    .line 346
    check-cast p1, Lafq;

    .line 350
    iget-object v0, p0, Lajq;->b:Lajx;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Lajx;->a(Landroid/os/Bundle;Lafq;)V

    .line 351
    invoke-virtual {p0}, Lajq;->dismiss()V

    .line 353
    :cond_0
    return-void
.end method

.method public cancel()V
    .locals 1

    .prologue
    .line 356
    iget-object v0, p0, Lajq;->b:Lajx;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lajq;->d:Z

    if-nez v0, :cond_0

    .line 357
    new-instance v0, Lafr;

    invoke-direct {v0}, Lafr;-><init>()V

    invoke-virtual {p0, v0}, Lajq;->a(Ljava/lang/Throwable;)V

    .line 359
    :cond_0
    return-void
.end method

.method public dismiss()V
    .locals 1

    .prologue
    .line 187
    iget-object v0, p0, Lajq;->c:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 188
    iget-object v0, p0, Lajq;->c:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    .line 190
    :cond_0
    iget-boolean v0, p0, Lajq;->j:Z

    if-nez v0, :cond_1

    .line 191
    iget-object v0, p0, Lajq;->g:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lajq;->g:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 192
    iget-object v0, p0, Lajq;->g:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 195
    :cond_1
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    .line 196
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 1

    .prologue
    .line 212
    const/4 v0, 0x0

    iput-boolean v0, p0, Lajq;->j:Z

    .line 213
    invoke-super {p0}, Landroid/app/Dialog;->onAttachedToWindow()V

    .line 214
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, -0x1

    const/4 v6, -0x2

    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 218
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 220
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-virtual {p0}, Lajq;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lajq;->g:Landroid/app/ProgressDialog;

    .line 221
    iget-object v0, p0, Lajq;->g:Landroid/app/ProgressDialog;

    invoke-virtual {v0, v4}, Landroid/app/ProgressDialog;->requestWindowFeature(I)Z

    .line 222
    iget-object v0, p0, Lajq;->g:Landroid/app/ProgressDialog;

    invoke-virtual {p0}, Lajq;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, La;->dc:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 223
    iget-object v0, p0, Lajq;->g:Landroid/app/ProgressDialog;

    new-instance v1, Lajr;

    invoke-direct {v1, p0}, Lajr;-><init>(Lajq;)V

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 230
    invoke-virtual {p0, v4}, Lajq;->requestWindowFeature(I)Z

    .line 231
    new-instance v0, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Lajq;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lajq;->i:Landroid/widget/FrameLayout;

    .line 234
    invoke-virtual {p0}, Lajq;->a()V

    .line 235
    invoke-virtual {p0}, Lajq;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/view/Window;->setGravity(I)V

    .line 238
    invoke-virtual {p0}, Lajq;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 1362
    new-instance v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lajq;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lajq;->h:Landroid/widget/ImageView;

    .line 1364
    iget-object v0, p0, Lajq;->h:Landroid/widget/ImageView;

    new-instance v1, Lajs;

    invoke-direct {v1, p0}, Lajs;-><init>(Lajq;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1370
    invoke-virtual {p0}, Lajq;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, La;->cV:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 1371
    iget-object v1, p0, Lajq;->h:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1375
    iget-object v0, p0, Lajq;->h:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 249
    iget-object v0, p0, Lajq;->h:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    .line 251
    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1

    .line 1380
    new-instance v1, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lajq;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1381
    new-instance v2, Lajt;

    invoke-virtual {p0}, Lajq;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, p0, v3}, Lajt;-><init>(Lajq;Landroid/content/Context;)V

    iput-object v2, p0, Lajq;->c:Landroid/webkit/WebView;

    .line 1393
    iget-object v2, p0, Lajq;->c:Landroid/webkit/WebView;

    invoke-virtual {v2, v5}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V

    .line 1394
    iget-object v2, p0, Lajq;->c:Landroid/webkit/WebView;

    invoke-virtual {v2, v5}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V

    .line 1395
    iget-object v2, p0, Lajq;->c:Landroid/webkit/WebView;

    new-instance v3, Lajw;

    .line 1422
    invoke-direct {v3, p0}, Lajw;-><init>(Lajq;)V

    .line 1395
    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 1396
    iget-object v2, p0, Lajq;->c:Landroid/webkit/WebView;

    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 1397
    iget-object v2, p0, Lajq;->c:Landroid/webkit/WebView;

    iget-object v3, p0, Lajq;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1398
    iget-object v2, p0, Lajq;->c:Landroid/webkit/WebView;

    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v3, v7, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1400
    iget-object v2, p0, Lajq;->c:Landroid/webkit/WebView;

    invoke-virtual {v2, v8}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 1401
    iget-object v2, p0, Lajq;->c:Landroid/webkit/WebView;

    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 1402
    iget-object v2, p0, Lajq;->c:Landroid/webkit/WebView;

    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V

    .line 1403
    iget-object v2, p0, Lajq;->c:Landroid/webkit/WebView;

    invoke-virtual {v2, v4}, Landroid/webkit/WebView;->setFocusable(Z)V

    .line 1404
    iget-object v2, p0, Lajq;->c:Landroid/webkit/WebView;

    invoke-virtual {v2, v4}, Landroid/webkit/WebView;->setFocusableInTouchMode(Z)V

    .line 1405
    iget-object v2, p0, Lajq;->c:Landroid/webkit/WebView;

    new-instance v3, Laju;

    invoke-direct {v3, p0}, Laju;-><init>(Lajq;)V

    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1416
    invoke-virtual {v1, v0, v0, v0, v0}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 1417
    iget-object v0, p0, Lajq;->c:Landroid/webkit/WebView;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 1418
    const/high16 v0, -0x34000000    # -3.3554432E7f

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 1419
    iget-object v0, p0, Lajq;->i:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 256
    iget-object v0, p0, Lajq;->i:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lajq;->h:Landroid/widget/ImageView;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v2, v6, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 259
    iget-object v0, p0, Lajq;->i:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v0}, Lajq;->setContentView(Landroid/view/View;)V

    .line 260
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 206
    const/4 v0, 0x1

    iput-boolean v0, p0, Lajq;->j:Z

    .line 207
    invoke-super {p0}, Landroid/app/Dialog;->onDetachedFromWindow()V

    .line 208
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 178
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 179
    invoke-virtual {p0}, Lajq;->cancel()V

    .line 182
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method protected onStart()V
    .locals 0

    .prologue
    .line 200
    invoke-super {p0}, Landroid/app/Dialog;->onStart()V

    .line 201
    invoke-virtual {p0}, Lajq;->a()V

    .line 202
    return-void
.end method
