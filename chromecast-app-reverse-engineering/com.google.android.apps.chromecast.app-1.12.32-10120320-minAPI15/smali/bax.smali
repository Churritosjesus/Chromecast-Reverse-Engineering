.class public final Lbax;
.super Lzr;
.source "PG"


# instance fields
.field public final k:Landroid/widget/LinearLayout;

.field public final l:Landroid/widget/TextView;

.field public final m:Landroid/widget/TextView;

.field public final n:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0, p1}, Lzr;-><init>(Landroid/view/View;)V

    .line 36
    sget v0, Lf;->s:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lbax;->k:Landroid/widget/LinearLayout;

    .line 37
    sget v0, Lf;->J:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbax;->l:Landroid/widget/TextView;

    .line 38
    sget v0, Lf;->V:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbax;->m:Landroid/widget/TextView;

    .line 39
    sget v0, Lf;->U:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbax;->n:Landroid/widget/TextView;

    .line 40
    return-void
.end method
