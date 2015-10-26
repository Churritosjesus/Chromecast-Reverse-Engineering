.class public final Lyy;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lwi;


# instance fields
.field private synthetic a:Landroid/support/v7/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/RecyclerView;)V
    .locals 0

    .prologue
    .line 614
    iput-object p1, p0, Lyy;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private c(Lwj;)V
    .locals 1

    .prologue
    .line 657
    iget v0, p1, Lwj;->a:I

    packed-switch v0, :pswitch_data_0

    .line 671
    :goto_0
    return-void

    .line 659
    :pswitch_0
    iget-object v0, p0, Lyy;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->d(Landroid/support/v7/widget/RecyclerView;)Lzh;

    move-result-object v0

    invoke-virtual {v0}, Lzh;->a()V

    goto :goto_0

    .line 662
    :pswitch_1
    iget-object v0, p0, Lyy;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->d(Landroid/support/v7/widget/RecyclerView;)Lzh;

    move-result-object v0

    invoke-virtual {v0}, Lzh;->c()V

    goto :goto_0

    .line 665
    :pswitch_2
    iget-object v0, p0, Lyy;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->d(Landroid/support/v7/widget/RecyclerView;)Lzh;

    move-result-object v0

    invoke-virtual {v0}, Lzh;->d()V

    goto :goto_0

    .line 668
    :pswitch_3
    iget-object v0, p0, Lyy;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->d(Landroid/support/v7/widget/RecyclerView;)Lzh;

    move-result-object v0

    invoke-virtual {v0}, Lzh;->e()V

    goto :goto_0

    .line 657
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public final a(I)Lzr;
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 617
    iget-object v3, p0, Lyy;->a:Landroid/support/v7/widget/RecyclerView;

    .line 9490
    iget-object v1, v3, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v1}, Lxb;->b()I

    move-result v4

    .line 9491
    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v4, :cond_2

    .line 9492
    iget-object v1, v3, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v1, v2}, Lxb;->c(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v1

    .line 9493
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lzr;->n()Z

    move-result v5

    if-nez v5, :cond_1

    .line 9495
    iget v5, v1, Lzr;->b:I

    if-ne v5, p1, :cond_1

    .line 618
    :goto_1
    if-nez v1, :cond_3

    .line 629
    :cond_0
    :goto_2
    return-object v0

    .line 9491
    :cond_1
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_0

    :cond_2
    move-object v1, v0

    .line 9506
    goto :goto_1

    .line 623
    :cond_3
    iget-object v2, p0, Lyy;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    iget-object v3, v1, Lzr;->a:Landroid/view/View;

    invoke-virtual {v2, v3}, Lxb;->a(Landroid/view/View;)Z

    move-result v2

    if-nez v2, :cond_0

    move-object v0, v1

    .line 629
    goto :goto_2
.end method

.method public final a(II)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 634
    iget-object v0, p0, Lyy;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, p1, p2, v1}, Landroid/support/v7/widget/RecyclerView;->a(IIZ)V

    .line 635
    iget-object v0, p0, Lyy;->a:Landroid/support/v7/widget/RecyclerView;

    iput-boolean v1, v0, Landroid/support/v7/widget/RecyclerView;->q:Z

    .line 636
    iget-object v0, p0, Lyy;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 10040
    iget v1, v0, Lzp;->h:I

    add-int/2addr v1, p2

    iput v1, v0, Lzp;->h:I

    .line 637
    return-void
.end method

.method public final a(Lwj;)V
    .locals 0

    .prologue
    .line 653
    invoke-direct {p0, p1}, Lyy;->c(Lwj;)V

    .line 654
    return-void
.end method

.method public final b(II)V
    .locals 2

    .prologue
    .line 641
    iget-object v0, p0, Lyy;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Landroid/support/v7/widget/RecyclerView;->a(IIZ)V

    .line 642
    iget-object v0, p0, Lyy;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x1

    iput-boolean v1, v0, Landroid/support/v7/widget/RecyclerView;->q:Z

    .line 643
    return-void
.end method

.method public final b(Lwj;)V
    .locals 0

    .prologue
    .line 675
    invoke-direct {p0, p1}, Lyy;->c(Lwj;)V

    .line 676
    return-void
.end method

.method public final c(II)V
    .locals 9

    .prologue
    const/4 v8, 0x2

    const/4 v7, 0x1

    .line 647
    iget-object v2, p0, Lyy;->a:Landroid/support/v7/widget/RecyclerView;

    .line 10260
    iget-object v0, v2, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v0}, Lxb;->b()I

    move-result v3

    .line 10261
    add-int v4, p1, p2

    .line 10263
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_2

    .line 10264
    iget-object v0, v2, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v0, v1}, Lxb;->c(I)Landroid/view/View;

    move-result-object v0

    .line 10265
    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v5

    .line 10266
    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lzr;->b()Z

    move-result v6

    if-nez v6, :cond_1

    .line 10269
    iget v6, v5, Lzr;->b:I

    if-lt v6, p1, :cond_1

    iget v6, v5, Lzr;->b:I

    if-ge v6, v4, :cond_1

    .line 10272
    invoke-virtual {v5, v8}, Lzr;->a(I)V

    .line 10273
    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView;->g()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 10274
    const/16 v6, 0x40

    invoke-virtual {v5, v6}, Lzr;->a(I)V

    .line 10277
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lzi;

    iput-boolean v7, v0, Lzi;->e:Z

    .line 10263
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 10280
    :cond_2
    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    .line 10949
    add-int v3, p1, p2

    .line 10950
    iget-object v0, v2, Lzl;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 10951
    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_1
    if-ltz v1, :cond_4

    .line 10952
    iget-object v0, v2, Lzl;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr;

    .line 10953
    if-eqz v0, :cond_3

    .line 10957
    invoke-virtual {v0}, Lzr;->d()I

    move-result v4

    .line 10958
    if-lt v4, p1, :cond_3

    if-ge v4, v3, :cond_3

    .line 10959
    invoke-virtual {v0, v8}, Lzr;->a(I)V

    .line 10960
    invoke-virtual {v2, v1}, Lzl;->b(I)V

    .line 10951
    :cond_3
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_1

    .line 648
    :cond_4
    iget-object v0, p0, Lyy;->a:Landroid/support/v7/widget/RecyclerView;

    iput-boolean v7, v0, Landroid/support/v7/widget/RecyclerView;->r:Z

    .line 649
    return-void
