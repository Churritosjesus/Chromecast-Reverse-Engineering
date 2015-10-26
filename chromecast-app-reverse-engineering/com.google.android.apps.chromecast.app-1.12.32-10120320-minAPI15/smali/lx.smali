.class final Llx;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field private synthetic a:Llw;


# direct methods
.method constructor <init>(Llw;)V
    .locals 0

    .prologue
    .line 151
    iput-object p1, p0, Llx;->a:Llw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3

    .prologue
    const/16 v2, 0xff

    .line 162
    iget-object v0, p0, Llx;->a:Llw;

    invoke-static {v0}, Llw;->a(Llw;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 164
    iget-object v0, p0, Llx;->a:Llw;

    invoke-static {v0}, Llw;->b(Llw;)Lli;

    move-result-object v0

    invoke-virtual {v0, v2}, Lli;->setAlpha(I)V

    .line 165
    iget-object v0, p0, Llx;->a:Llw;

    invoke-static {v0}, Llw;->b(Llw;)Lli;

    move-result-object v0

    invoke-virtual {v0}, Lli;->start()V

    .line 166
    iget-object v0, p0, Llx;->a:Llw;

    invoke-static {v0}, Llw;->c(Llw;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 167
    iget-object v0, p0, Llx;->a:Llw;

    invoke-static {v0}, Llw;->d(Llw;)Lme;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 168
    iget-object v0, p0, Llx;->a:Llw;

    invoke-static {v0}, Llw;->d(Llw;)Lme;

    move-result-object v0

    invoke-interface {v0}, Lme;->a()V

    .line 183
    :cond_0
    :goto_0
    iget-object v0, p0, Llx;->a:Llw;

    iget-object v1, p0, Llx;->a:Llw;

    invoke-static {v1}, Llw;->e(Llw;)Lkh;

    move-result-object v1

    invoke-virtual {v1}, Lkh;->getTop()I

    move-result v1

    invoke-static {v0, v1}, Llw;->b(Llw;I)I

    .line 184
    return-void

    .line 172
    :cond_1
    iget-object v0, p0, Llx;->a:Llw;

    invoke-static {v0}, Llw;->b(Llw;)Lli;

    move-result-object v0

    invoke-virtual {v0}, Lli;->stop()V

    .line 173
    iget-object v0, p0, Llx;->a:Llw;

    invoke-static {v0}, Llw;->e(Llw;)Lkh;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lkh;->setVisibility(I)V

    .line 174
    iget-object v0, p0, Llx;->a:Llw;

    invoke-static {v0, v2}, Llw;->a(Llw;I)V

    .line 176
    iget-object v0, p0, Llx;->a:Llw;

    invoke-static {v0}, Llw;->f(Llw;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 177
    iget-object v0, p0, Llx;->a:Llw;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Llw;->a(Llw;F)V

    goto :goto_0

    .line 179
    :cond_2
    iget-object v0, p0, Llx;->a:Llw;

    iget-object v1, p0, Llx;->a:Llw;

    iget v1, v1, Llw;->d:I

    iget-object v2, p0, Llx;->a:Llw;

    invoke-static {v2}, Llw;->g(Llw;)I

    move-result v2

    sub-int/2addr v1, v2

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Llw;->a(Llw;IZ)V

    goto :goto_0
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 158
    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 154
    return-void
.end method
