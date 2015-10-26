.class public Llw;
.super Landroid/view/ViewGroup;
.source "PG"


# static fields
.field private static final f:Ljava/lang/String;

.field private static final r:[I


# instance fields
.field private A:I

.field private B:I

.field private C:Landroid/view/animation/Animation$AnimationListener;

.field private final D:Landroid/view/animation/Animation;

.field private final E:Landroid/view/animation/Animation;

.field public a:Lme;

.field public b:Z

.field public c:I

.field public d:I

.field public e:Lli;

.field private g:Landroid/view/View;

.field private h:I

.field private i:F

.field private j:I

.field private k:I

.field private l:Z

.field private m:F

.field private n:F

.field private o:Z

.field private p:I

.field private final q:Landroid/view/animation/DecelerateInterpolator;

.field private s:Lkh;

.field private t:I

.field private u:Landroid/view/animation/Animation;

.field private v:Landroid/view/animation/Animation;

.field private w:Landroid/view/animation/Animation;

.field private x:Landroid/view/animation/Animation;

.field private y:F

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 65
    const-class v0, Llw;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Llw;->f:Ljava/lang/String;

    .line 115
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x101000e

    aput v2, v0, v1

    sput-object v0, Llw;->r:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 260
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Llw;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 261
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v1, -0x1

    const v4, -0x50506

    const/high16 v3, 0x42200000    # 40.0f

    const/4 v2, 0x0

    .line 270
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 96
    iput-boolean v2, p0, Llw;->b:Z

    .line 98
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Llw;->i:F

    .line 102
    iput-boolean v2, p0, Llw;->l:Z

    .line 107
    iput v1, p0, Llw;->p:I

    .line 120
    iput v1, p0, Llw;->t:I

    .line 151
    new-instance v0, Llx;

    invoke-direct {v0, p0}, Llx;-><init>(Llw;)V

    iput-object v0, p0, Llw;->C:Landroid/view/animation/Animation$AnimationListener;

    .line 874
    new-instance v0, Lmc;

    invoke-direct {v0, p0}, Lmc;-><init>(Llw;)V

    iput-object v0, p0, Llw;->D:Landroid/view/animation/Animation;

    .line 898
    new-instance v0, Lmd;

    invoke-direct {v0, p0}, Lmd;-><init>(Llw;)V

    iput-object v0, p0, Llw;->E:Landroid/view/animation/Animation;

    .line 272
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Llw;->h:I

    .line 274
    invoke-virtual {p0}, Llw;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x10e0001

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    iput v0, p0, Llw;->j:I

    .line 277
    invoke-virtual {p0, v2}, Llw;->setWillNotDraw(Z)V

    .line 278
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-direct {v0, v1}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    iput-object v0, p0, Llw;->q:Landroid/view/animation/DecelerateInterpolator;

    .line 280
    sget-object v0, Llw;->r:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 281
    invoke-virtual {v0, v2, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    invoke-virtual {p0, v1}, Llw;->setEnabled(Z)V

    .line 282
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 284
    invoke-virtual {p0}, Llw;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 285
    iget v1, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v1, v3

    float-to-int v1, v1

    iput v1, p0, Llw;->A:I

    .line 286
    iget v1, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v1, v3

    float-to-int v1, v1

    iput v1, p0, Llw;->B:I

    .line 1311
    new-instance v1, Lkh;

    invoke-virtual {p0}, Llw;->getContext()Landroid/content/Context;

    move-result-object v2

    const/high16 v3, 0x41a00000    # 20.0f

    invoke-direct {v1, v2, v4, v3}, Lkh;-><init>(Landroid/content/Context;IF)V

    iput-object v1, p0, Llw;->s:Lkh;

    .line 1312
    new-instance v1, Lli;

    invoke-virtual {p0}, Llw;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, p0}, Lli;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v1, p0, Llw;->e:Lli;

    .line 1313
    iget-object v1, p0, Llw;->e:Lli;

    .line 2200
    iget-object v1, v1, Lli;->a:Llm;

    .line 2511
    iput v4, v1, Llm;->v:I

    .line 1314
    iget-object v1, p0, Llw;->s:Lkh;

    iget-object v2, p0, Llw;->e:Lli;

    invoke-virtual {v1, v2}, Lkh;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1315
    iget-object v1, p0, Llw;->s:Lkh;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lkh;->setVisibility(I)V

    .line 1316
    iget-object v1, p0, Llw;->s:Lkh;

    invoke-virtual {p0, v1}, Llw;->addView(Landroid/view/View;)V

    .line 289
    invoke-static {p0, v5}, Lgt;->a(Landroid/view/ViewGroup;Z)V

    .line 291
    const/high16 v1, 0x42800000    # 64.0f

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v1

    iput v0, p0, Llw;->y:F

    .line 292
    iget v0, p0, Llw;->y:F

    iput v0, p0, Llw;->i:F

    .line 293
    return-void
.end method

.method private static a(Landroid/view/MotionEvent;I)F
    .locals 1

    .prologue
    .line 688
    invoke-static {p0, p1}, Lgd;->a(Landroid/view/MotionEvent;I)I

    move-result v0

    .line 689
    if-gez v0, :cond_0

    .line 690
    const/high16 v0, -0x40800000    # -1.0f

    .line 692
    :goto_0
    return v0

    :cond_0
    invoke-static {p0, v0}, Lgd;->d(Landroid/view/MotionEvent;I)F

    move-result v0

    goto :goto_0
.end method

.method private a(II)Landroid/view/animation/Animation;
    .locals 4

    .prologue
    .line 434
    new-instance v0, Lma;

    invoke-direct {v0, p0, p1, p2}, Lma;-><init>(Llw;II)V

    .line 442
    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 444
    iget-object v1, p0, Llw;->s:Lkh;

    const/4 v2, 0x0

    .line 7092
    iput-object v2, v1, Lkh;->a:Landroid/view/animation/Animation$AnimationListener;

    .line 445
    iget-object v1, p0, Llw;->s:Lkh;

    invoke-virtual {v1}, Lkh;->clearAnimation()V

    .line 446
    iget-object v1, p0, Llw;->s:Lkh;

    invoke-virtual {v1, v0}, Lkh;->startAnimation(Landroid/view/animation/Animation;)V

    .line 447
    return-object v0
.end method

.method private a(I)V
    .locals 1

    .prologue
    .line 188
    iget-object v0, p0, Llw;->s:Lkh;

    invoke-virtual {v0}, Lkh;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 189
    iget-object v0, p0, Llw;->e:Lli;

    invoke-virtual {v0, p1}, Lli;->setAlpha(I)V

    .line 190
    return-void
.end method

.method private a(IZ)V
    .locals 2

    .prologue
    .line 930
    iget-object v0, p0, Llw;->s:Lkh;

    invoke-virtual {v0}, Lkh;->bringToFront()V

    .line 931
    iget-object v0, p0, Llw;->s:Lkh;

    invoke-virtual {v0, p1}, Lkh;->offsetTopAndBottom(I)V

    .line 932
    iget-object v0, p0, Llw;->s:Lkh;

    invoke-virtual {v0}, Lkh;->getTop()I

    move-result v0

    iput v0, p0, Llw;->k:I

    .line 933
    if-eqz p2, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_0

    .line 934
    invoke-virtual {p0}, Llw;->invalidate()V

    .line 936
    :cond_0
    return-void
.end method

.method private a(Landroid/view/MotionEvent;)V
    .locals 3

    .prologue
    .line 939
    invoke-static {p1}, Lgd;->b(Landroid/view/MotionEvent;)I

    move-result v0

    .line 940
    invoke-static {p1, v0}, Lgd;->b(Landroid/view/MotionEvent;I)I

    move-result v1

    .line 941
    iget v2, p0, Llw;->p:I

    if-ne v1, v2, :cond_0

    .line 944
    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 945
    :goto_0
    invoke-static {p1, v0}, Lgd;->b(Landroid/view/MotionEvent;I)I

    move-result v0

    iput v0, p0, Llw;->p:I

    .line 947
    :cond_0
    return-void

    .line 944
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Landroid/view/animation/Animation$AnimationListener;)V
    .locals 4

    .prologue
    .line 408
    new-instance v0, Llz;

    invoke-direct {v0, p0}, Llz;-><init>(Llw;)V

    iput-object v0, p0, Llw;->v:Landroid/view/animation/Animation;

    .line 414
    iget-object v0, p0, Llw;->v:Landroid/view/animation/Animation;

    const-wide/16 v2, 0x96

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 415
    iget-object v0, p0, Llw;->s:Lkh;

    .line 6092
    iput-object p1, v0, Lkh;->a:Landroid/view/animation/Animation$AnimationListener;

    .line 416
    iget-object v0, p0, Llw;->s:Lkh;

    invoke-virtual {v0}, Lkh;->clearAnimation()V

    .line 417
    iget-object v0, p0, Llw;->s:Lkh;

    iget-object v1, p0, Llw;->v:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Lkh;->startAnimation(Landroid/view/animation/Animation;)V

    .line 418
    return-void
