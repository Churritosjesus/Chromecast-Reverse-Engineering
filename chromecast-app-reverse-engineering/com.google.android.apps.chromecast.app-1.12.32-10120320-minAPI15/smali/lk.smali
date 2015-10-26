.class final Llk;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field private synthetic a:Llm;

.field private synthetic b:Lli;


# direct methods
.method constructor <init>(Lli;Llm;)V
    .locals 0

    .prologue
    .line 419
    iput-object p1, p0, Llk;->b:Lli;

    iput-object p2, p0, Llk;->a:Llm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 429
    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 433
    iget-object v0, p0, Llk;->a:Llm;

    invoke-virtual {v0}, Llm;->b()V

    .line 434
    iget-object v0, p0, Llk;->a:Llm;

    .line 1630
    invoke-virtual {v0}, Llm;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Llm;->a(I)V

    .line 435
    iget-object v0, p0, Llk;->a:Llm;

    iget-object v1, p0, Llk;->a:Llm;

    .line 1697
    iget v1, v1, Llm;->e:F

    .line 435
    invoke-virtual {v0, v1}, Llm;->a(F)V

    .line 436
    iget-object v0, p0, Llk;->b:Lli;

    iget-boolean v0, v0, Lli;->b:Z

    if-eqz v0, :cond_0

    .line 439
    iget-object v0, p0, Llk;->b:Lli;

    iput-boolean v2, v0, Lli;->b:Z

    .line 440
    const-wide/16 v0, 0x534

    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 441
    iget-object v0, p0, Llk;->a:Llm;

    invoke-virtual {v0, v2}, Llm;->a(Z)V

    .line 445
    :goto_0
    return-void

    .line 443
    :cond_0
    iget-object v0, p0, Llk;->b:Lli;

    iget-object v1, p0, Llk;->b:Lli;

    invoke-static {v1}, Lli;->a(Lli;)F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    add-float/2addr v1, v2

    const/high16 v2, 0x40a00000    # 5.0f

    rem-float/2addr v1, v2

    invoke-static {v0, v1}, Lli;->a(Lli;F)F

    goto :goto_0
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    .line 423
    iget-object v0, p0, Llk;->b:Lli;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lli;->a(Lli;F)F

    .line 424
    return-void
.end method
