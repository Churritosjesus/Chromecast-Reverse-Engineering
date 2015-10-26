.class public final Lyu;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Landroid/support/v7/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/RecyclerView;)V
    .locals 0

    .prologue
    .line 256
    iput-object p1, p0, Lyu;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    .line 258
    iget-object v0, p0, Lyu;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/RecyclerView;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 278
    :cond_0
    :goto_0
    return-void

    .line 262
    :cond_1
    iget-object v0, p0, Lyu;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/support/v7/widget/RecyclerView;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 263
    const-string v0, "RV FullInvalidate"

    invoke-static {v0}, La;->a(Ljava/lang/String;)V

    .line 264
    iget-object v0, p0, Lyu;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->h()V

    .line 265
    invoke-static {}, La;->b()V

    goto :goto_0

    .line 266
    :cond_2
    iget-object v0, p0, Lyu;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->b:Lwh;

    invoke-virtual {v0}, Lwh;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 267
    const-string v0, "RV PartialInvalidate"

    invoke-static {v0}, La;->a(Ljava/lang/String;)V

    .line 268
    iget-object v0, p0, Lyu;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->a()V

    .line 269
    iget-object v0, p0, Lyu;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->b:Lwh;

    invoke-virtual {v0}, Lwh;->b()V

    .line 270
    iget-object v0, p0, Lyu;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->c(Landroid/support/v7/widget/RecyclerView;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 273
    iget-object v1, p0, Lyu;->a:Landroid/support/v7/widget/RecyclerView;

    .line 8284
    iget-object v0, v1, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v0}, Lxb;->a()I

    move-result v2

    .line 8285
    const/4 v0, 0x0

    :goto_1
    if-ge v0, v2, :cond_9

    .line 8286
    iget-object v3, v1, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v3, v0}, Lxb;->b(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v3

    .line 8288
    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lzr;->b()Z

    move-result v4

    if-nez v4, :cond_4

    .line 8291
    invoke-virtual {v3}, Lzr;->n()Z

    move-result v4

    if-nez v4, :cond_3

    invoke-virtual {v3}, Lzr;->j()Z

    move-result v4

    if-eqz v4, :cond_5

    .line 8292
    :cond_3
    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 8285
    :cond_4
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 8293
    :cond_5
    invoke-virtual {v3}, Lzr;->k()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 8294
    iget-object v4, v1, Landroid/support/v7/widget/RecyclerView;->d:Lyz;

    iget v5, v3, Lzr;->b:I

    invoke-virtual {v4, v5}, Lyz;->a(I)I

    move-result v4

    .line 9170
    iget v5, v3, Lzr;->e:I

    .line 8295
    if-ne v5, v4, :cond_8

    .line 8297
    invoke-virtual {v3}, Lzr;->l()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView;->g()Z

    move-result v4

    if-nez v4, :cond_7

    .line 8298
    :cond_6
    iget-object v4, v1, Landroid/support/v7/widget/RecyclerView;->d:Lyz;

    iget v5, v3, Lzr;->b:I

    invoke-virtual {v4, v3, v5}, Lyz;->b(Lzr;I)V

    goto :goto_2

    .line 8303
    :cond_7
    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    goto :goto_2

    .line 8308
    :cond_8
    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 275
    :cond_9
    iget-object v0, p0, Lyu;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Z)V

    .line 276
    invoke-static {}, La;->b()V

    goto/16 :goto_0
.end method