.end method

.method static synthetic a(Llw;F)V
    .locals 1

    .prologue
    .line 59
    .line 9386
    invoke-static {}, Llw;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 9387
    const/high16 v0, 0x437f0000    # 255.0f

    mul-float/2addr v0, p1

    float-to-int v0, v0

    invoke-direct {p0, v0}, Llw;->a(I)V

    :goto_0
    return-void

    .line 9389
    :cond_0
    iget-object v0, p0, Llw;->s:Lkh;

    invoke-static {v0, p1}, Lgt;->d(Landroid/view/View;F)V

    .line 9390
    iget-object v0, p0, Llw;->s:Lkh;

    invoke-static {v0, p1}, Lgt;->e(Landroid/view/View;F)V

    goto :goto_0
.end method

.method static synthetic a(Llw;I)V
    .locals 1

    .prologue
    .line 59
    const/16 v0, 0xff

    invoke-direct {p0, v0}, Llw;->a(I)V

    return-void
.end method

.method static synthetic a(Llw;IZ)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0, p1, p2}, Llw;->a(IZ)V

    return-void
.end method

.method static synthetic a(Llw;Landroid/view/animation/Animation$AnimationListener;)V
    .locals 1

    .prologue
    .line 59
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Llw;->a(Landroid/view/animation/Animation$AnimationListener;)V

    return-void
