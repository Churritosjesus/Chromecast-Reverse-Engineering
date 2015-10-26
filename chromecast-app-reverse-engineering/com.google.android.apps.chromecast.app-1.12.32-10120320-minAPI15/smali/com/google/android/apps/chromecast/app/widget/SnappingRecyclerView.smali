.class public Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;
.super Landroid/support/v7/widget/RecyclerView;
.source "PG"


# instance fields
.field public s:I

.field private t:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 27
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 20
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;->t:I

    .line 33
    new-instance v0, Lboj;

    invoke-direct {v0, p0}, Lboj;-><init>(Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;)V

    .line 2216
    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->o:Lzj;

    .line 39
    return-void
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;)I
    .locals 1

    .prologue
    .line 13
    iget v0, p0, Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;->t:I

    return v0
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;I)I
    .locals 0

    .prologue
    .line 13
    iput p1, p0, Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;->t:I

    return p1
.end method


# virtual methods
.method public final b(II)Z
    .locals 7

    .prologue
    const-wide v4, 0x412e848000000000L    # 1000000.0

    const/4 v6, 0x0

    .line 56
    int-to-double v0, p1

    .line 3071
    const-wide v2, 0x3fd6666660000000L    # 0.3499999940395355

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    mul-double/2addr v0, v2

    .line 3072
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v2

    float-to-double v2, v2

    mul-double/2addr v2, v4

    div-double/2addr v0, v2

    .line 3071
    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    .line 3066
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v2

    float-to-double v2, v2

    mul-double/2addr v2, v4

    const-wide v4, 0x3ffbc3c3d2fd57c6L    # 1.7352941743642858

    mul-double/2addr v0, v4

    .line 3067
    invoke-static {v0, v1}, Ljava/lang/Math;->exp(D)D

    move-result-wide v0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    .line 57
    iget v1, p0, Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;->t:I

    if-lez p1, :cond_0

    :goto_0
    add-int/2addr v0, v1

    .line 4046
    iget v1, p0, Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;->s:I

    rem-int v1, v0, v1

    .line 4047
    iget v2, p0, Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;->s:I

    div-int/lit8 v2, v2, 0x2

    if-ge v1, v2, :cond_1

    .line 4048
    iget v1, p0, Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;->s:I

    div-int/2addr v0, v1

    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 58
    :goto_1
    iget v1, p0, Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;->s:I

    mul-int/2addr v0, v1

    iget v1, p0, Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;->t:I

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0, v6}, Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;->a(II)V

    .line 59
    const/4 v0, 0x1

    return v0

    .line 57
    :cond_0
    neg-int v0, v0

    goto :goto_0

    .line 4050
    :cond_1
    iget v1, p0, Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;->s:I

    div-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_1
.end method
