.class public final Lbnt;
.super Lzr;
.source "PG"


# instance fields
.field k:Landroid/widget/TextView;

.field l:Landroid/widget/ImageView;

.field m:Landroid/widget/TextView;

.field n:Landroid/widget/TextView;

.field o:Landroid/widget/TextView;

.field p:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 307
    invoke-direct {p0, p1}, Lzr;-><init>(Landroid/view/View;)V

    .line 308
    sget v0, Lf;->S:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbnt;->k:Landroid/widget/TextView;

    .line 309
    sget v0, Lf;->cU:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbnt;->m:Landroid/widget/TextView;

    .line 310
    sget v0, Lf;->cg:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbnt;->n:Landroid/widget/TextView;

    .line 311
    sget v0, Lf;->de:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lbnt;->l:Landroid/widget/ImageView;

    .line 312
    sget v0, Lf;->T:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbnt;->o:Landroid/widget/TextView;

    .line 313
    sget v0, Lf;->ej:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lbnt;->p:Landroid/view/ViewGroup;

    .line 314
    return-void
.end method