.end method

.method private a(ZZ)V
    .locals 4

    .prologue
    .line 395
    iget-boolean v0, p0, Llw;->b:Z

    if-eq v0, p1, :cond_1

    .line 396
    iput-boolean p2, p0, Llw;->z:Z

    .line 397
    invoke-virtual {p0}, Llw;->a()V

    .line 398
    iput-boolean p1, p0, Llw;->b:Z

    .line 399
    iget-boolean v0, p0, Llw;->b:Z

    if-eqz v0, :cond_2

    .line 400
    iget v0, p0, Llw;->k:I

    iget-object v1, p0, Llw;->C:Landroid/view/animation/Animation$AnimationListener;

    .line 4846
    iput v0, p0, Llw;->c:I

    .line 4847
    iget-object v0, p0, Llw;->D:Landroid/view/animation/Animation;

    invoke-virtual {v0}, Landroid/view/animation/Animation;->reset()V

    .line 4848
    iget-object v0, p0, Llw;->D:Landroid/view/animation/Animation;

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 4849
    iget-object v0, p0, Llw;->D:Landroid/view/animation/Animation;

    iget-object v2, p0, Llw;->q:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {v0, v2}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 4850
    if-eqz v1, :cond_0

    .line 4851
    iget-object v0, p0, Llw;->s:Lkh;

    .line 5092
    iput-object v1, v0, Lkh;->a:Landroid/view/animation/Animation$AnimationListener;

    .line 4853
    :cond_0
    iget-object v0, p0, Llw;->s:Lkh;

    invoke-virtual {v0}, Lkh;->clearAnimation()V

    .line 4854
    iget-object v0, p0, Llw;->s:Lkh;

    iget-object v1, p0, Llw;->D:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Lkh;->startAnimation(Landroid/view/animation/Animation;)V

    .line 405
    :cond_1
    :goto_0
    return-void

    .line 402
    :cond_2
    iget-object v0, p0, Llw;->C:Landroid/view/animation/Animation$AnimationListener;

    invoke-direct {p0, v0}, Llw;->a(Landroid/view/animation/Animation$AnimationListener;)V

    goto :goto_0
.end method

.method private static a(Landroid/view/animation/Animation;)Z
    .locals 1

    .prologue
    .line 701
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/view/animation/Animation;->hasStarted()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/animation/Animation;->hasEnded()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Llw;)Z
    .locals 1

    .prologue
    .line 59
    iget-boolean v0, p0, Llw;->b:Z

    return v0
.end method

.method static synthetic b(Llw;I)I
    .locals 0

    .prologue
    .line 59
    iput p1, p0, Llw;->k:I

    return p1
.end method

.method static synthetic b(Llw;)Lli;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Llw;->e:Lli;

    return-object v0
.end method

.method static synthetic b(Llw;F)V
    .locals 3

    .prologue
    .line 59
    .line 9893
    iget v0, p0, Llw;->c:I

    iget v1, p0, Llw;->d:I

    iget v2, p0, Llw;->c:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    mul-float/2addr v1, p1

    float-to-int v1, v1

    add-int/2addr v0, v1

    .line 9894
    iget-object v1, p0, Llw;->s:Lkh;

    invoke-virtual {v1}, Lkh;->getTop()I

    move-result v1

    sub-int/2addr v0, v1

    .line 9895
    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Llw;->a(IZ)V

    .line 59
    return-void
.end method

.method private static c()Z
    .locals 2

    .prologue
    .line 331
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic c(Llw;)Z
    .locals 1

    .prologue
    .line 59
    iget-boolean v0, p0, Llw;->z:Z

    return v0
.end method

.method static synthetic d(Llw;)Lme;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Llw;->a:Lme;

    return-object v0
.end method

.method static synthetic e(Llw;)Lkh;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Llw;->s:Lkh;

    return-object v0
.end method

.method static synthetic f(Llw;)Z
    .locals 1

    .prologue
    .line 59
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic g(Llw;)I
    .locals 1

    .prologue
    .line 59
    iget v0, p0, Llw;->k:I

    return v0
