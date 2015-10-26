.class public final Lbgt;
.super Lj;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Z

.field private b:I

.field private c:Lapd;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 51
    invoke-direct {p0}, Lj;-><init>()V

    .line 45
    iput-boolean v0, p0, Lbgt;->a:Z

    .line 46
    iput v0, p0, Lbgt;->b:I

    .line 52
    return-void
.end method

.method private p()V
    .locals 4

    .prologue
    const/16 v2, 0x8

    const/4 v3, 0x0

    .line 126
    .line 5065
    iget-object v0, p0, Lj;->N:Landroid/view/View;

    .line 126
    sget v1, Lf;->cT:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-boolean v1, p0, Lbgt;->a:Z

    if-eqz v1, :cond_0

    .line 128
    sget v1, Lb;->dp:I

    .line 127
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 6065
    iget-object v0, p0, Lj;->N:Landroid/view/View;

    .line 129
    sget v1, Lf;->cR:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    sget v1, Lb;->dw:I

    .line 130
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 7065
    iget-object v0, p0, Lj;->N:Landroid/view/View;

    .line 131
    sget v1, Lf;->cR:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iget-boolean v1, p0, Lbgt;->a:Z

    if-eqz v1, :cond_1

    move v1, v2

    .line 132
    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 8065
    iget-object v0, p0, Lj;->N:Landroid/view/View;

    .line 133
    sget v1, Lf;->dM:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-boolean v1, p0, Lbgt;->a:Z

    if-eqz v1, :cond_2

    .line 134
    sget v1, Lb;->dA:I

    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 9065
    iget-object v0, p0, Lj;->N:Landroid/view/View;

    .line 135
    sget v1, Lf;->dU:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iget-boolean v0, p0, Lbgt;->a:Z

    if-eqz v0, :cond_3

    move v0, v3

    .line 136
    :goto_3
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 10065
    iget-object v0, p0, Lj;->N:Landroid/view/View;

    .line 137
    sget v1, Lf;->dV:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-boolean v1, p0, Lbgt;->a:Z

    if-eqz v1, :cond_4

    .line 138
    :goto_4
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 11065
    iget-object v0, p0, Lj;->N:Landroid/view/View;

    .line 139
    sget v1, Lf;->cS:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-boolean v1, p0, Lbgt;->a:Z

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 140
    return-void

    .line 128
    :cond_0
    sget v1, Lb;->dq:I

    goto :goto_0

    :cond_1
    move v1, v3

    .line 132
    goto :goto_1

    .line 134
    :cond_2
    sget v1, Lb;->dr:I

    goto :goto_2

    :cond_3
    move v0, v2

    .line 136
    goto :goto_3

    :cond_4
    move v3, v2

    .line 138
    goto :goto_4
.end method

.method private q()Laph;
    .locals 1

    .prologue
    .line 148
    .line 11612
    iget-object v0, p0, Lj;->y:Lm;

    .line 148
    if-eqz v0, :cond_0

    .line 12612
    iget-object v0, p0, Lj;->y:Lm;

    .line 149
    check-cast v0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    .line 12892
    iget-object v0, v0, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->f:Laph;

    .line 151
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 66
    new-instance v0, Lapd;

    const/16 v1, 0x39

    invoke-direct {v0, v1}, Lapd;-><init>(I)V

    iput-object v0, p0, Lbgt;->c:Lapd;

    .line 67
    sget v0, La;->gy:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 69
    sget v1, Lf;->cR:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 70
    sget v1, Lf;->dU:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    sget v1, Lf;->dV:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 72
    sget v1, Lf;->cS:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 73
    return-object v0
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 56
    invoke-super {p0, p1}, Lj;->a(Landroid/os/Bundle;)V

    .line 57
    if-eqz p1, :cond_0

    .line 58
    const-string v0, "playedSound"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lbgt;->a:Z

    .line 59
    const-string v0, "noSoundCount"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lbgt;->b:I

    .line 61
    :cond_0
    return-void
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 84
    invoke-super {p0, p1}, Lj;->e(Landroid/os/Bundle;)V

    .line 85
    const-string v0, "playedSound"

    iget-boolean v1, p0, Lbgt;->a:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 86
    const-string v0, "noSoundCount"

    iget v1, p0, Lbgt;->b:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 87
    return-void
