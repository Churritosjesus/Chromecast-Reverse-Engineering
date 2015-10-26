.class public final Lsm;
.super Landroid/widget/HorizontalScrollView;
.source "PG"

# interfaces
.implements Lrz;


# instance fields
.field a:Ljava/lang/Runnable;

.field public b:Z

.field c:I

.field private d:Lsp;

.field private e:Lsr;

.field private f:I

.field private g:I

.field private h:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 73
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    return-void
.end method

.method static synthetic a(Lsm;Lml;Z)Lsq;
    .locals 4

    .prologue
    .line 54
    const/4 v0, 0x1

    .line 4288
    new-instance v1, Lsq;

    invoke-virtual {p0}, Lsm;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, p0, v2, p1, v0}, Lsq;-><init>(Lsm;Landroid/content/Context;Lml;Z)V

    .line 4290
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lsq;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4291
    new-instance v0, Landroid/widget/AbsListView$LayoutParams;

    const/4 v2, -0x1

    iget v3, p0, Lsm;->g:I

    invoke-direct {v0, v2, v3}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v0}, Lsq;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 54
    return-object v1
.end method

.method static synthetic a(Lsm;)Lxu;
    .locals 1

    .prologue
    .line 54
    const/4 v0, 0x0

    return-object v0
.end method

.method private a(I)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/4 v5, 0x0

    .line 179
    iput p1, p0, Lsm;->h:I

    .line 180
    invoke-virtual {v5}, Lxu;->getChildCount()I

    move-result v3

    move v2, v1

    .line 181
    :goto_0
    if-ge v2, v3, :cond_3

    .line 182
    invoke-virtual {v5, v2}, Lxu;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 183
    if-ne v2, p1, :cond_2

    const/4 v0, 0x1

    .line 184
    :goto_1
    invoke-virtual {v4, v0}, Landroid/view/View;->setSelected(Z)V

    .line 185
    if-eqz v0, :cond_1

    .line 2256
    invoke-virtual {v5, p1}, Lxu;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 2257
    iget-object v4, p0, Lsm;->a:Ljava/lang/Runnable;

    if-eqz v4, :cond_0

    .line 2258
    iget-object v4, p0, Lsm;->a:Ljava/lang/Runnable;

    invoke-virtual {p0, v4}, Lsm;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 2260
    :cond_0
    new-instance v4, Lsn;

    invoke-direct {v4, p0, v0}, Lsn;-><init>(Lsm;Landroid/view/View;)V

    iput-object v4, p0, Lsm;->a:Ljava/lang/Runnable;

    .line 2267
    iget-object v0, p0, Lsm;->a:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lsm;->post(Ljava/lang/Runnable;)Z

    .line 181
    :cond_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_2
    move v0, v1

    .line 183
    goto :goto_1

    .line 189
    :cond_3
    iget-object v0, p0, Lsm;->e:Lsr;

    if-eqz v0, :cond_4

    if-ltz p1, :cond_4

    .line 190
    iget-object v0, p0, Lsm;->e:Lsr;

    invoke-virtual {v0, p1}, Lsr;->a(I)V

    .line 192
    :cond_4
    return-void
.end method

.method private a()Z
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lsm;->e:Lsr;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lsm;->e:Lsr;

    invoke-virtual {v0}, Lsr;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b()Z
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 169
    invoke-direct {p0}, Lsm;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 175
    :goto_0
    return v4

    .line 171
    :cond_0
    iget-object v0, p0, Lsm;->e:Lsr;

    invoke-virtual {p0, v0}, Lsm;->removeView(Landroid/view/View;)V

    .line 172
    const/4 v0, 0x0

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x2

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0, v1}, Lsm;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 174
    iget-object v0, p0, Lsm;->e:Lsr;

    .line 1554
    iget v0, v0, Lrx;->n:I

    .line 174
    invoke-direct {p0, v0}, Lsm;->a(I)V

    goto :goto_0
.end method


# virtual methods
.method public final onAttachedToWindow()V
    .locals 1

    .prologue
    .line 272
    invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onAttachedToWindow()V

    .line 273
    iget-object v0, p0, Lsm;->a:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 275
    iget-object v0, p0, Lsm;->a:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lsm;->post(Ljava/lang/Runnable;)Z

    .line 277
    :cond_0
    return-void
.end method

