.class public final Laxy;
.super Lzr;
.source "PG"


# instance fields
.field k:Landroid/widget/TextView;

.field l:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

.field m:Landroid/support/v7/widget/RecyclerView;

.field n:Landroid/widget/Button;

.field final o:Lxw;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 47
    invoke-direct {p0, p1}, Lzr;-><init>(Landroid/view/View;)V

    .line 49
    sget v0, Lf;->dg:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    iput-object v0, p0, Laxy;->l:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    .line 50
    sget v0, Lf;->dh:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Laxy;->k:Landroid/widget/TextView;

    .line 51
    sget v0, Lf;->cy:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Laxy;->n:Landroid/widget/Button;

    .line 52
    sget v0, Lf;->am:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Laxy;->m:Landroid/support/v7/widget/RecyclerView;

    .line 53
    new-instance v0, Lxw;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lxw;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Laxy;->o:Lxw;

    .line 54
    iget-object v0, p0, Laxy;->o:Lxw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lxw;->a(I)V

    .line 55
    iget-object v0, p0, Laxy;->m:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Laxy;->o:Lxw;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Lzh;)V

    .line 58
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, La;->dH:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 59
    iget-object v1, p0, Laxy;->m:Landroid/support/v7/widget/RecyclerView;

    new-instance v2, Laxz;

    invoke-direct {v2, p0, v0}, Laxz;-><init>(Laxy;I)V

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/RecyclerView;->a(Lzf;)V

    .line 69
    iget-object v0, p0, Laxy;->m:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lxe;

    invoke-direct {v1}, Lxe;-><init>()V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Lzc;)V

    .line 70
    return-void
.end method
