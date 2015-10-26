.class public final Lzs;
.super Ler;
.source "PG"


# instance fields
.field final b:Landroid/support/v7/widget/RecyclerView;

.field final c:Ler;


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/RecyclerView;)V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Ler;-><init>()V

    .line 79
    new-instance v0, Lzt;

    invoke-direct {v0, p0}, Lzt;-><init>(Lzs;)V

    iput-object v0, p0, Lzs;->c:Ler;

    .line 35
    iput-object p1, p0, Lzs;->b:Landroid/support/v7/widget/RecyclerView;

    .line 36
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Ljd;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v5, -0x1

    const/4 v4, 0x1

    .line 56
    invoke-super {p0, p1, p2}, Ler;->a(Landroid/view/View;Ljd;)V

    .line 57
    const-class v0, Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljd;->a(Ljava/lang/CharSequence;)V

    .line 58
    invoke-virtual {p0}, Lzs;->a()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lzs;->b:Landroid/support/v7/widget/RecyclerView;

    .line 10039
    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    .line 58
    if-eqz v0, :cond_4

    .line 59
    iget-object v0, p0, Lzs;->b:Landroid/support/v7/widget/RecyclerView;

    .line 11039
    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    .line 11368
    iget-object v1, v0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    iget-object v2, v0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 11398
    iget-object v3, v0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v3, v5}, Lgt;->b(Landroid/view/View;I)Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v3, v0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v3, v5}, Lgt;->a(Landroid/view/View;I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 11400
    :cond_0
    const/16 v3, 0x2000

    invoke-virtual {p2, v3}, Ljd;->a(I)V

    .line 11401
    invoke-virtual {p2, v4}, Ljd;->c(Z)V

    .line 11403
    :cond_1
    iget-object v3, v0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v3, v4}, Lgt;->b(Landroid/view/View;I)Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, v0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v3, v4}, Lgt;->a(Landroid/view/View;I)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 11405
    :cond_2
    const/16 v3, 0x1000

    invoke-virtual {p2, v3}, Ljd;->a(I)V

    .line 11406
    invoke-virtual {p2, v4}, Ljd;->c(Z)V

    .line 11408
    :cond_3
    invoke-virtual {v0, v1, v2}, Lzh;->a(Lzl;Lzp;)I

    move-result v3

    invoke-virtual {v0, v1, v2}, Lzh;->b(Lzl;Lzp;)I

    move-result v1

    .line 12092
    new-instance v0, Ljl;

    invoke-static {}, Ljd;->k()Ljh;

    move-result-object v2

    invoke-virtual {v2, v3, v1, v6, v6}, Ljh;->a(IIZI)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, Ljl;-><init>(Ljava/lang/Object;)V

    .line 12546
    sget-object v1, Ljd;->a:Ljh;

    iget-object v2, p2, Ljd;->b:Ljava/lang/Object;

    check-cast v0, Ljl;

    iget-object v0, v0, Ljl;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2, v0}, Ljh;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    :cond_4
    return-void
.end method

.method a()Z
    .locals 2

    .prologue
    .line 39
    iget-object v0, p0, Lzs;->b:Landroid/support/v7/widget/RecyclerView;

    .line 7729
    iget-boolean v1, v0, Landroid/support/v7/widget/RecyclerView;->g:Z

    if-eqz v1, :cond_0

    iget-boolean v1, v0, Landroid/support/v7/widget/RecyclerView;->h:Z

    if-nez v1, :cond_0

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->b:Lwh;

    invoke-virtual {v0}, Lwh;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    .line 39
    goto :goto_0
.end method

.method public final a(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 7

    .prologue
    const/4 v5, -0x1

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 44
    invoke-super {p0, p1, p2, p3}, Ler;->a(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v1, v2

    .line 9610
    :cond_0
    :goto_0
    return v1

    .line 47
    :cond_1
    invoke-virtual {p0}, Lzs;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lzs;->b:Landroid/support/v7/widget/RecyclerView;

    .line 8039
    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    .line 47
    if-eqz v0, :cond_0

    .line 48
    iget-object v0, p0, Lzs;->b:Landroid/support/v7/widget/RecyclerView;

    .line 9039
    iget-object v4, v0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    .line 9571
    iget-object v0, v4, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    iget-object v0, v4, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 9587
    iget-object v0, v4, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 9591
    sparse-switch p2, :sswitch_data_0

    move v0, v1

    move v3, v1

    .line 9609
    :goto_1
    if-nez v3, :cond_2

    if-eqz v0, :cond_0

    .line 9612
    :cond_2
    iget-object v1, v4, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0, v3}, Landroid/support/v7/widget/RecyclerView;->scrollBy(II)V

    move v1, v2

    .line 48
    goto :goto_0

    .line 9593
    :sswitch_0
    iget-object v0, v4, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0, v5}, Lgt;->b(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 9594
    invoke-virtual {v4}, Lzh;->p()I

    move-result v0

    invoke-virtual {v4}, Lzh;->r()I

    move-result v3

    sub-int/2addr v0, v3

    invoke-virtual {v4}, Lzh;->t()I

    move-result v3

    sub-int/2addr v0, v3

    neg-int v0, v0

    .line 9596
    :goto_2
    iget-object v3, v4, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v3, v5}, Lgt;->a(Landroid/view/View;I)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 9597
    invoke-virtual {v4}, Lzh;->o()I

    move-result v3

    invoke-virtual {v4}, Lzh;->q()I

    move-result v5

    sub-int/2addr v3, v5

    invoke-virtual {v4}, Lzh;->s()I

    move-result v5

    sub-int/2addr v3, v5

    neg-int v3, v3

    move v6, v3

    move v3, v0

    move v0, v6

    goto :goto_1

    .line 9601
    :sswitch_1
    iget-object v0, v4, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0, v2}, Lgt;->b(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 9602
    invoke-virtual {v4}, Lzh;->p()I

    move-result v0

    invoke-virtual {v4}, Lzh;->r()I

    move-result v3

    sub-int/2addr v0, v3

    invoke-virtual {v4}, Lzh;->t()I

    move-result v3

    sub-int/2addr v0, v3

    .line 9604
    :goto_3
    iget-object v3, v4, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v3, v2}, Lgt;->a(Landroid/view/View;I)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 9605
    invoke-virtual {v4}, Lzh;->o()I

    move-result v3

    invoke-virtual {v4}, Lzh;->q()I

    move-result v5

    sub-int/2addr v3, v5

    invoke-virtual {v4}, Lzh;->s()I

    move-result v5

    sub-int/2addr v3, v5

    move v6, v3

    move v3, v0

    move v0, v6

    goto :goto_1

    :cond_3
    move v3, v0

    move v0, v1

    goto :goto_1

    :cond_4
    move v0, v1

    goto :goto_3

    :cond_5
    move v0, v1

    goto :goto_2

    .line 9591
    :sswitch_data_0
    .sparse-switch
        0x1000 -> :sswitch_1
        0x2000 -> :sswitch_0
    .end sparse-switch
.end method

.method public final d(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .prologue
    .line 65
    invoke-super {p0, p1, p2}, Ler;->d(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 66
    const-class v0, Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    .line 67
    instance-of v0, p1, Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lzs;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 68
    check-cast p1, Landroid/support/v7/widget/RecyclerView;

    .line 13039
    iget-object v0, p1, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    .line 69
    if-eqz v0, :cond_0

    .line 14039
    iget-object v0, p1, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    .line 70
    invoke-virtual {v0, p2}, Lzh;->a(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 73
    :cond_0
    return-void
.end method
