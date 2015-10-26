.class public final Lbhd;
.super Lj;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:I

.field private b:Lapd;

.field private c:Landroid/widget/TextView;

.field private d:Lbjn;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Lj;-><init>()V

    .line 35
    const/4 v0, 0x0

    iput v0, p0, Lbhd;->a:I

    return-void
.end method

.method static synthetic a(Lbhd;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lbhd;->c:Landroid/widget/TextView;

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Lbhd;
    .locals 2

    .prologue
    .line 46
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 47
    const-string v1, "pincodeKey"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    new-instance v1, Lbhd;

    invoke-direct {v1}, Lbhd;-><init>()V

    .line 49
    invoke-virtual {v1, v0}, Lbhd;->f(Landroid/os/Bundle;)V

    .line 50
    return-object v1
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    .line 76
    sget v0, La;->fI:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 78
    sget v0, Lf;->dr:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbhd;->c:Landroid/widget/TextView;

    .line 79
    iget-object v0, p0, Lbhd;->c:Landroid/widget/TextView;

    .line 1559
    iget-object v2, p0, Lj;->m:Landroid/os/Bundle;

    .line 79
    const-string v3, "pincodeKey"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    new-instance v0, Lapd;

    const/16 v2, 0x39

    invoke-direct {v0, v2}, Lapd;-><init>(I)V

    iget-object v2, p0, Lbhd;->d:Lbjn;

    .line 81
    invoke-interface {v2}, Lbjn;->A()Laph;

    move-result-object v2

    .line 2115
    iput-object v2, v0, Lapd;->h:Laph;

    .line 81
    iput-object v0, p0, Lbhd;->b:Lapd;

    .line 82
    sget v0, Lf;->ac:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 83
    invoke-virtual {v0}, Landroid/widget/ImageView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    .line 84
    new-instance v3, Lbhe;

    invoke-direct {v3, p0, v0}, Lbhe;-><init>(Lbhd;Landroid/widget/ImageView;)V

    invoke-virtual {v2, v3}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 95
    sget v0, Lf;->cN:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 96
    sget v0, Lf;->cO:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 97
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lbhd;->d(Z)V

    .line 98
    return-object v1
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 61
    invoke-super {p0}, Lj;->a()V

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lbhd;->d:Lbjn;

    .line 63
    return-void
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 55
    invoke-super {p0, p1}, Lj;->a(Landroid/app/Activity;)V

    .line 56
    check-cast p1, Lbjn;

    iput-object p1, p0, Lbhd;->d:Lbjn;

    .line 57
    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 67
    invoke-super {p0, p1}, Lj;->a(Landroid/os/Bundle;)V

    .line 68
    if-eqz p1, :cond_0

    .line 69
    const-string v0, "mismatchCountKey"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lbhd;->a:I

    .line 71
    :cond_0
    return-void
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 103
    invoke-super {p0, p1}, Lj;->e(Landroid/os/Bundle;)V

    .line 104
    const-string v0, "mismatchCountKey"

    iget v1, p0, Lbhd;->a:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 105
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 109
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 110
    sget v1, Lf;->cN:I

    if-ne v0, v1, :cond_1

    .line 111
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lbhd;->b:Lapd;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lapd;->a(I)Lapd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 112
    iget-object v0, p0, Lbhd;->d:Lbjn;

    sget v1, Lbjo;->c:I

    invoke-interface {v0, v1}, Lbjn;->a(I)V

    .line 132
    :cond_0
    :goto_0
    return-void

    .line 113
    :cond_1
    sget v1, Lf;->cO:I

    if-ne v0, v1, :cond_0

    .line 114
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lbhd;->b:Lapd;

    const/4 v2, 0x0

    .line 115
    invoke-virtual {v1, v2}, Lapd;->a(I)Lapd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 2612
    iget-object v0, p0, Lj;->y:Lm;

    .line 116
    invoke-virtual {v0}, Lm;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 119
    iget v0, p0, Lbhd;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lbhd;->a:I

    .line 2669
    iget-object v0, p0, Lj;->x:Lt;

    .line 121
    invoke-virtual {v0}, Lr;->a()Laf;

    move-result-object v1

    .line 123
    iget v0, p0, Lbhd;->a:I

    const/4 v2, 0x3

    if-ge v0, v2, :cond_2

    .line 124
    new-instance v0, Lbjr;

    invoke-direct {v0}, Lbjr;-><init>()V

    .line 128
    :goto_1
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Laf;->a(Ljava/lang/String;)Laf;

    .line 129
    sget v2, Lf;->ai:I

    invoke-virtual {v1, v2, v0}, Laf;->a(ILj;)Laf;

    .line 130
    invoke-virtual {v1}, Laf;->b()I

    goto :goto_0

    .line 126
    :cond_2
    sget v0, La;->gI:I

    invoke-static {v0}, Lbok;->b(I)Lbok;

    move-result-object v0

    goto :goto_1
.end method
