.class final Lbnx;
.super Landroid/view/animation/Animation;
.source "PG"


# instance fields
.field private final a:I

.field private final b:Landroid/view/View;

.field private final c:Z

.field private synthetic d:Lbmu;


# direct methods
.method public constructor <init>(Lbmu;Landroid/view/View;IZ)V
    .locals 2

    .prologue
    .line 111
    iput-object p1, p0, Lbnx;->d:Lbmu;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    .line 112
    iput-object p2, p0, Lbnx;->b:Landroid/view/View;

    .line 113
    iput p3, p0, Lbnx;->a:I

    .line 114
    iput-boolean p4, p0, Lbnx;->c:Z

    .line 115
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 1069
    iget-object v0, p1, Lbmu;->h:Landroid/content/Context;

    .line 116
    const v1, 0x10c0002

    invoke-virtual {p0, v0, v1}, Lbnx;->setInterpolator(Landroid/content/Context;I)V

    .line 118
    :cond_0
    const-wide/16 v0, 0xc8

    invoke-virtual {p0, v0, v1}, Lbnx;->setDuration(J)V

    .line 119
    return-void
.end method


# virtual methods
.method protected final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 2

    .prologue
    .line 124
    iget-boolean v0, p0, Lbnx;->c:Z

    if-eqz v0, :cond_0

    .line 125
    iget v0, p0, Lbnx;->a:I

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int v0, v0

    .line 129
    :goto_0
    iget-object v1, p0, Lbnx;->b:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 130
    iget-object v0, p0, Lbnx;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 131
    iget-object v0, p0, Lbnx;->d:Lbmu;

    .line 2069
    iget-object v0, v0, Lbmu;->g:Lbob;

    .line 131
    invoke-interface {v0}, Lbob;->a()V

    .line 132
    return-void

    .line 127
    :cond_0
    iget v0, p0, Lbnx;->a:I

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, p1

    mul-float/2addr v0, v1

    float-to-int v0, v0

    goto :goto_0
.end method

.method public final initialize(IIII)V
    .locals 0

    .prologue
    .line 137
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/animation/Animation;->initialize(IIII)V

    .line 138
    return-void
.end method

.method public final willChangeBounds()Z
    .locals 1

    .prologue
    .line 142
    const/4 v0, 0x1

    return v0
.end method
