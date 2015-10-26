.class public Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;
.super Landroid/view/View;
.source "PG"

# interfaces
.implements Lhx;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xf
.end annotation


# instance fields
.field private final A:Landroid/graphics/Path;

.field private final B:Landroid/graphics/Path;

.field private final C:Landroid/graphics/Path;

.field private final D:Landroid/graphics/RectF;

.field private E:Landroid/animation/ValueAnimator;

.field private F:[Landroid/animation/ValueAnimator;

.field private G:Landroid/animation/AnimatorSet;

.field private H:Lczy;

.field private I:[Ldac;

.field private final J:Landroid/view/animation/Interpolator;

.field private K:F

.field private L:F

.field private M:F

.field private N:F

.field private O:F

.field private P:F

.field private Q:F

.field private R:F

.field public a:Landroid/support/v4/view/ViewPager;

.field public b:Lhx;

.field private c:I

.field private d:I

.field private e:J

.field private f:I

.field private g:I

.field private h:F

.field private i:F

.field private j:J

.field private k:F

.field private l:F

.field private m:F

.field private n:I

.field private o:I

.field private p:F

.field private q:Z

.field private r:[F

.field private s:[F

.field private t:F

.field private u:F

.field private v:[F

.field private w:Z

.field private final x:Landroid/graphics/Paint;

.field private final y:Landroid/graphics/Paint;

.field private final z:Landroid/graphics/Path;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const-class v0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 106
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 107
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 110
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 111
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 114
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 115
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    float-to-int v0, v0

    .line 118
    invoke-virtual {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Ldai;->a:[I

    const/4 v3, 0x0

    invoke-virtual {v1, p2, v2, p3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 120
    sget v2, Ldai;->d:I

    mul-int/lit8 v3, v0, 0x8

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->c:I

    .line 122
    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->c:I

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    iput v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    .line 123
    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    iput v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->i:F

    .line 124
    sget v2, Ldai;->e:I

    mul-int/lit8 v0, v0, 0xc

    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->d:I

    .line 126
    sget v0, Ldai;->b:I

    const/16 v2, 0x190

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v0

    int-to-long v2, v0

    iput-wide v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->e:J

    .line 128
    iget-wide v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->e:J

    const-wide/16 v4, 0x2

    div-long/2addr v2, v4

    iput-wide v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->j:J

    .line 129
    sget v0, Ldai;->f:I

    const v2, -0x7f000001

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->f:I

    .line 131
    sget v0, Ldai;->c:I

    const/4 v2, -0x1

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->g:I

    .line 133
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 134
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v6}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->x:Landroid/graphics/Paint;

    .line 135
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->x:Landroid/graphics/Paint;

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->f:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 136
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v6}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->y:Landroid/graphics/Paint;

    .line 137
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->y:Landroid/graphics/Paint;

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->g:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 139
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 140
    const v0, 0x10c000d

    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->J:Landroid/view/animation/Interpolator;

    .line 146
    :goto_0
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->z:Landroid/graphics/Path;

    .line 147
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->A:Landroid/graphics/Path;

    .line 148
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->B:Landroid/graphics/Path;

    .line 149
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->C:Landroid/graphics/Path;

    .line 150
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->D:Landroid/graphics/RectF;

    .line 152
    new-instance v0, Lczs;

    invoke-direct {v0, p0}, Lczs;-><init>(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)V

    invoke-virtual {p0, v0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 162
    return-void

    .line 142
    :cond_0
    const v0, 0x10a0004

    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->J:Landroid/view/animation/Interpolator;

    goto :goto_0
.end method

.method public static synthetic a(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;F)F
    .locals 0

    .prologue
    .line 32
    iput p1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->p:F

    return p1
.end method

.method public static synthetic a(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)Landroid/support/v4/view/ViewPager;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->a:Landroid/support/v4/view/ViewPager;

    return-object v0
.end method

.method public static synthetic a(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;I)V
    .locals 0

    .prologue
    .line 32
    invoke-virtual {p0, p1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->c(I)V

    return-void
.end method

.method public static synthetic a(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;IF)V
    .locals 1

    .prologue
    .line 32
    .line 4638
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->s:[F

    aput p2, v0, p1

    .line 4639
    invoke-virtual {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->postInvalidateOnAnimation()V

    .line 32
    return-void
.end method

.method public static synthetic a(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;Z)Z
    .locals 0

    .prologue
    .line 32
    iput-boolean p1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->w:Z

    return p1
.end method

.method public static synthetic a(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;[Ldac;)[Ldac;
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->I:[Ldac;

    return-object p1
.end method

.method public static synthetic b(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)F
    .locals 1

    .prologue
    .line 32
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->p:F

    return v0
.end method

.method public static synthetic b(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;F)F
    .locals 0

    .prologue
    .line 32
    iput p1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->t:F

    return p1
.end method

.method private b()V
    .locals 6

    .prologue
    .line 227
    invoke-virtual {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->getPaddingLeft()I

    move-result v0

    .line 228
    invoke-virtual {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->getPaddingTop()I

    move-result v1

    .line 229
    invoke-virtual {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    .line 230
    invoke-direct {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->d()I

    move-result v3

    .line 231
    sub-int/2addr v2, v0

    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v0, v2

    int-to-float v0, v0

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    add-float/2addr v2, v0

    .line 232
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->n:I

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->r:[F

    .line 233
    const/4 v0, 0x0

    :goto_0
    iget v3, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->n:I

    if-ge v0, v3, :cond_0

    .line 234
    iget-object v3, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->r:[F

    iget v4, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->c:I

    iget v5, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->d:I

    add-int/2addr v4, v5

    mul-int/2addr v4, v0

    int-to-float v4, v4

    add-float/2addr v4, v2

    aput v4, v3, v0

    .line 233
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 237
    :cond_0
    int-to-float v0, v1

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->k:F

    .line 238
    int-to-float v0, v1

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    add-float/2addr v0, v2

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->l:F

    .line 239
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->c:I

    add-int/2addr v0, v1

    int-to-float v0, v0

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->m:F

    .line 240
    invoke-virtual {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->a()V

    .line 241
    return-void
.end method

.method public static synthetic b(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;IF)V
    .locals 1

    .prologue
    .line 32
    .line 4648
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->v:[F

    aput p2, v0, p1

    .line 4649
    invoke-virtual {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->postInvalidateOnAnimation()V

    .line 32
    return-void
.end method

.method public static synthetic b(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;Z)Z
    .locals 0

    .prologue
    .line 32
    iput-boolean p1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->q:Z

    return p1
.end method

.method public static synthetic c(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;F)F
    .locals 0

    .prologue
    .line 32
    iput p1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->u:F

    return p1
.end method

.method public static synthetic c(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)Lczy;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->H:Lczy;

    return-object v0
.end method

.method private c()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/high16 v1, -0x40800000    # -1.0f

    .line 256
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->n:I

    if-lez v0, :cond_0

    .line 257
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->n:I

    add-int/lit8 v0, v0, -0x1

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->s:[F

    .line 258
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->s:[F

    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([FF)V

    .line 259
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->n:I

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->v:[F

    .line 260
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->v:[F

    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([FF)V

    .line 261
    iput v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->t:F

    .line 262
    iput v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->u:F

    .line 263
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->q:Z

    .line 265
    :cond_0
    return-void
.end method

.method private d()I
    .locals 3

    .prologue
    .line 318
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->n:I

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->c:I

    mul-int/2addr v0, v1

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->n:I

    add-int/lit8 v1, v1, -0x1

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->d:I

    mul-int/2addr v1, v2

    add-int/2addr v0, v1

    return v0
.end method

.method public static synthetic d(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)J
    .locals 2

    .prologue
    .line 32
    iget-wide v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->j:J

    return-wide v0
.end method

.method public static synthetic e(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)Landroid/view/animation/Interpolator;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->J:Landroid/view/animation/Interpolator;

    return-object v0
.end method

.method private e()V
    .locals 4

    .prologue
    .line 653
    .line 3661
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->E:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->E:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3662
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->E:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 654
    :cond_0
    invoke-direct {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->f()V

    .line 3679
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->H:Lczy;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->H:Lczy;

    invoke-virtual {v0}, Lczy;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3680
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->H:Lczy;

    invoke-virtual {v0}, Lczy;->cancel()V

    .line 3685
    :cond_1
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->I:[Ldac;

    if-eqz v0, :cond_2

    .line 3686
    iget-object v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->I:[Ldac;

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_2

    aget-object v3, v1, v0

    .line 3687
    invoke-virtual {v3}, Ldac;->cancel()V

    .line 3686
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 657
    :cond_2
    invoke-direct {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->c()V

    .line 658
    return-void
.end method

.method private f()V
    .locals 1

    .prologue
    .line 673
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->G:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->G:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 674
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->G:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 676
    :cond_0
    return-void
.end method

.method public static synthetic f(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)[F
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->r:[F

    return-object v0
.end method

.method public static synthetic g(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)F
    .locals 1

    .prologue
    .line 32
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    return v0
.end method

.method public static synthetic h(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)[Ldac;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->I:[Ldac;

    return-object v0
.end method

.method public static synthetic i(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)F
    .locals 1

    .prologue
    .line 32
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->t:F

    return v0
.end method

.method public static synthetic j(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)F
    .locals 1

    .prologue
    .line 32
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->u:F

    return v0
.end method

.method public static synthetic k(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->f()V

    return-void
.end method

.method public static synthetic l(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)V
    .locals 2

    .prologue
    .line 32
    .line 4643
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->s:[F

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 4644
    invoke-virtual {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->postInvalidateOnAnimation()V

    .line 32
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 244
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->a:Landroid/support/v4/view/ViewPager;

    if-eqz v0, :cond_1

    .line 245
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->a:Landroid/support/v4/view/ViewPager;

    .line 2509
    iget v0, v0, Landroid/support/v4/view/ViewPager;->b:I

    .line 245
    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->o:I

    .line 250
    :goto_0
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->n:I

    if-lez v0, :cond_0

    .line 251
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->r:[F

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->o:I

    aget v0, v0, v1

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->p:F

    .line 253
    :cond_0
    return-void

    .line 247
    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->o:I

    goto :goto_0
.end method

.method public final a(I)V
    .locals 13

    .prologue
    const-wide/16 v10, 0x4

    const/4 v12, 0x2

    const/4 v6, 0x0

    const/high16 v8, 0x3e800000    # 0.25f

    .line 198
    iget-boolean v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->w:Z

    if-eqz v0, :cond_8

    .line 1544
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->o:I

    if-eq p1, v0, :cond_0

    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->n:I

    if-nez v0, :cond_2

    .line 207
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->b:Lhx;

    if-eqz v0, :cond_1

    .line 208
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->b:Lhx;

    invoke-interface {v0, p1}, Lhx;->a(I)V

    .line 210
    :cond_1
    return-void

    .line 1548
    :cond_2
    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->o:I

    .line 1549
    iput p1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->o:I

    .line 1552
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_7

    .line 1553
    invoke-direct {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->e()V

    .line 1559
    sub-int v0, p1, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v4

    .line 1560
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->r:[F

    aget v1, v0, p1

    .line 1581
    new-array v0, v12, [F

    iget v3, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->p:F

    aput v3, v0, v6

    const/4 v3, 0x1

    aput v1, v0, v3

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v7

    .line 1584
    new-instance v0, Lczy;

    if-le p1, v2, :cond_3

    .line 1586
    new-instance v5, Ldag;

    iget v3, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->p:F

    sub-float v3, v1, v3

    mul-float/2addr v3, v8

    sub-float/2addr v1, v3

    invoke-direct {v5, p0, v1}, Ldag;-><init>(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;F)V

    :goto_1
    move-object v1, p0

    move v3, p1

    .line 1587
    invoke-direct/range {v0 .. v5}, Lczy;-><init>(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;IIILdah;)V

    iput-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->H:Lczy;

    .line 1589
    new-instance v0, Lczu;

    invoke-direct {v0, p0}, Lczu;-><init>(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)V

    invoke-virtual {v7, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 1599
    new-instance v0, Lczv;

    invoke-direct {v0, p0}, Lczv;-><init>(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)V

    invoke-virtual {v7, v0}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 1616
    iget-boolean v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->q:Z

    if-eqz v0, :cond_4

    iget-wide v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->e:J

    div-long/2addr v0, v10

    :goto_2
    invoke-virtual {v7, v0, v1}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 1617
    iget-wide v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->e:J

    const-wide/16 v8, 0x3

    mul-long/2addr v0, v8

    div-long/2addr v0, v10

    invoke-virtual {v7, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 1618
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->J:Landroid/view/animation/Interpolator;

    invoke-virtual {v7, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 1560
    iput-object v7, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->E:Landroid/animation/ValueAnimator;

    .line 1565
    new-array v0, v4, [Landroid/animation/ValueAnimator;

    iput-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->F:[Landroid/animation/ValueAnimator;

    move v1, v6

    .line 1566
    :goto_3
    if-ge v1, v4, :cond_6

    .line 1567
    iget-object v3, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->F:[Landroid/animation/ValueAnimator;

    if-le p1, v2, :cond_5

    add-int v0, v2, v1

    :goto_4
    int-to-long v6, v1

    iget-wide v8, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->e:J

    const-wide/16 v10, 0x8

    div-long/2addr v8, v10

    mul-long/2addr v6, v8

    .line 1624
    new-array v5, v12, [F

    fill-array-data v5, :array_0

    invoke-static {v5}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v5

    .line 1625
    new-instance v8, Lczw;

    invoke-direct {v8, p0, v0}, Lczw;-><init>(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;I)V

    invoke-virtual {v5, v8}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 1631
    iget-wide v8, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->j:J

    invoke-virtual {v5, v8, v9}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 1632
    invoke-virtual {v5, v6, v7}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 1633
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->J:Landroid/view/animation/Interpolator;

    invoke-virtual {v5, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 1567
    aput-object v5, v3, v1

    .line 1566
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    .line 1587
    :cond_3
    new-instance v5, Lczx;

    iget v3, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->p:F

    sub-float/2addr v3, v1

    mul-float/2addr v3, v8

    add-float/2addr v1, v3

    invoke-direct {v5, p0, v1}, Lczx;-><init>(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;F)V

    goto :goto_1

    .line 1616
    :cond_4
    const-wide/16 v0, 0x0

    goto :goto_2

    .line 1567
    :cond_5
    add-int/lit8 v0, v2, -0x1

    sub-int/2addr v0, v1

    goto :goto_4

    .line 1570
    :cond_6
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->E:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 1667
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->G:Landroid/animation/AnimatorSet;

    .line 1668
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->G:Landroid/animation/AnimatorSet;

    iget-object v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->F:[Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 1669
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->G:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    goto/16 :goto_0

    .line 1573
    :cond_7
    invoke-virtual {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->a()V

    .line 1574
    invoke-virtual {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->invalidate()V

    goto/16 :goto_0

    .line 203
    :cond_8
    invoke-virtual {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->a()V

    goto/16 :goto_0

    .line 1624
    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final a(IFI)V
    .locals 1

    .prologue
    .line 191
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->b:Lhx;

    if-eqz v0, :cond_0

    .line 192
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->b:Lhx;

    invoke-interface {v0, p1, p2, p3}, Lhx;->a(IFI)V

    .line 194
    :cond_0
    return-void
.end method

.method public final b(I)V
    .locals 1

    .prologue
    .line 215
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->b:Lhx;

    if-eqz v0, :cond_0

    .line 216
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->b:Lhx;

    invoke-interface {v0, p1}, Lhx;->b(I)V

    .line 218
    :cond_0
    return-void
.end method

.method public c(I)V
    .locals 0

    .prologue
    .line 221
    iput p1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->n:I

    .line 222
    invoke-direct {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->b()V

    .line 223
    invoke-direct {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->c()V

    .line 224
    return-void
.end method

.method public clearAnimation()V
    .locals 2

    .prologue
    .line 307
    invoke-super {p0}, Landroid/view/View;->clearAnimation()V

    .line 308
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 309
    invoke-direct {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->e()V

    .line 311
    :cond_0
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 12

    .prologue
    .line 327
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->a:Landroid/support/v4/view/ViewPager;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->n:I

    if-nez v0, :cond_1

    .line 332
    :cond_0
    :goto_0
    return-void

    .line 3335
    :cond_1
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->z:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->rewind()V

    .line 3338
    const/4 v0, 0x0

    move v7, v0

    :goto_1
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->n:I

    if-ge v7, v0, :cond_d

    .line 3339
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->n:I

    add-int/lit8 v0, v0, -0x1

    if-ne v7, v0, :cond_a

    move v0, v7

    .line 3342
    :goto_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_c

    .line 3343
    iget-object v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->r:[F

    aget v9, v1, v7

    iget-object v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->r:[F

    aget v10, v1, v0

    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->n:I

    add-int/lit8 v0, v0, -0x1

    if-ne v7, v0, :cond_b

    .line 3346
    const/high16 v0, -0x40800000    # -1.0f

    move v8, v0

    :goto_3
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->v:[F

    aget v11, v0, v7

    .line 3387
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->A:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->rewind()V

    .line 3389
    const/4 v0, 0x0

    cmpl-float v0, v8, v0

    if-eqz v0, :cond_2

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, v8, v0

    if-nez v0, :cond_4

    :cond_2
    const/4 v0, 0x0

    cmpl-float v0, v11, v0

    if-nez v0, :cond_4

    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->o:I

    if-ne v7, v0, :cond_3

    iget-boolean v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->q:Z

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    .line 3393
    :cond_3
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->A:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->r:[F

    aget v1, v1, v7

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->l:F

    iget v3, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 3396
    :cond_4
    const/4 v0, 0x0

    cmpl-float v0, v8, v0

    if-lez v0, :cond_6

    const/high16 v0, 0x3f000000    # 0.5f

    cmpg-float v0, v8, v0

    if-gez v0, :cond_6

    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->t:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_6

    .line 3399
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->B:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->rewind()V

    .line 3402
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->B:Landroid/graphics/Path;

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->m:F

    invoke-virtual {v0, v9, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 3405
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->D:Landroid/graphics/RectF;

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    sub-float v1, v9, v1

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->k:F

    iget v3, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    add-float/2addr v3, v9

    iget v4, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->m:F

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 3406
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->B:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->D:Landroid/graphics/RectF;

    const/high16 v2, 0x42b40000    # 90.0f

    const/high16 v3, 0x43340000    # 180.0f

    const/4 v4, 0x1

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 3409
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    add-float/2addr v0, v9

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->d:I

    int-to-float v1, v1

    mul-float/2addr v1, v8

    add-float/2addr v0, v1

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->K:F

    .line 3410
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->l:F

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->L:F

    .line 3411
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->i:F

    add-float/2addr v0, v9

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->O:F

    .line 3412
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->k:F

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->P:F

    .line 3413
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->K:F

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->Q:F

    .line 3414
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->L:F

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->i:F

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->R:F

    .line 3415
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->B:Landroid/graphics/Path;

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->O:F

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->P:F

    iget v3, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->Q:F

    iget v4, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->R:F

    iget v5, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->K:F

    iget v6, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->L:F

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 3418
    iput v9, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->M:F

    .line 3419
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->m:F

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->N:F

    .line 3420
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->K:F

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->O:F

    .line 3421
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->L:F

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->i:F

    add-float/2addr v0, v1

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->P:F

    .line 3422
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->i:F

    add-float/2addr v0, v9

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->Q:F

    .line 3423
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->m:F

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->R:F

    .line 3424
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->B:Landroid/graphics/Path;

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->O:F

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->P:F

    iget v3, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->Q:F

    iget v4, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->R:F

    iget v5, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->M:F

    iget v6, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->N:F

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 3425
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_5

    .line 3426
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->A:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->B:Landroid/graphics/Path;

    sget-object v2, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 3430
    :cond_5
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->C:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->rewind()V

    .line 3433
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->C:Landroid/graphics/Path;

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->m:F

    invoke-virtual {v0, v10, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 3436
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->D:Landroid/graphics/RectF;

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    sub-float v1, v10, v1

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->k:F

    iget v3, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    add-float/2addr v3, v10

    iget v4, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->m:F

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 3437
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->C:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->D:Landroid/graphics/RectF;

    const/high16 v2, 0x42b40000    # 90.0f

    const/high16 v3, -0x3ccc0000    # -180.0f

    const/4 v4, 0x1

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 3440
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    sub-float v0, v10, v0

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->d:I

    int-to-float v1, v1

    mul-float/2addr v1, v8

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->K:F

    .line 3441
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->l:F

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->L:F

    .line 3442
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->i:F

    sub-float v0, v10, v0

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->O:F

    .line 3443
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->k:F

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->P:F

    .line 3444
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->K:F

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->Q:F

    .line 3445
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->L:F

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->i:F

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->R:F

    .line 3446
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->C:Landroid/graphics/Path;

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->O:F

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->P:F

    iget v3, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->Q:F

    iget v4, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->R:F

    iget v5, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->K:F

    iget v6, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->L:F

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 3449
    iput v10, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->M:F

    .line 3450
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->m:F

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->N:F

    .line 3451
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->K:F

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->O:F

    .line 3452
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->L:F

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->i:F

    add-float/2addr v0, v1

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->P:F

    .line 3453
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->M:F

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->i:F

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->Q:F

    .line 3454
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->m:F

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->R:F

    .line 3455
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->C:Landroid/graphics/Path;

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->O:F

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->P:F

    iget v3, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->Q:F

    iget v4, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->R:F

    iget v5, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->M:F

    iget v6, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->N:F

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 3456
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_6

    .line 3457
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->A:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->C:Landroid/graphics/Path;

    sget-object v2, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 3461
    :cond_6
    const/high16 v0, 0x3f000000    # 0.5f

    cmpl-float v0, v8, v0

    if-lez v0, :cond_7

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, v8, v0

    if-gez v0, :cond_7

    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->t:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_7

    .line 3464
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->A:Landroid/graphics/Path;

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->m:F

    invoke-virtual {v0, v9, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 3467
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->D:Landroid/graphics/RectF;

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    sub-float v1, v9, v1

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->k:F

    iget v3, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    add-float/2addr v3, v9

    iget v4, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->m:F

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 3468
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->A:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->D:Landroid/graphics/RectF;

    const/high16 v2, 0x42b40000    # 90.0f

    const/high16 v3, 0x43340000    # 180.0f

    const/4 v4, 0x1

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 3471
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    add-float/2addr v0, v9

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->d:I

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    add-float/2addr v0, v1

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->K:F

    .line 3472
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->l:F

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    mul-float/2addr v1, v8

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->L:F

    .line 3473
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->K:F

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    mul-float/2addr v1, v8

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->O:F

    .line 3474
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->k:F

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->P:F

    .line 3475
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->K:F

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, v8

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->Q:F

    .line 3476
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->L:F

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->R:F

    .line 3477
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->A:Landroid/graphics/Path;

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->O:F

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->P:F

    iget v3, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->Q:F

    iget v4, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->R:F

    iget v5, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->K:F

    iget v6, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->L:F

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 3480
    iput v10, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->M:F

    .line 3481
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->k:F

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->N:F

    .line 3482
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->K:F

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, v8

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->O:F

    .line 3483
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->L:F

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->P:F

    .line 3484
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->K:F

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    mul-float/2addr v1, v8

    add-float/2addr v0, v1

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->Q:F

    .line 3485
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->k:F

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->R:F

    .line 3486
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->A:Landroid/graphics/Path;

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->O:F

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->P:F

    iget v3, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->Q:F

    iget v4, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->R:F

    iget v5, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->M:F

    iget v6, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->N:F

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 3489
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->D:Landroid/graphics/RectF;

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    sub-float v1, v10, v1

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->k:F

    iget v3, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    add-float/2addr v3, v10

    iget v4, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->m:F

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 3490
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->A:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->D:Landroid/graphics/RectF;

    const/high16 v2, 0x43870000    # 270.0f

    const/high16 v3, 0x43340000    # 180.0f

    const/4 v4, 0x1

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 3494
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->l:F

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    mul-float/2addr v1, v8

    add-float/2addr v0, v1

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->L:F

    .line 3495
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->K:F

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    mul-float/2addr v1, v8

    add-float/2addr v0, v1

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->O:F

    .line 3496
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->m:F

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->P:F

    .line 3497
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->K:F

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, v8

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->Q:F

    .line 3498
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->L:F

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->R:F

    .line 3499
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->A:Landroid/graphics/Path;

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->O:F

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->P:F

    iget v3, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->Q:F

    iget v4, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->R:F

    iget v5, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->K:F

    iget v6, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->L:F

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 3502
    iput v9, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->M:F

    .line 3503
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->m:F

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->N:F

    .line 3504
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->K:F

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, v8

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->O:F

    .line 3505
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->L:F

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->P:F

    .line 3506
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->K:F

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    mul-float/2addr v1, v8

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->Q:F

    .line 3507
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->N:F

    iput v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->R:F

    .line 3508
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->A:Landroid/graphics/Path;

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->O:F

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->P:F

    iget v3, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->Q:F

    iget v4, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->R:F

    iget v5, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->M:F

    iget v6, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->N:F

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 3511
    :cond_7
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, v8, v0

    if-nez v0, :cond_8

    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->t:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_8

    .line 3516
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->D:Landroid/graphics/RectF;

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    sub-float v1, v9, v1

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->k:F

    iget v3, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    add-float/2addr v3, v10

    iget v4, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->m:F

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 3517
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->A:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->D:Landroid/graphics/RectF;

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    iget v3, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    .line 3523
    :cond_8
    const v0, 0x3727c5ac    # 1.0E-5f

    cmpl-float v0, v11, v0

    if-lez v0, :cond_9

    .line 3525
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->A:Landroid/graphics/Path;

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->l:F

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    mul-float/2addr v2, v11

    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, v9, v1, v2, v3}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 3529
    :cond_9
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->A:Landroid/graphics/Path;

    .line 3348
    iget-object v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->z:Landroid/graphics/Path;

    sget-object v2, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    invoke-virtual {v1, v0, v2}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 3338
    :goto_4
    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1

    .line 3339
    :cond_a
    add-int/lit8 v0, v7, 0x1

    goto/16 :goto_2

    .line 3346
    :cond_b
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->s:[F

    aget v0, v0, v7

    move v8, v0

    goto/16 :goto_3

    .line 3350
    :cond_c
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->r:[F

    aget v0, v0, v7

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->l:F

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    iget-object v3, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->x:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto :goto_4

    .line 3355
    :cond_d
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->t:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_e

    .line 3356
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_e

    .line 3357
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->z:Landroid/graphics/Path;

    .line 3533
    iget-object v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->A:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->rewind()V

    .line 3534
    iget-object v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->D:Landroid/graphics/RectF;

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->t:F

    iget v3, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->k:F

    iget v4, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->u:F

    iget v5, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->m:F

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 3535
    iget-object v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->A:Landroid/graphics/Path;

    iget-object v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->D:Landroid/graphics/RectF;

    iget v3, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    iget v4, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    sget-object v5, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    .line 3536
    iget-object v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->A:Landroid/graphics/Path;

    .line 3357
    sget-object v2, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 3360
    :cond_e
    iget-object v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->z:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->x:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 3540
    iget v0, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->p:F

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->l:F

    iget v2, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h:F

    iget-object v3, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->y:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto/16 :goto_0
.end method

.method protected onMeasure(II)V
    .locals 3

    .prologue
    .line 269
    .line 3314
    invoke-virtual {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->getPaddingTop()I

    move-result v0

    iget v1, p0, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->c:I

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->getPaddingBottom()I

    move-result v1

    add-int/2addr v0, v1

    .line 271
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    .line 3322
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->getPaddingLeft()I

    move-result v1

    invoke-direct {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->d()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->getPaddingRight()I

    move-result v2

    add-int/2addr v1, v2

    .line 284
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    sparse-switch v2, :sswitch_data_1

    .line 295
    :goto_1
    invoke-virtual {p0, v1, v0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->setMeasuredDimension(II)V

    .line 296
    invoke-direct {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->b()V

    .line 297
    return-void

    .line 273
    :sswitch_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    goto :goto_0

    .line 276
    :sswitch_1
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_0

    .line 286
    :sswitch_2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    goto :goto_1

    .line 289
    :sswitch_3
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_1

    .line 271
    nop

    :sswitch_data_0
    .sparse-switch
        -0x80000000 -> :sswitch_1
        0x40000000 -> :sswitch_0
    .end sparse-switch

    .line 284
    :sswitch_data_1
    .sparse-switch
        -0x80000000 -> :sswitch_3
        0x40000000 -> :sswitch_2
    .end sparse-switch
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .prologue
    .line 301
    invoke-virtual {p0, p1, p2}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->setMeasuredDimension(II)V

    .line 302
    invoke-direct {p0}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->b()V

    .line 303
    return-void
.end method
