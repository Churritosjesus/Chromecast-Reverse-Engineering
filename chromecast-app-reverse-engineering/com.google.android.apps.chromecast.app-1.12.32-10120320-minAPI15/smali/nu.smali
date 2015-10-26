.class final Lnu;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lvs;


# instance fields
.field private a:Lvs;

.field private synthetic b:Lno;


# direct methods
.method public constructor <init>(Lno;Lvs;)V
    .locals 0

    .prologue
    .line 1497
    iput-object p1, p0, Lnu;->b:Lno;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1498
    iput-object p2, p0, Lnu;->a:Lvs;

    .line 1499
    return-void
.end method


# virtual methods
.method public final a(Lvr;)V
    .locals 2

    .prologue
    .line 1514
    iget-object v0, p0, Lnu;->a:Lvs;

    invoke-interface {v0, p1}, Lvs;->a(Lvr;)V

    .line 1515
    iget-object v0, p0, Lnu;->b:Lno;

    iget-object v0, v0, Lno;->q:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_2

    .line 1516
    iget-object v0, p0, Lnu;->b:Lno;

    iget-object v0, v0, Lno;->b:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lnu;->b:Lno;

    iget-object v1, v1, Lno;->r:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1517
    iget-object v0, p0, Lnu;->b:Lno;

    iget-object v0, v0, Lno;->q:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 1524
    :cond_0
    :goto_0
    iget-object v0, p0, Lnu;->b:Lno;

    iget-object v0, v0, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    if-eqz v0, :cond_1

    .line 1525
    iget-object v0, p0, Lnu;->b:Lno;

    iget-object v0, v0, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->removeAllViews()V

    .line 1530
    :cond_1
    iget-object v0, p0, Lnu;->b:Lno;

    const/4 v1, 0x0

    iput-object v1, v0, Lno;->o:Lvr;

    .line 1531
    return-void

    .line 1518
    :cond_2
    iget-object v0, p0, Lnu;->b:Lno;

    iget-object v0, v0, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    if-eqz v0, :cond_0

    .line 1519
    iget-object v0, p0, Lnu;->b:Lno;

    iget-object v0, v0, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarContextView;->setVisibility(I)V

    .line 1520
    iget-object v0, p0, Lnu;->b:Lno;

    iget-object v0, v0, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1521
    iget-object v0, p0, Lnu;->b:Lno;

    iget-object v0, v0, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Lgt;->q(Landroid/view/View;)V

    goto :goto_0
.end method

.method public final a(Lvr;Landroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 1502
    iget-object v0, p0, Lnu;->a:Lvs;

    invoke-interface {v0, p1, p2}, Lvs;->a(Lvr;Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public final a(Lvr;Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 1510
    iget-object v0, p0, Lnu;->a:Lvs;

    invoke-interface {v0, p1, p2}, Lvs;->a(Lvr;Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public final b(Lvr;Landroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 1506
    iget-object v0, p0, Lnu;->a:Lvs;

    invoke-interface {v0, p1, p2}, Lvs;->b(Lvr;Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method
