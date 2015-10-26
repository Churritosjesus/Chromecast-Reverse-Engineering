.class final Lzt;
.super Ler;
.source "PG"


# instance fields
.field private synthetic b:Lzs;


# direct methods
.method constructor <init>(Lzs;)V
    .locals 0

    .prologue
    .line 79
    iput-object p1, p0, Lzt;->b:Lzs;

    invoke-direct {p0}, Ler;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Ljd;)V
    .locals 1

    .prologue
    .line 82
    invoke-super {p0, p1, p2}, Ler;->a(Landroid/view/View;Ljd;)V

    .line 83
    iget-object v0, p0, Lzt;->b:Lzs;

    .line 8030
    invoke-virtual {v0}, Lzs;->a()Z

    move-result v0

    .line 83
    if-nez v0, :cond_0

    iget-object v0, p0, Lzt;->b:Lzs;

    iget-object v0, v0, Lzs;->b:Landroid/support/v7/widget/RecyclerView;

    .line 8039
    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    .line 83
    if-eqz v0, :cond_0

    .line 84
    iget-object v0, p0, Lzt;->b:Lzs;

    iget-object v0, v0, Lzs;->b:Landroid/support/v7/widget/RecyclerView;

    .line 9039
    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    .line 84
    invoke-virtual {v0, p1, p2}, Lzh;->a(Landroid/view/View;Ljd;)V

    .line 87
    :cond_0
    return-void
.end method

.method public final a(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 91
    invoke-super {p0, p1, p2, p3}, Ler;->a(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 92
    const/4 v0, 0x1

    .line 98
    :cond_0
    :goto_0
    return v0

    .line 94
    :cond_1
    iget-object v1, p0, Lzt;->b:Lzs;

    .line 10030
    invoke-virtual {v1}, Lzs;->a()Z

    move-result v1

    .line 94
    if-nez v1, :cond_0

    iget-object v1, p0, Lzt;->b:Lzs;

    iget-object v1, v1, Lzs;->b:Landroid/support/v7/widget/RecyclerView;

    .line 10039
    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    .line 94
    if-eqz v1, :cond_0

    .line 95
    iget-object v1, p0, Lzt;->b:Lzs;

    iget-object v1, v1, Lzs;->b:Landroid/support/v7/widget/RecyclerView;

    .line 11039
    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    .line 11618
    iget-object v2, v1, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    iget-object v1, v1, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    goto :goto_0
.end method
