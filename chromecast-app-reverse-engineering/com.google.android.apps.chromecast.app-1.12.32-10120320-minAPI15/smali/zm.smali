.class public final Lzm;
.super Lzb;
.source "PG"


# instance fields
.field private synthetic a:Landroid/support/v7/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/RecyclerView;)V
    .locals 0

    .prologue
    .line 3965
    iput-object p1, p0, Lzm;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-direct {p0}, Lzb;-><init>()V

    return-void
.end method

.method private b()V
    .locals 2

    .prologue
    .line 4017
    iget-object v0, p0, Lzm;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->m(Landroid/support/v7/widget/RecyclerView;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzm;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->n(Landroid/support/v7/widget/RecyclerView;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzm;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->o(Landroid/support/v7/widget/RecyclerView;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4018
    iget-object v0, p0, Lzm;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lzm;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->p(Landroid/support/v7/widget/RecyclerView;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-static {v0, v1}, Lgt;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 4023
    :goto_0
    return-void

    .line 4020
    :cond_0
    iget-object v0, p0, Lzm;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/support/v7/widget/RecyclerView;Z)Z

    .line 4021
    iget-object v0, p0, Lzm;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 3968
    iget-object v0, p0, Lzm;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Ljava/lang/String;)V

    .line 3969
    iget-object v0, p0, Lzm;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/support/v7/widget/RecyclerView;)Lyz;

    .line 3976
    iget-object v0, p0, Lzm;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    const/4 v1, 0x1

    .line 11040
    iput-boolean v1, v0, Lzp;->i:Z

    .line 3977
    iget-object v0, p0, Lzm;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->l(Landroid/support/v7/widget/RecyclerView;)V

    .line 3979
    iget-object v0, p0, Lzm;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->b:Lwh;

    invoke-virtual {v0}, Lwh;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3980
    iget-object v0, p0, Lzm;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 3982
    :cond_0
    return-void
.end method

.method public final a(II)V
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 3986
    iget-object v1, p0, Lzm;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/RecyclerView;->a(Ljava/lang/String;)V

    .line 3987
    iget-object v1, p0, Lzm;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->b:Lwh;

    .line 11493
    iget-object v2, v1, Lwh;->a:Ljava/util/ArrayList;

    const/4 v3, 0x2

    invoke-virtual {v1, v3, p1, p2}, Lwh;->a(III)Lwj;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11494
    iget-object v1, v1, Lwh;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v1, v0, :cond_1

    .line 3987
    :goto_0
    if-eqz v0, :cond_0

    .line 3988
    invoke-direct {p0}, Lzm;->b()V

    .line 3990
    :cond_0
    return-void

    .line 11494
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(III)V
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 4010
    iget-object v1, p0, Lzm;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/RecyclerView;->a(Ljava/lang/String;)V

    .line 4011
    iget-object v1, p0, Lzm;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->b:Lwh;

    .line 11517
    if-eq p1, p2, :cond_1

    .line 11523
    iget-object v2, v1, Lwh;->a:Ljava/util/ArrayList;

    const/4 v3, 0x3

    invoke-virtual {v1, v3, p1, p2}, Lwh;->a(III)Lwj;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11524
    iget-object v1, v1, Lwh;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v1, v0, :cond_1

    .line 4011
    :goto_0
    if-eqz v0, :cond_0

    .line 4012
    invoke-direct {p0}, Lzm;->b()V

    .line 4014
    :cond_0
    return-void

    .line 11524
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(II)V
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 3994
    iget-object v2, p0, Lzm;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/support/v7/widget/RecyclerView;->a(Ljava/lang/String;)V

    .line 3995
    iget-object v2, p0, Lzm;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView;->b:Lwh;

    .line 11501
    iget-object v3, v2, Lwh;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v1, p1, p2}, Lwh;->a(III)Lwj;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11502
    iget-object v2, v2, Lwh;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ne v2, v0, :cond_1

    .line 3995
    :goto_0
    if-eqz v0, :cond_0

    .line 3996
    invoke-direct {p0}, Lzm;->b()V

    .line 3998
    :cond_0
    return-void

    :cond_1
    move v0, v1

    .line 11502
    goto :goto_0
.end method

.method public final c(II)V
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 4002
    iget-object v1, p0, Lzm;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/RecyclerView;->a(Ljava/lang/String;)V

    .line 4003
    iget-object v1, p0, Lzm;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->b:Lwh;

    .line 11509
    iget-object v2, v1, Lwh;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v0, p1, p2}, Lwh;->a(III)Lwj;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11510
    iget-object v1, v1, Lwh;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v1, v0, :cond_1

    .line 4003
    :goto_0
    if-eqz v0, :cond_0

    .line 4004
    invoke-direct {p0}, Lzm;->b()V

    .line 4006
    :cond_0
    return-void

    .line 11510
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
