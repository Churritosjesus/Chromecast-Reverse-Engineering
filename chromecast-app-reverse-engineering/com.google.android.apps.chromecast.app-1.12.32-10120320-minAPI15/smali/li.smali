.class public final Lli;
.super Landroid/graphics/drawable/Drawable;
.source "PG"

# interfaces
.implements Landroid/graphics/drawable/Animatable;


# static fields
.field private static final c:Landroid/view/animation/Interpolator;

.field private static final d:Landroid/view/animation/Interpolator;


# instance fields
.field public final a:Llm;

.field b:Z

.field private final e:[I

.field private final f:Ljava/util/ArrayList;

.field private g:F

.field private h:Landroid/content/res/Resources;

.field private i:Landroid/view/View;

.field private j:Landroid/view/animation/Animation;

.field private k:F

.field private l:D

.field private m:D

.field private final n:Landroid/graphics/drawable/Drawable$Callback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 53
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    sput-object v0, Lli;->c:Landroid/view/animation/Interpolator;

    .line 54
    new-instance v0, Lkc;

    invoke-direct {v0}, Lkc;-><init>()V

    sput-object v0, Lli;->d:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .locals 16

    .prologue
    .line 119
    invoke-direct/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 75
    const/4 v2, 0x1

    new-array v2, v2, [I

    const/4 v3, 0x0

    const/high16 v4, -0x1000000

    aput v4, v2, v3

    move-object/from16 v0, p0

    iput-object v2, v0, Lli;->e:[I

    .line 93
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v0, p0

    iput-object v2, v0, Lli;->f:Ljava/util/ArrayList;

    .line 450
    new-instance v2, Lll;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Lll;-><init>(Lli;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lli;->n:Landroid/graphics/drawable/Drawable$Callback;

    .line 120
    move-object/from16 v0, p2

    move-object/from16 v1, p0

    iput-object v0, v1, Lli;->i:Landroid/view/View;

    .line 121
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lli;->h:Landroid/content/res/Resources;

    .line 123
    new-instance v2, Llm;

    move-object/from16 v0, p0

    iget-object v3, v0, Lli;->n:Landroid/graphics/drawable/Drawable$Callback;

    invoke-direct {v2, v3}, Llm;-><init>(Landroid/graphics/drawable/Drawable$Callback;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lli;->a:Llm;

    .line 124
    move-object/from16 v0, p0

    iget-object v2, v0, Lli;->a:Llm;

    move-object/from16 v0, p0

    iget-object v3, v0, Lli;->e:[I

    invoke-virtual {v2, v3}, Llm;->a([I)V

    .line 1157
    const-wide/high16 v2, 0x4044000000000000L    # 40.0

    const-wide/high16 v4, 0x4044000000000000L    # 40.0

    const-wide v6, 0x4021800000000000L    # 8.75

    const-wide/high16 v8, 0x4004000000000000L    # 2.5

    const/high16 v10, 0x41200000    # 10.0f

    const/high16 v11, 0x40a00000    # 5.0f

    .line 2132
    move-object/from16 v0, p0

    iget-object v12, v0, Lli;->a:Llm;

    .line 2133
    move-object/from16 v0, p0

    iget-object v13, v0, Lli;->h:Landroid/content/res/Resources;

    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v13

    .line 2134
    iget v13, v13, Landroid/util/DisplayMetrics;->density:F

    .line 2136
    float-to-double v14, v13

    mul-double/2addr v2, v14

    move-object/from16 v0, p0

    iput-wide v2, v0, Lli;->l:D

    .line 2137
    float-to-double v2, v13

    mul-double/2addr v2, v4

    move-object/from16 v0, p0

    iput-wide v2, v0, Lli;->m:D

    .line 2138
    double-to-float v2, v8

    mul-float/2addr v2, v13

    .line 2656
    iput v2, v12, Llm;->g:F

    .line 2657
    iget-object v3, v12, Llm;->b:Landroid/graphics/Paint;

    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 2658
    invoke-virtual {v12}, Llm;->d()V

    .line 2139
    float-to-double v2, v13

    mul-double/2addr v2, v6

    .line 2732
    iput-wide v2, v12, Llm;->q:D

    .line 2140
    const/4 v2, 0x0

    invoke-virtual {v12, v2}, Llm;->a(I)V

    .line 2141
    mul-float v2, v10, v13

    mul-float v3, v11, v13

    .line 3521
    float-to-int v2, v2

    iput v2, v12, Llm;->r:I

    .line 3522
    float-to-int v2, v3

    iput v2, v12, Llm;->s:I

    .line 2142
    move-object/from16 v0, p0

    iget-wide v2, v0, Lli;->l:D

    double-to-int v2, v2

    move-object/from16 v0, p0

    iget-wide v4, v0, Lli;->m:D

    double-to-int v3, v4

    .line 3712
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    int-to-float v2, v2

    .line 3714
    iget-wide v4, v12, Llm;->q:D

    const-wide/16 v6, 0x0

    cmpg-double v3, v4, v6

    if-lez v3, :cond_0

    const/4 v3, 0x0

    cmpg-float v3, v2, v3

    if-gez v3, :cond_1

    .line 3715
    :cond_0
    iget v2, v12, Llm;->g:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-float v2, v2

    .line 3719
    :goto_0
    iput v2, v12, Llm;->h:F

    .line 4363
    move-object/from16 v0, p0

    iget-object v2, v0, Lli;->a:Llm;

    .line 4364
    new-instance v3, Llj;

    move-object/from16 v0, p0

    invoke-direct {v3, v0, v2}, Llj;-><init>(Lli;Llm;)V

    .line 4416
    const/4 v4, -0x1

    invoke-virtual {v3, v4}, Landroid/view/animation/Animation;->setRepeatCount(I)V

    .line 4417
    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Landroid/view/animation/Animation;->setRepeatMode(I)V

    .line 4418
    sget-object v4, Lli;->c:Landroid/view/animation/Interpolator;

    invoke-virtual {v3, v4}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 4419
    new-instance v4, Llk;

    move-object/from16 v0, p0

    invoke-direct {v4, v0, v2}, Llk;-><init>(Lli;Llm;)V

    invoke-virtual {v3, v4}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 4447
    move-object/from16 v0, p0

    iput-object v3, v0, Lli;->j:Landroid/view/animation/Animation;

    .line 128
    return-void

    .line 3717
    :cond_1
    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    float-to-double v2, v2

    iget-wide v4, v12, Llm;->q:D

    sub-double/2addr v2, v4

    double-to-float v2, v2

    goto :goto_0
.end method

.method static synthetic a(Lli;)F
    .locals 1

    .prologue
    .line 52
    iget v0, p0, Lli;->k:F

    return v0
.end method

.method static synthetic a(Lli;F)F
    .locals 0

    .prologue
    .line 52
    iput p1, p0, Lli;->k:F

    return p1
.end method

.method static synthetic a(Lli;Llm;)F
    .locals 1

    .prologue
    .line 52
    invoke-static {p1}, Lli;->a(Llm;)F

    move-result v0

    return v0
.end method

.method private static a(Llm;)F
    .locals 6

    .prologue
    .line 304
    .line 8663
    iget v0, p0, Llm;->g:F

    .line 304
    float-to-double v0, v0

    const-wide v2, 0x401921fb54442d18L    # 6.283185307179586

    .line 8736
    iget-wide v4, p0, Llm;->q:D

    .line 304
    mul-double/2addr v2, v4

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method static synthetic a()Landroid/view/animation/Interpolator;
    .locals 1

    .prologue
    .line 52
    sget-object v0, Lli;->d:Landroid/view/animation/Interpolator;

    return-object v0
.end method

.method private a(FLlm;)V
    .locals 9

    .prologue
    const/high16 v1, 0x3f400000    # 0.75f

    .line 334
    cmpl-float v0, p1, v1

    if-lez v0, :cond_0

    .line 338
    sub-float v0, p1, v1

    const/high16 v1, 0x3e800000    # 0.25f

    div-float/2addr v0, v1

    .line 9686
    iget-object v1, p2, Llm;->i:[I

    iget v2, p2, Llm;->j:I

    aget v1, v1, v2

    .line 10618
    iget-object v2, p2, Llm;->i:[I

    invoke-virtual {p2}, Llm;->a()I

    move-result v3

    aget v2, v2, v3

    .line 11310
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 11311
    ushr-int/lit8 v3, v1, 0x18

    .line 11312
    shr-int/lit8 v4, v1, 0x10

    and-int/lit16 v4, v4, 0xff

    .line 11313
    shr-int/lit8 v5, v1, 0x8

    and-int/lit16 v5, v5, 0xff

    .line 11314
    and-int/lit16 v1, v1, 0xff

    .line 11316
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 11317
    ushr-int/lit8 v6, v2, 0x18

    .line 11318
    shr-int/lit8 v7, v2, 0x10

    and-int/lit16 v7, v7, 0xff

    .line 11319
    shr-int/lit8 v8, v2, 0x8

    and-int/lit16 v8, v8, 0xff

    .line 11320
    and-int/lit16 v2, v2, 0xff

    .line 11322
    sub-int/2addr v6, v3

    int-to-float v6, v6

    mul-float/2addr v6, v0

    float-to-int v6, v6

    add-int/2addr v3, v6

    shl-int/lit8 v3, v3, 0x18

    sub-int v6, v7, v4

    int-to-float v6, v6

    mul-float/2addr v6, v0

    float-to-int v6, v6

    add-int/2addr v4, v6

    shl-int/lit8 v4, v4, 0x10

    or-int/2addr v3, v4

    sub-int v4, v8, v5

    int-to-float v4, v4

    mul-float/2addr v4, v0

    float-to-int v4, v4

    add-int/2addr v4, v5

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr v3, v4

    sub-int/2addr v2, v1

    int-to-float v2, v2

    mul-float/2addr v0, v2

    float-to-int v0, v0

    add-int/2addr v0, v1

    or-int/2addr v0, v3

    .line 11602
    iput v0, p2, Llm;->w:I

    .line 342
    :cond_0
    return-void
.end method

.method static synthetic a(Lli;FLlm;)V
    .locals 4

    .prologue
    .line 52
    .line 12348
    invoke-direct {p0, p1, p2}, Lli;->a(FLlm;)V

    .line 12763
    iget v0, p2, Llm;->m:F

    .line 12349
    const v1, 0x3f4ccccd    # 0.8f

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    add-double/2addr v0, v2

    double-to-float v0, v0

    .line 12351
    invoke-static {p2}, Lli;->a(Llm;)F

    move-result v1

    .line 13678
    iget v2, p2, Llm;->k:F

    .line 13682
    iget v3, p2, Llm;->l:F

    .line 12352
    sub-float v1, v3, v1

    .line 14678
    iget v3, p2, Llm;->k:F

    .line 12352
    sub-float/2addr v1, v3

    mul-float/2addr v1, p1

    add-float/2addr v1, v2

    .line 12355
    invoke-virtual {p2, v1}, Llm;->a(F)V

    .line 14682
    iget v1, p2, Llm;->l:F

    .line 12356
    invoke-virtual {p2, v1}, Llm;->b(F)V

    .line 14763
    iget v1, p2, Llm;->m:F

    .line 15763
    iget v2, p2, Llm;->m:F

    .line 12357
    sub-float/2addr v0, v2

    mul-float/2addr v0, p1

    add-float/2addr v0, v1

    .line 12359
    invoke-virtual {p2, v0}, Llm;->c(F)V

    .line 52
    return-void
.end method

.method static synthetic b(Lli;FLlm;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0, p1, p2}, Lli;->a(FLlm;)V

    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 2

    .prologue
    .line 173
    iget-object v0, p0, Lli;->a:Llm;

    .line 4753
    iget v1, v0, Llm;->p:F

    cmpl-float v1, p1, v1

    if-eqz v1, :cond_0

    .line 4754
    iput p1, v0, Llm;->p:F

    .line 4755
    invoke-virtual {v0}, Llm;->d()V

    .line 174
    :cond_0
    return-void
.end method

.method public final a(FF)V
    .locals 2

    .prologue
    .line 183
    iget-object v0, p0, Lli;->a:Llm;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Llm;->a(F)V

    .line 184
    iget-object v0, p0, Lli;->a:Llm;

    invoke-virtual {v0, p2}, Llm;->b(F)V

    .line 185
    return-void
.end method

.method public final a(Z)V
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lli;->a:Llm;

    invoke-virtual {v0, p1}, Llm;->a(Z)V

    .line 167
    return-void
.end method

.method final b(F)V
    .locals 0

    .prologue
    .line 250
    iput p1, p0, Lli;->g:F

    .line 251
    invoke-virtual {p0}, Lli;->invalidateSelf()V

    .line 252
    return-void
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 12

    .prologue
    .line 227
    invoke-virtual {p0}, Lli;->getBounds()Landroid/graphics/Rect;

    move-result-object v6

    .line 228
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v7

    .line 229
    iget v0, p0, Lli;->g:F

    invoke-virtual {v6}, Landroid/graphics/Rect;->exactCenterX()F

    move-result v1

    invoke-virtual {v6}, Landroid/graphics/Rect;->exactCenterY()F

    move-result v2

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 230
    iget-object v8, p0, Lli;->a:Llm;

    .line 5529
    iget-object v1, v8, Llm;->a:Landroid/graphics/RectF;

    .line 5530
    invoke-virtual {v1, v6}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 5531
    iget v0, v8, Llm;->h:F

    iget v2, v8, Llm;->h:F

    invoke-virtual {v1, v0, v2}, Landroid/graphics/RectF;->inset(FF)V

    .line 5533
    iget v0, v8, Llm;->d:F

    iget v2, v8, Llm;->f:F

    add-float/2addr v0, v2

    const/high16 v2, 0x43b40000    # 360.0f

    mul-float/2addr v2, v0

    .line 5534
    iget v0, v8, Llm;->e:F

    iget v3, v8, Llm;->f:F

    add-float/2addr v0, v3

    const/high16 v3, 0x43b40000    # 360.0f

    mul-float/2addr v0, v3

    .line 5535
    sub-float v3, v0, v2

    .line 5537
    iget-object v0, v8, Llm;->b:Landroid/graphics/Paint;

    iget v4, v8, Llm;->w:I

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 5538
    const/4 v4, 0x0

    iget-object v5, v8, Llm;->b:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 5551
    iget-boolean v0, v8, Llm;->n:Z

    if-eqz v0, :cond_0

    .line 5552
    iget-object v0, v8, Llm;->o:Landroid/graphics/Path;

    if-nez v0, :cond_2

    .line 5553
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, v8, Llm;->o:Landroid/graphics/Path;

    .line 5554
    iget-object v0, v8, Llm;->o:Landroid/graphics/Path;

    sget-object v1, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    invoke-virtual {v0, v1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 5561
    :goto_0
    iget v0, v8, Llm;->h:F

    float-to-int v0, v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    iget v1, v8, Llm;->p:F

    mul-float/2addr v0, v1

    .line 5562
    iget-wide v4, v8, Llm;->q:D

    const-wide/16 v10, 0x0

    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    move-result-wide v10

    mul-double/2addr v4, v10

    invoke-virtual {v6}, Landroid/graphics/Rect;->exactCenterX()F

    move-result v1

    float-to-double v10, v1

    add-double/2addr v4, v10

    double-to-float v1, v4

    .line 5563
    iget-wide v4, v8, Llm;->q:D

    const-wide/16 v10, 0x0

    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    move-result-wide v10

    mul-double/2addr v4, v10

    invoke-virtual {v6}, Landroid/graphics/Rect;->exactCenterY()F

    move-result v9

    float-to-double v10, v9

    add-double/2addr v4, v10

    double-to-float v4, v4

    .line 5569
    iget-object v5, v8, Llm;->o:Landroid/graphics/Path;

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-virtual {v5, v9, v10}, Landroid/graphics/Path;->moveTo(FF)V

    .line 5570
    iget-object v5, v8, Llm;->o:Landroid/graphics/Path;

    iget v9, v8, Llm;->r:I

    int-to-float v9, v9

    iget v10, v8, Llm;->p:F

    mul-float/2addr v9, v10

    const/4 v10, 0x0

    invoke-virtual {v5, v9, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 5571
    iget-object v5, v8, Llm;->o:Landroid/graphics/Path;

    iget v9, v8, Llm;->r:I

    int-to-float v9, v9

    iget v10, v8, Llm;->p:F

    mul-float/2addr v9, v10

    const/high16 v10, 0x40000000    # 2.0f

    div-float/2addr v9, v10

    iget v10, v8, Llm;->s:I

    int-to-float v10, v10

    iget v11, v8, Llm;->p:F

    mul-float/2addr v10, v11

    invoke-virtual {v5, v9, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 5573
    iget-object v5, v8, Llm;->o:Landroid/graphics/Path;

    sub-float v0, v1, v0

    invoke-virtual {v5, v0, v4}, Landroid/graphics/Path;->offset(FF)V

    .line 5574
    iget-object v0, v8, Llm;->o:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 5576
    iget-object v0, v8, Llm;->c:Landroid/graphics/Paint;

    iget v1, v8, Llm;->w:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 5577
    add-float v0, v2, v3

    const/high16 v1, 0x40a00000    # 5.0f

    sub-float/2addr v0, v1

    invoke-virtual {v6}, Landroid/graphics/Rect;->exactCenterX()F

    move-result v1

    invoke-virtual {v6}, Landroid/graphics/Rect;->exactCenterY()F

    move-result v2

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 5579
    iget-object v0, v8, Llm;->o:Landroid/graphics/Path;

    iget-object v1, v8, Llm;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 5542
    :cond_0
    iget v0, v8, Llm;->t:I

    const/16 v1, 0xff

    if-ge v0, v1, :cond_1

    .line 5543
    iget-object v0, v8, Llm;->u:Landroid/graphics/Paint;

    iget v1, v8, Llm;->v:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 5544
    iget-object v0, v8, Llm;->u:Landroid/graphics/Paint;

    iget v1, v8, Llm;->t:I

    rsub-int v1, v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 5545
    invoke-virtual {v6}, Landroid/graphics/Rect;->exactCenterX()F

    move-result v0

    invoke-virtual {v6}, Landroid/graphics/Rect;->exactCenterY()F

    move-result v1

    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    iget-object v3, v8, Llm;->u:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 231
    :cond_1
    invoke-virtual {p1, v7}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 232
    return-void

    .line 5556
    :cond_2
    iget-object v0, v8, Llm;->o:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    goto/16 :goto_0
.end method

.method public final getAlpha()I
    .locals 1

    .prologue
    .line 240
    iget-object v0, p0, Lli;->a:Llm;

    .line 5649
    iget v0, v0, Llm;->t:I

    .line 240
    return v0
.end method

.method public final getIntrinsicHeight()I
    .locals 2

    .prologue
    .line 217
    iget-wide v0, p0, Lli;->m:D

    double-to-int v0, v0

    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 2

    .prologue
    .line 222
    iget-wide v0, p0, Lli;->l:D

    double-to-int v0, v0

    return v0
.end method

.method public final getOpacity()I
    .locals 1

    .prologue
    .line 261
    const/4 v0, -0x3

    return v0
.end method

.method public final isRunning()Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 266
    iget-object v3, p0, Lli;->f:Ljava/util/ArrayList;

    .line 267
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v2, v1

    .line 268
    :goto_0
    if-ge v2, v4, :cond_1

    .line 269
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/animation/Animation;

    .line 270
    invoke-virtual {v0}, Landroid/view/animation/Animation;->hasStarted()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v0}, Landroid/view/animation/Animation;->hasEnded()Z

    move-result v0

    if-nez v0, :cond_0

    .line 271
    const/4 v0, 0x1

    .line 274
    :goto_1
    return v0

    .line 268
    :cond_0
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_1
    move v0, v1

    .line 274
    goto :goto_1
.end method

.method public final setAlpha(I)V
    .locals 1

    .prologue
    .line 236
    iget-object v0, p0, Lli;->a:Llm;

    .line 5642
    iput p1, v0, Llm;->t:I

    .line 237
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 2

    .prologue
    .line 245
    iget-object v0, p0, Lli;->a:Llm;

    .line 6634
    iget-object v1, v0, Llm;->b:Landroid/graphics/Paint;

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 6635
    invoke-virtual {v0}, Llm;->d()V

    .line 246
    return-void
.end method

.method public final start()V
    .locals 4

    .prologue
    .line 279
    iget-object v0, p0, Lli;->j:Landroid/view/animation/Animation;

    invoke-virtual {v0}, Landroid/view/animation/Animation;->reset()V

    .line 280
    iget-object v0, p0, Lli;->a:Llm;

    invoke-virtual {v0}, Llm;->b()V

    .line 282
    iget-object v0, p0, Lli;->a:Llm;

    .line 6697
    iget v0, v0, Llm;->e:F

    .line 282
    iget-object v1, p0, Lli;->a:Llm;

    .line 7674
    iget v1, v1, Llm;->d:F

    .line 282
    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    .line 283
    const/4 v0, 0x1

    iput-boolean v0, p0, Lli;->b:Z

    .line 284
    iget-object v0, p0, Lli;->j:Landroid/view/animation/Animation;

    const-wide/16 v2, 0x29a

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 285
    iget-object v0, p0, Lli;->i:Landroid/view/View;

    iget-object v1, p0, Lli;->j:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 292
    :goto_0
    return-void

    .line 287
    :cond_0
    iget-object v0, p0, Lli;->a:Llm;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Llm;->a(I)V

    .line 288
    iget-object v0, p0, Lli;->a:Llm;

    invoke-virtual {v0}, Llm;->c()V

    .line 289
    iget-object v0, p0, Lli;->j:Landroid/view/animation/Animation;

    const-wide/16 v2, 0x534

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 290
    iget-object v0, p0, Lli;->i:Landroid/view/View;

    iget-object v1, p0, Lli;->j:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0
.end method

.method public final stop()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 296
    iget-object v0, p0, Lli;->i:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 297
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lli;->b(F)V

    .line 298
    iget-object v0, p0, Lli;->a:Llm;

    invoke-virtual {v0, v1}, Llm;->a(Z)V

    .line 299
    iget-object v0, p0, Lli;->a:Llm;

    invoke-virtual {v0, v1}, Llm;->a(I)V

    .line 300
    iget-object v0, p0, Lli;->a:Llm;

    invoke-virtual {v0}, Llm;->c()V

    .line 301
    return-void
.end method
