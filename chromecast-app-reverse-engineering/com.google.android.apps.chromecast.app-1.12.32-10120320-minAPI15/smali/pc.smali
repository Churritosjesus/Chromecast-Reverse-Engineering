.class final Lpc;
.super Liv;
.source "PG"


# instance fields
.field private synthetic a:Lpb;


# direct methods
.method constructor <init>(Lpb;)V
    .locals 0

    .prologue
    .line 135
    iput-object p1, p0, Lpc;->a:Lpb;

    invoke-direct {p0}, Liv;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Landroid/view/View;)V
    .locals 4

    .prologue
    const/16 v2, 0x8

    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 138
    iget-object v0, p0, Lpc;->a:Lpb;

    invoke-static {v0}, Lpb;->a(Lpb;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpc;->a:Lpb;

    invoke-static {v0}, Lpb;->b(Lpb;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 139
    iget-object v0, p0, Lpc;->a:Lpb;

    invoke-static {v0}, Lpb;->b(Lpb;)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lgt;->b(Landroid/view/View;F)V

    .line 140
    iget-object v0, p0, Lpc;->a:Lpb;

    invoke-static {v0}, Lpb;->c(Lpb;)Landroid/support/v7/internal/widget/ActionBarContainer;

    move-result-object v0

    invoke-static {v0, v1}, Lgt;->b(Landroid/view/View;F)V

    .line 142
    :cond_0
    iget-object v0, p0, Lpc;->a:Lpb;

    invoke-static {v0}, Lpb;->d(Lpb;)Landroid/support/v7/internal/widget/ActionBarContainer;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lpc;->a:Lpb;

    invoke-static {v0}, Lpb;->e(Lpb;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 143
    iget-object v0, p0, Lpc;->a:Lpb;

    invoke-static {v0}, Lpb;->d(Lpb;)Landroid/support/v7/internal/widget/ActionBarContainer;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/ActionBarContainer;->setVisibility(I)V

    .line 145
    :cond_1
    iget-object v0, p0, Lpc;->a:Lpb;

    invoke-static {v0}, Lpb;->c(Lpb;)Landroid/support/v7/internal/widget/ActionBarContainer;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/ActionBarContainer;->setVisibility(I)V

    .line 146
    iget-object v0, p0, Lpc;->a:Lpb;

    invoke-static {v0}, Lpb;->c(Lpb;)Landroid/support/v7/internal/widget/ActionBarContainer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarContainer;->a(Z)V

    .line 147
    iget-object v0, p0, Lpc;->a:Lpb;

    invoke-static {v0, v3}, Lpb;->a(Lpb;Lpp;)Lpp;

    .line 148
    iget-object v0, p0, Lpc;->a:Lpb;

    .line 1320
    iget-object v1, v0, Lpb;->c:Lvs;

    if-eqz v1, :cond_2

    .line 1321
    iget-object v1, v0, Lpb;->c:Lvs;

    iget-object v2, v0, Lpb;->b:Lvr;

    invoke-interface {v1, v2}, Lvs;->a(Lvr;)V

    .line 1322
    iput-object v3, v0, Lpb;->b:Lvr;

    .line 1323
    iput-object v3, v0, Lpb;->c:Lvs;

    .line 149
    :cond_2
    iget-object v0, p0, Lpc;->a:Lpb;

    invoke-static {v0}, Lpb;->f(Lpb;)Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 150
    iget-object v0, p0, Lpc;->a:Lpb;

    invoke-static {v0}, Lpb;->f(Lpb;)Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    move-result-object v0

    invoke-static {v0}, Lgt;->q(Landroid/view/View;)V

    .line 152
    :cond_3
    return-void
.end method
