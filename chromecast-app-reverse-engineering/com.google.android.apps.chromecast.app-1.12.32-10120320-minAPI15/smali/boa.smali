.class public final Lboa;
.super Lzr;
.source "PG"


# instance fields
.field k:Landroid/widget/TextView;

.field l:Landroid/widget/TextView;

.field m:Landroid/widget/TextView;

.field n:Landroid/view/View;

.field o:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 233
    invoke-direct {p0, p1}, Lzr;-><init>(Landroid/view/View;)V

    .line 234
    sget v0, Lf;->T:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lboa;->k:Landroid/widget/TextView;

    .line 235
    sget v0, Lf;->cU:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lboa;->l:Landroid/widget/TextView;

    .line 236
    sget v0, Lf;->cg:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lboa;->m:Landroid/widget/TextView;

    .line 237
    sget v0, Lf;->ej:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lboa;->n:Landroid/view/View;

    .line 238
    sget v0, Lf;->de:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lboa;->o:Landroid/widget/ImageView;

    .line 239
    return-void
.end method
