.class final Lack;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Labc;


# instance fields
.field private synthetic a:Lacb;


# direct methods
.method constructor <init>(Lacb;)V
    .locals 0

    .prologue
    .line 534
    iput-object p1, p0, Lack;->a:Lacb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 8

    .prologue
    const/4 v0, 0x0

    const/4 v7, 0x1

    .line 537
    if-nez p1, :cond_4

    move v1, v0

    .line 541
    :goto_0
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_1

    .line 542
    iget-object v2, p0, Lack;->a:Lacb;

    .line 1599
    iget-object v3, v2, Lacb;->c:Landroid/widget/ScrollView;

    if-eqz v3, :cond_0

    iget-boolean v3, v2, Lacb;->b:Z

    if-eqz v3, :cond_0

    .line 1600
    iget-object v3, v2, Lacb;->a:[I

    invoke-virtual {v2, v3}, Lacb;->getLocationInWindow([I)V

    .line 1604
    invoke-virtual {v2}, Lacb;->getHeight()I

    move-result v3

    .line 1605
    iget-object v4, v2, Lacb;->a:[I

    aget v4, v4, v7

    add-int/2addr v4, v3

    .line 1606
    iget-object v5, v2, Lacb;->c:Landroid/widget/ScrollView;

    iget-object v6, v2, Lacb;->a:[I

    invoke-virtual {v5, v6}, Landroid/widget/ScrollView;->getLocationInWindow([I)V

    .line 1607
    iget-object v5, v2, Lacb;->a:[I

    aget v5, v5, v7

    invoke-virtual {v2}, Lacb;->getLineCount()I

    move-result v6

    div-int/2addr v3, v6

    add-int/2addr v3, v5

    .line 1608
    if-le v4, v3, :cond_0

    .line 1609
    iget-object v2, v2, Lacb;->c:Landroid/widget/ScrollView;

    sub-int v3, v4, v3

    invoke-virtual {v2, v0, v3}, Landroid/widget/ScrollView;->scrollBy(II)V

    .line 545
    :cond_0
    iget-object v2, p0, Lack;->a:Lacb;

    invoke-static {v2}, Lacb;->f(Lacb;)I

    move-result v2

    if-nez v2, :cond_1

    .line 547
    iget-object v2, p0, Lack;->a:Lacb;

    iget-object v3, p0, Lack;->a:Lacb;

    .line 2576
    invoke-virtual {v3}, Lacb;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, La;->cQ:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 547
    invoke-static {v2, v3}, Lacb;->a(Lacb;Ljava/lang/String;)V

    .line 552
    :cond_1
    if-eqz p1, :cond_2

    .line 553
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ne v2, v7, :cond_2

    .line 554
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lacx;

    .line 3227
    iget v0, v0, Lacx;->a:I

    .line 554
    if-eq v0, v7, :cond_3

    .line 560
    :cond_2
    iget-object v0, p0, Lack;->a:Lacb;

    invoke-static {v0}, Lacb;->h(Lacb;)Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Lack;->a:Lacb;

    invoke-static {v2}, Lacb;->g(Lacb;)[I

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->getLocationInWindow([I)V

    .line 561
    iget-object v0, p0, Lack;->a:Lacb;

    iget-object v2, p0, Lack;->a:Lacb;

    invoke-static {v2}, Lacb;->i(Lacb;)Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v0, v2}, Lacb;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 562
    iget-object v0, p0, Lack;->a:Lacb;

    iget-object v2, p0, Lack;->a:Lacb;

    invoke-static {v2}, Lacb;->i(Lacb;)Landroid/graphics/Rect;

    move-result-object v2

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    iget-object v3, p0, Lack;->a:Lacb;

    invoke-static {v3}, Lacb;->g(Lacb;)[I

    move-result-object v3

    aget v3, v3, v7

    sub-int/2addr v2, v3

    iget-object v3, p0, Lack;->a:Lacb;

    invoke-static {v3}, Lacb;->h(Lacb;)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    sub-int/2addr v2, v3

    iget-object v3, p0, Lack;->a:Lacb;

    .line 563
    invoke-virtual {v3}, Lacb;->getDropDownVerticalOffset()I

    move-result v3

    sub-int/2addr v2, v3

    .line 562
    invoke-virtual {v0, v2}, Lacb;->setDropDownHeight(I)V

    .line 566
    :cond_3
    iget-object v0, p0, Lack;->a:Lacb;

    invoke-static {v0, v1}, Lacb;->a(Lacb;I)I

    .line 567
    return-void

    .line 537
    :cond_4
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    goto/16 :goto_0
.end method