.end method

.method static synthetic h(Llw;)Z
    .locals 1

    .prologue
    .line 59
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic i(Llw;)F
    .locals 1

    .prologue
    .line 59
    iget v0, p0, Llw;->y:F

    return v0
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 524
    iget-object v0, p0, Llw;->g:Landroid/view/View;

    if-nez v0, :cond_0

    .line 525
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Llw;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 526
    invoke-virtual {p0, v0}, Llw;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 527
    iget-object v2, p0, Llw;->s:Lkh;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 528
    iput-object v1, p0, Llw;->g:Landroid/view/View;

    .line 533
    :cond_0
    return-void

    .line 525
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final a(Z)V
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 341
    if-eqz p1, :cond_2

    iget-boolean v0, p0, Llw;->b:Z

    if-eq v0, p1, :cond_2

    .line 343
    iput-boolean p1, p0, Llw;->b:Z

    .line 346
    iget v0, p0, Llw;->y:F

    iget v1, p0, Llw;->d:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    float-to-int v0, v0

    .line 350
    iget v1, p0, Llw;->k:I

    sub-int/2addr v0, v1

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Llw;->a(IZ)V

    .line 352
    iput-boolean v2, p0, Llw;->z:Z

    .line 353
    iget-object v0, p0, Llw;->C:Landroid/view/animation/Animation$AnimationListener;

    .line 3360
    iget-object v1, p0, Llw;->s:Lkh;

    invoke-virtual {v1, v2}, Lkh;->setVisibility(I)V

    .line 3361
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v1, v2, :cond_0

    .line 3365
    iget-object v1, p0, Llw;->e:Lli;

    const/16 v2, 0xff

    invoke-virtual {v1, v2}, Lli;->setAlpha(I)V

    .line 3367
    :cond_0
    new-instance v1, Lly;

    invoke-direct {v1, p0}, Lly;-><init>(Llw;)V

    iput-object v1, p0, Llw;->u:Landroid/view/animation/Animation;

    .line 3373
    iget-object v1, p0, Llw;->u:Landroid/view/animation/Animation;

    iget v2, p0, Llw;->j:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 3374
    if-eqz v0, :cond_1

    .line 3375
    iget-object v1, p0, Llw;->s:Lkh;

    .line 4092
    iput-object v0, v1, Lkh;->a:Landroid/view/animation/Animation$AnimationListener;

    .line 3377
    :cond_1
    iget-object v0, p0, Llw;->s:Lkh;

    invoke-virtual {v0}, Lkh;->clearAnimation()V

    .line 3378
    iget-object v0, p0, Llw;->s:Lkh;

    iget-object v1, p0, Llw;->u:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Lkh;->startAnimation(Landroid/view/animation/Animation;)V

    .line 357
    :goto_0
    return-void

    .line 355
    :cond_2
    invoke-direct {p0, p1, v2}, Llw;->a(ZZ)V

    goto :goto_0
.end method

.method public b()Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v4, -0x1

    const/4 v2, 0x0

    .line 614
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xe

    if-ge v0, v3, :cond_5

    .line 615
    iget-object v0, p0, Llw;->g:Landroid/view/View;

    instance-of v0, v0, Landroid/widget/AbsListView;

    if-eqz v0, :cond_2

    .line 616
    iget-object v0, p0, Llw;->g:Landroid/view/View;

    check-cast v0, Landroid/widget/AbsListView;

    .line 617
    invoke-virtual {v0}, Landroid/widget/AbsListView;->getChildCount()I

    move-result v3

    if-lez v3, :cond_1

    invoke-virtual {v0}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I

    move-result v3

    if-gtz v3, :cond_0

    invoke-virtual {v0, v2}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {v0}, Landroid/widget/AbsListView;->getPaddingTop()I

    move-result v0

    if-ge v3, v0, :cond_1

    :cond_0
    move v0, v1

    .line 624
    :goto_0
    return v0

    :cond_1
    move v0, v2

    .line 617
    goto :goto_0

    .line 621
    :cond_2
    iget-object v0, p0, Llw;->g:Landroid/view/View;

    invoke-static {v0, v4}, Lgt;->b(Landroid/view/View;I)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Llw;->g:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    move-result v0

    if-lez v0, :cond_4

    :cond_3
    move v0, v1

    goto :goto_0

    :cond_4
    move v0, v2

    goto :goto_0

    .line 624
    :cond_5
    iget-object v0, p0, Llw;->g:Landroid/view/View;

    invoke-static {v0, v4}, Lgt;->b(Landroid/view/View;I)Z

    move-result v0

    goto :goto_0
.end method

