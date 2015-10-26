.class public final Lbju;
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

    .line 22
    return-void
.end method

.method public static a(Z)Lbju;
    .locals 3

    .prologue
    .line 37
    new-instance v0, Lbju;

    invoke-direct {v0}, Lbju;-><init>()V

    .line 38
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 39
    const-string v2, "tvError"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 40
    invoke-virtual {v0, v1}, Lbju;->f(Landroid/os/Bundle;)V

    .line 41
    return-object v0
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8

    .prologue
    .line 47
    sget v0, La;->gu:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    .line 49
    sget v0, Lf;->aq:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 50
    sget v1, Lf;->O:I

    invoke-virtual {v5, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 52
    sget v1, Lf;->bv:I

    invoke-virtual {v5, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 53
    sget v2, Lf;->L:I

    invoke-virtual {v5, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    .line 54
    invoke-virtual {v2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 55
    sget v3, Lf;->M:I

    invoke-virtual {v5, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    .line 56
    invoke-virtual {v3, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 57
    sget v4, Lf;->N:I

    invoke-virtual {v5, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    .line 58
    invoke-virtual {v4, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1559
    iget-object v6, p0, Lj;->m:Landroid/os/Bundle;

    .line 60
    const-string v7, "tvError"

    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 62
    sget v6, Lb;->cB:I

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(I)V

    .line 63
    sget v0, La;->ez:I

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 64
    sget v0, Lb;->cC:I

    invoke-virtual {v2, v0}, Landroid/widget/Button;->setText(I)V

    .line 65
    sget v0, Lb;->cD:I

    invoke-virtual {v3, v0}, Landroid/widget/Button;->setText(I)V

    .line 66
    const/16 v0, 0x8

    invoke-virtual {v4, v0}, Landroid/widget/Button;->setVisibility(I)V

    .line 75
    :goto_0
    return-object v5

    .line 69
    :cond_0
    sget v6, Lb;->cj:I

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(I)V

    .line 70
    sget v0, La;->ey:I

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 71
    sget v0, Lb;->ck:I

    invoke-virtual {v2, v0}, Landroid/widget/Button;->setText(I)V

    .line 72
    sget v0, Lb;->cl:I

    invoke-virtual {v3, v0}, Landroid/widget/Button;->setText(I)V

    .line 73
    sget v0, Lb;->cm:I

    invoke-virtual {v4, v0}, Landroid/widget/Button;->setText(I)V

    goto :goto_0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 80
    .line 1612
    iget-object v0, p0, Lj;->y:Lm;

    .line 80
    check-cast v0, Lbjv;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lbjv;->a(I)V

    .line 81
    return-void
.end method
