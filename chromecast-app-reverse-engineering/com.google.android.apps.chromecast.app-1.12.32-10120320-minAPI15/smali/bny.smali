.class public final Lbny;
.super Lzr;
.source "PG"


# instance fields
.field k:Landroid/widget/TextView;

.field l:Landroid/widget/ListView;

.field m:Landroid/view/View;

.field public n:Z

.field final synthetic o:Lbmu;


# direct methods
.method public constructor <init>(Lbmu;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 326
    iput-object p1, p0, Lbny;->o:Lbmu;

    .line 1069
    iget-object v0, p1, Lbmu;->h:Landroid/content/Context;

    .line 327
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, La;->gd:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lzr;-><init>(Landroid/view/View;)V

    .line 324
    iput-boolean v3, p0, Lbny;->n:Z

    .line 328
    iget-object v0, p0, Lbny;->a:Landroid/view/View;

    sget v1, Lf;->au:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbny;->k:Landroid/widget/TextView;

    .line 329
    iget-object v0, p0, Lbny;->a:Landroid/view/View;

    sget v1, Lf;->aQ:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lbny;->m:Landroid/view/View;

    .line 330
    iget-object v0, p0, Lbny;->a:Landroid/view/View;

    sget v1, Lf;->bs:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lbny;->l:Landroid/widget/ListView;

    .line 331
    iget-object v0, p0, Lbny;->l:Landroid/widget/ListView;

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->setVisibility(I)V

    .line 332
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 2069
    iget v1, p1, Lbmu;->j:I

    .line 332
    invoke-direct {v0, v1, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 333
    iget-object v1, p0, Lbny;->l:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 334
    iget-object v0, p0, Lbny;->k:Landroid/widget/TextView;

    new-instance v1, Lbnz;

    invoke-direct {v1, p0, p1}, Lbnz;-><init>(Lbny;Lbmu;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 349
    return-void
.end method
