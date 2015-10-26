.class public final Lbix;
.super Lbjq;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private Z:Landroid/widget/TextView;

.field private a:Lbjn;

.field private aa:Landroid/widget/TextView;

.field private b:Landroid/widget/ImageView;

.field private d:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Lbjq;-><init>()V

    return-void
.end method

.method public static a(Z)Lbix;
    .locals 3

    .prologue
    .line 36
    new-instance v0, Lbix;

    invoke-direct {v0}, Lbix;-><init>()V

    .line 37
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 38
    const-string v2, "waitForOta"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 39
    invoke-virtual {v0, v1}, Lbix;->f(Landroid/os/Bundle;)V

    .line 40
    return-object v0
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/16 v6, 0x8

    const/4 v5, 0x0

    .line 58
    sget v0, La;->gz:I

    invoke-virtual {p1, v0, p2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 60
    sget v0, Lf;->bw:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lbix;->b:Landroid/widget/ImageView;

    .line 61
    iget-object v0, p0, Lbix;->b:Landroid/widget/ImageView;

    sget v2, La;->eE:I

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 62
    sget v0, Lf;->bq:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbix;->d:Landroid/widget/TextView;

    .line 63
    iget-object v0, p0, Lbix;->d:Landroid/widget/TextView;

    sget v2, Lb;->cF:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 64
    sget v0, Lf;->I:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbix;->Z:Landroid/widget/TextView;

    .line 65
    iget-object v0, p0, Lbix;->Z:Landroid/widget/TextView;

    sget v2, Lb;->cE:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 67
    sget v0, Lf;->dc:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 68
    sget v0, Lf;->aR:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 69
    sget v0, Lf;->cE:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbix;->aa:Landroid/widget/TextView;

    .line 1559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 71
    const-string v4, "waitForOta"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 72
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 73
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 76
    iget-object v0, p0, Lbix;->aa:Landroid/widget/TextView;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 77
    iget-object v0, p0, Lbix;->a:Lbjn;

    invoke-interface {v0}, Lbjn;->F()Lbdf;

    move-result-object v0

    .line 2314
    iget-boolean v0, v0, Lbdf;->h:Z

    .line 80
    if-eqz v0, :cond_0

    .line 81
    iput-object v7, p0, Lbix;->aa:Landroid/widget/TextView;

    .line 91
    :cond_0
    :goto_0
    return-object v1

    .line 84
    :cond_1
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 85
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 86
    invoke-virtual {v3, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    iget-object v0, p0, Lbix;->aa:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 88
    iput-object v7, p0, Lbix;->aa:Landroid/widget/TextView;

    goto :goto_0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 51
    invoke-super {p0}, Lbjq;->a()V

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lbix;->a:Lbjn;

    .line 53
    return-void
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 45
    invoke-super {p0, p1}, Lbjq;->a(Landroid/app/Activity;)V

    .line 46
    check-cast p1, Lbjn;

    iput-object p1, p0, Lbix;->a:Lbjn;

    .line 47
    return-void
.end method

.method public final b(I)V
    .locals 2

    .prologue
    .line 108
    invoke-super {p0, p1}, Lbjq;->b(I)V

    .line 109
    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lbix;->aa:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 110
    iget-object v0, p0, Lbix;->aa:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 112
    :cond_0
    return-void
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 97
    const/4 v0, 0x0

    iput-object v0, p0, Lbix;->aa:Landroid/widget/TextView;

    .line 98
    invoke-super {p0}, Lbjq;->d()V

    .line 99
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 116
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lf;->aR:I

    if-ne v0, v1, :cond_0

    .line 117
    iget-object v0, p0, Lbix;->a:Lbjn;

    sget v1, Lbjo;->g:I

    invoke-interface {v0, v1}, Lbjn;->a(I)V

    .line 119
    :cond_0
    return-void
.end method

.method protected final p()Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 103
    iget-object v0, p0, Lbix;->aa:Landroid/widget/TextView;

    return-object v0
.end method
