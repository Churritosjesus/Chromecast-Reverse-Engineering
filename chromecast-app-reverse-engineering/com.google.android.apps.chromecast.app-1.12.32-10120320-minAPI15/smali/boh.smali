.class public final Lboh;
.super Landroid/widget/LinearLayout;
.source "PG"


# instance fields
.field public a:Lbof;

.field private final b:I

.field private final c:Landroid/graphics/Paint;

.field private final d:I

.field private final e:Landroid/graphics/Paint;

.field private final f:I

.field private final g:Landroid/graphics/Paint;

.field private final h:F

.field private i:I

.field private j:F

.field private final k:Lboi;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 59
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lboh;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 60
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 63
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 64
    invoke-virtual {p0, v5}, Lboh;->setWillNotDraw(Z)V

    .line 66
    invoke-virtual {p0}, Lboh;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 68
    sget v1, La;->dl:I

    .line 70
    const/16 v2, 0x26

    invoke-static {v1, v2}, Lboh;->a(IB)I

    move-result v2

    iput v2, p0, Lboh;->f:I

    .line 73
    new-instance v2, Lboi;

    .line 1185
    invoke-direct {v2}, Lboi;-><init>()V

    .line 73
    iput-object v2, p0, Lboh;->k:Lboi;

    .line 74
    iget-object v2, p0, Lboh;->k:Lboi;

    new-array v3, v6, [I

    const v4, -0xcc4a1b

    aput v4, v3, v5

    .line 1200
    iput-object v3, v2, Lboi;->a:[I

    .line 75
    iget-object v2, p0, Lboh;->k:Lboi;

    new-array v3, v6, [I

    const/16 v4, 0x20

    invoke-static {v1, v4}, Lboh;->a(IB)I

    move-result v1

    aput v1, v3, v5

    .line 1204
    iput-object v3, v2, Lboi;->b:[I

    .line 78
    const/4 v1, 0x0

    mul-float/2addr v1, v0

    float-to-int v1, v1

    iput v1, p0, Lboh;->b:I

    .line 79
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lboh;->c:Landroid/graphics/Paint;

    .line 80
    iget-object v1, p0, Lboh;->c:Landroid/graphics/Paint;

    iget v2, p0, Lboh;->f:I

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 82
    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, v0

    float-to-int v1, v1

    iput v1, p0, Lboh;->d:I

    .line 83
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lboh;->e:Landroid/graphics/Paint;

    .line 85
    const/high16 v1, 0x3f000000    # 0.5f

    iput v1, p0, Lboh;->h:F

    .line 86
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lboh;->g:Landroid/graphics/Paint;

    .line 87
    iget-object v1, p0, Lboh;->g:Landroid/graphics/Paint;

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v0, v2

    float-to-int v0, v0

    int-to-float v0, v0

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 88
    return-void
.end method

.method private static a(IB)I
    .locals 3

    .prologue
    .line 168
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v1

    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    invoke-static {p1, v0, v1, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    return v0
.end method


# virtual methods
.method final a(IF)V
    .locals 0

    .prologue
    .line 110
    iput p1, p0, Lboh;->i:I

    .line 111
    iput p2, p0, Lboh;->j:F

    .line 112
    invoke-virtual {p0}, Lboh;->invalidate()V

    .line 113
    return-void
.end method

.method protected final onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    .prologue
    .line 117
    invoke-virtual {p0}, Lboh;->getHeight()I

    move-result v6

    .line 118
    invoke-virtual {p0}, Lboh;->getChildCount()I

    move-result v8

    .line 119
    const/4 v0, 0x0

    iget v1, p0, Lboh;->h:F

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    int-to-float v1, v6

    mul-float/2addr v0, v1

    float-to-int v9, v0

    .line 120
    iget-object v0, p0, Lboh;->a:Lbof;

    if-eqz v0, :cond_2

    .line 121
    iget-object v0, p0, Lboh;->a:Lbof;

    move-object v7, v0

    .line 125
    :goto_0
    if-lez v8, :cond_1

    .line 126
    iget v0, p0, Lboh;->i:I

    invoke-virtual {p0, v0}, Lboh;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 127
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v2

    .line 128
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v1

    .line 129
    iget v0, p0, Lboh;->i:I

    invoke-interface {v7, v0}, Lbof;->a(I)I

    move-result v0

    .line 131
    iget v3, p0, Lboh;->j:F

    const/4 v4, 0x0

    cmpl-float v3, v3, v4

    if-lez v3, :cond_4

    iget v3, p0, Lboh;->i:I

    invoke-virtual {p0}, Lboh;->getChildCount()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ge v3, v4, :cond_4

    .line 132
    iget v3, p0, Lboh;->i:I

    add-int/lit8 v3, v3, 0x1

    invoke-interface {v7, v3}, Lbof;->a(I)I

    move-result v3

    .line 133
    if-eq v0, v3, :cond_0

    .line 134
    iget v4, p0, Lboh;->j:F

    .line 2178
    const/high16 v5, 0x3f800000    # 1.0f

    sub-float/2addr v5, v4

    .line 2179
    invoke-static {v3}, Landroid/graphics/Color;->red(I)I

    move-result v10

    int-to-float v10, v10

    mul-float/2addr v10, v4

    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    move-result v11

    int-to-float v11, v11

    mul-float/2addr v11, v5

    add-float/2addr v10, v11

    .line 2180
    invoke-static {v3}, Landroid/graphics/Color;->green(I)I

    move-result v11

    int-to-float v11, v11

    mul-float/2addr v11, v4

    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    move-result v12

    int-to-float v12, v12

    mul-float/2addr v12, v5

    add-float/2addr v11, v12

    .line 2181
    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v3, v4

    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, v5

    add-float/2addr v0, v3

    .line 2182
    float-to-int v3, v10

    float-to-int v4, v11

    float-to-int v0, v0

    invoke-static {v3, v4, v0}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    .line 138
    :cond_0
    iget v3, p0, Lboh;->i:I

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {p0, v3}, Lboh;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 139
    iget v4, p0, Lboh;->j:F

    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v5

    int-to-float v5, v5

    mul-float/2addr v4, v5

    const/high16 v5, 0x3f800000    # 1.0f

    iget v10, p0, Lboh;->j:F

    sub-float/2addr v5, v10

    int-to-float v2, v2

    mul-float/2addr v2, v5

    add-float/2addr v2, v4

    float-to-int v2, v2

    .line 141
    iget v4, p0, Lboh;->j:F

    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v3, v4

    const/high16 v4, 0x3f800000    # 1.0f

    iget v5, p0, Lboh;->j:F

    sub-float/2addr v4, v5

    int-to-float v1, v1

    mul-float/2addr v1, v4

    add-float/2addr v1, v3

    float-to-int v1, v1

    move v3, v1

    move v1, v2

    .line 145
    :goto_1
    iget-object v2, p0, Lboh;->e:Landroid/graphics/Paint;

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 147
    int-to-float v1, v1

    iget v0, p0, Lboh;->d:I

    sub-int v0, v6, v0

    int-to-float v2, v0

    int-to-float v3, v3

    int-to-float v4, v6

    iget-object v5, p0, Lboh;->e:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 152
    :cond_1
    const/4 v1, 0x0

    iget v0, p0, Lboh;->b:I

    sub-int v0, v6, v0

    int-to-float v2, v0

    invoke-virtual {p0}, Lboh;->getWidth()I

    move-result v0

    int-to-float v3, v0

    int-to-float v4, v6

    iget-object v5, p0, Lboh;->c:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 155
    sub-int v0, v6, v9

    div-int/lit8 v10, v0, 0x2

    .line 156
    const/4 v0, 0x0

    move v6, v0

    :goto_2
    add-int/lit8 v0, v8, -0x1

    if-ge v6, v0, :cond_3

    .line 157
    invoke-virtual {p0, v6}, Lboh;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 158
    iget-object v1, p0, Lboh;->g:Landroid/graphics/Paint;

    invoke-interface {v7, v6}, Lbof;->b(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 159
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v1

    int-to-float v1, v1

    int-to-float v2, v10

    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v0

    int-to-float v3, v0

    add-int v0, v10, v9

    int-to-float v4, v0

    iget-object v5, p0, Lboh;->g:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 156
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_2

    .line 122
    :cond_2
    iget-object v0, p0, Lboh;->k:Lboi;

    move-object v7, v0

    goto/16 :goto_0

    .line 162
    :cond_3
    return-void

    :cond_4
    move v3, v1

    move v1, v2

    goto :goto_1
.end method
