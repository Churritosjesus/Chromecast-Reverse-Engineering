.class final Larj;
.super Lzr;
.source "PG"


# instance fields
.field public final k:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Lari;Landroid/view/View;)V
    .locals 2

    .prologue
    .line 31
    invoke-direct {p0, p2}, Lzr;-><init>(Landroid/view/View;)V

    .line 32
    sget v0, Lf;->cZ:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Larj;->k:Landroid/widget/ImageView;

    .line 33
    iget-object v0, p0, Larj;->k:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 1020
    iget v1, p1, Lari;->c:I

    .line 33
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 34
    return-void
.end method
