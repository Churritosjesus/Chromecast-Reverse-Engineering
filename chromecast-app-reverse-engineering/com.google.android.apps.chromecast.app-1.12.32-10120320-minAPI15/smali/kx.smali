.class public final Lkx;
.super Lmi;
.source "PG"


# instance fields
.field final a:I

.field public b:Lmf;

.field final synthetic c:Landroid/support/v4/widget/DrawerLayout;

.field private final d:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/support/v4/widget/DrawerLayout;I)V
    .locals 1

    .prologue
    .line 1634
    iput-object p1, p0, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    invoke-direct {p0}, Lmi;-><init>()V

    .line 1628
    new-instance v0, Lky;

    invoke-direct {v0, p0}, Lky;-><init>(Lkx;)V

    iput-object v0, p0, Lkx;->d:Ljava/lang/Runnable;

    .line 1635
    iput p2, p0, Lkx;->a:I

    .line 1636
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 1643
    iget-object v0, p0, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    iget-object v1, p0, Lkx;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1644
    return-void
.end method

.method public final a(I)V
    .locals 9

    .prologue
    const/16 v8, 0x20

    const/4 v0, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 1656
    iget-object v4, p0, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    iget-object v1, p0, Lkx;->b:Lmf;

    .line 2475
    iget-object v5, v1, Lmf;->m:Landroid/view/View;

    .line 2611
    iget-object v1, v4, Landroid/support/v4/widget/DrawerLayout;->b:Lmf;

    .line 3421
    iget v1, v1, Lmf;->a:I

    .line 2612
    iget-object v6, v4, Landroid/support/v4/widget/DrawerLayout;->c:Lmf;

    .line 4421
    iget v6, v6, Lmf;->a:I

    .line 2615
    if-eq v1, v3, :cond_0

    if-ne v6, v3, :cond_4

    :cond_0
    move v1, v3

    .line 2623
    :goto_0
    if-eqz v5, :cond_2

    if-nez p1, :cond_2

    .line 2624
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lku;

    .line 2625
    iget v6, v0, Lku;->b:F

    const/4 v7, 0x0

    cmpl-float v6, v6, v7

    if-nez v6, :cond_7

    .line 4642
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lku;

    .line 4643
    iget-boolean v3, v0, Lku;->d:Z

    if-eqz v3, :cond_2

    .line 4644
    iput-boolean v2, v0, Lku;->d:Z

    .line 4645
    iget-object v0, v4, Landroid/support/v4/widget/DrawerLayout;->f:Lkt;

    if-eqz v0, :cond_1

    .line 4646
    iget-object v0, v4, Landroid/support/v4/widget/DrawerLayout;->f:Lkt;

    invoke-interface {v0}, Lkt;->b()V

    .line 4649
    :cond_1
    invoke-virtual {v4, v5, v2}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;Z)V

    .line 4654
    invoke-virtual {v4}, Landroid/support/v4/widget/DrawerLayout;->hasWindowFocus()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4655
    invoke-virtual {v4}, Landroid/support/v4/widget/DrawerLayout;->getRootView()Landroid/view/View;

    move-result-object v0

    .line 4656
    if-eqz v0, :cond_2

    .line 4657
    invoke-virtual {v0, v8}, Landroid/view/View;->sendAccessibilityEvent(I)V

    .line 2632
    :cond_2
    :goto_1
    iget v0, v4, Landroid/support/v4/widget/DrawerLayout;->d:I

    if-eq v1, v0, :cond_3

    .line 2633
    iput v1, v4, Landroid/support/v4/widget/DrawerLayout;->d:I

    .line 1657
    :cond_3
    return-void

    .line 2617
    :cond_4
    if-eq v1, v0, :cond_5

    if-ne v6, v0, :cond_6

    :cond_5
    move v1, v0

    .line 2618
    goto :goto_0

    :cond_6
    move v1, v2

    .line 2620
    goto :goto_0

    .line 2627
    :cond_7
    iget v0, v0, Lku;->b:F

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v2

    if-nez v0, :cond_2

    .line 4664
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lku;

    .line 4665
    iget-boolean v2, v0, Lku;->d:Z

    if-nez v2, :cond_2

    .line 4666
    iput-boolean v3, v0, Lku;->d:Z

    .line 4667
    iget-object v0, v4, Landroid/support/v4/widget/DrawerLayout;->f:Lkt;

    if-eqz v0, :cond_8

    .line 4668
    iget-object v0, v4, Landroid/support/v4/widget/DrawerLayout;->f:Lkt;

    invoke-interface {v0}, Lkt;->a()V

    .line 4671
    :cond_8
    invoke-virtual {v4, v5, v3}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;Z)V

    .line 4674
    invoke-virtual {v4}, Landroid/support/v4/widget/DrawerLayout;->hasWindowFocus()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 4675
    invoke-virtual {v4, v8}, Landroid/support/v4/widget/DrawerLayout;->sendAccessibilityEvent(I)V

    .line 4678
    :cond_9
    invoke-virtual {v5}, Landroid/view/View;->requestFocus()Z

    goto :goto_1
.end method

