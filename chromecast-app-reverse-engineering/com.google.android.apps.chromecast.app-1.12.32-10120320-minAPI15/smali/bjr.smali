.class public final Lbjr;
.super Lj;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Lj;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .prologue
    .line 23
    sget v0, La;->gH:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 24
    sget v0, Lf;->dp:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    sget v0, Lf;->dI:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v2, Lb;->ey:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 26
    sget v0, Lf;->dJ:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v2, Lb;->ez:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 27
    sget v0, Lf;->dK:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v2, Lb;->eA:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 28
    sget v0, Lf;->ct:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 29
    sget v0, Lf;->dp:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    sget v2, Lb;->dd:I

    .line 30
    invoke-virtual {v0, v2}, Landroid/widget/Button;->setText(I)V

    .line 31
    return-object v1
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 36
    .line 1669
    iget-object v0, p0, Lj;->x:Lt;

    .line 37
    invoke-virtual {v0}, Lr;->c()V

    .line 38
    return-void
.end method
