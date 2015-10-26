.class public final Laxo;
.super Lzr;
.source "PG"


# instance fields
.field final k:Landroid/content/Context;

.field final l:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

.field final m:Landroid/widget/TextView;

.field final n:Landroid/widget/TextView;

.field final o:Landroid/widget/TextView;

.field final p:Landroid/widget/TextView;

.field final q:Landroid/widget/TextView;

.field final r:I

.field private final s:Lblp;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;II)V
    .locals 2

    .prologue
    .line 43
    invoke-direct {p0, p2}, Lzr;-><init>(Landroid/view/View;)V

    .line 39
    new-instance v0, Lblp;

    const-string v1, "ContentThumbnailViewHolder"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Laxo;->s:Lblp;

    .line 44
    iput-object p1, p0, Laxo;->k:Landroid/content/Context;

    .line 45
    sget v0, Lf;->em:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Laxo;->m:Landroid/widget/TextView;

    .line 46
    sget v0, Lf;->ed:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Laxo;->n:Landroid/widget/TextView;

    .line 47
    sget v0, Lf;->ee:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Laxo;->o:Landroid/widget/TextView;

    .line 48
    sget v0, Lf;->v:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Laxo;->p:Landroid/widget/TextView;

    .line 49
    sget v0, Lf;->al:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    iput-object v0, p0, Laxo;->l:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    .line 50
    sget v0, Lf;->aZ:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Laxo;->q:Landroid/widget/TextView;

    .line 52
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 53
    iput p4, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 54
    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 55
    iput p3, p0, Laxo;->r:I

    .line 56
    return-void
.end method