.method protected final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 219
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-lt v0, v1, :cond_0

    .line 220
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 223
    :cond_0
    invoke-virtual {p0}, Lsm;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lph;->a(Landroid/content/Context;)Lph;

    move-result-object v1

    .line 3073
    iget-object v0, v1, Lph;->a:Landroid/content/Context;

    const/4 v2, 0x0

    sget-object v3, Loq;->a:[I

    sget v4, La;->i:I

    invoke-virtual {v0, v2, v3, v4, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 3075
    sget v0, Loq;->j:I

    invoke-virtual {v2, v0, v5}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v0

    .line 3076
    iget-object v3, v1, Lph;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 3077
    invoke-virtual {v1}, Lph;->a()Z

    move-result v4

    if-nez v4, :cond_1

    .line 3079
    sget v4, La;->Z:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 3082
    :cond_1
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 3195
    iput v0, p0, Lsm;->g:I

    .line 3196
    invoke-virtual {p0}, Lsm;->requestLayout()V

    .line 4094
    iget-object v0, v1, Lph;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, La;->aa:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 227
    iput v0, p0, Lsm;->f:I

    .line 228
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 281
    invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onDetachedFromWindow()V

    .line 282
    iget-object v0, p0, Lsm;->a:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 283
    iget-object v0, p0, Lsm;->a:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lsm;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 285
    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 9

    .prologue
    const/high16 v8, 0x40000000    # 2.0f

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v7, -0x1

    const/4 v6, 0x0

    .line 93
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    .line 94
    if-ne v3, v8, :cond_6

    move v0, v1

    .line 95
    :goto_0
    invoke-virtual {p0, v0}, Lsm;->setFillViewport(Z)V

    .line 97
    invoke-virtual {v6}, Lxu;->getChildCount()I

    move-result v4

    .line 98
    if-le v4, v1, :cond_8

    if-eq v3, v8, :cond_0

    const/high16 v5, -0x80000000

    if-ne v3, v5, :cond_8

    .line 100
    :cond_0
    const/4 v3, 0x2

    if-le v4, v3, :cond_7

    .line 101
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    int-to-float v3, v3

    const v4, 0x3ecccccd    # 0.4f

    mul-float/2addr v3, v4

    float-to-int v3, v3

    iput v3, p0, Lsm;->c:I

    .line 105
    :goto_1
    iget v3, p0, Lsm;->c:I

    iget v4, p0, Lsm;->f:I

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    iput v3, p0, Lsm;->c:I

    .line 110
    :goto_2
    iget v3, p0, Lsm;->g:I

    invoke-static {v3, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 112
    if-nez v0, :cond_9

    iget-boolean v4, p0, Lsm;->b:Z

    if-eqz v4, :cond_9

    .line 114
    :goto_3
    if-eqz v1, :cond_b

    .line 116
    invoke-virtual {v6, v2, v3}, Lxu;->measure(II)V

    .line 117
    invoke-virtual {v6}, Lxu;->getMeasuredWidth()I

    move-result v1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    if-le v1, v2, :cond_a

    .line 1150
    invoke-direct {p0}, Lsm;->a()Z

    move-result v1

    if-nez v1, :cond_4

    .line 1152
    iget-object v1, p0, Lsm;->e:Lsr;

    if-nez v1, :cond_1

    .line 1210
    new-instance v1, Lsr;

    invoke-virtual {p0}, Lsm;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v4, La;->n:I

    invoke-direct {v1, v2, v6, v4}, Lsr;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 1212
    new-instance v2, Lxv;

    const/4 v4, -0x2

    invoke-direct {v2, v4, v7}, Lxv;-><init>(II)V

    invoke-virtual {v1, v2}, Lsr;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1214
    invoke-virtual {v1, p0}, Lsr;->b(Lrz;)V

    .line 1153
    iput-object v1, p0, Lsm;->e:Lsr;

    .line 1155
    :cond_1
    invoke-virtual {p0, v6}, Lsm;->removeView(Landroid/view/View;)V

    .line 1156
    iget-object v1, p0, Lsm;->e:Lsr;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v4, -0x2

    invoke-direct {v2, v4, v7}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v1, v2}, Lsm;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1158
    iget-object v1, p0, Lsm;->e:Lsr;

    .line 1308
    iget-object v1, v1, Lqy;->a:Landroid/widget/SpinnerAdapter;

    .line 1158
    if-nez v1, :cond_2

    .line 1159
    iget-object v1, p0, Lsm;->e:Lsr;

    new-instance v2, Lso;

    .line 1538
    invoke-direct {v2, p0}, Lso;-><init>(Lsm;)V

    .line 1159
    invoke-virtual {v1, v2}, Lsr;->a(Landroid/widget/SpinnerAdapter;)V

    .line 1161
    :cond_2
    iget-object v1, p0, Lsm;->a:Ljava/lang/Runnable;

    if-eqz v1, :cond_3

    .line 1162
    iget-object v1, p0, Lsm;->a:Ljava/lang/Runnable;

    invoke-virtual {p0, v1}, Lsm;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1163
    iput-object v6, p0, Lsm;->a:Ljava/lang/Runnable;

    .line 1165
    :cond_3
    iget-object v1, p0, Lsm;->e:Lsr;

    iget v2, p0, Lsm;->h:I

    invoke-virtual {v1, v2}, Lsr;->a(I)V

    .line 126
    :cond_4
    :goto_4
    invoke-virtual {p0}, Lsm;->getMeasuredWidth()I

    move-result v1

    .line 127
    invoke-super {p0, p1, v3}, Landroid/widget/HorizontalScrollView;->onMeasure(II)V

    .line 128
    invoke-virtual {p0}, Lsm;->getMeasuredWidth()I

    move-result v2

    .line 130
    if-eqz v0, :cond_5

    if-eq v1, v2, :cond_5

    .line 132
    iget v0, p0, Lsm;->h:I

    invoke-direct {p0, v0}, Lsm;->a(I)V

    .line 134
    :cond_5
    return-void

    :cond_6
    move v0, v2

    .line 94
    goto/16 :goto_0

    .line 103
    :cond_7
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    iput v3, p0, Lsm;->c:I

    goto/16 :goto_1

    .line 107
    :cond_8
    iput v7, p0, Lsm;->c:I

    goto/16 :goto_2

    :cond_9
    move v1, v2

    .line 112
    goto/16 :goto_3

    .line 120
    :cond_a
    invoke-direct {p0}, Lsm;->b()Z

    goto :goto_4

    .line 123
    :cond_b
    invoke-direct {p0}, Lsm;->b()Z

    goto :goto_4
.end method
