.class final Lmc;
.super Landroid/view/animation/Animation;
.source "PG"


# instance fields
.field private synthetic a:Llw;


# direct methods
.method constructor <init>(Llw;)V
    .locals 0

    .prologue
    .line 874
    iput-object p1, p0, Lmc;->a:Llw;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 3

    .prologue
    .line 879
    iget-object v0, p0, Lmc;->a:Llw;

    invoke-static {v0}, Llw;->h(Llw;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 880
    iget-object v0, p0, Lmc;->a:Llw;

    invoke-static {v0}, Llw;->i(Llw;)F

    move-result v0

    iget-object v1, p0, Lmc;->a:Llw;

    iget v1, v1, Llw;->d:I

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    float-to-int v0, v0

    .line 884
    :goto_0
    iget-object v1, p0, Lmc;->a:Llw;

    iget v1, v1, Llw;->c:I

    iget-object v2, p0, Lmc;->a:Llw;

    iget v2, v2, Llw;->c:I

    sub-int/2addr v0, v2

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int v0, v0

    add-int/2addr v0, v1

    .line 885
    iget-object v1, p0, Lmc;->a:Llw;

    invoke-static {v1}, Llw;->e(Llw;)Lkh;

    move-result-object v1

    invoke-virtual {v1}, Lkh;->getTop()I

    move-result v1

    sub-int/2addr v0, v1

    .line 886
    iget-object v1, p0, Lmc;->a:Llw;

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Llw;->a(Llw;IZ)V

    .line 887
    iget-object v0, p0, Lmc;->a:Llw;

    invoke-static {v0}, Llw;->b(Llw;)Lli;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, p1

    invoke-virtual {v0, v1}, Lli;->a(F)V

    .line 888
    return-void

    .line 882
    :cond_0
    iget-object v0, p0, Lmc;->a:Llw;

    invoke-static {v0}, Llw;->i(Llw;)F

    move-result v0

    float-to-int v0, v0

    goto :goto_0
.end method