.method public final a(II)V
    .locals 2

    .prologue
    .line 1758
    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 1759
    iget-object v0, p0, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->b(I)Landroid/view/View;

    move-result-object v0

    .line 1764
    :goto_0
    if-eqz v0, :cond_0

    iget-object v1, p0, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v1, v0}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;)I

    move-result v1

    if-nez v1, :cond_0

    .line 1765
    iget-object v1, p0, Lkx;->b:Lmf;

    invoke-virtual {v1, v0, p2}, Lmf;->a(Landroid/view/View;I)V

    .line 1767
    :cond_0
    return-void

    .line 1761
    :cond_1
    iget-object v0, p0, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->b(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method public final a(Landroid/view/View;F)V
    .locals 6

    .prologue
    const/high16 v5, 0x3f000000    # 0.5f

    const/4 v4, 0x0

    .line 1696
    invoke-static {p1}, Landroid/support/v4/widget/DrawerLayout;->b(Landroid/view/View;)F

    move-result v1

    .line 1697
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    .line 1700
    iget-object v0, p0, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    const/4 v3, 0x3

    invoke-virtual {v0, p1, v3}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1701
    cmpl-float v0, p2, v4

    if-gtz v0, :cond_0

    cmpl-float v0, p2, v4

    if-nez v0, :cond_2

    cmpl-float v0, v1, v5

    if-lez v0, :cond_2

    :cond_0
    const/4 v0, 0x0

    .line 1707
    :cond_1
    :goto_0
    iget-object v1, p0, Lkx;->b:Lmf;

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v2

    .line 5564
    iget-boolean v3, v1, Lmf;->n:Z

    if-nez v3, :cond_5

    .line 5565
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1701
    :cond_2
    neg-int v0, v2

    goto :goto_0

    .line 1703
    :cond_3
    iget-object v0, p0, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I

    move-result v0

    .line 1704
    cmpg-float v3, p2, v4

    if-ltz v3, :cond_4

    cmpl-float v3, p2, v4

    if-nez v3, :cond_1

    cmpl-float v1, v1, v5

    if-lez v1, :cond_1

    :cond_4
    sub-int/2addr v0, v2

    goto :goto_0

    .line 5569
    :cond_5
    iget-object v3, v1, Lmf;->i:Landroid/view/VelocityTracker;

    iget v4, v1, Lmf;->c:I

    invoke-static {v3, v4}, Lgp;->a(Landroid/view/VelocityTracker;I)F

    move-result v3

    float-to-int v3, v3

    iget-object v4, v1, Lmf;->i:Landroid/view/VelocityTracker;

    iget v5, v1, Lmf;->c:I

    invoke-static {v4, v5}, Lgp;->b(Landroid/view/VelocityTracker;I)F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v1, v0, v2, v3, v4}, Lmf;->a(IIII)Z

    .line 1708
    iget-object v0, p0, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V

    .line 1709
    return-void
.end method

.method public final a(Landroid/view/View;I)V
    .locals 3

    .prologue
    .line 1662
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 1665
    iget-object v1, p0, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    const/4 v2, 0x3

    invoke-virtual {v1, p1, v2}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1666
    add-int v1, v0, p2

    int-to-float v1, v1

    int-to-float v0, v0

    div-float v0, v1, v0

    .line 1671
    :goto_0
    iget-object v1, p0, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v1, p1, v0}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;F)V

    .line 1672
    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    const/4 v0, 0x4

    :goto_1
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1673
    iget-object v0, p0, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V

    .line 1674
    return-void

    .line 1668
    :cond_0
    iget-object v1, p0, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v1}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I

    move-result v1

    .line 1669
    sub-int/2addr v1, p2

    int-to-float v1, v1

    int-to-float v0, v0

    div-float v0, v1, v0

    goto :goto_0

    .line 1672
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final a(Landroid/view/View;)Z
    .locals 2

    .prologue
    .line 1650
    invoke-static {p1}, Landroid/support/v4/widget/DrawerLayout;->d(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    iget v1, p0, Lkx;->a:I

    invoke-virtual {v0, p1, v1}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v0, p1}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(Landroid/view/View;I)I
    .locals 2

    .prologue
    .line 1776
    iget-object v0, p0, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1777
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    neg-int v0, v0

    const/4 v1, 0x0

    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1780
    :goto_0
    return v0

    .line 1779
    :cond_0
    iget-object v0, p0, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I

    move-result v0

    .line 1780
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    sub-int v1, v0, v1

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_0
.end method

.method b()V
    .locals 2

    .prologue
    const/4 v0, 0x3

    .line 1685
    iget v1, p0, Lkx;->a:I

    if-ne v1, v0, :cond_0

    const/4 v0, 0x5

    .line 1686
    :cond_0
    iget-object v1, p0, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v1, v0}, Landroid/support/v4/widget/DrawerLayout;->b(I)Landroid/view/View;

    move-result-object v0

    .line 1687
    if-eqz v0, :cond_1

    .line 1688
    iget-object v1, p0, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v1, v0}, Landroid/support/v4/widget/DrawerLayout;->f(Landroid/view/View;)V

    .line 1690
    :cond_1
    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 1678
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lku;

    .line 1679
    const/4 v1, 0x0

    iput-boolean v1, v0, Lku;->c:Z

    .line 1681
    invoke-virtual {p0}, Lkx;->b()V

    .line 1682
    return-void
.end method

.method public final c(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 1771
    invoke-static {p1}, Landroid/support/v4/widget/DrawerLayout;->d(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()V
    .locals 4

    .prologue
    .line 1713
    iget-object v0, p0, Lkx;->c:Landroid/support/v4/widget/DrawerLayout;

    iget-object v1, p0, Lkx;->d:Ljava/lang/Runnable;

    const-wide/16 v2, 0xa0

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/widget/DrawerLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1714
    return-void
.end method

.method public final d(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 1786
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    return v0
.end method
