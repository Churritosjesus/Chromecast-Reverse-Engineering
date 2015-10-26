.class final Lvz;
.super Lyg;
.source "PG"


# instance fields
.field private synthetic a:Lvy;


# direct methods
.method constructor <init>(Lvy;Landroid/view/View;Lvu;)V
    .locals 0

    .prologue
    .line 595
    iput-object p1, p0, Lvz;->a:Lvy;

    invoke-direct {p0, p2}, Lyg;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final a()Lyc;
    .locals 1

    .prologue
    .line 598
    iget-object v0, p0, Lvz;->a:Lvy;

    iget-object v0, v0, Lvy;->a:Lvu;

    .line 1053
    iget-object v0, v0, Lvu;->j:Lwa;

    .line 598
    if-nez v0, :cond_0

    .line 599
    const/4 v0, 0x0

    .line 602
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lvz;->a:Lvy;

    iget-object v0, v0, Lvy;->a:Lvu;

    .line 2053
    iget-object v0, v0, Lvu;->j:Lwa;

    .line 2131
    iget-object v0, v0, Lqn;->c:Lyc;

    goto :goto_0
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 607
    iget-object v0, p0, Lvz;->a:Lvy;

    iget-object v0, v0, Lvy;->a:Lvu;

    invoke-virtual {v0}, Lvu;->b()Z

    .line 608
    const/4 v0, 0x1

    return v0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 616
    iget-object v0, p0, Lvz;->a:Lvy;

    iget-object v0, v0, Lvy;->a:Lvu;

    .line 3053
    iget-object v0, v0, Lvu;->l:Lvx;

    .line 616
    if-eqz v0, :cond_0

    .line 617
    const/4 v0, 0x0

    .line 621
    :goto_0
    return v0

    .line 620
    :cond_0
    iget-object v0, p0, Lvz;->a:Lvy;

    iget-object v0, v0, Lvy;->a:Lvu;

    invoke-virtual {v0}, Lvu;->c()Z

    .line 621
    const/4 v0, 0x1

    goto :goto_0
.end method
