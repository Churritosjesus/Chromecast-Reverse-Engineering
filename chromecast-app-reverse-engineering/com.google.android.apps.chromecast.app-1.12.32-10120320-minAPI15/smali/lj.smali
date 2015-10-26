.class final Llj;
.super Landroid/view/animation/Animation;
.source "PG"


# instance fields
.field private synthetic a:Llm;

.field private synthetic b:Lli;


# direct methods
.method constructor <init>(Lli;Llm;)V
    .locals 0

    .prologue
    .line 364
    iput-object p1, p0, Llj;->b:Lli;

    iput-object p2, p0, Llj;->a:Llm;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 9

    .prologue
    const v8, 0x3f4ccccd    # 0.8f

    const/high16 v7, 0x3f000000    # 0.5f

    .line 367
    iget-object v0, p0, Llj;->b:Lli;

    iget-boolean v0, v0, Lli;->b:Z

    if-eqz v0, :cond_0

    .line 368
    iget-object v0, p0, Llj;->b:Lli;

    iget-object v1, p0, Llj;->a:Llm;

    invoke-static {v0, p1, v1}, Lli;->a(Lli;FLlm;)V

    .line 414
    :goto_0
    return-void

    .line 372
    :cond_0
    iget-object v0, p0, Llj;->b:Lli;

    iget-object v1, p0, Llj;->a:Llm;

    invoke-static {v0, v1}, Lli;->a(Lli;Llm;)F

    move-result v0

    .line 373
    iget-object v1, p0, Llj;->a:Llm;

    .line 1682
    iget v1, v1, Llm;->l:F

    .line 374
    iget-object v2, p0, Llj;->a:Llm;

    .line 2678
    iget v2, v2, Llm;->k:F

    .line 375
    iget-object v3, p0, Llj;->a:Llm;

    .line 2763
    iget v3, v3, Llm;->m:F

    .line 377
    iget-object v4, p0, Llj;->b:Lli;

    iget-object v5, p0, Llj;->a:Llm;

    invoke-static {v4, p1, v5}, Lli;->b(Lli;FLlm;)V

    .line 381
    cmpg-float v4, p1, v7

    if-gtz v4, :cond_1

    .line 385
    div-float v4, p1, v7

    .line 387
    sub-float v5, v8, v0

    invoke-static {}, Lli;->a()Landroid/view/animation/Interpolator;

    move-result-object v6

    invoke-interface {v6, v4}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v4

    mul-float/2addr v4, v5

    add-float/2addr v2, v4

    .line 390
    iget-object v4, p0, Llj;->a:Llm;

    invoke-virtual {v4, v2}, Llm;->a(F)V

    .line 395
    :cond_1
    cmpl-float v2, p1, v7

    if-lez v2, :cond_2

    .line 399
    sub-float v0, v8, v0

    .line 400
    sub-float v2, p1, v7

    div-float/2addr v2, v7

    .line 402
    invoke-static {}, Lli;->a()Landroid/view/animation/Interpolator;

    move-result-object v4

    invoke-interface {v4, v2}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v2

    mul-float/2addr v0, v2

    add-float/2addr v0, v1

    .line 404
    iget-object v1, p0, Llj;->a:Llm;

    invoke-virtual {v1, v0}, Llm;->b(F)V

    .line 407
    :cond_2
    const/high16 v0, 0x3e800000    # 0.25f

    mul-float/2addr v0, p1

    add-float/2addr v0, v3

    .line 408
    iget-object v1, p0, Llj;->a:Llm;

    invoke-virtual {v1, v0}, Llm;->c(F)V

    .line 410
    const/high16 v0, 0x43580000    # 216.0f

    mul-float/2addr v0, p1

    const/high16 v1, 0x44870000    # 1080.0f

    iget-object v2, p0, Llj;->b:Lli;

    invoke-static {v2}, Lli;->a(Lli;)F

    move-result v2

    const/high16 v3, 0x40a00000    # 5.0f

    div-float/2addr v2, v3

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    .line 412
    iget-object v1, p0, Llj;->b:Lli;

    invoke-virtual {v1, v0}, Lli;->b(F)V

    goto :goto_0
.end method