.end method

.method public final g_()V
    .locals 0

    .prologue
    .line 78
    invoke-super {p0}, Lj;->g_()V

    .line 79
    invoke-direct {p0}, Lbgt;->p()V

    .line 80
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 91
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 92
    sget v1, Lf;->cR:I

    if-ne v0, v1, :cond_1

    .line 1612
    iget-object v0, p0, Lj;->y:Lm;

    .line 93
    check-cast v0, Lbgu;

    invoke-interface {v0, v3}, Lbgu;->a_(Z)V

    .line 94
    iput-boolean v2, p0, Lbgt;->a:Z

    .line 95
    invoke-direct {p0}, Lbgt;->p()V

    .line 119
    :cond_0
    :goto_0
    return-void

    .line 96
    :cond_1
    sget v1, Lf;->dU:I

    if-ne v0, v1, :cond_2

    .line 97
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lbgt;->c:Lapd;

    invoke-virtual {v1, v2}, Lapd;->a(I)Lapd;

    move-result-object v1

    .line 98
    invoke-direct {p0}, Lbgt;->q()Laph;

    move-result-object v2

    .line 2115
    iput-object v2, v1, Lapd;->h:Laph;

    .line 97
    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 2612
    iget-object v0, p0, Lj;->y:Lm;

    .line 99
    check-cast v0, Lbjn;

    sget v1, Lbjo;->c:I

    invoke-interface {v0, v1}, Lbjn;->a(I)V

    goto :goto_0

    .line 100
    :cond_2
    sget v1, Lf;->dV:I

    if-ne v0, v1, :cond_4

    .line 101
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lbgt;->c:Lapd;

    invoke-virtual {v1, v3}, Lapd;->a(I)Lapd;

    move-result-object v1

    .line 102
    invoke-direct {p0}, Lbgt;->q()Laph;

    move-result-object v2

    .line 3115
    iput-object v2, v1, Lapd;->h:Laph;

    .line 101
    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 103
    iget v0, p0, Lbgt;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lbgt;->b:I

    .line 3669
    iget-object v0, p0, Lj;->x:Lt;

    .line 105
    invoke-virtual {v0}, Lr;->a()Laf;

    move-result-object v1

    .line 107
    iget v0, p0, Lbgt;->b:I

    const/4 v2, 0x3

    if-ge v0, v2, :cond_3

    .line 108
    new-instance v0, Lbiw;

    invoke-direct {v0}, Lbiw;-><init>()V

    .line 4590
    :goto_1
    iput-object p0, v0, Lj;->n:Lj;

    .line 4591
    iput v3, v0, Lj;->p:I

    .line 113
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Laf;->a(Ljava/lang/String;)Laf;

    .line 114
    sget v2, Lf;->ai:I

    invoke-virtual {v1, v2, v0}, Laf;->a(ILj;)Laf;

    .line 115
    invoke-virtual {v1}, Laf;->b()I

    goto :goto_0

    .line 110
    :cond_3
    sget v0, La;->fu:I

    invoke-static {v0}, Lbok;->b(I)Lbok;

    move-result-object v0

    goto :goto_1

    .line 116
    :cond_4
    sget v1, Lf;->cS:I

    if-ne v0, v1, :cond_0

    .line 4612
    iget-object v0, p0, Lj;->y:Lm;

    .line 117
    check-cast v0, Lbgu;

    invoke-interface {v0, v2}, Lbgu;->a_(Z)V

    goto :goto_0
.end method