.method protected getChildDrawingOrder(II)I
    .locals 1

    .prologue
    .line 296
    iget v0, p0, Llw;->t:I

    if-gez v0, :cond_1

    .line 306
    :cond_0
    :goto_0
    return p2

    .line 298
    :cond_1
    add-int/lit8 v0, p1, -0x1

    if-ne p2, v0, :cond_2

    .line 300
    iget p2, p0, Llw;->t:I

    goto :goto_0

    .line 301
    :cond_2
    iget v0, p0, Llw;->t:I

    if-lt p2, v0, :cond_0

    .line 303
    add-int/lit8 p2, p2, 0x1

    goto :goto_0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, -0x1

    const/high16 v3, -0x40800000    # -1.0f

    const/4 v0, 0x0

    .line 630
    invoke-virtual {p0}, Llw;->a()V

    .line 632
    invoke-static {p1}, Lgd;->a(Landroid/view/MotionEvent;)I

    move-result v1

    .line 638
    invoke-virtual {p0}, Llw;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Llw;->b()Z

    move-result v2

    if-nez v2, :cond_0

    iget-boolean v2, p0, Llw;->b:Z

    if-eqz v2, :cond_1

    .line 684
    :cond_0
    :goto_0
    return v0

    .line 643
    :cond_1
    packed-switch v1, :pswitch_data_0

    .line 684
    :cond_2
    :goto_1
    :pswitch_0
    iget-boolean v0, p0, Llw;->o:Z

    goto :goto_0

    .line 645
    :pswitch_1
    iget v1, p0, Llw;->d:I

    iget-object v2, p0, Llw;->s:Lkh;

    invoke-virtual {v2}, Lkh;->getTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-direct {p0, v1, v5}, Llw;->a(IZ)V

    .line 646
    invoke-static {p1, v0}, Lgd;->b(Landroid/view/MotionEvent;I)I

    move-result v1

    iput v1, p0, Llw;->p:I

    .line 647
    iput-boolean v0, p0, Llw;->o:Z

    .line 648
    iget v1, p0, Llw;->p:I

    invoke-static {p1, v1}, Llw;->a(Landroid/view/MotionEvent;I)F

    move-result v1

    .line 649
    cmpl-float v2, v1, v3

    if-eqz v2, :cond_0

    .line 652
    iput v1, p0, Llw;->n:F

    goto :goto_1

    .line 656
    :pswitch_2
    iget v1, p0, Llw;->p:I

    if-ne v1, v4, :cond_3

    .line 657
    sget-object v1, Llw;->f:Ljava/lang/String;

    const-string v2, "Got ACTION_MOVE event but don\'t have an active pointer id."

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 661
    :cond_3
    iget v1, p0, Llw;->p:I

    invoke-static {p1, v1}, Llw;->a(Landroid/view/MotionEvent;I)F

    move-result v1

    .line 662
    cmpl-float v2, v1, v3

    if-eqz v2, :cond_0

    .line 665
    iget v0, p0, Llw;->n:F

    sub-float v0, v1, v0

    .line 666
    iget v1, p0, Llw;->h:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    iget-boolean v0, p0, Llw;->o:Z

    if-nez v0, :cond_2

    .line 667
    iget v0, p0, Llw;->n:F

    iget v1, p0, Llw;->h:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    iput v0, p0, Llw;->m:F

    .line 668
    iput-boolean v5, p0, Llw;->o:Z

    .line 669
    iget-object v0, p0, Llw;->e:Lli;

    const/16 v1, 0x4c

    invoke-virtual {v0, v1}, Lli;->setAlpha(I)V

    goto :goto_1

    .line 674
    :pswitch_3
    invoke-direct {p0, p1}, Llw;->a(Landroid/view/MotionEvent;)V

    goto :goto_1

    .line 679
    :pswitch_4
    iput-boolean v0, p0, Llw;->o:Z

    .line 680
    iput v4, p0, Llw;->p:I

    goto :goto_1

    .line 643
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_4
        :pswitch_2
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method protected onLayout(ZIIII)V
    .locals 7

    .prologue
    .line 546
    invoke-virtual {p0}, Llw;->getMeasuredWidth()I

    move-result v0

    .line 547
    invoke-virtual {p0}, Llw;->getMeasuredHeight()I

    move-result v1

    .line 548
    invoke-virtual {p0}, Llw;->getChildCount()I

    move-result v2

    if-nez v2, :cond_1

    .line 567
    :cond_0
    :goto_0
    return-void

    .line 551
    :cond_1
    iget-object v2, p0, Llw;->g:Landroid/view/View;

    if-nez v2, :cond_2

    .line 552
    invoke-virtual {p0}, Llw;->a()V

    .line 554
    :cond_2
    iget-object v2, p0, Llw;->g:Landroid/view/View;

    if-eqz v2, :cond_0

    .line 557
    iget-object v2, p0, Llw;->g:Landroid/view/View;

    .line 558
    invoke-virtual {p0}, Llw;->getPaddingLeft()I

    move-result v3

    .line 559
    invoke-virtual {p0}, Llw;->getPaddingTop()I

    move-result v4

    .line 560
    invoke-virtual {p0}, Llw;->getPaddingLeft()I

    move-result v5

    sub-int v5, v0, v5

    invoke-virtual {p0}, Llw;->getPaddingRight()I

    move-result v6

    sub-int/2addr v5, v6

    .line 561
    invoke-virtual {p0}, Llw;->getPaddingTop()I

    move-result v6

    sub-int/2addr v1, v6

    invoke-virtual {p0}, Llw;->getPaddingBottom()I

    move-result v6

    sub-int/2addr v1, v6

    .line 562
    add-int/2addr v5, v3

    add-int/2addr v1, v4

    invoke-virtual {v2, v3, v4, v5, v1}, Landroid/view/View;->layout(IIII)V

    .line 563
    iget-object v1, p0, Llw;->s:Lkh;

    invoke-virtual {v1}, Lkh;->getMeasuredWidth()I

    move-result v1

    .line 564
    iget-object v2, p0, Llw;->s:Lkh;

    invoke-virtual {v2}, Lkh;->getMeasuredHeight()I

    move-result v2

    .line 565
    iget-object v3, p0, Llw;->s:Lkh;

    div-int/lit8 v4, v0, 0x2

    div-int/lit8 v5, v1, 0x2

    sub-int/2addr v4, v5

    iget v5, p0, Llw;->k:I

    div-int/lit8 v0, v0, 0x2

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    iget v1, p0, Llw;->k:I

    add-int/2addr v1, v2

    invoke-virtual {v3, v4, v5, v0, v1}, Lkh;->layout(IIII)V

    goto :goto_0
