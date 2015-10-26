.class public Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;
.super Landroid/widget/HorizontalScrollView;
.source "PG"


# instance fields
.field public a:I

.field public b:I

.field public c:Landroid/support/v4/view/ViewPager;

.field public d:Lhx;

.field public e:Lbog;

.field public final f:Lboh;

.field private g:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 97
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 98
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 101
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 102
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .prologue
    .line 105
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 108
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->setHorizontalScrollBarEnabled(Z)V

    .line 110
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->setFillViewport(Z)V

    .line 112
    const/high16 v0, 0x41c00000    # 24.0f

    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->g:I

    .line 114
    new-instance v0, Lboh;

    invoke-direct {v0, p1}, Lboh;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->f:Lboh;

    .line 115
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->f:Lboh;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->addView(Landroid/view/View;II)V

    .line 116
    return-void
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;)Lboh;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->f:Lboh;

    return-object v0
.end method

.method private a(II)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 258
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->f:Lboh;

    invoke-virtual {v0}, Lboh;->getChildCount()I

    move-result v0

    .line 259
    if-eqz v0, :cond_0

    if-ltz p1, :cond_0

    if-lt p1, v0, :cond_1

    .line 284
    :cond_0
    return-void

    .line 263
    :cond_1
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->f:Lboh;

    invoke-virtual {v0, p1}, Lboh;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 264
    if-eqz v0, :cond_4

    .line 265
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/view/View;->setSelected(Z)V

    .line 266
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    add-int/2addr v0, p2

    .line 268
    if-gtz p1, :cond_2

    if-lez p2, :cond_3

    .line 270
    :cond_2
    iget v2, p0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->g:I

    sub-int/2addr v0, v2

    .line 273
    :cond_3
    invoke-virtual {p0, v0, v1}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->scrollTo(II)V

    :cond_4
    move v0, v1

    .line 276
    :goto_0
    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->f:Lboh;

    invoke-virtual {v2}, Lboh;->getChildCount()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 277
    if-eq v0, p1, :cond_5

    .line 278
    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->f:Lboh;

    invoke-virtual {v2, v0}, Lboh;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 279
    if-eqz v2, :cond_5

    .line 280
    invoke-virtual {v2, v1}, Landroid/view/View;->setSelected(Z)V

    .line 276
    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;II)V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0, p1, p2}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->a(II)V

    return-void
.end method

.method public static synthetic b(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;)Lhx;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->d:Lhx;

    return-object v0
.end method

.method public static synthetic c(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;)Landroid/support/v4/view/ViewPager;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->c:Landroid/support/v4/view/ViewPager;

    return-object v0
.end method

.method public static synthetic d(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;)Lbog;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->e:Lbog;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 11

    .prologue
    const/4 v4, 0x0

    const/4 v10, 0x1

    const/4 v3, 0x0

    .line 217
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->c:Landroid/support/v4/view/ViewPager;

    .line 1474
    iget-object v5, v0, Landroid/support/v4/view/ViewPager;->a:Lgn;

    .line 218
    new-instance v6, Lboe;

    .line 2333
    invoke-direct {v6, p0}, Lboe;-><init>(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;)V

    move v2, v3

    .line 220
    :goto_0
    invoke-virtual {v5}, Lgn;->a()I

    move-result v0

    if-ge v2, v0, :cond_5

    .line 224
    iget v0, p0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->a:I

    if-eqz v0, :cond_6

    .line 226
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget v1, p0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->a:I

    iget-object v7, p0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->f:Lboh;

    invoke-virtual {v0, v1, v7, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 228
    iget v0, p0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->b:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 231
    :goto_1
    if-nez v1, :cond_2

    .line 232
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->getContext()Landroid/content/Context;

    move-result-object v7

    .line 3187
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 3188
    const/16 v7, 0x11

    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 3189
    const/4 v7, 0x2

    const/high16 v8, 0x41400000    # 12.0f

    invoke-virtual {v1, v7, v8}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 3190
    sget-object v7, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 3192
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0xb

    if-lt v7, v8, :cond_0

    .line 3195
    new-instance v7, Landroid/util/TypedValue;

    invoke-direct {v7}, Landroid/util/TypedValue;-><init>()V

    .line 3196
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v8

    const v9, 0x101030e

    invoke-virtual {v8, v9, v7, v10}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 3198
    iget v7, v7, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 3201
    :cond_0
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0xe

    if-lt v7, v8, :cond_1

    .line 3203
    invoke-virtual {v1, v10}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 3206
    :cond_1
    const/high16 v7, 0x41800000    # 16.0f

    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v7, v8

    float-to-int v7, v7

    .line 3207
    invoke-virtual {v1, v7, v7, v7, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 235
    :cond_2
    if-nez v0, :cond_3

    const-class v7, Landroid/widget/TextView;

    invoke-virtual {v7, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    move-object v0, v1

    .line 236
    check-cast v0, Landroid/widget/TextView;

    .line 239
    :cond_3
    if-eqz v0, :cond_4

    .line 240
    invoke-virtual {v5, v2}, Lgn;->b(I)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 242
    :cond_4
    invoke-virtual {v1, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 244
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->f:Lboh;

    invoke-virtual {v0, v1}, Lboh;->addView(Landroid/view/View;)V

    .line 220
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto/16 :goto_0

    .line 246
    :cond_5
    return-void

    :cond_6
    move-object v0, v4

    move-object v1, v4

    goto :goto_1
.end method

.method protected onAttachedToWindow()V
    .locals 2

    .prologue
    .line 250
    invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onAttachedToWindow()V

    .line 252
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->c:Landroid/support/v4/view/ViewPager;

    if-eqz v0, :cond_0

    .line 253
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->c:Landroid/support/v4/view/ViewPager;

    .line 3509
    iget v0, v0, Landroid/support/v4/view/ViewPager;->b:I

    .line 253
    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->a(II)V

    .line 255
    :cond_0
    return-void
.end method
