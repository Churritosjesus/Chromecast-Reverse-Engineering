.class public final Lbgh;
.super Lzr;
.source "PG"


# instance fields
.field final k:Lbgk;

.field l:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

.field m:Landroid/widget/TextView;

.field n:Landroid/support/v7/widget/RecyclerView;

.field o:Landroid/widget/Button;


# direct methods
.method public constructor <init>(Lbgk;Landroid/view/View;)V
    .locals 3

    .prologue
    .line 44
    invoke-direct {p0, p2}, Lzr;-><init>(Landroid/view/View;)V

    .line 45
    iput-object p1, p0, Lbgh;->k:Lbgk;

    .line 47
    sget v0, Lf;->dN:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    iput-object v0, p0, Lbgh;->l:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    .line 48
    sget v0, Lf;->dO:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbgh;->m:Landroid/widget/TextView;

    .line 49
    sget v0, Lf;->et:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lbgh;->o:Landroid/widget/Button;

    .line 50
    sget v0, Lf;->am:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lbgh;->n:Landroid/support/v7/widget/RecyclerView;

    .line 51
    new-instance v0, Lxw;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lxw;-><init>(Landroid/content/Context;)V

    .line 52
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lxw;->a(I)V

    .line 53
    iget-object v1, p0, Lbgh;->n:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->a(Lzh;)V

    .line 56
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, La;->dH:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 57
    iget-object v1, p0, Lbgh;->n:Landroid/support/v7/widget/RecyclerView;

    new-instance v2, Lbgi;

    invoke-direct {v2, p0, v0}, Lbgi;-><init>(Lbgh;I)V

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/RecyclerView;->a(Lzf;)V

    .line 65
    iget-object v0, p0, Lbgh;->n:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lxe;

    invoke-direct {v1}, Lxe;-><init>()V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Lzc;)V

    .line 66
    return-void
.end method