.end method

.method public onMeasure(II)V
    .locals 5

    .prologue
    const/high16 v4, 0x40000000    # 2.0f

    .line 571
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onMeasure(II)V

    .line 572
    iget-object v0, p0, Llw;->g:Landroid/view/View;

    if-nez v0, :cond_0

    .line 573
    invoke-virtual {p0}, Llw;->a()V

    .line 575
    :cond_0
    iget-object v0, p0, Llw;->g:Landroid/view/View;

    if-nez v0, :cond_2

    .line 596
    :cond_1
    :goto_0
    return-void

    .line 578
    :cond_2
    iget-object v0, p0, Llw;->g:Landroid/view/View;

    invoke-virtual {p0}, Llw;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Llw;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Llw;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {v1, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {p0}, Llw;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {p0}, Llw;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Llw;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-static {v2, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->measure(II)V

    .line 582
    iget-object v0, p0, Llw;->s:Lkh;

    iget v1, p0, Llw;->A:I

    invoke-static {v1, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    iget v2, p0, Llw;->B:I

    invoke-static {v2, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lkh;->measure(II)V

    .line 584
    iget-boolean v0, p0, Llw;->l:Z

    if-nez v0, :cond_3

    .line 585
    const/4 v0, 0x1

    iput-boolean v0, p0, Llw;->l:Z

    .line 586
    iget-object v0, p0, Llw;->s:Lkh;

    invoke-virtual {v0}, Lkh;->getMeasuredHeight()I

    move-result v0

    neg-int v0, v0

    iput v0, p0, Llw;->d:I

    iput v0, p0, Llw;->k:I

    .line 588
    :cond_3
    const/4 v0, -0x1

    iput v0, p0, Llw;->t:I

    .line 590
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p0}, Llw;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 591
    invoke-virtual {p0, v0}, Llw;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Llw;->s:Lkh;

    if-ne v1, v2, :cond_4

    .line 592
    iput v0, p0, Llw;->t:I

    goto :goto_0

    .line 590
    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 12

    .prologue
    .line 706
    invoke-static {p1}, Lgd;->a(Landroid/view/MotionEvent;)I

    move-result v0

    .line 712
    invoke-virtual {p0}, Llw;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Llw;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 714
    :cond_0
    const/4 v0, 0x0

    .line 842
    :goto_0
    return v0

    .line 717
    :cond_1
    packed-switch v0, :pswitch_data_0

    .line 842
    :cond_2
    :goto_1
    :pswitch_0
    const/4 v0, 0x1

    goto :goto_0

    .line 719
    :pswitch_1
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lgd;->b(Landroid/view/MotionEvent;I)I

    move-result v0

    iput v0, p0, Llw;->p:I

    .line 720
    const/4 v0, 0x0

    iput-boolean v0, p0, Llw;->o:Z

    goto :goto_1

    .line 724
    :pswitch_2
    iget v0, p0, Llw;->p:I

    invoke-static {p1, v0}, Lgd;->a(Landroid/view/MotionEvent;I)I

    move-result v0

    .line 725
    if-gez v0, :cond_3

    .line 726
    sget-object v0, Llw;->f:Ljava/lang/String;

    const-string v1, "Got ACTION_MOVE event but have an invalid active pointer id."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 727
    const/4 v0, 0x0

    goto :goto_0

    .line 730
    :cond_3
    invoke-static {p1, v0}, Lgd;->d(Landroid/view/MotionEvent;I)F

    move-result v0

    .line 731
    iget v1, p0, Llw;->m:F

    sub-float/2addr v0, v1

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    .line 732
    iget-boolean v1, p0, Llw;->o:Z

    if-eqz v1, :cond_2

    .line 733
    iget-object v1, p0, Llw;->e:Lli;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lli;->a(Z)V

    .line 734
    iget v1, p0, Llw;->i:F

    div-float v1, v0, v1

    .line 735
    const/4 v2, 0x0

    cmpg-float v2, v1, v2

    if-gez v2, :cond_4

    .line 736
    const/4 v0, 0x0

    goto :goto_0

    .line 738
    :cond_4
    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-static {v2, v1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    .line 739
    float-to-double v2, v1

    const-wide v4, 0x3fd999999999999aL    # 0.4

    sub-double/2addr v2, v4

    const-wide/16 v4, 0x0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    double-to-float v2, v2

    const/high16 v3, 0x40a00000    # 5.0f

    mul-float/2addr v2, v3

    const/high16 v3, 0x40400000    # 3.0f

    div-float/2addr v2, v3

    .line 740
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v4, p0, Llw;->i:F

    sub-float/2addr v3, v4

    .line 741
    iget v4, p0, Llw;->y:F

    .line 743
    const/4 v5, 0x0

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v6, v4

    invoke-static {v3, v6}, Ljava/lang/Math;->min(FF)F

    move-result v3

    div-float/2addr v3, v4

    invoke-static {v5, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    .line 745
    const/high16 v5, 0x40800000    # 4.0f

    div-float v5, v3, v5

    float-to-double v6, v5

    const/high16 v5, 0x40800000    # 4.0f

    div-float/2addr v3, v5

    float-to-double v8, v3

    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v8

    sub-double/2addr v6, v8

    double-to-float v3, v6

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v3, v5

    .line 747
    mul-float v5, v4, v3

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v5, v6

    .line 749
    iget v6, p0, Llw;->d:I

    mul-float/2addr v1, v4

    add-float/2addr v1, v5

    float-to-int v1, v1

    add-int/2addr v1, v6

    .line 752
    iget-object v4, p0, Llw;->s:Lkh;

    invoke-virtual {v4}, Lkh;->getVisibility()I

    move-result v4

    if-eqz v4, :cond_5

    .line 753
    iget-object v4, p0, Llw;->s:Lkh;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Lkh;->setVisibility(I)V

    .line 756
    :cond_5
    iget-object v4, p0, Llw;->s:Lkh;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v4, v5}, Lgt;->d(Landroid/view/View;F)V

    .line 757
    iget-object v4, p0, Llw;->s:Lkh;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v4, v5}, Lgt;->e(Landroid/view/View;F)V

    .line 759
    iget v4, p0, Llw;->i:F

    cmpg-float v0, v0, v4

    if-gez v0, :cond_8

    .line 763
    iget-object v0, p0, Llw;->e:Lli;

    invoke-virtual {v0}, Lli;->getAlpha()I

    move-result v0

    const/16 v4, 0x4c

    if-le v0, v4, :cond_6

    iget-object v0, p0, Llw;->w:Landroid/view/animation/Animation;

    invoke-static {v0}, Llw;->a(Landroid/view/animation/Animation;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 7421
    iget-object v0, p0, Llw;->e:Lli;

    invoke-virtual {v0}, Lli;->getAlpha()I

    move-result v0

    const/16 v4, 0x4c

    invoke-direct {p0, v0, v4}, Llw;->a(II)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Llw;->w:Landroid/view/animation/Animation;

    .line 768
    :cond_6
    const v0, 0x3f4ccccd    # 0.8f

    mul-float/2addr v0, v2

    .line 769
    iget-object v4, p0, Llw;->e:Lli;

    const/4 v5, 0x0

    const v6, 0x3f4ccccd    # 0.8f

    invoke-static {v6, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-virtual {v4, v5, v0}, Lli;->a(FF)V

    .line 770
    iget-object v0, p0, Llw;->e:Lli;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v2}, Ljava/lang/Math;->min(FF)F

    move-result v4

    invoke-virtual {v0, v4}, Lli;->a(F)V

    .line 778
    :cond_7
    :goto_2
    const/high16 v0, -0x41800000    # -0.25f

    const v4, 0x3ecccccd    # 0.4f

    mul-float/2addr v2, v4

    add-float/2addr v0, v2

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, v3

    add-float/2addr v0, v2

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float/2addr v0, v2

    .line 779
    iget-object v2, p0, Llw;->e:Lli;

    .line 8193
    iget-object v2, v2, Lli;->a:Llm;

    invoke-virtual {v2, v0}, Llm;->c(F)V

    .line 780
    iget v0, p0, Llw;->k:I

    sub-int v0, v1, v0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Llw;->a(IZ)V

    goto/16 :goto_1

    .line 772
    :cond_8
    iget-object v0, p0, Llw;->e:Lli;

    invoke-virtual {v0}, Lli;->getAlpha()I

    move-result v0

    const/16 v4, 0xff

    if-ge v0, v4, :cond_7

    iget-object v0, p0, Llw;->x:Landroid/view/animation/Animation;

    invoke-static {v0}, Llw;->a(Landroid/view/animation/Animation;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 7425
    iget-object v0, p0, Llw;->e:Lli;

    invoke-virtual {v0}, Lli;->getAlpha()I

    move-result v0

    const/16 v4, 0xff

    invoke-direct {p0, v0, v4}, Llw;->a(II)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Llw;->x:Landroid/view/animation/Animation;

    goto :goto_2

    .line 786
    :pswitch_3
    invoke-static {p1}, Lgd;->b(Landroid/view/MotionEvent;)I

    move-result v0

    .line 787
    invoke-static {p1, v0}, Lgd;->b(Landroid/view/MotionEvent;I)I

    move-result v0

    iput v0, p0, Llw;->p:I

    goto/16 :goto_1

    .line 792
    :pswitch_4
    invoke-direct {p0, p1}, Llw;->a(Landroid/view/MotionEvent;)V

    goto/16 :goto_1

    .line 797
    :pswitch_5
    iget v1, p0, Llw;->p:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_a

    .line 798
    const/4 v1, 0x1

    if-ne v0, v1, :cond_9

    .line 799
    sget-object v0, Llw;->f:Ljava/lang/String;

    const-string v1, "Got ACTION_UP event but don\'t have an active pointer id."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 801
    :cond_9
    const/4 v0, 0x0

    goto/16 :goto_0

    .line 803
    :cond_a
    iget v0, p0, Llw;->p:I

    invoke-static {p1, v0}, Lgd;->a(Landroid/view/MotionEvent;I)I

    move-result v0

    .line 804
    invoke-static {p1, v0}, Lgd;->d(Landroid/view/MotionEvent;I)F

    move-result v0

    .line 805
    iget v1, p0, Llw;->m:F

    sub-float/2addr v0, v1

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    .line 806
    const/4 v1, 0x0

    iput-boolean v1, p0, Llw;->o:Z

    .line 807
    iget v1, p0, Llw;->i:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_b

    .line 808
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Llw;->a(ZZ)V

    .line 837
    :goto_3
    const/4 v0, -0x1

    iput v0, p0, Llw;->p:I

    .line 838
    const/4 v0, 0x0

    goto/16 :goto_0

    .line 811
    :cond_b
    const/4 v0, 0x0

    iput-boolean v0, p0, Llw;->b:Z

    .line 812
    iget-object v0, p0, Llw;->e:Lli;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lli;->a(FF)V

    .line 815
    new-instance v0, Lmb;

    invoke-direct {v0, p0}, Lmb;-><init>(Llw;)V

    .line 834
    iget v1, p0, Llw;->k:I

    .line 8862
    iput v1, p0, Llw;->c:I

    .line 8863
    iget-object v1, p0, Llw;->E:Landroid/view/animation/Animation;

    invoke-virtual {v1}, Landroid/view/animation/Animation;->reset()V

    .line 8864
    iget-object v1, p0, Llw;->E:Landroid/view/animation/Animation;

    const-wide/16 v2, 0xc8

    invoke-virtual {v1, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 8865
    iget-object v1, p0, Llw;->E:Landroid/view/animation/Animation;

    iget-object v2, p0, Llw;->q:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {v1, v2}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 8866
    if-eqz v0, :cond_c

    .line 8867
    iget-object v1, p0, Llw;->s:Lkh;

    .line 9092
    iput-object v0, v1, Lkh;->a:Landroid/view/animation/Animation$AnimationListener;

    .line 8869
    :cond_c
    iget-object v0, p0, Llw;->s:Lkh;

    invoke-virtual {v0}, Lkh;->clearAnimation()V

    .line 8870
    iget-object v0, p0, Llw;->s:Lkh;

    iget-object v1, p0, Llw;->E:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Lkh;->startAnimation(Landroid/view/animation/Animation;)V

    .line 835
    iget-object v0, p0, Llw;->e:Lli;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lli;->a(Z)V

    goto :goto_3

    .line 717
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_5
        :pswitch_2
        :pswitch_5
        :pswitch_0
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 0

    .prologue
    .line 698
    return-void
.end method
