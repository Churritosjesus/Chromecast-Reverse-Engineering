.class public final Lbch;
.super Lzr;
.source "PG"


# instance fields
.field public final k:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

.field public final l:I

.field public final m:I

.field public final n:Lyt;

.field public final o:Landroid/widget/ImageView;

.field public final p:Landroid/widget/TextView;

.field public final q:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;II)V
    .locals 4

    .prologue
    .line 51
    invoke-direct {p0, p1}, Lzr;-><init>(Landroid/view/View;)V

    .line 52
    sget v0, Lf;->cv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    iput-object v0, p0, Lbch;->k:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    .line 53
    sget v0, Lf;->cJ:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lbch;->q:Landroid/view/View;

    .line 54
    new-instance v0, Lyt;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lbch;->q:Landroid/view/View;

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Lyt;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    iput-object v0, p0, Lbch;->n:Lyt;

    .line 55
    iget-object v0, p0, Lbch;->n:Lyt;

    sget v1, La;->hb:I

    .line 2176
    new-instance v2, Lpm;

    iget-object v3, v0, Lyt;->a:Landroid/content/Context;

    invoke-direct {v2, v3}, Lpm;-><init>(Landroid/content/Context;)V

    .line 1185
    iget-object v0, v0, Lyt;->b:Lqa;

    invoke-virtual {v2, v1, v0}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 57
    sget v0, Lf;->ax:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lbch;->o:Landroid/widget/ImageView;

    .line 58
    sget v0, Lf;->aE:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbch;->p:Landroid/widget/TextView;

    .line 60
    iput p2, p0, Lbch;->l:I

    .line 61
    iput p3, p0, Lbch;->m:I

    .line 62
    return-void
.end method
