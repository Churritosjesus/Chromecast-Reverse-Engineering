.class public final Lbiw;
.super Lj;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Lj;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .prologue
    .line 24
    sget v0, La;->gH:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 25
    sget v0, Lf;->dp:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 26
    sget v0, Lf;->dI:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v2, Lb;->bY:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 27
    sget v0, Lf;->dJ:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v2, Lb;->bZ:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 28
    sget v0, Lf;->dK:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v2, Lb;->ca:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 29
    sget v0, Lf;->dL:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v2, Lb;->cb:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 30
    sget v0, Lf;->dp:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    sget v2, Lb;->cM:I

    .line 31
    invoke-virtual {v0, v2}, Landroid/widget/Button;->setText(I)V

    .line 33
    return-object v1
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 38
    .line 1612
    iget-object v0, p0, Lj;->y:Lm;

    .line 38
    check-cast v0, Lbgu;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lbgu;->a_(Z)V

    .line 1669
    iget-object v0, p0, Lj;->x:Lt;

    .line 41
    invoke-virtual {v0}, Lr;->c()V

    .line 42
    return-void
.end method
