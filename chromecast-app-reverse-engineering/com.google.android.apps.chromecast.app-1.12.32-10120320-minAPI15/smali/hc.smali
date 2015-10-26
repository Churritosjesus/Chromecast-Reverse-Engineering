.class final Lhc;
.super Lhb;
.source "PG"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1365
    invoke-direct {p0}, Lhb;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Lix;)Lix;
    .locals 2

    .prologue
    .line 1483
    .line 3090
    instance-of v0, p2, Liy;

    if-eqz v0, :cond_0

    move-object v0, p2

    .line 3092
    check-cast v0, Liy;

    .line 3116
    iget-object v0, v0, Liy;->a:Landroid/view/WindowInsets;

    .line 3094
    invoke-virtual {p1, v0}, Landroid/view/View;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    .line 3096
    if-eq v1, v0, :cond_0

    .line 3098
    new-instance p2, Liy;

    invoke-direct {p2, v1}, Liy;-><init>(Landroid/view/WindowInsets;)V

    .line 1483
    :cond_0
    return-object p2
.end method

.method public final a(Landroid/view/View;Lgm;)V
    .locals 1

    .prologue
    .line 1403
    .line 2056
    new-instance v0, Lhe;

    invoke-direct {v0, p2}, Lhe;-><init>(Lgm;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    .line 1404
    return-void
.end method

.method public final f(Landroid/view/View;F)V
    .locals 0

    .prologue
    .line 1383
    .line 2039
    invoke-virtual {p1, p2}, Landroid/view/View;->setElevation(F)V

    .line 1384
    return-void
.end method

.method public final q(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 1378
    .line 2035
    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    .line 1379
    return-void
.end method

.method public final t(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 1423
    .line 2132
    invoke-virtual {p1}, Landroid/view/View;->stopNestedScroll()V

    .line 1424
    return-void
.end method
