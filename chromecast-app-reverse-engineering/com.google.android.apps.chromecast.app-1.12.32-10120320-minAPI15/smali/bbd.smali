.class public final Lbbd;
.super Lzr;
.source "PG"


# instance fields
.field public final k:Landroid/widget/ImageView;

.field public final l:Landroid/widget/TextView;

.field public m:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0, p1}, Lzr;-><init>(Landroid/view/View;)V

    .line 24
    sget v0, Lf;->cv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lbbd;->k:Landroid/widget/ImageView;

    .line 25
    sget v0, Lf;->cw:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbbd;->l:Landroid/widget/TextView;

    .line 26
    return-void
.end method