.end method

.method public final d(II)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v0, 0x0

    .line 680
    iget-object v2, p0, Lyy;->a:Landroid/support/v7/widget/RecyclerView;

    .line 11207
    iget-object v1, v2, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v1}, Lxb;->b()I

    move-result v3

    move v1, v0

    .line 11208
    :goto_0
    if-ge v1, v3, :cond_1

    .line 11209
    iget-object v4, v2, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v4, v1}, Lxb;->c(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v4

    .line 11210
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lzr;->b()Z

    move-result v5

    if-nez v5, :cond_0

    iget v5, v4, Lzr;->b:I

    if-lt v5, p1, :cond_0

    .line 11215
    invoke-virtual {v4, p2, v0}, Lzr;->a(IZ)V

    .line 11216
    iget-object v4, v2, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 12040
    iput-boolean v6, v4, Lzp;->i:Z

    .line 11208
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 11219
    :cond_1
    iget-object v3, v2, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    .line 12886
    iget-object v1, v3, Lzl;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v1, v0

    .line 12887
    :goto_1
    if-ge v1, v4, :cond_3

    .line 12888
    iget-object v0, v3, Lzl;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr;

    .line 12889
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lzr;->d()I

    move-result v5

    if-lt v5, p1, :cond_2

    .line 12894
    invoke-virtual {v0, p2, v6}, Lzr;->a(IZ)V

    .line 12887
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 11220
    :cond_3
    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 681
    iget-object v0, p0, Lyy;->a:Landroid/support/v7/widget/RecyclerView;

    iput-boolean v6, v0, Landroid/support/v7/widget/RecyclerView;->q:Z

    .line 682
    return-void
.end method

.method public final e(II)V
    .locals 11

    .prologue
    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v6, 0x0

    .line 686
    iget-object v7, p0, Lyy;->a:Landroid/support/v7/widget/RecyclerView;

    .line 13173
    iget-object v0, v7, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v0}, Lxb;->b()I

    move-result v8

    .line 13175
    if-ge p1, p2, :cond_1

    move v0, v1

    move v3, p2

    move v4, p1

    :goto_0
    move v5, v6

    .line 13185
    :goto_1
    if-ge v5, v8, :cond_3

    .line 13186
    iget-object v9, v7, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v9, v5}, Lxb;->c(I)Landroid/view/View;

    move-result-object v9

    invoke-static {v9}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v9

    .line 13187
    if-eqz v9, :cond_0

    iget v10, v9, Lzr;->b:I

    if-lt v10, v4, :cond_0

    iget v10, v9, Lzr;->b:I

    if-gt v10, v3, :cond_0

    .line 13194
    iget v10, v9, Lzr;->b:I

    if-ne v10, p1, :cond_2

    .line 13195
    sub-int v10, p2, p1

    invoke-virtual {v9, v10, v6}, Lzr;->a(IZ)V

    .line 13200
    :goto_2
    iget-object v9, v7, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 14040
    iput-boolean v2, v9, Lzp;->i:Z

    .line 13185
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    move v0, v2

    move v3, p1

    move v4, p2

    .line 13182
    goto :goto_0

    .line 13197
    :cond_2
    invoke-virtual {v9, v0, v6}, Lzr;->a(IZ)V

    goto :goto_2

    .line 13202
    :cond_3
    iget-object v8, v7, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    .line 14858
    if-ge p1, p2, :cond_5

    move v3, p2

    move v4, p1

    .line 14867
    :goto_3
    iget-object v0, v8, Lzl;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v9

    move v5, v6

    .line 14868
    :goto_4
    if-ge v5, v9, :cond_7

    .line 14869
    iget-object v0, v8, Lzl;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr;

    .line 14870
    if-eqz v0, :cond_4

    iget v10, v0, Lzr;->b:I

    if-lt v10, v4, :cond_4

    iget v10, v0, Lzr;->b:I

    if-gt v10, v3, :cond_4

    .line 14873
    iget v10, v0, Lzr;->b:I

    if-ne v10, p1, :cond_6

    .line 14874
    sub-int v10, p2, p1

    invoke-virtual {v0, v10, v6}, Lzr;->a(IZ)V

    .line 14868
    :cond_4
    :goto_5
    add-int/lit8 v0, v5, 0x1

    move v5, v0

    goto :goto_4

    :cond_5
    move v1, v2

    move v3, p1

    move v4, p2

    .line 14865
    goto :goto_3

    .line 14876
    :cond_6
    invoke-virtual {v0, v1, v6}, Lzr;->a(IZ)V

    goto :goto_5

    .line 13203
    :cond_7
    invoke-virtual {v7}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 688
    iget-object v0, p0, Lyy;->a:Landroid/support/v7/widget/RecyclerView;

    iput-boolean v2, v0, Landroid/support/v7/widget/RecyclerView;->q:Z

    .line 689
    return-void
.end method
