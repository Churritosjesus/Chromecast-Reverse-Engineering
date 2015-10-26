.class final Lbnu;
.super Lzr;
.source "PG"


# instance fields
.field k:Landroid/widget/TextView;

.field l:Landroid/widget/ListView;

.field m:Landroid/view/View;

.field n:Z

.field final synthetic o:Lbmu;


# direct methods
.method public constructor <init>(Lbmu;Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 362
    iput-object p1, p0, Lbnu;->o:Lbmu;

    .line 363
    invoke-direct {p0, p2}, Lzr;-><init>(Landroid/view/View;)V

    .line 360
    iput-boolean v2, p0, Lbnu;->n:Z

    .line 364
    sget v0, Lf;->au:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbnu;->k:Landroid/widget/TextView;

    .line 365
    sget v0, Lf;->bs:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lbnu;->l:Landroid/widget/ListView;

    .line 366
    sget v0, Lf;->aQ:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lbnu;->m:Landroid/view/View;

    .line 367
    iget-object v0, p0, Lbnu;->l:Landroid/widget/ListView;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setVisibility(I)V

    .line 368
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 1069
    iget v1, p1, Lbmu;->j:I

    .line 368
    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 369
    iget-object v1, p0, Lbnu;->l:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 370
    iget-object v0, p0, Lbnu;->k:Landroid/widget/TextView;

    new-instance v1, Lbnv;

    invoke-direct {v1, p0, p1}, Lbnv;-><init>(Lbnu;Lbmu;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 386
    return-void
.end method
